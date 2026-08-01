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
import java.util.ArrayList;
import org.json.JSONArray;

public final class CLS1207 implements CLS12 {
    public final int FLD2839;
    public final CLS359 FLD2840;
    public final ArrayList FLD2841;

    public CLS1207(ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD2839 = v;
        this.FLD2841 = arrayList0;
        this.FLD2840 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS359 ⁱˉ0 = this.FLD2840;
        ArrayList arrayList0 = this.FLD2841;
        switch(this.FLD2839) {
            case 0: {
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put(CLS182.MTH3496(4100681521923150645L, contentValues1, "#file " + ((File)object0).getAbsolutePath(), 4100681539103019829L), ((File)object0).getAbsolutePath());
                contentValues1.put("type", -49);
                contentValues1.put("desc", CLS27.MTH889("file") + ": " + ((File)object0).getName());
                contentValues1.put("checked", Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues1, ⁱˉ0, arrayList0, contentValues1);
                return;
            }
            case 1: {
                String s1 = CLS31.MTH1023(((Uri)object0));
                if(TextUtils.isEmpty(s1)) {
                    s1 = ((Uri)object0).toString();
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(CLS182.MTH3496(4100681895585305397L, contentValues2, "#uri_file " + ((Uri)object0), 4100681912765174581L), ((Uri)object0).toString());
                contentValues2.put("type", -49);
                CLS182.MTH3478(4100681423138902837L, new StringBuilder(), 0x38E88C0C2B3CD335L, s1, contentValues2, "desc");
                contentValues2.put("checked", Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues2, ⁱˉ0, arrayList0, contentValues2);
                return;
            }
            case 2: {
                if(((JSONArray)object0) != null && ((JSONArray)object0).length() != 0) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put(CLS182.MTH3479(-202, contentValues3, "type", 4100657598955311925L), CLS27.MTH889("random_response_group"));
                    contentValues3.put("msg", CLS27.MTH889("random_response_group"));
                    contentValues3.put("checked", Boolean.TRUE);
                    contentValues3.put("data", ((JSONArray)object0).toString());
                    arrayList0.add(contentValues3);
                    ⁱˉ0.MTH5235(arrayList0);
                    ⁱˉ0.MTH5231(contentValues3);
                }
                return;
            }
            case 3: {
                ContentValues contentValues4 = new ContentValues();
                contentValues4.put(CLS182.MTH3496(4100655545960944437L, contentValues4, "#file " + ((File)object0).getAbsolutePath(), 4100655013384999733L), ((File)object0).getAbsolutePath());
                contentValues4.put("type", -49);
                contentValues4.put("desc", CLS27.MTH889("file") + ": " + ((File)object0).getName());
                contentValues4.put("checked", Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues4, ⁱˉ0, arrayList0, contentValues4);
                return;
            }
            case 4: {
                String s2 = CLS31.MTH1023(((Uri)object0));
                if(TextUtils.isEmpty(s2)) {
                    s2 = ((Uri)object0).toString();
                }
                ContentValues contentValues5 = new ContentValues();
                contentValues5.put(CLS182.MTH3496(4100655369867285301L, contentValues5, "#uri_file " + ((Uri)object0), 4100655387047154485L), ((Uri)object0).toString());
                contentValues5.put("type", -49);
                CLS182.MTH3478(4100655447176696629L, new StringBuilder(), 4100655468651533109L, s2, contentValues5, "desc");
                contentValues5.put("checked", Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues5, ⁱˉ0, arrayList0, contentValues5);
                return;
            }
            case 5: {
                ContentValues contentValues6 = new ContentValues();
                contentValues6.put(CLS182.MTH3496(4100621495460221749L, contentValues6, "#file " + ((File)object0).getAbsolutePath(), 4100621512640090933L), ((File)object0).getAbsolutePath());
                contentValues6.put("type", -49);
                contentValues6.put("desc", CLS27.MTH889("file") + ": " + ((File)object0).getName());
                contentValues6.put("checked", Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues6, ⁱˉ0, arrayList0, contentValues6);
                return;
            }
            case 6: {
                String s3 = CLS31.MTH1023(((Uri)object0));
                if(TextUtils.isEmpty(s3)) {
                    s3 = ((Uri)object0).toString();
                }
                ContentValues contentValues7 = new ContentValues();
                contentValues7.put(CLS182.MTH3496(4100621869122376501L, contentValues7, "#uri_file " + ((Uri)object0), 4100621886302245685L), ((Uri)object0).toString());
                contentValues7.put("type", -49);
                CLS182.MTH3478(0x38E855EF2B3CD335L, new StringBuilder(), 4100621967906624309L, s3, contentValues7, "desc");
                contentValues7.put("checked", Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues7, ⁱˉ0, arrayList0, contentValues7);
                return;
            }
            case 7: {
                String s4 = CLS182.MTH3479(0x30, ((ContentValues)object0), "type", 4100838545927492405L);
                if(((ContentValues)object0).containsKey("addr")) {
                    s4 = ((ContentValues)object0).getAsString("addr");
                }
                CLS182.MTH3478(0x38E91AFE2B3CD335L, new StringBuilder(), 4100838120725730101L, s4, ((ContentValues)object0), "desc");
                CLS182.MTH3477(arrayList0, ((ContentValues)object0), ⁱˉ0, arrayList0, ((ContentValues)object0));
                return;
            }
            case 8: {
                if(CLS31.MTH1015(((File)object0))) {
                    ContentValues contentValues8 = new ContentValues();
                    contentValues8.put(CLS182.MTH3479(-16, contentValues8, "type", 4100841363426038581L), ((File)object0).getAbsolutePath());
                    contentValues8.put("desc", CLS27.MTH889("video"));
                    arrayList0.add(contentValues8);
                    ⁱˉ0.MTH5235(arrayList0);
                    ⁱˉ0.MTH5231(contentValues8);
                }
                return;
            }
            case 9: {
                ContentValues contentValues9 = new ContentValues();
                contentValues9.put("path", ((File)object0).getAbsolutePath());
                contentValues9.put("type", -49);
                contentValues9.put("desc", CLS27.MTH889("file") + ": " + ((File)object0).getName());
                CLS182.MTH3477(arrayList0, contentValues9, ⁱˉ0, arrayList0, contentValues9);
                return;
            }
            case 10: {
                String s5 = CLS31.MTH1023(((Uri)object0));
                if(TextUtils.isEmpty(s5)) {
                    s5 = ((Uri)object0).toString();
                }
                ContentValues contentValues10 = new ContentValues();
                contentValues10.put("uri", ((Uri)object0).toString());
                contentValues10.put("type", -49);
                CLS182.MTH3478(4100837708408869685L, new StringBuilder(), 4100837729883706165L, s5, contentValues10, "desc");
                CLS182.MTH3477(arrayList0, contentValues10, ⁱˉ0, arrayList0, contentValues10);
                return;
            }
            case 11: {
                ContentValues contentValues11 = new ContentValues();
                contentValues11.put("path", ((File)object0).getAbsolutePath());
                contentValues11.put("type", -49);
                contentValues11.put("desc", CLS27.MTH889("file") + ": " + ((File)object0).getName());
                CLS182.MTH3477(arrayList0, contentValues11, ⁱˉ0, arrayList0, contentValues11);
                return;
            }
            default: {
                String s = CLS31.MTH1023(((Uri)object0));
                if(TextUtils.isEmpty(s)) {
                    s = ((Uri)object0).toString();
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("uri", ((Uri)object0).toString());
                contentValues0.put("type", -49);
                CLS182.MTH3478(4100856400106541877L, new StringBuilder(), 0x38E92B302B3CD335L, s, contentValues0, "desc");
                CLS182.MTH3477(arrayList0, contentValues0, ⁱˉ0, arrayList0, contentValues0);
            }
        }
    }
}

