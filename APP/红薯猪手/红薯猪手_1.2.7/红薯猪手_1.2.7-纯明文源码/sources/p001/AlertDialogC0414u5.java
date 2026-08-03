package p001;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import p001.C0178d1;
import p001.C0235h2;

/* JADX INFO: renamed from: ۟.u5 */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0414u5 extends AbstractAlertDialogC0348p4 {

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static C0479z5 f1826;

    /* JADX INFO: renamed from: ۟.u5$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static C0479z5 m948() {
            return AlertDialogC0414u5.f1826;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$b */
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
            try {
                Context context = AlertDialogC0414u5.this.f1217;
                int i = C0330o.f1000;
                context.startActivity(C0330o.m1164("com.xingin.xhs"));
            } catch (Exception unused) {
                int i2 = C0330o.f1000;
                C0330o.m1173(0, "打开应用详情失败，请手动打开");
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$c */
    public static final class c extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final c f1127 = new c();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090("it", c0344p0);
            int i = C0330o.f1000;
            C0332o1 c0332o1 = AlertDialogC0308m5.f1696;
            String str = c0332o1 != null ? c0332o1.f1723 : null;
            C0237h4.m865(str);
            C0330o.m1167(str);
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$d */
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
            AlertDialogC0414u5 alertDialogC0414u5 = AlertDialogC0414u5.this;
            alertDialogC0414u5.getClass();
            C0446wb c0446wb = AlertDialogC0308m5.f1697;
            if (c0446wb != null) {
                alertDialogC0414u5.m1250(c0446wb);
            } else {
                C0235h2.a aVar = C0235h2.f823;
                C0440w5 c0440w5 = new C0440w5(alertDialogC0414u5);
                aVar.getClass();
                C0235h2.a.m861(c0440w5);
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$e */
    public static final class e extends AbstractC0335o4 implements InterfaceC0222g3<Boolean, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final e f1129 = new e();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            C0338o7 c0338o7 = C0338o7.f1010;
            C0338o7.m1181("update_tip", Boolean.valueOf(zBooleanValue));
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$f */
    public static final class f extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final f f1130 = new f();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090("it", c0344p0);
            int i = C0330o.f1000;
            String strM915 = "com.skyhand.redbookhelper";
            String strM9152 = "com.skyhand.redbookhelper.MainActivity";
            "appid";
            "actName";
            try {
                Activity activityM893 = C0292l3.m893();
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setComponent(new ComponentName(strM915, strM9152));
                activityM893.startActivity(intent);
            } catch (Exception unused) {
                C0330o.m1173(0, "打开失败");
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$g */
    public static final class g extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final g f1131 = new g();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090("it", c0344p0);
            int i = C0330o.f1000;
            C0330o.m1170("https://t.me/+bNcUOilR_VBiNzM1");
            C0330o.m1173(0, "即将打开tg邀请界面");
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$h */
    public static final class h extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {
        public h() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090("it", c0344p0);
            AlertDialogC0414u5 alertDialogC0414u5 = AlertDialogC0414u5.this;
            AlertDialogC0441w6 alertDialogC0441w6 = new AlertDialogC0441w6(alertDialogC0414u5.f1217, "提示", "感谢支持，是否确认无回报打赏作者？");
            alertDialogC0441w6.m1083(new C0440w5(alertDialogC0414u5));
            alertDialogC0441w6.show();
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$i */
    public static final class i extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C0365q8<String> f1133;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AlertDialogC0414u5 f1134;

        public i(C0365q8<String> c0365q8, AlertDialogC0414u5 alertDialogC0414u5) {
            this.f1133 = c0365q8;
            this.f1134 = alertDialogC0414u5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090("it", c0344p0);
            C0286kb c0286kb = C0178d1.f750;
            File file = new File(C0178d1.b.m841().mo849("export_path", ((Object) this.f1133.f1047) + "/Download"));
            String absolutePath = "";
            if (file.isDirectory()) {
                long jLastModified = 0;
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        String name = file2.getName();
                        C0237h4.m1089("getName(...)", name);
                        if (C0432va.m1253(name, "红薯猪手") && file2.lastModified() > jLastModified) {
                            absolutePath = file2.getAbsolutePath();
                            C0237h4.m1089("getAbsolutePath(...)", absolutePath);
                            jLastModified = file2.lastModified();
                        }
                    }
                }
            }
            new AlertDialogC0151b2(this.f1134.f1217, "导入", absolutePath, "配置文件的完整路径", new C0453x5(this.f1134)).show();
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$j */
    public static final class j extends AbstractC0335o4 implements InterfaceC0222g3<C0344p0, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C0365q8<String> f1135;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AlertDialogC0414u5 f1136;

        public j(C0365q8<String> c0365q8, AlertDialogC0414u5 alertDialogC0414u5) {
            this.f1135 = c0365q8;
            this.f1136 = alertDialogC0414u5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(C0344p0 c0344p0) {
            C0237h4.m1090("it", c0344p0);
            C0286kb c0286kb = C0178d1.f750;
            new AlertDialogC0151b2(this.f1136.f1217, "导出", C0178d1.b.m841().mo849("export_path", ((Object) this.f1135.f1047) + "/Download"), "请输入目标目录的路径", new C0466y5(this.f1136)).show();
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.u5$k */
    public static final class k extends AbstractC0335o4 implements InterfaceC0208f3<Boolean> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C0446wb f1137;

        public k(C0446wb c0446wb) {
            this.f1137 = c0446wb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final Boolean mo7() {
            int i = C0330o.f1000;
            C0330o.m910(this.f1137.f1859);
            C0330o.m1173(1, this.f1137.f1860);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0414u5(Context context) {
        super(context, 0);
        C0237h4.m1090("cxt", context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠ */
    public static final void m947(AlertDialogC0414u5 alertDialogC0414u5, String str) throws C0424v2 {
        alertDialogC0414u5.getClass();
        C0286kb c0286kb = C0178d1.f750;
        String path = C0178d1.b.m841().getPath();
        try {
            File file = new File(str);
            File file2 = new File(path);
            C0275k0.m1113(file, file2);
            if (file2.exists()) {
                int i2 = C0330o.f1000;
                C0330o.m1173(1, "导入配置成功，重启生效");
            } else {
                int i3 = C0330o.f1000;
                C0330o.m1173(0, "导入配置失败");
            }
        } catch (FileNotFoundException unused) {
            int i4 = C0330o.f1000;
            C0330o.m1173(0, "获取文件异常，请手动选择文件");
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("text/xml");
            intent.addCategory("android.intent.category.OPENABLE");
            C0292l3.m893().startActivityForResult(intent, 666);
            f1826 = new C0479z5(alertDialogC0414u5);
        }
    }

    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۥ */
    public final List<View> mo1074() {
        return C0272jb.m1105(m970());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x001d */
    /* JADX DEBUG: Type inference failed for r5v0. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [T] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v36 */
    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C0344p0> mo1075() {
        boolean z;
        boolean z2;
        String str;
        ArrayList arrayList = new ArrayList();
        C0365q8 c0365q8 = new C0365q8();
        CharSequence charSequenceM1175 = "";
        c0365q8.f1047 = "";
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            ?? absolutePath = externalStorageDirectory != null ? externalStorageDirectory.getAbsolutePath() : 0;
            if (absolutePath == 0) {
                absolutePath = "";
            }
            c0365q8.f1047 = absolutePath;
        } catch (Exception unused) {
        }
        if (C0406ta.m1245((CharSequence) c0365q8.f1047)) {
            int i2 = C0330o.f1000;
            arrayList.add(new C0261j0(C0330o.m1174("没有存储权限，无法导入导出配置，点击去开启", "red"), null, new b(), 6));
        }
        C0446wb c0446wb = AlertDialogC0308m5.f1697;
        if (c0446wb != null) {
            C0286kb c0286kb = C0178d1.f750;
            z = c0446wb.m959(C0178d1.b.m841().mo1059("rp", false));
        }
        if (z) {
            int i3 = C0330o.f1000;
            String strM915 = "点此更新:";
            C0446wb c0446wb2 = AlertDialogC0308m5.f1697;
            String string = C0372r2.m924(strM915, c0446wb2 != null ? c0446wb2.f1857 : null).toString();
            C0237h4.m1089("toString(...)", string);
            charSequenceM1175 = C0330o.m1175(C0330o.m1174(string, "green"));
        }
        C0332o1 c0332o1 = AlertDialogC0308m5.f1696;
        if (c0332o1 == null || (str = c0332o1.f1723) == null) {
            z2 = false;
        } else {
            if (str.length() > 0) {
                z2 = true;
            }
        }
        if (z2) {
            arrayList.add(new C0261j0("QQ群(限时开放)", null, c.f1127, 6));
        }
        C0338o7 c0338o7 = C0338o7.f1010;
        arrayList.addAll(C0272jb.m1106(new C0261j0("检查更新", charSequenceM1175, new d(), 4), new C0344p0(null, null, "更新弹窗提示", "关闭后将不再弹窗提示模块更新~", null, null, null, Boolean.valueOf(C0338o7.m913("update_tip", true)), e.f1129, null, false, 7411), new C0261j0("模块App主界面", null, f.f1130, 6), new C0261j0("TG群(备用)", null, g.f1131, 6), new C0261j0("打赏", null, new h(), 6), new C0261j0("导入配置", null, new i(c0365q8, this), 6), new C0261j0("导出配置", null, new j(c0365q8, this), 6)));
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0348p4
    /* JADX INFO: renamed from: ۥ۟ۨ */
    public final View mo1076() {
        TextView textViewM1279 = m1279(AbstractAlertDialogC0471ya.f1882);
        textViewM1279.setText("模块设置");
        return textViewM1279;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public final void m1250(C0446wb c0446wb) {
        C0286kb c0286kb = C0178d1.f750;
        if (!c0446wb.m959(C0178d1.b.m841().mo1059("rp", false))) {
            int i2 = C0330o.f1000;
            C0330o.m1173(0, "当前已是最新版本");
            return;
        }
        Context context = this.f1217;
        StringBuilder sbM924 = C0372r2.m924("猪手版本更新", c0446wb.f1857);
        sbM924.append("(");
        sbM924.append(c0446wb.f1858);
        sbM924.append(")");
        String string = sbM924.toString();
        C0237h4.m1089("toString(...)", string);
        int i3 = C0330o.f1000;
        AlertDialogC0441w6 alertDialogC0441w6 = new AlertDialogC0441w6(context, string, C0330o.m1175(c0446wb.f1862));
        alertDialogC0441w6.m1083(new k(c0446wb));
        if (c0446wb.f1181) {
            alertDialogC0441w6.setCancelable(false);
            alertDialogC0441w6.m858();
        }
        alertDialogC0441w6.show();
    }
}
