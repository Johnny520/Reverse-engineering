package io.github.cherrywechat.lua.api;

import android.app.Activity;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import io.github.cherrywechat.application.MainApplication;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.AbstractC0085Bz;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0513Lx;
import p000.AbstractC0585Nj;
import p000.AbstractC0671Pj;
import p000.AbstractC1257cG;
import p000.AbstractC1450gG;
import p000.AbstractC2496sa;
import p000.AbstractC2564tz;
import p000.AbstractC2598uq;
import p000.C0208Et;
import p000.C0954W8;
import p000.C1207b9;
import p000.C1214bG;
import p000.C1456gf;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryWeChatAPI {
    private static final String TAG = AbstractC0295Gu.m625r(-313979289204789L);
    public static final CherryWeChatAPI INSTANCE = new CherryWeChatAPI();

    private CherryWeChatAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-304418692003893L);
        try {
            lua.push(C1456gf.m2791I());
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-304427281938485L);
            AbstractC0295Gu.m625r(-304496001415221L);
            lua.push(AbstractC0295Gu.m625r(-304556130957365L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-304560425924661L);
        try {
            lua.push(C1456gf.m2794L());
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-304019260045365L);
            AbstractC0295Gu.m625r(-304087979522101L);
            lua.push(AbstractC0295Gu.m625r(-304160993966133L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$10(Lua lua) {
        AbstractC0295Gu.m625r(-302941223254069L);
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
        AbstractC0295Gu.m625r(-302949813188661L);
        try {
            Context contextCurrentApplication = MainApplication.f5549a;
            if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
                contextCurrentApplication = AndroidAppHelper.currentApplication();
                AbstractC0295Gu.m625r(-836852902787125L);
            }
            String strM625r = contextCurrentApplication.getPackageManager().getPackageInfo(contextCurrentApplication.getPackageName(), 0).versionName;
            if (strM625r == null) {
                strM625r = AbstractC0295Gu.m625r(-302958403123253L);
            }
            lua.push(strM625r);
            return 1;
        } catch (Exception unused) {
            lua.push(AbstractC0295Gu.m625r(-302992762861621L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$12(Lua lua) {
        AbstractC0295Gu.m625r(-303027122599989L);
        try {
            Context contextCurrentApplication = MainApplication.f5549a;
            if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
                contextCurrentApplication = AndroidAppHelper.currentApplication();
                AbstractC0295Gu.m625r(-836852902787125L);
            }
            lua.push(Double.valueOf(contextCurrentApplication.getPackageManager().getPackageInfo(contextCurrentApplication.getPackageName(), 0).getLongVersionCode()));
            return 1;
        } catch (Exception unused) {
            lua.push(Double.valueOf(0.0d));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public static final int register$lambda$16(Lua lua) {
        AbstractC0295Gu.m625r(-303035712534581L);
        try {
            Cursor cursorM1357w = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-303044302469173L), null);
            if (cursorM1357w == null) {
                AbstractC0295Gu.m625r(-302129474435125L);
                AbstractC0295Gu.m625r(-302198193911861L);
                lua.createTable(0, 0);
                return 1;
            }
            ArrayList arrayList = new ArrayList();
            while (cursorM1357w.moveToNext()) {
                try {
                    String string = cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-301854596528181L)));
                    if (string == null) {
                        string = AbstractC0295Gu.m625r(-301893251233845L);
                    }
                    String string2 = cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-301897546201141L)));
                    if (string2 == null) {
                        string2 = AbstractC0295Gu.m625r(-301949085808693L);
                    }
                    arrayList.add(AbstractC2598uq.m5110L(new C0208Et(AbstractC0295Gu.m625r(-301953380775989L), cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-301974855612469L)))), new C0208Et(AbstractC0295Gu.m625r(-302030690187317L), Integer.valueOf(cursorM1357w.getInt(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-302082229794869L))))), new C0208Et(AbstractC0295Gu.m625r(-300484501960757L), string), new C0208Et(AbstractC0295Gu.m625r(-300505976797237L), string2)));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC0585Nj.m1138f(cursorM1357w, th);
                        throw th2;
                    }
                }
            }
            cursorM1357w.close();
            lua.createTable(arrayList.size(), 0);
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC2496sa.m4978c0();
                    throw null;
                }
                Map map = (Map) obj;
                lua.createTable(0, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        lua.push(Double.valueOf(((Number) value).intValue()));
                    } else if (value instanceof String) {
                        lua.push((String) value);
                    } else {
                        lua.pushNil();
                    }
                    lua.setField(-2, str);
                }
                lua.rawSetI(-2, i2);
                i = i2;
            }
            AbstractC0295Gu.m625r(-300557516404789L);
            AbstractC0295Gu.m625r(-300626235881525L);
            arrayList.size();
            AbstractC0295Gu.m625r(-300703545292853L);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-300188149217333L);
            AbstractC0295Gu.m625r(-300256868694069L);
            lua.createTable(0, 0);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$2(Lua lua) {
        AbstractC0295Gu.m625r(-304165288933429L);
        try {
            lua.push(C1456gf.m2793K());
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-304173878868021L);
            AbstractC0295Gu.m625r(-304242598344757L);
            lua.push(AbstractC0295Gu.m625r(-302670640314421L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$20(Lua lua) {
        AbstractC0295Gu.m625r(-300325588170805L);
        try {
            Cursor cursorM1357w = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-300334178105397L), null);
            ArrayList arrayList = new ArrayList();
            if (cursorM1357w != null) {
                while (cursorM1357w.moveToNext()) {
                    try {
                        C0208Et c0208Et = new C0208Et(AbstractC0295Gu.m625r(-299359220529205L), cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-299380695365685L))));
                        String strM625r = AbstractC0295Gu.m625r(-299419350071349L);
                        String string = cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-299458004777013L)));
                        if (string == null) {
                            string = AbstractC0295Gu.m625r(-299496659482677L);
                        }
                        C0208Et c0208Et2 = new C0208Et(strM625r, string);
                        String strM625r2 = AbstractC0295Gu.m625r(-299500954449973L);
                        String string2 = cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-299531019221045L)));
                        if (string2 == null) {
                            string2 = AbstractC0295Gu.m625r(-299573968894005L);
                        }
                        arrayList.add(AbstractC2598uq.m5110L(c0208Et, c0208Et2, new C0208Et(strM625r2, string2), new C0208Et(AbstractC0295Gu.m625r(-299578263861301L), Integer.valueOf(cursorM1357w.getInt(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-299599738697781L)))))));
                    } finally {
                    }
                }
                cursorM1357w.close();
            }
            lua.createTable(arrayList.size(), 0);
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC2496sa.m4978c0();
                    throw null;
                }
                Map map = (Map) obj;
                lua.createTable(0, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        lua.push(Double.valueOf(((Number) value).intValue()));
                    } else if (value instanceof String) {
                        lua.push((String) value);
                    } else {
                        lua.pushNil();
                    }
                    lua.setField(-2, str);
                }
                lua.rawSetI(-2, i2);
                i = i2;
            }
            AbstractC0295Gu.m625r(-299071457720373L);
            AbstractC0295Gu.m625r(-299140177197109L);
            arrayList.size();
            AbstractC0295Gu.m625r(-299226076543029L);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-299269026215989L);
            AbstractC0295Gu.m625r(-299337745692725L);
            lua.createTable(0, 0);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$23(Lua lua) {
        AbstractC0295Gu.m625r(-299964810917941L);
        String string = lua.toString(1);
        if (string == null || string.length() == 0) {
            lua.createTable(0, 0);
            return 1;
        }
        try {
            Cursor cursorM1357w = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-299973400852533L), new String[]{string});
            if (cursorM1357w == null || !cursorM1357w.moveToFirst()) {
                if (cursorM1357w != null) {
                    cursorM1357w.close();
                }
                AbstractC0295Gu.m625r(-315886254684213L);
                AbstractC0295Gu.m625r(-315954974160949L);
                AbstractC0295Gu.m625r(-316027988604981L);
                lua.createTable(0, 0);
                return 1;
            }
            String string2 = cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-299659868239925L)));
            if (string2 == null) {
                string2 = AbstractC0295Gu.m625r(-299707112880181L);
            }
            cursorM1357w.close();
            List listM5065Z = AbstractC2564tz.m5065Z(string2, new String[]{AbstractC0295Gu.m625r(-299711407847477L)}, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM5065Z) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            lua.createTable(arrayList.size(), 0);
            int i = 0;
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC2496sa.m4978c0();
                    throw null;
                }
                lua.push((String) obj2);
                lua.rawSetI(-2, i2);
                i = i2;
            }
            AbstractC0295Gu.m625r(-299719997782069L);
            AbstractC0295Gu.m625r(-299788717258805L);
            AbstractC0295Gu.m625r(-299861731702837L);
            arrayList.size();
            AbstractC0295Gu.m625r(-315847599978549L);
            return 1;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-315615671744565L);
            AbstractC0213Ey.m411i(-315684391221301L, -315757405665333L, e);
            lua.createTable(0, 0);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$24(Lua lua) {
        Double dValueOf = Double.valueOf(0.0d);
        AbstractC0295Gu.m625r(-315774585534517L);
        String string = lua.toString(1);
        if (string == null || string.length() == 0) {
            lua.push(dValueOf);
            return 1;
        }
        try {
            Cursor cursorM1357w = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-315783175469109L), new String[]{string});
            if (cursorM1357w == null || !cursorM1357w.moveToFirst()) {
                if (cursorM1357w != null) {
                    cursorM1357w.close();
                }
                AbstractC0295Gu.m625r(-316251326904373L);
                AbstractC0295Gu.m625r(-316320046381109L);
                AbstractC0295Gu.m625r(-314760973252661L);
                lua.push(dValueOf);
                return 1;
            }
            int i = cursorM1357w.getInt(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-316573449451573L)));
            cursorM1357w.close();
            lua.push(Double.valueOf(i));
            AbstractC0295Gu.m625r(-316624989059125L);
            AbstractC0295Gu.m625r(-316143952721973L);
            AbstractC0295Gu.m625r(-316234147035189L);
            return 1;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-314898412206133L);
            AbstractC0213Ey.m411i(-314967131682869L, -314507570182197L, e);
            lua.push(dValueOf);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$25(Lua lua) {
        AbstractC0295Gu.m625r(-314524750051381L);
        String string = lua.toString(1);
        if (string == null || string.length() == 0) {
            lua.push(AbstractC0295Gu.m625r(-314533339985973L));
            return 1;
        }
        try {
            Cursor cursorM1357w = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-314537634953269L), new String[]{string});
            if (cursorM1357w == null || !cursorM1357w.moveToFirst()) {
                if (cursorM1357w != null) {
                    cursorM1357w.close();
                }
                lua.push(AbstractC0295Gu.m625r(-315340793837621L));
                return 1;
            }
            String string2 = cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-315297844164661L)));
            if (string2 == null) {
                string2 = AbstractC0295Gu.m625r(-315336498870325L);
            }
            cursorM1357w.close();
            lua.push(string2);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-315345088804917L);
            AbstractC0295Gu.m625r(-315413808281653L);
            lua.push(AbstractC0295Gu.m625r(-315508297562165L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$26(Lua lua) {
        AbstractC0295Gu.m625r(-315512592529461L);
        String string = lua.toString(1);
        if (string == null || string.length() == 0) {
            lua.push(AbstractC0295Gu.m625r(-315521182464053L));
            return 1;
        }
        try {
            Cursor cursorM1357w = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-315525477431349L), new String[]{string});
            if (cursorM1357w == null || !cursorM1357w.moveToFirst()) {
                if (cursorM1357w != null) {
                    cursorM1357w.close();
                }
                lua.push(AbstractC0295Gu.m625r(-315237714622517L));
                return 1;
            }
            String string2 = cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-315190469982261L)));
            if (string2 == null) {
                string2 = AbstractC0295Gu.m625r(-315233419655221L);
            }
            cursorM1357w.close();
            lua.push(string2);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-315242009589813L);
            AbstractC0295Gu.m625r(-313661461624885L);
            lua.push(AbstractC0295Gu.m625r(-313747360970805L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$28(Lua lua) {
        AbstractC0295Gu.m625r(-313751655938101L);
        String string = lua.toString(1);
        if (string == null || string.length() == 0) {
            lua.push(AbstractC0295Gu.m625r(-313760245872693L));
            return 1;
        }
        try {
            Cursor cursorM1357w = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-313764540839989L), new String[]{string});
            if (cursorM1357w == null || !cursorM1357w.moveToFirst()) {
                if (cursorM1357w != null) {
                    cursorM1357w.close();
                }
                lua.push(AbstractC0295Gu.m625r(-313562677377077L));
                return 1;
            }
            String string2 = cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-313472483063861L)));
            if (string2 == null) {
                string2 = AbstractC0295Gu.m625r(-313515432736821L);
            }
            String string3 = cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-313519727704117L)));
            if (string3 == null) {
                string3 = AbstractC0295Gu.m625r(-313558382409781L);
            }
            cursorM1357w.close();
            if (string2.length() == 0) {
                string2 = string3;
            }
            lua.push(string2);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-313566972344373L);
            AbstractC0295Gu.m625r(-313635691821109L);
            lua.push(AbstractC0295Gu.m625r(-314292821817397L));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$29(Lua lua) {
        AbstractC0295Gu.m625r(-314297116784693L);
        String string = lua.getTop() >= 1 ? lua.toString(1) : null;
        if (string != null) {
            try {
                if (string.length() != 0) {
                    Drawable drawableM2785C = C1456gf.m2785C(string);
                    if (drawableM2785C != null) {
                        lua.push(drawableM2785C, Lua.Conversion.SEMI);
                        return 1;
                    }
                    lua.pushNil();
                    return 1;
                }
            } catch (Exception unused) {
                AbstractC0213Ey.m412j(-314305706719285L, -314374426196021L, lua);
                return 1;
            }
        }
        lua.push(C1456gf.m2790H(), Lua.Conversion.SEMI);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$30(Lua lua) {
        AbstractC0295Gu.m625r(-314443145672757L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-314451735607349L);
        }
        lua.push(AbstractC0085Bz.m132J(string, false, AbstractC0295Gu.m625r(-314456030574645L)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$31(Lua lua) {
        AbstractC0295Gu.m625r(-313949224433717L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-313957814368309L);
        }
        lua.push(string.startsWith(AbstractC0295Gu.m625r(-313962109335605L)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$6(Lua lua) {
        AbstractC0295Gu.m625r(-302674935281717L);
        try {
            C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-587212223674421L));
            Object obj = c1214bG != null ? c1214bG.f4146a : null;
            Object objInvoke = (obj instanceof Method ? (Method) obj : null).invoke(null, null);
            AbstractC0295Gu.m625r(-837707601279029L);
            Set setM997B = AbstractC0513Lx.m997B(AbstractC0295Gu.m625r(-302683525216309L), AbstractC0295Gu.m625r(-302713589987381L), AbstractC0295Gu.m625r(-302760834627637L), AbstractC0295Gu.m625r(-302790899398709L), AbstractC0295Gu.m625r(-302803784300597L), AbstractC0295Gu.m625r(-302829554104373L));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((HashMap) objInvoke).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    if (!setM997B.isEmpty()) {
                        Iterator it = setM997B.iterator();
                        while (it.hasNext()) {
                            if (((String) key).equalsIgnoreCase((String) it.next())) {
                                break;
                            }
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            lua.createTable(0, linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key2 = entry2.getKey();
                Object value = entry2.getValue();
                if ((key2 instanceof String) && value != null) {
                    lua.push(value.toString());
                    lua.setField(-2, (String) key2);
                }
            }
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-302872503777333L);
            AbstractC0295Gu.m625r(-302391467440181L);
            lua.createTable(0, 0);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$7(Lua lua) {
        AbstractC0295Gu.m625r(-302468776851509L);
        try {
            Object objCurrentApplication = MainApplication.f5549a;
            if (objCurrentApplication == null && (objCurrentApplication = C1456gf.f5172p) == null) {
                objCurrentApplication = AndroidAppHelper.currentApplication();
                AbstractC0295Gu.m625r(-836852902787125L);
            }
            lua.push(objCurrentApplication, Lua.Conversion.SEMI);
            return 1;
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-302477366786101L, -302546086262837L, lua);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$8(Lua lua) {
        AbstractC0295Gu.m625r(-302619100706869L);
        try {
            int i = AbstractC1450gG.f5067a;
            lua.push(AbstractC1450gG.f5069c, Lua.Conversion.SEMI);
            return 1;
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-302627690641461L, -303246165932085L, lua);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$9(Lua lua) {
        AbstractC0295Gu.m625r(-303336360245301L);
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
            AbstractC0213Ey.m412j(-303344950179893L, -303413669656629L, lua);
            return 1;
        }
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-304757994420277L);
        lua.createTable(0, 25);
        lua.push(new C0954W8(25));
        lua.setField(-2, AbstractC0295Gu.m625r(-304775174289461L));
        lua.push(new C0954W8(27));
        lua.setField(-2, AbstractC0295Gu.m625r(-304809534027829L));
        lua.push(new C0954W8(28));
        lua.setField(-2, AbstractC0295Gu.m625r(-305406534481973L));
        lua.push(new C0954W8(29));
        lua.setField(-2, AbstractC0295Gu.m625r(-305458074089525L));
        lua.push(new C1207b9(0));
        lua.setField(-2, AbstractC0295Gu.m625r(-305509613697077L));
        lua.push(new C1207b9(1));
        lua.setField(-2, AbstractC0295Gu.m625r(-305556858337333L));
        lua.push(new C1207b9(2));
        lua.setField(-2, AbstractC0295Gu.m625r(-305621282846773L));
        lua.push(new C1207b9(3));
        lua.setField(-2, AbstractC0295Gu.m625r(-305123066640437L));
        lua.push(new C1207b9(4));
        lua.setField(-2, AbstractC0295Gu.m625r(-305187491149877L));
        lua.push(new C1207b9(5));
        lua.setField(-2, AbstractC0295Gu.m625r(-305234735790133L));
        lua.push(new C1207b9(6));
        lua.setField(-2, AbstractC0295Gu.m625r(-305299160299573L));
        lua.push(new C1207b9(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-305342109972533L));
        lua.push(new C1207b9(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-303744382138421L));
        lua.push(new C1207b9(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-303813101615157L));
        lua.push(new C1207b9(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-303899000961077L));
        lua.push(new C1207b9(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-303967720437813L));
        lua.push(new C1207b9(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-303478094166069L));
        lua.push(new C1207b9(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-303559698544693L));
        lua.push(new C1207b9(14));
        lua.setField(-2, AbstractC0295Gu.m625r(-303602648217653L));
        lua.push(new C0954W8(26));
        lua.setField(-2, AbstractC0295Gu.m625r(-303637007956021L));
        AbstractC0295Gu.m625r(-303684252596277L);
        AbstractC0295Gu.m625r(-304302727886901L);
    }
}
