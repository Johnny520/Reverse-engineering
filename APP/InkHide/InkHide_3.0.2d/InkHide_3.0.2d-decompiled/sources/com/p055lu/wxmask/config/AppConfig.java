package com.p055lu.wxmask.config;

import p053c.InterfaceC0508a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0508a
public final class AppConfig {
    private MainUi mainUi;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AppConfig(MainUi mainUi) {
        this.mainUi = mainUi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MainUi getMainUi() {
        return this.mainUi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMainUi(MainUi mainUi) {
        this.mainUi = mainUi;
    }

    public AppConfig() {
        this(null);
    }
}
