package p002A1;

import p019D1.C0262c;
import p117X2.C1660e;

/* JADX INFO: renamed from: A1.M */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0124M {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    default AbstractC0122K mo168a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    /* JADX INFO: renamed from: b */
    AbstractC0122K mo149b(C1660e c1660e, C0262c c0262c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    default AbstractC0122K mo169c(Class cls, C0262c c0262c) {
        return mo168a(cls);
    }
}
