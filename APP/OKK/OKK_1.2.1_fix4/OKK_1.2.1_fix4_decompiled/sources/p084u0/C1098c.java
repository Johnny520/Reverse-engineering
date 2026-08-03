package p084u0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p056f0.AbstractC0805P;

/* JADX INFO: renamed from: u0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1098c extends AbstractC0805P {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f4229b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextPaint f4230c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0805P f4231d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1099d f4232e;

    public C1098c(C1099d c1099d, Context context, TextPaint textPaint, AbstractC0805P abstractC0805P) {
        this.f4232e = c1099d;
        this.f4229b = context;
        this.f4230c = textPaint;
        this.f4231d = abstractC0805P;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: M */
    public final void mo2059M(int i2) {
        this.f4231d.mo2059M(i2);
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: N */
    public final void mo2060N(Typeface typeface, boolean z2) {
        this.f4232e.m2591g(this.f4229b, this.f4230c, typeface);
        this.f4231d.mo2060N(typeface, z2);
    }
}
