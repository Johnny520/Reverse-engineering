package p338;

import android.view.View;
import androidx.activity.compose.C0851;
import androidx.compose.p001ui.platform.RunnableC2733;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.AbstractC5176;
import p068.InterfaceC7372;
import p103.C7897;
import p273.C9027;
import p273.C9037;
import p273.C9041;
import p273.C9057;
import p277.AbstractC9077;
import p303.AbstractC9234;
import p344.C9584;
import p344.RunnableC9585;
import p371.C9727;
import p371.InterfaceC9726;
import top.suzhelan.qstory.hook.item.chat.C6698;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9532 implements InterfaceC4582 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24877;

    public /* synthetic */ C9532(Object obj, int i) {
        this.f24877 = i;
        this.f24876 = obj;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4582
    public final boolean onClick(AbstractC4570 abstractC4570, View view) throws NoSuchMethodException {
        int i = this.f24877;
        int i2 = 1;
        Object obj = this.f24876;
        switch (i) {
            case 0:
                int i3 = C9531.f24873;
                C9027.m14266(AbstractC9234.m14531(1173));
                new Thread(new RunnableC2733((C9531) obj, 13)).start();
                break;
            case 1:
                C7897 c7897 = new C7897((C9037) abstractC4570, 3, (LinkedHashSet) obj);
                AbstractC9234.m14531(2742);
                String strM14531 = AbstractC9234.m14531(2743);
                String strM145312 = AbstractC9234.m14531(2744);
                String strM14532 = AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜呜喵喵喵喵呜~呜喵喵喵呜呜喵呜~呜呜喵呜呜呜呜喵~呜呜喵呜喵呜呜喵");
                String strM145322 = AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵");
                C9057 c9057 = new C9057();
                c9057.f11930 = AbstractC9077.f23164;
                c9057.f22959 = strM14531;
                c9057.f22971 = strM145312;
                c9057.f22970 = strM14532;
                c9057.f22974 = strM145322;
                c9057.f22968 = new C6698(c7897, i2);
                c9057.m14290();
                break;
            case 2:
                String str = C9584.f25019;
                new Thread(new RunnableC9585((C9584) obj, 1)).start();
                break;
            case 3:
                C9727 c9727 = (C9727) obj;
                InterfaceC9726 interfaceC9726 = c9727.f25428;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c9727.f25427.f25165;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                interfaceC9726.mo5044(AbstractC5176.m9356(linkedHashMap2.keySet()));
                break;
            case 4:
                ((C0851) obj).invoke();
                C9041.m14296("已复制到剪切板");
                break;
            default:
                ((InterfaceC7372) obj).invoke();
                C9041.m14296("已复制到剪切板");
                break;
        }
        return false;
    }
}
