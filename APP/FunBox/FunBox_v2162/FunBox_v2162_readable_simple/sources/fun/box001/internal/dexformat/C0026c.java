package fun.box001.internal.dexformat;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.writer.code.C0191u;

/* JADX INFO: renamed from: e.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0026c extends AbstractC0203e implements Comparable {

    /* JADX INFO: renamed from: c */
    public static final C0026c f88c = null;

    static {
        f88c = new C0026c(0);
    }

    /* JADX INFO: renamed from: F */
    public final int m104F(C0026c r8) {
        if (this != r8) goto L5;
        return 0;
    L5:
        int r1 = m504B();
        int r2 = r8.m504B();
        int r3 = Math.min(r1, r2);
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L11;
        int r5 = m507j(r4).m101a(r8.m507j(r4));
        if (r5 != 0) goto L9;
        r4 = r4 + 1;
        goto L6
    L9:
        return r5;
    L11:
        if (r1 >= r2) goto L14;
        return -1;
    L14:
        if (r1 <= r2) goto L17;
        return 1;
    L17:
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public final void m105G(int r2, C0191u r3, int r4) {
        m503A(r2, new C0025b(r3, r4));
    }

    /* JADX INFO: renamed from: H */
    public final String m106H(String r7, String r8) {
        StringBuilder r0 = new StringBuilder(100);
        int r1 = m504B();
        r0.append(r7);
        r0.append(r8);
        r0.append("catch ");
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L18;
        C0025b r3 = m507j(r2);
        if (r2 == 0) goto L8;
        r0.append(",\n");
        r0.append(r7);
        r0.append("  ");
    L8:
        if (r2 != (r1 - 1)) goto L15;
        int r4 = m504B();
        if (r4 != 0) goto L12;
        boolean r42 = false;
    L13:
        if (r42 == false) goto L15;
        String r43 = "<any>";
    L16:
        r0.append(r43);
        r0.append(" -> ");
        r0.append(RuntimeDexGenerator.m12r(r3.m103c()));
        r2 = r2 + 1;
        goto L3
    L12:
        r42 = m507j(r4 - 1).m102b().equals(C0191u.f700d);
    L15:
        r43 = r3.m102b().mo107a();
        goto L16
    L18:
        return r0.toString();
    }

    @Override // fun.box001.internal.dexformat.output.AbstractC0203e, fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return m106H("", "");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return m104F((C0026c) r1);
    }
}
