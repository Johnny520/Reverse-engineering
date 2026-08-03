package com.google.android.material.color;

import Yue.InterfaceC3897;

/* JADX INFO: loaded from: classes.dex */
public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    public ColorRoles(@InterfaceC3897 int i, @InterfaceC3897 int i2, @InterfaceC3897 int i3, @InterfaceC3897 int i4) {
        this.accent = i;
        this.onAccent = i2;
        this.accentContainer = i3;
        this.onAccentContainer = i4;
    }

    @InterfaceC3897
    public int getAccent() {
        return this.accent;
    }

    @InterfaceC3897
    public int getAccentContainer() {
        return this.accentContainer;
    }

    @InterfaceC3897
    public int getOnAccent() {
        return this.onAccent;
    }

    @InterfaceC3897
    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}
