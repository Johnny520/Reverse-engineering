package top.suzhelan.qstory.hook.item;

import android.view.View;
import androidx.compose.runtime.internal.C2080;
import bsh.C3466;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.List;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.C6395;
import p045.C7150;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p303.AbstractC9234;
import p348.C9614;
import p353.AbstractC9632;
import p354.C9634;
import p354.C9635;
import p354.C9636;
import top.suzhelan.qstory.hook.api.C6646;
import top.suzhelan.qstory.hook.api.C6647;
import top.suzhelan.qstory.hook.api.C6651;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6758 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7150 f16461;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC7187.f17853 > 8708) {
            C3466.m5899(AbstractC9234.m14531(1065));
            return;
        }
        if (LocalDate.now().isAfter(LocalDate.of(2026, 7, 1))) {
            C3466.m5899(AbstractC9234.m14531(1066));
            return;
        }
        if (this.f16461 == null) {
            this.f16461 = new C7150(AbstractC9234.m14532("喵喵呜呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵呜喵呜呜喵呜~喵喵喵喵呜呜呜喵"), AbstractC9234.m14531(1067));
        }
        C6743 c6743 = new C6743(this, 0);
        C6651 c6651 = C6647.f16291;
        AbstractC9234.m14531(1562);
        AbstractC9234.m14531(1566);
        C6647.f16288.add(new C6646(this, c6743));
        Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(160));
        String strM14531 = AbstractC9234.m14531(1068);
        Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(163));
        C7164 c7164M12413 = C7164.m12413(clsM124252);
        c7164M12413.f17803.f3962 = clsM12425;
        Method methodM12414 = c7164M12413.m12414();
        C7164 c7164M124132 = C7164.m12413(clsM124252);
        c7164M124132.f17803.f3962 = List.class;
        Method methodM124142 = c7164M124132.m12414();
        C7164 c7164M12412 = C7164.m12412(strM14531);
        String name = methodM124142.getName();
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3963 = name;
        c2080.f3962 = List.class;
        m12389(c7164M12412.m12414(), new C6395(this, methodM12414, clsM12425, 2));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1064);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 3);
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11875(Object obj, Object obj2) {
        String uinFromUid = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj);
        long jLongValue = ((Long) AbstractC7165.m12418(Long.TYPE, AbstractC9234.m14531(483), obj)).longValue();
        int iIntValue = ((Integer) XposedHelpers.callMethod(obj, AbstractC9234.m14531(511), new Object[0])).intValue();
        if (iIntValue == 100 || iIntValue == 1) {
            uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
        }
        String str = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), obj2);
        String str2 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵呜喵呜喵呜呜~喵喵喵喵喵喵呜呜"), obj2);
        Integer num = (Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(1069), obj2);
        String str3 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵喵呜"), AbstractC7165.m12418(null, AbstractC9234.m14531(1070), obj2));
        C9635 c9635 = new C9635();
        String.valueOf(jLongValue);
        C9634 c9634 = new C9634();
        c9634.f25124 = String.valueOf(jLongValue);
        c9634.f25126 = str2;
        c9634.f25127 = str;
        c9634.f25128 = num.intValue();
        c9634.f25125 = uinFromUid;
        C9636 c9636 = new C9636();
        c9636.f25134 = num.intValue();
        c9636.f25133 = str;
        c9636.f25132 = str2;
        c9636.f25131 = str3;
        c9636.f25130 = uinFromUid;
        c9636.f25137 = String.valueOf(jLongValue);
        new Thread(new RunnableC6740(this, c9635, c9634, c9636)).start();
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        return c9614.f25085.intValue() >= 1;
    }
}
