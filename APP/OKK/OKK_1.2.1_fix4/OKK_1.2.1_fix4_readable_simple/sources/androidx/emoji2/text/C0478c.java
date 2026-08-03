package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p089x0.C1121e;

/* JADX INFO: renamed from: androidx.emoji2.text.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0478c extends C1121e {
    @Override // p089x0.C1121e
    /* JADX INFO: renamed from: d */
    public final Signature[] mo1198d(PackageManager r2, String r3) {
        return r2.getPackageInfo(r3, 64).signatures;
    }
}
