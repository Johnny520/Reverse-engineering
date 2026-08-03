package p227p4;

import bsh.C0353j;
import java.util.ArrayList;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import p295u4.C4266p;
import p295u4.C4270t;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4470s;
import p311v4.AbstractC4471t;
import p311v4.C4453d0;
import p376z4.C6090d;

/* JADX INFO: renamed from: p4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3293a extends AbstractC3307l {

    /* JADX INFO: renamed from: f */
    public final C3301f f10466f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f10467g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4446a f10468h;

    /* JADX INFO: renamed from: i */
    public final int f10469i;

    /* JADX INFO: renamed from: j */
    public final int f10470j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3293a(C4270t c4270t, C3301f c3301f, ArrayList arrayList, AbstractC4446a abstractC4446a) {
        super(c4270t, C4266p.f13968i);
        if (c3301f == null) {
            C0353j.m1305c("user == null");
            throw null;
        }
        if (arrayList == null) {
            C0353j.m1305c("values == null");
            throw null;
        }
        if (arrayList.size() <= 0) {
            C2104o.m5294t("Illegal number of init values");
            throw null;
        }
        this.f10468h = abstractC4446a;
        if (abstractC4446a == C4453d0.f14778u || abstractC4446a == C4453d0.f14777t) {
            this.f10469i = 1;
        } else if (abstractC4446a == C4453d0.f14763A || abstractC4446a == C4453d0.f14779v) {
            this.f10469i = 2;
        } else if (abstractC4446a == C4453d0.f14783z || abstractC4446a == C4453d0.f14781x) {
            this.f10469i = 4;
        } else {
            if (abstractC4446a != C4453d0.f14782y && abstractC4446a != C4453d0.f14780w) {
                C2104o.m5294t("Unexpected constant type");
                throw null;
            }
            this.f10469i = 8;
        }
        this.f10466f = c3301f;
        this.f10467g = arrayList;
        this.f10470j = arrayList.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: a */
    public final String mo6968a() {
        StringBuilder sb2 = new StringBuilder(100);
        ArrayList arrayList = this.f10467g;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            sb2.append("\n    ");
            sb2.append(i9);
            sb2.append(": ");
            sb2.append(((AbstractC4446a) arrayList.get(i9)).mo4901a());
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: b */
    public final int mo6969b() {
        return (((this.f10470j * this.f10469i) + 1) / 2) + 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: g */
    public final String mo6970g() {
        int iM6989e = this.f10466f.m6989e();
        StringBuilder sb2 = new StringBuilder(100);
        ArrayList arrayList = this.f10467g;
        int size = arrayList.size();
        sb2.append("fill-array-data-payload // for fill-array-data @ ");
        sb2.append(AbstractC0000a.m46X0(iM6989e));
        for (int i9 = 0; i9 < size; i9++) {
            sb2.append("\n  ");
            sb2.append(i9);
            sb2.append(": ");
            sb2.append(((AbstractC4446a) arrayList.get(i9)).mo4901a());
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: k */
    public final AbstractC3303h mo6971k(C4266p c4266p) {
        return new C3293a(this.f10489c, this.f10466f, this.f10467g, this.f10468h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: l */
    public final void mo6972l(C6090d c6090d) {
        ArrayList arrayList = this.f10467g;
        int size = arrayList.size();
        c6090d.m10836l(768);
        int i9 = this.f10469i;
        c6090d.m10836l(i9);
        c6090d.m10835k(this.f10470j);
        char c10 = 2;
        if (i9 == 1) {
            for (int i10 = 0; i10 < size; i10++) {
                c6090d.m10834j((byte) ((AbstractC4470s) ((AbstractC4446a) arrayList.get(i10))).f14817g);
            }
        } else if (i9 == 2) {
            for (int i11 = 0; i11 < size; i11++) {
                c6090d.m10836l((short) ((AbstractC4470s) ((AbstractC4446a) arrayList.get(i11))).f14817g);
            }
        } else if (i9 == 4) {
            for (int i12 = 0; i12 < size; i12++) {
                c6090d.m10835k(((AbstractC4470s) ((AbstractC4446a) arrayList.get(i12))).f14817g);
            }
        } else if (i9 == 8) {
            int i13 = 0;
            while (i13 < size) {
                long j3 = ((AbstractC4471t) ((AbstractC4446a) arrayList.get(i13))).f14818g;
                int i14 = c6090d.f24596c;
                int i15 = i14 + 8;
                if (c6090d.f24594a) {
                    c6090d.m10831f(i15);
                } else if (i15 > c6090d.f24595b.length) {
                    C6090d.m10825g();
                    throw null;
                }
                int i16 = (int) j3;
                byte[] bArr = c6090d.f24595b;
                bArr[i14] = (byte) i16;
                char c11 = c10;
                bArr[i14 + 1] = (byte) (i16 >> 8);
                bArr[i14 + 2] = (byte) (i16 >> 16);
                bArr[i14 + 3] = (byte) (i16 >> 24);
                int i17 = (int) (j3 >> 32);
                bArr[i14 + 4] = (byte) i17;
                bArr[i14 + 5] = (byte) (i17 >> 8);
                bArr[i14 + 6] = (byte) (i17 >> 16);
                bArr[i14 + 7] = (byte) (i17 >> 24);
                c6090d.f24596c = i15;
                i13++;
                c10 = c11;
            }
        }
        if (i9 != 1 || size % 2 == 0) {
            return;
        }
        c6090d.m10834j(0);
    }
}
