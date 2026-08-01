package p336;

import android.view.View;
import android.widget.RelativeLayout;
import com.alibaba.fastjson2.AbstractC2907;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONReader$Feature;
import de.robv.android.xposed.XC_MethodHook;
import java.io.RandomAccessFile;
import org.apache.commons.io.filefilter.MagicNumberFileFilter;
import p007.AbstractC6128;
import p026.InterfaceC6312;
import p287.AbstractC8405;
import p358.InterfaceC8907;
import retrofit2.InterfaceC5789;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8800 implements InterfaceC6312, InterfaceC5789, InterfaceC8907 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Object f24767;

    public /* synthetic */ C8800(Object obj) {
        this.f24767 = obj;
    }

    @Override // retrofit2.InterfaceC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4159(Object obj) {
        return InterfaceC2916.m6370(((AbstractC6128) obj).m11519(), (AbstractC2907) this.f24767, new JSONReader$Feature[0]);
    }

    @Override // p358.InterfaceC8907
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object mo14474(RandomAccessFile randomAccessFile) {
        return ((MagicNumberFileFilter) this.f24767).lambda$accept$0(randomAccessFile);
    }

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1479(XC_MethodHook.MethodHookParam methodHookParam) throws ClassNotFoundException {
        ClassLoader classLoader = (ClassLoader) this.f24767;
        RelativeLayout relativeLayout = (RelativeLayout) methodHookParam.getResult();
        relativeLayout.getContext();
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(1151));
        for (int i = 0; i < relativeLayout.getChildCount(); i++) {
            View childAt = relativeLayout.getChildAt(i);
            if (childAt.getClass() == clsLoadClass) {
                return;
            }
        }
    }
}
