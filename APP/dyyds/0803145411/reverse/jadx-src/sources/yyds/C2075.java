package yyds;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲀᲀᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2075 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10255;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f10256;

    public /* synthetic */ C2075(int i, Object obj) {
        this.f10255 = i;
        this.f10256 = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.f10255;
        int i3 = 0;
        Object obj = this.f10256;
        switch (i2) {
            case 0:
                C2600 c2600 = (C2600) obj;
                C1921 c1921 = c2600.f12801;
                c1921.setSelection(i);
                if (c1921.getOnItemClickListener() != null) {
                    c1921.performItemClick(view, i, c2600.f12797.getItemId(i));
                }
                c2600.dismiss();
                break;
            case 1:
                C1022 c1022 = (C1022) obj;
                C1022 c10222 = c1022.f4653;
                ArrayList arrayList = c1022.f4665;
                if (arrayList != null && i >= 0 && i < arrayList.size()) {
                    i = ((Integer) c1022.f4665.get(i)).intValue();
                }
                Boolean bool = (Boolean) c1022.f4651.get(Integer.valueOf(i));
                if (bool == null ? true : bool.booleanValue()) {
                    AbstractC0041.m263(view);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - c1022.f4649 > 100) {
                        c1022.f4649 = jCurrentTimeMillis;
                        float fAbs = Math.abs(c1022.f4669 - c1022.f3516.f12143.getY());
                        AbstractC0041.m256("#Click:deltaY= " + fAbs);
                        if (fAbs <= c1022.m275(15.0f)) {
                            c1022.f4659 = i;
                            AbstractC0041.m256("### onMenuItemClickListener=" + c1022.f4668);
                            int iM4012 = AbstractC2104.m4012(c1022.f4664);
                            if (iM4012 == 0) {
                                InterfaceC0413 interfaceC0413 = c1022.f4668;
                                if (interfaceC0413 == null) {
                                    c1022.m1712();
                                } else {
                                    interfaceC0413.mo1173(i, c10222);
                                    c1022.m1712();
                                }
                                break;
                            } else if (iM4012 == 1) {
                                InterfaceC0413 interfaceC04132 = c1022.f4668;
                                if (interfaceC04132 == null) {
                                    c1022.f21.notifyDataSetInvalidated();
                                } else {
                                    interfaceC04132.mo1173(i, c10222);
                                    c1022.m1712();
                                }
                                break;
                            } else if (iM4012 == 2) {
                                InterfaceC0413 interfaceC04133 = c1022.f4668;
                                if (interfaceC04133 == null) {
                                    boolean zContains = c1022.f4660.contains(Integer.valueOf(i));
                                    ArrayList arrayList2 = c1022.f4660;
                                    if (zContains) {
                                        arrayList2.remove(new Integer(i));
                                    } else {
                                        arrayList2.add(Integer.valueOf(i));
                                    }
                                    c1022.f21.notifyDataSetInvalidated();
                                    c1022.f4648 = new int[c1022.f4660.size()];
                                    c1022.f4657 = new CharSequence[c1022.f4660.size()];
                                    while (i3 < c1022.f4660.size()) {
                                        c1022.f4648[i3] = ((Integer) c1022.f4660.get(i3)).intValue();
                                        c1022.f4657[i3] = (CharSequence) c1022.f4663.get(c1022.f4648[i3]);
                                        i3++;
                                    }
                                } else {
                                    interfaceC04133.mo1173(i, c10222);
                                    c1022.m1712();
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                C0301 c0301 = (C0301) obj;
                Boolean bool2 = (Boolean) c0301.f1580.get(Integer.valueOf(i));
                if (bool2 == null ? true : bool2.booleanValue()) {
                    AbstractC0041.m263(view);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - c0301.f1589 > 100) {
                        c0301.f1589 = jCurrentTimeMillis2;
                        if (Math.abs(c0301.f18 - ((MaxRelativeLayout) c0301.f5436.f11241).getY()) <= c0301.m275(15.0f)) {
                            c0301.f1586 = i;
                            int iM40122 = AbstractC2104.m4012(c0301.f1582);
                            if (iM40122 == 0) {
                                c0301.m2387();
                                break;
                            } else if (iM40122 == 1) {
                                c0301.f1593.notifyDataSetInvalidated();
                                break;
                            } else if (iM40122 == 2) {
                                boolean zContains2 = c0301.f1587.contains(Integer.valueOf(i));
                                ArrayList arrayList3 = c0301.f1587;
                                if (zContains2) {
                                    arrayList3.remove(new Integer(i));
                                } else {
                                    arrayList3.add(Integer.valueOf(i));
                                }
                                c0301.f1593.notifyDataSetInvalidated();
                                c0301.f1591 = new int[c0301.f1587.size()];
                                c0301.f1590 = new CharSequence[c0301.f1587.size()];
                                while (i3 < c0301.f1587.size()) {
                                    c0301.f1591[i3] = ((Integer) c0301.f1587.get(i3)).intValue();
                                    c0301.f1590[i3] = (CharSequence) c0301.f1579.get(c0301.f1591[i3]);
                                    i3++;
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ((SearchView) obj).m69(i);
                break;
        }
    }
}
