package p034c7;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p005a5.C0016a;
import p007a7.C0019b;
import p047d7.AbstractC0724g;
import p047d7.C0718a;
import p047d7.C0721d;
import p047d7.C0725h;
import p047d7.C0726i;
import p047d7.C0730m;
import p047d7.C0731n;
import p124i7.AbstractC1996f;
import p124i7.C1991a;
import p124i7.C1993c;
import p124i7.C1994d;
import p124i7.C1995e;
import p152k7.AbstractC2331a;
import p222p.AbstractC3199a;
import p241q7.C3445b;
import p257r7.C3713c;
import p363y7.AbstractC5999a;
import p379z7.C6108d;

/* JADX INFO: renamed from: c7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0405a implements Closeable {

    /* JADX INFO: renamed from: g */
    public final AbstractC1996f f1103g;

    /* JADX INFO: renamed from: h */
    public final C0406b[] f1104h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f1105i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0405a(AbstractC1996f abstractC1996f, int i9) throws IOException {
        C0731n c0731n;
        byte[] bArr;
        byte[] bArr2;
        this.f1105i = i9;
        this.f1103g = abstractC1996f;
        new ArrayList();
        C0726i c0726i = new C0726i(22, EnumC0411g.END_RECORD);
        byte[] bArrMo4932a = abstractC1996f.mo4932a();
        int length = bArrMo4932a.length - 22;
        while (length >= 0) {
            c0726i.m1929P(bArrMo4932a, length, 0, 22);
            if (c0726i.m1933U()) {
                break;
            } else {
                length--;
            }
        }
        if (!c0726i.m1933U()) {
            throw new C0407c("Failed to find end record");
        }
        if (AbstractC2331a.m5539s(c0726i.f12076k, 16) == -1) {
            C0725h c0725h = new C0725h(20, EnumC0411g.ZIP64_LOCATOR, 1);
            for (int i10 = length - 20; i10 >= 0; i10--) {
                c0725h.m1929P(bArrMo4932a, i10, 0, 20);
                if (c0725h.m1933U()) {
                    break;
                }
            }
            if (!c0725h.m1933U()) {
                throw new C0407c("Failed to find zip64 locator");
            }
            c0726i.f2165o = c0725h;
        }
        C0725h c0725h2 = c0726i.f2165o;
        int i11 = 8;
        if (c0725h2 != null) {
            EnumC0411g enumC0411g = EnumC0411g.ZIP64_RECORD;
            C0725h c0725h3 = new C0725h(56, enumC0411g, 2);
            c0725h3.mo1924S(abstractC1996f.mo4933b(AbstractC2331a.m5540t(c0725h2.f12076k, 8), 56L));
            if (!c0725h3.m1933U()) {
                StringBuilder sb2 = new StringBuilder("Invalid ");
                sb2.append(enumC0411g);
                sb2.append(": ");
                sb2.append(AbstractC5999a.m10748k(c0725h3.mo5551p() < 4 ? 0 : AbstractC2331a.m5539s(c0725h3.f12076k, 0), 8));
                throw new IOException(sb2.toString());
            }
            c0726i.f2166p = c0725h3;
        }
        C0725h c0725h4 = c0726i.f2166p;
        InputStream inputStreamMo4933b = abstractC1996f.mo4933b(c0725h4 != null ? AbstractC2331a.m5540t(c0725h4.f12076k, 48) : c0726i.m1927N(16), c0726i.m1927N(12));
        ArrayList<C0721d> arrayList = new ArrayList(c0726i.m1928O(10));
        C0721d c0721d = new C0721d();
        c0721d.mo1924S(inputStreamMo4933b);
        while (c0721d.m1933U()) {
            arrayList.add(c0721d);
            c0721d = new C0721d();
            c0721d.mo1924S(inputStreamMo4933b);
        }
        inputStreamMo4933b.close();
        long jM1927N = c0726i.m1927N(12);
        int iMo5551p = c0726i.mo5551p();
        C0725h c0725h5 = c0726i.f2165o;
        iMo5551p = c0725h5 != null ? iMo5551p + c0725h5.mo5551p() : iMo5551p;
        long jMo4934c = (abstractC1996f.mo4934c() - ((long) (c0726i.f2166p != null ? iMo5551p + c0726i.f2165o.mo5551p() : iMo5551p))) - jM1927N;
        long j3 = 24;
        long j4 = jMo4934c - j3;
        byte[] bArr3 = C0731n.f2174m;
        if (j4 < 0) {
            c0731n = null;
        } else {
            InputStream inputStreamMo4933b2 = abstractC1996f.mo4933b(j4, j3);
            c0731n = new C0731n(24);
            c0731n.m7715M(24, false);
            c0731n.m1929P(bArr3, 0, 8, 16);
            c0731n.mo1924S(inputStreamMo4933b2);
            inputStreamMo4933b2.close();
            if (AbstractC2331a.m5540t(c0731n.f12076k, 0) > 24) {
                byte[] bArr4 = c0731n.f12076k;
                int length2 = bArr4.length - 8;
                if (length2 <= 0) {
                    bArr = new byte[0];
                } else {
                    length2 = 16 <= length2 ? 16 : length2;
                    byte[] bArr5 = new byte[length2];
                    System.arraycopy(bArr4, 8, bArr5, 0, length2);
                    bArr = bArr5;
                }
                if (!C3713c.m7716N(bArr3, bArr)) {
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 2);
        InputStream inputStreamMo4933b3 = abstractC1996f.mo4933b(0L, abstractC1996f.mo4934c());
        int i12 = 0;
        for (C0721d c0721d2 : arrayList) {
            long jM5540t = c0721d2.m1913g0() ? AbstractC2331a.m5540t(c0721d2.f12076k, c0721d2.m1909b0() + c0721d2.f2159o + 4) : c0721d2.m1927N(42);
            inputStreamMo4933b3.reset();
            long jSkip = inputStreamMo4933b3.skip(jM5540t);
            int i13 = i11;
            C0730m c0730m = new C0730m(30, EnumC0411g.LOCAL_FILE, 6);
            c0730m.mo1924S(inputStreamMo4933b3);
            c0730m = c0730m.m1933U() ? c0730m : null;
            if (c0730m == null) {
                StringBuilder sbM6842o = AbstractC3199a.m6842o(jSkip, "Error reading LFH at ", ", for CEH = ");
                sbM6842o.append(c0721d2.m1908a0());
                throw new C0407c(sbM6842o.toString());
            }
            c0721d2.f2163s = jSkip + ((long) c0730m.mo5551p());
            c0730m.m1918n0(c0721d2);
            inputStreamMo4933b3.skip(c0730m.m1910c0() == 0 ? c0730m.mo1912e0() : c0730m.mo1905X());
            c0730m.m1923s0();
            C0725h c0725h6 = c0730m.f2172t;
            if (c0725h6 != null && c0725h6.mo1924S(inputStreamMo4933b3) != c0725h6.mo5551p()) {
                C0016a c0016a = c0730m.f2161q;
                int i14 = c0016a.f55h;
                AbstractC0724g abstractC0724g = (AbstractC0724g) c0016a.f56i;
                if (AbstractC2331a.m5538q(abstractC0724g.f12076k, i14, 3) || c0730m.f2172t != null) {
                    byte[] bArr6 = abstractC0724g.f12076k;
                    bArr6[i14] = (byte) (bArr6[i14] & 247);
                    c0730m.m1923s0();
                }
            }
            c0730m.m5546H(i12);
            arrayList2.add(c0730m);
            i12++;
            i11 = i13;
        }
        int i15 = i11;
        if (c0731n != null && AbstractC2331a.m5540t(c0731n.f12076k, 0) > 24) {
            byte[] bArr7 = c0731n.f12076k;
            int length3 = bArr7.length - 8;
            if (length3 <= 0) {
                bArr2 = new byte[0];
            } else {
                length3 = 16 <= length3 ? 16 : length3;
                byte[] bArr8 = new byte[length3];
                System.arraycopy(bArr7, i15, bArr8, 0, length3);
                bArr2 = bArr8;
            }
            if (C3713c.m7716N(bArr3, bArr2)) {
                long jM5540t2 = AbstractC2331a.m5540t(c0731n.f12076k, 0) + 8;
                C0725h c0725h7 = c0726i.f2166p;
                long jM5540t3 = c0725h7 != null ? AbstractC2331a.m5540t(c0725h7.f12076k, 48) : c0726i.m1927N(16);
                C0718a c0718a = new C0718a(true);
                c0718a.f2171o.m6541P(c0731n);
                c0718a.m5545G(new C3445b(abstractC1996f.mo4933b(jM5540t3 - jM5540t2, jM5540t2)));
            }
        }
        int size = arrayList2.size();
        C0406b[] c0406bArr = new C0406b[size];
        for (int i16 = 0; i16 < size; i16++) {
            C0730m c0730m2 = (C0730m) arrayList2.get(i16);
            if (c0730m2.f2173u != null) {
                c0406bArr[i16] = new C0406b(c0730m2);
            }
        }
        this.f1104h = c0406bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0410f m1364a() {
        AbstractC0409e c1991a;
        C0406b[] c0406bArr = this.f1104h;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0406bArr.length);
        C6108d c6108d = new C6108d(c0406bArr, c0406bArr.length, new C0019b(23));
        while (c6108d.hasNext()) {
            C0406b c0406b = (C0406b) c6108d.next();
            switch (this.f1105i) {
                case 0:
                    c1991a = new C1991a((C1994d) this.f1103g, c0406b);
                    c1991a.f1111d = c0406b.m1365a().f7657g;
                    break;
                default:
                    c1991a = new C1993c((C1995e) this.f1103g, c0406b);
                    c1991a.f1111d = c0406b.m1365a().f7657g;
                    break;
            }
            linkedHashMap.put(c1991a.m1368a(), c1991a);
        }
        return new C0410f(linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1103g.close();
    }
}
