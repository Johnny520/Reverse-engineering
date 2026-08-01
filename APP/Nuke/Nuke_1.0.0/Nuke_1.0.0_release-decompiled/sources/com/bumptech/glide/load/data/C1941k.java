package com.bumptech.glide.load.data;

import java.io.InputStream;
import p093S1.C1294f;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1941k implements InterfaceC1935e {

    /* JADX INFO: renamed from: a */
    public final C1294f f6585a;

    public C1941k(C1294f c1294f) {
        this.f6585a = c1294f;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1935e
    /* JADX INFO: renamed from: a */
    public final Class mo3185a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1935e
    /* JADX INFO: renamed from: b */
    public final InterfaceC1936f mo3186b(Object obj) {
        return new C1937g((InputStream) obj, this.f6585a);
    }
}
