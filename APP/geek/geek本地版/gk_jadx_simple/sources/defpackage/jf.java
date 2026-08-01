package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: loaded from: classes.dex */
public final class jf extends vh {
    @Override // defpackage.vh
    public final Signature[] g(PackageManager r2, String r3) {
        return r2.getPackageInfo(r3, 64).signatures;
    }
}
