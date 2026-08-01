// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS36.CLS35;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import java.util.HashSet;

public final class CLS777 implements CLS35 {
    public final int FLD1090;
    public final Object FLD1091;

    public CLS777(int v, Object object0) {
        this.FLD1090 = v;
        this.FLD1091 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object0 = this.FLD1091;
        switch(this.FLD1090) {
            case 0: {
                CLS21.FLD76.MTH819("plus.config", new Object[]{((String)object0)});
                return;
            }
            case 1: {
                ((CLS500)object0).getClass();
                ((CLS500)object0).FLD4927 = (HashSet)arr_object[0];
                ((CLS500)object0).FLD4923.MTH1742();
                ((CLS500)object0).FLD4926.MTH1742();
                ((CLS500)object0).FLD4925.MTH1742();
                ((CLS500)object0).MTH6891();
                return;
            }
            default: {
                ((CLS485)object0).getClass();
                Intent intent0 = new Intent();
                intent0.setClassName(CLS390.MTH5619(CLS27.MTH900()), CLS27.MTH897("LauncherUI"));
                String s = (String)arr_object[0];
                try {
                    Context context0 = CLS27.MTH900();
                    Bitmap bitmap0 = CLS404.MTH5887();
                    Notification.Builder notification$Builder0 = new Notification.Builder(context0).setLargeIcon(bitmap0).setContentTitle(s).setSmallIcon(CLS485.MTH6745()).setAutoCancel(false);
                    if(CLS390.MTH5615(context0)) {
                        CLS485.MTH6726(context0, "_secret");
                        notification$Builder0.setChannelId(CLS485.MTH6736("wx__secret"));
                    }
                    notification$Builder0.setContentIntent((Build.VERSION.SDK_INT < 23 ? PendingIntent.getActivity(context0, 5555, intent0, 0x8000000) : PendingIntent.getActivity(context0, 5555, intent0, 0xC000000)));
                    CLS485.MTH6722(notification$Builder0, "_secret");
                    Notification notification0 = notification$Builder0.build();
                    notification0.flags = 17;
                    notification0.ledOnMS = 300;
                    notification0.ledOffMS = 1000;
                    notification0.ledARGB = 0xFF00FF00;
                    CLS485.MTH6724("_secret", notification0);
                    CLS485.MTH6748("_secret", notification0);
                    CLS485.MTH6741(notification0, 5555);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

