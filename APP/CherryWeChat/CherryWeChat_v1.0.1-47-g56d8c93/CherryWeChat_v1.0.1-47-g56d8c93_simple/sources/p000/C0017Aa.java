package p000;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0017Aa implements InterfaceC1137ac, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1137ac f32a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1049Yb f33b;

    public C0017Aa(InterfaceC1137ac r1, InterfaceC1049Yb r2) {
        this.f32a = r1;
        this.f33b = r2;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L4;
        return true;
    L4:
        if ((r7 instanceof C0017Aa) == false) goto L30;
        C0017Aa r72 = (C0017Aa) r7;
        int r0 = 2;
        C0017Aa r2 = r72;
        int r3 = 2;
    L6:
        InterfaceC1137ac r22 = r2.f32a;
        if ((r22 instanceof C0017Aa) == false) goto L9;
        r2 = (C0017Aa) r22;
    L10:
        if (r2 == null) goto L11;
        r3 = r3 + 1;
        goto L6
    L11:
        C0017Aa r23 = this;
    L12:
        InterfaceC1137ac r24 = r23.f32a;
        if ((r24 instanceof C0017Aa) == false) goto L15;
        r23 = (C0017Aa) r24;
    L16:
        if (r23 == null) goto L17;
        r0 = r0 + 1;
        goto L12
    L17:
        if (r3 != r0) goto L30;
        C0017Aa r02 = this;
    L19:
        InterfaceC1049Yb r25 = r02.f33b;
        if (AbstractC0585Nj.m1134a(r72.mo24m(r25.getKey()), r25) == false) goto L21;
        InterfaceC1137ac r03 = r02.f32a;
        if ((r03 instanceof C0017Aa) == false) goto L25;
        r02 = (C0017Aa) r03;
        goto L19
    L25:
        InterfaceC1049Yb r04 = (InterfaceC1049Yb) r03;
        boolean r73 = AbstractC0585Nj.m1134a(r72.mo24m(r04.getKey()), r04);
    L26:
        if (r73 == false) goto L30;
        return true;
    L21:
        r73 = false;
        goto L26
    L15:
        r23 = null;
        goto L16
    L9:
        r2 = null;
    L30:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f32a.hashCode();
        return this.f33b.hashCode() + r0;
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: l */
    public final InterfaceC1137ac mo23l(InterfaceC1137ac r1) {
        return AbstractC1406fG.m2700Z(this, r1);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: m */
    public final InterfaceC1049Yb mo24m(InterfaceC1092Zb r3) {
        C0017Aa r0 = this;
    L3:
        InterfaceC1049Yb r1 = r0.f33b.mo24m(r3);
        if (r1 != null) goto L5;
        InterfaceC1137ac r02 = r0.f32a;
        if ((r02 instanceof C0017Aa) == false) goto L10;
        r0 = (C0017Aa) r02;
        goto L3
    L10:
        return r02.mo24m(r3);
    L5:
        return r1;
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: q */
    public final Object mo25q(Object r2, Function2 r3) {
        return r3.mo446d(this.f32a.mo25q(r2, r3), this.f33b);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: s */
    public final InterfaceC1137ac mo26s(InterfaceC1092Zb r4) {
        InterfaceC1049Yb r0 = this.f33b;
        InterfaceC1049Yb r1 = r0.mo24m(r4);
        InterfaceC1137ac r2 = this.f32a;
        if (r1 == null) goto L5;
        return r2;
    L5:
        InterfaceC1137ac r42 = r2.mo26s(r4);
        if (r42 != r2) goto L9;
        return this;
    L9:
        if (r42 != C0366If.f1247a) goto L12;
        return r0;
    L12:
        return new C0017Aa(r42, r0);
    }

    public final String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("["), (String) mo25q("", new C0309H7(5)), ']');
    }
}
