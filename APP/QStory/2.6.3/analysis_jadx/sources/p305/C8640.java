package p305;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p018.AbstractC6253;
import p034.AbstractC6344;
import p314.AbstractC8661;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8640 implements InterfaceC8635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C8623 f24274;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C8623 f24275;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8623 f24276;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C8623 f24277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC6253 f24271 = new C8636();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC6253 f24270 = new C8636();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC6253 f24269 = new C8636();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC6253 f24268 = new C8636();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC8625 f24267 = new C8628(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC8625 f24266 = new C8628(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC8625 f24273 = new C8628(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC8625 f24272 = new C8628(0.0f);

    public C8640() {
        int i = 0;
        this.f24276 = new C8623(i);
        this.f24277 = new C8623(i);
        this.f24274 = new C8623(i);
        this.f24275 = new C8623(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C8639 m14320(TypedArray typedArray, C8628 c8628) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            InterfaceC8625 interfaceC8625M14322 = m14322(typedArray, 5, c8628);
            InterfaceC8625 interfaceC8625M143222 = m14322(typedArray, 8, interfaceC8625M14322);
            InterfaceC8625 interfaceC8625M143223 = m14322(typedArray, 9, interfaceC8625M14322);
            InterfaceC8625 interfaceC8625M143224 = m14322(typedArray, 7, interfaceC8625M14322);
            InterfaceC8625 interfaceC8625M143225 = m14322(typedArray, 6, interfaceC8625M14322);
            C8639 c8639 = new C8639();
            c8639.f24259 = AbstractC6344.m11890(i2);
            c8639.f24255 = interfaceC8625M143222;
            c8639.f24258 = AbstractC6344.m11890(i3);
            c8639.f24254 = interfaceC8625M143223;
            c8639.f24257 = AbstractC6344.m11890(i4);
            c8639.f24261 = interfaceC8625M143224;
            c8639.f24256 = AbstractC6344.m11890(i5);
            c8639.f24260 = interfaceC8625M143225;
            return c8639;
        } finally {
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C8639 m14321(Context context, AttributeSet attributeSet, int i, int i2) {
        C8628 c8628 = new C8628(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8661.f24431, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return m14320(contextThemeWrapper.obtainStyledAttributes(AbstractC8661.f24411), c8628);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC8625 m14322(TypedArray typedArray, int i, InterfaceC8625 interfaceC8625) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C8628(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C8644(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC8625;
    }

    public final String toString() {
        return "[" + this.f24267 + ", " + this.f24266 + ", " + this.f24273 + ", " + this.f24272 + "]";
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo14290() {
        return false;
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8640 mo14291(C8644 c8644) {
        C8639 c8639M14323 = m14323();
        c8639M14323.f24255 = c8644;
        c8639M14323.f24254 = c8644;
        c8639M14323.f24261 = c8644;
        c8639M14323.f24260 = c8644;
        return c8639M14323.m14319();
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C8640[] mo14293() {
        return new C8640[]{this};
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8640 mo14295(float f) {
        C8639 c8639M14323 = m14323();
        c8639M14323.m14318(f);
        return c8639M14323.m14319();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C8639 m14323() {
        C8639 c8639 = new C8639();
        c8639.f24259 = this.f24271;
        c8639.f24258 = this.f24270;
        c8639.f24257 = this.f24269;
        c8639.f24256 = this.f24268;
        c8639.f24255 = this.f24267;
        c8639.f24254 = this.f24266;
        c8639.f24261 = this.f24273;
        c8639.f24260 = this.f24272;
        c8639.f24264 = this.f24276;
        c8639.f24265 = this.f24277;
        c8639.f24262 = this.f24274;
        c8639.f24263 = this.f24275;
        return c8639;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m14324(RectF rectF) {
        boolean z = this.f24275.getClass().equals(C8623.class) && this.f24277.getClass().equals(C8623.class) && this.f24276.getClass().equals(C8623.class) && this.f24274.getClass().equals(C8623.class);
        float fMo14312 = this.f24267.mo14312(rectF);
        return z && ((this.f24266.mo14312(rectF) > fMo14312 ? 1 : (this.f24266.mo14312(rectF) == fMo14312 ? 0 : -1)) == 0 && (this.f24272.mo14312(rectF) > fMo14312 ? 1 : (this.f24272.mo14312(rectF) == fMo14312 ? 0 : -1)) == 0 && (this.f24273.mo14312(rectF) > fMo14312 ? 1 : (this.f24273.mo14312(rectF) == fMo14312 ? 0 : -1)) == 0) && (this.f24270 instanceof C8636) && (this.f24271 instanceof C8636) && (this.f24269 instanceof C8636) && (this.f24268 instanceof C8636);
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C8640 mo14292() {
        return this;
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8640 mo14294(int[] iArr) {
        return this;
    }
}
