package p167;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p075.C6957;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7693 extends C6957 {
    @Override // p075.C6957
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Signature[] mo12238(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
