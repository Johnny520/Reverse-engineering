package top.mmjz.floatingclouds.plugin;

/* JADX INFO: loaded from: classes.dex */
public interface IPlugin {
    void handleHook(a.J8 r1);

    default void onConfigChange() {
            r0 = this;
            return
    }

    default void onCreate() {
            r0 = this;
            return
    }
}
