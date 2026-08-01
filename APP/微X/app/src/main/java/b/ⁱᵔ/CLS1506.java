// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS566;
import b.ʾᵢ.CLS575;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS44;
import b.ˆʿ.CLS53;
import b.ˆʿ.CLS62;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS91;
import b.ˑٴ.CLS651;
import b.ᐧˉ.CLS1043;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS200;
import b.ᐧˉ.CLS204;
import b.ᐧˉ.CLS220;
import b.ᐧˉ.CLS954;
import b.ᵔʾ.CLS279;
import b.ⁱʾ.CLS1272;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS344;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1627;
import b.ﾞˎ.CLS1629.CLS548;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS528;
import b.ﾞᐧ.CLS557;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class CLS1506 implements CLS16, CLS17, CLS39, CLS379, CLS548 {
    public final int FLD4576;
    public final Object FLD4577;
    public final Object FLD4578;
    public final Object FLD4579;
    public final Object FLD4580;

    public CLS1506(CLS1629 ⁱˉ0, CLS1620 ˊˏ0, CLS366 ﾞᐧ0, ArrayList arrayList0) {
        this.FLD4576 = 5;
        super();
        this.FLD4579 = ⁱˉ0;
        this.FLD4580 = ˊˏ0;
        this.FLD4577 = ﾞᐧ0;
        this.FLD4578 = arrayList0;
    }

    public CLS1506(Object object0, Object object1, Object object2, Object object3, int v) {
        this.FLD4576 = v;
        this.FLD4579 = object0;
        this.FLD4578 = object1;
        this.FLD4580 = object2;
        this.FLD4577 = object3;
        super();
    }

    public CLS1506(ArrayList arrayList0, Object object0, Object object1, Object object2, int v) {
        this.FLD4576 = v;
        this.FLD4578 = arrayList0;
        this.FLD4579 = object0;
        this.FLD4580 = object1;
        this.FLD4577 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        StringBuilder stringBuilder5;
        long v8;
        StringBuilder stringBuilder1;
        int v5;
        int v2;
        long v1;
        Cursor cursor1;
        Object object0 = this.FLD4577;
        Object object1 = this.FLD4580;
        Object object2 = this.FLD4578;
        Object object3 = this.FLD4579;
        switch(this.FLD4576) {
            case 7: {
                CLS31.MTH995(((Activity)object3), ((CLS12)new CLS566(((Activity)object3), ((String)object0), ((CLS557[])object2), ((String[])object1))), ((CLS3)new CLS1568(((CLS557[])object2), ((String[])object1), ((String)object0), 0)), CLS31.MTH1008().getAbsolutePath(), CLS31.MTH1008().getAbsolutePath());
                return;
            }
            case 10: {
                ((CLS1622)object3).MTH7277(((String)object2));
                ((CLS1622)object1).MTH7277(((String)object0));
                return;
            }
            default: {
                ((CLS371)object3).getClass();
                SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                for(Object object4: ((ArrayList)object2)) {
                    ContentValues contentValues0 = (ContentValues)object4;
                    String s = contentValues0.getAsString("wxid");
                    String s1 = contentValues0.getAsString("nickname");
                    Cursor cursor0 = ((CLS371)object3).MTH5307(CLS34.MTH1079(4101289848206054197L, new StringBuilder(), s, 0x38EAB51D2B3CD335L), new String[]{((String)object1)});
                    long v = 0L;
                    if(cursor0 != null) {
                        if(cursor0.moveToFirst()) {
                            v = CLS34.MTH1076(0x38EAB53D2B3CD335L, cursor0);
                        }
                        if(!cursor0.isClosed()) {
                            cursor0.close();
                        }
                    }
                    if(s.equals(CLS27.MTH904())) {
                        cursor1 = ((CLS371)object3).MTH5307("SELECT * FROM message WHERE talker = ? AND isSend = 1", new String[]{((String)object1)});
                        v1 = v;
                    }
                    else {
                        v1 = v;
                        cursor1 = ((CLS371)object3).MTH5307(CLS34.MTH1079(4101290513925985077L, new StringBuilder(), s, 4101286429412086581L), new String[]{((String)object1)});
                    }
                    if(cursor1 == null) {
                        v2 = 0;
                    }
                    else {
                        int v3 = cursor1.moveToFirst() ? cursor1.getCount() : 0;
                        if(!cursor1.isClosed()) {
                            cursor1.close();
                        }
                        v2 = v3;
                    }
                    long v4 = CLS481.MTH6689(new Date()).getTime();
                    Cursor cursor2 = s.equals(CLS27.MTH904()) ? ((CLS371)object3).MTH5307("SELECT * FROM message WHERE talker = ? AND isSend = 1 AND createTime > " + v4, new String[]{((String)object1)}) : ((CLS371)object3).MTH5307("SELECT * FROM message WHERE talker = ? AND isSend = 0 AND content like \'" + s + ":%\' AND createTime > " + v4, new String[]{((String)object1)});
                    if(cursor2 == null) {
                        v5 = 0;
                    }
                    else {
                        int v6 = cursor2.moveToFirst() ? cursor2.getCount() : 0;
                        if(!cursor2.isClosed()) {
                            cursor2.close();
                        }
                        v5 = v6;
                    }
                    String s2 = CLS182.MTH3484(4101251756141105973L, CLS182.MTH3483(CLS34.MTH1079(4101251717486400309L, new StringBuilder(), s1, 0x38EA92B92B3CD335L)), s);
                    ContentValues contentValues1 = ((CLS371)object3).MTH5359(s);
                    if(contentValues1 != null && contentValues1.containsKey("alias")) {
                        String s3 = contentValues1.getAsString("alias");
                        if(!TextUtils.isEmpty(s3)) {
                            contentValues0.put("alias", s3);
                            StringBuilder stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(s2);
                            s2 = CLS182.MTH3484(4101252421861036853L, stringBuilder0, s3);
                        }
                    }
                    String s4 = CLS182.MTH3475(4101252430450971445L, CLS182.MTH3483(s2));
                    int v7 = CLS66.MTH1499(s);
                    String s5 = CLS66.MTH1519(s);
                    if(v7 != -1 || !TextUtils.isEmpty(s5)) {
                        String s6 = CLS182.MTH3475(4101252456220775221L, CLS182.MTH3483(s4));
                        switch(v7) {
                            case 1: {
                                stringBuilder1 = CLS182.MTH3483(s6);
                                stringBuilder1.append(CLS27.MTH889("radio_male"));
                                s6 = CLS182.MTH3475(0x38EA93742B3CD335L, stringBuilder1);
                                break;
                            }
                            case 2: {
                                stringBuilder1 = CLS182.MTH3483(s6);
                                stringBuilder1.append(CLS27.MTH889("radio_female"));
                                s6 = CLS182.MTH3475(4101252061083783989L, stringBuilder1);
                            }
                        }
                        if(!TextUtils.isEmpty(s5)) {
                            s6 = s6 + s5;
                        }
                        s4 = CLS182.MTH3475(0x38EA93092B3CD335L, CLS182.MTH3483(s6));
                    }
                    StringBuilder stringBuilder2 = CLS182.MTH3483(s4);
                    stringBuilder2.append("<br>");
                    stringBuilder2.append(CLS27.MTH889("totalMsg"));
                    stringBuilder2.append(": ");
                    stringBuilder2.append(v2);
                    stringBuilder2.append("<br>");
                    String s7 = stringBuilder2.toString();
                    if(v5 != 0) {
                        StringBuilder stringBuilder3 = CLS182.MTH3483(s7);
                        stringBuilder3.append(CLS27.MTH889("todayMsg"));
                        stringBuilder3.append(": ");
                        stringBuilder3.append(v5);
                        stringBuilder3.append("<br>");
                        s7 = stringBuilder3.toString();
                    }
                    if(v2 == 0) {
                        v8 = v1;
                    }
                    else {
                        StringBuilder stringBuilder4 = CLS182.MTH3483(s7);
                        stringBuilder4.append(CLS27.MTH889("lastMsg"));
                        stringBuilder4.append(": ");
                        v8 = v1;
                        stringBuilder4.append(simpleDateFormat0.format(new Date(v8)));
                        s7 = stringBuilder4.toString();
                    }
                    if(contentValues0.getAsBoolean("isOwner").booleanValue()) {
                        stringBuilder5 = CLS182.MTH3483(s7);
                        stringBuilder5.append("<br><i>");
                        stringBuilder5.append(CLS27.MTH889("chatroom_owner"));
                        s7 = CLS182.MTH3475(0x38EA93DF2B3CD335L, stringBuilder5);
                    }
                    else if(contentValues0.getAsBoolean("isMod").booleanValue()) {
                        stringBuilder5 = CLS182.MTH3483(s7);
                        stringBuilder5.append("<br><i>");
                        stringBuilder5.append(CLS27.MTH889("chatroom_moderator"));
                        s7 = CLS182.MTH3475(4101252610839597877L, stringBuilder5);
                    }
                    contentValues0.put("sex", v7);
                    contentValues0.put("location", s5);
                    contentValues0.put(CLS182.MTH3479(v2, contentValues0, CLS182.MTH3479(v2, contentValues0, "count", 0x38EA939D2B3CD335L), 0x38EA93A82B3CD335L), v8);
                    contentValues0.put("desc", s7);
                }
                if(((CLS3)object0) != null) {
                    CLS575 ⁱᵔ0 = new CLS575(((CLS3)object0), 7);
                    CLS40.FLD157.MTH1116(((CLS39)ⁱᵔ0));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        CLS1620 ˊˏ0 = (CLS1620)this.FLD4580;
        CLS366 ﾞᐧ0 = (CLS366)this.FLD4577;
        ArrayList arrayList0 = (ArrayList)this.FLD4578;
        int v = -1;
        switch(((CLS1629)this.FLD4579).MTH7373()) {
            case "none": {
                v = 0;
                break;
            }
            case "radio_female": {
                v = 2;
                break;
            }
            case "radio_male": {
                v = 1;
            }
        }
        int v1 = ˊˏ0.FLD5219.FLD5194;
        ﾞᐧ0.MTH5276(CLS372.MTH5415(v, CLS372.MTH5404((v1 == 0 ? "" : ((String)ˊˏ0.FLD5219.FLD5195.get(v1))), arrayList0)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Object object0 = this.FLD4577;
        Object object1 = this.FLD4580;
        Object object2 = this.FLD4578;
        Object object3 = this.FLD4579;
        switch(this.FLD4576) {
            case 1: {
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                CLS1624 יﹳ1 = new CLS1624(((Activity)object3));
                יﹳ1.FLD5274 = new CLS1043(((CLS369)object2), 11);
                יﹳ1.MTH7302();
                יﹳ1.MTH7303(((CLS369)object2));
                יﹳ1.MTH7301(new CLS200(((CLS12)object1), ((CLS369)object2), ((String)object0), 4));
                CLS523.MTH7147(linearLayout1, ((CLS18)יﹳ1), true);
                return;
            }
            case 3: {
                Menu menu0 = (Menu)arr_object[0];
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                CLS1592 ﹳי0 = new CLS1592(0, ((CLS369)object3), ((ArrayList)object2));
                CLS1627 ٴـ0 = new CLS1627(9, ((AlertDialog[])object1));
                CLS279.FLD2908.FLD2909.put("showContactLabelsDialog", ﹳי0);
                CLS525 ʻˑ0 = new CLS525(((Activity)object0), linearLayout2, menu0);
                ʻˑ0.MTH7187("delete", ((CLS3)new CLS954(((Activity)object0), ((ArrayList)object2), 3)));
                ʻˑ0.MTH7187("add", ((CLS3)new CLS651(((Activity)object0), 4)));
                ʻˑ0.MTH7188();
                CLS1624 יﹳ2 = new CLS1624(((Activity)object0));
                יﹳ2.FLD5274 = new CLS1043(((CLS369)object3), 15);
                יﹳ2.MTH7302();
                יﹳ2.MTH7303(((CLS369)object3));
                יﹳ2.MTH7301(new CLS200(((CLS369)object3), ((Activity)object0), ٴـ0, 5));
                יﹳ2.MTH7305(new CLS220(5, ((Activity)object0), ((CLS369)object3)));
                CLS523.MTH7147(linearLayout2, ((CLS18)יﹳ2), true);
                return;
            }
            case 4: {
                LinearLayout linearLayout3 = (LinearLayout)arr_object[1];
                for(Object object4: ((ArrayList)object2)) {
                    ContentValues contentValues0 = (ContentValues)object4;
                    contentValues0.put("type", 1);
                    String s = CLS27.MTH889(CLS370.MTH5289((((int)contentValues0.getAsInteger("sex")) == 1 ? 4101370258583769909L : 4101370280058606389L)));
                    String s1 = contentValues0.getAsString("nickname") + " (" + s + ")";
                    if(contentValues0.containsKey("place")) {
                        String s2 = contentValues0.getAsString("place");
                        if(!TextUtils.isEmpty(s2)) {
                            s1 = CLS182.MTH3484(0x38EAFEAB2B3CD335L, CLS182.MTH3483(s1), s2);
                        }
                    }
                    contentValues0.put("desc", s1);
                }
                CLS1635 ﾞᵎ1 = new CLS1635(((Activity)object3));
                ﾞᵎ1.MTH800(CLS27.MTH889("select_all"));
                ﾞᵎ1.MTH7438(new CLS499(((CLS338)object1), 1));
                CLS523.MTH7147(linearLayout3, ((CLS18)ﾞᵎ1), true);
                ((CLS1624)object0).MTH7303(((CLS338)object1));
                ((CLS1624)object0).FLD5276 = false;
                ((CLS1624)object0).MTH7301(new CLS488(((CLS338)object1), 2));
                CLS523.MTH7147(linearLayout3, ((CLS18)(((CLS1624)object0))), true);
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                ArrayList arrayList0 = (ArrayList)CLS21.FLD76.MTH836("getExportedRecords", new Object[0]);
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    CLS369 ﾞᵎ0 = new CLS369(((Activity)object3), new ArrayList(arrayList0));
                    ﾞᵎ0.FLD3463 = (String)object2;
                    CLS1624 יﹳ0 = new CLS1624(((Activity)object3));
                    יﹳ0.MTH7311();
                    יﹳ0.FLD5274 = new CLS1043(ﾞᵎ0, 20);
                    יﹳ0.MTH7302();
                    יﹳ0.MTH7303(ﾞᵎ0);
                    יﹳ0.MTH7308(5);
                    יﹳ0.MTH7301(new CLS200(ﾞᵎ0, ((CLS8)object1), ((AlertDialog[])object0), 11));
                    CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        Object object0 = this.FLD4577;
        Object object1 = this.FLD4580;
        Object object2 = this.FLD4578;
        Object object3 = this.FLD4579;
        switch(this.FLD4576) {
            case 0: {
                CLS43 ˆʿ0 = (CLS43)object3;
                ArrayList arrayList0 = (ArrayList)object2;
                ArrayList arrayList1 = (ArrayList)object1;
                CLS347 ᐧי0 = (CLS347)object0;
                try {
                    if(!TextUtils.isEmpty(s)) {
                        ˆʿ0.getClass();
                        ˆʿ0.MTH1158(s, "");
                        arrayList0.add(s);
                        CLS528 ʽי0 = new CLS528();
                        ʽי0.FLD5165 = s;
                        ʽי0.FLD5166 = "0";
                        arrayList1.add("");
                        ᐧי0.notifyDataSetChanged();
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 2: {
                String s1 = (String)object3;
                String s2 = (String)object2;
                ContentValues contentValues0 = (ContentValues)object1;
                CLS335 ˑٴ0 = (CLS335)object0;
                if(!TextUtils.isEmpty(s)) {
                    try {
                        int v = Integer.parseInt(s);
                        CLS53 ٴـ0 = (CLS53)CLS40.FLD157.MTH1118(CLS53.class);
                        ٴـ0.getClass();
                        ٴـ0.MTH1237(v, System.currentTimeMillis(), s1, s2);
                        contentValues0.put("COUNT", v);
                        contentValues0.put("TIME", System.currentTimeMillis());
                        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                        contentValues0.put("desc", "<b>" + CLS371.FLD3470.MTH5311(s2) + "</b><br><i>" + simpleDateFormat0.format(new Date(System.currentTimeMillis())) + "</i> (" + v + ")");
                        ˑٴ0.notifyDataSetChanged();
                        return;
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 6: {
                if(!TextUtils.isEmpty(s)) {
                    ContentValues contentValues1 = CLS62.FLD190.MTH1348(s.trim(), ((String)object3));
                    if(contentValues1 != null) {
                        contentValues1.put("desc", CLS426.MTH6119(contentValues1));
                        ((ArrayList)object2).add(contentValues1);
                        ((CLS1626)object1).MTH7325("" + ((ArrayList)object2).size());
                        ((CLS335)object0).notifyDataSetChanged();
                    }
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    CLS91 ᵔʾ0 = new CLS91(0, "", s, "_MOMENTS_SIGNATURES_");
                    ((ArrayList)object2).add(ᵔʾ0);
                    ((CLS44)object1).MTH1182(ᵔʾ0);
                    ((CLS344)object0).notifyDataSetChanged();
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS1635 ﾞᵎ0 = new CLS1635(((Activity)this.FLD4579));
        ﾞᵎ0.MTH800(CLS27.MTH889("select_all"));
        ﾞᵎ0.MTH7438(new CLS496(((CLS359)this.FLD4578), 4));
        CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
        ((CLS1624)this.FLD4580).MTH7311();
        ((CLS1624)this.FLD4580).FLD5274 = new CLS1272(((CLS359)this.FLD4578), 8);
        ((CLS1624)this.FLD4580).MTH7302();
        ((CLS1624)this.FLD4580).MTH7303(((CLS359)this.FLD4578));
        ((CLS1624)this.FLD4580).FLD5276 = false;
        ((CLS3)this.FLD4577).MTH774();
        CLS204 ˊʼ0 = new CLS204(((CLS359)this.FLD4578), 7);
        ((CLS1624)this.FLD4580).MTH7301(ˊʼ0);
        CLS514 ﹶـ0 = new CLS514(1, ((Activity)this.FLD4579), ((CLS359)this.FLD4578));
        ((CLS1624)this.FLD4580).MTH7305(ﹶـ0);
        CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1624)this.FLD4580))), true);
    }
}

