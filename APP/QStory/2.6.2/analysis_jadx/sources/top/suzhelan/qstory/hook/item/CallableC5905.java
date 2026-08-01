package top.suzhelan.qstory.hook.item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p175.AbstractC7738;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5905 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16077;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16079;

    public /* synthetic */ CallableC5905(Object obj, XC_MethodHook.MethodHookParam methodHookParam, C5931 c5931) {
        this.f16079 = 1;
        this.f16078 = obj;
        this.f16077 = methodHookParam;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ClassNotFoundException {
        int iIntValue;
        int i = this.f16079;
        Object obj = this.f16078;
        Object obj2 = this.f16077;
        switch (i) {
            case 0:
                C5922 c5922 = (C5922) obj2;
                for (Object obj3 : (ArrayList) AbstractC6317.m11831(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), obj)) {
                    if (((Integer) AbstractC6317.m11831(Integer.TYPE, AbstractC3056.m6668(-3937563452269397415L), obj3)).intValue() == 9 && (iIntValue = ((Integer) XposedHelpers.callMethod(obj, AbstractC3056.m6668(-3937609185081165223L), new Object[0])).intValue()) != 1 && iIntValue != 100) {
                        c5922.m11256(obj, XposedHelpers.callMethod(obj3, AbstractC3056.m6668(-3937661038221329831L), new Object[0]));
                    }
                }
                break;
            case 1:
                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj2;
                C5931.f16124 = obj;
                Object objectField = XposedHelpers.getObjectField(obj, AbstractC3056.m6668(-3937618775743137191L));
                String strM6668 = objectField instanceof String ? (String) objectField : null;
                if (strM6668 == null) {
                    strM6668 = AbstractC3056.m6668(-3937561979095614887L);
                }
                Object objCallMethod = XposedHelpers.callMethod(methodHookParam.thisObject, AbstractC3056.m6668(-3937771285736850855L), new Object[0]);
                AbstractC3056.m6668(-3937771165477766567L);
                objCallMethod.getClass();
                Context context = (Context) objCallMethod;
                try {
                    Intent intent = new Intent(context, (Class<?>) AbstractC6318.m11838(AbstractC3056.m6668(-3937622632623768999L)));
                    intent.putExtra(AbstractC3056.m6668(-3937607836461434279L), 2);
                    intent.putExtra(AbstractC3056.m6668(-3937772771795535271L), false);
                    intent.putExtra(AbstractC3056.m6668(-3937772634356581799L), strM6668);
                    intent.putExtra(AbstractC3056.m6668(-3937772587111941543L), -1);
                    intent.putExtra(AbstractC3056.m6668(-3937772471147824551L), true);
                    intent.putExtra(AbstractC3056.m6668(-3937772896349586855L), AbstractC3056.m6668(-3937772913529456039L));
                    intent.putExtra(AbstractC3056.m6668(-3937772445378020775L), AbstractC3056.m6668(-3937772325118936487L));
                    intent.putExtra(AbstractC3056.m6668(-3937772277874296231L), false);
                    intent.putExtra(AbstractC3056.m6668(-3937772200564884903L), false);
                    intent.putExtra(AbstractC3056.m6668(-3937772247809525159L), true);
                    intent.putExtra(AbstractC3056.m6668(-3937772157615211943L), AbstractC3056.m6668(-3937772088895735207L));
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                    XposedBridge.log(AbstractC3056.m6668(-3937772007291356583L));
                } catch (Exception e) {
                    XposedBridge.log(AbstractC3056.m6668(-3937771960046716327L) + e.getMessage());
                }
                break;
            default:
                Class<?> clsLoadClass = ((ClassLoader) obj2).loadClass(AbstractC3056.m6668(-3937571913354970535L));
                C6316 c6316M11826 = C6316.m11826(obj.getClass());
                c6316M11826.f17409.f3616 = clsLoadClass;
                Object objM11828 = c6316M11826.m11828(obj, new Object[0]);
                C6316 c6316M118262 = C6316.m11826(objM11828.getClass());
                String strM66682 = AbstractC3056.m6668(-3937571617002227111L);
                C1245 c1245 = c6316M118262.f17409;
                c1245.f3617 = strM66682;
                c1245.f3616 = String.class;
                AbstractC3065.m6835(AbstractC7738.m13031(), (String) c6316M118262.m11828(objM11828, new Object[0]));
                break;
        }
        return null;
        return null;
    }

    public /* synthetic */ CallableC5905(Object obj, int i, Object obj2) {
        this.f16079 = i;
        this.f16077 = obj;
        this.f16078 = obj2;
    }
}
