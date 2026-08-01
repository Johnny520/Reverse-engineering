package p040U0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p006D.AbstractC0079h;
import p009E0.C0103c;
import p021K0.C0169h;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0224h;
import p029O0.InterfaceC0233a;
import p034R0.C0244c;

/* JADX INFO: renamed from: U0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0292b implements Iterator, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public int f664a = -1;

    /* JADX INFO: renamed from: b */
    public int f665b;

    /* JADX INFO: renamed from: c */
    public int f666c;

    /* JADX INFO: renamed from: d */
    public C0244c f667d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0169h f668e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0292b(C0169h c0169h) {
        this.f668e = c0169h;
        c0169h.getClass();
        int iM183g = AbstractC0079h.m183g(0, 0, ((CharSequence) c0169h.f489b).length());
        this.f665b = iM183g;
        this.f666c = iM183g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [M0.p, N0.h] */
    /* JADX INFO: renamed from: a */
    public final void m499a() {
        C0103c c0103c;
        int i2 = this.f666c;
        if (i2 < 0) {
            this.f664a = 0;
            this.f667d = null;
            return;
        }
        C0169h c0169h = this.f668e;
        c0169h.getClass();
        CharSequence charSequence = (CharSequence) c0169h.f489b;
        if (i2 <= charSequence.length() && (c0103c = (C0103c) ((AbstractC0224h) c0169h.f490c).mo248a(charSequence, Integer.valueOf(this.f666c))) != null) {
            int iIntValue = ((Number) c0103c.f394a).intValue();
            int iIntValue2 = ((Number) c0103c.f395b).intValue();
            this.f667d = AbstractC0079h.m176U(this.f665b, iIntValue);
            int i3 = iIntValue + iIntValue2;
            this.f665b = i3;
            this.f666c = i3 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f667d = new C0244c(this.f665b, AbstractC0299i.m515m0(charSequence), 1);
            this.f666c = -1;
        }
        this.f664a = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f664a == -1) {
            m499a();
        }
        return this.f664a == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f664a == -1) {
            m499a();
        }
        if (this.f664a == 0) {
            throw new NoSuchElementException();
        }
        C0244c c0244c = this.f667d;
        AbstractC0223g.m416c(c0244c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f667d = null;
        this.f664a = -1;
        return c0244c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
