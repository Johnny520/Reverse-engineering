package yyds;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.android.app.CustomRecyclerView;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛱᛱᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0046 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ View f536;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f537;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ View f538;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f539;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f540;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f541;

    public /* synthetic */ C0046(Object obj, int i, Object obj2, View view, View view2, int i2) {
        this.f539 = i2;
        this.f537 = obj;
        this.f541 = i;
        this.f540 = obj2;
        this.f538 = view;
        this.f536 = view2;
    }

    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final Object mo371(Object obj) {
        int i = this.f539;
        C2746 c2746 = C2746.f13459;
        View view = this.f536;
        View view2 = this.f538;
        Object obj2 = this.f540;
        int i2 = this.f541;
        Object obj3 = this.f537;
        switch (i) {
            case 0:
                C1417 c1417 = (C1417) obj2;
                EditText editText = (EditText) view2;
                Integer num = (Integer) obj;
                ((C0912) obj3).m2025();
                if (num != null) {
                    int iIntValue = (((i2 >>> 24) & 255) << 24) | (num.intValue() & 16777215);
                    C1509 c1509 = C1509.f7142;
                    c1509.getClass();
                    C1509.f7256.m1581(C1509.f7179[77], Integer.valueOf(iIntValue));
                    c1417.f6702 = true;
                    editText.setText(C0644.m1544(iIntValue));
                    c1417.f6702 = false;
                    c1509.getClass();
                    view.setBackgroundColor(C1509.m3079());
                    C0644.m1542();
                }
                break;
            default:
                Context context = (Context) obj3;
                CustomRecyclerView customRecyclerView = (CustomRecyclerView) obj2;
                CustomRecyclerView customRecyclerView2 = (CustomRecyclerView) view2;
                LinearLayout linearLayout = (LinearLayout) view;
                List list = (List) obj;
                AbstractC2328.m4341(-985252185670510L);
                if (!list.isEmpty()) {
                    customRecyclerView.setAdapter(new C1460(context, list, i2, new C0485(context, 1)));
                    customRecyclerView.setVisibility(0);
                    customRecyclerView2.setVisibility(8);
                    linearLayout.setVisibility(8);
                } else {
                    customRecyclerView.setVisibility(8);
                    customRecyclerView2.setVisibility(8);
                    linearLayout.setVisibility(0);
                }
                break;
        }
        return c2746;
    }
}
