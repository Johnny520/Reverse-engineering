package p074f5;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import p025bc.AbstractC0255e;
import p025bc.C0257g;
import p046d6.C0712i;
import p046d6.C0715l;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p247qe.C3517a0;
import p247qe.C3542y;
import p302ud.C4322r;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f5.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1071g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3449a;

    /* JADX INFO: renamed from: b */
    public int f3450b;

    /* JADX INFO: renamed from: c */
    public int f3451c;

    /* JADX INFO: renamed from: d */
    public Object f3452d;

    /* JADX INFO: renamed from: e */
    public Object f3453e;

    /* JADX INFO: renamed from: f */
    public Object f3454f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1071g(int i9) {
        int i10;
        int i11;
        this.f3449a = 0;
        this.f3452d = new EnumC1070f[Opcodes.ACC_NATIVE];
        if (i9 >= 21) {
            this.f3450b = i9;
            if (i9 >= 19) {
                switch (i9) {
                    case 19:
                    case 20:
                        i11 = 7;
                        break;
                    case 21:
                        i11 = 39;
                        break;
                    case 22:
                        i11 = 45;
                        break;
                    case 23:
                        i11 = 64;
                        break;
                    case 24:
                    case 25:
                        i11 = 79;
                        break;
                    case 26:
                        i11 = 124;
                        break;
                    case 27:
                        i11 = 131;
                        break;
                    case 28:
                        i11 = 138;
                        break;
                    case 29:
                        i11 = Opcodes.TABLESWITCH;
                        break;
                    default:
                        i11 = Opcodes.GETSTATIC;
                        break;
                }
            } else {
                i11 = -1;
            }
            this.f3451c = i11;
        } else {
            this.f3450b = i9;
            this.f3451c = -1;
        }
        this.f3453e = new EnumMap(EnumC1070f.class);
        this.f3454f = new HashMap();
        int i12 = this.f3451c;
        i12 = i12 == -1 ? this.f3450b : i12;
        for (EnumC1070f enumC1070f : EnumC1070f.values()) {
            C0715l c0715l = this.f3451c != -1 ? enumC1070f.f3443h : enumC1070f.f3442g;
            Integer numValueOf = Integer.valueOf(i12);
            List list = c0715l.f2151a;
            int size = list.size() - 1;
            int i13 = 0;
            while (true) {
                if (i13 <= size) {
                    i10 = (i13 + size) >>> 1;
                    C0712i c0712i = (C0712i) list.get(i10);
                    if (!c0712i.m1885b(numValueOf)) {
                        int iCompareTo = c0712i.m1886c() ? numValueOf.compareTo(c0712i.f2143a) : numValueOf.compareTo(c0712i.f2144b);
                        if (iCompareTo > 0) {
                            i13 = i10 + 1;
                        } else if (iCompareTo < 0) {
                            size = i10 - 1;
                        }
                    }
                } else {
                    i10 = -1;
                }
            }
            Object obj = null;
            if (i10 != -1 && ((C0712i) list.get(i10)).m1885b(numValueOf)) {
                obj = c0715l.f2152b.get(i10);
            }
            Short sh2 = (Short) obj;
            if (sh2 != null) {
                boolean z9 = true;
                switch (enumC1070f.f3448m) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 37:
                        z9 = false;
                    case 34:
                    case 35:
                    case 36:
                        if (!z9) {
                            ((EnumC1070f[]) this.f3452d)[sh2.shortValue()] = enumC1070f;
                        }
                        ((EnumMap) this.f3453e).put(enumC1070f, sh2);
                        ((HashMap) this.f3454f).put(enumC1070f.f3444i.toLowerCase(), enumC1070f);
                        break;
                    default:
                        throw null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int m2698a(long j3) {
        int i9 = this.f3450b + 1;
        long[] jArr = (long[]) this.f3452d;
        int length = jArr.length;
        if (i9 > length) {
            int i10 = length * 2;
            long[] jArr2 = new long[i10];
            int[] iArr = new int[i10];
            AbstractC4165l.m8382q0(jArr, jArr2, 0, 0, jArr.length);
            AbstractC4165l.m8384s0((int[]) this.f3453e, iArr, 0, 0, 14);
            this.f3452d = jArr2;
            this.f3453e = iArr;
        }
        int i11 = this.f3450b;
        this.f3450b = i11 + 1;
        int length2 = ((int[]) this.f3454f).length;
        if (this.f3451c >= length2) {
            int i12 = length2 * 2;
            int[] iArr2 = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13 + 1;
                iArr2[i13] = i14;
                i13 = i14;
            }
            AbstractC4165l.m8384s0((int[]) this.f3454f, iArr2, 0, 0, 14);
            this.f3454f = iArr2;
        }
        int i15 = this.f3451c;
        int[] iArr3 = (int[]) this.f3454f;
        this.f3451c = iArr3[i15];
        long[] jArr3 = (long[]) this.f3452d;
        jArr3[i11] = j3;
        ((int[]) this.f3453e)[i11] = i15;
        iArr3[i15] = i11;
        while (i11 > 0) {
            int i16 = ((i11 + 1) >> 1) - 1;
            if (AbstractC1416l.m3828d(jArr3[i16], j3) <= 0) {
                break;
            }
            m2701d(i16, i11);
            i11 = i16;
        }
        return i15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public AbstractC3506j m2699b(AbstractC3508l abstractC3508l) {
        C3542y c3542y = (C3542y) ((IdentityHashMap) this.f3454f).get(abstractC3508l);
        return c3542y != null ? c3542y.f11523i : abstractC3508l.mo7375I();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m2700c(AbstractC3508l abstractC3508l) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f3454f;
        C3542y c3542y = (C3542y) identityHashMap.remove(abstractC3508l);
        if (c3542y != null) {
            final int i9 = c3542y.f11521g;
            identityHashMap.values().removeIf(new Predicate() { // from class: qe.b0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C3542y) obj).f11521g > i9;
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m2701d(int i9, int i10) {
        long[] jArr = (long[]) this.f3452d;
        int[] iArr = (int[]) this.f3453e;
        int[] iArr2 = (int[]) this.f3454f;
        long j3 = jArr[i9];
        jArr[i9] = jArr[i10];
        jArr[i10] = j3;
        int i11 = iArr[i9];
        int i12 = iArr[i10];
        iArr[i9] = i12;
        iArr[i10] = i11;
        iArr2[i12] = i9;
        iArr2[i11] = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f3449a) {
            case 1:
                return AbstractC0255e.m1022k("TypeUpdateInfo{", String.valueOf((C3517a0) this.f3453e), " ", String.valueOf((List) ((IdentityHashMap) this.f3454f).values().stream().sorted().collect(Collectors.toList())), "}");
            default:
                return super.toString();
        }
    }

    public C1071g(C4322r c4322r, C3517a0 c3517a0, C0257g c0257g) {
        this.f3449a = 1;
        this.f3454f = new IdentityHashMap();
        this.f3451c = 0;
        this.f3452d = c4322r;
        this.f3453e = c3517a0;
        this.f3450b = c4322r.f14414o * c0257g.f723I;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [w0.m.<clinit>():void] */
    public /* synthetic */ C1071g() {
        this.f3449a = 2;
    }
}
