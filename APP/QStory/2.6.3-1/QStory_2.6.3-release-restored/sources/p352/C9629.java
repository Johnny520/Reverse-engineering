package p352;

import android.view.View;
import android.widget.RelativeLayout;
import com.alibaba.fastjson2.AbstractC3740;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONReader$Feature;
import de.robv.android.xposed.XC_MethodHook;
import java.io.RandomAccessFile;
import org.apache.commons.p014io.filefilter.MagicNumberFileFilter;
import p023.AbstractC6957;
import p042.InterfaceC7141;
import p374.InterfaceC9736;
import retrofit2.InterfaceC6619;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9629 implements InterfaceC7141, InterfaceC6619, InterfaceC9736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Object f25112;

    public /* synthetic */ C9629(Object obj) {
        this.f25112 = obj;
    }

    @Override // retrofit2.InterfaceC6619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4719(Object obj) {
        return InterfaceC3749.m6930(((AbstractC6957) obj).m12078(), (AbstractC3740) this.f25112, new JSONReader$Feature[0]);
    }

    @Override // p374.InterfaceC9736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object mo15033(RandomAccessFile randomAccessFile) {
        return ((MagicNumberFileFilter) this.f25112).lambda$accept$0(randomAccessFile);
    }

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) throws ClassNotFoundException {
        ClassLoader classLoader = (ClassLoader) this.f25112;
        RelativeLayout relativeLayout = (RelativeLayout) methodHookParam.getResult();
        relativeLayout.getContext();
        Class<?> clsLoadClass = classLoader.loadClass("com.tencent.mobileqq.aio.widget.CommonImageView");
        for (int i = 0; i < relativeLayout.getChildCount(); i++) {
            View childAt = relativeLayout.getChildAt(i);
            if (childAt.getClass() == clsLoadClass) {
                return;
            }
        }
    }
}
