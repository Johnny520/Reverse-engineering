package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes.dex */
public enum FieldUsingType {
    Read,
    Write;

    public final boolean isRead() {
        return this == Read;
    }

    public final boolean isWrite() {
        return this == Write;
    }
}
