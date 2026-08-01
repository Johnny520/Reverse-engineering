package io.ktor.server.engine;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4100 implements InterfaceC4104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f12445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f12446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4106 f12447;

    public C4100() {
        C4106 c4106 = C4106.f12472;
        c4106.getClass();
        this.f12447 = c4106;
        this.f12446 = "0.0.0.0";
        this.f12445 = 80;
    }

    @Override // io.ktor.server.engine.InterfaceC4104
    public final C4106 getType() {
        return this.f12447;
    }

    public final String toString() {
        return this.f12447.f12473 + ' ' + this.f12446 + ':' + this.f12445;
    }

    @Override // io.ktor.server.engine.InterfaceC4104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String mo8510() {
        return this.f12446;
    }

    @Override // io.ktor.server.engine.InterfaceC4104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo8511() {
        return this.f12445;
    }
}
