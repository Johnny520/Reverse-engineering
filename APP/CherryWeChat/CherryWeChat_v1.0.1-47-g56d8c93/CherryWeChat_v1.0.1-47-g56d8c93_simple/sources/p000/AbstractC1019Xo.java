package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: Xo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1019Xo implements InterfaceC2541tc {

    /* JADX INFO: renamed from: a */
    public final boolean f3227a;

    /* JADX INFO: renamed from: b */
    public final Uri f3228b;

    /* JADX INFO: renamed from: c */
    public final ContentResolver f3229c;

    /* JADX INFO: renamed from: d */
    public Object f3230d;

    public AbstractC1019Xo(ContentResolver r1, Uri r2, boolean r3) {
        this.f3229c = r1;
        this.f3228b = r2;
        this.f3227a = r3;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1623b(Object r1);

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        Object r0 = this.f3230d;
        if (r0 == null) goto L9;
        mo1623b(r0);     // Catch: IOException -> L6
        return;
    L10:
        return;
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu r2, InterfaceC2498sc r3) {
        Uri r22 = this.f3228b;     // Catch: FileNotFoundException -> L4
        Object r23 = mo1624e(this.f3229c, r22);     // Catch: FileNotFoundException -> L4
        this.f3230d = r23;     // Catch: FileNotFoundException -> L4
        r3.mo638e(r23);     // Catch: FileNotFoundException -> L4
        return;
    L4:
        e = move-exception;
        r3.mo635b(e);
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo1624e(ContentResolver r1, Uri r2);

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return 1;
    }
}
