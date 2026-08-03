package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.output.InterfaceC0209k;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: j.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0156g implements InterfaceC0209k {

    /* JADX INFO: renamed from: a */
    private final C0166q f497a;

    /* JADX INFO: renamed from: b */
    private final C0168s f498b;

    /* JADX INFO: renamed from: c */
    private final C0162m f499c;

    /* JADX INFO: renamed from: d */
    private final C0164o f500d;

    public AbstractC0156g(C0166q c0166q, C0168s c0168s, C0162m c0162m, C0164o c0164o) {
        if (c0166q == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c0168s == null) {
            throw new NullPointerException("position == null");
        }
        if (c0164o == null) {
            throw new NullPointerException("sources == null");
        }
        this.f497a = c0166q;
        this.f498b = c0168s;
        this.f499c = c0162m;
        this.f500d = c0164o;
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        String strMo361g = mo361g();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f498b);
        sb.append(": ");
        sb.append(this.f497a.m413c());
        if (strMo361g != null) {
            sb.append("(");
            sb.append(strMo361g);
            sb.append(")");
        }
        C0162m c0162m = this.f499c;
        if (c0162m == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c0162m.mo107a());
        }
        sb.append(" <-");
        C0164o c0164o = this.f500d;
        int iM504B = c0164o.m504B();
        if (iM504B == 0) {
            sb.append(" .");
        } else {
            for (int i2 = 0; i2 < iM504B; i2++) {
                sb.append(" ");
                sb.append(c0164o.m513p(i2).mo107a());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo363b(InterfaceC0155f interfaceC0155f);

    /* JADX INFO: renamed from: e */
    public final boolean m364e() {
        return this.f497a.m411a();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC0197e mo365f();

    /* JADX INFO: renamed from: g */
    public String mo361g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final C0166q m366h() {
        return this.f497a;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX INFO: renamed from: i */
    public final C0168s m367i() {
        return this.f498b;
    }

    /* JADX INFO: renamed from: j */
    public final C0162m m368j() {
        return this.f499c;
    }

    /* JADX INFO: renamed from: k */
    public final C0164o m369k() {
        return this.f500d;
    }

    public final String toString() {
        String strMo361g = mo361g();
        StringBuilder sb = new StringBuilder(80);
        sb.append("Insn{");
        sb.append(this.f498b);
        sb.append(' ');
        sb.append(this.f497a);
        if (strMo361g != null) {
            sb.append(' ');
            sb.append(strMo361g);
        }
        sb.append(" :: ");
        C0162m c0162m = this.f499c;
        if (c0162m != null) {
            sb.append(c0162m);
            sb.append(" <- ");
        }
        sb.append(this.f500d);
        sb.append('}');
        return sb.toString();
    }
}
