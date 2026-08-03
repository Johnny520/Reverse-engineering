package p150k5;

import androidx.lifecycle.C0119x;
import java.util.Iterator;
import p005a5.C0016a;
import p207o5.AbstractC3065t;
import p377z5.C6100b;

/* JADX INFO: renamed from: k5.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2259j extends AbstractC3065t {

    /* JADX INFO: renamed from: j */
    public int f7493j;

    /* JADX INFO: renamed from: k */
    public C6100b f7494k;

    /* JADX INFO: renamed from: l */
    public int f7495l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C2260k f7496m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2259j(C2260k c2260k, C0119x c0119x, int i9) {
        super(c0119x, i9);
        this.f7496m = c2260k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3065t
    /* JADX INFO: renamed from: a */
    public final Object mo5492a(C0016a c0016a) {
        C2275z c2275z;
        C2260k c2260k = this.f7496m;
        C2264o c2264o = c2260k.f7502l;
        while (true) {
            int i9 = this.f7493j + 1;
            this.f7493j = i9;
            if (i9 > c2264o.f7521t) {
                this.f9909g = 3;
                return null;
            }
            Iterator it = c2260k.f7500j;
            C0016a c0016a2 = c0016a;
            c2275z = new C2275z(c2264o.f7511j, c0016a2, c2264o, this.f7495l, c2260k.f7497g, c2260k.f7498h, it != null ? ((Integer) it.next()).intValue() : 7);
            C6100b c6100b = this.f7494k;
            C6100b c6100bM10858i1 = C6100b.m10858i1(c2275z);
            this.f7494k = c6100bM10858i1;
            this.f7495l = c2275z.f7577q;
            if (!c2260k.f7501k || c6100b == null || !c6100b.equals(c6100bM10858i1)) {
                break;
            }
            c0016a = c0016a2;
        }
        return c2275z;
    }
}
