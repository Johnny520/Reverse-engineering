package p162l3;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p003a2.C0014a;

/* JADX INFO: renamed from: l3.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2449c extends C0014a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p003a2.C0014a
    /* JADX INFO: renamed from: i */
    public final Signature[] mo195i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
