package p257r7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p071f1.C1005h;
import p136j8.AbstractC2091b;
import p195n7.C2906e;
import p241q7.C3445b;
import p273s7.C3938g;
import p298u7.AbstractC4280c;
import p363y7.AbstractC5999a;
import p363y7.C6000b;
import p379z7.C6112h;
import p379z7.C6121q;

/* JADX INFO: renamed from: r7.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3729s extends AbstractC3728r implements Comparable {

    /* JADX INFO: renamed from: r */
    public static final CharsetDecoder f12102r = StandardCharsets.UTF_16LE.newDecoder();

    /* JADX INFO: renamed from: s */
    public static final C2906e f12103s = C2906e.f9385a;

    /* JADX INFO: renamed from: o */
    public boolean f12104o;

    /* JADX INFO: renamed from: p */
    public Object f12105p;

    /* JADX INFO: renamed from: q */
    public C3731u f12106q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3729s(boolean z9) {
        super(0);
        this.f12101m = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f12104o = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static byte[] m7740O(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length;
        byte[] bArr4 = new byte[(bArr != null ? bArr.length : 0) + bArr2.length + bArr3.length];
        if (bArr != null) {
            length = bArr.length;
            System.arraycopy(bArr, 0, bArr4, 0, length);
        } else {
            length = 0;
        }
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static int[] m7741T(byte[] bArr) {
        int i9 = ((bArr[1] & 255) << 8) | (bArr[0] & 255);
        if ((32768 & i9) == 0) {
            return new int[]{2, i9 * 2};
        }
        return new int[]{4, (((bArr[3] & 255) << 8) + (bArr[2] & 255) + ((i9 & 32767) << 16)) * 2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static int[] m7742U(byte[] bArr) {
        int i9 = (bArr[0] & 128) != 0 ? 2 : 1;
        int i10 = bArr[i9];
        int i11 = i9 + 1;
        if ((i10 & 128) != 0) {
            i10 = ((i10 & 127) << 8) + (bArr[i11] & 255);
            i11 = i9 + 2;
        }
        return new int[]{i11, i10};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: A */
    public final void mo5543A(int i9) {
        Object obj = this.f12105p;
        Iterator itM10866b = obj == null ? C6112h.f24664g : obj.getClass() == C6000b.class ? ((C6000b) obj).m10866b() : C6121q.m10883a(obj);
        while (itM10866b.hasNext()) {
            ((InterfaceC3723m) itM10866b.next()).mo633k(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        if (c3445b.available() < 4) {
            return;
        }
        m7715M(mo7722Q(c3445b), false);
        byte[] bArr = this.f12076k;
        c3445b.m7229e(bArr, bArr.length);
        mo7712L();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3728r
    /* JADX INFO: renamed from: N */
    public String mo7721N(byte[] bArr) {
        boolean z9 = this.f12104o;
        if (bArr != null) {
            int length = bArr.length;
            if (length >= 2) {
                for (int i9 = 2; i9 < length; i9++) {
                    if (bArr[i9] != 0) {
                        int[] iArrM7742U = z9 ? m7742U(bArr) : m7741T(bArr);
                        try {
                            return (z9 ? AbstractC3728r.f12100n : f12102r).decode(ByteBuffer.wrap(bArr, iArrM7742U[0], iArrM7742U[1])).toString();
                        } catch (CharacterCodingException unused) {
                            if (!z9) {
                                return new String(bArr, iArrM7742U[0], iArrM7742U[1], StandardCharsets.UTF_16LE);
                            }
                            int i10 = iArrM7742U[0];
                            int i11 = iArrM7742U[1];
                            try {
                                return f12103s.decode(ByteBuffer.wrap(bArr, i10, i11)).toString();
                            } catch (CharacterCodingException unused2) {
                                return new String(bArr, i10, i11, StandardCharsets.UTF_8);
                            }
                        }
                    }
                }
            }
        }
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m7743P(InterfaceC3723m interfaceC3723m) {
        if (interfaceC3723m != null) {
            this.f12105p = AbstractC5999a.m10738a(this.f12105p, interfaceC3723m);
            int i9 = this.f7657g;
            if (interfaceC3723m.get() != i9) {
                interfaceC3723m.mo633k(i9);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public int mo7722Q(C3445b c3445b) throws IOException {
        if (c3445b.available() < 4) {
            return c3445b.available();
        }
        byte[] bArr = new byte[4];
        c3445b.m7229e(bArr, 4);
        c3445b.m7228c(-4);
        int[] iArrM7742U = this.f12104o ? m7742U(bArr) : m7741T(bArr);
        return iArrM7742U[0] + iArrM7742U[1] + (this.f12104o ? 1 : 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public int mo7739R(AbstractC3729s abstractC3729s) {
        C3731u c3731u = this.f12106q;
        boolean z9 = (c3731u == null || c3731u.f12110m.f9926k.size() == 0) ? false : true;
        C3731u c3731u2 = abstractC3729s.f12106q;
        int iM10741d = AbstractC5999a.m10741d(z9, (c3731u2 == null || c3731u2.f12110m.f9926k.size() == 0) ? false : true) * (-1);
        return iM10741d != 0 ? iM10741d : AbstractC5999a.m10740c(this.f12101m, abstractC3729s.f12101m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: S */
    public int compareTo(AbstractC3729s abstractC3729s) {
        if (abstractC3729s == null) {
            return -1;
        }
        if (abstractC3729s == this) {
            return 0;
        }
        int iMo7739R = mo7739R(abstractC3729s);
        return iMo7739R != 0 ? iMo7739R : AbstractC5999a.m10739b(abstractC3729s.mo7737X(), mo7737X());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public byte[] mo7724V(String str) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (!this.f12104o) {
            if (str == null) {
                return null;
            }
            byte[] bytes = str.getBytes(StandardCharsets.UTF_16LE);
            int length = bytes.length / 2;
            if ((length & (-32768)) != 0) {
                int i9 = length & 255;
                int i10 = length - i9;
                int i11 = i10 & 65280;
                int i12 = i10 - i11;
                bArr = new byte[]{(byte) i, (byte) (((i12 & 65280) >> 8) | 128), (byte) i9, (byte) (i11 >> 8)};
                int i13 = i12 & 255;
            } else {
                bArr = new C3711a((short) length).f12076k;
            }
            return m7740O(bArr, bytes, new byte[2]);
        }
        byte[] bArr4 = new byte[2];
        if (str != null) {
            byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
            int length2 = bytes2.length;
            if ((65408 & length2) != 0) {
                int i14 = length2 & 255;
                byte[] bArr5 = {(byte) (i | 128), (byte) i, (byte) (((length2 - i14) >> 8) | 128), (byte) i14};
                int length3 = str.length();
                int i15 = length3 & 255;
                int i16 = (length3 - i15) >> 8;
                bArr3 = bArr5;
            } else {
                bArr3 = new C3711a((short) length2).f12076k;
                bArr3[1] = bArr3[0];
                bArr3[0] = (byte) str.length();
            }
            bArr2 = bytes2;
            bArr4 = bArr3;
        } else {
            bArr2 = new byte[0];
        }
        return m7740O(bArr4, bArr2, new byte[1]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public void mo7736W() {
        AbstractC4280c abstractC4280c = (AbstractC4280c) m5554v(AbstractC4280c.class);
        if (abstractC4280c != null) {
            abstractC4280c.m8599U();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public int mo7737X() {
        return AbstractC5999a.m10747j(this.f12105p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final String m7744Y() {
        String str = this.f12101m;
        if (str == null) {
            return null;
        }
        C3731u c3731u = this.f12106q;
        return c3731u == null ? str : c3731u.m7746Q(str, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public void mo7725Z(String str) {
        C3938g c3938g = (C3938g) m5554v(C3938g.class);
        if (c3938g != null) {
            AbstractC4280c abstractC4280c = (AbstractC4280c) c3938g.m5554v(AbstractC4280c.class);
            if (abstractC4280c != null) {
                c3938g.f12917p = 0;
                if (!abstractC4280c.f14199s) {
                    C1005h c1005h = abstractC4280c.f14198r;
                    String strM7744Y = m7744Y();
                    synchronized (c1005h.f3182i) {
                        try {
                            if (str != null || strM7744Y != null) {
                                HashMap map = (HashMap) c1005h.f3183j;
                                if (map == null) {
                                    int i9 = c1005h.f3181h;
                                    map = i9 == 0 ? new HashMap() : new HashMap(i9);
                                    c1005h.f3183j = map;
                                }
                                map.put(strM7744Y, c1005h.m2579m(c1005h.m2579m(map.remove(str), map.remove(strM7744Y)), this));
                            }
                        } finally {
                        }
                    }
                }
            }
            c3938g.f12918q = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final void m7745a0(InterfaceC3723m interfaceC3723m) {
        this.f12105p = AbstractC5999a.m10746i(this.f12105p, interfaceC3723m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String strM7744Y = m7744Y();
        if (strM7744Y == null) {
            return AbstractC2091b.m5163j(new StringBuilder(), this.f7657g, ": NULL");
        }
        AbstractC4280c abstractC4280c = (AbstractC4280c) m5554v(AbstractC4280c.class);
        if (abstractC4280c == null || abstractC4280c.f14199s) {
            return this.f7657g + ":" + strM7744Y;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7657g);
        sb2.append(": USED BY=");
        sb2.append(mo7737X());
        sb2.append("{");
        return AbstractC0921a.m2255r(sb2, strM7744Y, "}");
    }
}
