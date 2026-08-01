package p189n;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import p049d9.AbstractC1927c;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4553j;
import p166l2.InterfaceC4587t;
import p250r1.C6455e;
import p250r1.C6461k;
import p265s1.AbstractC7072f0;
import p274t.InterfaceC7887q2;
import p290u1.InterfaceC8484c;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: n.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5199c1 extends AbstractC4565m implements InterfaceC4587t {

    /* JADX INFO: renamed from: H */
    public final C5202d f15914H;

    /* JADX INFO: renamed from: I */
    public final C5287u0 f15915I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC7887q2 f15916J;

    public C5199c1(InterfaceC4553j interfaceC4553j, C5202d c5202d, C5287u0 c5287u0, InterfaceC7887q2 interfaceC7887q2) {
        this.f15914H = c5202d;
        this.f15915I = c5287u0;
        this.f15916J = interfaceC7887q2;
        m18049G2(interfaceC4553j);
    }

    /* JADX INFO: renamed from: M2 */
    public final boolean m21323M2(InterfaceC8487f interfaceC8487f, EdgeEffect edgeEffect, Canvas canvas) {
        float fMo1233i1 = interfaceC8487f.mo1233i1(this.f15916J.mo27239a());
        float f10 = -Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() >> 32));
        float f11 = (-Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() & 4294967295L))) + fMo1233i1;
        return m21327Q2(180.0f, C6455e.m25551e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L)), edgeEffect, canvas);
    }

    /* JADX INFO: renamed from: N2 */
    public final boolean m21324N2(InterfaceC8487f interfaceC8487f, EdgeEffect edgeEffect, Canvas canvas) {
        float f10 = -Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() & 4294967295L));
        float fMo1233i1 = interfaceC8487f.mo1233i1(this.f15916J.mo27240b(interfaceC8487f.getLayoutDirection()));
        return m21327Q2(270.0f, C6455e.m25551e((((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fMo1233i1)))), edgeEffect, canvas);
    }

    /* JADX INFO: renamed from: O2 */
    public final boolean m21325O2(InterfaceC8487f interfaceC8487f, EdgeEffect edgeEffect, Canvas canvas) {
        return m21327Q2(90.0f, C6455e.m25551e((((long) Float.floatToRawIntBits((-AbstractC1927c.m6980d(Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() >> 32)))) + interfaceC8487f.mo1233i1(this.f15916J.mo27242d(interfaceC8487f.getLayoutDirection())))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), edgeEffect, canvas);
    }

    /* JADX INFO: renamed from: P2 */
    public final boolean m21326P2(InterfaceC8487f interfaceC8487f, EdgeEffect edgeEffect, Canvas canvas) {
        float fMo1233i1 = interfaceC8487f.mo1233i1(this.f15916J.mo27241c());
        return m21327Q2(0.0f, C6455e.m25551e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fMo1233i1)) & 4294967295L)), edgeEffect, canvas);
    }

    /* JADX INFO: renamed from: Q2 */
    public final boolean m21327Q2(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // p166l2.InterfaceC4587t
    /* JADX INFO: renamed from: o */
    public void mo1376o(InterfaceC8484c interfaceC8484c) {
        this.f15914H.m21352p(interfaceC8484c.mo18037b());
        if (C6461k.m25623k(interfaceC8484c.mo18037b())) {
            interfaceC8484c.mo18034W1();
            return;
        }
        interfaceC8484c.mo18034W1();
        this.f15914H.m21345i().getValue();
        Canvas canvasM27862d = AbstractC7072f0.m27862d(interfaceC8484c.mo18044n1().mo32635i());
        C5287u0 c5287u0 = this.f15915I;
        boolean zM21324N2 = c5287u0.m21583s() ? m21324N2(interfaceC8484c, c5287u0.m21573i(), canvasM27862d) : false;
        if (c5287u0.m21590z()) {
            zM21324N2 = m21326P2(interfaceC8484c, c5287u0.m21577m(), canvasM27862d) || zM21324N2;
        }
        if (c5287u0.m21586v()) {
            zM21324N2 = m21325O2(interfaceC8484c, c5287u0.m21575k(), canvasM27862d) || zM21324N2;
        }
        if (c5287u0.m21580p()) {
            zM21324N2 = m21323M2(interfaceC8484c, c5287u0.m21571g(), canvasM27862d) || zM21324N2;
        }
        if (zM21324N2) {
            this.f15914H.m21346j();
        }
    }
}
