// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class CLS696 implements CLS39 {
    public final int FLD797;
    public final CLS760 FLD798;

    public CLS696(CLS760 ـˑ0, int v) {
        this.FLD797 = v;
        this.FLD798 = ـˑ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        int v3;
        Set set0;
        int v1;
        CLS760 ـˑ0 = this.FLD798;
        switch(this.FLD797) {
            case 0: {
                ـˑ0.getClass();
                try {
                    String s3 = CLS27.MTH882("unr_sns_com");
                    Cursor cursor0 = ـˑ0.FLD1446.MTH5759(s3, null);
                    if(cursor0 != null) {
                        if(cursor0.moveToFirst()) {
                            v1 = 0;
                            do {
                                ContentValues contentValues0 = new ContentValues();
                                contentValues0.put("commentSvrID", cursor0.getString(cursor0.getColumnIndex("commentSvrID")));
                                contentValues0.put("curActionBuf", cursor0.getBlob(cursor0.getColumnIndex("curActionBuf")));
                                ـˑ0.MTH2539(contentValues0);
                                ++v1;
                            }
                            while(cursor0.moveToNext());
                        }
                        else {
                            v1 = 0;
                        }
                        cursor0.close();
                        CLS412.MTH6014(((CLS140)ـˑ0).MTH3042(), String.format(CLS27.MTH889("unrecall_comments_result"), v1));
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                ـˑ0.getClass();
                try {
                    StringBuilder stringBuilder0 = new StringBuilder(CLS27.MTH882("q_snsinfo1"));
                    CLS371 ʻ0 = ـˑ0.FLD1444;
                    if(ʻ0 == null) {
                        set0 = null;
                    }
                    else {
                        set0 = ʻ0.MTH5344();
                        if(set0 != null && !((HashSet)set0).isEmpty()) {
                            for(Object object0: ((HashSet)set0)) {
                                String s4 = (String)object0;
                                if(!TextUtils.isEmpty(s4) && !CLS426.MTH6126(s4)) {
                                    stringBuilder0.append(" AND userName != \'");
                                    stringBuilder0.append(s4);
                                    stringBuilder0.append("\' ");
                                }
                            }
                        }
                    }
                    Cursor cursor1 = ـˑ0.FLD1446.MTH5759(stringBuilder0.toString(), null);
                    if(cursor1 == null) {
                        v3 = 0;
                    }
                    else {
                        if(cursor1.moveToFirst()) {
                            int v2 = ـˑ0.FLD1029.MTH938("enable_moment_deleted_filter", false) ? 8 : 10;
                            v3 = 0;
                            do {
                                ContentValues contentValues1 = new ContentValues();
                                contentValues1.put("snsId", cursor1.getString(cursor1.getColumnIndex("snsId")));
                                contentValues1.put("content", cursor1.getBlob(cursor1.getColumnIndex("content")));
                                contentValues1.put("sourceType", v2);
                                ـˑ0.MTH2538(contentValues1);
                                ++v3;
                            }
                            while(cursor1.moveToNext());
                        }
                        else {
                            v3 = 0;
                        }
                        cursor1.close();
                    }
                    ـˑ0.MTH2540(set0);
                    CLS412.MTH6014(((CLS140)ـˑ0).MTH3042(), String.format(CLS27.MTH889("unrecall_moments_result"), v3));
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                try {
                    CLS29 ˎᵢ0 = ـˑ0.FLD1029;
                    if(ˎᵢ0.MTH938("enable_chat_filter", false)) {
                        String s = ˎᵢ0.MTH925("chat_filter", "");
                        if(TextUtils.isEmpty(s)) {
                            ـˑ0.FLD1028 = null;
                            return;
                        }
                        if(TextUtils.isEmpty(ـˑ0.FLD1027) || !ـˑ0.FLD1027.equals(s)) {
                            ـˑ0.FLD1028 = null;
                            String[] arr_s = s.split(Pattern.quote("|"));
                            HashSet hashSet0 = new HashSet();
                            for(int v = 0; v < arr_s.length; ++v) {
                                String s1 = arr_s[v];
                                if(!TextUtils.isEmpty(s1)) {
                                    hashSet0.add(s1);
                                }
                            }
                            String s2 = TextUtils.join("|", hashSet0);
                            ـˑ0.FLD1027 = s2;
                            if(s2.endsWith("|")) {
                                ـˑ0.FLD1027 = ـˑ0.FLD1027.substring(0, ـˑ0.FLD1027.length() - 1);
                            }
                            ˎᵢ0.MTH922(ـˑ0.FLD1027, "chat_filter");
                            ـˑ0.FLD1028 = Pattern.compile(ـˑ0.FLD1027, 2);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

