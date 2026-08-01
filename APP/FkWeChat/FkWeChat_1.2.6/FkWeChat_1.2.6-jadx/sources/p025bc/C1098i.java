package p025bc;

import bsh.C1189h4;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p024b9.AbstractC1064u0;
import p036c9.InterfaceC1400a;
import p052dc.C1945c;
import p117i.C3039b;

/* JADX INFO: renamed from: bc.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C1098i implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public Object f3320q;

    /* JADX INFO: renamed from: r */
    public final C1093d f3321r;

    /* JADX INFO: renamed from: s */
    public Object f3322s;

    /* JADX INFO: renamed from: t */
    public boolean f3323t;

    /* JADX INFO: renamed from: u */
    public int f3324u;

    /* JADX INFO: renamed from: v */
    public int f3325v;

    public C1098i(Object obj, C1093d c1093d) {
        c1093d.getClass();
        this.f3320q = obj;
        this.f3321r = c1093d;
        this.f3322s = C1945c.f5421a;
        this.f3324u = c1093d.m3990l().m484m();
    }

    /* JADX INFO: renamed from: g */
    private final void m3997g() {
        if (this.f3321r.m3990l().m484m() == this.f3324u) {
            return;
        }
        C3039b.m11232a();
    }

    /* JADX INFO: renamed from: l */
    private final void m3998l() {
        if (hasNext()) {
            return;
        }
        C1189h4.m4429a();
    }

    /* JADX INFO: renamed from: o */
    private final void m3999o() {
        if (!this.f3323t) {
            throw new IllegalStateException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3325v < this.f3321r.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        m3999o();
        AbstractC1064u0.m3856d(this.f3321r).remove(this.f3322s);
        this.f3322s = null;
        this.f3323t = false;
        this.f3324u = this.f3321r.m3990l().m484m();
        this.f3325v--;
    }

    /* JADX INFO: renamed from: v */
    public final C1093d m4000v() {
        return this.f3321r;
    }

    /* JADX INFO: renamed from: x */
    public final Object m4001x() {
        return this.f3322s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C1090a next() {
        m3997g();
        m3998l();
        this.f3322s = this.f3320q;
        this.f3323t = true;
        this.f3325v++;
        V v10 = this.f3321r.m3990l().get(this.f3320q);
        if (v10 != 0) {
            C1090a c1090a = (C1090a) v10;
            this.f3320q = c1090a.m3968c();
            return c1090a;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f3320q + ") has changed after it was added to the persistent map.");
    }
}
