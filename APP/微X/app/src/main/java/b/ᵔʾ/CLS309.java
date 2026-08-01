// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Build.VERSION;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS22;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˈˊ.CLS1638;
import b.ˈˊ.CLS1639;
import b.ˈˊ.CLS1640;
import b.ˈˊ.CLS1641;
import b.ˈˊ.CLS1642;
import b.ˈˊ.CLS1643;
import b.ˈˊ.CLS1653;
import b.ˈˊ.CLS1654;
import b.ˈˊ.CLS587;
import b.ˈˊ.CLS590;
import b.ˈˊ.CLS592;
import b.ˈˊ.CLS595;
import b.ˈˊ.CLS600;
import b.ˈˊ.CLS603;
import b.ˈˊ.CLS606;
import b.ˈˊ.CLS99;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class CLS309 {
    public final ConcurrentHashMap FLD3189;
    public static final CLS309 FLD3190;
    public WeakReference FLD3191;
    public final ConcurrentHashMap FLD3192;
    public boolean FLD3193;

    static {
        CLS309.FLD3190 = new CLS309();
    }

    public CLS309() {
        this.FLD3189 = new ConcurrentHashMap();
        this.FLD3192 = new ConcurrentHashMap();
    }

    public static boolean MTH4937(CLS99 ﾞᵎ0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ﾞᵎ0.MTH1937()) {
            long v = (long)(((Long)object0));
            if(System.currentTimeMillis() < v) {
                arrayList0.add(v);
            }
        }
        return !arrayList0.isEmpty();
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH4938() {
        ArrayList arrayList0 = new ArrayList();
        CLS29 ˎᵢ0 = CLS27.MTH895();
        ˎᵢ0.getClass();
        ArrayList arrayList1 = new ArrayList();
        Cursor cursor0 = CLS29.MTH918(ˎᵢ0.getReadableDatabase(), "sTask_%");
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s = CLS182.MTH3472(4101178904905831221L, cursor0);
                    if(ˎᵢ0.FLD123) {
                        s = ˎᵢ0.MTH919(s);
                    }
                    arrayList1.add(s);
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
        }
        if(arrayList1.isEmpty()) {
            return arrayList0;
        }
        boolean z = CLS500.FLD4928.MTH6897();
        boolean z1 = CLS27.MTH895().MTH938("multi_selection_auto_forward_enable", CLS412.MTH6002()) && (CLS21.FLD76.MTH830("hasRecordForwardSave", new Object[0]) && CLS500.FLD4928.MTH6898());
        for(Object object0: arrayList1) {
            String s1 = (String)object0;
            try {
                CLS99 ﾞᵎ0 = CLS309.MTH4942(new JSONObject(s1));
                if(ﾞᵎ0.FLD501 == 4 && !z || ﾞᵎ0.FLD501 == 5 && !z1) {
                    continue;
                }
                arrayList0.add(ﾞᵎ0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return arrayList0;
    }

    public static ArrayList MTH4939() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: CLS309.MTH4938()) {
            CLS99 ﾞᵎ0 = (CLS99)object0;
            if(ﾞᵎ0.FLD501 == 15) {
                arrayList0.add(ﾞᵎ0);
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public static void MTH4940(CLS309 ⁱʾ0, Intent intent0) {
        ConcurrentHashMap concurrentHashMap0 = ⁱʾ0.FLD3192;
        if(concurrentHashMap0.containsKey(intent0.getAction())) {
            concurrentHashMap0.remove(intent0.getAction());
            String s = intent0.getStringExtra("taskId");
            ConcurrentHashMap concurrentHashMap1 = ⁱʾ0.FLD3189;
            if(concurrentHashMap1.containsKey(s)) {
                CLS99 ﾞᵎ0 = (CLS99)concurrentHashMap1.get(s);
                if(ﾞᵎ0 != null) {
                    if(ﾞᵎ0.FLD500) {
                        try {
                            ﾞᵎ0.FLD493 = System.currentTimeMillis();
                            ﾞᵎ0.FLD490 = true;
                            ﾞᵎ0.MTH1936();
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                    if(ﾞᵎ0.FLD497 && !ﾞᵎ0.FLD489 && !CLS309.MTH4937(ﾞᵎ0)) {
                        ⁱʾ0.MTH4948(ﾞᵎ0);
                        return;
                    }
                    if(ﾞᵎ0.FLD489) {
                        ⁱʾ0.MTH4944(ﾞᵎ0);
                    }
                    CLS27.MTH895().MTH922(ﾞᵎ0.MTH1933(), "sTask_" + ﾞᵎ0.FLD494);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4941(CLS99 ﾞᵎ0) {
        ﾞᵎ0.FLD490 = false;
        this.MTH4943(ﾞᵎ0);
        CLS27.MTH895().MTH922(ﾞᵎ0.MTH1933(), "sTask_" + ﾞᵎ0.FLD494);
        this.FLD3189.put(ﾞᵎ0.FLD494, ﾞᵎ0);
        this.MTH4944(ﾞᵎ0);
    }

    // 此方法包含解密的字符串
    public static CLS99 MTH4942(JSONObject jSONObject0) {
        if(!jSONObject0.has("type")) {
            return null;
        }
        try {
            CLS99 ﾞᵎ0 = CLS309.MTH4946(jSONObject0.getInt("type"));
            ﾞᵎ0.MTH1935(jSONObject0);
            return ﾞᵎ0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4943(CLS99 ﾞᵎ0) {
        Context context0 = (Context)this.FLD3191.get();
        if(context0 == null) {
            return;
        }
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        ConcurrentHashMap concurrentHashMap0 = this.FLD3192;
        for(Object object0: new ArrayList(concurrentHashMap0.keySet())) {
            String s = (String)object0;
            if(CLS502.MTH6934(s, new String[]{ﾞᵎ0.FLD494})) {
                try {
                    alarmManager0.cancel(((PendingIntent)concurrentHashMap0.get(s)));
                    concurrentHashMap0.remove(s);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4944(CLS99 ﾞᵎ0) {
        public final class CLS308 extends BroadcastReceiver {
            public final CLS309 FLD3188;

            // 此方法包含解密的字符串
            @Override  // android.content.BroadcastReceiver
            public final void onReceive(Context context0, Intent intent0) {
                if(!intent0.getAction().startsWith("wxp task")) {
                    return;
                }
                try {
                    CLS309.MTH4940(CLS309.this, intent0);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        WeakReference weakReference0 = this.FLD3191;
        if(weakReference0 != null && ﾞᵎ0.FLD500) {
            Context context0 = (Context)weakReference0.get();
            for(Object object0: ﾞᵎ0.MTH1937()) {
                long v = (long)(((Long)object0));
                try {
                    if(System.currentTimeMillis() > v) {
                        continue;
                    }
                    String s = "wxp task " + ﾞᵎ0.FLD494 + " " + v;
                    ConcurrentHashMap concurrentHashMap0 = this.FLD3192;
                    if(concurrentHashMap0.containsKey(s)) {
                        continue;
                    }
                    context0.registerReceiver(new CLS308(this), new IntentFilter(s));
                    Intent intent0 = new Intent();
                    intent0.setAction(s);
                    intent0.putExtra("taskId", ﾞᵎ0.FLD494);
                    AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
                    int v1 = Build.VERSION.SDK_INT;
                    PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, 0, intent0, (v1 < 23 ? 0x8000000 : 0xC000000));
                    if(pendingIntent0 == null) {
                        continue;
                    }
                    if(v1 < 23) {
                        if(v1 >= 19) {
                            CLS22.MTH845(alarmManager0, v, pendingIntent0);
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
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    public final void MTH4945(CLS99 ﾞᵎ0, long v) {
        Date date0 = new Date(System.currentTimeMillis() + v);
        ﾞᵎ0.MTH1932(ﾞᵎ0.FLD492.format(date0));
        ﾞᵎ0.FLD500 = true;
        this.MTH4941(ﾞᵎ0);
    }

    public static CLS99 MTH4946(int v) {
        try {
            switch(v) {
                case 0: {
                    return new CLS600(2);
                }
                case 1: {
                    return new CLS595();
                }
                case 2: {
                    return new CLS600(0);
                }
                case 3: {
                    return new CLS606();
                }
                case 4: {
                    return new CLS587();
                }
                case 5: {
                    return new CLS1638();
                }
                case 6: {
                    return new CLS600(3);
                }
                case 7: {
                    return new CLS1643();
                }
                case 8: {
                    return new CLS1642(0);
                }
                case 9: {
                    return new CLS1641();
                }
                case 10: {
                    return new CLS1654();
                }
                case 11: {
                    return new CLS1642(1);
                }
                case 12: {
                    return new CLS1653();
                }
                case 13: {
                    return new CLS1639();
                }
                case 14: {
                    return new CLS1640();
                }
                case 15: {
                    return new CLS590();
                }
                case 16: {
                    return new CLS603();
                }
                case 17: {
                    return new CLS592();
                }
                case 18: {
                    return new CLS600(1);
                }
                default: {
                    return null;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    public static void MTH4947(CLS99 ﾞᵎ0) {
        if(ﾞᵎ0 != null && ﾞᵎ0.FLD500) {
            try {
                ﾞᵎ0.FLD493 = System.currentTimeMillis();
                ﾞᵎ0.FLD490 = true;
                ﾞᵎ0.MTH1936();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4948(CLS99 ﾞᵎ0) {
        this.MTH4943(ﾞᵎ0);
        this.FLD3189.remove(ﾞᵎ0.FLD494);
        CLS27.MTH895().MTH932("sTask_" + ﾞᵎ0.FLD494);
    }
}

