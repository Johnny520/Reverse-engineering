package p108ha;

import android.content.Intent;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import p068eh.AbstractC0921a;
import p099h.Hchat.utils.KavaReflector;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3960g;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: ha.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1641f0 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1643g0 f5380b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1641f0(C1643g0 c1643g0, int i9) {
        this.f5379a = i9;
        this.f5380b = c1643g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f5379a) {
            case 0:
                methodHookParam.getClass();
                if (this.f5380b.f5389b.getBoolean("original_moments_upload_enable", false)) {
                    Object[] objArr = methodHookParam.args;
                    Object objM8391z0 = objArr != null ? AbstractC4165l.m8391z0(objArr) : null;
                    Intent intent = objM8391z0 instanceof Intent ? (Intent) objM8391z0 : null;
                    if (intent != null) {
                        intent.putExtra("CropImage_Compress_Img", false);
                        intent.putExtra("key_delete_origin_file", false);
                    }
                    break;
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object c3959f;
        boolean zBooleanValue;
        Object c3959f2;
        Class<?> clsLoadClass;
        Method method;
        int i9 = this.f5379a;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                if (this.f5380b.f5389b.getBoolean("original_moments_upload_enable", false) && (objArr = methodHookParam.args) != null && objArr.length >= 3 && (objArr[0] instanceof Intent)) {
                    if (AbstractC1416l.m3825a(objArr[1], Boolean.TRUE)) {
                        Boolean bool = Boolean.FALSE;
                        objArr[1] = bool;
                        objArr[2] = bool;
                    }
                    Object obj = objArr[0];
                    Intent intent = obj instanceof Intent ? (Intent) obj : null;
                    if (intent != null) {
                        intent.putExtra("CropImage_Compress_Img", false);
                    }
                }
                break;
            default:
                if (this.f5380b.f5389b.getBoolean("original_moments_upload_enable", false)) {
                    C1643g0 c1643g0 = this.f5380b;
                    Object[] objArr2 = methodHookParam.args;
                    if (objArr2 != null && objArr2.length >= 3) {
                        Object obj2 = objArr2[0];
                        String str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null) {
                            Object obj3 = objArr2[1];
                            String str2 = obj3 instanceof String ? (String) obj3 : null;
                            if (str2 != null) {
                                Object obj4 = objArr2[2];
                                String str3 = obj4 instanceof String ? (String) obj4 : null;
                                if (str3 != null && !AbstractC3149m.m6721t0(str) && !AbstractC3149m.m6721t0(str2) && !AbstractC3149m.m6721t0(str3)) {
                                    String strConcat = str.concat(str3);
                                    try {
                                        method = c1643g0.f5393f;
                                    } catch (Throwable th2) {
                                        c3959f = new C3959f(th2);
                                    }
                                    if (method == null) {
                                        zBooleanValue = false;
                                        if (!zBooleanValue) {
                                            methodHookParam.setResult(Boolean.TRUE);
                                        } else {
                                            try {
                                                clsLoadClass = KavaReflector.loadClass("com.tencent.mm.vfs.w6", c1643g0.f5388a.f12145c);
                                            } catch (Throwable th3) {
                                                c3959f2 = new C3959f(th3);
                                            }
                                            if (clsLoadClass != null) {
                                                Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(clsLoadClass, "j", String.class);
                                                Method methodFindDeclaredMethod2 = KavaReflector.findDeclaredMethod(clsLoadClass, "u", String.class);
                                                Method methodFindDeclaredMethod3 = KavaReflector.findDeclaredMethod(clsLoadClass, "c", String.class, String.class);
                                                Method methodFindDeclaredMethod4 = KavaReflector.findDeclaredMethod(clsLoadClass, "k", String.class);
                                                if (methodFindDeclaredMethod != null && methodFindDeclaredMethod2 != null && methodFindDeclaredMethod3 != null && methodFindDeclaredMethod4 != null && AbstractC1416l.m3825a(KavaReflector.invoke(methodFindDeclaredMethod, null, str2), Boolean.TRUE)) {
                                                    KavaReflector.invoke(methodFindDeclaredMethod2, null, str);
                                                    String strConcat2 = str.concat(str3);
                                                    KavaReflector.invoke(methodFindDeclaredMethod3, null, str2, strConcat2);
                                                    Object objInvoke = KavaReflector.invoke(methodFindDeclaredMethod4, null, strConcat2);
                                                    Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
                                                    c3959f2 = Boolean.valueOf((number != null ? number.longValue() : 0L) > 0);
                                                    Throwable thM8182b = C3960g.m8182b(c3959f2);
                                                    if (thM8182b != null) {
                                                        AbstractC0921a.m2261x("[Hchat:OriginalMomentsUpload] 原图复制失败: ", thM8182b.getMessage(), thM8182b);
                                                        c3959f2 = Boolean.FALSE;
                                                    }
                                                    zBooleanValue = ((Boolean) c3959f2).booleanValue();
                                                }
                                            }
                                            if (zBooleanValue) {
                                                methodHookParam.setResult(Boolean.TRUE);
                                            }
                                        }
                                    } else {
                                        c3959f = Boolean.valueOf(AbstractC1416l.m3825a(KavaReflector.invoke(method, null, str2, strConcat), Boolean.TRUE));
                                    }
                                    Throwable thM8182b2 = C3960g.m8182b(c3959f);
                                    if (thM8182b2 != null) {
                                        AbstractC0921a.m2261x("[Hchat:OriginalMomentsUpload] 原图无压缩转换失败: ", thM8182b2.getMessage(), thM8182b2);
                                        c3959f = Boolean.FALSE;
                                    }
                                    zBooleanValue = ((Boolean) c3959f).booleanValue();
                                    if (!zBooleanValue) {
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
