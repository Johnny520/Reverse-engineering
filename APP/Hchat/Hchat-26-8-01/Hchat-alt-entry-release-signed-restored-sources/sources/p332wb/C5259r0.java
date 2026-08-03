package p332wb;

import android.app.Activity;
import de.robv.android.xposed.XposedBridge;
import java.util.HashSet;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: wb.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5259r0 {

    /* JADX INFO: renamed from: a */
    public static final C5259r0 f20316a = new C5259r0();

    /* JADX INFO: renamed from: b */
    public static final HashSet f20317b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static InterfaceC1220a f20318c;

    /* JADX INFO: renamed from: d */
    public static Activity f20319d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m9740a(Class cls) {
        HashSet hashSet = f20317b;
        if (hashSet.contains(cls)) {
            return;
        }
        try {
            XposedBridge.hookAllMethods(cls, "onActivityResult", new C5226q0(0));
            hashSet.add(cls);
        } catch (Throwable unused) {
        }
    }
}
