package p179m2;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;

/* JADX INFO: renamed from: m2.v1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4920v1 {

    /* JADX INFO: renamed from: m2.v1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ View f14895r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ View f14896s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, View view2) {
            super(1);
            this.f14895r = view;
            this.f14896s = view2;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(View view) {
            return Boolean.valueOf(AbstractC4920v1.m19890h(this.f14895r, view, view.getNextFocusForwardId()) == this.f14896s);
        }
    }

    /* JADX INFO: renamed from: m2.v1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ int f14897r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.f14897r = i10;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(View view) {
            return Boolean.valueOf(view.getId() == this.f14897r);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m19886d(View view, ArrayList arrayList, int i10) {
        view.addFocusables(arrayList, i10, view.isInTouchMode() ? 1 : 0);
    }

    /* JADX INFO: renamed from: e */
    public static final View m19887e(View view, View view2, int i10) {
        int nextFocusForwardId;
        if (i10 == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return m19888f(view2, view, new a(view2, view));
        }
        if (i10 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return m19890h(view2, view, nextFocusForwardId);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View m19888f(android.view.View r4, android.view.View r5, p010a9.InterfaceC0184l r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = m19889g(r5, r6, r1)
            if (r1 != 0) goto L1d
            if (r5 != r4) goto Lb
            goto L1d
        Lb:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L16
            goto L1c
        L16:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1c:
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p179m2.AbstractC4920v1.m19888f(android.view.View, android.view.View, a9.l):android.view.View");
    }

    /* JADX INFO: renamed from: g */
    public static final View m19889g(View view, InterfaceC0184l interfaceC0184l, View view2) {
        View viewM19889g;
        if (((Boolean) interfaceC0184l.mo27m(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != view2 && (viewM19889g = m19889g(childAt, interfaceC0184l, view2)) != null) {
                return viewM19889g;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final View m19890h(View view, View view2, int i10) {
        return m19888f(view, view2, new b(i10));
    }
}
