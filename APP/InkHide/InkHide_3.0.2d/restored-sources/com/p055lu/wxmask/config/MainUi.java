package com.p055lu.wxmask.config;

import p053c.InterfaceC0508a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0508a
public final class MainUi {
    private DonateCard donateCard;
    private ModuleCard moduleCard;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MainUi(DonateCard donateCard, ModuleCard moduleCard) {
        this.donateCard = donateCard;
        this.moduleCard = moduleCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final DonateCard getDonateCard() {
        return this.donateCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ModuleCard getModuleCard() {
        return this.moduleCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDonateCard(DonateCard donateCard) {
        this.donateCard = donateCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setModuleCard(ModuleCard moduleCard) {
        this.moduleCard = moduleCard;
    }
}
