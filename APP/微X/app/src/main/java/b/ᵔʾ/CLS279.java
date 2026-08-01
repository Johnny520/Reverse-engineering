// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS426;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class CLS279 {
    public final ConcurrentLinkedQueue FLD2907;
    public static final CLS279 FLD2908;
    public final HashMap FLD2909;

    static {
        CLS279.FLD2908 = new CLS279();
    }

    public CLS279() {
        this.FLD2907 = new ConcurrentLinkedQueue();
        this.FLD2909 = new HashMap();
    }

    // 此方法包含解密的字符串
    public final void MTH4651(String s, String s1) {
        if(!CLS27.MTH901() && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s) && !CLS426.MTH6126(s1) && !CLS372.MTH5400(s1)) {
            CLS371 ʻ0 = CLS371.FLD3470;
            ʻ0.getClass();
            if(!new HashSet(ʻ0.MTH5328(s)).contains(s1)) {
                int v = ʻ0.MTH5297(s);
                int v1 = ʻ0.MTH5297(s);
                if(v1 == -1) {
                    CLS66.MTH1415(s);
                }
                else {
                    CLS66.MTH1474(v1, s);
                }
                if(v == -1) {
                    StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                    stringBuilder0.append(",");
                    stringBuilder0.append(s);
                    this.FLD2907.offer(stringBuilder0.toString());
                    return;
                }
                LinkedList linkedList0 = new LinkedList();
                linkedList0.add(CLS279.MTH4653(v, s1));
                CLS66.MTH1379(linkedList0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH4652(String s) {
        int v = CLS371.FLD3470.MTH5297(s);
        Class class0 = CLS27.MTH894("contactLabelDelClass");
        if(class0 != null) {
            try {
                String s1 = String.valueOf(v);
                Object object0 = CLS166.MTH3188(class0, new Object[]{s1});
                CLS166.MTH3199(object0, "wx", s1);
                CLS66.MTH1521(object0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static Object MTH4653(int v, String s) {
        HashSet hashSet0 = CLS371.FLD3470.MTH5295(s);
        hashSet0.add(String.valueOf(v));
        Class class0 = CLS27.MTH894("mixLabelIdsClass");
        if(class0 == null) {
            return null;
        }
        Object object0 = CLS166.MTH3188(class0, new Object[0]);
        CLS166.MTH3198(object0, CLS27.MTH897("mixLabelIdsUsernameField"), s);
        CLS166.MTH3198(object0, CLS27.MTH897("mixLabelIdsField"), TextUtils.join(",", hashSet0) + "\u0000");
        return object0;
    }

    // 此方法包含解密的字符串
    public final void MTH4654(String s, ArrayList arrayList0) {
        if(!CLS27.MTH901() && !TextUtils.isEmpty(s) && !arrayList0.isEmpty()) {
            int v = CLS371.FLD3470.MTH5297(s);
            int v1 = CLS371.FLD3470.MTH5297(s);
            if(v1 == -1) {
                CLS66.MTH1415(s);
            }
            else {
                CLS66.MTH1474(v1, s);
            }
            if(v == -1) {
                for(Object object0: arrayList0) {
                    String s1 = (String)object0;
                    if(!TextUtils.isEmpty(s1) && !CLS426.MTH6126(s1) && !CLS372.MTH5400(s1)) {
                        StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                        stringBuilder0.append(",");
                        stringBuilder0.append(s);
                        this.FLD2907.offer(stringBuilder0.toString());
                    }
                }
                return;
            }
            LinkedList linkedList0 = new LinkedList();
            for(Object object1: arrayList0) {
                String s2 = (String)object1;
                if(!TextUtils.isEmpty(s2) && !CLS426.MTH6126(s2) && !CLS372.MTH5400(s2)) {
                    linkedList0.add(CLS279.MTH4653(v, s2));
                }
            }
            CLS66.MTH1379(linkedList0);
        }
    }

    // 此方法包含解密的字符串
    public static Object MTH4655(int v, String s) {
        HashSet hashSet0 = CLS371.FLD3470.MTH5295(s);
        hashSet0.remove(String.valueOf(v));
        Class class0 = CLS27.MTH894("mixLabelIdsClass");
        if(class0 == null) {
            return null;
        }
        Object object0 = CLS166.MTH3188(class0, new Object[0]);
        CLS166.MTH3198(object0, CLS27.MTH897("mixLabelIdsUsernameField"), s);
        CLS166.MTH3198(object0, CLS27.MTH897("mixLabelIdsField"), TextUtils.join(",", hashSet0) + "\u0000");
        return object0;
    }

    public final void MTH4656() {
        if(this.FLD2909.isEmpty()) {
            return;
        }
        CLS1229 ˆٴ0 = new CLS1229(1, this);
        CLS40.FLD157.MTH1116(((CLS39)ˆٴ0));
    }
}

