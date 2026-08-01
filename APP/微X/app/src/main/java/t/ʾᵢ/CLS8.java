// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import t.ˊﾞ.CLS102;

public final class CLS8 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD102;
    public final CLS216 FLD103;

    public CLS8(CLS216 ˎﾞ0, int v) {
        this.FLD102 = v;
        this.FLD103 = ˎﾞ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS216 ˎﾞ0 = this.FLD103;
        switch(this.FLD102) {
            case 0: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1805("UseRoundAvatar", z);
                }
                return;
            }
            case 1: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1805("HidePullDownAppBrand", z);
                }
                return;
            }
            case 2: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1805("HideActionBar", z);
                }
                return;
            }
            case 3: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1805("HideActionBarSearchMenu", z);
                }
                return;
            }
            case 4: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1805("HideActionBarPlusMenu", z);
                }
                return;
            }
            case 5: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1805("ChangeActionBarColor", z);
                }
                return;
            }
            case 6: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1805("FragmentItemViewTitleColorEnable", z);
                }
                return;
            }
            case 7: {
                if(!ˎﾞ0.MTH1137()) {
                    ˎﾞ0.FLD236.MTH1805("DisableOnDarkMode", z);
                }
                return;
            }
            case 8: {
                CLS102 יﹳ0 = ˎﾞ0.FLD236;
                if(יﹳ0 != null) {
                    יﹳ0.MTH1805("FloatingActionButtonEnable", z);
                }
                return;
            }
            case 9: {
                CLS102 יﹳ1 = ˎﾞ0.FLD236;
                if(יﹳ1 != null) {
                    יﹳ1.MTH1805("FloatingActionButtonStartLeft", z);
                }
                return;
            }
            case 10: {
                CLS102 יﹳ2 = ˎﾞ0.FLD236;
                if(יﹳ2 != null) {
                    יﹳ2.MTH1805("FloatingActionMenuShowLabelOnRight", z);
                }
                return;
            }
            case 11: {
                CLS102 יﹳ3 = ˎﾞ0.FLD236;
                if(יﹳ3 != null) {
                    יﹳ3.MTH1805("FloatingActionMenuMoveEnable", z);
                }
                return;
            }
            case 12: {
                ˎﾞ0.FLD236.MTH1805("DrawerEnable", z);
                return;
            }
            case 13: {
                ˎﾞ0.FLD236.MTH1805("DrawerCustomTopMarginEnable", z);
                return;
            }
            case 14: {
                ˎﾞ0.FLD236.MTH1805("DrawerArrowDisable", z);
                return;
            }
            case 15: {
                ˎﾞ0.FLD236.MTH1805("DrawerOpenRight", z);
                return;
            }
            case 16: {
                ˎﾞ0.FLD236.MTH1805("DrawerMoveMainOnSlide", z);
                return;
            }
            case 17: {
                ˎﾞ0.FLD236.MTH1805("DrawerAutoClose", z);
                return;
            }
            case 18: {
                ˎﾞ0.FLD236.MTH1805("DrawerDisableSlide", z);
                return;
            }
            case 19: {
                ˎﾞ0.FLD236.MTH1805("DrawerShowAvatar", z);
                return;
            }
            case 20: {
                ˎﾞ0.FLD236.MTH1805("DrawerShowAccountInfo", z);
                return;
            }
            case 21: {
                ˎﾞ0.FLD236.MTH1805("DrawerWidthCustom", z);
                return;
            }
            case 22: {
                ˎﾞ0.FLD236.MTH1805("BottomTabLabelTextColorEnable", z);
                return;
            }
            case 23: {
                ˎﾞ0.FLD236.MTH1805("BottomTabIconReplaceTextEnable", z);
                return;
            }
            case 24: {
                ˎﾞ0.FLD236.MTH1805("BottomTabReplaceIconEnable", z);
                return;
            }
            case 25: {
                ˎﾞ0.FLD236.MTH1805("HideBottomTab", z);
                return;
            }
            case 26: {
                ˎﾞ0.FLD236.MTH1805("ChangeBottomTabColor", z);
                return;
            }
            case 27: {
                ˎﾞ0.FLD236.MTH1805("MoveUpBottomTab", z);
                return;
            }
            case 28: {
                ˎﾞ0.FLD236.MTH1805("HideBottomTabLabel", z);
                return;
            }
            default: {
                ˎﾞ0.FLD236.MTH1805("BottomTabIconColorEnable", z);
            }
        }
    }
}

