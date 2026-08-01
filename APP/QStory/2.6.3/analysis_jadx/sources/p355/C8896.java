package p355;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import lin.xposed.hook.util.qq.QQEnvTool;
import p032.C6328;
import p230.C8049;
import p257.C8198;
import p257.C8208;
import p287.AbstractC8405;
import p348.InterfaceC8843;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8896 implements InterfaceC3750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8049 f25079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25080;

    public /* synthetic */ C8896(C8049 c8049, int i) {
        this.f25080 = i;
        this.f25079 = c8049;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3750
    public final boolean onClick(AbstractC3738 abstractC3738, View view) {
        int i = this.f25080;
        int i2 = 1;
        C8049 c8049 = this.f25079;
        C8208 c8208 = (C8208) abstractC3738;
        switch (i) {
            case 0:
                C8208 c82082 = new C8208();
                c82082.f22614 = AbstractC8405.m13972(3145);
                c82082.mo13721();
                c82082.f22626 = AbstractC8405.m13972(3146);
                c82082.mo13721();
                c82082.mo13719(AbstractC8405.m13972(3144), new C8896(c8049, i2));
                c82082.m13731();
                return false;
            default:
                C8198.m13707(AbstractC8405.m13972(3149));
                InterfaceC8843 interfaceC8843 = (InterfaceC8843) c8049.f22219;
                String currentUin = QQEnvTool.getCurrentUin();
                AbstractC8405.m13972(1263);
                currentUin.getClass();
                interfaceC8843.m14515(currentUin).mo11163(new C6328(c8208, c8049));
                return true;
        }
    }
}
