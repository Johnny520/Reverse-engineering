// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS6;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS565;
import b.ˆʿ.CLS44;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS91;
import b.ˈˈ.CLS94;
import b.ˊﾞ.CLS101;
import b.ˑٴ.CLS848;
import b.יﹳ.CLS166;
import b.ـˏ.CLS169;
import b.ـˏ.CLS894;
import b.ٴـ.CLS896.CLS170;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS211;
import b.ᵔʾ.CLS1228;
import b.ⁱʾ.CLS323;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS344;
import b.ⁱʾ.CLS366;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞᐧ.CLS557;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class CLS1279 implements CLS6, CLS7, CLS16, CLS17, CLS39, CLS379, CLS516 {
    public final int FLD3487;
    public final Object FLD3488;
    public final Object FLD3489;
    public final Object FLD3490;

    public CLS1279(Activity activity0, Object object0, Object object1, int v) {
        this.FLD3487 = v;
        this.FLD3489 = activity0;
        this.FLD3488 = object0;
        this.FLD3490 = object1;
        super();
    }

    public CLS1279(CLS1629 ⁱˉ0, CLS1621 ˎᵢ0, Activity activity0) {
        this.FLD3487 = 1;
        super();
        this.FLD3488 = ⁱˉ0;
        this.FLD3490 = ˎᵢ0;
        this.FLD3489 = activity0;
    }

    public CLS1279(Object object0, Object object1, Object object2, int v) {
        this.FLD3487 = v;
        this.FLD3488 = object0;
        this.FLD3489 = object1;
        this.FLD3490 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Object object0 = this.FLD3490;
        Object object1 = this.FLD3488;
        Object object2 = this.FLD3489;
        switch(this.FLD3487) {
            case 4: {
                CLS31.MTH995(((Activity)object2), ((CLS12)new CLS1228(((String)object1), ((String[])object0), ((Activity)object2), 10)), ((CLS3)new CLS1471(((String)object1), ((String[])object0), 6)), CLS31.MTH1008().getAbsolutePath(), CLS31.MTH1008().getAbsolutePath());
                return;
            }
            case 5: {
                if(((CLS557[])object1)[0] == null) {
                    ((CLS557[])object1)[0] = CLS101.MTH1947(CLS462.FLD4511, CLS462.FLD4513, ((String[])object2)[0]);
                }
                for(Object object3: CLS101.MTH1944(((CLS557[])object1)[0], CLS27.MTH895().MTH927(60, "audio_extract_split"))) {
                    Object[] arr_object = {new CLS170(((CLS169)(((CLS894)object3))), ((String)object0))};
                    CLS21.FLD76.MTH818("sendMessageForwardItem", arr_object);
                }
                return;
            }
            case 8: {
                String s = (String)object1;
                CLS12 ᵔʾ0 = (CLS12)object2;
                CLS3 ˆٴ0 = (CLS3)object0;
                try {
                    byte[] arr_b = CLS432.MTH6171(s);
                    if(arr_b != null) {
                        ᵔʾ0.MTH791(arr_b);
                        return;
                    }
                    if(ˆٴ0 != null) {
                        ˆٴ0.MTH774();
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 10: {
                CLS6 ˑٴ0 = (CLS6)object0;
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for(int v = 0; v < ((List)object1).size(); ++v) {
                    Object object4 = CLS182.MTH3492(4100876564977996597L, ((List)object1).get(v));
                    String s1 = (String)CLS166.MTH3192(((Class)object2), CLS27.MTH897("imageMethod6"), new Object[]{object4});
                    if(CLS66.MTH1463(s1)) {
                        arrayList0.add(s1);
                    }
                    else {
                        arrayList2.add(object4);
                        arrayList1.add(s1);
                    }
                }
                if(!arrayList2.isEmpty()) {
                    CLS466.MTH6538(arrayList2, arrayList1, null, ((CLS6)new CLS1397(ˑٴ0, ((List)object1), 0)));
                    return;
                }
                try {
                    ˑٴ0.MTH783(arrayList0);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 13: {
                List list0 = (List)object1;
                CLS3 ˆٴ1 = (CLS3)object0;
                try {
                    for(Object object5: list0) {
                        CLS166.MTH3195(CLS166.MTH3195(object2, CLS27.MTH897("delMethod8"), new Object[0]), CLS27.MTH897("delMethod9"), new Object[]{((String)object5)});
                    }
                    if(ˆٴ1 != null) {
                        ˆٴ1.MTH774();
                        return;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                CLS166.MTH3195(CLS166.MTH3195(object1, CLS27.MTH897("delMethod8"), new Object[0]), CLS27.MTH897("delMethod9"), new Object[]{((String)object2)});
                if(((CLS3)object0) != null) {
                    ((CLS3)object0).MTH774();
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        long v1;
        Object object0 = this.FLD3490;
        Object object1 = this.FLD3489;
        Object object2 = this.FLD3488;
        if(this.FLD3487 == 0) {
            int v = CLS523.MTH7137(15);
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            ((CLS1622)object2).MTH800(CLS27.MTH889("chatroom_lbl"));
            CLS1629 ⁱˉ0 = new CLS1629(((Activity)object1));
            ⁱˉ0.MTH7381("prepend");
            ⁱˉ0.MTH7381("append");
            ⁱˉ0.MTH7381("replace");
            ⁱˉ0.FLD5356 = new CLS1511(4);
            ((CLS1635)object0).MTH800(CLS27.MTH889("auto_append_number"));
            CLS1623 יᐧ0 = new CLS1623(((Activity)object1));
            יᐧ0.MTH7289(new Object[]{((CLS1622)object2), ⁱˉ0, ((CLS1635)object0)});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
            switch(CLS27.MTH895().MTH927(0, "renameRemarkType")) {
                case 0: {
                    v1 = 4100823109815030581L;
                    break;
                }
                case 1: {
                    v1 = 0x38E90CEC2B3CD335L;
                    break;
                }
                case 2: {
                    v1 = 4100823174239540021L;
                    break;
                }
                default: {
                    return;
                }
            }
            ⁱˉ0.MTH7375(CLS370.MTH5289(v1));
            return;
        }
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        CLS29 ˎᵢ0 = CLS27.MTH895();
        int v2 = CLS523.MTH7137(10);
        ((CLS1629)object2).MTH7381("radio_male");
        ((CLS1629)object2).MTH7381("radio_female");
        ((CLS1629)object2).MTH7381("radio_all");
        ((CLS1629)object2).MTH7375("radio_all");
        ((CLS1621)object0).MTH800(CLS27.MTH889("delay"));
        ((CLS1621)object0).MTH7268(((long)CLS412.MTH6005(25000, "nearby_friend_accept_delay")));
        ((CLS1621)object0).FLD5242 = new CLS1473(ˎᵢ0, 6);
        CLS1623 יᐧ1 = new CLS1623(((Activity)object1));
        יᐧ1.MTH7289(new Object[]{((CLS1629)object2), ((CLS1621)object0)});
        CLS523.MTH7154(linearLayout1, ((CLS18)יᐧ1), v2);
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS518$CLS516
    public final void MTH7045(Bitmap bitmap0) {
        Intent intent0 = (Intent)this.FLD3488;
        String s = (String)this.FLD3489;
        String s1 = (String)this.FLD3490;
        Bundle bundle0 = new Bundle();
        if(bitmap0 != null) {
            byte[] arr_b = CLS518.MTH7054(bitmap0);
            intent0.putExtra("Ksnsupload_imgbuf", arr_b);
            bundle0.putByteArray("_wxobject_thumbdata", arr_b);
        }
        bundle0.putString("_wxmusicobject_musicUrl", s);
        bundle0.putString("_wxobject_title", s1);
        bundle0.putInt("_wxapi_command_type", 2);
        bundle0.putString("_wxobject_identifier_", "com.tencent.mm.sdk.openapi.WXMusicObject");
        intent0.putExtra("Ksnsupload_timeline", bundle0);
        intent0.putExtra("ksnsis_music", true);
        intent0.putExtra("wexposed_wf", true);
        if(!CLS66.MTH1450("sns", ".ui.SnsUploadUI", intent0)) {
            Activity activity0 = CLS404.MTH5891();
            intent0.setClassName(activity0, CLS27.MTH897("SnsUploadUI"));
            activity0.startActivity(intent0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS6
    public final void MTH783(ArrayList arrayList0) {
        CLS94 ⁱˉ0 = (CLS94)this.FLD3489;
        CLS6 ˑٴ0 = (CLS6)this.FLD3490;
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = CLS66.MTH1465(((List)this.FLD3488));
        for(int v = 0; v < arrayList2.size(); ++v) {
            try {
                String s = new File(CLS31.MTH1038(CLS27.MTH900()), "WechatForwarder_" + Long.toHexString(System.currentTimeMillis()) + "_" + v).getAbsolutePath();
                arrayList1.add(s);
                Bitmap bitmap0 = CLS518.MTH7060(new CLS69(((String)arrayList2.get(v))).MTH1563());
                if(bitmap0 != null) {
                    Bitmap bitmap1 = CLS518.MTH7057(bitmap0, ⁱˉ0);
                    CLS518.MTH7058(new File(s), bitmap1);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        if(ˑٴ0 != null) {
            try {
                ˑٴ0.MTH783(arrayList1);
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        Object object0 = this.FLD3490;
        Object object1 = this.FLD3488;
        Object object2 = this.FLD3489;
        switch(this.FLD3487) {
            case 3: {
                CLS1506 ٴʿ0 = new CLS1506(((Activity)object2), ((CLS557[])object1), ((String[])object0), s, 7);
                CLS40.FLD157.MTH1124(((CLS39)ٴʿ0));
                return;
            }
            case 6: {
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS848(((ContentValues)object1), s, ((JSONObject)object2), ((CLS335)object0), 22)));
                }
                return;
            }
            default: {
                ((CLS91)object1).FLD385 = s;
                ((CLS44)object2).MTH1182(((CLS91)object1));
                ((CLS344)object0).notifyDataSetChanged();
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        long v2;
        long v1;
        int v;
        CLS425 ˊﹳ0 = (CLS425)this.FLD3488;
        Activity activity0 = (Activity)this.FLD3489;
        String s = (String)this.FLD3490;
        ˊﹳ0.getClass();
        switch(CLS182.MTH3489(0x38EAC7072B3CD335L, new StringBuilder(), object0)) {
            case "add_to_chatroom_tags": {
                v = 10;
                break;
            }
            case "block": {
                v = 5;
                break;
            }
            case "delete": {
                v = 0;
                break;
            }
            case "delete_contact": {
                v = 12;
                break;
            }
            case "invite_member": {
                v = 13;
                break;
            }
            case "moments": {
                v = 11;
                break;
            }
            case "move_out": {
                v = 8;
                break;
            }
            case "move_to": {
                v = 9;
                break;
            }
            case "remark": {
                v = 14;
                break;
            }
            case "remove_sticky_bottom": {
                v = 4;
                break;
            }
            case "remove_sticky_top": {
                v = 3;
                break;
            }
            case "set_as_read": {
                v = 6;
                break;
            }
            case "set_as_unread": {
                v = 7;
                break;
            }
            case "sticky_bottom": {
                v = 2;
                break;
            }
            case "sticky_top": {
                v = 1;
                break;
            }
            case "toggle_mute": {
                v = 15;
                break;
            }
            case "toggle_star_contact": {
                v = 16;
                break;
            }
            default: {
                v = -1;
            }
        }
        CLS79 ˎᵢ0 = ˊﹳ0.FLD4091;
        String s1 = ˊﹳ0.FLD4088;
        switch(v) {
            case 0: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1282(ˊﹳ0, s)));
                return;
            }
            case 1: {
                CLS323 ˈˈ0 = ˊﹳ0.FLD4096;
                ˈˈ0.FLD3287.add(s);
                ˈˈ0.MTH5050();
                v1 = 4101306332290536245L;
                goto label_93;
            }
            case 2: {
                CLS323 ˈˈ1 = ˊﹳ0.FLD4096;
                ˈˈ1.FLD3292.add(s);
                ˈˈ1.MTH5050();
                v1 = 4101306379535176501L;
            label_93:
                String s3 = CLS370.MTH5289(v1);
                ˎᵢ0.getClass();
                ˎᵢ0.MTH1645(s1 + s3, s);
                return;
            }
            case 3: {
                CLS323 ˈˈ2 = ˊﹳ0.FLD4096;
                ˈˈ2.FLD3287.remove(s);
                ˈˈ2.MTH5050();
                v2 = 4101306439664718645L;
                goto label_106;
            }
            case 4: {
                CLS323 ˈˈ3 = ˊﹳ0.FLD4096;
                ˈˈ3.FLD3292.remove(s);
                ˈˈ3.MTH5050();
                v2 = 4101305937153545013L;
            label_106:
                String s4 = CLS370.MTH5289(v2);
                ˎᵢ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    ArrayList arrayList1 = new ArrayList();
                    arrayList1.add(s);
                    ˎᵢ0.MTH1618(s1 + s4, arrayList1);
                    return;
                }
                break;
            }
            case 5: {
                CLS21.FLD76.MTH818("showBlacklistAddMemberDialog", new Object[]{s, null});
                return;
            }
            case 6: {
                CLS66.MTH1408(s, new CLS1467(ˊﹳ0, 1));
                return;
            }
            case 7: {
                Class class0 = CLS27.MTH894("dbClass1");
                if(class0 != null) {
                    try {
                        CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("delMethod8"), new Object[0]), CLS27.MTH897("markReadMethod4"), new Object[]{s});
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                ˊﹳ0.FLD4096.MTH5050();
                return;
            }
            case 8: {
                ˎᵢ0.MTH1620(s1, s);
                ˊﹳ0.FLD4096.MTH5046(s);
                ˊﹳ0.FLD4096.notifyDataSetChanged();
                CLS404.MTH5896(s1, ˊﹳ0.FLD4096.MTH5051(), null);
                return;
            }
            case 9: {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(s);
                if(s1.startsWith("wx__c_")) {
                    CLS403.MTH5870(activity0, arrayList0, s1, ((CLS12)new CLS1324(ˊﹳ0, arrayList0, 0)), false);
                    return;
                }
                CLS403.MTH5872(false, activity0, arrayList0, ((CLS12)new CLS1324(ˊﹳ0, arrayList0, 1)));
                return;
            }
            case 10: {
                CLS403.MTH5866(activity0, s);
                return;
            }
            case 11: {
                CLS404.MTH5895(activity0, s);
                return;
            }
            case 12: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1587(ˊﹳ0, s)));
                break;
            }
            case 13: {
                CLS426.MTH6117(s);
                return;
            }
            case 14: {
                String s2 = CLS371.FLD3470.MTH5323(s);
                CLS523.MTH7165(activity0, CLS27.MTH889("remark"), "", s2, 1, ((CLS16)new CLS565(14, s2, s)));
                return;
            }
            case 15: {
                CLS372.MTH5412(s, !CLS372.MTH5396(s));
                CLS79.FLD292.MTH1633();
                return;
            }
            case 16: {
                CLS66.MTH1368(s, !CLS66.MTH1392(s));
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS366 ﾞᐧ0 = (CLS366)this.FLD3488;
        CLS8 ـˏ0 = (CLS8)this.FLD3490;
        CLS1624 יﹳ0 = new CLS1624(((Activity)this.FLD3489));
        יﹳ0.FLD5274 = new CLS1599(ﾞᐧ0, 5);
        יﹳ0.MTH7302();
        יﹳ0.MTH7303(ﾞᐧ0);
        יﹳ0.FLD5276 = false;
        CLS1623 יᐧ0 = new CLS1623(((Activity)this.FLD3489));
        יᐧ0.MTH7296(יﹳ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(3));
        if(ـˏ0 != null) {
            יﹳ0.MTH7301(new CLS211(ﾞᐧ0, ـˏ0, 6));
        }
    }
}

