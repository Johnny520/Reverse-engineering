package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: fp */
/* JADX INFO: loaded from: classes.dex */
public final class C1422fp {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5015e = null;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f5016f = null;

    /* JADX INFO: renamed from: g */
    public static final C2610v1 f5017g = null;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f5018a;

    /* JADX INFO: renamed from: b */
    public final boolean f5019b;

    /* JADX INFO: renamed from: c */
    public final int f5020c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f5021d;

    static {
        f5015e = AtomicReferenceFieldUpdater.newUpdater(C1422fp.class, Object.class, "_next$volatile");
        f5016f = AtomicLongFieldUpdater.newUpdater(C1422fp.class, "_state$volatile");
        f5017g = new C2610v1("REMOVE_FROZEN", 10);
    }

    public C1422fp(int r3, boolean r4) {
        this.f5018a = r3;
        this.f5019b = r4;
        int r42 = r3 - 1;
        this.f5020c = r42;
        this.f5021d = new AtomicReferenceArray(r3);
        if (r42 > 1073741823) goto L10;
        if ((r3 & r42) != 0) goto L8;
        return;
    L8:
        throw new IllegalStateException("Check failed.");
    L10:
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: renamed from: a */
    public final int m2732a(Object r15) {
    L2:
        AtomicLongFieldUpdater r0 = f5016f;
        long r3 = r0.get(this);
        if ((3458764513820540928L & r3) != 0) goto L5;
        int r1 = (int) (1073741823 & r3);
        int r9 = (int) ((1152921503533105152L & r3) >> 30);
        int r10 = this.f5020c;
        if (((r9 + 2) & r10) == (r1 & r10)) goto L53;
        boolean r5 = this.f5019b;
        AtomicReferenceArray r11 = this.f5021d;
        if (r5 == true) goto L21;
        if (r11.get(r9 & r10) == null) goto L21;
        int r2 = this.f5018a;
        if (r2 < 1024) goto L51;
        if (((r9 - r1) & 1073741823) <= (r2 >> 1)) goto L2;
        return 1;
    L51:
        return 1;
    L21:
        long r52 = ((-1152921503533105153L) & r3) | (((long) ((r9 + 1) & 1073741823)) << 30);
        if (f5016f.compareAndSet(this, r3, r52) == false) goto L2;
        r11.set(r9 & r10, r15);
        C1422fp r12 = this;
    L25:
        if ((r0.get(r12) & 1152921504606846976L) == 0) goto L54;
        r12 = r12.m2734c();
        AtomicReferenceArray r22 = r12.f5021d;
        int r32 = r12.f5020c & r9;
        Object r4 = r22.get(r32);
        if ((r4 instanceof C1378ep) == true) goto L29;
    L31:
        r12 = null;
    L32:
        if (r12 != null) goto L25;
        return 0;
    L29:
        if (((C1378ep) r4).f4917a != r9) goto L31;
        r22.set(r32, r15);
        goto L32
    L54:
        return 0;
    L53:
        return 1;
    L5:
        if ((2305843009213693952L & r3) == 0) goto L19;
        return 2;
    L19:
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2733b() {
    L2:
        AtomicLongFieldUpdater r0 = f5016f;
        long r2 = r0.get(this);
        if ((r2 & 2305843009213693952L) != 0) goto L4;
        if ((1152921504606846976L & r2) != 0) goto L7;
        if (r0.compareAndSet(this, r2, 2305843009213693952L | r2) == false) goto L2;
        return true;
    L7:
        return false;
    L4:
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C1422fp m2734c() {
    L2:
        AtomicLongFieldUpdater r0 = f5016f;
        long r2 = r0.get(this);
        if ((r2 & 1152921504606846976L) != 0) goto L4;
        long r4 = 1152921504606846976L | r2;
        C1422fp r1 = this;
        if (r0.compareAndSet(r1, r2, r4) == false) goto L2;
        r2 = r4;
    L8:
        AtomicReferenceFieldUpdater r42 = f5015e;
        C1422fp r5 = (C1422fp) r42.get(this);
        if (r5 != null) goto L10;
        C1422fp r52 = new C1422fp(r1.f5018a * 2, r1.f5019b);
        int r6 = (int) (1073741823 & r2);
        int r7 = (int) ((1152921503533105152L & r2) >> 30);
    L12:
        int r8 = r1.f5020c;
        int r9 = r6 & r8;
        if (r9 == (r8 & r7)) goto L18;
        Object r82 = r1.f5021d.get(r9);
        if (r82 != null) goto L17;
        r82 = new C1378ep(r6);
    L17:
        int r92 = r52.f5020c & r6;
        r52.f5021d.set(r92, r82);
        r6 = r6 + 1;
        goto L12
    L18:
        r0.set(r52, (-1152921504606846977L) & r2);
    L20:
        if (r42.compareAndSet(this, null, r52) == true) goto L8;
        if (r42.get(this) == null) goto L20;
    L10:
        return r5;
    L4:
        r1 = this;
        goto L8
    }

    /* JADX INFO: renamed from: d */
    public final Object m2735d() {
        C1422fp r1 = this;
    L3:
        AtomicLongFieldUpdater r6 = f5016f;
        long r2 = r6.get(r1);
        if ((r2 & 1152921504606846976L) != 0) goto L6;
        int r0 = (int) (r2 & 1073741823);
        int r5 = r1.f5020c;
        int r13 = r0 & r5;
        if ((((int) ((1152921503533105152L & r2) >> 30)) & r5) == r13) goto L16;
        AtomicReferenceArray r15 = r1.f5021d;
        Object r4 = r15.get(r13);
        boolean r52 = r1.f5019b;
        if (r4 == null) goto L12;
        if ((r4 instanceof C1378ep) == true) goto L16;
        long r7 = (r0 + 1) & 1073741823;
        if (f5016f.compareAndSet(r1, r2, (r2 & (-1073741824)) | r7) == true) goto L19;
        r1 = this;
        if (r52 == false) goto L3;
    L23:
        long r24 = r6.get(r1);
        int r02 = (int) (r24 & 1073741823);
        if ((r24 & 1152921504606846976L) != 0) goto L25;
        C1422fp r23 = r1;
        if (f5016f.compareAndSet(r23, r24, (r24 & (-1073741824)) | r7) == true) goto L28;
        r1 = r23;
        goto L23
    L28:
        r23.f5021d.set(r02 & r23.f5020c, null);
        r1 = null;
    L29:
        if (r1 != null) goto L23;
        return r4;
    L25:
        r1 = r1.m2734c();
        goto L29
    L19:
        r15.set(r13, null);
        return r4;
    L12:
        if (r52 == false) goto L3;
    L16:
        return null;
    L6:
        return f5017g;
    }
}
