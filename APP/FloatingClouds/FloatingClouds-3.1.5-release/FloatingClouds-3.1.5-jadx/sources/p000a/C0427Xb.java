package p000a;

import androidx.activity.OnBackPressedDispatcher;

/* JADX INFO: renamed from: a.Xb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0427Xb extends C0333S7 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f1605i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0427Xb(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2);
        this.f1605i = i2;
    }

    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        switch (this.f1605i) {
            case 0:
                ((OnBackPressedDispatcher) this.f251b).m2285d();
                break;
            default:
                ((OnBackPressedDispatcher) this.f251b).m2285d();
                break;
        }
        return C0413Wf.f1577a;
    }
}
