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

    public /* synthetic */ ViewGroupOnHierarchyChangeListenerC1191au(int i, int i2) {
        this.f4076a = i2;
        this.f4077b = i;
    }

    /* JADX INFO: renamed from: a */
    private final void m2295a(View view, View view2) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2296b(View view, View view2) {
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        switch (this.f4076a) {
            case 0:
                AbstractC0295Gu.m625r(-474237403920437L);
                ViewGroup viewGroup = (ViewGroup) view2;
                View viewFindViewById = viewGroup.findViewById(AbstractC0828TB.f2614f);
                String strM625r = AbstractC0295Gu.m625r(-473945346144309L);
                int i = this.f4077b;
                Object[] objArr = {Integer.valueOf(i)};
                AbstractC0295Gu.m625r(-578325936338997L);
                XposedHelpers.callMethod(viewFindViewById, strM625r, Arrays.copyOf(objArr, 1));
                ((TextView) viewGroup.findViewById(AbstractC0828TB.f2616h)).setTextColor(i);
                break;
            default:
                AbstractC0295Gu.m625r(-474001180719157L);
                ViewGroup viewGroup2 = (ViewGroup) view2;
                View viewFindViewById2 = viewGroup2.findViewById(AbstractC0828TB.f2614f);
                String strM625r2 = AbstractC0295Gu.m625r(-474808634570805L);
                int i2 = this.f4077b;
                Object[] objArr2 = {Integer.valueOf(i2)};
                AbstractC0295Gu.m625r(-578325936338997L);
                XposedHelpers.callMethod(viewFindViewById2, strM625r2, Arrays.copyOf(objArr2, 1));
                ((TextView) viewGroup2.findViewById(AbstractC0828TB.f2616h)).setTextColor(i2);
                break;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        int i = this.f4076a;
    }
}
