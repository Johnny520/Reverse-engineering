package p167;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.fragment.app.RunnableC2346;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p222.InterfaceC7987;
import p227.C8012;
import p228.C8023;
import p228.C8027;
import p228.InterfaceC8033;
import p228.InterfaceC8034;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7712 implements InterfaceC7709, InterfaceC8034, InterfaceC7987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f20915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20916;

    public C7712(Context context) {
        this.f20916 = 0;
        this.f20915 = context.getApplicationContext();
    }

    @Override // p222.InterfaceC7987
    public Object get() {
        return (ConnectivityManager) this.f20915.getSystemService("connectivity");
    }

    @Override // p167.InterfaceC7709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo13007(AbstractC0455 abstractC0455) {
        ThreadFactoryC7696 threadFactoryC7696 = new ThreadFactoryC7696("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactoryC7696);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC2346(this, abstractC0455, threadPoolExecutor, 10));
    }

    @Override // p228.InterfaceC8034
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8033 mo317(C8027 c8027) {
        int i = this.f20916;
        Context context = this.f20915;
        switch (i) {
            case 1:
                return new C8012(context, 0);
            case 2:
                return new C8012(context, 1);
            case 3:
                return new C8023(context, this);
            case 4:
                return new C8023(context, this);
            case 5:
                return new C8023(context, this);
            case 6:
                return new C8012(context, 2);
            case 7:
                return new C8023(context, c8027.m13511(Integer.class, AssetFileDescriptor.class));
            default:
                return new C8023(context, c8027.m13511(Integer.class, InputStream.class));
        }
    }

    public /* synthetic */ C7712(Context context, int i) {
        this.f20916 = i;
        this.f20915 = context;
    }
}
