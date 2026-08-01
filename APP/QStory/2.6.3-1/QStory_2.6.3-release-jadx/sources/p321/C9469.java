package p321;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p034.AbstractC7082;
import p050.AbstractC7173;
import p330.AbstractC9490;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9469 implements InterfaceC9464 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C9452 f24619;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C9452 f24620;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C9452 f24621;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C9452 f24622;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC7082 f24616 = new C9465();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC7082 f24615 = new C9465();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC7082 f24614 = new C9465();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC7082 f24613 = new C9465();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC9454 f24612 = new C9457(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC9454 f24611 = new C9457(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC9454 f24618 = new C9457(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC9454 f24617 = new C9457(0.0f);

    public C9469() {
        int i = 0;
        this.f24621 = new C9452(i);
        this.f24622 = new C9452(i);
        this.f24619 = new C9452(i);
        this.f24620 = new C9452(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C9468 m14879(TypedArray typedArray, C9457 c9457) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            InterfaceC9454 interfaceC9454M14881 = m14881(typedArray, 5, c9457);
            InterfaceC9454 interfaceC9454M148812 = m14881(typedArray, 8, interfaceC9454M14881);
            InterfaceC9454 interfaceC9454M148813 = m14881(typedArray, 9, interfaceC9454M14881);
            InterfaceC9454 interfaceC9454M148814 = m14881(typedArray, 7, interfaceC9454M14881);
            InterfaceC9454 interfaceC9454M148815 = m14881(typedArray, 6, interfaceC9454M14881);
            C9468 c9468 = new C9468();
            c9468.f24604 = AbstractC7173.m12449(i2);
            c9468.f24600 = interfaceC9454M148812;
            c9468.f24603 = AbstractC7173.m12449(i3);
            c9468.f24599 = interfaceC9454M148813;
            c9468.f24602 = AbstractC7173.m12449(i4);
            c9468.f24606 = interfaceC9454M148814;
            c9468.f24601 = AbstractC7173.m12449(i5);
            c9468.f24605 = interfaceC9454M148815;
            return c9468;
        } finally {
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C9468 m14880(Context context, AttributeSet attributeSet, int i, int i2) {
        C9457 c9457 = new C9457(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9490.f24776, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return m14879(contextThemeWrapper.obtainStyledAttributes(AbstractC9490.f24756), c9457);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC9454 m14881(TypedArray typedArray, int i, InterfaceC9454 interfaceC9454) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C9457(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C9473(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC9454;
    }

    public final String toString() {
        return "[" + this.f24612 + ", " + this.f24611 + ", " + this.f24618 + ", " + this.f24617 + "]";
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo14849() {
        return false;
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C9469 mo14850(C9473 c9473) {
        C9468 c9468M14882 = m14882();
        c9468M14882.f24600 = c9473;
        c9468M14882.f24599 = c9473;
        c9468M14882.f24606 = c9473;
        c9468M14882.f24605 = c9473;
        return c9468M14882.m14878();
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C9469[] mo14852() {
        return new C9469[]{this};
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C9469 mo14854(float f) {
        C9468 c9468M14882 = m14882();
        c9468M14882.m14877(f);
        return c9468M14882.m14878();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C9468 m14882() {
        C9468 c9468 = new C9468();
        c9468.f24604 = this.f24616;
        c9468.f24603 = this.f24615;
        c9468.f24602 = this.f24614;
        c9468.f24601 = this.f24613;
        c9468.f24600 = this.f24612;
        c9468.f24599 = this.f24611;
        c9468.f24606 = this.f24618;
        c9468.f24605 = this.f24617;
        c9468.f24609 = this.f24621;
        c9468.f24610 = this.f24622;
        c9468.f24607 = this.f24619;
        c9468.f24608 = this.f24620;
        return c9468;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m14883(RectF rectF) {
        boolean z = this.f24620.getClass().equals(C9452.class) && this.f24622.getClass().equals(C9452.class) && this.f24621.getClass().equals(C9452.class) && this.f24619.getClass().equals(C9452.class);
        float fMo14871 = this.f24612.mo14871(rectF);
        return z && ((this.f24611.mo14871(rectF) > fMo14871 ? 1 : (this.f24611.mo14871(rectF) == fMo14871 ? 0 : -1)) == 0 && (this.f24617.mo14871(rectF) > fMo14871 ? 1 : (this.f24617.mo14871(rectF) == fMo14871 ? 0 : -1)) == 0 && (this.f24618.mo14871(rectF) > fMo14871 ? 1 : (this.f24618.mo14871(rectF) == fMo14871 ? 0 : -1)) == 0) && (this.f24615 instanceof C9465) && (this.f24616 instanceof C9465) && (this.f24614 instanceof C9465) && (this.f24613 instanceof C9465);
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C9469 mo14851() {
        return this;
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C9469 mo14853(int[] iArr) {
        return this;
    }
}
