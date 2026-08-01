package p183;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.fragment.app.RunnableC3179;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p238.InterfaceC8816;
import p243.C8841;
import p244.C8852;
import p244.C8856;
import p244.InterfaceC8862;
import p244.InterfaceC8863;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8541 implements InterfaceC8538, InterfaceC8863, InterfaceC8816 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f21260;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f21261;

    public C8541(Context context) {
        this.f21261 = 0;
        this.f21260 = context.getApplicationContext();
    }

    @Override // p238.InterfaceC8816
    public Object get() {
        return (ConnectivityManager) this.f21260.getSystemService("connectivity");
    }

    @Override // p183.InterfaceC8538
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo13566(AbstractC1298 abstractC1298) {
        ThreadFactoryC8525 threadFactoryC8525 = new ThreadFactoryC8525("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactoryC8525);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC3179(this, abstractC1298, threadPoolExecutor, 10));
    }

    @Override // p244.InterfaceC8863
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8862 mo877(C8856 c8856) {
        int i = this.f21261;
        Context context = this.f21260;
        switch (i) {
            case 1:
                return new C8841(context, 0);
            case 2:
                return new C8841(context, 1);
            case 3:
                return new C8852(context, this);
            case 4:
                return new C8852(context, this);
            case 5:
                return new C8852(context, this);
            case 6:
                return new C8841(context, 2);
            case 7:
                return new C8852(context, c8856.m14070(Integer.class, AssetFileDescriptor.class));
            default:
                return new C8852(context, c8856.m14070(Integer.class, InputStream.class));
        }
    }

    public /* synthetic */ C8541(Context context, int i) {
        this.f21261 = i;
        this.f21260 = context;
    }
}
