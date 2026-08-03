package p001;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۟.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0383s0 extends AbstractAlertDialogC0348p4 {

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public final String f1768;

    /* JADX INFO: renamed from: ۟.s0$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090("it", c0344p0);
            AlertDialogC0383s0 alertDialogC0383s0 = AlertDialogC0383s0.this;
            AlertDialogC0383s0.m932(alertDialogC0383s0, alertDialogC0383s0.f1768);
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.s0$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090("it", c0344p0);
            AlertDialogC0383s0 alertDialogC0383s0 = AlertDialogC0383s0.this;
            AlertDialogC0383s0.m932(alertDialogC0383s0, AlertDialogC0383s0.m1218(alertDialogC0383s0, alertDialogC0383s0.f1768));
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.s0$c */
    public static final class c extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public c() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090("it", c0344p0);
            AlertDialogC0383s0 alertDialogC0383s0 = AlertDialogC0383s0.this;
            AlertDialogC0383s0.m932(alertDialogC0383s0, AlertDialogC0383s0.m1219(alertDialogC0383s0, alertDialogC0383s0.f1768));
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.s0$d */
    public static final class d extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public d() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090("it", c0344p0);
            AlertDialogC0383s0 alertDialogC0383s0 = AlertDialogC0383s0.this;
            AlertDialogC0383s0.m932(AlertDialogC0383s0.this, AlertDialogC0383s0.m1219(alertDialogC0383s0, AlertDialogC0383s0.m1218(alertDialogC0383s0, alertDialogC0383s0.f1768)));
            return C0433vb.f1163;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0383s0(Context context, String str) {
        super(context, 0);
        "cxt";
        C0237h4.m1090("textValue", str);
        this.f1768 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠ */
    public static final void m932(AlertDialogC0383s0 alertDialogC0383s0, String str) {
        String strM915;
        alertDialogC0383s0.getClass();
        if (str.length() > 0) {
            int i = C0330o.f1000;
            C0330o.m911(str);
            strM915 = "已复制";
        } else {
            int i2 = C0330o.f1000;
            strM915 = "复制内容为空";
        }
        C0330o.m1173(0, strM915);
        alertDialogC0383s0.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static final String m1218(AlertDialogC0383s0 alertDialogC0383s0, String str) {
        alertDialogC0383s0.getClass();
        Pattern patternCompile = Pattern.compile("\\\[.+?R]");
        C0237h4.m1089("compile(...)", patternCompile);
        C0237h4.m1090("input", str);
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        C0237h4.m1089("replaceAll(...)", strReplaceAll);
        return strReplaceAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public static final String m1219(AlertDialogC0383s0 alertDialogC0383s0, String str) {
        alertDialogC0383s0.getClass();
        Pattern patternCompile = Pattern.compile("#.+?\\\[话题]#");
        C0237h4.m1089("compile(...)", patternCompile);
        C0237h4.m1090("input", str);
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        C0237h4.m1089("replaceAll(...)", strReplaceAll);
        return strReplaceAll;
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۥ */
    public final List<View> mo1074() {
        return C0272jb.m1105(m970());
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۧ */
    public final List<C0344p0> mo1075() {
        int i = 6;
        CharSequence charSequence = null;
        return C0272jb.m874(new C0261j0("复制全部", charSequence, new a(), i), new C0261j0("复制（去除表情）", charSequence, new b(), i), new C0261j0("复制（去除话题）", charSequence, new c(), i), new C0261j0("复制（去除表情和话题）", charSequence, new d(), i));
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۨ */
    public final View mo1076() {
        TextView textViewM1279 = m1279(-1);
        textViewM1279.setText("复制方式");
        return textViewM1279;
    }
}
