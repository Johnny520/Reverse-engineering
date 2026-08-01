package p183m6;

import com.alibaba.fastjson2.JSONWriter;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import p196n6.InterfaceC5496a;
import p196n6.InterfaceC5497b;
import p376zd.C10010p0;
import p376zd.C10023w;

/* JADX INFO: renamed from: m6.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5049s {
    /* JADX INFO: renamed from: A */
    public static MappedByteBuffer m20408A(FileChannel fileChannel, int i10) {
        try {
            fileChannel.truncate(i10);
            return m20432t(fileChannel, i10);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m20409B(SharedPreferencesC5046p sharedPreferencesC5046p, File file, File file2) {
        try {
            if (m20428p(sharedPreferencesC5046p, file)) {
                return;
            }
        } catch (IOException e10) {
            AbstractC5053w.m20454d(sharedPreferencesC5046p, e10);
        }
        m20435w(sharedPreferencesC5046p);
        try {
            if (m20428p(sharedPreferencesC5046p, file2)) {
                return;
            }
        } catch (IOException e11) {
            AbstractC5053w.m20454d(sharedPreferencesC5046p, e11);
        }
        m20435w(sharedPreferencesC5046p);
    }

    /* JADX INFO: renamed from: C */
    public static int m20410C(int i10) {
        return i10 & (-1073741825);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m20411D(SharedPreferencesC5046p sharedPreferencesC5046p, C5042l c5042l) {
        Exception exc;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        FileChannel.MapMode mapMode;
        ByteOrder byteOrder;
        try {
            int length = c5042l.f15318b.length;
            File file = new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".kva");
            File file2 = new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".kvb");
            if (!AbstractC5056z.m20467h(file) || !AbstractC5056z.m20467h(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile2 = new RandomAccessFile(file, "rw");
            long j10 = length;
            try {
                randomAccessFile2.setLength(j10);
                FileChannel channel = randomAccessFile2.getChannel();
                sharedPreferencesC5046p.f15346s = channel;
                mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = channel.map(mapMode, 0L, j10);
                sharedPreferencesC5046p.f15348u = map;
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                sharedPreferencesC5046p.f15348u.put(c5042l.f15318b, 0, sharedPreferencesC5046p.f15331d);
                randomAccessFile = new RandomAccessFile(file2, "rw");
            } catch (Exception e10) {
                exc = e10;
                randomAccessFile = null;
            }
            try {
                randomAccessFile.setLength(j10);
                FileChannel channel2 = randomAccessFile.getChannel();
                sharedPreferencesC5046p.f15347t = channel2;
                MappedByteBuffer map2 = channel2.map(mapMode, 0L, j10);
                sharedPreferencesC5046p.f15349v = map2;
                map2.order(byteOrder);
                sharedPreferencesC5046p.f15349v.put(c5042l.f15318b, 0, sharedPreferencesC5046p.f15331d);
                return true;
            } catch (Exception e11) {
                exc = e11;
                AbstractC5056z.m20461b(randomAccessFile2);
                AbstractC5056z.m20461b(randomAccessFile);
                sharedPreferencesC5046p.f15346s = null;
                sharedPreferencesC5046p.f15347t = null;
                sharedPreferencesC5046p.f15348u = null;
                sharedPreferencesC5046p.f15349v = null;
                AbstractC5053w.m20451a(sharedPreferencesC5046p, exc);
                return false;
            }
        } catch (Exception e12) {
            exc = e12;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static boolean m20412E(SharedPreferencesC5046p sharedPreferencesC5046p) {
        try {
            File file = new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".tmp");
            if (AbstractC5056z.m20467h(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile.setLength(sharedPreferencesC5046p.f15331d);
                    randomAccessFile.write(sharedPreferencesC5046p.f15335h.f15318b, 0, sharedPreferencesC5046p.f15331d);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (AbstractC5056z.m20471l(file, new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".kvc"))) {
                        m20415c(sharedPreferencesC5046p);
                        return true;
                    }
                    AbstractC5053w.m20454d(sharedPreferencesC5046p, new Exception("rename failed"));
                } finally {
                }
            }
        } catch (Exception e10) {
            AbstractC5053w.m20451a(sharedPreferencesC5046p, e10);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m20414b(SharedPreferencesC5046p sharedPreferencesC5046p) {
        if (sharedPreferencesC5046p.f15351x == 0) {
            try {
                m20433u(sharedPreferencesC5046p, sharedPreferencesC5046p.f15348u);
                m20433u(sharedPreferencesC5046p, sharedPreferencesC5046p.f15349v);
            } catch (Exception unused) {
                m20438z(sharedPreferencesC5046p);
            }
        }
        m20435w(sharedPreferencesC5046p);
        AbstractC5056z.m20462c(new File(sharedPreferencesC5046p.f15328a + sharedPreferencesC5046p.f15329b));
    }

    /* JADX INFO: renamed from: c */
    public static void m20415c(SharedPreferencesC5046p sharedPreferencesC5046p) {
        if (sharedPreferencesC5046p.f15338k.isEmpty()) {
            return;
        }
        Iterator it = sharedPreferencesC5046p.f15338k.iterator();
        while (it.hasNext()) {
            m20419g(sharedPreferencesC5046p, (String) it.next());
        }
        sharedPreferencesC5046p.f15338k.clear();
    }

    /* JADX INFO: renamed from: d */
    public static void m20416d(SharedPreferencesC5046p sharedPreferencesC5046p, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i10) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            MappedByteBuffer mappedByteBufferM20432t = m20432t(mappedByteBuffer2 == sharedPreferencesC5046p.f15349v ? sharedPreferencesC5046p.f15347t : sharedPreferencesC5046p.f15346s, mappedByteBuffer.capacity());
            if (mappedByteBufferM20432t == null) {
                AbstractC5053w.m20451a(sharedPreferencesC5046p, new Exception("map failed"));
                m20438z(sharedPreferencesC5046p);
                return;
            } else {
                if (mappedByteBuffer2 == sharedPreferencesC5046p.f15349v) {
                    sharedPreferencesC5046p.f15349v = mappedByteBufferM20432t;
                } else {
                    sharedPreferencesC5046p.f15348u = mappedByteBufferM20432t;
                }
                mappedByteBuffer2 = mappedByteBufferM20432t;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i10);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    /* JADX INFO: renamed from: e */
    public static void m20417e(SharedPreferencesC5046p sharedPreferencesC5046p, SharedPreferencesC5046p sharedPreferencesC5046p2) {
        MappedByteBuffer mappedByteBuffer;
        C5042l c5042l = sharedPreferencesC5046p2.f15335h;
        if (sharedPreferencesC5046p.f15351x == 0) {
            int length = c5042l.f15318b.length;
            MappedByteBuffer mappedByteBuffer2 = sharedPreferencesC5046p.f15348u;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = sharedPreferencesC5046p.f15349v) != null && mappedByteBuffer.capacity() == length) {
                sharedPreferencesC5046p.f15348u.position(0);
                sharedPreferencesC5046p.f15348u.put(c5042l.f15318b, 0, sharedPreferencesC5046p.f15331d);
                sharedPreferencesC5046p.f15349v.position(0);
                sharedPreferencesC5046p.f15349v.put(c5042l.f15318b, 0, sharedPreferencesC5046p.f15331d);
            } else if (!m20411D(sharedPreferencesC5046p, c5042l)) {
                sharedPreferencesC5046p.f15351x = 1;
            }
        }
        if (sharedPreferencesC5046p.f15351x != 0) {
            m20412E(sharedPreferencesC5046p);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m20418f(SharedPreferencesC5046p sharedPreferencesC5046p) {
        try {
            AbstractC5056z.m20462c(new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".kvc"));
            AbstractC5056z.m20462c(new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".tmp"));
        } catch (Exception e10) {
            AbstractC5053w.m20451a(sharedPreferencesC5046p, e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m20419g(final SharedPreferencesC5046p sharedPreferencesC5046p, final String str) {
        AbstractC5047q.m20407a().execute(new Runnable() { // from class: m6.r
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferencesC5046p sharedPreferencesC5046p2 = sharedPreferencesC5046p;
                AbstractC5056z.m20462c(new File(sharedPreferencesC5046p2.f15328a + sharedPreferencesC5046p2.f15329b, str));
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m20420h(SharedPreferencesC5046p sharedPreferencesC5046p, C5031a c5031a, InterfaceC5496a interfaceC5496a) {
        try {
            byte[] bArrM20464e = AbstractC5056z.m20464e(new File(sharedPreferencesC5046p.f15328a + sharedPreferencesC5046p.f15329b, (String) c5031a.f15313b));
            if (bArrM20464e != null) {
                return interfaceC5496a != null ? interfaceC5496a.m22344a(bArrM20464e) : bArrM20464e;
            }
            return null;
        } catch (Exception e10) {
            AbstractC5053w.m20451a(sharedPreferencesC5046p, e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m20421i(int i10, int i11) {
        if (i11 >= 268435456) {
            C10010p0.m38820a("data size out of limit");
            return 0;
        }
        int i12 = SharedPreferencesC5046p.f15326B;
        if (i11 <= i12) {
            return i12;
        }
        while (i10 < i11) {
            i10 <<= 1;
        }
        return i10;
    }

    /* JADX INFO: renamed from: j */
    public static Object m20422j(SharedPreferencesC5046p sharedPreferencesC5046p, C5038h c5038h, InterfaceC5496a interfaceC5496a) {
        try {
            byte[] bArrM20464e = AbstractC5056z.m20464e(new File(sharedPreferencesC5046p.f15328a + sharedPreferencesC5046p.f15329b, (String) c5038h.f15313b));
            if (bArrM20464e == null) {
                AbstractC5053w.m20454d(sharedPreferencesC5046p, new Exception("Read object data failed"));
                return null;
            }
            if (interfaceC5496a != null) {
                bArrM20464e = interfaceC5496a.m22344a(bArrM20464e);
            }
            int i10 = bArrM20464e[0] & 255;
            String strM20346a = sharedPreferencesC5046p.f15335h.m20346a(bArrM20464e, 1, i10);
            InterfaceC5497b interfaceC5497b = (InterfaceC5497b) sharedPreferencesC5046p.f15330c.get(strM20346a);
            if (interfaceC5497b != null) {
                c5038h.f15312f = interfaceC5497b;
                int i11 = i10 + 1;
                return interfaceC5497b.mo20456a(bArrM20464e, i11, bArrM20464e.length - i11);
            }
            AbstractC5053w.m20454d(sharedPreferencesC5046p, new Exception("No encoder for tag:" + strM20346a));
            return null;
        } catch (Exception e10) {
            AbstractC5053w.m20451a(sharedPreferencesC5046p, e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m20423k(SharedPreferencesC5046p sharedPreferencesC5046p, C5039i c5039i, InterfaceC5496a interfaceC5496a) {
        try {
            byte[] bArrM20464e = AbstractC5056z.m20464e(new File(sharedPreferencesC5046p.f15328a + sharedPreferencesC5046p.f15329b, (String) c5039i.f15313b));
            if (bArrM20464e != null) {
                if (interfaceC5496a != null) {
                    bArrM20464e = interfaceC5496a.m22344a(bArrM20464e);
                }
                if (bArrM20464e != null) {
                    return new String(bArrM20464e, StandardCharsets.UTF_8);
                }
                return null;
            }
        } catch (Exception e10) {
            AbstractC5053w.m20451a(sharedPreferencesC5046p, e10);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m20424l(SharedPreferencesC5046p sharedPreferencesC5046p) {
        C5042l c5042l = new C5042l(sharedPreferencesC5046p.f15331d);
        sharedPreferencesC5046p.f15349v.rewind();
        sharedPreferencesC5046p.f15349v.get(c5042l.f15318b, 0, sharedPreferencesC5046p.f15331d);
        byte[] bArr = sharedPreferencesC5046p.f15335h.f15318b;
        byte[] bArr2 = c5042l.f15318b;
        for (int i10 = 0; i10 < sharedPreferencesC5046p.f15331d; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m20425m(int i10) {
        return (i10 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: n */
    public static void m20426n(SharedPreferencesC5046p sharedPreferencesC5046p) {
        File file = new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".kva");
        File file2 = new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".kvb");
        try {
            if (AbstractC5056z.m20467h(file) && AbstractC5056z.m20467h(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                sharedPreferencesC5046p.f15346s = randomAccessFile.getChannel();
                sharedPreferencesC5046p.f15347t = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = sharedPreferencesC5046p.f15346s;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : SharedPreferencesC5046p.f15326B);
                    sharedPreferencesC5046p.f15348u = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = sharedPreferencesC5046p.f15347t.map(mapMode, 0L, length2 > 0 ? length2 : SharedPreferencesC5046p.f15326B);
                    sharedPreferencesC5046p.f15349v = map2;
                    map2.order(byteOrder);
                    sharedPreferencesC5046p.f15335h = new C5042l(sharedPreferencesC5046p.f15348u.capacity());
                    if (length == 0 && length2 == 0) {
                        sharedPreferencesC5046p.f15331d = 12;
                        return;
                    } else {
                        m20431s(sharedPreferencesC5046p, length, length2);
                        return;
                    }
                } catch (IOException e10) {
                    AbstractC5053w.m20451a(sharedPreferencesC5046p, e10);
                    m20438z(sharedPreferencesC5046p);
                    m20409B(sharedPreferencesC5046p, file, file2);
                    return;
                }
            }
            AbstractC5053w.m20451a(sharedPreferencesC5046p, new Exception("open file failed"));
            m20438z(sharedPreferencesC5046p);
        } catch (Exception e11) {
            AbstractC5053w.m20451a(sharedPreferencesC5046p, e11);
            m20435w(sharedPreferencesC5046p);
            m20438z(sharedPreferencesC5046p);
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m20427o(SharedPreferencesC5046p sharedPreferencesC5046p) {
        File file = new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".kvc");
        File file2 = new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".tmp");
        boolean z10 = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!m20428p(sharedPreferencesC5046p, file)) {
                    m20435w(sharedPreferencesC5046p);
                    m20418f(sharedPreferencesC5046p);
                    return false;
                }
                if (sharedPreferencesC5046p.f15351x == 0) {
                    if (!m20411D(sharedPreferencesC5046p, sharedPreferencesC5046p.f15335h)) {
                        sharedPreferencesC5046p.f15351x = 1;
                        return false;
                    }
                    AbstractC5053w.m20453c(sharedPreferencesC5046p, "recover from c file");
                    try {
                        m20418f(sharedPreferencesC5046p);
                        return true;
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                        AbstractC5053w.m20451a(sharedPreferencesC5046p, e);
                        return z10;
                    }
                }
            } else if (sharedPreferencesC5046p.f15351x != 0) {
                File file3 = new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".kva");
                File file4 = new File(sharedPreferencesC5046p.f15328a, sharedPreferencesC5046p.f15329b + ".kvb");
                if (file3.exists() && file4.exists()) {
                    m20409B(sharedPreferencesC5046p, file3, file4);
                }
            }
            return false;
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m20428p(SharedPreferencesC5046p sharedPreferencesC5046p, File file) {
        long length = file.length();
        if (length != 0 && length < JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) {
            int i10 = (int) length;
            int iM20421i = m20421i(SharedPreferencesC5046p.f15326B, i10);
            C5042l c5042l = sharedPreferencesC5046p.f15335h;
            if (c5042l == null || c5042l.f15318b.length != iM20421i) {
                c5042l = new C5042l(new byte[iM20421i]);
                sharedPreferencesC5046p.f15335h = c5042l;
            } else {
                c5042l.f15319c = 0;
            }
            AbstractC5056z.m20470k(file, c5042l.f15318b, i10);
            int iM20355j = c5042l.m20355j();
            if (iM20355j < 0) {
                return false;
            }
            int iM20410C = m20410C(iM20355j);
            boolean zM20425m = m20425m(iM20355j);
            long jM20358m = c5042l.m20358m();
            sharedPreferencesC5046p.f15331d = iM20410C + 12;
            if (iM20410C >= 0 && iM20410C <= i10 - 12 && jM20358m == c5042l.m20352g(12, iM20410C) && AbstractC5041k.m20336e(sharedPreferencesC5046p, zM20425m)) {
                sharedPreferencesC5046p.f15332e = jM20358m;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static int m20429q(int i10, boolean z10) {
        return z10 ? i10 | 1073741824 : i10;
    }

    /* JADX INFO: renamed from: r */
    public static void m20430r(SharedPreferencesC5046p sharedPreferencesC5046p, long j10, int i10, long j11, boolean z10) {
        if (i10 >= 0 && i10 <= j10 - 12) {
            sharedPreferencesC5046p.f15333f.clear();
            AbstractC5050t.m20440b(sharedPreferencesC5046p);
            sharedPreferencesC5046p.f15331d = i10 + 12;
            if (sharedPreferencesC5046p.f15335h.f15318b.length != sharedPreferencesC5046p.f15349v.capacity()) {
                sharedPreferencesC5046p.f15335h = new C5042l(sharedPreferencesC5046p.f15349v.capacity());
            }
            sharedPreferencesC5046p.f15349v.rewind();
            sharedPreferencesC5046p.f15349v.get(sharedPreferencesC5046p.f15335h.f15318b, 0, sharedPreferencesC5046p.f15331d);
            if (j11 == sharedPreferencesC5046p.f15335h.m20352g(12, i10) && AbstractC5041k.m20336e(sharedPreferencesC5046p, z10)) {
                AbstractC5053w.m20454d(sharedPreferencesC5046p, new Exception("A file error"));
                m20416d(sharedPreferencesC5046p, sharedPreferencesC5046p.f15349v, sharedPreferencesC5046p.f15348u, sharedPreferencesC5046p.f15331d);
                sharedPreferencesC5046p.f15332e = j11;
                return;
            }
        }
        AbstractC5053w.m20452b(sharedPreferencesC5046p, "both files error");
        m20414b(sharedPreferencesC5046p);
    }

    /* JADX INFO: renamed from: s */
    public static void m20431s(SharedPreferencesC5046p sharedPreferencesC5046p, long j10, long j11) {
        int i10 = sharedPreferencesC5046p.f15348u.getInt();
        int iM20410C = m20410C(i10);
        boolean zM20425m = m20425m(i10);
        long j12 = sharedPreferencesC5046p.f15348u.getLong();
        int i11 = sharedPreferencesC5046p.f15349v.getInt();
        int iM20410C2 = m20410C(i11);
        boolean zM20425m2 = m20425m(i11);
        long j13 = sharedPreferencesC5046p.f15349v.getLong();
        if (iM20410C >= 0 && iM20410C <= j10 - 12) {
            sharedPreferencesC5046p.f15331d = iM20410C + 12;
            sharedPreferencesC5046p.f15348u.rewind();
            sharedPreferencesC5046p.f15348u.get(sharedPreferencesC5046p.f15335h.f15318b, 0, sharedPreferencesC5046p.f15331d);
            if (j12 == sharedPreferencesC5046p.f15335h.m20352g(12, iM20410C) && AbstractC5041k.m20336e(sharedPreferencesC5046p, zM20425m)) {
                sharedPreferencesC5046p.f15332e = j12;
                if (j10 == j11 && m20424l(sharedPreferencesC5046p)) {
                    return;
                }
                AbstractC5053w.m20454d(sharedPreferencesC5046p, new Exception("B file error"));
                m20416d(sharedPreferencesC5046p, sharedPreferencesC5046p.f15348u, sharedPreferencesC5046p.f15349v, sharedPreferencesC5046p.f15331d);
                return;
            }
        }
        m20430r(sharedPreferencesC5046p, j11, iM20410C2, j13, zM20425m2);
    }

    /* JADX INFO: renamed from: t */
    public static MappedByteBuffer m20432t(FileChannel fileChannel, int i10) {
        try {
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i10);
            map.order(ByteOrder.LITTLE_ENDIAN);
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m20433u(SharedPreferencesC5046p sharedPreferencesC5046p, MappedByteBuffer mappedByteBuffer) throws IOException {
        int iCapacity = mappedByteBuffer.capacity();
        int i10 = SharedPreferencesC5046p.f15326B;
        if (iCapacity != i10) {
            MappedByteBuffer mappedByteBufferM20408A = m20408A(mappedByteBuffer == sharedPreferencesC5046p.f15348u ? sharedPreferencesC5046p.f15346s : sharedPreferencesC5046p.f15347t, i10);
            if (mappedByteBufferM20408A == null) {
                C10023w.m38841a("Failed to truncate and remap buffer");
                return;
            }
            if (mappedByteBuffer == sharedPreferencesC5046p.f15348u) {
                sharedPreferencesC5046p.f15348u = mappedByteBufferM20408A;
            } else {
                sharedPreferencesC5046p.f15349v = mappedByteBufferM20408A;
            }
            mappedByteBuffer = mappedByteBufferM20408A;
        }
        sharedPreferencesC5046p.getClass();
        mappedByteBuffer.putInt(0, m20429q(0, false));
        mappedByteBuffer.putLong(4, 0L);
    }

    /* JADX INFO: renamed from: v */
    public static void m20434v(SharedPreferencesC5046p sharedPreferencesC5046p) {
        C5042l c5042l = sharedPreferencesC5046p.f15335h;
        if (c5042l == null || c5042l.f15318b.length != SharedPreferencesC5046p.f15326B) {
            sharedPreferencesC5046p.f15335h = new C5042l(SharedPreferencesC5046p.f15326B);
        } else {
            c5042l.m20369z(4, 0L);
        }
        sharedPreferencesC5046p.f15335h.m20368y(0, m20429q(0, false));
    }

    /* JADX INFO: renamed from: w */
    public static void m20435w(SharedPreferencesC5046p sharedPreferencesC5046p) {
        sharedPreferencesC5046p.f15331d = 12;
        sharedPreferencesC5046p.f15332e = 0L;
        sharedPreferencesC5046p.f15333f.clear();
        AbstractC5050t.m20440b(sharedPreferencesC5046p);
        m20434v(sharedPreferencesC5046p);
    }

    /* JADX INFO: renamed from: x */
    public static void m20436x(SharedPreferencesC5046p sharedPreferencesC5046p) {
        InterfaceC5497b interfaceC5497b;
        InterfaceC5497b[] interfaceC5497bArr = (InterfaceC5497b[]) sharedPreferencesC5046p.f15330c.values().toArray(new InterfaceC5497b[sharedPreferencesC5046p.f15330c.size()]);
        String str = "temp_" + sharedPreferencesC5046p.f15329b;
        SharedPreferencesC5046p sharedPreferencesC5046p2 = new SharedPreferencesC5046p(sharedPreferencesC5046p.f15328a, str, interfaceC5497bArr, null, 2);
        sharedPreferencesC5046p2.m20388i();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : sharedPreferencesC5046p.f15333f.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof C5039i) {
                C5039i c5039i = (C5039i) value;
                boolean z10 = c5039i.f15316e;
                Object obj = c5039i.f15313b;
                if (z10) {
                    arrayList.add((String) obj);
                    String strM20423k = m20423k(sharedPreferencesC5046p, c5039i, null);
                    if (strM20423k != null) {
                        sharedPreferencesC5046p2.putString(str2, strM20423k);
                    }
                } else {
                    sharedPreferencesC5046p2.putString(str2, (String) obj);
                }
            } else if (value instanceof C5033c) {
                sharedPreferencesC5046p2.putBoolean(str2, ((C5033c) value).f15307b);
            } else if (value instanceof C5036f) {
                sharedPreferencesC5046p2.putInt(str2, ((C5036f) value).f15310b);
            } else if (value instanceof C5037g) {
                sharedPreferencesC5046p2.putLong(str2, ((C5037g) value).f15311b);
            } else if (value instanceof C5035e) {
                sharedPreferencesC5046p2.putFloat(str2, ((C5035e) value).f15309b);
            } else if (value instanceof C5034d) {
                sharedPreferencesC5046p2.m20401v(str2, ((C5034d) value).f15308b);
            } else if (value instanceof C5031a) {
                C5031a c5031a = (C5031a) value;
                boolean z11 = c5031a.f15316e;
                Object obj2 = c5031a.f15313b;
                if (z11) {
                    arrayList.add((String) obj2);
                    byte[] bArrM20420h = m20420h(sharedPreferencesC5046p, c5031a, null);
                    if (bArrM20420h != null) {
                        sharedPreferencesC5046p2.m20400u(str2, bArrM20420h);
                    }
                } else {
                    sharedPreferencesC5046p2.m20400u(str2, (byte[]) obj2);
                }
            } else if (value instanceof C5038h) {
                C5038h c5038h = (C5038h) value;
                if (c5038h.f15316e) {
                    arrayList.add((String) c5038h.f15313b);
                    Object objM20422j = m20422j(sharedPreferencesC5046p, c5038h, null);
                    if (objM20422j != null && (interfaceC5497b = c5038h.f15312f) != null) {
                        sharedPreferencesC5046p2.m20402w(str2, objM20422j, interfaceC5497b);
                    }
                } else {
                    InterfaceC5497b interfaceC5497b2 = c5038h.f15312f;
                    if (interfaceC5497b2 != null) {
                        sharedPreferencesC5046p2.m20402w(str2, c5038h.f15313b, interfaceC5497b2);
                    }
                }
            }
        }
        sharedPreferencesC5046p2.contains(_UrlKt.FRAGMENT_ENCODE_SET);
        sharedPreferencesC5046p.f15335h = sharedPreferencesC5046p2.f15335h;
        sharedPreferencesC5046p.f15332e = sharedPreferencesC5046p2.f15332e;
        sharedPreferencesC5046p.f15331d = sharedPreferencesC5046p2.f15331d;
        AbstractC5050t.m20440b(sharedPreferencesC5046p);
        sharedPreferencesC5046p.f15333f.clear();
        sharedPreferencesC5046p.f15333f.putAll(sharedPreferencesC5046p2.f15333f);
        m20417e(sharedPreferencesC5046p, sharedPreferencesC5046p2);
        File file = new File(sharedPreferencesC5046p.f15328a, str);
        String str3 = sharedPreferencesC5046p.f15328a + sharedPreferencesC5046p.f15329b;
        AbstractC5056z.m20468i(file, str3);
        AbstractC5056z.m20462c(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC5056z.m20462c(new File(str3, (String) it.next()));
        }
        sharedPreferencesC5046p.f15339l = false;
    }

    /* JADX INFO: renamed from: y */
    public static long m20437y(long j10, int i10) {
        int i11 = (i10 & 7) << 3;
        return (j10 >>> (64 - i11)) | (j10 << i11);
    }

    /* JADX INFO: renamed from: z */
    public static void m20438z(SharedPreferencesC5046p sharedPreferencesC5046p) {
        sharedPreferencesC5046p.f15351x = 1;
        AbstractC5056z.m20461b(sharedPreferencesC5046p.f15346s);
        AbstractC5056z.m20461b(sharedPreferencesC5046p.f15347t);
        sharedPreferencesC5046p.f15346s = null;
        sharedPreferencesC5046p.f15347t = null;
        sharedPreferencesC5046p.f15348u = null;
        sharedPreferencesC5046p.f15349v = null;
    }
}
