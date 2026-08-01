// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ⁱʾ.CLS359;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1278 implements CLS3 {
    public final int FLD3483;
    public final CLS507 FLD3484;

    public CLS1278(CLS507 ﹳˊ0, int v) {
        this.FLD3483 = v;
        this.FLD3484 = ﹳˊ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS507 ﹳˊ0 = this.FLD3484;
        switch(this.FLD3483) {
            case 0: {
                if(!TextUtils.isEmpty(ﹳˊ0.FLD4998)) {
                    ﹳˊ0.FLD5001 = new File(ﹳˊ0.FLD4998);
                    ﹳˊ0.MTH6978();
                }
                return;
            }
            case 1: {
                for(int v = 0; v < ﹳˊ0.FLD4996.getCount(); ++v) {
                    ContentValues contentValues1 = (ContentValues)ﹳˊ0.FLD4996.getItem(v);
                    if(contentValues1.containsKey("path") && new File(contentValues1.getAsString("path")).isFile()) {
                        ﹳˊ0.FLD4996.MTH5231(contentValues1);
                    }
                }
                ﹳˊ0.FLD4996.notifyDataSetChanged();
                return;
            }
            default: {
                ArrayList arrayList0 = ﹳˊ0.FLD4996.MTH5234();
                HashSet hashSet0 = new HashSet();
                for(Object object0: arrayList0) {
                    hashSet0.add(((ContentValues)object0).getAsString("path"));
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: ﹳˊ0.FLD5002) {
                    ContentValues contentValues0 = (ContentValues)object1;
                    if(contentValues0.containsKey("path")) {
                        String s = contentValues0.getAsString("path");
                        if(new File(s).isFile() && !hashSet0.contains(s)) {
                            arrayList1.add(contentValues0);
                        }
                    }
                }
                ﹳˊ0.FLD4996.MTH5238();
                CLS359 ⁱˉ0 = ﹳˊ0.FLD4996;
                ⁱˉ0.getClass();
                for(Object object2: arrayList1) {
                    ⁱˉ0.MTH5231(((ContentValues)object2));
                }
                ﹳˊ0.FLD4996.notifyDataSetChanged();
            }
        }
    }
}

