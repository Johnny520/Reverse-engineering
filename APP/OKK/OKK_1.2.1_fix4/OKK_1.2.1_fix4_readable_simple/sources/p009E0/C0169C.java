package p009E0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p001A0.AbstractC0040p;
import p007D0.C0146l;
import p014H0.InterfaceC0202a;
import p016I0.EnumC0209a;
import p018J0.AbstractC0237g;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p040V0.C0406i;

/* JADX INFO: renamed from: E0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0169C extends AbstractC0237g implements InterfaceC0290p {

    /* JADX INFO: renamed from: c */
    public Object f370c;

    /* JADX INFO: renamed from: d */
    public Iterator f371d;

    /* JADX INFO: renamed from: e */
    public int f372e;

    /* JADX INFO: renamed from: f */
    public int f373f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f374g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f375h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f376i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Iterator f377j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f378k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f379l;

    public C0169C(int r1, int r2, Iterator r3, boolean r4, boolean r5, InterfaceC0202a r6) {
        this.f375h = r1;
        this.f376i = r2;
        this.f377j = r3;
        this.f378k = r4;
        this.f379l = r5;
        super(r6);
    }

    @Override // p029P0.InterfaceC0290p
    /* JADX INFO: renamed from: b */
    public final Object mo518b(Object r1, Object r2) {
        return ((C0169C) mo519d((C0406i) r1, (InterfaceC0202a) r2)).mo520f(C0146l.f339a);
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: d */
    public final InterfaceC0202a mo519d(Object r9, InterfaceC0202a r10) {
        boolean r4 = this.f378k;
        boolean r5 = this.f379l;
        C0169C r7 = new C0169C(this.f375h, this.f376i, this.f377j, r4, r5, r10);
        r7.f374g = r9;
        return r7;
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: f */
    public final Object mo520f(Object r17) {
        EnumC0209a r1 = EnumC0209a.f425a;
        int r2 = this.f373f;
        boolean r4 = this.f379l;
        boolean r9 = this.f378k;
        int r10 = this.f376i;
        int r11 = this.f375h;
        if (r2 == 0) goto L19;
        if (r2 == 1) goto L14;
        if (r2 == 2) goto L9;
        if (r2 == 3) goto L13;
        if (r2 == 4) goto L12;
        if (r2 == 5) goto L9;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L12:
        C0168B r22 = (C0168B) this.f370c;
        C0406i r42 = (C0406i) this.f374g;
        AbstractC0040p.m97b0(r17);
        r22.m517b(r10);
    L70:
        if (r22.f369d <= r10) goto L77;
        if (r9 == false) goto L73;
        Object r3 = r22;
    L74:
        this.f374g = r42;
        this.f370c = r22;
        this.f371d = null;
        this.f373f = 4;
        r42.m991d(r3, this);
        return r1;
    L73:
        r3 = new ArrayList(r22);
        goto L74
    L77:
        if ((true ^ r22.isEmpty()) == false) goto L81;
        this.f374g = null;
        this.f370c = null;
        this.f371d = null;
        this.f373f = 5;
        r42.m991d(r22, this);
        return r1;
    L81:
        return C0146l.f339a;
    L13:
        Iterator r23 = this.f371d;
        C0168B r8 = (C0168B) this.f370c;
        C0406i r13 = (C0406i) this.f374g;
        AbstractC0040p.m97b0(r17);
        r8.m517b(r10);
    L44:
        if (r23.hasNext() == false) goto L67;
        Object r5 = r23.next();
        int r14 = r8.mo516a();
        int r15 = r8.f367b;
        if (r14 == r15) goto L66;
        int r142 = r8.f368c;
        int r6 = r8.f369d;
        Object[] r12 = r8.f366a;
        r12[(r142 + r6) % r15] = r5;
        r8.f369d = r6 + 1;
        if (r8.mo516a() != r15) goto L44;
        if (r8.f369d >= r11) goto L60;
        int r152 = (r15 + (r15 >> 1)) + 1;
        if (r152 <= r11) goto L55;
        r152 = r11;
    L55:
        if (r8.f368c != 0) goto L57;
        Object[] r52 = Arrays.copyOf(r12, r152);
        AbstractC0307g.m702d(r52, "copyOf(...)");
    L58:
        r8 = new C0168B(r8.f369d, r52);
        goto L44
    L57:
        r52 = r8.toArray(new Object[r152]);
        goto L58
    L60:
        if (r9 == false) goto L62;
        Object r32 = r8;
    L63:
        this.f374g = r13;
        this.f370c = r8;
        this.f371d = r23;
        this.f373f = 3;
        r13.m991d(r32, this);
        return r1;
    L62:
        r32 = new ArrayList(r8);
        goto L63
    L66:
        throw new IllegalStateException("ring buffer is full");
    L67:
        if (r4 == false) goto L81;
        r22 = r8;
        r42 = r13;
    L9:
        AbstractC0040p.m97b0(r17);
        goto L81
    L14:
        int r24 = this.f372e;
        Iterator r53 = this.f371d;
        ArrayList r62 = (ArrayList) this.f370c;
        C0406i r7 = (C0406i) this.f374g;
        AbstractC0040p.m97b0(r17);
        if (r9 == false) goto L17;
        r62.clear();
    L18:
        int r143 = r24;
    L27:
        if (r53.hasNext() == false) goto L36;
        Object r92 = r53.next();
        if (r24 > 0) goto L30;
        r62.add(r92);
        if (r62.size() != r11) goto L27;
        this.f374g = r7;
        this.f370c = r62;
        this.f371d = r53;
        this.f372e = r143;
        this.f373f = 1;
        r7.m991d(r62, this);
        return r1;
    L30:
        r24 = r24 - 1;
        goto L27
    L36:
        if ((!r62.isEmpty()) == false) goto L81;
        if (r4 == false) goto L39;
    L40:
        this.f374g = null;
        this.f370c = null;
        this.f371d = null;
        this.f373f = 2;
        r7.m991d(r62, this);
        return r1;
    L39:
        if (r62.size() != r11) goto L81;
    L17:
        r62 = new ArrayList(r11);
        goto L18
    L19:
        AbstractC0040p.m97b0(r17);
        C0406i r25 = (C0406i) this.f374g;
        int r132 = 1024;
        if (r11 > 1024) goto L23;
        r132 = r11;
    L23:
        r143 = r10 - r11;
        Iterator r153 = this.f377j;
        if (r143 < 0) goto L42;
        r62 = new ArrayList(r132);
        r7 = r25;
        r24 = 0;
        r53 = r153;
        goto L27
    L42:
        r8 = new C0168B(0, new Object[r132]);
        r13 = r25;
        r23 = r153;
        goto L44
    }
}
