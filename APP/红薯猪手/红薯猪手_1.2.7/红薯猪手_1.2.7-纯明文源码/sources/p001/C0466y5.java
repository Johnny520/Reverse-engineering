package p001;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p001.C0178d1;

/* JADX INFO: renamed from: ۟.y5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0466y5 extends AbstractC0335o4 implements InterfaceC0222g3<String, Boolean> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ AlertDialogC0414u5 f1211;

    public C0466y5(AlertDialogC0414u5 alertDialogC0414u5) {
        this.f1211 = alertDialogC0414u5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Boolean mo984(String str) throws C0424v2 {
        String str2;
        String strM915;
        File file;
        String strM9152;
        String str3 = str;
        C0237h4.m1090("text", str3);
        boolean z = false;
        z = false;
        if (!new File(str3).isDirectory()) {
            int i = C0330o.f1000;
            C0330o.m1173(0, "获取目录失败");
            return Boolean.FALSE;
        }
        AlertDialogC0414u5 alertDialogC0414u5 = this.f1211;
        C0479z5 c0479z5 = AlertDialogC0414u5.f1826;
        alertDialogC0414u5.getClass();
        C0286kb c0286kb = C0178d1.f750;
        File file2 = new File(C0178d1.b.m841().getPath());
        if (file2.exists()) {
            if (str3.charAt(C0432va.m1254(str3)) != File.separatorChar) {
                str2 = str3 + File.separator;
            } else {
                str2 = str3;
            }
            StringBuilder sbM924 = C0372r2.m924("红薯猪手", "配置");
            int i2 = C0330o.f1000;
            String strM9153 = "yyyyMMdd-hh点mm分";
            "format";
            String str4 = new SimpleDateFormat(strM9153, Locale.CHINESE).format(new Date());
            C0237h4.m1089("format(...)", str4);
            sbM924.append(str4);
            sbM924.append(".xml");
            String str5 = str2 + ((Object) sbM924);
            try {
                new File(str5).createNewFile();
                file = new File(str5);
                C0275k0.m1113(file2, file);
            } catch (Exception unused) {
                int i3 = C0330o.f1000;
                strM915 = "创建文件失败，换个目录试试";
            }
            if (file.exists()) {
                C0178d1.b.m841().mo849("export_path", str3);
                strM915 = C0372r2.m924("导出配置成功：", str5).toString();
                C0237h4.m1089("toString(...)", strM915);
                z = true;
                C0330o.m1173(z ? 1 : 0, strM915);
                return Boolean.valueOf(z);
            }
            strM9152 = "导出配置失败";
        } else {
            int i4 = C0330o.f1000;
            strM9152 = "源配置文件不存在";
        }
        C0330o.m1173(0, strM9152);
        return Boolean.valueOf(z);
    }
}
