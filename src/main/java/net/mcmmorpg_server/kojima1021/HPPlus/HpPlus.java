package net.mcmmorpg_server.kojima1021.HPPlus;

import net.mcmmorpg_server.kojima1021.HPPlus.Event.OnJoinEvent;
import net.mcmmorpg_server.kojima1021.HPPlus.Event.OnRespawnEvent;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * KillGetItem メインクラス
 * @author kojima1021
 */
public class HpPlus extends JavaPlugin implements Listener{
    //インスタンス
    private static HpPlus instance;
    /**
     * メインクラスを取得します
     * @return instance
     */
    public static HpPlus getInstance(){
        return instance;
    }
    //Plugin開始時
    @Override
    public void onEnable() {
        //初期設定完了
        getLogger().info("Ver.1.0.0");
        //リスナー登録
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new OnJoinEvent(), this);
        getServer().getPluginManager().registerEvents(new OnRespawnEvent(), this);
        //message
        getLogger().info("プラグインを起動しました。");
    }
    //Pluginun終了時
    @Override
    public void onDisable() {
        getLogger().info("プラグインを正常に終了しました。");
    }
}