// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS3;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1132 implements CLS3 {
    public final int FLD2559;
    public final ArrayList FLD2560;
    public final CLS359 FLD2561;
    public final ContentValues FLD2562;

    public CLS1132(CLS359 ⁱˉ0, ArrayList arrayList0, ContentValues contentValues0, int v) {
        this.FLD2559 = v;
        this.FLD2561 = ⁱˉ0;
        this.FLD2560 = arrayList0;
        this.FLD2562 = contentValues0;
        super();
    }

    public CLS1132(ArrayList arrayList0, ContentValues contentValues0, CLS359 ⁱˉ0, int v) {
        this.FLD2559 = v;
        this.FLD2560 = arrayList0;
        this.FLD2562 = contentValues0;
        this.FLD2561 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        int v = 0;
        ContentValues contentValues0 = this.FLD2562;
        ArrayList arrayList0 = this.FLD2560;
        CLS359 ⁱˉ0 = this.FLD2561;
        switch(this.FLD2559) {
            case 0: {
                ⁱˉ0.MTH5238();
                arrayList0.remove(contentValues0);
                while(v < ⁱˉ0.getCount()) {
                    ContentValues contentValues1 = (ContentValues)ⁱˉ0.getItem(v);
                    if(contentValues1.containsKey("checked") && contentValues1.getAsBoolean("checked").booleanValue()) {
                        ⁱˉ0.MTH5227(v, true);
                    }
                    ++v;
                }
                ⁱˉ0.MTH5235(arrayList0);
                return;
            }
            case 1: {
                ⁱˉ0.MTH5238();
                arrayList0.remove(contentValues0);
                while(v < ⁱˉ0.getCount()) {
                    ContentValues contentValues2 = (ContentValues)ⁱˉ0.getItem(v);
                    if(contentValues2.containsKey("checked") && contentValues2.getAsBoolean("checked").booleanValue()) {
                        ⁱˉ0.MTH5227(v, true);
                    }
                    ++v;
                }
                ⁱˉ0.MTH5235(arrayList0);
                return;
            }
            case 2: {
                ⁱˉ0.MTH5238();
                arrayList0.remove(contentValues0);
                while(v < ⁱˉ0.getCount()) {
                    ContentValues contentValues3 = (ContentValues)ⁱˉ0.getItem(v);
                    if(contentValues3.containsKey("checked") && contentValues3.getAsBoolean("checked").booleanValue()) {
                        ⁱˉ0.MTH5227(v, true);
                    }
                    ++v;
                }
                ⁱˉ0.MTH5235(arrayList0);
                return;
            }
            case 3: {
                arrayList0.remove(contentValues0);
                ⁱˉ0.MTH5235(arrayList0);
                return;
            }
            default: {
                arrayList0.remove(contentValues0);
                ⁱˉ0.MTH5235(arrayList0);
            }
        }
    }
}

