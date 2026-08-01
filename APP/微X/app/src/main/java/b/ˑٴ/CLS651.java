// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS54;
import b.ˈˈ.CLS82;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1225;
import b.ⁱᵔ.CLS1486;
import b.ⁱᵔ.CLS1542;
import b.ⁱᵔ.CLS387.CLS1298;
import b.ⁱᵔ.CLS387.CLS1301;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS651 implements CLS3 {
    public final int FLD643;
    public final Activity FLD644;

    public CLS651(Activity activity0, int v) {
        this.FLD643 = v;
        this.FLD644 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD644;
        switch(this.FLD643) {
            case 0: {
                CLS403.MTH5872(false, activity0, new ArrayList(), null);
                return;
            }
            case 1: {
                CLS462.MTH6485(activity0, ((CLS8)new CLS1486()));
                return;
            }
            case 2: {
                CLS462.MTH6488(false, activity0, null);
                return;
            }
            case 3: {
                File file0 = new File(activity0.getCacheDir(), "wx_voices_export");
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: CLS54.FLD172.MTH1248()) {
                    String s = ((CLS82)object0).FLD317;
                    HashSet hashSet0 = ((CLS82)object0).FLD316;
                    if(!hashSet0.isEmpty() != 0) {
                        StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                        stringBuilder0.append("<br>");
                        stringBuilder0.append(CLS27.MTH889("tags"));
                        stringBuilder0.append(": ");
                        stringBuilder0.append(TextUtils.join(",", hashSet0));
                        s = stringBuilder0.toString();
                    }
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put(CLS182.MTH3496(4101310438279271221L, contentValues0, s, 4101310459754107701L), ((CLS82)object0).FLD314);
                    arrayList0.add(contentValues0);
                }
                String s1 = CLS27.MTH889("export_");
                CLS395.MTH5722(activity0, ((CLS8)new CLS1542(activity0, file0)), s1, arrayList0);
                return;
            }
            case 4: {
                CLS523.MTH7165(activity0, CLS27.MTH889("add"), "", "", 1, ((CLS16)new CLS1225(23)));
                return;
            }
            case 5: {
                CLS387.MTH5592(activity0, "request");
                return;
            }
            case 6: {
                CLS387.MTH5592(activity0, "chatroom");
                return;
            }
            case 7: {
                CLS387.MTH5592(activity0, "nearby");
                return;
            }
            case 8: {
                ArrayList arrayList1 = (ArrayList)CLS21.FLD76.MTH836("getNearbyList", new Object[0]);
                if(arrayList1 != null && !arrayList1.isEmpty()) {
                    String s2 = CLS27.MTH889("export_");
                    CLS387.MTH5589(activity0, ((CLS8)new CLS1298()), s2, arrayList1);
                }
                return;
            }
            case 9: {
                ArrayList arrayList2 = (ArrayList)CLS21.FLD76.MTH836("getNearbyList", new Object[0]);
                if(arrayList2 != null && !arrayList2.isEmpty()) {
                    String s3 = CLS27.MTH889("copy_clipboard");
                    CLS387.MTH5589(activity0, ((CLS8)new CLS1301(activity0)), s3, arrayList2);
                }
                return;
            }
            case 10: {
                CLS523.MTH7165(activity0, CLS27.MTH889("export_"), "", "", 1, ((CLS16)new CLS796(activity0, 3)));
                return;
            }
            default: {
                CLS403.MTH5872(false, activity0, new ArrayList(), null);
            }
        }
    }
}

