package androidx.activity;

import androidx.fragment.app.C0443u;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: androidx.activity.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0377h implements InterfaceC0370a {

    /* JADX INFO: renamed from: a */
    public final C0443u f905a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0378i f906b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0377h(C0378i c0378i, C0443u c0443u) {
        this.f906b = c0378i;
        this.f905a = c0443u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.InterfaceC0370a
    public final void cancel() {
        ArrayDeque arrayDeque = this.f906b.f908b;
        C0443u c0443u = this.f905a;
        arrayDeque.remove(c0443u);
        c0443u.f1414b.remove(this);
    }
}
