package p000;

import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: renamed from: sE */
/* JADX INFO: loaded from: classes.dex */
public final class C2494sE {

    /* JADX INFO: renamed from: a */
    public final C2520sy f8756a;

    /* JADX INFO: renamed from: b */
    public final C2640vp f8757b;

    public C2494sE() {
        this.f8756a = new C2520sy(0);
        this.f8757b = new C2640vp();
    }

    /* JADX INFO: renamed from: a */
    public final void m4971a(AbstractC1166o r3, C2208lv r4) {
        C2520sy r0 = this.f8756a;
        C2408qE r1 = (C2408qE) r0.get(r3);
        if (r1 != null) goto L5;
        r1 = C2408qE.m4846a();
        r0.put(r3, r1);
    L5:
        r1.f8445c = r4;
        r1.f8443a |= 8;
    }

    /* JADX INFO: renamed from: b */
    public final C2208lv m4972b(AbstractC1166o r6, int r7) {
        C2520sy r0 = this.f8756a;
        int r62 = r0.m5000d(r6);
        if (r62 < 0) goto L21;
        C2408qE r2 = (C2408qE) r0.m5003j(r62);
        if (r2 == null) goto L21;
        int r3 = r2.f8443a;
        if ((r3 & r7) == 0) goto L21;
        int r32 = r3 & (~r7);
        r2.f8443a = r32;
        if (r7 != 4) goto L13;
        C2208lv r72 = r2.f8444b;
    L16:
        if ((r32 & 12) != 0) goto L18;
        r0.mo4h(r62);
        r2.f8443a = 0;
        r2.f8444b = null;
        r2.f8445c = null;
        C2408qE.f8442d.mo1934a(r2);
    L18:
        return r72;
    L13:
        if (r7 != 8) goto L20;
        r72 = r2.f8445c;
        goto L16
    L20:
        throw new IllegalArgumentException("Must provide flag PRE or POST");
    L21:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4973c(AbstractC1166o r2) {
        C2408qE r22 = (C2408qE) this.f8756a.get(r2);
        if (r22 != null) goto L5;
        return;
    L5:
        r22.f8443a &= -2;
    }

    /* JADX INFO: renamed from: d */
    public final void m4974d(AbstractC1166o r7) {
        C2640vp r0 = this.f8757b;
        int r1 = r0.m5172g() - 1;
    L3:
        if (r1 < 0) goto L10;
        if (r7 == r0.m5173h(r1)) goto L6;
        r1 = r1 - 1;
        goto L3
    L6:
        Object[] r3 = r0.f9152c;
        Object r4 = r3[r1];
        Object r5 = AbstractC1406fG.f4985d;
        if (r4 == r5) goto L10;
        r3[r1] = r5;
        r0.f9150a = true;
    L10:
        C2408qE r72 = (C2408qE) this.f8756a.remove(r7);
        if (r72 == null) goto L16;
        r72.f8443a = 0;
        r72.f8444b = null;
        r72.f8445c = null;
        C2408qE.f8442d.mo1934a(r72);
        return;
    }
}
