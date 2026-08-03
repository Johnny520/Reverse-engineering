package p036c9;

import java.util.Comparator;
import p007a7.AbstractC0018a;
import p276sf.C3958e;
import tf.C4176w;

/* JADX INFO: renamed from: c9.h1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0444h1 implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1305g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c9.a2.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, c9.j1.u(java.util.LinkedHashMap, java.util.HashSet, java.util.ArrayList, java.lang.String, int, java.util.List):void, c9.o2.l(java.util.List):java.util.ArrayList] */
    public /* synthetic */ C0444h1(int i9) {
        this.f1305g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1305g) {
            case 0:
                return Integer.valueOf(((C0414a) obj).f1182d).compareTo(Integer.valueOf(((C0414a) obj2).f1182d));
            case 1:
                return AbstractC0018a.m249m((Integer) ((C3958e) obj).f12961g, (Integer) ((C3958e) obj2).f12961g);
            default:
                return Integer.valueOf(((C0414a) ((C4176w) obj).f13714b).f1182d).compareTo(Integer.valueOf(((C0414a) ((C4176w) obj2).f13714b).f1182d));
        }
    }
}
