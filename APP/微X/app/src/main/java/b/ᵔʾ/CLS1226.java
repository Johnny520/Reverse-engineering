// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS1226 implements CLS11 {
    public final ContentValues FLD2917;
    public final CLS335 FLD2918;
    public final ArrayList FLD2919;
    public final CLS298 FLD2920;

    public CLS1226(CLS298 יʼ0, ContentValues contentValues0, ArrayList arrayList0, CLS335 ˑٴ0) {
        this.FLD2920 = יʼ0;
        this.FLD2917 = contentValues0;
        this.FLD2919 = arrayList0;
        this.FLD2918 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        ContentValues contentValues0 = this.FLD2917;
        String s = contentValues0.getAsString("id");
        CLS298 יʼ0 = this.FLD2920;
        Context context0 = (Context)יʼ0.FLD3107.get();
        if(context0 != null) {
            AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
            ConcurrentHashMap concurrentHashMap0 = יʼ0.FLD3106;
            for(Object object0: new ArrayList(concurrentHashMap0.keySet())) {
                String s1 = (String)object0;
                if(CLS502.MTH6934(s1, new String[]{s})) {
                    try {
                        alarmManager0.cancel(((PendingIntent)concurrentHashMap0.get(s1)));
                        concurrentHashMap0.remove(s1);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
        יʼ0.FLD3103.remove(s);
        יʼ0.MTH4849();
        this.FLD2919.remove(contentValues0);
        this.FLD2918.notifyDataSetChanged();
    }
}

