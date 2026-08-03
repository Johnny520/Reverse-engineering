package p000;

/* JADX INFO: renamed from: BD */
/* JADX INFO: loaded from: classes.dex */
public final class C0057BD implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0057BD f131a = new C0057BD();

    /* JADX INFO: renamed from: b */
    public static final C2473ru f132b = new C2473ru("kotlin.uuid.Uuid", C2250mu.f7964o);

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        String strMo850y = interfaceC0406Jc.mo850y();
        int length = strMo850y.length();
        if (length == 32) {
            long jM5161b = AbstractC2635vk.m5161b(strMo850y, 0, 16);
            long jM5161b2 = AbstractC2635vk.m5161b(strMo850y, 16, 32);
            if (jM5161b != 0 || jM5161b2 != 0) {
                return new C0014AD(jM5161b, jM5161b2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strMo850y.length() <= 64 ? strMo850y : strMo850y.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strMo850y.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jM5161b3 = AbstractC2635vk.m5161b(strMo850y, 0, 8);
            AbstractC0714Qj.m1485g(8, strMo850y);
            long jM5161b4 = AbstractC2635vk.m5161b(strMo850y, 9, 13);
            AbstractC0714Qj.m1485g(13, strMo850y);
            long jM5161b5 = AbstractC2635vk.m5161b(strMo850y, 14, 18);
            AbstractC0714Qj.m1485g(18, strMo850y);
            long jM5161b6 = AbstractC2635vk.m5161b(strMo850y, 19, 23);
            AbstractC0714Qj.m1485g(23, strMo850y);
            long j = (jM5161b4 << 16) | (jM5161b3 << 32) | jM5161b5;
            long jM5161b7 = AbstractC2635vk.m5161b(strMo850y, 24, 36) | (jM5161b6 << 48);
            if (j != 0 || jM5161b7 != 0) {
                return new C0014AD(j, jM5161b7);
            }
        }
        return C0014AD.f18c;
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f132b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        ((C0014AD) obj).toString();
        throw null;
    }
}
