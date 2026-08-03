package com.google.android.material.color.utilities;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class ToneDeltaPair {
    private final double delta;
    private final TonePolarity polarity;
    private final DynamicColor roleA;
    private final DynamicColor roleB;
    private final boolean stayTogether;

    public ToneDeltaPair(@InterfaceC6391 DynamicColor dynamicColor, @InterfaceC6391 DynamicColor dynamicColor2, double d, @InterfaceC6391 TonePolarity tonePolarity, boolean z) {
        this.roleA = dynamicColor;
        this.roleB = dynamicColor2;
        this.delta = d;
        this.polarity = tonePolarity;
        this.stayTogether = z;
    }

    public double getDelta() {
        return this.delta;
    }

    @InterfaceC6391
    public TonePolarity getPolarity() {
        return this.polarity;
    }

    @InterfaceC6391
    public DynamicColor getRoleA() {
        return this.roleA;
    }

    @InterfaceC6391
    public DynamicColor getRoleB() {
        return this.roleB;
    }

    public boolean getStayTogether() {
        return this.stayTogether;
    }
}
