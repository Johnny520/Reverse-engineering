package pe;

import java.util.ArrayList;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4305a;
import p302ud.C4322r;

/* JADX INFO: renamed from: pe.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3411b {

    /* JADX INFO: renamed from: a */
    public final C4322r f11025a;

    /* JADX INFO: renamed from: b */
    public final C4305a f11026b;

    /* JADX INFO: renamed from: c */
    public final C3515s[] f11027c;

    /* JADX INFO: renamed from: d */
    public final int[] f11028d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3411b(C4322r c4322r, C4305a c4305a, C3515s[] c3515sArr, int[] iArr) {
        this.f11025a = c4322r;
        this.f11026b = c4305a;
        this.f11027c = c3515sArr;
        this.f11028d = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C3515s m7191a(C3514r c3514r) {
        int i9 = c3514r.f11439l;
        int[] iArr = this.f11028d;
        int i10 = iArr[i9];
        iArr[i9] = i10 + 1;
        C4322r c4322r = this.f11025a;
        c4322r.getClass();
        C3515s c3515s = new C3515s(i9, i10, c3514r);
        if (c4322r.f14404D.isEmpty()) {
            c4322r.f14404D = new ArrayList();
        }
        c4322r.f14404D.add(c3515s);
        this.f11027c[i9] = c3515s;
        return c3515s;
    }
}
