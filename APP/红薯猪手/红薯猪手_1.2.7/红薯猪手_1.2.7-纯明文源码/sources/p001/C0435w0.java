package p001;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ۟.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0435w0 extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0461y0 f1165;

    public C0435w0(C0461y0 c0461y0) {
        this.f1165 = c0461y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090("param", methodHookParam2);
        final int i = 0;
        final Object obj = methodHookParam2.args[0];
        if (obj != null) {
            Integer numM1206 = C0373r3.m1206("com.xingin.matrix.comment.R$id", "commentContentTextLL");
            if (numM1206 != null && numM1206.intValue() > 0) {
                Object obj2 = methodHookParam2.thisObject;
                C0237h4.m1089("thisObject", obj2);
                View view = (View) C0373r3.m927(obj2, "getView", new Object[0]);
                final ViewGroup viewGroup = view != null ? (ViewGroup) view.findViewById(numM1206.intValue()) : null;
                if (viewGroup != null) {
                    final C0461y0 c0461y0 = this.f1165;
                    viewGroup.setOnLongClickListener(new View.OnLongClickListener() { // from class: ۟.v0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            switch (i) {
                                case 0:
                                    C0461y0 c0461y02 = c0461y0;
                                    ViewGroup viewGroup2 = viewGroup;
                                    Object obj3 = obj;
                                    C0237h4.m1090("this$0", c0461y02);
                                    Context context = viewGroup2.getContext();
                                    C0237h4.m1089("getContext(...)", context);
                                    C0461y0.m1267(context, obj3);
                                    break;
                                default:
                                    C0461y0 c0461y03 = c0461y0;
                                    ViewGroup viewGroup3 = viewGroup;
                                    Object obj4 = obj;
                                    C0237h4.m1090("this$0", c0461y03);
                                    Context context2 = viewGroup3.getContext();
                                    C0237h4.m1089("getContext(...)", context2);
                                    C0461y0.m1267(context2, obj4);
                                    break;
                            }
                            return true;
                        }
                    });
                    int childCount = viewGroup.getChildCount();
                    while (i < childCount) {
                        View childAt = viewGroup.getChildAt(i);
                        final C0461y0 c0461y02 = this.f1165;
                        final int i2 = 1;
                        childAt.setOnLongClickListener(new View.OnLongClickListener() { // from class: ۟.v0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view2) {
                                switch (i2) {
                                    case 0:
                                        C0461y0 c0461y022 = c0461y02;
                                        ViewGroup viewGroup2 = viewGroup;
                                        Object obj3 = obj;
                                        C0237h4.m1090("this$0", c0461y022);
                                        Context context = viewGroup2.getContext();
                                        C0237h4.m1089("getContext(...)", context);
                                        C0461y0.m1267(context, obj3);
                                        break;
                                    default:
                                        C0461y0 c0461y03 = c0461y02;
                                        ViewGroup viewGroup3 = viewGroup;
                                        Object obj4 = obj;
                                        C0237h4.m1090("this$0", c0461y03);
                                        Context context2 = viewGroup3.getContext();
                                        C0237h4.m1089("getContext(...)", context2);
                                        C0461y0.m1267(context2, obj4);
                                        break;
                                }
                                return true;
                            }
                        });
                        i++;
                    }
                }
            }
        }
        return C0433vb.f1163;
    }
}
