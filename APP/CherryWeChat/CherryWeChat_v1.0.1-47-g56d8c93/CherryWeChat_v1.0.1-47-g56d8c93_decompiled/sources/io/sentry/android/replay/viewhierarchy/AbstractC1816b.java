package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.replay.AbstractC1823y;
import io.sentry.android.replay.util.AbstractC1804d;
import io.sentry.android.replay.util.C1801a;
import io.sentry.android.replay.util.C1808h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC0585Nj;
import p000.AbstractC2564tz;
import p000.C1251cA;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1816b {

    /* JADX INFO: renamed from: a */
    public static final C1251cA f6576a = new C1251cA(C1815a.f6575b);

    /* JADX INFO: renamed from: b */
    public static boolean f6577b;

    /* JADX INFO: renamed from: c */
    public static WeakReference f6578c;

    /* JADX WARN: Removed duplicated region for block: B:105:0x019c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC1820f m3986a(LayoutNode layoutNode, AbstractC1820f abstractC1820f, boolean z, C2046v2 c2046v2) {
        boolean z2;
        TextLayoutInput layoutInput;
        TextStyle style;
        TextLayoutInput layoutInput2;
        TextStyle style2;
        AccessibilityAction accessibilityAction;
        InterfaceC1416fj interfaceC1416fj;
        if (!layoutNode.isPlaced() || !layoutNode.isAttached()) {
            return null;
        }
        if (z) {
            f6578c = new WeakReference(LayoutCoordinatesKt.findRootCoordinates(layoutNode.getCoordinates()));
        }
        LayoutCoordinates coordinates = layoutNode.getCoordinates();
        WeakReference weakReference = f6578c;
        Rect rectM3975a = AbstractC1804d.m3975a(coordinates, weakReference != null ? (LayoutCoordinates) weakReference.get() : null);
        try {
            SemanticsConfiguration semanticsConfigurationM3989d = m3989d(layoutNode);
            boolean z3 = !layoutNode.getOuterCoordinator$ui_release().isTransparent() && (semanticsConfigurationM3989d == null || !semanticsConfigurationM3989d.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && rectM3975a.height() > 0 && rectM3975a.width() > 0;
            boolean z4 = (semanticsConfigurationM3989d != null && semanticsConfigurationM3989d.contains(SemanticsActions.INSTANCE.getSetText())) || (semanticsConfigurationM3989d != null && semanticsConfigurationM3989d.contains(SemanticsProperties.INSTANCE.getEditableText()));
            if ((semanticsConfigurationM3989d == null || !semanticsConfigurationM3989d.contains(SemanticsProperties.INSTANCE.getText())) && !z4) {
                Painter painterM3976b = AbstractC1804d.m3976b(layoutNode);
                if (painterM3976b == null) {
                    return new C1817c(layoutNode.getWidth(), layoutNode.getHeight(), abstractC1820f.f6585c, abstractC1820f, z3 && m3990e(semanticsConfigurationM3989d, false, c2046v2), rectM3975a);
                }
                boolean z5 = z3 && m3990e(semanticsConfigurationM3989d, true, c2046v2);
                int width = layoutNode.getWidth();
                int height = layoutNode.getHeight();
                float f = abstractC1820f.f6585c;
                if (z5) {
                    String name = painterM3976b.getClass().getName();
                    z2 = (AbstractC2564tz.m5051L(name, "Vector", false) || AbstractC2564tz.m5051L(name, "Color", false) || AbstractC2564tz.m5051L(name, "Brush", false)) ? false : true;
                }
                return new C1818d(width, height, f, abstractC1820f, z2, rectM3975a);
            }
            boolean z6 = z3 && m3990e(semanticsConfigurationM3989d, false, c2046v2);
            ArrayList arrayList = new ArrayList();
            if (semanticsConfigurationM3989d != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationM3989d, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (interfaceC1416fj = (InterfaceC1416fj) accessibilityAction.getAction()) != null) {
            }
            C1808h c1808hM3977c = AbstractC1804d.m3977c(layoutNode);
            Color color = c1808hM3977c.f6539a;
            boolean z7 = c1808hM3977c.f6540b;
            TextLayoutResult textLayoutResult = (TextLayoutResult) (arrayList.isEmpty() ? null : arrayList.get(0));
            Color color2 = (textLayoutResult == null || (layoutInput2 = textLayoutResult.getLayoutInput()) == null || (style2 = layoutInput2.getStyle()) == null) ? null : Color.box-impl(style2.getColor-0d7_KjU());
            if (color2 == null || color2.unbox-impl() != Color.Companion.getUnspecified-0d7_KjU()) {
                color = color2;
            }
            TextUnit textUnit = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : TextUnit.box-impl(style.getFontSize-XSAIIZE());
            return new C1819e((textLayoutResult == null || z4 || (textUnit != null ? TextUnit.equals-impl0(textUnit.unbox-impl(), TextUnit.Companion.getUnspecified-XSAIIZE()) : false)) ? null : new C1801a(textLayoutResult, z7), color != null ? Integer.valueOf(ColorKt.toArgb-8_81llA(color.unbox-impl()) | (-16777216)) : null, 0, 0, layoutNode.getWidth(), layoutNode.getHeight(), abstractC1820f.f6585c, abstractC1820f, z6, rectM3975a);
        } catch (Throwable th) {
            if (!f6577b) {
                f6577b = true;
                c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            int width2 = layoutNode.getWidth();
            int height2 = layoutNode.getHeight();
            float f2 = abstractC1820f.f6585c;
            if (!layoutNode.getOuterCoordinator$ui_release().isTransparent() && rectM3975a.height() > 0) {
                rectM3975a.width();
            }
            return new C1817c(width2, height2, f2, abstractC1820f, true, rectM3975a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3987b(View view, AbstractC1820f abstractC1820f, C2046v2 c2046v2) {
        AbstractC2564tz.m5051L(view.getClass().getName(), "AndroidComposeView", false);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static String m3988c(boolean z, SemanticsConfiguration semanticsConfiguration) {
        return z ? "android.widget.ImageView" : semanticsConfiguration != null ? (semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getText()) || semanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText()) || semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getEditableText())) ? "android.widget.TextView" : "android.view.View" : "android.view.View";
    }

    /* JADX INFO: renamed from: d */
    public static final SemanticsConfiguration m3989d(LayoutNode layoutNode) {
        Method method = (Method) f6576a.getValue();
        return method != null ? (SemanticsConfiguration) method.invoke(layoutNode, null) : layoutNode.getCollapsedSemantics$ui_release();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3990e(SemanticsConfiguration semanticsConfiguration, boolean z, C2046v2 c2046v2) {
        String str = semanticsConfiguration != null ? (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, AbstractC1823y.f6596a) : null;
        if (AbstractC0585Nj.m1134a(str, "unmask")) {
            return false;
        }
        if (AbstractC0585Nj.m1134a(str, "mask")) {
            return true;
        }
        String strM3988c = m3988c(z, semanticsConfiguration);
        if (c2046v2.getSessionReplay().f7308d.contains(strM3988c)) {
            return false;
        }
        return c2046v2.getSessionReplay().f7307c.contains(strM3988c);
    }

    /* JADX INFO: renamed from: f */
    public static void m3991f(LayoutNode layoutNode, AbstractC1820f abstractC1820f, boolean z, C2046v2 c2046v2) {
        List children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = (LayoutNode) children$ui_release.get(i);
            AbstractC1820f abstractC1820fM3986a = m3986a(layoutNode2, abstractC1820f, z, c2046v2);
            if (abstractC1820fM3986a != null) {
                arrayList.add(abstractC1820fM3986a);
                m3991f(layoutNode2, abstractC1820fM3986a, false, c2046v2);
            }
        }
        abstractC1820f.f6588f = arrayList;
    }
}
