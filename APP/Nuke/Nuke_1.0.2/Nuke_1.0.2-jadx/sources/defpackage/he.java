package defpackage;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class he extends v70 {
    public static final he c = new he("AntiRevokeNoTip.MethodAntiRevokeNoTip", 0);
    public static final he d = new he("BlockXposedDetection.MethodCheckXposed", 1);
    public static final he e = new he("ConversationStorage.MethodDeleteConversation", 2);
    public static final he f = new he("ConversationStorage.MethodUpdateUnReadCount", 3);
    public static final he g = new he("EnableRoundAvatar.MethodGetFixedAvatarBitmap", 4);
    public static final he h = new he("FocusPadMode.MethodCheckIsPadMode", 5);
    public static final he i = new he("FocusPadMode.MethodUnLockPadModeUI", 6);
    public final /* synthetic */ int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he(String str, int i2) {
        super(str);
        this.b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v70
    public final void a(DexKitBridge dexKitBridge) {
        switch (this.b) {
            case 0:
                c(dexKitBridge, new w(10));
                break;
            case 1:
                c(dexKitBridge, new w(22));
                break;
            case 2:
                c(dexKitBridge, new gs(4));
                break;
            case 3:
                c(dexKitBridge, new gs(5));
                break;
            case 4:
                c(dexKitBridge, new gs(19));
                break;
            case 5:
                c(dexKitBridge, new gs(23));
                break;
            default:
                c(dexKitBridge, new gs(24));
                break;
        }
    }
}
