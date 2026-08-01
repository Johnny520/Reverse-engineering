package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: z3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0953z3 {

    /* JADX INFO: renamed from: a */
    public int f5446a;

    /* JADX INFO: renamed from: b */
    public final Object f5447b;

    /* JADX INFO: renamed from: c */
    public Object f5448c;

    public C0953z3(ImageView imageView) {
        this.f5446a = 0;
        this.f5447b = imageView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        r16 = (int[]) r0.f1363b;
        r17 = (float[]) r0.f1364c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f1363b, (float[]) r0.f1364c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0237, code lost:
    
        r20 = (int[]) r0.f1363b;
        r21 = (float[]) r0.f1364c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0268, code lost:
    
        return new p000.C0953z3(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new p000.C0138d4(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new p000.C0138d4(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new p000.C0138d4(r6, r12);
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.C0953z3 m2752b(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0953z3.m2752b(android.content.res.Resources, int, android.content.res.Resources$Theme):z3");
    }

    /* JADX INFO: renamed from: a */
    public void m2753a() {
        y60 y60Var;
        ImageView imageView = (ImageView) this.f5447b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0187eh.m1027a(drawable);
        }
        if (drawable == null || (y60Var = (y60) this.f5448c) == null) {
            return;
        }
        C0768u3.m2407e(drawable, y60Var, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: c */
    public boolean m2754c() {
        ColorStateList colorStateList;
        return ((Shader) this.f5447b) == null && (colorStateList = (ColorStateList) this.f5448c) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: d */
    public void m2755d(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f5447b;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0910xy.f5222f;
        C0659r5 c0659r5M2219y = C0659r5.m2219y(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
        ja0.m1574k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0659r5M2219y.f4209b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0222ff.m1196r(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0187eh.m1027a(drawable);
            }
            if (typedArray.hasValue(2)) {
                AbstractC0752to.m2384c(imageView, c0659r5M2219y.m2233l(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0752to.m2385d(imageView, AbstractC0187eh.m1028b(typedArray.getInt(3, -1), null));
            }
            c0659r5M2219y.m2245z();
        } catch (Throwable th) {
            c0659r5M2219y.m2245z();
            throw th;
        }
    }

    public C0953z3(Shader shader, ColorStateList colorStateList, int i) {
        this.f5447b = shader;
        this.f5448c = colorStateList;
        this.f5446a = i;
    }
}
