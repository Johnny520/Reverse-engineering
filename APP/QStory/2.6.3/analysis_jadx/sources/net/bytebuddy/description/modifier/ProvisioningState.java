package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.ModifierContributor;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum ProvisioningState implements ModifierContributor.ForModule, ModifierContributor.ForModule.OfRequire, ModifierContributor.ForModule.OfExport, ModifierContributor.ForModule.OfOpen, ModifierContributor.ForParameter {
    PLAIN(0),
    MANDATED(32768);

    private final int mask;

    ProvisioningState(int i) {
        this.mask = i;
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public int getMask() {
        return this.mask;
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public int getRange() {
        return 32768;
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
        return this == PLAIN;
    }

    public boolean isMandated() {
        return this == MANDATED;
    }
}
