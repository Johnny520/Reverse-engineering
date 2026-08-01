package com.p055lu.magic.p056ui;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0434l;
import androidx.fragment.app.C0416G;
import androidx.fragment.app.C0423a;
import androidx.fragment.app.C0448z;
import androidx.lifecycle.InterfaceC0470e;
import androidx.lifecycle.InterfaceC0484s;
import java.util.Stack;
import p027N0.AbstractC0223g;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentNavigation implements InterfaceC0470e {

    /* JADX INFO: renamed from: a */
    public ViewGroup f1623a;

    /* JADX INFO: renamed from: b */
    public C0448z f1624b;

    /* JADX INFO: renamed from: c */
    public Stack f1625c;

    /* JADX INFO: renamed from: d */
    public int f1626d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0470e
    /* JADX INFO: renamed from: b */
    public final void mo924b(InterfaceC0484s interfaceC0484s) {
        this.f1625c.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1028d(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        String string = abstractComponentCallbacksC0434l.getClass().toString();
        AbstractC0223g.m417d(string, "fragment.javaClass.toString()");
        C0448z c0448z = this.f1624b;
        if (c0448z == null) {
            AbstractC0223g.m420g("supportFragmentManager");
            throw null;
        }
        C0423a c0423a = new C0423a(c0448z);
        C0448z c0448z2 = this.f1624b;
        if (c0448z2 == null) {
            AbstractC0223g.m420g("supportFragmentManager");
            throw null;
        }
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l2 = c0448z2.f1446q;
        C0448z c0448z3 = c0423a.f1297p;
        if (abstractComponentCallbacksC0434l2 != null) {
            C0448z c0448z4 = abstractComponentCallbacksC0434l2.f1382s;
            if (c0448z4 != null && c0448z4 != c0448z3) {
                throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0434l2.toString() + " is already attached to a FragmentManager.");
            }
            c0423a.m820b(new C0416G(4, abstractComponentCallbacksC0434l2));
        }
        if (abstractComponentCallbacksC0434l.f1383t == null || !abstractComponentCallbacksC0434l.f1375l) {
            ViewGroup viewGroup = this.f1623a;
            if (viewGroup == null) {
                AbstractC0223g.m420g("fragmentContainer");
                throw null;
            }
            c0423a.m819a(viewGroup.getId(), abstractComponentCallbacksC0434l, string);
        }
        C0448z c0448z5 = abstractComponentCallbacksC0434l.f1382s;
        if (c0448z5 != null && c0448z5 != c0448z3) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0434l.toString() + " is already attached to a FragmentManager.");
        }
        c0423a.m820b(new C0416G(8, abstractComponentCallbacksC0434l));
        C0448z c0448z6 = abstractComponentCallbacksC0434l.f1382s;
        if (c0448z6 != null && c0448z6 != c0448z3) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0434l.toString() + " is already attached to a FragmentManager.");
        }
        c0423a.m820b(new C0416G(5, abstractComponentCallbacksC0434l));
        if (c0423a.f1288g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c0448z3.m900w(c0423a, false);
        Stack stack = this.f1625c;
        if (!stack.contains(abstractComponentCallbacksC0434l) && this.f1626d < stack.size()) {
            int i2 = this.f1626d;
            if (i2 > -1 && i2 != stack.size() - 1) {
                while (this.f1626d != stack.size() - 1) {
                    stack.pop();
                }
            }
            stack.add(abstractComponentCallbacksC0434l);
        }
        this.f1626d = stack.indexOf(abstractComponentCallbacksC0434l);
    }
}
