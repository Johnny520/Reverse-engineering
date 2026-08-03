package p023b8;

import java.util.Iterator;
import p379z7.C6106b;
import p379z7.C6107c;
import p379z7.C6116l;
import p379z7.InterfaceC6123s;

/* JADX INFO: renamed from: b8.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0213k extends AbstractC0212j implements Iterable, InterfaceC6123s {

    /* JADX INFO: renamed from: j */
    public static final C6106b f519j = C6107c.f24641o;

    /* JADX INFO: renamed from: h */
    public C6107c f520h = f519j;

    /* JADX INFO: renamed from: i */
    public int f521i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.InterfaceC6123s
    public final Object get(int i9) {
        AbstractC0212j abstractC0212j;
        synchronized (this) {
            abstractC0212j = (AbstractC0212j) this.f520h.f24642g[i9];
        }
        return abstractC0212j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p023b8.AbstractC0212j, java.lang.Iterable
    public final Iterator iterator() {
        return new C6116l(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m891m(AbstractC0212j abstractC0212j) {
        if (abstractC0212j == this) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f520h == f519j) {
                    this.f520h = new C6107c(0);
                }
                if (this.f520h.m10867c(abstractC0212j)) {
                    throw new IllegalArgumentException("Duplicate node: " + abstractC0212j);
                }
                this.f520h.add(abstractC0212j);
                if (this != abstractC0212j) {
                    abstractC0212j.f518g = this;
                }
                if (this.f520h.size() - this.f521i > 1000) {
                    this.f520h.mo10863m();
                    this.f521i = this.f520h.size();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract C0208f mo878n();

    /* JADX INFO: renamed from: o */
    public abstract C0210h mo879o();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.InterfaceC6122r
    public final int size() {
        return this.f520h.size();
    }
}
