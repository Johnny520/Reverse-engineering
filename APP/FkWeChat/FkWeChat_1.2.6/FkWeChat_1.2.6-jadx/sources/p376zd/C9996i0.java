package p376zd;

import java.util.List;
import java.util.RandomAccess;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5078f;

/* JADX INFO: renamed from: zd.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9996i0 extends AbstractC5078f implements RandomAccess {

    /* JADX INFO: renamed from: t */
    public static final a f33571t = new a(null);

    /* JADX INFO: renamed from: r */
    public final C10003m[] f33572r;

    /* JADX INFO: renamed from: s */
    public final int[] f33573s;

    public C9996i0(C10003m[] c10003mArr, int[] iArr) {
        this.f33572r = c10003mArr;
        this.f33573s = iArr;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f33572r.length;
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C10003m) {
            return m38744e((C10003m) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public /* bridge */ boolean m38744e(C10003m c10003m) {
        return super.contains(c10003m);
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C10003m) {
            return m38748q((C10003m) obj);
        }
        return -1;
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C10003m get(int i10) {
        return this.f33572r[i10];
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C10003m) {
            return m38749r((C10003m) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public final C10003m[] m38746o() {
        return this.f33572r;
    }

    /* JADX INFO: renamed from: p */
    public final int[] m38747p() {
        return this.f33573s;
    }

    /* JADX INFO: renamed from: q */
    public /* bridge */ int m38748q(C10003m c10003m) {
        return super.indexOf(c10003m);
    }

    /* JADX INFO: renamed from: r */
    public /* bridge */ int m38749r(C10003m c10003m) {
        return super.lastIndexOf(c10003m);
    }

    /* JADX INFO: renamed from: zd.i0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m38750b(a aVar, long j10, C9995i c9995i, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.m38751a(j10, c9995i, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        /* JADX INFO: renamed from: a */
        public final void m38751a(long j10, C9995i c9995i, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                C9987e.m38645a("Failed requirement.");
                return;
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((C10003m) list.get(i17)).m38765G() < i16) {
                    C9987e.m38645a("Failed requirement.");
                    return;
                }
            }
            C10003m c10003m = (C10003m) list.get(i11);
            C10003m c10003m2 = (C10003m) list.get(i12 - 1);
            if (i16 == c10003m.m38765G()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                C10003m c10003m3 = (C10003m) list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                c10003m = c10003m3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (c10003m.m38777j(i16) == c10003m2.m38777j(i16)) {
                int iMin = Math.min(c10003m.m38765G(), c10003m2.m38765G());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && c10003m.m38777j(i20) == c10003m2.m38777j(i20); i20++) {
                    i19++;
                }
                long jM38752c = j10 + m38752c(c9995i) + ((long) 2) + ((long) i19) + 1;
                c9995i.writeInt(-i19);
                c9995i.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    c9995i.writeInt(c10003m.m38777j(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 == ((C10003m) list.get(i13)).m38765G()) {
                        c9995i.writeInt(((Number) list2.get(i13)).intValue());
                        return;
                    } else {
                        C10010p0.m38820a("Check failed.");
                        return;
                    }
                }
                C9995i c9995i2 = new C9995i();
                c9995i.writeInt(((int) (m38752c(c9995i2) + jM38752c)) * (-1));
                m38751a(jM38752c, c9995i2, i21, list, i13, i12, list2);
                c9995i.mo38670A0(c9995i2);
                return;
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((C10003m) list.get(i23 - 1)).m38777j(i16) != ((C10003m) list.get(i23)).m38777j(i16)) {
                    i22++;
                }
            }
            long jM38752c2 = j10 + m38752c(c9995i) + ((long) 2) + ((long) (i22 * 2));
            c9995i.writeInt(i22);
            c9995i.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bM38777j = ((C10003m) list.get(i24)).m38777j(i16);
                if (i24 == i13 || bM38777j != ((C10003m) list.get(i24 - 1)).m38777j(i16)) {
                    c9995i.writeInt(bM38777j & 255);
                }
            }
            C9995i c9995i3 = new C9995i();
            while (i13 < i12) {
                byte bM38777j2 = ((C10003m) list.get(i13)).m38777j(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bM38777j2 != ((C10003m) list.get(i26)).m38777j(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((C10003m) list.get(i13)).m38765G()) {
                    c9995i.writeInt(((Number) list2.get(i13)).intValue());
                    j11 = jM38752c2;
                } else {
                    c9995i.writeInt(((int) (m38752c(c9995i3) + jM38752c2)) * (-1));
                    j11 = jM38752c2;
                    m38751a(j11, c9995i3, i16 + 1, list, i13, i15, list2);
                }
                jM38752c2 = j11;
                i13 = i15;
            }
            c9995i.mo38670A0(c9995i3);
        }

        /* JADX INFO: renamed from: c */
        public final long m38752c(C9995i c9995i) {
            return c9995i.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        
            continue;
         */
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p376zd.C9996i0 m38753d(p376zd.C10003m... r17) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p376zd.C9996i0.a.m38753d(zd.m[]):zd.i0");
        }

        public a() {
        }
    }

    public /* synthetic */ C9996i0(C10003m[] c10003mArr, int[] iArr, AbstractC1043k abstractC1043k) {
        this(c10003mArr, iArr);
    }
}
