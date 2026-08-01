package androidx.activity;

import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0036 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ComponentActivity f71;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f72;

    public /* synthetic */ C0036(ComponentActivity componentActivity, int i) {
        this.f72 = i;
        this.f71 = componentActivity;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f72;
        ComponentActivity componentActivity = this.f71;
        switch (i) {
            case 0:
                return ComponentActivity.fullyDrawnReporter_delegate$lambda$0$0(componentActivity);
            case 1:
                return ComponentActivity.fullyDrawnReporter_delegate$lambda$0(componentActivity);
            case 2:
                return ComponentActivity.onBackPressedInput_delegate$lambda$0(componentActivity);
            case 3:
                return ComponentActivity.defaultViewModelProviderFactory_delegate$lambda$0(componentActivity);
            default:
                return ComponentActivity.onBackPressedDispatcher_delegate$lambda$0(componentActivity);
        }
    }
}
