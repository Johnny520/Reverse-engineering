package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p012G.C0140d;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0389d extends C0140d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p012G.C0140d
    /* JADX INFO: renamed from: c */
    public final Signature[] mo312c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
