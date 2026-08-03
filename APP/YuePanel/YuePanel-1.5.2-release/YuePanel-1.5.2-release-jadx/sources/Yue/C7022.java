package Yue;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
public final class C7022 implements InterfaceC3603 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC7472 f21161;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final C3600 f21162;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC5568
    public boolean f21163;

    public C7022(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        C5499.m17103(interfaceC7472, "sink");
        this.f21161 = interfaceC7472;
        this.f21162 = new C3600();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ void m3318() {
    }

    @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f21163) {
            return;
        }
        try {
            if (this.f21162.m9684() > 0) {
                InterfaceC7472 interfaceC7472 = this.f21161;
                C3600 c3600 = this.f21162;
                interfaceC7472.mo9102(c3600, c3600.m9684());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f21161.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f21163 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // Yue.InterfaceC3603, Yue.InterfaceC7472, java.io.Flushable
    public void flush() throws IOException {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f21162.m9684() > 0) {
            InterfaceC7472 interfaceC7472 = this.f21161;
            C3600 c3600 = this.f21162;
            interfaceC7472.mo9102(c3600, c3600.m9684());
        }
        this.f21161.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f21163;
    }

    @InterfaceC6399
    public String toString() {
        return "buffer(" + this.f21161 + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.WritableByteChannel
    public int write(@InterfaceC6399 ByteBuffer byteBuffer) throws IOException {
        C5499.m17103(byteBuffer, "source");
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f21162.write(byteBuffer);
        mo9632();
        return iWrite;
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    public InterfaceC3603 writeByte(int i) {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.writeByte(i);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    public InterfaceC3603 writeInt(int i) {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.writeInt(i);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    public InterfaceC3603 writeLong(long j) {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.writeLong(j);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    public InterfaceC3603 writeShort(int i) {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.writeShort(i);
        return mo9632();
    }

    @Override // Yue.InterfaceC7472
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo516() {
        return this.f21161.mo516();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public C3600 mo9604() {
        return this.f21162;
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public C3600 mo9605() {
        return this.f21162;
    }

    @Override // Yue.InterfaceC7472
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "source");
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9102(c3600, j);
        mo9632();
    }

    @Override // Yue.InterfaceC3603
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public long mo9610(@InterfaceC6399 InterfaceC7506 interfaceC7506) throws IOException {
        C5499.m17103(interfaceC7506, "source");
        long j = 0;
        while (true) {
            long jMo9103 = interfaceC7506.mo9103(this.f21162, 8192L);
            if (jMo9103 == -1) {
                return j;
            }
            j += jMo9103;
            mo9632();
        }
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public InterfaceC3603 mo9613(@InterfaceC6399 InterfaceC7506 interfaceC7506, long j) throws IOException {
        C5499.m17103(interfaceC7506, "source");
        while (j > 0) {
            long jMo9103 = interfaceC7506.mo9103(this.f21162, j);
            if (jMo9103 == -1) {
                throw new EOFException();
            }
            j -= jMo9103;
            mo9632();
        }
        return this;
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public InterfaceC3603 mo9614() throws IOException {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        long jM9684 = this.f21162.m9684();
        if (jM9684 > 0) {
            this.f21161.mo9102(this.f21162, jM9684);
        }
        return this;
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public InterfaceC3603 mo9615(int i) {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9615(i);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public InterfaceC3603 mo9617(long j) {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9617(j);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public InterfaceC3603 mo9621(int i) {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9621(i);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public InterfaceC3603 mo9632() throws IOException {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        long jM9608 = this.f21162.m9608();
        if (jM9608 > 0) {
            this.f21161.mo9102(this.f21162, jM9608);
        }
        return this;
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public InterfaceC3603 mo9636(int i) {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9636(i);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public InterfaceC3603 mo9638(@InterfaceC6399 String str) {
        C5499.m17103(str, "string");
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9638(str);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public InterfaceC3603 mo9640(@InterfaceC6399 C3630 c3630, int i, int i2) {
        C5499.m17103(c3630, "byteString");
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9640(c3630, i, i2);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public InterfaceC3603 mo9645(@InterfaceC6399 String str, int i, int i2) {
        C5499.m17103(str, "string");
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9645(str, i, i2);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    public InterfaceC3603 mo9646(long j) {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9646(j);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public InterfaceC3603 mo9649(@InterfaceC6399 String str, @InterfaceC6399 Charset charset) {
        C5499.m17103(str, "string");
        C5499.m17103(charset, "charset");
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9649(str, charset);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ */
    public InterfaceC3603 mo9668(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "byteString");
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9668(c3630);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    public InterfaceC3603 mo9669(@InterfaceC6399 String str, int i, int i2, @InterfaceC6399 Charset charset) {
        C5499.m17103(str, "string");
        C5499.m17103(charset, "charset");
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9669(str, i, i2, charset);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
    public InterfaceC3603 mo9671(long j) {
        if (!(!this.f21163)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f21162.mo9671(j);
        return mo9632();
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
    public OutputStream mo9672() {
        return new C1138();
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۢ$ۥ */
    @InterfaceC7507({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,142:1\n51#2:143\n51#2:144\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n*L\n111#1:143\n117#1:144\n*E\n"})
    public static final class C1138 extends OutputStream {
        public C1138() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            C7022.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            C7022 c7022 = C7022.this;
            if (c7022.f21163) {
                return;
            }
            c7022.flush();
        }

        @InterfaceC6399
        public String toString() {
            return C7022.this + ".outputStream()";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            C7022 c7022 = C7022.this;
            if (c7022.f21163) {
                throw new IOException("closed");
            }
            c7022.f21162.writeByte((byte) i);
            C7022.this.mo9632();
        }

        @Override // java.io.OutputStream
        public void write(@InterfaceC6399 byte[] bArr, int i, int i2) throws IOException {
            C5499.m17103(bArr, "data");
            C7022 c7022 = C7022.this;
            if (!c7022.f21163) {
                c7022.f21162.write(bArr, i, i2);
                C7022.this.mo9632();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    public InterfaceC3603 write(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "source");
        if (!this.f21163) {
            this.f21162.write(bArr);
            return mo9632();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // Yue.InterfaceC3603
    @InterfaceC6399
    public InterfaceC3603 write(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "source");
        if (!this.f21163) {
            this.f21162.write(bArr, i, i2);
            return mo9632();
        }
        throw new IllegalStateException("closed".toString());
    }
}
