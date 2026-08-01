package p336;

import android.text.TextUtils;
import android.view.View;
import androidx.activity.AbstractC0053;
import de.robv.android.xposed.XposedHelpers;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6185;
import p029.C6321;
import p033.AbstractC6336;
import p036.AbstractC6358;
import p043.RunnableC6452;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.C5817;
import top.suzhelan.qstory.hook.api.C5821;
import top.suzhelan.qstory.hook.item.C5913;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8802 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6321 f24775;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC6358.f17508 >= 5626) {
            return;
        }
        this.f24775 = new C6321(AbstractC8405.m13972(1144), AbstractC8405.m13972(1067));
        C5913 c5913 = new C5913(this, 4);
        C5821 c5821 = C5817.f15946;
        AbstractC8405.m13972(1562);
        AbstractC8405.m13972(1566);
        C5817.f15943.add(new C5816(this, c5913));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1143);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC5533(19);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14475(Object obj, Object obj2) {
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
        if (num.intValue() == 1) {
            if (!((Boolean) this.f24775.m11840(Boolean.TRUE, AbstractC8405.m13972(1062))).booleanValue()) {
                return;
            }
        }
        if (num.intValue() == 32) {
            if (!((Boolean) this.f24775.m11840(Boolean.FALSE, AbstractC8405.m13972(1145))).booleanValue()) {
                return;
            }
        }
        if (num.intValue() == 1024) {
            if (!((Boolean) this.f24775.m11840(Boolean.FALSE, AbstractC8405.m13972(1063))).booleanValue()) {
                return;
            }
        }
        String str4 = (String) this.f24775.m11840(null, AbstractC8405.m13972(1056));
        if (str4 == null || !uinFromUid.matches(str4.replace(AbstractC8405.m13973("喵呜喵呜喵喵呜呜"), ""))) {
            String strM161 = (String) this.f24775.m11840(null, AbstractC8405.m13972(1057));
            if (!TextUtils.isEmpty(strM161)) {
                if (strM161.endsWith(AbstractC8405.m13973("喵喵喵喵呜呜呜呜"))) {
                    strM161 = AbstractC0053.m161(1, 0, strM161);
                }
                String[] strArrSplit = strM161.split(AbstractC8405.m13973("喵喵呜喵呜呜呜呜~喵喵喵喵呜喵喵呜"));
                if (strArrSplit != null) {
                    for (String str5 : strArrSplit) {
                        if (str3.contains(str5)) {
                            return;
                        }
                    }
                }
            }
            if (((Boolean) this.f24775.m11840(Boolean.TRUE, AbstractC8405.m13972(1061))).booleanValue() && (num.intValue() == 1 || num.intValue() == 32)) {
                AbstractC6185.m11592(AbstractC8405.m13972(1146) + ((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(584), obj)) + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + uinFromUid + AbstractC8405.m13973("喵呜喵呜呜喵呜喵~喵呜呜呜呜呜呜呜") + ((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(586), obj)) + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + jLongValue + AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
            }
            RunnableC6452 runnableC6452 = new RunnableC6452();
            runnableC6452.f17684 = str;
            runnableC6452.f17680 = str2;
            runnableC6452.f17681 = uinFromUid;
            runnableC6452.f17682 = String.valueOf(jLongValue);
            runnableC6452.f17683 = num.intValue();
            if (num.intValue() == 32) {
                runnableC6452.f17679 = str3.replace(AbstractC8405.m13972(482), "");
            }
            new Thread(new RunnableC8801(this, uinFromUid, jLongValue, str, str2, num, str3)).start();
        }
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() >= 1;
    }
}
