package p321;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import p023.C6977;
import p330.AbstractC9490;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9446 implements InterfaceC9464 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C9447 f24539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9447 f24540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9469[] f24541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int[][] f24542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9469 f24543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24544;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C9447 f24545;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C9447 f24546;

    public C9446(C6977 c6977) {
        this.f24544 = c6977.f17219;
        this.f24543 = (C9469) c6977.f17218;
        this.f24542 = (int[][]) c6977.f17217;
        this.f24541 = (C9469[]) c6977.f17216;
        this.f24540 = (C9447) c6977.f17215;
        this.f24539 = (C9447) c6977.f17222;
        this.f24546 = (C9447) c6977.f17221;
        this.f24545 = (C9447) c6977.f17223;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C9446 m14847(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        C6977 c6977 = new C6977(1);
        c6977.m12091();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            c6977.m12091();
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
                m14848(c6977, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            return c6977.m12093();
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
    public static void m14848(C6977 c6977, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = AbstractC9490.f24776;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                C9457 c9457 = new C9457(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                C9469 c9469M14878 = C9469.m14879(contextThemeWrapper.obtainStyledAttributes(AbstractC9490.f24756), c9457).m14878();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != C0328R.attr.shapeAppearance && attributeNameResource != C0328R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                c6977.m12095(StateSet.trimStateSet(iArr2, i), c9469M14878);
            }
        }
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo14849() {
        C9447 c9447;
        C9447 c94472;
        C9447 c94473;
        C9447 c94474;
        return this.f24544 > 1 || ((c9447 = this.f24540) != null && c9447.f24550 > 1) || (((c94472 = this.f24539) != null && c94472.f24550 > 1) || (((c94473 = this.f24546) != null && c94473.f24550 > 1) || ((c94474 = this.f24545) != null && c94474.f24550 > 1)));
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9469 mo14850(C9473 c9473) {
        return m14855().mo14850(c9473);
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9469 mo14851() {
        return m14855();
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9469[] mo14852() {
        return this.f24541;
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9469 mo14853(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.f24544;
            iArr2 = this.f24542;
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
        C9469[] c9469Arr = this.f24541;
        C9447 c9447 = this.f24545;
        C9447 c94472 = this.f24546;
        C9447 c94473 = this.f24539;
        C9447 c94474 = this.f24540;
        if (c94474 == null && c94473 == null && c94472 == null && c9447 == null) {
            return c9469Arr[i4];
        }
        C9468 c9468M14882 = c9469Arr[i4].m14882();
        if (c94474 != null) {
            c9468M14882.f24600 = c94474.m14859(iArr);
        }
        if (c94473 != null) {
            c9468M14882.f24599 = c94473.m14859(iArr);
        }
        if (c94472 != null) {
            c9468M14882.f24605 = c94472.m14859(iArr);
        }
        if (c9447 != null) {
            c9468M14882.f24606 = c9447.m14859(iArr);
        }
        return c9468M14882.m14878();
    }

    @Override // p321.InterfaceC9464
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9469 mo14854(float f) {
        return m14855().mo14854(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C9469 m14855() {
        C9469 c9469 = this.f24543;
        C9447 c9447 = this.f24545;
        C9447 c94472 = this.f24546;
        C9447 c94473 = this.f24539;
        C9447 c94474 = this.f24540;
        if (c94474 == null && c94473 == null && c94472 == null && c9447 == null) {
            return c9469;
        }
        C9468 c9468M14882 = c9469.m14882();
        if (c94474 != null) {
            c9468M14882.f24600 = c94474.f24549;
        }
        if (c94473 != null) {
            c9468M14882.f24599 = c94473.f24549;
        }
        if (c94472 != null) {
            c9468M14882.f24605 = c94472.f24549;
        }
        if (c9447 != null) {
            c9468M14882.f24606 = c9447.f24549;
        }
        return c9468M14882.m14878();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Serializable, 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世[]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6977 m14856() {
        C6977 c6977 = new C6977(1);
        int i = this.f24544;
        c6977.f17219 = i;
        c6977.f17218 = this.f24543;
        int[][] iArr = this.f24542;
        ?? r3 = new int[iArr.length][];
        c6977.f17217 = r3;
        C9469[] c9469Arr = this.f24541;
        c6977.f17216 = new C9469[c9469Arr.length];
        System.arraycopy(iArr, 0, r3, 0, i);
        System.arraycopy(c9469Arr, 0, (C9469[]) c6977.f17216, 0, c6977.f17219);
        c6977.f17215 = this.f24540;
        c6977.f17222 = this.f24539;
        c6977.f17221 = this.f24546;
        c6977.f17223 = this.f24545;
        return c6977;
    }
}
