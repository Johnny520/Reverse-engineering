package p330;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson2.AbstractC2906;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONReader$Feature;
import de.robv.android.xposed.XC_MethodHook;
import java.io.RandomAccessFile;
import java.util.HashMap;
import org.apache.commons.io.filefilter.MagicNumberFileFilter;
import p015.AbstractC6201;
import p026.InterfaceC6294;
import p035.RunnableC6339;
import p358.InterfaceC8917;
import retrofit2.InterfaceC5788;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8791 implements InterfaceC6294, InterfaceC5788, InterfaceC8917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Object f24742;

    public /* synthetic */ C8791(Object obj) {
        this.f24742 = obj;
    }

    @Override // retrofit2.InterfaceC5788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4149(Object obj) {
        return InterfaceC2915.m6312(((AbstractC6201) obj).m11648(), (AbstractC2906) this.f24742, new JSONReader$Feature[0]);
    }

    @Override // p358.InterfaceC8917
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object mo14445(RandomAccessFile randomAccessFile) {
        return ((MagicNumberFileFilter) this.f24742).lambda$accept$0(randomAccessFile);
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
        C8790 c8790 = (C8790) this.f24742;
        HashMap map = C8790.f24741;
        new Handler(Looper.getMainLooper()).post(new RunnableC6339(c8790, methodHookParam));
    }
}
