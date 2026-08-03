package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: T4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0821T4 extends AbstractC1019Xo {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2593e;

    public /* synthetic */ C0821T4(ContentResolver r1, Uri r2, boolean r3, int r4) {
        this.f2593e = r4;
        super(r1, r2, r3);
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        switch(this.f2593e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return ParcelFileDescriptor.class;
    L6:
        return AssetFileDescriptor.class;
    }

    @Override // p000.AbstractC1019Xo
    /* JADX INFO: renamed from: b */
    public final void mo1623b(Object r2) {
        switch(this.f2593e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((ParcelFileDescriptor) r2).close();
        return;
    L6:
        ((AssetFileDescriptor) r2).close();
    }

    @Override // p000.AbstractC1019Xo
    /* JADX INFO: renamed from: e */
    public final Object mo1624e(ContentResolver r3, Uri r4) {
        switch(this.f2593e) {
            case 0: goto L19;
            default: goto L4;
        };
    L4:
        boolean r32 = this.f3227a;
        ContentResolver r0 = this.f3229c;
        if (r32 == true) goto L7;
    L13:
        AssetFileDescriptor r33 = r0.openAssetFileDescriptor(r4, "r");
    L14:
        if (r33 == null) goto L18;
        return r33.getParcelFileDescriptor();
    L18:
        throw new FileNotFoundException("FileDescriptor is null for: " + r4);
    L7:
        if (AbstractC0628Oj.m1227H(r4) == false) goto L13;
        if (Build.VERSION.SDK_INT < 30) goto L13;
        if (AbstractC0773S.m1571b() < 17) goto L13;
        r33 = AbstractC1424fr.m2736a(r0, r4);
        goto L14
    L19:
        boolean r34 = this.f3227a;
        ContentResolver r02 = this.f3229c;
        if (r34 == true) goto L22;
    L28:
        AssetFileDescriptor r35 = r02.openAssetFileDescriptor(r4, "r");
    L29:
        if (r35 == null) goto L32;
        return r35;
    L32:
        throw new FileNotFoundException("FileDescriptor is null for: " + r4);
    L22:
        if (AbstractC0628Oj.m1227H(r4) == false) goto L28;
        if (Build.VERSION.SDK_INT < 30) goto L28;
        if (AbstractC0773S.m1571b() < 17) goto L28;
        r35 = AbstractC1424fr.m2736a(r02, r4);
        goto L29
    }
}
