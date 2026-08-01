package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3744;
import java.io.File;
import kotlin.text.AbstractC5144;
import p010.AbstractC6185;
import p087.C7068;
import p257.C8212;
import p287.AbstractC8405;
import p321.C8688;
import p391.C9095;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5868 implements InterfaceC3744 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16025;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16026;

    public /* synthetic */ C5868(Object obj, int i) {
        this.f16026 = i;
        this.f16025 = obj;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3744
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8062(AbstractC3738 abstractC3738, View view, String str) {
        int i = this.f16026;
        Object obj = this.f16025;
        switch (i) {
            case 0:
                int i2 = C5859.f16017;
                str.getClass();
                String string = AbstractC5144.m10155(str).toString();
                int length = string.length();
                C9095 c9095 = ((C5859) obj).f16018;
                if (length != 0) {
                    c9095.m14677(string, AbstractC8405.m13972(2153));
                    AbstractC6185.m11592(AbstractC8405.m13972(2159).concat(string));
                } else {
                    c9095.m14677(AbstractC8405.m13972(2154), AbstractC8405.m13972(2153));
                    AbstractC6185.m11592(AbstractC8405.m13972(2158));
                }
                break;
            default:
                C7068 c7068 = (C7068) obj;
                str.getClass();
                if (str.length() != 0) {
                    C8688.f24506.getClass();
                    File file = new File(C8688.m14410(), str);
                    if (file.exists()) {
                        C8212.m13737(AbstractC8405.m13972(2746)).m13741();
                    } else if (file.mkdirs()) {
                        C8212.m13737(AbstractC8405.m13972(2747).concat(str)).m13740();
                        c7068.invoke(str);
                    }
                } else {
                    C8212.m13737(AbstractC8405.m13972(2745)).m13741();
                }
                break;
        }
        return false;
    }
}
