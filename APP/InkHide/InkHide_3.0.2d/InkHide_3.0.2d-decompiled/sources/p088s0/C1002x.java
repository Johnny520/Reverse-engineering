package p088s0;

import p009E0.C0109i;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p090t0.AbstractC1008c;

/* JADX INFO: renamed from: s0.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1002x implements InterfaceC0193a, InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0976J f3595b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1002x(C0976J c0976j, int i2) {
        this.f3594a = i2;
        this.f3595b = c0976j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        switch (this.f3594a) {
            case 0:
                return Boolean.valueOf(this.f3595b.f3494l.getHideCloseFriend());
            case 1:
            case 3:
            case 4:
            case 6:
            case 9:
            case 11:
            case 14:
            case 15:
            case 17:
            case 20:
            case 22:
            case 24:
            case 26:
            default:
                return Boolean.valueOf(this.f3595b.f3494l.getDisableSelfSnsLongPressHidePrompt());
            case 2:
                return Boolean.valueOf(this.f3595b.f3494l.getHideVoipCall());
            case 5:
                return Boolean.valueOf(this.f3595b.f3494l.getHideContactFriend());
            case 7:
                return Boolean.valueOf(this.f3595b.f3494l.getHideChatHistory());
            case 8:
                this.f3595b.m2173L();
                return C0109i.f404a;
            case 10:
                return Boolean.valueOf(this.f3595b.f3494l.getHideStorageChatHistory());
            case 12:
                return Boolean.valueOf(this.f3595b.f3494l.getHideTextStatusFriend());
            case 13:
                return Boolean.valueOf(this.f3595b.f3494l.getHideConversationUnreadBadge());
            case 16:
                return Boolean.valueOf(this.f3595b.f3494l.getHiddenMessageVibrate());
            case 18:
                this.f3595b.m2175N();
                return C0109i.f404a;
            case 19:
                return Boolean.valueOf(this.f3595b.f3494l.getHideTopBarUnreadBold());
            case 21:
                return Boolean.valueOf(this.f3595b.f3494l.getHideSnsCloseFriendPosts());
            case 23:
                return Boolean.valueOf(this.f3595b.f3494l.getHideSnsGroupIcon());
            case 25:
                return Boolean.valueOf(this.f3595b.f3494l.getHideSnsLike());
            case 27:
                return Boolean.valueOf(this.f3595b.f3494l.getHideSelfSnsPosts());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) {
        switch (this.f3594a) {
            case 1:
                this.f3595b.f3494l.setHideTextStatusFriend(((Boolean) obj).booleanValue());
                break;
            case 3:
                this.f3595b.f3494l.setHideVoipCall(((Boolean) obj).booleanValue());
                break;
            case 4:
                this.f3595b.f3494l.setHideCloseFriend(((Boolean) obj).booleanValue());
                break;
            case 6:
                this.f3595b.f3494l.setHideContactFriend(((Boolean) obj).booleanValue());
                break;
            case 9:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0976J c0976j = this.f3595b;
                c0976j.f3494l.setHideChatHistory(zBooleanValue);
                if (zBooleanValue) {
                    c0976j.m2173L();
                }
                break;
            case 11:
                this.f3595b.f3494l.setHideStorageChatHistory(((Boolean) obj).booleanValue());
                break;
            case 14:
                C0976J.m2162k(this.f3595b, (AbstractC1008c) obj);
                break;
            case 15:
                this.f3595b.f3494l.setHideConversationUnreadBadge(((Boolean) obj).booleanValue());
                break;
            case 17:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C0976J c0976j2 = this.f3595b;
                c0976j2.f3494l.setHiddenMessageVibrate(zBooleanValue2);
                if (zBooleanValue2) {
                    c0976j2.m2175N();
                }
                break;
            case 20:
                this.f3595b.f3494l.setHideTopBarUnreadBold(((Boolean) obj).booleanValue());
                break;
            case 22:
                this.f3595b.f3494l.setHideSnsCloseFriendPosts(((Boolean) obj).booleanValue());
                break;
            case 24:
                this.f3595b.f3494l.setHideSnsGroupIcon(((Boolean) obj).booleanValue());
                break;
            case 26:
                this.f3595b.f3494l.setHideSnsLike(((Boolean) obj).booleanValue());
                break;
            default:
                this.f3595b.f3494l.setDisableSelfSnsLongPressHidePrompt(((Boolean) obj).booleanValue());
                break;
        }
        return C0109i.f404a;
    }
}
