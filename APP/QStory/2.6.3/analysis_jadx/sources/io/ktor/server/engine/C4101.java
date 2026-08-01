package io.ktor.server.engine;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4101 implements InterfaceC4105 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f12449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f12450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4107 f12451;

    public C4101() {
        C4107 c4107 = C4107.f12476;
        c4107.getClass();
        this.f12451 = c4107;
        this.f12450 = "0.0.0.0";
        this.f12449 = 80;
    }

    @Override // io.ktor.server.engine.InterfaceC4105
    public final C4107 getType() {
        return this.f12451;
    }

    public final String toString() {
        return this.f12451.f12477 + ' ' + this.f12450 + ':' + this.f12449;
    }

    @Override // io.ktor.server.engine.InterfaceC4105
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String mo8500() {
        return this.f12450;
    }

    @Override // io.ktor.server.engine.InterfaceC4105
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo8501() {
        return this.f12449;
    }
}
