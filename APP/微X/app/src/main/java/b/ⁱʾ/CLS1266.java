// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS92;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;

public final class CLS1266 extends CLS363 {
    public static final class CLS317 {
        public ImageView FLD3261;
        public TextView FLD3262;

    }

    public CLS1266(Activity activity0) {
        super(activity0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱʾ.CLS363
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        Drawable drawable0;
        CLS317 ʾᵢ$ˆٴ0;
        View view1;
        try {
            CLS92 ⁱʽ0 = this.FLD3443;
            int v1 = CLS523.MTH7137(5);
            if(view0 == null) {
                view1 = this.FLD3441.inflate(0x1090003, viewGroup0, false);
                view1.setPadding(v1, v1, v1, v1);
                ImageView imageView0 = new ImageView(((Context)this.FLD3444.get()));
                imageView0.setMinimumHeight(90);
                imageView0.setMinimumWidth(90);
                TextView textView0 = (TextView)view1.findViewById(0x1020014);
                textView0.setTextColor(CLS522.MTH7109());
                textView0.setBackgroundColor(CLS522.MTH7118());
                textView0.setPadding(v1, v1, v1, v1);
                ʾᵢ$ˆٴ0 = new CLS317();
                ʾᵢ$ˆٴ0.FLD3261 = imageView0;
                ʾᵢ$ˆٴ0.FLD3262 = textView0;
                try {
                    view1.setTag(ʾᵢ$ˆٴ0);
                    view0 = view1;
                }
                catch(Throwable throwable0) {
                    goto label_54;
                }
            }
            else {
                ʾᵢ$ˆٴ0 = (CLS317)view0.getTag();
            }
            CLS78 ˊﾞ0 = (CLS78)this.FLD3447.get(v);
            if(ˊﾞ0.MTH1612()) {
                drawable0 = new BitmapDrawable(CLS27.MTH900().getResources(), ˊﾞ0.FLD270);
            }
            else {
                drawable0 = CLS372.MTH5403(ʾᵢ$ˆٴ0.FLD3261, "") ? ʾᵢ$ˆٴ0.FLD3261.getDrawable() : null;
            }
            String s = (String)ⁱʽ0.MTH1744(ˊﾞ0);
            if(TextUtils.isEmpty(s)) {
                TextView textView1 = ʾᵢ$ˆٴ0.FLD3262;
                CLS362 ﾞٴ$ᵔʾ0 = this.FLD3438;
                if(ﾞٴ$ᵔʾ0 == null) {
                    CLS523.MTH7155(textView1, "");
                }
                else {
                    ﾞٴ$ᵔʾ0.MTH5249(textView1, ˊﾞ0);
                }
                ⁱʽ0.MTH1746(ˊﾞ0, CLS502.MTH6936(ʾᵢ$ˆٴ0.FLD3262.getText()));
            }
            else {
                CLS523.MTH7155(ʾᵢ$ˆٴ0.FLD3262, s);
            }
            if(this.FLD3446[v]) {
                view0.setBackgroundColor(CLS522.MTH7110("#2196F3"));
                ʾᵢ$ˆٴ0.FLD3262.setTextColor(-1);
            }
            else {
                view0.setBackgroundColor(CLS522.MTH7118());
                ʾᵢ$ˆٴ0.FLD3262.setTextColor(CLS522.MTH7109());
            }
            if(drawable0 == null) {
                ʾᵢ$ˆٴ0.FLD3262.setCompoundDrawables(null, null, null, null);
            }
            else {
                drawable0.setBounds(0, 0, 0x60, 0x60);
                ʾᵢ$ˆٴ0.FLD3262.setCompoundDrawablePadding(CLS523.MTH7137(10));
                ʾᵢ$ˆٴ0.FLD3262.setCompoundDrawables(drawable0, null, null, null);
            }
            CLS523.MTH7166(ʾᵢ$ˆٴ0.FLD3262, this.FLD3446[v]);
            return view0;
        }
        catch(Throwable throwable0) {
            view1 = view0;
        }
    label_54:
        CLS27.MTH893(throwable0);
        return view1;
    }
}

