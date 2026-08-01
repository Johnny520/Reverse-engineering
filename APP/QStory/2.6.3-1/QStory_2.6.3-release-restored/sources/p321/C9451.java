package p321;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.shape.StateListSizeChange$SizeChangeType;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p246.C8878;
import p330.AbstractC9490;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8878[] f24560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[][] f24561;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8878 f24562;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f24563;

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14866(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = AbstractC9490.f24765;
                boolean z = false;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                if (typedValuePeekValue != null) {
                    int i = typedValuePeekValue.type;
                    C9445 c9445 = i == 5 ? new C9445(StateListSizeChange$SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics())) : i == 6 ? new C9445(StateListSizeChange$SizeChangeType.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f)) : null;
                    typedArrayObtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i2 = 0;
                    for (int i3 = 0; i3 < attributeCount; i3++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                        if (attributeNameResource != C0328R.attr.widthChange) {
                            int i4 = i2 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i2] = attributeNameResource;
                            i2 = i4;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i2);
                    C8878 c8878 = new C8878(12, z);
                    c8878.f22564 = c9445;
                    int i5 = this.f24563;
                    if (i5 == 0 || iArrTrimStateSet.length == 0) {
                        this.f24562 = c8878;
                    }
                    int[][] iArr3 = this.f24561;
                    if (i5 >= iArr3.length) {
                        int i6 = i5 + 10;
                        int[][] iArr4 = new int[i6][];
                        System.arraycopy(iArr3, 0, iArr4, 0, i5);
                        this.f24561 = iArr4;
                        C8878[] c8878Arr = new C8878[i6];
                        System.arraycopy(this.f24560, 0, c8878Arr, 0, i5);
                        this.f24560 = c8878Arr;
                    }
                    int[][] iArr5 = this.f24561;
                    int i7 = this.f24563;
                    iArr5[i7] = iArrTrimStateSet;
                    this.f24560[i7] = c8878;
                    this.f24563 = i7 + 1;
                }
            }
        }
    }
}
