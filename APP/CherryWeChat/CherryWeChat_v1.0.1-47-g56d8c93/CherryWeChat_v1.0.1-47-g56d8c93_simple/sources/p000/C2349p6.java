package p000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C1274a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: p6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2349p6 implements InterfaceC2670wc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8228a;

    public /* synthetic */ C2349p6(int r1) {
        this.f8228a = r1;
    }

    @Override // p000.InterfaceC2670wc
    /* JADX INFO: renamed from: a */
    public final Class mo4771a() {
        switch(this.f8228a) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        return ParcelFileDescriptor.class;
    L8:
        return ByteBuffer.class;
    L7:
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // p000.InterfaceC2670wc
    /* JADX INFO: renamed from: b */
    public final InterfaceC2713xc mo4772b(Object r3) {
        switch(this.f8228a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new C1274a((ParcelFileDescriptor) r3);
    L7:
        return new C0774S0(r3);
    L9:
        return new C2400q6(0, (ByteBuffer) r3);
    }
}
