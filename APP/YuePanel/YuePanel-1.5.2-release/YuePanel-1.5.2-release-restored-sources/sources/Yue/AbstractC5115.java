package Yue;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5115 implements InterfaceC5114 {

    /* JADX INFO: renamed from: ۥ۟ */
    public EnumC6568 f1301;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public ByteBuffer f12125 = C3625.m679();

    /* JADX INFO: renamed from: ۥ */
    public boolean f1300 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f12126 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f12127 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f12128 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f12129 = false;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۡ$ۥ */
    public static /* synthetic */ class C0648 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1302;

        static {
            int[] iArr = new int[EnumC6568.values().length];
            f1302 = iArr;
            try {
                iArr[EnumC6568.PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1302[EnumC6568.PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1302[EnumC6568.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1302[EnumC6568.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1302[EnumC6568.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1302[EnumC6568.CONTINUOUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public AbstractC5115(EnumC6568 enumC6568) {
        this.f1301 = enumC6568;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static AbstractC5115 m15785(EnumC6568 enumC6568) {
        if (enumC6568 == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (C0648.f1302[enumC6568.ordinal()]) {
            case 1:
                return new C6666();
            case 2:
                return new C6700();
            case 3:
                return new C7751();
            case 4:
                return new C3531();
            case 5:
                return new C3846();
            case 6:
                return new C4209();
            default:
                throw new IllegalArgumentException("Supplied opcode is invalid");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC5115 abstractC5115 = (AbstractC5115) obj;
        if (this.f1300 != abstractC5115.f1300 || this.f12126 != abstractC5115.f12126 || this.f12127 != abstractC5115.f12127 || this.f12128 != abstractC5115.f12128 || this.f12129 != abstractC5115.f12129 || this.f1301 != abstractC5115.f1301) {
            return false;
        }
        ByteBuffer byteBuffer = this.f12125;
        ByteBuffer byteBuffer2 = abstractC5115.f12125;
        return byteBuffer != null ? byteBuffer.equals(byteBuffer2) : byteBuffer2 == null;
    }

    public int hashCode() {
        int iHashCode = (((this.f1300 ? 1 : 0) * 31) + this.f1301.hashCode()) * 31;
        ByteBuffer byteBuffer = this.f12125;
        return ((((((((iHashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.f12126 ? 1 : 0)) * 31) + (this.f12127 ? 1 : 0)) * 31) + (this.f12128 ? 1 : 0)) * 31) + (this.f12129 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ opcode:");
        sb.append(mo15781());
        sb.append(", fin:");
        sb.append(mo15784());
        sb.append(", rsv1:");
        sb.append(mo1929());
        sb.append(", rsv2:");
        sb.append(mo15780());
        sb.append(", rsv3:");
        sb.append(mo15783());
        sb.append(", payload length:[pos:");
        sb.append(this.f12125.position());
        sb.append(", len:");
        sb.append(this.f12125.remaining());
        sb.append("], payload:");
        sb.append(this.f12125.remaining() > 1000 ? "(too big to display)" : new String(this.f12125.array()));
        sb.append(C6193.f1885);
        return sb.toString();
    }

    @Override // Yue.InterfaceC5114
    /* JADX INFO: renamed from: ۥ */
    public boolean mo1928() {
        return this.f12126;
    }

    @Override // Yue.InterfaceC5114
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo1929() {
        return this.f12127;
    }

    @Override // Yue.InterfaceC5114
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo15780() {
        return this.f12128;
    }

    @Override // Yue.InterfaceC5114
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public EnumC6568 mo15781() {
        return this.f1301;
    }

    @Override // Yue.InterfaceC5114
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo15782(InterfaceC5114 interfaceC5114) {
        ByteBuffer byteBufferMo10645 = interfaceC5114.mo10645();
        if (this.f12125 == null) {
            this.f12125 = ByteBuffer.allocate(byteBufferMo10645.remaining());
            byteBufferMo10645.mark();
            this.f12125.put(byteBufferMo10645);
            byteBufferMo10645.reset();
        } else {
            byteBufferMo10645.mark();
            ByteBuffer byteBuffer = this.f12125;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f12125;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (byteBufferMo10645.remaining() > this.f12125.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferMo10645.remaining() + this.f12125.capacity());
                this.f12125.flip();
                byteBufferAllocate.put(this.f12125);
                byteBufferAllocate.put(byteBufferMo10645);
                this.f12125 = byteBufferAllocate;
            } else {
                this.f12125.put(byteBufferMo10645);
            }
            this.f12125.rewind();
            byteBufferMo10645.reset();
        }
        this.f1300 = interfaceC5114.mo15784();
    }

    @Override // Yue.InterfaceC5114
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo15783() {
        return this.f12129;
    }

    @Override // Yue.InterfaceC5114
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo15784() {
        return this.f1300;
    }

    @Override // Yue.InterfaceC5114
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public ByteBuffer mo10645() {
        return this.f12125;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public abstract void mo10646() throws C5509;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m15786(boolean z) {
        this.f1300 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo10647(ByteBuffer byteBuffer) {
        this.f12125 = byteBuffer;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m15787(boolean z) {
        this.f12127 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m15788(boolean z) {
        this.f12128 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m15789(boolean z) {
        this.f12129 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m15790(boolean z) {
        this.f12126 = z;
    }
}
