package Yue;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4196 {
    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ <T> T m1157(Context context) {
        C5499.m17112(4, C4750.f10502);
        return (T) C4187.m12072(context, Object.class);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m1158(@InterfaceC6399 Context context, @InterfaceC7651 int i, @InterfaceC6399 int[] iArr, @InterfaceC6399 InterfaceC5124<? super TypedArray, C8107> interfaceC5124) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        interfaceC5124.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m12086(@InterfaceC6399 Context context, @InterfaceC6489 AttributeSet attributeSet, @InterfaceC6399 int[] iArr, @InterfaceC3451 int i, @InterfaceC7651 int i2, @InterfaceC6399 InterfaceC5124<? super TypedArray, C8107> interfaceC5124) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        interfaceC5124.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m12087(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, InterfaceC5124 interfaceC5124, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        interfaceC5124.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
