package yyds;

import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᲁᛲᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2190 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f10757;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10758;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f10759;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0937 f10760;

    public /* synthetic */ C2190(C0937 c0937, int i, int i2, int i3) {
        this.f10758 = i3;
        this.f10760 = c0937;
        this.f10757 = i;
        this.f10759 = i2;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() {
        int i = this.f10758;
        C2746 c2746 = C2746.f13459;
        int i2 = this.f10759;
        int i3 = this.f10757;
        C0937 c0937 = this.f10760;
        switch (i) {
            case 0:
                try {
                    c0937.f4318.m920(i3, i2);
                } catch (IOException e) {
                    c0937.m2052(2, 2, e);
                }
                break;
            default:
                try {
                    c0937.f4318.m923(i3, i2, true);
                } catch (IOException e2) {
                    c0937.m2052(2, 2, e2);
                }
                break;
        }
        return c2746;
        return c2746;
    }
}
