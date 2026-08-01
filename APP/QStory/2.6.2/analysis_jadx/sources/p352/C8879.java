package p352;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3749;
import lin.xposed.hook.util.qq.QQEnvTool;
import p031.C6309;
import p230.C8048;
import p257.C8197;
import p257.C8207;
import p348.InterfaceC8861;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8879 implements InterfaceC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8048 f25028;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25029;

    public /* synthetic */ C8879(C8048 c8048, int i) {
        this.f25029 = i;
        this.f25028 = c8048;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3749
    public final boolean onClick(AbstractC3737 abstractC3737, View view) {
        int i = this.f25029;
        int i2 = 1;
        C8048 c8048 = this.f25028;
        C8207 c8207 = (C8207) abstractC3737;
        switch (i) {
            case 0:
                C8207 c82072 = new C8207();
                c82072.f22615 = AbstractC3056.m6668(-3937326262700475815L);
                c82072.mo13704();
                c82072.f22627 = AbstractC3056.m6668(-3937326318535050663L);
                c82072.mo13704();
                c82072.mo13702(AbstractC3056.m6668(-3937326378664592807L), new C8879(c8048, i2));
                c82072.m13714();
                return false;
            default:
                C8197.m13690(AbstractC3056.m6668(-3937326035067209127L));
                InterfaceC8861 interfaceC8861 = (InterfaceC8861) c8048.f22221;
                String currentUin = QQEnvTool.getCurrentUin();
                AbstractC3056.m6668(-3937693259065984423L);
                currentUin.getClass();
                interfaceC8861.m14500(currentUin).mo11106(new C6309(c8207, c8048));
                return true;
        }
    }
}
