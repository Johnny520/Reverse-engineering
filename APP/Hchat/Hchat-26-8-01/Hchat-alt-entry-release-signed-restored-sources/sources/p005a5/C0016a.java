package p005a5;

import ac.C0058k;
import androidx.lifecycle.C0119x;
import com.alibaba.fastjson2.JSONB;
import gf.C1402a;
import gf.C1403b;
import gf.C1404c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.Consumer;
import p025bc.AbstractC0255e;
import p046d6.C0709f;
import p047d7.AbstractC0724g;
import p074f5.C1072h;
import p152k7.AbstractC2331a;
import p312v5.C4478a;
import p312v5.InterfaceC4479b;
import p376z4.C6093g;

/* JADX INFO: renamed from: a5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0016a implements InterfaceC4479b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f54g;

    /* JADX INFO: renamed from: h */
    public int f55h;

    /* JADX INFO: renamed from: i */
    public Object f56i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0016a(int i9, int i10) {
        this.f54g = i10;
        switch (i10) {
            case 11:
                this.f56i = new C6093g(i9);
                break;
            default:
                this.f56i = new LinkedHashMap();
                this.f55h = i9;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m198b(C0016a c0016a) {
        AbstractC0724g abstractC0724g = (AbstractC0724g) c0016a.f56i;
        if (c0016a.m203g()) {
            return;
        }
        int i9 = c0016a.f55h + 1;
        byte[] bArr = abstractC0724g.f12076k;
        bArr[i9] = (byte) ((bArr[i9] & 247) | 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p312v5.InterfaceC4479b
    /* JADX INFO: renamed from: a */
    public void mo105a() throws C4478a {
        C1072h c1072h = (C1072h) this.f56i;
        throw new C4478a(String.format("%d@%d", Integer.valueOf(c1072h.f3455h), Integer.valueOf(this.f55h)), c1072h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m199c(long j3) {
        if (m201e(j3)) {
            return;
        }
        int i9 = this.f55h;
        long[] jArrCopyOf = (long[]) this.f56i;
        if (i9 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i9 + 1, jArrCopyOf.length * 2));
            this.f56i = jArrCopyOf;
        }
        jArrCopyOf[i9] = j3;
        if (i9 >= this.f55h) {
            this.f55h = i9 + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m200d(int i9, int i10, int i11) {
        C6093g c6093g = (C6093g) this.f56i;
        int i12 = c6093g.f24610i;
        if (i9 >= i12) {
            for (int i13 = i9 - i12; i13 >= 0; i13--) {
                c6093g.m10844l(-1);
            }
        }
        c6093g.m10848q(i9, i10);
        int i14 = i10 + i11;
        if (this.f55h < i14) {
            this.f55h = i14;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public boolean m201e(long j3) {
        int i9 = this.f55h;
        for (int i10 = 0; i10 < i9; i10++) {
            if (((long[]) this.f56i)[i10] == j3) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public int m202f() {
        C0058k c0058k = (C0058k) this.f56i;
        c0058k.m336B(12);
        return ((ByteBuffer) c0058k.f177i).getInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public boolean m203g() {
        AbstractC0724g abstractC0724g = (AbstractC0724g) this.f56i;
        return AbstractC2331a.m5538q(abstractC0724g.f12076k, this.f55h + 1, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public int m204h(int i9) {
        int i10;
        int i11;
        int i12;
        C0119x c0119x = (C0119x) this.f56i;
        c0119x.getClass();
        int i13 = this.f55h;
        byte[] bArr = (byte[]) c0119x.f310h;
        if (i9 != 1) {
            if (i9 == 2) {
                i11 = bArr[i13] & 255;
                i12 = bArr[i13 + 1] << 8;
            } else if (i9 == 3) {
                i11 = (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8);
                i12 = bArr[i13 + 2] << 16;
            } else {
                if (i9 != 4) {
                    throw new C0709f(null, "Invalid size %d for sized int at offset 0x%x", Integer.valueOf(i9), Integer.valueOf(this.f55h));
                }
                i11 = (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
                i12 = bArr[i13 + 3] << 24;
            }
            i10 = i12 | i11;
        } else {
            i10 = bArr[i13];
        }
        this.f55h = i13 + i9;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public long m205i(int i9) {
        int i10;
        int i11;
        int i12;
        long j3;
        long j4;
        long j5;
        C0119x c0119x = (C0119x) this.f56i;
        c0119x.getClass();
        int i13 = this.f55h;
        byte[] bArr = (byte[]) c0119x.f310h;
        switch (i9) {
            case 1:
                i10 = bArr[i13];
                j3 = i10;
                this.f55h = i13 + i9;
                return j3;
            case 2:
                i11 = bArr[i13] & 255;
                i12 = bArr[i13 + 1] << 8;
                i10 = i12 | i11;
                j3 = i10;
                this.f55h = i13 + i9;
                return j3;
            case 3:
                i11 = (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8);
                i12 = bArr[i13 + 2] << 16;
                i10 = i12 | i11;
                j3 = i10;
                this.f55h = i13 + i9;
                return j3;
            case 4:
                j4 = (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
                j5 = ((long) bArr[i13 + 3]) << 24;
                j3 = j4 | j5;
                this.f55h = i13 + i9;
                return j3;
            case 5:
                j4 = ((long) ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16))) | ((255 & ((long) bArr[i13 + 3])) << 24);
                j5 = ((long) bArr[i13 + 4]) << 32;
                j3 = j4 | j5;
                this.f55h = i13 + i9;
                return j3;
            case 6:
                j3 = (((long) bArr[i13 + 5]) << 40) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((long) ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16))) | ((((long) bArr[i13 + 3]) & 255) << 24);
                this.f55h = i13 + i9;
                return j3;
            case 7:
                j3 = ((((long) bArr[i13 + 4]) & 255) << 32) | ((long) ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16))) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((255 & ((long) bArr[i13 + 5])) << 40) | (((long) bArr[i13 + 6]) << 48);
                this.f55h = i13 + i9;
                return j3;
            case 8:
                j4 = ((((long) bArr[i13 + 4]) & 255) << 32) | ((long) ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16))) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
                j5 = ((long) bArr[i13 + 7]) << 56;
                j3 = j4 | j5;
                this.f55h = i13 + i9;
                return j3;
            default:
                throw new C0709f(null, "Invalid size %d for sized long at offset 0x%x", Integer.valueOf(i9), Integer.valueOf(this.f55h));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public int m206j(int i9) {
        int i10;
        int i11;
        byte b10;
        C0119x c0119x = (C0119x) this.f56i;
        c0119x.getClass();
        int i12 = this.f55h;
        byte[] bArr = (byte[]) c0119x.f310h;
        if (i9 != 1) {
            if (i9 == 2) {
                i11 = (bArr[i12] & 255) << 16;
                b10 = bArr[i12 + 1];
            } else if (i9 == 3) {
                i11 = ((bArr[i12] & 255) << 8) | ((bArr[i12 + 1] & 255) << 16);
                b10 = bArr[i12 + 2];
            } else {
                if (i9 != 4) {
                    throw new C0709f(null, "Invalid size %d for sized, right extended int at offset 0x%x", Integer.valueOf(i9), Integer.valueOf(this.f55h));
                }
                i11 = (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
                b10 = bArr[i12 + 3];
            }
            i10 = (b10 << 24) | i11;
        } else {
            i10 = bArr[i12] << 24;
        }
        this.f55h = i12 + i9;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public long m207k(int i9) {
        long j3;
        long j4;
        byte b10;
        C0119x c0119x = (C0119x) this.f56i;
        c0119x.getClass();
        int i10 = this.f55h;
        byte[] bArr = (byte[]) c0119x.f310h;
        switch (i9) {
            case 1:
                j3 = ((long) bArr[i10]) << 56;
                this.f55h = i10 + i9;
                return j3;
            case 2:
                j4 = (((long) bArr[i10]) & 255) << 48;
                b10 = bArr[i10 + 1];
                j3 = j4 | (((long) b10) << 56);
                this.f55h = i10 + i9;
                return j3;
            case 3:
                j4 = ((((long) bArr[i10]) & 255) << 40) | ((255 & ((long) bArr[i10 + 1])) << 48);
                b10 = bArr[i10 + 2];
                j3 = j4 | (((long) b10) << 56);
                this.f55h = i10 + i9;
                return j3;
            case 4:
                j4 = ((((long) bArr[i10]) & 255) << 32) | ((((long) bArr[i10 + 1]) & 255) << 40) | ((255 & ((long) bArr[i10 + 2])) << 48);
                b10 = bArr[i10 + 3];
                j3 = j4 | (((long) b10) << 56);
                this.f55h = i10 + i9;
                return j3;
            case 5:
                j4 = ((((long) bArr[i10 + 1]) & 255) << 32) | ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((255 & ((long) bArr[i10 + 3])) << 48);
                b10 = bArr[i10 + 4];
                j3 = j4 | (((long) b10) << 56);
                this.f55h = i10 + i9;
                return j3;
            case 6:
                j4 = ((((long) bArr[i10 + 2]) & 255) << 32) | ((long) ((bArr[i10] & 255) << 16)) | ((((long) bArr[i10 + 1]) & 255) << 24) | ((((long) bArr[i10 + 3]) & 255) << 40) | ((255 & ((long) bArr[i10 + 4])) << 48);
                b10 = bArr[i10 + 5];
                j3 = j4 | (((long) b10) << 56);
                this.f55h = i10 + i9;
                return j3;
            case 7:
                j4 = ((((long) bArr[i10 + 3]) & 255) << 32) | ((long) (((bArr[i10] & 255) << 8) | ((bArr[i10 + 1] & 255) << 16))) | ((((long) bArr[i10 + 2]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 40) | ((255 & ((long) bArr[i10 + 5])) << 48);
                b10 = bArr[i10 + 6];
                j3 = j4 | (((long) b10) << 56);
                this.f55h = i10 + i9;
                return j3;
            case 8:
                j4 = ((((long) bArr[i10 + 4]) & 255) << 32) | ((long) ((bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((255 & ((long) bArr[i10 + 6])) << 48);
                b10 = bArr[i10 + 7];
                j3 = j4 | (((long) b10) << 56);
                this.f55h = i10 + i9;
                return j3;
            default:
                throw new C0709f(null, "Invalid size %d for sized, right extended long at offset 0x%x", Integer.valueOf(i9), Integer.valueOf(this.f55h));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public int m208l(int i9) {
        C0119x c0119x = (C0119x) this.f56i;
        c0119x.getClass();
        int i10 = this.f55h;
        byte[] bArr = (byte[]) c0119x.f310h;
        int i11 = 0;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        throw new C0709f(null, "Invalid size %d for sized uint at offset 0x%x", Integer.valueOf(i9), Integer.valueOf(this.f55h));
                    }
                    byte b10 = bArr[i10 + 3];
                    if (b10 < 0) {
                        throw new C0709f(null, "Encountered valid sized uint that is out of range at offset 0x%x", Integer.valueOf(i10));
                    }
                    i11 = b10 << 24;
                }
                i11 |= (bArr[i10 + 2] & 255) << 16;
            }
            i11 |= (bArr[i10 + 1] & 255) << 8;
        }
        int i12 = (bArr[i10] & 255) | i11;
        this.f55h = i10 + i9;
        return i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public int m209m() {
        int i9;
        C0119x c0119x = (C0119x) this.f56i;
        c0119x.getClass();
        int i10 = this.f55h;
        byte[] bArr = (byte[]) c0119x.f310h;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        int i12 = b10 & 255;
        if (i12 <= 127) {
            i9 = (i12 << 25) >> 25;
        } else {
            int i13 = i10 + 2;
            byte b11 = bArr[i11];
            int i14 = b11 & 255;
            int i15 = ((b11 & JSONB.Constants.BC_SYMBOL) << 7) | (b10 & JSONB.Constants.BC_SYMBOL);
            if (i14 <= 127) {
                i9 = (i15 << 18) >> 18;
            } else {
                int i16 = i10 + 3;
                byte b12 = bArr[i13];
                int i17 = b12 & 255;
                int i18 = i15 | ((b12 & JSONB.Constants.BC_SYMBOL) << 14);
                if (i17 <= 127) {
                    i9 = (i18 << 11) >> 11;
                } else {
                    i13 = i10 + 4;
                    byte b13 = bArr[i16];
                    int i19 = b13 & 255;
                    int i20 = i18 | ((b13 & JSONB.Constants.BC_SYMBOL) << 21);
                    if (i19 <= 127) {
                        i9 = (i20 << 4) >> 4;
                    } else {
                        i16 = i10 + 5;
                        int i21 = bArr[i13] & 255;
                        if (i21 > 127) {
                            throw new C0709f(null, "Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(i10));
                        }
                        i9 = (i21 << 28) | i20;
                    }
                }
                i11 = i16;
            }
            i11 = i13;
        }
        this.f55h = i11;
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public int m210n() {
        int i9 = this.f55h;
        int iM584O = ((C0119x) this.f56i).m584O(i9);
        this.f55h = i9 + 1;
        return iM584O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public int m211o(boolean z9) {
        C0119x c0119x = (C0119x) this.f56i;
        c0119x.getClass();
        int i9 = this.f55h;
        byte[] bArr = (byte[]) c0119x.f310h;
        int i10 = i9 + 1;
        byte b10 = bArr[i9];
        int i11 = b10 & 255;
        if (i11 > 127) {
            int i12 = i9 + 2;
            byte b11 = bArr[i10];
            int i13 = b11 & 255;
            int i14 = ((b11 & JSONB.Constants.BC_SYMBOL) << 7) | (b10 & JSONB.Constants.BC_SYMBOL);
            if (i13 > 127) {
                int i15 = i9 + 3;
                byte b12 = bArr[i12];
                int i16 = b12 & 255;
                i11 = ((b12 & JSONB.Constants.BC_SYMBOL) << 14) | i14;
                if (i16 > 127) {
                    i10 = i9 + 4;
                    byte b13 = bArr[i15];
                    int i17 = b13 & 255;
                    i11 |= (b13 & JSONB.Constants.BC_SYMBOL) << 21;
                    if (i17 > 127) {
                        i15 = i9 + 5;
                        byte b14 = bArr[i10];
                        if (b14 < 0) {
                            throw new C0709f(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(i9));
                        }
                        if ((b14 & 15) > 7 && !z9) {
                            throw new C0709f(null, "Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(i9));
                        }
                        i11 |= b14 << 28;
                        i10 = i15;
                    }
                } else {
                    i10 = i15;
                }
            } else {
                i11 = i14;
                i10 = i12;
            }
        }
        this.f55h = i10;
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void m212p(long j3) {
        int i9 = this.f55h;
        int i10 = 0;
        while (i10 < i9) {
            if (j3 == ((long[]) this.f56i)[i10]) {
                int i11 = this.f55h - 1;
                while (i10 < i11) {
                    long[] jArr = (long[]) this.f56i;
                    int i12 = i10 + 1;
                    jArr[i10] = jArr[i12];
                    i10 = i12;
                }
                this.f55h--;
                return;
            }
            i10++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[PHI: r3
  0x003d: PHI (r3v2 int) = (r3v1 int), (r3v4 int) binds: [B:5:0x0017, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m213q() {
        C0119x c0119x = (C0119x) this.f56i;
        c0119x.getClass();
        int i9 = this.f55h;
        byte[] bArr = (byte[]) c0119x.f310h;
        int i10 = i9 + 1;
        if (bArr[i9] < 0) {
            int i11 = i9 + 2;
            if (bArr[i10] < 0) {
                i10 = i9 + 3;
                if (bArr[i11] < 0) {
                    i11 = i9 + 4;
                    if (bArr[i10] < 0) {
                        i10 = i9 + 5;
                        if (bArr[i11] < 0) {
                            throw new C0709f(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(i9));
                        }
                    } else {
                        i10 = i11;
                    }
                }
            }
        }
        this.f55h = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void m214r(Consumer consumer) {
        C1404c c1404c;
        C0058k c0058k = (C0058k) this.f56i;
        C1402a c1402a = new C1402a(this, c0058k.m356g());
        c0058k.m336B(12);
        ByteBuffer byteBuffer = (ByteBuffer) c0058k.f177i;
        int i9 = byteBuffer.getInt();
        for (int i10 = 0; i10 < i9; i10 += c1402a.f4665g) {
            byteBuffer.position();
            int iM346L = c0058k.m346L();
            C1404c[] c1404cArr = C1404c.f4705e;
            int i11 = iM346L & 255;
            C1404c c1404c2 = (i11 != 0 || iM346L == 0) ? C1404c.f4705e[i11] : (C1404c) C1404c.f4706f.get(Integer.valueOf(iM346L));
            c1402a.f4666h = i10;
            c1402a.f4662d = c1404c2;
            c1402a.f4664f = iM346L;
            c1402a.f4672n = null;
            c1402a.f4663e = false;
            if (c1404c2 != null) {
                C1403b c1403b = c1404c2.f4709c;
                c1402a.f4668j = c1403b.f4703b;
                c1402a.f4665g = c1403b.f4702a;
            } else {
                c1402a.f4668j = 0;
                c1402a.f4665g = 1;
            }
            consumer.accept(c1402a);
            if (!c1402a.f4663e && (c1404c = c1402a.f4662d) != null) {
                C1403b c1403b2 = c1404c.f4709c;
                C0058k c0058k2 = (C0058k) c1402a.f4659a.f56i;
                switch (c1403b2.f4704c) {
                    case 19:
                        int iM346L2 = c0058k2.m346L();
                        c0058k2.m347M((iM346L2 * 4) + 4);
                        c1402a.f4665g = (iM346L2 * 2) + 4;
                        break;
                    case 20:
                        int iM346L3 = c0058k2.m346L();
                        c0058k2.m347M(iM346L3 * 8);
                        c1402a.f4665g = (iM346L3 * 4) + 2;
                        break;
                    case 21:
                    default:
                        int i12 = c1403b2.f4702a;
                        if (i12 != 1) {
                            c0058k2.m347M((i12 - 1) * 2);
                        }
                        break;
                    case 22:
                        int iM346L4 = c0058k2.m346L();
                        int i13 = ((ByteBuffer) c0058k2.f177i).getInt();
                        if (iM346L4 == 1) {
                            c0058k2.m347M((i13 % 2) + i13);
                        } else {
                            c0058k2.m347M(i13 * iM346L4);
                        }
                        c1402a.f4665g = (((i13 * iM346L4) + 1) / 2) + 4;
                        break;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f54g) {
            case 1:
                StringBuilder sb2 = new StringBuilder("Enc=");
                AbstractC0724g abstractC0724g = (AbstractC0724g) this.f56i;
                int i9 = this.f55h;
                sb2.append(AbstractC2331a.m5538q(abstractC0724g.f12076k, i9, 0));
                sb2.append(", Descriptor=");
                sb2.append(AbstractC2331a.m5538q(abstractC0724g.f12076k, i9, 3));
                sb2.append(", StrongEnc=");
                sb2.append(AbstractC2331a.m5538q(abstractC0724g.f12076k, i9, 6));
                sb2.append(", UTF8=");
                sb2.append(m203g());
                return sb2.toString();
            case 2:
                int i10 = this.f55h;
                return AbstractC0255e.m1022k("[", i10 != 1 ? i10 != 2 ? "null" : "FLAG" : "ENUM", ", ", String.valueOf((LinkedHashMap) this.f56i), "]");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0016a(int i9, int i10, Object obj) {
        this.f54g = i10;
        this.f56i = obj;
        this.f55h = i9;
    }

    public C0016a(C0058k c0058k) {
        this.f54g = 4;
        this.f56i = c0058k;
    }

    public C0016a() {
        this.f54g = 3;
        this.f55h = 1;
        this.f56i = Collections.singletonList(null);
    }

    public C0016a(ArrayList arrayList) {
        this.f54g = 3;
        this.f55h = 0;
        this.f56i = arrayList;
    }
}
