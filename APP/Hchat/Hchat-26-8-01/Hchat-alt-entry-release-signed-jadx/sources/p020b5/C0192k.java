package p020b5;

import bsh.org.objectweb.asm.Opcodes;
import p005a5.C0016a;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p061e5.C0826a;
import p068eh.AbstractC0921a;
import p281t3.AbstractC4106c;
import p321w.AbstractC4634s;

/* JADX INFO: renamed from: b5.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0192k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f487a;

    /* JADX INFO: renamed from: b */
    public int f488b;

    /* JADX INFO: renamed from: c */
    public int f489c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0192k(C0016a c0016a, int i9, int i10) {
        this.f487a = 0;
        this.f488b = i9;
        this.f489c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int m848k(int i9) {
        if (i9 == 0) {
            return 2;
        }
        if (i9 == 1) {
            return 4;
        }
        if (i9 == 2) {
            return 1;
        }
        if (i9 == 4) {
            return 3;
        }
        C0086a.m452k(AbstractC0921a.m2249l(i9, "Unexpected visibility flag: "));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public boolean m849a() {
        return (this.f488b & 65536) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public boolean m850b() {
        return (this.f488b & 16384) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean m851c() {
        return (this.f488b & 16) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public boolean m852d() {
        return (this.f488b & Opcodes.ACC_INTERFACE) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public boolean m853e() {
        return (this.f488b & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean m854f() {
        return (this.f488b & 4) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public boolean m855g() {
        return (this.f488b & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public boolean m856h() {
        return (this.f488b & 8) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public boolean m857i() {
        return (this.f488b & 4096) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public String m858j(boolean z9) {
        int i9 = this.f488b;
        StringBuilder sb2 = new StringBuilder();
        if (m855g()) {
            sb2.append("public ");
        }
        if (m853e()) {
            sb2.append("private ");
        }
        if (m854f()) {
            sb2.append("protected ");
        }
        if (m856h()) {
            sb2.append("static ");
        }
        if (m851c()) {
            sb2.append("final ");
        }
        if ((i9 & 1024) != 0) {
            sb2.append("abstract ");
        }
        if ((i9 & Opcodes.ACC_NATIVE) != 0) {
            sb2.append("native ");
        }
        int iM8279b = AbstractC4106c.m8279b(this.f489c);
        if (iM8279b == 0) {
            if ((i9 & Opcodes.ACC_STRICT) != 0) {
                sb2.append("strict ");
            }
            if (z9) {
                if ((262144 & i9) != 0) {
                    sb2.append("/* data */ ");
                }
                if ((i9 & 32768) != 0) {
                    sb2.append("/* module-info */ ");
                }
            }
        } else if (iM8279b == 1) {
            if ((i9 & 64) != 0) {
                sb2.append("volatile ");
            }
            if ((i9 & 128) != 0) {
                sb2.append("transient ");
            }
        } else if (iM8279b == 2) {
            if ((131104 & i9) != 0) {
                sb2.append("synchronized ");
            }
            if (z9 && (i9 & 64) != 0) {
                sb2.append("/* bridge */ ");
            }
        }
        if (m857i() && z9) {
            sb2.append("/* synthetic */ ");
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public int m859l(int i9) {
        if (i9 >= 0 && i9 <= this.f488b) {
            AbstractC4634s.m9056B(i9, this.f489c, i9);
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public C0192k m860m(int i9) {
        int i10 = this.f488b;
        return (i10 & i9) != 0 ? new C0192k((~i9) & i10, this.f489c, 3) : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public int m861n(int i9) {
        if (i9 >= 0 && i9 <= this.f489c) {
            AbstractC4634s.m9057C(i9, this.f488b, i9);
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public void m862o(C0826a c0826a, int i9) {
        int i10 = this.f488b - this.f489c;
        if (i9 >= i10) {
            c0826a.write(112);
            c0826a.m2084z(i9 - i10);
        } else {
            c0826a.write(118);
            c0826a.m2084z(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f487a) {
            case 1:
                return "RawValue: type=0x" + Integer.toHexString(this.f488b) + ", value=" + this.f489c;
            case 2:
            default:
                return super.toString();
            case 3:
                int i9 = this.f489c;
                return AbstractC0921a.m2255r(AbstractC0255e.m1027p("AccessInfo: ", i9 != 1 ? i9 != 2 ? i9 != 3 ? "null" : "METHOD" : "FIELD" : "CLASS", " 0x", Integer.toHexString(this.f488b), " ("), m858j(true), ")");
        }
    }

    public /* synthetic */ C0192k(int i9, int i10, int i11) {
        this.f487a = i11;
        this.f488b = i9;
        this.f489c = i10;
    }
}
