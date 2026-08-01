package p040d0;

import android.view.textclassifier.TextClassification;
import p010a9.InterfaceC0184l;
import p056e0.C1965d;
import p056e0.C1969h;

/* JADX INFO: renamed from: d0.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1850c {
    /* JADX INFO: renamed from: a */
    public static final void m6545a(C1848a c1848a, Object obj, String str, int i10, InterfaceC0184l interfaceC0184l) {
        c1848a.m6540a(new C1965d(obj, str, i10, interfaceC0184l));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6546b(C1848a c1848a, Object obj, String str, int i10, InterfaceC0184l interfaceC0184l, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        m6545a(c1848a, obj, str, i10, interfaceC0184l);
    }

    /* JADX INFO: renamed from: c */
    public static final void m6547c(C1848a c1848a, Object obj, TextClassification textClassification, int i10) {
        c1848a.m6540a(new C1969h(obj, textClassification, i10));
    }
}
