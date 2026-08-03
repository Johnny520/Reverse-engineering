package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import de.robv.android.xposed.XposedHelpers;
import java.util.Arrays;

/* JADX INFO: renamed from: au */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC1191au implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4076a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4077b;

    public /* synthetic */ ViewGroupOnHierarchyChangeListenerC1191au(int r1, int r2) {
        this.f4076a = r2;
        this.f4077b = r1;
    }

    /* JADX INFO: renamed from: a */
    private final void m2295a(View r1, View r2) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2296b(View r1, View r2) {
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View r6, View r7) {
        switch(this.f4076a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-474001180719157L);
        ViewGroup r72 = (ViewGroup) r7;
        View r62 = r72.findViewById(AbstractC0828TB.f2614f);
        String r0 = AbstractC0295Gu.m625r(-474808634570805L);
        int r1 = this.f4077b;
        Object[] r2 = {Integer.valueOf(r1)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r62, r0, Arrays.copyOf(r2, 1));
        ((TextView) r72.findViewById(AbstractC0828TB.f2616h)).setTextColor(r1);
        return;
    L6:
        AbstractC0295Gu.m625r(-474237403920437L);
        ViewGroup r73 = (ViewGroup) r7;
        View r63 = r73.findViewById(AbstractC0828TB.f2614f);
        String r02 = AbstractC0295Gu.m625r(-473945346144309L);
        int r12 = this.f4077b;
        Object[] r22 = {Integer.valueOf(r12)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r63, r02, Arrays.copyOf(r22, 1));
        ((TextView) r73.findViewById(AbstractC0828TB.f2616h)).setTextColor(r12);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View r1, View r2) {
        int r12 = this.f4076a;
    }
}
