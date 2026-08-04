package yyds;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: yyds.ᛷᛱᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1482 implements InterfaceC1826, InterfaceC2768 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f7018;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Resources f7019;

    public /* synthetic */ C1482(Resources resources, int i) {
        this.f7018 = i;
        this.f7019 = resources;
    }

    @Override // yyds.InterfaceC2768
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public InterfaceC0894 mo382(C0644 c0644) {
        int i = this.f7018;
        Resources resources = this.f7019;
        switch (i) {
            case 1:
                return new C2480(resources, c0644.m1565(Uri.class, AssetFileDescriptor.class));
            case 2:
                return new C2480(resources, c0644.m1565(Uri.class, InputStream.class));
            default:
                return new C2480(resources, C1739.f8787);
        }
    }

    @Override // yyds.InterfaceC1826
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public InterfaceC2162 mo1277(InterfaceC2162 interfaceC2162, C0822 c0822) {
        if (interfaceC2162 == null) {
            return null;
        }
        return new C0656(this.f7019, interfaceC2162);
    }
}
