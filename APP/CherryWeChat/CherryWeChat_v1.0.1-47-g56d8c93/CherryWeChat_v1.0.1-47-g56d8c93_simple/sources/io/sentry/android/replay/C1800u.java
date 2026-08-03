package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import p000.AbstractC0073Bn;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.sentry.android.replay.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1800u extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6526b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewTreeObserverOnDrawListenerC1810v f6527c;

    public /* synthetic */ C1800u(ViewTreeObserverOnDrawListenerC1810v r1, int r2) {
        this.f6526b = r2;
        this.f6527c = r1;
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Dn, java.lang.Object] */
    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f6526b) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Matrix r0 = new Matrix();
        C1821w r1 = this.f6527c.f6541a;
        r0.preScale(r1.f6591c, r1.f6592d);
        return r0;
    L5:
        return new Canvas((Bitmap) this.f6527c.f6548h.getValue());
    }
}
