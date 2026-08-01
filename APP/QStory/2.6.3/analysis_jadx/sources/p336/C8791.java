package p336;

import android.view.View;
import androidx.compose.animation.core.InterfaceC0335;
import androidx.core.view.C2225;
import androidx.core.view.InterfaceC2205;
import com.alibaba.fastjson2.InterfaceC2916;
import com.bumptech.glide.AbstractC3065;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3752;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.util.C4211;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import p007.AbstractC6133;
import p007.C6144;
import p026.InterfaceC6312;
import p217.InterfaceC7967;
import p257.C8208;
import p287.AbstractC8405;
import p347.C8839;
import p354.AbstractC8874;
import p354.AbstractC8882;
import p354.C8875;
import p354.C8876;
import p354.C8880;
import p354.C8881;
import p358.InterfaceC8908;
import p368.AbstractC8956;
import p373.InterfaceC8976;
import retrofit2.InterfaceC5789;
import top.suzhelan.plugin.sdk.online.activity.PluginActivity;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8791 implements InterfaceC6312, InterfaceC0335, InterfaceC5789, InterfaceC7967, InterfaceC8908, InterfaceC8976, InterfaceC2205, InterfaceC3752 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24757;

    public /* synthetic */ C8791(int i) {
        this.f24757 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m14472(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m14473(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    @Override // p373.InterfaceC8976
    public void accept(Object obj, Object obj2) throws IOException {
        Appendable appendable = (Appendable) obj;
        switch (this.f24757) {
            case 7:
                appendable.append(AbstractC8956.m14566((Type) obj2));
                break;
            case 8:
                TypeVariable typeVariable = (TypeVariable) obj2;
                appendable.append(typeVariable != null ? AbstractC8956.m14566(typeVariable) : typeVariable.toString());
                break;
            default:
                appendable.append(obj2 instanceof Type ? AbstractC8956.m14566((Type) obj2) : obj2.toString());
                break;
        }
    }

    @Override // retrofit2.InterfaceC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4159(Object obj) {
        String strM6375 = InterfaceC2916.m6375(obj);
        C6144 c6144 = C8839.f24944;
        int i = AbstractC6133.f16789;
        return AbstractC3065.m6841(strM6375, c6144);
    }

    @Override // androidx.compose.animation.core.InterfaceC0335
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public float mo851(float f) {
        return (float) Math.sin((float) ((((double) f) * 3.141592653589793d) / 2.0d));
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3752
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo8068(AbstractC3738 abstractC3738) {
        C8208 c8208 = (C8208) abstractC3738;
        switch (this.f24757) {
            case 11:
                c8208.mo13724().f22633.setTextIsSelectable(true);
                c8208.mo13724().f22631.setTextIsSelectable(true);
                break;
            default:
                c8208.mo13724().f22633.setTextIsSelectable(true);
                c8208.mo13724().f22631.setTextIsSelectable(true);
                break;
        }
    }

    @Override // p217.InterfaceC7967
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public int mo11315(int i, List list) {
        switch (this.f24757) {
            case 3:
                AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
                list.getClass();
                AbstractC8874 abstractC8874 = (AbstractC8874) list.get(i);
                if (!(abstractC8874 instanceof C8875)) {
                    if (!(abstractC8874 instanceof C8876)) {
                        C4211.m8611();
                    }
                }
                break;
            default:
                AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
                list.getClass();
                AbstractC8882 abstractC8882 = (AbstractC8882) list.get(i);
                if (!(abstractC8882 instanceof C8881)) {
                    if (!(abstractC8882 instanceof C8880)) {
                        C4211.m8611();
                    }
                }
                break;
        }
        return 0;
    }

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
        methodHookParam.setResult(Boolean.FALSE);
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo303(View view, C2225 c2225) {
        return PluginActivity.onCreate$lambda$0(view, c2225);
    }

    @Override // p358.InterfaceC8908
    public void accept(Object obj) throws IOException {
        throw ((IOException) obj);
    }
}
