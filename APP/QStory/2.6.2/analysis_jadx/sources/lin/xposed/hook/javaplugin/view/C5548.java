package lin.xposed.hook.javaplugin.view;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3749;
import lin.xposed.hook.util.qq.QQEnvTool;
import p075.C6957;
import p175.AbstractC7738;
import p230.C8048;
import p230.C8052;
import p257.C8197;
import p257.C8207;
import p348.InterfaceC8861;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5548 implements InterfaceC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15312;

    public /* synthetic */ C5548(int i) {
        this.f15312 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3749
    public final boolean onClick(AbstractC3737 abstractC3737, View view) {
        switch (this.f15312) {
            case 0:
                break;
            case 1:
                new C6957(26).m12237();
                break;
            case 2:
                AbstractC7738.m13038(AbstractC7738.m13031());
                break;
            case 3:
                break;
            case 4:
                C8207 c8207 = (C8207) abstractC3737;
                C8048 c8048 = new C8048(15);
                c8207.getClass();
                C8197.m13690(AbstractC3056.m6668(-3937326447384069543L));
                InterfaceC8861 interfaceC8861 = (InterfaceC8861) c8048.f22221;
                String currentUin = QQEnvTool.getCurrentUin();
                AbstractC3056.m6668(-3937693259065984423L);
                currentUin.getClass();
                interfaceC8861.m14501(currentUin).mo11106(new C8052(c8207, c8048));
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
