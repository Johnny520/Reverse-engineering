package Yue;

import Yue.C7033;
import Yue.C7141;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4742 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final C7024 f1086;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final AbstractC4712 f1087;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C4744 f10180;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4743 f10181;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f10182;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f10183;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final C7026 f10184;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡ۟$ۥ */
    @InterfaceC7507({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class C0476 extends AbstractC5067 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final long f10185;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f10186;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public long f10187;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f10188;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ C4742 f10189;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0476(@InterfaceC6399 C4742 c4742, InterfaceC7472 interfaceC7472, long j) {
            super(interfaceC7472);
            C5499.m17103(interfaceC7472, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
            this.f10189 = c4742;
            this.f10185 = j;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        private final <E extends IOException> E m14293(E e) {
            if (this.f10186) {
                return e;
            }
            this.f10186 = true;
            return (E) this.f10189.m1658(this.f10187, false, true, e);
        }

        @Override // Yue.AbstractC5067, Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f10188) {
                return;
            }
            this.f10188 = true;
            long j = this.f10185;
            if (j != -1 && this.f10187 != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m14293(null);
            } catch (IOException e) {
                throw m14293(e);
            }
        }

        @Override // Yue.AbstractC5067, Yue.InterfaceC7472, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m14293(e);
            }
        }

        @Override // Yue.AbstractC5067, Yue.InterfaceC7472
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "source");
            if (!(!this.f10188)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f10185;
            if (j2 == -1 || this.f10187 + j <= j2) {
                try {
                    super.mo9102(c3600, j);
                    this.f10187 += j;
                    return;
                } catch (IOException e) {
                    throw m14293(e);
                }
            }
            throw new ProtocolException("expected " + this.f10185 + " bytes but received " + (this.f10187 + j));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡ۟$ۥ۟ */
    @InterfaceC7507({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class C0477 extends AbstractC5068 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final long f10190;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public long f10191;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f10192;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f10193;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f10194;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ C4742 f10195;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0477(@InterfaceC6399 C4742 c4742, InterfaceC7506 interfaceC7506, long j) {
            super(interfaceC7506);
            C5499.m17103(interfaceC7506, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
            this.f10195 = c4742;
            this.f10190 = j;
            this.f10192 = true;
            if (j == 0) {
                m14294(null);
            }
        }

        @Override // Yue.AbstractC5068, Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f10194) {
                return;
            }
            this.f10194 = true;
            try {
                super.close();
                m14294(null);
            } catch (IOException e) {
                throw m14294(e);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final <E extends IOException> E m14294(E e) {
            if (this.f10193) {
                return e;
            }
            this.f10193 = true;
            if (e == null && this.f10192) {
                this.f10192 = false;
                this.f10195.m14277().mo14069(this.f10195.m14275());
            }
            return (E) this.f10195.m1658(this.f10191, true, false, e);
        }

        @Override // Yue.AbstractC5068, Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "sink");
            if (!(!this.f10194)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jMo9103 = m15616().mo9103(c3600, j);
                if (this.f10192) {
                    this.f10192 = false;
                    this.f10195.m14277().mo14069(this.f10195.m14275());
                }
                if (jMo9103 == -1) {
                    m14294(null);
                    return -1L;
                }
                long j2 = this.f10191 + jMo9103;
                long j3 = this.f10190;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.f10190 + " bytes but received " + j2);
                }
                this.f10191 = j2;
                if (j2 == j3) {
                    m14294(null);
                }
                return jMo9103;
            } catch (IOException e) {
                throw m14294(e);
            }
        }
    }

    public C4742(@InterfaceC6399 C7024 c7024, @InterfaceC6399 AbstractC4712 abstractC4712, @InterfaceC6399 C4744 c4744, @InterfaceC6399 InterfaceC4743 interfaceC4743) {
        C5499.m17103(c7024, C6411.f16272);
        C5499.m17103(abstractC4712, "eventListener");
        C5499.m17103(c4744, "finder");
        C5499.m17103(interfaceC4743, "codec");
        this.f1086 = c7024;
        this.f1087 = abstractC4712;
        this.f10180 = c4744;
        this.f10181 = interfaceC4743;
        this.f10184 = interfaceC4743.mo14298();
    }

    /* JADX INFO: renamed from: ۥ */
    public final <E extends IOException> E m1658(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            m14289(e);
        }
        if (z2) {
            if (e != null) {
                this.f1087.mo14065(this.f1086, e);
            } else {
                this.f1087.mo14063(this.f1086, j);
            }
        }
        if (z) {
            if (e != null) {
                this.f1087.mo14070(this.f1086, e);
            } else {
                this.f1087.mo14068(this.f1086, j);
            }
        }
        return (E) this.f1086.m21832(this, z2, z, e);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1659() {
        this.f10181.cancel();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC7472 m14271(@InterfaceC6399 C7101 c7101, boolean z) throws IOException {
        C5499.m17103(c7101, "request");
        this.f10182 = z;
        AbstractC7103 abstractC7103M22149 = c7101.m22149();
        C5499.m17100(abstractC7103M22149);
        long jMo1884 = abstractC7103M22149.mo1884();
        this.f1087.mo14064(this.f1086);
        return new C0476(this, this.f10181.mo1661(c7101, jMo1884), jMo1884);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m14272() {
        this.f10181.cancel();
        this.f1086.m21832(this, true, true, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m14273() throws IOException {
        try {
            this.f10181.mo14295();
        } catch (IOException e) {
            this.f1087.mo14065(this.f1086, e);
            m14289(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m14274() throws IOException {
        try {
            this.f10181.mo14299();
        } catch (IOException e) {
            this.f1087.mo14065(this.f1086, e);
            m14289(e);
            throw e;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final C7024 m14275() {
        return this.f1086;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C7026 m14276() {
        return this.f10184;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final AbstractC4712 m14277() {
        return this.f1087;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C4744 m14278() {
        return this.f10180;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m14279() {
        return this.f10183;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m14280() {
        return !C5499.m17094(this.f10180.m14303().m6514().m16772(), this.f10184.mo1066().m22504().m6514().m16772());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m14281() {
        return this.f10182;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C7033.AbstractC7035 m14282() throws SocketException {
        this.f1086.m21839();
        return this.f10181.mo14298().m21868(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m14283() {
        this.f10181.mo14298().m21870();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m14284() {
        this.f1086.m21832(this, true, false, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final AbstractC7142 m14285(@InterfaceC6399 C7141 c7141) throws IOException {
        C5499.m17103(c7141, "response");
        try {
            String strM22298 = C7141.m22298(c7141, C5375.f13182, null, 2, null);
            long jMo1660 = this.f10181.mo1660(c7141);
            return new C7032(strM22298, jMo1660, C6542.m20831(new C0477(this, this.f10181.mo14301(c7141), jMo1660)));
        } catch (IOException e) {
            this.f1087.mo14070(this.f1086, e);
            m14289(e);
            throw e;
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final C7141.C1185 m14286(boolean z) throws IOException {
        try {
            C7141.C1185 c1185Mo14297 = this.f10181.mo14297(z);
            if (c1185Mo14297 != null) {
                c1185Mo14297.m22355(this);
            }
            return c1185Mo14297;
        } catch (IOException e) {
            this.f1087.mo14070(this.f1086, e);
            m14289(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m14287(@InterfaceC6399 C7141 c7141) {
        C5499.m17103(c7141, "response");
        this.f1087.mo14071(this.f1086, c7141);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m14288() {
        this.f1087.mo14072(this.f1086);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m14289(IOException iOException) {
        this.f10183 = true;
        this.f10180.m14307(iOException);
        this.f10181.mo14298().m21877(this.f1086, iOException);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C5256 m14290() throws IOException {
        return this.f10181.mo14300();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m14291() {
        m1658(-1L, true, true, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m14292(@InterfaceC6399 C7101 c7101) throws IOException {
        C5499.m17103(c7101, "request");
        try {
            this.f1087.mo14067(this.f1086);
            this.f10181.mo14296(c7101);
            this.f1087.mo14066(this.f1086, c7101);
        } catch (IOException e) {
            this.f1087.mo14065(this.f1086, e);
            m14289(e);
            throw e;
        }
    }
}
