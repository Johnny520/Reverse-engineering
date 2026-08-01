package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.textfield.C4020;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4575;
import p273.AbstractC9035;
import p273.C9034;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0965 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f887;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f888;

    public /* synthetic */ C0965(Object obj, int i) {
        this.f888 = i;
        this.f887 = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.f888;
        Object obj = this.f887;
        switch (i2) {
            case 0:
                C0962 c0962 = (C0962) obj;
                C1074 c1074 = c0962.f879;
                c1074.setSelection(i);
                if (c1074.getOnItemClickListener() != null) {
                    c1074.performItemClick(view, i, c0962.f882.getItemId(i));
                }
                c0962.dismiss();
                break;
            case 1:
                C4020 c4020 = (C4020) obj;
                C1029 c1029 = c4020.f11083;
                c4020.setText(c4020.convertSelectionToString(i < 0 ? !c1029.f1054.isShowing() ? null : c1029.f1078.getSelectedItem() : c4020.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = c4020.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c1029.f1054.isShowing() ? null : c1029.f1078.getSelectedView();
                        i = !c1029.f1054.isShowing() ? -1 : c1029.f1078.getSelectedItemPosition();
                        j = !c1029.f1054.isShowing() ? Long.MIN_VALUE : c1029.f1078.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c1029.f1078, view, i, j);
                }
                c1029.dismiss();
                break;
            default:
                C9034 c9034 = (C9034) obj;
                C9034 c90342 = c9034.f22945;
                Boolean bool = (Boolean) c9034.f22950.get(Integer.valueOf(i));
                if (bool == null ? true : bool.booleanValue()) {
                    AbstractC4570.m8595(view);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - c9034.f22946 > 100) {
                        c9034.f22946 = jCurrentTimeMillis;
                        if (Math.abs(c9034.f22947 - c9034.f22965.f22979.getY()) <= c9034.m8608(15.0f)) {
                            c9034.f22955 = i;
                            int i3 = AbstractC9035.f22956[c9034.f22951.ordinal()];
                            if (i3 == 1) {
                                InterfaceC4575 interfaceC4575 = c9034.f22953;
                                if (interfaceC4575 == null) {
                                    c9034.m14289();
                                } else if (!interfaceC4575.mo5045((CharSequence) c9034.f22949.get(i), c90342, i)) {
                                    c9034.m14289();
                                }
                                break;
                            } else if (i3 == 2) {
                                InterfaceC4575 interfaceC45752 = c9034.f22953;
                                if (interfaceC45752 == null) {
                                    c9034.f22948.notifyDataSetInvalidated();
                                } else if (!interfaceC45752.mo5045((CharSequence) c9034.f22949.get(i), c90342, i)) {
                                    c9034.m14289();
                                }
                                break;
                            } else if (i3 == 3) {
                                InterfaceC4575 interfaceC45753 = c9034.f22953;
                                interfaceC45753.getClass();
                                if (!interfaceC45753.mo5045((CharSequence) c9034.f22949.get(i), c90342, i)) {
                                    c9034.m14289();
                                }
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
