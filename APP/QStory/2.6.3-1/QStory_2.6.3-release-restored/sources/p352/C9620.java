package p352;

import android.view.View;
import androidx.compose.animation.core.InterfaceC1181;
import androidx.core.view.C3058;
import androidx.core.view.InterfaceC3038;
import com.alibaba.fastjson2.InterfaceC3749;
import com.bumptech.glide.AbstractC3897;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4584;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.util.C5043;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import p023.AbstractC6962;
import p023.C6973;
import p042.InterfaceC7141;
import p233.InterfaceC8796;
import p273.C9037;
import p363.C9668;
import p370.AbstractC9703;
import p370.AbstractC9711;
import p370.C9704;
import p370.C9705;
import p370.C9709;
import p370.C9710;
import p374.InterfaceC9737;
import p384.AbstractC9785;
import p389.InterfaceC9805;
import retrofit2.InterfaceC6619;
import top.suzhelan.plugin.sdk.online.activity.PluginActivity;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9620 implements InterfaceC7141, InterfaceC1181, InterfaceC6619, InterfaceC8796, InterfaceC9737, InterfaceC9805, InterfaceC3038, InterfaceC4584 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25102;

    public /* synthetic */ C9620(int i) {
        this.f25102 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m15031(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m15032(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    @Override // p389.InterfaceC9805
    public void accept(Object obj, Object obj2) throws IOException {
        Appendable appendable = (Appendable) obj;
        switch (this.f25102) {
            case 7:
                appendable.append(AbstractC9785.m15125((Type) obj2));
                break;
            case 8:
                TypeVariable typeVariable = (TypeVariable) obj2;
                appendable.append(typeVariable != null ? AbstractC9785.m15125(typeVariable) : typeVariable.toString());
                break;
            default:
                appendable.append(obj2 instanceof Type ? AbstractC9785.m15125((Type) obj2) : obj2.toString());
                break;
        }
    }

    @Override // retrofit2.InterfaceC6619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4719(Object obj) {
        String strM6935 = InterfaceC3749.m6935(obj);
        C6973 c6973 = C9668.f25289;
        int i = AbstractC6962.f17134;
        return AbstractC3897.m7401(strM6935, c6973);
    }

    @Override // androidx.compose.animation.core.InterfaceC1181
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public float mo1411(float f) {
        return (float) Math.sin((float) ((((double) f) * 3.141592653589793d) / 2.0d));
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4584
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo8627(AbstractC4570 abstractC4570) {
        C9037 c9037 = (C9037) abstractC4570;
        switch (this.f25102) {
            case 11:
                c9037.mo14283().f22978.setTextIsSelectable(true);
                c9037.mo14283().f22976.setTextIsSelectable(true);
                break;
            default:
                c9037.mo14283().f22978.setTextIsSelectable(true);
                c9037.mo14283().f22976.setTextIsSelectable(true);
                break;
        }
    }

    @Override // p233.InterfaceC8796
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public int mo11874(int i, List list) {
        switch (this.f25102) {
            case 3:
                "list";
                list.getClass();
                AbstractC9703 abstractC9703 = (AbstractC9703) list.get(i);
                if (!(abstractC9703 instanceof C9704)) {
                    if (!(abstractC9703 instanceof C9705)) {
                        C5043.m9170();
                    }
                }
                break;
            default:
                "list";
                list.getClass();
                AbstractC9711 abstractC9711 = (AbstractC9711) list.get(i);
                if (!(abstractC9711 instanceof C9710)) {
                    if (!(abstractC9711 instanceof C9709)) {
                        C5043.m9170();
                    }
                }
                break;
        }
        return 0;
    }

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
        methodHookParam.setResult(Boolean.FALSE);
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C3058 mo863(View view, C3058 c3058) {
        return PluginActivity.onCreate$lambda$0(view, c3058);
    }

    @Override // p374.InterfaceC9737
    public void accept(Object obj) throws IOException {
        throw ((IOException) obj);
    }
}
