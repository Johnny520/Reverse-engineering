package p119Y;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p127Z2.AbstractC1784a;
import p136b0.C1846h;

/* JADX INFO: renamed from: Y.e */
/* JADX INFO: loaded from: classes.dex */
public class C1721e extends AbstractC1720d {

    /* JADX INFO: renamed from: g */
    public final C1846h f5964g;

    /* JADX INFO: renamed from: h */
    public Object f5965h;

    /* JADX INFO: renamed from: i */
    public boolean f5966i;

    /* JADX INFO: renamed from: j */
    public int f5967j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1721e(C1846h c1846h, AbstractC1729m[] abstractC1729mArr) {
        super(c1846h.f6250e, abstractC1729mArr);
        this.f5964g = c1846h;
        this.f5967j = c1846h.f6252g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3058c(int i5, C1728l c1728l, Object obj, int i6) {
        int i7 = i6 * 5;
        AbstractC1729m[] abstractC1729mArr = this.f5961d;
        if (i7 <= 30) {
            int iM3190D = 1 << AbstractC1784a.m3190D(i5, i7);
            if (c1728l.m3068h(iM3190D)) {
                abstractC1729mArr[i6].m3084a(c1728l.f5980d, Integer.bitCount(c1728l.f5977a) * 2, c1728l.m3066f(iM3190D));
                this.f5962e = i6;
                return;
            } else {
                int iM3079t = c1728l.m3079t(iM3190D);
                C1728l c1728lM3078s = c1728l.m3078s(iM3079t);
                abstractC1729mArr[i6].m3084a(c1728l.f5980d, Integer.bitCount(c1728l.f5977a) * 2, iM3079t);
                m3058c(i5, c1728lM3078s, obj, i6 + 1);
                return;
            }
        }
        AbstractC1729m abstractC1729m = abstractC1729mArr[i6];
        Object[] objArr = c1728l.f5980d;
        abstractC1729m.m3084a(objArr, objArr.length, 0);
        while (true) {
            AbstractC1729m abstractC1729m2 = abstractC1729mArr[i6];
            if (AbstractC1665j.m2981a(abstractC1729m2.f5981d[abstractC1729m2.f5983f], obj)) {
                this.f5962e = i6;
                return;
            } else {
                abstractC1729mArr[i6].f5983f += 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p119Y.AbstractC1720d, java.util.Iterator
    public final Object next() {
        if (this.f5964g.f6252g != this.f5967j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f5963f) {
            throw new NoSuchElementException();
        }
        AbstractC1729m abstractC1729m = this.f5961d[this.f5962e];
        this.f5965h = abstractC1729m.f5981d[abstractC1729m.f5983f];
        this.f5966i = true;
        return super.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p119Y.AbstractC1720d, java.util.Iterator
    public final void remove() {
        if (!this.f5966i) {
            throw new IllegalStateException();
        }
        boolean z5 = this.f5963f;
        C1846h c1846h = this.f5964g;
        if (!z5) {
            AbstractC1678w.m2997a(c1846h).remove(this.f5965h);
        } else {
            if (!z5) {
                throw new NoSuchElementException();
            }
            AbstractC1729m abstractC1729m = this.f5961d[this.f5962e];
            Object obj = abstractC1729m.f5981d[abstractC1729m.f5983f];
            AbstractC1678w.m2997a(c1846h).remove(this.f5965h);
            m3058c(obj != null ? obj.hashCode() : 0, c1846h.f6250e, obj, 0);
        }
        this.f5965h = null;
        this.f5966i = false;
        this.f5967j = c1846h.f6252g;
    }
}
