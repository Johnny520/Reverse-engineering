package p332wb;

import android.app.Activity;
import ba.C0226f;
import de.robv.android.xposed.XposedBridge;
import java.util.HashSet;

/* JADX INFO: renamed from: wb.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5192p {

    /* JADX INFO: renamed from: a */
    public static final C5192p f19533a = new C5192p();

    /* JADX INFO: renamed from: b */
    public static final HashSet f19534b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static C4819dj f19535c;

    /* JADX INFO: renamed from: d */
    public static Activity f19536d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m9736a(Class cls) {
        HashSet hashSet = f19534b;
        if (hashSet.contains(cls)) {
            return;
        }
        try {
            XposedBridge.hookAllMethods(cls, "onActivityResult", new C0226f(29));
            hashSet.add(cls);
        } catch (Throwable unused) {
        }
    }
}
