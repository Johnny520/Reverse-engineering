package lin.xposed.hook.javaplugin.view;

import android.view.View;
import androidx.compose.foundation.text.selection.C0916;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3749;
import java.io.File;
import java.util.List;
import p010.AbstractC6154;
import p035.C6341;
import p144.C7546;
import p193.C7827;
import p257.C8197;
import p257.C8207;
import p324.C8744;
import p342.RunnableC8820;
import p352.C8873;
import top.suzhelan.qstory.entity.Notice;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5546 implements InterfaceC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f15307;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15309;

    public /* synthetic */ C5546(Object obj, int i, Object obj2) {
        this.f15309 = i;
        this.f15308 = obj;
        this.f15307 = obj2;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3749
    public final boolean onClick(AbstractC3737 abstractC3737, View view) {
        int i = this.f15309;
        int i2 = 14;
        Object obj = this.f15307;
        Object obj2 = this.f15308;
        switch (i) {
            case 0:
                break;
            case 1:
                ((C6341) obj2).f17466.m14640(Integer.valueOf(((Notice) obj).getVersion()), "lastNotice");
                break;
            case 2:
                C0916 c0916 = (C0916) obj;
                File file = new File(((C8744) obj2).f24649);
                if (file.exists() && file.delete()) {
                    AbstractC6154.m11561("\u5220\u9664\u6210\u529f");
                    c0916.invoke();
                }
                break;
            case 3:
                C8873 c8873 = (C8873) obj2;
                List list = (List) obj;
                ((C8207) abstractC3737).m13713();
                C8207 c8207 = c8873.f25010;
                if (c8207 != null) {
                    c8207.m13713();
                }
                C8197 c8197M13691 = C8197.m13691("\u6b63\u5728\u5220\u9664\u597d\u53cb (0/" + list.size() + ")...", 0.0f);
                c8197M13691.f22576 = new C7546(i2);
                c8197M13691.m13694();
                new Thread(new RunnableC8820(list, 4, c8873)).start();
                break;
            default:
                C7827 c7827 = (C7827) obj2;
                List list2 = (List) obj;
                ((C8207) abstractC3737).m13713();
                C8207 c82072 = (C8207) c7827.f21369;
                if (c82072 != null) {
                    c82072.m13713();
                }
                C8197 c8197M136912 = C8197.m13691("\u6b63\u5728\u9000\u51fa\u7fa4 (0/" + list2.size() + ")...", 0.0f);
                c8197M136912.f22576 = new C7546(i2);
                c8197M136912.m13694();
                new Thread(new RunnableC8820(list2, 6, c7827)).start();
                break;
        }
        return false;
    }
}
