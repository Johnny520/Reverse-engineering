package Yue;

import Yue.C3600;

/* JADX INFO: renamed from: Yue.ۥۢۥۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nWebSocketProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketProtocol.kt\nokhttp3/internal/ws/WebSocketProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
public final class C8417 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C8417 f3480 = new C8417();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final String f3481 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f25156 = 128;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f25157 = 64;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f25158 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f25159 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f25160 = 15;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f25161 = 8;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f25162 = 128;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f25163 = 127;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f25164 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f25165 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f25166 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f25167 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f25168 = 9;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f25169 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final long f25170 = 125;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final long f25171 = 123;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f25172 = 126;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final long f25173 = 65535;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f25174 = 127;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f25175 = 1001;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f25176 = 1005;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final String m4395(@InterfaceC6399 String str) {
        C5499.m17103(str, C6659.f17103);
        return C3630.f6370.m9876(str + f3481).m9849().mo9816();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final String m4396(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m28118(@InterfaceC6399 C3600.C0192 c0192, @InterfaceC6399 byte[] bArr) {
        C5499.m17103(c0192, "cursor");
        C5499.m17103(bArr, C6659.f17103);
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = c0192.f6215;
            int i2 = c0192.f6216;
            int i3 = c0192.f6217;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (c0192.m9710() != -1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m28119(int i) {
        String strM4396 = m4396(i);
        if (strM4396 == null) {
            return;
        }
        C5499.m17100(strM4396);
        throw new IllegalArgumentException(strM4396.toString());
    }
}
