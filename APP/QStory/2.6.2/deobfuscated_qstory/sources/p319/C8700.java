package p319;

import android.view.View;
import androidx.activity.compose.C0004;
import androidx.compose.ui.platform.RunnableC1898;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3749;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.AbstractC4343;
import p052.InterfaceC6542;
import p087.C7067;
import p257.C8197;
import p257.C8207;
import p257.C8211;
import p257.C8227;
import p261.AbstractC8247;
import p321.C8721;
import p327.C8773;
import p327.RunnableC8774;
import p352.C8881;
import p352.InterfaceC8880;
import top.suzhelan.qstory.hook.item.chat.C5863;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8700 implements InterfaceC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24530;

    public /* synthetic */ C8700(Object obj, int i) {
        this.f24530 = i;
        this.f24529 = obj;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3749
    public final boolean onClick(AbstractC3737 abstractC3737, View view) throws NoSuchMethodException {
        int i = this.f24530;
        int i2 = 1;
        Object obj = this.f24529;
        switch (i) {
            case 0:
                C7067 c7067 = new C7067((C8207) abstractC3737, 3, (LinkedHashSet) obj);
                "onCreated";
                String strM6668 = "\u521b\u5efa\u65b0\u6587\u4ef6\u5939";
                String strM66682 = "\u8f93\u5165\u6587\u4ef6\u5939\u540d";
                String strM66683 = "\u521b\u5efa";
                String strM66684 = "\u53d6\u6d88";
                C8227 c8227 = new C8227();
                c8227.f11580 = AbstractC8247.f22820;
                c8227.f22615 = strM6668;
                c8227.f22627 = strM66682;
                c8227.f22626 = strM66683;
                c8227.f22630 = strM66684;
                c8227.f22624 = new C5863(c7067, i2);
                c8227.m13714();
                break;
            case 1:
                int i3 = C8721.f24585;
                C8197.m13690("\u6b63\u5728\u53d1\u9001QQ\u7a7a\u95f4");
                new Thread(new RunnableC1898((C8721) obj, 17)).start();
                break;
            case 2:
                String str = C8773.f24710;
                new Thread(new RunnableC8774((C8773) obj, i2)).start();
                break;
            case 3:
                C8881 c8881 = (C8881) obj;
                InterfaceC8880 interfaceC8880 = c8881.f25032;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c8881.f25031.f24839;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                interfaceC8880.mo4474(AbstractC4343.m8804(linkedHashMap2.keySet()));
                break;
            case 4:
                ((C0004) obj).invoke();
                C8211.m13720("已复制到剪切板");
                break;
            default:
                ((InterfaceC6542) obj).invoke();
                C8211.m13720("已复制到剪切板");
                break;
        }
        return false;
    }
}
