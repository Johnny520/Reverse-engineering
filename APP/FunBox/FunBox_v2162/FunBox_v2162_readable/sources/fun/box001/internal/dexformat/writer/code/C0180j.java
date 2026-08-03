package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.writer.data.C0195c;

/* JADX INFO: renamed from: k.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0180j extends AbstractC0182l {

    /* JADX INFO: renamed from: b */
    private static final C0180j[] f689b = new C0180j[511];

    static {
        m436j(-1);
        m436j(0);
        m436j(1);
        m436j(2);
        m436j(3);
        m436j(4);
        m436j(5);
    }

    /* JADX INFO: renamed from: j */
    public static C0180j m436j(int i2) {
        C0180j[] c0180jArr = f689b;
        int length = (Integer.MAX_VALUE & i2) % c0180jArr.length;
        C0180j c0180j = c0180jArr[length];
        if (c0180j != null && c0180j.mo438h() == i2) {
            return c0180j;
        }
        C0180j c0180j2 = new C0180j(i2);
        c0180jArr[length] = c0180j2;
        return c0180j2;
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
        int iMo438h = mo438h();
        return "int{0x" + RuntimeDexGenerator.m13s(iMo438h) + " / " + iMo438h + '}';
    }
}
