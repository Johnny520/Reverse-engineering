package top.suzhelan.qstory.hook.item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.C1245;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3055;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;
import p316.C8667;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5911 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16086;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16087;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16088;

    public /* synthetic */ CallableC5911(Object obj, XC_MethodHook.MethodHookParam methodHookParam, C5936 c5936) {
        this.f16088 = 1;
        this.f16087 = obj;
        this.f16086 = methodHookParam;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ClassNotFoundException {
        int iIntValue;
        int i = this.f16088;
        Object obj = this.f16087;
        Object obj2 = this.f16086;
        switch (i) {
            case 0:
                C5928 c5928 = (C5928) obj2;
                for (Object obj3 : (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj)) {
                    if (((Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(338), obj3)).intValue() == 9 && (iIntValue = ((Integer) XposedHelpers.callMethod(obj, AbstractC8405.m13972(511), new Object[0])).intValue()) != 1 && iIntValue != 100) {
                        c5928.m11316(obj, XposedHelpers.callMethod(obj3, AbstractC8405.m13972(1081), new Object[0]));
                    }
                }
                break;
            case 1:
                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj2;
                C5936.f16128 = obj;
                Object objectField = XposedHelpers.getObjectField(obj, AbstractC8405.m13972(593));
                String str = objectField instanceof String ? (String) objectField : null;
                if (str == null) {
                    str = "";
                }
                Object objCallMethod = XposedHelpers.callMethod(methodHookParam.thisObject, AbstractC8405.m13972(2013), new Object[0]);
                AbstractC8405.m13972(2014);
                objCallMethod.getClass();
                Context context = (Context) objCallMethod;
                try {
                    Intent intent = new Intent(context, (Class<?>) AbstractC6337.m11866(AbstractC8405.m13972(548)));
                    intent.putExtra(AbstractC8405.m13972(526), 2);
                    intent.putExtra(AbstractC8405.m13972(1993), false);
                    intent.putExtra(AbstractC8405.m13972(1994), str);
                    intent.putExtra(AbstractC8405.m13972(1995), -1);
                    intent.putExtra(AbstractC8405.m13972(1996), true);
                    intent.putExtra(AbstractC8405.m13972(1990), AbstractC8405.m13973("喵呜喵喵喵喵呜喵~喵呜喵喵喵呜喵喵~喵呜喵喵呜呜呜喵~喵呜喵呜呜呜喵呜~喵呜喵呜喵呜喵喵~喵呜喵呜呜喵喵喵"));
                    intent.putExtra(AbstractC8405.m13972(1997), AbstractC8405.m13972(1998));
                    intent.putExtra(AbstractC8405.m13972(1999), false);
                    intent.putExtra(AbstractC8405.m13972(2000), false);
                    intent.putExtra(AbstractC8405.m13972(2001), true);
                    intent.putExtra(AbstractC8405.m13972(2002), AbstractC8405.m13972(2003));
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                    XposedBridge.log(AbstractC8405.m13972(2004));
                } catch (Exception e) {
                    XposedBridge.log(AbstractC8405.m13972(2005) + e.getMessage());
                }
                break;
            default:
                Class<?> clsLoadClass = ((ClassLoader) obj2).loadClass(AbstractC8405.m13972(Opcodes.RSUB_INT));
                C6335 c6335M11854 = C6335.m11854(obj.getClass());
                c6335M11854.f17458.f3617 = clsLoadClass;
                Object objM11856 = c6335M11854.m11856(obj, new Object[0]);
                C6335 c6335M118542 = C6335.m11854(objM11856.getClass());
                String strM13972 = AbstractC8405.m13972(Opcodes.MUL_INT_LIT16);
                C1245 c1245 = c6335M118542.f17458;
                c1245.f3618 = strM13972;
                c1245.f3617 = String.class;
                C8667.m14384(AbstractC3055.m6653(), (String) c6335M118542.m11856(objM11856, new Object[0]));
                break;
        }
        return null;
        return null;
    }

    public /* synthetic */ CallableC5911(Object obj, int i, Object obj2) {
        this.f16088 = i;
        this.f16086 = obj;
        this.f16087 = obj2;
    }
}
