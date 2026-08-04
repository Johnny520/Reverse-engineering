package yyds;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: yyds.ᛶᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1441 {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final C0988 sConstructorMap = new C0988(0);

    public C1800 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1800(context, attributeSet);
    }

    public C0430 createButton(Context context, AttributeSet attributeSet) {
        return new C0430(context, attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.buttonStyle);
    }

    public C2624 createCheckBox(Context context, AttributeSet attributeSet) {
        return new C2624(context, attributeSet);
    }

    public C1923 createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C1923(context, attributeSet);
    }

    public C0555 createEditText(Context context, AttributeSet attributeSet) {
        return new C0555(context, attributeSet);
    }

    public C0592 createImageButton(Context context, AttributeSet attributeSet) {
        return new C0592(context, attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.imageButtonStyle);
    }

    public C2264 createImageView(Context context, AttributeSet attributeSet) {
        return new C2264(context, attributeSet, 0);
    }

    public C1375 createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1375(context, attributeSet);
    }

    public C0408 createRadioButton(Context context, AttributeSet attributeSet) {
        return new C0408(context, attributeSet);
    }

    public C1683 createRatingBar(Context context, AttributeSet attributeSet) {
        return new C1683(context, attributeSet);
    }

    public C2030 createSeekBar(Context context, AttributeSet attributeSet) {
        return new C2030(context, attributeSet);
    }

    public C1921 createSpinner(Context context, AttributeSet attributeSet) {
        return new C1921(context, attributeSet);
    }

    public C0580 createTextView(Context context, AttributeSet attributeSet) {
        return new C0580(context, attributeSet);
    }

    public C1487 createToggleButton(Context context, AttributeSet attributeSet) {
        return new C1487(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object[]] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:122:0x01cf
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final android.view.View createView(android.view.View r4, java.lang.String r5, android.content.Context r6, android.util.AttributeSet r7, boolean r8, boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yyds.C1441.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final View m2940(Context context, String str, String str2) {
        String strConcat;
        C0988 c0988 = sConstructorMap;
        Constructor constructor = (Constructor) c0988.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            c0988.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2941(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }
}
