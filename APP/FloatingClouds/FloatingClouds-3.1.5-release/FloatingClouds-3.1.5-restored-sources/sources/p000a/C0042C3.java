package p000a;

import androidx.activity.ComponentActivity;

/* JADX INFO: renamed from: a.C3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0042C3 implements InterfaceC0482ac {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentActivity f165b;

    public /* synthetic */ C0042C3(ComponentActivity componentActivity, int i) {
        this.f164a = i;
        this.f165b = componentActivity;
    }

    /* JADX DEBUG: Class process forced to load method for inline: a.X6.d(a.X6, androidx.activity.ComponentActivity):void */
    @Override // p000a.InterfaceC0482ac
    /* JADX INFO: renamed from: a */
    public final void mo125a(ComponentActivity componentActivity) {
        switch (this.f164a) {
            case 0:
                this.f165b.lambda$new$2(componentActivity);
                break;
            default:
                ((ActivityC0422X6) this.f165b).lambda$init$3(componentActivity);
                break;
        }
    }
}
