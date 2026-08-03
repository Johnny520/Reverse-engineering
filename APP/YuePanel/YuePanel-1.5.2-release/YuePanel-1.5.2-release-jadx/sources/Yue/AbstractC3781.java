package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3781 implements Iterator<Character>, InterfaceC5591 {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(mo467());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final Character m827() {
        return Character.valueOf(mo467());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract char mo467();
}
