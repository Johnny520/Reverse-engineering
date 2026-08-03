package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: R9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0740R9 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f2366c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ KeyEvent.Callback f2367d;

    public /* synthetic */ C0740R9(C1495ha c1495ha, boolean z, Activity activity, int i) {
        this.f2364a = i;
        this.f2365b = c1495ha;
        this.f2366c = z;
        this.f2367d = activity;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) throws IllegalAccessException, InvocationTargetException {
        switch (this.f2364a) {
            case 0:
                final C1495ha c1495ha = (C1495ha) this.f2365b;
                final boolean z = this.f2366c;
                final Activity activity = (Activity) this.f2367d;
                AbstractC0295Gu.m625r(-101846559488053L);
                C0183EA.f539a.getClass();
                C0183EA.m382j((String) obj);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: T9
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1495ha c1495ha2 = c1495ha;
                        C0987Wz c0987Wz = c1495ha2.f5270g;
                        if (c0987Wz != null) {
                            c0987Wz.setRefreshing(false);
                        }
                        if (z) {
                            Toast.makeText(activity, AbstractC0295Gu.m625r(-101825084651573L), 0).show();
                        }
                        c1495ha2.m2861g();
                    }
                });
                break;
            case 1:
                final C1495ha c1495ha2 = (C1495ha) this.f2365b;
                final boolean z2 = this.f2366c;
                final Activity activity2 = (Activity) this.f2367d;
                final String str = (String) obj;
                AbstractC0295Gu.m625r(-101915278964789L);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: S9
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0987Wz c0987Wz = c1495ha2.f5270g;
                        if (c0987Wz != null) {
                            c0987Wz.setRefreshing(false);
                        }
                        if (z2) {
                            Toast.makeText(activity2, AbstractC0295Gu.m625r(-101885214193717L) + str, 0).show();
                        }
                    }
                });
                break;
            default:
                C0276Gb c0276Gb = (C0276Gb) this.f2365b;
                ListView listView = (ListView) this.f2367d;
                boolean z3 = this.f2366c;
                EnumC0319Hb enumC0319Hb = (EnumC0319Hb) obj;
                AbstractC0295Gu.m625r(-23725399341109L);
                C0577Nb.f1873c = enumC0319Hb;
                c0276Gb.m558a(enumC0319Hb);
                ListAdapter adapter = listView.getAdapter();
                AbstractC0295Gu.m625r(-23768349014069L);
                ListAdapter wrappedAdapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                AbstractC0295Gu.m625r(-22436909152309L);
                BaseAdapter baseAdapter = (BaseAdapter) wrappedAdapter;
                if (!z3) {
                    LinkedHashMap linkedHashMap = AbstractC1257cG.f4258a;
                    C1214bG c1214bG = (C1214bG) linkedHashMap.get(AbstractC0295Gu.m625r(-585386862573621L));
                    Object obj2 = c1214bG != null ? c1214bG.f4146a : null;
                    Method method = obj2 instanceof Method ? (Method) obj2 : null;
                    if (method != null) {
                        method.invoke(baseAdapter, Boolean.TRUE);
                    }
                    C1214bG c1214bG2 = (C1214bG) linkedHashMap.get(AbstractC0295Gu.m625r(-585223653816373L));
                    Object obj3 = c1214bG2 != null ? c1214bG2.f4146a : null;
                    Method method2 = obj3 instanceof Method ? (Method) obj3 : null;
                    if (method2 != null) {
                        method2.invoke(listView, null);
                    }
                }
                baseAdapter.notifyDataSetChanged();
                break;
        }
        return C0829TC.f2620a;
    }

    public /* synthetic */ C0740R9(C0276Gb c0276Gb, ListView listView, boolean z) {
        this.f2364a = 2;
        this.f2365b = c0276Gb;
        this.f2367d = listView;
        this.f2366c = z;
    }
}
