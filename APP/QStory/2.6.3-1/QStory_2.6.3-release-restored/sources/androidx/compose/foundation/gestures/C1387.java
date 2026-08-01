package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0954;
import androidx.collection.C1091;
import androidx.collection.C1102;
import androidx.compose.p001ui.node.AbstractC2620;
import p126.C8150;
import p126.C8151;
import p128.C8158;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC1362 f1916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C1406 f1917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C1403 f1918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1404 f1919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1405 f1920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1304 f1921;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f1922 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6686 f1923;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C0954 f1924;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public long f1925;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C1342 f1926;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C0954 f1927;

    public C1387(AbstractC1304 abstractC1304) {
        this.f1921 = abstractC1304;
        C0954 c0954 = new C0954((byte) 0, 1);
        c0954.f660 = new C1091();
        this.f1927 = c0954;
        C0954 c09542 = new C0954((byte) 0, 2);
        c09542.f660 = new C1102();
        this.f1924 = c09542;
        this.f1925 = 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m1885(C1387 c1387, C8150 c8150, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        AbstractC1304 abstractC1304 = c1387.f1921;
        C1403 c1403 = c1387.f1918;
        if (c1403 == null) {
            c1403 = new C1403();
            c1403.f1958 = null;
            c1403.f1957 = Long.MAX_VALUE;
            c1403.f1956 = false;
            c1387.f1918 = c1403;
        }
        c1403.f1958 = c8150;
        c1403.f1957 = j;
        C1342 c1342 = c1387.f1926;
        Orientation orientation = abstractC1304.f1769;
        if (c1342 == null) {
            c1387.f1926 = new C1342(orientation, 2);
        } else {
            c1342.f1831 = orientation;
            c1342.f1830 = j2;
        }
        c1403.f1956 = false;
        c1387.f1916 = c1403;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1886(C8150 c8150, C8150 c81502, C8151 c8151, long j) {
        if (this.f1923 == null) {
            this.f1923 = new C6686(11);
        }
        this.f1925 = 0L;
        C6686 c6686M1888 = m1888();
        AbstractC1304 abstractC1304 = this.f1921;
        AbstractC1362.m1862(c6686M1888, c8150, abstractC1304.f1769, c8151, this.f1927, this.f1925);
        long jM13085 = C8158.m13085(AbstractC1362.m1865(c81502, abstractC1304.f1769, c8151), j);
        abstractC1304.f1768.getClass();
        this.f1922 = AbstractC2620.m3909(abstractC1304).mo3644(0L);
        abstractC1304.m1787(new C1320(jM13085));
        C0954 c0954 = this.f1924;
        c0954.f659 = 0;
        ((C1102) c0954.f660).f1275 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1887(C8150 c8150, C8151 c8151, long j) {
        AbstractC1304 abstractC1304 = this.f1921;
        long jMo3644 = AbstractC2620.m3909(abstractC1304).mo3644(0L);
        if (!C8158.m13087(this.f1922, 9205357640488583168L) && !C8158.m13087(jMo3644, this.f1922)) {
            this.f1925 = C8158.m13084(this.f1925, C8158.m13085(jMo3644, this.f1922));
        }
        this.f1922 = jMo3644;
        Orientation orientation = abstractC1304.f1769;
        orientation.getClass();
        int i = AbstractC1303.f1752;
        if (Math.abs(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j & 4294967295L : j >> 32))) > 2.0f) {
            AbstractC1362.m1862(m1888(), c8150, abstractC1304.f1769, c8151, this.f1927, this.f1925);
            C0954 c0954 = this.f1924;
            C1102 c1102 = (C1102) c0954.f660;
            int i2 = c1102.f1275;
            if (i2 == 3) {
                int i3 = c0954.f659;
                c0954.f659 = i3 + 1;
                if (i3 < 0 || i3 >= i2) {
                    C8376.m13331("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = c1102.f1276;
                    long j2 = jArr[i3];
                    jArr[i3] = j;
                }
            } else {
                c1102.m1379(j);
            }
            if (c0954.f659 == 3) {
                c0954.f659 = 0;
            }
            long[] jArr2 = c1102.f1276;
            int i4 = c1102.f1275;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i5] >> 32));
            }
            int i6 = c1102.f1275;
            float f = fIntBitsToFloat2 / i6;
            long[] jArr3 = c1102.f1276;
            for (int i7 = 0; i7 < i6; i7++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i7] & 4294967295L));
            }
            abstractC1304.m1787(new C1321((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / c1102.f1275)) & 4294967295L), true));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6686 m1888() {
        C6686 c6686 = this.f1923;
        if (c6686 != null) {
            return c6686;
        }
        C6755.m11869("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1889(C8150 c8150, long j, C1342 c1342) {
        C1406 c1406 = this.f1917;
        if (c1406 == null) {
            c1406 = new C1406();
            c1406.f1963 = null;
            c1406.f1962 = Long.MAX_VALUE;
            this.f1917 = c1406;
        }
        c1406.f1963 = c8150;
        c1406.f1962 = j;
        c1342.f1830 = 0L;
        this.f1916 = c1406;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1890() {
        C1405 c1405 = this.f1920;
        if (c1405 == null) {
            EnumC0041xecab5e0c enumC0041xecab5e0c = EnumC0041xecab5e0c.NotInitialized;
            c1405 = new C1405();
            c1405.f1961 = enumC0041xecab5e0c;
            c1405.f1960 = false;
            this.f1920 = c1405;
        }
        c1405.f1961 = EnumC0041xecab5e0c.NotInitialized;
        c1405.f1960 = false;
        this.f1916 = c1405;
    }
}
