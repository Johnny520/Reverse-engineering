package lin.xposed.hook.javaplugin.view;

import android.view.View;
import com.bumptech.glide.AbstractC3887;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p091.C7787;
import p246.C8878;
import p246.C8882;
import p273.C9027;
import p273.C9037;
import p364.InterfaceC9672;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6380 implements InterfaceC4582 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15657;

    public /* synthetic */ C6380(int i) {
        this.f15657 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4582
    public final boolean onClick(AbstractC4570 abstractC4570, View view) {
        switch (this.f15657) {
            case 0:
                break;
            case 1:
                new C7787(25).m12821();
                break;
            case 2:
                AbstractC3887.m7199(AbstractC3887.m7213());
                break;
            case 3:
                break;
            case 4:
                C9037 c9037 = (C9037) abstractC4570;
                C8878 c8878 = new C8878(16);
                c9037.getClass();
                C9027.m14266("创建订单选项中");
                InterfaceC9672 interfaceC9672 = (InterfaceC9672) c8878.f22564;
                String currentUin = QQEnvTool.getCurrentUin();
                "getCurrentUin(...)";
                currentUin.getClass();
                interfaceC9672.m15075(currentUin).mo11722(new C8882(c9037, c8878));
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
        return false;
    }
}
