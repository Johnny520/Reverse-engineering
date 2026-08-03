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

    public C0117b(int r1, String r2, EnumC0123E r3, EnumC0116a r4) {
        this.f443a = r1;
        this.f444b = r2;
        this.f445c = r3;
        this.f446d = r4;
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
    public final C0205g m345e(int r15) {
        if (((C0205g) this.f446d) != null) goto L25;
        C0152c r0 = (C0152c) this.f444b;
        int r1 = r0.m531F();
        ?? r2 = new C0205g[r1];
        C0205g r3 = new C0205g(10);
        int r5 = r0.m504B();
        int r6 = 0;
        int r7 = 0;
    L5:
        if (r7 >= r5) goto L16;
        C0150a r8 = r0.m511n(r7);
        int r9 = r8.m350c();
        C0205g r82 = r8.m354g();
        int r10 = r82.m529o();
        if (r10 != 0) goto L9;
        r3.m524j(r9);
    L15:
        r7 = r7 + 1;
        goto L5
    L9:
        int r11 = 0;
    L10:
        if (r11 >= r10) goto L15;
        int r12 = r82.m526l(r11);
        C0205g r13 = r2[r12];
        if (r13 != 0) goto L14;
        r13 = new C0205g(10);
        r2[r12] = r13;
    L14:
        r13.m524j(r9);
        r11 = r11 + 1;
    L16:
        if (r6 >= r1) goto L21;
        C0205g r02 = r2[r6];
        if (r02 == 0) goto L20;
        r02.m530p();
        r02.m536g();
    L20:
        r6 = r6 + 1;
        goto L16
    L21:
        r3.m530p();
        r3.m536g();
        int r03 = this.f443a;
        if (r2[r03] != 0) goto L24;
        r2[r03] = C0205g.f806e;
    L24:
        this.f445c = r2;
        this.f446d = r3;
    L25:
        C0205g r04 = ((C0205g[]) this.f445c)[r15];
        if (r04 == null) goto L29;
        return r04;
    L29:
        throw new RuntimeException("no such block: ".concat(RuntimeDexGenerator.m11q(r15)));
    }

    public C0117b(C0152c r1) {
        this.f444b = r1;
        this.f443a = 0;
        this.f445c = null;
        this.f446d = null;
    }
}
