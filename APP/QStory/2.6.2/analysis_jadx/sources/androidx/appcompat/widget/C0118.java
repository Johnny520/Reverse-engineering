package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.textfield.C3187;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3742;
import p257.AbstractC8205;
import p257.C8204;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0118 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f542;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f543;

    public /* synthetic */ C0118(Object obj, int i) {
        this.f543 = i;
        this.f542 = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.f543;
        Object obj = this.f542;
        switch (i2) {
            case 0:
                C0115 c0115 = (C0115) obj;
                C0227 c0227 = c0115.f534;
                c0227.setSelection(i);
                if (c0227.getOnItemClickListener() != null) {
                    c0227.performItemClick(view, i, c0115.f537.getItemId(i));
                }
                c0115.dismiss();
                break;
            case 1:
                C3187 c3187 = (C3187) obj;
                C0182 c0182 = c3187.f10733;
                c3187.setText(c3187.convertSelectionToString(i < 0 ? !c0182.f709.isShowing() ? null : c0182.f733.getSelectedItem() : c3187.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = c3187.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c0182.f709.isShowing() ? null : c0182.f733.getSelectedView();
                        i = !c0182.f709.isShowing() ? -1 : c0182.f733.getSelectedItemPosition();
                        j = !c0182.f709.isShowing() ? Long.MIN_VALUE : c0182.f733.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0182.f733, view, i, j);
                }
                c0182.dismiss();
                break;
            default:
                C8204 c8204 = (C8204) obj;
                C8204 c82042 = c8204.f22601;
                Boolean bool = (Boolean) c8204.f22606.get(Integer.valueOf(i));
                if (bool == null ? true : bool.booleanValue()) {
                    AbstractC3737.m8049(view);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - c8204.f22602 > 100) {
                        c8204.f22602 = jCurrentTimeMillis;
                        if (Math.abs(c8204.f22603 - c8204.f22621.f22635.getY()) <= c8204.m8062(15.0f)) {
                            c8204.f22611 = i;
                            int i3 = AbstractC8205.f22612[c8204.f22607.ordinal()];
                            if (i3 == 1) {
                                InterfaceC3742 interfaceC3742 = c8204.f22609;
                                if (interfaceC3742 == null) {
                                    c8204.m13713();
                                } else if (!interfaceC3742.mo4475((CharSequence) c8204.f22605.get(i), c82042, i)) {
                                    c8204.m13713();
                                }
                                break;
                            } else if (i3 == 2) {
                                InterfaceC3742 interfaceC37422 = c8204.f22609;
                                if (interfaceC37422 == null) {
                                    c8204.f22604.notifyDataSetInvalidated();
                                } else if (!interfaceC37422.mo4475((CharSequence) c8204.f22605.get(i), c82042, i)) {
                                    c8204.m13713();
                                }
                                break;
                            } else if (i3 == 3) {
                                InterfaceC3742 interfaceC37423 = c8204.f22609;
                                interfaceC37423.getClass();
                                if (!interfaceC37423.mo4475((CharSequence) c8204.f22605.get(i), c82042, i)) {
                                    c8204.m13713();
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
