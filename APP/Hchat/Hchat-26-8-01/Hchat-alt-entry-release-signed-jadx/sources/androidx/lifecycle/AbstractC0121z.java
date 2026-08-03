package androidx.lifecycle;

import android.app.Activity;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0121z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m617a(Activity activity, EnumC0106k enumC0106k) {
        C0114s c0114sMo550f;
        enumC0106k.getClass();
        if (!(activity instanceof InterfaceC0112q) || (c0114sMo550f = ((InterfaceC0112q) activity).mo550f()) == null) {
            return;
        }
        c0114sMo550f.m555d(enumC0106k);
    }
}
