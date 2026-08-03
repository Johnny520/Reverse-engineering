package Yue;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4514 {

    /* JADX INFO: renamed from: ۥ */
    public EnumC7178 f934 = null;

    /* JADX INFO: renamed from: ۥ۟ */
    public EnumC6568 f935 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static ByteBuffer m13162(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            byteBufferAllocate.put(b2);
            if (b == 13 && b2 == 10) {
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                return byteBufferAllocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static String m13163(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM13162 = m13162(byteBuffer);
        if (byteBufferM13162 == null) {
            return null;
        }
        return C3793.m10490(byteBufferM13162.array(), 0, byteBufferM13162.limit());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static InterfaceC5244 m13164(ByteBuffer byteBuffer, EnumC7178 enumC7178) throws C5512 {
        String strM13163 = m13163(byteBuffer);
        if (strM13163 == null) {
            throw new C5426(byteBuffer.capacity() + 128);
        }
        String[] strArrSplit = strM13163.split(" ", 3);
        if (strArrSplit.length != 3) {
            throw new C5512();
        }
        InterfaceC5244 interfaceC5244M13165 = enumC7178 == EnumC7178.CLIENT ? m13165(strArrSplit, strM13163) : m13166(strArrSplit, strM13163);
        String strM131632 = m13163(byteBuffer);
        while (strM131632 != null && strM131632.length() > 0) {
            String[] strArrSplit2 = strM131632.split(":", 2);
            if (strArrSplit2.length != 2) {
                throw new C5512("not an http header");
            }
            if (interfaceC5244M13165.mo16077(strArrSplit2[0])) {
                interfaceC5244M13165.put(strArrSplit2[0], interfaceC5244M13165.mo16078(strArrSplit2[0]) + C4219.f748 + strArrSplit2[1].replaceFirst("^ +", ""));
            } else {
                interfaceC5244M13165.put(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
            }
            strM131632 = m13163(byteBuffer);
        }
        if (strM131632 != null) {
            return interfaceC5244M13165;
        }
        throw new C5426();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static InterfaceC5244 m13165(String[] strArr, String str) throws C5512 {
        if (!"101".equals(strArr[1])) {
            throw new C5512(String.format("Invalid status code received: %s Status line: %s", strArr[1], str));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(strArr[0])) {
            throw new C5512(String.format("Invalid status line received: %s Status line: %s", strArr[0], str));
        }
        C5246 c5246 = new C5246();
        c5246.mo16073(Short.parseShort(strArr[1]));
        c5246.mo16074(strArr[2]);
        return c5246;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static InterfaceC5244 m13166(String[] strArr, String str) throws C5512 {
        if (!"GET".equalsIgnoreCase(strArr[0])) {
            throw new C5512(String.format("Invalid request method received: %s Status line: %s", strArr[0], str));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(strArr[2])) {
            throw new C5512(String.format("Invalid status line received: %s Status line: %s", strArr[2], str));
        }
        C5245 c5245 = new C5245();
        c5245.mo10642(strArr[1]);
        return c5245;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract EnumC5247 mo1435(InterfaceC3842 interfaceC3842, InterfaceC7374 interfaceC7374) throws C5512;

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract EnumC5247 mo1436(InterfaceC3842 interfaceC3842) throws C5512;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m13167(InterfaceC5248 interfaceC5248) {
        return interfaceC5248.mo16078(C4515.f9611).equalsIgnoreCase("websocket") && interfaceC5248.mo16078(C4515.f9612).toLowerCase(Locale.ENGLISH).contains(C5368.f13123);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m13168(int i) throws C5509 {
        if (i >= 0) {
            return i;
        }
        throw new C5509(1002, "Negative count");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public List<InterfaceC5114> m13169(EnumC6568 enumC6568, ByteBuffer byteBuffer, boolean z) {
        AbstractC5115 c3531;
        EnumC6568 enumC65682 = EnumC6568.BINARY;
        if (enumC6568 != enumC65682 && enumC6568 != EnumC6568.TEXT) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        if (this.f935 != null) {
            c3531 = new C4209();
        } else {
            this.f935 = enumC6568;
            c3531 = enumC6568 == enumC65682 ? new C3531() : enumC6568 == EnumC6568.TEXT ? new C7751() : null;
        }
        c3531.mo10647(byteBuffer);
        c3531.m15786(z);
        try {
            c3531.mo10646();
            if (z) {
                this.f935 = null;
            } else {
                this.f935 = enumC6568;
            }
            return Collections.singletonList(c3531);
        } catch (C5509 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract AbstractC4514 mo13170();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract ByteBuffer mo13171(InterfaceC5114 interfaceC5114);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract List<InterfaceC5114> mo13172(String str, boolean z);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract List<InterfaceC5114> mo13173(ByteBuffer byteBuffer, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public List<ByteBuffer> m13174(InterfaceC5248 interfaceC5248) {
        return m13177(interfaceC5248, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public List<ByteBuffer> m13175(InterfaceC5248 interfaceC5248, EnumC7178 enumC7178) {
        return m13174(interfaceC5248);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public List<ByteBuffer> m13176(InterfaceC5248 interfaceC5248, EnumC7178 enumC7178, boolean z) {
        return m13177(interfaceC5248, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public List<ByteBuffer> m13177(InterfaceC5248 interfaceC5248, boolean z) {
        StringBuilder sb = new StringBuilder(100);
        if (interfaceC5248 instanceof InterfaceC3842) {
            sb.append("GET ");
            sb.append(((InterfaceC3842) interfaceC5248).mo897());
            sb.append(" HTTP/1.1");
        } else {
            if (!(interfaceC5248 instanceof InterfaceC7374)) {
                throw new IllegalArgumentException("unknown role");
            }
            sb.append("HTTP/1.1 101 ");
            sb.append(((InterfaceC7374) interfaceC5248).mo16072());
        }
        sb.append("\r\n");
        Iterator<String> itMo16075 = interfaceC5248.mo16075();
        while (itMo16075.hasNext()) {
            String next = itMo16075.next();
            String strMo16078 = interfaceC5248.mo16078(next);
            sb.append(next);
            sb.append(": ");
            sb.append(strMo16078);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] bArrM838 = C3793.m838(sb.toString());
        byte[] bArrMo16076 = z ? interfaceC5248.mo16076() : null;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((bArrMo16076 == null ? 0 : bArrMo16076.length) + bArrM838.length);
        byteBufferAllocate.put(bArrM838);
        if (bArrMo16076 != null) {
            byteBufferAllocate.put(bArrMo16076);
        }
        byteBufferAllocate.flip();
        return Collections.singletonList(byteBufferAllocate);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public abstract EnumC3848 mo13178();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public EnumC7178 m13179() {
        return this.f934;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract InterfaceC3843 mo13180(InterfaceC3843 interfaceC3843) throws C5512;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public abstract InterfaceC5244 mo13181(InterfaceC3842 interfaceC3842, InterfaceC7375 interfaceC7375) throws C5512;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract void mo13182(C8414 c8414, InterfaceC5114 interfaceC5114) throws C5509;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m13183(InterfaceC5248 interfaceC5248) {
        String strMo16078 = interfaceC5248.mo16078("Sec-WebSocket-Version");
        if (strMo16078.length() > 0) {
            try {
                return new Integer(strMo16078.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract void mo13184();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m13185(EnumC7178 enumC7178) {
        this.f934 = enumC7178;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public abstract List<InterfaceC5114> mo13186(ByteBuffer byteBuffer) throws C5509;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public InterfaceC5248 m13187(ByteBuffer byteBuffer) throws C5512 {
        return m13164(byteBuffer, this.f934);
    }
}
