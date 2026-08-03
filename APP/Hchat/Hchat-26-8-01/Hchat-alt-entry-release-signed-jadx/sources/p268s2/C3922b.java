package p268s2;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p057e1.C0810e;
import p071f1.AbstractC1022p0;
import p116i.C1746e0;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p117i0.C1892x;
import p237q2.AbstractC3436j;

/* JADX INFO: renamed from: s2.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3922b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: g */
    public final AbstractC1022p0 f12874g;

    /* JADX INFO: renamed from: h */
    public final float f12875h;

    /* JADX INFO: renamed from: i */
    public final C1845j1 f12876i = AbstractC1874r.m4639u(new C0810e(9205357640488583168L));

    /* JADX INFO: renamed from: j */
    public final C1892x f12877j = AbstractC1874r.m4634p(new C1746e0(this, 18));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3922b(AbstractC1022p0 abstractC1022p0, float f3) {
        this.f12874g = abstractC1022p0;
        this.f12875h = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC3436j.m7211c(textPaint, this.f12875h);
        textPaint.setShader((Shader) this.f12877j.getValue());
    }
}
