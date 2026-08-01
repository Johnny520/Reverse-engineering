// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS82;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1565 implements CLS7, CLS16 {
    public final int FLD4877;
    public final CLS359 FLD4878;
    public final ArrayList FLD4879;

    public CLS1565(ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD4877 = v;
        this.FLD4879 = arrayList0;
        this.FLD4878 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS359 ⁱˉ0 = this.FLD4878;
        ArrayList arrayList0 = this.FLD4879;
        switch(this.FLD4877) {
            case 0: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 17, s);
                }
                return;
            }
            case 2: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 19, s);
                }
                return;
            }
            case 3: {
                if(!TextUtils.isEmpty(s)) {
                    ContentValues contentValues0 = new ContentValues();
                    String s1 = CLS34.MTH1063(4100837966106907445L, contentValues0, -333, 4100837987581743925L);
                    CLS182.MTH3478(4100838009056580405L, new StringBuilder(), 4100838026236449589L, s, contentValues0, s1);
                    contentValues0.put("tts", s);
                    arrayList0.add(contentValues0);
                    ⁱˉ0.MTH5235(arrayList0);
                    ⁱˉ0.MTH5231(contentValues0);
                }
                return;
            }
            case 4: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 16, s);
                }
                return;
            }
            case 5: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 18, s);
                }
                return;
            }
            case 6: {
                if(!TextUtils.isEmpty(s)) {
                    ContentValues contentValues1 = new ContentValues();
                    String s2 = CLS34.MTH1063(4100856657804579637L, contentValues1, -333, 4100856679279416117L);
                    CLS182.MTH3478(4100856700754252597L, new StringBuilder(), 4100856717934121781L, s, contentValues1, s2);
                    contentValues1.put("tts", s);
                    arrayList0.add(contentValues1);
                    ⁱˉ0.MTH5235(arrayList0);
                    ⁱˉ0.MTH5231(contentValues1);
                }
                return;
            }
            case 7: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 21, s);
                }
                return;
            }
            case 8: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 20, s);
                }
                return;
            }
            case 9: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 22, s);
                }
                return;
            }
            case 10: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 24, s);
                }
                return;
            }
            case 11: {
                if(!TextUtils.isEmpty(s) && !CLS21.FLD76.MTH830("isBomb", new Object[]{s})) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("type", 1);
                    contentValues2.put("desc", s);
                    contentValues2.put("content", s);
                    CLS182.MTH3477(arrayList0, contentValues2, ⁱˉ0, arrayList0, contentValues2);
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3485(s, arrayList0, ⁱˉ0, 23, s);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS359 ⁱˉ0 = this.FLD4878;
        ArrayList arrayList0 = this.FLD4879;
        switch(this.FLD4877) {
            case 1: {
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("voice_id", ((CLS82)object0).FLD314);
                contentValues1.put("type", -33);
                contentValues1.put("desc", CLS27.MTH889("voice"));
                contentValues1.put("content", ((CLS82)object0).FLD317);
                CLS182.MTH3477(arrayList0, contentValues1, ⁱˉ0, arrayList0, contentValues1);
                return;
            }
            case 12: {
                CLS182.MTH3477(arrayList0, ((ContentValues)object0), ⁱˉ0, arrayList0, ((ContentValues)object0));
                return;
            }
            default: {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("voice_id", ((CLS82)object0).FLD314);
                contentValues0.put("type", -33);
                contentValues0.put("desc", CLS27.MTH889("voice"));
                contentValues0.put("content", ((CLS82)object0).FLD317);
                CLS182.MTH3477(arrayList0, contentValues0, ⁱˉ0, arrayList0, contentValues0);
            }
        }
    }
}

