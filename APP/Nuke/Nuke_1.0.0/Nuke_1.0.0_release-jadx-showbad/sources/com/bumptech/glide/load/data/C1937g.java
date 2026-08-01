package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.HashMap;
import me.dartcv.nuke.BuildConfig;
import p093S1.C1294f;
import p121Y1.C1733A;
import p126Z1.C1783a;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1937g implements InterfaceC1936f {

    /* JADX INFO: renamed from: f */
    public static final C1783a f6569f = new C1783a(1);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6570d;

    /* JADX INFO: renamed from: e */
    public final Object f6571e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1937g() {
        this.f6570d = 0;
        this.f6571e = new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1936f
    /* JADX INFO: renamed from: b */
    public void mo3101b() {
        switch (this.f6570d) {
            case BuildConfig.VERSION_CODE /* 1 */:
            case 2:
                break;
            default:
                ((C1733A) this.f6571e).m3091c();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1936f
    /* JADX INFO: renamed from: c */
    public Object mo3102c() {
        switch (this.f6570d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f6571e).rewind();
            case 2:
                return this.f6571e;
            default:
                C1733A c1733a = (C1733A) this.f6571e;
                c1733a.reset();
                return c1733a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public ParcelFileDescriptor m3600e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f6571e).rewind();
    }

    public C1937g(InputStream inputStream, C1294f c1294f) {
        this.f6570d = 3;
        C1733A c1733a = new C1733A(inputStream, c1294f);
        this.f6571e = c1733a;
        c1733a.mark(5242880);
    }

    public C1937g(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6570d = 1;
        this.f6571e = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public C1937g(Object obj) {
        this.f6570d = 2;
        this.f6571e = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m3598a() {
    }

    /* JADX INFO: renamed from: d */
    private final void m3599d() {
    }
}
