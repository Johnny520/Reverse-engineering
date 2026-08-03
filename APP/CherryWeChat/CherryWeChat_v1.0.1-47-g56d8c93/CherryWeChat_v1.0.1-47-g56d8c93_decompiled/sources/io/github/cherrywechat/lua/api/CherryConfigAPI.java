package io.github.cherrywechat.lua.api;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import p000.AbstractC0295Gu;
import p000.C2402q8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryConfigAPI {
    private static final String TAG = AbstractC0295Gu.m625r(-553831737849909L);
    private static final String PREFS_NAME = AbstractC0295Gu.m625r(-552251189884981L);
    public static final CherryConfigAPI INSTANCE = new CherryConfigAPI();

    private CherryConfigAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-502051612129333L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            if (lua.getTop() > 1) {
                lua.pushValue(2);
            } else {
                lua.pushNil();
            }
            return 1;
        }
        SharedPreferences sharedPreferences = currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-502060202063925L), 0);
        if (sharedPreferences.contains(string)) {
            Object obj = sharedPreferences.getAll().get(string);
            if (obj instanceof String) {
                lua.push((String) obj);
            } else if (obj instanceof Integer) {
                lua.push(Double.valueOf(((Number) obj).intValue()));
            } else if (obj instanceof Long) {
                lua.push(Double.valueOf(((Number) obj).longValue()));
            } else if (obj instanceof Float) {
                lua.push(Double.valueOf(((Number) obj).floatValue()));
            } else if (obj instanceof Boolean) {
                lua.push(((Boolean) obj).booleanValue());
            } else {
                lua.pushNil();
            }
        } else if (lua.getTop() > 1) {
            lua.pushValue(2);
        } else {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$10(Lua lua) {
        AbstractC0295Gu.m625r(-553230442428469L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.toString(2);
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            lua.push(false);
            return 1;
        }
        currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-553239032363061L), 0).edit().putString(string, string2).apply();
        lua.push(true);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$12(Lua lua) {
        AbstractC0295Gu.m625r(-553316341774389L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        int number = (int) lua.toNumber(2);
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            lua.push(false);
            return 1;
        }
        currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-553324931708981L), 0).edit().putInt(string, number).apply();
        lua.push(true);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$14(Lua lua) {
        AbstractC0295Gu.m625r(-553951996934197L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        boolean z = lua.toBoolean(2);
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            lua.push(false);
            return 1;
        }
        currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-553960586868789L), 0).edit().putBoolean(string, z).apply();
        lua.push(true);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$16(Lua lua) {
        AbstractC0295Gu.m625r(-554037896280117L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            lua.push(false);
            return 1;
        }
        currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-554046486214709L), 0).edit().remove(string).apply();
        lua.push(true);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$18(Lua lua) {
        AbstractC0295Gu.m625r(-554123795626037L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            lua.push(false);
            return 1;
        }
        lua.push(currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-554132385560629L), 0).contains(string));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$2(Lua lua) {
        AbstractC0295Gu.m625r(-502137511475253L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.getTop() > 1 ? lua.toString(2) : null;
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext != null) {
            String string3 = currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-502146101409845L), 0).getString(string, string2);
            if (string3 != null) {
                lua.push(string3);
            } else {
                lua.pushNil();
            }
        } else if (string2 != null) {
            lua.push(string2);
        } else {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$20(Lua lua) {
        AbstractC0295Gu.m625r(-553659939158069L);
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            lua.push(false);
            return 1;
        }
        currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-553668529092661L), 0).edit().clear().apply();
        lua.push(true);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$22(Lua lua) {
        AbstractC0295Gu.m625r(-553745838503989L);
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            lua.createTable(0, 0);
            return 1;
        }
        Map<String, ?> all = currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-553754428438581L), 0).getAll();
        lua.createTable(0, all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                lua.push((String) value);
            } else if (value instanceof Integer) {
                lua.push(Double.valueOf(((Number) value).intValue()));
            } else if (value instanceof Long) {
                lua.push(Double.valueOf(((Number) value).longValue()));
            } else if (value instanceof Float) {
                lua.push(Double.valueOf(((Number) value).floatValue()));
            } else if (value instanceof Boolean) {
                lua.push(((Boolean) value).booleanValue());
            } else {
                lua.pushNil();
            }
            lua.setField(-2, key);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$3(Lua lua) {
        AbstractC0295Gu.m625r(-553350701512757L);
        if (lua.toString(1) == null) {
            return 0;
        }
        int number = (int) lua.toNumber(2);
        if (CherryGlobalAPI.INSTANCE.getCurrentContext() != null) {
            lua.push(Double.valueOf(r4.getSharedPreferences(AbstractC0295Gu.m625r(-553359291447349L), 0).getInt(r1, number)));
        } else {
            lua.push(Double.valueOf(number));
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$4(Lua lua) {
        AbstractC0295Gu.m625r(-553436600858677L);
        if (lua.toString(1) == null) {
            return 0;
        }
        long number = (long) lua.toNumber(2);
        if (CherryGlobalAPI.INSTANCE.getCurrentContext() != null) {
            lua.push(Double.valueOf(r5.getSharedPreferences(AbstractC0295Gu.m625r(-553445190793269L), 0).getLong(r1, number)));
        } else {
            lua.push(Double.valueOf(number));
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$5(Lua lua) {
        AbstractC0295Gu.m625r(-553522500204597L);
        if (lua.toString(1) == null) {
            return 0;
        }
        float number = (float) lua.toNumber(2);
        if (CherryGlobalAPI.INSTANCE.getCurrentContext() != null) {
            lua.push(Double.valueOf(r4.getSharedPreferences(AbstractC0295Gu.m625r(-553531090139189L), 0).getFloat(r1, number)));
        } else {
            lua.push(Double.valueOf(number));
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$6(Lua lua) {
        AbstractC0295Gu.m625r(-553058643736629L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        boolean z = lua.getTop() > 1 ? lua.toBoolean(2) : false;
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext != null) {
            lua.push(currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-553067233671221L), 0).getBoolean(string, z));
        } else {
            lua.push(z);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$8(Lua lua) {
        AbstractC0295Gu.m625r(-553144543082549L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            lua.push(false);
            return 1;
        }
        SharedPreferences.Editor editorEdit = currentContext.getSharedPreferences(AbstractC0295Gu.m625r(-553153133017141L), 0).edit();
        if (lua.isString(2)) {
            editorEdit.putString(string, lua.toString(2));
        } else if (lua.isNumber(2)) {
            double number = lua.toNumber(2);
            long j = (long) number;
            if (number == j) {
                editorEdit.putLong(string, j);
            } else {
                editorEdit.putFloat(string, (float) number);
            }
        } else if (lua.isBoolean(2)) {
            editorEdit.putBoolean(string, lua.toBoolean(2));
        } else {
            if (!lua.isNil(2)) {
                lua.push(false);
                return 1;
            }
            editorEdit.remove(string);
        }
        editorEdit.apply();
        lua.push(true);
        return 1;
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-501403072067637L);
        lua.createTable(0, 15);
        lua.push(new C2402q8(2));
        lua.setField(-2, AbstractC0295Gu.m625r(-501420251936821L));
        lua.push(new C2402q8(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-501437431806005L));
        lua.push(new C2402q8(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-501480381478965L));
        lua.push(new C2402q8(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-501510446250037L));
        lua.push(new C2402q8(14));
        lua.setField(-2, AbstractC0295Gu.m625r(-501544805988405L));
        lua.push(new C2402q8(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-501583460694069L));
        lua.push(new C2402q8(3));
        lua.setField(-2, AbstractC0295Gu.m625r(-501617820432437L));
        lua.push(new C2402q8(4));
        lua.setField(-2, AbstractC0295Gu.m625r(-501635000301621L));
        lua.push(new C2402q8(5));
        lua.setField(-2, AbstractC0295Gu.m625r(-502227705788469L));
        lua.push(new C2402q8(6));
        lua.setField(-2, AbstractC0295Gu.m625r(-502257770559541L));
        lua.push(new C2402q8(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-502292130297909L));
        lua.push(new C2402q8(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-502322195068981L));
        lua.push(new C2402q8(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-502360849774645L));
        lua.push(new C2402q8(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-502386619578421L));
        AbstractC0295Gu.m625r(-502416684349493L);
        AbstractC0295Gu.m625r(-501935648012341L);
    }
}
