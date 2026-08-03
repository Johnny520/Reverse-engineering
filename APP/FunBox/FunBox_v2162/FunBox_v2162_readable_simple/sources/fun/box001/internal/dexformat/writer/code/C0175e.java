package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexformat.writer.data.C0195c;

/* JADX INFO: renamed from: k.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0175e extends AbstractC0182l {

    /* JADX INFO: renamed from: b */
    public static final C0175e f687b = null;

    /* JADX INFO: renamed from: c */
    public static final C0175e f688c = null;

    static {
        f687b = new C0175e(false);
        f688c = new C0175e(true);
    }

    private C0175e(boolean r1) {
        super(r1 ? 1 : 0);
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        if (mo438h() != 0) goto L5;
        boolean r0 = false;
    L6:
        if (r0 == false) goto L8;
        return "true";
    L8:
        return "false";
    L5:
        r0 = true;
        goto L6
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f762g;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "boolean";
    }

    public final String toString() {
        if (mo438h() != 0) goto L5;
        boolean r0 = false;
    L6:
        if (r0 == false) goto L8;
        return "boolean{true}";
    L8:
        return "boolean{false}";
    L5:
        r0 = true;
        goto L6
    }
}
