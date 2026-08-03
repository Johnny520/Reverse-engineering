package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import java.lang.reflect.Field;
import java.util.List;
import p000.AbstractC2564tz;

/* JADX INFO: renamed from: io.sentry.android.replay.util.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1804d {
    /* JADX INFO: renamed from: a */
    public static final Rect m3975a(LayoutCoordinates r11, LayoutCoordinates r12) {
        if (r12 != null) goto L4;
        r12 = LayoutCoordinatesKt.findRootCoordinates(r11);
    L4:
        float r0 = IntSize.getWidth-impl(r12.getSize-YbymL2g());
        float r1 = IntSize.getHeight-impl(r12.getSize-YbymL2g());
        androidx.compose.ui.geometry.Rect r112 = LayoutCoordinates.localBoundingBoxOf$default(r12, r11, false, 2, null);
        float r2 = r112.getLeft();
        float r3 = 0.0f;
        if (r2 >= 0.0f) goto L8;
        r2 = 0.0f;
    L8:
        if (r2 <= r0) goto L10;
        r2 = r0;
    L10:
        float r4 = r112.getTop();
        if (r4 >= 0.0f) goto L14;
        r4 = 0.0f;
    L14:
        if (r4 <= r1) goto L16;
        r4 = r1;
    L16:
        float r5 = r112.getRight();
        if (r5 >= 0.0f) goto L20;
        r5 = 0.0f;
    L20:
        if (r5 > r0) goto L23;
        r0 = r5;
    L23:
        float r113 = r112.getBottom();
        if (r113 < 0.0f) goto L28;
        r3 = r113;
    L28:
        if (r3 > r1) goto L32;
        r1 = r3;
    L32:
        if (r2 == r0) goto L37;
        if (r4 == r1) goto L37;
        long r52 = r12.localToWindow-MK-Hz9U(OffsetKt.Offset(r2, r4));
        long r32 = r12.localToWindow-MK-Hz9U(OffsetKt.Offset(r0, r4));
        long r7 = r12.localToWindow-MK-Hz9U(OffsetKt.Offset(r0, r1));
        long r114 = r12.localToWindow-MK-Hz9U(OffsetKt.Offset(r2, r1));
        float r02 = Offset.getX-impl(r52);
        float r13 = Offset.getX-impl(r32);
        float r22 = Offset.getX-impl(r114);
        float r9 = Offset.getX-impl(r7);
        float r10 = Math.min(r02, Math.min(r13, Math.min(r22, r9)));
        float r03 = Math.max(r02, Math.max(r13, Math.max(r22, r9)));
        float r14 = Offset.getY-impl(r52);
        float r23 = Offset.getY-impl(r32);
        float r115 = Offset.getY-impl(r114);
        float r122 = Offset.getY-impl(r7);
        return new Rect((int) r10, (int) Math.min(r14, Math.min(r23, Math.min(r115, r122))), (int) r03, (int) Math.max(r14, Math.max(r23, Math.max(r115, r122))));
    L37:
        return new Rect();
    }

    /* JADX INFO: renamed from: b */
    public static final Painter m3976b(LayoutNode r6) {
        List r62 = r6.getModifierInfo();
        int r0 = r62.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L18;
        Modifier r3 = ((ModifierInfo) r62.get(r2)).getModifier();
        if (AbstractC2564tz.m5051L(r3.getClass().getName(), "Painter", false) == true) goto L14;
        r2 = r2 + 1;
        goto L3
    L14:
        Field r63 = r3.getClass().getDeclaredField("painter");     // Catch: Throwable -> L13
        r63.setAccessible(true);     // Catch: Throwable -> L13
        Object r64 = r63.get(r3);     // Catch: Throwable -> L13
        if ((r64 instanceof Painter) == false) goto L11;
        return (Painter) r64;
    L11:
        return null;
    L17:
        return null;
    L18:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final C1808h m3977c(LayoutNode r10) {
        List r102 = r10.getModifierInfo();
        int r0 = r102.size();
        Color r4 = null;
        int r3 = 0;
        boolean r5 = false;
    L3:
        if (r3 >= r0) goto L19;
        Modifier r6 = ((ModifierInfo) r102.get(r3)).getModifier();
        String r7 = r6.getClass().getName();
        if (AbstractC2564tz.m5051L(r7, "Text", false) == false) goto L15;
        Field r42 = r6.getClass().getDeclaredField("color");     // Catch: Throwable -> L20
        r42.setAccessible(true);     // Catch: Throwable -> L20
        Object r43 = r42.get(r6);     // Catch: Throwable -> L20
        if ((r43 instanceof ColorProducer) == false) goto L9;
        ColorProducer r44 = (ColorProducer) r43;     // Catch: Throwable -> L20
    L10:
        if (r44 == null) goto L13;
        r4 = Color.box-impl(r44.invoke-0d7_KjU());     // Catch: Throwable -> L20
    L17:
        r3 = r3 + 1;
        goto L3
    L9:
        r44 = null;
    L13:
        r4 = null;
        goto L17
    L15:
        if (AbstractC2564tz.m5051L(r7, "Fill", false) == false) goto L17;
        r5 = true;
        goto L17
    L19:
        return new C1808h(r4, r5);
    }
}
