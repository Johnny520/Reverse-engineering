package yyds;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C0039;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yyds.ᲀᛵᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2005 implements InterfaceC2649 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10027;

    @Override // yyds.InterfaceC2649
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Class mo2804() {
        switch (this.f10027) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // yyds.InterfaceC2649
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC0740 mo2805(Object obj) {
        switch (this.f10027) {
            case 0:
                return new C0340((ByteBuffer) obj, 0);
            case 1:
                return new C1155(obj);
            default:
                return new C0039((ParcelFileDescriptor) obj);
        }
    }
}
