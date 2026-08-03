package p126ia;

import de.robv.android.xposed.XC_MethodHook;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p002a1.RunnableC0003a;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: ia.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2032z extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2007a0 f6868b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2032z(C2007a0 c2007a0, int i9) {
        this.f6867a = i9;
        this.f6868b = c2007a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f6867a) {
            case 1:
                methodHookParam.getClass();
                this.f6868b.m4952i(methodHookParam.thisObject);
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object objM8366C0;
        switch (this.f6867a) {
            case 0:
                methodHookParam.getClass();
                Object[] objArr2 = methodHookParam.args;
                if (objArr2 != null) {
                    boolean zM4966c = false;
                    Object objM8366C02 = AbstractC4165l.m8366C0(0, objArr2);
                    if (objM8366C02 != null) {
                        C2007a0 c2007a0 = this.f6868b;
                        c2007a0.getClass();
                        String strM4946q = C2007a0.m4946q(objM8366C02);
                        if (strM4946q != null) {
                            List list = C2007a0.m4944g(c2007a0.f6759b.m815l(strM4946q)).f6779b;
                            if (!list.isEmpty() && (objArr = methodHookParam.args) != null && (objM8366C0 = AbstractC4165l.m8366C0(3, objArr)) != null) {
                                if (objM8366C0 instanceof Number) {
                                    if (!list.isEmpty()) {
                                        Iterator it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if ((("comment:".concat(((C2008b) it.next()).f6773a).hashCode() & 1073741823) | Integer.MIN_VALUE) == ((Number) objM8366C0).intValue()) {
                                                    zM4966c = true;
                                                }
                                            }
                                        }
                                    }
                                } else if (!list.isEmpty()) {
                                    HashSet hashSet = new HashSet();
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        hashSet.add(C2014h.m4964a((C2008b) it2.next()));
                                    }
                                    zM4966c = C2014h.m4966c(objM8366C0, hashSet);
                                }
                                if (zM4966c) {
                                    methodHookParam.setResult((Object) null);
                                    c2007a0.f6765h.post(new RunnableC0003a(c2007a0, 22));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
