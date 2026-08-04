package yyds;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: yyds.ᛴᛲᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0805 implements InterfaceC1352, InterfaceC1504, InterfaceC2587, InterfaceC2768, InterfaceC1685, InterfaceC0790, InterfaceC0503, InterfaceC0132, InterfaceC2053, InterfaceC1454 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3695;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0805 f3694 = new C0805(1);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0805 f3691 = new C0805(2);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C0805 f3693 = new C0805(3);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C0805 f3692 = new C0805(4);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C0805 f3690 = new C0805(5);

    public C0805(C2791 c2791) {
        this.f3695 = 16;
        new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static String m1854(long j) {
        if (j <= 0) {
            return AbstractC2328.m4341(-224922715194222L);
        }
        String[] strArr = {AbstractC2328.m4341(-224939895063406L), AbstractC2328.m4341(-224948484997998L), AbstractC2328.m4341(-224961369899886L), AbstractC2328.m4341(-224974254801774L), AbstractC2328.m4341(-224987139703662L)};
        double d = j;
        int i = 0;
        while (d >= 1024.0d && i < 4) {
            d /= 1024.0d;
            i++;
        }
        if (i != 0) {
            String str = String.format(Locale.getDefault(), AbstractC2328.m4341(-225012909507438L), Arrays.copyOf(new Object[]{Double.valueOf(d), strArr[i]}, 2));
            AbstractC2328.m4341(-225047269245806L);
            return str;
        }
        return j + AbstractC2328.m4341(-225000024605550L);
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static C1248 m1855(String str) {
        C1248 c1248 = new C1248(str);
        C1248.f5731.put(str, c1248);
        return c1248;
    }

    @Override // yyds.InterfaceC2053
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // yyds.InterfaceC2053
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    public String toString() {
        switch (this.f3695) {
            case 3:
                return "{}";
            default:
                return super.toString();
        }
    }

    @Override // yyds.InterfaceC1454
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public void mo603(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // yyds.InterfaceC2587
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public void mo1856(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // yyds.InterfaceC2768
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public InterfaceC0894 mo382(C0644 c0644) {
        int i = 0;
        switch (this.f3695) {
            case 9:
                return new C0455(i, new C0469(9));
            case 25:
                return new C2589(c0644.m1565(Uri.class, InputStream.class), i);
            default:
                return new C2385(c0644.m1565(C0714.class, InputStream.class));
        }
    }

    @Override // yyds.InterfaceC2587
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public void mo1857(int i) {
    }

    @Override // yyds.InterfaceC0132
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public void mo578(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // yyds.InterfaceC0790
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public Class mo1779() {
        return ParcelFileDescriptor.class;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:4|(2:6|(1:8)(1:9))(0)|10|(1:(1:(2:15|16)(1:17))(1:18))(2:19|(0))|22|81|23|(1:25)(1:26)|(3:28|(4:31|(7:83|33|88|(1:35)(1:36)|37|(1:39)(1:40)|(1:92)(3:87|43|93))(1:90)|89|29)|85)|45|(2:48|46)|94|49|(2:51|(0))(2:54|(0))|16) */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1858(Context context, Comment comment, Dialog dialog, AbstractC1320 abstractC1320) throws Throwable {
        C0242 c0242;
        Context context2;
        Comment comment2;
        C0186 c0186;
        Context context3 = context;
        Comment comment3 = comment;
        int i = this.f3695;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        C2746 c2746 = C2746.f13459;
        int i2 = 2;
        InterfaceC0274 interfaceC0274 = null;
        switch (i) {
            case 1:
                if (abstractC1320 instanceof C0242) {
                    c0242 = (C0242) abstractC1320;
                    int i3 = c0242.f1342;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0242.f1342 = i3 - Integer.MIN_VALUE;
                    } else {
                        c0242 = new C0242(this, abstractC1320);
                    }
                }
                Object obj = c0242.f1339;
                int i4 = c0242.f1342;
                if (i4 != 0) {
                    if (i4 == 1) {
                        Comment comment4 = c0242.f1341;
                        Context context4 = c0242.f1343;
                        AbstractC1544.m3189(obj);
                        comment2 = comment4;
                        context2 = context4;
                    } else if (i4 == 2) {
                        AbstractC1544.m3189(obj);
                    } else {
                        C0188.m800(AbstractC2328.m4341(-192998223283054L));
                    }
                    break;
                } else {
                    AbstractC1544.m3189(obj);
                    C1206 c1206 = AbstractC0221.f1238;
                    C1158 c1158 = AbstractC1353.f6250;
                    C2435 c2435 = new C2435(dialog, interfaceC0274, i2);
                    c0242.f1343 = context3;
                    c0242.f1341 = comment3;
                    c0242.f1342 = 1;
                    if (AbstractC2071.m3955(c1158, c2435, c0242) != enumC1765) {
                        context2 = context3;
                        comment2 = comment3;
                    }
                }
                LinearLayout linearLayout = new LinearLayout(context2);
                linearLayout.setOrientation(1);
                int iApplyDimension = (int) TypedValue.applyDimension(1, 16.0f, context2.getResources().getDisplayMetrics());
                linearLayout.setPadding(iApplyDimension, 0, iApplyDimension, iApplyDimension);
                ScrollView scrollView = new ScrollView(context2);
                scrollView.addView(linearLayout);
                C1206 c12062 = AbstractC0221.f1238;
                C1158 c11582 = AbstractC1353.f6250;
                C1007 c1007 = new C1007(context2, scrollView, comment2, linearLayout, null, 1);
                c0242.f1343 = null;
                c0242.f1341 = null;
                c0242.f1342 = 2;
                if (AbstractC2071.m3955(c11582, c1007, c0242) == enumC1765) {
                }
                break;
            default:
                if (abstractC1320 instanceof C0186) {
                    c0186 = (C0186) abstractC1320;
                    int i5 = c0186.f1109;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0186.f1109 = i5 - Integer.MIN_VALUE;
                    } else {
                        c0186 = new C0186(this, abstractC1320);
                    }
                }
                Object obj2 = c0186.f1106;
                int i6 = c0186.f1109;
                int i7 = 3;
                if (i6 != 0) {
                    if (i6 == 1) {
                        Comment comment5 = c0186.f1108;
                        Context context5 = c0186.f1110;
                        AbstractC1544.m3189(obj2);
                        comment3 = comment5;
                        context3 = context5;
                    } else if (i6 == 2 || i6 == 3) {
                        AbstractC1544.m3189(obj2);
                    } else {
                        C0188.m800(AbstractC2328.m4341(-146041345835886L));
                    }
                    break;
                } else {
                    AbstractC1544.m3189(obj2);
                    C2701.f13261.getClass();
                    C2701.m4807(context3);
                    C1206 c12063 = AbstractC0221.f1238;
                    C1158 c11583 = AbstractC1353.f6250;
                    C2435 c24352 = new C2435(dialog, interfaceC0274, i7);
                    c0186.f1110 = context3;
                    c0186.f1108 = comment3;
                    c0186.f1109 = 1;
                    if (AbstractC2071.m3955(c11583, c24352, c0186) == enumC1765) {
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Field declaredField = comment3.getClass().getDeclaredField(AbstractC2328.m4341(-145826597471086L));
                declaredField.setAccessible(true);
                Object obj3 = declaredField.get(comment3);
                List list = obj3 instanceof List ? (List) obj3 : null;
                if (list != null) {
                    for (Object obj4 : list) {
                        if (obj4 != null) {
                            try {
                                Field declaredField2 = obj4.getClass().getDeclaredField(AbstractC2328.m4341(-145908201849710L));
                                Field declaredField3 = obj4.getClass().getDeclaredField(AbstractC2328.m4341(-145942561588078L));
                                declaredField2.setAccessible(true);
                                declaredField3.setAccessible(true);
                                Object obj5 = declaredField2.get(obj4);
                                String str = obj5 instanceof String ? (String) obj5 : null;
                                Object obj6 = declaredField3.get(obj4);
                                String str2 = obj6 instanceof String ? (String) obj6 : null;
                                if (str != null && str2 != null) {
                                    linkedHashMap.put(str, str2);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(new C1274((String) entry.getKey(), (String) entry.getValue()));
                }
                C2336.f11496.m4354(AbstractC2328.m4341(-145981216293742L) + arrayList);
                if (arrayList.isEmpty()) {
                    C1206 c12064 = AbstractC0221.f1238;
                    C1158 c11584 = AbstractC1353.f6250;
                    C0266 c0266 = new C0266(2, null, 3);
                    c0186.f1110 = null;
                    c0186.f1108 = null;
                    c0186.f1109 = 2;
                    if (AbstractC2071.m3955(c11584, c0266, c0186) == enumC1765) {
                    }
                } else {
                    C1206 c12065 = AbstractC0221.f1238;
                    C1158 c11585 = AbstractC1353.f6250;
                    C2576 c2576 = new C2576(context3, arrayList, interfaceC0274, i7);
                    c0186.f1110 = null;
                    c0186.f1108 = null;
                    c0186.f1109 = 3;
                    if (AbstractC2071.m3955(c11585, c2576, c0186) == enumC1765) {
                    }
                }
                break;
        }
        return c2746;
    }

    @Override // yyds.InterfaceC1454
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public void mo606(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // yyds.InterfaceC1504
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean mo1859(SSLSocket sSLSocket) {
        return sSLSocket.getClass().getName().startsWith("com.google.android.gms.org.conscrypt.");
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public synchronized C1248 m1860(String str) {
        C1248 c1248;
        try {
            LinkedHashMap linkedHashMap = C1248.f5731;
            c1248 = (C1248) linkedHashMap.get(str);
            if (c1248 == null) {
                c1248 = (C1248) linkedHashMap.get(str.startsWith("TLS_") ? "SSL_".concat(str.substring(4)) : str.startsWith("SSL_") ? "TLS_".concat(str.substring(4)) : str);
                if (c1248 == null) {
                    c1248 = new C1248(str);
                }
                linkedHashMap.put(str, c1248);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1248;
    }

    @Override // yyds.InterfaceC2587
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Bitmap mo1861(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // yyds.InterfaceC0790
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public Object mo1780(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // yyds.InterfaceC2587
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public void mo1862() {
    }

    @Override // yyds.InterfaceC0503
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public boolean mo609(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0 || str.trim() != str) {
            return true;
        }
        char cCharAt = str.charAt(0);
        if (AbstractC1960.m3788(cCharAt) || AbstractC1960.m3786(cCharAt)) {
            return true;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == '}' || cCharAt2 == ']' || cCharAt2 == ',' || cCharAt2 == ':' || AbstractC1960.m3786(cCharAt2)) {
                return true;
            }
        }
        if (AbstractC1960.m3775(str)) {
            return true;
        }
        char cCharAt3 = str.charAt(0);
        if ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '-') {
            int i2 = 1;
            while (i2 < length) {
                cCharAt3 = str.charAt(i2);
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    break;
                }
                i2++;
            }
            if (i2 == length) {
                return true;
            }
            if (cCharAt3 == '.') {
                i2++;
            }
            while (i2 < length) {
                cCharAt3 = str.charAt(i2);
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    break;
                }
                i2++;
            }
            if (i2 == length) {
                return true;
            }
            if (cCharAt3 == 'E' || cCharAt3 == 'e') {
                int i3 = i2 + 1;
                if (i3 == length) {
                    return false;
                }
                char cCharAt4 = str.charAt(i3);
                if (cCharAt4 == '+' || cCharAt4 == '-') {
                    i2 += 2;
                    str.charAt(i2);
                } else {
                    i2 = i3;
                }
            }
            if (i2 == length) {
                return false;
            }
            while (i2 < length) {
                char cCharAt5 = str.charAt(i2);
                if (cCharAt5 < '0' || cCharAt5 > '9') {
                    break;
                }
                i2++;
            }
            if (i2 == length) {
                return true;
            }
        }
        return false;
    }

    @Override // yyds.InterfaceC1685
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public void mo610(Object obj) {
    }

    @Override // yyds.InterfaceC0790
    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public void mo1781(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // yyds.InterfaceC2587
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Bitmap mo1863(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // yyds.InterfaceC1504
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public InterfaceC0881 mo1864(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C0690(superclass);
    }

    public /* synthetic */ C0805(int i) {
        this.f3695 = i;
    }
}
