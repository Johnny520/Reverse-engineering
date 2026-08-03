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
        Object objM1202 = C0373r3.m1202(obj, "originalPicUrl", false);
        String str = null;
        String str2 = objM1202 instanceof String ? (String) objM1202 : null;
        boolean z = true;
        if (str2 == null || str2.length() == 0) {
            Object objM12022 = C0373r3.m1202(obj, "picUrl", false);
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
            C0330o.m1173(0, "获取图片地址失败");
        } else {
            String str3 = C0436w1.f1166;
            C0436w1.m953("jpg", C0272jb.m1105(str));
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
        Object objM12033 = C0373r3.m1203(this.f880, "linker");
        boolean z = false;
        String str = null;
        str = null;
        Object objM926 = (objM12033 == null || (objM12032 = C0373r3.m1203(objM12033, "controller")) == null) ? null : C0373r3.m926(objM12032, "getPresenter", new Object[0]);
        if (objM926 != null) {
            String name = objM926.getClass().getName();
            C0274k c0274k = C0283k8.f1632;
            if (C0237h4.m864(name, C0283k8.a.m885().f889)) {
                Object objM9262 = C0373r3.m926(objM926, C0283k8.a.m885().f1544, new Object[0]);
                RecyclerView recyclerView = objM9262 instanceof RecyclerView ? (RecyclerView) objM9262 : null;
                if (recyclerView == null) {
                    int i = C0330o.f1000;
                    strM915 = "获取数据控件失败";
                } else {
                    LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                    C0237h4.m1088("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager", layoutManager);
                    LinearLayoutManager linearLayoutManager = layoutManager;
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    Object objM12034 = adapter != null ? C0373r3.m1203(adapter, C0283k8.a.m885().f1545) : null;
                    List list = objM12034 instanceof List ? (List) objM12034 : null;
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    if (list == null || list.size() <= iFindFirstVisibleItemPosition) {
                        int i2 = C0330o.f1000;
                        strM915 = "获取数据索引失败";
                    } else {
                        List list2 = (List) C0373r3.m1204(list.get(iFindFirstVisibleItemPosition), "pictures");
                        if ((list2 == null || list2.isEmpty()) == true) {
                            int i3 = C0330o.f1000;
                            strM915 = "获取数据w为空";
                        } else {
                            Object objM1176 = C0331o0.m1176(list2);
                            Object objM12035 = C0373r3.m1203(objM1176, "videoInfo");
                            if (objM12035 == null || (string = objM12035.toString()) == null) {
                                string = "";
                            }
                            C0365q8 c0365q8 = new C0365q8();
                            if (C0406ta.m942(string, "{")) {
                                c0365q8.f1047 = C0413u4.a.m946(string);
                            }
                            if (c0365q8.f1047 != 0) {
                                new AlertDialogC0374r4(this.f880, "下载类型", C0272jb.m1106(new C0368qb("LivePhoto", new C0242h9(c0365q8)), new C0368qb("图片", new C0256i9(objM1176)))).show();
                            } else {
                                m1097(objM1176);
                            }
                        }
                    }
                }
            } else if (C0237h4.m864(objM926.getClass().getName(), C0283k8.a.m885().f1543)) {
                Object obj = this.f881;
                if (obj != null && (objM1203 = C0373r3.m1203(obj, "imageCommentExtraInfo")) != null) {
                    str = (String) C0373r3.m1204(objM1203, "imageUrl");
                }
                if (str != null) {
                    if ((str.length() > 0) == true) {
                        z = true;
                    }
                }
                if (z) {
                    String str2 = C0436w1.f1166;
                    C0436w1.m953("jpg", C0272jb.m1105(str));
                } else {
                    int i4 = C0330o.f1000;
                    strM915 = "获取评论图片信息失败";
                }
            }
            return C0433vb.f1163;
        }
        int i5 = C0330o.f1000;
        strM915 = "获取数据失败";
        C0330o.m1173(0, strM915);
        return C0433vb.f1163;
    }
}
