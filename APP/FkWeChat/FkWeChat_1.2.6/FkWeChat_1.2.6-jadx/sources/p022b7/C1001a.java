package p022b7;

import java.nio.charset.Charset;
import p064e8.AbstractC2053f;

/* JADX INFO: renamed from: b7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1001a {

    /* JADX INFO: renamed from: a */
    public final byte[] f3104a;

    /* JADX INFO: renamed from: b */
    public final byte[] f3105b;

    /* JADX INFO: renamed from: c */
    public final byte[] f3106c;

    public C1001a(Charset charset) {
        charset.getClass();
        this.f3104a = AbstractC2053f.m7404c("[", charset);
        this.f3105b = AbstractC2053f.m7404c("]", charset);
        this.f3106c = AbstractC2053f.m7404c(",", charset);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m3693a() {
        return this.f3104a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m3694b() {
        return this.f3105b;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m3695c() {
        return this.f3106c;
    }
}
