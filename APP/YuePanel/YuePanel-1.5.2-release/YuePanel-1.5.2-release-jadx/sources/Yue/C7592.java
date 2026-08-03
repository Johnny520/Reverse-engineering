package Yue;

import Yue.C4043;
import Yue.C4521;
import Yue.C6944;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۢ۠۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7592 extends C4521 {

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final String f22958 = "StateListDrawableCompat";

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final boolean f22959 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public C1303 f22960;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f22961;

    /* JADX INFO: renamed from: Yue.ۥۢ۠۟ۥ$ۥ */
    public static class C1303 extends C4521.AbstractC4523 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public int[][] f22962;

        public C1303(C1303 c1303, C7592 c7592, Resources resources) {
            super(c1303, c7592, resources);
            if (c1303 != null) {
                this.f22962 = c1303.f22962;
            } else {
                this.f22962 = new int[m13261()][];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC6391
        public Drawable newDrawable() {
            return new C7592(this, null);
        }

        @Override // Yue.C4521.AbstractC4523
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public void mo13272(int i, int i2) {
            super.mo13272(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f22962, 0, iArr, 0, i);
            this.f22962 = iArr;
        }

        @Override // Yue.C4521.AbstractC4523
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
        public void mo6604() {
            int[][] iArr = this.f22962;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f22962[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f22962 = iArr2;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public int m23775(int[] iArr, Drawable drawable) {
            int iM1457 = m1457(drawable);
            this.f22962[iM1457] = iArr;
            return iM1457;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public int m23776(int[] iArr) {
            int[][] iArr2 = this.f22962;
            int iM13263 = m13263();
            for (int i = 0; i < iM13263; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC6391
        public Drawable newDrawable(Resources resources) {
            return new C7592(this, resources);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7592() {
        this(null, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    private void m23766(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        C1303 c1303 = this.f22960;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C6944.C1121.f20280);
                int resourceId = typedArrayM25330.getResourceId(C6944.C1121.f20281, -1);
                Drawable drawableM22257 = resourceId > 0 ? C7124.m22248().m22257(context, resourceId) : null;
                typedArrayM25330.recycle();
                int[] iArrM23769 = m23769(attributeSet);
                if (drawableM22257 == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C3229.f4956);
                    }
                    drawableM22257 = C4043.C0313.m990(resources, xmlPullParser, attributeSet, theme);
                }
                c1303.m23775(iArrM23769, drawableM22257);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    private void m23767(TypedArray typedArray) {
        C1303 c1303 = this.f22960;
        c1303.f9655 |= C4043.C0313.m991(typedArray);
        c1303.f9660 = typedArray.getBoolean(C6944.C1121.f20276, c1303.f9660);
        c1303.f9663 = typedArray.getBoolean(C6944.C1121.f20277, c1303.f9663);
        c1303.f9678 = typedArray.getInt(C6944.C1121.f20278, c1303.f9678);
        c1303.f9679 = typedArray.getInt(C6944.C1121.f20279, c1303.f9679);
        c1303.f9675 = typedArray.getBoolean(C6944.C1121.f20274, c1303.f9675);
    }

    @Override // Yue.C4521, android.graphics.drawable.Drawable
    @InterfaceC7113(21)
    public void applyTheme(@InterfaceC6391 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // Yue.C4521, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // Yue.C4521, android.graphics.drawable.Drawable
    @InterfaceC6391
    public Drawable mutate() {
        if (!this.f22961 && super.mutate() == this) {
            this.f22960.mo6604();
            this.f22961 = true;
        }
        return this;
    }

    @Override // Yue.C4521, android.graphics.drawable.Drawable
    public boolean onStateChange(@InterfaceC6391 int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iM23776 = this.f22960.m23776(iArr);
        if (iM23776 < 0) {
            iM23776 = this.f22960.m23776(StateSet.WILD_CARD);
        }
        return m13251(iM23776) || zOnStateChange;
    }

    @Override // Yue.C4521
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo309() {
        super.mo309();
        this.f22961 = false;
    }

    @Override // Yue.C4521
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo6590(@InterfaceC6391 C4521.AbstractC4523 abstractC4523) {
        super.mo6590(abstractC4523);
        if (abstractC4523 instanceof C1303) {
            this.f22960 = (C1303) abstractC4523;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m23768(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f22960.m23775(iArr, drawable);
            onStateChange(getState());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟()LYue/ۥ۠۠۠ۦ$ۥ۟۟۟; */
    @Override // Yue.C4521
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public C1303 mo6591() {
        return new C1303(this.f22960, this, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int[] m23769(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m23770() {
        return this.f22960.m13263();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Drawable m23771(int i) {
        return this.f22960.m13262(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m23772(int[] iArr) {
        return this.f22960.m23776(iArr);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C1303 m23773() {
        return this.f22960;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int[] m23774(int i) {
        return this.f22960.f22962[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo6592(@InterfaceC6391 Context context, @InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C6944.C1121.f20273);
        setVisible(typedArrayM25330.getBoolean(C6944.C1121.f20275, true), true);
        m23767(typedArrayM25330);
        m13255(resources);
        typedArrayM25330.recycle();
        m23766(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7592(C1303 c1303, Resources resources) {
        mo6590(new C1303(c1303, this, resources));
        onStateChange(getState());
    }

    public C7592(@InterfaceC6490 C1303 c1303) {
        if (c1303 != null) {
            mo6590(c1303);
        }
    }
}
