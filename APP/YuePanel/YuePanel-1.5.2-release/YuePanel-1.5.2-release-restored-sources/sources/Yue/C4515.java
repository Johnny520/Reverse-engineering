package Yue;

import com.google.flatbuffers.reflection.BaseType;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4515 extends AbstractC4514 {

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final String f9607 = "Sec-WebSocket-Key";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final String f9608 = "Sec-WebSocket-Protocol";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final String f9609 = "Sec-WebSocket-Extensions";

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final String f9610 = "Sec-WebSocket-Accept";

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final String f9611 = "Upgrade";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f9612 = "Connection";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f9613 = false;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC5866 f9614;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public InterfaceC5392 f9615;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InterfaceC5392 f9616;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public List<InterfaceC5392> f9617;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public InterfaceC5392 f9618;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public InterfaceC5398 f9619;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public List<InterfaceC5398> f9620;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public InterfaceC5114 f9621;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final List<ByteBuffer> f9622;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public ByteBuffer f9623;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final SecureRandom f9624;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int f9625;

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠۠$ۥ */
    public class C0421 {

        /* JADX INFO: renamed from: ۥ */
        public int f936;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f937;

        public C0421(int i, int i2) {
            this.f936 = i;
            this.f937 = i2;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m13219() {
            return this.f936;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m13220() {
            return this.f937;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4515() {
        this((List<InterfaceC5392>) Collections.emptyList());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4515 c4515 = (C4515) obj;
        if (this.f9625 != c4515.m13200()) {
            return false;
        }
        InterfaceC5392 interfaceC5392 = this.f9615;
        if (interfaceC5392 == null ? c4515.m13196() != null : !interfaceC5392.equals(c4515.m13196())) {
            return false;
        }
        InterfaceC5398 interfaceC5398 = this.f9619;
        InterfaceC5398 interfaceC5398M13202 = c4515.m13202();
        return interfaceC5398 != null ? interfaceC5398.equals(interfaceC5398M13202) : interfaceC5398M13202 == null;
    }

    public int hashCode() {
        InterfaceC5392 interfaceC5392 = this.f9615;
        int iHashCode = (interfaceC5392 != null ? interfaceC5392.hashCode() : 0) * 31;
        InterfaceC5398 interfaceC5398 = this.f9619;
        int iHashCode2 = (iHashCode + (interfaceC5398 != null ? interfaceC5398.hashCode() : 0)) * 31;
        int i = this.f9625;
        return iHashCode2 + (i ^ (i >>> 32));
    }

    @Override // Yue.AbstractC4514
    public String toString() {
        String string = super.toString();
        if (m13196() != null) {
            string = string + " extension: " + m13196().toString();
        }
        if (m13202() != null) {
            string = string + " protocol: " + m13202().toString();
        }
        return string + " max frame size: " + this.f9625;
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ */
    public EnumC5247 mo1435(InterfaceC3842 interfaceC3842, InterfaceC7374 interfaceC7374) throws C5512 {
        if (!m13167(interfaceC7374)) {
            this.f9614.mo14160("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return EnumC5247.NOT_MATCHED;
        }
        if (!interfaceC3842.mo16077(f9607) || !interfaceC7374.mo16077(f9610)) {
            this.f9614.mo14160("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return EnumC5247.NOT_MATCHED;
        }
        if (!m13194(interfaceC3842.mo16078(f9607)).equals(interfaceC7374.mo16078(f9610))) {
            this.f9614.mo14160("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return EnumC5247.NOT_MATCHED;
        }
        EnumC5247 enumC5247 = EnumC5247.NOT_MATCHED;
        String strMo16078 = interfaceC7374.mo16078("Sec-WebSocket-Extensions");
        Iterator<InterfaceC5392> it = this.f9617.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC5392 next = it.next();
            if (next.mo12601(strMo16078)) {
                this.f9615 = next;
                enumC5247 = EnumC5247.MATCHED;
                this.f9614.mo14133("acceptHandshakeAsClient - Matching extension found: {}", next);
                break;
            }
        }
        EnumC5247 enumC5247M13191 = m13191(interfaceC7374.mo16078(f9608));
        EnumC5247 enumC52472 = EnumC5247.MATCHED;
        if (enumC5247M13191 == enumC52472 && enumC5247 == enumC52472) {
            return enumC52472;
        }
        this.f9614.mo14160("acceptHandshakeAsClient - No matching extension or protocol found.");
        return EnumC5247.NOT_MATCHED;
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ۟ */
    public EnumC5247 mo1436(InterfaceC3842 interfaceC3842) throws C5512 {
        if (m13183(interfaceC3842) != 13) {
            this.f9614.mo14160("acceptHandshakeAsServer - Wrong websocket version.");
            return EnumC5247.NOT_MATCHED;
        }
        EnumC5247 enumC5247 = EnumC5247.NOT_MATCHED;
        String strMo16078 = interfaceC3842.mo16078("Sec-WebSocket-Extensions");
        Iterator<InterfaceC5392> it = this.f9617.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC5392 next = it.next();
            if (next.mo1306(strMo16078)) {
                this.f9615 = next;
                enumC5247 = EnumC5247.MATCHED;
                this.f9614.mo14133("acceptHandshakeAsServer - Matching extension found: {}", next);
                break;
            }
        }
        EnumC5247 enumC5247M13191 = m13191(interfaceC3842.mo16078(f9608));
        EnumC5247 enumC52472 = EnumC5247.MATCHED;
        if (enumC5247M13191 == enumC52472 && enumC5247 == enumC52472) {
            return enumC52472;
        }
        this.f9614.mo14160("acceptHandshakeAsServer - No matching extension or protocol found.");
        return EnumC5247.NOT_MATCHED;
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public AbstractC4514 mo13170() {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC5392> it = m13197().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo1305());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<InterfaceC5398> it2 = m13198().iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().mo2170());
        }
        return new C4515(arrayList, arrayList2, this.f9625);
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public ByteBuffer mo13171(InterfaceC5114 interfaceC5114) {
        m13196().mo12599(interfaceC5114);
        if (this.f9614.mo14141()) {
            this.f9614.mo14134("afterEnconding({}): {}", Integer.valueOf(interfaceC5114.mo10645().remaining()), interfaceC5114.mo10645().remaining() > 1000 ? "too big to display" : new String(interfaceC5114.mo10645().array()));
        }
        return m13192(interfaceC5114);
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public List<InterfaceC5114> mo13172(String str, boolean z) {
        C7751 c7751 = new C7751();
        c7751.mo10647(ByteBuffer.wrap(C3793.m10493(str)));
        c7751.m15790(z);
        try {
            c7751.mo10646();
            return Collections.singletonList(c7751);
        } catch (C5509 e) {
            throw new C6401(e);
        }
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public List<InterfaceC5114> mo13173(ByteBuffer byteBuffer, boolean z) {
        C3531 c3531 = new C3531();
        c3531.mo10647(byteBuffer);
        c3531.m15790(z);
        try {
            c3531.mo10646();
            return Collections.singletonList(c3531);
        } catch (C5509 e) {
            throw new C6401(e);
        }
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public EnumC3848 mo13178() {
        return EnumC3848.TWOWAY;
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public InterfaceC3843 mo13180(InterfaceC3843 interfaceC3843) {
        interfaceC3843.put(f9611, "websocket");
        interfaceC3843.put(f9612, f9611);
        byte[] bArr = new byte[16];
        this.f9624.nextBytes(bArr);
        interfaceC3843.put(f9607, C3510.m9395(bArr));
        interfaceC3843.put("Sec-WebSocket-Version", "13");
        StringBuilder sb = new StringBuilder();
        for (InterfaceC5392 interfaceC5392 : this.f9617) {
            if (interfaceC5392.mo12602() != null && interfaceC5392.mo12602().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(interfaceC5392.mo12602());
            }
        }
        if (sb.length() != 0) {
            interfaceC3843.put("Sec-WebSocket-Extensions", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (InterfaceC5398 interfaceC5398 : this.f9620) {
            if (interfaceC5398.mo2171().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(interfaceC5398.mo2171());
            }
        }
        if (sb2.length() != 0) {
            interfaceC3843.put(f9608, sb2.toString());
        }
        return interfaceC3843;
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public InterfaceC5244 mo13181(InterfaceC3842 interfaceC3842, InterfaceC7375 interfaceC7375) throws C5512 {
        interfaceC7375.put(f9611, "websocket");
        interfaceC7375.put(f9612, interfaceC3842.mo16078(f9612));
        String strMo16078 = interfaceC3842.mo16078(f9607);
        if (strMo16078 == null || "".equals(strMo16078)) {
            throw new C5512("missing Sec-WebSocket-Key");
        }
        interfaceC7375.put(f9610, m13194(strMo16078));
        if (m13196().mo12603().length() != 0) {
            interfaceC7375.put("Sec-WebSocket-Extensions", m13196().mo12603());
        }
        if (m13202() != null && m13202().mo2171().length() != 0) {
            interfaceC7375.put(f9608, m13202().mo2171());
        }
        interfaceC7375.mo16074("Web Socket Protocol Handshake");
        interfaceC7375.put("Server", "TooTallNate Java-WebSocket");
        interfaceC7375.put("Date", m13204());
        return interfaceC7375;
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo13182(C8414 c8414, InterfaceC5114 interfaceC5114) throws C5509 {
        EnumC6568 enumC6568Mo15781 = interfaceC5114.mo15781();
        if (enumC6568Mo15781 == EnumC6568.CLOSING) {
            m13208(c8414, interfaceC5114);
            return;
        }
        if (enumC6568Mo15781 == EnumC6568.PING) {
            c8414.m28103().mo28038(c8414, interfaceC5114);
            return;
        }
        if (enumC6568Mo15781 == EnumC6568.PONG) {
            c8414.m28111();
            c8414.m28103().mo28035(c8414, interfaceC5114);
            return;
        }
        if (!interfaceC5114.mo15784() || enumC6568Mo15781 == EnumC6568.CONTINUOUS) {
            m13209(c8414, interfaceC5114, enumC6568Mo15781);
            return;
        }
        if (this.f9621 != null) {
            this.f9614.error("Protocol error: Continuous frame sequence not completed.");
            throw new C5509(1002, "Continuous frame sequence not completed.");
        }
        if (enumC6568Mo15781 == EnumC6568.TEXT) {
            m13212(c8414, interfaceC5114);
        } else if (enumC6568Mo15781 == EnumC6568.BINARY) {
            m13207(c8414, interfaceC5114);
        } else {
            this.f9614.error("non control or continious frame expected");
            throw new C5509(1002, "non control or continious frame expected");
        }
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo13184() {
        this.f9623 = null;
        InterfaceC5392 interfaceC5392 = this.f9615;
        if (interfaceC5392 != null) {
            interfaceC5392.mo12604();
        }
        this.f9615 = new C4339();
        this.f9619 = null;
    }

    @Override // Yue.AbstractC4514
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public List<InterfaceC5114> mo13186(ByteBuffer byteBuffer) throws C5509 {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f9623 == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.f9623.remaining();
                if (iRemaining2 > iRemaining) {
                    this.f9623.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                    byteBuffer.position(byteBuffer.position() + iRemaining);
                    return Collections.emptyList();
                }
                this.f9623.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                byteBuffer.position(byteBuffer.position() + iRemaining2);
                linkedList.add(m13215((ByteBuffer) this.f9623.duplicate().position(0)));
                this.f9623 = null;
            } catch (C5425 e) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m13168(e.m2197()));
                this.f9623.rewind();
                byteBufferAllocate.put(this.f9623);
                this.f9623 = byteBufferAllocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(m13215(byteBuffer));
            } catch (C5425 e2) {
                byteBuffer.reset();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(m13168(e2.m2197()));
                this.f9623 = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m13188(ByteBuffer byteBuffer) {
        synchronized (this.f9622) {
            this.f9622.add(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m13189() throws C5697 {
        long jM13195 = m13195();
        if (jM13195 <= this.f9625) {
            return;
        }
        m13190();
        this.f9614.mo14134("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.f9625), Long.valueOf(jM13195));
        throw new C5697(this.f9625);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m13190() {
        synchronized (this.f9622) {
            this.f9622.clear();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final EnumC5247 m13191(String str) {
        for (InterfaceC5398 interfaceC5398 : this.f9620) {
            if (interfaceC5398.mo16884(str)) {
                this.f9619 = interfaceC5398;
                this.f9614.mo14133("acceptHandshake - Matching protocol found: {}", interfaceC5398);
                return EnumC5247.MATCHED;
            }
        }
        return EnumC5247.NOT_MATCHED;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final ByteBuffer m13192(InterfaceC5114 interfaceC5114) {
        ByteBuffer byteBufferMo10645 = interfaceC5114.mo10645();
        int i = 0;
        boolean z = this.f934 == EnumC7178.CLIENT;
        int iM13205 = m13205(byteBufferMo10645);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iM13205 > 1 ? iM13205 + 1 : iM13205) + 1 + (z ? 4 : 0) + byteBufferMo10645.remaining());
        byte bM13193 = (byte) (m13193(interfaceC5114.mo15781()) | ((byte) (interfaceC5114.mo15784() ? -128 : 0)));
        if (interfaceC5114.mo1929()) {
            bM13193 = (byte) (bM13193 | m13203(1));
        }
        if (interfaceC5114.mo15780()) {
            bM13193 = (byte) (bM13193 | m13203(2));
        }
        if (interfaceC5114.mo15783()) {
            bM13193 = (byte) (m13203(3) | bM13193);
        }
        byteBufferAllocate.put(bM13193);
        byte[] bArrM13213 = m13213(byteBufferMo10645.remaining(), iM13205);
        if (iM13205 == 1) {
            byteBufferAllocate.put((byte) (bArrM13213[0] | m13199(z)));
        } else if (iM13205 == 2) {
            byteBufferAllocate.put((byte) (m13199(z) | 126));
            byteBufferAllocate.put(bArrM13213);
        } else {
            if (iM13205 != 8) {
                throw new IllegalStateException("Size representation not supported/specified");
            }
            byteBufferAllocate.put((byte) (m13199(z) | C3626.f6362));
            byteBufferAllocate.put(bArrM13213);
        }
        if (z) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.putInt(this.f9624.nextInt());
            byteBufferAllocate.put(byteBufferAllocate2.array());
            while (byteBufferMo10645.hasRemaining()) {
                byteBufferAllocate.put((byte) (byteBufferMo10645.get() ^ byteBufferAllocate2.get(i % 4)));
                i++;
            }
        } else {
            byteBufferAllocate.put(byteBufferMo10645);
            byteBufferMo10645.flip();
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final byte m13193(EnumC6568 enumC6568) {
        if (enumC6568 == EnumC6568.CONTINUOUS) {
            return (byte) 0;
        }
        if (enumC6568 == EnumC6568.TEXT) {
            return (byte) 1;
        }
        if (enumC6568 == EnumC6568.BINARY) {
            return (byte) 2;
        }
        if (enumC6568 == EnumC6568.CLOSING) {
            return (byte) 8;
        }
        if (enumC6568 == EnumC6568.PING) {
            return (byte) 9;
        }
        if (enumC6568 == EnumC6568.PONG) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + enumC6568.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final String m13194(String str) {
        try {
            return C3510.m9395(MessageDigest.getInstance("SHA1").digest((str.trim() + C8417.f3481).getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final long m13195() {
        long jLimit;
        synchronized (this.f9622) {
            try {
                Iterator<ByteBuffer> it = this.f9622.iterator();
                jLimit = 0;
                while (it.hasNext()) {
                    jLimit += (long) it.next().limit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jLimit;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public InterfaceC5392 m13196() {
        return this.f9615;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public List<InterfaceC5392> m13197() {
        return this.f9617;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public List<InterfaceC5398> m13198() {
        return this.f9620;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final byte m13199(boolean z) {
        if (z) {
            return C3626.f423;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int m13200() {
        return this.f9625;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final ByteBuffer m13201() throws C5697 {
        ByteBuffer byteBufferAllocate;
        synchronized (this.f9622) {
            try {
                Iterator<ByteBuffer> it = this.f9622.iterator();
                long jLimit = 0;
                while (it.hasNext()) {
                    jLimit += (long) it.next().limit();
                }
                m13189();
                byteBufferAllocate = ByteBuffer.allocate((int) jLimit);
                Iterator<ByteBuffer> it2 = this.f9622.iterator();
                while (it2.hasNext()) {
                    byteBufferAllocate.put(it2.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public InterfaceC5398 m13202() {
        return this.f9619;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final byte m13203(int i) {
        if (i == 1) {
            return (byte) 64;
        }
        if (i == 2) {
            return (byte) 32;
        }
        if (i != 3) {
            return (byte) 0;
        }
        return BaseType.Union;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final String m13204() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final int m13205(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        return byteBuffer.remaining() <= 65535 ? 2 : 8;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final void m13206(C8414 c8414, RuntimeException runtimeException) {
        this.f9614.error("Runtime exception during onWebsocketMessage", runtimeException);
        c8414.m28103().mo28054(c8414, runtimeException);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final void m13207(C8414 c8414, InterfaceC5114 interfaceC5114) {
        try {
            c8414.m28103().mo28045(c8414, interfaceC5114.mo10645());
        } catch (RuntimeException e) {
            m13206(c8414, e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m13208(C8414 c8414, InterfaceC5114 interfaceC5114) {
        int iM10648;
        String strM10649;
        if (interfaceC5114 instanceof C3846) {
            C3846 c3846 = (C3846) interfaceC5114;
            iM10648 = c3846.m10648();
            strM10649 = c3846.m10649();
        } else {
            iM10648 = 1005;
            strM10649 = "";
        }
        if (c8414.mo28015() == EnumC7021.CLOSING) {
            c8414.m28090(iM10648, strM10649, true);
        } else if (mo13178() == EnumC3848.TWOWAY) {
            c8414.m28087(iM10648, strM10649, true);
        } else {
            c8414.m28098(iM10648, strM10649, false);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m13209(C8414 c8414, InterfaceC5114 interfaceC5114, EnumC6568 enumC6568) throws C5509 {
        EnumC6568 enumC65682 = EnumC6568.CONTINUOUS;
        if (enumC6568 != enumC65682) {
            m13211(interfaceC5114);
        } else if (interfaceC5114.mo15784()) {
            m13210(c8414, interfaceC5114);
        } else if (this.f9621 == null) {
            this.f9614.error("Protocol error: Continuous frame sequence was not started.");
            throw new C5509(1002, "Continuous frame sequence was not started.");
        }
        if (enumC6568 == EnumC6568.TEXT && !C3793.m839(interfaceC5114.mo10645())) {
            this.f9614.error("Protocol error: Payload is not UTF8");
            throw new C5509(1007);
        }
        if (enumC6568 != enumC65682 || this.f9621 == null) {
            return;
        }
        m13188(interfaceC5114.mo10645());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m13210(C8414 c8414, InterfaceC5114 interfaceC5114) throws C5509 {
        if (this.f9621 == null) {
            this.f9614.mo14160("Protocol error: Previous continuous frame sequence not completed.");
            throw new C5509(1002, "Continuous frame sequence was not started.");
        }
        m13188(interfaceC5114.mo10645());
        m13189();
        if (this.f9621.mo15781() == EnumC6568.TEXT) {
            ((AbstractC5115) this.f9621).mo10647(m13201());
            ((AbstractC5115) this.f9621).mo10646();
            try {
                c8414.m28103().mo28053(c8414, C3793.m10491(this.f9621.mo10645()));
            } catch (RuntimeException e) {
                m13206(c8414, e);
            }
        } else if (this.f9621.mo15781() == EnumC6568.BINARY) {
            ((AbstractC5115) this.f9621).mo10647(m13201());
            ((AbstractC5115) this.f9621).mo10646();
            try {
                c8414.m28103().mo28045(c8414, this.f9621.mo10645());
            } catch (RuntimeException e2) {
                m13206(c8414, e2);
            }
        }
        this.f9621 = null;
        m13190();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m13211(InterfaceC5114 interfaceC5114) throws C5509 {
        if (this.f9621 != null) {
            this.f9614.mo14160("Protocol error: Previous continuous frame sequence not completed.");
            throw new C5509(1002, "Previous continuous frame sequence not completed.");
        }
        this.f9621 = interfaceC5114;
        m13188(interfaceC5114.mo10645());
        m13189();
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final void m13212(C8414 c8414, InterfaceC5114 interfaceC5114) throws C5509 {
        try {
            c8414.m28103().mo28053(c8414, C3793.m10491(interfaceC5114.mo10645()));
        } catch (RuntimeException e) {
            m13206(c8414, e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final byte[] m13213(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final EnumC6568 m13214(byte b) throws C5511 {
        if (b == 0) {
            return EnumC6568.CONTINUOUS;
        }
        if (b == 1) {
            return EnumC6568.TEXT;
        }
        if (b == 2) {
            return EnumC6568.BINARY;
        }
        switch (b) {
            case 8:
                return EnumC6568.CLOSING;
            case 9:
                return EnumC6568.PING;
            case 10:
                return EnumC6568.PONG;
            default:
                throw new C5511("Unknown opcode " + ((int) b));
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final InterfaceC5114 m13215(ByteBuffer byteBuffer) throws C5509, C5425 {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int iRemaining = byteBuffer.remaining();
        int iM13220 = 2;
        m13217(iRemaining, 2);
        byte b = byteBuffer.get();
        boolean z = (b >> 8) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & 32) != 0;
        boolean z4 = (b & BaseType.Union) != 0;
        byte b2 = byteBuffer.get();
        boolean z5 = (b2 & C3626.f423) != 0;
        int iM13219 = (byte) (b2 & C3626.f6362);
        EnumC6568 enumC6568M13214 = m13214((byte) (b & 15));
        if (iM13219 < 0 || iM13219 > 125) {
            C0421 c0421M13218 = m13218(byteBuffer, enumC6568M13214, iM13219, iRemaining, 2);
            iM13219 = c0421M13218.m13219();
            iM13220 = c0421M13218.m13220();
        }
        m13216(iM13219);
        m13217(iRemaining, iM13220 + (z5 ? 4 : 0) + iM13219);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m13168(iM13219));
        if (z5) {
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            for (int i = 0; i < iM13219; i++) {
                byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr[i % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
            byteBuffer.position(byteBuffer.position() + byteBufferAllocate.limit());
        }
        AbstractC5115 abstractC5115M15785 = AbstractC5115.m15785(enumC6568M13214);
        abstractC5115M15785.m15786(z);
        abstractC5115M15785.m15787(z2);
        abstractC5115M15785.m15788(z3);
        abstractC5115M15785.m15789(z4);
        byteBufferAllocate.flip();
        abstractC5115M15785.mo10647(byteBufferAllocate);
        if (abstractC5115M15785.mo15781() != EnumC6568.CONTINUOUS) {
            if (abstractC5115M15785.mo1929() || abstractC5115M15785.mo15780() || abstractC5115M15785.mo15783()) {
                this.f9618 = m13196();
            } else {
                this.f9618 = this.f9616;
            }
        }
        if (this.f9618 == null) {
            this.f9618 = this.f9616;
        }
        this.f9618.mo11506(abstractC5115M15785);
        this.f9618.mo12600(abstractC5115M15785);
        if (this.f9614.mo14141()) {
            this.f9614.mo14134("afterDecoding({}): {}", Integer.valueOf(abstractC5115M15785.mo10645().remaining()), abstractC5115M15785.mo10645().remaining() > 1000 ? "too big to display" : new String(abstractC5115M15785.mo10645().array()));
        }
        abstractC5115M15785.mo10646();
        return abstractC5115M15785;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final void m13216(long j) throws C5697 {
        if (j > 2147483647L) {
            this.f9614.mo14160("Limit exedeed: Payloadsize is to big...");
            throw new C5697("Payloadsize is to big...");
        }
        int i = this.f9625;
        if (j > i) {
            this.f9614.mo14134("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j));
            throw new C5697("Payload limit reached.", this.f9625);
        }
        if (j >= 0) {
            return;
        }
        this.f9614.mo14160("Limit underflow: Payloadsize is to little...");
        throw new C5697("Payloadsize is to little...");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final void m13217(int i, int i2) throws C5425 {
        if (i >= i2) {
            return;
        }
        this.f9614.mo14160("Incomplete frame: maxpacketsize < realpacketsize");
        throw new C5425(i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final C0421 m13218(ByteBuffer byteBuffer, EnumC6568 enumC6568, int i, int i2, int i3) throws C5697, C5425, C5511 {
        int i4;
        int iIntValue;
        if (enumC6568 == EnumC6568.PING || enumC6568 == EnumC6568.PONG || enumC6568 == EnumC6568.CLOSING) {
            this.f9614.mo14160("Invalid frame: more than 125 octets");
            throw new C5511("more than 125 octets");
        }
        if (i == 126) {
            i4 = i3 + 2;
            m13217(i2, i4);
            iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
        } else {
            i4 = i3 + 8;
            m13217(i2, i4);
            byte[] bArr = new byte[8];
            for (int i5 = 0; i5 < 8; i5++) {
                bArr[i5] = byteBuffer.get();
            }
            long jLongValue = new BigInteger(bArr).longValue();
            m13216(jLongValue);
            iIntValue = (int) jLongValue;
        }
        return new C0421(iIntValue, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4515(InterfaceC5392 interfaceC5392) {
        this((List<InterfaceC5392>) Collections.singletonList(interfaceC5392));
    }

    public C4515(List<InterfaceC5392> list) {
        this(list, (List<InterfaceC5398>) Collections.singletonList(new C6836("")));
    }

    public C4515(List<InterfaceC5392> list, List<InterfaceC5398> list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    public C4515(List<InterfaceC5392> list, int i) {
        this(list, Collections.singletonList(new C6836("")), i);
    }

    public C4515(List<InterfaceC5392> list, List<InterfaceC5398> list2, int i) {
        this.f9614 = C5867.m18162(C4515.class);
        this.f9615 = new C4339();
        this.f9616 = new C4339();
        this.f9624 = new SecureRandom();
        if (list != null && list2 != null && i >= 1) {
            this.f9617 = new ArrayList(list.size());
            this.f9620 = new ArrayList(list2.size());
            this.f9622 = new ArrayList();
            Iterator<InterfaceC5392> it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().getClass().equals(C4339.class)) {
                    z = true;
                }
            }
            this.f9617.addAll(list);
            if (!z) {
                List<InterfaceC5392> list3 = this.f9617;
                list3.add(list3.size(), this.f9615);
            }
            this.f9620.addAll(list2);
            this.f9625 = i;
            this.f9618 = null;
            return;
        }
        throw new IllegalArgumentException();
    }
}
