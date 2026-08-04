package yyds;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᛷᛱᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1483 implements InterfaceC2768, InterfaceC0240, InterfaceC1564 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f7020;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Context f7021;

    public C1483(Context context) {
        this.f7020 = 3;
        this.f7021 = context.getApplicationContext();
    }

    @Override // yyds.InterfaceC1564
    public Object get() {
        return (ConnectivityManager) this.f7021.getSystemService("connectivity");
    }

    @Override // yyds.InterfaceC2768
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public InterfaceC0894 mo382(C0644 c0644) {
        int i = this.f7020;
        Context context = this.f7021;
        switch (i) {
            case 0:
                return new C2480(context, this);
            case 1:
                return new C2480(context, this);
            case 2:
                return new C2480(context, this);
            case 3:
            case 4:
            default:
                return new C2480(context, c0644.m1565(Integer.class, InputStream.class));
            case 5:
                return new C1622(context, 0);
            case 6:
                return new C1622(context, 1);
            case 7:
                return new C1622(context, 2);
            case 8:
                return new C2480(context, c0644.m1565(Integer.class, AssetFileDescriptor.class));
        }
    }

    @Override // yyds.InterfaceC0240
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public void mo891(AbstractC0476 abstractC0476) {
        ThreadFactoryC0791 threadFactoryC0791 = new ThreadFactoryC0791("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactoryC0791);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0022(this, abstractC0476, threadPoolExecutor, 1));
    }

    public /* synthetic */ C1483(Context context, int i) {
        this.f7020 = i;
        this.f7021 = context;
    }
}
