package yyds;

import android.view.ViewGroup;

/* JADX INFO: renamed from: yyds.ᲇᛷᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2483 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ EnumC2097 f12273;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12274;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C1952 f12275;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f12276;

    public /* synthetic */ RunnableC2483(ViewGroup viewGroup, EnumC2097 enumC2097, C1952 c1952, int i) {
        this.f12274 = i;
        this.f12276 = viewGroup;
        this.f12273 = enumC2097;
        this.f12275 = c1952;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12274;
        C1952 c1952 = this.f12275;
        EnumC2097 enumC2097 = this.f12273;
        ViewGroup viewGroup = this.f12276;
        switch (i) {
            case 0:
                C1784.f9011.m3568(viewGroup, enumC2097, c1952);
                break;
            default:
                C1784.f9011.m3568(viewGroup, enumC2097, c1952);
                break;
        }
    }
}
