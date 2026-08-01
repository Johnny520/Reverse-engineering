package p073k;

import java.util.Iterator;

/* JADX INFO: renamed from: k.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0738d extends AbstractC0739e implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0737c f2498a;

    /* JADX INFO: renamed from: b */
    public boolean f2499b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0740f f2500c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0738d(C0740f c0740f) {
        this.f2500c = c0740f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p073k.AbstractC0739e
    /* JADX INFO: renamed from: a */
    public final void mo1390a(C0737c c0737c) {
        C0737c c0737c2 = this.f2498a;
        if (c0737c == c0737c2) {
            C0737c c0737c3 = c0737c2.f2497d;
            this.f2498a = c0737c3;
            this.f2499b = c0737c3 == null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2499b) {
            return this.f2500c.f2501a != null;
        }
        C0737c c0737c = this.f2498a;
        return (c0737c == null || c0737c.f2496c == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2499b) {
            this.f2499b = false;
            this.f2498a = this.f2500c.f2501a;
        } else {
            C0737c c0737c = this.f2498a;
            this.f2498a = c0737c != null ? c0737c.f2496c : null;
        }
        return this.f2498a;
    }
}
