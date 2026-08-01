package p321;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p330.AbstractC9490;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9447 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC9454 f24549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f24550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[][] f24548 = new int[10][];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC9454[] f24547 = new InterfaceC9454[10];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C9447 m14857(InterfaceC9454 interfaceC9454) {
        C9447 c9447 = new C9447();
        c9447.m14860(StateSet.WILD_CARD, interfaceC9454);
        return c9447;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14858(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = AbstractC9490.f24756;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                InterfaceC9454 interfaceC9454M14881 = C9469.m14881(typedArrayObtainAttributes, 5, new C9457(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != C0328R.attr.cornerSize) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                m14860(StateSet.trimStateSet(iArr2, i), interfaceC9454M14881);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC9454 m14859(int[] iArr) {
        int i;
        int[][] iArr2 = this.f24548;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.f24550) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f24548;
            while (true) {
                if (i2 >= this.f24550) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            i3 = i;
        }
        return i3 < 0 ? this.f24549 : this.f24547[i3];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14860(int[] iArr, InterfaceC9454 interfaceC9454) {
        int i = this.f24550;
        if (i == 0 || iArr.length == 0) {
            this.f24549 = interfaceC9454;
        }
        int[][] iArr2 = this.f24548;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f24548 = iArr3;
            InterfaceC9454[] interfaceC9454Arr = new InterfaceC9454[i2];
            System.arraycopy(this.f24547, 0, interfaceC9454Arr, 0, i);
            this.f24547 = interfaceC9454Arr;
        }
        int[][] iArr4 = this.f24548;
        int i3 = this.f24550;
        iArr4[i3] = iArr;
        this.f24547[i3] = interfaceC9454;
        this.f24550 = i3 + 1;
    }
}
