package p183;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p091.C7787;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8523 extends C7787 {
    @Override // p091.C7787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Signature[] mo12822(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
