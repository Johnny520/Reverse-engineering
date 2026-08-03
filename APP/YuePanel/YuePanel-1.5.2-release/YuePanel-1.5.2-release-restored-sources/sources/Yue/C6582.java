package Yue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6582 extends AbstractC2986<C3630> implements RandomAccess {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1017 f16900 = new C1017(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3630[] f16901;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final int[] f16902;

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۥ$ۥ */
    @InterfaceC7507({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"})
    public static final class C1017 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۡۤۥ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1017(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static /* synthetic */ void m3038(C1017 c1017, long j, C3600 c3600, int i, List list, int i2, int i3, List list2, int i4, Object obj) throws IOException {
            c1017.m3039((i4 & 1) != 0 ? 0L : j, c3600, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m3039(long j, C3600 c3600, int i, List<? extends C3630> list, int i2, int i3, List<Integer> list2) throws IOException {
            int i4;
            int i5;
            int i6;
            int i7;
            C3600 c36002;
            int i8 = i;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (list.get(i9).m9852() < i8) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            C3630 c3630 = list.get(i2);
            C3630 c36302 = list.get(i3 - 1);
            int i10 = -1;
            if (i8 == c3630.m9852()) {
                int iIntValue = list2.get(i2).intValue();
                int i11 = i2 + 1;
                C3630 c36303 = list.get(i11);
                i4 = i11;
                i5 = iIntValue;
                c3630 = c36303;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (c3630.m9823(i8) == c36302.m9823(i8)) {
                int iMin = Math.min(c3630.m9852(), c36302.m9852());
                int i12 = 0;
                for (int i13 = i8; i13 < iMin && c3630.m9823(i13) == c36302.m9823(i13); i13++) {
                    i12++;
                }
                long jM20907 = j + m20907(c3600) + ((long) 2) + ((long) i12) + 1;
                c3600.writeInt(-i12);
                c3600.writeInt(i5);
                int i14 = i12 + i8;
                while (i8 < i14) {
                    c3600.writeInt(c3630.m9823(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i14 != list.get(i4).m9852()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    c3600.writeInt(list2.get(i4).intValue());
                    return;
                } else {
                    C3600 c36003 = new C3600();
                    c3600.writeInt(((int) (m20907(c36003) + jM20907)) * (-1));
                    m3039(jM20907, c36003, i14, list, i4, i3, list2);
                    c3600.mo9610(c36003);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i4 + 1; i16 < i3; i16++) {
                if (list.get(i16 - 1).m9823(i8) != list.get(i16).m9823(i8)) {
                    i15++;
                }
            }
            long jM209072 = j + m20907(c3600) + ((long) 2) + ((long) (i15 * 2));
            c3600.writeInt(i15);
            c3600.writeInt(i5);
            for (int i17 = i4; i17 < i3; i17++) {
                byte bM9823 = list.get(i17).m9823(i8);
                if (i17 == i4 || bM9823 != list.get(i17 - 1).m9823(i8)) {
                    c3600.writeInt(bM9823 & 255);
                }
            }
            C3600 c36004 = new C3600();
            while (i4 < i3) {
                byte bM98232 = list.get(i4).m9823(i8);
                int i18 = i4 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (bM98232 != list.get(i19).m9823(i8)) {
                            i6 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i6 && i8 + 1 == list.get(i4).m9852()) {
                    c3600.writeInt(list2.get(i4).intValue());
                    i7 = i6;
                    c36002 = c36004;
                } else {
                    c3600.writeInt(((int) (jM209072 + m20907(c36004))) * i10);
                    i7 = i6;
                    c36002 = c36004;
                    m3039(jM209072, c36004, i8 + 1, list, i4, i6, list2);
                }
                c36004 = c36002;
                i4 = i7;
                i10 = -1;
            }
            c3600.mo9610(c36004);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long m20907(C3600 c3600) {
            return c3600.m9684() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        
            continue;
         */
        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C6582 m20908(@InterfaceC6399 C3630... c3630Arr) throws IOException {
            C5499.m17103(c3630Arr, "byteStrings");
            C4335 c4335 = null;
            int i = 0;
            if (c3630Arr.length == 0) {
                return new C6582(new C3630[0], new int[]{0, -1}, c4335);
            }
            List listM8936 = C3411.m8936(c3630Arr);
            C3884.m10767(listM8936);
            ArrayList arrayList = new ArrayList(c3630Arr.length);
            for (C3630 c3630 : c3630Arr) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listM10746 = C3880.m10746(Arrays.copyOf(numArr, numArr.length));
            int length = c3630Arr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                listM10746.set(C3880.m10728(listM8936, c3630Arr[i2], 0, 0, 6, null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((C3630) listM8936.get(0)).m9852() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i4 = 0;
            while (i4 < listM8936.size()) {
                C3630 c36302 = (C3630) listM8936.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < listM8936.size()) {
                    C3630 c36303 = (C3630) listM8936.get(i6);
                    if (c36303.m9853(c36302)) {
                        if (c36303.m9852() == c36302.m9852()) {
                            throw new IllegalArgumentException(("duplicate option: " + c36303).toString());
                        }
                        if (((Number) listM10746.get(i6)).intValue() > ((Number) listM10746.get(i4)).intValue()) {
                            listM8936.remove(i6);
                            listM10746.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                }
                i4 = i5;
            }
            C3600 c3600 = new C3600();
            m3038(this, 0L, c3600, 0, listM8936, 0, 0, listM10746, 53, null);
            int[] iArr = new int[(int) m20907(c3600)];
            while (!c3600.mo9622()) {
                iArr[i] = c3600.readInt();
                i++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(c3630Arr, c3630Arr.length);
            C5499.m17102(objArrCopyOf, "copyOf(this, size)");
            return new C6582((C3630[]) objArrCopyOf, iArr, c4335);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1017() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥۣ۟ۥۤ[]), (r2v0 int[]) A[MD:(Yue.ۥۣ۟ۥۤ[], int[]):void (m)] (LINE:1) call: Yue.ۥۣۡۤۥ.<init>(Yue.ۥۣ۟ۥۤ[], int[]):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C6582(C3630[] c3630Arr, int[] iArr, C4335 c4335) {
        this(c3630Arr, iArr);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C6582 m20901(@InterfaceC6399 C3630... c3630Arr) {
        return f16900.m20908(c3630Arr);
    }

    @Override // Yue.AbstractC2979, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C3630) {
            return m3037((C3630) obj);
        }
        return false;
    }

    @Override // Yue.AbstractC2986, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C3630) {
            return m20905((C3630) obj);
        }
        return -1;
    }

    @Override // Yue.AbstractC2986, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C3630) {
            return m20906((C3630) obj);
        }
        return -1;
    }

    @Override // Yue.AbstractC2986, Yue.AbstractC2979
    /* JADX INFO: renamed from: ۥ */
    public int mo41() {
        return this.f16901.length;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ boolean m3037(C3630 c3630) {
        return super.contains(c3630);
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // Yue.AbstractC2986, java.util.List
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3630 get(int i) {
        return this.f16901[i];
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C3630[] m20903() {
        return this.f16901;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int[] m20904() {
        return this.f16902;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public /* bridge */ int m20905(C3630 c3630) {
        return super.indexOf(c3630);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public /* bridge */ int m20906(C3630 c3630) {
        return super.lastIndexOf(c3630);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6582(C3630[] c3630Arr, int[] iArr) {
        this.f16901 = c3630Arr;
        this.f16902 = iArr;
    }
}
