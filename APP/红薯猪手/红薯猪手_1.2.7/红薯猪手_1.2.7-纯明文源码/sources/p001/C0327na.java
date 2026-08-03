package p001;

import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.na */
/* JADX INFO: loaded from: classes.dex */
public final class C0327na extends AbstractC0484za {

    /* JADX INFO: renamed from: ۥ */
    public static final String f998 = "hid";

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean f999 = true;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m1162(XC_MethodHook.MethodHookParam methodHookParam) {
        C0274k c0274k = C0283k8.f1632;
        String str = C0283k8.a.m885().f1535;
        C0237h4.m1089("AliothRIdCls", str);
        View viewFindViewById = null;
        Class clsM1199 = C0373r3.m1199(str, null, 3);
        if (clsM1199 == null) {
            return;
        }
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089("thisObject", obj);
        Object objM1203 = C0373r3.m1203(obj, "itemView");
        View view = objM1203 instanceof View ? (View) objM1203 : null;
        if (view != null) {
            Integer numM1205 = C0373r3.m1205(clsM1199, "liveAuthorAvatar");
            viewFindViewById = view.findViewById(numM1205 != null ? numM1205.intValue() : -1);
        }
        if (viewFindViewById == null) {
            return;
        }
        Integer numM12052 = C0373r3.m1205(clsM1199, "authorName");
        View viewFindViewById2 = view.findViewById(numM12052 != null ? numM12052.intValue() : -1);
        Object obj2 = methodHookParam.args[0];
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0271ja(0, obj2));
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC0271ja(1, obj2));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m1163(XC_MethodHook.MethodHookParam methodHookParam) {
        View viewFindViewById;
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089("thisObject", obj);
        View view = (View) C0373r3.m927(obj, "getView", new Object[0]);
        if (view != null) {
            C0274k c0274k = C0283k8.f1632;
            String str = C0283k8.a.m885().f1533;
            C0237h4.m1089("MatrixRIdCls", str);
            Integer numM1206 = C0373r3.m1206(str, "mUserAvatarView");
            viewFindViewById = view.findViewById(numM1206 != null ? numM1206.intValue() : -1);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById == null) {
            return;
        }
        Object obj2 = methodHookParam.args[0];
        C0274k c0274k2 = C0283k8.f1632;
        String str2 = C0283k8.a.m885().f1533;
        C0237h4.m1089("MatrixRIdCls", str2);
        Integer numM12062 = C0373r3.m1206(str2, "tv_nickname");
        View viewFindViewById2 = view.findViewById(numM12062 != null ? numM12062.intValue() : -1);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC0271ja(2, obj2));
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0271ja(3, obj2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090("processName", str);
        boolean zM846 = C0192e1.m846(EnumC0164c1.f1370);
        f999 = zM846;
        if (zM846) {
            String str2 = C0283k8.f1632.f1579;
            C0237h4.m1089("ResultNoteItemViewHolderCls", str2);
            C0274k c0274k = C0283k8.f1632;
            String str3 = c0274k.f1580;
            String str4 = c0274k.f1581;
            C0237h4.m1089("SearchNoteItemCls", str4);
            C0373r3.m1208(str2, str3, new Object[]{C0373r3.m1199(str4, null, 3)}, C0285ka.f916);
            String str5 = C0283k8.f1632.f1582;
            C0237h4.m1089("NewNoteItemChildPresenterCls", str5);
            C0274k c0274k2 = C0283k8.f1632;
            String str6 = c0274k2.f893;
            String str7 = c0274k2.f1583;
            C0237h4.m1089("NoteItemBeanCls", str7);
            C0373r3.m1208(str5, str6, new Object[]{C0373r3.m1199(str7, null, 3), Integer.TYPE}, C0299la.f945);
            String str8 = C0283k8.f1632.f1588;
            C0237h4.m1089("NoteCardItemControllerCls", str8);
            C0274k c0274k3 = C0283k8.f1632;
            String str9 = c0274k3.f1589;
            String str10 = c0274k3.f1584;
            C0237h4.m1089("NoteCardCls", str10);
            C0373r3.m1208(str8, str9, new Object[]{C0373r3.m1199(str10, null, 3), Object.class}, C0313ma.f969);
        }
    }
}
