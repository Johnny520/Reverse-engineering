package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3897;
import com.kongzue.dialogx.interfaces.InterfaceC4575;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC5176;
import p026.AbstractC7014;
import p042.InterfaceC7141;
import p049.AbstractC7166;
import p303.AbstractC9234;
import p407.C9924;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6714 implements InterfaceC7141, InterfaceC4575 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6717 f16407;

    public /* synthetic */ C6714(C6717 c6717) {
        this.f16407 = c6717;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo5045(CharSequence charSequence, Object obj, int i) {
        C6717 c6717 = this.f16407;
        c6717.f16410.m15236(Integer.valueOf(i), AbstractC9234.m14531(1884));
        if (i != 0) {
            c6717.f17770 = Boolean.TRUE;
        }
        AbstractC7014.m12151(AbstractC9234.m14531(1887) + ((Object) charSequence));
        return false;
    }

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Class clsM12425;
        C6717 c6717 = this.f16407;
        C9924 c9924 = c6717.f16410;
        String strM14531 = AbstractC9234.m14531(1884);
        c9924.getClass();
        int iIntValue = ((Number) AbstractC5176.m9361(c6717.f16409.values(), c9924.f25834.getInt(strM14531, 0))).intValue();
        if (iIntValue == 0) {
            return;
        }
        Object[] objArr = methodHookParam.args;
        Object obj2 = objArr[2];
        ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
        if (arrayList == null || (obj = objArr[1]) == null) {
            return;
        }
        int iIntValue2 = ((Number) AbstractC3897.m7385(null, AbstractC9234.m14531(125), obj)).intValue();
        Iterator it = arrayList.iterator();
        AbstractC9234.m14531(1253);
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                try {
                    clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(889));
                } catch (Throwable unused) {
                    clsM12425 = null;
                }
            } catch (Exception unused2) {
            }
            if (clsM12425 == null) {
                try {
                    clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(1885));
                } catch (Throwable unused3) {
                    clsM12425 = null;
                }
                if (clsM12425 == null) {
                }
            }
            if (clsM12425.isInstance(next)) {
                next.getClass();
                Object objM7397 = AbstractC3897.m7397(next, AbstractC9234.m14531(140), new Object[0]);
                if (objM7397 != null) {
                    if (iIntValue2 != 4) {
                        AbstractC3897.m7365(objM7397, AbstractC9234.m14531(1886), 0);
                    }
                    int iIntValue3 = ((Number) AbstractC3897.m7385(null, AbstractC9234.m14531(1139), objM7397)).intValue();
                    int iIntValue4 = ((Number) AbstractC3897.m7385(null, AbstractC9234.m14531(1138), objM7397)).intValue();
                    if (iIntValue3 > 0 && iIntValue4 > 0) {
                        if (iIntValue == 1) {
                            AbstractC3897.m7365(objM7397, AbstractC9234.m14531(1139), 1);
                            AbstractC3897.m7365(objM7397, AbstractC9234.m14531(1138), 1);
                        } else {
                            double d = ((double) iIntValue3) / ((double) iIntValue4);
                            if (iIntValue3 > iIntValue4) {
                                AbstractC3897.m7365(objM7397, AbstractC9234.m14531(1139), Integer.valueOf(iIntValue));
                                AbstractC3897.m7365(objM7397, AbstractC9234.m14531(1138), Integer.valueOf((int) (((double) iIntValue) / d)));
                            } else {
                                AbstractC3897.m7365(objM7397, AbstractC9234.m14531(1139), Integer.valueOf((int) (((double) iIntValue) * d)));
                                AbstractC3897.m7365(objM7397, AbstractC9234.m14531(1138), Integer.valueOf(iIntValue));
                            }
                        }
                    }
                }
            }
        }
    }
}
