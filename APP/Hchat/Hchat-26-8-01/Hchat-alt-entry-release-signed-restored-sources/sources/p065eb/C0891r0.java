package p065eb;

import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p136j8.C2105p;

/* JADX INFO: renamed from: eb.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0891r0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2762g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f2763h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f2764i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f2765j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f2766k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f2767l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ byte[] f2768m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ String f2769n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0891r0(String str, String str2, String str3, String str4, String str5, byte[] bArr, String str6, int i9) {
        this.f2762g = i9;
        this.f2763h = str;
        this.f2764i = str2;
        this.f2765j = str3;
        this.f2766k = str4;
        this.f2767l = str5;
        this.f2768m = bArr;
        this.f2769n = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        boolean zShareMusic$lambda$0;
        switch (this.f2762g) {
            case 0:
                zShareMusic$lambda$0 = ScriptWaBridge.shareMusic$lambda$0(this.f2763h, this.f2764i, this.f2765j, this.f2766k, this.f2767l, this.f2768m, this.f2769n, (C2105p) obj);
                break;
            default:
                zShareMusic$lambda$0 = ScriptWaBridge.shareMiniProgram$lambda$0(this.f2763h, this.f2764i, this.f2765j, this.f2766k, this.f2767l, this.f2768m, this.f2769n, (C2105p) obj);
                break;
        }
        return Boolean.valueOf(zShareMusic$lambda$0);
    }
}
