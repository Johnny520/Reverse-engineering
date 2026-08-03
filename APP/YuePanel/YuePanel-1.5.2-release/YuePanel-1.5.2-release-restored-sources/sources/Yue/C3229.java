package Yue;

import Yue.C4043;
import Yue.C4521;
import Yue.C6944;
import Yue.C7592;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3229 extends C7592 implements InterfaceC7833 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final String f4951 = "ۥ۟۠ۦۥ";

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final String f4952 = "transition";

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final String f4953 = "item";

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final String f4954 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final String f4955 = ": <transition> tag requires 'fromId' & 'toId' attributes";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f4956 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public C3230 f4957;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public AbstractC3234 f4958;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int f4959;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f4960;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public boolean f4961;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟ */
    public static class C0087 extends AbstractC3234 {

        /* JADX INFO: renamed from: ۥ */
        public final Animatable f144;

        public C0087(Animatable animatable) {
            super();
            this.f144 = animatable;
        }

        @Override // Yue.C3229.AbstractC3234
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo6601() {
            this.f144.start();
        }

        @Override // Yue.C3229.AbstractC3234
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo6602() {
            this.f144.stop();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟۟, reason: contains not printable characters */
    public static class C3230 extends C7592.C1303 {

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public static final long f4962 = 4294967296L;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public static final long f4963 = 8589934592L;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public C5885<Long> f4964;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public C7533<Integer> f4965;

        public C3230(@InterfaceC6490 C3230 c3230, @InterfaceC6391 C3229 c3229, @InterfaceC6490 Resources resources) {
            super(c3230, c3229, resources);
            if (c3230 != null) {
                this.f4964 = c3230.f4964;
                this.f4965 = c3230.f4965;
            } else {
                this.f4964 = new C5885<>();
                this.f4965 = new C7533<>();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public static long m6603(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // Yue.C7592.C1303, android.graphics.drawable.Drawable.ConstantState
        @InterfaceC6391
        public Drawable newDrawable() {
            return new C3229(this, null);
        }

        @Override // Yue.C7592.C1303, Yue.C4521.AbstractC4523
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public void mo6604() {
            this.f4964 = this.f4964.clone();
            this.f4965 = this.f4965.clone();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public int m6605(@InterfaceC6391 int[] iArr, @InterfaceC6391 Drawable drawable, int i) {
            int iM23775 = super.m23775(iArr, drawable);
            this.f4965.m23569(iM23775, Integer.valueOf(i));
            return iM23775;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public int m6606(int i, int i2, @InterfaceC6391 Drawable drawable, boolean z) {
            int iM1457 = super.m1457(drawable);
            long jM6603 = m6603(i, i2);
            long j = z ? f4963 : 0L;
            long j2 = iM1457;
            this.f4964.m18209(jM6603, Long.valueOf(j2 | j));
            if (z) {
                this.f4964.m18209(m6603(i2, i), Long.valueOf(f4962 | j2 | j));
            }
            return iM1457;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public int m6607(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f4965.m23564(i, 0).intValue();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public int m6608(@InterfaceC6391 int[] iArr) {
            int iM23776 = super.m23776(iArr);
            return iM23776 >= 0 ? iM23776 : super.m23776(StateSet.WILD_CARD);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public int m6609(int i, int i2) {
            return (int) this.f4964.m18217(m6603(i, i2), -1L).longValue();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public boolean m6610(int i, int i2) {
            return (this.f4964.m18217(m6603(i, i2), -1L).longValue() & f4962) != 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public boolean m6611(int i, int i2) {
            return (this.f4964.m18217(m6603(i, i2), -1L).longValue() & f4963) != 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // Yue.C7592.C1303, android.graphics.drawable.Drawable.ConstantState
        @InterfaceC6391
        public Drawable newDrawable(Resources resources) {
            return new C3229(this, resources);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C3231 extends AbstractC3234 {

        /* JADX INFO: renamed from: ۥ */
        public final C3235 f145;

        public C3231(C3235 c3235) {
            super();
            this.f145 = c3235;
        }

        @Override // Yue.C3229.AbstractC3234
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo6601() {
            this.f145.start();
        }

        @Override // Yue.C3229.AbstractC3234
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo6602() {
            this.f145.stop();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C3232 extends AbstractC3234 {

        /* JADX INFO: renamed from: ۥ */
        public final ObjectAnimator f146;

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean f147;

        public C3232(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C3233 c3233 = new C3233(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(c3233.m312());
            objectAnimatorOfInt.setInterpolator(c3233);
            this.f147 = z2;
            this.f146 = objectAnimatorOfInt;
        }

        @Override // Yue.C3229.AbstractC3234
        /* JADX INFO: renamed from: ۥ */
        public boolean mo310() {
            return this.f147;
        }

        @Override // Yue.C3229.AbstractC3234
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo311() {
            this.f146.reverse();
        }

        @Override // Yue.C3229.AbstractC3234
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo6601() {
            this.f146.start();
        }

        @Override // Yue.C3229.AbstractC3234
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo6602() {
            this.f146.cancel();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C3233 implements TimeInterpolator {

        /* JADX INFO: renamed from: ۥ */
        public int[] f148;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f149;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f4966;

        public C3233(AnimationDrawable animationDrawable, boolean z) {
            m313(animationDrawable, z);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f4966) + 0.5f);
            int i2 = this.f149;
            int[] iArr = this.f148;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f4966 : 0.0f);
        }

        /* JADX INFO: renamed from: ۥ */
        public int m312() {
            return this.f4966;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m313(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f149 = numberOfFrames;
            int[] iArr = this.f148;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f148 = new int[numberOfFrames];
            }
            int[] iArr2 = this.f148;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f4966 = i;
            return i;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static abstract class AbstractC3234 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC3234() {
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean mo310() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void mo311() {
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public abstract void mo6601();

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public abstract void mo6602();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3229() {
        this(null, null);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static C3229 m6586(@InterfaceC6391 Context context, @InterfaceC4525 int i, @InterfaceC6490 Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m6587(context, resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e(f4951, "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e(f4951, "parser error", e2);
            return null;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static C3229 m6587(@InterfaceC6391 Context context, @InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C3229 c3229 = new C3229();
            c3229.mo6592(context, resources, xmlPullParser, attributeSet, theme);
            return c3229;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    private void m6588() {
        onStateChange(getState());
    }

    @Override // Yue.C7592, Yue.C4521, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // Yue.C4521, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC3234 abstractC3234 = this.f4958;
        if (abstractC3234 != null) {
            abstractC3234.mo6602();
            this.f4958 = null;
            m13251(this.f4959);
            this.f4959 = -1;
            this.f4960 = -1;
        }
    }

    @Override // Yue.C7592, Yue.C4521, android.graphics.drawable.Drawable
    @InterfaceC6391
    public Drawable mutate() {
        if (!this.f4961 && super.mutate() == this) {
            this.f4957.mo6604();
            this.f4961 = true;
        }
        return this;
    }

    @Override // Yue.C7592, Yue.C4521, android.graphics.drawable.Drawable
    public boolean onStateChange(@InterfaceC6391 int[] iArr) {
        int iM6608 = this.f4957.m6608(iArr);
        boolean z = iM6608 != m13248() && (m6600(iM6608) || m13251(iM6608));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // Yue.C4521, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC3234 abstractC3234 = this.f4958;
        if (abstractC3234 != null && (visible || z2)) {
            if (z) {
                abstractC3234.mo6601();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // Yue.C7592, Yue.C4521
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo309() {
        super.mo309();
        this.f4961 = false;
    }

    @Override // Yue.C7592, Yue.C4521
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo6590(@InterfaceC6391 C4521.AbstractC4523 abstractC4523) {
        super.mo6590(abstractC4523);
        if (abstractC4523 instanceof C3230) {
            this.f4957 = (C3230) abstractC4523;
        }
    }

    @Override // Yue.C7592
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void mo6592(@InterfaceC6391 Context context, @InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C6944.C1121.f2521);
        setVisible(typedArrayM25330.getBoolean(C6944.C1121.f20260, true), true);
        m6594(typedArrayM25330);
        m13255(resources);
        typedArrayM25330.recycle();
        m6593(context, resources, xmlPullParser, attributeSet, theme);
        m6588();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m6593(@InterfaceC6391 Context context, @InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m6598(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(f4952)) {
                    m6599(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m6594(TypedArray typedArray) {
        C3230 c3230 = this.f4957;
        c3230.f9655 |= C4043.C0313.m991(typedArray);
        c3230.m13281(typedArray.getBoolean(C6944.C1121.f20261, c3230.f9660));
        c3230.m13277(typedArray.getBoolean(C6944.C1121.f20262, c3230.f9663));
        c3230.m13278(typedArray.getInt(C6944.C1121.f20263, c3230.f9678));
        c3230.m13279(typedArray.getInt(C6944.C1121.f20264, c3230.f9679));
        setDither(typedArray.getBoolean(C6944.C1121.f2522, c3230.f9675));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m6595(@InterfaceC6391 int[] iArr, @InterfaceC6391 Drawable drawable, int i) {
        C6499.m20592(drawable);
        this.f4957.m6605(iArr, drawable, i);
        onStateChange(getState());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public <T extends Drawable & Animatable> void m6596(int i, int i2, @InterfaceC6391 T t, boolean z) {
        C6499.m20592(t);
        this.f4957.m6606(i, i2, t, z);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟()LYue/ۥ۠۠۠ۦ$ۥ۟۟۟; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠()LYue/ۥۢ۠۟ۥ$ۥ; */
    @Override // Yue.C7592
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C3230 mo6591() {
        return new C3230(this.f4957, this, null);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final int m6598(@InterfaceC6391 Context context, @InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C6944.C1121.f20265);
        int resourceId = typedArrayM25330.getResourceId(C6944.C1121.f20266, 0);
        int resourceId2 = typedArrayM25330.getResourceId(C6944.C1121.f20267, -1);
        Drawable drawableM22257 = resourceId2 > 0 ? C7124.m22248().m22257(context, resourceId2) : null;
        typedArrayM25330.recycle();
        int[] iArrM23769 = m23769(attributeSet);
        if (drawableM22257 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f4956);
            }
            drawableM22257 = xmlPullParser.getName().equals(C8162.f24192) ? C8162.m26914(resources, xmlPullParser, attributeSet, theme) : C4043.C0313.m990(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableM22257 != null) {
            return this.f4957.m6605(iArrM23769, drawableM22257, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f4956);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final int m6599(@InterfaceC6391 Context context, @InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C6944.C1121.f20268);
        int resourceId = typedArrayM25330.getResourceId(C6944.C1121.f20271, -1);
        int resourceId2 = typedArrayM25330.getResourceId(C6944.C1121.f20270, -1);
        int resourceId3 = typedArrayM25330.getResourceId(C6944.C1121.f20269, -1);
        Drawable drawableM22257 = resourceId3 > 0 ? C7124.m22248().m22257(context, resourceId3) : null;
        boolean z = typedArrayM25330.getBoolean(C6944.C1121.f20272, false);
        typedArrayM25330.recycle();
        if (drawableM22257 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f4954);
            }
            drawableM22257 = xmlPullParser.getName().equals(C3235.f4968) ? C3235.m6612(context, resources, xmlPullParser, attributeSet, theme) : C4043.C0313.m990(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableM22257 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f4954);
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f4957.m6606(resourceId, resourceId2, drawableM22257, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f4955);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final boolean m6600(int i) {
        int iM13248;
        int iM6609;
        AbstractC3234 c0087;
        AbstractC3234 abstractC3234 = this.f4958;
        if (abstractC3234 == null) {
            iM13248 = m13248();
        } else {
            if (i == this.f4959) {
                return true;
            }
            if (i == this.f4960 && abstractC3234.mo310()) {
                abstractC3234.mo311();
                this.f4959 = this.f4960;
                this.f4960 = i;
                return true;
            }
            iM13248 = this.f4959;
            abstractC3234.mo6602();
        }
        this.f4958 = null;
        this.f4960 = -1;
        this.f4959 = -1;
        C3230 c3230 = this.f4957;
        int iM6607 = c3230.m6607(iM13248);
        int iM66072 = c3230.m6607(i);
        if (iM66072 == 0 || iM6607 == 0 || (iM6609 = c3230.m6609(iM6607, iM66072)) < 0) {
            return false;
        }
        boolean zM6611 = c3230.m6611(iM6607, iM66072);
        m13251(iM6609);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            c0087 = new C3232((AnimationDrawable) current, c3230.m6610(iM6607, iM66072), zM6611);
        } else {
            if (!(current instanceof C3235)) {
                if (current instanceof Animatable) {
                    c0087 = new C0087((Animatable) current);
                }
                return false;
            }
            c0087 = new C3231((C3235) current);
        }
        c0087.mo6601();
        this.f4958 = c0087;
        this.f4960 = iM13248;
        this.f4959 = i;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3229(@InterfaceC6490 C3230 c3230, @InterfaceC6490 Resources resources) {
        super(null);
        this.f4959 = -1;
        this.f4960 = -1;
        mo6590(new C3230(c3230, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
