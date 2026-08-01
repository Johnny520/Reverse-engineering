// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageButton;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import java.io.Serializable;

public final class CLS252 implements View.OnClickListener {
    public final int FLD2619;
    public final Object FLD2620;
    public final Object FLD2621;
    public final Object FLD2622;
    public final Object FLD2623;
    public final Object FLD2624;
    public final Object FLD2625;

    public CLS252(Object object0, Activity activity0, Comparable comparable0, Object object1, Object object2, Object object3, int v) {
        this.FLD2619 = v;
        this.FLD2625 = object0;
        this.FLD2622 = activity0;
        this.FLD2621 = comparable0;
        this.FLD2623 = object1;
        this.FLD2620 = object2;
        this.FLD2624 = object3;
        super();
    }

    public CLS252(Object object0, Serializable serializable0, Object object1, Object object2, Object object3, Object object4, int v) {
        this.FLD2619 = v;
        this.FLD2625 = object0;
        this.FLD2621 = serializable0;
        this.FLD2622 = object1;
        this.FLD2623 = object2;
        this.FLD2620 = object3;
        this.FLD2624 = object4;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s;
        Object object0 = this.FLD2624;
        Object object1 = this.FLD2620;
        Object object2 = this.FLD2623;
        Object object3 = this.FLD2622;
        Object object4 = this.FLD2621;
        Object object5 = this.FLD2625;
        switch(this.FLD2619) {
            case 0: {
                ((CLS1173)object5).getClass();
                boolean z = CLS502.MTH6943(((String)object4), new String[]{"custom"});
                CLS485 ᐧﾞ0 = ((CLS1173)object5).FLD2716;
                if(z) {
                    ᐧﾞ0.getClass();
                    s = CLS485.MTH6739(((Activity)object3), "wx_custom_chatroom") ? "wx_custom_chatroom" : CLS182.MTH3484(4101062627256226613L, new StringBuilder(), ((String)object4));
                }
                else {
                    s = CLS182.MTH3484(4101062627256226613L, new StringBuilder(), ((String)object4));
                }
                ᐧﾞ0.getClass();
                CLS485.MTH6716(((Activity)object3), s);
                ((CLS1635)object2).MTH801(0);
                ((CLS1635)object1).MTH801(0);
                ((CLS1173)object5).FLD2719.MTH801(0);
                ((CLS1173)object5).FLD2718.MTH801(0);
                ((CLS1173)object5).FLD2724.MTH801(0);
                ((CLS1173)object5).FLD2720.MTH801(0);
                ((CLS1623)object0).MTH801(0);
                return;
            }
            case 1: {
                ((CLS1105)object5).getClass();
                String s1 = CLS182.MTH3484(4100579696838497077L, new StringBuilder(), ((String)object4));
                ((CLS1105)object5).FLD2414.getClass();
                CLS485.MTH6716(((Activity)object3), s1);
                CLS523.MTH7157(false, new CLS18[]{((CLS1635)object2), ((CLS1635)object1), ((CLS1626)object0)});
                return;
            }
            case 2: {
                MediaPlayer mediaPlayer1 = (MediaPlayer)object5;
                Activity activity0 = (Activity)object3;
                Uri uri0 = (Uri)object4;
                ImageButton imageButton2 = (ImageButton)object2;
                ImageButton imageButton3 = (ImageButton)object1;
                Runnable[] arr_runnable1 = (Runnable[])object0;
                try {
                    if(!CLS476.FLD4664) {
                        mediaPlayer1.reset();
                        mediaPlayer1.setDataSource(activity0, uri0);
                        mediaPlayer1.prepare();
                    }
                    int v2 = mediaPlayer1.getCurrentPosition();
                    if(v2 >= mediaPlayer1.getDuration()) {
                        mediaPlayer1.seekTo(0);
                    }
                    if(CLS476.FLD4665 != 0) {
                        int v3 = CLS476.FLD4663;
                        if(v2 < v3) {
                            mediaPlayer1.seekTo(v3);
                        }
                    }
                    mediaPlayer1.start();
                    CLS476.FLD4664 = false;
                    imageButton2.setVisibility(0);
                    imageButton3.setVisibility(8);
                    CLS476.FLD4666.removeCallbacks(arr_runnable1[0]);
                    CLS476.FLD4666.postDelayed(arr_runnable1[0], 100L);
                }
                catch(Throwable throwable1) {
                    throwable1.printStackTrace();
                }
                return;
            }
            case 3: {
                MediaPlayer mediaPlayer2 = (MediaPlayer)object5;
                String s2 = (String)object4;
                boolean[] arr_z = (boolean[])object3;
                ImageButton imageButton4 = (ImageButton)object2;
                ImageButton imageButton5 = (ImageButton)object1;
                Runnable[] arr_runnable2 = (Runnable[])object0;
                try {
                    if(!CLS476.FLD4664) {
                        mediaPlayer2.reset();
                        mediaPlayer2.setDataSource(s2);
                        mediaPlayer2.prepare();
                    }
                    if(mediaPlayer2.getCurrentPosition() >= mediaPlayer2.getDuration()) {
                        mediaPlayer2.seekTo(0);
                    }
                    mediaPlayer2.start();
                    arr_z[0] = true;
                    CLS476.FLD4664 = false;
                    imageButton4.setVisibility(0);
                    imageButton5.setVisibility(8);
                    CLS476.FLD4666.removeCallbacks(arr_runnable2[0]);
                    CLS476.FLD4666.postDelayed(arr_runnable2[0], 100L);
                }
                catch(Throwable throwable2) {
                    throwable2.printStackTrace();
                }
                return;
            }
            default: {
                MediaPlayer mediaPlayer0 = (MediaPlayer)object5;
                String[] arr_s = (String[])object4;
                ImageButton imageButton0 = (ImageButton)object3;
                ImageButton imageButton1 = (ImageButton)object2;
                Handler handler0 = (Handler)object1;
                Runnable[] arr_runnable = (Runnable[])object0;
                try {
                    if(!CLS462.FLD4512) {
                        mediaPlayer0.reset();
                        mediaPlayer0.setDataSource(arr_s[0]);
                        mediaPlayer0.prepare();
                    }
                    int v = mediaPlayer0.getCurrentPosition();
                    if(v >= mediaPlayer0.getDuration()) {
                        mediaPlayer0.seekTo(0);
                    }
                    if(CLS462.FLD4513 != 0) {
                        int v1 = CLS462.FLD4511;
                        if(v < v1) {
                            mediaPlayer0.seekTo(v1);
                        }
                    }
                    mediaPlayer0.start();
                    CLS462.FLD4512 = false;
                    imageButton0.setVisibility(0);
                    imageButton1.setVisibility(8);
                    handler0.removeCallbacks(arr_runnable[0]);
                    handler0.postDelayed(arr_runnable[0], 100L);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

