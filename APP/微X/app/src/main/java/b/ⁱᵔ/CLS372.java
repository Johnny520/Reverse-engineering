// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import b.ʻˑ.CLS1;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS25.CLS24;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS55;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS92;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1627;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class CLS372 {
    public static boolean MTH5396(String s) {
        try {
            return CLS426.MTH6126(s) ? CLS371.FLD3470.MTH5367(s) : CLS371.FLD3470.MTH5355(s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH5397(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            if(!CLS404.MTH5909("") && !CLS372.MTH5396("")) {
                arrayList1.add("");
            }
        }
        return arrayList1;
    }

    public static ArrayList MTH5398(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            String s = (String)object0;
            if(!CLS404.MTH5909(s) && !CLS372.MTH5396(s)) {
                arrayList1.add(s);
            }
        }
        return arrayList1;
    }

    // 此方法包含解密的字符串
    public static void MTH5399(String s, CLS1 ʾᵢ0) {
        try {
            if(CLS371.FLD3470.MTH5382(s)) {
                return;
            }
            LinkedList linkedList0 = new LinkedList();
            linkedList0.add(s);
            LinkedList linkedList1 = new LinkedList();
            linkedList1.add(3);
            CLS66.MTH1460(linkedList0, linkedList1);
            CLS21.FLD76.MTH818("onAcceptListener", new Object[]{s, ʾᵢ0});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 中等(70)
    // 此方法包含解密的字符串
    public static boolean MTH5400(String s) {
        return !TextUtils.isEmpty(s) && (s.startsWith("gh_") || s.equals("weixin"));
    }

    // 此方法包含解密的字符串
    public static void MTH5401(Activity activity0, String s, String s1) {
        String s2 = CLS371.FLD3470.MTH5343(s);
        boolean z = !TextUtils.isEmpty(s2) && s2.equals(CLS27.MTH904());
        Intent intent0 = new Intent();
        intent0.putExtra("Contact_Mobile_MD5", "");
        intent0.putExtra("Contact_RoomNickname", "");
        intent0.putExtra("Contact_ChatRoomId", s);
        intent0.putExtra("room_name", s);
        intent0.putExtra("Contact_User", s1);
        intent0.putExtra("Is_RoomOwner", z);
        intent0.putExtra("CONTACT_INFO_UI_SOURCE", 3);
        intent0.putExtra("Contact_Scene", 14);
        if(!CLS66.MTH1450("profile", ".ui.ContactInfoUI", intent0)) {
            intent0.setClassName(activity0, CLS27.MTH897("ContactInfoUI"));
            activity0.startActivity(intent0);
        }
    }

    // 此方法包含解密的字符串
    public static Bitmap MTH5402(int v, int v1, String s) {
        String s1 = CLS27.MTH895().MTH925(CLS182.MTH3484(4101186214940169013L, new StringBuilder(), s), "");
        Bitmap bitmap0 = null;
        if(!TextUtils.isEmpty(s1)) {
            File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), CLS182.MTH3484(4101186300839514933L, new StringBuilder(), s));
            if(CLS31.MTH1001(file0)) {
                String s2 = file0.getAbsolutePath();
                if(!TextUtils.isEmpty(s2)) {
                    HashMap hashMap0 = CLS518.FLD5082;
                    if(hashMap0.containsKey(s2)) {
                        bitmap0 = (Bitmap)hashMap0.get(s2);
                        if(bitmap0 == null || bitmap0.isRecycled()) {
                            bitmap0 = CLS518.MTH7074(v, v1, s2);
                            hashMap0.put(s2, bitmap0);
                            return bitmap0;
                        }
                    }
                    else {
                        bitmap0 = CLS518.MTH7074(v, v1, s2);
                        hashMap0.put(s2, bitmap0);
                    }
                }
                return bitmap0;
            }
            if(CLS31.MTH1024(s1)) {
                Bitmap bitmap1 = CLS518.MTH7072(v, v1, s1);
                CLS518.MTH7058(file0, bitmap1);
                return bitmap1;
            }
            return null;
        }
        CLS55 ᐧⁱ0 = (CLS55)CLS40.FLD157.MTH1118(CLS55.class);
        StringBuilder stringBuilder0 = CLS182.MTH3483(s);
        stringBuilder0.append("_custom_avatar");
        String s3 = stringBuilder0.toString();
        ᐧⁱ0.getClass();
        if(!TextUtils.isEmpty(s3)) {
            HashMap hashMap1 = ᐧⁱ0.FLD176;
            if(hashMap1.containsKey(s3)) {
                Bitmap bitmap2 = (Bitmap)hashMap1.get(s3);
                if(bitmap2 != null && !bitmap2.isRecycled()) {
                    return bitmap2;
                }
            }
            CLS24 ˉᐧ$ˆٴ0 = ᐧⁱ0.FLD177;
            if(ˉᐧ$ˆٴ0 == null) {
                CLS92 ⁱʽ0 = CLS25.FLD90;
                if(ⁱʽ0.MTH1745("2" + s3)) {
                    bitmap0 = (Uri)ⁱʽ0.MTH1744("2" + s3);
                }
                else {
                    bitmap0 = (Uri)CLS21.FLD76.MTH816("core", "getModuleFileUri", new Object[]{2, s3});
                    ⁱʽ0.MTH1746("2" + s3, bitmap0);
                }
            }
            else {
                String s4 = ˉᐧ$ˆٴ0.MTH855(s3);
                if(!TextUtils.isEmpty(s4)) {
                    bitmap0 = CLS25.MTH861(ˉᐧ$ˆٴ0.FLD87, s4, ˉᐧ$ˆٴ0.FLD89);
                }
            }
            bitmap0 = CLS518.MTH7056(((Uri)bitmap0), 0x60, 0x60);
            hashMap1.put(s3, bitmap0);
        }
        return bitmap0;
    }

    public static boolean MTH5403(ImageView imageView0, String s) {
        try {
            CLS66.MTH1461(imageView0, s);
            return true;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH5404(String s, ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(CLS426.MTH6126("") || CLS372.MTH5400("")) {
            }
            else if(TextUtils.isEmpty(s)) {
                arrayList1.add(ˊﾞ0);
            }
            else {
                String s1 = ˊﾞ0.FLD277;
                if(TextUtils.isEmpty(s1)) {
                    s1 = CLS66.MTH1519("");
                    ˊﾞ0.FLD277 = s1;
                }
                if(s1.contains(s)) {
                    arrayList1.add(ˊﾞ0);
                }
            }
        }
        return arrayList1;
    }

    public static void MTH5405(ArrayList arrayList0) {
        try {
            Collections.sort(arrayList0, Comparator.comparing(new CLS521(0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static boolean MTH5406(String s) {
        return s.endsWith("@openim");
    }

    public static String MTH5407() {
        String s = CLS371.FLD3470.MTH5372();
        return TextUtils.isEmpty(s) ? CLS27.MTH904() : s;
    }

    // 此方法包含解密的字符串
    public static void MTH5408(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Cursor cursor0 = CLS371.FLD3470.MTH5299(s);
        if(cursor0 == null) {
            return;
        }
        if(cursor0.moveToFirst() && cursor0.getString(cursor0.getColumnIndex("conRemark")).equals(s1)) {
            cursor0.close();
            return;
        }
        if(cursor0.moveToFirst()) {
            Class class0 = CLS27.MTH894("contactModel");
            Class class1 = CLS27.MTH894("SetRemarkClass");
            if(class0 != null && class1 != null) {
                Object object0 = CLS166.MTH3188(class0, new Object[0]);
                CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                CLS166.MTH3192(class1, CLS27.MTH897("remarkMethod"), new Object[]{object0, s1});
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
    }

    // 此方法包含解密的字符串
    public static void MTH5409(Activity activity0, ArrayList arrayList0, boolean z, boolean z1) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ArrayList arrayList1 = new ArrayList();
            try {
                String s = CLS27.MTH904();
                CLS412.MTH6016(CLS412.MTH6005(5000, "delete_contact_delay"), arrayList0.size(), ((CLS411)new CLS1329(arrayList0, z1, arrayList1, s, z, activity0)), new CLS1627(6, arrayList1));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 去混淆评级： 高(340)
    // 此方法包含解密的字符串
    public static boolean MTH5410(String s) {
        return !TextUtils.isEmpty(s) && CLS502.MTH6943(s, new String[]{"filehelper", "qqmail", "floatbottle", "shakeapp", "medianote", "newsapp", "facebookapp", "qqfriend", "feedsapp", "voipapp", "officialaccounts", "voicevoipapp", "linkedinplugin", "notifymessage", "appbrandcustomerservicemsg", "fmessage"});
    }

    public static Bitmap MTH5411(String s) {
        Bitmap bitmap0 = null;
        try {
            bitmap0 = CLS66.MTH1372(s);
            if(bitmap0 == null) {
                ImageView imageView0 = new ImageView(CLS27.MTH900());
                if(CLS372.MTH5403(imageView0, s)) {
                    imageView0.buildDrawingCache();
                    Bitmap bitmap1 = imageView0.getDrawingCache();
                    if(bitmap1 == null) {
                        try {
                            bitmap1 = ((BitmapDrawable)imageView0.getDrawable()).getBitmap();
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                    bitmap0 = bitmap1;
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return bitmap0 == null ? CLS404.MTH5887() : bitmap0;
    }

    public static void MTH5412(String s, boolean z) {
        if(z == CLS372.MTH5396(s)) {
            return;
        }
        if(CLS426.MTH6126(s)) {
            CLS66.MTH1445(s, z);
            return;
        }
        SharedPreferences sharedPreferences0 = CLS27.MTH885();
        CLS371.FLD3470.getClass();
        try {
            Cursor cursor0 = CLS371.FLD3470.MTH5299(s);
            if(cursor0 != null) {
                if(cursor0.moveToFirst()) {
                    CLS66.MTH1401(cursor0, z, sharedPreferences0);
                }
                cursor0.close();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public static int MTH5413(String s) {
        switch(s) {
            case "chatroom": {
                return 14;
            }
            case "email": {
                return 2;
            }
            case "friendcard": {
                return 17;
            }
            case "lbsroom": {
                return 44;
            }
            case "mobile_number": {
                return 15;
            }
            case "nearby": {
                return 18;
            }
            case "neigbor": {
                return 18;
            }
            case "phone": {
                return 13;
            }
            case "public_account": {
                return 34;
            }
            case "qq": {
                return 1;
            }
            case "qq_friend": {
                return 12;
            }
            case "radar": {
                return 0x30;
            }
            case "request": {
                return 3;
            }
            case "scan": {
                return 30;
            }
            case "shake": {
                return 29;
            }
            case "unknown": {
                return 16;
            }
            case "verify": {
                return 5;
            }
            default: {
                return 16;
            }
        }
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH5414(AbstractCollection abstractCollection0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: abstractCollection0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!CLS404.MTH5909("")) {
                hashMap0.put("", ˊﾞ0);
            }
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = CLS371.FLD3470.MTH5377();
        HashSet hashSet0 = new HashSet();
        for(Object object1: arrayList1) {
            String s = (String)object1;
            if(hashMap0.containsKey(s) && !CLS404.MTH5909(s)) {
                hashSet0.add(s);
                arrayList0.add(((CLS78)hashMap0.get(s)));
            }
        }
        HashSet hashSet1 = new HashSet();
        for(Object object2: abstractCollection0) {
            CLS78 ˊﾞ1 = (CLS78)object2;
            if(!hashSet0.contains("") && !hashSet1.contains("")) {
                hashSet1.add("");
                arrayList0.add(ˊﾞ1);
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH5415(int v, ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(CLS426.MTH6126("") || CLS372.MTH5400("")) {
            }
            else if(v == -1) {
                arrayList1.add(ˊﾞ0);
            }
            else {
                int v1 = ˊﾞ0.FLD278;
                if(v1 == -1) {
                    v1 = CLS66.MTH1499("");
                    ˊﾞ0.FLD278 = v1;
                }
                if(v1 == v) {
                    arrayList1.add(ˊﾞ0);
                }
            }
        }
        return arrayList1;
    }

    // 此方法包含解密的字符串
    public static void MTH5416(Activity activity0, String s) {
        Intent intent0 = new Intent();
        intent0.putExtra("Contact_Mobile_MD5", "");
        intent0.putExtra("Contact_User", s);
        intent0.putExtra("CONTACT_INFO_UI_SOURCE", 2);
        if(!CLS66.MTH1450("profile", ".ui.ContactInfoUI", intent0)) {
            intent0.setClassName(activity0, CLS27.MTH897("ContactInfoUI"));
            activity0.startActivity(intent0);
        }
    }

    // 此方法包含解密的字符串
    // This method was un-flattened
    public static String MTH5417(String s) {
        String s2;
        String[] arr_s = CLS502.MTH6941(s);
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            switch(s1) {
                case "__ANY__": {
                    s2 = CLS27.MTH889(CLS370.MTH5289(4101206104933716789L));
                    break;
                }
                case "__FRIEND__": {
                    s2 = CLS27.MTH889(CLS370.MTH5289(4101206706229138229L));
                    break;
                }
                default: {
                    s2 = CLS371.FLD3470.MTH5316(s1);
                }
            }
            if(!TextUtils.isEmpty(s2)) {
                arrayList0.add(s2);
            }
        }
        return TextUtils.join(",", arrayList0);
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static String MTH5418(String s, String s1) {
        return CLS500.FLD4928.MTH6895("friend_request_type") ? CLS27.MTH895().MTH925(s, s1) : s1;
    }
}

