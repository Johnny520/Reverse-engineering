package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Sd */
/* JADX INFO: loaded from: classes.dex */
public final class C0793Sd implements InterfaceC1233bs, InterfaceC2321of, InterfaceC1014Xj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2492a;

    /* JADX INFO: renamed from: b */
    public final Context f2493b;

    public /* synthetic */ C0793Sd(Context context, int i) {
        this.f2492a = i;
        this.f2493b = context;
    }

    @Override // p000.InterfaceC2321of
    /* JADX INFO: renamed from: a */
    public void mo1218a(AbstractC1293cr abstractC1293cr) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1005Xa("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC2445r8(this, abstractC1293cr, threadPoolExecutor, 3));
    }

    @Override // p000.InterfaceC1014Xj
    public Object get() {
        return (ConnectivityManager) this.f2493b.getSystemService("connectivity");
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs c2428qs) {
        switch (this.f2492a) {
            case 0:
                return new C0907V4(this.f2493b, this);
            case 1:
                return new C0907V4(this.f2493b, this);
            case 2:
                return new C0907V4(this.f2493b, this);
            case 3:
            case 4:
            default:
                return new C0907V4(this.f2493b, c2428qs.m4872j(Integer.class, InputStream.class));
            case 5:
                return new C1380er(this.f2493b, 0);
            case 6:
                return new C1380er(this.f2493b, 1);
            case 7:
                return new C1380er(this.f2493b, 2);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return new C0907V4(this.f2493b, c2428qs.m4872j(Integer.class, AssetFileDescriptor.class));
        }
    }

    public C0793Sd(Context context) {
        this.f2492a = 3;
        this.f2493b = context.getApplicationContext();
    }
}
