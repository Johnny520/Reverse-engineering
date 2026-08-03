package p000;

/* JADX INFO: renamed from: BD */
/* JADX INFO: loaded from: classes.dex */
public final class C0057BD implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0057BD f131a = null;

    /* JADX INFO: renamed from: b */
    public static final C2473ru f132b = null;

    static {
        f131a = new C0057BD();
        f132b = new C2473ru("kotlin.uuid.Uuid", C2250mu.f7964o);
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r17) {
        String r0 = r17.mo850y();
        int r1 = r0.length();
        if (r1 != 32) goto L5;
        long r7 = AbstractC2635vk.m5161b(r0, 0, 16);
        long r02 = AbstractC2635vk.m5161b(r0, 16, 32);
        if (r7 != 0) goto L26;
        if (r02 != 0) goto L26;
    L24:
        return C0014AD.f18c;
    L26:
        return new C0014AD(r7, r02);
    L5:
        if (r1 == 36) goto L12;
        StringBuilder r2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
        if (r0.length() > 64) goto L9;
        String r3 = r0;
    L10:
        r2.append(r3);
        r2.append("\" of length ");
        r2.append(r0.length());
        throw new IllegalArgumentException(r2.toString());
    L9:
        r3 = r0.substring(0, 64).concat("...");
        goto L10
    L12:
        long r8 = AbstractC2635vk.m5161b(r0, 0, 8);
        AbstractC0714Qj.m1485g(8, r0);
        long r10 = AbstractC2635vk.m5161b(r0, 9, 13);
        AbstractC0714Qj.m1485g(13, r0);
        long r12 = AbstractC2635vk.m5161b(r0, 14, 18);
        AbstractC0714Qj.m1485g(18, r0);
        long r14 = AbstractC2635vk.m5161b(r0, 19, 23);
        AbstractC0714Qj.m1485g(23, r0);
        long r22 = r10 << 16;
        long r23 = (r22 | (r8 << 32)) | r12;
        long r03 = AbstractC2635vk.m5161b(r0, 24, 36) | (r14 << 48);
        if (r23 != 0) goto L18;
        if (r03 == 0) goto L24;
    L18:
        return new C0014AD(r23, r03);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f132b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        ((C0014AD) r2).toString();
        throw null;
    }
}
