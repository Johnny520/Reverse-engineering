package p227p4;

import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p311v4.C4453d0;
import p376z4.AbstractC6091e;

/* JADX INFO: renamed from: p4.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3297c extends AbstractC6091e implements Comparable {

    /* JADX INFO: renamed from: i */
    public static final C3297c f10478i = new C3297c(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.AbstractC6091e, p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return m6980p(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3297c c3297c) {
        if (this != c3297c) {
            int length = this.f24601h.length;
            int length2 = c3297c.f24601h.length;
            int iMin = Math.min(length, length2);
            for (int i9 = 0; i9 < iMin; i9++) {
                int iM6974a = ((C3295b) m10840l(i9)).compareTo((C3295b) c3297c.m10840l(i9));
                if (iM6974a != 0) {
                    return iM6974a;
                }
            }
            if (length < length2) {
                return -1;
            }
            if (length > length2) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m6980p(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(100);
        int length = this.f24601h.length;
        sb2.append(str);
        sb2.append(str2);
        sb2.append("catch ");
        for (int i9 = 0; i9 < length; i9++) {
            C3295b c3295b = (C3295b) m10840l(i9);
            if (i9 != 0) {
                sb2.append(",\n");
                sb2.append(str);
                sb2.append("  ");
            }
            if (i9 != length - 1) {
                sb2.append(c3295b.f10475g.f14784g.mo4901a());
            } else {
                int length2 = this.f24601h.length;
                if (length2 == 0 ? false : ((C3295b) m10840l(length2 - 1)).f10475g.equals(C4453d0.f14767j)) {
                    sb2.append("<any>");
                }
            }
            sb2.append(" -> ");
            int i10 = c3295b.f10476h;
            sb2.append(i10 == ((char) i10) ? AbstractC0000a.m46X0(i10) : AbstractC0000a.m48Y0(i10));
        }
        return sb2.toString();
    }
}
