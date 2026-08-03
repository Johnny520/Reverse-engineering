package p257r7;

import com.alibaba.fastjson2.JSONB;
import java.util.Objects;
import okhttp3.HttpUrl;
import p152k7.AbstractC2331a;
import p281t3.AbstractC4106c;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: r7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3715e implements InterfaceC3717g {

    /* JADX INFO: renamed from: g */
    public final AbstractC3712b f12079g;

    /* JADX INFO: renamed from: h */
    public final int f12080h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f12081i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3715e(AbstractC3712b abstractC3712b, int i9, int i10) {
        this.f12081i = i10;
        this.f12079g = abstractC3712b;
        this.f12080h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3715e c3715e = (C3715e) obj;
            if (this.f12080h == c3715e.f12080h && this.f12079g == c3715e.f12079g) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    public int get() {
        return AbstractC2331a.m5539s(this.f12079g.f12076k, this.f12080h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12080h), this.f12079g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    /* JADX INFO: renamed from: k */
    public void mo633k(int i9) {
        AbstractC2331a.m5534D(this.f12079g.f12076k, this.f12080h, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        byte b10;
        switch (this.f12081i) {
            case 0:
                return this.f12079g.f12076k.length - this.f12080h < 4 ? "NULL" : Integer.toString(get());
            default:
                AbstractC3712b abstractC3712b = this.f12079g;
                byte[] bArr = ((C3726p) abstractC3712b).f12076k;
                int i9 = this.f12080h;
                if (bArr[i9 + 3] == 0) {
                    int iM5539s = AbstractC2331a.m5539s(((C3726p) abstractC3712b).f12076k, i9);
                    return iM5539s != 0 ? AbstractC5999a.m10748k(iM5539s, 8) : HttpUrl.FRAGMENT_ENCODE_SET;
                }
                byte b11 = ((C3726p) abstractC3712b).f12076k[i9 + 3];
                StringBuilder sb2 = new StringBuilder();
                int i10 = b11 & 255;
                int[] iArrM8280c = AbstractC4106c.m8280c(2);
                int length = iArrM8280c.length;
                int i11 = 0;
                boolean z9 = false;
                for (int i12 = 0; i12 < length; i12++) {
                    int i13 = iArrM8280c[i12];
                    if (i13 == 1) {
                        b10 = JSONB.Constants.BC_INT32_SHORT_MIN;
                    } else {
                        if (i13 != 2) {
                            throw null;
                        }
                        b10 = 32;
                    }
                    int i14 = b10 & 255;
                    if ((b10 & b11 & 255) == i14) {
                        if (z9) {
                            sb2.append('|');
                        }
                        sb2.append(i13 != 1 ? i13 != 2 ? "null" : "SPEC_STAGED_API" : "SPEC_PUBLIC");
                        i11 |= i14;
                        z9 = true;
                    }
                }
                if (i11 != i10) {
                    if (z9) {
                        sb2.append('|');
                    }
                    sb2.append(AbstractC5999a.m10751n((byte) i10));
                }
                return sb2.toString();
        }
    }
}
