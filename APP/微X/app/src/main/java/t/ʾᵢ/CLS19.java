// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import t.ˊﾞ.CLS102;
import t.ⁱʾ.CLS143;

public final class CLS19 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD280;
    public final Object FLD281;

    public CLS19(Object object0, int v) {
        this.FLD280 = v;
        this.FLD281 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        Object object0 = this.FLD281;
        switch(this.FLD280) {
            case 0: {
                ((CLS216)object0).FLD236.MTH1805("ChatFragmentBackgroundColorEnable", z);
                return;
            }
            case 1: {
                ((CLS216)object0).FLD236.MTH1805("MainFragmentBackgroundColorEnable", z);
                return;
            }
            case 2: {
                ((CLS216)object0).FLD236.MTH1805("ContactFragmentBackgroundColorEnable", z);
                return;
            }
            case 3: {
                ((CLS216)object0).FLD236.MTH1805("DiscoverFragmentBackgroundColorEnable", z);
                return;
            }
            case 4: {
                ((CLS216)object0).FLD236.MTH1805("MeFragmentBackgroundColorEnable", z);
                return;
            }
            case 5: {
                CLS102 יﹳ0 = ((CLS216)object0).FLD236;
                if(יﹳ0 != null) {
                    יﹳ0.MTH1805("RecentChatFloatingActionButtonEnable", z);
                }
                return;
            }
            case 6: {
                CLS102 יﹳ1 = ((CLS216)object0).FLD236;
                if(יﹳ1 != null) {
                    יﹳ1.MTH1805("RecentChatFloatingActionButtonStartLeft", z);
                }
                return;
            }
            case 7: {
                CLS102 יﹳ2 = ((CLS216)object0).FLD236;
                if(יﹳ2 != null) {
                    יﹳ2.MTH1805("RecentChatFloatingActionMenuShowLabelOnRight", z);
                }
                return;
            }
            case 8: {
                CLS102 יﹳ3 = ((CLS216)object0).FLD236;
                if(יﹳ3 != null) {
                    יﹳ3.MTH1805("RecentChatFloatingActionMenuMoveEnable", z);
                }
                return;
            }
            case 9: {
                ((CLS216)object0).FLD236.MTH1805("RecentChatFloatingActionMenuExcludeChatrooms", z);
                return;
            }
            case 10: {
                ((CLS216)object0).FLD236.MTH1805("setChatTimeTVCentered", z);
                return;
            }
            case 11: {
                ((CLS216)object0).FLD236.MTH1805("showChatTimeTVDetailed", z);
                return;
            }
            case 12: {
                ((CLS216)object0).FLD236.MTH1805("LeftChatTimeTVTextColorEnable", z);
                return;
            }
            case 13: {
                ((CLS216)object0).FLD236.MTH1805("LeftChatTimeTVBackgroundColorEnable", z);
                return;
            }
            case 14: {
                ((CLS216)object0).FLD236.MTH1805("RightChatTimeTVTextColorEnable", z);
                return;
            }
            case 15: {
                ((CLS216)object0).FLD236.MTH1805("ChangeChatTextColor", z);
                return;
            }
            case 16: {
                ((CLS216)object0).FLD236.MTH1805("RightChatTimeTVBackgroundColorEnable", z);
                return;
            }
            case 17: {
                ((CLS216)object0).FLD236.MTH1805("LeftChatUserTVTextColorEnable", z);
                return;
            }
            case 18: {
                ((CLS216)object0).FLD236.MTH1805("LeftChatUserTVBackgroundColorEnable", z);
                return;
            }
            case 19: {
                ((CLS216)object0).FLD236.MTH1805("ChangeChatBubble", z);
                return;
            }
            case 20: {
                ((CLS216)object0).FLD236.MTH1805("LeftChatBubbleColorEnable", z);
                return;
            }
            case 21: {
                ((CLS216)object0).FLD236.MTH1805("RightChatBubbleColorEnable", z);
                return;
            }
            case 22: {
                ((CLS216)object0).FLD236.MTH1805("TabLayoutEnable", z);
                return;
            }
            case 23: {
                ((CLS216)object0).FLD236.MTH1805("TabLayoutCustomTopMarginEnable", z);
                return;
            }
            case 24: {
                ((CLS216)object0).FLD236.MTH1805("TabLayoutTextEnable", z);
                return;
            }
            case 25: {
                ((CLS216)object0).FLD236.MTH1805("TabLayoutIconEnable", z);
                return;
            }
            case 26: {
                ((CLS216)object0).FLD236.MTH1805("ChatFooterEditBackgroundEnable", z);
                return;
            }
            case 27: {
                ((CLS216)object0).FLD236.MTH1805("ChatFooterHintEnable", z);
                return;
            }
            default: {
                ((CLS143)object0).MTH2169();
            }
        }
    }
}

