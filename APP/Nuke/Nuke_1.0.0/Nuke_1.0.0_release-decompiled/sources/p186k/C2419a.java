package p186k;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.dartcv.nuke.BuildConfig;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2419a implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public int f7824d;

    /* JADX INFO: renamed from: e */
    public int f7825e;

    /* JADX INFO: renamed from: f */
    public boolean f7826f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7827g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f7828h;

    public C2419a(int i5) {
        this.f7824d = i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7825e < this.f7824d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM4304f;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f7825e;
        switch (this.f7827g) {
            case 0:
                objM4304f = ((C2423e) this.f7828h).m4304f(i5);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                objM4304f = ((C2423e) this.f7828h).m4308j(i5);
                break;
            default:
                objM4304f = ((C2424f) this.f7828h).f7839e[i5];
                break;
        }
        this.f7825e++;
        this.f7826f = true;
        return objM4304f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7826f) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i5 = this.f7825e - 1;
        this.f7825e = i5;
        switch (this.f7827g) {
            case 0:
                ((C2423e) this.f7828h).mo4306h(i5);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((C2423e) this.f7828h).mo4306h(i5);
                break;
            default:
                ((C2424f) this.f7828h).m4316a(i5);
                break;
        }
        this.f7824d--;
        this.f7826f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2419a(C2424f c2424f) {
        this(c2424f.f7840f);
        this.f7827g = 2;
        this.f7828h = c2424f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2419a(C2423e c2423e, int i5) {
        this(c2423e.f7820f);
        this.f7827g = i5;
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f7828h = c2423e;
                this(c2423e.f7820f);
                break;
            default:
                this.f7828h = c2423e;
                break;
        }
    }
}
