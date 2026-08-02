package p000;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: he */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0274he extends v70 {

    /* JADX INFO: renamed from: c */
    public static final C0274he f3964c = new C0274he("AntiRevokeNoTip.MethodAntiRevokeNoTip", 0);

    /* JADX INFO: renamed from: d */
    public static final C0274he f3965d = new C0274he("BlockXposedDetection.MethodCheckXposed", 1);

    /* JADX INFO: renamed from: e */
    public static final C0274he f3966e = new C0274he("ConversationStorage.MethodDeleteConversation", 2);

    /* JADX INFO: renamed from: f */
    public static final C0274he f3967f = new C0274he("ConversationStorage.MethodUpdateUnReadCount", 3);

    /* JADX INFO: renamed from: g */
    public static final C0274he f3968g = new C0274he("EnableRoundAvatar.MethodGetFixedAvatarBitmap", 4);

    /* JADX INFO: renamed from: h */
    public static final C0274he f3969h = new C0274he("FocusPadMode.MethodCheckIsPadMode", 5);

    /* JADX INFO: renamed from: i */
    public static final C0274he f3970i = new C0274he("FocusPadMode.MethodUnLockPadModeUI", 6);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0274he(String str, int i) {
        super(str);
        this.f3971b = i;
    }

    @Override // p000.v70
    /* JADX INFO: renamed from: a */
    public final void mo129a(DexKitBridge dexKitBridge) {
        switch (this.f3971b) {
            case 0:
                m5638c(dexKitBridge, new C0829w(10));
                break;
            case 1:
                m5638c(dexKitBridge, new C0829w(22));
                break;
            case 2:
                m5638c(dexKitBridge, new C0251gs(4));
                break;
            case 3:
                m5638c(dexKitBridge, new C0251gs(5));
                break;
            case 4:
                m5638c(dexKitBridge, new C0251gs(19));
                break;
            case 5:
                m5638c(dexKitBridge, new C0251gs(23));
                break;
            default:
                m5638c(dexKitBridge, new C0251gs(24));
                break;
        }
    }
}
