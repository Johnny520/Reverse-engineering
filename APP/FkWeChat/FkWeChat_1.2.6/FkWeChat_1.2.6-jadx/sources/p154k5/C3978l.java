package p154k5;

import ae.C0307f;
import bsh.C1259t2;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p195n5.AbstractC5494b;
import p195n5.AbstractC5495c;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3978l {

    /* JADX INFO: renamed from: a */
    public final int f11486a;

    /* JADX INFO: renamed from: b */
    public final int f11487b;

    /* JADX INFO: renamed from: c */
    public final int f11488c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3982p f11489d;

    /* JADX INFO: renamed from: e */
    public final boolean f11490e;

    public C3978l(int i10, int i11, int i12, AbstractC3982p abstractC3982p, boolean z10) {
        if (!AbstractC5495c.m22343a(i10)) {
            C9987e.m38645a("bogus opcode");
            throw null;
        }
        if (!AbstractC5495c.m22343a(i11)) {
            C9987e.m38645a("bogus family");
            throw null;
        }
        if (!AbstractC5495c.m22343a(i12)) {
            C9987e.m38645a("bogus nextOpcode");
            throw null;
        }
        if (abstractC3982p == null) {
            C1259t2.m5095a("format == null");
            throw null;
        }
        this.f11486a = i10;
        this.f11487b = i11;
        this.f11488c = i12;
        this.f11489d = abstractC3982p;
        this.f11490e = z10;
    }

    /* JADX INFO: renamed from: a */
    public int m15792a() {
        return this.f11487b;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC3982p m15793b() {
        return this.f11489d;
    }

    /* JADX INFO: renamed from: c */
    public String m15794c() {
        return AbstractC5494b.m22339b(this.f11486a);
    }

    /* JADX INFO: renamed from: d */
    public int m15795d() {
        return this.f11488c;
    }

    /* JADX INFO: renamed from: e */
    public int m15796e() {
        return this.f11486a;
    }

    /* JADX INFO: renamed from: f */
    public C3978l m15797f() {
        switch (this.f11486a) {
            case Opcodes.AALOAD /* 50 */:
                return AbstractC3979m.f11601b0;
            case Opcodes.BALOAD /* 51 */:
                return AbstractC3979m.f11596a0;
            case 52:
                return AbstractC3979m.f11611d0;
            case Opcodes.SALOAD /* 53 */:
                return AbstractC3979m.f11606c0;
            case Opcodes.ISTORE /* 54 */:
                return AbstractC3979m.f11621f0;
            case Opcodes.LSTORE /* 55 */:
                return AbstractC3979m.f11616e0;
            case Opcodes.FSTORE /* 56 */:
                return AbstractC3979m.f11631h0;
            case Opcodes.DSTORE /* 57 */:
                return AbstractC3979m.f11626g0;
            case Opcodes.ASTORE /* 58 */:
                return AbstractC3979m.f11641j0;
            case 59:
                return AbstractC3979m.f11636i0;
            case 60:
                return AbstractC3979m.f11651l0;
            case 61:
                return AbstractC3979m.f11646k0;
            default:
                C0307f.m923a("bogus opcode: ", this);
                return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m15798g() {
        return this.f11490e;
    }

    public String toString() {
        return m15794c();
    }
}
