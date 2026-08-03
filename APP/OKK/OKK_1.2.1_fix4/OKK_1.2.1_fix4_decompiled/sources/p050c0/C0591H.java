package p050c0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p007D0.C0146l;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.C0312l;
import p034S.RunnableC0328h;
import p042W0.AbstractC0425j;
import p049b0.C0566p;
import p056f0.C0826f0;

/* JADX INFO: renamed from: c0.H */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0591H implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1805a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1806b;

    public /* synthetic */ C0591H() {
        this.f1805a = 5;
        this.f1806b = C0826f0.f2992a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    @Override // p029P0.InterfaceC0286l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object objM116u;
        String str;
        Object objM116u2;
        boolean zBooleanValue;
        String string;
        Object objM116u3;
        Bitmap bitmapCreateBitmap;
        boolean z2;
        switch (this.f1805a) {
            case 0:
                View view = (View) obj;
                C0312l c0312l = (C0312l) this.f1806b;
                AbstractC0307g.m703e(c0312l, "$count");
                AbstractC0307g.m703e(view, "view");
                if (view instanceof TextView) {
                    if (view.getId() == -1) {
                        str = "";
                    } else {
                        try {
                            objM116u = view.getResources().getResourceEntryName(view.getId());
                        } catch (Throwable th) {
                            objM116u = AbstractC0040p.m116u(th);
                        }
                        if (objM116u instanceof C0140f) {
                            objM116u = "";
                        }
                        str = (String) objM116u;
                    }
                    if (AbstractC0307g.m699a(str, "icon_tv")) {
                        Set set = AbstractC0597J.f1827a;
                        TextView textView = (TextView) view;
                        CharSequence text = textView.getText();
                        if (text != null && (string = text.toString()) != null) {
                            string = AbstractC0425j.m1022a1(string).toString();
                        }
                        String str2 = string != null ? string : "";
                        if (str2.length() == 0 ? false : AbstractC0597J.f1827a.contains(str2)) {
                            if (textView.isShown() || textView.getVisibility() == 0) {
                                int[] iArr = new int[2];
                                try {
                                    textView.getLocationOnScreen(iArr);
                                    int i2 = textView.getResources().getDisplayMetrics().heightPixels;
                                    int i3 = iArr[1];
                                    int height = textView.getHeight() > 0 ? textView.getHeight() : textView.getMeasuredHeight();
                                    float f2 = i2;
                                    objM116u2 = Boolean.valueOf(((float) i3) > 0.88f * f2 && 1 <= height && height <= ((int) (f2 * 0.08f)));
                                } catch (Throwable th2) {
                                    objM116u2 = AbstractC0040p.m116u(th2);
                                }
                                Object obj2 = Boolean.FALSE;
                                if (objM116u2 instanceof C0140f) {
                                    objM116u2 = obj2;
                                }
                                zBooleanValue = ((Boolean) objM116u2).booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                int visibility = textView.getVisibility();
                                Set set2 = C0594I.f1816e;
                                if (visibility != 8) {
                                    set2.add(textView);
                                    try {
                                        textView.setVisibility(8);
                                        textView.setAlpha(0.0f);
                                        textView.setClickable(false);
                                        textView.setFocusable(false);
                                        z = true;
                                    } catch (Throwable unused) {
                                    }
                                } else if (textView.getAlpha() == 0.0f) {
                                    set2.add(textView);
                                }
                            }
                            if (z) {
                                c0312l.f594a++;
                            }
                        }
                    }
                    break;
                }
                return C0146l.f339a;
            case 1:
                File file = (File) this.f1806b;
                AbstractC0307g.m703e((String) obj, "it");
                ConcurrentHashMap concurrentHashMap = AbstractC0626U.f1936a;
                try {
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    if (bitmapDecodeFile == null) {
                        return null;
                    }
                    boolean zIsNinePatchChunk = NinePatch.isNinePatchChunk(bitmapDecodeFile.getNinePatchChunk());
                    byte[] ninePatchChunk = zIsNinePatchChunk ? bitmapDecodeFile.getNinePatchChunk() : AbstractC0626U.m1529b(bitmapDecodeFile);
                    if (ninePatchChunk == null) {
                        return null;
                    }
                    if (zIsNinePatchChunk) {
                        bitmapCreateBitmap = bitmapDecodeFile;
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 1, 1, bitmapDecodeFile.getWidth() - 2, bitmapDecodeFile.getHeight() - 2);
                        AbstractC0307g.m700b(bitmapCreateBitmap);
                    }
                    objM116u3 = new C0622S(bitmapCreateBitmap, ninePatchChunk, zIsNinePatchChunk ? new Rect() : AbstractC0626U.m1531d(bitmapDecodeFile));
                    break;
                } catch (Throwable th3) {
                    objM116u3 = AbstractC0040p.m116u(th3);
                }
                return (C0622S) (objM116u3 instanceof C0140f ? null : objM116u3);
            case 2:
                ClassLoader classLoader = (ClassLoader) this.f1806b;
                ImageView imageView = (ImageView) obj;
                AbstractC0307g.m703e(classLoader, "$classLoader");
                AbstractC0307g.m703e(imageView, "iv");
                C0580D0 c0580d0 = C0580D0.f1723a;
                String strM1409p = C0580D0.m1409p(classLoader);
                if (AbstractC0425j.m1013R0(strM1409p)) {
                    strM1409p = C0580D0.f1736n;
                }
                if (true ^ AbstractC0425j.m1013R0(strM1409p)) {
                    try {
                        Method methodM1408o = C0580D0.f1742t;
                        if (methodM1408o == null) {
                            methodM1408o = C0580D0.m1408o(classLoader);
                        }
                        if (methodM1408o != null) {
                            methodM1408o.invoke(null, imageView, strM1409p);
                        }
                    } catch (Throwable th4) {
                        AbstractC0040p.m116u(th4);
                    }
                    break;
                }
                return C0146l.f339a;
            case 3:
                String str3 = (String) obj;
                C0613O0 c0613o0 = (C0613O0) this.f1806b;
                AbstractC0307g.m703e(c0613o0, "$identity");
                AbstractC0307g.m703e(str3, "name");
                C0688q1.f2169g.post(new RunnableC0328h(c0613o0, str3, 3));
                return C0146l.f339a;
            case 4:
                EnumC0583E0 enumC0583E0 = (EnumC0583E0) obj;
                EnumC0583E0 enumC0583E02 = (EnumC0583E0) this.f1806b;
                AbstractC0307g.m703e(enumC0583E02, "$s");
                AbstractC0307g.m703e(enumC0583E0, "it");
                return Boolean.valueOf(enumC0583E0 == enumC0583E02);
            default:
                AbstractC0307g.m703e((C0826f0) this.f1806b, "$this_runCatching");
                if (obj != null) {
                    Object objM1376a = C0566p.m1376a(obj, new String[]{"j"});
                    if (objM1376a == null) {
                        objM1376a = obj;
                    }
                    Set set3 = C0826f0.f2995d;
                    AbstractC0307g.m702d(set3, "markedModernItems");
                    synchronized (set3) {
                        if (!set3.contains(obj)) {
                            z2 = set3.contains(objM1376a);
                        }
                    }
                    if (z2) {
                        z = true;
                    } else {
                        Object objM1376a2 = C0566p.m1376a(obj, new String[]{"v", "A6"});
                        string = objM1376a2 instanceof String ? (String) objM1376a2 : null;
                        if (string == null && (string = C0826f0.m2141g(obj)) == null) {
                            Object objM1376a3 = C0566p.m1376a(obj, new String[]{"j"});
                            if (objM1376a3 != null) {
                                obj = objM1376a3;
                            }
                            string = C0826f0.m2141g(obj);
                        }
                        if (AbstractC0307g.m699a(string, "SettingGroup_Main_OKK") || AbstractC0307g.m699a(string, "abc_module_settings_entry")) {
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ C0591H(int i2, Object obj) {
        this.f1805a = i2;
        this.f1806b = obj;
    }
}
