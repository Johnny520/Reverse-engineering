package p000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C1274a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: p6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2349p6 implements InterfaceC2670wc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8228a;

    public /* synthetic */ C2349p6(int i) {
        this.f8228a = i;
    }

    @Override // p000.InterfaceC2670wc
    /* JADX INFO: renamed from: a */
    public final Class mo4771a() {
        switch (this.f8228a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.InterfaceC2670wc
    /* JADX INFO: renamed from: b */
    public final InterfaceC2713xc mo4772b(Object obj) {
        switch (this.f8228a) {
            case 0:
                return new C2400q6(0, (ByteBuffer) obj);
            case 1:
                return new C0774S0(obj);
            default:
                return new C1274a((ParcelFileDescriptor) obj);
        }
    }
}
