package p121i4;

import bsh.C0353j;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p376z4.C6093g;
import p376z4.InterfaceC6094h;

/* JADX INFO: renamed from: i4.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1963d implements InterfaceC6094h {

    /* JADX INFO: renamed from: a */
    public final int f6669a;

    /* JADX INFO: renamed from: b */
    public final int f6670b;

    /* JADX INFO: renamed from: c */
    public final int f6671c;

    /* JADX INFO: renamed from: d */
    public final C6093g f6672d;

    /* JADX INFO: renamed from: e */
    public final C1966g f6673e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1963d(int i9, int i10, int i11, C6093g c6093g, C1966g c1966g) {
        if (i9 < 0) {
            C2104o.m5294t("label < 0");
            throw null;
        }
        if (i10 < 0) {
            C2104o.m5294t("start < 0");
            throw null;
        }
        if (i11 <= i10) {
            C2104o.m5294t("end <= start");
            throw null;
        }
        int i12 = c6093g.f24610i;
        for (int i13 = 0; i13 < i12; i13++) {
            if (c6093g.m10846n(i13) < 0) {
                StringBuilder sbM2257t = AbstractC0921a.m2257t(i13, "successors[", "] == ");
                sbM2257t.append(c6093g.m10846n(i13));
                throw new IllegalArgumentException(sbM2257t.toString());
            }
        }
        if (c1966g == null) {
            C0353j.m1305c("catches == null");
            throw null;
        }
        this.f6669a = i9;
        this.f6670b = i10;
        this.f6671c = i11;
        this.f6672d = c6093g;
        this.f6673e = c1966g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6094h
    /* JADX INFO: renamed from: a */
    public final int mo4866a() {
        return this.f6669a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "{" + AbstractC0000a.m46X0(this.f6669a) + ": " + AbstractC0000a.m46X0(this.f6670b) + ".." + AbstractC0000a.m46X0(this.f6671c) + '}';
    }
}
