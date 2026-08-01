package androidx.activity;

import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0883 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ComponentActivity f416;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f417;

    public /* synthetic */ C0883(ComponentActivity componentActivity, int i) {
        this.f417 = i;
        this.f416 = componentActivity;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f417;
        ComponentActivity componentActivity = this.f416;
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
