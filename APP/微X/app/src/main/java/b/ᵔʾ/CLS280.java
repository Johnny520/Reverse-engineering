// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

public final class CLS280 {
    public static final CLS280 FLD2910;

    static {
        CLS280.FLD2910 = new CLS280();
    }

    public final void MTH4659(ContentValues contentValues0, long v, String s, int v1, ArrayList arrayList0, ArrayList arrayList1, CLS1228 ʾˈ0) {
        CLS280.MTH4660(((CLS12)ʾˈ0), (((int)contentValues0.getAsInteger("type")) == 2 ? CLS66.MTH1418(s, v1, arrayList0, arrayList1) : -1));
        if(((int)contentValues0.getAsInteger("type")) == 1) {
            CLS466.MTH6534(((CLS6)new CLS1227(this, ʾˈ0, s, v1, arrayList0, arrayList1)), CLS66.MTH1489(v));
        }
        else {
            CLS280.MTH4660(((CLS12)ʾˈ0), -1);
        }
        Class class0 = CLS27.MTH894("SnsPathClass");
        if(((int)contentValues0.getAsInteger("type")) != 15 || class0 == null) {
            CLS280.MTH4660(((CLS12)ʾˈ0), -1);
        }
        else {
            CLS1248 ـﹳ0 = new CLS1248(this, "sns_table_" + v, ʾˈ0, s, v1, arrayList0, arrayList1);
            CLS40.FLD157.MTH1123(((CLS39)ـﹳ0), 8000L);
        }
        if(((int)contentValues0.getAsInteger("type")) == 3) {
            Object object0 = CLS66.MTH1434(v);
            if(object0 == null) {
                CLS280.MTH4660(((CLS12)ʾˈ0), -1);
            }
            else {
                Object object1 = CLS166.MTH3194(CLS166.MTH3195(object0, CLS27.MTH897("snsSightMethod5"), new Object[0]), CLS27.MTH897("snsContentLinkField"));
                String s1 = (String)CLS166.MTH3194(object1, CLS27.MTH897("snsContentLinkTitleField"));
                Object object2 = CLS166.MTH3194(object1, CLS27.MTH897("snsArticleFieldUrl"));
                if(TextUtils.isEmpty(s1)) {
                    CLS280.MTH4660(((CLS12)ʾˈ0), -1);
                }
                else {
                    if(CLS502.MTH6934(s1, new String[]{"http://"})) {
                        s1 = s1.split(" ")[0];
                    }
                    LinkedList linkedList0 = (LinkedList)CLS166.MTH3194(object1, CLS27.MTH897("snsSightField3"));
                    byte[] arr_b = null;
                    if(linkedList0 == null || linkedList0.isEmpty()) {
                        CLS280.MTH4660(((CLS12)ʾˈ0), CLS66.MTH1428(s, ((String)object2), s1, null, v1, arrayList0, arrayList1));
                    }
                    else {
                        String s2 = CLS66.MTH1451(linkedList0.get(0));
                        if(CLS31.MTH1024(s2)) {
                            Bitmap bitmap0 = CLS518.MTH7060(s2);
                            if(bitmap0 != null) {
                                arr_b = CLS518.MTH7054(bitmap0);
                            }
                            CLS280.MTH4660(((CLS12)ʾˈ0), CLS66.MTH1428(s, ((String)object2), s1, arr_b, v1, arrayList0, arrayList1));
                        }
                        else {
                            CLS466.MTH6523(new File(s2), ((CLS3)new CLS1233(this, s2, ʾˈ0, s, ((String)object2), s1, v1, arrayList0, arrayList1)), 60000L);
                        }
                    }
                }
            }
        }
        else {
            CLS280.MTH4660(((CLS12)ʾˈ0), -1);
        }
        switch(((int)contentValues0.getAsInteger("type"))) {
            case 4: 
            case 42: {
                Object object3 = CLS66.MTH1434(v);
                if(object3 != null) {
                    Object object4 = CLS166.MTH3194(CLS166.MTH3195(object3, CLS27.MTH897("snsSightMethod5"), new Object[0]), CLS27.MTH897("snsContentLinkField"));
                    LinkedList linkedList1 = (LinkedList)CLS166.MTH3194(object4, CLS27.MTH897("snsSightField3"));
                    if(linkedList1 != null && !linkedList1.isEmpty()) {
                        Object object5 = linkedList1.get(0);
                        Object object6 = CLS166.MTH3194(object5, CLS27.MTH897("snsArticleFieldImgUrl"));
                        Object object7 = CLS166.MTH3194(object5, CLS27.MTH897("snsContentLinkTitleField"));
                        Object object8 = CLS166.MTH3194(object5, CLS27.MTH897("snsArticleFieldUrl"));
                        CLS518.MTH7068(((String)object6), ((CLS516)new CLS1263(this, ʾˈ0, s, ((String)CLS166.MTH3194(object4, CLS27.MTH897("snsArticleFieldUrl"))), ((String)object8), ((String)object7), (CLS27.MTH890("snsArticleFieldSinger") ? ((String)CLS166.MTH3194(object5, CLS27.MTH897("snsArticleFieldSinger"))) : ""), v1, arrayList0, arrayList1)));
                        return;
                    }
                }
            }
        }
        CLS280.MTH4660(((CLS12)ʾˈ0), -1);
    }

    public static void MTH4660(CLS12 ᵔʾ0, int v) {
        if(ᵔʾ0 != null) {
            ᵔʾ0.MTH791(v);
        }
    }
}

