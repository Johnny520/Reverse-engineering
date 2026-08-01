// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import b.ʻˑ.CLS9;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˊﾞ.CLS613;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class CLS371 {
    public final HashSet FLD3465;
    public String FLD3466;
    public Object FLD3467;
    public final HashMap FLD3468;
    public HashSet FLD3469;
    public static final CLS371 FLD3470;
    public Object FLD3471;

    static {
        CLS371.FLD3470 = new CLS371();
    }

    // 此方法包含解密的字符串
    public CLS371() {
        new String("/*fkz*/");
        this.FLD3465 = new HashSet();
        this.FLD3468 = new HashMap();
    }

    // 此方法包含解密的字符串
    public final void MTH5292(String s, ArrayList arrayList0) {
        try {
            Cursor cursor0 = this.MTH5307("SELECT * FROM chatroom WHERE roomowner = ?", new String[]{s});
            if(cursor0 == null) {
                return;
            }
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                    if(!CLS502.MTH6934(null, new String[]{s1})) {
                        arrayList0.add(new CLS78(s1, this.MTH5316(s1)));
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH5293(String s, ArrayList arrayList0) {
        Cursor cursor0 = this.MTH5307(String.format(CLS27.MTH882("q_db38"), s), null);
        if(cursor0 == null) {
            return;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s1 = CLS182.MTH3472(0x38EAA4C32B3CD335L, cursor0);
                String s2 = CLS182.MTH3472(4101271607479948085L, cursor0);
                String s3 = CLS182.MTH3472(0x38EAA4D52B3CD335L, cursor0);
                if(!TextUtils.isEmpty(s3)) {
                    s2 = s3;
                }
                if(TextUtils.isEmpty(s2)) {
                    s2 = s1;
                }
                String s4 = CLS613.MTH1971(s2);
                if(!CLS426.MTH6126(s1) || this.MTH5383(s1)) {
                    arrayList0.add(new CLS78(s1, s4));
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        this.MTH5313(CLS27.MTH904(), arrayList0);
    }

    // 此方法包含解密的字符串
    public final void MTH5294(String s, ArrayList arrayList0) {
        try {
            Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db30"), null);
            if(cursor0 == null) {
                return;
            }
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                    if(!CLS502.MTH6934(null, new String[]{s1}) && CLS502.MTH6934(cursor0.getString(cursor0.getColumnIndex("memberlist")), new String[]{s})) {
                        arrayList0.add(new CLS78(s1, this.MTH5316(s1)));
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final HashSet MTH5295(String s) {
        Cursor cursor0 = this.MTH5307("select contactLabelIds from rcontact where username = ?", new String[]{s});
        HashSet hashSet0 = new HashSet();
        if(cursor0 == null) {
            return hashSet0;
        }
        if(cursor0.moveToFirst()) {
            String s1 = CLS182.MTH3472(0x38EAA0582B3CD335L, cursor0);
            if(s1.endsWith("\u0000")) {
                s1 = s1.replace("\u0000", "");
            }
            hashSet0.addAll(Arrays.asList(CLS502.MTH6941(s1)));
        }
        cursor0.close();
        return hashSet0;
    }

    // 此方法包含解密的字符串
    public final boolean MTH5296() {
        try {
            Object object0 = this.MTH5380();
            if(object0 != null) {
                return ((Boolean)CLS166.MTH3195(object0, "isOpen", new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final int MTH5297(String s) {
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db44"), new String[]{s});
        int v = -1;
        if(cursor0 == null) {
            return -1;
        }
        if(cursor0.moveToFirst()) {
            v = CLS182.MTH3490(0x38EAA0742B3CD335L, cursor0);
        }
        cursor0.close();
        return v;
    }

    // 此方法包含解密的字符串
    public final String MTH5298(String s) {
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db16"), new String[]{s});
        String s1 = null;
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.moveToFirst()) {
            s1 = CLS182.MTH3472(4101297377283724085L, cursor0);
        }
        cursor0.close();
        if(TextUtils.isEmpty(s1)) {
            s1 = this.MTH5311(s);
        }
        return CLS613.MTH1971(s1);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Cursor MTH5299(String s) {
        return this.MTH5307(CLS27.MTH882("q_db23"), new String[]{s});
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Cursor MTH5300(String s) {
        return this.MTH5307(CLS27.MTH882("q_db1"), new String[]{s});
    }

    // 此方法包含解密的字符串
    public final Object MTH5301() {
        Object object0 = null;
        if(this.FLD3471 == null) {
            if(CLS27.MTH890("CoreStorage_dbField")) {
                try {
                    Object object1 = CLS66.MTH1457();
                    if(object1 != null) {
                        object0 = CLS166.MTH3194(object1, CLS27.MTH897("CoreStorage_dbField"));
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            this.FLD3471 = object0;
        }
        return this.FLD3471;
    }

    public final boolean MTH5302(String s) {
        HashSet hashSet0 = this.FLD3465;
        if(hashSet0.contains(s)) {
            return true;
        }
        if(this.MTH5382(s)) {
            hashSet0.add(s);
            return true;
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final void MTH5303(ContentValues contentValues0, String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            if(this.MTH5354()) {
                Object object0 = this.MTH5301();
                if(object0 != null) {
                    ((Long)CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_insert"), new Object[]{s, s1, contentValues0, Boolean.FALSE})).longValue();
                    return;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            if(this.MTH5296()) {
                Object object1 = this.MTH5380();
                if(object1 != null) {
                    ((Long)CLS166.MTH3195(object1, "insert", new Object[]{s, s1, contentValues0})).longValue();
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public final String MTH5304(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = "";
        Cursor cursor0 = this.MTH5299(s);
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s1 = CLS182.MTH3472(0x38EABC7F2B3CD335L, cursor0);
        }
        cursor0.close();
        return s1;
    }

    // 此方法包含解密的字符串
    public final void MTH5305(String s, ArrayList arrayList0) {
        this.MTH5312(this.MTH5307(String.format(CLS27.MTH882("q_db32"), s), null), arrayList0);
    }

    // 此方法包含解密的字符串
    public final void MTH5306(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put(CLS182.MTH3496(4101253444063253301L, contentValues0, s, 0x38EA94502B3CD335L), 0x7FFFFFF1);
            contentValues0.put("ticket", s1);
            if(!TextUtils.isEmpty("AddContactAntispamTicket") && !TextUtils.isEmpty("userName")) {
                try {
                    if(this.MTH5354()) {
                        Object object0 = this.MTH5301();
                        if(object0 != null) {
                            ((Long)CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_replace"), new Object[]{"AddContactAntispamTicket", "userName", contentValues0})).longValue();
                            return;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                try {
                    if(this.MTH5296()) {
                        Object object1 = this.MTH5380();
                        if(object1 != null) {
                            ((Long)CLS166.MTH3195(object1, "replace", new Object[]{"AddContactAntispamTicket", "userName", contentValues0})).longValue();
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
            }
        }
    }

    public final Cursor MTH5307(String s, String[] arr_s) {
        return this.MTH5331(CLS182.MTH3484(4101291102336504629L, new StringBuilder(), s), arr_s);
    }

    // 此方法包含解密的字符串
    public final void MTH5308(String s, ArrayList arrayList0) {
        this.MTH5312(this.MTH5307(String.format(CLS27.MTH882("q_db33"), s), null), arrayList0);
    }

    // 此方法包含解密的字符串
    public final HashSet MTH5309() {
        HashSet hashSet0 = new HashSet();
        Cursor cursor0 = this.MTH5307("SELECT chatroomname,memberlist FROM chatroom", null);
        if(cursor0 == null) {
            return hashSet0;
        }
        String s = CLS27.MTH904();
        if(cursor0.moveToFirst()) {
            while(true) {
                if(CLS502.MTH6934(CLS182.MTH3472(4101297733766009653L, cursor0), new String[]{s})) {
                    hashSet0.add(cursor0.getString(cursor0.getColumnIndex("chatroomname")));
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return hashSet0;
    }

    // 此方法包含解密的字符串
    public final void MTH5310(String s, HashSet hashSet0) {
        try {
            Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db29"), new String[]{s});
            if(cursor0 == null) {
                return;
            }
            HashSet hashSet1 = new HashSet();
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                    if(CLS502.MTH6934(cursor0.getString(cursor0.getColumnIndex("memberlist")), new String[]{s}) && !hashSet1.contains(s1)) {
                        hashSet1.add(s1);
                        hashSet0.add(new CLS78(s1, this.MTH5316(s1)));
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final String MTH5311(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        Cursor cursor0 = this.MTH5299(s);
        if(cursor0 == null) {
            return s;
        }
        if(cursor0.moveToFirst()) {
            String s1 = CLS182.MTH3472(4101297209779999541L, cursor0);
            if(TextUtils.isEmpty(s1)) {
                s1 = CLS182.MTH3472(0x38EABC1F2B3CD335L, cursor0);
            }
            String s2 = CLS613.MTH1971(s1);
            if(!TextUtils.isEmpty(s2) || CLS426.MTH6126(s)) {
                s = s2;
            }
        }
        else {
            s = "";
        }
        cursor0.close();
        return s;
    }

    public final void MTH5312(Cursor cursor0, ArrayList arrayList0) {
        if(cursor0 == null) {
            return;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s = CLS182.MTH3472(4101273806503203637L, cursor0);
                String s1 = CLS182.MTH3472(4101273845157909301L, cursor0);
                String s2 = CLS182.MTH3472(0x38EAA6DE2B3CD335L, cursor0);
                if(!TextUtils.isEmpty(s2)) {
                    s1 = s2;
                }
                if(TextUtils.isEmpty(s1)) {
                    s1 = CLS426.MTH6126(s) ? this.MTH5316(s) : s;
                }
                String s3 = CLS613.MTH1971(s1);
                if(!CLS426.MTH6126(s) || this.MTH5383(s)) {
                    arrayList0.add(new CLS78(s, s3));
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
    }

    // 此方法包含解密的字符串
    public final void MTH5313(String s, AbstractCollection abstractCollection0) {
        try {
            Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db30"), null);
            if(cursor0 == null) {
                return;
            }
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                    if(CLS502.MTH6934(cursor0.getString(cursor0.getColumnIndex("memberlist")), new String[]{s})) {
                        abstractCollection0.add(new CLS78(s1, this.MTH5316(s1)));
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH5314(String s, AbstractCollection abstractCollection0) {
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db31"), null);
        if(cursor0 == null) {
            return;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s1 = CLS182.MTH3472(4101273106423534389L, cursor0);
                String s2 = CLS182.MTH3472(4101273145078240053L, cursor0);
                String s3 = CLS182.MTH3472(0x38EAA63B2B3CD335L, cursor0);
                if(!TextUtils.isEmpty(s3)) {
                    s2 = s3;
                }
                if(TextUtils.isEmpty(s2)) {
                    s2 = this.MTH5316(s1);
                }
                String s4 = CLS613.MTH1971(s2);
                if(!CLS426.MTH6126(s1) || this.MTH5383(s1)) {
                    abstractCollection0.add(new CLS78(s1, s4));
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        this.MTH5313(s, abstractCollection0);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Cursor MTH5315(String s) {
        return this.MTH5307(CLS27.MTH882("q_db2"), new String[]{s});
    }

    // 此方法包含解密的字符串
    public final String MTH5316(String s) {
        String s1 = this.MTH5311(s);
        if(!TextUtils.isEmpty(s1)) {
            return s1;
        }
        if(!CLS426.MTH6126(s)) {
            return s;
        }
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db18"), new String[]{s});
        if(cursor0 == null) {
            return s;
        }
        if(cursor0.moveToFirst()) {
            s1 = CLS182.MTH3472(4101299121040446261L, cursor0);
        }
        cursor0.close();
        return TextUtils.isEmpty(s1) ? s : CLS613.MTH1971(s1);
    }

    // 此方法包含解密的字符串
    public final long MTH5317(String s) {
        Cursor cursor0 = this.MTH5307("select flag from rconversation where username = ?", new String[]{s});
        long v = 0L;
        if(cursor0 == null) {
            return 0L;
        }
        if(cursor0.moveToFirst()) {
            v = cursor0.getLong(0);
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return v;
    }

    // 此方法包含解密的字符串
    public final void MTH5318(String s) {
        try {
            if(this.MTH5354()) {
                Object object0 = this.MTH5301();
                if(object0 != null) {
                    CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_execSQL"), new Object[]{"", s});
                    return;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            if(this.MTH5296()) {
                Object object1 = this.MTH5380();
                if(object1 != null) {
                    CLS166.MTH3195(object1, "execSQL", new Object[]{s});
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public final String MTH5319(long v) {
        String s = null;
        if(v == 0L) {
            return null;
        }
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db9") + v, null);
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.moveToFirst()) {
            s = CLS182.MTH3472(4101301281408996149L, cursor0);
        }
        cursor0.close();
        return s;
    }

    // 此方法包含解密的字符串
    public final Cursor MTH5320(Collection collection0) {
        if(collection0.isEmpty()) {
            return this.MTH5307("select * from rconversation where username = \'\'", null);
        }
        HashSet hashSet0 = new HashSet();
        for(Object object0: collection0) {
            String s = (String)object0;
            if(!CLS404.MTH5909(s)) {
                hashSet0.add(s);
            }
        }
        if(hashSet0.isEmpty()) {
            return this.MTH5307("select * from rconversation where username = \'\'", null);
        }
        StringBuilder stringBuilder0 = CLS182.MTH3483(("select * from rconversation where username in (\'" + TextUtils.join("\',\'", hashSet0) + "\')"));
        stringBuilder0.append(" order by flag desc");
        return this.MTH5307(stringBuilder0.toString(), null);
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5321(boolean z) {
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db46") + "ORDER BY createTime " + CLS370.MTH5289((z ? 0x38EAA2F82B3CD335L : 4101269618910090037L)), null);
        ArrayList arrayList0 = new ArrayList();
        if(cursor0 == null) {
            return arrayList0;
        }
        HashSet hashSet0 = new HashSet();
        if(cursor0.moveToFirst()) {
            while(true) {
                try {
                label_6:
                    String s = cursor0.getString(cursor0.getColumnIndex("msgContent"));
                    String s1 = cursor0.getString(cursor0.getColumnIndex("talker"));
                    if(!this.MTH5382(s1)) {
                        ContentValues contentValues0 = new ContentValues();
                        HashMap hashMap0 = CLS392.MTH5633(s, "msg");
                        if(hashMap0 != null && !hashMap0.isEmpty()) {
                            String s2 = (String)hashMap0.get(".msg.$ticket");
                            String s3 = "";
                            if(hashMap0.containsKey(".msg.$fromnickname")) {
                                s3 = (String)hashMap0.get(".msg.$fromnickname");
                            }
                            else if(hashMap0.containsKey(".msg.$nickname")) {
                                s3 = (String)hashMap0.get(".msg.$nickname");
                            }
                            String s4 = (String)hashMap0.get(".msg.$scene");
                            String s5 = (String)hashMap0.get(".msg.$sex");
                            contentValues0.put("ticket", s2);
                            contentValues0.put("nickname", s3);
                            contentValues0.put("talker", s1);
                            contentValues0.put("scene", s4);
                            contentValues0.put("sex", s5);
                            if(!hashSet0.contains(s1)) {
                                hashSet0.add(s1);
                                arrayList0.add(contentValues0);
                            }
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                if(cursor0.moveToNext()) {
                    goto label_6;
                }
                break;
            }
        }
        cursor0.close();
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5322(String s) {
        ArrayList arrayList0 = new ArrayList();
        try {
            Cursor cursor0 = this.MTH5307("SELECT * FROM chatroom WHERE roomowner = ?", new String[]{s});
            if(cursor0 == null) {
                return arrayList0;
            }
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                    if(!CLS502.MTH6934(null, new String[]{s1})) {
                        arrayList0.add(s1);
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final String MTH5323(String s) {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        Cursor cursor0 = this.MTH5299(s);
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s1 = CLS182.MTH3472(0x38EABC092B3CD335L, cursor0);
        }
        cursor0.close();
        return s1;
    }

    // 此方法包含解密的字符串
    public final HashSet MTH5324(HashSet hashSet0) {
        HashSet hashSet1 = new HashSet();
        Cursor cursor0 = this.MTH5307("select username from rconversation where username like \'wx^_%\' ESCAPE \'^\'", null);
        if(cursor0 == null) {
            return hashSet1;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s = CLS182.MTH3472(0x38EAAC022B3CD335L, cursor0);
                if(!hashSet0.contains(s) && s.startsWith("wx_") && !CLS426.MTH6126(s) && !CLS371.FLD3470.MTH5302(s)) {
                    hashSet1.add(s);
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return hashSet1;
    }

    // 此方法包含解密的字符串
    public final int MTH5325(AbstractCollection abstractCollection0) {
        int v = 0;
        if(abstractCollection0.isEmpty()) {
            return 0;
        }
        Cursor cursor0 = this.MTH5307("select sum(unReadCount) from rconversation where username in (\'" + TextUtils.join("\',\'", abstractCollection0) + "\')", null);
        if(cursor0 == null) {
            return 0;
        }
        if(cursor0.moveToFirst()) {
            v = cursor0.getInt(0);
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return v;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public final void MTH5326(ArrayList arrayList0) {
        this.MTH5318("Update rconversation set parentRef = \'hidden_conv_parent\' where 1 != 1  or username in (\'" + TextUtils.join("\',\'", arrayList0) + "\')");
    }

    // 此方法包含解密的字符串
    public final void MTH5327(ContentValues contentValues0, String s) {
        if(this.MTH5358(s)) {
            this.MTH5342("rconversation", contentValues0, "username=?", new String[]{s});
            return;
        }
        this.MTH5303(contentValues0, "rconversation", "");
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5328(String s) {
        ArrayList arrayList0 = new ArrayList();
        if(TextUtils.isEmpty(s)) {
            return arrayList0;
        }
        int v = this.MTH5297(s);
        if(v == -1) {
            return arrayList0;
        }
        Cursor cursor0 = this.MTH5307(String.format(CLS27.MTH882("q_db45"), v), null);
        if(cursor0 == null) {
            return arrayList0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s1 = CLS182.MTH3472(4101270203025642293L, cursor0);
                HashSet hashSet0 = new HashSet();
                String[] arr_s = s1.split(",");
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    hashSet0.add(Integer.parseInt(arr_s[v1]));
                }
                if(hashSet0.contains(v)) {
                    arrayList0.add(cursor0.getString(cursor0.getColumnIndex("username")));
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final int MTH5329(AbstractCollection abstractCollection0) {
        int v = 0;
        if(abstractCollection0.isEmpty()) {
            return 0;
        }
        Cursor cursor0 = this.MTH5307("select unReadCount from rconversation where username in (\'" + TextUtils.join("\',\'", abstractCollection0) + "\')", null);
        if(cursor0 == null) {
            return 0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                if(CLS182.MTH3490(4101280425047806773L, cursor0) > 0) {
                    ++v;
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return v;
    }

    // 此方法包含解密的字符串
    public final void MTH5330(ArrayList arrayList0) {
        Cursor cursor0 = this.MTH5307("SELECT chatroomname,memberlist FROM chatroom", null);
        if(cursor0 == null) {
            return;
        }
        String s = CLS27.MTH904();
        if(cursor0.moveToFirst()) {
            while(true) {
                if(CLS502.MTH6934(CLS182.MTH3472(0x38EABD542B3CD335L, cursor0), new String[]{s})) {
                    String s1 = CLS182.MTH3472(0x38EABD5F2B3CD335L, cursor0);
                    arrayList0.add(new CLS78(s1, this.MTH5316(s1)));
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
    }

    // 此方法包含解密的字符串
    public final Cursor MTH5331(String s, String[] arr_s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            if(this.MTH5354()) {
                Object object0 = this.MTH5301();
                if(object0 != null) {
                    return (Cursor)CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_rawQuery"), new Object[]{s, arr_s, 0});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH906(s);
            CLS27.MTH893(throwable0);
        }
        try {
            if(this.MTH5296()) {
                Object object1 = this.MTH5380();
                if(object1 != null) {
                    return (Cursor)CLS166.MTH3195(object1, "rawQuery", new Object[]{s, arr_s});
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH906(s);
            CLS27.MTH893(throwable1);
        }
        return null;
    }

    public static CLS371 MTH5332() {
        return CLS371.FLD3470;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH5333(String s) {
        long v = CLS27.MTH895().MTH938("stickytop_lower_native", false) ? this.MTH5317(s) & 0xFF00000000000000L | 0x4000000000000000L : CLS404.MTH5908(2, 0L, s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("flag", v);
        this.MTH5342("rconversation", contentValues0, "username = ?", new String[]{s});
    }

    // 此方法包含解密的字符串
    public final String MTH5334(String s) {
        String s1 = "";
        Cursor cursor0 = this.MTH5307("select value from walletcache where sid = ?", new String[]{s});
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            long v = CLS34.MTH1076(4101251507033002805L, cursor0);
            s1 = String.format("%.2f", new BigDecimal((Double.parseDouble(("" + v)) == 0.0 ? "0" : ("" + v).trim())).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP).doubleValue());
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return s1;
    }

    // 此方法包含解密的字符串
    public final String MTH5335(String s) [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public final ArrayList MTH5336(String s) {
        ArrayList arrayList0 = new ArrayList();
        try {
            Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db30"), null);
            if(cursor0 == null) {
                return arrayList0;
            }
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                    if(!CLS502.MTH6934(null, new String[]{s1}) && CLS502.MTH6934(cursor0.getString(cursor0.getColumnIndex("memberlist")), new String[]{s}) && this.MTH5367(s1)) {
                        arrayList0.add(s1);
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return arrayList0;
    }

    public final boolean MTH5337(String s, String s1) {
        return CLS502.MTH6934(this.MTH5335(s), new String[]{s1});
    }

    // 此方法包含解密的字符串
    public final HashMap MTH5338(String s) {
        HashMap hashMap0 = new HashMap();
        if(TextUtils.isEmpty(s)) {
            return hashMap0;
        }
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_run2"), new String[]{s, this.MTH5372()});
        if(cursor0 == null) {
            return hashMap0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                hashMap0.put(CLS182.MTH3472(0x38EA95CF2B3CD335L, cursor0), cursor0.getInt(cursor0.getColumnIndex("score")));
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return hashMap0;
    }

    // 此方法包含解密的字符串
    public final void MTH5339(String s, ArrayList arrayList0) {
        try {
            Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db30"), null);
            if(cursor0 == null) {
                return;
            }
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                    if(!CLS502.MTH6934(null, new String[]{s1}) && CLS502.MTH6934(cursor0.getString(cursor0.getColumnIndex("memberlist")), new String[]{s}) && this.MTH5367(s1)) {
                        arrayList0.add(new CLS78(s1, this.MTH5316(s1)));
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH5340(String s, String s1) {
        boolean z = false;
        if(!s1.equals(s) && !CLS372.MTH5400(s1) && !s1.endsWith("@qqim") && !s1.equals("filehelper") && !s1.startsWith("fake_")) {
            if(CLS426.MTH6126(s1)) {
                Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db36"), new String[]{s1});
                if(cursor0 == null) {
                    return false;
                }
                boolean z1 = cursor0.getCount() > 0;
                cursor0.close();
                return z1 ? CLS502.MTH6934(this.MTH5335(s1), new String[]{s}) : false;
            }
            Cursor cursor1 = this.MTH5307(CLS27.MTH882("q_db37"), new String[]{s1});
            if(cursor1 == null) {
                return false;
            }
            if(cursor1.getCount() > 0) {
                z = true;
            }
            cursor1.close();
            return z;
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5341(String s) {
        String s1 = CLS27.MTH882("q_db28");
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = this.MTH5307(String.format(s1, s), null);
        if(cursor0 == null) {
            return arrayList0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s2 = CLS182.MTH3472(0x38EABBC32B3CD335L, cursor0);
                if(!CLS426.MTH6126(s2) || this.MTH5383(s2)) {
                    arrayList0.add(s2);
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH5342(String s, ContentValues contentValues0, String s1, String[] arr_s) {
        try {
            if(this.MTH5354()) {
                Object object0 = this.MTH5301();
                if(object0 != null) {
                    CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_update"), new Object[]{s, contentValues0, s1, arr_s});
                    return;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            if(this.MTH5296()) {
                Object object1 = this.MTH5380();
                if(object1 != null) {
                    CLS166.MTH3195(object1, "update", new Object[]{s, contentValues0, s1, arr_s});
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public final String MTH5343(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = "";
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db19"), new String[]{s});
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s1 = CLS182.MTH3472(0x38EABDE82B3CD335L, cursor0);
        }
        cursor0.close();
        return s1;
    }

    // 此方法包含解密的字符串
    public final Set MTH5344() {
        HashSet hashSet0 = this.FLD3469;
        if(hashSet0 != null) {
            return hashSet0;
        }
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db20"), null);
        HashSet hashSet1 = new HashSet();
        this.FLD3469 = hashSet1;
        if(cursor0 == null) {
            return hashSet1;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                this.FLD3469.add(cursor0.getString(cursor0.getColumnIndex("username")));
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return this.FLD3469;
    }

    // 此方法包含解密的字符串
    public final Cursor MTH5345(List list0, boolean z) {
        if(list0.isEmpty()) {
            return this.MTH5307("select * from rconversation where username = \'\'", null);
        }
        HashSet hashSet0 = new HashSet();
        for(int v = 0; v < list0.size(); ++v) {
            if(((CLS78)list0.get(v)) != null && !CLS404.MTH5909("")) {
                hashSet0.add("");
            }
        }
        if(hashSet0.isEmpty()) {
            return this.MTH5307("select * from rconversation where username = \'\'", null);
        }
        String s = "select * from rconversation where username in (\'" + TextUtils.join("\',\'", hashSet0) + "\')";
        if(z) {
            s = CLS182.MTH3475(0x38EAAE052B3CD335L, CLS182.MTH3483(s));
        }
        return this.MTH5307(s, null);
    }

    // 此方法包含解密的字符串
    public final void MTH5346(String s, String s1, String[] arr_s) {
        try {
            if(this.MTH5354()) {
                Object object0 = this.MTH5301();
                if(object0 != null) {
                    ((Integer)CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_delete"), new Object[]{s, s1, arr_s})).intValue();
                    return;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            if(this.MTH5296()) {
                Object object1 = this.MTH5380();
                if(object1 != null) {
                    ((Integer)CLS166.MTH3195(object1, "delete", new Object[]{s, s1, arr_s})).intValue();
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5347() {
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db41"), null);
        if(cursor0 == null) {
            return arrayList0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                arrayList0.add(cursor0.getString(cursor0.getColumnIndex("username")));
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH5348(ArrayList arrayList0) {
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db35"), null);
        if(cursor0 == null) {
            return;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s = CLS182.MTH3472(4101274193050260277L, cursor0);
                String s1 = CLS182.MTH3472(0x38EAA72F2B3CD335L, cursor0);
                String s2 = CLS182.MTH3472(4101274270359671605L, cursor0);
                if(!TextUtils.isEmpty(s2)) {
                    s1 = s2;
                }
                if(TextUtils.isEmpty(s1)) {
                    s1 = CLS426.MTH6126(s) ? this.MTH5316(s) : s;
                }
                if(!CLS426.MTH6126(s) || this.MTH5383(s)) {
                    arrayList0.add(new CLS78(s, CLS613.MTH1971(s1)));
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
    }

    public final void MTH5349(String s, ArrayList arrayList0) {
        this.MTH5371(s, arrayList0, ((CLS9)new CLS1511(7)));
    }

    // 此方法包含解密的字符串
    public final String MTH5350(String s) {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        Cursor cursor0 = this.MTH5307("SELECT alias FROM rcontact WHERE username = ?", new String[]{s});
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s1 = CLS182.MTH3472(4101295199735305013L, cursor0);
        }
        cursor0.close();
        return s1;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5351(String s) {
        ArrayList arrayList0 = new ArrayList();
        try {
            Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db30"), null);
            if(cursor0 == null) {
                return arrayList0;
            }
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                    if(!CLS502.MTH6934(null, new String[]{s1}) && CLS502.MTH6934(cursor0.getString(cursor0.getColumnIndex("memberlist")), new String[]{s}) && (s1.endsWith("@im.chatroom") || CLS426.MTH6114(cursor0.getInt(cursor0.getColumnIndex("chatroomStatus")), s1))) {
                        arrayList0.add(s1);
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final long MTH5352(long v) {
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db14") + v, null);
        if(cursor0 == null) {
            return -1L;
        }
        return cursor0.moveToFirst() ? CLS34.MTH1076(0x38EABC792B3CD335L, cursor0) : -1L;
    }

    // 此方法包含解密的字符串
    public final String MTH5353(HashSet hashSet0) {
        String s = "";
        Cursor cursor0 = this.MTH5307("select * from rconversation where username in (\'" + TextUtils.join("\',\'", hashSet0) + "\') order by flag desc limit 1", null);
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s = CLS182.MTH3472(0x38EAA1DB2B3CD335L, cursor0);
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return s;
    }

    // 此方法包含解密的字符串
    public final boolean MTH5354() {
        try {
            Object object0 = this.MTH5301();
            if(object0 != null) {
                return ((Boolean)CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_isOpen"), new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final boolean MTH5355(String s) {
        Cursor cursor0 = this.MTH5307("SELECT type FROM rcontact WHERE username = ?", new String[]{s});
        if(cursor0 == null) {
            return false;
        }
        int v = cursor0.moveToFirst() ? CLS182.MTH3490(4101268802866303797L, cursor0) : -1;
        cursor0.close();
        return v != -1 && (v & 0x200) != 0;
    }

    // 此方法包含解密的字符串
    public final boolean MTH5356(String s) {
        int v;
        HashMap hashMap0 = this.FLD3468;
        if(hashMap0.containsKey(s)) {
            return ((Boolean)hashMap0.get(s)).booleanValue();
        }
        Cursor cursor0 = this.MTH5299(s);
        boolean z = false;
        if(cursor0 == null) {
            v = 0;
        }
        else {
            try {
                if(cursor0.moveToFirst()) {
                    v = cursor0.getInt(cursor0.getColumnIndex("deleteFlag"));
                }
                else {
                    goto label_13;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                v = 0;
            }
            goto label_14;
        label_13:
            v = 0;
        label_14:
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
        }
        if(v == 1) {
            z = true;
        }
        hashMap0.put(s, Boolean.valueOf(z));
        return z;
    }

    // 此方法包含解密的字符串
    public final void MTH5357(String s, ArrayList arrayList0) {
        try {
            Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db30"), null);
            if(cursor0 == null) {
                return;
            }
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                    if(!CLS502.MTH6934(null, new String[]{s1}) && CLS502.MTH6934(cursor0.getString(cursor0.getColumnIndex("memberlist")), new String[]{s}) && (s1.endsWith("@im.chatroom") || CLS426.MTH6114(cursor0.getInt(cursor0.getColumnIndex("chatroomStatus")), s1))) {
                        arrayList0.add(new CLS78(s1, this.MTH5316(s1)));
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH5358(String s) {
        boolean z = true;
        Cursor cursor0 = this.MTH5307("select * from rconversation where username = ?", new String[]{s});
        if(cursor0 == null) {
            return false;
        }
        if(cursor0.getCount() <= 0) {
            z = false;
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return z;
    }

    // 此方法包含解密的字符串
    public final ContentValues MTH5359(String s) {
        Cursor cursor0 = this.MTH5299(s);
        if(cursor0 == null) {
            return null;
        }
        ContentValues contentValues0 = new ContentValues();
        if(cursor0.moveToFirst()) {
            String s1 = CLS182.MTH3472(0x38EABA4E2B3CD335L, cursor0);
            String s2 = CLS182.MTH3472(0x38EABA572B3CD335L, cursor0);
            String s3 = CLS182.MTH3472(4101295319994389301L, cursor0);
            String s4 = CLS182.MTH3472(4101295362944062261L, cursor0);
            int v = CLS182.MTH3490(0x38EABA702B3CD335L, cursor0);
            String s5 = CLS182.MTH3472(4101295423073604405L, cursor0);
            contentValues0.put("wxid", s1);
            contentValues0.put("alias", s2);
            contentValues0.put("remark", s3);
            contentValues0.put(CLS182.MTH3496(4101295019346678581L, contentValues0, s4, 4101295058001384245L), v);
            contentValues0.put("encryptUsername", s5);
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final String MTH5360(String s) {
        String s1 = null;
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db13") + s, null);
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.moveToFirst()) {
            s1 = CLS182.MTH3472(0x38EABC652B3CD335L, cursor0);
        }
        cursor0.close();
        return s1;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Cursor MTH5361(long v) {
        return this.MTH5307(CLS27.MTH882("q_db5") + v, null);
    }

    // 此方法包含解密的字符串
    public final boolean MTH5362(long v) {
        Cursor cursor0 = this.MTH5307("SELECT * FROM ImgInfo2 WHERE id = " + v, null);
        boolean z = false;
        if(cursor0 == null) {
            return false;
        }
        if(cursor0.moveToFirst()) {
            String s = CLS182.MTH3472(0x38EABFF72B3CD335L, cursor0);
            try {
                int v1 = 0;
                v1 = Integer.parseInt(CLS502.MTH6924(s, "hdlength"));
                int v2 = 0;
                v2 = Integer.parseInt(CLS502.MTH6924(s, "length"));
            }
            catch(Throwable unused_ex) {
            }
            if(v1 > v2) {
                z = true;
            }
        }
        cursor0.close();
        return z;
    }

    // 此方法包含解密的字符串
    public final HashSet MTH5363() {
        HashSet hashSet0 = new HashSet();
        Cursor cursor0 = this.MTH5307("select * from rconversation where username like \'gh^_%\' ESCAPE \'^\' and username not like \'wx^_%\' ESCAPE \'^\' and (parentref is null or parentref = \'\')", null);
        if(cursor0 == null) {
            return hashSet0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                hashSet0.add(cursor0.getString(cursor0.getColumnIndex("username")));
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return hashSet0;
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH5364(AbstractCollection abstractCollection0) {
        if(abstractCollection0.isEmpty()) {
            return new JSONObject();
        }
        try {
            Cursor cursor0 = this.MTH5307("SELECT * FROM message WHERE talker in (\'" + TextUtils.join("\',\'", abstractCollection0) + "\') ORDER BY msgId DESC LIMIT 1", null);
            if(cursor0 == null) {
                return new JSONObject();
            }
            JSONObject jSONObject0 = new JSONObject();
            if(cursor0.moveToFirst()) {
                jSONObject0.put("username", cursor0.getString(cursor0.getColumnIndex("talker")));
                jSONObject0.put("unread", this.MTH5329(abstractCollection0));
                jSONObject0.put("unreadCount", this.MTH5325(abstractCollection0));
                jSONObject0.put("conversationTime", cursor0.getLong(cursor0.getColumnIndex("createTime")));
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
            return jSONObject0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH5365(String s, ArrayList arrayList0) {
        try {
            Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db30"), null);
            if(cursor0 == null) {
                return;
            }
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                    if(CLS502.MTH6934(cursor0.getString(cursor0.getColumnIndex("memberlist")), new String[]{s}) && CLS66.MTH1433(s1, s)) {
                        arrayList0.add(new CLS78(s1, this.MTH5316(s1)));
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH5366(long v, ContentValues contentValues0) {
        this.MTH5342("message", contentValues0, "msgId = ?", new String[]{String.valueOf(v)});
    }

    // 此方法包含解密的字符串
    public final boolean MTH5367(String s) {
        boolean z;
        try {
            Cursor cursor0 = this.MTH5299(s);
            if(cursor0 == null) {
                return false;
            }
            if(cursor0.moveToFirst()) {
                Class class0 = CLS27.MTH894("contactModel");
                if(class0 == null) {
                    z = false;
                }
                else {
                    Object object0 = CLS166.MTH3188(class0, new Object[0]);
                    z = true;
                    CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                    if(CLS166.MTH3181(object0, CLS27.MTH897("chatroomNotifyField")) != 0) {
                        z = false;
                    }
                }
            }
            else {
                z = false;
            }
            cursor0.close();
            return z;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH5368(Cursor cursor0) {
        ContentValues contentValues0 = null;
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.moveToFirst()) {
            contentValues0 = new ContentValues();
            contentValues0.put("msgSvrId", cursor0.getLong(cursor0.getColumnIndex("msgSvrId")));
            contentValues0.put("msgId", cursor0.getLong(cursor0.getColumnIndex("msgId")));
            contentValues0.put("isSend", cursor0.getInt(cursor0.getColumnIndex("isSend")));
            contentValues0.put("content", cursor0.getString(cursor0.getColumnIndex("content")));
            contentValues0.put("imgPath", cursor0.getString(cursor0.getColumnIndex("imgPath")));
            contentValues0.put("talker", cursor0.getString(cursor0.getColumnIndex("talker")));
            contentValues0.put("type", cursor0.getInt(cursor0.getColumnIndex("type")));
            contentValues0.put("createTime", cursor0.getLong(cursor0.getColumnIndex("createTime")));
            try {
                int v = cursor0.getColumnIndex("talkerId");
                contentValues0.put("talkerId", ((int)(v == -1 ? -1 : cursor0.getInt(v))));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final int MTH5369(String s) {
        int v = 0;
        if(TextUtils.isEmpty(s)) {
            return 0;
        }
        Cursor cursor0 = this.MTH5307("SELECT memberCount FROM chatroom WHERE chatroomname = ?", new String[]{s});
        if(cursor0 == null) {
            return 0;
        }
        if(cursor0.moveToFirst()) {
            v = CLS182.MTH3490(0x38EABB302B3CD335L, cursor0);
        }
        cursor0.close();
        return v;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH5370(String s) {
        this.MTH5346("rconversation", "username=?", new String[]{s});
    }

    public final void MTH5371(String s, ArrayList arrayList0, CLS9 ٴـ0) {
        String s1 = this.MTH5335(s);
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        String[] arr_s = CLS502.MTH6941(s1);
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            if(!TextUtils.isEmpty(s2) && (ٴـ0 == null || !ٴـ0.MTH787(s2))) {
                String s3 = CLS66.MTH1452(s, s2);
                String s4 = CLS371.FLD3470.MTH5323(s2);
                if(!TextUtils.isEmpty(s4) && !s3.equals(s4)) {
                    s3 = s3 + " (" + String.format(CLS27.MTH889("member_remark"), s4) + ")";
                }
                arrayList0.add(new CLS78(s2, CLS426.MTH6110(s3, s, s2)));
            }
        }
    }

    // 此方法包含解密的字符串
    public final String MTH5372() {
        String s1;
        if(!TextUtils.isEmpty(this.FLD3466)) {
            return this.FLD3466;
        }
        String s = null;
        Cursor cursor0 = this.MTH5331("SELECT value FROM userinfo WHERE id = 2", null);
        if(cursor0 == null) {
            s1 = "";
        }
        else {
            if(cursor0.moveToFirst()) {
                s = CLS182.MTH3472(0x38EAA0FE2B3CD335L, cursor0);
            }
            cursor0.close();
            s1 = s;
        }
        this.FLD3466 = s1;
        return s1;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5373() {
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db43"), null);
        if(cursor0 == null) {
            return arrayList0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                arrayList0.add(cursor0.getString(cursor0.getColumnIndex("labelName")));
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        Collections.sort(arrayList0);
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH5374(ArrayList arrayList0) {
        String s = CLS27.MTH904();
        Cursor cursor0 = this.MTH5307("SELECT chatroomname,memberlist FROM chatroom", null);
        if(cursor0 == null) {
            return;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s1 = CLS182.MTH3472(4101298326471496501L, cursor0);
                String s2 = CLS182.MTH3472(4101298382306071349L, cursor0);
                if(!CLS502.MTH6934(s2, new String[]{s})) {
                    String s3 = this.MTH5316(s1);
                    if(!TextUtils.isEmpty(s2) && !CLS502.MTH6930(CLS27.MTH882("removed_chatrooms_pattern"), s3)) {
                        arrayList0.add(new CLS78(s1, s3));
                    }
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
    }

    // 此方法包含解密的字符串
    public final int MTH5375(String s) {
        String s1 = CLS27.MTH882("q_db3");
        Object[] arr_object = new Object[1];
        int v = 0;
        arr_object[0] = s;
        Cursor cursor0 = this.MTH5307(String.format(s1, arr_object), null);
        if(cursor0 == null) {
            return 0;
        }
        if(cursor0.moveToFirst()) {
            v = CLS182.MTH3490(4101287241160905525L, cursor0);
        }
        cursor0.close();
        return v;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5376() {
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db21"), null);
        if(cursor0 == null) {
            return arrayList0;
        }
        String s = CLS27.MTH904();
        if(cursor0.moveToFirst()) {
            while(true) {
                String s1 = CLS182.MTH3472(4101298807507833653L, cursor0);
                String s2 = this.MTH5316(s1);
                if(CLS502.MTH6934(this.MTH5335(s1), new String[]{s})) {
                    arrayList0.add(new CLS78(s1, s2));
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5377() {
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db34"), null);
        if(cursor0 == null) {
            return arrayList0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s = CLS182.MTH3472(4101273986891830069L, cursor0);
                if(!CLS404.MTH5909(s)) {
                    arrayList0.add(s);
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final String MTH5378() {
        String s = null;
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_run1"), null);
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.moveToFirst()) {
            s = CLS182.MTH3472(4101255067560891189L, cursor0);
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return s;
    }

    // 此方法包含解密的字符串
    public final boolean MTH5379(String s) {
        Cursor cursor0 = this.MTH5307("select parentRef from rconversation where username = \'" + s + "\'", null);
        boolean z = false;
        if(cursor0 == null) {
            return false;
        }
        if(cursor0.moveToFirst()) {
            z = "hidden_conv_parent".equalsIgnoreCase(CLS182.MTH3472(0x38EABE4F2B3CD335L, cursor0));
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return z;
    }

    // 此方法包含解密的字符串
    public final Object MTH5380() {
        if(this.FLD3467 == null) {
            this.FLD3467 = CLS21.FLD76.MTH836("getMainDB", new Object[0]);
        }
        return this.FLD3467;
    }

    // 此方法包含解密的字符串
    public final void MTH5381(String s, ArrayList arrayList0) {
        String s1 = CLS27.MTH882("q_db48");
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        Cursor cursor0 = this.MTH5307(String.format(s1, s), null);
        if(cursor0 == null) {
            return;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s2 = CLS182.MTH3472(4101296926312158005L, cursor0);
                String s3 = CLS182.MTH3472(0x38EABBDC2B3CD335L, cursor0);
                String s4 = CLS182.MTH3472(4101297007916536629L, cursor0);
                String s5 = CLS182.MTH3472(4101297033686340405L, cursor0);
                if(TextUtils.isEmpty(s3)) {
                    s3 = CLS182.MTH3472(4101297102405817141L, cursor0);
                }
                CLS78 ˊﾞ0 = new CLS78(s2, CLS613.MTH1971(s3));
                if(!TextUtils.isEmpty(s4)) {
                    ˊﾞ0.FLD276 = s4;
                }
                if(!TextUtils.isEmpty(s5) && s5.endsWith("@stranger")) {
                    ˊﾞ0.FLD273 = s5;
                }
                if(!CLS426.MTH6126(s2) || this.MTH5383(s2)) {
                    arrayList0.add(ˊﾞ0);
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
    }

    // 此方法包含解密的字符串
    public final boolean MTH5382(String s) {
        boolean z = false;
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        if(CLS426.MTH6126(s)) {
            return this.MTH5383(s);
        }
        String s1 = CLS27.MTH882(CLS370.MTH5289((s.endsWith("@stranger") ? 0x38EABB502B3CD335L : 4101296393736213301L)));
        try {
            Cursor cursor0 = this.MTH5307(s1, new String[]{s});
            if(cursor0 == null) {
                return false;
            }
            if(cursor0.moveToFirst() && cursor0.getInt(cursor0.getColumnIndex("type")) != 0) {
                z = true;
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return z;
    }

    // 去混淆评级： 低(20)
    public final boolean MTH5383(String s) {
        return !TextUtils.isEmpty(s) && this.MTH5337(s, CLS27.MTH904());
    }

    // 此方法包含解密的字符串
    public final String MTH5384(String s) {
        Cursor cursor0 = this.MTH5307(CLS27.MTH882("q_db17"), new String[]{s});
        String s1 = null;
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.moveToFirst()) {
            s1 = CLS182.MTH3472(4101298025823785781L, cursor0);
        }
        cursor0.close();
        return s1;
    }
}

