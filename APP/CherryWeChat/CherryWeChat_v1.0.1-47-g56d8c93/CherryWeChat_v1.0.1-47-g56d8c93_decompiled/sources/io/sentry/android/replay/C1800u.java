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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1800u(ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v, int i) {
        super(0);
        this.f6526b = i;
        this.f6527c = viewTreeObserverOnDrawListenerC1810v;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Dn, java.lang.Object] */
    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f6526b) {
            case 0:
                Matrix matrix = new Matrix();
                C1821w c1821w = this.f6527c.f6541a;
                matrix.preScale(c1821w.f6591c, c1821w.f6592d);
                return matrix;
            default:
                return new Canvas((Bitmap) this.f6527c.f6548h.getValue());
        }
    }
}
