package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ki0 extends tj {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ss.a():java.lang.Object, ts.a():java.lang.Object, v70.c(org.luckypray.dexkit.DexKitBridge, in0):void] */
    public /* synthetic */ ki0(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        switch (this.h) {
            case 0:
                if (obj instanceof ji0) {
                    return super.contains((ji0) obj);
                }
                return false;
            default:
                if (obj instanceof ug1) {
                    return super.contains((ug1) obj);
                }
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        switch (this.h) {
            case 0:
                if (obj instanceof ji0) {
                    return super.indexOf((ji0) obj);
                }
                return -1;
            default:
                if (obj instanceof ug1) {
                    return super.indexOf((ug1) obj);
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        switch (this.h) {
            case 0:
                if (obj instanceof ji0) {
                    return super.lastIndexOf((ji0) obj);
                }
                return -1;
            default:
                if (obj instanceof ug1) {
                    return super.lastIndexOf((ug1) obj);
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        switch (this.h) {
            case 0:
                if (obj instanceof ji0) {
                    return super.remove((ji0) obj);
                }
                return false;
            default:
                if (obj instanceof ug1) {
                    return super.remove((ug1) obj);
                }
                return false;
        }
    }
}
