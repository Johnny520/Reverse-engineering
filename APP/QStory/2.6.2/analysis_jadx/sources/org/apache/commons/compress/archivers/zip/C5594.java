package org.apache.commons.compress.archivers.zip;

import java.util.WeakHashMap;
import java.util.function.Supplier;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5594 implements Supplier {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15409;

    public /* synthetic */ C5594(int i) {
        this.f15409 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f15409) {
            case 0:
                C5598 c5598 = new C5598();
                c5598.f15421 = "";
                c5598.f15422 = new CRC32();
                return c5598;
            case 1:
                return new C5586();
            case 2:
                return new C5600();
            case 3:
                return new C5604(C5604.f15450);
            case 4:
                return new C5605(C5605.f15451);
            case 5:
                return new C5602(C5602.f15447);
            case 6:
                return new C5603(C5603.f15448);
            case 7:
                return new C5587(C5587.f15377);
            case 8:
                return new C5607();
            case 9:
                return new X5455_ExtendedTimestamp();
            case 10:
                return new X7875_NewUnix();
            case 11:
                return new C5617();
            case 12:
                return new C5610();
            case 13:
                return new C5606();
            case 14:
                return new WeakHashMap();
            case 15:
                return new byte[8192];
            default:
                return new char[8192];
        }
    }
}
