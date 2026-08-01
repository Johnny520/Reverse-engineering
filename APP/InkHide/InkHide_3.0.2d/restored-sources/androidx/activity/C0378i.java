package androidx.activity;

import androidx.fragment.app.C0437o;
import androidx.fragment.app.C0443u;
import androidx.fragment.app.C0448z;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.EnumC0479n;
import androidx.lifecycle.InterfaceC0484s;
import java.util.ArrayDeque;
import java.util.Iterator;
import p061e.AbstractActivityC0533i;
import p064f0.C0556b;

/* JADX INFO: renamed from: androidx.activity.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0378i {

    /* JADX INFO: renamed from: a */
    public final Runnable f907a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f908b = new ArrayDeque();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0378i(Runnable runnable) {
        this.f907a = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m641a(InterfaceC0484s interfaceC0484s, C0443u c0443u) {
        C0486u c0486uMo636c = interfaceC0484s.mo636c();
        if (c0486uMo636c.f1528c == EnumC0479n.f1517a) {
            return;
        }
        c0443u.f1414b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, c0486uMo636c, c0443u));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m642b() {
        Iterator itDescendingIterator = this.f908b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C0443u c0443u = (C0443u) itDescendingIterator.next();
            if (c0443u.f1413a) {
                switch (c0443u.f1415c) {
                    case 0:
                        C0448z c0448z = (C0448z) c0443u.f1416d;
                        c0448z.m899v(true);
                        if (!c0448z.f1437h.f1413a) {
                            c0448z.f1436g.m642b();
                        } else {
                            c0448z.m867K();
                        }
                        break;
                    default:
                        C0556b c0556b = (C0556b) c0443u.f1416d;
                        c0556b.getClass();
                        c0443u.f1413a = false;
                        C0437o c0437o = c0556b.f1383t;
                        AbstractActivityC0533i abstractActivityC0533i = c0437o == null ? null : c0437o.f1394d;
                        if (abstractActivityC0533i != null) {
                            abstractActivityC0533i.onBackPressed();
                        }
                        break;
                }
                return;
            }
        }
        Runnable runnable = this.f907a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
