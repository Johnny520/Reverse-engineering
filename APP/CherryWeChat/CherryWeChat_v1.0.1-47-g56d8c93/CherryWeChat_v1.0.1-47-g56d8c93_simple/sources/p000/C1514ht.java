package p000;

import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.AbstractC1767e;
import io.sentry.android.replay.capture.InterfaceC1776n;
import java.util.Date;
import java.util.ListIterator;

/* JADX INFO: renamed from: ht */
/* JADX INFO: loaded from: classes.dex */
public final class C1514ht extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5363c;

    public /* synthetic */ C1514ht(int r1, Object r2) {
        this.f5362b = r1;
        this.f5363c = r2;
        super(1);
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r4) {
        switch(this.f5362b) {
            case 0: goto L26;
            case 1: goto L14;
            default: goto L4;
        };
    L4:
        Date r42 = (Date) r4;
        ReplayIntegration r0 = (ReplayIntegration) this.f5363c;
        InterfaceC1776n r1 = r0.f6393l;
        if (r1 == null) goto L8;
        int r2 = Integer.valueOf(((AbstractC1767e) r1).m3955j()).intValue() + 1;
        ((AbstractC1767e) r1).m3957l(r2);
    L8:
        InterfaceC1776n r02 = r0.f6393l;
        if (r02 == null) goto L13;
        ((AbstractC1767e) r02).m3958m(r42);
    L13:
        return C0829TC.f2620a;
    L14:
        AbstractC1439g5 r43 = (AbstractC1439g5) r4;
        C2335ot r44 = (C2335ot) this.f5363c;
        if (r44.f8205c != null) goto L25;
        C0134D4 r45 = r44.f8204b;
        ListIterator r46 = r45.listIterator(r45.size());
    L18:
        if (r46.hasPrevious() == false) goto L22;
        Object r03 = r46.previous();
        if (((C2461ri) r03).f8673a == false) goto L18;
    L23:
        C2461ri r04 = (C2461ri) r03;
        goto L25
    L22:
        r03 = null;
    L25:
        return C0829TC.f2620a;
    L26:
        AbstractC1439g5 r47 = (AbstractC1439g5) r4;
        C2335ot r48 = (C2335ot) this.f5363c;
        C0134D4 r05 = r48.f8204b;
        ListIterator r06 = r05.listIterator(r05.size());
    L28:
        if (r06.hasPrevious() == false) goto L32;
        Object r12 = r06.previous();
        if (((C2461ri) r12).f8673a == false) goto L28;
    L33:
        C2461ri r13 = (C2461ri) r12;
        if (r48.f8205c == null) goto L36;
        r48.m4741a();
    L36:
        r48.f8205c = r13;
        return C0829TC.f2620a;
    L32:
        r12 = null;
        goto L33
    }
}
