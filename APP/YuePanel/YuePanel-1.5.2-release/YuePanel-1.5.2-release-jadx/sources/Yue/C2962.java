package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
@InterfaceC5572(name = "-SegmentedByteString")
public final class C2962 {
    /* JADX INFO: renamed from: ۥ */
    public static final int m27(@InterfaceC6399 int[] iArr, int i, int i2, int i3) {
        C5499.m17103(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m28(@InterfaceC6399 C7279 c7279, int i, @InterfaceC6399 byte[] bArr, int i2, int i3) {
        C5499.m17103(c7279, "<this>");
        C5499.m17103(bArr, "target");
        long j = i3;
        C2963.m5677(c7279.m9852(), i, j);
        C2963.m5677(bArr.length, i2, j);
        int i4 = i3 + i;
        int iM5674 = m5674(c7279, i);
        while (i < i4) {
            int i5 = iM5674 == 0 ? 0 : c7279.m22747()[iM5674 - 1];
            int i6 = c7279.m22747()[iM5674] - i5;
            int i7 = c7279.m22747()[c7279.m22748().length + iM5674];
            int iMin = Math.min(i4, i6 + i5) - i;
            int i8 = i7 + (i - i5);
            C3404.m7123(c7279.m22748()[iM5674], bArr, i2, i8, i8 + iMin);
            i2 += iMin;
            i += iMin;
            iM5674++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m5663(@InterfaceC6399 C7279 c7279, @InterfaceC6489 Object obj) {
        C5499.m17103(c7279, "<this>");
        if (obj == c7279) {
            return true;
        }
        if (obj instanceof C3630) {
            C3630 c3630 = (C3630) obj;
            if (c3630.m9852() == c7279.m9852() && c7279.mo9844(0, c3630, 0, c7279.m9852())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m5664(@InterfaceC6399 C7279 c7279) {
        C5499.m17103(c7279, "<this>");
        return c7279.m22747()[c7279.m22748().length - 1];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m5665(@InterfaceC6399 C7279 c7279) {
        C5499.m17103(c7279, "<this>");
        int iM9825 = c7279.m9825();
        if (iM9825 != 0) {
            return iM9825;
        }
        int length = c7279.m22748().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = c7279.m22747()[length + i];
            int i5 = c7279.m22747()[i];
            byte[] bArr = c7279.m22748()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        c7279.m9847(i2);
        return i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final byte m5666(@InterfaceC6399 C7279 c7279, int i) {
        C5499.m17103(c7279, "<this>");
        C2963.m5677(c7279.m22747()[c7279.m22748().length - 1], i, 1L);
        int iM5674 = m5674(c7279, i);
        return c7279.m22748()[iM5674][(i - (iM5674 == 0 ? 0 : c7279.m22747()[iM5674 - 1])) + c7279.m22747()[c7279.m22748().length + iM5674]];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean m5667(@InterfaceC6399 C7279 c7279, int i, @InterfaceC6399 C3630 c3630, int i2, int i3) {
        C5499.m17103(c7279, "<this>");
        C5499.m17103(c3630, "other");
        if (i < 0 || i > c7279.m9852() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM5674 = m5674(c7279, i);
        while (i < i4) {
            int i5 = iM5674 == 0 ? 0 : c7279.m22747()[iM5674 - 1];
            int i6 = c7279.m22747()[iM5674] - i5;
            int i7 = c7279.m22747()[c7279.m22748().length + iM5674];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!c3630.mo9845(i2, c7279.m22748()[iM5674], i7 + (i - i5), iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM5674++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m5668(@InterfaceC6399 C7279 c7279, int i, @InterfaceC6399 byte[] bArr, int i2, int i3) {
        C5499.m17103(c7279, "<this>");
        C5499.m17103(bArr, "other");
        if (i < 0 || i > c7279.m9852() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM5674 = m5674(c7279, i);
        while (i < i4) {
            int i5 = iM5674 == 0 ? 0 : c7279.m22747()[iM5674 - 1];
            int i6 = c7279.m22747()[iM5674] - i5;
            int i7 = c7279.m22747()[c7279.m22748().length + iM5674];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!C2963.m5676(c7279.m22748()[iM5674], i7 + (i - i5), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM5674++;
        }
        return true;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C3630 m5669(@InterfaceC6399 C7279 c7279, int i, int i2) {
        C5499.m17103(c7279, "<this>");
        int iM5684 = C2963.m5684(c7279, i2);
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
        if (iM5684 > c7279.m9852()) {
            throw new IllegalArgumentException(("endIndex=" + iM5684 + " > length(" + c7279.m9852() + ')').toString());
        }
        int i3 = iM5684 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iM5684 + " < beginIndex=" + i).toString());
        }
        if (i == 0 && iM5684 == c7279.m9852()) {
            return c7279;
        }
        if (i == iM5684) {
            return C3630.f6372;
        }
        int iM5674 = m5674(c7279, i);
        int iM56742 = m5674(c7279, iM5684 - 1);
        byte[][] bArr = (byte[][]) C3404.m7165(c7279.m22748(), iM5674, iM56742 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iM5674 <= iM56742) {
            int i4 = iM5674;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(c7279.m22747()[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr.length] = c7279.m22747()[c7279.m22748().length + i4];
                if (i4 == iM56742) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iM5674 != 0 ? c7279.m22747()[iM5674 - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i - i7);
        return new C7279(bArr, iArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final byte[] m5670(@InterfaceC6399 C7279 c7279) {
        C5499.m17103(c7279, "<this>");
        byte[] bArr = new byte[c7279.m9852()];
        int length = c7279.m22748().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = c7279.m22747()[length + i];
            int i5 = c7279.m22747()[i];
            int i6 = i5 - i2;
            C3404.m7123(c7279.m22748()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m5671(@InterfaceC6399 C7279 c7279, @InterfaceC6399 C3600 c3600, int i, int i2) {
        C5499.m17103(c7279, "<this>");
        C5499.m17103(c3600, "buffer");
        int i3 = i + i2;
        int iM5674 = m5674(c7279, i);
        while (i < i3) {
            int i4 = iM5674 == 0 ? 0 : c7279.m22747()[iM5674 - 1];
            int i5 = c7279.m22747()[iM5674] - i4;
            int i6 = c7279.m22747()[c7279.m22748().length + iM5674];
            int iMin = Math.min(i3, i5 + i4) - i;
            int i7 = i6 + (i - i4);
            C7275 c7275 = new C7275(c7279.m22748()[iM5674], i7, i7 + iMin, true, false);
            C7275 c72752 = c3600.f6209;
            if (c72752 == null) {
                c7275.f21954 = c7275;
                c7275.f21953 = c7275;
                c3600.f6209 = c7275;
            } else {
                C5499.m17100(c72752);
                C7275 c72753 = c72752.f21954;
                C5499.m17100(c72753);
                c72753.m22726(c7275);
            }
            i += iMin;
            iM5674++;
        }
        c3600.m9680(c3600.m9684() + ((long) i2));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m5672(C7279 c7279, int i, int i2, InterfaceC5140<? super byte[], ? super Integer, ? super Integer, C8107> interfaceC5140) {
        int iM5674 = m5674(c7279, i);
        while (i < i2) {
            int i3 = iM5674 == 0 ? 0 : c7279.m22747()[iM5674 - 1];
            int i4 = c7279.m22747()[iM5674] - i3;
            int i5 = c7279.m22747()[c7279.m22748().length + iM5674];
            int iMin = Math.min(i2, i4 + i3) - i;
            interfaceC5140.mo15350(c7279.m22748()[iM5674], Integer.valueOf(i5 + (i - i3)), Integer.valueOf(iMin));
            i += iMin;
            iM5674++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final void m5673(@InterfaceC6399 C7279 c7279, @InterfaceC6399 InterfaceC5140<? super byte[], ? super Integer, ? super Integer, C8107> interfaceC5140) {
        C5499.m17103(c7279, "<this>");
        C5499.m17103(interfaceC5140, "action");
        int length = c7279.m22748().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = c7279.m22747()[length + i];
            int i4 = c7279.m22747()[i];
            interfaceC5140.mo15350(c7279.m22748()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int m5674(@InterfaceC6399 C7279 c7279, int i) {
        C5499.m17103(c7279, "<this>");
        int iM27 = m27(c7279.m22747(), i + 1, 0, c7279.m22748().length);
        return iM27 >= 0 ? iM27 : ~iM27;
    }
}
