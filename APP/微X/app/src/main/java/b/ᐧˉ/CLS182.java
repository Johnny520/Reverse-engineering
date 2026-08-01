// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS69;
import b.יﹳ.CLS166;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS369.CLS367;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS182 {
    public static String MTH3469(long v, CLS1622 ˑٴ0, long v1) {
        ˑٴ0.MTH800(CLS27.MTH889(CLS370.MTH5289(v)));
        return CLS370.MTH5289(v1);
    }

    public static boolean MTH3470(long v) {
        return TextUtils.isEmpty(CLS27.MTH897(CLS370.MTH5289(v)));
    }

    public static void MTH3471(CLS369 ﾞᵎ0, CLS369 ﾞᵎ1, String s) {
        ﾞᵎ0.getClass();
        new CLS367(ﾞᵎ1).filter(s);
    }

    public static String MTH3472(long v, Cursor cursor0) {
        return cursor0.getString(cursor0.getColumnIndex(CLS370.MTH5289(v)));
    }

    public static String MTH3473(long v, CLS29 ˎᵢ0, String s) {
        return ˎᵢ0.MTH925(s, CLS27.MTH889(CLS370.MTH5289(v)));
    }

    public static int MTH3474(long v, ContentValues contentValues0) {
        return (int)contentValues0.getAsInteger(CLS370.MTH5289(v));
    }

    public static String MTH3475(long v, StringBuilder stringBuilder0) {
        stringBuilder0.append(CLS370.MTH5289(v));
        return stringBuilder0.toString();
    }

    public static String MTH3476(String s, String s1) [...] // Inlined contents

    public static void MTH3477(ArrayList arrayList0, ContentValues contentValues0, CLS359 ⁱˉ0, ArrayList arrayList1, ContentValues contentValues1) {
        arrayList0.add(contentValues0);
        ⁱˉ0.MTH5235(arrayList1);
        ⁱˉ0.MTH5231(contentValues1);
    }

    public static void MTH3478(long v, StringBuilder stringBuilder0, long v1, String s, ContentValues contentValues0, String s1) {
        stringBuilder0.append(CLS27.MTH889(CLS370.MTH5289(v)));
        stringBuilder0.append(CLS370.MTH5289(v1));
        stringBuilder0.append(s);
        contentValues0.put(s1, stringBuilder0.toString());
    }

    public static String MTH3479(int v, ContentValues contentValues0, String s, long v1) {
        contentValues0.put(s, v);
        return CLS370.MTH5289(v1);
    }

    public static boolean MTH3480(long v, StringBuilder stringBuilder0, CLS29 ˎᵢ0, boolean z) {
        stringBuilder0.append(CLS370.MTH5289(v));
        return ˎᵢ0.MTH938(stringBuilder0.toString(), z);
    }

    public static String MTH3481(String s, Object[] arr_object, StringBuilder stringBuilder0) {
        stringBuilder0.append(String.format(s, arr_object));
        return stringBuilder0.toString();
    }

    public static StringBuilder MTH3482(CLS1019 ˎʻ0, String s) {
        ˎʻ0.getClass();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        return stringBuilder0;
    }

    public static StringBuilder MTH3483(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        return stringBuilder0;
    }

    public static String MTH3484(long v, StringBuilder stringBuilder0, String s) {
        stringBuilder0.append(CLS370.MTH5289(v));
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static void MTH3485(String s, ArrayList arrayList0, CLS359 ⁱˉ0, int v, String s1) {
        CLS432.MTH6173(s1, ((CLS3)new CLS953(s, arrayList0, ⁱˉ0, v)));
    }

    public static CLS1622 MTH3486(CLS1623 יᐧ0, CLS1635 ﾞᵎ0, Activity activity0) {
        יᐧ0.MTH7296(ﾞᵎ0);
        return new CLS1622(activity0);
    }

    public static StringBuilder MTH3487(long v, CLS1635 ﾞᵎ0, String s) {
        ﾞᵎ0.MTH800(CLS27.MTH889(CLS370.MTH5289(v)));
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        return stringBuilder0;
    }

    public static void MTH3488(long v, CLS1635 ﾞᵎ0, long v1, CLS29 ˎᵢ0, boolean z, CLS997 ˋ0, int v2) {
        ﾞᵎ0.MTH800(CLS27.MTH889(CLS370.MTH5289(v)));
        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938(CLS370.MTH5289(v1), z));
        ﾞᵎ0.MTH7438(new CLS266(ˋ0, v2));
    }

    public static String MTH3489(long v, StringBuilder stringBuilder0, Object object0) {
        stringBuilder0.append(CLS370.MTH5289(v));
        stringBuilder0.append(object0);
        return stringBuilder0.toString();
    }

    public static int MTH3490(long v, Cursor cursor0) {
        return cursor0.getInt(cursor0.getColumnIndex(CLS370.MTH5289(v)));
    }

    public static StringBuilder MTH3491(CLS1105 ᐧˈ0, String s) {
        ᐧˈ0.getClass();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        return stringBuilder0;
    }

    public static Object MTH3492(long v, Object object0) {
        return CLS166.MTH3194(object0, CLS27.MTH897(CLS370.MTH5289(v)));
    }

    public static void MTH3493(long v, CLS1635 ﾞᵎ0, long v1, CLS29 ˎᵢ0, boolean z, CLS931 ʼﹳ0, int v2) {
        ﾞᵎ0.MTH800(CLS27.MTH889(CLS370.MTH5289(v)));
        ﾞᵎ0.MTH7437(ˎᵢ0.MTH938(CLS370.MTH5289(v1), z));
        ﾞᵎ0.MTH7438(new CLS187(ʼﹳ0, v2));
    }

    public static StringBuilder MTH3494(long v, JSONObject jSONObject0, boolean z, CLS29 ˎᵢ0, String s, String s1) {
        ˎᵢ0.MTH922(Boolean.valueOf(jSONObject0.optBoolean(CLS370.MTH5289(v), z)), s);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s1);
        return stringBuilder0;
    }

    public static String MTH3495(String s, int v, int v1, StringBuilder stringBuilder0, int v2, int v3) {
        stringBuilder0.append(s.substring(v, v1));
        stringBuilder0.append(s.substring(v2 + v3));
        return stringBuilder0.toString();
    }

    public static String MTH3496(long v, ContentValues contentValues0, String s, long v1) {
        contentValues0.put(CLS370.MTH5289(v), s);
        return CLS370.MTH5289(v1);
    }

    public static String MTH3497(int v, CLS69 ʾᵢ0, String s, long v1) {
        ʾᵢ0.MTH1560(s, v);
        return CLS27.MTH889(CLS370.MTH5289(v1));
    }

    public static void MTH3498(CLS1623 יᐧ0, Object[] arr_object, int v, LinearLayout linearLayout0, CLS1623 יᐧ1) {
        יᐧ0.MTH7289(arr_object);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), CLS523.MTH7137(v));
    }
}

