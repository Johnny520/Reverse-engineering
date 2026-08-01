package p167;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import androidx.fragment.app.RunnableC2346;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p222.InterfaceC7986;
import p227.C8011;
import p228.C8022;
import p228.C8026;
import p228.InterfaceC8032;
import p228.InterfaceC8033;
import p251.AbstractC8174;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7711 implements InterfaceC7708, InterfaceC8033, InterfaceC7986 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f20920;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20921;

    public C7711(Context context) {
        this.f20921 = 0;
        this.f20920 = context.getApplicationContext();
    }

    @Override // p222.InterfaceC7986
    public Object get() {
        return (ConnectivityManager) this.f20920.getSystemService("connectivity");
    }

    @Override // p167.InterfaceC7708
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo12977(AbstractC8174 abstractC8174) {
        ThreadFactoryC7695 threadFactoryC7695 = new ThreadFactoryC7695("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactoryC7695);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC2346(this, abstractC8174, threadPoolExecutor, 10));
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8032 mo316(C8026 c8026) {
        int i = this.f20921;
        Context context = this.f20920;
        switch (i) {
            case 1:
                return new C8011(context, 0);
            case 2:
                return new C8011(context, 1);
            case 3:
                return new C8022(context, this);
            case 4:
                return new C8022(context, this);
            case 5:
                return new C8022(context, this);
            case 6:
                return new C8011(context, 2);
            case 7:
                return new C8022(context, c8026.m13483(Integer.class, AssetFileDescriptor.class));
            default:
                return new C8022(context, c8026.m13483(Integer.class, InputStream.class));
        }
    }

    public /* synthetic */ C7711(Context context, int i) {
        this.f20921 = i;
        this.f20920 = context;
    }
}
