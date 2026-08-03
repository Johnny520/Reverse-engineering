package p069f;

import bsh.C0353j;
import java.util.Iterator;
import p114hg.InterfaceC1711a;
import p136j8.C2104o;

/* JADX INFO: renamed from: f.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0922a implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public int f2883g;

    /* JADX INFO: renamed from: h */
    public int f2884h;

    /* JADX INFO: renamed from: i */
    public boolean f2885i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2886j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2887k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0922a(C0930e c0930e, int i9) {
        this(c0930e.f2912i);
        this.f2886j = i9;
        switch (i9) {
            case 1:
                this.f2887k = c0930e;
                this(c0930e.f2912i);
                break;
            default:
                this.f2887k = c0930e;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2884h < this.f2883g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object objM2280h;
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        int i9 = this.f2884h;
        switch (this.f2886j) {
            case 0:
                objM2280h = ((C0930e) this.f2887k).m2280h(i9);
                break;
            case 1:
                objM2280h = ((C0930e) this.f2887k).m2284l(i9);
                break;
            default:
                objM2280h = ((C0932f) this.f2887k).f2921h[i9];
                break;
        }
        this.f2884h++;
        this.f2885i = true;
        return objM2280h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2885i) {
            C2104o.m5276A("Call next() before removing an element.");
            return;
        }
        int i9 = this.f2884h - 1;
        this.f2884h = i9;
        switch (this.f2886j) {
            case 0:
                ((C0930e) this.f2887k).m2282j(i9);
                break;
            case 1:
                ((C0930e) this.f2887k).m2282j(i9);
                break;
            default:
                ((C0932f) this.f2887k).m2285a(i9);
                break;
        }
        this.f2883g--;
        this.f2885i = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0922a(C0932f c0932f) {
        this(c0932f.f2922i);
        this.f2886j = 2;
        this.f2887k = c0932f;
    }

    public C0922a(int i9) {
        this.f2883g = i9;
    }
}
