package yyds;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yyds.ᲀᛶᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2027 implements InterfaceC0814 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10105;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2707 f10106;

    public /* synthetic */ C2027(C2707 c2707, int i) {
        this.f10105 = i;
        this.f10106 = c2707;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo427(Object obj, C0822 c0822) {
        switch (this.f10105) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC2162 mo428(Object obj, int i, int i2, C0822 c0822) {
        switch (this.f10105) {
            case 0:
                C2707 c2707 = this.f10106;
                return c2707.m4817(new C0644((ByteBuffer) obj, c2707.f13289, c2707.f13288, 17), i, i2, c0822, C2707.f13283);
            default:
                C2707 c27072 = this.f10106;
                return c27072.m4817(new C0644((ParcelFileDescriptor) obj, c27072.f13289, c27072.f13288), i, i2, c0822, C2707.f13283);
        }
    }
}
