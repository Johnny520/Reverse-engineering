package p257r7;

import java.nio.charset.StandardCharsets;
import p068eh.AbstractC0921a;
import p241q7.C3445b;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: r7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3714d extends AbstractC3729s {

    /* JADX INFO: renamed from: t */
    public final int f12078t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3714d(int i9) {
        super(true);
        this.f12078t = i9;
        m7715M(i9, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        r0 = r5;
     */
    @Override // p257r7.AbstractC3729s, p257r7.AbstractC3728r
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo7721N(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length < 2) {
            return null;
        }
        for (int i9 = 2; i9 < length; i9++) {
            if (bArr[i9] != 0) {
                int length2 = bArr.length;
                boolean z9 = false;
                int i10 = 0;
                int i11 = 1;
                while (true) {
                    if (i11 < length2) {
                        int i12 = i11 - 1;
                        byte b10 = bArr[i12];
                        byte b11 = bArr[i11];
                        if (b10 != 0 || b11 != 0) {
                            z9 = false;
                        } else if (z9) {
                            if (i10 < i12) {
                                break;
                            }
                        } else {
                            z9 = true;
                            i10 = i11;
                        }
                        i11++;
                    } else if (z9) {
                        break;
                    }
                }
                return new String(bArr, 0, length2, StandardCharsets.UTF_16LE);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3729s
    /* JADX INFO: renamed from: Q */
    public final int mo7722Q(C3445b c3445b) {
        return this.f12078t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // p257r7.AbstractC3729s, java.lang.Comparable
    /* JADX INFO: renamed from: S */
    public final int compareTo(AbstractC3729s abstractC3729s) {
        if (abstractC3729s == null) {
            return -1;
        }
        return AbstractC5999a.m10740c(this.f12101m, abstractC3729s.f12101m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3729s
    /* JADX INFO: renamed from: V */
    public final byte[] mo7724V(String str) {
        int i9 = this.f12078t;
        if (str == null) {
            return new byte[i9];
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_16LE);
        byte[] bArr = new byte[i9];
        int length = bytes.length;
        if (length <= i9) {
            i9 = length;
        }
        System.arraycopy(bytes, 0, bArr, 0, i9);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3729s
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FIXED-");
        sb2.append(this.f12078t);
        sb2.append(" {");
        return AbstractC0921a.m2255r(sb2, this.f12101m, "}");
    }

    @Override // p257r7.AbstractC3729s
    /* JADX INFO: renamed from: Z */
    public final void mo7725Z(String str) {
    }
}
