package top.mmjz.floatingclouds;

/* JADX INFO: loaded from: classes.dex */
public final class App extends android.app.Application {
    public static final top.mmjz.floatingclouds.App.a Companion = null;
    public static top.mmjz.floatingclouds.App instance;

    public static final class a {
    }

    static {
            top.mmjz.floatingclouds.App$a r0 = new top.mmjz.floatingclouds.App$a
            r0.<init>()
            top.mmjz.floatingclouds.App.Companion = r0
            return
    }

    public App() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Application
    public void onCreate() {
            r1 = this;
            super.onCreate()
            a.C0435w1.p = r1
            a.C0435w1.D(r1)
            top.mmjz.floatingclouds.App$a r0 = top.mmjz.floatingclouds.App.Companion
            r0.getClass()
            top.mmjz.floatingclouds.App.instance = r1
            return
    }
}
