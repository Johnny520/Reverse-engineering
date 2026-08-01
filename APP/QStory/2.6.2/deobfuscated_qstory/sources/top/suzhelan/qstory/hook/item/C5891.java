package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5891 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5890 f16062;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16063;

    public /* synthetic */ C5891(C5890 c5890, int i) {
        this.f16063 = i;
        this.f16062 = c5890;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16063;
        C5890 c5890 = this.f16062;
        switch (i) {
            case 0:
                "param";
                methodHookParam.getClass();
                if (c5890.f17376.booleanValue()) {
                    Object[] objArr = methodHookParam.args;
                    "args";
                    objArr.getClass();
                    if (objArr.length != 0) {
                        try {
                            Object obj = methodHookParam.args[0];
                            Field declaredField = obj.getClass().getDeclaredField("switchState");
                            Field declaredField2 = obj.getClass().getDeclaredField("state");
                            declaredField.setAccessible(true);
                            declaredField2.setAccessible(true);
                            declaredField.set(obj, 0);
                            declaredField2.set(obj, 0);
                        } catch (Exception unused) {
                            return;
                        }
                        break;
                    }
                }
                break;
            case 1:
                "param";
                methodHookParam.getClass();
                if (c5890.f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            default:
                "param";
                methodHookParam.getClass();
                if (c5890.f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
        }
    }
}
