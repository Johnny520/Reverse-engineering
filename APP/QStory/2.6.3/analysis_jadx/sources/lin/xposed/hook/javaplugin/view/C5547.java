package lin.xposed.hook.javaplugin.view;

import android.view.View;
import androidx.compose.foundation.text.selection.C0916;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import java.io.File;
import java.util.List;
import p010.AbstractC6185;
import p036.C6359;
import p144.C7547;
import p193.C7828;
import p257.C8198;
import p257.C8208;
import p287.AbstractC8405;
import p321.C8694;
import p352.RunnableC8868;
import p355.C8890;
import top.suzhelan.qstory.entity.Notice;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5547 implements InterfaceC3750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f15307;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15309;

    public /* synthetic */ C5547(Object obj, int i, Object obj2) {
        this.f15309 = i;
        this.f15308 = obj;
        this.f15307 = obj2;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3750
    public final boolean onClick(AbstractC3738 abstractC3738, View view) {
        int i = this.f15309;
        int i2 = 21;
        Object obj = this.f15307;
        Object obj2 = this.f15308;
        switch (i) {
            case 0:
                break;
            case 1:
                ((C6359) obj2).f17513.m14677(Integer.valueOf(((Notice) obj).getVersion()), AbstractC8405.m13972(1246));
                break;
            case 2:
                C0916 c0916 = (C0916) obj;
                File file = new File(((C8694) obj2).f24516);
                if (file.exists() && file.delete()) {
                    AbstractC6185.m11592(AbstractC8405.m13972(2741));
                    c0916.invoke();
                }
                break;
            case 3:
                C8890 c8890 = (C8890) obj2;
                List list = (List) obj;
                ((C8208) abstractC3738).m13730();
                C8208 c8208 = c8890.f25061;
                if (c8208 != null) {
                    c8208.m13730();
                }
                C8198 c8198M13708 = C8198.m13708(AbstractC8405.m13972(3109) + list.size() + AbstractC8405.m13973("喵呜喵呜呜喵呜喵~喵呜喵呜呜喵呜呜~喵呜喵呜喵呜喵喵~喵呜喵喵喵呜呜喵"), 0.0f);
                c8198M13708.f22575 = new C7547(i2);
                c8198M13708.m13711();
                new Thread(new RunnableC8868(list, 4, c8890)).start();
                break;
            default:
                C7828 c7828 = (C7828) obj2;
                List list2 = (List) obj;
                ((C8208) abstractC3738).m13730();
                C8208 c82082 = (C8208) c7828.f21366;
                if (c82082 != null) {
                    c82082.m13730();
                }
                C8198 c8198M137082 = C8198.m13708(AbstractC8405.m13972(3125) + list2.size() + AbstractC8405.m13973("喵呜喵呜呜喵呜喵~喵呜喵呜呜喵呜呜~喵呜喵呜喵呜喵喵~喵呜喵喵喵呜呜喵"), 0.0f);
                c8198M137082.f22575 = new C7547(i2);
                c8198M137082.m13711();
                new Thread(new RunnableC8868(list2, 6, c7828)).start();
                break;
        }
        return false;
    }
}
