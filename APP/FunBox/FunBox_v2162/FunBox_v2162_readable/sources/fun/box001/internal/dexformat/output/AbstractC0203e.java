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

    public AbstractC0203e(int i2) {
        super(i2 != 0);
        try {
            this.f799b = new Object[i2];
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    /* JADX INFO: renamed from: E */
    private String m502E(String str, String str2, boolean z) {
        int length = this.f799b.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
            }
            Object[] objArr = this.f799b;
            if (z) {
                sb.append(((InterfaceC0209k) objArr[i2]).mo107a());
            } else {
                sb.append(objArr[i2]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: A */
    protected final void m503A(int i2, Object obj) {
        m537h();
        try {
            this.f799b[i2] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i2 >= 0) {
                throw new IndexOutOfBoundsException("n >= size()");
            }
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    /* JADX INFO: renamed from: B */
    public final int m504B() {
        return this.f799b.length;
    }

    /* JADX INFO: renamed from: C */
    public final String m505C(String str, String str2) {
        return m502E(str, str2, true);
    }

    /* JADX INFO: renamed from: D */
    public final String m506D() {
        return m502E("array{", "}", false);
    }

    /* JADX INFO: renamed from: a */
    public String mo107a() {
        String name = getClass().getName();
        return m502E(name.substring(name.lastIndexOf(46) + 1) + '{', "}", true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f799b, ((AbstractC0203e) obj).f799b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f799b);
    }

    /* JADX INFO: renamed from: j */
    public C0025b m507j(int i2) {
        return (C0025b) m516s(i2);
    }

    /* JADX INFO: renamed from: k */
    public C0027d m508k(int i2) {
        return (C0027d) m516s(i2);
    }

    /* JADX INFO: renamed from: l */
    public AbstractC0033j m509l(int i2) {
        return (AbstractC0033j) m516s(i2);
    }

    /* JADX INFO: renamed from: m */
    public AbstractC0048y m510m(int i2) {
        return (AbstractC0048y) m516s(i2);
    }

    /* JADX INFO: renamed from: n */
    public C0150a m511n(int i2) {
        return (C0150a) m516s(i2);
    }

    /* JADX INFO: renamed from: o */
    public AbstractC0156g m512o(int i2) {
        return (AbstractC0156g) m516s(i2);
    }

    /* JADX INFO: renamed from: p */
    public C0162m m513p(int i2) {
        return (C0162m) m516s(i2);
    }

    /* JADX INFO: renamed from: q */
    public AbstractC0171a m514q(int i2) {
        return (AbstractC0171a) m516s(i2);
    }

    /* JADX INFO: renamed from: r */
    public C0195c m515r(int i2) {
        return (C0195c) m516s(i2);
    }

    /* JADX INFO: renamed from: s */
    protected final Object m516s(int i2) {
        try {
            Object obj = this.f799b[i2];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i2 < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    /* JADX INFO: renamed from: t */
    protected final Object m517t(int i2) {
        return this.f799b[i2];
    }

    public final String toString() {
        String name = getClass().getName();
        return m502E(name.substring(name.lastIndexOf(46) + 1) + '{', "}", false);
    }

    /* JADX INFO: renamed from: u */
    public void m518u(int i2, C0027d c0027d) {
        m503A(i2, c0027d);
    }

    /* JADX INFO: renamed from: v */
    public void m519v(int i2, AbstractC0041r abstractC0041r) {
        m503A(i2, abstractC0041r);
    }

    /* JADX INFO: renamed from: w */
    public void m520w(int i2, AbstractC0156g abstractC0156g) {
        m503A(i2, abstractC0156g);
    }

    /* JADX INFO: renamed from: x */
    public void m521x(int i2, C0162m c0162m) {
        m503A(i2, c0162m);
    }

    /* JADX INFO: renamed from: y */
    public void m522y(int i2, AbstractC0171a abstractC0171a) {
        m503A(i2, abstractC0171a);
    }

    /* JADX INFO: renamed from: z */
    public void m523z(int i2, C0195c c0195c) {
        m503A(i2, c0195c);
    }
}
