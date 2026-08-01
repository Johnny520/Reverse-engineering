package top.suzhelan.qstory.hook.item;

import android.os.Bundle;
import androidx.compose.foundation.C1030;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC4395;
import p064.C6865;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5918 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16108;

    public C5918(Class cls, C5953 c5953) {
        this.f16108 = 1;
        this.f16107 = cls;
        this.f16106 = c5953;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r10) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.C5918.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        switch (this.f16108) {
            case 2:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj = ((Field) this.f16106).get(methodHookParam.thisObject);
                Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle != null && AbstractC4395.m8907(bundle.getString(AbstractC8405.m13972(1990)), AbstractC8405.m13973("喵呜喵喵喵喵呜喵~喵呜喵喵喵呜喵喵~喵呜喵喵呜呜呜喵~喵呜喵呜呜呜喵呜~喵呜喵呜喵呜喵喵~喵呜喵呜呜喵喵喵")) && C5936.f16128 != null) {
                    methodHookParam.setResult(Boolean.FALSE);
                    new C6865(new C1030(bundle, (C5936) this.f16107)).start();
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }

    public /* synthetic */ C5918(Object obj, int i, Object obj2) {
        this.f16108 = i;
        this.f16106 = obj;
        this.f16107 = obj2;
    }

    public C5918(Field field, C5936 c5936, ClassLoader classLoader) {
        this.f16108 = 2;
        this.f16106 = field;
        this.f16107 = c5936;
    }
}
