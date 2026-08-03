package Yue;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,402:1\n1#2:403\n62#3:404\n62#3:405\n62#3:406\n62#3:407\n62#3:408\n62#3:409\n62#3:410\n62#3:411\n62#3:412\n62#3:413\n62#3:414\n62#3:415\n62#3:416\n62#3:417\n62#3:418\n62#3:419\n62#3:420\n62#3:421\n62#3:422\n62#3:423\n62#3:424\n62#3:425\n62#3:426\n62#3:428\n62#3:429\n62#3:430\n62#3:431\n62#3:432\n62#3:433\n62#3:434\n62#3:435\n62#3:436\n62#3:437\n62#3:438\n62#3:439\n62#3:440\n62#3:441\n62#3:442\n62#3:443\n62#3:444\n62#3:445\n62#3:446\n62#3:447\n62#3:449\n62#3:450\n62#3:451\n62#3:452\n62#3:453\n62#3:454\n62#3:455\n62#3:456\n62#3:457\n62#3:458\n62#3:459\n62#3:460\n62#3:461\n62#3:462\n62#3:463\n62#3:464\n62#3:465\n62#3:466\n62#3:467\n62#3:468\n62#3:469\n62#3:470\n62#3:471\n62#3:472\n62#3:473\n62#3:474\n62#3:475\n89#4:427\n89#4:448\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n41#1:404\n42#1:405\n46#1:406\n47#1:407\n52#1:408\n62#1:409\n63#1:410\n70#1:411\n74#1:412\n75#1:413\n80#1:414\n87#1:415\n94#1:416\n99#1:417\n107#1:418\n108#1:419\n113#1:420\n122#1:421\n123#1:422\n130#1:423\n136#1:424\n137#1:425\n141#1:426\n142#1:428\n150#1:429\n154#1:430\n159#1:431\n160#1:432\n163#1:433\n166#1:434\n167#1:435\n168#1:436\n174#1:437\n175#1:438\n180#1:439\n187#1:440\n188#1:441\n193#1:442\n201#1:443\n203#1:444\n204#1:445\n206#1:446\n209#1:447\n211#1:449\n219#1:450\n226#1:451\n231#1:452\n236#1:453\n241#1:454\n246#1:455\n251#1:456\n256#1:457\n264#1:458\n275#1:459\n283#1:460\n297#1:461\n304#1:462\n307#1:463\n308#1:464\n319#1:465\n324#1:466\n325#1:467\n338#1:468\n341#1:469\n342#1:470\n354#1:471\n357#1:472\n358#1:473\n383#1:474\n396#1:475\n141#1:427\n209#1:448\n*E\n"})
@InterfaceC5572(name = "-RealBufferedSource")
public final class C2961 {
    /* JADX INFO: renamed from: ۥ */
    public static final void m25(@InterfaceC6399 C7023 c7023) throws IOException {
        C5499.m17103(c7023, "<this>");
        if (c7023.f21167) {
            return;
        }
        c7023.f21167 = true;
        c7023.f21165.close();
        c7023.f21166.m9603();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m26(@InterfaceC6399 C7023 c7023) {
        C5499.m17103(c7023, "<this>");
        if (!c7023.f21167) {
            return c7023.f21166.mo9622() && c7023.f21165.mo9103(c7023.f21166, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m5629(@InterfaceC6399 C7023 c7023, byte b, long j, long j2) {
        C5499.m17103(c7023, "<this>");
        if (!(!c7023.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long jMo9630 = c7023.f21166.mo9630(b, j, j2);
            if (jMo9630 != -1) {
                return jMo9630;
            }
            long jM9684 = c7023.f21166.m9684();
            if (jM9684 >= j2 || c7023.f21165.mo9103(c7023.f21166, 8192L) == -1) {
                break;
            }
            j = Math.max(j, jM9684);
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long m5630(@InterfaceC6399 C7023 c7023, @InterfaceC6399 C3630 c3630, long j) throws IOException {
        C5499.m17103(c7023, "<this>");
        C5499.m17103(c3630, "bytes");
        if (!(!c7023.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jMo9616 = c7023.f21166.mo9616(c3630, j);
            if (jMo9616 != -1) {
                return jMo9616;
            }
            long jM9684 = c7023.f21166.m9684();
            if (c7023.f21165.mo9103(c7023.f21166, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (jM9684 - ((long) c3630.m9852())) + 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m5631(@InterfaceC6399 C7023 c7023, @InterfaceC6399 C3630 c3630, long j) {
        C5499.m17103(c7023, "<this>");
        C5499.m17103(c3630, "targetBytes");
        if (!(!c7023.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jMo9623 = c7023.f21166.mo9623(c3630, j);
            if (jMo9623 != -1) {
                return jMo9623;
            }
            long jM9684 = c7023.f21166.m9684();
            if (c7023.f21165.mo9103(c7023.f21166, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, jM9684);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final InterfaceC3604 m5632(@InterfaceC6399 C7023 c7023) {
        C5499.m17103(c7023, "<this>");
        return C6542.m20831(new C6646(c7023));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean m5633(@InterfaceC6399 C7023 c7023, long j, @InterfaceC6399 C3630 c3630, int i, int i2) {
        C5499.m17103(c7023, "<this>");
        C5499.m17103(c3630, "bytes");
        if (!(!c7023.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j < 0 || i < 0 || i2 < 0 || c3630.m9852() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = ((long) i3) + j;
            if (!c7023.mo9651(1 + j2) || c7023.f21166.m9650(j2) != c3630.m9823(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m5634(@InterfaceC6399 C7023 c7023, @InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(c7023, "<this>");
        C5499.m17103(bArr, "sink");
        long j = i2;
        C2963.m5677(bArr.length, i, j);
        if (c7023.f21166.m9684() == 0 && c7023.f21165.mo9103(c7023.f21166, 8192L) == -1) {
            return -1;
        }
        return c7023.f21166.read(bArr, i, (int) Math.min(j, c7023.f21166.m9684()));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m5635(@InterfaceC6399 C7023 c7023, @InterfaceC6399 C3600 c3600, long j) {
        C5499.m17103(c7023, "<this>");
        C5499.m17103(c3600, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!c7023.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        if (c7023.f21166.m9684() == 0 && c7023.f21165.mo9103(c7023.f21166, 8192L) == -1) {
            return -1L;
        }
        return c7023.f21166.mo9103(c3600, Math.min(j, c7023.f21166.m9684()));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final long m5636(@InterfaceC6399 C7023 c7023, @InterfaceC6399 InterfaceC7472 interfaceC7472) throws IOException {
        C5499.m17103(c7023, "<this>");
        C5499.m17103(interfaceC7472, "sink");
        long j = 0;
        while (c7023.f21165.mo9103(c7023.f21166, 8192L) != -1) {
            long jM9608 = c7023.f21166.m9608();
            if (jM9608 > 0) {
                j += jM9608;
                interfaceC7472.mo9102(c7023.f21166, jM9608);
            }
        }
        if (c7023.f21166.m9684() <= 0) {
            return j;
        }
        long jM9684 = j + c7023.f21166.m9684();
        C3600 c3600 = c7023.f21166;
        interfaceC7472.mo9102(c3600, c3600.m9684());
        return jM9684;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final byte m5637(@InterfaceC6399 C7023 c7023) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(1L);
        return c7023.f21166.readByte();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final byte[] m5638(@InterfaceC6399 C7023 c7023) throws IOException {
        C5499.m17103(c7023, "<this>");
        c7023.f21166.mo9610(c7023.f21165);
        return c7023.f21166.mo9618();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final byte[] m5639(@InterfaceC6399 C7023 c7023, long j) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(j);
        return c7023.f21166.mo9661(j);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final C3630 m5640(@InterfaceC6399 C7023 c7023) throws IOException {
        C5499.m17103(c7023, "<this>");
        c7023.f21166.mo9610(c7023.f21165);
        return c7023.f21166.mo9648();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final C3630 m5641(@InterfaceC6399 C7023 c7023, long j) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(j);
        return c7023.f21166.mo9612(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long m5642(@InterfaceC6399 C7023 c7023) throws EOFException {
        byte bM9650;
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!c7023.mo9651(j2)) {
                break;
            }
            bM9650 = c7023.f21166.m9650(j);
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
        return c7023.f21166.mo9633();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final void m5643(@InterfaceC6399 C7023 c7023, @InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c7023, "<this>");
        C5499.m17103(c3600, "sink");
        try {
            c7023.mo9670(j);
            c7023.f21166.mo9664(c3600, j);
        } catch (EOFException e) {
            c3600.mo9610(c7023.f21166);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m5644(@InterfaceC6399 C7023 c7023, @InterfaceC6399 byte[] bArr) throws EOFException {
        C5499.m17103(c7023, "<this>");
        C5499.m17103(bArr, "sink");
        try {
            c7023.mo9670(bArr.length);
            c7023.f21166.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (c7023.f21166.m9684() > 0) {
                C3600 c3600 = c7023.f21166;
                int i2 = c3600.read(bArr, i, (int) c3600.m9684());
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final long m5645(@InterfaceC6399 C7023 c7023) throws EOFException {
        byte bM9650;
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!c7023.mo9651(i2)) {
                break;
            }
            bM9650 = c7023.f21166.m9650(i);
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
        return c7023.f21166.mo9674();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m5646(@InterfaceC6399 C7023 c7023) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(4L);
        return c7023.f21166.readInt();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int m5647(@InterfaceC6399 C7023 c7023) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(4L);
        return c7023.f21166.mo9657();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long m5648(@InterfaceC6399 C7023 c7023) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(8L);
        return c7023.f21166.readLong();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final long m5649(@InterfaceC6399 C7023 c7023) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(8L);
        return c7023.f21166.mo9667();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final short m5650(@InterfaceC6399 C7023 c7023) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(2L);
        return c7023.f21166.readShort();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final short m5651(@InterfaceC6399 C7023 c7023) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(2L);
        return c7023.f21166.mo9666();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final String m5652(@InterfaceC6399 C7023 c7023) throws IOException {
        C5499.m17103(c7023, "<this>");
        c7023.f21166.mo9610(c7023.f21165);
        return c7023.f21166.mo9662();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final String m5653(@InterfaceC6399 C7023 c7023, long j) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(j);
        return c7023.f21166.mo9609(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int m5654(@InterfaceC6399 C7023 c7023) throws EOFException {
        C5499.m17103(c7023, "<this>");
        c7023.mo9670(1L);
        byte bM9650 = c7023.f21166.m9650(0L);
        if ((bM9650 & 224) == 192) {
            c7023.mo9670(2L);
        } else if ((bM9650 & 240) == 224) {
            c7023.mo9670(3L);
        } else if ((bM9650 & 248) == 240) {
            c7023.mo9670(4L);
        }
        return c7023.f21166.mo9644();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final String m5655(@InterfaceC6399 C7023 c7023) {
        C5499.m17103(c7023, "<this>");
        long jMo9673 = c7023.mo9673((byte) 10);
        if (jMo9673 != -1) {
            return C0001.m5508(c7023.f21166, jMo9673);
        }
        if (c7023.f21166.m9684() != 0) {
            return c7023.mo9609(c7023.f21166.m9684());
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String m5656(@InterfaceC6399 C7023 c7023, long j) throws EOFException {
        C5499.m17103(c7023, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jMo9630 = c7023.mo9630((byte) 10, 0L, j2);
        if (jMo9630 != -1) {
            return C0001.m5508(c7023.f21166, jMo9630);
        }
        if (j2 < Long.MAX_VALUE && c7023.mo9651(j2) && c7023.f21166.m9650(j2 - 1) == 13 && c7023.mo9651(1 + j2) && c7023.f21166.m9650(j2) == 10) {
            return C0001.m5508(c7023.f21166, j2);
        }
        C3600 c3600 = new C3600();
        C3600 c36002 = c7023.f21166;
        c36002.m9620(c3600, 0L, Math.min(32, c36002.m9684()));
        throw new EOFException("\\n not found: limit=" + Math.min(c7023.f21166.m9684(), j) + " content=" + c3600.mo9648().mo9828() + C8039.f23902);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final boolean m5657(@InterfaceC6399 C7023 c7023, long j) {
        C5499.m17103(c7023, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!c7023.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        while (c7023.f21166.m9684() < j) {
            if (c7023.f21165.mo9103(c7023.f21166, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final void m5658(@InterfaceC6399 C7023 c7023, long j) throws EOFException {
        C5499.m17103(c7023, "<this>");
        if (!c7023.mo9651(j)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int m5659(@InterfaceC6399 C7023 c7023, @InterfaceC6399 C6582 c6582) throws EOFException {
        C5499.m17103(c7023, "<this>");
        C5499.m17103(c6582, "options");
        if (!(!c7023.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iM5510 = C0001.m5510(c7023.f21166, c6582, true);
            if (iM5510 != -2) {
                if (iM5510 == -1) {
                    return -1;
                }
                c7023.f21166.skip(c6582.m20903()[iM5510].m9852());
                return iM5510;
            }
        } while (c7023.f21165.mo9103(c7023.f21166, 8192L) != -1);
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final void m5660(@InterfaceC6399 C7023 c7023, long j) throws EOFException {
        C5499.m17103(c7023, "<this>");
        if (!(!c7023.f21167)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (c7023.f21166.m9684() == 0 && c7023.f21165.mo9103(c7023.f21166, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c7023.f21166.m9684());
            c7023.f21166.skip(jMin);
            j -= jMin;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final C7827 m5661(@InterfaceC6399 C7023 c7023) {
        C5499.m17103(c7023, "<this>");
        return c7023.f21165.mo518();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final String m5662(@InterfaceC6399 C7023 c7023) {
        C5499.m17103(c7023, "<this>");
        return "buffer(" + c7023.f21165 + ')';
    }
}
