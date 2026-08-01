package androidx.compose.p001ui.semantics;

import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1137;
import androidx.collection.C1083;
import androidx.collection.C1113;
import androidx.collection.C1126;
import androidx.compose.p001ui.platform.AbstractC2751;
import java.util.Iterator;
import kotlin.InterfaceC6000;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.C6385;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2791 implements InterfaceC2779, Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f6121;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1113 f6122;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f6123;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1083 f6124;

    public C2791() {
        long[] jArr = AbstractC1137.f1352;
        this.f6124 = new C1083();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2791)) {
            return false;
        }
        C2791 c2791 = (C2791) obj;
        return AbstractC5227.m9466(this.f6124, c2791.f6124) && this.f6123 == c2791.f6123 && this.f6121 == c2791.f6121;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6121) + AbstractC0900.m701(this.f6124.hashCode() * 31, 31, this.f6123);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1113 c1113 = this.f6122;
        if (c1113 == null) {
            C1083 c1083 = this.f6124;
            c1083.getClass();
            C1113 c11132 = new C1113(c1083);
            this.f6122 = c11132;
            c1113 = c11132;
        }
        return ((C1126) c1113.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f6123) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f6121) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        C1083 c1083 = this.f6124;
        Object[] objArr = c1083.f1225;
        Object[] objArr2 = c1083.f1224;
        long[] jArr = c1083.f1226;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((C2782) obj).f6103);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return AbstractC2751.m4184(this) + "{ " + ((Object) sb) + " }";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4230(C2791 c2791) {
        C1083 c1083 = c2791.f6124;
        Object[] objArr = c1083.f1225;
        Object[] objArr2 = c1083.f1224;
        long[] jArr = c1083.f1226;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C2782 c2782 = (C2782) obj;
                        C1083 c10832 = this.f6124;
                        Object objM1317 = c10832.m1317(c2782);
                        c2782.getClass();
                        Object objInvoke = c2782.f6102.invoke(objM1317, obj2);
                        if (objInvoke != null) {
                            c10832.m1315(c2782, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m4231(C2782 c2782) {
        Object objM1317 = this.f6124.m1317(c2782);
        if (objM1317 != null) {
            return objM1317;
        }
        C6385.m11442(c2782, "Key not present: ", " - consider getOrElse or getOrNull");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2791 m4232() {
        C2791 c2791 = new C2791();
        c2791.f6123 = this.f6123;
        c2791.f6121 = this.f6121;
        C1083 c1083 = c2791.f6124;
        c1083.getClass();
        C1083 c10832 = this.f6124;
        c10832.getClass();
        Object[] objArr = c10832.f1225;
        Object[] objArr2 = c10832.f1224;
        long[] jArr = c10832.f1226;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            c1083.m1315(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return c2791;
    }

    @Override // androidx.compose.p001ui.semantics.InterfaceC2779
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4150(C2782 c2782, Object obj) {
        boolean z = obj instanceof C2776;
        C1083 c1083 = this.f6124;
        if (z && c1083.m1312(c2782)) {
            Object objM1317 = c1083.m1317(c2782);
            objM1317.getClass();
            C2776 c2776 = (C2776) objM1317;
            C2776 c27762 = (C2776) obj;
            String str = c27762.f6052;
            if (str == null) {
                str = c2776.f6052;
            }
            InterfaceC6000 interfaceC6000 = c27762.f6051;
            if (interfaceC6000 == null) {
                interfaceC6000 = c2776.f6051;
            }
            c1083.m1315(c2782, new C2776(str, interfaceC6000));
        } else {
            c1083.m1315(c2782, obj);
        }
        c2782.getClass();
    }
}
