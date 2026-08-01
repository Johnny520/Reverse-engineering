// Decompiled by JEB v5.42.0.202606242140

package t.ˆٴ;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS290;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS147;

public final class CLS67 extends BaseAdapter {
    public static final class CLS65 {
        public TextView FLD542;

    }

    public static final class CLS66 {
        public ImageView FLD543;
        public TextView FLD544;
        public TextView FLD545;

    }

    public final WeakReference FLD546;
    public String FLD547;
    public final HashMap FLD548;
    public final CLS102 FLD549;
    public ArrayList FLD550;

    // 此方法包含解密的字符串
    public CLS67(Activity activity0, CLS102 יﹳ0) {
        this.FLD547 = "";
        this.FLD546 = new WeakReference(activity0);
        this.FLD549 = יﹳ0;
        this.FLD550 = new ArrayList();
        this.FLD548 = new HashMap();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD550.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return (CLS290)this.FLD550.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // android.widget.BaseAdapter
    public final int getItemViewType(int v) {
        return !((CLS290)this.FLD550.get(v)).FLD754.equals("menu_header");
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        TextView textView0;
        String s1;
        CLS66 ᵔʾ$ᵔʾ0;
        CLS65 ᵔʾ$ˆٴ0;
        try {
            CLS290 ˊﾞ0 = (CLS290)this.FLD550.get(v);
            if(this.getItemViewType(v) == 0) {
                if(view0 == null) {
                    ᵔʾ$ˆٴ0 = new CLS65();
                    view0 = this.MTH1537(ᵔʾ$ˆٴ0);
                    view0.setTag(ᵔʾ$ˆٴ0);
                }
                else {
                    ᵔʾ$ˆٴ0 = (CLS65)view0.getTag();
                }
                ᵔʾ$ˆٴ0.FLD542.setText(ˊﾞ0.FLD756);
                return view0;
            }
            if(view0 == null) {
                ᵔʾ$ᵔʾ0 = new CLS66();
                view0 = this.MTH1535(ᵔʾ$ᵔʾ0);
                view0.setTag(ᵔʾ$ᵔʾ0);
            }
            else {
                ᵔʾ$ᵔʾ0 = (CLS66)view0.getTag();
            }
            String s = !TextUtils.isEmpty(ˊﾞ0.FLD756) || ˊﾞ0.FLD754.equals("custom") ? ˊﾞ0.FLD756 : CLS133.MTH2099(ˊﾞ0.FLD754);
            ᵔʾ$ᵔʾ0.FLD545.setText(s);
            boolean z = TextUtils.isEmpty(ˊﾞ0.FLD757);
            CLS102 יﹳ0 = this.FLD549;
            if(!z) {
                ᵔʾ$ᵔʾ0.FLD543.setImageDrawable(יﹳ0.MTH1807(((Context)this.FLD546.get()), ((CLS147)ˊﾞ0)));
            }
            ᵔʾ$ᵔʾ0.FLD544.setText(ˊﾞ0.FLD753);
            if(יﹳ0.MTH1819()) {
                if(!TextUtils.isEmpty(this.FLD547) && ˊﾞ0.FLD754.equals(this.FLD547)) {
                    CLS43.MTH1437(view0, CLS41.MTH1400(CLS46.MTH1447("#E0E0E0")));
                    s1 = "#009688";
                    ᵔʾ$ᵔʾ0.FLD545.setTextColor(CLS46.MTH1447("#009688"));
                    ᵔʾ$ᵔʾ0.FLD543.setColorFilter(CLS46.MTH1447("#009688"));
                    textView0 = ᵔʾ$ᵔʾ0.FLD544;
                    textView0.setTextColor(CLS46.MTH1447(s1));
                    return view0;
                }
                CLS43.MTH1437(view0, CLS41.MTH1400(CLS46.MTH1446()));
                ᵔʾ$ᵔʾ0.FLD545.setTextColor(CLS46.MTH1452());
                ᵔʾ$ᵔʾ0.FLD543.clearColorFilter();
                ᵔʾ$ᵔʾ0.FLD544.setTextColor(0xFFFF0000);
                return view0;
            }
            else if(!TextUtils.isEmpty(this.FLD547) && ˊﾞ0.FLD754.equals(this.FLD547)) {
                CLS43.MTH1437(view0, CLS41.MTH1400(CLS46.MTH1447(יﹳ0.MTH1804("DrawerItemViewHighlightColor", "#E0E0E0"))));
                s1 = יﹳ0.MTH1804("DrawerItemViewHighlightTextColor", "#009688");
                ᵔʾ$ᵔʾ0.FLD545.setTextColor(CLS46.MTH1447(s1));
                ᵔʾ$ᵔʾ0.FLD543.setColorFilter(CLS46.MTH1447(s1));
                textView0 = ᵔʾ$ᵔʾ0.FLD544;
            }
            else {
                String s2 = יﹳ0.MTH1804("DrawerItemViewBackgroundColor", "");
                Drawable drawable0 = TextUtils.isEmpty(s2) ? new ColorDrawable(0) : CLS41.MTH1400(CLS46.MTH1447(s2));
                CLS43.MTH1437(view0, drawable0);
                ᵔʾ$ᵔʾ0.FLD545.setTextColor(CLS46.MTH1447(יﹳ0.MTH1804("DrawerItemViewTitleColor", "#000000")));
                ᵔʾ$ᵔʾ0.FLD543.clearColorFilter();
                textView0 = ᵔʾ$ᵔʾ0.FLD544;
                s1 = יﹳ0.MTH1804("DrawerNewMessageColor", "#212121");
            }
            textView0.setTextColor(CLS46.MTH1447(s1));
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final int getViewTypeCount() {
        return 2;
    }

    // 此方法包含解密的字符串
    public final LinearLayout MTH1535(CLS66 ᵔʾ$ᵔʾ0) {
        boolean z = this.FLD549.MTH1819();
        Context context0 = (Context)this.FLD546.get();
        LinearLayout linearLayout0 = new LinearLayout(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.height = CLS43.MTH1439(0x30);
        LinearLayout linearLayout1 = new LinearLayout(context0);
        linearLayout1.setOrientation(0);
        linearLayout1.setPadding(CLS43.MTH1439(16), 0, CLS43.MTH1439(16), 0);
        ImageView imageView0 = new ImageView(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(CLS43.MTH1439(24), CLS43.MTH1439(24));
        linearLayout$LayoutParams1.gravity = 16;
        linearLayout1.addView(imageView0, linearLayout$LayoutParams1);
        TextView textView0 = new TextView(context0);
        textView0.setTextColor((z ? CLS46.MTH1452() : CLS46.MTH1447(this.FLD549.MTH1804("DrawerItemViewTitleColor", "#212121"))));
        textView0.setGravity(16);
        textView0.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, CLS43.MTH1439(36));
        linearLayout$LayoutParams2.gravity = 16;
        linearLayout$LayoutParams2.weight = 2.0f;
        linearLayout$LayoutParams2.leftMargin = CLS43.MTH1439(16);
        linearLayout1.addView(textView0, linearLayout$LayoutParams2);
        TextView textView1 = new TextView(context0);
        textView1.setTextColor((z ? 0xFFFF0000 : CLS46.MTH1447(this.FLD549.MTH1804("DrawerNewMessageColor", "#212121"))));
        textView1.setGravity(16);
        textView1.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-2, CLS43.MTH1439(36));
        linearLayout$LayoutParams3.gravity = 16;
        linearLayout$LayoutParams3.rightMargin = 0;
        linearLayout1.addView(textView1, linearLayout$LayoutParams3);
        ᵔʾ$ᵔʾ0.FLD545 = textView0;
        ᵔʾ$ᵔʾ0.FLD544 = textView1;
        ᵔʾ$ᵔʾ0.FLD543 = imageView0;
        linearLayout0.addView(linearLayout1, linearLayout$LayoutParams0);
        return linearLayout0;
    }

    // 此方法包含解密的字符串
    public final void MTH1536(ArrayList arrayList0) {
        String s2;
        String s1;
        this.FLD550 = arrayList0;
        HashMap hashMap0 = this.FLD548;
        hashMap0.clear();
        for(Object object0: arrayList0) {
            CLS290 ˊﾞ0 = (CLS290)object0;
            if(ˊﾞ0.FLD754.equals("custom")) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(ˊﾞ0.FLD754);
                String s = ˊﾞ0.FLD759;
                try {
                    MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                    messageDigest0.update(s.getBytes());
                    byte[] arr_b = messageDigest0.digest();
                    StringBuilder stringBuilder1 = new StringBuilder();
                    int v = arr_b.length;
                    for(int v1 = 0; v1 < v; ++v1) {
                        stringBuilder1.append(Integer.toHexString(arr_b[v1] & 0xFF | 0x100).substring(1, 3));
                    }
                    s1 = stringBuilder1.toString();
                }
                catch(Throwable throwable0) {
                    throwable0.printStackTrace();
                    s1 = "";
                }
                stringBuilder0.append(s1);
                s2 = stringBuilder0.toString();
            }
            else {
                s2 = ˊﾞ0.FLD754;
            }
            if(!hashMap0.containsKey(s2)) {
                hashMap0.put(s2, ˊﾞ0);
            }
        }
        this.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public final LinearLayout MTH1537(CLS65 ᵔʾ$ˆٴ0) {
        Context context0 = (Context)this.FLD546.get();
        LinearLayout linearLayout0 = new LinearLayout(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout1 = new LinearLayout(context0);
        linearLayout1.setOrientation(0);
        linearLayout1.setPadding(CLS43.MTH1439(16), 0, 0, 0);
        linearLayout1.setEnabled(false);
        linearLayout1.setBackgroundColor(0);
        TextView textView0 = new TextView(context0);
        textView0.setAlpha(0.54f);
        textView0.setTextColor((this.FLD549.MTH1819() ? CLS46.MTH1456() : CLS46.MTH1447(this.FLD549.MTH1804("DrawerItemViewSubTitleColor", "#212121"))));
        linearLayout1.addView(textView0, linearLayout$LayoutParams0);
        ᵔʾ$ˆٴ0.FLD542 = textView0;
        linearLayout0.addView(linearLayout1, linearLayout$LayoutParams0);
        return linearLayout0;
    }
}

