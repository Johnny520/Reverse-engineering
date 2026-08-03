package fun.box001.internal.dexformat.annotations;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.constants.EnumC0123E;
import fun.box001.internal.dexformat.output.C0205g;
import fun.box001.internal.dexformat.writer.C0150a;
import fun.box001.internal.dexformat.writer.C0152c;
import java.io.Serializable;

/* JADX INFO: renamed from: h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0117b {

    /* JADX INFO: renamed from: a */
    private final int f443a;

    /* JADX INFO: renamed from: b */
    private final Object f444b;

    /* JADX INFO: renamed from: c */
    private Serializable f445c;

    /* JADX INFO: renamed from: d */
    private Object f446d;

    public C0117b(int i2, String str, EnumC0123E enumC0123E, EnumC0116a enumC0116a) {
        this.f443a = i2;
        this.f444b = str;
        this.f445c = enumC0123E;
        this.f446d = enumC0116a;
    }

    /* JADX INFO: renamed from: a */
    public final C0152c m341a() {
        return (C0152c) this.f444b;
    }

    /* JADX INFO: renamed from: b */
    public final int m342b() {
        return this.f443a;
    }

    /* JADX INFO: renamed from: c */
    public final String m343c() {
        return (String) this.f444b;
    }

    /* JADX INFO: renamed from: d */
    public final int m344d() {
        return this.f443a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, n.g[]] */
    /* JADX INFO: renamed from: e */
    public final C0205g m345e(int i2) {
        if (((C0205g) this.f446d) == null) {
            C0152c c0152c = (C0152c) this.f444b;
            int iM531F = c0152c.m531F();
            ?? r2 = new C0205g[iM531F];
            C0205g c0205g = new C0205g(10);
            int iM504B = c0152c.m504B();
            for (int i3 = 0; i3 < iM504B; i3++) {
                C0150a c0150aN = c0152c.m511n(i3);
                int iM350c = c0150aN.m350c();
                C0205g c0205gM354g = c0150aN.m354g();
                int iM529o = c0205gM354g.m529o();
                if (iM529o == 0) {
                    c0205g.m524j(iM350c);
                } else {
                    for (int i4 = 0; i4 < iM529o; i4++) {
                        int iM526l = c0205gM354g.m526l(i4);
                        C0205g c0205g2 = r2[iM526l];
                        if (c0205g2 == 0) {
                            c0205g2 = new C0205g(10);
                            r2[iM526l] = c0205g2;
                        }
                        c0205g2.m524j(iM350c);
                    }
                }
            }
            for (int i5 = 0; i5 < iM531F; i5++) {
                C0205g c0205g3 = r2[i5];
                if (c0205g3 != 0) {
                    c0205g3.m530p();
                    c0205g3.m536g();
                }
            }
            c0205g.m530p();
            c0205g.m536g();
            int i6 = this.f443a;
            if (r2[i6] == 0) {
                r2[i6] = C0205g.f806e;
            }
            this.f445c = r2;
            this.f446d = c0205g;
        }
        C0205g c0205g4 = ((C0205g[]) this.f445c)[i2];
        if (c0205g4 != null) {
            return c0205g4;
        }
        throw new RuntimeException("no such block: ".concat(RuntimeDexGenerator.m11q(i2)));
    }

    public C0117b(C0152c c0152c) {
        this.f444b = c0152c;
        this.f443a = 0;
        this.f445c = null;
        this.f446d = null;
    }
}
