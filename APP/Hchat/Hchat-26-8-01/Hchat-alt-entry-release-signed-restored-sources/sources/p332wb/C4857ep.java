package p332wb;

import de.robv.android.xposed.XposedBridge;
import java.util.HashSet;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: wb.ep */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4857ep {

    /* JADX INFO: renamed from: a */
    public static final C4857ep f16968a = new C4857ep();

    /* JADX INFO: renamed from: b */
    public static final HashSet f16969b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static C4824dp f16970c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m9274a(Class cls) {
        Object c3959f;
        if (f16969b.add(cls)) {
            try {
                c3959f = XposedBridge.hookAllMethods(cls, "onActivityResult", new C5513yo(this, 1));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (C3960g.m8182b(c3959f) != null) {
                f16969b.remove(cls);
            }
        }
    }
}
