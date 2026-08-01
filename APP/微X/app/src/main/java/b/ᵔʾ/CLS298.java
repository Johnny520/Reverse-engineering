// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS22;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS298 {
    public static final class CLS1236 implements CLS296 {
        public int FLD3057;
        public String FLD3058;
        public long FLD3059;

        public CLS1236(int v) {
            this.FLD3057 = v;
            this.FLD3058 = Long.toHexString(System.currentTimeMillis()) + this.FLD3057;
        }

        // 此方法包含解密的字符串
        public CLS1236(JSONObject jSONObject0) {
            try {
                this.FLD3058 = jSONObject0.getString("id");
                this.FLD3057 = jSONObject0.getInt("localId");
                this.FLD3059 = jSONObject0.getLong("schedule");
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final void MTH4800(CLS298 יʼ0) {
            long v = CLS396.FLD3775.MTH5754(((long)this.FLD3057));
            if(v == 0L) {
                return;
            }
            CLS66.MTH1459(v);
            if(CLS404.MTH5901()) {
                return;
            }
            CLS66.MTH1373();
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final void MTH4801(long v) {
            this.FLD3059 = v;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final String MTH4802() {
            return this.FLD3058;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final boolean MTH4803() {
            return false;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final void MTH4804(long v) {
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final long MTH4805() {
            return this.FLD3059;
        }

        // 此方法包含解密的字符串
        @Override  // b.ᵔʾ.CLS298$CLS296
        public final JSONObject MTH4806() {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("id", this.FLD3058);
                jSONObject0.put("localId", this.FLD3057);
                jSONObject0.put("schedule", this.FLD3059);
                jSONObject0.put("type", 1);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return jSONObject0;
        }
    }

    public interface CLS296 {
        void MTH4800(CLS298 arg1);

        void MTH4801(long arg1);

        String MTH4802();

        boolean MTH4803();

        void MTH4804(long arg1);

        long MTH4805();

        JSONObject MTH4806();
    }

    public static final class CLS1237 implements CLS296 {
        public long FLD3060;
        public long FLD3061;
        public String FLD3062;
        public String FLD3063;
        public long FLD3064;
        public long FLD3065;
        public ArrayList FLD3066;
        public int FLD3067;
        public ArrayList FLD3068;
        public long FLD3069;
        public int FLD3070;

        public CLS1237(long v, String s) {
            this.FLD3067 = 0;
            this.FLD3070 = 0;
            this.FLD3062 = Long.toHexString(System.currentTimeMillis());
            this.FLD3066 = new ArrayList();
            this.FLD3068 = new ArrayList();
            this.FLD3063 = s;
            this.FLD3060 = v;
        }

        // 此方法包含解密的字符串
        public CLS1237(JSONObject jSONObject0) {
            this.FLD3067 = 0;
            this.FLD3070 = 0;
            this.FLD3066 = new ArrayList();
            this.FLD3068 = new ArrayList();
            try {
                this.FLD3062 = jSONObject0.getString("id");
                this.FLD3060 = jSONObject0.getLong("localId");
                this.FLD3061 = jSONObject0.getLong("schedule");
                this.FLD3070 = jSONObject0.getInt("repeat");
                this.FLD3065 = jSONObject0.getLong("repeatDelay");
                this.FLD3069 = jSONObject0.getLong("deleteDelay");
                this.FLD3067 = jSONObject0.getInt("shareType");
                this.FLD3063 = jSONObject0.getString("content");
                this.FLD3064 = jSONObject0.optLong("executeTime");
                if(jSONObject0.has("mention")) {
                    this.FLD3066 = new ArrayList(Arrays.asList(jSONObject0.getString("mention").split(",")));
                }
                if(jSONObject0.has("users")) {
                    this.FLD3068 = new ArrayList(Arrays.asList(jSONObject0.getString("users").split(",")));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final void MTH4800(CLS298 יʼ0) {
            long v = this.FLD3060;
            String s = CLS466.MTH6541(this.FLD3063);
            int v1 = this.FLD3067;
            ArrayList arrayList0 = this.FLD3066;
            ArrayList arrayList1 = this.FLD3068;
            CLS1228 ʾˈ0 = new CLS1228(this, יʼ0, this);
            ContentValues contentValues0 = CLS66.MTH1430(v);
            CLS280.FLD2910.MTH4659(contentValues0, v, s, v1, arrayList0, arrayList1, ʾˈ0);
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final void MTH4801(long v) {
            this.FLD3061 = v;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final String MTH4802() {
            return this.FLD3062;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final boolean MTH4803() {
            return this.FLD3070 != 0;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final void MTH4804(long v) {
            this.FLD3064 = v;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final long MTH4805() {
            return this.FLD3061;
        }

        // 此方法包含解密的字符串
        @Override  // b.ᵔʾ.CLS298$CLS296
        public final JSONObject MTH4806() {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("id", this.FLD3062);
                jSONObject0.put("localId", this.FLD3060);
                jSONObject0.put("schedule", this.FLD3061);
                jSONObject0.put("repeat", this.FLD3070);
                jSONObject0.put("repeatDelay", this.FLD3065);
                jSONObject0.put("deleteDelay", this.FLD3069);
                jSONObject0.put("shareType", this.FLD3067);
                if(this.FLD3066 != null && !this.FLD3066.isEmpty()) {
                    jSONObject0.put("mention", TextUtils.join(",", this.FLD3066));
                }
                if(this.FLD3068 != null && !this.FLD3068.isEmpty()) {
                    jSONObject0.put("users", TextUtils.join(",", this.FLD3068));
                }
                jSONObject0.put("content", this.FLD3063);
                jSONObject0.put("type", 2);
                jSONObject0.put("executeTime", this.FLD3064);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return jSONObject0;
        }
    }

    public static final class CLS1238 implements CLS296 {
        public long FLD3072;
        public int FLD3073;
        public long FLD3074;
        public String FLD3075;
        public String FLD3076;
        public ArrayList FLD3077;
        public ArrayList FLD3078;
        public long FLD3079;
        public String FLD3080;
        public int FLD3081;
        public long FLD3082;
        public ArrayList FLD3083;

        public CLS1238(String s, String s1, ArrayList arrayList0) {
            this.FLD3081 = 0;
            this.FLD3073 = 0;
            this.FLD3076 = Long.toHexString(System.currentTimeMillis());
            this.FLD3077 = new ArrayList();
            this.FLD3083 = new ArrayList();
            new ArrayList();
            this.FLD3075 = s;
            this.FLD3078 = arrayList0;
            this.FLD3080 = s1;
        }

        // 此方法包含解密的字符串
        public CLS1238(JSONObject jSONObject0) {
            this.FLD3081 = 0;
            this.FLD3073 = 0;
            this.FLD3077 = new ArrayList();
            this.FLD3083 = new ArrayList();
            this.FLD3078 = new ArrayList();
            try {
                this.FLD3076 = jSONObject0.getString("id");
                this.FLD3072 = jSONObject0.getLong("schedule");
                this.FLD3073 = jSONObject0.getInt("repeat");
                this.FLD3082 = jSONObject0.getLong("repeatDelay");
                this.FLD3074 = jSONObject0.getLong("deleteDelay");
                this.FLD3081 = jSONObject0.getInt("shareType");
                this.FLD3075 = jSONObject0.getString("content");
                this.FLD3080 = jSONObject0.getString("vid");
                if(jSONObject0.has("mention")) {
                    this.FLD3077 = new ArrayList(Arrays.asList(jSONObject0.getString("mention").split(",")));
                }
                if(jSONObject0.has("users")) {
                    this.FLD3083 = new ArrayList(Arrays.asList(jSONObject0.getString("users").split(",")));
                }
                if(jSONObject0.has("img")) {
                    this.FLD3078 = new ArrayList(Arrays.asList(jSONObject0.getString("img").split(",")));
                }
                this.FLD3079 = jSONObject0.optLong("executeTime");
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }

        // 此方法包含解密的字符串
        @Override  // b.ᵔʾ.CLS298$CLS296
        public final void MTH4800(CLS298 יʼ0) {
            int v;
            String s = CLS466.MTH6541(this.FLD3075);
            if(!TextUtils.isEmpty(this.FLD3080)) {
                if(!CLS31.MTH1024(this.FLD3080)) {
                    return;
                }
                File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_vid_thumb.jpg");
                CLS518.MTH7053(file0, this.FLD3080);
                v = CLS66.MTH1478(this.FLD3081, s, this.FLD3080, file0.getAbsolutePath(), this.FLD3077, this.FLD3083);
            }
            else if(this.FLD3078 == null || this.FLD3078.isEmpty()) {
                v = TextUtils.isEmpty(s) ? -1 : CLS66.MTH1418(s, this.FLD3081, this.FLD3077, this.FLD3083);
            }
            else {
                v = CLS66.MTH1366(s, this.FLD3081, this.FLD3078, this.FLD3077, this.FLD3083);
            }
            if(v == -1) {
                return;
            }
            long v1 = System.currentTimeMillis();
            CLS1236 יʼ$ʻˑ0 = new CLS1236(v);
            יʼ$ʻˑ0.FLD3059 = this.FLD3074 + v1;
            יʼ0.MTH4850(((CLS296)יʼ$ʻˑ0));
            --this.FLD3073;
            if(this.MTH4803()) {
                this.FLD3072 = v1 + this.FLD3082;
                יʼ0.MTH4851(((CLS296)this));
            }
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final void MTH4801(long v) {
            this.FLD3072 = v;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final String MTH4802() {
            return this.FLD3076;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final boolean MTH4803() {
            return this.FLD3073 != 0;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final void MTH4804(long v) {
            this.FLD3079 = v;
        }

        @Override  // b.ᵔʾ.CLS298$CLS296
        public final long MTH4805() {
            return this.FLD3072;
        }

        // 此方法包含解密的字符串
        @Override  // b.ᵔʾ.CLS298$CLS296
        public final JSONObject MTH4806() {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("id", this.FLD3076);
                jSONObject0.put("schedule", this.FLD3072);
                jSONObject0.put("repeat", this.FLD3073);
                jSONObject0.put("repeatDelay", this.FLD3082);
                jSONObject0.put("deleteDelay", this.FLD3074);
                jSONObject0.put("shareType", this.FLD3081);
                if(this.FLD3077 != null && !this.FLD3077.isEmpty()) {
                    jSONObject0.put("mention", TextUtils.join(",", this.FLD3077));
                }
                if(this.FLD3083 != null && !this.FLD3083.isEmpty()) {
                    jSONObject0.put("users", TextUtils.join(",", this.FLD3083));
                }
                if(this.FLD3078 != null && !this.FLD3078.isEmpty()) {
                    jSONObject0.put("img", TextUtils.join(",", this.FLD3078));
                }
                jSONObject0.put("content", this.FLD3075);
                jSONObject0.put("vid", this.FLD3080);
                jSONObject0.put("type", 0);
                jSONObject0.put("executeTime", this.FLD3079);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return jSONObject0;
        }
    }

    public final ConcurrentHashMap FLD3103;
    public static final CLS298 FLD3104;
    public boolean FLD3105;
    public final ConcurrentHashMap FLD3106;
    public WeakReference FLD3107;

    static {
        CLS298.FLD3104 = new CLS298();
    }

    public CLS298() {
        this.FLD3105 = false;
        this.FLD3103 = new ConcurrentHashMap();
        this.FLD3106 = new ConcurrentHashMap();
    }

    // 此方法包含解密的字符串
    public static void MTH4847(CLS298 יʼ0, Intent intent0) {
        ConcurrentHashMap concurrentHashMap0 = יʼ0.FLD3106;
        if(concurrentHashMap0.containsKey(intent0.getAction())) {
            concurrentHashMap0.remove(intent0.getAction());
            String s = intent0.getStringExtra("taskId");
            ConcurrentHashMap concurrentHashMap1 = יʼ0.FLD3103;
            if(concurrentHashMap1.containsKey(s)) {
                CLS296 יʼ$ʾᵢ0 = (CLS296)concurrentHashMap1.get(s);
                if(יʼ$ʾᵢ0 != null) {
                    try {
                        יʼ$ʾᵢ0.MTH4804(System.currentTimeMillis());
                        יʼ$ʾᵢ0.MTH4800(יʼ0);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    if(יʼ$ʾᵢ0.MTH4803()) {
                        יʼ0.MTH4851(יʼ$ʾᵢ0);
                    }
                    else {
                        concurrentHashMap1.remove(s);
                    }
                    יʼ0.MTH4849();
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4848(Activity activity0, long v) {
        public final class CLS1239 implements CLS8 {
            public final ArrayList FLD3084;
            public final CLS335 FLD3085;

            public CLS1239(ArrayList arrayList0, CLS335 ˑٴ0) {
                this.FLD3085 = ˑٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                ArrayList arrayList0 = this.FLD3084;
                if(arrayList0.size() >= 9) {
                    return;
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("img", ((String)object0));
                contentValues0.put("desc", ((String)object0));
                arrayList0.add(contentValues0);
                this.FLD3085.MTH5112();
            }
        }


        public final class CLS1240 implements CLS2 {
            public final ArrayList FLD3086;

            public CLS1240(ArrayList arrayList0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                this.FLD3086.clear();
                List list0 = Arrays.asList(s.split(","));
                this.FLD3086.addAll(list0);
            }
        }


        public final class CLS1241 implements CLS11 {
            public final CLS1622 FLD3087;
            public final CLS298 FLD3088;
            public final CLS1622 FLD3089;
            public final ArrayList FLD3090;
            public final ArrayList FLD3091;
            public final long FLD3092;
            public final ArrayList FLD3093;
            public final Bundle FLD3094;
            public final ArrayList FLD3095;

            public CLS1241(CLS1622 ˑٴ0, long v, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3, Bundle bundle0, CLS1622 ˑٴ1) {
                this.FLD3089 = ˑٴ0;
                this.FLD3092 = v;
                this.FLD3091 = arrayList0;
                this.FLD3093 = arrayList1;
                this.FLD3090 = arrayList2;
                this.FLD3095 = arrayList3;
                this.FLD3094 = bundle0;
                this.FLD3087 = ˑٴ1;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    ArrayList arrayList0 = this.FLD3091;
                    String s = this.FLD3089.MTH7285();
                    long v = this.FLD3092;
                    CLS298 יʼ0 = CLS298.this;
                    CLS1622 ˑٴ0 = this.FLD3087;
                    Bundle bundle0 = this.FLD3094;
                    ArrayList arrayList1 = this.FLD3095;
                    ArrayList arrayList2 = this.FLD3090;
                    if(v == 0L) {
                        String s1 = arrayList0.isEmpty() ? "" : ((ContentValues)arrayList0.get(0)).getAsString("vid");
                        boolean z = TextUtils.isEmpty(s);
                        ArrayList arrayList3 = this.FLD3093;
                        if(z && (TextUtils.isEmpty(s1) && arrayList3.isEmpty())) {
                            return;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if(!arrayList3.isEmpty()) {
                            for(Object object0: arrayList3) {
                                arrayList4.add(((ContentValues)object0).getAsString("img"));
                            }
                        }
                        CLS1238 יʼ$ˈˈ0 = new CLS1238(s, s1, arrayList4);
                        יʼ$ˈˈ0.FLD3077 = arrayList2;
                        יʼ$ˈˈ0.FLD3083 = arrayList1;
                        יʼ$ˈˈ0.FLD3081 = bundle0.getInt("shareType");
                        יʼ$ˈˈ0.FLD3073 = Integer.parseInt(ˑٴ0.MTH7285());
                        יʼ$ˈˈ0.FLD3082 = (long)CLS412.MTH6005(60000, "mr_repeat_delay");
                        יʼ$ˈˈ0.FLD3074 = (long)CLS412.MTH6005(60000, "mr_delete_delay");
                        יʼ$ˈˈ0.FLD3072 = System.currentTimeMillis() + 5000L;
                        יʼ0.MTH4850(((CLS296)יʼ$ˈˈ0));
                        return;
                    }
                    CLS1237 יʼ$ˆʿ0 = new CLS1237(v, s);
                    יʼ$ˆʿ0.FLD3066 = arrayList2;
                    יʼ$ˆʿ0.FLD3068 = arrayList1;
                    יʼ$ˆʿ0.FLD3067 = bundle0.getInt("shareType");
                    יʼ$ˆʿ0.FLD3070 = Integer.parseInt(ˑٴ0.MTH7285());
                    יʼ$ˆʿ0.FLD3065 = (long)CLS412.MTH6005(60000, "mr_repeat_delay");
                    יʼ$ˆʿ0.FLD3069 = (long)CLS412.MTH6005(60000, "mr_delete_delay");
                    יʼ$ˆʿ0.FLD3061 = System.currentTimeMillis() + 5000L;
                    יʼ0.MTH4850(((CLS296)יʼ$ˆʿ0));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1242 implements CLS2 {
            public final ArrayList FLD3096;

            public CLS1242(ArrayList arrayList0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                this.FLD3096.clear();
                List list0 = Arrays.asList(s.split(","));
                this.FLD3096.addAll(list0);
            }
        }


        public final class CLS1243 implements CLS11 {
            public final ContentValues FLD3097;
            public final ArrayList FLD3098;
            public final ArrayList FLD3099;
            public final CLS335 FLD3100;

            public CLS1243(ContentValues contentValues0, ArrayList arrayList0, ArrayList arrayList1, CLS335 ˑٴ0) {
                this.FLD3099 = arrayList0;
                this.FLD3098 = arrayList1;
                this.FLD3100 = ˑٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    ContentValues contentValues0 = this.FLD3097;
                    if(contentValues0.containsKey("img")) {
                        this.FLD3099.remove(contentValues0);
                    }
                    else if(contentValues0.containsKey("vid")) {
                        this.FLD3098.remove(contentValues0);
                    }
                    this.FLD3100.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1244 implements CLS8 {
            public final ArrayList FLD3101;
            public final CLS335 FLD3102;

            public CLS1244(ArrayList arrayList0, CLS335 ˑٴ0) {
                this.FLD3102 = ˑٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                this.FLD3101.clear();
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("vid", ((String)object0));
                contentValues0.put("desc", ((String)object0));
                this.FLD3101.add(contentValues0);
                this.FLD3102.MTH5112();
            }
        }

        if(v == -1L) {
            return;
        }
        String s = CLS27.MTH889("mass_repeat_sns");
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.FLD5243 = true;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        ˑٴ1.FLD5243 = true;
        CLS1621 ˎᵢ0 = new CLS1621(activity0);
        CLS1621 ˎᵢ1 = new CLS1621(activity0);
        String s1 = CLS27.MTH904();
        Bundle bundle0 = new Bundle();
        if(v != 0L) {
            ˑٴ0.MTH7277(CLS396.FLD3775.MTH5752(v));
        }
        CLS523.MTH7153(activity0, s, ((CLS379)new CLS1249(this, activity0, ˑٴ1, ˎᵢ0, ˎᵢ1, bundle0, arrayList0, arrayList1, v, arrayList4, s1, arrayList2, arrayList3, ˑٴ0)), ((CLS11)new CLS1241(this, ˑٴ0, v, arrayList1, arrayList0, arrayList3, arrayList2, bundle0, ˑٴ1)));
    }

    // 此方法包含解密的字符串
    public final void MTH4849() {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.FLD3103.values()) {
            jSONArray0.put(((CLS296)object0).MTH4806());
        }
        CLS27.MTH895().MTH922(jSONArray0, "MrTasks");
    }

    public final void MTH4850(CLS296 יʼ$ʾᵢ0) {
        String s = יʼ$ʾᵢ0.MTH4802();
        this.FLD3103.put(s, יʼ$ʾᵢ0);
        this.MTH4849();
        this.MTH4851(יʼ$ʾᵢ0);
    }

    // 此方法包含解密的字符串
    public final void MTH4851(CLS296 יʼ$ʾᵢ0) {
        public final class CLS297 extends BroadcastReceiver {
            public final CLS298 FLD3071;

            // 此方法包含解密的字符串
            @Override  // android.content.BroadcastReceiver
            public final void onReceive(Context context0, Intent intent0) {
                if(!intent0.getAction().startsWith("wxp mr task")) {
                    return;
                }
                try {
                    CLS298.MTH4847(CLS298.this, intent0);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        WeakReference weakReference0 = this.FLD3107;
        if(weakReference0 != null && יʼ$ʾᵢ0 != null) {
            Context context0 = (Context)weakReference0.get();
            long v = יʼ$ʾᵢ0.MTH4805();
            try {
                if(System.currentTimeMillis() > v) {
                    return;
                }
                String s = "wxp mr task " + יʼ$ʾᵢ0.MTH4802() + " " + v;
                ConcurrentHashMap concurrentHashMap0 = this.FLD3106;
                if(concurrentHashMap0.containsKey(s)) {
                    return;
                }
                context0.registerReceiver(new CLS297(this), new IntentFilter(s));
                Intent intent0 = new Intent();
                intent0.setAction(s);
                intent0.putExtra("taskId", יʼ$ʾᵢ0.MTH4802());
                AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
                int v1 = Build.VERSION.SDK_INT;
                PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, 0, intent0, (v1 < 23 ? 0x8000000 : 0xC000000));
                if(pendingIntent0 != null) {
                    if(v1 < 23) {
                        if(v1 >= 19) {
                            CLS22.MTH845(alarmManager0, v, pendingIntent0);
                        }
                        else {
                            alarmManager0.set(0, v, pendingIntent0);
                        }
                    }
                    else if(v1 >= 0x1F && alarmManager0.canScheduleExactAlarms()) {
                        CLS22.MTH845(alarmManager0, v, pendingIntent0);
                    }
                    else {
                        alarmManager0.set(0, v, pendingIntent0);
                    }
                    concurrentHashMap0.put(intent0.getAction(), pendingIntent0);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

