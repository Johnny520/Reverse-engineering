package Yue;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
@InterfaceC5572(name = "-RealBufferedSink")
public final class C2960 {
    /* JADX INFO: renamed from: ۥ */
    public static final void m23(@InterfaceC6399 C7022 c7022) throws Throwable {
        C5499.m17103(c7022, "<this>");
        if (c7022.f21163) {
            return;
        }
        try {
            if (c7022.f21162.m9684() > 0) {
                InterfaceC7472 interfaceC7472 = c7022.f21161;
                C3600 c3600 = c7022.f21162;
                interfaceC7472.mo9102(c3600, c3600.m9684());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            c7022.f21161.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        c7022.f21163 = true;
        if (th != null) {
            throw th;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final InterfaceC3603 m24(@InterfaceC6399 C7022 c7022) throws IOException {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        long jM9684 = c7022.f21162.m9684();
        if (jM9684 > 0) {
            c7022.f21161.mo9102(c7022.f21162, jM9684);
        }
        return c7022;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final InterfaceC3603 m5606(@InterfaceC6399 C7022 c7022) throws IOException {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        long jM9608 = c7022.f21162.m9608();
        if (jM9608 > 0) {
            c7022.f21161.mo9102(c7022.f21162, jM9608);
        }
        return c7022;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m5607(@InterfaceC6399 C7022 c7022) throws IOException {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        if (c7022.f21162.m9684() > 0) {
            InterfaceC7472 interfaceC7472 = c7022.f21161;
            C3600 c3600 = c7022.f21162;
            interfaceC7472.mo9102(c3600, c3600.m9684());
        }
        c7022.f21161.flush();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final C7827 m5608(@InterfaceC6399 C7022 c7022) {
        C5499.m17103(c7022, "<this>");
        return c7022.f21161.mo516();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String m5609(@InterfaceC6399 C7022 c7022) {
        C5499.m17103(c7022, "<this>");
        return "buffer(" + c7022.f21161 + ')';
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final InterfaceC3603 m5610(@InterfaceC6399 C7022 c7022, @InterfaceC6399 C3630 c3630) {
        C5499.m17103(c7022, "<this>");
        C5499.m17103(c3630, "byteString");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9668(c3630);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final InterfaceC3603 m5611(@InterfaceC6399 C7022 c7022, @InterfaceC6399 C3630 c3630, int i, int i2) {
        C5499.m17103(c7022, "<this>");
        C5499.m17103(c3630, "byteString");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9640(c3630, i, i2);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC3603 m5612(@InterfaceC6399 C7022 c7022, @InterfaceC6399 InterfaceC7506 interfaceC7506, long j) throws IOException {
        C5499.m17103(c7022, "<this>");
        C5499.m17103(interfaceC7506, "source");
        while (j > 0) {
            long jMo9103 = interfaceC7506.mo9103(c7022.f21162, j);
            if (jMo9103 == -1) {
                throw new EOFException();
            }
            j -= jMo9103;
            c7022.mo9632();
        }
        return c7022;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final InterfaceC3603 m5613(@InterfaceC6399 C7022 c7022, @InterfaceC6399 byte[] bArr) {
        C5499.m17103(c7022, "<this>");
        C5499.m17103(bArr, "source");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.write(bArr);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final InterfaceC3603 m5614(@InterfaceC6399 C7022 c7022, @InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(c7022, "<this>");
        C5499.m17103(bArr, "source");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.write(bArr, i, i2);
        return c7022.mo9632();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m5615(@InterfaceC6399 C7022 c7022, @InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c7022, "<this>");
        C5499.m17103(c3600, "source");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9102(c3600, j);
        c7022.mo9632();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long m5616(@InterfaceC6399 C7022 c7022, @InterfaceC6399 InterfaceC7506 interfaceC7506) throws IOException {
        C5499.m17103(c7022, "<this>");
        C5499.m17103(interfaceC7506, "source");
        long j = 0;
        while (true) {
            long jMo9103 = interfaceC7506.mo9103(c7022.f21162, 8192L);
            if (jMo9103 == -1) {
                return j;
            }
            j += jMo9103;
            c7022.mo9632();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final InterfaceC3603 m5617(@InterfaceC6399 C7022 c7022, int i) {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.writeByte(i);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final InterfaceC3603 m5618(@InterfaceC6399 C7022 c7022, long j) {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9671(j);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final InterfaceC3603 m5619(@InterfaceC6399 C7022 c7022, long j) {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9646(j);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final InterfaceC3603 m5620(@InterfaceC6399 C7022 c7022, int i) {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.writeInt(i);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final InterfaceC3603 m5621(@InterfaceC6399 C7022 c7022, int i) {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9621(i);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final InterfaceC3603 m5622(@InterfaceC6399 C7022 c7022, long j) {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.writeLong(j);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final InterfaceC3603 m5623(@InterfaceC6399 C7022 c7022, long j) {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9617(j);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final InterfaceC3603 m5624(@InterfaceC6399 C7022 c7022, int i) {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.writeShort(i);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final InterfaceC3603 m5625(@InterfaceC6399 C7022 c7022, int i) {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9636(i);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final InterfaceC3603 m5626(@InterfaceC6399 C7022 c7022, @InterfaceC6399 String str) {
        C5499.m17103(c7022, "<this>");
        C5499.m17103(str, "string");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9638(str);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final InterfaceC3603 m5627(@InterfaceC6399 C7022 c7022, @InterfaceC6399 String str, int i, int i2) {
        C5499.m17103(c7022, "<this>");
        C5499.m17103(str, "string");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9645(str, i, i2);
        return c7022.mo9632();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final InterfaceC3603 m5628(@InterfaceC6399 C7022 c7022, int i) {
        C5499.m17103(c7022, "<this>");
        if (!(!c7022.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        c7022.f21162.mo9615(i);
        return c7022.mo9632();
    }
}
