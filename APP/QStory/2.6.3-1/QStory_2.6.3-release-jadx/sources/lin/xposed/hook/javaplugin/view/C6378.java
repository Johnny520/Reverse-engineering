package lin.xposed.hook.javaplugin.view;

import android.view.View;
import androidx.compose.foundation.text.selection.C1754;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import java.io.File;
import java.util.List;
import p026.AbstractC7014;
import p052.C7188;
import p160.C8376;
import p209.C8657;
import p273.C9027;
import p273.C9037;
import p303.AbstractC9234;
import p337.C9523;
import p368.RunnableC9697;
import p371.C9719;
import top.suzhelan.qstory.entity.Notice;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6378 implements InterfaceC4582 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f15652;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15654;

    public /* synthetic */ C6378(Object obj, int i, Object obj2) {
        this.f15654 = i;
        this.f15653 = obj;
        this.f15652 = obj2;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4582
    public final boolean onClick(AbstractC4570 abstractC4570, View view) {
        int i = this.f15654;
        int i2 = 21;
        Object obj = this.f15652;
        Object obj2 = this.f15653;
        switch (i) {
            case 0:
                break;
            case 1:
                ((C7188) obj2).f17858.m15236(Integer.valueOf(((Notice) obj).getVersion()), AbstractC9234.m14531(1246));
                break;
            case 2:
                C1754 c1754 = (C1754) obj;
                File file = new File(((C9523) obj2).f24861);
                if (file.exists() && file.delete()) {
                    AbstractC7014.m12151(AbstractC9234.m14531(2741));
                    c1754.invoke();
                }
                break;
            case 3:
                C9719 c9719 = (C9719) obj2;
                List list = (List) obj;
                ((C9037) abstractC4570).m14289();
                C9037 c9037 = c9719.f25406;
                if (c9037 != null) {
                    c9037.m14289();
                }
                C9027 c9027M14267 = C9027.m14267(AbstractC9234.m14531(3109) + list.size() + AbstractC9234.m14532("喵呜喵呜呜喵呜喵~喵呜喵呜呜喵呜呜~喵呜喵呜喵呜喵喵~喵呜喵喵喵呜呜喵"), 0.0f);
                c9027M14267.f22920 = new C8376(i2);
                c9027M14267.m14270();
                new Thread(new RunnableC9697(list, 4, c9719)).start();
                break;
            default:
                C8657 c8657 = (C8657) obj2;
                List list2 = (List) obj;
                ((C9037) abstractC4570).m14289();
                C9037 c90372 = (C9037) c8657.f21711;
                if (c90372 != null) {
                    c90372.m14289();
                }
                C9027 c9027M142672 = C9027.m14267(AbstractC9234.m14531(3125) + list2.size() + AbstractC9234.m14532("喵呜喵呜呜喵呜喵~喵呜喵呜呜喵呜呜~喵呜喵呜喵呜喵喵~喵呜喵喵喵呜呜喵"), 0.0f);
                c9027M142672.f22920 = new C8376(i2);
                c9027M142672.m14270();
                new Thread(new RunnableC9697(list2, 6, c8657)).start();
                break;
        }
        return false;
    }
}
