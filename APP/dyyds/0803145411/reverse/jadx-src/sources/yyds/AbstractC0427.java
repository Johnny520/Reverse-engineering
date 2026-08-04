package yyds;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Binder;
import android.os.Process;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C0040;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛲᛸᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0427 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0415 f2177;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0415 f2178;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final int[] f2179 = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final int[] f2180 = {R.attr.colorSecondary};

    static {
        int i = 1;
        f2177 = new C0415("UNDEFINED", i);
        f2178 = new C0415("REUSABLE_CLAIMED", i);
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static void m1186(Activity activity, View view) {
        WeakReference weakReference = AbstractC1655.f8450;
        FrameLayout frameLayout = new FrameLayout(activity);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 16;
        layoutParams.format = -2;
        layoutParams.type = 1003;
        layoutParams.flags = 201327872;
        layoutParams.softInputMode = 16;
        layoutParams.layoutInDisplayCutoutMode = 1;
        windowManager.addView(frameLayout, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m1187(int i, String str) {
        int iM1190 = m1190(str, 0, i, false);
        Matcher matcher = C2627.f12915.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iM1311 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM1190 < i) {
            int iM11902 = m1190(str, iM1190 + 1, i, true);
            matcher.region(iM1190, iM11902);
            if (i3 == -1 && matcher.usePattern(C2627.f12915).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i5 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(C2627.f12916).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iM1311 == -1) {
                Pattern pattern = C2627.f12918;
                if (matcher.usePattern(pattern).matches()) {
                    iM1311 = AbstractC0473.m1311(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                } else if (i2 == -1 && matcher.usePattern(C2627.f12917).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            }
            iM1190 = m1190(str, iM11902 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            C0188.m798("Failed requirement.");
            return 0L;
        }
        if (iM1311 == -1) {
            C0188.m798("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            C0188.m798("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            C0188.m798("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            C0188.m798("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            C0188.m798("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC0795.f3653);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iM1311 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static void m1188(Context context, C1981 c1981, InterfaceC2266 interfaceC2266) {
        Object next;
        String strM4341;
        String strM43412;
        AbstractC2328.m4341(-236811184669550L);
        AbstractC2328.m4341(-236845544407918L);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_keep_fire_detail, (ViewGroup) new RelativeLayout(context), false);
        int i = R.id.btn_cancel;
        Button button = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_cancel);
        if (button != null) {
            i = R.id.btn_remove;
            Button button2 = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_remove);
            if (button2 != null) {
                i = R.id.iv_avatar;
                ImageView imageView = (ImageView) AbstractC1741.m3479(viewInflate, R.id.iv_avatar);
                if (imageView != null) {
                    i = R.id.tv_add_time;
                    TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_add_time);
                    if (textView != null) {
                        i = R.id.tv_continuous_days;
                        TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_continuous_days);
                        if (textView2 != null) {
                            i = R.id.tv_group_name;
                            TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_group_name);
                            if (textView3 != null) {
                                i = R.id.tv_last_fire_time;
                                TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_last_fire_time);
                                if (textView4 != null) {
                                    i = R.id.tv_nickname;
                                    TextView textView5 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_nickname);
                                    if (textView5 != null) {
                                        i = R.id.tv_type;
                                        TextView textView6 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_type);
                                        if (textView6 != null) {
                                            i = R.id.tv_uid;
                                            TextView textView7 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_uid);
                                            if (textView7 != null) {
                                                AbstractC2328.m4341(-236884199113582L);
                                                AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DouyinDialogStyle).setView((LinearLayout) viewInflate).create();
                                                alertDialogCreate.setCancelable(true);
                                                Window window = alertDialogCreate.getWindow();
                                                if (window != null) {
                                                    window.setBackgroundDrawableResource(android.R.color.transparent);
                                                }
                                                textView5.setText(c1981.m3811());
                                                textView7.setText(AbstractC2328.m4341(-236940033688430L) + c1981.m3815());
                                                textView6.setText(c1981.m3817().f2508);
                                                try {
                                                    ((C0472) ((C0472) ((C0472) ((C0472) ComponentCallbacks2C0040.m250(context).m2500(context).m4277(c1981.m3818()).m1790()).m1793()).m1786(C2340.f11504)).m1798()).m1283(imageView);
                                                } catch (Exception e) {
                                                    C2336.f11496.m4355(AbstractC2328.m4341(-236965803492206L), e);
                                                    imageView.setImageResource(R.drawable.xuhuohuaba);
                                                }
                                                Iterator it = AbstractC1838.m3610().iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        next = null;
                                                        break;
                                                    } else {
                                                        next = it.next();
                                                        if (AbstractC1544.m3188(((C2721) next).m4840(), c1981.m3812())) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                C2721 c2721 = (C2721) next;
                                                if (c2721 == null || (strM4341 = c2721.m4838()) == null) {
                                                    strM4341 = AbstractC2328.m4341(-237043112903534L);
                                                }
                                                textView3.setText(strM4341);
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(c1981.m3820());
                                                sb.append((char) 22825);
                                                textView2.setText(sb.toString());
                                                if (c1981.m3814() > 0) {
                                                    long jM3814 = c1981.m3814();
                                                    long jCurrentTimeMillis = System.currentTimeMillis() - jM3814;
                                                    if (jCurrentTimeMillis < 60000) {
                                                        strM43412 = AbstractC2328.m4341(-237137602184046L);
                                                    } else if (jCurrentTimeMillis < 3600000) {
                                                        strM43412 = (jCurrentTimeMillis / 60000) + AbstractC2328.m4341(-237150487085934L);
                                                    } else if (jCurrentTimeMillis < 86400000) {
                                                        strM43412 = (jCurrentTimeMillis / 3600000) + AbstractC2328.m4341(-237167666955118L);
                                                    } else if (jCurrentTimeMillis < 172800000) {
                                                        strM43412 = AbstractC2328.m4341(-237184846824302L);
                                                    } else if (jCurrentTimeMillis < 604800000) {
                                                        strM43412 = (jCurrentTimeMillis / 86400000) + AbstractC2328.m4341(-237197731726190L);
                                                    } else {
                                                        strM43412 = new SimpleDateFormat(AbstractC2328.m4341(-237210616628078L), Locale.getDefault()).format(new Date(jM3814));
                                                    }
                                                } else {
                                                    strM43412 = AbstractC2328.m4341(-237064587740014L);
                                                }
                                                textView4.setText(strM43412);
                                                textView.setText(c1981.m3813() > 0 ? new SimpleDateFormat(AbstractC2328.m4341(-237077472641902L), Locale.getDefault()).format(new Date(c1981.m3813())) : AbstractC2328.m4341(-237124717282158L));
                                                button.setOnClickListener(new ViewOnClickListenerC0852(alertDialogCreate, 6));
                                                button2.setOnClickListener(new ViewOnClickListenerC0257(context, (Object) c1981, (Object) alertDialogCreate, (Object) interfaceC2266, 6));
                                                textView7.setOnLongClickListener(new ViewOnLongClickListenerC1733(c1981, 2, context));
                                                alertDialogCreate.show();
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C0188.m789(AbstractC2328.m4341(-1744452079747950L).concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[Catch: all -> 0x006b, DONT_GENERATE, TryCatch #2 {all -> 0x006b, blocks: (B:19:0x004e, B:21:0x0058, B:23:0x005e, B:36:0x008b, B:26:0x006d, B:28:0x0077, B:33:0x0082, B:35:0x0088, B:41:0x0098, B:44:0x00a1, B:43:0x009e, B:31:0x007d), top: B:57:0x004e, inners: #0 }] */
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1189(Object obj, InterfaceC0274 interfaceC0274) {
        InterfaceC2798 interfaceC2798;
        if (!(interfaceC0274 instanceof C1118)) {
            interfaceC0274.mo812(obj);
            return;
        }
        C1118 c1118 = (C1118) interfaceC0274;
        AbstractC0974 abstractC0974 = c1118.f5140;
        AbstractC1320 abstractC1320 = c1118.f5139;
        InterfaceC2213 interfaceC2213 = abstractC1320.f6070;
        Throwable thM4249 = C2248.m4249(obj);
        Object c0417 = thM4249 == null ? obj : new C0417(thM4249, false);
        if (abstractC0974.mo2117(interfaceC2213)) {
            c1118.f5137 = c0417;
            c1118.f10086 = 1;
            abstractC0974.mo1251(interfaceC2213, c1118);
            return;
        }
        AbstractC0467 abstractC0467M4643 = AbstractC2567.m4643();
        if (abstractC0467M4643.f2325 >= 4294967296L) {
            c1118.f5137 = c0417;
            c1118.f10086 = 1;
            C0217 c0217 = abstractC0467M4643.f2324;
            if (c0217 == null) {
                c0217 = new C0217();
                abstractC0467M4643.f2324 = c0217;
            }
            c0217.addLast(c1118);
            return;
        }
        abstractC0467M4643.m1250(true);
        try {
            interfaceC2798 = (InterfaceC2798) interfaceC2213.mo423(C1586.f8041);
        } finally {
            try {
            } finally {
            }
        }
        if (interfaceC2798 == null || interfaceC2798.mo2091()) {
            Object objM1832 = AbstractC0797.m1832(interfaceC2213, c1118.f5138);
            C2101 c2101M981 = objM1832 != AbstractC0797.f3657 ? AbstractC0319.m981(abstractC1320, interfaceC2213, objM1832) : null;
            try {
                abstractC1320.mo812(obj);
            } finally {
                if (c2101M981 == null || c2101M981.m3995()) {
                    AbstractC0797.m1826(interfaceC2213, objM1832);
                }
            }
        }
        c1118.mo812(new C2658(interfaceC2798.mo2092()));
        while (abstractC0467M4643.m1243()) {
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static int m1190(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0313 m1191() throws InterruptedException {
        C1760 c1760 = C0313.f1629;
        C0313 c0313 = ((C0313[]) c1760.f8839)[1];
        if (c0313 == null) {
            long jNanoTime = System.nanoTime();
            C0313.f1632.await(C0313.f1633, TimeUnit.MILLISECONDS);
            if (((C0313[]) c1760.f8839)[1] != null || System.nanoTime() - jNanoTime < C0313.f1630) {
                return null;
            }
            return C0313.f1631;
        }
        long jNanoTime2 = c0313.f1636 - System.nanoTime();
        if (jNanoTime2 > 0) {
            C0313.f1632.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c1760.m3500(c0313);
        c0313.f1635 = 2;
        return c0313;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final Object m1192(long j, C1647 c1647, C0081 c0081) throws Throwable {
        Object c0417;
        Object objM2161;
        long jM2016 = AbstractC0902.m2016(j);
        if (jM2016 <= 0) {
            throw new C1263("Timed out immediately", null);
        }
        RunnableC1993 runnableC1993 = new RunnableC1993(jM2016, c0081);
        AbstractC0024.m3302(runnableC1993, true, new C0855(AbstractC0902.m2019(runnableC1993.f8219.mo733()).mo1253(runnableC1993.f9999, runnableC1993, runnableC1993.f1119)));
        try {
            AbstractC0395.m1136(c1647);
            c0417 = c1647.mo511(runnableC1993, runnableC1993);
        } catch (Throwable th) {
            c0417 = new C0417(th, false);
        }
        Object obj = EnumC1765.f8858;
        if (c0417 == obj || (objM2161 = runnableC1993.m2161(c0417)) == AbstractC0395.f2035) {
            return obj;
        }
        if (objM2161 instanceof C0417) {
            Throwable th2 = ((C0417) objM2161).f2152;
            if (!(th2 instanceof C1263) || ((C1263) th2).f5821 != runnableC1993) {
                throw th2;
            }
            if (c0417 instanceof C0417) {
                throw ((C0417) c0417).f2152;
            }
        } else {
            c0417 = AbstractC0395.m1137(objM2161);
        }
        return c0417;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static int m1193(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, context.getOpPackageName()) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static void m1194(C0313 c0313) {
        if (C0313.f1631 == null) {
            C0313.f1631 = new C0313();
            C0840 c0840 = new C0840("Okio Watchdog");
            c0840.setDaemon(true);
            c0840.start();
        }
        long jNanoTime = System.nanoTime();
        long j = c0313.f13478;
        boolean z = c0313.f13476;
        if (j != 0 && z) {
            c0313.f1636 = Math.min(j, c0313.mo2199() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c0313.f1636 = jNanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            c0313.f1636 = c0313.mo2199();
        }
        C1760 c1760 = C0313.f1629;
        int i = c1760.f8838 + 1;
        c1760.f8838 = i;
        C0313[] c0313Arr = (C0313[]) c1760.f8839;
        if (i == c0313Arr.length) {
            C0313[] c0313Arr2 = new C0313[i * 2];
            AbstractC2070.m3937(0, 0, 14, c0313Arr, c0313Arr2);
            c1760.f8839 = c0313Arr2;
        }
        c1760.m3497(i, c0313);
        if (c0313.f1637 == 1) {
            C0313.f1632.signal();
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static void m1195(Activity activity, View view) {
        try {
            if (activity.getWindow().getDecorView().isAttachedToWindow()) {
                m1186(activity, view);
            } else {
                activity.getWindow().getDecorView().post(new RunnableC2660(9, activity, view, false));
            }
        } catch (Exception unused) {
            if (activity == null || activity.isDestroyed()) {
                return;
            }
            m1186(activity, view);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m1196(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
        typedArrayObtainStyledAttributes.recycle();
        if (zHasValue) {
            return;
        }
        C0188.m798(AbstractC2104.m4014("The style on this component requires your app theme to be ", str, " (or a descendant)."));
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final int m1197(InterfaceC1212 interfaceC1212, String str) {
        int columnCount = interfaceC1212.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(interfaceC1212.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = interfaceC1212.getColumnCount();
        while (true) {
            if (i >= columnCount2) {
                i = -1;
                break;
            }
            if (str2.equals(interfaceC1212.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public abstract void mo758(boolean z);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public abstract void mo759(boolean z);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public abstract InputFilter[] mo760(InputFilter[] inputFilterArr);
}
