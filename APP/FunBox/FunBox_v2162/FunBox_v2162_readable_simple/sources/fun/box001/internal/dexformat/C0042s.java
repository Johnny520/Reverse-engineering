package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0165p;
import fun.box001.internal.dexformat.writer.data.C0195c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: e.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0042s {

    /* JADX INFO: renamed from: a */
    private final ArrayList f264a;

    /* JADX INFO: renamed from: b */
    private int f265b;

    /* JADX INFO: renamed from: c */
    private C0165p f266c;

    /* JADX INFO: renamed from: d */
    private int[] f267d;

    public C0042s(int r2) {
        this.f264a = new ArrayList(r2);
        this.f265b = 0;
        this.f266c = null;
        this.f267d = null;
    }

    /* JADX INFO: renamed from: a */
    private void m184a(int r5, int r6) {
        int[] r0 = this.f267d;
        if (r0 != null) goto L5;
        boolean r3 = true;
    L6:
        if (r5 != 0) goto L9;
        if (r3 == true) goto L9;
        return;
    L9:
        if (r5 < 0) goto L19;
        if (r3 == false) goto L12;
    L13:
        int r62 = r6 + 1;
        C0165p r52 = new C0165p(r62);
        int[] r63 = new int[r62];
        Arrays.fill(r63, -1);
        if (r3 == true) goto L16;
        r52.m408n(this.f266c);
        int[] r02 = this.f267d;
        System.arraycopy(r02, 0, r63, 0, r02.length);
    L16:
        this.f266c = r52;
        this.f267d = r63;
        return;
    L12:
        if (r6 >= r0.length) goto L13;
        return;
    L19:
        throw new RuntimeException("shouldn't happen");
    L5:
        r3 = false;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    private static void m185b(int r0, int r1, C0162m r2) {
        r2.getClass();
        if (r0 < 0) goto L12;
        if (r1 == 0) goto L10;
        throw new NullPointerException("spec.getLocalItem() == null");     // Catch: NullPointerException -> L7
    L8:
        throw new NullPointerException("spec == null");
    L10:
        throw new NullPointerException("disposition == null");
    L12:
        throw new IllegalArgumentException("address < 0");
    }

    /* JADX INFO: renamed from: c */
    private void m186c(int r3, int r4, C0162m r5) {
        if (r4 == 1) goto L14;
        int r0 = r5.m384i();
        int r02 = this.f267d[r0];
        if (r02 < 0) goto L11;
        ((AbstractC0041r) this.f264a.get(r02)).getClass();
        if (r3 != 0) goto L11;
        throw null;
    L11:
        m188d(r3, r4, r5);
        return;
    L14:
        throw new RuntimeException("shouldn't happen");
    }

    /* JADX INFO: renamed from: e */
    private static C0162m m187e(C0162m r2) {
        if (r2 != null) goto L4;
        return r2;
    L4:
        if (r2.mo379c() == C0195c.f771p) goto L6;
        return r2;
    L6:
        return r2.m391s(C0195c.f776u);
    }

    /* JADX INFO: renamed from: d */
    public final void m188d(int r6, int r7, C0162m r8) {
        int r0 = r8.m384i();
        C0162m r82 = m187e(r8);
        m184a(r6, r0);
        if (this.f267d[r0] < 0) goto L5;
        return;
    L5:
        ArrayList r02 = this.f264a;
        boolean r2 = true;
        int r1 = r02.size() - 1;
    L7:
        if (r1 < 0) goto L14;
        if (((AbstractC0041r) r02.get(r1)) != null) goto L11;
        r1 = r1 - 1;
        goto L7
    L11:
        if (r6 == 0) goto L13;
        r2 = false;
    L21:
        if (r2 == false) goto L23;
        return;
    L23:
        m185b(r6, r7, r82);
        throw null;
    L13:
        throw null;
    L14:
        this.f266c.m409o(r82);
        r02.set(r1, null);
        this.f265b++;
    L15:
        r1 = r1 - 1;
        if (r1 < 0) goto L21;
        if (((AbstractC0041r) r02.get(r1)) == null) goto L15;
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final C0043t m189f() {
        int r1 = 0;
        m184a(Integer.MAX_VALUE, 0);
        ArrayList r0 = this.f264a;
        int r2 = r0.size();
        int r3 = r2 - this.f265b;
        if (r3 == 0) goto L5;
        AbstractC0041r[] r4 = new AbstractC0041r[r3];
        if (r2 != r3) goto L9;
        r0.toArray(r4);
    L15:
        Arrays.sort(r4);
        C0043t r02 = new C0043t(r3);
    L16:
        if (r1 >= r3) goto L18;
        r02.m519v(r1, r4[r1]);
        r1 = r1 + 1;
        goto L16
    L18:
        r02.m536g();
        return r02;
    L9:
        Iterator r03 = r0.iterator();
        int r22 = 0;
    L11:
        if (r03.hasNext() == false) goto L15;
        AbstractC0041r r5 = (AbstractC0041r) r03.next();
        if (r5 == null) goto L11;
        r4[r22] = r5;
        r22 = r22 + 1;
        goto L11
    L5:
        return C0043t.f268c;
    }

    /* JADX INFO: renamed from: g */
    public final void m190g(int r7, C0165p r8) {
        int r0 = r8.m406l();
        m184a(r7, r0 - 1);
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L16;
        C0162m r2 = this.f266c.m405k(r1);
        C0162m r3 = m187e(r8.m405k(r1));
        if (r2 != null) goto L9;
        if (r3 == null) goto L15;
    L14:
        m191h(r7, r3);
    L15:
        r1 = r1 + 1;
        goto L3
    L9:
        if (r3 != null) goto L12;
        m188d(r7, 2, r2);
        goto L15
    L12:
        if (r3.m381f(r2) == true) goto L15;
        m188d(r7, 2, r2);
        goto L14
    }

    /* JADX INFO: renamed from: h */
    public final void m191h(int r5, C0162m r6) {
        int r0 = r6.m384i();
        C0162m r62 = m187e(r6);
        m184a(r5, r0);
        C0162m r1 = this.f266c.m405k(r0);
        if (r62.m381f(r1) == false) goto L5;
        return;
    L5:
        C0162m r2 = this.f266c.m404j(r62);
        if (r2 == null) goto L8;
        m186c(r5, 4, r2);
    L8:
        int r22 = this.f267d[r0];
        if (r1 != null) goto L28;
        if (r22 < 0) goto L15;
        ((AbstractC0041r) this.f264a.get(r22)).getClass();
        if (r5 != 0) goto L15;
        throw null;
    L15:
        if (r0 <= 0) goto L22;
        C0162m r12 = this.f266c.m405k(r0 - 1);
        if (r12 == null) goto L22;
        if (r12.m385k() == false) goto L22;
        m186c(r5, 6, r12);
    L22:
        if (r62.m385k() == false) goto L26;
        C0162m r02 = this.f266c.m405k(r0 + 1);
        if (r02 == null) goto L26;
        m186c(r5, 5, r02);
    L26:
        m185b(r5, 1, r62);
        throw null;
    L28:
        m185b(r5, 3, r1);
        throw null;
    }
}
