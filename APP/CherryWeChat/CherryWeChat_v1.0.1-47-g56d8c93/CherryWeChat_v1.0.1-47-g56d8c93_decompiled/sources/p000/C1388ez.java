package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import io.github.cherrywechat.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ez */
/* JADX INFO: loaded from: classes.dex */
public final class C1388ez {

    /* JADX INFO: renamed from: a */
    public int f4936a;

    /* JADX INFO: renamed from: b */
    public C1017Xm f4937b;

    /* JADX INFO: renamed from: c */
    public int[][] f4938c;

    /* JADX INFO: renamed from: d */
    public C1017Xm[] f4939d;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2671a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = AbstractC0939Vu.f2928B;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                if (typedValuePeekValue != null) {
                    int i = typedValuePeekValue.type;
                    C1344dz c1344dz = i == 5 ? new C1344dz(2, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics())) : i == 6 ? new C1344dz(1, typedValuePeekValue.getFraction(1.0f, 1.0f)) : null;
                    typedArrayObtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i2 = 0;
                    for (int i3 = 0; i3 < attributeCount; i3++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                        if (attributeNameResource != R.attr.widthChange) {
                            int i4 = i2 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i2] = attributeNameResource;
                            i2 = i4;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i2);
                    C1017Xm c1017Xm = new C1017Xm(14, false);
                    c1017Xm.f3226b = c1344dz;
                    int i5 = this.f4936a;
                    if (i5 == 0 || iArrTrimStateSet.length == 0) {
                        this.f4937b = c1017Xm;
                    }
                    int[][] iArr3 = this.f4938c;
                    if (i5 >= iArr3.length) {
                        int i6 = i5 + 10;
                        int[][] iArr4 = new int[i6][];
                        System.arraycopy(iArr3, 0, iArr4, 0, i5);
                        this.f4938c = iArr4;
                        C1017Xm[] c1017XmArr = new C1017Xm[i6];
                        System.arraycopy(this.f4939d, 0, c1017XmArr, 0, i5);
                        this.f4939d = c1017XmArr;
                    }
                    int[][] iArr5 = this.f4938c;
                    int i7 = this.f4936a;
                    iArr5[i7] = iArrTrimStateSet;
                    this.f4939d[i7] = c1017Xm;
                    this.f4936a = i7 + 1;
                }
            }
        }
    }
}
