package p001;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p001.C0283k8;
import p001.C0413u4;

/* JADX INFO: renamed from: ۟.j9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0270j9 extends AbstractC0335o4 implements InterfaceC0208f3<C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ Activity f880;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Object f881;

    public C0270j9(Activity activity, Object obj) {
        this.f880 = activity;
        this.f881 = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m1097(Object obj) {
        Object objM1202 = C0373r3.m1202(obj, C0341oa.m915(new byte[]{-22, -97, 82, -8, -112, 95, -28, -127, 107, -10, -102, 100, -9, -127}, new byte[]{-123, -19, 59, -97, -7, 49}), false);
        String str = null;
        String str2 = objM1202 instanceof String ? (String) objM1202 : null;
        boolean z = true;
        if (str2 == null || str2.length() == 0) {
            Object objM12022 = C0373r3.m1202(obj, C0341oa.m915(new byte[]{16, 105, 74, -107, -63, -70}, new byte[]{96, 0, 41, -64, -77, -42}), false);
            if (objM12022 instanceof String) {
                str = (String) objM12022;
            }
        } else {
            str = str2;
        }
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            int i = C0330o.f1000;
            C0330o.m1173(0, C0341oa.m915(new byte[]{-37, 122, -73, 50, -54, -86, -42, 111, -66, 48, -52, -69, -42, 104, -80, 50, -40, -68, -42, 80, -79, 63, -15, -103}, new byte[]{51, -12, 0, -41, 69, 60}));
        } else {
            String str3 = C0436w1.f1166;
            C0436w1.m953(C0341oa.m915(new byte[]{-115, 101, -107}, new byte[]{-25, 21, -14, 4, 33, -10}), C0272jb.m1105(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v18, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16, types: [T, ۟.u4] */
    @Override // p001.InterfaceC0208f3
    /* JADX INFO: renamed from: ۥ */
    public final C0433vb mo7() {
        String strM915;
        Object objM1203;
        String string;
        Object objM12032;
        Object objM12033 = C0373r3.m1203(this.f880, C0341oa.m915(new byte[]{125, -8, -44, -105, -73, 33}, new byte[]{17, -111, -70, -4, -46, 83}));
        boolean z = false;
        String str = null;
        str = null;
        Object objM926 = (objM12033 == null || (objM12032 = C0373r3.m1203(objM12033, C0341oa.m915(new byte[]{116, 82, -57, 27, -42, 20, 123, 81, -52, 29}, new byte[]{23, 61, -87, 111, -92, 123}))) == null) ? null : C0373r3.m926(objM12032, C0341oa.m915(new byte[]{28, 117, 1, -127, -128, -116, 8, 117, 27, -91, -105, -101}, new byte[]{123, 16, 117, -47, -14, -23}), new Object[0]);
        if (objM926 != null) {
            String name = objM926.getClass().getName();
            C0274k c0274k = C0283k8.f1632;
            if (C0237h4.m864(name, C0283k8.a.m885().f889)) {
                Object objM9262 = C0373r3.m926(objM926, C0283k8.a.m885().f1544, new Object[0]);
                RecyclerView recyclerView = objM9262 instanceof RecyclerView ? (RecyclerView) objM9262 : null;
                if (recyclerView == null) {
                    int i = C0330o.f1000;
                    strM915 = C0341oa.m915(new byte[]{71, 34, -92, -120, 101, -120, 73, 57, -93, -117, 103, -80, 73, 34, -76, -119, 81, -88, 74, 8, -94, -123, 94, -69}, new byte[]{-81, -84, 19, 109, -22, 30});
                } else {
                    LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                    C0237h4.m1088(C0341oa.m915(new byte[]{38, -91, -128, 99, 127, -85, 41, -66, -126, 96, 43, -24, 42, -75, -52, 108, 62, -69, 60, -16, -104, 96, 127, -90, 39, -66, -63, 97, 42, -92, 36, -16, -104, 118, 47, -83, 104, -79, -126, 107, 45, -89, 33, -76, -108, 33, 45, -83, 43, -87, -113, 99, 58, -70, 62, -71, -119, 120, 113, -65, 33, -76, -117, 106, 43, -26, 4, -71, -126, 106, 62, -70, 4, -79, -107, 96, 42, -68, 5, -79, -126, 110, 56, -83, 58}, new byte[]{72, -48, -20, 15, 95, -56}), layoutManager);
                    LinearLayoutManager linearLayoutManager = layoutManager;
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    Object objM12034 = adapter != null ? C0373r3.m1203(adapter, C0283k8.a.m885().f1545) : null;
                    List list = objM12034 instanceof List ? (List) objM12034 : null;
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    if (list == null || list.size() <= iFindFirstVisibleItemPosition) {
                        int i2 = C0330o.f1000;
                        strM915 = C0341oa.m915(new byte[]{122, -96, 17, -34, 82, 97, 116, -69, 22, -35, 80, 89, 117, -102, 4, -34, 97, 98, 119, -118, 23, -45, 105, 82}, new byte[]{-110, 46, -90, 59, -35, -9});
                    } else {
                        List list2 = (List) C0373r3.m1204(list.get(iFindFirstVisibleItemPosition), C0341oa.m915(new byte[]{83, -126, -105, 94, -103, -85, 70, -104}, new byte[]{35, -21, -12, 42, -20, -39}));
                        if ((list2 == null || list2.isEmpty()) == true) {
                            int i3 = C0330o.f1000;
                            strM915 = C0341oa.m915(new byte[]{69, -108, 57, -75, -116, -114, 75, -113, 62, -74, -114, -74, -38, -2, 54, -22, -28, -79, 23}, new byte[]{-83, 26, -114, 80, 3, 24});
                        } else {
                            Object objM1176 = C0331o0.m1176(list2);
                            Object objM12035 = C0373r3.m1203(objM1176, C0341oa.m915(new byte[]{-80, 53, 102, 66, -116, -97, -88, 58, 109}, new byte[]{-58, 92, 2, 39, -29, -42}));
                            if (objM12035 == null || (string = objM12035.toString()) == null) {
                                string = "";
                            }
                            C0365q8 c0365q8 = new C0365q8();
                            if (C0406ta.m942(string, C0341oa.m915(new byte[]{-99}, new byte[]{-26, 81, 125, 42, -113, -119}))) {
                                c0365q8.f1047 = C0413u4.a.m946(string);
                            }
                            if (c0365q8.f1047 != 0) {
                                new AlertDialogC0374r4(this.f880, C0341oa.m915(new byte[]{119, -55, -86, -57, -69, -41, 116, -64, -102, -54, -104, -31}, new byte[]{-109, 113, 33, 47, 6, 106}), C0272jb.m1106(new C0368qb(C0341oa.m915(new byte[]{-81, 90, 120, 13, 2, 93, -116, 71, 97}, new byte[]{-29, 51, 14, 104, 82, 53}), new C0242h9(c0365q8)), new C0368qb(C0341oa.m915(new byte[]{-42, 28, 103, -126, 112, -95}, new byte[]{51, -121, -39, 101, -7, 38}), new C0256i9(objM1176)))).show();
                            } else {
                                m1097(objM1176);
                            }
                        }
                    }
                }
            } else if (C0237h4.m864(objM926.getClass().getName(), C0283k8.a.m885().f1543)) {
                Object obj = this.f881;
                if (obj != null && (objM1203 = C0373r3.m1203(obj, C0341oa.m915(new byte[]{-95, 80, 23, -37, 67, -12, -89, 80, 27, -39, 72, -61, -115, 69, 2, -50, 71, -2, -90, 91, 25}, new byte[]{-56, 61, 118, -68, 38, -73}))) != null) {
                    str = (String) C0373r3.m1204(objM1203, C0341oa.m915(new byte[]{-54, 15, 48, 112, 39, -61, -47, 14}, new byte[]{-93, 98, 81, 23, 66, -106}));
                }
                if (str != null) {
                    if ((str.length() > 0) == true) {
                        z = true;
                    }
                }
                if (z) {
                    String str2 = C0436w1.f1166;
                    C0436w1.m953(C0341oa.m915(new byte[]{-115, 101, -107}, new byte[]{-25, 21, -14, 4, 33, -10}), C0272jb.m1105(str));
                } else {
                    int i4 = C0330o.f1000;
                    strM915 = C0341oa.m915(new byte[]{-69, 109, -23, -32, -30, -55, -69, 76, -38, -19, -61, -27, -74, 120, -32, -30, -28, -40, -73, 92, -1, -29, -20, -16, -74, 71, -17, -19, -39, -6}, new byte[]{83, -29, 94, 5, 109, 95});
                }
            }
            return C0433vb.f1163;
        }
        int i5 = C0330o.f1000;
        strM915 = C0341oa.m915(new byte[]{72, -95, -30, -15, -32, -120, 70, -70, -27, -14, -30, -80, 69, -117, -28, -4, -37, -69}, new byte[]{-96, 47, 85, 20, 111, 30});
        C0330o.m1173(0, strM915);
        return C0433vb.f1163;
    }
}
