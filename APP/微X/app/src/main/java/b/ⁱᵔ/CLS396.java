// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.SparseArray;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;

public final class CLS396 {
    public Object FLD3774;
    public static final CLS396 FLD3775;
    public Object FLD3776;

    static {
        CLS396.FLD3775 = new CLS396();
    }

    // 此方法包含解密的字符串
    public CLS396() {
        new String("/*fkz*/");
    }

    // 此方法包含解密的字符串
    public final Object MTH5750() {
        Object object0 = null;
        if(this.FLD3776 == null) {
            if(CLS27.MTH890("SnsCore_getDataDB")) {
                Class class0 = CLS27.MTH894("SnsPathClass");
                try {
                    object0 = CLS166.MTH3192(class0, CLS27.MTH897("SnsCore_getDataDB"), new Object[0]);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            this.FLD3776 = object0;
        }
        return this.FLD3776;
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH5751(long v) {
        ContentValues contentValues0 = CLS66.MTH1430(v);
        if(contentValues0 == null) {
            return new ArrayList();
        }
        Object object0 = CLS66.MTH1381(CLS27.MTH894("snsAttrClass"), contentValues0.getAsByteArray("attrBuf"));
        ArrayList arrayList0 = new ArrayList();
        if(object0 != null) {
            for(Object object1: ((LinkedList)CLS182.MTH3492(4101320660301435701L, object0))) {
                int v1 = CLS166.MTH3181(object1, CLS27.MTH897("snsFieldCreateTime"));
                String s = CLS66.MTH1407(object1);
                String s1 = (String)CLS182.MTH3492(4101320299524182837L, object1);
                String s2 = (String)CLS182.MTH3492(4101320372538626869L, object1);
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("createTime", v1);
                contentValues1.put("username", s1);
                contentValues1.put("nickname", s2);
                contentValues1.put("content", s);
            }
            Collections.sort(arrayList0, Comparator.comparing(new CLS521(3)));
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final String MTH5752(long v) {
        Cursor cursor0 = this.MTH5763(v);
        if(cursor0 == null) {
            return "";
        }
        if(CLS27.MTH894("snsContentClass") == null) {
            return "";
        }
        byte[] arr_b = cursor0.moveToFirst() ? cursor0.getBlob(cursor0.getColumnIndex("content")) : null;
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return CLS66.MTH1424(arr_b);
    }

    // 此方法包含解密的字符串
    public final void MTH5753(String s) {
        try {
            if(this.MTH5765()) {
                Object object0 = this.MTH5750();
                if(object0 != null) {
                    ((Integer)CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_delete"), new Object[]{s, null, null})).intValue();
                    return;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            if(this.MTH5758()) {
                Object object1 = this.MTH5761();
                if(object1 != null) {
                    ((Integer)CLS166.MTH3195(object1, "delete", new Object[]{s, null, null})).intValue();
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public final long MTH5754(long v) {
        Cursor cursor0 = this.MTH5759("select snsId from SnsInfo where SnsInfo.rowid =" + v, null);
        long v1 = 0L;
        if(cursor0 == null) {
            return 0L;
        }
        if(cursor0.moveToFirst()) {
            v1 = CLS34.MTH1076(0x38EADF2F2B3CD335L, cursor0);
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return v1;
    }

    public final int MTH5755(long v) {
        Cursor cursor0 = this.MTH5763(v);
        int v1 = -1;
        if(cursor0 == null) {
            return -1;
        }
        if(cursor0.moveToFirst()) {
            v1 = CLS182.MTH3490(0x38EAD1DC2B3CD335L, cursor0);
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return v1;
    }

    // 此方法包含解密的字符串
    public final long MTH5756(String s) {
        Cursor cursor0 = this.MTH5759("select *,rowid from SnsInfo where snsId =" + s, null);
        if(cursor0 == null) {
            return 0L;
        }
        long v = cursor0.moveToFirst() ? CLS34.MTH1076(4101336122183701301L, cursor0) : -1L;
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return v;
    }

    // 此方法包含解密的字符串
    public final int MTH5757(long v) {
        Cursor cursor0 = this.MTH5759(CLS27.MTH882("q_snsinfo7") + v, null);
        int v1 = -1;
        if(cursor0 == null) {
            return -1;
        }
        if(cursor0.moveToFirst()) {
            v1 = CLS182.MTH3490(0x38EAD1F72B3CD335L, cursor0);
        }
        cursor0.close();
        return v1;
    }

    // 此方法包含解密的字符串
    public final boolean MTH5758() {
        try {
            Object object0 = this.MTH5761();
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
    public final Cursor MTH5759(String s, String[] arr_s) {
        String s1 = CLS182.MTH3484(4101319290206868277L, new StringBuilder(), s);
        if(!TextUtils.isEmpty(s1)) {
            try {
                if(this.MTH5765()) {
                    Object object0 = this.MTH5750();
                    if(object0 != null) {
                        return (Cursor)CLS166.MTH3195(object0, CLS27.MTH897("SnsSqliteDB_rawQuery"), new Object[]{s1, arr_s});
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH906(s1);
                CLS27.MTH893(throwable0);
            }
            try {
                if(this.MTH5758()) {
                    Object object1 = this.MTH5761();
                    if(object1 != null) {
                        return (Cursor)CLS166.MTH3195(object1, "rawQuery", new Object[]{s1, arr_s});
                    }
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH906(s1);
                CLS27.MTH893(throwable1);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5760(long v, long v1, String s) {
        StringBuilder stringBuilder3;
        ArrayList arrayList0 = new ArrayList();
        String s1 = "select *,rowid from SnsInfo where createTime between " + v + " and " + v1;
        if(!TextUtils.isEmpty(s)) {
            ArrayList arrayList1 = new ArrayList(Arrays.asList(s.split(",")));
            StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
            stringBuilder0.append(" and userName in (\'");
            stringBuilder0.append(TextUtils.join("\',\'", arrayList1));
            stringBuilder0.append("\')");
            s1 = stringBuilder0.toString();
        }
        StringBuilder stringBuilder1 = CLS182.MTH3483(s1);
        stringBuilder1.append(" order by createTime desc");
        Cursor cursor0 = this.MTH5759(stringBuilder1.toString(), null);
        if(cursor0 != null) {
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            CLS371 ʻ0 = CLS371.FLD3470;
            if(cursor0.moveToFirst()) {
                while(true) {
                    ContentValues contentValues0 = new ContentValues();
                    long v2 = CLS34.MTH1076(4101332604605485877L, cursor0);
                    int v3 = CLS182.MTH3490(4101332651850126133L, cursor0);
                    byte[] arr_b = cursor0.getBlob(cursor0.getColumnIndex("content"));
                    String s2 = CLS182.MTH3472(4101332707684700981L, cursor0);
                    long v4 = CLS34.MTH1076(4101332746339406645L, cursor0);
                    contentValues0.put("id", v4);
                    contentValues0.put("snsId", cursor0.getLong(cursor0.getColumnIndex("snsId")));
                    contentValues0.put("userName", s2);
                    contentValues0.put("createTime", v2);
                    contentValues0.put("type", v3);
                    contentValues0.put("content", arr_b);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("<small><i>");
                    stringBuilder2.append(simpleDateFormat0.format(new Date(v2 * 1000L)));
                    stringBuilder2.append("</i></small><br><small><b>");
                    stringBuilder2.append(ʻ0.MTH5311(s2));
                    String s3 = CLS182.MTH3475(0x38EADCC32B3CD335L, stringBuilder2);
                    switch(v3) {
                        case 1: {
                            ArrayList arrayList2 = CLS66.MTH1465(CLS66.MTH1489(v4));
                            if(!arrayList2.isEmpty()) {
                                contentValues0.put("img", ((String)arrayList2.get(0)));
                            }
                            stringBuilder3 = CLS182.MTH3483(s3);
                            stringBuilder3.append("[");
                            stringBuilder3.append(CLS27.MTH889("image"));
                            stringBuilder3.append(CLS370.MTH5289(4101333266030449461L));
                            s3 = stringBuilder3.toString();
                            break;
                        }
                        case 2: {
                            stringBuilder3 = CLS182.MTH3483(s3);
                            stringBuilder3.append("[");
                            stringBuilder3.append(CLS27.MTH889("text"));
                            stringBuilder3.append(CLS370.MTH5289(4101333308980122421L));
                            s3 = stringBuilder3.toString();
                            break;
                        }
                        case 3: {
                            stringBuilder3 = CLS182.MTH3483(s3);
                            stringBuilder3.append("[");
                            stringBuilder3.append(CLS27.MTH889("article"));
                            stringBuilder3.append(CLS370.MTH5289(0x38EADCF72B3CD335L));
                            s3 = stringBuilder3.toString();
                            break;
                        }
                        case 4: {
                            stringBuilder3 = CLS182.MTH3483(s3);
                            stringBuilder3.append("[");
                            stringBuilder3.append(CLS27.MTH889("music"));
                            stringBuilder3.append(CLS370.MTH5289(4101332862303523637L));
                            s3 = stringBuilder3.toString();
                            break;
                        }
                        case 15: {
                            contentValues0.put("vid", CLS66.MTH1475(v4));
                            s3 = s3 + "[" + CLS27.MTH889("video") + CLS370.MTH5289(4101332926728033077L);
                            break;
                        }
                        case 28: {
                            stringBuilder3 = CLS182.MTH3483(s3);
                            stringBuilder3.append(CLS27.MTH889("video_channel"));
                            s3 = stringBuilder3.toString();
                        }
                    }
                    String s4 = CLS66.MTH1424(arr_b);
                    if(!TextUtils.isEmpty(s4)) {
                        StringBuilder stringBuilder4 = CLS182.MTH3483(s3);
                        stringBuilder4.append(CLS502.MTH6944(50, s4));
                        s3 = stringBuilder4.toString();
                    }
                    contentValues0.put("desc", s3);
                    arrayList0.add(contentValues0);
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final Object MTH5761() {
        if(this.FLD3774 == null) {
            this.FLD3774 = CLS21.FLD76.MTH836("getSnsDB", new Object[0]);
        }
        return this.FLD3774;
    }

    // 此方法包含解密的字符串
    public final long MTH5762(ContentValues contentValues0, String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return -1L;
        }
        try {
            if(this.MTH5765()) {
                Object object0 = this.MTH5750();
                if(object0 != null) {
                    return (long)(((Long)CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_insert"), new Object[]{s, s1, contentValues0, Boolean.FALSE})));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        try {
            if(this.MTH5758()) {
                Object object1 = this.MTH5761();
                if(object1 != null) {
                    return (long)(((Long)CLS166.MTH3195(object1, "insert", new Object[]{s, s1, contentValues0})));
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
        return -1L;
    }

    // 此方法包含解密的字符串
    public final Cursor MTH5763(long v) {
        if(v == -1L) {
            return null;
        }
        return v >= 0L ? this.MTH5759(CLS27.MTH882("q_snsinfo8") + v, null) : this.MTH5759(CLS27.MTH882("q_snsinfo6") + v, null);
    }

    // 此方法包含解密的字符串
    public static byte[] MTH5764(Object object0) {
        if(object0 == null) {
            return null;
        }
        try {
            return (byte[])CLS166.MTH3195(object0, "toByteArray", new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH5765() {
        try {
            Object object0 = this.MTH5750();
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
    public final long MTH5766(long v) {
        Cursor cursor0 = this.MTH5759("select *,rowid from SnsInfo where snsId =" + v, null);
        if(cursor0 == null) {
            return 0L;
        }
        long v1 = cursor0.moveToFirst() ? CLS34.MTH1076(4101335916025271093L, cursor0) : -1L;
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return v1;
    }

    // 此方法包含解密的字符串
    public final void MTH5767(String s, ContentValues contentValues0, String s1, String[] arr_s) {
        try {
            if(this.MTH5765()) {
                Object object0 = this.MTH5750();
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
            if(this.MTH5758()) {
                Object object1 = this.MTH5761();
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
    public final boolean MTH5768(long v, int v1) {
        String[] arr_s = new String[2];
        boolean z = false;
        arr_s[0] = String.valueOf(v);
        arr_s[1] = String.valueOf(v1);
        Cursor cursor0 = this.MTH5759("select * from snscomment where snsID=? and createTime=?", arr_s);
        if(cursor0 == null) {
            return false;
        }
        Class class0 = CLS27.MTH894("commentClass");
        if(cursor0.moveToFirst()) {
            if(CLS182.MTH3490(0x38EADD3B2B3CD335L, cursor0) == 1) {
                z = true;
            }
            else {
                String s = (String)CLS182.MTH3492(4101334314002469685L, CLS66.MTH1381(class0, cursor0.getBlob(cursor0.getColumnIndex("curActionBuf"))));
                if(CLS502.MTH6934(s, new String[]{CLS27.MTH882("deletedMark")}) || CLS502.MTH6934(s, new String[]{"[Deleted]"})) {
                    z = true;
                }
            }
        }
        cursor0.close();
        return z;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5769(String s) {
        StringBuilder stringBuilder0;
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = this.MTH5759("select *,rowid from SnsInfo where userName=? order by createTime desc", new String[]{s});
        if(cursor0 == null) {
            return arrayList0;
        }
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if(cursor0.moveToFirst()) {
            while(true) {
                ContentValues contentValues0 = new ContentValues();
                long v = CLS34.MTH1076(4101334885233120053L, cursor0);
                int v1 = CLS182.MTH3490(4101334932477760309L, cursor0);
                byte[] arr_b = cursor0.getBlob(cursor0.getColumnIndex("content"));
                long v2 = CLS34.MTH1076(0x38EADE712B3CD335L, cursor0);
                contentValues0.put("id", v2);
                contentValues0.put("snsId", cursor0.getLong(cursor0.getColumnIndex("snsId")));
                contentValues0.put("userName", cursor0.getString(cursor0.getColumnIndex("userName")));
                contentValues0.put("createTime", v);
                contentValues0.put("type", v1);
                contentValues0.put("content", arr_b);
                String s1 = "<small><i>" + simpleDateFormat0.format(new Date(v * 1000L)) + "</i></small><br>";
                switch(v1) {
                    case 1: {
                        ArrayList arrayList1 = CLS66.MTH1465(CLS66.MTH1489(v2));
                        if(!arrayList1.isEmpty()) {
                            contentValues0.put("img", ((String)arrayList1.get(0)));
                        }
                        stringBuilder0 = CLS182.MTH3483(s1);
                        stringBuilder0.append("[");
                        stringBuilder0.append(CLS27.MTH889("image"));
                        stringBuilder0.append(CLS370.MTH5289(4101335430693966645L));
                        s1 = stringBuilder0.toString();
                        break;
                    }
                    case 2: {
                        stringBuilder0 = CLS182.MTH3483(s1);
                        stringBuilder0.append("[");
                        stringBuilder0.append(CLS27.MTH889("text"));
                        stringBuilder0.append(CLS370.MTH5289(4101335473643639605L));
                        s1 = stringBuilder0.toString();
                        break;
                    }
                    case 3: {
                        stringBuilder0 = CLS182.MTH3483(s1);
                        stringBuilder0.append("[");
                        stringBuilder0.append(CLS27.MTH889("article"));
                        stringBuilder0.append(CLS370.MTH5289(0x38EADEEF2B3CD335L));
                        s1 = stringBuilder0.toString();
                        break;
                    }
                    case 4: {
                        stringBuilder0 = CLS182.MTH3483(s1);
                        stringBuilder0.append("[");
                        stringBuilder0.append(CLS27.MTH889("music"));
                        stringBuilder0.append(CLS370.MTH5289(0x38EADEFA2B3CD335L));
                        s1 = stringBuilder0.toString();
                        break;
                    }
                    case 15: {
                        contentValues0.put("vid", CLS66.MTH1475(v2));
                        s1 = s1 + "[" + CLS27.MTH889("video") + CLS370.MTH5289(4101335091391550261L);
                        break;
                    }
                    case 28: {
                        stringBuilder0 = CLS182.MTH3483(s1);
                        stringBuilder0.append(CLS27.MTH889("video_channel"));
                        s1 = stringBuilder0.toString();
                    }
                }
                String s2 = CLS66.MTH1424(arr_b);
                if(!TextUtils.isEmpty(s2)) {
                    StringBuilder stringBuilder1 = CLS182.MTH3483(s1);
                    stringBuilder1.append(CLS502.MTH6944(50, s2));
                    s1 = stringBuilder1.toString();
                }
                contentValues0.put("desc", s1);
                arrayList0.add(contentValues0);
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public static SparseArray MTH5770(Object object0) {
        if(object0 == null) {
            return new SparseArray();
        }
        LinkedList linkedList0 = (LinkedList)CLS182.MTH3492(0x38EAD0A82B3CD335L, object0);
        SparseArray sparseArray0 = new SparseArray(linkedList0.size());
        for(Object object1: linkedList0) {
            sparseArray0.put(CLS166.MTH3181(object1, CLS27.MTH897("snsFieldCreateTime")), object1);
        }
        return sparseArray0;
    }

    // 此方法包含解密的字符串
    public final Object MTH5771(Class class0, String s) {
        Object object0 = null;
        Cursor cursor0 = this.MTH5759(CLS27.MTH882("q_snsinfo4") + s, null);
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.moveToFirst()) {
            object0 = CLS66.MTH1381(class0, cursor0.getBlob(cursor0.getColumnIndex("attrBuf")));
        }
        cursor0.close();
        return object0;
    }
}

