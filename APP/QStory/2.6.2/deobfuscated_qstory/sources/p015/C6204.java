package p015;

import androidx.compose.foundation.lazy.layout.C0734;
import java.io.Closeable;
import okhttp3.Protocol;
import p005.InterfaceC6109;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6204 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC6194 f16997;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C0734 f16998;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long f16999;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f17000;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6204 f17001;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C6204 f17002;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f17003;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6223 f17004;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f17005;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC6109 f17006;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6204 f17007;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C6224 f17008;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6201 f17009;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Protocol f17010;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17011;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6198 f17012;

    public C6204(C6198 c6198, Protocol protocol, String str, int i, C6223 c6223, C6224 c6224, AbstractC6201 abstractC6201, InterfaceC6109 interfaceC6109, C6204 c6204, C6204 c62042, C6204 c62043, long j, long j2, C0734 c0734, InterfaceC6194 interfaceC6194) {
        c6198.getClass();
        protocol.getClass();
        str.getClass();
        abstractC6201.getClass();
        interfaceC6194.getClass();
        this.f17012 = c6198;
        this.f17010 = protocol;
        this.f17011 = str;
        this.f17005 = i;
        this.f17004 = c6223;
        this.f17008 = c6224;
        this.f17009 = abstractC6201;
        this.f17006 = interfaceC6109;
        this.f17007 = c6204;
        this.f17002 = c62042;
        this.f17001 = c62043;
        this.f17000 = j;
        this.f16999 = j2;
        this.f16998 = c0734;
        this.f16997 = interfaceC6194;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.f17003 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17009.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f17010 + ", code=" + this.f17005 + ", message=" + this.f17011 + ", url=" + this.f17012.f16955 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6205 m11649() {
        C6205 c6205 = new C6205();
        c6205.f17016 = -1;
        c6205.f17023 = AbstractC6201.f16988;
        c6205.f17021 = InterfaceC6194.f16942;
        c6205.f17018 = this.f17012;
        c6205.f17017 = this.f17010;
        c6205.f17016 = this.f17005;
        c6205.f17015 = this.f17011;
        c6205.f17014 = this.f17004;
        c6205.f17013 = this.f17008.m11678();
        c6205.f17023 = this.f17009;
        c6205.f17022 = this.f17006;
        c6205.f17026 = this.f17007;
        c6205.f17027 = this.f17002;
        c6205.f17024 = this.f17001;
        c6205.f17025 = this.f17000;
        c6205.f17020 = this.f16999;
        c6205.f17019 = this.f16998;
        c6205.f17021 = this.f16997;
        return c6205;
    }
}
