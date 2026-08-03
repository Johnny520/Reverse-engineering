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
    public static final C1251cA f6576a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f6577b;

    /* JADX INFO: renamed from: c */
    public static WeakReference f6578c;

    static {
        f6576a = new C1251cA(C1815a.f6575b);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1820f m3986a(LayoutNode r14, AbstractC1820f r15, boolean r16, C2046v2 r17) {
        Integer r2 = null;
        if (r14.isPlaced() == true) goto L5;
    L126:
        return null;
    L5:
        if (r14.isAttached() == false) goto L126;
        if (r16 == false) goto L8;
        f6578c = new WeakReference(LayoutCoordinatesKt.findRootCoordinates(r14.getCoordinates()));
    L8:
        LayoutCoordinates r0 = r14.getCoordinates();
        WeakReference r3 = f6578c;
        if (r3 == null) goto L11;
        LayoutCoordinates r32 = (LayoutCoordinates) r3.get();
    L12:
        Rect r6 = AbstractC1804d.m3975a(r0, r32);
        boolean r33 = false;
        boolean r5 = true;
        SemanticsConfiguration r02 = m3989d(r14);     // Catch: Throwable -> L115
        if (r14.getOuterCoordinator$ui_release().isTransparent() == true) goto L24;
        if (r02 == null) goto L20;
        if (r02.contains(SemanticsProperties.INSTANCE.getInvisibleToUser()) == true) goto L24;
    L20:
        if (r6.height() <= 0) goto L24;
        if (r6.width() <= 0) goto L24;
        boolean r7 = true;
    L25:
        if (r02 != null) goto L27;
    L29:
        if (r02 != null) goto L31;
    L33:
        boolean r8 = false;
    L34:
        if (r02 != null) goto L36;
    L38:
        if (r8 == false) goto L89;
    L39:
        if (r7 == true) goto L41;
    L43:
        boolean r9 = false;
    L44:
        ArrayList r1 = new ArrayList();
        if (r02 == null) goto L51;
        AccessibilityAction r03 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(r02, SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (r03 == null) goto L51;
        InterfaceC1416fj r04 = (InterfaceC1416fj) r03.getAction();
        if (r04 == null) goto L51;
        Boolean r05 = (Boolean) r04.mo90g(r1);
    L51:
        C1808h r06 = AbstractC1804d.m3977c(r14);
        Color r52 = r06.f6539a;
        boolean r07 = r06.f6540b;
        if (r1.isEmpty() == false) goto L54;
        Object r12 = null;
    L55:
        TextLayoutResult r13 = (TextLayoutResult) r12;
        if (r13 == null) goto L62;
        TextLayoutInput r72 = r13.getLayoutInput();
        if (r72 == null) goto L62;
        TextStyle r73 = r72.getStyle();
        if (r73 == null) goto L62;
        Color r74 = Color.box-impl(r73.getColor-0d7_KjU());
    L63:
        if (r74 != null) goto L65;
    L67:
        r52 = r74;
    L68:
        if (r13 == null) goto L74;
        TextLayoutInput r75 = r13.getLayoutInput();
        if (r75 == null) goto L74;
        TextStyle r76 = r75.getStyle();
        if (r76 == null) goto L74;
        TextUnit r77 = TextUnit.box-impl(r76.getFontSize-XSAIIZE());
    L75:
        long r10 = TextUnit.Companion.getUnspecified-XSAIIZE();
        if (r77 == null) goto L80;
        r33 = TextUnit.equals-impl0(r77.unbox-impl(), r10);
    L80:
        if (r13 == null) goto L84;
        if (r8 == true) goto L84;
        if (r33 == true) goto L84;
        C1801a r18 = new C1801a(r13, r07);
    L85:
        if (r52 == null) goto L88;
        r2 = Integer.valueOf(ColorKt.toArgb-8_81llA(r52.unbox-impl()) | (-16777216));
    L88:
        return new C1819e(r18, r2, 0, 0, r14.getWidth(), r14.getHeight(), r15.f6585c, r15, r9, r6);
    L84:
        r18 = null;
    L74:
        r77 = null;
        goto L75
    L65:
        if (r74.unbox-impl() != Color.Companion.getUnspecified-0d7_KjU()) goto L67;
    L62:
        r74 = null;
        goto L63
    L54:
        r12 = r1.get(0);
        goto L55
    L41:
        if (m3990e(r02, false, r17) == false) goto L43;
        r9 = true;
        goto L44
    L89:
        Painter r22 = AbstractC1804d.m3976b(r14);
        if (r22 == null) goto L108;
        if (r7 == true) goto L93;
    L95:
        boolean r08 = false;
    L96:
        int r19 = r14.getWidth();
        int r23 = r14.getHeight();
        float r82 = r15.f6585c;
        if (r08 == false) goto L105;
        String r09 = r22.getClass().getName();
        if (AbstractC2564tz.m5051L(r09, "Vector", false) == true) goto L105;
        if (AbstractC2564tz.m5051L(r09, "Color", false) == true) goto L105;
        if (AbstractC2564tz.m5051L(r09, "Brush", false) == true) goto L105;
    L107:
        return new C1818d(r19, r23, r82, r15, r5, r6);
    L105:
        r5 = false;
        goto L107
    L93:
        if (m3990e(r02, true, r17) == false) goto L95;
        r08 = true;
        goto L96
    L108:
        if (r7 == true) goto L110;
    L112:
        r5 = false;
    L114:
        return new C1817c(r14.getWidth(), r14.getHeight(), r15.f6585c, r15, r5, r6);
    L110:
        if (m3990e(r02, false, r17) == false) goto L112;
    L36:
        if (r02.contains(SemanticsProperties.INSTANCE.getText()) != true) goto L38;
    L31:
        if (r02.contains(SemanticsProperties.INSTANCE.getEditableText()) != true) goto L33;
    L32:
        r8 = true;
        goto L34
    L27:
        if (r02.contains(SemanticsActions.INSTANCE.getSetText()) != true) goto L29;
    L24:
        r7 = false;
    L115:
        th = move-exception;
        if (f6577b == true) goto L119;
        f6577b = true;
        r17.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
    L119:
        int r110 = r14.getWidth();
        int r24 = r14.getHeight();
        float r34 = r15.f6585c;
        if (r14.getOuterCoordinator$ui_release().isTransparent() == true) goto L125;
        if (r6.height() <= 0) goto L125;
        r6.width();
    L125:
        return new C1817c(r110, r24, r34, r15, true, r6);
    L11:
        r32 = null;
        goto L12
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3987b(View r0, AbstractC1820f r1, C2046v2 r2) {
        AbstractC2564tz.m5051L(r0.getClass().getName(), "AndroidComposeView", false);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static String m3988c(boolean r0, SemanticsConfiguration r1) {
        if (r0 == false) goto L5;
        return "android.widget.ImageView";
    L5:
        if (r1 != null) goto L7;
        return "android.view.View";
    L7:
        if (r1.contains(SemanticsProperties.INSTANCE.getText()) == false) goto L9;
        return "android.widget.TextView";
    L9:
        if (r1.contains(SemanticsActions.INSTANCE.getSetText()) == false) goto L11;
        return "android.widget.TextView";
    L11:
        if (r1.contains(SemanticsProperties.INSTANCE.getEditableText()) == false) goto L18;
        return "android.widget.TextView";
    L18:
        return "android.view.View";
    }

    /* JADX INFO: renamed from: d */
    public static final SemanticsConfiguration m3989d(LayoutNode r2) {
        Method r0 = (Method) f6576a.getValue();
        if (r0 == null) goto L7;
        return (SemanticsConfiguration) r0.invoke(r2, null);
    L7:
        return r2.getCollapsedSemantics$ui_release();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3990e(SemanticsConfiguration r2, boolean r3, C2046v2 r4) {
        if (r2 == null) goto L4;
        String r0 = (String) SemanticsConfigurationKt.getOrNull(r2, AbstractC1823y.f6596a);
    L6:
        if (AbstractC0585Nj.m1134a(r0, "unmask") == false) goto L9;
        return false;
    L9:
        if (AbstractC0585Nj.m1134a(r0, "mask") == false) goto L12;
        return true;
    L12:
        String r22 = m3988c(r3, r2);
        if (r4.getSessionReplay().f7308d.contains(r22) == false) goto L17;
        return false;
    L17:
        return r4.getSessionReplay().f7307c.contains(r22);
    L4:
        r0 = null;
        goto L6
    }

    /* JADX INFO: renamed from: f */
    public static void m3991f(LayoutNode r6, AbstractC1820f r7, boolean r8, C2046v2 r9) {
        List r62 = r6.getChildren$ui_release();
        if (r62.isEmpty() == false) goto L5;
        return;
    L5:
        ArrayList r0 = new ArrayList(r62.size());
        int r1 = r62.size();
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L11;
        LayoutNode r4 = (LayoutNode) r62.get(r3);
        AbstractC1820f r5 = m3986a(r4, r7, r8, r9);
        if (r5 == null) goto L10;
        r0.add(r5);
        m3991f(r4, r5, false, r9);
    L10:
        r3 = r3 + 1;
        goto L6
    L11:
        r7.f6588f = r0;
    }
}
