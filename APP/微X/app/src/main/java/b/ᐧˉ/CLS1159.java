// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS82;
import b.ⁱʾ.CLS359;

public final class CLS1159 implements CLS7, CLS16 {
    public final int FLD2657;
    public final CLS359 FLD2658;
    public final ContentValues FLD2659;

    public CLS1159(ContentValues contentValues0, CLS359 ⁱˉ0, int v) {
        this.FLD2657 = v;
        this.FLD2659 = contentValues0;
        this.FLD2658 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS359 ⁱˉ0 = this.FLD2658;
        ContentValues contentValues0 = this.FLD2659;
        switch(this.FLD2657) {
            case 0: {
                if(!TextUtils.isEmpty(s) && !CLS21.FLD76.MTH830("isBomb", new Object[]{s})) {
                    contentValues0.put("desc", s);
                    contentValues0.put("content", s);
                    contentValues0.put("msg", s);
                    ⁱˉ0.notifyDataSetChanged();
                }
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(s)) {
                    String s1 = CLS182.MTH3484(4100667327056237365L, new StringBuilder(), s);
                    CLS182.MTH3478(4100667924056691509L, new StringBuilder(), 4100667941236560693L, s, contentValues0, "desc");
                    contentValues0.put("msg", s1);
                    contentValues0.put("tts", s);
                    ⁱˉ0.notifyDataSetChanged();
                }
                return;
            }
            case 3: {
                if(!TextUtils.isEmpty(s) && !CLS21.FLD76.MTH830("isBomb", new Object[]{s})) {
                    contentValues0.put("desc", s);
                    contentValues0.put("content", s);
                    contentValues0.put("msg", s);
                    ⁱˉ0.notifyDataSetChanged();
                }
                return;
            }
            case 4: {
                if(!TextUtils.isEmpty(s)) {
                    String s2 = CLS182.MTH3484(4100679438864012085L, new StringBuilder(), s);
                    CLS182.MTH3478(4100680035864466229L, new StringBuilder(), 4100680053044335413L, s, contentValues0, "desc");
                    contentValues0.put("msg", s2);
                    contentValues0.put("tts", s);
                    ⁱˉ0.notifyDataSetChanged();
                }
                return;
            }
            case 6: {
                if(!TextUtils.isEmpty(s) && !CLS21.FLD76.MTH830("isBomb", new Object[]{s})) {
                    contentValues0.put("desc", s);
                    contentValues0.put("content", s);
                    contentValues0.put("msg", s);
                    ⁱˉ0.notifyDataSetChanged();
                }
                return;
            }
            case 8: {
                if(!TextUtils.isEmpty(s)) {
                    contentValues0.put("delay", ((int)(Double.parseDouble(s) * 1000.0)));
                    ⁱˉ0.notifyDataSetChanged();
                }
                return;
            }
            case 9: {
                if(!TextUtils.isEmpty(s) && !CLS21.FLD76.MTH830("isBomb", new Object[]{s})) {
                    contentValues0.put("desc", s);
                    contentValues0.put("content", s);
                    ⁱˉ0.notifyDataSetChanged();
                }
                return;
            }
            case 10: {
                if(!TextUtils.isEmpty(s)) {
                    CLS182.MTH3478(4100843528089555765L, new StringBuilder(), 0x38E91F7A2B3CD335L, s, contentValues0, "desc");
                    contentValues0.put("tts", s);
                    ⁱˉ0.notifyDataSetChanged();
                }
                return;
            }
            case 11: {
                if(!TextUtils.isEmpty(s) && !CLS21.FLD76.MTH830("isBomb", new Object[]{s})) {
                    contentValues0.put("desc", s);
                    contentValues0.put("content", s);
                    ⁱˉ0.notifyDataSetChanged();
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    contentValues0.put("delay", ((int)(Double.parseDouble(s) * 1000.0)));
                    ⁱˉ0.notifyDataSetChanged();
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS359 ⁱˉ0 = this.FLD2658;
        ContentValues contentValues0 = this.FLD2659;
        switch(this.FLD2657) {
            case 2: {
                contentValues0.put("voice_id", ((CLS82)object0).FLD314);
                contentValues0.put("desc", CLS27.MTH889("voice") + ": " + ((CLS82)object0).FLD317);
                contentValues0.put("msg", "#voice " + ((CLS82)object0).FLD314);
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            case 5: {
                contentValues0.put("voice_id", ((CLS82)object0).FLD314);
                contentValues0.put("desc", CLS27.MTH889("voice") + ": " + ((CLS82)object0).FLD317);
                contentValues0.put("msg", "#voice " + ((CLS82)object0).FLD314);
                ⁱˉ0.notifyDataSetChanged();
                return;
            }
            default: {
                contentValues0.put("voice_id", ((CLS82)object0).FLD314);
                contentValues0.put("desc", CLS27.MTH889("voice") + ": " + ((CLS82)object0).FLD317);
                contentValues0.put("msg", "#voice " + ((CLS82)object0).FLD314);
                ⁱˉ0.notifyDataSetChanged();
            }
        }
    }
}

