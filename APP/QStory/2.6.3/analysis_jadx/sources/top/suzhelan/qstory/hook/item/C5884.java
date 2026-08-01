package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3065;
import com.kongzue.dialogx.interfaces.InterfaceC3743;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import p010.AbstractC6185;
import p026.InterfaceC6312;
import p033.AbstractC6337;
import p287.AbstractC8405;
import p391.C9095;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5884 implements InterfaceC6312, InterfaceC3743 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C5887 f16062;

    public /* synthetic */ C5884(C5887 c5887) {
        this.f16062 = c5887;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3743
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo4485(CharSequence charSequence, Object obj, int i) {
        C5887 c5887 = this.f16062;
        c5887.f16065.m14677(Integer.valueOf(i), AbstractC8405.m13972(1884));
        if (i != 0) {
            c5887.f17425 = Boolean.TRUE;
        }
        AbstractC6185.m11592(AbstractC8405.m13972(1887) + ((Object) charSequence));
        return false;
    }

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Class clsM11866;
        C5887 c5887 = this.f16062;
        C9095 c9095 = c5887.f16065;
        String strM13972 = AbstractC8405.m13972(1884);
        c9095.getClass();
        int iIntValue = ((Number) AbstractC4344.m8802(c5887.f16064.values(), c9095.f25489.getInt(strM13972, 0))).intValue();
        if (iIntValue == 0) {
            return;
        }
        Object[] objArr = methodHookParam.args;
        Object obj2 = objArr[2];
        ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
        if (arrayList == null || (obj = objArr[1]) == null) {
            return;
        }
        int iIntValue2 = ((Number) AbstractC3065.m6825(null, AbstractC8405.m13972(125), obj)).intValue();
        Iterator it = arrayList.iterator();
        AbstractC8405.m13972(1253);
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                try {
                    clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(889));
                } catch (Throwable unused) {
                    clsM11866 = null;
                }
            } catch (Exception unused2) {
            }
            if (clsM11866 == null) {
                try {
                    clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1885));
                } catch (Throwable unused3) {
                    clsM11866 = null;
                }
                if (clsM11866 == null) {
                }
            }
            if (clsM11866.isInstance(next)) {
                next.getClass();
                Object objM6837 = AbstractC3065.m6837(next, AbstractC8405.m13972(140), new Object[0]);
                if (objM6837 != null) {
                    if (iIntValue2 != 4) {
                        AbstractC3065.m6805(objM6837, AbstractC8405.m13972(1886), 0);
                    }
                    int iIntValue3 = ((Number) AbstractC3065.m6825(null, AbstractC8405.m13972(1139), objM6837)).intValue();
                    int iIntValue4 = ((Number) AbstractC3065.m6825(null, AbstractC8405.m13972(1138), objM6837)).intValue();
                    if (iIntValue3 > 0 && iIntValue4 > 0) {
                        if (iIntValue == 1) {
                            AbstractC3065.m6805(objM6837, AbstractC8405.m13972(1139), 1);
                            AbstractC3065.m6805(objM6837, AbstractC8405.m13972(1138), 1);
                        } else {
                            double d = ((double) iIntValue3) / ((double) iIntValue4);
                            if (iIntValue3 > iIntValue4) {
                                AbstractC3065.m6805(objM6837, AbstractC8405.m13972(1139), Integer.valueOf(iIntValue));
                                AbstractC3065.m6805(objM6837, AbstractC8405.m13972(1138), Integer.valueOf((int) (((double) iIntValue) / d)));
                            } else {
                                AbstractC3065.m6805(objM6837, AbstractC8405.m13972(1139), Integer.valueOf((int) (((double) iIntValue) * d)));
                                AbstractC3065.m6805(objM6837, AbstractC8405.m13972(1138), Integer.valueOf(iIntValue));
                            }
                        }
                    }
                }
            }
        }
    }
}
