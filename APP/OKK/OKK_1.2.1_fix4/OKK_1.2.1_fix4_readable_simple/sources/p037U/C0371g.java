package p037U;

import java.util.ArrayList;
import java.util.List;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: U.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0371g extends AbstractC0390z {

    /* JADX INFO: renamed from: g */
    public boolean f784g;

    /* JADX INFO: renamed from: h */
    public ArrayList f785h;

    /* JADX INFO: renamed from: i */
    public ArrayList f786i;

    /* JADX INFO: renamed from: j */
    public ArrayList f787j;

    /* JADX INFO: renamed from: k */
    public ArrayList f788k;

    /* JADX INFO: renamed from: l */
    public ArrayList f789l;

    /* JADX INFO: renamed from: m */
    public ArrayList f790m;

    /* JADX INFO: renamed from: n */
    public ArrayList f791n;

    /* JADX INFO: renamed from: o */
    public ArrayList f792o;

    /* JADX INFO: renamed from: p */
    public ArrayList f793p;

    /* JADX INFO: renamed from: q */
    public ArrayList f794q;

    /* JADX INFO: renamed from: r */
    public ArrayList f795r;

    /* JADX INFO: renamed from: f */
    public static void m945f(ArrayList r1) {
        int r02 = r1.size() - 1;
        if (r02 >= 0) goto L5;
        return;
    L5:
        ((AbstractC0355O) r1.get(r02)).getClass();
        throw null;
    }

    @Override // p037U.AbstractC0390z
    /* JADX INFO: renamed from: c */
    public final void mo946c(AbstractC0355O r1) {
        r1.getClass();
        throw null;
    }

    @Override // p037U.AbstractC0390z
    /* JADX INFO: renamed from: d */
    public final void mo947d() {
        ArrayList r02 = this.f787j;
        int r1 = r02.size() - 1;
        if (r1 >= 0) goto L46;
        ArrayList r03 = this.f785h;
        int r12 = r03.size() - 1;
    L5:
        if (r12 < 0) goto L7;
        m980b((AbstractC0355O) r03.get(r12));
        r03.remove(r12);
        r12 = r12 - 1;
        goto L5
    L7:
        ArrayList r04 = this.f786i;
        int r13 = r04.size() - 1;
        if (r13 >= 0) goto L44;
        ArrayList r05 = this.f788k;
        int r14 = r05.size() - 1;
    L10:
        if (r14 < 0) goto L12;
        AbstractC0369e r2 = (AbstractC0369e) r05.get(r14);
        r2.getClass();
        r2.getClass();
        r14 = r14 - 1;
        goto L10
    L12:
        r05.clear();
        if (mo948e() == true) goto L15;
        return;
    L15:
        ArrayList r06 = this.f790m;
        int r15 = r06.size() - 1;
    L16:
        if (r15 < 0) goto L22;
        ArrayList r22 = (ArrayList) r06.get(r15);
        int r3 = r22.size() - 1;
        if (r3 >= 0) goto L20;
        r15 = r15 - 1;
        goto L16
    L20:
        ((AbstractC0370f) r22.get(r3)).getClass();
        throw null;
    L22:
        ArrayList r07 = this.f789l;
        int r16 = r07.size() - 1;
    L23:
        if (r16 < 0) goto L29;
        ArrayList r23 = (ArrayList) r07.get(r16);
        int r32 = r23.size() - 1;
        if (r32 >= 0) goto L27;
        r16 = r16 - 1;
        goto L23
    L27:
        ((AbstractC0355O) r23.get(r32)).getClass();
        throw null;
    L29:
        ArrayList r08 = this.f791n;
        int r17 = r08.size() - 1;
    L30:
        if (r17 < 0) goto L38;
        ArrayList r24 = (ArrayList) r08.get(r17);
        int r33 = r24.size() - 1;
    L32:
        if (r33 < 0) goto L37;
        AbstractC0369e r4 = (AbstractC0369e) r24.get(r33);
        r4.getClass();
        r4.getClass();
        if (r24.isEmpty() == false) goto L36;
        r08.remove(r24);
    L36:
        r33 = r33 - 1;
        goto L32
    L37:
        r17 = r17 - 1;
        goto L30
    L38:
        m945f(this.f794q);
        m945f(this.f793p);
        m945f(this.f792o);
        m945f(this.f795r);
        ArrayList r09 = this.f877b;
        if (r09.size() > 0) goto L42;
        r09.clear();
        return;
    L42:
        AbstractC0324d.m726i(r09.get(0));
        throw null;
    L44:
        ((AbstractC0355O) r04.get(r13)).getClass();
        throw null;
    L46:
        ((AbstractC0370f) r02.get(r1)).getClass();
        throw null;
    }

    @Override // p037U.AbstractC0390z
    /* JADX INFO: renamed from: e */
    public final boolean mo948e() {
        if (this.f786i.isEmpty() == true) goto L5;
    L26:
        return true;
    L5:
        if (this.f788k.isEmpty() == false) goto L26;
        if (this.f787j.isEmpty() == false) goto L26;
        if (this.f785h.isEmpty() == false) goto L26;
        if (this.f793p.isEmpty() == false) goto L26;
        if (this.f794q.isEmpty() == false) goto L26;
        if (this.f792o.isEmpty() == false) goto L26;
        if (this.f795r.isEmpty() == false) goto L26;
        if (this.f790m.isEmpty() == false) goto L26;
        if (this.f789l.isEmpty() == false) goto L26;
        if (this.f791n.isEmpty() == false) goto L26;
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m949g() {
        if (mo948e() == true) goto L9;
        ArrayList r02 = this.f877b;
        if (r02.size() > 0) goto L7;
        r02.clear();
        return;
    L7:
        AbstractC0324d.m726i(r02.get(0));
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m950h(List r4, AbstractC0355O r5) {
        int r02 = r4.size() - 1;
    L3:
        if (r02 < 0) goto L8;
        AbstractC0369e r1 = (AbstractC0369e) r4.get(r02);
        if (m951i(r1, r5) == false) goto L7;
        r1.getClass();
        r1.getClass();
        r4.remove(r1);
    L7:
        r02 = r02 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: i */
    public final boolean m951i(AbstractC0369e r1, AbstractC0355O r2) {
        r1.getClass();
        r1.getClass();
        r2.getClass();
        throw null;
    }
}
