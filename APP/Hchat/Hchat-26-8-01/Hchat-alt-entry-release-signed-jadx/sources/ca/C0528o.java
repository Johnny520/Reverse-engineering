package ca;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.C0119x;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p218og.AbstractC3149m;
import p230p8.C3348c;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: ca.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0528o implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1644g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f1645h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0517e0 f1646i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0528o(Activity activity, C0517e0 c0517e0) {
        this.f1644g = 1;
        this.f1645h = activity;
        this.f1646i = c0517e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01eb  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String strM592Y;
        Intent className;
        String strM567a0;
        switch (this.f1644g) {
            case 0:
                C0539z c0539z = (C0539z) obj;
                c0539z.getClass();
                C0517e0 c0517e0 = this.f1646i;
                C0119x c0119x = c0517e0.f1593o;
                int i9 = c0539z.f1702a;
                String str = c0539z.f1703b;
                String str2 = c0539z.f1704c;
                c0119x.getClass();
                str.getClass();
                Activity activity = this.f1645h;
                if (i9 == 1) {
                    strM592Y = C0119x.m567a0(activity, str, "收藏内容为空");
                } else if (i9 != 2 && i9 != 4) {
                    strM592Y = "该收藏类型暂不支持系统分享";
                } else if (str2 == null) {
                    strM592Y = "收藏文件不存在";
                } else {
                    if (AbstractC3149m.m6721t0(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        File file = new File(str2);
                        if (file.isFile()) {
                            strM592Y = c0119x.m592Y(activity, AbstractC0000a.m99x0(file), i9 == 2 ? "image/*" : "video/*", HttpUrl.FRAGMENT_ENCODE_SET);
                        }
                    }
                }
                if (strM592Y != null) {
                    c0517e0.m1532r(activity, strM592Y);
                }
                break;
            case 1:
                C0539z c0539z2 = (C0539z) obj;
                c0539z2.getClass();
                String str3 = c0539z2.f1704c;
                int i10 = c0539z2.f1702a;
                Activity activity2 = this.f1645h;
                if (i10 != 1) {
                    className = null;
                    if (i10 != 2) {
                        if (i10 == 4 && str3 != null) {
                            className = new Intent().setClassName(activity2.getPackageName(), "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            className.putExtra("Ksnsupload_type", 14);
                            className.putExtra("KSightPath", str3);
                            className.putExtra("KSightThumbPath", str3);
                        }
                    } else if (str3 != null) {
                        className = new Intent().setClassName(activity2.getPackageName(), "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        className.putStringArrayListExtra("sns_kemdia_path_list", AbstractC0000a.m72k(str3));
                    }
                } else {
                    Intent className2 = new Intent().setClassName(activity2.getPackageName(), "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    className2.putExtra("Ksnsupload_type", 9);
                    className2.putExtra("Kdescription", c0539z2.f1703b);
                    className = className2;
                }
                C0517e0 c0517e02 = this.f1646i;
                if (className == null) {
                    c0517e02.m1532r(activity2, (i10 == 2 || i10 == 4) ? "收藏媒体文件不存在" : "该收藏类型暂不支持转发到朋友圈");
                } else {
                    c0517e02.m1531q(activity2, className);
                }
                break;
            case 2:
                C3348c c3348c = (C3348c) obj;
                c3348c.getClass();
                C0517e0 c0517e03 = this.f1646i;
                c0517e03.getClass();
                Intent intent = new Intent();
                Activity activity3 = this.f1645h;
                Intent className3 = intent.setClassName(activity3.getPackageName(), "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                className3.getClass();
                String str4 = c3348c.f10771c;
                String str5 = c3348c.f10769a;
                if (!AbstractC3149m.m6721t0(str4)) {
                    className3.putExtra("Ksnsupload_type", 14);
                    className3.putExtra("KSightPath", str4);
                    className3.putExtra("KSightThumbPath", c3348c.f10772d);
                    className3.putExtra("Kdescription", str5);
                } else if (!c3348c.m7065b().isEmpty()) {
                    if (!c0517e03.m1527l(className3, c3348c.f10770b)) {
                        ArrayList arrayListM7065b = c3348c.m7065b();
                        ArrayList<String> arrayList = new ArrayList<>();
                        AbstractC4166m.m8405N1(arrayListM7065b, arrayList);
                        className3.putStringArrayListExtra("sns_kemdia_path_list", arrayList);
                    }
                    className3.putExtra("Kdescription", str5);
                } else if (AbstractC3149m.m6721t0(str5)) {
                    c0517e03.m1532r(activity3, "朋友圈内容为空");
                } else {
                    className3.putExtra("Ksnsupload_type", 9);
                    className3.putExtra("Kdescription", str5);
                }
                c0517e03.m1531q(activity3, className3);
                break;
            default:
                C3348c c3348c2 = (C3348c) obj;
                c3348c2.getClass();
                C0517e0 c0517e04 = this.f1646i;
                C0119x c0119x2 = c0517e04.f1593o;
                c0119x2.getClass();
                Activity activity4 = this.f1645h;
                activity4.getClass();
                String str6 = c3348c2.f10769a;
                String str7 = c3348c2.f10771c;
                if (!AbstractC3149m.m6721t0(str7)) {
                    File file2 = new File(str7);
                    strM567a0 = !file2.isFile() ? "朋友圈视频文件不存在" : c0119x2.m592Y(activity4, AbstractC0000a.m99x0(file2), "video/*", str6);
                } else if (c3348c2.m7065b().isEmpty()) {
                    strM567a0 = C0119x.m567a0(activity4, str6, "朋友圈内容为空");
                } else {
                    ArrayList arrayListM7065b2 = c3348c2.m7065b();
                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayListM7065b2));
                    Iterator it = arrayListM7065b2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new File((String) it.next()));
                    }
                    if (arrayList2.isEmpty()) {
                        strM567a0 = c0119x2.m592Y(activity4, arrayList2, "image/*", str6);
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((File) it2.next()).isFile()) {
                                strM567a0 = "部分朋友圈图片文件不存在";
                            }
                        }
                        strM567a0 = c0119x2.m592Y(activity4, arrayList2, "image/*", str6);
                    }
                }
                if (strM567a0 != null) {
                    c0517e04.m1532r(activity4, strM567a0);
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0528o(C0517e0 c0517e0, Activity activity, int i9) {
        this.f1644g = i9;
        this.f1646i = c0517e0;
        this.f1645h = activity;
    }
}
