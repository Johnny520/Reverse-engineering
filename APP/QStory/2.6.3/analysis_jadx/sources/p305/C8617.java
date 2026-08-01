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
import p007.C6148;
import p314.AbstractC8661;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8617 implements InterfaceC8635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8618 f24194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8618 f24195;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8640[] f24196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int[][] f24197;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8640 f24198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24199;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8618 f24200;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8618 f24201;

    public C8617(C6148 c6148) {
        this.f24199 = c6148.f16874;
        this.f24198 = (C8640) c6148.f16873;
        this.f24197 = (int[][]) c6148.f16872;
        this.f24196 = (C8640[]) c6148.f16871;
        this.f24195 = (C8618) c6148.f16870;
        this.f24194 = (C8618) c6148.f16877;
        this.f24201 = (C8618) c6148.f16876;
        this.f24200 = (C8618) c6148.f16878;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C8617 m14288(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        C6148 c6148 = new C6148(1);
        c6148.m11532();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            c6148.m11532();
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
                m14289(c6148, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            return c6148.m11534();
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
    public static void m14289(C6148 c6148, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = AbstractC8661.f24431;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                C8628 c8628 = new C8628(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                C8640 c8640M14319 = C8640.m14320(contextThemeWrapper.obtainStyledAttributes(AbstractC8661.f24411), c8628).m14319();
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
                c6148.m11536(StateSet.trimStateSet(iArr2, i), c8640M14319);
            }
        }
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo14290() {
        C8618 c8618;
        C8618 c86182;
        C8618 c86183;
        C8618 c86184;
        return this.f24199 > 1 || ((c8618 = this.f24195) != null && c8618.f24205 > 1) || (((c86182 = this.f24194) != null && c86182.f24205 > 1) || (((c86183 = this.f24201) != null && c86183.f24205 > 1) || ((c86184 = this.f24200) != null && c86184.f24205 > 1)));
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8640 mo14291(C8644 c8644) {
        return m14296().mo14291(c8644);
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8640 mo14292() {
        return m14296();
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8640[] mo14293() {
        return this.f24196;
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8640 mo14294(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.f24199;
            iArr2 = this.f24197;
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
        C8640[] c8640Arr = this.f24196;
        C8618 c8618 = this.f24200;
        C8618 c86182 = this.f24201;
        C8618 c86183 = this.f24194;
        C8618 c86184 = this.f24195;
        if (c86184 == null && c86183 == null && c86182 == null && c8618 == null) {
            return c8640Arr[i4];
        }
        C8639 c8639M14323 = c8640Arr[i4].m14323();
        if (c86184 != null) {
            c8639M14323.f24255 = c86184.m14300(iArr);
        }
        if (c86183 != null) {
            c8639M14323.f24254 = c86183.m14300(iArr);
        }
        if (c86182 != null) {
            c8639M14323.f24260 = c86182.m14300(iArr);
        }
        if (c8618 != null) {
            c8639M14323.f24261 = c8618.m14300(iArr);
        }
        return c8639M14323.m14319();
    }

    @Override // p305.InterfaceC8635
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8640 mo14295(float f) {
        return m14296().mo14295(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8640 m14296() {
        C8640 c8640 = this.f24198;
        C8618 c8618 = this.f24200;
        C8618 c86182 = this.f24201;
        C8618 c86183 = this.f24194;
        C8618 c86184 = this.f24195;
        if (c86184 == null && c86183 == null && c86182 == null && c8618 == null) {
            return c8640;
        }
        C8639 c8639M14323 = c8640.m14323();
        if (c86184 != null) {
            c8639M14323.f24255 = c86184.f24204;
        }
        if (c86183 != null) {
            c8639M14323.f24254 = c86183.f24204;
        }
        if (c86182 != null) {
            c8639M14323.f24260 = c86182.f24204;
        }
        if (c8618 != null) {
            c8639M14323.f24261 = c8618.f24204;
        }
        return c8639M14323.m14319();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Serializable, 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世[]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6148 m14297() {
        C6148 c6148 = new C6148(1);
        int i = this.f24199;
        c6148.f16874 = i;
        c6148.f16873 = this.f24198;
        int[][] iArr = this.f24197;
        ?? r3 = new int[iArr.length][];
        c6148.f16872 = r3;
        C8640[] c8640Arr = this.f24196;
        c6148.f16871 = new C8640[c8640Arr.length];
        System.arraycopy(iArr, 0, r3, 0, i);
        System.arraycopy(c8640Arr, 0, (C8640[]) c6148.f16871, 0, c6148.f16874);
        c6148.f16870 = this.f24195;
        c6148.f16877 = this.f24194;
        c6148.f16876 = this.f24201;
        c6148.f16878 = this.f24200;
        return c6148;
    }
}
