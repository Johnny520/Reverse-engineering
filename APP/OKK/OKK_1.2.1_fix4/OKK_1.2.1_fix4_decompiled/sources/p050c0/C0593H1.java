package p050c0;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import p001A0.AbstractC0040p;
import p001A0.RunnableC0028d;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: c0.H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0593H1 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0599J1 f1811c;

    public C0593H1(int i2) {
        this.f1810b = i2;
        switch (i2) {
            case 1:
                this.f1811c = C0599J1.f1831a;
                break;
            case 2:
                this.f1811c = C0599J1.f1831a;
                break;
            case 3:
                this.f1811c = C0599J1.f1831a;
                break;
            case 4:
                this.f1811c = C0599J1.f1831a;
                break;
            case 5:
                this.f1811c = C0599J1.f1831a;
                break;
            default:
                this.f1811c = C0599J1.f1831a;
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        Uri data;
        Object objM116u;
        View decorView;
        Object objM116u2;
        switch (this.f1810b) {
            case 0:
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                Integer num = objM537n0 instanceof Integer ? (Integer) objM537n0 : null;
                if (num != null && num.intValue() == 658449) {
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    Object objM537n02 = AbstractC0179j.m537n0(1, objArr2);
                    Integer num2 = objM537n02 instanceof Integer ? (Integer) objM537n02 : null;
                    if (num2 != null && num2.intValue() == -1) {
                        Object[] objArr3 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr3, "args");
                        Object objM537n03 = AbstractC0179j.m537n0(2, objArr3);
                        Intent intent = objM537n03 instanceof Intent ? (Intent) objM537n03 : null;
                        if (intent == null || (data = intent.getData()) == null) {
                            return;
                        }
                        Object obj = c0760b.f2669b;
                        Activity activity = obj instanceof Activity ? (Activity) obj : null;
                        if (activity == null) {
                            return;
                        }
                        C0575B1 c0575b1 = C0575B1.f1701a;
                        try {
                            File file = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK");
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            File file2 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "theme_wallpaper.jpg");
                            InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(data);
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStreamOpenInputStream.available()));
                                    AbstractC0040p.m115t(inputStreamOpenInputStream, byteArrayOutputStream, 8192);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    AbstractC0307g.m702d(byteArray, "toByteArray(...)");
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                                    int i2 = options.outWidth;
                                    int i3 = options.outHeight;
                                    int i4 = 1;
                                    while (true) {
                                        if (i2 <= 1440 && i3 <= 1440) {
                                            if (i4 < 1) {
                                                i4 = 1;
                                            }
                                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                                            options2.inSampleSize = i4;
                                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options2);
                                            if (bitmapDecodeByteArray == null) {
                                                AbstractC0040p.m108m(inputStreamOpenInputStream, null);
                                            } else {
                                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                try {
                                                    bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 88, fileOutputStream);
                                                    AbstractC0040p.m108m(fileOutputStream, null);
                                                    if (bitmapDecodeByteArray != C0575B1.f1708h) {
                                                        C0575B1.f1708h = bitmapDecodeByteArray;
                                                        C0575B1.f1709i = file2.getAbsolutePath();
                                                    }
                                                    AbstractC0040p.m108m(inputStreamOpenInputStream, null);
                                                    String strValueOf = String.valueOf(System.currentTimeMillis());
                                                    C0661h1 c0661h1 = C0661h1.f2048a;
                                                    String absolutePath = file2.getAbsolutePath();
                                                    AbstractC0307g.m702d(absolutePath, "getAbsolutePath(...)");
                                                    c0661h1.m1666f("theme_wallpaper_path", absolutePath, false);
                                                    c0661h1.m1667g("theme_wallpaper_enabled", true, false);
                                                    c0661h1.m1666f("theme_wallpaper_updated", strValueOf, false);
                                                    C0575B1.f1704d = true;
                                                    C0575B1.f1706f = file2.getAbsolutePath();
                                                    C0575B1.f1707g = strValueOf;
                                                    C0575B1.f1710j = strValueOf;
                                                    C0575B1.f1703c = SystemClock.uptimeMillis();
                                                    C0575B1.m1389f();
                                                    z = true;
                                                } finally {
                                                }
                                            }
                                        }
                                        i4 *= 2;
                                        i2 /= 2;
                                        i3 /= 2;
                                    }
                                } finally {
                                }
                            }
                            objM116u = Boolean.valueOf(z);
                        } catch (Throwable th) {
                            objM116u = AbstractC0040p.m116u(th);
                        }
                        Boolean bool = Boolean.FALSE;
                        boolean z2 = objM116u instanceof C0140f;
                        Object obj2 = objM116u;
                        if (z2) {
                            obj2 = bool;
                        }
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        this.f1811c.getClass();
                        C0599J1.m1485c("pick ok=" + zBooleanValue);
                        if (zBooleanValue) {
                            C0575B1 c0575b12 = C0575B1.f1701a;
                            C0661h1.f2048a.m1667g("theme_wallpaper_enabled", true, true);
                            C0575B1.f1704d = true;
                            C0575B1.f1703c = SystemClock.uptimeMillis();
                            Window window = activity.getWindow();
                            if (window == null || (decorView = window.getDecorView()) == null) {
                                return;
                            }
                            decorView.post(new RunnableC0028d());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Object obj3 = c0760b.f2669b;
                Activity activity2 = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity2 != null && C0575B1.f1701a.m1393e()) {
                    Object obj4 = C0590G1.f1792a;
                    if (C0590G1.m1459q(activity2)) {
                        try {
                            if (C0590G1.m1459q(activity2)) {
                                C0590G1.m1466x(activity2);
                                C0590G1.m1443a(activity2);
                            } else {
                                C0590G1.m1454l(activity2);
                            }
                            objM116u2 = C0146l.f339a;
                            break;
                        } catch (Throwable th2) {
                            objM116u2 = AbstractC0040p.m116u(th2);
                        }
                        Throwable thM465a = AbstractC0141g.m465a(objM116u2);
                        if (thM465a != null) {
                            String strM725h = AbstractC0324d.m725h("resume: ", thM465a.getMessage());
                            this.f1811c.getClass();
                            C0599J1.m1485c(strM725h);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                if (C0575B1.f1701a.m1393e()) {
                    Object[] objArr4 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr4, "args");
                    Object objM537n04 = AbstractC0179j.m537n0(0, objArr4);
                    Integer num3 = objM537n04 instanceof Integer ? (Integer) objM537n04 : null;
                    if (num3 != null && num3.intValue() == 0) {
                        Object obj5 = c0760b.f2669b;
                        AbstractC0307g.m702d(obj5, "thisObject");
                        this.f1811c.getClass();
                        Activity activityM1484b = C0599J1.m1484b(obj5);
                        if (activityM1484b == null) {
                            Object obj6 = C0590G1.f1792a;
                            activityM1484b = C0590G1.m1468z();
                            if (activityM1484b == null) {
                                return;
                            }
                        }
                        Object obj7 = C0590G1.f1792a;
                        C0590G1.m1464v(activityM1484b);
                        Object obj8 = c0760b.f2669b;
                        AbstractC0307g.m702d(obj8, "thisObject");
                        C0599J1.m1483a(obj8);
                        C0599J1.m1485c("NewChattingTabUI.q reveal after");
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (C0575B1.f1701a.m1393e()) {
                    Object obj9 = c0760b.f2672e;
                    Boolean bool2 = obj9 instanceof Boolean ? (Boolean) obj9 : null;
                    if (bool2 != null ? bool2.booleanValue() : false) {
                        Object obj10 = c0760b.f2669b;
                        AbstractC0307g.m702d(obj10, "thisObject");
                        this.f1811c.getClass();
                        Activity activityM1484b2 = C0599J1.m1484b(obj10);
                        if (activityM1484b2 == null) {
                            Object obj11 = C0590G1.f1792a;
                            activityM1484b2 = C0590G1.m1468z();
                            if (activityM1484b2 == null) {
                                return;
                            }
                        }
                        Object obj12 = C0590G1.f1792a;
                        C0590G1.m1439B(activityM1484b2);
                        Object obj13 = c0760b.f2669b;
                        AbstractC0307g.m702d(obj13, "thisObject");
                        C0599J1.m1483a(obj13);
                        C0599J1.m1485c("NewChattingTabUI.f restore");
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b c0760b) {
        C0599J1 c0599j1 = this.f1811c;
        switch (this.f1810b) {
            case 2:
                if (C0575B1.f1701a.m1393e()) {
                    Object obj = c0760b.f2669b;
                    Activity activity = obj instanceof Activity ? (Activity) obj : null;
                    if (activity != null) {
                        Object obj2 = C0590G1.f1792a;
                        C0590G1.m1463u(activity);
                        c0760b.f2670c[2] = Boolean.FALSE;
                        c0599j1.getClass();
                        C0599J1.m1485c("LauncherUI.startChatting snapshot noAnim");
                        break;
                    }
                }
                break;
            case 3:
                if (C0575B1.f1701a.m1393e()) {
                    Object obj3 = c0760b.f2669b;
                    AbstractC0307g.m702d(obj3, "thisObject");
                    c0599j1.getClass();
                    Activity activityM1484b = C0599J1.m1484b(obj3);
                    if (activityM1484b == null) {
                        Object obj4 = C0590G1.f1792a;
                        activityM1484b = C0590G1.m1468z();
                        if (activityM1484b == null) {
                        }
                    }
                    Object obj5 = C0590G1.f1792a;
                    C0590G1.m1463u(activityM1484b);
                    c0760b.f2670c[2] = Boolean.FALSE;
                    C0599J1.m1485c("NewChattingTabUI.r snapshot noAnim");
                    break;
                }
                break;
            case 4:
                if (C0575B1.f1701a.m1393e()) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                    Integer num = objM537n0 instanceof Integer ? (Integer) objM537n0 : null;
                    if (num != null && num.intValue() == 0) {
                        Object obj6 = c0760b.f2669b;
                        AbstractC0307g.m702d(obj6, "thisObject");
                        c0599j1.getClass();
                        Activity activityM1484b2 = C0599J1.m1484b(obj6);
                        if (activityM1484b2 == null) {
                            Object obj7 = C0590G1.f1792a;
                            activityM1484b2 = C0590G1.m1468z();
                            if (activityM1484b2 == null) {
                            }
                        }
                        Object obj8 = C0590G1.f1792a;
                        C0590G1.m1464v(activityM1484b2);
                        Object obj9 = c0760b.f2669b;
                        AbstractC0307g.m702d(obj9, "thisObject");
                        C0599J1.m1483a(obj9);
                        C0599J1.m1485c("NewChattingTabUI.q reveal before");
                    }
                    break;
                }
                break;
            case 5:
                if (C0575B1.f1701a.m1393e()) {
                    Object obj10 = c0760b.f2669b;
                    AbstractC0307g.m702d(obj10, "thisObject");
                    c0599j1.getClass();
                    Activity activityM1484b3 = C0599J1.m1484b(obj10);
                    if (activityM1484b3 == null) {
                        Object obj11 = C0590G1.f1792a;
                        activityM1484b3 = C0590G1.m1468z();
                    }
                    if (activityM1484b3 != null) {
                        Object obj12 = C0590G1.f1792a;
                        C0590G1.m1462t(activityM1484b3);
                    }
                    Object obj13 = c0760b.f2669b;
                    AbstractC0307g.m702d(obj13, "thisObject");
                    C0599J1.m1483a(obj13);
                    c0760b.f2670c[0] = Boolean.FALSE;
                }
                break;
        }
    }
}
