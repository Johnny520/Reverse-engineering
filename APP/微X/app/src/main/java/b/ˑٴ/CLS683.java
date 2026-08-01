// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS14;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS91;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS307.CLS306;
import b.ᵔʾ.CLS307;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS428;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS525;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public final class CLS683 implements CLS17, CLS39 {
    public final int FLD757;
    public final Object FLD758;
    public final Object FLD759;
    public final long FLD760;
    public final Object FLD761;

    public CLS683(long v, CLS629 ʻˋ0, String s, ArrayList arrayList0) {
        this.FLD757 = 0;
        super();
        this.FLD761 = ʻˋ0;
        this.FLD759 = s;
        this.FLD758 = arrayList0;
        this.FLD760 = v;
    }

    public CLS683(Activity activity0, View view0, String s, long v) {
        this.FLD757 = 3;
        super();
        this.FLD761 = activity0;
        this.FLD758 = view0;
        this.FLD759 = s;
        this.FLD760 = v;
    }

    public CLS683(CLS877 ﹶﾞ0, long v, String s, String s1) {
        this.FLD757 = 1;
        super();
        this.FLD761 = ﹶﾞ0;
        this.FLD760 = v;
        this.FLD759 = s;
        this.FLD758 = s1;
    }

    public CLS683(CLS877 ﹶﾞ0, ContentValues contentValues0, long v, String s) {
        this.FLD757 = 2;
        super();
        this.FLD761 = ﹶﾞ0;
        this.FLD758 = contentValues0;
        this.FLD760 = v;
        this.FLD759 = s;
    }

    public CLS683(ArrayList arrayList0, Activity activity0, CLS1622 ˑٴ0, long v) {
        this.FLD757 = 4;
        super();
        this.FLD758 = arrayList0;
        this.FLD761 = activity0;
        this.FLD759 = ˑٴ0;
        this.FLD760 = v;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        long v = this.FLD760;
        boolean z = false;
        Object object0 = this.FLD758;
        Object object1 = this.FLD759;
        Object object2 = this.FLD761;
        switch(this.FLD757) {
            case 1: {
                ((CLS877)object2).getClass();
                ContentValues contentValues0 = CLS66.MTH1430(v);
                if(contentValues0 == null || !contentValues0.containsKey("sourceType") || CLS182.MTH3474(4102208825178510133L, contentValues0) != 8) {
                    if(!((CLS877)object2).FLD1445.MTH938("auto_comment_robot", false) || !((CLS877)object2).FLD1447.FLD1438.MTH6895("auto_comment_robot")) {
                        CLS91 ᵔʾ0 = ((CLS44)CLS40.FLD157.MTH1118(CLS44.class)).MTH1184("_MOMENT_COMMENT_");
                        if(ᵔʾ0 != null) {
                            CLS306 ⁱʽ$ᵔʾ0 = new CLS306(1000, v, ((String)object0), ᵔʾ0.MTH1735());
                            CLS307.FLD3187.FLD3186.MTH3150(ⁱʽ$ᵔʾ0);
                            CLS307.FLD3187.FLD3186.MTH3149(1000L);
                        }
                    }
                    else {
                        CLS14 ⁱʾ0 = CLS404.MTH5897("sns");
                        if(ⁱʾ0 != null) {
                            ⁱʾ0.MTH793(((String)object1), ((String)object0), ((String)object0), CLS371.FLD3470.MTH5304(((String)object0)), ((CLS10)new CLS690(v, ((String)object0))));
                            return;
                        }
                    }
                }
                return;
            }
            case 2: {
                ((CLS877)object2).MTH3099(((ContentValues)object0), v, ((String)object1));
                return;
            }
            default: {
                Activity activity0 = (Activity)object2;
                View view0 = (View)object0;
                String s = (String)object1;
                String s1 = CLS27.MTH889("appname");
                if(CLS27.MTH890("snackbarClass1")) {
                    try {
                        Class class0 = CLS27.MTH894("snackbarClass1");
                        Class class1 = CLS27.MTH894("snackbarClass2");
                        Object object3 = view0 == null ? CLS166.MTH3188(class0, new Object[]{activity0}) : CLS166.MTH3188(class0, new Object[]{activity0, view0});
                        if(object3 != null) {
                            CLS166.MTH3198(object3, CLS27.MTH897("snackbarClass1_field1"), s);
                            CLS166.MTH3198(object3, CLS27.MTH897("snackbarClass1_field2"), s1);
                            if(CLS27.MTH890("snackbarClass1_field3")) {
                                CLS166.MTH3196(((int)v), object3, CLS27.MTH897("snackbarClass1_field3"));
                            }
                            else if(CLS27.MTH890("snackbarClass1_field3b")) {
                                String s2 = CLS27.MTH897("snackbarClass1_field3b");
                                try {
                                    CLS166.MTH3187(object3.getClass(), s2).setShort(object3, ((short)(((int)v))));
                                }
                                catch(IllegalAccessException illegalAccessException0) {
                                    CLS27.MTH893(illegalAccessException0);
                                    throw new IllegalAccessError(illegalAccessException0.getMessage());
                                }
                            }
                            if(CLS27.MTH890("snackbarClass2_method1")) {
                                CLS166.MTH3192(class1, CLS27.MTH897("snackbarClass2_method1"), new Object[]{object3, null, null});
                            }
                            else if(CLS27.MTH890("snackbarClass2_method1b")) {
                                CLS166.MTH3192(class1, CLS27.MTH897("snackbarClass2_method1b"), new Object[]{object3, activity0, null, null});
                            }
                            z = true;
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                if(z) {
                    CLS27.MTH906(s);
                    return;
                }
                CLS412.MTH6008(activity0, s, v);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        long v = this.FLD760;
        Object object0 = this.FLD758;
        Object object1 = this.FLD759;
        Object object2 = this.FLD761;
        if(this.FLD757 == 0) {
            ((CLS629)object2).getClass();
            Menu menu0 = (Menu)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            Activity activity0 = ((CLS140)(((CLS629)object2))).MTH3042();
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
            ScrollView scrollView0 = new ScrollView(activity0);
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setOrientation(1);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            linearLayout1.measure(0, 0);
            linearLayout1.layout(0, 0, linearLayout1.getMeasuredWidth(), linearLayout1.getMeasuredHeight());
            linearLayout1.buildDrawingCache(true);
            linearLayout1.setDrawingCacheQuality(0x100000);
            linearLayout1.setDrawingCacheBackgroundColor(-1);
            TextView textView0 = new TextView(activity0);
            textView0.setText(((String)object1));
            textView0.setTextColor(0xFF000000);
            textView0.setPadding(CLS523.MTH7137(5), CLS523.MTH7137(5), CLS523.MTH7137(5), CLS523.MTH7137(20));
            linearLayout1.addView(textView0, new LinearLayout.LayoutParams(-1, -2));
            for(Object object3: ((ArrayList)object0)) {
                ImageView imageView0 = new ImageView(activity0);
                imageView0.setImageBitmap(((Bitmap)object3));
                imageView0.setPadding(CLS523.MTH7137(5), 0, CLS523.MTH7137(5), 0);
                linearLayout1.addView(imageView0, new LinearLayout.LayoutParams(-1, -2));
            }
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            TextView textView1 = new TextView(activity0);
            textView1.setText(simpleDateFormat0.format(new Date(v)));
            textView1.setTextColor(0xFF000000);
            textView1.setPadding(CLS523.MTH7137(5), CLS523.MTH7137(5), CLS523.MTH7137(5), CLS523.MTH7137(20));
            linearLayout1.addView(textView1, new LinearLayout.LayoutParams(-1, -2));
            scrollView0.addView(linearLayout1, new LinearLayout.LayoutParams(-1, -2));
            scrollView0.measure(View.MeasureSpec.makeMeasureSpec(scrollView0.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(scrollView0.getChildAt(0).getHeight(), 0x80000000));
            scrollView0.layout(0, 0, scrollView0.getMeasuredWidth(), scrollView0.getMeasuredHeight());
            CLS525 ʻˑ0 = new CLS525(((CLS140)(((CLS629)object2))).MTH3042(), linearLayout0, menu0);
            ʻˑ0.MTH7187("forward_to_friends", ((CLS3)new CLS742(((CLS629)object2), scrollView0, 0)));
            ʻˑ0.MTH7187("forward_chat_to_sns", ((CLS3)new CLS742(((CLS629)object2), scrollView0, 1)));
            ʻˑ0.MTH7187("share", ((CLS3)new CLS742(((CLS629)object2), scrollView0, 2)));
            ʻˑ0.MTH7188();
            CLS523.MTH7139(linearLayout0, scrollView0, 0);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTime(new Date(System.currentTimeMillis()));
        ((ArrayList)object0).addAll(Arrays.asList(new String[]{simpleDateFormat2.format(calendar0.getTime()), simpleDateFormat1.format(calendar0.getTime())}));
        CLS1626 ـﹳ0 = new CLS1626(((Activity)object2));
        ـﹳ0.MTH800(CLS27.MTH889("select_date"));
        ـﹳ0.MTH7325(((String)((ArrayList)object0).get(0)));
        ـﹳ0.MTH7324(new CLS428(simpleDateFormat2, ((ArrayList)object0), ((Activity)object2), ـﹳ0, 0));
        CLS1626 ـﹳ1 = new CLS1626(((Activity)object2));
        ـﹳ1.MTH800(CLS27.MTH889("select_time"));
        ـﹳ1.MTH7325(((String)((ArrayList)object0).get(1)));
        ـﹳ1.MTH7324(new CLS428(simpleDateFormat1, ((ArrayList)object0), ((Activity)object2), ـﹳ1, 1));
        CLS1623 יᐧ0 = new CLS1623(((Activity)object2));
        ((CLS1622)object1).MTH800(CLS27.MTH889("content"));
        ((CLS1622)object1).MTH7277(CLS502.MTH6931(CLS396.FLD3775.MTH5752(v)));
        יᐧ0.MTH7289(new Object[]{((CLS1622)object1), ـﹳ0, ـﹳ1});
        יᐧ0.MTH7290(linearLayout2, CLS523.MTH7137(3));
    }
}

