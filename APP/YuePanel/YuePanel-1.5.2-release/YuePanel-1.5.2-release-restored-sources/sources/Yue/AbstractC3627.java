package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3627 implements Iterator<Byte>, InterfaceC5591 {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Byte next() {
        return Byte.valueOf(mo466());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final Byte m683() {
        return Byte.valueOf(mo466());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract byte mo466();
}
