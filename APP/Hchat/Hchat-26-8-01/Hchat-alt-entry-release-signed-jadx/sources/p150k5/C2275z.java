package p150k5;

import ac.C0058k;
import androidx.lifecycle.C0119x;
import java.util.Collections;
import java.util.List;
import p005a5.C0016a;
import p122i5.AbstractC1987b;
import p207o5.InterfaceC3048c;

/* JADX INFO: renamed from: k5.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2275z extends AbstractC1987b {

    /* JADX INFO: renamed from: j */
    public final C2270u f7570j;

    /* JADX INFO: renamed from: k */
    public final C2264o f7571k;

    /* JADX INFO: renamed from: l */
    public final int f7572l;

    /* JADX INFO: renamed from: m */
    public final int f7573m;

    /* JADX INFO: renamed from: n */
    public final int f7574n;

    /* JADX INFO: renamed from: o */
    public final int f7575o;

    /* JADX INFO: renamed from: p */
    public final int f7576p;

    /* JADX INFO: renamed from: q */
    public final int f7577q;

    /* JADX INFO: renamed from: r */
    public int f7578r;

    /* JADX INFO: renamed from: s */
    public int f7579s;

    /* JADX INFO: renamed from: t */
    public int f7580t = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2275z(C2270u c2270u, C0016a c0016a, C2264o c2264o, int i9, InterfaceC3048c interfaceC3048c, InterfaceC3048c interfaceC3048c2, int i10) {
        this.f7570j = c2270u;
        this.f7571k = c2264o;
        int iM211o = c0016a.m211o(true) + i9;
        this.f7577q = iM211o;
        this.f7572l = c0016a.m211o(false);
        this.f7573m = c0016a.m211o(false);
        this.f7576p = i10;
        this.f7575o = interfaceC3048c.seekTo(iM211o);
        this.f7574n = interfaceC3048c2.seekTo(iM211o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    /* JADX INFO: renamed from: f1 */
    public final String mo4929f1() {
        return this.f7571k.getType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    /* JADX INFO: renamed from: g1 */
    public final List mo4930g1() {
        int i9 = this.f7580t;
        C2270u c2270u = this.f7570j;
        if (i9 == -1) {
            C0119x c0119x = c2270u.f7531a;
            if (this.f7579s == 0) {
                if (this.f7578r == 0) {
                    this.f7578r = c2270u.f7551u.m5519b(this.f7577q);
                }
                this.f7579s = c2270u.f7552v.m5519b(c0119x.m585P(this.f7578r + 2));
            }
            this.f7580t = c0119x.m583N(this.f7579s + 8);
        }
        int i10 = this.f7580t;
        if (i10 <= 0) {
            return Collections.EMPTY_LIST;
        }
        return new C2274y(this, i10 + 4, c2270u.f7532b.m583N(i10), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    public final String getName() {
        C2270u c2270u = this.f7570j;
        C2268s c2268s = c2270u.f7548r;
        C0119x c0119x = c2270u.f7531a;
        if (this.f7578r == 0) {
            this.f7578r = c2270u.f7551u.m5519b(this.f7577q);
        }
        return c2268s.m5521b(c0119x.m583N(this.f7578r + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    /* JADX INFO: renamed from: h1 */
    public final String mo4931h1() {
        C2270u c2270u = this.f7570j;
        C2268s c2268s = c2270u.f7549s;
        C0119x c0119x = c2270u.f7531a;
        if (this.f7579s == 0) {
            if (this.f7578r == 0) {
                this.f7578r = c2270u.f7551u.m5519b(this.f7577q);
            }
            this.f7579s = c2270u.f7552v.m5519b(c0119x.m585P(this.f7578r + 2));
        }
        return c2268s.m5521b(c0119x.m583N(this.f7579s + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public final C0058k m5527i1() {
        int i9 = this.f7573m;
        if (i9 > 0) {
            return new C0058k(this.f7570j, this, i9);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j1 */
    public final List m5528j1() {
        if (this.f7580t == -1) {
            C2270u c2270u = this.f7570j;
            C0119x c0119x = c2270u.f7531a;
            if (this.f7579s == 0) {
                if (this.f7578r == 0) {
                    this.f7578r = c2270u.f7551u.m5519b(this.f7577q);
                }
                this.f7579s = c2270u.f7552v.m5519b(c0119x.m585P(this.f7578r + 2));
            }
            this.f7580t = c0119x.m583N(this.f7579s + 8);
        }
        return this.f7580t > 0 ? new C2273x(this, mo4930g1()) : Collections.EMPTY_LIST;
    }
}
