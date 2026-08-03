package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.AbstractC0041r;
import fun.box001.internal.dexformat.AbstractC0048y;
import java.util.Comparator;

/* JADX INFO: renamed from: g.h */
/* JADX INFO: loaded from: classes.dex */
final class C0097h implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f363a;

    public /* synthetic */ C0097h(int r1) {
        this.f363a = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r2, Object r3) {
        switch(this.f363a) {
            case 0: goto L6;
            default: goto L7;
        };
    L7:
        AbstractC0041r r32 = (AbstractC0041r) r3;
        ((AbstractC0041r) r2).getClass();
        throw null;
    L6:
        return ((AbstractC0048y) r2).m213a() - ((AbstractC0048y) r3).m213a();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r4) {
        switch(this.f363a) {
            case 0: goto L5;
            default: goto L9;
        };
    L5:
        if (r4 != this) goto L8;
        return true;
    L8:
        return false;
    L9:
        if (r4 != this) goto L12;
        return true;
    L12:
        return false;
    }
}
