package p305;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p033.AbstractC6325;
import p053.AbstractC6560;
import p314.AbstractC8669;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8648 implements InterfaceC8643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C8631 f24283;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C8631 f24284;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8631 f24285;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C8631 f24286;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC6325 f24280 = new C8644();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC6325 f24279 = new C8644();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC6325 f24278 = new C8644();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC6325 f24277 = new C8644();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC8633 f24276 = new C8636(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC8633 f24275 = new C8636(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC8633 f24282 = new C8636(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC8633 f24281 = new C8636(0.0f);

    public C8648() {
        int i = 0;
        this.f24285 = new C8631(i);
        this.f24286 = new C8631(i);
        this.f24283 = new C8631(i);
        this.f24284 = new C8631(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C8647 m14302(TypedArray typedArray, C8636 c8636) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            InterfaceC8633 interfaceC8633M14304 = m14304(typedArray, 5, c8636);
            InterfaceC8633 interfaceC8633M143042 = m14304(typedArray, 8, interfaceC8633M14304);
            InterfaceC8633 interfaceC8633M143043 = m14304(typedArray, 9, interfaceC8633M14304);
            InterfaceC8633 interfaceC8633M143044 = m14304(typedArray, 7, interfaceC8633M14304);
            InterfaceC8633 interfaceC8633M143045 = m14304(typedArray, 6, interfaceC8633M14304);
            C8647 c8647 = new C8647();
            c8647.f24268 = AbstractC6560.m12030(i2);
            c8647.f24264 = interfaceC8633M143042;
            c8647.f24267 = AbstractC6560.m12030(i3);
            c8647.f24263 = interfaceC8633M143043;
            c8647.f24266 = AbstractC6560.m12030(i4);
            c8647.f24270 = interfaceC8633M143044;
            c8647.f24265 = AbstractC6560.m12030(i5);
            c8647.f24269 = interfaceC8633M143045;
            return c8647;
        } finally {
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C8647 m14303(Context context, AttributeSet attributeSet, int i, int i2) {
        C8636 c8636 = new C8636(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8669.f24440, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return m14302(contextThemeWrapper.obtainStyledAttributes(AbstractC8669.f24420), c8636);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC8633 m14304(TypedArray typedArray, int i, InterfaceC8633 interfaceC8633) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C8636(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C8652(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC8633;
    }

    public final String toString() {
        return "[" + this.f24276 + ", " + this.f24275 + ", " + this.f24282 + ", " + this.f24281 + "]";
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo14271() {
        return false;
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8648 mo14272(C8652 c8652) {
        C8647 c8647M14305 = m14305();
        c8647M14305.f24264 = c8652;
        c8647M14305.f24263 = c8652;
        c8647M14305.f24270 = c8652;
        c8647M14305.f24269 = c8652;
        return c8647M14305.m14301();
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C8648[] mo14274() {
        return new C8648[]{this};
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8648 mo14276(float f) {
        C8647 c8647M14305 = m14305();
        c8647M14305.m14300(f);
        return c8647M14305.m14301();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C8647 m14305() {
        C8647 c8647 = new C8647();
        c8647.f24268 = this.f24280;
        c8647.f24267 = this.f24279;
        c8647.f24266 = this.f24278;
        c8647.f24265 = this.f24277;
        c8647.f24264 = this.f24276;
        c8647.f24263 = this.f24275;
        c8647.f24270 = this.f24282;
        c8647.f24269 = this.f24281;
        c8647.f24273 = this.f24285;
        c8647.f24274 = this.f24286;
        c8647.f24271 = this.f24283;
        c8647.f24272 = this.f24284;
        return c8647;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m14306(RectF rectF) {
        boolean z = this.f24284.getClass().equals(C8631.class) && this.f24286.getClass().equals(C8631.class) && this.f24285.getClass().equals(C8631.class) && this.f24283.getClass().equals(C8631.class);
        float fMo14294 = this.f24276.mo14294(rectF);
        return z && ((this.f24275.mo14294(rectF) > fMo14294 ? 1 : (this.f24275.mo14294(rectF) == fMo14294 ? 0 : -1)) == 0 && (this.f24281.mo14294(rectF) > fMo14294 ? 1 : (this.f24281.mo14294(rectF) == fMo14294 ? 0 : -1)) == 0 && (this.f24282.mo14294(rectF) > fMo14294 ? 1 : (this.f24282.mo14294(rectF) == fMo14294 ? 0 : -1)) == 0) && (this.f24279 instanceof C8644) && (this.f24280 instanceof C8644) && (this.f24278 instanceof C8644) && (this.f24277 instanceof C8644);
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C8648 mo14273() {
        return this;
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8648 mo14275(int[] iArr) {
        return this;
    }
}
