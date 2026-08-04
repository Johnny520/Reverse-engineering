package yyds;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛲᲁᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0450 extends AbstractC0342 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f2282;

    @Override // yyds.AbstractC0342
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1028(int i) {
        Bundle arguments = this.f1788.getArguments();
        if (i != (arguments == null ? 0 : arguments.getInt("request_code"))) {
            return;
        }
        int i2 = this.f2282;
        if (i2 > 0) {
            this.f2282 = i2 - 1;
            return;
        }
        ArrayList arrayList = AbstractC1885.f9520;
        synchronized (AbstractC1885.class) {
            AbstractC1885.f9520.remove(Integer.valueOf(i));
        }
        m1027();
    }

    @Override // yyds.AbstractC0342
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1030(Activity activity, ArrayList arrayList, int i) {
        ArrayList arrayListM1833;
        PackageManager packageManager;
        AbstractFragmentC1695 abstractFragmentC1695 = this.f1788;
        if (arrayList.isEmpty()) {
            arrayListM1833 = AbstractC0797.m1833(activity);
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0333 abstractC0333 = (AbstractC0333) it.next();
                if (abstractC0333.mo1015() > Build.VERSION.SDK_INT) {
                    arrayList2.remove(abstractC0333);
                } else {
                    List listMo1018 = abstractC0333.mo1018();
                    if (listMo1018 != null) {
                        ArrayList arrayList3 = (ArrayList) listMo1018;
                        if (!arrayList3.isEmpty()) {
                            if (abstractC0333.mo1012(activity) != 2) {
                                if (!arrayList3.isEmpty()) {
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        if (((AbstractC0333) it2.next()).mo1012(activity) == 2) {
                                        }
                                    }
                                }
                            }
                            arrayList2.removeAll(listMo1018);
                            break;
                        }
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                arrayListM1833 = AbstractC0797.m1833(activity);
            } else if (arrayList2.size() == 1) {
                arrayListM1833 = ((AbstractC0333) arrayList2.get(0)).mo1019(activity);
            } else {
                ArrayList arrayListMo1019 = ((AbstractC0333) arrayList2.get(0)).mo1019(activity);
                int i2 = 1;
                loop4: while (i2 < arrayList2.size()) {
                    ArrayList arrayListMo10192 = ((AbstractC0333) arrayList2.get(i2)).mo1019(activity);
                    if (arrayListMo10192.size() != arrayListMo1019.size()) {
                        break;
                    }
                    for (int i3 = 0; i3 < arrayListMo10192.size(); i3++) {
                        if (!((Intent) arrayListMo10192.get(i3)).filterEquals((Intent) arrayListMo1019.get(i3))) {
                            break loop4;
                        }
                    }
                    if (i2 == arrayList2.size() - 1) {
                        arrayListM1833 = arrayListMo10192;
                        break;
                    } else {
                        i2++;
                        arrayListMo1019 = arrayListMo10192;
                    }
                }
                arrayListM1833 = AbstractC0797.m1833(activity);
            }
        }
        Iterator it3 = arrayListM1833.iterator();
        while (it3.hasNext()) {
            Intent intent = (Intent) it3.next();
            if (!((intent == null || (packageManager = activity.getPackageManager()) == null) ? false : !(Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)).isEmpty() : packageManager.queryIntentActivities(intent, 65536).isEmpty()))) {
                it3.remove();
            }
        }
        if (arrayListM1833.isEmpty()) {
            arrayListM1833.add(new Intent("android.settings.SETTINGS"));
        }
        Iterator it4 = arrayListM1833.iterator();
        while (it4.hasNext()) {
            Intent intent2 = (Intent) it4.next();
            if (intent2 != null) {
                try {
                    abstractFragmentC1695.startActivityForResult(intent2, i);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    if (it4.hasNext()) {
                        this.f2282++;
                    }
                }
            }
        }
        AbstractC0374.m1075(arrayList);
    }
}
