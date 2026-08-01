package p042W;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import p037T.AbstractC0264o;
import p037T.C0263n;
import p037T.C0266q;
import p037T.C0267r;
import p037T.C0268s;
import p051b0.C0494c;

/* JADX INFO: renamed from: W.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0338j extends C0494c {

    /* JADX INFO: renamed from: p */
    public static final C0337i f751p = new C0337i();

    /* JADX INFO: renamed from: q */
    public static final C0268s f752q = new C0268s("closed");

    /* JADX INFO: renamed from: m */
    public final ArrayList f753m;

    /* JADX INFO: renamed from: n */
    public String f754n;

    /* JADX INFO: renamed from: o */
    public AbstractC0264o f755o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0338j() {
        super(f751p);
        this.f753m = new ArrayList();
        this.f755o = C0266q.f636a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: b */
    public final void mo586b() {
        C0263n c0263n = new C0263n();
        m599t(c0263n);
        this.f753m.add(c0263n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: c */
    public final void mo587c() {
        C0267r c0267r = new C0267r();
        m599t(c0267r);
        this.f753m.add(c0267r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f753m;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f752q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: e */
    public final void mo588e() {
        ArrayList arrayList = this.f753m;
        if (arrayList.isEmpty() || this.f754n != null) {
            throw new IllegalStateException();
        }
        if (!(m598s() instanceof C0263n)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: f */
    public final void mo589f() {
        ArrayList arrayList = this.f753m;
        if (arrayList.isEmpty() || this.f754n != null) {
            throw new IllegalStateException();
        }
        if (!(m598s() instanceof C0267r)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: g */
    public final void mo590g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f753m.isEmpty() || this.f754n != null) {
            throw new IllegalStateException();
        }
        if (!(m598s() instanceof C0267r)) {
            throw new IllegalStateException();
        }
        this.f754n = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: i */
    public final C0494c mo591i() {
        m599t(C0266q.f636a);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: l */
    public final void mo592l(double d2) {
        if (this.f1569f || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            m599t(new C0268s(Double.valueOf(d2)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: m */
    public final void mo593m(long j2) {
        m599t(new C0268s(Long.valueOf(j2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: n */
    public final void mo594n(Boolean bool) {
        if (bool == null) {
            m599t(C0266q.f636a);
        } else {
            m599t(new C0268s(bool));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: o */
    public final void mo595o(Number number) {
        if (number == null) {
            m599t(C0266q.f636a);
            return;
        }
        if (!this.f1569f) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m599t(new C0268s(number));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: p */
    public final void mo596p(String str) {
        if (str == null) {
            m599t(C0266q.f636a);
        } else {
            m599t(new C0268s(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0494c
    /* JADX INFO: renamed from: q */
    public final void mo597q(boolean z2) {
        m599t(new C0268s(Boolean.valueOf(z2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final AbstractC0264o m598s() {
        return (AbstractC0264o) this.f753m.get(r0.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m599t(AbstractC0264o abstractC0264o) {
        if (this.f754n != null) {
            if (!(abstractC0264o instanceof C0266q) || this.f1572i) {
                C0267r c0267r = (C0267r) m598s();
                c0267r.f637a.put(this.f754n, abstractC0264o);
            }
            this.f754n = null;
            return;
        }
        if (this.f753m.isEmpty()) {
            this.f755o = abstractC0264o;
            return;
        }
        AbstractC0264o abstractC0264oM598s = m598s();
        if (!(abstractC0264oM598s instanceof C0263n)) {
            throw new IllegalStateException();
        }
        ((C0263n) abstractC0264oM598s).f635a.add(abstractC0264o);
    }

    @Override // p051b0.C0494c, java.io.Flushable
    public final void flush() {
    }
}
