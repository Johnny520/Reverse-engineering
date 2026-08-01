package p000;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: renamed from: kf */
/* JADX INFO: loaded from: classes.dex */
public final class C0409kf extends C0893xh {
    @Override // p000.C0893xh
    /* JADX INFO: renamed from: m */
    public final Signature[] mo1681m(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
