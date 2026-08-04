package yyds;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: yyds.ᛲᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0358 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1867;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f1868;

    public /* synthetic */ ViewOnLongClickListenerC0358(int i, Object obj) {
        this.f1867 = i;
        this.f1868 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f1867;
        InterfaceC0274 interfaceC0274 = null;
        Object obj = this.f1868;
        switch (i) {
            case 0:
                ((C0184) obj).m766();
                break;
            case 1:
                View view2 = (View) obj;
                C1509.f7142.getClass();
                C1509.f7164.m1581(C1509.f7179[134], Boolean.valueOf(!C1509.m3048()));
                if (C1509.m3048()) {
                    view2.setAlpha(0.0f);
                } else {
                    view2.setAlpha(1.0f);
                }
                AbstractC1960.m3789(AbstractC2328.m4341(C1509.m3048() ? -859147650892654L : -859164830761838L));
                break;
            case 2:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0219((Comment) obj, interfaceC0274, 2), 3);
                break;
            case 3:
                AbstractC1108.m2308(obj);
                break;
            case 4:
                Context context = (Context) obj;
                AbstractC2328.m4341(-232559167046510L);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setPadding(0, AbstractC1426.m2904(8), 0, AbstractC1426.m2904(4));
                String strM4341 = AbstractC2328.m4341(-232593526784878L);
                C1509.f7142.getClass();
                linearLayout.addView(AbstractC0090.m488(context, strM4341, C1509.m3054(), new C0514(18)));
                linearLayout.addView(AbstractC0090.m488(context, AbstractC2328.m4341(-232623591555950L), ((Boolean) C1509.f7235.m1579(C1509.f7179[57])).booleanValue(), new C0514(19)));
                new AlertDialog.Builder(context).setTitle(AbstractC2328.m4341(-232662246261614L)).setView(linearLayout).setPositiveButton(AbstractC2328.m4341(-232683721098094L), (DialogInterface.OnClickListener) null).show();
                break;
            case 5:
                Context context2 = view.getContext();
                AbstractC2328.m4341(-749853618111342L);
                C0469.m1267(context2, new C1223(20, (LinkedHashMap) obj));
                break;
            case 6:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C2793((Aweme) obj, null, 4), 3);
                break;
            default:
                Context context3 = ((TextView) obj).getContext();
                AbstractC2328.m4341(-218888286143342L);
                C0469.m1256(context3);
                break;
        }
        return true;
    }
}
