// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;

public final class CLS1161 implements CLS378 {
    public final int FLD2662;
    public final CLS359 FLD2663;
    public final Activity FLD2664;
    public final CLS244 FLD2665;
    public final ArrayList FLD2666;

    public CLS1161(CLS244 ᴵʻ0, Activity activity0, ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD2662 = v;
        this.FLD2665 = ᴵʻ0;
        this.FLD2664 = activity0;
        this.FLD2666 = arrayList0;
        this.FLD2663 = ⁱˉ0;
        super();
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS244 ᴵʻ0 = this.FLD2665;
        if(this.FLD2662 == 0) {
            Activity activity0 = this.FLD2664;
            ArrayList arrayList0 = this.FLD2666;
            CLS359 ⁱˉ0 = this.FLD2663;
            ᴵʻ0.getClass();
            ʻˑ0.MTH7187("text", ((CLS3)new CLS937(ᴵʻ0, activity0, arrayList0, ⁱˉ0, 0)));
            if(!ᴵʻ0.FLD2557.FLD164.isEmpty()) {
                ʻˑ0.MTH7187("mp3_response", ((CLS3)new CLS937(ᴵʻ0, activity0, arrayList0, ⁱˉ0, 1)));
            }
            ʻˑ0.MTH7187("img_response", ((CLS3)new CLS1183(ᴵʻ0, arrayList0, ⁱˉ0, 0)));
            ʻˑ0.MTH7187("multi_img", ((CLS3)new CLS1183(ᴵʻ0, arrayList0, ⁱˉ0, 1)));
            ʻˑ0.MTH7187("vid_response", ((CLS3)new CLS1183(ᴵʻ0, arrayList0, ⁱˉ0, 2)));
            if(CLS404.MTH5905()) {
                ʻˑ0.MTH7187("gif_response", ((CLS3)new CLS1183(ᴵʻ0, arrayList0, ⁱˉ0, 3)));
            }
            ʻˑ0.MTH7187("fav_item", ((CLS3)new CLS937(ᴵʻ0, activity0, arrayList0, ⁱˉ0, 2)));
            if(!ᴵʻ0.FLD2544 || (CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_REDPACKETS_"}) || CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_MONEYTRANSFER_"})) && ᴵʻ0.FLD2538.MTH6895("rp_keyword")) {
                ʻˑ0.MTH7187("chatroom_invite", ((CLS3)new CLS937(ᴵʻ0, activity0, arrayList0, ⁱˉ0, 3)));
            }
            ʻˑ0.MTH7187("friendcard", ((CLS3)new CLS937(ᴵʻ0, arrayList0, activity0, ⁱˉ0, 4)));
            if(CLS27.MTH902("WXFileObject") && !CLS182.MTH3470(4100669981346026293L)) {
                ʻˑ0.MTH7187("file", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 7)));
            }
            if(CLS27.MTH902("web_response")) {
                ʻˑ0.MTH7187("web_text", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 0)));
                ʻˑ0.MTH7187("web_img", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 1)));
                ʻˑ0.MTH7187("web_gif", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 2)));
                ʻˑ0.MTH7187("web_vid", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 3)));
                if(CLS27.MTH902("WXFileObject") && !CLS182.MTH3470(4100684055953855285L)) {
                    ʻˑ0.MTH7187("web_file", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 4)));
                }
            }
            if(CLS500.FLD4928.MTH6895("voice_manager")) {
                ʻˑ0.MTH7187("voice_manager", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 5)));
            }
            if(CLS21.FLD76.MTH830("hasTTS", new Object[0])) {
                ʻˑ0.MTH7187("tts", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 6)));
            }
            if(CLS27.MTH890("sendPatClass1")) {
                ʻˑ0.MTH7187("patmsg", ((CLS3)new CLS913(arrayList0, ⁱˉ0, 0)));
            }
            return;
        }
        Activity activity1 = this.FLD2664;
        ArrayList arrayList1 = this.FLD2666;
        CLS359 ⁱˉ1 = this.FLD2663;
        ᴵʻ0.getClass();
        ʻˑ0.MTH7187("text", ((CLS3)new CLS937(ᴵʻ0, activity1, arrayList1, ⁱˉ1, 5)));
        if(!ᴵʻ0.FLD2557.FLD164.isEmpty()) {
            ʻˑ0.MTH7187("mp3_response", ((CLS3)new CLS937(ᴵʻ0, activity1, arrayList1, ⁱˉ1, 6)));
        }
        ʻˑ0.MTH7187("img_response", ((CLS3)new CLS1183(ᴵʻ0, arrayList1, ⁱˉ1, 5)));
        ʻˑ0.MTH7187("multi_img", ((CLS3)new CLS1183(ᴵʻ0, arrayList1, ⁱˉ1, 6)));
        ʻˑ0.MTH7187("vid_response", ((CLS3)new CLS1183(ᴵʻ0, arrayList1, ⁱˉ1, 7)));
        if(CLS404.MTH5905()) {
            ʻˑ0.MTH7187("gif_response", ((CLS3)new CLS1183(ᴵʻ0, arrayList1, ⁱˉ1, 8)));
        }
        ʻˑ0.MTH7187("fav_item", ((CLS3)new CLS937(ᴵʻ0, activity1, arrayList1, ⁱˉ1, 7)));
        if(!ᴵʻ0.FLD2544 || (CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_REDPACKETS_"}) || CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_MONEYTRANSFER_"})) && ᴵʻ0.FLD2538.MTH6895("rp_keyword")) {
            ʻˑ0.MTH7187("chatroom_invite", ((CLS3)new CLS937(ᴵʻ0, activity1, arrayList1, ⁱˉ1, 8)));
        }
        ʻˑ0.MTH7187("friendcard", ((CLS3)new CLS937(ᴵʻ0, arrayList1, activity1, ⁱˉ1, 9)));
        if(CLS27.MTH902("WXFileObject") && !CLS182.MTH3470(4100678240568136501L)) {
            ʻˑ0.MTH7187("file", ((CLS3)new CLS1152(activity1, arrayList1, ⁱˉ1, 15)));
        }
        if(CLS27.MTH902("web_response")) {
            ʻˑ0.MTH7187("web_text", ((CLS3)new CLS1152(activity1, arrayList1, ⁱˉ1, 8)));
            ʻˑ0.MTH7187("web_img", ((CLS3)new CLS1152(activity1, arrayList1, ⁱˉ1, 9)));
            ʻˑ0.MTH7187("web_gif", ((CLS3)new CLS1152(activity1, arrayList1, ⁱˉ1, 10)));
            ʻˑ0.MTH7187("web_vid", ((CLS3)new CLS1152(activity1, arrayList1, ⁱˉ1, 11)));
            if(CLS27.MTH902("WXFileObject") && !CLS182.MTH3470(4100679121036432181L)) {
                ʻˑ0.MTH7187("web_file", ((CLS3)new CLS1152(activity1, arrayList1, ⁱˉ1, 12)));
            }
        }
        if(CLS500.FLD4928.MTH6895("voice_manager")) {
            ʻˑ0.MTH7187("voice_manager", ((CLS3)new CLS1152(activity1, arrayList1, ⁱˉ1, 13)));
        }
        if(CLS21.FLD76.MTH830("hasTTS", new Object[0])) {
            ʻˑ0.MTH7187("tts", ((CLS3)new CLS1152(activity1, arrayList1, ⁱˉ1, 14)));
        }
        if(CLS27.MTH890("sendPatClass1")) {
            ʻˑ0.MTH7187("patmsg", ((CLS3)new CLS913(arrayList1, ⁱˉ1, 1)));
        }
        ʻˑ0.MTH7187("random_response_group", ((CLS3)new CLS1183(ᴵʻ0, arrayList1, ⁱˉ1, 4)));
    }
}

