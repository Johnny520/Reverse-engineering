package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC1928j;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1939i implements InterfaceC1934d {

    /* JADX INFO: renamed from: d */
    public final String f6576d;

    /* JADX INFO: renamed from: e */
    public final AssetManager f6577e;

    /* JADX INFO: renamed from: f */
    public Object f6578f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6579g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1939i(AssetManager assetManager, String str, int i5) {
        this.f6579g = i5;
        this.f6577e = assetManager;
        this.f6576d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        switch (this.f6579g) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: b */
    public final void mo2223b() {
        Object obj = this.f6578f;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f6579g) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: c */
    public final int mo2224c() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: d */
    public final void mo2225d(EnumC1928j enumC1928j, InterfaceC1933c interfaceC1933c) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f6577e;
            String str = this.f6576d;
            switch (this.f6579g) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f6578f = objOpenFd;
            interfaceC1933c.mo43l(objOpenFd);
        } catch (IOException e5) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e5);
            }
            interfaceC1933c.mo36e(e5);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    public final void cancel() {
    }
}
