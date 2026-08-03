package p248qf;

import bsh.C0353j;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Set;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nf.C3001c;
import nf.EnumC3002d;
import nf.InterfaceC2999a;
import nf.InterfaceC3000b;
import p012ah.C0086a;
import p014b.C0126e;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p217of.C3136b;
import p262rf.InterfaceC3802b;

/* JADX INFO: renamed from: qf.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3545b implements InterfaceC3000b {

    /* JADX INFO: renamed from: r */
    public static final InterfaceC2844b f11536r = AbstractC2846d.m6274b(C3545b.class);

    /* JADX INFO: renamed from: g */
    public final File f11537g;

    /* JADX INFO: renamed from: h */
    public final C0126e f11538h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3802b f11539i;

    /* JADX INFO: renamed from: j */
    public final Set f11540j;

    /* JADX INFO: renamed from: k */
    public final boolean f11541k;

    /* JADX INFO: renamed from: l */
    public final boolean f11542l;

    /* JADX INFO: renamed from: m */
    public RandomAccessFile f11543m;

    /* JADX INFO: renamed from: n */
    public FileChannel f11544n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f11545o;

    /* JADX INFO: renamed from: p */
    public int f11546p = -2;

    /* JADX INFO: renamed from: q */
    public C3001c f11547q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3545b(File file, C0126e c0126e) {
        this.f11537g = file;
        this.f11538h = c0126e;
        InterfaceC3802b interfaceC3802b = (InterfaceC3802b) c0126e.f332h;
        this.f11539i = interfaceC3802b;
        Set set = (Set) c0126e.f333i;
        this.f11540j = set;
        this.f11541k = set.contains(EnumC3002d.f9782h);
        this.f11542l = interfaceC3802b.mo440d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m7459l(C3544a c3544a) {
        int i9 = c3544a.f11531c;
        long j3 = c3544a.f11535g;
        InterfaceC2844b interfaceC2844b = f11536r;
        if (i9 != 0) {
            if (i9 != 8) {
                interfaceC2844b.mo6265s(Integer.valueOf(i9), "Unknown compress method: {} in entry: {}", c3544a);
            }
        } else {
            long j4 = c3544a.f11534f;
            if (j4 != j3) {
                interfaceC2844b.mo6255i("Not equal sizes for STORE method: compressed: {}, uncompressed: {}, entry: {}", Long.valueOf(j4), Long.valueOf(j3), c3544a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7460a(C3544a c3544a, Exception exc) {
        ByteBuffer byteBuffer = this.f11545o;
        if ((byteBuffer.getShort() & 1) != 0) {
            C0086a.m457p("Entry is encrypted, failed to decompress: ".concat(String.valueOf(c3544a)), exc);
        } else if (this.f11540j.contains(EnumC3002d.f9784j)) {
            C0086a.m457p(AbstractC0255e.m1021j("Failed to decompress zip entry: ", String.valueOf(c3544a), ", error: ", exc.getMessage()), exc);
        } else {
            f11536r.mo6265s(c3544a, "Entry '{}' parse failed, switching to fallback parser", exc);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C3001c m7461b() {
        File file = this.f11537g;
        if (this.f11547q == null) {
            try {
                this.f11547q = new C3136b(file, this.f11538h).mo6401d();
            } catch (Exception e6) {
                C0086a.m457p("Fallback parser failed to open file: ".concat(String.valueOf(file)), e6);
                return null;
            }
        }
        return this.f11547q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m7462c() {
        if (this.f11545o != null) {
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f11537g, "r");
        this.f11543m = randomAccessFile;
        long length = randomAccessFile.length();
        if (length >= 2147483647L) {
            C2104o.m5299y("Zip file is too big");
            return;
        }
        int i9 = (int) length;
        if (i9 < 104857600) {
            byte[] bArr = new byte[i9];
            this.f11543m.readFully(bArr);
            this.f11545o = ByteBuffer.wrap(bArr).asReadOnlyBuffer();
            this.f11543m.close();
            this.f11543m = null;
        } else {
            FileChannel channel = this.f11543m.getChannel();
            this.f11544n = channel;
            this.f11545o = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
        }
        this.f11545o.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            FileChannel fileChannel = this.f11544n;
            if (fileChannel != null) {
                fileChannel.close();
            }
            RandomAccessFile randomAccessFile = this.f11543m;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            C3001c c3001c = this.f11547q;
            if (c3001c != null) {
                c3001c.close();
            }
            this.f11544n = null;
            this.f11543m = null;
            this.f11545o = null;
            this.f11546p = -2;
            this.f11547q = null;
        } catch (Throwable th2) {
            this.f11544n = null;
            this.f11543m = null;
            this.f11545o = null;
            this.f11546p = -2;
            this.f11547q = null;
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // nf.InterfaceC3000b
    /* JADX INFO: renamed from: d */
    public final C3001c mo6401d() throws IOException {
        Set set = this.f11540j;
        m7462c();
        try {
            int iMo438b = this.f11539i.mo438b();
            if (iMo438b == -1) {
                iMo438b = Integer.MAX_VALUE;
            }
            return new C3001c(this, set.contains(EnumC3002d.f9781g) ? m7466i(iMo438b) : m7464g(iMo438b));
        } catch (Exception e6) {
            boolean zContains = set.contains(EnumC3002d.f9784j);
            File file = this.f11537g;
            if (zContains) {
                throw new IOException(AbstractC0255e.m1021j("Failed to open zip: ", String.valueOf(file), ", error: ", e6.getMessage()), e6);
            }
            f11536r.mo6265s(file, "Zip open failed, switching to fallback parser, zip: {}", e6);
            return m7461b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C3544a m7463e(int i9) {
        ByteBuffer byteBuffer = this.f11545o;
        int i10 = byteBuffer.getShort() & 65535;
        int i11 = byteBuffer.getInt();
        int i12 = byteBuffer.getInt();
        int i13 = byteBuffer.getShort() & 65535;
        int i14 = 65535 & byteBuffer.getShort();
        byte[] bArr = new byte[i13];
        byteBuffer.get(bArr);
        String str = new String(bArr, StandardCharsets.UTF_8);
        int i15 = i9 + 30 + i13 + i14;
        return new C3544a(this, str, i9, i15, i10, i11, i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final ArrayList m7464g(int i9) {
        short s10;
        int i10;
        InterfaceC2844b interfaceC2844b;
        C3545b c3545b = this;
        int iM7465h = c3545b.m7465h();
        if (iM7465h < 0) {
            C0353j.m1309g("End of central directory not found");
            return null;
        }
        ByteBuffer byteBuffer = c3545b.f11545o;
        short s11 = 65535;
        int i11 = byteBuffer.getShort() & 65535;
        int i12 = byteBuffer.getInt();
        if (i11 > i9) {
            C2104o.m5276A(AbstractC0921a.m2249l(i11, "Max entries count limit exceeded: "));
            return null;
        }
        ArrayList arrayList = new ArrayList(i11);
        int i13 = 0;
        while (i13 < i11) {
            ByteBuffer byteBuffer2 = c3545b.f11545o;
            int iPosition = byteBuffer2.position();
            int i14 = byteBuffer2.getShort() & s11;
            int i15 = byteBuffer2.getShort() & s11;
            int i16 = byteBuffer2.getShort() & s11;
            int i17 = iPosition + 46 + i14 + i15 + i16;
            C3544a c3544aM7463e = c3545b.m7463e(byteBuffer2.getInt());
            long j3 = c3544aM7463e.f11534f;
            long j4 = c3544aM7463e.f11535g;
            int i18 = c3544aM7463e.f11531c;
            boolean z9 = c3545b.f11541k;
            InterfaceC2844b interfaceC2844b2 = f11536r;
            if (z9) {
                int i19 = byteBuffer2.getShort() & s11;
                if (i19 != i18) {
                    interfaceC2844b2.mo6255i("Compression method differ in CD {} and LFH {} for {}", Integer.valueOf(i19), Integer.valueOf(i18), c3544aM7463e);
                }
                int i20 = byteBuffer2.getInt();
                int i21 = byteBuffer2.getInt();
                s10 = s11;
                i10 = i11;
                if (i20 != j3) {
                    interfaceC2844b2.mo6255i("Compressed size differ in CD {} and LFH {} for {}", Integer.valueOf(i20), Long.valueOf(j3), c3544aM7463e);
                }
                if (i21 != j4) {
                    interfaceC2844b2.mo6255i("Uncompressed size differ in CD {} and LFH {} for {}", Integer.valueOf(i21), Long.valueOf(j4), c3544aM7463e);
                }
            } else {
                s10 = s11;
                i10 = i11;
            }
            if (j3 > 0 && j4 > 0 && j3 <= j4) {
                interfaceC2844b = interfaceC2844b2;
            } else {
                ByteBuffer byteBuffer3 = c3545b.f11545o;
                int i22 = byteBuffer3.getShort() & s10;
                c3545b = this;
                interfaceC2844b = interfaceC2844b2;
                c3544aM7463e = new C3544a(c3545b, c3544aM7463e.f11530b, iPosition, c3544aM7463e.f11533e, i22, byteBuffer3.getInt(), byteBuffer3.getInt());
            }
            boolean zMo437a = c3545b.f11539i.mo437a(c3544aM7463e);
            if (!zMo437a) {
                interfaceC2844b.mo6254h(c3544aM7463e, "Zip entry '{}' is invalid and excluded from processing");
            }
            if (zMo437a) {
                arrayList.add(c3544aM7463e);
            }
            i13++;
            s11 = s10;
            i11 = i10;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m7465h() {
        int i9 = this.f11546p;
        if (i9 != -2) {
            return i9;
        }
        ByteBuffer byteBuffer = this.f11545o;
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - 22;
        int iMax = Math.max(0, iLimit - 65557);
        do {
            if (byteBuffer.getInt() == 101010256) {
                this.f11546p = i10;
                return i10;
            }
            i10--;
        } while (i10 >= iMax);
        C2104o.m5299y("End of central directory record not found");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final ArrayList m7466i(int i9) {
        int iPosition;
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteBuffer byteBuffer = this.f11545o;
            while (true) {
                iPosition = byteBuffer.position();
                if (iPosition + 4 > byteBuffer.limit()) {
                    iPosition = -1;
                    break;
                }
                if (byteBuffer.get() == 80) {
                    if (byteBuffer.getInt() == 67324752) {
                        break;
                    }
                }
            }
            if (iPosition == -1) {
                return arrayList;
            }
            C3544a c3544aM7463e = m7463e(iPosition);
            boolean zMo437a = this.f11539i.mo437a(c3544aM7463e);
            if (!zMo437a) {
                f11536r.mo6254h(c3544aM7463e, "Zip entry '{}' is invalid and excluded from processing");
            }
            if (zMo437a) {
                arrayList.add(c3544aM7463e);
                if (arrayList.size() > i9) {
                    C2104o.m5276A(AbstractC0921a.m2249l(arrayList.size(), "Max entries count limit exceeded: "));
                    return null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final InterfaceC2999a m7467k(C3544a c3544a) {
        f11536r.mo6270x(c3544a, "useFallbackParser used for {}");
        C3001c c3001cM7461b = m7461b();
        InterfaceC2999a interfaceC2999a = (InterfaceC2999a) c3001cM7461b.f9780i.get(c3544a.f11530b);
        if (interfaceC2999a != null) {
            return interfaceC2999a;
        }
        C0353j.m1309g("Fallback parser can't find entry: ".concat(String.valueOf(c3544a)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2251n("JadxZipParser{", String.valueOf(this.f11537g), "}");
    }
}
