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

    public C0734c(AbstractC0735d abstractC0735d, ByteBuffer byteBuffer) {
        this.f2572b = abstractC0735d;
        this.f2571a = byteBuffer;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f2572b.keysCompare((Integer) obj, (Integer) obj2, this.f2571a);
    }
}
