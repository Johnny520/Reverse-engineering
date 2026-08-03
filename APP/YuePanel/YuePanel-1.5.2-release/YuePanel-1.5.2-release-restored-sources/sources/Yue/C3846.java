package Yue;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3846 extends AbstractC4214 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f7323 = 1000;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f7324 = 1001;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f7325 = 1002;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f7326 = 1003;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f7327 = 1005;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f7328 = 1006;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f7329 = 1007;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f7330 = 1008;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f7331 = 1009;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f7332 = 1010;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f7333 = 1011;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f7334 = 1012;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f7335 = 1013;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f7336 = 1014;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f7337 = 1015;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f7338 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f7339 = -2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f7340 = -3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f7341;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public String f7342;

    public C3846() {
        super(EnumC6568.CLOSING);
        m10651("");
        m10650(1000);
    }

    @Override // Yue.AbstractC5115
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C3846 c3846 = (C3846) obj;
        if (this.f7341 != c3846.f7341) {
            return false;
        }
        String str = this.f7342;
        String str2 = c3846.f7342;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // Yue.AbstractC5115
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + this.f7341) * 31;
        String str = this.f7342;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // Yue.AbstractC5115
    public String toString() {
        return super.toString() + "code: " + this.f7341;
    }

    @Override // Yue.AbstractC5115, Yue.InterfaceC5114
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public ByteBuffer mo10645() {
        return this.f7341 == 1005 ? C3625.m679() : super.mo10645();
    }

    @Override // Yue.AbstractC4214, Yue.AbstractC5115
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo10646() throws C5509 {
        super.mo10646();
        if (this.f7341 == 1007 && this.f7342.isEmpty()) {
            throw new C5509(1007, "Received text is no valid utf8 string!");
        }
        if (this.f7341 == 1005 && this.f7342.length() > 0) {
            throw new C5509(1002, "A close frame must have a closecode if it has a reason");
        }
        int i = this.f7341;
        if (i > 1015 && i < 3000) {
            throw new C5509(1002, "Trying to send an illegal close code!");
        }
        if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
            throw new C5511("closecode must not be sent over the wire: " + this.f7341);
        }
    }

    @Override // Yue.AbstractC5115
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void mo10647(ByteBuffer byteBuffer) {
        this.f7341 = 1005;
        this.f7342 = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f7341 = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.f7341 = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBuffer.getShort());
            byteBufferAllocate.position(0);
            this.f7341 = byteBufferAllocate.getInt();
        }
        byteBuffer.reset();
        try {
            m10653(byteBuffer, byteBuffer.position());
        } catch (C5509 unused) {
            this.f7341 = 1007;
            this.f7342 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m10648() {
        return this.f7341;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public String m10649() {
        return this.f7342;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m10650(int i) {
        this.f7341 = i;
        if (i == 1015) {
            this.f7341 = 1005;
            this.f7342 = "";
        }
        m10652();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m10651(String str) {
        if (str == null) {
            str = "";
        }
        this.f7342 = str;
        m10652();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m10652() {
        byte[] bArrM10493 = C3793.m10493(this.f7342);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.f7341);
        byteBufferAllocate.position(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrM10493.length + 2);
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.put(bArrM10493);
        byteBufferAllocate2.rewind();
        super.mo10647(byteBufferAllocate2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m10653(ByteBuffer byteBuffer, int i) throws C5509 {
        try {
            try {
                byteBuffer.position(byteBuffer.position() + 2);
                this.f7342 = C3793.m10491(byteBuffer);
            } catch (IllegalArgumentException unused) {
                throw new C5509(1007);
            }
        } finally {
            byteBuffer.position(i);
        }
    }
}
