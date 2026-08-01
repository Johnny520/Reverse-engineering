// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ⁱʾ.CLS359;
import java.io.File;
import org.json.JSONArray;

public final class CLS1194 implements CLS12 {
    public final int FLD2794;
    public final CLS359 FLD2795;
    public final ContentValues FLD2796;

    public CLS1194(ContentValues contentValues0, CLS359 ⁱˉ0, int v) {
        this.FLD2794 = v;
        this.FLD2796 = contentValues0;
        this.FLD2795 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS359 ⁱˉ0 = this.FLD2795;
        ContentValues contentValues0 = this.FLD2796;
        switch(this.FLD2794) {
            case 0: {
                contentValues0.put("msg", "#file " + ((File)object0).getAbsolutePath());
                contentValues0.put("path", ((File)object0).getAbsolutePath());
                contentValues0.put("desc", CLS27.MTH889("file") + ": " + ((File)object0).getName());
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 1: {
                String s1 = CLS31.MTH1023(((Uri)object0));
                if(TextUtils.isEmpty(s1)) {
                    s1 = ((Uri)object0).toString();
                }
                contentValues0.put("msg", "#uri_file " + ((Uri)object0));
                contentValues0.put("uri", ((Uri)object0).toString());
                contentValues0.put("desc", CLS27.MTH889("file") + ": " + s1);
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 2: {
                contentValues0.put("data", ((JSONArray)object0).toString());
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 3: {
                contentValues0.put("msg", "#file " + ((File)object0).getAbsolutePath());
                contentValues0.put("path", ((File)object0).getAbsolutePath());
                contentValues0.put("desc", CLS27.MTH889("file") + ": " + ((File)object0).getName());
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 4: {
                String s2 = CLS31.MTH1023(((Uri)object0));
                if(TextUtils.isEmpty(s2)) {
                    s2 = ((Uri)object0).toString();
                }
                contentValues0.put("msg", "#uri_file " + ((Uri)object0));
                contentValues0.put("uri", ((Uri)object0).toString());
                contentValues0.put("desc", CLS27.MTH889("file") + ": " + s2);
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 5: {
                contentValues0.put("msg", "#file " + ((File)object0).getAbsolutePath());
                contentValues0.put("path", ((File)object0).getAbsolutePath());
                contentValues0.put("desc", CLS27.MTH889("file") + ": " + ((File)object0).getName());
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 6: {
                String s3 = CLS31.MTH1023(((Uri)object0));
                if(TextUtils.isEmpty(s3)) {
                    s3 = ((Uri)object0).toString();
                }
                contentValues0.put("msg", "#uri_file " + ((Uri)object0));
                contentValues0.put("uri", ((Uri)object0).toString());
                contentValues0.put("desc", CLS27.MTH889("file") + ": " + s3);
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 7: {
                contentValues0.put("path", ((File)object0).getAbsolutePath());
                contentValues0.put("desc", CLS27.MTH889("file") + ": " + ((File)object0).getName());
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 8: {
                String s4 = CLS31.MTH1023(((Uri)object0));
                if(TextUtils.isEmpty(s4)) {
                    s4 = ((Uri)object0).toString();
                }
                contentValues0.put("uri", ((Uri)object0).toString());
                contentValues0.put("desc", CLS27.MTH889("file") + ": " + s4);
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 9: {
                contentValues0.put("lat", ((ContentValues)object0).getAsString("lat"));
                contentValues0.put("lng", ((ContentValues)object0).getAsString("lng"));
                contentValues0.put("addr", ((ContentValues)object0).getAsString("addr"));
                contentValues0.put("poi", ((ContentValues)object0).getAsString("poi"));
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 10: {
                contentValues0.put("path", ((File)object0).getAbsolutePath());
                contentValues0.put("desc", CLS27.MTH889("file") + ": " + ((File)object0).getName());
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            default: {
                String s = CLS31.MTH1023(((Uri)object0));
                if(TextUtils.isEmpty(s)) {
                    s = ((Uri)object0).toString();
                }
                contentValues0.put("uri", ((Uri)object0).toString());
                contentValues0.put("desc", CLS27.MTH889("file") + ": " + s);
                ⁱˉ0.notifyDataSetChanged();
            }
        }
    }
}

