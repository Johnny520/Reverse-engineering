package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.textfield.C3188;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3743;
import p257.AbstractC8206;
import p257.C8205;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
                C3188 c3188 = (C3188) obj;
                C0182 c0182 = c3188.f10738;
                c3188.setText(c3188.convertSelectionToString(i < 0 ? !c0182.f709.isShowing() ? null : c0182.f733.getSelectedItem() : c3188.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = c3188.getOnItemClickListener();
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
                C8205 c8205 = (C8205) obj;
                C8205 c82052 = c8205.f22600;
                Boolean bool = (Boolean) c8205.f22605.get(Integer.valueOf(i));
                if (bool == null ? true : bool.booleanValue()) {
                    AbstractC3738.m8036(view);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - c8205.f22601 > 100) {
                        c8205.f22601 = jCurrentTimeMillis;
                        if (Math.abs(c8205.f22602 - c8205.f22620.f22634.getY()) <= c8205.m8049(15.0f)) {
                            c8205.f22610 = i;
                            int i3 = AbstractC8206.f22611[c8205.f22606.ordinal()];
                            if (i3 == 1) {
                                InterfaceC3743 interfaceC3743 = c8205.f22608;
                                if (interfaceC3743 == null) {
                                    c8205.m13730();
                                } else if (!interfaceC3743.mo4485((CharSequence) c8205.f22604.get(i), c82052, i)) {
                                    c8205.m13730();
                                }
                                break;
                            } else if (i3 == 2) {
                                InterfaceC3743 interfaceC37432 = c8205.f22608;
                                if (interfaceC37432 == null) {
                                    c8205.f22603.notifyDataSetInvalidated();
                                } else if (!interfaceC37432.mo4485((CharSequence) c8205.f22604.get(i), c82052, i)) {
                                    c8205.m13730();
                                }
                                break;
                            } else if (i3 == 3) {
                                InterfaceC3743 interfaceC37433 = c8205.f22608;
                                interfaceC37433.getClass();
                                if (!interfaceC37433.mo4485((CharSequence) c8205.f22604.get(i), c82052, i)) {
                                    c8205.m13730();
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
