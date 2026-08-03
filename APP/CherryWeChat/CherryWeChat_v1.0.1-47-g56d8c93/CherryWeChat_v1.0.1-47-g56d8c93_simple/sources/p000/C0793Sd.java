package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Sd */
/* JADX INFO: loaded from: classes.dex */
public final class C0793Sd implements InterfaceC1233bs, InterfaceC2321of, InterfaceC1014Xj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2492a;

    /* JADX INFO: renamed from: b */
    public final Context f2493b;

    public /* synthetic */ C0793Sd(Context r1, int r2) {
        this.f2492a = r2;
        this.f2493b = r1;
    }

    @Override // p000.InterfaceC2321of
    /* JADX INFO: renamed from: a */
    public void mo1218a(AbstractC1293cr r9) {
        ThreadFactoryC1005Xa r7 = new ThreadFactoryC1005Xa("EmojiCompatInitializer");
        ThreadPoolExecutor r0 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), r7);
        r0.allowCoreThreadTimeOut(true);
        r0.execute(new RunnableC2445r8(this, r9, r0, 3));
    }

    @Override // p000.InterfaceC1014Xj
    public Object get() {
        return (ConnectivityManager) this.f2493b.getSystemService("connectivity");
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs r4) {
        switch(this.f2492a) {
            case 0: goto L19;
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L4;
            case 4: goto L4;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        InterfaceC1189as r42 = r4.m4872j(Integer.class, InputStream.class);
        return new C0907V4(this.f2493b, r42);
    L6:
        InterfaceC1189as r43 = r4.m4872j(Integer.class, AssetFileDescriptor.class);
        return new C0907V4(this.f2493b, r43);
    L9:
        return new C1380er(this.f2493b, 2);
    L11:
        return new C1380er(this.f2493b, 1);
    L13:
        return new C1380er(this.f2493b, 0);
    L15:
        return new C0907V4(this.f2493b, this);
    L17:
        return new C0907V4(this.f2493b, this);
    L19:
        return new C0907V4(this.f2493b, this);
    }

    public C0793Sd(Context r2) {
        this.f2492a = 3;
        this.f2493b = r2.getApplicationContext();
    }
}
