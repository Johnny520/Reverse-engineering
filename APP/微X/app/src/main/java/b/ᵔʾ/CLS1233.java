// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS9;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS93;
import b.ˈˊ.CLS611;
import b.ᐧˉ.CLS1019.CLS1009;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS350;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS518;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public final class CLS1233 implements CLS3 {
    public final Object FLD3015;
    public final Object FLD3016;
    public final Serializable FLD3017;
    public final int FLD3018;
    public final String FLD3019;
    public final ArrayList FLD3020;
    public final ArrayList FLD3021;
    public final int FLD3022;
    public final Serializable FLD3023;
    public final Object FLD3024;

    public CLS1233(CLS1019 ˎʻ0, String s, HashSet hashSet0, Activity activity0, int v, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, CLS350 ᐧⁱ0) {
        this.FLD3018 = 2;
        super();
        this.FLD3024 = ˎʻ0;
        this.FLD3019 = s;
        this.FLD3023 = hashSet0;
        this.FLD3016 = activity0;
        this.FLD3022 = v;
        this.FLD3021 = arrayList0;
        this.FLD3020 = arrayList1;
        this.FLD3017 = arrayList2;
        this.FLD3015 = ᐧⁱ0;
    }

    public CLS1233(CLS1019 ˎʻ0, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, CLS78 ˊﾞ0, int v, String s, SimpleDateFormat simpleDateFormat0, HashSet hashSet0) {
        this.FLD3018 = 1;
        super();
        this.FLD3024 = ˎʻ0;
        this.FLD3021 = arrayList0;
        this.FLD3020 = arrayList1;
        this.FLD3023 = arrayList2;
        this.FLD3016 = ˊﾞ0;
        this.FLD3022 = v;
        this.FLD3019 = s;
        this.FLD3017 = simpleDateFormat0;
        this.FLD3015 = hashSet0;
    }

    public CLS1233(CLS280 ʻᵎ0, String s, CLS1228 ʾˈ0, String s1, String s2, String s3, int v, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD3018 = 0;
        super();
        this.FLD3024 = ʻᵎ0;
        this.FLD3019 = s;
        this.FLD3015 = ʾˈ0;
        this.FLD3023 = s1;
        this.FLD3016 = s2;
        this.FLD3017 = s3;
        this.FLD3022 = v;
        this.FLD3021 = arrayList0;
        this.FLD3020 = arrayList1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD3019;
        Serializable serializable0 = this.FLD3017;
        Object object0 = this.FLD3016;
        Serializable serializable1 = this.FLD3023;
        Object object1 = this.FLD3015;
        Object object2 = this.FLD3024;
        switch(this.FLD3018) {
            case 0: {
                ((CLS280)object2).getClass();
                Bitmap bitmap0 = CLS518.MTH7060(s);
                CLS280.MTH4660(((CLS12)object1), CLS66.MTH1428(((String)serializable1), ((String)object0), ((String)serializable0), (bitmap0 == null ? null : CLS518.MTH7054(bitmap0)), this.FLD3022, this.FLD3021, this.FLD3020));
                return;
            }
            case 1: {
                ((CLS1019)object2).getClass();
                ArrayList arrayList1 = this.FLD3021;
                arrayList1.clear();
                ArrayList arrayList2 = this.FLD3020;
                arrayList2.clear();
                ((ArrayList)serializable1).clear();
                CLS61 ﾞٴ0 = ((CLS1019)object2).FLD2088;
                int v = this.FLD3022;
                ((ArrayList)serializable1).addAll(ﾞٴ0.MTH1338(v, ""));
                for(Object object3: ((ArrayList)serializable1)) {
                    CLS93 ⁱʾ0 = (CLS93)object3;
                    String s1 = CLS21.FLD76.MTH826("getNicknameInChatroom", new Object[]{s, ⁱʾ0.FLD396});
                    if(v == 1) {
                        if(!ﾞٴ0.MTH1325(ⁱʾ0) || ﾞٴ0.MTH1307(ⁱʾ0.FLD396)) {
                            continue;
                        }
                        String s2 = ﾞٴ0.MTH1311(s, ⁱʾ0.FLD396);
                        if(!TextUtils.isEmpty(s2)) {
                            StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                            stringBuilder0.append("\n");
                            stringBuilder0.append(CLS27.MTH889("reason"));
                            stringBuilder0.append(": ");
                            stringBuilder0.append(s2);
                            s1 = stringBuilder0.toString();
                        }
                        if(ﾞٴ0.FLD186) {
                            long v1 = ﾞٴ0.MTH1324(s, ⁱʾ0.FLD396);
                            if(v1 != 0L) {
                                StringBuilder stringBuilder1 = CLS182.MTH3483(s1);
                                stringBuilder1.append("\n");
                                s1 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{((SimpleDateFormat)serializable0).format(new Date(v1))}, stringBuilder1);
                            }
                        }
                    }
                    ((HashSet)object1).add(ⁱʾ0.FLD396);
                    arrayList2.add(new CLS78(ⁱʾ0.FLD396, s1));
                    arrayList1.add(ⁱʾ0);
                }
                return;
            }
            default: {
                ((CLS1019)object2).getClass();
                ArrayList arrayList0 = new ArrayList();
                CLS611 ﾞᐧ0 = new CLS611(((HashSet)serializable1));
                ((CLS1019)object2).FLD2092.MTH5371(s, arrayList0, ((CLS9)ﾞᐧ0));
                CLS387.MTH5585(true, ((Activity)object0), arrayList0, ((CLS2)new CLS1009(((CLS1019)object2), s, this.FLD3022, this.FLD3021, this.FLD3020, ((ArrayList)serializable0), ((CLS350)object1))), "", -1);
            }
        }
    }
}

