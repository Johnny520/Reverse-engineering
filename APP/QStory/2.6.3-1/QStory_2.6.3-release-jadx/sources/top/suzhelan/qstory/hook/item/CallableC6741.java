package top.suzhelan.qstory.hook.item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.C2080;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3887;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;
import p332.C9496;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC6741 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16431;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16432;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16433;

    public /* synthetic */ CallableC6741(Object obj, XC_MethodHook.MethodHookParam methodHookParam, C6766 c6766) {
        this.f16433 = 1;
        this.f16432 = obj;
        this.f16431 = methodHookParam;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ClassNotFoundException {
        int iIntValue;
        int i = this.f16433;
        Object obj = this.f16432;
        Object obj2 = this.f16431;
        switch (i) {
            case 0:
                C6758 c6758 = (C6758) obj2;
                for (Object obj3 : (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), obj)) {
                    if (((Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(338), obj3)).intValue() == 9 && (iIntValue = ((Integer) XposedHelpers.callMethod(obj, AbstractC9234.m14531(511), new Object[0])).intValue()) != 1 && iIntValue != 100) {
                        c6758.m11875(obj, XposedHelpers.callMethod(obj3, AbstractC9234.m14531(1081), new Object[0]));
                    }
                }
                break;
            case 1:
                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj2;
                C6766.f16473 = obj;
                Object objectField = XposedHelpers.getObjectField(obj, AbstractC9234.m14531(593));
                String str = objectField instanceof String ? (String) objectField : null;
                if (str == null) {
                    str = "";
                }
                Object objCallMethod = XposedHelpers.callMethod(methodHookParam.thisObject, AbstractC9234.m14531(2013), new Object[0]);
                AbstractC9234.m14531(2014);
                objCallMethod.getClass();
                Context context = (Context) objCallMethod;
                try {
                    Intent intent = new Intent(context, (Class<?>) AbstractC7166.m12425(AbstractC9234.m14531(548)));
                    intent.putExtra(AbstractC9234.m14531(526), 2);
                    intent.putExtra(AbstractC9234.m14531(1993), false);
                    intent.putExtra(AbstractC9234.m14531(1994), str);
                    intent.putExtra(AbstractC9234.m14531(1995), -1);
                    intent.putExtra(AbstractC9234.m14531(1996), true);
                    intent.putExtra(AbstractC9234.m14531(1990), AbstractC9234.m14532("喵呜喵喵喵喵呜喵~喵呜喵喵喵呜喵喵~喵呜喵喵呜呜呜喵~喵呜喵呜呜呜喵呜~喵呜喵呜喵呜喵喵~喵呜喵呜呜喵喵喵"));
                    intent.putExtra(AbstractC9234.m14531(1997), AbstractC9234.m14531(1998));
                    intent.putExtra(AbstractC9234.m14531(1999), false);
                    intent.putExtra(AbstractC9234.m14531(2000), false);
                    intent.putExtra(AbstractC9234.m14531(2001), true);
                    intent.putExtra(AbstractC9234.m14531(2002), AbstractC9234.m14531(2003));
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                    XposedBridge.log(AbstractC9234.m14531(2004));
                } catch (Exception e) {
                    XposedBridge.log(AbstractC9234.m14531(2005) + e.getMessage());
                }
                break;
            default:
                Class<?> clsLoadClass = ((ClassLoader) obj2).loadClass(AbstractC9234.m14531(Opcodes.RSUB_INT));
                C7164 c7164M12413 = C7164.m12413(obj.getClass());
                c7164M12413.f17803.f3962 = clsLoadClass;
                Object objM12415 = c7164M12413.m12415(obj, new Object[0]);
                C7164 c7164M124132 = C7164.m12413(objM12415.getClass());
                String strM14531 = AbstractC9234.m14531(Opcodes.MUL_INT_LIT16);
                C2080 c2080 = c7164M124132.f17803;
                c2080.f3963 = strM14531;
                c2080.f3962 = String.class;
                C9496.m14943(AbstractC3887.m7213(), (String) c7164M124132.m12415(objM12415, new Object[0]));
                break;
        }
        return null;
        return null;
    }

    public /* synthetic */ CallableC6741(Object obj, int i, Object obj2) {
        this.f16433 = i;
        this.f16431 = obj;
        this.f16432 = obj2;
    }
}
