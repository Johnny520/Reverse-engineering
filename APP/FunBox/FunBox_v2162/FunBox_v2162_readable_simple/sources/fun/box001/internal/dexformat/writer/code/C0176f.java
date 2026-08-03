package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.writer.data.C0195c;

/* JADX INFO: renamed from: k.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0176f extends AbstractC0182l {
    private C0176f(byte r1) {
        super(r1);
    }

    /* JADX INFO: renamed from: j */
    public static C0176f m432j(byte r1) {
        return new C0176f(r1);
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return Integer.toString(mo438h());
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f763h;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "byte";
    }

    public final String toString() {
        int r0 = mo438h();
        return "byte{0x" + RuntimeDexGenerator.m10p(r0) + " / " + r0 + '}';
    }
}
