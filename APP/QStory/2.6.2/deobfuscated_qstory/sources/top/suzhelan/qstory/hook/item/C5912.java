package top.suzhelan.qstory.hook.item;

import android.os.Bundle;
import androidx.compose.foundation.C1030;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC4394;
import p064.C6864;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5912 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16099;

    public C5912(Class cls, C5872 c5872) {
        this.f16099 = 1;
        this.f16098 = cls;
        this.f16097 = c5872;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r10) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.C5912.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        switch (this.f16099) {
            case 2:
                "param";
                methodHookParam.getClass();
                Object obj = ((Field) this.f16097).get(methodHookParam.thisObject);
                Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle != null && AbstractC4394.m8917(bundle.getString("ptt_forward"), "114514") && C5931.f16124 != null) {
                    methodHookParam.setResult(Boolean.FALSE);
                    new C6864(new C1030(bundle, (C5931) this.f16098)).start();
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }

    public /* synthetic */ C5912(Object obj, int i, Object obj2) {
        this.f16099 = i;
        this.f16097 = obj;
        this.f16098 = obj2;
    }

    public C5912(Field field, C5931 c5931, ClassLoader classLoader) {
        this.f16099 = 2;
        this.f16097 = field;
        this.f16098 = c5931;
    }
}
