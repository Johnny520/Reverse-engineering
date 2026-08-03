package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;

/* JADX INFO: renamed from: io.sentry.rrweb.d */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1988d extends Enum implements InterfaceC1567C0 {
    private static final /* synthetic */ EnumC1988d[] $VALUES = null;
    public static final EnumC1988d AdoptedStyleSheet = null;
    public static final EnumC1988d CanvasMutation = null;
    public static final EnumC1988d CustomElement = null;
    public static final EnumC1988d Drag = null;
    public static final EnumC1988d Font = null;
    public static final EnumC1988d Input = null;
    public static final EnumC1988d Log = null;
    public static final EnumC1988d MediaInteraction = null;
    public static final EnumC1988d MouseInteraction = null;
    public static final EnumC1988d MouseMove = null;
    public static final EnumC1988d Mutation = null;
    public static final EnumC1988d Scroll = null;
    public static final EnumC1988d Selection = null;
    public static final EnumC1988d StyleDeclaration = null;
    public static final EnumC1988d StyleSheetRule = null;
    public static final EnumC1988d TouchMove = null;
    public static final EnumC1988d ViewportResize = null;

    private static /* synthetic */ EnumC1988d[] $values() {
        return new EnumC1988d[]{Mutation, MouseMove, MouseInteraction, Scroll, ViewportResize, Input, TouchMove, MediaInteraction, StyleSheetRule, CanvasMutation, Font, Log, Drag, StyleDeclaration, Selection, AdoptedStyleSheet, CustomElement};
    }

    static {
        Mutation = new EnumC1988d("Mutation", 0);
        MouseMove = new EnumC1988d("MouseMove", 1);
        MouseInteraction = new EnumC1988d("MouseInteraction", 2);
        Scroll = new EnumC1988d("Scroll", 3);
        ViewportResize = new EnumC1988d("ViewportResize", 4);
        Input = new EnumC1988d("Input", 5);
        TouchMove = new EnumC1988d("TouchMove", 6);
        MediaInteraction = new EnumC1988d("MediaInteraction", 7);
        StyleSheetRule = new EnumC1988d("StyleSheetRule", 8);
        CanvasMutation = new EnumC1988d("CanvasMutation", 9);
        Font = new EnumC1988d("Font", 10);
        Log = new EnumC1988d("Log", 11);
        Drag = new EnumC1988d("Drag", 12);
        StyleDeclaration = new EnumC1988d("StyleDeclaration", 13);
        Selection = new EnumC1988d("Selection", 14);
        AdoptedStyleSheet = new EnumC1988d("AdoptedStyleSheet", 15);
        CustomElement = new EnumC1988d("CustomElement", 16);
        $VALUES = $values();
    }

    EnumC1988d(String r1, int r2) {
    }

    public static EnumC1988d valueOf(String r1) {
        return (EnumC1988d) Enum.valueOf(EnumC1988d.class, r1);
    }

    public static EnumC1988d[] values() {
        return (EnumC1988d[]) $VALUES.clone();
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 r3, ILogger r4) {
        ((C1901c) r3).m4111v(ordinal());
    }
}
