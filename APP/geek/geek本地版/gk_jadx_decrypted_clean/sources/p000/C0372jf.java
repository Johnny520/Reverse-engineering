package p000;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: renamed from: jf */
/* JADX INFO: loaded from: classes.dex */
public final class C0372jf extends C0819vh {
    @Override // p000.C0819vh
    /* JADX INFO: renamed from: g */
    public final Signature[] mo1594g(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
