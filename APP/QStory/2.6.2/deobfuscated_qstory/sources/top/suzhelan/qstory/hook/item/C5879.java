package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.interfaces.InterfaceC3742;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p010.AbstractC6154;
import p026.InterfaceC6294;
import p032.AbstractC6318;
import p391.C9114;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5879 implements InterfaceC6294, InterfaceC3742 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C5882 f16053;

    public /* synthetic */ C5879(C5882 c5882) {
        this.f16053 = c5882;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3742
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo4475(CharSequence charSequence, Object obj, int i) {
        C5882 c5882 = this.f16053;
        c5882.f16056.m14640(Integer.valueOf(i), "sizeIndex");
        if (i != 0) {
            c5882.f17376 = Boolean.TRUE;
        }
        AbstractC6154.m11561("\u5df2\u8bbe\u7f6e\u4e3a: " + ((Object) charSequence));
        return false;
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Integer num;
        Class clsM11838;
        int i = 1;
        Integer num2 = 1;
        C5882 c5882 = this.f16053;
        C9114 c9114 = c5882.f16056;
        String strM6668 = "sizeIndex";
        c9114.getClass();
        int iIntValue = ((Number) AbstractC4343.m8787(c5882.f16055.values(), c9114.f25485.getInt(strM6668, 0))).intValue();
        if (iIntValue == 0) {
            return;
        }
        Object[] objArr = methodHookParam.args;
        Object obj2 = objArr[2];
        ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
        if (arrayList == null || (obj = objArr[1]) == null) {
            return;
        }
        int iIntValue2 = ((Number) AbstractC5061.m10024(null, "chatType", obj)).intValue();
        Iterator it = arrayList.iterator();
        "iterator(...)";
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                try {
                    clsM11838 = AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.MsgElement");
                } catch (Throwable unused) {
                    clsM11838 = null;
                }
            } catch (Exception unused2) {
                num = num2;
            }
            if (clsM11838 == null) {
                try {
                    clsM11838 = AbstractC6318.m11838("com.tencent.qqnt.kernelpublic.nativeinterface.MsgElement");
                } catch (Throwable unused3) {
                    clsM11838 = null;
                }
                if (clsM11838 == null) {
                }
            }
            if (clsM11838.isInstance(next)) {
                next.getClass();
                Object objM10031 = AbstractC5061.m10031(next, "getPicElement", new Object[0]);
                if (objM10031 != null) {
                    if (iIntValue2 != 4) {
                        AbstractC5061.m10018(objM10031, "picSubType", 0);
                    }
                    int iIntValue3 = ((Number) AbstractC5061.m10024(null, "picWidth", objM10031)).intValue();
                    int iIntValue4 = ((Number) AbstractC5061.m10024(null, "picHeight", objM10031)).intValue();
                    if (iIntValue3 > 0 && iIntValue4 > 0) {
                        if (iIntValue == i) {
                            AbstractC5061.m10018(objM10031, "picWidth", num2);
                            AbstractC5061.m10018(objM10031, "picHeight", num2);
                        } else {
                            num = num2;
                            double d = ((double) iIntValue3) / ((double) iIntValue4);
                            if (iIntValue3 > iIntValue4) {
                                try {
                                    AbstractC5061.m10018(objM10031, "picWidth", Integer.valueOf(iIntValue));
                                    AbstractC5061.m10018(objM10031, "picHeight", Integer.valueOf((int) (((double) iIntValue) / d)));
                                } catch (Exception unused4) {
                                }
                            } else {
                                AbstractC5061.m10018(objM10031, "picWidth", Integer.valueOf((int) (((double) iIntValue) * d)));
                                AbstractC5061.m10018(objM10031, "picHeight", Integer.valueOf(iIntValue));
                            }
                            num2 = num;
                            i = 1;
                        }
                    }
                }
            }
        }
    }
}
