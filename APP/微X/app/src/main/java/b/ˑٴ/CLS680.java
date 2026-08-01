// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS69;
import b.ⁱᵔ.CLS412.CLS410;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS680 implements CLS6, CLS39 {
    public final int FLD741;
    public final Object FLD742;
    public final long FLD743;
    public final Object FLD744;

    public CLS680(Object object0, Object object1, long v, int v1) {
        this.FLD741 = v1;
        this.FLD742 = object0;
        this.FLD744 = object1;
        this.FLD743 = v;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        long v = this.FLD743;
        Object object0 = this.FLD744;
        Object object1 = this.FLD742;
        if(this.FLD741 == 1) {
            ((CLS877)object1).MTH3083(v, ((ContentValues)object0));
            return;
        }
        new CLS410(Math.max(v - 2000L, 1000L), Toast.makeText(((Context)object1), ((String)object0), 0)).start();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS6
    public final void MTH783(ArrayList arrayList0) {
        CLS629 ʻˋ0 = (CLS629)this.FLD742;
        String s = (String)this.FLD744;
        long v = this.FLD743;
        ʻˋ0.getClass();
        ArrayList arrayList1 = new ArrayList();
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            Bitmap bitmap0 = CLS518.MTH7060(new CLS69(((String)arrayList0.get(v1))).MTH1563());
            if(bitmap0 != null) {
                arrayList1.add(bitmap0);
            }
        }
        if(!arrayList1.isEmpty()) {
            CLS523.MTH7150(((CLS140)ʻˋ0).MTH3042(), CLS27.MTH889("moment_img_screenshot"), ((CLS17)new CLS683(v, ʻˋ0, s, arrayList1)));
        }
    }
}

