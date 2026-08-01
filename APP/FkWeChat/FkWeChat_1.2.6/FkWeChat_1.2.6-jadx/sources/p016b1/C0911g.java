package p016b1;

import java.util.Iterator;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1064u0;
import p036c9.InterfaceC1400a;
import p117i.C3039b;

/* JADX INFO: renamed from: b1.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0911g extends AbstractC0909e implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: t */
    public final C0910f f2870t;

    /* JADX INFO: renamed from: u */
    public Object f2871u;

    /* JADX INFO: renamed from: v */
    public boolean f2872v;

    /* JADX INFO: renamed from: w */
    public int f2873w;

    public C0911g(C0910f c0910f, AbstractC0925u[] abstractC0925uArr) {
        super(c0910f.m3340m(), abstractC0925uArr);
        this.f2870t = c0910f;
        this.f2873w = c0910f.m3339l();
    }

    /* JADX INFO: renamed from: z */
    private final void m3346z() {
        if (this.f2870t.m3339l() == this.f2873w) {
            return;
        }
        C3039b.m11232a();
    }

    /* JADX INFO: renamed from: A */
    public final void m3347A() {
        if (!this.f2872v) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m3348B(int i10, C0924t c0924t, Object obj, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            m3335v()[i11].m3409C(c0924t.m3392p(), c0924t.m3392p().length, 0);
            while (!AbstractC1061t.m3842c(m3335v()[i11].m3411g(), obj)) {
                m3335v()[i11].m3417z();
            }
            m3337y(i11);
            return;
        }
        int iM3424f = 1 << AbstractC0928x.m3424f(i10, i12);
        if (c0924t.m3393q(iM3424f)) {
            m3335v()[i11].m3409C(c0924t.m3392p(), c0924t.m3389m() * 2, c0924t.m3390n(iM3424f));
            m3337y(i11);
        } else {
            int iM3369O = c0924t.m3369O(iM3424f);
            C0924t c0924tM3368N = c0924t.m3368N(iM3369O);
            m3335v()[i11].m3409C(c0924t.m3392p(), c0924t.m3389m() * 2, iM3369O);
            m3348B(i10, c0924tM3368N, obj, i11 + 1);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m3349C(Object obj, Object obj2) {
        if (this.f2870t.containsKey(obj)) {
            if (hasNext()) {
                Object objM3333l = m3333l();
                this.f2870t.put(obj, obj2);
                m3348B(objM3333l != null ? objM3333l.hashCode() : 0, this.f2870t.m3340m(), objM3333l, 0);
            } else {
                this.f2870t.put(obj, obj2);
            }
            this.f2873w = this.f2870t.m3339l();
        }
    }

    @Override // p016b1.AbstractC0909e, java.util.Iterator
    public Object next() {
        m3346z();
        this.f2871u = m3333l();
        this.f2872v = true;
        return super.next();
    }

    @Override // p016b1.AbstractC0909e, java.util.Iterator
    public void remove() {
        m3347A();
        if (hasNext()) {
            Object objM3333l = m3333l();
            AbstractC1064u0.m3856d(this.f2870t).remove(this.f2871u);
            m3348B(objM3333l != null ? objM3333l.hashCode() : 0, this.f2870t.m3340m(), objM3333l, 0);
        } else {
            AbstractC1064u0.m3856d(this.f2870t).remove(this.f2871u);
        }
        this.f2871u = null;
        this.f2872v = false;
        this.f2873w = this.f2870t.m3339l();
    }
}
