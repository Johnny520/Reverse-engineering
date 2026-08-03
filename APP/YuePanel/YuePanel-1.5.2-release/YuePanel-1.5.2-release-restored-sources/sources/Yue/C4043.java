package Yue;

import Yue.InterfaceC7144;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public final class C4043 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۢۦ$ۥ */
    @InterfaceC7113(21)
    public static class C0313 {
        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Drawable m990(@InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m991(@InterfaceC6391 TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m11460(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }
}
