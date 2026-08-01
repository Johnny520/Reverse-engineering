package p181m4;

import android.view.View;
import p005a4.AbstractC0064b;

/* JADX INFO: renamed from: m4.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4977n {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4973j m20086a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(AbstractC4964a.f15102a);
            InterfaceC4973j interfaceC4973j = tag instanceof InterfaceC4973j ? (InterfaceC4973j) tag : null;
            if (interfaceC4973j != null) {
                return interfaceC4973j;
            }
            Object objM219a = AbstractC0064b.m219a(view);
            view = objM219a instanceof View ? (View) objM219a : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m20087b(View view, InterfaceC4973j interfaceC4973j) {
        view.getClass();
        view.setTag(AbstractC4964a.f15102a, interfaceC4973j);
    }
}
