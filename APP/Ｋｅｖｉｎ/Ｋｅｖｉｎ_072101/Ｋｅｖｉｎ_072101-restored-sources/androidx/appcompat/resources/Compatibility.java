package androidx.appcompat.resources;

/* JADX INFO: loaded from: classes2.dex */
public final class Compatibility {

    public static class Api15Impl {
        private Api15Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void getValueForDensity(android.content.res.Resources r0, int r1, int r2, android.util.TypedValue r3, boolean r4) {
                r0.getValueForDensity(r1, r2, r3, r4)
                return
        }
    }

    public static class Api18Impl {
        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void setAutoCancel(android.animation.ObjectAnimator r0, boolean r1) {
                r0.setAutoCancel(r1)
                return
        }
    }

    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.graphics.drawable.Drawable createFromXmlInner(android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
                android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromXmlInner(r1, r2, r3, r4)
                return r0
        }

        public static int getChangingConfigurations(android.content.res.TypedArray r1) {
                int r0 = r1.getChangingConfigurations()
                return r0
        }

        public static void inflate(android.graphics.drawable.Drawable r0, android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
                r0.inflate(r1, r2, r3, r4)
                return
        }
    }

    private Compatibility() {
            r0 = this;
            r0.<init>()
            return
    }
}
