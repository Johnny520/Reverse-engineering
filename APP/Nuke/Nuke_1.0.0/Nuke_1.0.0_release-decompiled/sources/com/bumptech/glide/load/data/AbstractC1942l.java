package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC1928j;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1942l implements InterfaceC1934d {

    /* JADX INFO: renamed from: d */
    public final boolean f6586d;

    /* JADX INFO: renamed from: e */
    public final Uri f6587e;

    /* JADX INFO: renamed from: f */
    public final ContentResolver f6588f;

    /* JADX INFO: renamed from: g */
    public Object f6589g;

    public AbstractC1942l(ContentResolver contentResolver, Uri uri, boolean z5) {
        this.f6588f = contentResolver;
        this.f6587e = uri;
        this.f6586d = z5;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: b */
    public final void mo2223b() {
        Object obj = this.f6589g;
        if (obj != null) {
            try {
                mo3596e(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: c */
    public final int mo2224c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: d */
    public final void mo2225d(EnumC1928j enumC1928j, InterfaceC1933c interfaceC1933c) {
        try {
            Object objMo3597f = mo3597f(this.f6588f, this.f6587e);
            this.f6589g = objMo3597f;
            interfaceC1933c.mo43l(objMo3597f);
        } catch (FileNotFoundException e5) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e5);
            }
            interfaceC1933c.mo36e(e5);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo3596e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract Object mo3597f(ContentResolver contentResolver, Uri uri);

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    public final void cancel() {
    }
}
