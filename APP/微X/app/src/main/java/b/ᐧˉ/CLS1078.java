// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˈˊ.CLS99;
import b.ˑٴ.CLS766;
import b.ᵔʾ.CLS309;
import b.ⁱʾ.CLS316;
import b.ⁱʾ.CLS329;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1635;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS1078 extends CLS219 {
    public final CLS309 FLD2313;
    public final ArrayList FLD2314;
    public final SimpleDateFormat FLD2315;
    public final SimpleDateFormat FLD2316;
    public CLS329 FLD2317;

    // 此方法包含解密的字符串
    public CLS1078(String s, String s1) {
        super(s, s1);
        this.FLD2313 = CLS309.FLD3190;
        this.FLD2316 = new SimpleDateFormat("HH:mm");
        this.FLD2315 = new SimpleDateFormat("yyyy-MM-dd");
        CLS309.FLD3190.getClass();
        this.FLD2314 = CLS309.MTH4938();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        public final class CLS1075 implements CLS11 {
            public final CLS1078 FLD2307;

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS1078 ـˆ0 = CLS1078.this;
                ـˆ0.FLD2314.clear();
                CLS309 ⁱʾ0 = ـˆ0.FLD2313;
                Context context0 = (Context)ⁱʾ0.FLD3191.get();
                if(context0 != null) {
                    AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
                    ConcurrentHashMap concurrentHashMap0 = ⁱʾ0.FLD3192;
                    for(Object object0: concurrentHashMap0.keySet()) {
                        alarmManager0.cancel(((PendingIntent)concurrentHashMap0.get(((String)object0))));
                    }
                    concurrentHashMap0.clear();
                }
                CLS29 ˎᵢ0 = CLS27.MTH895();
                ˎᵢ0.getClass();
                String s = CLS27.MTH881();
                if(!TextUtils.isEmpty(s)) {
                    ˎᵢ0.getWritableDatabase().delete("DATA", "ACCOUNT=? AND TAG LIKE ?", new String[]{s, "sTask_%"});
                    ˎᵢ0.FLD121.remove("sTask_%");
                }
                ⁱʾ0.FLD3189.clear();
                ـˆ0.FLD2317.notifyDataSetChanged();
            }
        }


        public final class CLS1077 implements CLS11 {
            public final CLS99 FLD2311;
            public final CLS1078 FLD2312;

            public CLS1077(CLS99 ﾞᵎ0) {
                this.FLD2311 = ﾞᵎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS1078.this.FLD2313.MTH4948(this.FLD2311);
                CLS1078.this.FLD2314.remove(this.FLD2311);
                CLS1078.this.FLD2317.notifyDataSetChanged();
            }
        }

        if(z1) {
            return;
        }
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS380 ʼˎ0 = new CLS380(activity0, this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1031(this, activity0);
        ʼˎ0.FLD3526 = new CLS1031(this, activity0);
        ʼˎ0.FLD3519 = new CLS1212(this, 0);
        ʼˎ0.show();
    }

    // 此方法包含解密的字符串
    public final void MTH4070(CLS99 ﾞᵎ0, CLS3 ˆٴ0) {
        public final class CLS1074 implements CLS11 {
            public final CLS99 FLD2302;
            public final CLS1078 FLD2303;
            public final CLS1622 FLD2304;
            public final CLS1635 FLD2305;
            public final CLS3 FLD2306;

            public CLS1074(CLS99 ﾞᵎ0, CLS1635 ﾞᵎ1, CLS1622 ˑٴ0, CLS3 ˆٴ0) {
                this.FLD2302 = ﾞᵎ0;
                this.FLD2305 = ﾞᵎ1;
                this.FLD2304 = ˑٴ0;
                this.FLD2306 = ˆٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS99 ﾞᵎ0 = this.FLD2302;
                if(ﾞᵎ0 == null) {
                    return;
                }
                ﾞᵎ0.FLD500 = this.FLD2305.MTH7444();
                boolean z = true;
                ﾞᵎ0.FLD490 = true;
                ﾞᵎ0.FLD491 = this.FLD2304.MTH7285();
                CLS1078 ـˆ0 = CLS1078.this;
                ArrayList arrayList0 = ـˆ0.FLD2314;
                if(!arrayList0.contains(ﾞᵎ0)) {
                    for(Object object0: arrayList0) {
                        if(!((CLS99)object0).FLD494.equals(ﾞᵎ0.FLD494)) {
                            continue;
                        }
                        goto label_16;
                    }
                    z = false;
                }
            label_16:
                if(!z) {
                    ـˆ0.FLD2314.add(ﾞᵎ0);
                }
                ـˆ0.FLD2313.MTH4941(ﾞᵎ0);
                CLS3 ˆٴ0 = this.FLD2306;
                if(ˆٴ0 != null) {
                    ˆٴ0.MTH774();
                }
            }
        }


        public final class CLS1076 implements CLS11 {
            public final CLS99 FLD2308;
            public final int FLD2309;
            public final CLS316 FLD2310;

            public CLS1076(CLS99 ﾞᵎ0, CLS316 ʽי0, int v) {
                this.FLD2310 = ʽי0;
                this.FLD2309 = v;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = (String)this.FLD2310.getItem(this.FLD2309);
                (this.FLD2308.FLD489 ? this.FLD2308.FLD496 : this.FLD2308.FLD499).remove(s);
                this.FLD2310.notifyDataSetChanged();
            }
        }

        String s = CLS27.MTH889("add_task");
        if(!TextUtils.isEmpty(ﾞᵎ0.FLD491)) {
            s = ﾞᵎ0.FLD491;
        }
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1635 ﾞᵎ1 = new CLS1635(activity0);
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        if(ˆٴ0 == null) {
            this.FLD2314.clear();
            this.FLD2313.getClass();
            ArrayList arrayList0 = CLS309.MTH4938();
            this.FLD2314.addAll(arrayList0);
        }
        CLS523.MTH7153(activity0, s, ((CLS379)new CLS766(this, activity0, ﾞᵎ0, ˑٴ0, ﾞᵎ1, 4)), ((CLS11)new CLS1074(this, ﾞᵎ0, ﾞᵎ1, ˑٴ0, ˆٴ0)));
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
    }

    // 此方法包含解密的字符串
    public final void MTH4072(CLS99 ﾞᵎ0, String s, CLS978 ˉˉ0) {
        String s1 = CLS27.MTH889("select_time");
        boolean z = this.FLD2153.MTH6895("st_r_di");
        ArrayList arrayList0 = new ArrayList();
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1635 ﾞᵎ1 = new CLS1635(activity0);
        AlertDialog[] arr_alertDialog = {null};
        arr_alertDialog[0] = CLS523.MTH7160(activity0, s1, ((CLS17)new CLS1213(this, ﾞᵎ0, s, activity0, arr_alertDialog, ˉˉ0, z, arrayList0, ﾞᵎ1)), ((CLS11)new CLS1120(z, ﾞᵎ0, arrayList0, ﾞᵎ1, s, ˉˉ0)));
    }
}

