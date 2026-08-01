package p141c1;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p000A.C0099z;
import p095T.AbstractC1385s;
import p095T.C1311F;
import p095T.C1366i0;
import p130a1.AbstractC1796i;
import p204n0.C2686e;
import p211o0.AbstractC2736K;

/* JADX INFO: renamed from: c1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1889b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: d */
    public final AbstractC2736K f6414d;

    /* JADX INFO: renamed from: e */
    public final float f6415e;

    /* JADX INFO: renamed from: f */
    public final C1366i0 f6416f = AbstractC1385s.m2629s(new C2686e(9205357640488583168L));

    /* JADX INFO: renamed from: g */
    public final C1311F f6417g = AbstractC1385s.m2624n(new C0099z(16, this));

    public C1889b(AbstractC2736K abstractC2736K, float f2) {
        this.f6414d = abstractC2736K;
        this.f6415e = f2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC1796i.m3269c(textPaint, this.f6415e);
        textPaint.setShader((Shader) this.f6417g.getValue());
    }
}
