package p126Z1;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C1937g;
import com.bumptech.glide.load.data.InterfaceC1935e;
import com.bumptech.glide.load.data.InterfaceC1936f;
import java.nio.ByteBuffer;
import me.dartcv.nuke.BuildConfig;
import p121Y1.C1750k;

/* JADX INFO: renamed from: Z1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1783a implements InterfaceC1935e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6093a;

    public /* synthetic */ C1783a(int i5) {
        this.f6093a = i5;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1935e
    /* JADX INFO: renamed from: a */
    public final Class mo3185a() {
        switch (this.f6093a) {
            case 0:
                return ByteBuffer.class;
            case BuildConfig.VERSION_CODE /* 1 */:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1935e
    /* JADX INFO: renamed from: b */
    public final InterfaceC1936f mo3186b(Object obj) {
        switch (this.f6093a) {
            case 0:
                return new C1750k(3, (ByteBuffer) obj);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C1937g(obj);
            default:
                return new C1937g((ParcelFileDescriptor) obj);
        }
    }
}
