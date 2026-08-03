package p065eb;

import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p136j8.C2105p;

/* JADX INFO: renamed from: eb.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0897u0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2783g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f2784h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f2785i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f2786j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f2787k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ byte[] f2788l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ String f2789m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0897u0(String str, String str2, String str3, String str4, byte[] bArr, String str5, int i9) {
        this.f2783g = i9;
        this.f2784h = str;
        this.f2785i = str2;
        this.f2786j = str3;
        this.f2787k = str4;
        this.f2788l = bArr;
        this.f2789m = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        boolean zShareWebpage$lambda$0;
        switch (this.f2783g) {
            case 0:
                zShareWebpage$lambda$0 = ScriptWaBridge.shareWebpage$lambda$0(this.f2784h, this.f2785i, this.f2786j, this.f2787k, this.f2788l, this.f2789m, (C2105p) obj);
                break;
            default:
                zShareWebpage$lambda$0 = ScriptWaBridge.shareVideo$lambda$0(this.f2784h, this.f2785i, this.f2786j, this.f2787k, this.f2788l, this.f2789m, (C2105p) obj);
                break;
        }
        return Boolean.valueOf(zShareWebpage$lambda$0);
    }
}
