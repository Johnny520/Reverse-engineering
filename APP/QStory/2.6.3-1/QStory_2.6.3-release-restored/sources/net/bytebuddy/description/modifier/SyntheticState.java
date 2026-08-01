package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.ModifierContributor;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum SyntheticState implements ModifierContributor.ForType, ModifierContributor.ForModule, ModifierContributor.ForModule.OfRequire, ModifierContributor.ForModule.OfExport, ModifierContributor.ForModule.OfOpen, ModifierContributor.ForMethod, ModifierContributor.ForField, ModifierContributor.ForParameter {
    PLAIN(0),
    SYNTHETIC(4096);

    private final int mask;

    SyntheticState(int i) {
        this.mask = i;
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public int getMask() {
        return this.mask;
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public int getRange() {
        return 4096;
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
        return this == PLAIN;
    }

    public boolean isSynthetic() {
        return this == SYNTHETIC;
    }
}
