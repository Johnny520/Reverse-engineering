package defpackage;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gg implements i20 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public gg(File r2) {
        this.a = 1;
        this.b = r2;
        this.c = hk.a;
    }

    @Override // defpackage.i20
    public final Iterator iterator() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new fk(this);
    L7:
        return new fg(this);
    }

    public gg(CharSequence r2, oh r3) {
        this.a = 0;
        ip.o("input", r2);
        this.b = r2;
        this.c = r3;
    }
}
