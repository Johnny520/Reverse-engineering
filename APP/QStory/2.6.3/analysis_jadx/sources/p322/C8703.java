package p322;

import android.view.View;
import androidx.activity.compose.C0004;
import androidx.compose.ui.platform.RunnableC1898;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.AbstractC4344;
import p052.InterfaceC6543;
import p087.C7068;
import p257.C8198;
import p257.C8208;
import p257.C8212;
import p257.C8228;
import p261.AbstractC8248;
import p287.AbstractC8405;
import p328.C8755;
import p328.RunnableC8756;
import p355.C8898;
import p355.InterfaceC8897;
import top.suzhelan.qstory.hook.item.chat.C5868;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8703 implements InterfaceC3750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24532;

    public /* synthetic */ C8703(Object obj, int i) {
        this.f24532 = i;
        this.f24531 = obj;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3750
    public final boolean onClick(AbstractC3738 abstractC3738, View view) throws NoSuchMethodException {
        int i = this.f24532;
        int i2 = 1;
        Object obj = this.f24531;
        switch (i) {
            case 0:
                int i3 = C8702.f24528;
                C8198.m13707(AbstractC8405.m13972(1173));
                new Thread(new RunnableC1898((C8702) obj, 13)).start();
                break;
            case 1:
                C7068 c7068 = new C7068((C8208) abstractC3738, 3, (LinkedHashSet) obj);
                AbstractC8405.m13972(2742);
                String strM13972 = AbstractC8405.m13972(2743);
                String strM139722 = AbstractC8405.m13972(2744);
                String strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜呜喵喵喵喵呜~呜喵喵喵呜呜喵呜~呜呜喵呜呜呜呜喵~呜呜喵呜喵呜呜喵");
                String strM139732 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵");
                C8228 c8228 = new C8228();
                c8228.f11585 = AbstractC8248.f22819;
                c8228.f22614 = strM13972;
                c8228.f22626 = strM139722;
                c8228.f22625 = strM13973;
                c8228.f22629 = strM139732;
                c8228.f22623 = new C5868(c7068, i2);
                c8228.m13731();
                break;
            case 2:
                String str = C8755.f24674;
                new Thread(new RunnableC8756((C8755) obj, 1)).start();
                break;
            case 3:
                C8898 c8898 = (C8898) obj;
                InterfaceC8897 interfaceC8897 = c8898.f25083;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c8898.f25082.f24820;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                interfaceC8897.mo4484(AbstractC4344.m8797(linkedHashMap2.keySet()));
                break;
            case 4:
                ((C0004) obj).invoke();
                C8212.m13737("已复制到剪切板");
                break;
            default:
                ((InterfaceC6543) obj).invoke();
                C8212.m13737("已复制到剪切板");
                break;
        }
        return false;
    }
}
