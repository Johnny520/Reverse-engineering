// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˆʿ.CLS59;
import b.ˈˈ.CLS94;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1618;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1628;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS545;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CLS870 implements CLS378, CLS379 {
    public final CLS881 FLD1450;
    public final Activity FLD1451;
    public final CLS1620 FLD1452;
    public final ArrayList FLD1453;

    public CLS870(CLS881 ﾞˏ0, Activity activity0, ArrayList arrayList0, CLS1620 ˊˏ0) {
        this.FLD1450 = ﾞˏ0;
        this.FLD1451 = activity0;
        this.FLD1453 = arrayList0;
        this.FLD1452 = ˊˏ0;
    }

    public CLS870(CLS881 ﾞˏ0, CLS1620 ˊˏ0, Activity activity0, ArrayList arrayList0) {
        this.FLD1450 = ﾞˏ0;
        this.FLD1452 = ˊˏ0;
        this.FLD1451 = activity0;
        this.FLD1453 = arrayList0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS1620 ˊˏ0 = this.FLD1452;
        Activity activity0 = this.FLD1451;
        ArrayList arrayList0 = this.FLD1453;
        CLS881 ﾞˏ0 = this.FLD1450;
        ﾞˏ0.getClass();
        ʻˑ0.MTH7187("select_img1", ((CLS3)new CLS788(ﾞˏ0, 4)));
        if(CLS21.FLD76.MTH830("hasReadStoragePermission", new Object[0])) {
            ʻˑ0.MTH7187("select_img2", ((CLS3)new CLS788(ﾞˏ0, 5)));
        }
        if(CLS27.MTH890("AlbumPreviewUI")) {
            ʻˑ0.MTH7187("select_img3", ((CLS3)new CLS788(ﾞˏ0, 6)));
        }
        ʻˑ0.MTH7187("rename", ((CLS3)new CLS1274(ﾞˏ0, ˊˏ0, 14)));
        ʻˑ0.MTH7187("add", ((CLS3)new CLS726(ﾞˏ0, activity0, arrayList0, ˊˏ0, 0)));
        ʻˑ0.MTH7187("delete", ((CLS3)new CLS726(ﾞˏ0, activity0, arrayList0, ˊˏ0, 1)));
        ʻˑ0.MTH7187("select_color", ((CLS3)new CLS780(ﾞˏ0, activity0, 1)));
        ʻˑ0.MTH7187("select_preview", ((CLS3)new CLS788(ﾞˏ0, 7)));
        ʻˑ0.MTH7187("update_preview", ((CLS3)new CLS788(ﾞˏ0, 8)));
        if(!CLS182.MTH3470(0x38ECDEF02B3CD335L)) {
            ʻˑ0.MTH7187("edit_img", ((CLS3)new CLS788(ﾞˏ0, 9)));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS881 ﾞˏ0 = this.FLD1450;
        ﾞˏ0.getClass();
        Activity activity0 = this.FLD1451;
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH800(CLS27.MTH889("watermark_image"));
        ﾞˏ0.FLD1497 = new ImageView(activity0);
        ﾞˏ0.FLD1496 = new ImageView(activity0);
        ArrayList arrayList0 = this.FLD1453;
        if(!arrayList0.contains(ﾞˏ0.FLD1495.FLD398)) {
            arrayList0.add(ﾞˏ0.FLD1495.FLD398);
        }
        CLS1620 ˊˏ0 = this.FLD1452;
        ˊˏ0.MTH7247(arrayList0);
        ˊˏ0.MTH7246(ﾞˏ0.FLD1495.FLD398);
        CLS94 ⁱˉ0 = ﾞˏ0.FLD1495;
        ﾞˏ0.FLD1500.getClass();
        Bitmap bitmap0 = CLS59.MTH1284(ⁱˉ0);
        if(bitmap0 != null) {
            ﾞˏ0.FLD1497.setImageBitmap(bitmap0);
        }
        יᐧ0.MTH7289(new Object[]{ˊˏ0, ﾞˏ0.FLD1497});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH800(CLS27.MTH889("img_transparency"));
        CLS1628 ᐧי0 = new CLS1628(activity0);
        ﾞˏ0.FLD1489 = ᐧי0.FLD5315;
        ᐧי0.FLD5315.setMax(100);
        ﾞˏ0.FLD1489.setProgress(((int)(((double)ﾞˏ0.FLD1495.FLD402) / 254.0 * 100.0)));
        ﾞˏ0.FLD1489.setOnSeekBarChangeListener(new CLS106(ﾞˏ0));
        יᐧ1.MTH7296(ᐧי0);
        CLS1623 יᐧ2 = CLS34.MTH1087(linearLayout0, יᐧ1, CLS523.MTH7137(10), activity0);
        יᐧ2.MTH800(CLS27.MTH889("watermark_img_place"));
        ﾞˏ0.FLD1507 = new CLS545();
        LinearLayout linearLayout1 = new LinearLayout(activity0);
        linearLayout1.setOrientation(0);
        linearLayout1.setGravity(1);
        LinearLayout linearLayout2 = new LinearLayout(activity0);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(1);
        RadioButton radioButton0 = new RadioButton(activity0);
        ﾞˏ0.FLD1514 = radioButton0;
        radioButton0.setText(CLS27.MTH889("top_left"));
        linearLayout1.addView(ﾞˏ0.FLD1514);
        ﾞˏ0.FLD1507.MTH7361(ﾞˏ0.FLD1514);
        RadioButton radioButton1 = new RadioButton(activity0);
        ﾞˏ0.FLD1503 = radioButton1;
        radioButton1.setText(CLS27.MTH889("top_right"));
        linearLayout1.addView(ﾞˏ0.FLD1503);
        ﾞˏ0.FLD1507.MTH7361(ﾞˏ0.FLD1503);
        RadioButton radioButton2 = new RadioButton(activity0);
        ﾞˏ0.FLD1511 = radioButton2;
        radioButton2.setText(CLS27.MTH889("center"));
        linearLayout1.addView(ﾞˏ0.FLD1511);
        ﾞˏ0.FLD1507.MTH7361(ﾞˏ0.FLD1511);
        RadioButton radioButton3 = new RadioButton(activity0);
        ﾞˏ0.FLD1504 = radioButton3;
        radioButton3.setText(CLS27.MTH889("bottom_left"));
        linearLayout2.addView(ﾞˏ0.FLD1504);
        ﾞˏ0.FLD1507.MTH7361(ﾞˏ0.FLD1504);
        RadioButton radioButton4 = new RadioButton(activity0);
        ﾞˏ0.FLD1512 = radioButton4;
        radioButton4.setText(CLS27.MTH889("bottom_right"));
        linearLayout2.addView(ﾞˏ0.FLD1512);
        ﾞˏ0.FLD1507.MTH7361(ﾞˏ0.FLD1512);
        ﾞˏ0.MTH3109();
        CLS545 ᵔˉ0 = ﾞˏ0.FLD1507;
        ᵔˉ0.FLD5348 = new CLS129(0, ﾞˏ0);
        CLS1618 ʽﹶ0 = new CLS1618(activity0);
        List list0 = Arrays.asList(new View[]{linearLayout1, linearLayout2});
        ʽﹶ0.FLD5172.addAll(list0);
        יᐧ2.MTH7296(ʽﹶ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), CLS523.MTH7137(10));
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ﾞˏ0.FLD1505 = ˑٴ0;
        ˑٴ0.MTH800(CLS27.MTH889("watermark_text"));
        ﾞˏ0.FLD1505.MTH7277(ﾞˏ0.FLD1495.FLD401);
        CLS1622 ˑٴ1 = ﾞˏ0.FLD1505;
        ˑٴ1.FLD5252 = new CLS799(ﾞˏ0, 2);
        CLS1622 ˑٴ2 = new CLS1622(activity0);
        ﾞˏ0.FLD1516 = ˑٴ2;
        ˑٴ2.MTH800(CLS27.MTH889("text_size"));
        ﾞˏ0.FLD1516.MTH7277(String.valueOf(ﾞˏ0.FLD1495.FLD403));
        CLS1622 ˑٴ3 = ﾞˏ0.FLD1516;
        ˑٴ3.FLD5252 = new CLS799(ﾞˏ0, 3);
        CLS1623 יᐧ3 = new CLS1623(activity0);
        יᐧ3.MTH800(CLS27.MTH889("watermark_text"));
        יᐧ3.MTH7289(new Object[]{ﾞˏ0.FLD1505, ﾞˏ0.FLD1516});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), CLS523.MTH7137(10));
        CLS1623 יᐧ4 = new CLS1623(activity0);
        יᐧ4.MTH800(CLS27.MTH889("watermark_text_place"));
        ﾞˏ0.FLD1502 = new CLS545();
        LinearLayout linearLayout3 = new LinearLayout(activity0);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        LinearLayout linearLayout4 = new LinearLayout(activity0);
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(1);
        RadioButton radioButton5 = new RadioButton(activity0);
        ﾞˏ0.FLD1508 = radioButton5;
        radioButton5.setText(CLS27.MTH889("top_left"));
        linearLayout3.addView(ﾞˏ0.FLD1508);
        ﾞˏ0.FLD1502.MTH7361(ﾞˏ0.FLD1508);
        RadioButton radioButton6 = new RadioButton(activity0);
        ﾞˏ0.FLD1499 = radioButton6;
        radioButton6.setText(CLS27.MTH889("top_right"));
        linearLayout3.addView(ﾞˏ0.FLD1499);
        ﾞˏ0.FLD1502.MTH7361(ﾞˏ0.FLD1499);
        RadioButton radioButton7 = new RadioButton(activity0);
        ﾞˏ0.FLD1492 = radioButton7;
        radioButton7.setText(CLS27.MTH889("center"));
        linearLayout3.addView(ﾞˏ0.FLD1492);
        ﾞˏ0.FLD1502.MTH7361(ﾞˏ0.FLD1492);
        RadioButton radioButton8 = new RadioButton(activity0);
        ﾞˏ0.FLD1519 = radioButton8;
        radioButton8.setText(CLS27.MTH889("bottom_left"));
        linearLayout4.addView(ﾞˏ0.FLD1519);
        ﾞˏ0.FLD1502.MTH7361(ﾞˏ0.FLD1519);
        RadioButton radioButton9 = new RadioButton(activity0);
        ﾞˏ0.FLD1506 = radioButton9;
        radioButton9.setText(CLS27.MTH889("bottom_right"));
        linearLayout4.addView(ﾞˏ0.FLD1506);
        ﾞˏ0.FLD1502.MTH7361(ﾞˏ0.FLD1506);
        ﾞˏ0.MTH3112();
        CLS545 ᵔˉ1 = ﾞˏ0.FLD1502;
        ᵔˉ1.FLD5348 = new CLS129(1, ﾞˏ0);
        CLS1618 ʽﹶ1 = new CLS1618(activity0);
        List list1 = Arrays.asList(new View[]{linearLayout3, linearLayout4});
        ʽﹶ1.FLD5172.addAll(list1);
        יᐧ4.MTH7296(ʽﹶ1);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), CLS523.MTH7137(10));
        CLS523.MTH7158(linearLayout0, ﾞˏ0.FLD1496, true);
    }
}

