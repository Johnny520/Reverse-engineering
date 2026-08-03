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
        C0237h4.m1090(C0341oa.m915(new byte[]{-36, -119, 101, -61, 50}, new byte[]{-84, -24, 23, -94, 95, -71}), methodHookParam2);
        final int i = 0;
        final Object obj = methodHookParam2.args[0];
        if (obj != null) {
            Integer numM1206 = C0373r3.m1206(C0341oa.m915(new byte[]{-109, 127, -73, -4, 20, -45, -98, 119, -77, -68, 66, -41, -111, 100, -88, -69, 20, -108, -109, 127, -73, -65, 9, -44, -124, 62, -120, -10, 5, -34}, new byte[]{-16, 16, -38, -46, 108, -70}), C0341oa.m915(new byte[]{-8, -53, 69, 43, -70, 29, -17, -25, 71, 40, -85, 22, -11, -48, 124, 35, -89, 7, -41, -24}, new byte[]{-101, -92, 40, 70, -33, 115}));
            if (numM1206 != null && numM1206.intValue() > 0) {
                Object obj2 = methodHookParam2.thisObject;
                C0237h4.m1089(C0341oa.m915(new byte[]{97, -1, -24, 6, -44, 13, 127, -14, -30, 1}, new byte[]{21, -105, -127, 117, -101, 111}), obj2);
                View view = (View) C0373r3.m927(obj2, C0341oa.m915(new byte[]{30, 98, -15, -60, -93, -77, 14}, new byte[]{121, 7, -123, -110, -54, -42}), new Object[0]);
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
                                    C0237h4.m1090(C0341oa.m915(new byte[]{66, 93, -59, 6, -13, -29}, new byte[]{54, 53, -84, 117, -41, -45}), c0461y02);
                                    Context context = viewGroup2.getContext();
                                    C0237h4.m1089(C0341oa.m915(new byte[]{-7, 44, 79, -97, 75, 125, -22, 44, 67, -88, 12, 61, -80, 103, 18}, new byte[]{-98, 73, 59, -36, 36, 19}), context);
                                    C0461y0.m1267(context, obj3);
                                    break;
                                default:
                                    C0461y0 c0461y03 = c0461y0;
                                    ViewGroup viewGroup3 = viewGroup;
                                    Object obj4 = obj;
                                    C0237h4.m1090(C0341oa.m915(new byte[]{58, 99, -107, 12, 72, -25}, new byte[]{78, 11, -4, 127, 108, -41}), c0461y03);
                                    Context context2 = viewGroup3.getContext();
                                    C0237h4.m1089(C0341oa.m915(new byte[]{-101, -38, -56, -115, 38, -99, -120, -38, -60, -70, 97, -35, -46, -111, -107}, new byte[]{-4, -65, -68, -50, 73, -13}), context2);
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
                                        C0237h4.m1090(C0341oa.m915(new byte[]{66, 93, -59, 6, -13, -29}, new byte[]{54, 53, -84, 117, -41, -45}), c0461y022);
                                        Context context = viewGroup2.getContext();
                                        C0237h4.m1089(C0341oa.m915(new byte[]{-7, 44, 79, -97, 75, 125, -22, 44, 67, -88, 12, 61, -80, 103, 18}, new byte[]{-98, 73, 59, -36, 36, 19}), context);
                                        C0461y0.m1267(context, obj3);
                                        break;
                                    default:
                                        C0461y0 c0461y03 = c0461y02;
                                        ViewGroup viewGroup3 = viewGroup;
                                        Object obj4 = obj;
                                        C0237h4.m1090(C0341oa.m915(new byte[]{58, 99, -107, 12, 72, -25}, new byte[]{78, 11, -4, 127, 108, -41}), c0461y03);
                                        Context context2 = viewGroup3.getContext();
                                        C0237h4.m1089(C0341oa.m915(new byte[]{-101, -38, -56, -115, 38, -99, -120, -38, -60, -70, 97, -35, -46, -111, -107}, new byte[]{-4, -65, -68, -50, 73, -13}), context2);
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
