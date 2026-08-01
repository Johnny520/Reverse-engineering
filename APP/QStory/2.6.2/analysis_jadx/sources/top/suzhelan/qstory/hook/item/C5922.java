package top.suzhelan.qstory.hook.item;

import android.view.View;
import androidx.compose.runtime.internal.C1245;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.List;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.C5564;
import p028.C6302;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p331.C8799;
import p336.AbstractC8805;
import p337.C8807;
import p337.C8808;
import p337.C8809;
import top.suzhelan.qstory.hook.api.C5815;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.C5820;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5922 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6302 f16107;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC6340.f17461 > 8708) {
            C2632.m5294(AbstractC3056.m6668(-3937662013178906023L));
            return;
        }
        if (LocalDate.now().isAfter(LocalDate.of(2026, 7, 1))) {
            C2632.m5294(AbstractC3056.m6668(-3937661914394658215L));
            return;
        }
        if (this.f16107 == null) {
            this.f16107 = new C6302(AbstractC3056.m6668(-3937661940164461991L), AbstractC3056.m6668(-3937661935869494695L));
        }
        C5907 c5907 = new C5907(this, 0);
        C5820 c5820 = C5816.f15946;
        AbstractC3056.m6668(-3937712899951429031L);
        AbstractC3056.m6668(-3937712629368489383L);
        C5816.f15943.add(new C5815(this, c5907));
        Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937564551781025191L));
        String strM6668 = AbstractC3056.m6668(-3937661858560083367L);
        Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937563963370505639L));
        C6316 c6316M11826 = C6316.m11826(clsM118382);
        c6316M11826.f17409.f3616 = clsM11838;
        Method methodM11827 = c6316M11826.m11827();
        C6316 c6316M118262 = C6316.m11826(clsM118382);
        c6316M118262.f17409.f3616 = List.class;
        Method methodM118272 = c6316M118262.m11827();
        C6316 c6316M11825 = C6316.m11825(strM6668);
        String name = methodM118272.getName();
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3617 = name;
        c1245.f3616 = List.class;
        m11802(c6316M11825.m11827(), new C5564(this, methodM11827, clsM11838, 2));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937662154912826791L);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 3);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11256(Object obj, Object obj2) {
        String uinFromUid = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937592177010673063L), obj);
        long jLongValue = ((Long) AbstractC6317.m11831(Long.TYPE, AbstractC3056.m6668(-3937611379809453479L), obj)).longValue();
        int iIntValue = ((Integer) XposedHelpers.callMethod(obj, AbstractC3056.m6668(-3937609185081165223L), new Object[0])).intValue();
        if (iIntValue == 100 || iIntValue == 1) {
            uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
        }
        String str = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937598288749135271L), obj2);
        String str2 = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937661570797274535L), obj2);
        Integer num = (Integer) AbstractC6317.m11831(Integer.TYPE, AbstractC3056.m6668(-3937661600862045607L), obj2);
        String str3 = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937661514962699687L), AbstractC6317.m11831(null, AbstractC3056.m6668(-3937661476307994023L), obj2));
        C8808 c8808 = new C8808();
        String.valueOf(jLongValue);
        C8807 c8807 = new C8807();
        c8807.f24781 = String.valueOf(jLongValue);
        c8807.f24783 = str2;
        c8807.f24784 = str;
        c8807.f24785 = num.intValue();
        c8807.f24782 = uinFromUid;
        C8809 c8809 = new C8809();
        c8809.f24791 = num.intValue();
        c8809.f24790 = str;
        c8809.f24789 = str2;
        c8809.f24788 = str3;
        c8809.f24787 = uinFromUid;
        c8809.f24794 = String.valueOf(jLongValue);
        new Thread(new RunnableC5904(this, c8808, c8807, c8809)).start();
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 1;
    }
}
