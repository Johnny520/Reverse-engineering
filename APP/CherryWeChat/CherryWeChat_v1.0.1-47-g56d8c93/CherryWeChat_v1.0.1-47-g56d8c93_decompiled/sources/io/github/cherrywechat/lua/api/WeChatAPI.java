package io.github.cherrywechat.lua.api;

import android.app.Activity;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.github.cherrywechat.application.MainApplication;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC1257cG;
import p000.AbstractC1450gG;
import p000.C0465Ks;
import p000.C1214bG;
import p000.C1456gf;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class WeChatAPI {
    private static final String TAG = AbstractC0295Gu.m625r(-335144888039477L);
    public static final WeChatAPI INSTANCE = new WeChatAPI();

    private WeChatAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-338606631680053L);
        try {
            lua.push(C1456gf.m2791I());
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-338615221614645L);
            AbstractC0295Gu.m625r(-338108415473717L);
            lua.push(AbstractC0295Gu.m625r(-338168545015861L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-338172839983157L);
        try {
            lua.push(C1456gf.m2794L());
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-338181429917749L);
            AbstractC0295Gu.m625r(-338224379590709L);
            lua.push(AbstractC0295Gu.m625r(-338297394034741L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$10(Lua lua) {
        AbstractC0295Gu.m625r(-337541479790645L);
        try {
            Context contextCurrentApplication = MainApplication.f5549a;
            if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
                contextCurrentApplication = AndroidAppHelper.currentApplication();
                AbstractC0295Gu.m625r(-836852902787125L);
            }
            String str = contextCurrentApplication.getApplicationInfo().packageName;
            AbstractC0295Gu.m625r(-837656061671477L);
            lua.push(str);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-337550069725237L);
            AbstractC0295Gu.m625r(-337043263584309L);
            ApplicationInfo applicationInfo = AbstractC1450gG.f5072f;
            if (applicationInfo == null) {
                AbstractC0295Gu.m625r(-579206404634677L);
                applicationInfo = null;
            }
            lua.push(applicationInfo.packageName);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$11(Lua lua) {
        AbstractC0295Gu.m625r(-337133457897525L);
        try {
            Context contextCurrentApplication = MainApplication.f5549a;
            if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
                contextCurrentApplication = AndroidAppHelper.currentApplication();
                AbstractC0295Gu.m625r(-836852902787125L);
            }
            String strM625r = contextCurrentApplication.getPackageManager().getPackageInfo(contextCurrentApplication.getPackageName(), 0).versionName;
            if (strM625r == null) {
                strM625r = AbstractC0295Gu.m625r(-337142047832117L);
            }
            lua.push(strM625r);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-337176407570485L);
            AbstractC0295Gu.m625r(-337219357243445L);
            lua.push(AbstractC0295Gu.m625r(-335643104245813L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$12(Lua lua) {
        AbstractC0295Gu.m625r(-335677463984181L);
        AbstractC0295Gu.m625r(-335686053918773L);
        AbstractC0295Gu.m625r(-335729003591733L);
        lua.createTable(0, 0);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$13(Lua lua) {
        AbstractC0295Gu.m625r(-335892212348981L);
        AbstractC0295Gu.m625r(-335900802283573L);
        AbstractC0295Gu.m625r(-335393996142645L);
        lua.createTable(0, 0);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$14(Lua lua) {
        AbstractC0295Gu.m625r(-335565794834485L);
        lua.toString(1);
        AbstractC0295Gu.m625r(-335574384769077L);
        AbstractC0295Gu.m625r(-335617334442037L);
        AbstractC0295Gu.m625r(-336240104699957L);
        lua.createTable(0, 0);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$15(Lua lua) {
        AbstractC0295Gu.m625r(-336368953718837L);
        lua.toString(1);
        AbstractC0295Gu.m625r(-336377543653429L);
        AbstractC0295Gu.m625r(-336420493326389L);
        AbstractC0295Gu.m625r(-335960931825717L);
        lua.push(Double.valueOf(0.0d));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$16(Lua lua) {
        AbstractC0295Gu.m625r(-336089780844597L);
        if (lua.getTop() >= 1) {
            lua.toString(1);
        }
        AbstractC0295Gu.m625r(-336098370779189L);
        AbstractC0295Gu.m625r(-336141320452149L);
        AbstractC0295Gu.m625r(-334539297650741L);
        lua.push(AbstractC0295Gu.m625r(-334668146669621L));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$17(Lua lua) {
        AbstractC0295Gu.m625r(-334672441636917L);
        lua.toString(1);
        AbstractC0295Gu.m625r(-334681031571509L);
        AbstractC0295Gu.m625r(-334723981244469L);
        AbstractC0295Gu.m625r(-334779815819317L);
        lua.push(AbstractC0295Gu.m625r(-334358909024309L));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$18(Lua lua) {
        AbstractC0295Gu.m625r(-334363203991605L);
        lua.toString(1);
        AbstractC0295Gu.m625r(-334371793926197L);
        AbstractC0295Gu.m625r(-334414743599157L);
        AbstractC0295Gu.m625r(-334461988239413L);
        lua.push(AbstractC0295Gu.m625r(-335140593072181L));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$2(Lua lua) {
        AbstractC0295Gu.m625r(-338301689002037L);
        try {
            lua.push(C1456gf.m2793K());
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-338310278936629L);
            AbstractC0295Gu.m625r(-338353228609589L);
            lua.push(AbstractC0295Gu.m625r(-336764090710069L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$3(Lua lua) {
        AbstractC0295Gu.m625r(-336768385677365L);
        try {
            lua.push(C1456gf.m2792J());
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-336776975611957L);
            AbstractC0295Gu.m625r(-336819925284917L);
            lua.push(AbstractC0295Gu.m625r(-336888644761653L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$4(Lua lua) {
        AbstractC0295Gu.m625r(-336892939728949L);
        try {
            lua.push(C1456gf.m2789G());
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-336901529663541L);
            AbstractC0295Gu.m625r(-336944479336501L);
            lua.push(AbstractC0295Gu.m625r(-336463442999349L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$6(Lua lua) {
        AbstractC0295Gu.m625r(-336467737966645L);
        try {
            C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-587212223674421L));
            Object obj = c1214bG != null ? c1214bG.f4146a : null;
            Object objInvoke = (obj instanceof Method ? (Method) obj : null).invoke(null, null);
            AbstractC0295Gu.m625r(-837707601279029L);
            HashMap map = (HashMap) objInvoke;
            lua.createTable(0, map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && value != null) {
                    lua.push(value.toString());
                    lua.setField(-2, (String) key);
                }
            }
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-336476327901237L);
            AbstractC0295Gu.m625r(-336519277574197L);
            lua.createTable(0, 0);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$7(Lua lua) {
        AbstractC0295Gu.m625r(-336596586985525L);
        try {
            Object objCurrentApplication = MainApplication.f5549a;
            if (objCurrentApplication == null && (objCurrentApplication = C1456gf.f5172p) == null) {
                objCurrentApplication = AndroidAppHelper.currentApplication();
                AbstractC0295Gu.m625r(-836852902787125L);
            }
            lua.push(objCurrentApplication, Lua.Conversion.SEMI);
            return 1;
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-336605176920117L, -336648126593077L, lua);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$8(Lua lua) {
        AbstractC0295Gu.m625r(-336721141037109L);
        try {
            int i = AbstractC1450gG.f5067a;
            lua.push(AbstractC1450gG.f5069c, Lua.Conversion.SEMI);
            return 1;
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-337279486785589L, -337322436458549L, lua);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$9(Lua lua) {
        AbstractC0295Gu.m625r(-337412630771765L);
        try {
            WeakReference weakReference = C1456gf.f5173q;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null) {
                lua.push(activity, Lua.Conversion.SEMI);
                return 1;
            }
            lua.pushNil();
            return 1;
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-337421220706357L, -337464170379317L, lua);
            return 1;
        }
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-339710438275125L);
        lua.createTable(0, 20);
        lua.push(new C0465Ks(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-339727618144309L));
        lua.push(new C0465Ks(24));
        lua.setField(-2, AbstractC0295Gu.m625r(-339212222068789L));
        lua.push(new C0465Ks(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-339259466709045L));
        lua.push(new C0465Ks(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-339293826447413L));
        lua.push(new C0465Ks(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-339336776120373L));
        lua.push(new C0465Ks(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-339379725793333L));
        lua.push(new C0465Ks(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-339431265400885L));
        lua.push(new C0465Ks(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-337829242599477L));
        lua.push(new C0465Ks(14));
        lua.setField(-2, AbstractC0295Gu.m625r(-337893667108917L));
        lua.push(new C0465Ks(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-337945206716469L));
        lua.push(new C0465Ks(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-338009631225909L));
        lua.push(new C0465Ks(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-338056875866165L));
        lua.push(new C0465Ks(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-338099825539125L));
        lua.push(new C0465Ks(19));
        lua.setField(-2, AbstractC0295Gu.m625r(-337601609332789L));
        lua.push(new C0465Ks(20));
        lua.setField(-2, AbstractC0295Gu.m625r(-337670328809525L));
        lua.push(new C0465Ks(21));
        lua.setField(-2, AbstractC0295Gu.m625r(-337756228155445L));
        lua.push(new C0465Ks(22));
        lua.setField(-2, AbstractC0295Gu.m625r(-337799177828405L));
        lua.push(new C0465Ks(23));
        lua.setField(-2, AbstractC0295Gu.m625r(-338400473249845L));
        lua.setGlobal(AbstractC0295Gu.m625r(-338443422922805L));
        AbstractC0295Gu.m625r(-338473487693877L);
        AbstractC0295Gu.m625r(-338516437366837L);
    }
}
