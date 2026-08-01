// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS82;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1087 implements CLS7, CLS16 {
    public final int FLD2349;
    public final CLS359 FLD2350;
    public final ArrayList FLD2351;

    public CLS1087(ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD2349 = v;
        this.FLD2351 = arrayList0;
        this.FLD2350 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS359 ⁱˉ0 = this.FLD2350;
        ArrayList arrayList0 = this.FLD2351;
        switch(this.FLD2349) {
            case 0: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 7, s);
                }
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 5, s);
                }
                return;
            }
            case 2: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 8, s);
                }
                return;
            }
            case 3: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 6, s);
                }
                return;
            }
            case 4: {
                if(!TextUtils.isEmpty(s)) {
                    String s1 = CLS182.MTH3484(4100684588529799989L, new StringBuilder(), s);
                    ContentValues contentValues0 = new ContentValues();
                    String s2 = CLS34.MTH1063(4100684614299603765L, contentValues0, -333, 4100684635774440245L);
                    CLS182.MTH3478(0x38E88EF82B3CD335L, new StringBuilder(), 4100684674429145909L, s, contentValues0, s2);
                    contentValues0.put("msg", s1);
                    contentValues0.put("tts", s);
                    contentValues0.put("checked", Boolean.TRUE);
                    CLS182.MTH3477(arrayList0, contentValues0, ⁱˉ0, arrayList0, contentValues0);
                }
                return;
            }
            case 6: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 9, s);
                }
                return;
            }
            case 7: {
                if(!TextUtils.isEmpty(s) && !CLS21.FLD76.MTH830("isBomb", new Object[]{s})) {
                    ContentValues contentValues1 = new ContentValues();
                    contentValues1.put("type", 1);
                    contentValues1.put("desc", s);
                    contentValues1.put("msg", s);
                    contentValues1.put("checked", Boolean.TRUE);
                    CLS182.MTH3477(arrayList0, contentValues1, ⁱˉ0, arrayList0, contentValues1);
                }
                return;
            }
            case 9: {
                if(!TextUtils.isEmpty(s) && !CLS21.FLD76.MTH830("isBomb", new Object[]{s})) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("type", 1);
                    contentValues2.put("desc", s);
                    contentValues2.put("msg", s);
                    contentValues2.put("checked", Boolean.TRUE);
                    CLS182.MTH3477(arrayList0, contentValues2, ⁱˉ0, arrayList0, contentValues2);
                }
                return;
            }
            case 10: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 4, s);
                }
                return;
            }
            case 12: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 1, s);
                }
                return;
            }
            case 14: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 3, s);
                }
                return;
            }
            case 15: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 2, s);
                }
                return;
            }
            case 16: {
                if(!TextUtils.isEmpty(s)) {
                    String s3 = CLS182.MTH3484(4100658062811779893L, new StringBuilder(), s);
                    ContentValues contentValues3 = new ContentValues();
                    String s4 = CLS34.MTH1063(4100658088581583669L, contentValues3, -333, 4100658110056420149L);
                    CLS182.MTH3478(4100658131531256629L, new StringBuilder(), 4100658148711125813L, s, contentValues3, s4);
                    contentValues3.put("msg", s3);
                    contentValues3.put("tts", s);
                    contentValues3.put("checked", Boolean.TRUE);
                    CLS182.MTH3477(arrayList0, contentValues3, ⁱˉ0, arrayList0, contentValues3);
                }
                return;
            }
            case 17: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 0, s);
                }
                return;
            }
            case 19: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 12, s);
                }
                return;
            }
            case 20: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 13, s);
                }
                return;
            }
            case 21: {
                if(!TextUtils.isEmpty(s)) {
                    String s5 = CLS182.MTH3484(4100620164020359989L, new StringBuilder(), s);
                    ContentValues contentValues4 = new ContentValues();
                    String s6 = CLS34.MTH1063(4100620189790163765L, contentValues4, -333, 4100620211265000245L);
                    CLS182.MTH3478(4100620232739836725L, new StringBuilder(), 4100620249919705909L, s, contentValues4, s6);
                    contentValues4.put("msg", s5);
                    contentValues4.put("tts", s);
                    contentValues4.put("checked", Boolean.TRUE);
                    CLS182.MTH3477(arrayList0, contentValues4, ⁱˉ0, arrayList0, contentValues4);
                }
                return;
            }
            case 22: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 11, s);
                }
                return;
            }
            case 23: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 14, s);
                }
                return;
            }
            case 24: {
                if(!TextUtils.isEmpty(s) && !CLS21.FLD76.MTH830("isBomb", new Object[]{s})) {
                    ContentValues contentValues5 = new ContentValues();
                    contentValues5.put("type", 1);
                    contentValues5.put("desc", s);
                    contentValues5.put("msg", s);
                    contentValues5.put("checked", Boolean.TRUE);
                    CLS182.MTH3477(arrayList0, contentValues5, ⁱˉ0, arrayList0, contentValues5);
                }
                return;
            }
            case 26: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 10, s);
                }
                return;
            }
            case 27: {
                if(!TextUtils.isEmpty(s) && !CLS21.FLD76.MTH830("isBomb", new Object[]{s})) {
                    ContentValues contentValues6 = new ContentValues();
                    contentValues6.put("type", 1);
                    contentValues6.put("desc", s);
                    contentValues6.put("content", s);
                    CLS182.MTH3477(arrayList0, contentValues6, ⁱˉ0, arrayList0, contentValues6);
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 15, s);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS359 ⁱˉ0 = this.FLD2350;
        ArrayList arrayList0 = this.FLD2351;
        switch(this.FLD2349) {
            case 5: {
                ((ContentValues)object0).put(CLS182.MTH3496(4100682045909160757L, ((ContentValues)object0), (CLS182.MTH3474(4100682479700857653L, ((ContentValues)object0)) == 1 ? ((ContentValues)object0).getAsString("content") : "#fav " + ((ContentValues)object0).getAsString("localId")), 4100682063089029941L), Boolean.TRUE);
                CLS182.MTH3477(arrayList0, ((ContentValues)object0), ⁱˉ0, arrayList0, ((ContentValues)object0));
                return;
            }
            case 8: {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("voice_id", ((CLS82)object0).FLD314);
                contentValues0.put("type", -33);
                contentValues0.put("desc", CLS27.MTH889("voice") + ": " + ((CLS82)object0).FLD317);
                contentValues0.put(CLS182.MTH3496(4100684360896533301L, contentValues0, "#voice " + ((CLS82)object0).FLD314, 4100684378076402485L), Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues0, ⁱˉ0, arrayList0, contentValues0);
                return;
            }
            case 11: {
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("voice_id", ((CLS82)object0).FLD314);
                contentValues1.put("type", -33);
                contentValues1.put("desc", CLS27.MTH889("voice") + ": " + ((CLS82)object0).FLD317);
                contentValues1.put(CLS182.MTH3496(4100657835178513205L, contentValues1, "#voice " + ((CLS82)object0).FLD314, 4100657852358382389L), Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues1, ⁱˉ0, arrayList0, contentValues1);
                return;
            }
            case 13: {
                ((ContentValues)object0).put(CLS182.MTH3496(4100656069946954549L, ((ContentValues)object0), (CLS182.MTH3474(4100655953982837557L, ((ContentValues)object0)) == 1 ? ((ContentValues)object0).getAsString("content") : "#fav " + ((ContentValues)object0).getAsString("localId")), 4100656087126823733L), Boolean.TRUE);
                CLS182.MTH3477(arrayList0, ((ContentValues)object0), ⁱˉ0, arrayList0, ((ContentValues)object0));
                return;
            }
            case 18: {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("voice_id", ((CLS82)object0).FLD314);
                contentValues2.put("type", -33);
                contentValues2.put("desc", CLS27.MTH889("voice") + ": " + ((CLS82)object0).FLD317);
                contentValues2.put(CLS182.MTH3496(4100619936387093301L, contentValues2, "#voice " + ((CLS82)object0).FLD314, 0x38E8541F2B3CD335L), Boolean.TRUE);
                CLS182.MTH3477(arrayList0, contentValues2, ⁱˉ0, arrayList0, contentValues2);
                return;
            }
            case 25: {
                ((ContentValues)object0).put(CLS182.MTH3496(0x38E852002B3CD335L, ((ContentValues)object0), (CLS182.MTH3474(4100618055191417653L, ((ContentValues)object0)) == 1 ? ((ContentValues)object0).getAsString("content") : "#fav " + ((ContentValues)object0).getAsString("localId")), 0x38E852042B3CD335L), Boolean.TRUE);
                CLS182.MTH3477(arrayList0, ((ContentValues)object0), ⁱˉ0, arrayList0, ((ContentValues)object0));
                return;
            }
            default: {
                CLS182.MTH3477(arrayList0, ((ContentValues)object0), ⁱˉ0, arrayList0, ((ContentValues)object0));
            }
        }
    }
}

