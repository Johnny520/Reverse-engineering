package p305;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.davemorrissey.labs.subscaleview.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import p015.C6221;
import p314.AbstractC8669;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8625 implements InterfaceC8643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8626 f24203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8626 f24204;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8648[] f24205;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int[][] f24206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8648 f24207;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24208;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8626 f24209;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8626 f24210;

    public C8625(C6221 c6221) {
        this.f24208 = c6221.f17113;
        this.f24207 = (C8648) c6221.f17112;
        this.f24206 = (int[][]) c6221.f17111;
        this.f24205 = (C8648[]) c6221.f17110;
        this.f24204 = (C8626) c6221.f17109;
        this.f24203 = (C8626) c6221.f17116;
        this.f24210 = (C8626) c6221.f17115;
        this.f24209 = (C8626) c6221.f17117;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C8625 m14269(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        C6221 c6221 = new C6221(1);
        c6221.m11661();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            c6221.m11661();
        }
        try {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                m14270(c6221, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            return c6221.m11663();
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m14270(C6221 c6221, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = AbstractC8669.f24440;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                C8636 c8636 = new C8636(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                C8648 c8648M14301 = C8648.m14302(contextThemeWrapper.obtainStyledAttributes(AbstractC8669.f24420), c8636).m14301();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                c6221.m11665(StateSet.trimStateSet(iArr2, i), c8648M14301);
            }
        }
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo14271() {
        C8626 c8626;
        C8626 c86262;
        C8626 c86263;
        C8626 c86264;
        return this.f24208 > 1 || ((c8626 = this.f24204) != null && c8626.f24214 > 1) || (((c86262 = this.f24203) != null && c86262.f24214 > 1) || (((c86263 = this.f24210) != null && c86263.f24214 > 1) || ((c86264 = this.f24209) != null && c86264.f24214 > 1)));
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8648 mo14272(C8652 c8652) {
        return m14277().mo14272(c8652);
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8648 mo14273() {
        return m14277();
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8648[] mo14274() {
        return this.f24205;
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8648 mo14275(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.f24208;
            iArr2 = this.f24206;
            if (i4 >= i2) {
                i4 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i3], iArr3)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i4 = i;
        }
        C8648[] c8648Arr = this.f24205;
        C8626 c8626 = this.f24209;
        C8626 c86262 = this.f24210;
        C8626 c86263 = this.f24203;
        C8626 c86264 = this.f24204;
        if (c86264 == null && c86263 == null && c86262 == null && c8626 == null) {
            return c8648Arr[i4];
        }
        C8647 c8647M14305 = c8648Arr[i4].m14305();
        if (c86264 != null) {
            c8647M14305.f24264 = c86264.m14281(iArr);
        }
        if (c86263 != null) {
            c8647M14305.f24263 = c86263.m14281(iArr);
        }
        if (c86262 != null) {
            c8647M14305.f24269 = c86262.m14281(iArr);
        }
        if (c8626 != null) {
            c8647M14305.f24270 = c8626.m14281(iArr);
        }
        return c8647M14305.m14301();
    }

    @Override // p305.InterfaceC8643
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8648 mo14276(float f) {
        return m14277().mo14276(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8648 m14277() {
        C8648 c8648 = this.f24207;
        C8626 c8626 = this.f24209;
        C8626 c86262 = this.f24210;
        C8626 c86263 = this.f24203;
        C8626 c86264 = this.f24204;
        if (c86264 == null && c86263 == null && c86262 == null && c8626 == null) {
            return c8648;
        }
        C8647 c8647M14305 = c8648.m14305();
        if (c86264 != null) {
            c8647M14305.f24264 = c86264.f24213;
        }
        if (c86263 != null) {
            c8647M14305.f24263 = c86263.f24213;
        }
        if (c86262 != null) {
            c8647M14305.f24269 = c86262.f24213;
        }
        if (c8626 != null) {
            c8647M14305.f24270 = c8626.f24213;
        }
        return c8647M14305.m14301();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Serializable, 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世[]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6221 m14278() {
        C6221 c6221 = new C6221(1);
        int i = this.f24208;
        c6221.f17113 = i;
        c6221.f17112 = this.f24207;
        int[][] iArr = this.f24206;
        ?? r3 = new int[iArr.length][];
        c6221.f17111 = r3;
        C8648[] c8648Arr = this.f24205;
        c6221.f17110 = new C8648[c8648Arr.length];
        System.arraycopy(iArr, 0, r3, 0, i);
        System.arraycopy(c8648Arr, 0, (C8648[]) c6221.f17110, 0, c6221.f17113);
        c6221.f17109 = this.f24204;
        c6221.f17116 = this.f24203;
        c6221.f17115 = this.f24210;
        c6221.f17117 = this.f24209;
        return c6221;
    }
}
