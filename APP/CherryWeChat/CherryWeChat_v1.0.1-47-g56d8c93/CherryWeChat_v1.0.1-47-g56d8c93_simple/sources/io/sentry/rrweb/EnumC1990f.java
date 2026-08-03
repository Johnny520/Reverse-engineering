package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;

/* JADX INFO: renamed from: io.sentry.rrweb.f */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1990f extends Enum implements InterfaceC1567C0 {
    private static final /* synthetic */ EnumC1990f[] $VALUES = null;
    public static final EnumC1990f Blur = null;
    public static final EnumC1990f Click = null;
    public static final EnumC1990f ContextMenu = null;
    public static final EnumC1990f DblClick = null;
    public static final EnumC1990f Focus = null;
    public static final EnumC1990f MouseDown = null;
    public static final EnumC1990f MouseUp = null;
    public static final EnumC1990f TouchCancel = null;
    public static final EnumC1990f TouchEnd = null;
    public static final EnumC1990f TouchMove_Departed = null;
    public static final EnumC1990f TouchStart = null;

    private static /* synthetic */ EnumC1990f[] $values() {
        return new EnumC1990f[]{MouseUp, MouseDown, Click, ContextMenu, DblClick, Focus, Blur, TouchStart, TouchMove_Departed, TouchEnd, TouchCancel};
    }

    static {
        MouseUp = new EnumC1990f("MouseUp", 0);
        MouseDown = new EnumC1990f("MouseDown", 1);
        Click = new EnumC1990f("Click", 2);
        ContextMenu = new EnumC1990f("ContextMenu", 3);
        DblClick = new EnumC1990f("DblClick", 4);
        Focus = new EnumC1990f("Focus", 5);
        Blur = new EnumC1990f("Blur", 6);
        TouchStart = new EnumC1990f("TouchStart", 7);
        TouchMove_Departed = new EnumC1990f("TouchMove_Departed", 8);
        TouchEnd = new EnumC1990f("TouchEnd", 9);
        TouchCancel = new EnumC1990f("TouchCancel", 10);
        $VALUES = $values();
    }

    EnumC1990f(String r1, int r2) {
    }

    public static EnumC1990f valueOf(String r1) {
        return (EnumC1990f) Enum.valueOf(EnumC1990f.class, r1);
    }

    public static EnumC1990f[] values() {
        return (EnumC1990f[]) $VALUES.clone();
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 r3, ILogger r4) {
        ((C1901c) r3).m4111v(ordinal());
    }
}
