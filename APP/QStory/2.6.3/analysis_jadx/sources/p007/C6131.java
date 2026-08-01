package p007;

import androidx.compose.foundation.lazy.layout.C0734;
import java.io.Closeable;
import okhttp3.Protocol;
import p004.InterfaceC6100;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6131 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC6121 f16758;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C0734 f16759;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long f16760;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f16761;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6131 f16762;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C6131 f16763;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f16764;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6150 f16765;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f16766;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC6100 f16767;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6131 f16768;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C6151 f16769;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6128 f16770;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Protocol f16771;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16772;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6125 f16773;

    public C6131(C6125 c6125, Protocol protocol, String str, int i, C6150 c6150, C6151 c6151, AbstractC6128 abstractC6128, InterfaceC6100 interfaceC6100, C6131 c6131, C6131 c61312, C6131 c61313, long j, long j2, C0734 c0734, InterfaceC6121 interfaceC6121) {
        c6125.getClass();
        protocol.getClass();
        str.getClass();
        abstractC6128.getClass();
        interfaceC6121.getClass();
        this.f16773 = c6125;
        this.f16771 = protocol;
        this.f16772 = str;
        this.f16766 = i;
        this.f16765 = c6150;
        this.f16769 = c6151;
        this.f16770 = abstractC6128;
        this.f16767 = interfaceC6100;
        this.f16768 = c6131;
        this.f16763 = c61312;
        this.f16762 = c61313;
        this.f16761 = j;
        this.f16760 = j2;
        this.f16759 = c0734;
        this.f16758 = interfaceC6121;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.f16764 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16770.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f16771 + ", code=" + this.f16766 + ", message=" + this.f16772 + ", url=" + this.f16773.f16716 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6132 m11520() {
        C6132 c6132 = new C6132();
        c6132.f16777 = -1;
        c6132.f16784 = AbstractC6128.f16749;
        c6132.f16782 = InterfaceC6121.f16703;
        c6132.f16779 = this.f16773;
        c6132.f16778 = this.f16771;
        c6132.f16777 = this.f16766;
        c6132.f16776 = this.f16772;
        c6132.f16775 = this.f16765;
        c6132.f16774 = this.f16769.m11549();
        c6132.f16784 = this.f16770;
        c6132.f16783 = this.f16767;
        c6132.f16787 = this.f16768;
        c6132.f16788 = this.f16763;
        c6132.f16785 = this.f16762;
        c6132.f16786 = this.f16761;
        c6132.f16781 = this.f16760;
        c6132.f16780 = this.f16759;
        c6132.f16782 = this.f16758;
        return c6132;
    }
}
