package ac;

import bsh.C1189h4;
import java.util.Iterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: ac.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0217e implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final AbstractC0233u[] f556q;

    /* JADX INFO: renamed from: r */
    public int f557r;

    /* JADX INFO: renamed from: s */
    public boolean f558s;

    public AbstractC0217e(C0232t c0232t, AbstractC0233u[] abstractC0233uArr) {
        c0232t.getClass();
        abstractC0233uArr.getClass();
        this.f556q = abstractC0233uArr;
        this.f558s = true;
        abstractC0233uArr[0].m562B(c0232t.m548r(), c0232t.m544n() * 2);
        this.f557r = 0;
        m472o();
    }

    /* JADX INFO: renamed from: g */
    private final void m471g() {
        if (hasNext()) {
            return;
        }
        C1189h4.m4429a();
    }

    /* JADX INFO: renamed from: o */
    private final void m472o() {
        if (this.f556q[this.f557r].m569x()) {
            return;
        }
        for (int i10 = this.f557r; -1 < i10; i10--) {
            int iM473y = m473y(i10);
            if (iM473y == -1 && this.f556q[i10].m570y()) {
                this.f556q[i10].m561A();
                iM473y = m473y(i10);
            }
            if (iM473y != -1) {
                this.f557r = iM473y;
                return;
            }
            if (i10 > 0) {
                this.f556q[i10 - 1].m561A();
            }
            this.f556q[i10].m562B(C0232t.f580e.m557a().m548r(), 0);
        }
        this.f558s = false;
    }

    /* JADX INFO: renamed from: y */
    private final int m473y(int i10) {
        if (this.f556q[i10].m569x()) {
            return i10;
        }
        if (!this.f556q[i10].m570y()) {
            return -1;
        }
        C0232t c0232tM566l = this.f556q[i10].m566l();
        AbstractC0233u[] abstractC0233uArr = this.f556q;
        if (i10 == 6) {
            abstractC0233uArr[i10 + 1].m562B(c0232tM566l.m548r(), c0232tM566l.m548r().length);
        } else {
            abstractC0233uArr[i10 + 1].m562B(c0232tM566l.m548r(), c0232tM566l.m544n() * 2);
        }
        return m473y(i10 + 1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f558s;
    }

    /* JADX INFO: renamed from: l */
    public final Object m474l() {
        m471g();
        return this.f556q[this.f557r].m565g();
    }

    @Override // java.util.Iterator
    public Object next() {
        m471g();
        Object next = this.f556q[this.f557r].next();
        m472o();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC0233u[] m475v() {
        return this.f556q;
    }

    /* JADX INFO: renamed from: x */
    public final int m476x() {
        return this.f557r;
    }

    /* JADX INFO: renamed from: z */
    public final void m477z(int i10) {
        this.f557r = i10;
    }
}
