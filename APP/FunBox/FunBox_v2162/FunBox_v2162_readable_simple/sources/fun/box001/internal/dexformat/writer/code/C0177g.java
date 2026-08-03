package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.writer.data.C0195c;

/* JADX INFO: renamed from: k.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0177g extends AbstractC0182l {
    private C0177g(char r1) {
        super(r1);
    }

    /* JADX INFO: renamed from: j */
    public static C0177g m433j(char r1) {
        return new C0177g(r1);
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return Integer.toString(mo438h());
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f764i;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "char";
    }

    public final String toString() {
        int r0 = mo438h();
        return "char{0x" + RuntimeDexGenerator.m11q(r0) + " / " + r0 + '}';
    }
}
