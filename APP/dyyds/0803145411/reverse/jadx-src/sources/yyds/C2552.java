package yyds;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲇᲇᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2552 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f12608;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f12609;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f12610;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Object f12611;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f12612;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Object f12613;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f12614;

    public C2552(C0052 c0052, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        C1138 c1138;
        int i2;
        this.f12614 = arrayList;
        this.f12608 = iArr;
        this.f12613 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f12611 = c0052;
        RunnableC0908 runnableC0908 = (RunnableC0908) c0052.f551;
        int size = runnableC0908.f4132.size();
        this.f12609 = size;
        int size2 = runnableC0908.f4134.size();
        this.f12610 = size2;
        this.f12612 = true;
        C1138 c11382 = arrayList.isEmpty() ? null : (C1138) arrayList.get(0);
        if (c11382 == null || c11382.f5219 != 0 || c11382.f5220 != 0) {
            arrayList.add(0, new C1138(0, 0, 0));
        }
        arrayList.add(new C1138(size, size2, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1138 c11383 = (C1138) it.next();
            for (int i3 = 0; i3 < c11383.f5221; i3++) {
                int i4 = c11383.f5219 + i3;
                int i5 = c11383.f5220 + i3;
                int i6 = c0052.m388(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.f12612) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                C1138 c11384 = (C1138) it2.next();
                while (true) {
                    i = c11384.f5219;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size3 = arrayList.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 < size3) {
                                    c1138 = (C1138) arrayList.get(i8);
                                    while (true) {
                                        i2 = c1138.f5220;
                                        if (i9 < i2) {
                                            if (iArr2[i9] == 0 && c0052.m397(i7, i9)) {
                                                int i10 = c0052.m388(i7, i9) ? 8 : 4;
                                                iArr[i7] = (i9 << 4) | i10;
                                                iArr2[i9] = i10 | (i7 << 4);
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                i9 = c1138.f5221 + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = c11384.f5221 + i;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static void m4629(C1450 c1450, C2552 c2552, C2552 c25522, C2552 c25523, C2552 c25524, C2548 c2548) {
        if (c2552 != null) {
            c2552.m4637(c1450.m2952("RuntimeVisibleAnnotations"), c2548);
        }
        if (c25522 != null) {
            c25522.m4637(c1450.m2952("RuntimeInvisibleAnnotations"), c2548);
        }
        if (c25523 != null) {
            c25523.m4637(c1450.m2952("RuntimeVisibleTypeAnnotations"), c2548);
        }
        if (c25524 != null) {
            c25524.m4637(c1450.m2952("RuntimeInvisibleTypeAnnotations"), c2548);
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static void m4630(int i, C2552[] c2552Arr, int i2, C2548 c2548) {
        int iM4636 = (i2 * 2) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            iM4636 += c2552Arr[i3] == null ? 0 : r4.m4636(null) - 8;
        }
        c2548.m4590(i);
        c2548.m4585(iM4636);
        c2548.m4589(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            C2552 c2552 = null;
            for (C2552 c25522 = c2552Arr[i4]; c25522 != null; c25522 = (C2552) c25522.f12613) {
                c25522.m4639();
                i5++;
                c2552 = c25522;
            }
            c2548.m4590(i5);
            while (c2552 != null) {
                C2548 c25482 = (C2548) c2552.f12608;
                c2548.m4584(c25482.f12555, 0, c25482.f12556);
                c2552 = (C2552) c2552.f12611;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static C2552 m4631(C1450 c1450, String str, C2552 c2552) {
        C2548 c2548 = new C2548();
        c2548.m4590(c1450.m2952(str));
        c2548.m4590(0);
        return new C2552(c1450, true, c2548, c2552);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static int m4632(C2552 c2552, C2552 c25522, C2552 c25523, C2552 c25524) {
        int iM4636 = c2552 != null ? c2552.m4636("RuntimeVisibleAnnotations") : 0;
        if (c25522 != null) {
            iM4636 += c25522.m4636("RuntimeInvisibleAnnotations");
        }
        if (c25523 != null) {
            iM4636 += c25523.m4636("RuntimeVisibleTypeAnnotations");
        }
        return c25524 != null ? c25524.m4636("RuntimeInvisibleTypeAnnotations") + iM4636 : iM4636;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m4633(String str, C2552[] c2552Arr, int i) {
        int iM4636 = (i * 2) + 7;
        for (int i2 = 0; i2 < i; i2++) {
            iM4636 += c2552Arr[i2] == null ? 0 : r3.m4636(str) - 8;
        }
        return iM4636;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static C0844 m4634(ArrayDeque arrayDeque, int i, boolean z) {
        C0844 c0844;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0844 = null;
                break;
            }
            c0844 = (C0844) it.next();
            if (c0844.f3880 == i && c0844.f3882 == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C0844 c08442 = (C0844) it.next();
            if (z) {
                c08442.f3881--;
            } else {
                c08442.f3881++;
            }
        }
        return c0844;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2552 m4635(C1450 c1450, int i, C2548 c2548, String str, C2552 c2552) {
        C2548 c25482 = new C2548();
        int i2 = i >>> 24;
        if (i2 != 0 && i2 != 1) {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    c25482.m4586(i2, (i & 16776960) >> 8);
                    break;
                case 19:
                case 20:
                case 21:
                    c25482.m4589(i2);
                    break;
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            c25482.m4585(i);
                            break;
                        default:
                            C1693.m3437();
                            return null;
                    }
                    break;
            }
        } else {
            c25482.m4590(i >>> 16);
        }
        if (c2548 == null) {
            c25482.m4589(0);
        } else {
            byte[] bArr = c2548.f12555;
            int i3 = c2548.f12556;
            c25482.m4584(bArr, i3, (bArr[i3] * 2) + 1);
        }
        c25482.m4590(c1450.m2952(str));
        c25482.m4590(0);
        return new C2552(c1450, true, c25482, c2552);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int m4636(String str) {
        if (str != null) {
            ((C1450) this.f12614).m2952(str);
        }
        int i = 8;
        while (this != null) {
            i += ((C2548) this.f12608).f12556;
            this = (C2552) this.f12613;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public void m4637(int i, C2548 c2548) {
        int i2 = 2;
        C2552 c2552 = null;
        int i3 = 0;
        while (this != null) {
            this.m4639();
            i2 += ((C2548) this.f12608).f12556;
            i3++;
            c2552 = this;
            this = (C2552) this.f12613;
        }
        c2548.m4590(i);
        c2548.m4585(i2);
        c2548.m4590(i3);
        while (c2552 != null) {
            C2548 c25482 = (C2548) c2552.f12608;
            c2548.m4584(c25482.f12555, 0, c25482.f12556);
            c2552 = (C2552) c2552.f12611;
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C2552 m4638(String str) {
        C1450 c1450 = (C1450) this.f12614;
        C2548 c2548 = (C2548) this.f12608;
        this.f12610++;
        if (this.f12612) {
            c2548.m4590(c1450.m2952(str));
        }
        c2548.m4586(91, 0);
        return new C2552(c1450, false, c2548, (C2552) null);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public void m4639() {
        int i = this.f12609;
        if (i != -1) {
            byte[] bArr = ((C2548) this.f12608).f12555;
            int i2 = this.f12610;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public void m4640(Object obj, String str) {
        C1450 c1450 = (C1450) this.f12614;
        C2548 c2548 = (C2548) this.f12608;
        this.f12610++;
        if (this.f12612) {
            c2548.m4590(c1450.m2952(str));
        }
        if (obj instanceof String) {
            c2548.m4586(115, c1450.m2952((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            c2548.m4586(66, c1450.m2963(3, ((Byte) obj).byteValue()).f11716);
            return;
        }
        if (obj instanceof Boolean) {
            c2548.m4586(90, c1450.m2963(3, ((Boolean) obj).booleanValue() ? 1 : 0).f11716);
            return;
        }
        if (obj instanceof Character) {
            c2548.m4586(67, c1450.m2963(3, ((Character) obj).charValue()).f11716);
            return;
        }
        if (obj instanceof Short) {
            c2548.m4586(83, c1450.m2963(3, ((Short) obj).shortValue()).f11716);
            return;
        }
        if (obj instanceof C1308) {
            c2548.m4586(99, c1450.m2952(((C1308) obj).m2597()));
            return;
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c2548.m4586(91, bArr.length);
            int length = bArr.length;
            while (i < length) {
                c2548.m4586(66, c1450.m2963(3, bArr[i]).f11716);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c2548.m4586(91, zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                c2548.m4586(90, c1450.m2963(3, zArr[i] ? 1 : 0).f11716);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c2548.m4586(91, sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                c2548.m4586(83, c1450.m2963(3, sArr[i]).f11716);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            c2548.m4586(91, cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                c2548.m4586(67, c1450.m2963(3, cArr[i]).f11716);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c2548.m4586(91, iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                c2548.m4586(73, c1450.m2963(3, iArr[i]).f11716);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c2548.m4586(91, jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                c2548.m4586(74, c1450.m2953(5, jArr[i]).f11716);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            c2548.m4586(91, fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                float f = fArr[i];
                c1450.getClass();
                c2548.m4586(70, c1450.m2963(4, Float.floatToRawIntBits(f)).f11716);
                i++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            C0029 c0029M2956 = c1450.m2956(obj);
            c2548.m4586(".s.IFJDCS".charAt(c0029M2956.f11717), c0029M2956.f11716);
            return;
        }
        double[] dArr = (double[]) obj;
        c2548.m4586(91, dArr.length);
        int length8 = dArr.length;
        while (i < length8) {
            double d = dArr[i];
            c1450.getClass();
            c2548.m4586(68, c1450.m2953(6, Double.doubleToRawLongBits(d)).f11716);
            i++;
        }
    }

    public C2552(C1450 c1450, boolean z, C2548 c2548, C2552 c2552) {
        this.f12614 = c1450;
        this.f12612 = z;
        this.f12608 = c2548;
        int i = c2548.f12556;
        this.f12609 = i == 0 ? -1 : i - 2;
        this.f12613 = c2552;
        if (c2552 != null) {
            c2552.f12611 = this;
        }
    }
}
