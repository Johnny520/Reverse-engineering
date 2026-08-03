package p141jf;

import ac.AbstractC0063p;
import ac.C0058k;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import mc.InterfaceC2823a;
import p068eh.AbstractC0921a;
import p084ff.C1219e;
import sc.InterfaceC3952a;

/* JADX INFO: renamed from: jf.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2132h implements InterfaceC2823a, InterfaceC3952a {

    /* JADX INFO: renamed from: a */
    public int f7114a;

    /* JADX INFO: renamed from: b */
    public String f7115b;

    /* JADX INFO: renamed from: c */
    public String f7116c;

    /* JADX INFO: renamed from: d */
    public String f7117d;

    /* JADX INFO: renamed from: e */
    public List f7118e;

    /* JADX INFO: renamed from: f */
    public int f7119f;

    /* JADX INFO: renamed from: g */
    public C0058k f7120g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5355a() {
        List listM344J;
        C0058k c0058k = this.f7120g;
        if (c0058k != null) {
            int i9 = this.f7119f;
            C2129e c2129e = ((C1219e) c0058k.f178j).f4087d;
            c0058k.m351a((i9 * 8) + c2129e.f7103g);
            int iM346L = c0058k.m346L();
            int iM346L2 = c0058k.m346L();
            ByteBuffer byteBuffer = (ByteBuffer) c0058k.f177i;
            int i10 = byteBuffer.getInt();
            c0058k.m351a((iM346L2 * 12) + c2129e.f7102f);
            c0058k.m347M(4);
            int i11 = byteBuffer.getInt();
            int i12 = byteBuffer.getInt();
            if (i12 == 0) {
                listM344J = Collections.EMPTY_LIST;
            } else {
                c0058k.m351a(i12);
                listM344J = c0058k.m344J();
            }
            this.f7116c = c0058k.m373y(iM346L);
            this.f7115b = c0058k.m371v(i10);
            this.f7117d = c0058k.m373y(i11);
            this.f7118e = listM344J;
            this.f7120g = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mc.InterfaceC2823a
    /* JADX INFO: renamed from: c */
    public final List mo5353c() {
        return this.f7118e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mc.InterfaceC2823a
    /* JADX INFO: renamed from: e */
    public final String mo5354e() {
        return this.f7117d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.f7115b;
        if (str == null) {
            return Integer.toHexString(this.f7114a);
        }
        String str2 = this.f7116c;
        String strM394D = AbstractC0063p.m394D(this.f7118e);
        String str3 = this.f7117d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("->");
        sb2.append(str);
        sb2.append("(");
        sb2.append(strM394D);
        return AbstractC0921a.m2255r(sb2, ")", str3);
    }
}
