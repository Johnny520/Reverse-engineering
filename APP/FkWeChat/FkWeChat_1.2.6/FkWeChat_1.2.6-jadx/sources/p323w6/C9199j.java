package p323w6;

import java.nio.charset.Charset;
import p024b9.AbstractC1043k;
import p064e8.AbstractC2053f;
import p281t6.AbstractC8142e;
import p281t6.C8140d;
import p281t6.C8173z;
import p299ub.AbstractC8625h0;
import p299ub.C8614c;
import p323w6.AbstractC9195f;

/* JADX INFO: renamed from: w6.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9199j extends AbstractC9195f.a {

    /* JADX INFO: renamed from: a */
    public final String f31431a;

    /* JADX INFO: renamed from: b */
    public final C8140d f31432b;

    /* JADX INFO: renamed from: c */
    public final C8173z f31433c;

    /* JADX INFO: renamed from: d */
    public final byte[] f31434d;

    public C9199j(String str, C8140d c8140d, C8173z c8173z) {
        str.getClass();
        c8140d.getClass();
        this.f31431a = str;
        this.f31432b = c8140d;
        this.f31433c = c8173z;
        Charset charsetM31614a = AbstractC8142e.m31614a(mo25837b());
        this.f31434d = AbstractC2053f.m7404c(str, charsetM31614a == null ? C8614c.f28652b : charsetM31614a);
    }

    @Override // p323w6.AbstractC9195f
    /* JADX INFO: renamed from: a */
    public Long mo35815a() {
        return Long.valueOf(this.f31434d.length);
    }

    @Override // p323w6.AbstractC9195f
    /* JADX INFO: renamed from: b */
    public C8140d mo25837b() {
        return this.f31432b;
    }

    @Override // p323w6.AbstractC9195f
    /* JADX INFO: renamed from: d */
    public C8173z mo12275d() {
        return this.f31433c;
    }

    @Override // p323w6.AbstractC9195f.a
    /* JADX INFO: renamed from: e */
    public byte[] mo35816e() {
        return this.f31434d;
    }

    public String toString() {
        return "TextContent[" + mo25837b() + "] \"" + AbstractC8625h0.m33174B1(this.f31431a, 30) + '\"';
    }

    public /* synthetic */ C9199j(String str, C8140d c8140d, C8173z c8173z, int i10, AbstractC1043k abstractC1043k) {
        this(str, c8140d, (i10 & 4) != 0 ? null : c8173z);
    }
}
