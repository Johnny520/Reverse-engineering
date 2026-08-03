package Yue;

import com.android.p001dx.p004io.Opcodes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,641:1\n89#2:642\n86#2:675\n86#2:677\n74#2:737\n74#2:763\n83#2:802\n77#2:813\n89#2:1003\n74#2:1018\n86#2:1122\n89#2:1615\n244#3,32:643\n279#3,10:678\n292#3,18:688\n414#3,2:706\n112#3:708\n416#3:709\n114#3,18:710\n313#3,9:728\n322#3,15:738\n340#3,10:753\n350#3,3:764\n348#3,25:767\n376#3,10:792\n386#3:803\n384#3,9:804\n393#3,7:814\n391#3,20:821\n682#3,60:841\n745#3,56:901\n803#3:957\n806#3:958\n807#3,6:960\n817#3,7:966\n827#3,6:973\n835#3,5:979\n867#3,6:984\n877#3:990\n878#3,11:992\n889#3,5:1004\n898#3,9:1009\n908#3,61:1019\n633#3:1080\n636#3:1081\n637#3,5:1083\n644#3:1088\n647#3,7:1089\n656#3,20:1096\n420#3:1116\n423#3,5:1117\n428#3,10:1123\n439#3,7:1133\n444#3,2:1140\n973#3:1142\n974#3,87:1144\n1064#3,48:1231\n603#3:1279\n610#3,21:1280\n1115#3,7:1301\n1125#3,7:1308\n1135#3,4:1315\n1142#3,8:1319\n1153#3,10:1327\n1166#3,14:1337\n449#3,91:1351\n543#3,40:1442\n586#3:1482\n588#3,13:1484\n1183#3:1497\n1234#3:1498\n1235#3,39:1500\n1276#3,2:1539\n1278#3,4:1542\n1285#3,3:1546\n1289#3,4:1550\n112#3:1554\n1293#3,22:1555\n114#3,18:1577\n1319#3,2:1595\n1321#3,3:1598\n112#3:1601\n1324#3,13:1602\n1337#3,13:1616\n114#3,18:1629\n1354#3,2:1647\n1357#3:1650\n112#3:1651\n1358#3,50:1652\n114#3,18:1702\n1417#3,14:1720\n1434#3,32:1734\n1469#3,12:1766\n1484#3,18:1778\n1506#3:1796\n1507#3:1798\n1512#3,34:1799\n1#4:676\n1#4:959\n1#4:991\n1#4:1082\n1#4:1143\n1#4:1483\n1#4:1499\n1#4:1541\n1#4:1549\n1#4:1597\n1#4:1649\n1#4:1797\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:642\n197#1:675\n235#1:677\n261#1:737\n264#1:763\n267#1:802\n267#1:813\n335#1:1003\n338#1:1018\n374#1:1122\n483#1:1615\n181#1:643,32\n252#1:678,10\n255#1:688,18\n258#1:706,2\n258#1:708\n258#1:709\n258#1:710,18\n261#1:728,9\n261#1:738,15\n264#1:753,10\n264#1:764,3\n264#1:767,25\n267#1:792,10\n267#1:803\n267#1:804,9\n267#1:814,7\n267#1:821,20\n279#1:841,60\n282#1:901,56\n284#1:957\n287#1:958\n287#1:960,6\n289#1:966,7\n292#1:973,6\n295#1:979,5\n329#1:984,6\n335#1:990\n335#1:992,11\n335#1:1004,5\n338#1:1009,9\n338#1:1019,61\n340#1:1080\n343#1:1081\n343#1:1083,5\n345#1:1088\n348#1:1089,7\n351#1:1096,20\n371#1:1116\n374#1:1117,5\n374#1:1123,10\n376#1:1133,7\n379#1:1140,2\n384#1:1142\n384#1:1144,87\n387#1:1231,48\n410#1:1279\n416#1:1280,21\n437#1:1301,7\n441#1:1308,7\n443#1:1315,4\n445#1:1319,8\n449#1:1327,10\n453#1:1337,14\n457#1:1351,91\n460#1:1442,40\n463#1:1482\n463#1:1484,13\n465#1:1497\n465#1:1498\n465#1:1500,39\n467#1:1539,2\n467#1:1542,4\n477#1:1546,3\n477#1:1550,4\n477#1:1554\n477#1:1555,22\n477#1:1577,18\n483#1:1595,2\n483#1:1598,3\n483#1:1601\n483#1:1602,13\n483#1:1616,13\n483#1:1629,18\n488#1:1647,2\n488#1:1650\n488#1:1651\n488#1:1652,50\n488#1:1702,18\n498#1:1720,14\n568#1:1734,32\n570#1:1766,12\n578#1:1778,18\n586#1:1796\n586#1:1798\n588#1:1799,34\n287#1:959\n335#1:991\n343#1:1082\n384#1:1143\n463#1:1483\n465#1:1499\n467#1:1541\n477#1:1549\n483#1:1597\n488#1:1649\n586#1:1797\n*E\n"})
public final class C3600 implements InterfaceC3604, InterfaceC3603, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public C7275 f6209;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public long f6210;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۨ$ۥ */
    @InterfaceC7507({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n1567#2:642\n1568#2:644\n1572#2:645\n1573#2,68:647\n1644#2:715\n1645#2,32:717\n1677#2,18:750\n1698#2:768\n1699#2,18:770\n1721#2:788\n1723#2,7:790\n1#3:643\n1#3:646\n1#3:716\n1#3:769\n1#3:789\n86#4:749\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n628#1:642\n628#1:644\n630#1:645\n630#1:647,68\n632#1:715\n632#1:717,32\n632#1:750,18\n634#1:768\n634#1:770,18\n637#1:788\n637#1:790,7\n628#1:643\n630#1:646\n632#1:716\n634#1:769\n637#1:789\n632#1:749\n*E\n"})
    public static final class C0192 implements Closeable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC5568
        @InterfaceC6489
        public C3600 f6211;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC5568
        public boolean f6212;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6489
        public C7275 f6213;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @InterfaceC5568
        @InterfaceC6489
        public byte[] f6215;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC5568
        public long f6214 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @InterfaceC5568
        public int f6216 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        @InterfaceC5568
        public int f6217 = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f6211 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f6211 = null;
            m9713(null);
            this.f6214 = -1L;
            this.f6215 = null;
            this.f6216 = -1;
            this.f6217 = -1;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final long m649(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i).toString());
            }
            if (i > 8192) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
            }
            C3600 c3600 = this.f6211;
            if (c3600 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f6212) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long jM9684 = c3600.m9684();
            C7275 c7275M9687 = c3600.m9687(i);
            int i2 = 8192 - c7275M9687.f21950;
            c7275M9687.f21950 = 8192;
            long j = i2;
            c3600.m9680(jM9684 + j);
            m9713(c7275M9687);
            this.f6214 = jM9684;
            this.f6215 = c7275M9687.f2778;
            this.f6216 = 8192 - i2;
            this.f6217 = 8192;
            return j;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C7275 m9709() {
            return this.f6213;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m9710() {
            long j = this.f6214;
            C3600 c3600 = this.f6211;
            C5499.m17100(c3600);
            if (j == c3600.m9684()) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j2 = this.f6214;
            return m9712(j2 == -1 ? 0L : j2 + ((long) (this.f6217 - this.f6216)));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final long m9711(long j) {
            C3600 c3600 = this.f6211;
            if (c3600 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f6212) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long jM9684 = c3600.m9684();
            if (j <= jM9684) {
                if (j < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                }
                long j2 = jM9684 - j;
                while (true) {
                    if (j2 <= 0) {
                        break;
                    }
                    C7275 c7275 = c3600.f6209;
                    C5499.m17100(c7275);
                    C7275 c72752 = c7275.f21954;
                    C5499.m17100(c72752);
                    int i = c72752.f21950;
                    long j3 = i - c72752.f2779;
                    if (j3 > j2) {
                        c72752.f21950 = i - ((int) j2);
                        break;
                    }
                    c3600.f6209 = c72752.m3540();
                    C7278.m22744(c72752);
                    j2 -= j3;
                }
                m9713(null);
                this.f6214 = j;
                this.f6215 = null;
                this.f6216 = -1;
                this.f6217 = -1;
            } else if (j > jM9684) {
                long j4 = j - jM9684;
                boolean z = true;
                while (j4 > 0) {
                    C7275 c7275M9687 = c3600.m9687(1);
                    int iMin = (int) Math.min(j4, 8192 - c7275M9687.f21950);
                    c7275M9687.f21950 += iMin;
                    j4 -= (long) iMin;
                    if (z) {
                        m9713(c7275M9687);
                        this.f6214 = jM9684;
                        this.f6215 = c7275M9687.f2778;
                        int i2 = c7275M9687.f21950;
                        this.f6216 = i2 - iMin;
                        this.f6217 = i2;
                        z = false;
                    }
                }
            }
            c3600.m9680(j);
            return jM9684;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int m9712(long j) {
            C7275 c7275M22726;
            C3600 c3600 = this.f6211;
            if (c3600 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j < -1 || j > c3600.m9684()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c3600.m9684());
            }
            if (j == -1 || j == c3600.m9684()) {
                m9713(null);
                this.f6214 = j;
                this.f6215 = null;
                this.f6216 = -1;
                this.f6217 = -1;
                return -1;
            }
            long jM9684 = c3600.m9684();
            C7275 c7275M9709 = c3600.f6209;
            long j2 = 0;
            if (m9709() != null) {
                long j3 = this.f6214;
                int i = this.f6216;
                C7275 c7275M97092 = m9709();
                C5499.m17100(c7275M97092);
                long j4 = j3 - ((long) (i - c7275M97092.f2779));
                if (j4 > j) {
                    c7275M22726 = c7275M9709;
                    c7275M9709 = m9709();
                    jM9684 = j4;
                } else {
                    c7275M22726 = m9709();
                    j2 = j4;
                }
            } else {
                c7275M22726 = c7275M9709;
            }
            if (jM9684 - j > j - j2) {
                while (true) {
                    C5499.m17100(c7275M22726);
                    int i2 = c7275M22726.f21950;
                    int i3 = c7275M22726.f2779;
                    if (j < ((long) (i2 - i3)) + j2) {
                        break;
                    }
                    j2 += (long) (i2 - i3);
                    c7275M22726 = c7275M22726.f21953;
                }
            } else {
                while (jM9684 > j) {
                    C5499.m17100(c7275M9709);
                    c7275M9709 = c7275M9709.f21954;
                    C5499.m17100(c7275M9709);
                    jM9684 -= (long) (c7275M9709.f21950 - c7275M9709.f2779);
                }
                j2 = jM9684;
                c7275M22726 = c7275M9709;
            }
            if (this.f6212) {
                C5499.m17100(c7275M22726);
                if (c7275M22726.f21951) {
                    C7275 c7275M22729 = c7275M22726.m22729();
                    if (c3600.f6209 == c7275M22726) {
                        c3600.f6209 = c7275M22729;
                    }
                    c7275M22726 = c7275M22726.m22726(c7275M22729);
                    C7275 c7275 = c7275M22726.f21954;
                    C5499.m17100(c7275);
                    c7275.m3540();
                }
            }
            m9713(c7275M22726);
            this.f6214 = j;
            C5499.m17100(c7275M22726);
            this.f6215 = c7275M22726.f2778;
            int i4 = c7275M22726.f2779 + ((int) (j - j2));
            this.f6216 = i4;
            int i5 = c7275M22726.f21950;
            this.f6217 = i5;
            return i5 - i4;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m9713(@InterfaceC6489 C7275 c7275) {
            this.f6213 = c7275;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۨ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3601 extends OutputStream {
        public C3601() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @InterfaceC6399
        public String toString() {
            return C3600.this + ".outputStream()";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.OutputStream
        public void write(int i) {
            C3600.this.writeByte(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.io.OutputStream
        public void write(@InterfaceC6399 byte[] bArr, int i, int i2) {
            C5499.m17103(bArr, "data");
            C3600.this.write(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static /* synthetic */ C3600 m9595(C3600 c3600, C3600 c36002, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return c3600.m9619(c36002, j);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static /* synthetic */ C3600 m9596(C3600 c3600, C3600 c36002, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return c3600.m9620(c36002, j, j2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static /* synthetic */ C3600 m9597(C3600 c3600, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = c3600.f6210 - j3;
        }
        return c3600.m9628(outputStream, j3, j2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ C0192 m9598(C3600 c3600, C0192 c0192, int i, Object obj) {
        if ((i & 1) != 0) {
            c0192 = C2963.m5679();
        }
        return c3600.m9660(c0192);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static /* synthetic */ C0192 m9599(C3600 c3600, C0192 c0192, int i, Object obj) {
        if ((i & 1) != 0) {
            c0192 = C2963.m5679();
        }
        return c3600.m9679(c0192);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ C3600 m9600(C3600 c3600, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = c3600.f6210;
        }
        return c3600.m9705(outputStream, j);
    }

    @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3600) {
            C3600 c3600 = (C3600) obj;
            if (m9684() == c3600.m9684()) {
                if (m9684() == 0) {
                    return true;
                }
                C7275 c7275 = this.f6209;
                C5499.m17100(c7275);
                C7275 c72752 = c3600.f6209;
                C5499.m17100(c72752);
                int i = c7275.f2779;
                int i2 = c72752.f2779;
                long j = 0;
                while (j < m9684()) {
                    long jMin = Math.min(c7275.f21950 - i, c72752.f21950 - i2);
                    long j2 = 0;
                    while (j2 < jMin) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (c7275.f2778[i] == c72752.f2778[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == c7275.f21950) {
                        c7275 = c7275.f21953;
                        C5499.m17100(c7275);
                        i = c7275.f2779;
                    }
                    if (i2 == c72752.f21950) {
                        c72752 = c72752.f21953;
                        C5499.m17100(c72752);
                        i2 = c72752.f2779;
                    }
                    j += jMin;
                }
                return true;
            }
        }
        return false;
    }

    @Override // Yue.InterfaceC3603, Yue.InterfaceC7472, java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        C7275 c7275 = this.f6209;
        if (c7275 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c7275.f21950;
            for (int i3 = c7275.f2779; i3 < i2; i3++) {
                i = (i * 31) + c7275.f2778[i3];
            }
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
        } while (c7275 != this.f6209);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    public InterfaceC3604 peek() {
        return C6542.m20831(new C6646(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.ReadableByteChannel
    public int read(@InterfaceC6399 ByteBuffer byteBuffer) throws IOException {
        C5499.m17103(byteBuffer, "sink");
        C7275 c7275 = this.f6209;
        if (c7275 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c7275.f21950 - c7275.f2779);
        byteBuffer.put(c7275.f2778, c7275.f2779, iMin);
        int i = c7275.f2779 + iMin;
        c7275.f2779 = i;
        this.f6210 -= (long) iMin;
        if (i == c7275.f21950) {
            this.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        }
        return iMin;
    }

    @Override // Yue.InterfaceC3604
    public byte readByte() throws EOFException {
        if (m9684() == 0) {
            throw new EOFException();
        }
        C7275 c7275 = this.f6209;
        C5499.m17100(c7275);
        int i = c7275.f2779;
        int i2 = c7275.f21950;
        int i3 = i + 1;
        byte b = c7275.f2778[i];
        m9680(m9684() - 1);
        if (i3 == i2) {
            this.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        } else {
            c7275.f2779 = i3;
        }
        return b;
    }

    @Override // Yue.InterfaceC3604
    public void readFully(@InterfaceC6399 byte[] bArr) throws EOFException {
        C5499.m17103(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // Yue.InterfaceC3604
    public int readInt() throws EOFException {
        if (m9684() < 4) {
            throw new EOFException();
        }
        C7275 c7275 = this.f6209;
        C5499.m17100(c7275);
        int i = c7275.f2779;
        int i2 = c7275.f21950;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c7275.f2778;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        m9680(m9684() - 4);
        if (i5 == i2) {
            this.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        } else {
            c7275.f2779 = i5;
        }
        return i6;
    }

    @Override // Yue.InterfaceC3604
    public long readLong() throws EOFException {
        if (m9684() < 8) {
            throw new EOFException();
        }
        C7275 c7275 = this.f6209;
        C5499.m17100(c7275);
        int i = c7275.f2779;
        int i2 = c7275.f21950;
        if (i2 - i < 8) {
            return ((((long) readInt()) & C8578.f25466) << 32) | (C8578.f25466 & ((long) readInt()));
        }
        byte[] bArr = c7275.f2778;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        m9680(m9684() - 8);
        if (i4 == i2) {
            this.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        } else {
            c7275.f2779 = i4;
        }
        return j2;
    }

    @Override // Yue.InterfaceC3604
    public short readShort() throws EOFException {
        if (m9684() < 2) {
            throw new EOFException();
        }
        C7275 c7275 = this.f6209;
        C5499.m17100(c7275);
        int i = c7275.f2779;
        int i2 = c7275.f21950;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c7275.f2778;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        m9680(m9684() - 2);
        if (i5 == i2) {
            this.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        } else {
            c7275.f2779 = i5;
        }
        return (short) i6;
    }

    @Override // Yue.InterfaceC3604
    public void skip(long j) throws EOFException {
        while (j > 0) {
            C7275 c7275 = this.f6209;
            if (c7275 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c7275.f21950 - c7275.f2779);
            long j2 = iMin;
            m9680(m9684() - j2);
            j -= j2;
            int i = c7275.f2779 + iMin;
            c7275.f2779 = i;
            if (i == c7275.f21950) {
                this.f6209 = c7275.m3540();
                C7278.m22744(c7275);
            }
        }
    }

    @InterfaceC6399
    public String toString() {
        return m9685().toString();
    }

    @Override // Yue.InterfaceC7506
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo518() {
        return C7827.f23434;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to operator function", replaceWith = @InterfaceC7097(expression = "this[index]", imports = {}))
    @InterfaceC5572(name = "-deprecated_getByte")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final byte m9601(long j) {
        return m9650(j);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "size", imports = {}))
    @InterfaceC5572(name = "-deprecated_size")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final long m9602() {
        return this.f6210;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m9603() throws EOFException {
        skip(m9684());
    }

    @Override // Yue.InterfaceC3604, Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C3600 mo9604() {
        return this;
    }

    @Override // Yue.InterfaceC3604, Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C3600 mo9605() {
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 clone() {
        return m9611();
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public InputStream mo9607() {
        return new C0193();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final long m9608() {
        long jM9684 = m9684();
        if (jM9684 == 0) {
            return 0L;
        }
        C7275 c7275 = this.f6209;
        C5499.m17100(c7275);
        C7275 c72752 = c7275.f21954;
        C5499.m17100(c72752);
        int i = c72752.f21950;
        if (i < 8192 && c72752.f21952) {
            jM9684 -= (long) (i - c72752.f2779);
        }
        return jM9684;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public String mo9609(long j) throws EOFException {
        return mo9665(j, C3794.f505);
    }

    @Override // Yue.InterfaceC7472
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9102(@InterfaceC6399 C3600 c3600, long j) {
        C7275 c7275;
        C5499.m17103(c3600, "source");
        if (c3600 == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        C2963.m5677(c3600.m9684(), 0L, j);
        while (j > 0) {
            C7275 c72752 = c3600.f6209;
            C5499.m17100(c72752);
            int i = c72752.f21950;
            C5499.m17100(c3600.f6209);
            if (j < i - r1.f2779) {
                C7275 c72753 = this.f6209;
                if (c72753 != null) {
                    C5499.m17100(c72753);
                    c7275 = c72753.f21954;
                } else {
                    c7275 = null;
                }
                if (c7275 != null && c7275.f21952) {
                    if ((((long) c7275.f21950) + j) - ((long) (c7275.f21951 ? 0 : c7275.f2779)) <= 8192) {
                        C7275 c72754 = c3600.f6209;
                        C5499.m17100(c72754);
                        c72754.m22730(c7275, (int) j);
                        c3600.m9680(c3600.m9684() - j);
                        m9680(m9684() + j);
                        return;
                    }
                }
                C7275 c72755 = c3600.f6209;
                C5499.m17100(c72755);
                c3600.f6209 = c72755.m22728((int) j);
            }
            C7275 c72756 = c3600.f6209;
            C5499.m17100(c72756);
            long j2 = c72756.f21950 - c72756.f2779;
            c3600.f6209 = c72756.m3540();
            C7275 c72757 = this.f6209;
            if (c72757 == null) {
                this.f6209 = c72756;
                c72756.f21954 = c72756;
                c72756.f21953 = c72756;
            } else {
                C5499.m17100(c72757);
                C7275 c72758 = c72757.f21954;
                C5499.m17100(c72758);
                c72758.m22726(c72756).m3539();
            }
            c3600.m9680(c3600.m9684() - j2);
            m9680(m9684() + j2);
            j -= j2;
        }
    }

    @Override // Yue.InterfaceC3603
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public long mo9610(@InterfaceC6399 InterfaceC7506 interfaceC7506) throws IOException {
        C5499.m17103(interfaceC7506, "source");
        long j = 0;
        while (true) {
            long jMo9103 = interfaceC7506.mo9103(this, 8192L);
            if (jMo9103 == -1) {
                return j;
            }
            j += jMo9103;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C3600 m9611() {
        C3600 c3600 = new C3600();
        if (m9684() != 0) {
            C7275 c7275 = this.f6209;
            C5499.m17100(c7275);
            C7275 c7275M22727 = c7275.m22727();
            c3600.f6209 = c7275M22727;
            c7275M22727.f21954 = c7275M22727;
            c7275M22727.f21953 = c7275M22727;
            for (C7275 c72752 = c7275.f21953; c72752 != c7275; c72752 = c72752.f21953) {
                C7275 c72753 = c7275M22727.f21954;
                C5499.m17100(c72753);
                C5499.m17100(c72752);
                c72753.m22726(c72752.m22727());
            }
            c3600.m9680(m9684());
        }
        return c3600;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public C3630 mo9612(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (m9684() < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C3630(mo9661(j));
        }
        C3630 c3630M9686 = m9686((int) j);
        skip(j);
        return c3630M9686;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public long mo9616(@InterfaceC6399 C3630 c3630, long j) throws IOException {
        int i;
        long j2 = j;
        C5499.m17103(c3630, "bytes");
        if (c3630.m9852() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long jM9684 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        C7275 c7275 = this.f6209;
        if (c7275 != null) {
            if (m9684() - j2 < j2) {
                jM9684 = m9684();
                while (jM9684 > j2) {
                    c7275 = c7275.f21954;
                    C5499.m17100(c7275);
                    jM9684 -= (long) (c7275.f21950 - c7275.f2779);
                }
                byte[] bArrMo9837 = c3630.mo9837();
                byte b = bArrMo9837[0];
                int iM9852 = c3630.m9852();
                long jM96842 = (m9684() - ((long) iM9852)) + 1;
                while (jM9684 < jM96842) {
                    byte[] bArr = c7275.f2778;
                    long j3 = jM96842;
                    int iMin = (int) Math.min(c7275.f21950, (((long) c7275.f2779) + jM96842) - jM9684);
                    i = (int) ((((long) c7275.f2779) + j2) - jM9684);
                    while (i < iMin) {
                        if (bArr[i] == b && C0001.m5507(c7275, i + 1, bArrMo9837, 1, iM9852)) {
                            return ((long) (i - c7275.f2779)) + jM9684;
                        }
                        i++;
                    }
                    jM9684 += (long) (c7275.f21950 - c7275.f2779);
                    c7275 = c7275.f21953;
                    C5499.m17100(c7275);
                    j2 = jM9684;
                    jM96842 = j3;
                }
            } else {
                while (true) {
                    long j4 = ((long) (c7275.f21950 - c7275.f2779)) + jM9684;
                    if (j4 > j2) {
                        break;
                    }
                    c7275 = c7275.f21953;
                    C5499.m17100(c7275);
                    jM9684 = j4;
                }
                byte[] bArrMo98372 = c3630.mo9837();
                byte b2 = bArrMo98372[0];
                int iM98522 = c3630.m9852();
                long jM96843 = (m9684() - ((long) iM98522)) + 1;
                while (jM9684 < jM96843) {
                    byte[] bArr2 = c7275.f2778;
                    int iMin2 = (int) Math.min(c7275.f21950, (((long) c7275.f2779) + jM96843) - jM9684);
                    i = (int) ((((long) c7275.f2779) + j2) - jM9684);
                    while (i < iMin2) {
                        if (bArr2[i] == b2 && C0001.m5507(c7275, i + 1, bArrMo98372, 1, iM98522)) {
                            return ((long) (i - c7275.f2779)) + jM9684;
                        }
                        i++;
                    }
                    jM9684 += (long) (c7275.f21950 - c7275.f2779);
                    c7275 = c7275.f21953;
                    C5499.m17100(c7275);
                    j2 = jM9684;
                }
            }
        }
        return -1L;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public byte[] mo9618() {
        return mo9661(m9684());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final C3600 m9619(@InterfaceC6399 C3600 c3600, long j) {
        C5499.m17103(c3600, "out");
        return m9620(c3600, j, this.f6210 - j);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final C3600 m9620(@InterfaceC6399 C3600 c3600, long j, long j2) {
        C5499.m17103(c3600, "out");
        C2963.m5677(m9684(), j, j2);
        if (j2 != 0) {
            c3600.m9680(c3600.m9684() + j2);
            C7275 c7275 = this.f6209;
            while (true) {
                C5499.m17100(c7275);
                int i = c7275.f21950;
                int i2 = c7275.f2779;
                if (j < i - i2) {
                    break;
                }
                j -= (long) (i - i2);
                c7275 = c7275.f21953;
            }
            while (j2 > 0) {
                C5499.m17100(c7275);
                C7275 c7275M22727 = c7275.m22727();
                int i3 = c7275M22727.f2779 + ((int) j);
                c7275M22727.f2779 = i3;
                c7275M22727.f21950 = Math.min(i3 + ((int) j2), c7275M22727.f21950);
                C7275 c72752 = c3600.f6209;
                if (c72752 == null) {
                    c7275M22727.f21954 = c7275M22727;
                    c7275M22727.f21953 = c7275M22727;
                    c3600.f6209 = c7275M22727;
                } else {
                    C5499.m17100(c72752);
                    C7275 c72753 = c72752.f21954;
                    C5499.m17100(c72753);
                    c72753.m22726(c7275M22727);
                }
                j2 -= (long) (c7275M22727.f21950 - c7275M22727.f2779);
                c7275 = c7275.f21953;
                j = 0;
            }
        }
        return this;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean mo9622() {
        return this.f6210 == 0;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public long mo9623(@InterfaceC6399 C3630 c3630, long j) {
        int i;
        int i2;
        C5499.m17103(c3630, "targetBytes");
        long jM9684 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        C7275 c7275 = this.f6209;
        if (c7275 == null) {
            return -1L;
        }
        if (m9684() - j < j) {
            jM9684 = m9684();
            while (jM9684 > j) {
                c7275 = c7275.f21954;
                C5499.m17100(c7275);
                jM9684 -= (long) (c7275.f21950 - c7275.f2779);
            }
            if (c3630.m9852() == 2) {
                byte bM9823 = c3630.m9823(0);
                byte bM98232 = c3630.m9823(1);
                while (jM9684 < m9684()) {
                    byte[] bArr = c7275.f2778;
                    i = (int) ((((long) c7275.f2779) + j) - jM9684);
                    int i3 = c7275.f21950;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == bM9823 || b == bM98232) {
                            i2 = c7275.f2779;
                        } else {
                            i++;
                        }
                    }
                    jM9684 += (long) (c7275.f21950 - c7275.f2779);
                    c7275 = c7275.f21953;
                    C5499.m17100(c7275);
                    j = jM9684;
                }
                return -1L;
            }
            byte[] bArrMo9837 = c3630.mo9837();
            while (jM9684 < m9684()) {
                byte[] bArr2 = c7275.f2778;
                i = (int) ((((long) c7275.f2779) + j) - jM9684);
                int i4 = c7275.f21950;
                while (i < i4) {
                    byte b2 = bArr2[i];
                    for (byte b3 : bArrMo9837) {
                        if (b2 == b3) {
                            i2 = c7275.f2779;
                        }
                    }
                    i++;
                }
                jM9684 += (long) (c7275.f21950 - c7275.f2779);
                c7275 = c7275.f21953;
                C5499.m17100(c7275);
                j = jM9684;
            }
            return -1L;
        }
        while (true) {
            long j2 = ((long) (c7275.f21950 - c7275.f2779)) + jM9684;
            if (j2 > j) {
                break;
            }
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            jM9684 = j2;
        }
        if (c3630.m9852() == 2) {
            byte bM98233 = c3630.m9823(0);
            byte bM98234 = c3630.m9823(1);
            while (jM9684 < m9684()) {
                byte[] bArr3 = c7275.f2778;
                i = (int) ((((long) c7275.f2779) + j) - jM9684);
                int i5 = c7275.f21950;
                while (i < i5) {
                    byte b4 = bArr3[i];
                    if (b4 == bM98233 || b4 == bM98234) {
                        i2 = c7275.f2779;
                    } else {
                        i++;
                    }
                }
                jM9684 += (long) (c7275.f21950 - c7275.f2779);
                c7275 = c7275.f21953;
                C5499.m17100(c7275);
                j = jM9684;
            }
            return -1L;
        }
        byte[] bArrMo98372 = c3630.mo9837();
        while (jM9684 < m9684()) {
            byte[] bArr4 = c7275.f2778;
            i = (int) ((((long) c7275.f2779) + j) - jM9684);
            int i6 = c7275.f21950;
            while (i < i6) {
                byte b5 = bArr4[i];
                for (byte b6 : bArrMo98372) {
                    if (b5 == b6) {
                        i2 = c7275.f2779;
                    }
                }
                i++;
            }
            jM9684 += (long) (c7275.f21950 - c7275.f2779);
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            j = jM9684;
        }
        return -1L;
        return ((long) (i - i2)) + jM9684;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public long mo9624(@InterfaceC6399 InterfaceC7472 interfaceC7472) throws IOException {
        C5499.m17103(interfaceC7472, "sink");
        long jM9684 = m9684();
        if (jM9684 > 0) {
            interfaceC7472.mo9102(this, jM9684);
        }
        return jM9684;
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final C3600 m9625(@InterfaceC6399 OutputStream outputStream) throws IOException {
        C5499.m17103(outputStream, "out");
        return m9597(this, outputStream, 0L, 0L, 6, null);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final C3600 m9626(@InterfaceC6399 OutputStream outputStream, long j) throws IOException {
        C5499.m17103(outputStream, "out");
        return m9597(this, outputStream, j, 0L, 4, null);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public long mo9627(byte b, long j) {
        return mo9630(b, j, Long.MAX_VALUE);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final C3600 m9628(@InterfaceC6399 OutputStream outputStream, long j, long j2) throws IOException {
        C5499.m17103(outputStream, "out");
        C2963.m5677(this.f6210, j, j2);
        if (j2 == 0) {
            return this;
        }
        C7275 c7275 = this.f6209;
        while (true) {
            C5499.m17100(c7275);
            int i = c7275.f21950;
            int i2 = c7275.f2779;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c7275 = c7275.f21953;
        }
        while (j2 > 0) {
            C5499.m17100(c7275);
            int i3 = (int) (((long) c7275.f2779) + j);
            int iMin = (int) Math.min(c7275.f21950 - i3, j2);
            outputStream.write(c7275.f2778, i3, iMin);
            j2 -= (long) iMin;
            c7275 = c7275.f21953;
            j = 0;
        }
        return this;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean mo9629(long j, @InterfaceC6399 C3630 c3630, int i, int i2) {
        C5499.m17103(c3630, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || m9684() - j < i2 || c3630.m9852() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m9650(((long) i3) + j) != c3630.m9823(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public long mo9630(byte b, long j, long j2) {
        C7275 c7275;
        int i;
        long jM9684 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + m9684() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > m9684()) {
            j2 = m9684();
        }
        if (j == j2 || (c7275 = this.f6209) == null) {
            return -1L;
        }
        if (m9684() - j < j) {
            jM9684 = m9684();
            while (jM9684 > j) {
                c7275 = c7275.f21954;
                C5499.m17100(c7275);
                jM9684 -= (long) (c7275.f21950 - c7275.f2779);
            }
            while (jM9684 < j2) {
                byte[] bArr = c7275.f2778;
                int iMin = (int) Math.min(c7275.f21950, (((long) c7275.f2779) + j2) - jM9684);
                i = (int) ((((long) c7275.f2779) + j) - jM9684);
                while (i < iMin) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                jM9684 += (long) (c7275.f21950 - c7275.f2779);
                c7275 = c7275.f21953;
                C5499.m17100(c7275);
                j = jM9684;
            }
            return -1L;
        }
        while (true) {
            long j3 = ((long) (c7275.f21950 - c7275.f2779)) + jM9684;
            if (j3 > j) {
                break;
            }
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            jM9684 = j3;
        }
        while (jM9684 < j2) {
            byte[] bArr2 = c7275.f2778;
            int iMin2 = (int) Math.min(c7275.f21950, (((long) c7275.f2779) + j2) - jM9684);
            i = (int) ((((long) c7275.f2779) + j) - jM9684);
            while (i < iMin2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            jM9684 += (long) (c7275.f21950 - c7275.f2779);
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            j = jM9684;
        }
        return -1L;
        return ((long) (i - c7275.f2779)) + jM9684;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public String mo9631() throws EOFException {
        long jMo9673 = mo9673((byte) 10);
        if (jMo9673 != -1) {
            return C0001.m5508(this, jMo9673);
        }
        if (m9684() != 0) {
            return mo9609(m9684());
        }
        return null;
    }

    @Override // Yue.InterfaceC7506
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo9103(@InterfaceC6399 C3600 c3600, long j) {
        C5499.m17103(c3600, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (m9684() == 0) {
            return -1L;
        }
        if (j > m9684()) {
            j = m9684();
        }
        c3600.mo9102(this, j);
        return j;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public long mo9633() throws EOFException {
        if (m9684() == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            C7275 c7275 = this.f6209;
            C5499.m17100(c7275);
            byte[] bArr = c7275.f2778;
            int i2 = c7275.f2779;
            int i3 = c7275.f21950;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < C0001.f4238 || (j == C0001.f4238 && i4 < j2)) {
                        C3600 c3600WriteByte = new C3600().mo9671(j).writeByte(b);
                        if (!z) {
                            c3600WriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + c3600WriteByte.mo9662());
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.f6209 = c7275.m3540();
                C7278.m22744(c7275);
            } else {
                c7275.f2779 = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f6209 != null);
        m9680(m9684() - ((long) i));
        if (i >= (z ? 2 : 1)) {
            return z ? j : -j;
        }
        if (m9684() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + C2963.m5693(m9650(0L)));
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public String mo9634(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jMo9630 = mo9630((byte) 10, 0L, j2);
        if (jMo9630 != -1) {
            return C0001.m5508(this, jMo9630);
        }
        if (j2 < m9684() && m9650(j2 - 1) == 13 && m9650(j2) == 10) {
            return C0001.m5508(this, j2);
        }
        C3600 c3600 = new C3600();
        m9620(c3600, 0L, Math.min(32, m9684()));
        throw new EOFException("\\n not found: limit=" + Math.min(m9684(), j) + " content=" + c3600.mo9648().mo9828() + C8039.f23902);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final C3630 m9635(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        C7275 c7275 = this.f6209;
        if (c7275 != null) {
            byte[] bArr = c7275.f2778;
            int i = c7275.f2779;
            messageDigest.update(bArr, i, c7275.f21950 - i);
            C7275 c72752 = c7275.f21953;
            C5499.m17100(c72752);
            while (c72752 != c7275) {
                byte[] bArr2 = c72752.f2778;
                int i2 = c72752.f2779;
                messageDigest.update(bArr2, i2, c72752.f21950 - i2);
                c72752 = c72752.f21953;
                C5499.m17100(c72752);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        C5499.m17102(bArrDigest, "digest(...)");
        return new C3630(bArrDigest);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠ۢ()LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9614() {
        return this;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public long mo9639(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "targetBytes");
        return mo9623(c3630, 0L);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟ۢ()LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9632() {
        return this;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public String mo9642(@InterfaceC6399 Charset charset) {
        C5499.m17103(charset, "charset");
        return mo9665(this.f6210, charset);
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟.ۥ۟۟ۤۤ(Yue.ۥۣ۟ۢۨ, Yue.ۥۣۡۤۥ, boolean, int, java.lang.Object):int */
    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public int mo9643(@InterfaceC6399 C6582 c6582) throws EOFException {
        C5499.m17103(c6582, "options");
        int iM5511 = C0001.m5511(this, c6582, false, 2, null);
        if (iM5511 == -1) {
            return -1;
        }
        skip(c6582.m20903()[iM5511].m9852());
        return iM5511;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public int mo9644() throws EOFException {
        int i;
        int i2;
        int i3;
        if (m9684() == 0) {
            throw new EOFException();
        }
        byte bM9650 = m9650(0L);
        if ((bM9650 & C3626.f423) == 0) {
            i = bM9650 & C3626.f6362;
            i3 = 0;
            i2 = 1;
        } else if ((bM9650 & 224) == 192) {
            i = bM9650 & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bM9650 & 240) == 224) {
            i = bM9650 & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bM9650 & 248) != 240) {
                skip(1L);
                return C8149.f24169;
            }
            i = bM9650 & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (m9684() < j) {
            throw new EOFException("size < " + i2 + ": " + m9684() + " (to read code point prefixed 0x" + C2963.m5693(bM9650) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bM96502 = m9650(j2);
            if ((bM96502 & C4750.f10617) != 128) {
                skip(j2);
                return C8149.f24169;
            }
            i = (i << 6) | (bM96502 & C8149.f3255);
        }
        skip(j);
        return i > 1114111 ? C8149.f24169 : ((55296 > i || i >= 57344) && i >= i3) ? i : C8149.f24169;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public boolean mo9647(long j, @InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "bytes");
        return mo9629(j, c3630, 0, c3630.m9852());
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public C3630 mo9648() {
        return mo9612(m9684());
    }

    @InterfaceC5572(name = "getByte")
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final byte m9650(long j) {
        C2963.m5677(m9684(), j, 1L);
        C7275 c7275 = this.f6209;
        if (c7275 == null) {
            C5499.m17100(null);
            throw null;
        }
        if (m9684() - j < j) {
            long jM9684 = m9684();
            while (jM9684 > j) {
                c7275 = c7275.f21954;
                C5499.m17100(c7275);
                jM9684 -= (long) (c7275.f21950 - c7275.f2779);
            }
            C5499.m17100(c7275);
            return c7275.f2778[(int) ((((long) c7275.f2779) + j) - jM9684)];
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (c7275.f21950 - c7275.f2779)) + j2;
            if (j3 > j) {
                C5499.m17100(c7275);
                return c7275.f2778[(int) ((((long) c7275.f2779) + j) - j2)];
            }
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
            j2 = j3;
        }
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean mo9651(long j) {
        return this.f6210 >= j;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final C3630 m9652(String str, C3630 c3630) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c3630.mo9837(), str));
            C7275 c7275 = this.f6209;
            if (c7275 != null) {
                byte[] bArr = c7275.f2778;
                int i = c7275.f2779;
                mac.update(bArr, i, c7275.f21950 - i);
                C7275 c72752 = c7275.f21953;
                C5499.m17100(c72752);
                while (c72752 != c7275) {
                    byte[] bArr2 = c72752.f2778;
                    int i2 = c72752.f2779;
                    mac.update(bArr2, i2, c72752.f21950 - i2);
                    c72752 = c72752.f21953;
                    C5499.m17100(c72752);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            C5499.m17102(bArrDoFinal, "doFinal(...)");
            return new C3630(bArrDoFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final C3630 m9653(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, C6659.f17103);
        return m9652("HmacSHA1", c3630);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final C3630 m9654(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, C6659.f17103);
        return m9652("HmacSHA256", c3630);
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public String mo9655() throws EOFException {
        return mo9634(Long.MAX_VALUE);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final C3630 m9656(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, C6659.f17103);
        return m9652("HmacSHA512", c3630);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public int mo9657() throws EOFException {
        return C2963.m5687(readInt());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final C3630 m9658() {
        return m9635("MD5");
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final C0192 m9659() {
        return m9598(this, null, 1, null);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public final C0192 m9660(@InterfaceC6399 C0192 c0192) {
        C5499.m17103(c0192, "unsafeCursor");
        return C0001.m5465(this, c0192);
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public byte[] mo9661(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (m9684() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public String mo9662() {
        return mo9665(this.f6210, C3794.f505);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public long mo9663(@InterfaceC6399 C3630 c3630) throws IOException {
        C5499.m17103(c3630, "bytes");
        return mo9616(c3630, 0L);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void mo9664(@InterfaceC6399 C3600 c3600, long j) throws EOFException {
        C5499.m17103(c3600, "sink");
        if (m9684() >= j) {
            c3600.mo9102(this, j);
        } else {
            c3600.mo9102(this, m9684());
            throw new EOFException();
        }
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public String mo9665(long j, @InterfaceC6399 Charset charset) throws EOFException {
        C5499.m17103(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f6210 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C7275 c7275 = this.f6209;
        C5499.m17100(c7275);
        int i = c7275.f2779;
        if (((long) i) + j > c7275.f21950) {
            return new String(mo9661(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c7275.f2778, i, i2, charset);
        int i3 = c7275.f2779 + i2;
        c7275.f2779 = i3;
        this.f6210 -= j;
        if (i3 == c7275.f21950) {
            this.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        }
        return str;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public short mo9666() throws EOFException {
        return C2963.m5689(readShort());
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public long mo9667() throws EOFException {
        return C2963.m5688(readLong());
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public void mo9670(long j) throws EOFException {
        if (this.f6210 < j) {
            throw new EOFException();
        }
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public OutputStream mo9672() {
        return new C3601();
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public long mo9673(byte b) {
        return mo9630(b, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[EDGE_INSN: B:43:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo9674() throws EOFException {
        int i;
        if (m9684() == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C7275 c7275 = this.f6209;
            C5499.m17100(c7275);
            byte[] bArr = c7275.f2778;
            int i3 = c7275.f2779;
            int i4 = c7275.f21950;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b >= 65 && b <= 70) {
                    i = b + C4750.f10624;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + C2963.m5693(b));
                    }
                    z = true;
                    if (i3 != i4) {
                        this.f6209 = c7275.m3540();
                        C7278.m22744(c7275);
                    } else {
                        c7275.f2779 = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new C3600().mo9646(j).writeByte(b).mo9662());
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.f6209 != null);
        m9680(m9684() - ((long) i2));
        return j;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final C3600 m9675(@InterfaceC6399 InputStream inputStream) throws IOException {
        C5499.m17103(inputStream, "input");
        m9677(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final C3600 m9676(@InterfaceC6399 InputStream inputStream, long j) throws IOException {
        C5499.m17103(inputStream, "input");
        if (j >= 0) {
            m9677(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final void m9677(InputStream inputStream, long j, boolean z) throws IOException {
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            C7275 c7275M9687 = m9687(1);
            int i = inputStream.read(c7275M9687.f2778, c7275M9687.f21950, (int) Math.min(j, 8192 - c7275M9687.f21950));
            if (i == -1) {
                if (c7275M9687.f2779 == c7275M9687.f21950) {
                    this.f6209 = c7275M9687.m3540();
                    C7278.m22744(c7275M9687);
                }
                if (!z) {
                    throw new EOFException();
                }
                return;
            }
            c7275M9687.f21950 += i;
            long j2 = i;
            this.f6210 += j2;
            j -= j2;
        }
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final C0192 m9678() {
        return m9599(this, null, 1, null);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final C0192 m9679(@InterfaceC6399 C0192 c0192) {
        C5499.m17103(c0192, "unsafeCursor");
        return C0001.m5478(this, c0192);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public final void m9680(long j) {
        this.f6210 = j;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public final C3630 m9681() {
        return m9635("SHA-1");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public final C3630 m9682() {
        return m9635("SHA-256");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public final C3630 m9683() {
        return m9635("SHA-512");
    }

    @InterfaceC5572(name = "size")
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public final long m9684() {
        return this.f6210;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public final C3630 m9685() {
        if (m9684() <= 2147483647L) {
            return m9686((int) m9684());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + m9684()).toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public final C3630 m9686(int i) {
        if (i == 0) {
            return C3630.f6372;
        }
        C2963.m5677(m9684(), 0L, i);
        C7275 c7275 = this.f6209;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C5499.m17100(c7275);
            int i5 = c7275.f21950;
            int i6 = c7275.f2779;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c7275 = c7275.f21953;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C7275 c72752 = this.f6209;
        int i7 = 0;
        while (i2 < i) {
            C5499.m17100(c72752);
            bArr[i7] = c72752.f2778;
            i2 += c72752.f21950 - c72752.f2779;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c72752.f2779;
            c72752.f21951 = true;
            i7++;
            c72752 = c72752.f21953;
        }
        return new C7279(bArr, iArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public final C7275 m9687(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C7275 c7275 = this.f6209;
        if (c7275 != null) {
            C5499.m17100(c7275);
            C7275 c72752 = c7275.f21954;
            C5499.m17100(c72752);
            return (c72752.f21950 + i > 8192 || !c72752.f21952) ? c72752.m22726(C7278.m22745()) : c72752;
        }
        C7275 c7275M22745 = C7278.m22745();
        this.f6209 = c7275M22745;
        c7275M22745.f21954 = c7275M22745;
        c7275M22745.f21953 = c7275M22745;
        return c7275M22745;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۦۣ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9668(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "byteString");
        c3630.mo9864(this, 0, c3630.m9852());
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥۣۣ۟۟(LYue/ۥۣ۟ۥۤ;II)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9640(@InterfaceC6399 C3630 c3630, int i, int i2) {
        C5499.m17103(c3630, "byteString");
        c3630.mo9864(this, i, i2);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠۠(LYue/ۥۣۢ۟ۦ;J)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9613(@InterfaceC6399 InterfaceC7506 interfaceC7506, long j) throws IOException {
        C5499.m17103(interfaceC7506, "source");
        while (j > 0) {
            long jMo9103 = interfaceC7506.mo9103(this, j);
            if (jMo9103 == -1) {
                throw new EOFException();
            }
            j -= jMo9103;
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: write([B)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 write(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    /* JADX DEBUG: Method merged with bridge method: write([BII)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 write(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "source");
        long j = i2;
        C2963.m5677(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C7275 c7275M9687 = m9687(1);
            int iMin = Math.min(i3 - i, 8192 - c7275M9687.f21950);
            int i4 = i + iMin;
            C3404.m7123(bArr, c7275M9687.f2778, c7275M9687.f21950, i, i4);
            c7275M9687.f21950 += iMin;
            i = i4;
        }
        m9680(m9684() + j);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: writeByte(I)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 writeByte(int i) {
        C7275 c7275M9687 = m9687(1);
        byte[] bArr = c7275M9687.f2778;
        int i2 = c7275M9687.f21950;
        c7275M9687.f21950 = i2 + 1;
        bArr[i2] = (byte) i;
        m9680(m9684() + 1);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۦۦ(J)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9671(long j) {
        boolean z;
        if (j == 0) {
            return writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return mo9638("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < C7026.f21194 ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < C4720.f10089 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C7275 c7275M9687 = m9687(i);
        byte[] bArr = c7275M9687.f2778;
        int i2 = c7275M9687.f21950 + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = C0001.m5505()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c7275M9687.f21950 += i;
        m9680(m9684() + ((long) i));
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۤ(J)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9646(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C7275 c7275M9687 = m9687(i);
        byte[] bArr = c7275M9687.f2778;
        int i2 = c7275M9687.f21950;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C0001.m5505()[(int) (15 & j)];
            j >>>= 4;
        }
        c7275M9687.f21950 += i;
        m9680(m9684() + ((long) i));
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: writeInt(I)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 writeInt(int i) {
        C7275 c7275M9687 = m9687(4);
        byte[] bArr = c7275M9687.f2778;
        int i2 = c7275M9687.f21950;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c7275M9687.f21950 = i2 + 4;
        m9680(m9684() + 4);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡۢ(I)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9621(int i) {
        return writeInt(C2963.m5687(i));
    }

    /* JADX DEBUG: Method merged with bridge method: writeLong(J)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 writeLong(long j) {
        C7275 c7275M9687 = m9687(8);
        byte[] bArr = c7275M9687.f2778;
        int i = c7275M9687.f21950;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        c7275M9687.f21950 = i + 8;
        m9680(m9684() + 8);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠ۧ(J)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9617(long j) {
        return writeLong(C2963.m5688(j));
    }

    /* JADX DEBUG: Method merged with bridge method: writeShort(I)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 writeShort(int i) {
        C7275 c7275M9687 = m9687(2);
        byte[] bArr = c7275M9687.f2778;
        int i2 = c7275M9687.f21950;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c7275M9687.f21950 = i2 + 2;
        m9680(m9684() + 2);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟(I)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9636(int i) {
        return writeShort(C2963.m5689((short) i));
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۦۤ(Ljava/lang/String;IILjava/nio/charset/Charset;)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9669(@InterfaceC6399 String str, int i, int i2, @InterfaceC6399 Charset charset) {
        C5499.m17103(str, "string");
        C5499.m17103(charset, "charset");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        if (C5499.m17094(charset, C3794.f505)) {
            return mo9645(str, i, i2);
        }
        String strSubstring = str.substring(i, i2);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۤۡ(Ljava/lang/String;Ljava/nio/charset/Charset;)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9649(@InterfaceC6399 String str, @InterfaceC6399 Charset charset) {
        C5499.m17103(str, "string");
        C5499.m17103(charset, "charset");
        return mo9669(str, 0, str.length(), charset);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public final C3600 m9704(@InterfaceC6399 OutputStream outputStream) throws IOException {
        C5499.m17103(outputStream, "out");
        return m9600(this, outputStream, 0L, 2, null);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public final C3600 m9705(@InterfaceC6399 OutputStream outputStream, long j) throws IOException {
        C5499.m17103(outputStream, "out");
        C2963.m5677(this.f6210, 0L, j);
        C7275 c7275 = this.f6209;
        while (j > 0) {
            C5499.m17100(c7275);
            int iMin = (int) Math.min(j, c7275.f21950 - c7275.f2779);
            outputStream.write(c7275.f2778, c7275.f2779, iMin);
            int i = c7275.f2779 + iMin;
            c7275.f2779 = i;
            long j2 = iMin;
            this.f6210 -= j2;
            j -= j2;
            if (i == c7275.f21950) {
                C7275 c7275M3540 = c7275.m3540();
                this.f6209 = c7275M3540;
                C7278.m22744(c7275);
                c7275 = c7275M3540;
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9638(@InterfaceC6399 String str) {
        C5499.m17103(str, "string");
        return mo9645(str, 0, str.length());
    }

    /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟ۨ(Ljava/lang/String;II)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9645(@InterfaceC6399 String str, int i, int i2) {
        char cCharAt;
        C5499.m17103(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C7275 c7275M9687 = m9687(1);
                byte[] bArr = c7275M9687.f2778;
                int i3 = c7275M9687.f21950 - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c7275M9687.f21950;
                int i6 = (i3 + i) - i5;
                c7275M9687.f21950 = i5 + i6;
                m9680(m9684() + ((long) i6));
            } else {
                if (cCharAt2 < 2048) {
                    C7275 c7275M96872 = m9687(2);
                    byte[] bArr2 = c7275M96872.f2778;
                    int i7 = c7275M96872.f21950;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c7275M96872.f21950 = i7 + 2;
                    m9680(m9684() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C7275 c7275M96873 = m9687(3);
                    byte[] bArr3 = c7275M96873.f2778;
                    int i8 = c7275M96873.f21950;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | Opcodes.SHL_INT_LIT8);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c7275M96873.f21950 = i8 + 3;
                    m9680(m9684() + 3);
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C7275 c7275M96874 = m9687(4);
                        byte[] bArr4 = c7275M96874.f2778;
                        int i11 = c7275M96874.f21950;
                        bArr4[i11] = (byte) ((i10 >> 18) | C3464.f305);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c7275M96874.f21950 = i11 + 4;
                        m9680(m9684() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۠(I)LYue/ۥۣۣ۟۟; */
    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3600 mo9615(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            C7275 c7275M9687 = m9687(2);
            byte[] bArr = c7275M9687.f2778;
            int i2 = c7275M9687.f21950;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c7275M9687.f21950 = i2 + 2;
            m9680(m9684() + 2);
        } else if (55296 <= i && i < 57344) {
            writeByte(63);
        } else if (i < 65536) {
            C7275 c7275M96872 = m9687(3);
            byte[] bArr2 = c7275M96872.f2778;
            int i3 = c7275M96872.f21950;
            bArr2[i3] = (byte) ((i >> 12) | Opcodes.SHL_INT_LIT8);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c7275M96872.f21950 = i3 + 3;
            m9680(m9684() + 3);
        } else {
            if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + C2963.m5694(i));
            }
            C7275 c7275M96873 = m9687(4);
            byte[] bArr3 = c7275M96873.f2778;
            int i4 = c7275M96873.f21950;
            bArr3[i4] = (byte) ((i >> 18) | C3464.f305);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            c7275M96873.f21950 = i4 + 4;
            m9680(m9684() + 4);
        }
        return this;
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۨ$ۥ۟ */
    @InterfaceC7507({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n74#2:642\n86#2:643\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:642\n136#1:643\n*E\n"})
    public static final class C0193 extends InputStream {
        public C0193() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C3600.this.m9684(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.InputStream
        public int read() {
            if (C3600.this.m9684() > 0) {
                return C3600.this.readByte() & 255;
            }
            return -1;
        }

        @InterfaceC6399
        public String toString() {
            return C3600.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@InterfaceC6399 byte[] bArr, int i, int i2) {
            C5499.m17103(bArr, "sink");
            return C3600.this.read(bArr, i, i2);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@InterfaceC6399 ByteBuffer byteBuffer) throws IOException {
        C5499.m17103(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C7275 c7275M9687 = m9687(1);
            int iMin = Math.min(i, 8192 - c7275M9687.f21950);
            byteBuffer.get(c7275M9687.f2778, c7275M9687.f21950, iMin);
            i -= iMin;
            c7275M9687.f21950 += iMin;
        }
        this.f6210 += (long) iRemaining;
        return iRemaining;
    }

    @Override // Yue.InterfaceC3604
    public int read(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    @Override // Yue.InterfaceC3604
    public int read(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "sink");
        C2963.m5677(bArr.length, i, i2);
        C7275 c7275 = this.f6209;
        if (c7275 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c7275.f21950 - c7275.f2779);
        byte[] bArr2 = c7275.f2778;
        int i3 = c7275.f2779;
        C3404.m7123(bArr2, bArr, i, i3, i3 + iMin);
        c7275.f2779 += iMin;
        m9680(m9684() - ((long) iMin));
        if (c7275.f2779 == c7275.f21950) {
            this.f6209 = c7275.m3540();
            C7278.m22744(c7275);
        }
        return iMin;
    }
}
