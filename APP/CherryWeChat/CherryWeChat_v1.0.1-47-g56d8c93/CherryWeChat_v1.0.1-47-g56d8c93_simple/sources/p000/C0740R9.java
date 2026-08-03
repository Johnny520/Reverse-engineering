package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
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

    public /* synthetic */ C0740R9(C1495ha r1, boolean r2, Activity r3, int r4) {
        this.f2364a = r4;
        this.f2365b = r1;
        this.f2366c = r2;
        this.f2367d = r3;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r7) {
        switch(this.f2364a) {
            case 0: goto L30;
            case 1: goto L29;
            default: goto L4;
        };
    L4:
        C0276Gb r0 = (C0276Gb) this.f2365b;
        ListView r1 = (ListView) this.f2367d;
        boolean r2 = this.f2366c;
        EnumC0319Hb r72 = (EnumC0319Hb) r7;
        AbstractC0295Gu.m625r(-23725399341109L);
        C0577Nb.f1873c = r72;
        r0.m558a(r72);
        ListAdapter r73 = r1.getAdapter();
        AbstractC0295Gu.m625r(-23768349014069L);
        ListAdapter r74 = ((HeaderViewListAdapter) r73).getWrappedAdapter();
        AbstractC0295Gu.m625r(-22436909152309L);
        BaseAdapter r75 = (BaseAdapter) r74;
        if (r2 == true) goto L26;
        LinkedHashMap r02 = AbstractC1257cG.f4258a;
        C1214bG r22 = (C1214bG) r02.get(AbstractC0295Gu.m625r(-585386862573621L));
        if (r22 == null) goto L9;
        Object r23 = r22.f4146a;
    L11:
        if ((r23 instanceof Method) == false) goto L13;
        Method r24 = (Method) r23;
    L14:
        if (r24 == null) goto L16;
        r24.invoke(r75, new Object[]{Boolean.TRUE});
    L16:
        C1214bG r03 = (C1214bG) r02.get(AbstractC0295Gu.m625r(-585223653816373L));
        if (r03 == null) goto L19;
        Object r04 = r03.f4146a;
    L21:
        if ((r04 instanceof Method) == false) goto L23;
        Method r05 = (Method) r04;
    L24:
        if (r05 == null) goto L26;
        r05.invoke(r1, null);
        goto L26
    L23:
        r05 = null;
        goto L24
    L19:
        r04 = null;
        goto L21
    L13:
        r24 = null;
        goto L14
    L9:
        r23 = null;
    L26:
        r75.notifyDataSetChanged();
    L28:
        return C0829TC.f2620a;
    L29:
        final C1495ha r06 = (C1495ha) this.f2365b;
        final boolean r12 = this.f2366c;
        final Activity r25 = (Activity) this.f2367d;
        final String r76 = (String) r7;
        AbstractC0295Gu.m625r(-101915278964789L);
        new Handler(Looper.getMainLooper()).post(new RunnableC0783S9(r06, r12, r25, r76));
        goto L28
    L30:
        final C1495ha r07 = (C1495ha) this.f2365b;
        final boolean r13 = this.f2366c;
        final Activity r26 = (Activity) this.f2367d;
        AbstractC0295Gu.m625r(-101846559488053L);
        C0183EA.f539a.getClass();
        C0183EA.m382j((String) r7);
        new Handler(Looper.getMainLooper()).post(new RunnableC0826T9(r07, r13, r26));
        goto L28
    }

    public /* synthetic */ C0740R9(C0276Gb r2, ListView r3, boolean r4) {
        this.f2364a = 2;
        this.f2365b = r2;
        this.f2367d = r3;
        this.f2366c = r4;
    }
}
