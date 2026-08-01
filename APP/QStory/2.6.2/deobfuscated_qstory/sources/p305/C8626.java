package p305;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.davemorrissey.labs.subscaleview.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p314.AbstractC8669;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8626 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC8633 f24213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f24214;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[][] f24212 = new int[10][];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC8633[] f24211 = new InterfaceC8633[10];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C8626 m14279(InterfaceC8633 interfaceC8633) {
        C8626 c8626 = new C8626();
        c8626.m14282(StateSet.WILD_CARD, interfaceC8633);
        return c8626;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14280(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = AbstractC8669.f24420;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                InterfaceC8633 interfaceC8633M14304 = C8648.m14304(typedArrayObtainAttributes, 5, new C8636(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                m14282(StateSet.trimStateSet(iArr2, i), interfaceC8633M14304);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8633 m14281(int[] iArr) {
        int i;
        int[][] iArr2 = this.f24212;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.f24214) {
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
            int[][] iArr4 = this.f24212;
            while (true) {
                if (i2 >= this.f24214) {
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
        return i3 < 0 ? this.f24213 : this.f24211[i3];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14282(int[] iArr, InterfaceC8633 interfaceC8633) {
        int i = this.f24214;
        if (i == 0 || iArr.length == 0) {
            this.f24213 = interfaceC8633;
        }
        int[][] iArr2 = this.f24212;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f24212 = iArr3;
            InterfaceC8633[] interfaceC8633Arr = new InterfaceC8633[i2];
            System.arraycopy(this.f24211, 0, interfaceC8633Arr, 0, i);
            this.f24211 = interfaceC8633Arr;
        }
        int[][] iArr4 = this.f24212;
        int i3 = this.f24214;
        iArr4[i3] = iArr;
        this.f24211[i3] = interfaceC8633;
        this.f24214 = i3 + 1;
    }
}
