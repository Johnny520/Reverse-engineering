package Yue;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥۡۦۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#1:191\n62#1:201\n62#1:208\n62#1:214\n62#1:216\n62#1:220\n62#1:225\n62#1:240\n62#1:244\n62#1:251\n62#1:264\n62#1:272\n62#1:273\n62#1:274\n62#1:280\n62#1:288\n62#1:301\n62#1:305\n62#1:306\n62#1:307\n62#1:308\n62#1:313\n62#1:325\n62#1:341\n62#1:351\n62#1:354\n62#1:357\n62#1:360\n62#1:363\n62#1:366\n62#1:372\n62#1:389\n62#1:409\n62#1:424\n62#1:441\n62#1:454\n62#1:475\n62#1:482\n38#2:186\n39#2,3:188\n42#2,6:192\n51#2:198\n52#2:200\n56#2,2:202\n60#2:204\n61#2,2:206\n63#2,3:209\n69#2,2:212\n74#2:215\n75#2:217\n79#2,2:218\n84#2:221\n86#2,2:223\n88#2,13:226\n107#2:239\n108#2:241\n112#2,2:242\n117#2,6:245\n123#2,9:252\n134#2,3:261\n137#2,5:265\n142#2:271\n146#2,5:275\n151#2,5:281\n158#2,2:286\n160#2,11:289\n174#2:300\n175#2:302\n179#2,2:303\n184#2,4:309\n188#2,6:314\n198#2:320\n199#2,3:322\n202#2,8:326\n210#2,3:335\n217#2,3:338\n220#2,7:342\n230#2,2:349\n235#2,2:352\n240#2,2:355\n245#2,2:358\n250#2,2:361\n255#2,2:364\n260#2,5:367\n265#2,11:373\n279#2,5:384\n284#2,14:390\n301#2,2:404\n303#2,2:407\n305#2,7:410\n314#2,2:417\n316#2,4:420\n320#2,11:425\n334#2,2:436\n337#2,2:439\n339#2,7:442\n350#2,2:449\n353#2,2:452\n355#2,7:455\n371#2:462\n373#2,11:464\n385#2:476\n389#2:477\n393#2,4:478\n397#2:483\n399#2:484\n401#2:485\n1#3:187\n1#3:199\n1#3:205\n1#3:222\n1#3:321\n1#3:406\n1#3:419\n1#3:438\n1#3:451\n1#3:463\n89#4:270\n89#4:334\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n66#1:191\n67#1:201\n69#1:208\n70#1:214\n71#1:216\n72#1:220\n73#1:225\n74#1:240\n75#1:244\n77#1:251\n79#1:264\n82#1:272\n83#1:273\n87#1:274\n90#1:280\n91#1:288\n92#1:301\n93#1:305\n96#1:306\n97#1:307\n102#1:308\n105#1:313\n107#1:325\n108#1:341\n109#1:351\n110#1:354\n111#1:357\n112#1:360\n113#1:363\n114#1:366\n115#1:372\n116#1:389\n117#1:409\n121#1:424\n124#1:441\n127#1:454\n141#1:475\n181#1:482\n66#1:186\n66#1:188,3\n66#1:192,6\n67#1:198\n67#1:200\n68#1:202,2\n69#1:204\n69#1:206,2\n69#1:209,3\n70#1:212,2\n71#1:215\n71#1:217\n72#1:218,2\n73#1:221\n73#1:223,2\n73#1:226,13\n74#1:239\n74#1:241\n75#1:242,2\n77#1:245,6\n77#1:252,9\n79#1:261,3\n79#1:265,5\n79#1:271\n90#1:275,5\n90#1:281,5\n91#1:286,2\n91#1:289,11\n92#1:300\n92#1:302\n93#1:303,2\n105#1:309,4\n105#1:314,6\n107#1:320\n107#1:322,3\n107#1:326,8\n107#1:335,3\n108#1:338,3\n108#1:342,7\n109#1:349,2\n110#1:352,2\n111#1:355,2\n112#1:358,2\n113#1:361,2\n114#1:364,2\n115#1:367,5\n115#1:373,11\n116#1:384,5\n116#1:390,14\n117#1:404,2\n117#1:407,2\n117#1:410,7\n121#1:417,2\n121#1:420,4\n121#1:425,11\n124#1:436,2\n124#1:439,2\n124#1:442,7\n127#1:449,2\n127#1:452,2\n127#1:455,7\n141#1:462\n141#1:464,11\n141#1:476\n143#1:477\n181#1:478,4\n181#1:483\n182#1:484\n183#1:485\n66#1:187\n67#1:199\n69#1:205\n73#1:222\n107#1:321\n117#1:406\n121#1:419\n124#1:438\n127#1:451\n141#1:463\n79#1:270\n107#1:334\n*E\n"})
public final class C7023 implements InterfaceC3604 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC7506 f21165;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final C3600 f21166;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC5568
    public boolean f21167;

    public C7023(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        C5499.m17103(interfaceC7506, "source");
        this.f21165 = interfaceC7506;
        this.f21166 = new C3600();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ void m3319() {
    }

    @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f21167) {
            return;
        }
        this.f21167 = true;
        this.f21165.close();
        this.f21166.m9603();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f21167;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    public InterfaceC3604 peek() {
        return C6542.m20831(new C6646(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC3604
    public int read(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    @Override // Yue.InterfaceC3604
    public byte readByte() throws EOFException {
        mo9670(1L);
        return this.f21166.readByte();
    }

    @Override // Yue.InterfaceC3604
    public void readFully(@InterfaceC6399 byte[] bArr) throws EOFException {
        C5499.m17103(bArr, "sink");
        try {
            mo9670(bArr.length);
            this.f21166.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f21166.m9684() > 0) {
                C3600 c3600 = this.f21166;
                int i2 = c3600.read(bArr, i, (int) c3600.m9684());
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
            throw e;
        }
    }

    @Override // Yue.InterfaceC3604
    public int readInt() throws EOFException {
        mo9670(4L);
        return this.f21166.readInt();
    }

    @Override // Yue.InterfaceC3604
    public long readLong() throws EOFException {
        mo9670(8L);
        return this.f21166.readLong();
    }

    @Override // Yue.InterfaceC3604
    public short readShort() throws EOFException {
        mo9670(2L);
        return this.f21166.readShort();
    }

    @Override // Yue.InterfaceC3604
    public void skip(long j) throws EOFException {
        if (!(!this.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.f21166.m9684() == 0 && this.f21165.mo9103(this.f21166, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.f21166.m9684());
            this.f21166.skip(jMin);
            j -= jMin;
        }
    }

    @InterfaceC6399
    public String toString() {
        return "buffer(" + this.f21165 + ')';
    }

    @Override // Yue.InterfaceC7506
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo518() {
        return this.f21165.mo518();
    }

    @Override // Yue.InterfaceC3604, Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public C3600 mo9604() {
        return this.f21166;
    }

    @Override // Yue.InterfaceC3604, Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public C3600 mo9605() {
        return this.f21166;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public InputStream mo9607() {
        return new C1139();
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public String mo9609(long j) throws EOFException {
        mo9670(j);
        return this.f21166.mo9609(j);
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public C3630 mo9612(long j) throws EOFException {
        mo9670(j);
        return this.f21166.mo9612(j);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public long mo9616(@InterfaceC6399 C3630 c3630, long j) throws IOException {
        C5499.m17103(c3630, "bytes");
        if (!(!this.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jMo9616 = this.f21166.mo9616(c3630, j);
            if (jMo9616 != -1) {
                return jMo9616;
            }
            long jM9684 = this.f21166.m9684();
            if (this.f21165.mo9103(this.f21166, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (jM9684 - ((long) c3630.m9852())) + 1);
        }
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public byte[] mo9618() throws IOException {
        this.f21166.mo9610(this.f21165);
        return this.f21166.mo9618();
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public boolean mo9622() {
        if (!this.f21167) {
            return this.f21166.mo9622() && this.f21165.mo9103(this.f21166, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public long mo9623(@InterfaceC6399 C3630 c3630, long j) {
        C5499.m17103(c3630, "targetBytes");
        if (!(!this.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jMo9623 = this.f21166.mo9623(c3630, j);
            if (jMo9623 != -1) {
                return jMo9623;
            }
            long jM9684 = this.f21166.m9684();
            if (this.f21165.mo9103(this.f21166, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, jM9684);
        }
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public long mo9624(@InterfaceC6399 InterfaceC7472 interfaceC7472) throws IOException {
        C5499.m17103(interfaceC7472, "sink");
        long j = 0;
        while (this.f21165.mo9103(this.f21166, 8192L) != -1) {
            long jM9608 = this.f21166.m9608();
            if (jM9608 > 0) {
                j += jM9608;
                interfaceC7472.mo9102(this.f21166, jM9608);
            }
        }
        if (this.f21166.m9684() <= 0) {
            return j;
        }
        long jM9684 = j + this.f21166.m9684();
        C3600 c3600 = this.f21166;
        interfaceC7472.mo9102(c3600, c3600.m9684());
        return jM9684;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public long mo9627(byte b, long j) {
        return mo9630(b, j, Long.MAX_VALUE);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public boolean mo9629(long j, @InterfaceC6399 C3630 c3630, int i, int i2) {
        C5499.m17103(c3630, "bytes");
        if (!(!this.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j >= 0 && i >= 0 && i2 >= 0 && c3630.m9852() - i >= i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (mo9651(1 + j2) && this.f21166.m9650(j2) == c3630.m9823(i + i3)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public long mo9630(byte b, long j, long j2) {
        if (!(!this.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long jMo9630 = this.f21166.mo9630(b, j, j2);
            if (jMo9630 != -1) {
                return jMo9630;
            }
            long jM9684 = this.f21166.m9684();
            if (jM9684 >= j2 || this.f21165.mo9103(this.f21166, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, jM9684);
        }
        return -1L;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public String mo9631() {
        long jMo9673 = mo9673((byte) 10);
        if (jMo9673 != -1) {
            return C0001.m5508(this.f21166, jMo9673);
        }
        if (this.f21166.m9684() != 0) {
            return mo9609(this.f21166.m9684());
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
        if (!(!this.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f21166.m9684() == 0 && this.f21165.mo9103(this.f21166, 8192L) == -1) {
            return -1L;
        }
        return this.f21166.mo9103(c3600, Math.min(j, this.f21166.m9684()));
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public long mo9633() throws EOFException {
        byte bM9650;
        mo9670(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo9651(j2)) {
                break;
            }
            bM9650 = this.f21166.m9650(j);
            if ((bM9650 < 48 || bM9650 > 57) && !(j == 0 && bM9650 == 45)) {
                break;
            }
            j = j2;
        }
        if (j == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bM9650, C3791.m836(C3791.m836(16)));
            C5499.m17102(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f21166.mo9633();
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
    public String mo9634(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jMo9630 = mo9630((byte) 10, 0L, j2);
        if (jMo9630 != -1) {
            return C0001.m5508(this.f21166, jMo9630);
        }
        if (j2 < Long.MAX_VALUE && mo9651(j2) && this.f21166.m9650(j2 - 1) == 13 && mo9651(1 + j2) && this.f21166.m9650(j2) == 10) {
            return C0001.m5508(this.f21166, j2);
        }
        C3600 c3600 = new C3600();
        C3600 c36002 = this.f21166;
        c36002.m9620(c3600, 0L, Math.min(32, c36002.m9684()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f21166.m9684(), j) + " content=" + c3600.mo9648().mo9828() + C8039.f23902);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public long mo9639(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "targetBytes");
        return mo9623(c3630, 0L);
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public String mo9642(@InterfaceC6399 Charset charset) throws IOException {
        C5499.m17103(charset, "charset");
        this.f21166.mo9610(this.f21165);
        return this.f21166.mo9642(charset);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    public int mo9643(@InterfaceC6399 C6582 c6582) throws EOFException {
        C5499.m17103(c6582, "options");
        if (!(!this.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iM5510 = C0001.m5510(this.f21166, c6582, true);
            if (iM5510 != -2) {
                if (iM5510 != -1) {
                    this.f21166.skip(c6582.m20903()[iM5510].m9852());
                    return iM5510;
                }
            } else if (this.f21165.mo9103(this.f21166, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public int mo9644() throws EOFException {
        mo9670(1L);
        byte bM9650 = this.f21166.m9650(0L);
        if ((bM9650 & 224) == 192) {
            mo9670(2L);
        } else if ((bM9650 & 240) == 224) {
            mo9670(3L);
        } else if ((bM9650 & 248) == 240) {
            mo9670(4L);
        }
        return this.f21166.mo9644();
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟ */
    public boolean mo9647(long j, @InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "bytes");
        return mo9629(j, c3630, 0, c3630.m9852());
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public C3630 mo9648() throws IOException {
        this.f21166.mo9610(this.f21165);
        return this.f21166.mo9648();
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public boolean mo9651(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f21166.m9684() < j) {
            if (this.f21165.mo9103(this.f21166, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public String mo9655() {
        return mo9634(Long.MAX_VALUE);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۥ */
    public int mo9657() throws EOFException {
        mo9670(4L);
        return this.f21166.mo9657();
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ */
    public byte[] mo9661(long j) throws EOFException {
        mo9670(j);
        return this.f21166.mo9661(j);
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ */
    public String mo9662() throws IOException {
        this.f21166.mo9610(this.f21165);
        return this.f21166.mo9662();
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public long mo9663(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "bytes");
        return mo9616(c3630, 0L);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ */
    public void mo9664(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "sink");
        try {
            mo9670(j);
            this.f21166.mo9664(c3600, j);
        } catch (EOFException e) {
            c3600.mo9610(this.f21166);
            throw e;
        }
    }

    @Override // Yue.InterfaceC3604
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ */
    public String mo9665(long j, @InterfaceC6399 Charset charset) throws EOFException {
        C5499.m17103(charset, "charset");
        mo9670(j);
        return this.f21166.mo9665(j, charset);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠ */
    public short mo9666() throws EOFException {
        mo9670(2L);
        return this.f21166.mo9666();
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ */
    public long mo9667() throws EOFException {
        mo9670(8L);
        return this.f21166.mo9667();
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
    public void mo9670(long j) throws EOFException {
        if (!mo9651(j)) {
            throw new EOFException();
        }
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ */
    public long mo9673(byte b) {
        return mo9630(b, 0L, Long.MAX_VALUE);
    }

    @Override // Yue.InterfaceC3604
    /* JADX INFO: renamed from: ۥ۟۟ۧ */
    public long mo9674() throws EOFException {
        byte bM9650;
        mo9670(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo9651(i2)) {
                break;
            }
            bM9650 = this.f21166.m9650(i);
            if ((bM9650 < 48 || bM9650 > 57) && ((bM9650 < 97 || bM9650 > 102) && (bM9650 < 65 || bM9650 > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bM9650, C3791.m836(C3791.m836(16)));
            C5499.m17102(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f21166.mo9674();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC3604
    public int read(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "sink");
        long j = i2;
        C2963.m5677(bArr.length, i, j);
        if (this.f21166.m9684() == 0 && this.f21165.mo9103(this.f21166, 8192L) == -1) {
            return -1;
        }
        return this.f21166.read(bArr, i, (int) Math.min(j, this.f21166.m9684()));
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣ۠$ۥ */
    @InterfaceC7507({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n+ 2 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#2:186\n62#2:187\n62#2:188\n62#2:190\n62#2:191\n62#2:192\n62#2:193\n74#3:189\n86#3:194\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n*L\n149#1:186\n150#1:187\n153#1:188\n160#1:190\n161#1:191\n165#1:192\n170#1:193\n153#1:189\n170#1:194\n*E\n"})
    public static final class C1139 extends InputStream {
        public C1139() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C7023 c7023 = C7023.this;
            if (c7023.f21167) {
                throw new IOException("closed");
            }
            return (int) Math.min(c7023.f21166.m9684(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C7023.this.close();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.InputStream
        public int read() throws IOException {
            C7023 c7023 = C7023.this;
            if (c7023.f21167) {
                throw new IOException("closed");
            }
            if (c7023.f21166.m9684() == 0) {
                C7023 c70232 = C7023.this;
                if (c70232.f21165.mo9103(c70232.f21166, 8192L) == -1) {
                    return -1;
                }
            }
            return C7023.this.f21166.readByte() & 255;
        }

        @InterfaceC6399
        public String toString() {
            return C7023.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@InterfaceC6399 byte[] bArr, int i, int i2) throws IOException {
            C5499.m17103(bArr, "data");
            if (!C7023.this.f21167) {
                C2963.m5677(bArr.length, i, i2);
                if (C7023.this.f21166.m9684() == 0) {
                    C7023 c7023 = C7023.this;
                    if (c7023.f21165.mo9103(c7023.f21166, 8192L) == -1) {
                        return -1;
                    }
                }
                return C7023.this.f21166.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@InterfaceC6399 ByteBuffer byteBuffer) {
        C5499.m17103(byteBuffer, "sink");
        if (this.f21166.m9684() == 0 && this.f21165.mo9103(this.f21166, 8192L) == -1) {
            return -1;
        }
        return this.f21166.read(byteBuffer);
    }
}
