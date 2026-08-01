// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent.Callback;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageButton;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS78;
import b.ᐧˉ.CLS1078;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS977;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS1382;
import b.ⁱᵔ.CLS1391;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS405;
import b.ⁱᵔ.CLS409;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS281 implements View.OnClickListener {
    public final int FLD2911;
    public final Object FLD2912;
    public final Object FLD2913;
    public final Object FLD2914;
    public final Object FLD2915;
    public final Object FLD2916;

    public CLS281(CLS1078 ـˆ0, ArrayList arrayList0, CLS69 ʾᵢ0, Activity activity0, ArrayList arrayList1) {
        this.FLD2911 = 1;
        super();
        this.FLD2915 = ـˆ0;
        this.FLD2914 = arrayList0;
        this.FLD2912 = ʾᵢ0;
        this.FLD2916 = activity0;
        this.FLD2913 = arrayList1;
    }

    public CLS281(Object object0, Object object1, Object object2, KeyEvent.Callback keyEvent$Callback0, Object object3, int v) {
        this.FLD2911 = v;
        this.FLD2915 = object0;
        this.FLD2912 = object1;
        this.FLD2914 = object2;
        this.FLD2913 = keyEvent$Callback0;
        this.FLD2916 = object3;
        super();
    }

    public CLS281(Object object0, Object object1, ArrayList arrayList0, CLS335 ˑٴ0, ArrayList arrayList1, int v) {
        this.FLD2911 = v;
        this.FLD2915 = object0;
        this.FLD2912 = object1;
        this.FLD2914 = arrayList0;
        this.FLD2916 = ˑٴ0;
        this.FLD2913 = arrayList1;
        super();
    }

    public CLS281(ArrayList arrayList0, SimpleDateFormat simpleDateFormat0, Calendar calendar0, Activity activity0, CLS1626 ـﹳ0) {
        this.FLD2911 = 4;
        super();
        this.FLD2914 = arrayList0;
        this.FLD2915 = simpleDateFormat0;
        this.FLD2912 = calendar0;
        this.FLD2913 = activity0;
        this.FLD2916 = ـﹳ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1382 ˆˎ0;
        String s4;
        Object object0 = this.FLD2913;
        Object object1 = this.FLD2916;
        Object object2 = this.FLD2914;
        Object object3 = this.FLD2912;
        Object object4 = this.FLD2915;
        switch(this.FLD2911) {
            case 0: {
                Bundle bundle0 = (Bundle)object3;
                ArrayList arrayList1 = (ArrayList)object2;
                CLS335 ˑٴ0 = (CLS335)object1;
                ArrayList arrayList2 = (ArrayList)object0;
                ((CLS298)object4).getClass();
                try {
                    int v3 = bundle0.getInt("type");
                    if(v3 == 1) {
                        Object[] arr_object = {new CLS1239(arrayList1, ˑٴ0)};
                        CLS21.FLD76.MTH818("selectImg2", arr_object);
                        return;
                    }
                    if(v3 == 15) {
                        Object[] arr_object1 = {new CLS1244(arrayList2, ˑٴ0)};
                        CLS21.FLD76.MTH818("selectVid", arr_object1);
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                ((CLS1078)object4).getClass();
                ArrayList arrayList3 = new ArrayList();
                for(Object object6: ((ArrayList)object2)) {
                    arrayList3.add(((String)((CLS69)object3).MTH1559(Integer.parseInt(((String)object6).substring(1)))));
                }
                CLS523.MTH7146(((Activity)object1), CLS27.MTH889("select_days"), ((ArrayList)object0), ((CLS8)new CLS977(((ArrayList)object2), ((CLS69)object3))), TextUtils.join(",", arrayList3));
                return;
            }
            case 2: {
                MediaPlayer mediaPlayer0 = (MediaPlayer)object4;
                String s3 = (String)object3;
                ImageButton imageButton0 = (ImageButton)object2;
                ImageButton imageButton1 = (ImageButton)object0;
                Runnable[] arr_runnable = (Runnable[])object1;
                try {
                    if(!CLS476.FLD4664) {
                        mediaPlayer0.reset();
                        mediaPlayer0.setDataSource(s3);
                        mediaPlayer0.prepare();
                    }
                    int v4 = mediaPlayer0.getCurrentPosition();
                    if(v4 >= mediaPlayer0.getDuration()) {
                        mediaPlayer0.seekTo(0);
                    }
                    if(CLS476.FLD4665 != 0) {
                        int v5 = CLS476.FLD4663;
                        if(v4 < v5) {
                            mediaPlayer0.seekTo(v5);
                        }
                    }
                    mediaPlayer0.start();
                    CLS476.FLD4664 = false;
                    imageButton0.setVisibility(0);
                    imageButton1.setVisibility(8);
                    CLS476.FLD4666.removeCallbacks(arr_runnable[0]);
                    CLS476.FLD4666.postDelayed(arr_runnable[0], 100L);
                }
                catch(Throwable throwable1) {
                    throwable1.printStackTrace();
                }
                return;
            }
            case 3: {
                Handler handler0 = (Handler)object4;
                Runnable[] arr_runnable1 = (Runnable[])object3;
                MediaPlayer mediaPlayer1 = (MediaPlayer)object2;
                ImageButton imageButton2 = (ImageButton)object0;
                ImageButton imageButton3 = (ImageButton)object1;
                try {
                    handler0.removeCallbacks(arr_runnable1[0]);
                    if(mediaPlayer1 != null) {
                        if(CLS462.FLD4512) {
                            mediaPlayer1.start();
                            CLS462.FLD4512 = false;
                            handler0.postDelayed(arr_runnable1[0], 100L);
                        }
                        else {
                            mediaPlayer1.pause();
                            CLS462.FLD4512 = true;
                        }
                    }
                    imageButton2.setVisibility(8);
                    imageButton3.setVisibility(0);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 4: {
                ArrayList arrayList4 = (ArrayList)object2;
                SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)object4;
                Calendar calendar0 = (Calendar)object3;
                Activity activity0 = (Activity)object0;
                CLS1626 ـﹳ0 = (CLS1626)object1;
                try {
                    Calendar calendar1 = Calendar.getInstance();
                    if(((String)arrayList4.get(1)).equals("--")) {
                        arrayList4.set(1, simpleDateFormat0.format(calendar0.getTime()));
                    }
                    calendar1.setTime(simpleDateFormat0.parse(((String)arrayList4.get(1))));
                    new TimePickerDialog(activity0, new CLS405(arrayList4, simpleDateFormat0, ـﹳ0, 1), calendar1.get(11), calendar1.get(12), true).show();
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 5: {
                JSONObject jSONObject0 = (JSONObject)object4;
                Activity activity1 = (Activity)object3;
                ArrayList arrayList5 = (ArrayList)object2;
                CLS335 ˑٴ1 = (CLS335)object1;
                ArrayList arrayList6 = (ArrayList)object0;
                try {
                    int v6 = jSONObject0.getInt("type");
                    boolean z = false;
                    if(v6 == 1) {
                        z = true;
                        s4 = CLS27.MTH889("input_url");
                        ˆˎ0 = new CLS1382(0, ˑٴ1, arrayList5);
                    }
                    else if(v6 == 15) {
                        z = true;
                        s4 = CLS27.MTH889("input_url");
                        ˆˎ0 = new CLS1382(1, ˑٴ1, arrayList6);
                    }
                    if(z) {
                        CLS523.MTH7165(activity1, s4, "", "", 1, ((CLS16)ˆˎ0));
                        return;
                    }
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            default: {
                ArrayList arrayList0 = new ArrayList();
                if(CLS426.MTH6126(((String)object4))) {
                    long v = CLS409.FLD3999;
                    if(v == 0L) {
                        ((CLS371)object3).MTH5371(((String)object4), arrayList0, null);
                    }
                    else {
                        long v1 = CLS409.FLD4001;
                        if(v1 == 0L) {
                            ((CLS371)object3).MTH5371(((String)object4), arrayList0, null);
                        }
                        else {
                            ((CLS371)object3).getClass();
                            HashSet hashSet0 = new HashSet();
                            if(CLS426.MTH6126(((String)object4))) {
                                Cursor cursor0 = ((CLS371)object3).MTH5307("SELECT * FROM message WHERE talker = \'" + ((String)object4) + "\' AND createTime BETWEEN " + v + " AND " + v1, null);
                                if(cursor0 != null) {
                                    String s = CLS27.MTH904();
                                    if(cursor0.moveToFirst()) {
                                        while(true) {
                                            String s1 = CLS182.MTH3472(0x38EABE832B3CD335L, cursor0);
                                            int v2 = CLS182.MTH3490(4101299915609396021L, cursor0);
                                            switch(CLS182.MTH3490(4101299945674167093L, cursor0)) {
                                                case 10000: 
                                                case 10002: 
                                                case 0x22000031: {
                                                    break;
                                                }
                                                default: {
                                                    if(v2 == 1) {
                                                        hashSet0.add(s);
                                                    }
                                                    else {
                                                        String s2 = CLS426.MTH6109(s1);
                                                        if(!((String)object4).equals(s2)) {
                                                            hashSet0.add(s2);
                                                        }
                                                    }
                                                }
                                            }
                                            if(!cursor0.moveToNext()) {
                                                break;
                                            }
                                        }
                                    }
                                    if(!cursor0.isClosed()) {
                                        cursor0.close();
                                    }
                                    for(Object object5: hashSet0) {
                                        arrayList0.add(new CLS78(((String)object5), ((CLS371)object3).MTH5311(((String)object5))));
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    arrayList0.add(new CLS78(((String)object2), ((CLS371)object3).MTH5311(((String)object2))));
                    if(!((String)object4).equals(((String)object2))) {
                        arrayList0.add(new CLS78(((String)object4), ((CLS371)object3).MTH5311(((String)object4))));
                    }
                }
                CLS387.MTH5585(false, ((Activity)object0), arrayList0, ((CLS2)new CLS1391(((CLS1626)object1))), CLS409.FLD3998, -1);
            }
        }
    }
}

