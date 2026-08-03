package p000;

/* JADX INFO: renamed from: Ca */
/* JADX INFO: loaded from: classes.dex */
public final class C0103Ca {

    /* JADX INFO: renamed from: a */
    public final Object f243a;

    /* JADX INFO: renamed from: b */
    public final C0394J6 f244b;

    /* JADX INFO: renamed from: c */
    public final C0373Im f245c;

    /* JADX INFO: renamed from: d */
    public final Object f246d;

    /* JADX INFO: renamed from: e */
    public final Throwable f247e;

    public C0103Ca(Object r1, C0394J6 r2, C0373Im r3, Object r4, Throwable r5) {
        this.f243a = r1;
        this.f244b = r2;
        this.f245c = r3;
        this.f246d = r4;
        this.f247e = r5;
    }

    /* JADX INFO: renamed from: a */
    public static C0103Ca m151a(C0103Ca r6, C0394J6 r7, Throwable r8, int r9) {
        Object r1 = r6.f243a;
        if ((r9 & 2) == 0) goto L5;
        r7 = r6.f244b;
    L5:
        C0394J6 r2 = r7;
        C0373Im r3 = r6.f245c;
        Object r4 = r6.f246d;
        if ((r9 & 16) == 0) goto L9;
        r8 = r6.f247e;
    L9:
        return new C0103Ca(r1, r2, r3, r4, r8);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0103Ca) == true) goto L8;
        return false;
    L8:
        C0103Ca r52 = (C0103Ca) r5;
        if (AbstractC0585Nj.m1134a(this.f243a, r52.f243a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f244b, r52.f244b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f245c, r52.f245c) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.f246d, r52.f246d) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.f247e, r52.f247e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.f243a;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = r12 * 31;
        C0394J6 r2 = this.f244b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r14 = (r13 + r22) * 31;
        C0373Im r23 = this.f245c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r15 = (r14 + r24) * 31;
        Object r25 = this.f246d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r16 = (r15 + r26) * 31;
        Throwable r27 = this.f247e;
        if (r27 == null) goto L23;
        r0 = r27.hashCode();
    L23:
        return r16 + r0;
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f243a + ", cancelHandler=" + this.f244b + ", onCancellation=" + this.f245c + ", idempotentResume=" + this.f246d + ", cancelCause=" + this.f247e + ')';
    }

    public /* synthetic */ C0103Ca(Object r9, C0394J6 r10, Throwable r11, int r12) {
        if ((r12 & 2) == 0) goto L5;
        C0394J6 r4 = null;
    L7:
        if ((r12 & 16) == 0) goto L9;
        Throwable r7 = null;
    L10:
        this(r9, r4, null, null, r7);
        return;
    L9:
        r7 = r11;
        goto L10
    L5:
        r4 = r10;
        goto L7
    }
}
