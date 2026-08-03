package p295u4;

import bsh.C0353j;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;
import p376z4.InterfaceC6097k;

/* JADX INFO: renamed from: u4.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4259i implements InterfaceC6097k {

    /* JADX INFO: renamed from: g */
    public final C4268r f13947g;

    /* JADX INFO: renamed from: h */
    public final C4270t f13948h;

    /* JADX INFO: renamed from: i */
    public final C4265o f13949i;

    /* JADX INFO: renamed from: j */
    public final C4266p f13950j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4259i(C4268r c4268r, C4270t c4270t, C4265o c4265o, C4266p c4266p) {
        if (c4268r == null) {
            C0353j.m1305c("opcode == null");
            throw null;
        }
        if (c4270t == null) {
            C0353j.m1305c("position == null");
            throw null;
        }
        if (c4266p == null) {
            C0353j.m1305c("sources == null");
            throw null;
        }
        this.f13947g = c4268r;
        this.f13948h = c4270t;
        this.f13949i = c4265o;
        this.f13950j = c4266p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        String strMo8552h = mo8552h();
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append(this.f13948h);
        sb2.append(": ");
        C4268r c4268r = this.f13947g;
        String string = c4268r.f13977g;
        if (string == null) {
            string = c4268r.toString();
        }
        sb2.append(string);
        if (strMo8552h != null) {
            sb2.append("(");
            sb2.append(strMo8552h);
            sb2.append(")");
        }
        C4265o c4265o = this.f13949i;
        if (c4265o == null) {
            sb2.append(" .");
        } else {
            sb2.append(" ");
            sb2.append(c4265o.m8564n(true));
        }
        sb2.append(" <-");
        C4266p c4266p = this.f13950j;
        int length = c4266p.f24601h.length;
        if (length == 0) {
            sb2.append(" .");
        } else {
            for (int i9 = 0; i9 < length; i9++) {
                sb2.append(" ");
                sb2.append(((C4265o) c4266p.m10840l(i9)).m8564n(true));
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo8553d(InterfaceC4258h interfaceC4258h);

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC4685e mo8554e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public String mo8552h() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX INFO: renamed from: i */
    public abstract AbstractC4259i mo8555i(C4683c c4683c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strMo8552h = mo8552h();
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append("Insn{");
        sb2.append(this.f13948h);
        sb2.append(' ');
        sb2.append(this.f13947g);
        if (strMo8552h != null) {
            sb2.append(' ');
            sb2.append(strMo8552h);
        }
        sb2.append(" :: ");
        C4265o c4265o = this.f13949i;
        if (c4265o != null) {
            sb2.append(c4265o);
            sb2.append(" <- ");
        }
        sb2.append(this.f13950j);
        sb2.append('}');
        return sb2.toString();
    }
}
