package p332wb;

import android.app.Activity;
import ba.C0226f;
import de.robv.android.xposed.XposedBridge;
import java.util.HashSet;
import p036c9.C0427d0;

/* JADX INFO: renamed from: wb.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4799d {

    /* JADX INFO: renamed from: a */
    public static final C4799d f16474a = new C4799d();

    /* JADX INFO: renamed from: b */
    public static final HashSet f16475b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static C5071la f16476c;

    /* JADX INFO: renamed from: d */
    public static C0427d0 f16477d;

    /* JADX INFO: renamed from: e */
    public static Activity f16478e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m9253a(Class cls) {
        HashSet hashSet = f16475b;
        if (hashSet.contains(cls)) {
            return;
        }
        try {
            XposedBridge.hookAllMethods(cls, "onActivityResult", new C0226f(28));
            hashSet.add(cls);
        } catch (Throwable unused) {
        }
    }
}
