package androidx.compose.p001ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.C2437;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.unit.LayoutDirection;
import p068.InterfaceC7387;
import p129.AbstractC8161;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2354 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C2356 f4721 = new C2356(0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C2351 f4722;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Outline f4723;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f4724;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public LayoutDirection f4725;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC7387 f4726;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f4727;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC8725 f4728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2437 f4729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2342 f4730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC8161 f4731;

    public C2354(AbstractC8161 abstractC8161, C2437 c2437, C2342 c2342) {
        super(abstractC8161.getContext());
        this.f4731 = abstractC8161;
        this.f4729 = c2437;
        this.f4730 = c2342;
        setOutlineProvider(f4721);
        this.f4727 = true;
        this.f4728 = AbstractC2340.f4627;
        this.f4725 = LayoutDirection.Ltr;
        InterfaceC2349.f4692.getClass();
        this.f4726 = C2350.f4693;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C2437 c2437 = this.f4729;
        C2430 c2430 = c2437.f5048;
        Canvas canvas2 = c2430.f5035;
        c2430.f5035 = canvas;
        InterfaceC8725 interfaceC8725 = this.f4728;
        LayoutDirection layoutDirection = this.f4725;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C2351 c2351 = this.f4722;
        InterfaceC7387 interfaceC7387 = this.f4726;
        C2342 c2342 = this.f4730;
        InterfaceC8725 interfaceC8725M949 = c2342.mo3266().m949();
        LayoutDirection layoutDirectionM930 = c2342.mo3266().m930();
        InterfaceC2436 interfaceC2436M946 = c2342.mo3266().m946();
        long jM928 = c2342.mo3266().m928();
        C2351 c23512 = (C2351) c2342.mo3266().f665;
        C0955 c0955Mo3266 = c2342.mo3266();
        c0955Mo3266.m924(interfaceC8725);
        c0955Mo3266.m920(layoutDirection);
        c0955Mo3266.m925(c2430);
        c0955Mo3266.m921(jFloatToRawIntBits);
        c0955Mo3266.f665 = c2351;
        c2430.mo3237();
        try {
            interfaceC7387.invoke(c2342);
            c2430.mo3249();
            C0955 c0955Mo32662 = c2342.mo3266();
            c0955Mo32662.m924(interfaceC8725M949);
            c0955Mo32662.m920(layoutDirectionM930);
            c0955Mo32662.m925(interfaceC2436M946);
            c0955Mo32662.m921(jM928);
            c0955Mo32662.f665 = c23512;
            c2437.f5048.f5035 = canvas2;
            this.f4724 = false;
        } catch (Throwable th) {
            c2430.mo3249();
            C0955 c0955Mo32663 = c2342.mo3266();
            c0955Mo32663.m924(interfaceC8725M949);
            c0955Mo32663.m920(layoutDirectionM930);
            c0955Mo32663.m925(interfaceC2436M946);
            c0955Mo32663.m921(jM928);
            c0955Mo32663.f665 = c23512;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f4727;
    }

    public final C2437 getCanvasHolder() {
        return this.f4729;
    }

    public final View getOwnerView() {
        return this.f4731;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f4727;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f4724) {
            return;
        }
        this.f4724 = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f4727 != z) {
            this.f4727 = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.f4724 = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
