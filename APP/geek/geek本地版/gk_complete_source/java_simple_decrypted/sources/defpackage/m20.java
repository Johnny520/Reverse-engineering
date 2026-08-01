package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m20 implements Iterable {
    public final /* synthetic */ gg a;

    public m20(gg r1) {
        this.a = r1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fg(this.a);
    }
}
