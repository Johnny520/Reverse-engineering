package p059e3;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.InterfaceC0564p5;
import p024b9.AbstractC1061t;
import p074f3.AbstractC2285e;
import p104h3.C2858k;
import p215oc.C5729x;
import p250r1.C6461k;
import p265s1.AbstractC7070e3;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7127q0;
import p265s1.AbstractC7138s1;
import p265s1.AbstractC7139s2;
import p265s1.AbstractC7168z0;
import p265s1.C7080g3;
import p265s1.C7128q1;
import p265s1.InterfaceC7134r2;
import p290u1.AbstractC8488g;
import p290u1.C8491j;
import p290u1.C8492k;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: e3.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2014i extends TextPaint {

    /* JADX INFO: renamed from: a */
    public InterfaceC7134r2 f5597a;

    /* JADX INFO: renamed from: b */
    public C2858k f5598b;

    /* JADX INFO: renamed from: c */
    public int f5599c;

    /* JADX INFO: renamed from: d */
    public C7080g3 f5600d;

    /* JADX INFO: renamed from: e */
    public C7128q1 f5601e;

    /* JADX INFO: renamed from: f */
    public AbstractC7078g1 f5602f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0564p5 f5603g;

    /* JADX INFO: renamed from: h */
    public C6461k f5604h;

    /* JADX INFO: renamed from: i */
    public AbstractC8488g f5605i;

    public C2014i(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.f5598b = C2858k.f7480b.m10239c();
        this.f5599c = InterfaceC8487f.f28340p.m32661a();
        this.f5600d = C7080g3.f23551d.m27892a();
    }

    /* JADX INFO: renamed from: a */
    public static Shader m7272a(AbstractC7078g1 abstractC7078g1, long j10) {
        return ((AbstractC7070e3) abstractC7078g1).mo27856b(j10);
    }

    /* JADX INFO: renamed from: b */
    public final void m7273b() {
        this.f5603g = null;
        this.f5602f = null;
        this.f5604h = null;
        setShader(null);
    }

    /* JADX INFO: renamed from: c */
    public final int m7274c() {
        return this.f5599c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC7134r2 m7275d() {
        InterfaceC7134r2 interfaceC7134r2 = this.f5597a;
        if (interfaceC7134r2 != null) {
            return interfaceC7134r2;
        }
        InterfaceC7134r2 interfaceC7134r2M28094b = AbstractC7127q0.m28094b(this);
        this.f5597a = interfaceC7134r2M28094b;
        return interfaceC7134r2M28094b;
    }

    /* JADX INFO: renamed from: e */
    public final void m7276e(int i10) {
        if (AbstractC7168z0.m28276E(i10, this.f5599c)) {
            return;
        }
        m7275d().mo28058c(i10);
        this.f5599c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7277f(final p265s1.AbstractC7078g1 r5, final long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.m7273b()
            return
        L6:
            boolean r0 = r5 instanceof p265s1.C7100k3
            if (r0 == 0) goto L18
            s1.k3 r5 = (p265s1.C7100k3) r5
            long r5 = r5.m27984b()
            long r5 = p104h3.AbstractC2860m.m10262c(r5, r8)
            r4.m7278g(r5)
            return
        L18:
            boolean r0 = r5 instanceof p265s1.AbstractC7070e3
            if (r0 == 0) goto L6e
            s1.g1 r0 = r4.f5602f
            boolean r0 = p024b9.AbstractC1061t.m3842c(r0, r5)
            r1 = 0
            if (r0 == 0) goto L35
            r1.k r0 = r4.f5604h
            if (r0 != 0) goto L2b
            r0 = r1
            goto L33
        L2b:
            long r2 = r0.m25625m()
            boolean r0 = p250r1.C6461k.m25618f(r2, r6)
        L33:
            if (r0 != 0) goto L54
        L35:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            if (r1 == 0) goto L54
            r4.f5602f = r5
            r1.k r0 = p250r1.C6461k.m25615c(r6)
            r4.f5604h = r0
            e3.h r0 = new e3.h
            r0.<init>()
            androidx.compose.runtime.p5 r5 = androidx.compose.runtime.AbstractC0473c5.m1565d(r0)
            r4.f5603g = r5
        L54:
            s1.r2 r5 = r4.m7275d()
            androidx.compose.runtime.p5 r6 = r4.f5603g
            r7 = 0
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L65
        L64:
            r6 = r7
        L65:
            r5.mo28067l(r6)
            r4.f5601e = r7
            p059e3.AbstractC2015j.m7282a(r4, r8)
            return
        L6e:
            p215oc.C5729x.m23182a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p059e3.C2014i.m7277f(s1.g1, long, float):void");
    }

    /* JADX INFO: renamed from: g */
    public final void m7278g(long j10) {
        C7128q1 c7128q1 = this.f5601e;
        if (c7128q1 == null ? false : C7128q1.m28131q(c7128q1.m28139y(), j10)) {
            return;
        }
        if (j10 != 16) {
            this.f5601e = C7128q1.m28125k(j10);
            setColor(AbstractC7138s1.m28205i(j10));
            m7273b();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7279h(AbstractC8488g abstractC8488g) {
        if (abstractC8488g == null || AbstractC1061t.m3842c(this.f5605i, abstractC8488g)) {
            return;
        }
        this.f5605i = abstractC8488g;
        if (AbstractC1061t.m3842c(abstractC8488g, C8491j.f28345a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC8488g instanceof C8492k)) {
            C5729x.m23182a();
            return;
        }
        m7275d().mo28075t(AbstractC7139s2.f23669a.m28211b());
        C8492k c8492k = (C8492k) abstractC8488g;
        m7275d().mo28078w(c8492k.m32670f());
        m7275d().mo28070o(c8492k.m32668d());
        m7275d().mo28074s(c8492k.m32667c());
        m7275d().mo28064i(c8492k.m32666b());
        InterfaceC7134r2 interfaceC7134r2M7275d = m7275d();
        c8492k.m32669e();
        interfaceC7134r2M7275d.mo28069n(null);
    }

    /* JADX INFO: renamed from: i */
    public final void m7280i(C7080g3 c7080g3) {
        if (c7080g3 == null || AbstractC1061t.m3842c(this.f5600d, c7080g3)) {
            return;
        }
        this.f5600d = c7080g3;
        if (AbstractC1061t.m3842c(c7080g3, C7080g3.f23551d.m27892a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(AbstractC2285e.m8331b(this.f5600d.m27889b()), Float.intBitsToFloat((int) (this.f5600d.m27891d() >> 32)), Float.intBitsToFloat((int) (this.f5600d.m27891d() & 4294967295L)), AbstractC7138s1.m28205i(this.f5600d.m27890c()));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7281j(C2858k c2858k) {
        if (c2858k == null || AbstractC1061t.m3842c(this.f5598b, c2858k)) {
            return;
        }
        this.f5598b = c2858k;
        C2858k.a aVar = C2858k.f7480b;
        setUnderlineText(c2858k.m10235d(aVar.m10240d()));
        setStrikeThruText(this.f5598b.m10235d(aVar.m10238b()));
    }
}
