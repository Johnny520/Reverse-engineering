package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.flatbuffers.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0734c implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteBuffer f2571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0735d f2572b;

    public C0734c(AbstractC0735d r1, ByteBuffer r2) {
        this.f2572b = r1;
        this.f2571a = r2;
    }

    @Override // java.util.Comparator
    public final int compare(Object r3, Object r4) {
        AbstractC0735d r02 = this.f2572b;
        return r02.keysCompare((Integer) r3, (Integer) r4, this.f2571a);
    }
}
