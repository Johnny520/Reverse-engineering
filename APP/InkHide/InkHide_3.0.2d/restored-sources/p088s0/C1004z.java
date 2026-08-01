package p088s0;

import android.app.Activity;
import com.p055lu.wxmask.bean.OptionData;
import p004C.C0060d;
import p009E0.C0109i;
import p011F0.C0131s;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p102z0.AbstractC1126i;
import p102z0.C1119b;
import p102z0.C1124g;

/* JADX INFO: renamed from: s0.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1004z implements InterfaceC0193a, InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0976J f3599b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1004z(C0976J c0976j, int i2) {
        this.f3598a = i2;
        this.f3599b = c0976j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        Activity activity;
        switch (this.f3598a) {
            case 0:
                return Boolean.valueOf(this.f3599b.f3494l.getShakeHideTemporary());
            case 1:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 15:
            case 17:
            default:
                return Boolean.valueOf(this.f3599b.f3494l.getHideSingleSearch());
            case 2:
                return Boolean.valueOf(this.f3599b.f3494l.getEnableSearchCommand());
            case 3:
                this.f3599b.m2178Q();
                return C0109i.f404a;
            case 5:
                return Boolean.valueOf(this.f3599b.f3494l.getQuickAddMaskList());
            case 7:
                return Boolean.valueOf(this.f3599b.f3494l.getEnableChattingKey());
            case 9:
                return Boolean.valueOf(this.f3599b.f3494l.getAntiRevokeMessage());
            case 11:
                return Boolean.valueOf(this.f3599b.f3494l.getCustomLocalFriendAvatar());
            case 13:
                C0976J c0976j = this.f3599b;
                if (c0976j.f3494l.getCustomLocalFriendAvatar() && (activity = c0976j.getActivity()) != null) {
                    C0990l c0990l = new C0990l(activity, C0131s.f426a, "选择好友头像", "选择");
                    c0990l.f3561n = new C0060d(11, activity);
                    c0990l.m2198h();
                }
                return C0109i.f404a;
            case 14:
                return Boolean.valueOf(this.f3599b.f3494l.getDisableWechatHotUpdate());
            case 16:
                return Boolean.valueOf(this.f3599b.f3494l.getUseFullscreenConfigUi());
            case 18:
                return Boolean.valueOf(this.f3599b.f3494l.getHideMainSearch());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) {
        Activity activity;
        C0109i c0109i = C0109i.f404a;
        C0976J c0976j = this.f3599b;
        switch (this.f3598a) {
            case 1:
                c0976j.f3494l.setShakeHideTemporary(((Boolean) obj).booleanValue());
                break;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                c0976j.f3494l.setEnableSearchCommand(zBooleanValue);
                if (zBooleanValue) {
                    c0976j.m2178Q();
                }
                break;
            case 6:
                c0976j.f3494l.setQuickAddMaskList(((Boolean) obj).booleanValue());
                break;
            case 8:
                c0976j.f3494l.setEnableChattingKey(((Boolean) obj).booleanValue());
                break;
            case 10:
                c0976j.f3494l.setAntiRevokeMessage(((Boolean) obj).booleanValue());
                break;
            case 12:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                OptionData optionData = c0976j.f3494l;
                optionData.setCustomLocalFriendAvatar(zBooleanValue2);
                boolean z2 = AbstractC1126i.f3786a;
                C1124g.m2424O(optionData);
                if (zBooleanValue2 && (activity = c0976j.getActivity()) != null) {
                    C0990l c0990l = new C0990l(activity, C0131s.f426a, "选择好友头像", "选择");
                    c0990l.f3561n = new C0060d(11, activity);
                    c0990l.m2198h();
                }
                break;
            case 15:
                c0976j.f3494l.setDisableWechatHotUpdate(((Boolean) obj).booleanValue());
                break;
            case 17:
                c0976j.f3494l.setUseFullscreenConfigUi(((Boolean) obj).booleanValue());
                break;
            case 19:
                c0976j.f3494l.setHideMainSearch(((Boolean) obj).booleanValue());
                break;
            case 21:
                c0976j.f3494l.setHideSingleSearch(((Boolean) obj).booleanValue());
                break;
            default:
                C0976J.m2166o(c0976j, (C1119b) obj);
                break;
        }
        return c0109i;
    }
}
