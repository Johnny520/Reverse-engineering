package com.google.flatbuffers;

import p034S.AbstractC0324d;

/* JADX INFO: renamed from: com.google.flatbuffers.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0737f extends IllegalArgumentException {
    public C0737f(int r3, int r4) {
        super(AbstractC0324d.m721d("Unpaired surrogate at index ", r3, " of ", r4));
    }
}
