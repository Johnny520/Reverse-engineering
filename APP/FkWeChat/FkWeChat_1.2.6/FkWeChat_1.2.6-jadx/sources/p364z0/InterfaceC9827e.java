package p364z0;

import java.util.Collection;
import java.util.List;
import p010a9.InterfaceC0184l;
import p036c9.InterfaceC1401b;
import p036c9.InterfaceC1403d;

/* JADX INFO: renamed from: z0.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9827e extends InterfaceC9825c, InterfaceC9824b {

    /* JADX INFO: renamed from: z0.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a extends List, Collection, InterfaceC1401b, InterfaceC1403d {
        InterfaceC9827e build();
    }

    InterfaceC9827e add(int i10, Object obj);

    InterfaceC9827e add(Object obj);

    InterfaceC9827e addAll(Collection collection);

    a builder();

    /* JADX INFO: renamed from: f */
    InterfaceC9827e mo32f(InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: k */
    InterfaceC9827e mo33k(int i10);

    InterfaceC9827e remove(Object obj);

    InterfaceC9827e removeAll(Collection collection);

    InterfaceC9827e set(int i10, Object obj);
}
