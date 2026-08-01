package p330;

import android.app.Activity;
import android.view.View;
import androidx.compose.animation.core.InterfaceC0335;
import androidx.core.view.C2225;
import androidx.core.view.InterfaceC2205;
import com.alibaba.fastjson2.InterfaceC2915;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3751;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.util.C4210;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.List;
import p015.AbstractC6206;
import p015.C6217;
import p026.InterfaceC6294;
import p217.InterfaceC7966;
import p257.C8207;
import p316.C8675;
import p355.C8893;
import p356.AbstractC8895;
import p356.AbstractC8903;
import p356.C8896;
import p356.C8897;
import p356.C8901;
import p356.C8902;
import p358.InterfaceC8918;
import p370.InterfaceC8963;
import p372.AbstractC8972;
import retrofit2.InterfaceC5788;
import top.suzhelan.plugin.sdk.online.activity.PluginActivity;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪子兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8796 implements InterfaceC6294, InterfaceC0335, InterfaceC5788, InterfaceC7966, InterfaceC8918, InterfaceC8963, InterfaceC3751, InterfaceC2205 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24751;

    public /* synthetic */ C8796(int i) {
        this.f24751 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m14448(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m14449(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    @Override // p370.InterfaceC8963
    public void accept(Object obj, Object obj2) throws IOException {
        Appendable appendable = (Appendable) obj;
        switch (this.f24751) {
            case 6:
                appendable.append(AbstractC8972.m14554((Type) obj2));
                break;
            case 7:
                TypeVariable typeVariable = (TypeVariable) obj2;
                appendable.append(typeVariable != null ? AbstractC8972.m14554(typeVariable) : typeVariable.toString());
                break;
            default:
                appendable.append(obj2 instanceof Type ? AbstractC8972.m14554((Type) obj2) : obj2.toString());
                break;
        }
    }

    @Override // retrofit2.InterfaceC5788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4149(Object obj) {
        String strM6317 = InterfaceC2915.m6317(obj);
        C6217 c6217 = C8893.f25057;
        int i = AbstractC6206.f17028;
        return C8675.m14360(strM6317, c6217);
    }

    @Override // androidx.compose.animation.core.InterfaceC0335
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public float mo850(float f) {
        return (float) Math.sin((float) ((((double) f) * 3.141592653589793d) / 2.0d));
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3751
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo8081(AbstractC3737 abstractC3737) {
        C8207 c8207 = (C8207) abstractC3737;
        switch (this.f24751) {
            case 10:
                c8207.mo13707().f22634.setTextIsSelectable(true);
                c8207.mo13707().f22632.setTextIsSelectable(true);
                break;
            default:
                c8207.mo13707().f22634.setTextIsSelectable(true);
                c8207.mo13707().f22632.setTextIsSelectable(true);
                break;
        }
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public int mo11254(int i, List list) {
        switch (this.f24751) {
            case 3:
                AbstractC3056.m6668(-3937689878926722471L);
                list.getClass();
                AbstractC8895 abstractC8895 = (AbstractC8895) list.get(i);
                if (!(abstractC8895 instanceof C8896)) {
                    if (!(abstractC8895 instanceof C8897)) {
                        C4210.m8621();
                    }
                }
                break;
            default:
                AbstractC3056.m6668(-3937689878926722471L);
                list.getClass();
                AbstractC8903 abstractC8903 = (AbstractC8903) list.get(i);
                if (!(abstractC8903 instanceof C8902)) {
                    if (!(abstractC8903 instanceof C8901)) {
                        C4210.m8621();
                    }
                }
                break;
        }
        return 0;
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
        HashMap map = C8798.f24754;
        C8798.f24754.remove((Activity) methodHookParam.thisObject);
        System.gc();
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo302(View view, C2225 c2225) {
        return PluginActivity.onCreate$lambda$0(view, c2225);
    }

    @Override // p358.InterfaceC8918
    public void accept(Object obj) throws IOException {
        throw ((IOException) obj);
    }
}
