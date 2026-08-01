package p206n2;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: n2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2692d extends IllegalArgumentException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2692d(int i5, int i6) {
        super(AbstractC0231b.m399j("Unpaired surrogate at index ", i5, " of ", i6));
    }
}
