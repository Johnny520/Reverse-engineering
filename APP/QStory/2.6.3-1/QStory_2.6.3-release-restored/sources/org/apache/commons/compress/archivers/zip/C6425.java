package org.apache.commons.compress.archivers.zip;

import java.util.WeakHashMap;
import java.util.function.Supplier;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6425 implements Supplier {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15754;

    public /* synthetic */ C6425(int i) {
        this.f15754 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f15754) {
            case 0:
                C6429 c6429 = new C6429();
                c6429.f15766 = "";
                c6429.f15767 = new CRC32();
                return c6429;
            case 1:
                return new C6417();
            case 2:
                return new C6431();
            case 3:
                return new C6435(C6435.f15795);
            case 4:
                return new C6436(C6436.f15796);
            case 5:
                return new C6433(C6433.f15792);
            case 6:
                return new C6434(C6434.f15793);
            case 7:
                return new C6418(C6418.f15722);
            case 8:
                return new C6438();
            case 9:
                return new X5455_ExtendedTimestamp();
            case 10:
                return new X7875_NewUnix();
            case 11:
                return new C6448();
            case 12:
                return new C6441();
            case 13:
                return new C6437();
            case 14:
                return new WeakHashMap();
            case 15:
                return new byte[8192];
            default:
                return new char[8192];
        }
    }
}
