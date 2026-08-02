package p000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C0100a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ho */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0284ho implements j40 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4091a;

    public /* synthetic */ C0284ho(int i) {
        this.f4091a = i;
    }

    @Override // p000.j40
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        switch (this.f4091a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.j40
    /* JADX INFO: renamed from: b */
    public final k40 mo2223b(Object obj) {
        switch (this.f4091a) {
            case 0:
                return new C0320io(0, (ByteBuffer) obj);
            case 1:
                return new C0374k4(obj);
            default:
                return new C0100a((ParcelFileDescriptor) obj);
        }
    }
}
