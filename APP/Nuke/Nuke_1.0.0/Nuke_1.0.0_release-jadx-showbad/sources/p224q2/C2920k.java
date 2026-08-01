package p224q2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.dartcv.nuke.BuildConfig;

/* JADX INFO: renamed from: q2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2920k implements Iterator {

    /* JADX INFO: renamed from: d */
    public C2922m f9219d;

    /* JADX INFO: renamed from: e */
    public C2922m f9220e = null;

    /* JADX INFO: renamed from: f */
    public int f9221f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2923n f9222g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9223h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2920k(C2923n c2923n, int i5) {
        this.f9223h = i5;
        this.f9222g = c2923n;
        this.f9219d = c2923n.f9241i.f9229g;
        this.f9221f = c2923n.f9240h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m5121a() {
        return m5122b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C2922m m5122b() {
        C2922m c2922m = this.f9219d;
        C2923n c2923n = this.f9222g;
        if (c2922m == c2923n.f9241i) {
            throw new NoSuchElementException();
        }
        if (c2923n.f9240h != this.f9221f) {
            throw new ConcurrentModificationException();
        }
        this.f9219d = c2922m.f9229g;
        this.f9220e = c2922m;
        return c2922m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9219d != this.f9222g.f9241i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public Object next() {
        switch (this.f9223h) {
            case BuildConfig.VERSION_CODE /* 1 */:
                return m5122b().f9231i;
            default:
                return m5121a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        C2922m c2922m = this.f9220e;
        if (c2922m == null) {
            throw new IllegalStateException();
        }
        C2923n c2923n = this.f9222g;
        c2923n.m5125c(c2922m, true);
        this.f9220e = null;
        this.f9221f = c2923n.f9240h;
    }
}
