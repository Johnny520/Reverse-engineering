package io.ktor.server.engine;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4933 implements InterfaceC4937 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f12794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f12795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4939 f12796;

    public C4933() {
        C4939 c4939 = C4939.f12821;
        c4939.getClass();
        this.f12796 = c4939;
        this.f12795 = "0.0.0.0";
        this.f12794 = 80;
    }

    @Override // io.ktor.server.engine.InterfaceC4937
    public final C4939 getType() {
        return this.f12796;
    }

    public final String toString() {
        return this.f12796.f12822 + ' ' + this.f12795 + ':' + this.f12794;
    }

    @Override // io.ktor.server.engine.InterfaceC4937
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String mo9059() {
        return this.f12795;
    }

    @Override // io.ktor.server.engine.InterfaceC4937
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo9060() {
        return this.f12794;
    }
}
