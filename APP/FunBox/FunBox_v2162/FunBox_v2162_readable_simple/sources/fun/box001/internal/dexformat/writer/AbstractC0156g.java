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

    public AbstractC0156g(C0166q r1, C0168s r2, C0162m r3, C0164o r4) {
        if (r1 == null) goto L13;
        if (r2 == null) goto L11;
        if (r4 == null) goto L9;
        this.f497a = r1;
        this.f498b = r2;
        this.f499c = r3;
        this.f500d = r4;
        return;
    L9:
        throw new NullPointerException("sources == null");
    L11:
        throw new NullPointerException("position == null");
    L13:
        throw new NullPointerException("opcode == null");
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        String r0 = mo361g();
        StringBuilder r1 = new StringBuilder(80);
        r1.append(this.f498b);
        r1.append(": ");
        r1.append(this.f497a.m413c());
        if (r0 == null) goto L5;
        r1.append("(");
        r1.append(r0);
        r1.append(")");
    L5:
        C0162m r3 = this.f499c;
        if (r3 != null) goto L8;
        r1.append(" .");
    L9:
        r1.append(" <-");
        C0164o r32 = this.f500d;
        int r4 = r32.m504B();
        if (r4 != 0) goto L12;
        r1.append(" .");
    L16:
        return r1.toString();
    L12:
        int r02 = 0;
    L13:
        if (r02 >= r4) goto L16;
        r1.append(" ");
        r1.append(r32.m513p(r02).mo107a());
        r02 = r02 + 1;
        goto L13
    L8:
        r1.append(" ");
        r1.append(r3.mo107a());
        goto L9
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo363b(InterfaceC0155f r1);

    /* JADX INFO: renamed from: e */
    public final boolean m364e() {
        return this.f497a.m411a();
    }

    public final boolean equals(Object r1) {
        if (this != r1) goto L4;
        return true;
    L4:
        return false;
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
        String r0 = mo361g();
        StringBuilder r1 = new StringBuilder(80);
        r1.append("Insn{");
        r1.append(this.f498b);
        r1.append(' ');
        r1.append(this.f497a);
        if (r0 == null) goto L5;
        r1.append(' ');
        r1.append(r0);
    L5:
        r1.append(" :: ");
        C0162m r02 = this.f499c;
        if (r02 == null) goto L8;
        r1.append(r02);
        r1.append(" <- ");
    L8:
        r1.append(this.f500d);
        r1.append('}');
        return r1.toString();
    }
}
