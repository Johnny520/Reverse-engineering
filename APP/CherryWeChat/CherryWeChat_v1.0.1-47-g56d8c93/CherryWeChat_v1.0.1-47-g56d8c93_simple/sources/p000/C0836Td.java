package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Td */
/* JADX INFO: loaded from: classes.dex */
public final class C0836Td implements InterfaceC2541tc {

    /* JADX INFO: renamed from: a */
    public final Resources.Theme f2660a;

    /* JADX INFO: renamed from: b */
    public final Resources f2661b;

    /* JADX INFO: renamed from: c */
    public final C0793Sd f2662c;

    /* JADX INFO: renamed from: d */
    public final int f2663d;

    /* JADX INFO: renamed from: e */
    public Object f2664e;

    public C0836Td(Resources.Theme r1, Resources r2, C0793Sd r3, int r4) {
        this.f2660a = r1;
        this.f2661b = r2;
        this.f2662c = r3;
        this.f2663d = r4;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        switch(this.f2662c.f2492a) {
            case 0: goto L6;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return InputStream.class;
    L5:
        return Drawable.class;
    L6:
        return AssetFileDescriptor.class;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        Object r0 = this.f2664e;
        if (r0 == null) goto L14;
        switch(this.f2662c.f2492a) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L6;
        };     // Catch: IOException -> L10
    L6:
        ((InputStream) r0).close();     // Catch: IOException -> L10
    L11:
        return;
    L7:
        Drawable r02 = (Drawable) r0;     // Catch: IOException -> L10
        goto L11
    L8:
        ((AssetFileDescriptor) r0).close();     // Catch: IOException -> L10
    L15:
        return;
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu r5, InterfaceC2498sc r6) {
        C0793Sd r52 = this.f2662c;     // Catch: Resources.NotFoundException -> L9
        Resources.Theme r0 = this.f2660a;     // Catch: Resources.NotFoundException -> L9
        Resources r1 = this.f2661b;     // Catch: Resources.NotFoundException -> L9
        int r2 = this.f2663d;     // Catch: Resources.NotFoundException -> L9
        switch(r52.f2492a) {
            case 0: goto L6;
            case 1: goto L5;
            default: goto L4;
        };     // Catch: Resources.NotFoundException -> L9
    L4:
        Object r53 = r1.openRawResource(r2);     // Catch: Resources.NotFoundException -> L9
    L7:
        this.f2664e = r53;     // Catch: Resources.NotFoundException -> L9
        r6.mo638e(r53);     // Catch: Resources.NotFoundException -> L9
        return;
    L5:
        Context r54 = r52.f2493b;     // Catch: Resources.NotFoundException -> L9
        r53 = AbstractC0148Dc.m277k(r54, r54, r2, r0);     // Catch: Resources.NotFoundException -> L9
        goto L7
    L6:
        r53 = r1.openRawResourceFd(r2);     // Catch: Resources.NotFoundException -> L9
    L9:
        e = move-exception;
        r6.mo635b(e);
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return 1;
    }
}
