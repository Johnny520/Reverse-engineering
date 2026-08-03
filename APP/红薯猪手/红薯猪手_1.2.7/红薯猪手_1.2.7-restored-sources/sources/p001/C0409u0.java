package p001;

import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ۟.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0409u0 extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0461y0 f1120;

    public C0409u0(C0461y0 c0461y0) {
        this.f1120 = c0461y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090("param", methodHookParam2);
        C0461y0 c0461y0 = this.f1120;
        C0325n8.f994.getClass();
        View viewM1159 = C0325n8.m1159(methodHookParam2);
        if (viewM1159 != null) {
            String str = C0283k8.f1632.f887;
            C0237h4.m1089("MatrixNoteDetailRIdCls", str);
            Integer numM1206 = C0373r3.m1206(str, "noteTitleTV");
            TextView textView = (TextView) viewM1159.findViewById(numM1206 != null ? numM1206.intValue() : -1);
            String str2 = C0283k8.f1632.f887;
            C0237h4.m1089("MatrixNoteDetailRIdCls", str2);
            Integer numM12062 = C0373r3.m1206(str2, "imageNoteTextView");
            View viewFindViewById = viewM1159.findViewById(numM12062 != null ? numM12062.intValue() : -1);
            if (viewFindViewById != null) {
                textView.setOnLongClickListener(new ViewOnLongClickListenerC0396t0(methodHookParam2, c0461y0, 0));
                viewFindViewById.setOnLongClickListener(new ViewOnLongClickListenerC0396t0(methodHookParam2, c0461y0, 1));
            }
        }
        return C0433vb.f1163;
    }
}
