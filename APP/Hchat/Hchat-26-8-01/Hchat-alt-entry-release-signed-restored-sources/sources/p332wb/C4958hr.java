package p332wb;

import de.robv.android.xposed.XposedBridge;
import java.util.HashSet;

/* JADX INFO: renamed from: wb.hr */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4958hr {

    /* JADX INFO: renamed from: a */
    public static final C4958hr f17734a = new C4958hr();

    /* JADX INFO: renamed from: b */
    public static final HashSet f17735b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static C4925gr f17736c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m9724a(Class cls) {
        HashSet hashSet = f17735b;
        if (hashSet.contains(cls)) {
            return;
        }
        try {
            XposedBridge.hookAllMethods(cls, "onActivityResult", new C5226q0(4));
            hashSet.add(cls);
        } catch (Throwable unused) {
        }
    }
}
