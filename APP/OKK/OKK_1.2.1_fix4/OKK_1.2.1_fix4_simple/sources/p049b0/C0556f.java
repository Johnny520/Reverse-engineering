package p049b0;

import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0137c;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0556f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f1653b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0286l f1654c;

    public /* synthetic */ C0556f(String r1, String r2, InterfaceC0286l r3) {
        this.f1652a = r1;
        this.f1653b = r2;
        this.f1654c = r3;
    }

    /* JADX INFO: renamed from: a */
    public final C0564n m1369a(C0562l r5) {
        String r02 = this.f1652a;
        AbstractC0307g.m703e(r02, "$id");
        String r1 = this.f1653b;
        AbstractC0307g.m703e(r1, "$title");
        InterfaceC0286l r2 = this.f1654c;
        AbstractC0307g.m703e(r2, "$block");
        Object r52 = (AbstractC0560j) r2.invoke(r5);     // Catch: Throwable -> L5
    L7:
        Throwable r22 = AbstractC0141g.m465a(r52);
        EnumC0563m r3 = EnumC0563m.f1666c;
        if (r22 != null) goto L20;
        AbstractC0560j r53 = (AbstractC0560j) r52;
        if ((r53 instanceof C0558h) == false) goto L13;
        r3 = EnumC0563m.f1664a;
    L27:
        return new C0564n(r02, r1, r3, r53.mo1370a());
    L13:
        if ((r53 instanceof C0559i) == false) goto L16;
        r3 = EnumC0563m.f1665b;
        goto L27
    L16:
        if ((r53 instanceof C0557g) == true) goto L27;
        throw new C0137c();
    L20:
        String r23 = r22.getMessage();
        if (r23 != null) goto L24;
        r23 = "error";
    L24:
        return new C0564n(r02, r1, r3, r23);
    L5:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);
        goto L7
    }
}
