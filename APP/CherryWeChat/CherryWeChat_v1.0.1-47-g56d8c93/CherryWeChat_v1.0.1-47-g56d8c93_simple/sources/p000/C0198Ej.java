package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: renamed from: Ej */
/* JADX INFO: loaded from: classes.dex */
public final class C0198Ej implements InterfaceC1444gA {

    /* JADX INFO: renamed from: a */
    public final int f596a;

    /* JADX INFO: renamed from: b */
    public final int f597b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1026Xv f598c;

    /* JADX INFO: renamed from: d */
    public final Handler f599d;

    /* JADX INFO: renamed from: e */
    public final int f600e;

    /* JADX INFO: renamed from: f */
    public final long f601f;

    /* JADX INFO: renamed from: g */
    public Bitmap f602g;

    public C0198Ej(Handler r3, int r4, long r5) {
        if (AbstractC2622vD.m5138i(Integer.MIN_VALUE, Integer.MIN_VALUE) == false) goto L7;
        this.f596a = Integer.MIN_VALUE;
        this.f597b = Integer.MIN_VALUE;
        this.f599d = r3;
        this.f600e = r4;
        this.f601f = r5;
        return;
    L7:
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: a */
    public final InterfaceC1026Xv mo391a() {
        return this.f598c;
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: b */
    public final void mo392b() {
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: c */
    public final void mo393c(Drawable r1) {
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: d */
    public final void mo394d() {
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: e */
    public final void mo395e(C2563ty r1) {
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: f */
    public final void mo396f(C2563ty r3) {
        r3.m5050l(this.f596a, this.f597b);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: g */
    public final void mo397g(InterfaceC1026Xv r1) {
        this.f598c = r1;
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: h */
    public final void mo398h(Drawable r1) {
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: i */
    public final void mo399i(Drawable r1) {
        this.f602g = null;
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: j */
    public final void mo400j(Object r4) {
        this.f602g = (Bitmap) r4;
        Handler r0 = this.f599d;
        r0.sendMessageAtTime(r0.obtainMessage(1, this), this.f601f);
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: k */
    public final void mo401k() {
    }
}
