// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.View.OnClickListener;
import android.view.View;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS56;
import t.ˈˊ.CLS86;
import t.ˈˊ.CLS88;
import t.ˈˊ.CLS89;
import t.ˈˊ.CLS91;
import t.ـˏ.CLS116;
import t.ᐧⁱ.CLS121.CLS119;
import t.ᐧⁱ.CLS121;
import t.ᵔʾ.CLS133;

public final class CLS153 implements View.OnClickListener {
    public final int FLD1076;
    public final Object FLD1077;

    public CLS153(Object object0, int v) {
        this.FLD1076 = v;
        this.FLD1077 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Handler handler0;
        int v = 0;
        Object object0 = this.FLD1077;
        switch(this.FLD1076) {
            case 0: {
                ((CLS309)object0).FLD1004.MTH1719(true);
                view0.setVisibility(8);
                return;
            }
            case 1: {
                Activity activity0 = (Activity)object0;
                String s = CLS133.MTH2116("theme_discussion_url");
                if(activity0 == null) {
                    return;
                }
                else {
                    try {
                        Intent intent0 = new Intent();
                        intent0.putExtra("rawUrl", s);
                        intent0.putExtra("useJs", true);
                        intent0.putExtra("vertical_scroll", true);
                        intent0.putExtra("fromWxp", true);
                        if(!CLS33.MTH1349("webview", ".ui.tools.WebViewUI", intent0)) {
                            intent0.setClassName(activity0, CLS56.MTH1484(activity0) + ".plugin.webview.ui.tools.WebViewUI");
                            activity0.startActivity(intent0);
                            return;
                        }
                        return;
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                Uri uri0 = Uri.parse(s);
                Intent intent1 = new Intent("android.intent.action.VIEW", uri0);
                try {
                    activity0.startActivity(intent1);
                }
                catch(Throwable throwable0) {
                    CLS28.MTH1314(activity0, uri0.toString());
                    CLS28.MTH1315(activity0, CLS133.MTH2099("copy_url"));
                    CLS133.MTH2113(throwable0);
                }
                return;
            }
            case 2: {
                ((CLS121)object0).getClass();
                int v3 = ((CLS119)view0.getTag()).FLD848;
                if(((CLS121)object0).FLD895 == v3) {
                    CLS116 ᵔʾ1 = ((CLS121)object0).FLD857;
                    if(ᵔʾ1 != null) {
                        ((CLS306)ᵔʾ1).FLD990.MTH2244(v3);
                    }
                }
                else {
                    ((CLS121)object0).setCurrentTab(v3);
                    CLS116 ᵔʾ0 = ((CLS121)object0).FLD857;
                    if(ᵔʾ0 != null) {
                        ((CLS306)ᵔʾ0).FLD990.MTH2244(v3);
                        return;
                    }
                }
                return;
            }
            case 3: {
                View.OnClickListener view$OnClickListener0 = ((CLS86)object0).FLD622;
                if(view$OnClickListener0 != null) {
                    view$OnClickListener0.onClick(((CLS86)object0));
                }
                return;
            }
            default: {
                if(((CLS88)object0).FLD658) {
                    ((CLS88)object0).MTH1719(true);
                    return;
                }
                if(((CLS88)object0).FLD673 != 0) {
                    ValueAnimator valueAnimator0 = ((CLS88)object0).FLD684;
                    if(valueAnimator0 != null) {
                        valueAnimator0.start();
                    }
                }
                AnimatorSet animatorSet0 = ((CLS88)object0).FLD685;
                if(animatorSet0 != null) {
                    animatorSet0.cancel();
                }
                AnimatorSet animatorSet1 = ((CLS88)object0).FLD659;
                if(animatorSet1 != null) {
                    animatorSet1.start();
                }
                ((CLS88)object0).FLD650 = true;
                int v1 = ((CLS88)object0).getChildCount() - 1;
                int v2 = 0;
                while(true) {
                    handler0 = ((CLS88)object0).FLD660;
                    if(v1 < 0) {
                        break;
                    }
                    View view1 = ((CLS88)object0).getChildAt(v1);
                    if(view1 instanceof CLS86 && view1.getVisibility() != 8) {
                        ++v;
                        handler0.postDelayed(new CLS89(((CLS88)object0), ((CLS86)view1), true, 1), ((long)v2));
                        v2 += ((CLS88)object0).FLD694;
                    }
                    --v1;
                }
                handler0.postDelayed(new CLS91(((CLS88)object0), 1), ((long)((v + 1) * ((CLS88)object0).FLD694)));
            }
        }
    }
}

