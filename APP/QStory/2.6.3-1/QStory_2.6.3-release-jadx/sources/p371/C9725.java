package p371;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p048.C7157;
import p246.C8878;
import p273.C9027;
import p273.C9037;
import p303.AbstractC9234;
import p364.InterfaceC9672;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9725 implements InterfaceC4582 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8878 f25424;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25425;

    public /* synthetic */ C9725(C8878 c8878, int i) {
        this.f25425 = i;
        this.f25424 = c8878;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4582
    public final boolean onClick(AbstractC4570 abstractC4570, View view) {
        int i = this.f25425;
        int i2 = 1;
        C8878 c8878 = this.f25424;
        C9037 c9037 = (C9037) abstractC4570;
        switch (i) {
            case 0:
                C9037 c90372 = new C9037();
                c90372.f22959 = AbstractC9234.m14531(3145);
                c90372.mo14280();
                c90372.f22971 = AbstractC9234.m14531(3146);
                c90372.mo14280();
                c90372.mo14278(AbstractC9234.m14531(3144), new C9725(c8878, i2));
                c90372.m14290();
                return false;
            default:
                C9027.m14266(AbstractC9234.m14531(3149));
                InterfaceC9672 interfaceC9672 = (InterfaceC9672) c8878.f22564;
                String currentUin = QQEnvTool.getCurrentUin();
                AbstractC9234.m14531(1263);
                currentUin.getClass();
                interfaceC9672.m15074(currentUin).mo11722(new C7157(c9037, c8878));
                return true;
        }
    }
}
