package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.writer.data.C0195c;

/* JADX INFO: renamed from: k.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0180j extends AbstractC0182l {

    /* JADX INFO: renamed from: b */
    private static final C0180j[] f689b = null;

    static {
        f689b = new C0180j[511];
        m436j(-1);
        m436j(0);
        m436j(1);
        m436j(2);
        m436j(3);
        m436j(4);
        m436j(5);
    }

    /* JADX INFO: renamed from: j */
    public static C0180j m436j(int r4) {
        C0180j[] r1 = f689b;
        int r0 = (Integer.MAX_VALUE & r4) % r1.length;
        C0180j r2 = r1[r0];
        if (r2 != null) goto L5;
    L7:
        C0180j r22 = new C0180j(r4);
        r1[r0] = r22;
        return r22;
    L5:
        if (r2.mo438h() != r4) goto L7;
        return r2;
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return Integer.toString(mo438h());
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f767l;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "int";
    }

    public final String toString() {
        int r0 = mo438h();
        return "int{0x" + RuntimeDexGenerator.m13s(r0) + " / " + r0 + '}';
    }
}
