package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: lh */
/* JADX INFO: loaded from: classes.dex */
public final class C2194lh implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7647a;

    public /* synthetic */ C2194lh(int r1) {
        this.f7647a = r1;
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object r1, int r2, int r3, C2644vt r4) {
        switch(this.f7647a) {
            case 0: goto L12;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        Drawable r12 = (Drawable) r1;
        if (r12 != null) goto L13;
        return null;
    L13:
        return new C0069Bj(r12, 1);
    L10:
        return new C0304H2(3, (Bitmap) r1);
    L12:
        return new C0304H2((File) r1);
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo750b(Object r1, C2644vt r2) {
        switch(this.f7647a) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        Drawable r12 = (Drawable) r1;
        return true;
    L7:
        Bitmap r13 = (Bitmap) r1;
        return true;
    L8:
        File r14 = (File) r1;
        return true;
    }
}
