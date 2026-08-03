package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: mh */
/* JADX INFO: loaded from: classes.dex */
public final class C2237mh implements InterfaceC2541tc {

    /* JADX INFO: renamed from: a */
    public final String f7884a;

    /* JADX INFO: renamed from: b */
    public final AssetManager f7885b;

    /* JADX INFO: renamed from: c */
    public Object f7886c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7887d;

    public C2237mh(AssetManager r1, String r2, int r3) {
        this.f7887d = r3;
        this.f7885b = r1;
        this.f7884a = r2;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        switch(this.f7887d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return InputStream.class;
    L6:
        return AssetFileDescriptor.class;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        Object r0 = this.f7886c;
        if (r0 != null) goto L12;
        return;
    L12:
        switch(this.f7887d) {
            case 0: goto L8;
            default: goto L7;
        };     // Catch: IOException -> L10
    L7:
        ((InputStream) r0).close();     // Catch: IOException -> L10
    L11:
        return;
    L8:
        ((AssetFileDescriptor) r0).close();     // Catch: IOException -> L10
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu r3, InterfaceC2498sc r4) {
        AssetManager r32 = this.f7885b;     // Catch: IOException -> L8
        String r0 = this.f7884a;     // Catch: IOException -> L8
        switch(this.f7887d) {
            case 0: goto L5;
            default: goto L4;
        };     // Catch: IOException -> L8
    L4:
        Object r33 = r32.open(r0);     // Catch: IOException -> L8
    L6:
        this.f7886c = r33;     // Catch: IOException -> L8
        r4.mo638e(r33);     // Catch: IOException -> L8
        return;
    L5:
        r33 = r32.openFd(r0);     // Catch: IOException -> L8
    L8:
        e = move-exception;
        r4.mo635b(e);
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return 1;
    }
}
