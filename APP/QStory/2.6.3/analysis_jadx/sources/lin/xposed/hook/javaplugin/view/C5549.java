package lin.xposed.hook.javaplugin.view;

import android.view.View;
import com.bumptech.glide.AbstractC3055;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import lin.xposed.hook.util.qq.QQEnvTool;
import p075.C6958;
import p230.C8049;
import p230.C8053;
import p257.C8198;
import p257.C8208;
import p287.AbstractC8405;
import p348.InterfaceC8843;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5549 implements InterfaceC3750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15312;

    public /* synthetic */ C5549(int i) {
        this.f15312 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3750
    public final boolean onClick(AbstractC3738 abstractC3738, View view) {
        switch (this.f15312) {
            case 0:
                break;
            case 1:
                new C6958(25).m12262();
                break;
            case 2:
                AbstractC3055.m6639(AbstractC3055.m6653());
                break;
            case 3:
                break;
            case 4:
                C8208 c8208 = (C8208) abstractC3738;
                C8049 c8049 = new C8049(16);
                c8208.getClass();
                C8198.m13707(AbstractC8405.m13972(3142));
                InterfaceC8843 interfaceC8843 = (InterfaceC8843) c8049.f22219;
                String currentUin = QQEnvTool.getCurrentUin();
                AbstractC8405.m13972(1263);
                currentUin.getClass();
                interfaceC8843.m14516(currentUin).mo11163(new C8053(c8208, c8049));
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
