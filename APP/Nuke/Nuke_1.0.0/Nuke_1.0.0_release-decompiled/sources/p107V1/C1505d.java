package p107V1;

import android.util.Log;
import com.bumptech.glide.EnumC1928j;
import com.bumptech.glide.load.data.InterfaceC1933c;
import com.bumptech.glide.load.data.InterfaceC1934d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p195l2.AbstractC2498b;

/* JADX INFO: renamed from: V1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1505d implements InterfaceC1934d {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5242d;

    /* JADX INFO: renamed from: e */
    public final Object f5243e;

    public /* synthetic */ C1505d(int i5, Object obj) {
        this.f5242d = i5;
        this.f5243e = obj;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        switch (this.f5242d) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f5243e.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: b */
    public final void mo2223b() {
        int i5 = this.f5242d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: c */
    public final int mo2224c() {
        switch (this.f5242d) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    public final void cancel() {
        int i5 = this.f5242d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: d */
    public final void mo2225d(EnumC1928j enumC1928j, InterfaceC1933c interfaceC1933c) {
        switch (this.f5242d) {
            case 0:
                try {
                    interfaceC1933c.mo43l(AbstractC2498b.m4438a((File) this.f5243e));
                } catch (IOException e5) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e5);
                    }
                    interfaceC1933c.mo36e(e5);
                    return;
                }
                break;
            default:
                interfaceC1933c.mo43l(this.f5243e);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m2775e() {
    }

    /* JADX INFO: renamed from: f */
    private final void m2776f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m2777g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m2778h() {
    }
}
