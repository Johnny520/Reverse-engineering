// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS107 implements CompoundButton.OnCheckedChangeListener {
    public final CLS204 FLD615;
    public final int FLD616;

    public CLS107(CLS204 ᵎᐧ0, int v) {
        this.FLD616 = v;
        this.FLD615 = ᵎᐧ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS204 ᵎᐧ0 = this.FLD615;
        switch(this.FLD616) {
            case 0: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "hideTimeLineUIOptions");
                return;
            }
            case 1: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "timeLineUITitleShowMenu");
                return;
            }
            case 2: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "placeSettingsToBottom");
                return;
            }
            case 3: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "hideSettings");
                return;
            }
            case 4: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "temp_disable_menu");
                ᵎᐧ0.FLD585.MTH741(Long.toHexString(System.currentTimeMillis()), "temp_disable_menu_start_time");
                return;
            }
            case 5: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "disable_settings_search");
                return;
            }
            case 6: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "preftext_disable_arrow");
                return;
            }
            case 7: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "hideChatOptions");
                return;
            }
            case 8: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "settings_next_always_expand");
                return;
            }
            case 9: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "disable_darkmode_check");
                return;
            }
            case 10: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "force_dark_alertdialog");
                return;
            }
            case 11: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "force_light_alertdialog");
                return;
            }
            case 12: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "manual_language_selection");
                return;
            }
            case 13: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "use_internal_file_browser");
                return;
            }
            case 14: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "plusShowChatOptions");
                return;
            }
            case 15: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "tip_always_use_toast");
                return;
            }
            case 16: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "disable_safemode");
                return;
            }
            case 17: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "hideMainOptions");
                return;
            }
            case 18: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "usePlusMenu");
                return;
            }
            case 19: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "titleShowWxMenu");
                return;
            }
            case 20: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "settingsui_title_show_wxmenu");
                return;
            }
            case 21: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "welab_show_wxmenu");
                return;
            }
            case 22: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "infoui_show_optionsmenu");
                return;
            }
            default: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(Boolean.valueOf(z), "hideInfoOptions");
            }
        }
    }
}

