package p350y1;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import p350y1.AbstractC9520h;

/* JADX INFO: renamed from: y1.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9521i {
    /* JADX INFO: renamed from: a */
    public static final void m37241a(char c10, ArrayList arrayList, float[] fArr, int i10) {
        int i11 = 0;
        switch (c10) {
            case 'A':
                int i12 = i10 - 7;
                for (int i13 = 0; i13 <= i12; i13 += 7) {
                    arrayList.add(new AbstractC9520h.a(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], Float.compare(fArr[i13 + 3], 0.0f) != 0, Float.compare(fArr[i13 + 4], 0.0f) != 0, fArr[i13 + 5], fArr[i13 + 6]));
                }
                return;
            case 'C':
                int i14 = i10 - 6;
                while (i11 <= i14) {
                    arrayList.add(new AbstractC9520h.c(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
                return;
            case 'H':
                int i15 = i10 - 1;
                while (i11 <= i15) {
                    arrayList.add(new AbstractC9520h.d(fArr[i11]));
                    i11++;
                }
                return;
            case 'L':
                int i16 = i10 - 2;
                while (i11 <= i16) {
                    arrayList.add(new AbstractC9520h.e(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'M':
                m37242b(arrayList, fArr, i10);
                return;
            case 'Q':
                int i17 = i10 - 4;
                while (i11 <= i17) {
                    arrayList.add(new AbstractC9520h.g(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case Opcodes.AASTORE /* 83 */:
                int i18 = i10 - 4;
                while (i11 <= i18) {
                    arrayList.add(new AbstractC9520h.h(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case Opcodes.BASTORE /* 84 */:
                int i19 = i10 - 2;
                while (i11 <= i19) {
                    arrayList.add(new AbstractC9520h.i(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'V':
                int i20 = i10 - 1;
                while (i11 <= i20) {
                    arrayList.add(new AbstractC9520h.s(fArr[i11]));
                    i11++;
                }
                return;
            case 'Z':
            case Opcodes.ISHR /* 122 */:
                arrayList.add(AbstractC9520h.b.f32414c);
                return;
            case Opcodes.LADD /* 97 */:
                int i21 = i10 - 7;
                for (int i22 = 0; i22 <= i21; i22 += 7) {
                    arrayList.add(new AbstractC9520h.j(fArr[i22], fArr[i22 + 1], fArr[i22 + 2], Float.compare(fArr[i22 + 3], 0.0f) != 0, Float.compare(fArr[i22 + 4], 0.0f) != 0, fArr[i22 + 5], fArr[i22 + 6]));
                }
                return;
            case 'c':
                int i23 = i10 - 6;
                while (i11 <= i23) {
                    arrayList.add(new AbstractC9520h.k(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
                return;
            case Opcodes.IMUL /* 104 */:
                int i24 = i10 - 1;
                while (i11 <= i24) {
                    arrayList.add(new AbstractC9520h.l(fArr[i11]));
                    i11++;
                }
                return;
            case Opcodes.IDIV /* 108 */:
                int i25 = i10 - 2;
                while (i11 <= i25) {
                    arrayList.add(new AbstractC9520h.m(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case Opcodes.LDIV /* 109 */:
                m37243c(arrayList, fArr, i10);
                return;
            case Opcodes.LREM /* 113 */:
                int i26 = i10 - 4;
                while (i11 <= i26) {
                    arrayList.add(new AbstractC9520h.o(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 's':
                int i27 = i10 - 4;
                while (i11 <= i27) {
                    arrayList.add(new AbstractC9520h.p(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case Opcodes.INEG /* 116 */:
                int i28 = i10 - 2;
                while (i11 <= i28) {
                    arrayList.add(new AbstractC9520h.q(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case Opcodes.FNEG /* 118 */:
                int i29 = i10 - 1;
                while (i11 <= i29) {
                    arrayList.add(new AbstractC9520h.r(fArr[i11]));
                    i11++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m37242b(List list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new AbstractC9520h.f(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new AbstractC9520h.e(fArr[i12], fArr[i12 + 1]));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m37243c(List list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new AbstractC9520h.n(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new AbstractC9520h.m(fArr[i12], fArr[i12 + 1]));
            }
        }
    }
}
