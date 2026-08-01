package p328;

import android.text.TextUtils;
import android.view.View;
import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import lin.xposed.hook.util.qq.QQEnvTool;
import p007.AbstractC6136;
import p010.AbstractC6154;
import p028.C6302;
import p032.AbstractC6317;
import p035.AbstractC6340;
import p042.RunnableC6442;
import p331.C8799;
import p336.AbstractC8805;
import top.suzhelan.qstory.hook.api.C5815;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.C5820;
import top.suzhelan.qstory.hook.item.C5907;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8784 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6302 f24734;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC6340.f17461 >= 5626) {
            return;
        }
        this.f24734 = new C6302(AbstractC3056.m6668(-3937668683263116711L), AbstractC3056.m6668(-3937661935869494695L));
        C5907 c5907 = new C5907(this, 4);
        C5820 c5820 = C5816.f15946;
        AbstractC3056.m6668(-3937712899951429031L);
        AbstractC3056.m6668(-3937712629368489383L);
        C5816.f15943.add(new C5815(this, c5907));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937668799227233703L);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC5532(18);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14443(Object obj, Object obj2) {
        long j;
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
        if (num.intValue() == 1) {
            if (!((Boolean) this.f24734.m11812(Boolean.TRUE, AbstractC3056.m6668(-3937662296646747559L))).booleanValue()) {
                return;
            }
        }
        if (num.intValue() == 32) {
            if (!((Boolean) this.f24734.m11812(Boolean.FALSE, AbstractC3056.m6668(-3937668614543639975L))).booleanValue()) {
                return;
            }
        }
        if (num.intValue() == 1024) {
            if (!((Boolean) this.f24734.m11812(Boolean.FALSE, AbstractC3056.m6668(-3937662163502761383L))).booleanValue()) {
                return;
            }
        }
        String str4 = (String) this.f24734.m11812(null, AbstractC3056.m6668(-3937662532869948839L));
        if (str4 != null) {
            j = -3937561979095614887L;
            if (uinFromUid.matches(str4.replace(AbstractC3056.m6668(-3937648784679634343L), AbstractC3056.m6668(-3937561979095614887L)))) {
                return;
            }
        } else {
            j = -3937561979095614887L;
        }
        String strM160 = (String) this.f24734.m11812(null, AbstractC3056.m6668(-3937662459855504807L));
        if (!TextUtils.isEmpty(strM160)) {
            if (strM160.endsWith(AbstractC3056.m6668(-3937661407588517287L))) {
                strM160 = AbstractC0053.m160(1, 0, strM160);
            }
            String[] strArrSplit = strM160.split(AbstractC3056.m6668(-3937661416178451879L));
            if (strArrSplit != null) {
                for (String str5 : strArrSplit) {
                    if (str3.contains(str5)) {
                        return;
                    }
                }
            }
        }
        if (((Boolean) this.f24734.m11812(Boolean.TRUE, AbstractC3056.m6668(-3937662253697074599L))).booleanValue() && (num.intValue() == 1 || num.intValue() == 32)) {
            String str6 = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937619651916465575L), obj);
            String str7 = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937619617556727207L), obj);
            StringBuilder sb = new StringBuilder();
            AbstractC6136.m11544(-3937668528644294055L, sb, str6);
            AbstractC6136.m11544(-3937587577100699047L, sb, uinFromUid);
            AbstractC6136.m11544(-3937668416975144359L, sb, str7);
            sb.append(AbstractC3056.m6668(-3937587577100699047L));
            sb.append(jLongValue);
            sb.append(AbstractC3056.m6668(-3937587482611418535L));
            AbstractC6154.m11561(sb.toString());
        }
        RunnableC6442 runnableC6442 = new RunnableC6442();
        runnableC6442.f17664 = str;
        runnableC6442.f17660 = str2;
        runnableC6442.f17661 = uinFromUid;
        runnableC6442.f17662 = String.valueOf(jLongValue);
        runnableC6442.f17663 = num.intValue();
        if (num.intValue() == 32) {
            runnableC6442.f17659 = str3.replace(AbstractC3056.m6668(-3937611487183635879L), AbstractC3056.m6668(j));
        }
        new Thread(new RunnableC8781(this, uinFromUid, jLongValue, str, str2, num, str3)).start();
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 1;
    }
}
