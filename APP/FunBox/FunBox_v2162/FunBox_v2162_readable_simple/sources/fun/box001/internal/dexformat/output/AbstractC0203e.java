package fun.box001.internal.dexformat.output;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0041r;
import fun.box001.internal.dexformat.AbstractC0048y;
import fun.box001.internal.dexformat.C0025b;
import fun.box001.internal.dexformat.C0027d;
import fun.box001.internal.dexformat.writer.AbstractC0156g;
import fun.box001.internal.dexformat.writer.C0150a;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.data.C0195c;
import java.util.Arrays;

/* JADX INFO: renamed from: n.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0203e extends AbstractC0208j implements InterfaceC0209k {

    /* JADX INFO: renamed from: b */
    private Object[] f799b;

    public AbstractC0203e(int r2) {
        if (r2 == 0) goto L4;
        boolean r0 = true;
    L5:
        super(r0);
        this.f799b = new Object[r2];     // Catch: NegativeArraySizeException -> L8
        return;
    L9:
        throw new IllegalArgumentException("size < 0");
    L4:
        r0 = false;
        goto L5
    }

    /* JADX INFO: renamed from: E */
    private String m502E(String r4, String r5, boolean r6) {
        int r0 = this.f799b.length;
        StringBuilder r1 = new StringBuilder((r0 * 10) + 10);
        if (r4 == null) goto L5;
        r1.append(r4);
    L5:
        int r42 = 0;
    L6:
        if (r42 >= r0) goto L14;
        if (r42 == 0) goto L9;
        r1.append(", ");
    L9:
        Object[] r2 = this.f799b;
        if (r6 == false) goto L12;
        r1.append(((InterfaceC0209k) r2[r42]).mo107a());
    L13:
        r42 = r42 + 1;
        goto L6
    L12:
        r1.append(r2[r42]);
        goto L13
    L14:
        if (r5 == null) goto L17;
        r1.append(r5);
    L17:
        return r1.toString();
    }

    /* JADX INFO: renamed from: A */
    protected final void m503A(int r2, Object r3) {
        m537h();
        this.f799b[r2] = r3;     // Catch: ArrayIndexOutOfBoundsException -> L5
        return;
    L5:
        if (r2 >= 0) goto L9;
        throw new IndexOutOfBoundsException("n < 0");
    L9:
        throw new IndexOutOfBoundsException("n >= size()");
    }

    /* JADX INFO: renamed from: B */
    public final int m504B() {
        return this.f799b.length;
    }

    /* JADX INFO: renamed from: C */
    public final String m505C(String r2, String r3) {
        return m502E(r2, r3, true);
    }

    /* JADX INFO: renamed from: D */
    public final String m506D() {
        return m502E("array{", "}", false);
    }

    /* JADX INFO: renamed from: a */
    public String mo107a() {
        String r0 = getClass().getName();
        return m502E(r0.substring(r0.lastIndexOf(46) + 1) + '{', "}", true);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (getClass() == r3.getClass()) goto L10;
        return false;
    L10:
        return Arrays.equals(this.f799b, ((AbstractC0203e) r3).f799b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f799b);
    }

    /* JADX INFO: renamed from: j */
    public C0025b m507j(int r1) {
        return (C0025b) m516s(r1);
    }

    /* JADX INFO: renamed from: k */
    public C0027d m508k(int r1) {
        return (C0027d) m516s(r1);
    }

    /* JADX INFO: renamed from: l */
    public AbstractC0033j m509l(int r1) {
        return (AbstractC0033j) m516s(r1);
    }

    /* JADX INFO: renamed from: m */
    public AbstractC0048y m510m(int r1) {
        return (AbstractC0048y) m516s(r1);
    }

    /* JADX INFO: renamed from: n */
    public C0150a m511n(int r1) {
        return (C0150a) m516s(r1);
    }

    /* JADX INFO: renamed from: o */
    public AbstractC0156g m512o(int r1) {
        return (AbstractC0156g) m516s(r1);
    }

    /* JADX INFO: renamed from: p */
    public C0162m m513p(int r1) {
        return (C0162m) m516s(r1);
    }

    /* JADX INFO: renamed from: q */
    public AbstractC0171a m514q(int r1) {
        return (AbstractC0171a) m516s(r1);
    }

    /* JADX INFO: renamed from: r */
    public C0195c m515r(int r1) {
        return (C0195c) m516s(r1);
    }

    /* JADX INFO: renamed from: s */
    protected final Object m516s(int r4) {
        Object r1 = this.f799b[r4];     // Catch: ArrayIndexOutOfBoundsException -> L8
        if (r1 == null) goto L7;
        return r1;
    L7:
        throw new NullPointerException("unset: " + r4);     // Catch: ArrayIndexOutOfBoundsException -> L8
    L8:
        if (r4 >= 0) goto L12;
        throw new IndexOutOfBoundsException("n < 0");
    L12:
        throw new IndexOutOfBoundsException("n >= size()");
    }

    /* JADX INFO: renamed from: t */
    protected final Object m517t(int r2) {
        return this.f799b[r2];
    }

    public final String toString() {
        String r0 = getClass().getName();
        return m502E(r0.substring(r0.lastIndexOf(46) + 1) + '{', "}", false);
    }

    /* JADX INFO: renamed from: u */
    public void m518u(int r1, C0027d r2) {
        m503A(r1, r2);
    }

    /* JADX INFO: renamed from: v */
    public void m519v(int r1, AbstractC0041r r2) {
        m503A(r1, r2);
    }

    /* JADX INFO: renamed from: w */
    public void m520w(int r1, AbstractC0156g r2) {
        m503A(r1, r2);
    }

    /* JADX INFO: renamed from: x */
    public void m521x(int r1, C0162m r2) {
        m503A(r1, r2);
    }

    /* JADX INFO: renamed from: y */
    public void m522y(int r1, AbstractC0171a r2) {
        m503A(r1, r2);
    }

    /* JADX INFO: renamed from: z */
    public void m523z(int r1, C0195c r2) {
        m503A(r1, r2);
    }
}
