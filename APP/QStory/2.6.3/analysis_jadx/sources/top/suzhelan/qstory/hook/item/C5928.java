package top.suzhelan.qstory.hook.item;

import android.view.View;
import androidx.compose.runtime.internal.C1245;
import bsh.C2633;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.List;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.C5565;
import p029.C6321;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import p338.C8805;
import p338.C8806;
import p338.C8807;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.C5817;
import top.suzhelan.qstory.hook.api.C5821;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5928 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6321 f16116;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC6358.f17508 > 8708) {
            C2633.m5339(AbstractC8405.m13972(1065));
            return;
        }
        if (LocalDate.now().isAfter(LocalDate.of(2026, 7, 1))) {
            C2633.m5339(AbstractC8405.m13972(1066));
            return;
        }
        if (this.f16116 == null) {
            this.f16116 = new C6321(AbstractC8405.m13973("喵喵呜呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵呜喵呜呜喵呜~喵喵喵喵呜呜呜喵"), AbstractC8405.m13972(1067));
        }
        C5913 c5913 = new C5913(this, 0);
        C5821 c5821 = C5817.f15946;
        AbstractC8405.m13972(1562);
        AbstractC8405.m13972(1566);
        C5817.f15943.add(new C5816(this, c5913));
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
        String strM13972 = AbstractC8405.m13972(1068);
        Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(163));
        C6335 c6335M11854 = C6335.m11854(clsM118662);
        c6335M11854.f17458.f3617 = clsM11866;
        Method methodM11855 = c6335M11854.m11855();
        C6335 c6335M118542 = C6335.m11854(clsM118662);
        c6335M118542.f17458.f3617 = List.class;
        Method methodM118552 = c6335M118542.m11855();
        C6335 c6335M11853 = C6335.m11853(strM13972);
        String name = methodM118552.getName();
        C1245 c1245 = c6335M11853.f17458;
        c1245.f3618 = name;
        c1245.f3617 = List.class;
        m11830(c6335M11853.m11855(), new C5565(this, methodM11855, clsM11866, 2));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1064);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 3);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11316(Object obj, Object obj2) {
        String uinFromUid = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj);
        long jLongValue = ((Long) AbstractC6336.m11859(Long.TYPE, AbstractC8405.m13972(483), obj)).longValue();
        int iIntValue = ((Integer) XposedHelpers.callMethod(obj, AbstractC8405.m13972(511), new Object[0])).intValue();
        if (iIntValue == 100 || iIntValue == 1) {
            uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
        }
        String str = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), obj2);
        String str2 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵呜喵呜喵呜呜~喵喵喵喵喵喵呜呜"), obj2);
        Integer num = (Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(1069), obj2);
        String str3 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵喵呜"), AbstractC6336.m11859(null, AbstractC8405.m13972(1070), obj2));
        C8806 c8806 = new C8806();
        String.valueOf(jLongValue);
        C8805 c8805 = new C8805();
        c8805.f24779 = String.valueOf(jLongValue);
        c8805.f24781 = str2;
        c8805.f24782 = str;
        c8805.f24783 = num.intValue();
        c8805.f24780 = uinFromUid;
        C8807 c8807 = new C8807();
        c8807.f24789 = num.intValue();
        c8807.f24788 = str;
        c8807.f24787 = str2;
        c8807.f24786 = str3;
        c8807.f24785 = uinFromUid;
        c8807.f24792 = String.valueOf(jLongValue);
        new Thread(new RunnableC5910(this, c8806, c8805, c8807)).start();
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() >= 1;
    }
}
