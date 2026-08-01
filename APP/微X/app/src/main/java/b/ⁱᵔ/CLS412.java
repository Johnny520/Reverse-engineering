// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.CountDownTimer;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS26;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS33;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˑٴ.CLS680;
import b.ˑٴ.CLS683;
import b.ˑٴ.CLS838;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS1627;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS412 {
    public interface CLS411 {
        void MTH5992(int arg1);
    }

    public static final HashSet FLD4009;

    static {
        CLS412.FLD4009 = new HashSet();
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static String MTH5994(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return "";
        }
        try {
            return CLS33.MTH1055(CLS31.MTH970((CLS27.MTH898(CLS27.MTH882("lic")) + CLS27.MTH882("cert") + s).getBytes()), s1.substring(s1.indexOf("#*") + 2, s1.indexOf("*#")));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static void MTH5995(String s) {
        CLS29 ˎᵢ0 = CLS27.MTH895();
        if(ˎᵢ0 != null && !ˎᵢ0.MTH938("_debug", false)) {
            return;
        }
        if(s instanceof Throwable) {
            CLS27.MTH893(((Throwable)s));
            return;
        }
        CLS27.MTH906(("" + s));
    }

    // 此方法包含解密的字符串
    public static String MTH5996(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        CLS26 ˊˏ0 = CLS27.MTH905();
        String s1 = CLS33.MTH1055(CLS431.MTH6161((ˊˏ0.MTH876() + ˊˏ0.MTH874()).getBytes()), s);
        if(TextUtils.isEmpty(s1)) {
            String s2 = CLS27.MTH882("sigs");
            String s3 = CLS27.MTH882("keys");
            String[] arr_s = s2.split(";");
            String[] arr_s1 = s3.split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                s1 = CLS33.MTH1055((arr_s[v].trim() + arr_s1[v].trim()), s);
                if(!TextUtils.isEmpty(s1)) {
                    break;
                }
            }
        }
        return s1;
    }

    public static JSONArray MTH5997(ArrayList arrayList0) {
        JSONArray jSONArray0 = new JSONArray();
        try {
            for(Object object0: arrayList0) {
                jSONArray0.put(CLS412.MTH6010(((ContentValues)object0)));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONArray0;
    }

    public static void MTH5998(CLS3 ˆٴ0) {
        if(ˆٴ0 != null) {
            try {
                ˆٴ0.MTH774();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static String MTH5999(String s) {
        StringBuilder stringBuilder0 = CLS182.MTH3483(s);
        stringBuilder0.append("_");
        stringBuilder0.append(Long.toHexString(System.currentTimeMillis()));
        return stringBuilder0.toString();
    }

    public static void MTH6000(HandlerThread handlerThread0) {
        try {
            if(handlerThread0.isAlive()) {
                return;
            }
            if(handlerThread0.getState() == Thread.State.NEW) {
                handlerThread0.start();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH6001(HandlerThread handlerThread0) {
        if(handlerThread0 != null) {
            try {
                if(handlerThread0.isAlive()) {
                    if(Build.VERSION.SDK_INT >= 18) {
                        handlerThread0.quitSafely();
                        return;
                    }
                    handlerThread0.quit();
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 去混淆评级： 中等(57)
    // 此方法包含解密的字符串
    public static boolean MTH6002() {
        CLS408 ˈˈ0 = (CLS408)CLS40.FLD157.MTH1118(CLS408.class);
        if(!ˈˈ0.MTH5945().equals("xv")) {
            return (ˈˈ0.FLD3943.containsKey("apkType") ? ˈˈ0.FLD3943.getAsString("apkType") : "").equals("xv") ? true : (ˈˈ0.FLD3943.containsKey("custom_mark") ? ˈˈ0.FLD3943.getAsString("custom_mark") : "").equals("xv");
        }
        return true;
    }

    // 此方法包含解密的字符串
    public static void MTH6003(Activity activity0, String s, long v) {
        if(!TextUtils.isEmpty(s) && activity0 != null) {
            if(!CLS27.MTH895().MTH938("tip_always_use_toast", CLS412.MTH6002())) {
                if(Build.VERSION.SDK_INT < 16) {
                    goto label_6;
                }
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
                if(activityManager$RunningAppProcessInfo0.importance == 100 || activityManager$RunningAppProcessInfo0.importance == 200) {
                label_6:
                    CLS21 ʾᵢ0 = CLS21.FLD76;
                    View view0 = null;
                    if(!TextUtils.isEmpty(ʾᵢ0.MTH826("getCurrentTalker2", new Object[0]))) {
                        Object object0 = ʾᵢ0.MTH836("getChattingUIFragment", new Object[0]);
                        if(object0 != null) {
                            view0 = (View)CLS166.MTH3195(object0, "getContentView", new Object[0]);
                        }
                        if(view0 == null) {
                            CLS412.MTH6008(activity0, s, v);
                            return;
                        }
                    }
                    CLS683 ˈˋ0 = new CLS683(activity0, view0, s, v);
                    CLS40.FLD157.MTH1116(((CLS39)ˈˋ0));
                    return;
                }
            }
            CLS412.MTH6008(activity0, s, v);
        }
    }

    public static void MTH6004(String s) {
        CLS412.MTH6003(CLS404.MTH5891(), s, 1000L);
    }

    // 去混淆评级： 低(20)
    public static int MTH6005(int v, String s) {
        return CLS27.MTH895().MTH928(s) ? CLS27.MTH895().MTH927(v, s) : CLS27.MTH879(v, s);
    }

    public static ContentValues MTH6006(JSONObject jSONObject0) {
        ContentValues contentValues0 = new ContentValues();
        try {
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                contentValues0.put(((String)object0), String.valueOf(jSONObject0.get(((String)object0))));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return contentValues0;
    }

    public static int MTH6007(int v, int v1, int v2) {
        return Math.min(Math.max(v, v2), v1);
    }

    // 此方法包含解密的字符串
    public static void MTH6008(Context context0, String s, long v) {
        public final class CLS410 extends CountDownTimer {
            public final Toast FLD4008;

            public CLS410(long v, Toast toast0) {
                this.FLD4008 = toast0;
                super(v, 1000L);
            }

            @Override  // android.os.CountDownTimer
            public final void onFinish() {
                this.FLD4008.show();
            }

            @Override  // android.os.CountDownTimer
            public final void onTick(long v) {
                try {
                    this.FLD4008.show();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        if(!TextUtils.isEmpty(s) && context0 != null) {
            String s1 = "[" + CLS27.MTH889("appname") + "] " + s;
            CLS27.MTH906(s1);
            CLS680 ˈʾ0 = new CLS680(context0, s1, v, 2);
            CLS40.FLD157.MTH1116(((CLS39)ˈʾ0));
        }
    }

    // 此方法包含解密的字符串
    public static String MTH6009(Activity activity0) {
        if(activity0 == null) {
            return "";
        }
        try {
            return activity0.getClass().getName();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
    }

    public static JSONObject MTH6010(ContentValues contentValues0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            for(Object object0: contentValues0.keySet()) {
                jSONObject0.put(((String)object0), contentValues0.get(((String)object0)));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }

    public static void MTH6011(String s) {
        CLS412.MTH6014(CLS404.MTH5891(), s);
    }

    public static ArrayList MTH6012(JSONArray jSONArray0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; true; ++v) {
            try {
                if(v >= jSONArray0.length()) {
                    break;
                }
                arrayList0.add(CLS412.MTH6006(jSONArray0.getJSONObject(v)));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                break;
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public static void MTH6013(Context context0, String s) {
        if(!TextUtils.isEmpty(s) && context0 != null && !TextUtils.isEmpty(s)) {
            String s1 = "[" + CLS27.MTH889("appname") + "] " + s;
            CLS27.MTH906(s1);
            CLS838 ᵢـ0 = new CLS838(context0, s1, 1, 5);
            CLS40.FLD157.MTH1116(((CLS39)ᵢـ0));
        }
    }

    public static void MTH6014(Activity activity0, String s) {
        CLS412.MTH6003(activity0, s, 3000L);
    }

    public static int MTH6015(int v, int v1) {
        if(v < v1) {
            int v2 = v1;
            v1 = v;
            v = v2;
        }
        try {
            return new Random(System.currentTimeMillis()).nextInt(Math.abs(v - v1) + 1) + v1;
        }
        catch(Throwable unused_ex) {
            return 0;
        }
    }

    public static void MTH6016(long v, int v1, CLS411 ˉˏ$ᵔʾ0, CLS1627 ٴـ0) {
        new CLS417(v * ((long)v1), v, ˉˏ$ᵔʾ0, new int[]{0}, ٴـ0).start();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH6017(Context context0, String s) {
        ((ClipboardManager)context0.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", s));
    }
}

