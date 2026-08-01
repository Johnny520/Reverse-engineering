package p092g3;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0564p5;
import p010a9.InterfaceC0173a;
import p059e3.AbstractC2015j;
import p250r1.C6461k;
import p265s1.AbstractC7070e3;

/* JADX INFO: renamed from: g3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2515d extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: q */
    public final AbstractC7070e3 f6785q;

    /* JADX INFO: renamed from: r */
    public final float f6786r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0512i2 f6787s = AbstractC0522j5.m1773e(C6461k.m25615c(C6461k.f20335b.m25626a()), null, 2, null);

    /* JADX INFO: renamed from: t */
    public final InterfaceC0564p5 f6788t = AbstractC0473c5.m1565d(new InterfaceC0173a() { // from class: g3.c
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return C2515d.m9021a(this.f6784q);
        }
    });

    public C2515d(AbstractC7070e3 abstractC7070e3, float f10) {
        this.f6785q = abstractC7070e3;
        this.f6786r = f10;
    }

    /* JADX INFO: renamed from: a */
    public static Shader m9021a(C2515d c2515d) {
        if (c2515d.m9022b() == 9205357640488583168L || C6461k.m25623k(c2515d.m9022b())) {
            return null;
        }
        return c2515d.f6785q.mo27856b(c2515d.m9022b());
    }

    /* JADX INFO: renamed from: b */
    public final long m9022b() {
        return ((C6461k) this.f6787s.getValue()).m25625m();
    }

    /* JADX INFO: renamed from: c */
    public final void m9023c(long j10) {
        this.f6787s.setValue(C6461k.m25615c(j10));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AbstractC2015j.m7282a(textPaint, this.f6786r);
        textPaint.setShader((Shader) this.f6788t.getValue());
    }
}
