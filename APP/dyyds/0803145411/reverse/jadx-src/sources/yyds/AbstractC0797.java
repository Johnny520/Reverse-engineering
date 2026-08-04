package yyds;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.NativeUtil;
import com.android.app.CustomRecyclerView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛴᛲᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0797 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2196 f3656 = new C2196(8);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0415 f3657 = new C0415("NO_THREAD_ELEMENTS", 1);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C2809 f3658 = new C2809(7);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C2809 f3659 = new C2809(8);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C2809 f3655 = new C2809(9);

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static void m1811(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static byte[] m1812(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                C0188.m800(AbstractC0897.m1989(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static EnumC2365 m1813(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC2365.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC2365.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC2365.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC2365.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC2365.SSL_3_0;
        }
        C0188.m798("Unexpected TLS version: ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static Animation m1814(Context context, int i) {
        Context contextM3376 = AbstractC1655.m3376();
        if (contextM3376 != null) {
            context = contextM3376;
        }
        if (context != null && i != 0) {
            try {
                return AnimationUtils.loadAnimation(context, i);
            } catch (Throwable unused) {
            }
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
        alphaAnimation.setDuration(180L);
        return alphaAnimation;
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static final void m1815(TextView textView, C1213 c1213, View view, Context context) {
        List listM3610 = AbstractC1838.m3610();
        textView.setText(AbstractC2328.m4341(-186263714562926L) + listM3610.size() + AbstractC2328.m4341(-186276599464814L));
        if (listM3610.isEmpty()) {
            c1213.setVisibility(8);
            view.setVisibility(0);
            return;
        }
        c1213.setVisibility(0);
        view.setVisibility(8);
        C0079 c0079 = new C0079(context, new C0748(0, context, view, textView, c1213), new C0748(1, context, view, textView, c1213));
        c1213.setAdapter(c0079);
        c0079.f1986.m1156(listM3610, null);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static Intent m1816(Context context, AbstractC0333... abstractC0333Arr) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        if (abstractC0333Arr != null && abstractC0333Arr.length > 0 && AbstractC1400.f6577 == -1680767897) {
            Bundle bundle = new Bundle();
            ArrayList<String> arrayList = new ArrayList<>();
            for (AbstractC0333 abstractC0333 : abstractC0333Arr) {
                arrayList.add(abstractC0333.mo1021());
            }
            bundle.putStringArrayList("permissionList", arrayList);
            intent.putExtras(bundle);
            intent.putExtra("isGetPermission", true);
        }
        return intent;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final String m1817(C1605 c1605, int i) {
        String str = (String) AbstractC2070.m3931((i * 2) + 1, c1605.f8174);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static final void m1818(C0172 c0172, C2454 c2454, C1417 c1417, C0172 c01722, C1417 c14172, C1271 c1271, TextView textView, CustomRecyclerView customRecyclerView, TextView textView2, List list, LinkedHashSet linkedHashSet, boolean z) {
        InterfaceC2798 interfaceC2798 = (InterfaceC2798) c0172.f997;
        if (interfaceC2798 != null) {
            interfaceC2798.mo2093(null);
        }
        c0172.f997 = AbstractC2071.m3959(c2454, null, new C0453(c1417, z, c01722, c14172, c1271, textView, customRecyclerView, textView2, list, linkedHashSet, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final void m1819(InterfaceC1212 interfaceC1212, Throwable th) throws Exception {
        boolean zIsTerminated;
        if (interfaceC1212 != 0) {
            if (th != null) {
                try {
                    AbstractC2104.m4005(interfaceC1212);
                    return;
                } catch (Throwable th2) {
                    AbstractC1579.m3235(th, th2);
                    return;
                }
            }
            if (interfaceC1212 instanceof AutoCloseable) {
                interfaceC1212.close();
                return;
            }
            if (!(interfaceC1212 instanceof ExecutorService)) {
                if (interfaceC1212 instanceof TypedArray) {
                    ((TypedArray) interfaceC1212).recycle();
                    return;
                } else {
                    C1693.m3437();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) interfaceC1212;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static final ArrayList m1820(C0172 c0172) {
        C2615.f12860.getClass();
        String strM4715 = C2615.m4715();
        Iterable iterable = (Iterable) c0172.f997;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            C1132 c1132 = (C1132) obj;
            String strM2321 = c1132.m2321();
            if (strM2321 == null || AbstractC0473.m1313(strM2321) || AbstractC1544.m3188(c1132.m2321(), strM4715)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static byte[] m1821(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static final void m1822(C0172 c0172, C0172 c01722, C0172 c01723, C0172 c01724, C0172 c01725, C2531 c2531) {
        C2417 c2417;
        List listM3608 = AbstractC1838.m3608();
        String str = (String) c01722.f997;
        String str2 = (String) c01723.f997;
        String str3 = (String) c01724.f997;
        ArrayList arrayList = new ArrayList();
        Iterator it = listM3608.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C1981 c1981 = (C1981) next;
            boolean z = str.length() == 0 || AbstractC0473.m1301(c1981.m3811(), str, true) || AbstractC0473.m1301(c1981.m3815(), str, true);
            boolean zEquals = str2 == null ? true : c1981.m3817().f2508.equals(str2);
            boolean zM3188 = str3 != null ? AbstractC1544.m3188(c1981.m3812(), str3) : true;
            if (z && zEquals && zM3188) {
                arrayList.add(next);
            }
        }
        c0172.f997 = new ArrayList(arrayList);
        Object obj = c01725.f997;
        if (obj == null) {
            AbstractC2328.m4341(-185679599010670L);
            c2417 = null;
        } else {
            c2417 = (C2417) obj;
        }
        c2417.f1986.m1156((List) c0172.f997, null);
        boolean zIsEmpty = ((List) c0172.f997).isEmpty();
        LinearLayout linearLayout = (LinearLayout) c2531.f12465;
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) c2531.f12464;
        if (zIsEmpty) {
            customRecyclerView.setVisibility(8);
            linearLayout.setVisibility(0);
        } else {
            customRecyclerView.setVisibility(0);
            linearLayout.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C1605 m1823(C2135 c2135) {
        return new C1605((String[]) c2135.f10556.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static final void m1824(TextView textView, TextView textView2, Integer num, int i) {
        textView.setText(AbstractC2328.m4341(-188578701935470L) + i + AbstractC2328.m4341(-188595881804654L));
        textView2.setText((num != null && num.intValue() == 1 && i > 0) ? AbstractC2328.m4341(-188608766706542L) : (num != null && num.intValue() == 1) ? AbstractC2328.m4341(-188634536510318L) : AbstractC0897.m1999(new StringBuilder(AbstractC2328.m4341(-188647421412206L)), i, (char) 65289));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [yyds.ᛸᲁᛳᲇ] */
    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static void m1825(Context context, final List list, Integer num, String str, String str2, InterfaceC1549 interfaceC1549) {
        Method method;
        Field field;
        C2454 c2454;
        Object obj;
        Object c2658;
        Object obj2;
        C1928 c1928;
        C0172 c0172;
        Object obj3;
        AbstractC2328.m4341(-185293051954030L);
        AbstractC2328.m4341(-185327411692398L);
        AbstractC2328.m4341(-185400426136430L);
        AbstractC2328.m4341(-185426195940206L);
        AbstractC2328.m4341(-185477735547758L);
        C2701.f13261.getClass();
        C2701.m4807(context);
        List listM3262 = AbstractC1595.m3262(list, num != null ? num.intValue() : Integer.MAX_VALUE);
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM3262.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((C1132) it.next()).m2320());
        }
        View viewInflate = AbstractC1115.m2309(context).inflate(R.layout.dialog_emoji_selection, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_emoji_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_emoji_description);
        final TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_emoji_load_status);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_emoji_selected_count);
        final TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_emoji_empty);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_emoji_close);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.btn_emoji_cancel);
        TextView textView7 = (TextView) viewInflate.findViewById(R.id.btn_emoji_confirm);
        final CustomRecyclerView customRecyclerView = (CustomRecyclerView) viewInflate.findViewById(R.id.rv_emojis);
        textView.setText(str);
        textView2.setText(str2);
        final C1271 c1271 = new C1271(context, linkedHashSet, num, new C1415(textView4, textView7, num));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
        customRecyclerView.setLayoutManager(gridLayoutManager);
        customRecyclerView.setAdapter(c1271);
        customRecyclerView.setHasFixedSize(true);
        m1824(textView4, textView7, num, linkedHashSet.size());
        final C0172 c01722 = new C0172();
        c01722.f997 = C1860.f9345;
        final C1417 c1417 = new C1417();
        m1840(c01722, c1417, c1271, textView5, customRecyclerView, textView3, list, linkedHashSet, null, false);
        Dialog dialog = new Dialog(context, android.R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(viewInflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, (int) (context.getResources().getDisplayMetrics().heightPixels * 0.85f));
            window.setWindowAnimations(android.R.style.Animation.InputMethod);
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        imageView.setOnClickListener(new ViewOnClickListenerC1393(dialog, 9));
        textView6.setOnClickListener(new ViewOnClickListenerC1393(dialog, 10));
        textView7.setOnClickListener(new ViewOnClickListenerC0257(interfaceC1549, c1271, dialog, linkedHashSet, 11));
        dialog.show();
        final Handler handler = new Handler(Looper.getMainLooper());
        C2326 c2326M3466 = AbstractC1741.m3466();
        C1206 c1206 = AbstractC0221.f1238;
        final C2454 c2454M3696 = AbstractC1917.m3696(AbstractC0879.m1960(c2326M3466, ExecutorC2482.f12272));
        final C1417 c14172 = new C1417();
        final C0172 c01723 = new C0172();
        final C0172 c01724 = new C0172();
        C2615 c2615 = C2615.f12860;
        final ?? r3 = new InterfaceC2266() { // from class: yyds.ᛸᲁᛳᲇ
            @Override // yyds.InterfaceC2266
            /* JADX INFO: renamed from: ᛲᲈᲁ */
            public final native Object mo731();
        };
        c2615.getClass();
        AbstractC2328.m4341(-701853063611246L);
        Method method2 = AbstractC0606.f2932;
        if (method2 == null || (method = AbstractC0606.f2930) == null || (field = AbstractC0606.f2924) == null) {
            c2454 = c2454M3696;
            obj3 = c1271;
            c0172 = c01724;
            c1928 = null;
        } else {
            c2454 = c2454M3696;
            try {
                method2.setAccessible(true);
                method.setAccessible(true);
                field.setAccessible(true);
                Object obj4 = field.get(null);
                if (obj4 == null) {
                    c2658 = null;
                    obj2 = c1271;
                } else {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC2328.m4341(-701896013284206L);
                    int length = parameterTypes.length;
                    try {
                        if (length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        obj2 = c1271;
                        if (length != 1) {
                            throw new IllegalArgumentException("Array has more than one element.");
                        }
                        Class<?> cls = parameterTypes[0];
                        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler(r3) { // from class: yyds.ᛵᛶᛶᲁ

                            /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
                            public final /* synthetic */ C1881 f5135;

                            static {
                                NativeUtil.classesInit0(56);
                            }

                            @Override // java.lang.reflect.InvocationHandler
                            public final native Object invoke(Object obj5, Method method3, Object[] objArr);
                        });
                        method2.invoke(obj4, objNewProxyInstance);
                        c2658 = new C1928(obj4, objNewProxyInstance);
                    } catch (Throwable th) {
                        th = th;
                        obj = context;
                        c2658 = new C2658(th);
                        obj2 = obj;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = c1271;
            }
            Throwable thM4249 = C2248.m4249(c2658);
            if (thM4249 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-701994797532014L), thM4249);
            }
            if (c2658 instanceof C2658) {
                c2658 = null;
            }
            c1928 = (C1928) c2658;
            c0172 = c01724;
            obj3 = obj2;
        }
        final C1271 c12712 = obj3;
        final C0172 c01725 = c0172;
        final C2454 c24542 = c2454;
        m1818(c01723, c24542, c14172, c01722, c1417, c12712, textView5, customRecyclerView, textView3, list, linkedHashSet, false);
        C2615.f12860.getClass();
        C2615.m4701(false);
        Runnable runnable = (Runnable) c01725.f997;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: yyds.ᛳᛳᲁᛲ
            @Override // java.lang.Runnable
            public final native void run();
        };
        handler.postDelayed(runnable2, 8000L);
        c01725.f997 = runnable2;
        customRecyclerView.m2426(new C2261(c12712, gridLayoutManager, new C0412(), c01725, handler, c14172, c01723, c24542, c01722, c1417, textView5, customRecyclerView, textView3, list, linkedHashSet));
        final C1928 c19282 = c1928;
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener(c14172, c19282, c01725, handler, c24542) { // from class: yyds.ᲁᛲᲈ

            /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
            public final /* synthetic */ C0172 f10747;

            /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
            public final /* synthetic */ C2454 f10748;

            /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
            public final /* synthetic */ C1417 f10749;

            /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
            public final /* synthetic */ Handler f10750;

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C1928 f10751;

            @Override // android.content.DialogInterface.OnDismissListener
            public final native void onDismiss(DialogInterface dialogInterface);
        });
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final void m1826(InterfaceC2213 interfaceC2213, Object obj) {
        if (obj == f3657) {
            return;
        }
        if (!(obj instanceof C2428)) {
            ((C1820) interfaceC2213.mo424(null, f3659)).f9146.set(obj);
            return;
        }
        C2428 c2428 = (C2428) obj;
        C1820[] c1820Arr = c2428.f11980;
        int length = c1820Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            c1820Arr[length].f9146.set(c2428.f11979[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static C0656 m1827(InterfaceC2587 interfaceC2587, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC2663.f13070;
                    lock.lock();
                    Bitmap bitmapMo1861 = interfaceC2587.mo1861(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo1861);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo1861;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC2587 = f3656;
        }
        return C0656.m1574(bitmap, interfaceC2587);
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static final void m1828(C2086 c2086, C0172 c0172) {
        String strM4341;
        ArrayList arrayListM1820 = m1820(c0172);
        TextView textView = c2086.f10345;
        if (arrayListM1820.isEmpty()) {
            strM4341 = AbstractC2328.m4341(-186388268614510L);
        } else {
            strM4341 = AbstractC2328.m4341(-186409743450990L) + arrayListM1820.size() + AbstractC2328.m4341(-186426923320174L);
        }
        textView.setText(strM4341);
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static final void m1829(C0172 c0172, C2086 c2086, C0172 c01722) {
        boolean zM3188 = AbstractC1544.m3188(c0172.f997, AbstractC2328.m4341(-186482757895022L));
        boolean z = !zM3188;
        TextView textView = c2086.f10347;
        Switch r3 = c2086.f10346;
        EditText editText = c2086.f10343;
        C0963 c0963 = C0963.f4446;
        String str = (String) c0172.f997;
        c0963.getClass();
        textView.setText(C0963.m2101(str));
        c2086.f10342.setVisibility(AbstractC1544.m3188(c0172.f997, AbstractC2328.m4341(-186508527698798L)) ? 8 : 0);
        editText.setEnabled(z);
        editText.setAlpha(!zM3188 ? 1.0f : 0.5f);
        r3.setEnabled(z);
        c2086.f10340.setVisibility((zM3188 || !r3.isChecked()) ? 8 : 0);
        m1828(c2086, c01722);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final void m1830(String str) {
        if (str.length() <= 0) {
            C0188.m798("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC1741.m3477(16);
                String string = Integer.toString(cCharAt, 16);
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final void m1831(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC1741.m3477(16);
                String string = Integer.toString(cCharAt, 16);
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(AbstractC1429.m2922(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static final Object m1832(InterfaceC2213 interfaceC2213, Object obj) {
        if (obj == null) {
            obj = interfaceC2213.mo424(0, f3658);
        }
        if (obj == 0) {
            return f3657;
        }
        if (obj instanceof Integer) {
            return interfaceC2213.mo424(new C2428(interfaceC2213, ((Number) obj).intValue()), f3655);
        }
        C1820 c1820 = (C1820) obj;
        ThreadLocal threadLocal = c1820.f9146;
        Object obj2 = threadLocal.get();
        threadLocal.set(c1820.f9145);
        return obj2;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static ArrayList m1833(Activity activity) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m1816(activity, null));
        arrayList.add(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        arrayList.add(new Intent("android.settings.APPLICATION_SETTINGS"));
        arrayList.add(new Intent("android.settings.SETTINGS"));
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static void m1834(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m1811(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static void m1835(Context context, C2721 c2721, InterfaceC2266 interfaceC2266) {
        LinearLayout linearLayout;
        Button button;
        TextView textView;
        TextView textView2;
        C2701.f13261.getClass();
        C2701.m4807(context);
        View viewInflate = AbstractC1115.m2309(context).inflate(R.layout.dialog_edit_fire_group, (ViewGroup) new RelativeLayout(context), false);
        int i = R.id.btn_cancel;
        Button button2 = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_cancel);
        if (button2 != null) {
            i = R.id.btn_delete;
            Button button3 = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_delete);
            if (button3 != null) {
                i = R.id.btn_save;
                Button button4 = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_save);
                if (button4 != null) {
                    i = R.id.et_delay_end;
                    EditText editText = (EditText) AbstractC1741.m3479(viewInflate, R.id.et_delay_end);
                    if (editText != null) {
                        i = R.id.et_delay_start;
                        EditText editText2 = (EditText) AbstractC1741.m3479(viewInflate, R.id.et_delay_start);
                        if (editText2 != null) {
                            i = R.id.et_group_name;
                            EditText editText3 = (EditText) AbstractC1741.m3479(viewInflate, R.id.et_group_name);
                            if (editText3 != null) {
                                i = R.id.et_hitokoto_template;
                                EditText editText4 = (EditText) AbstractC1741.m3479(viewInflate, R.id.et_hitokoto_template);
                                if (editText4 != null) {
                                    i = R.id.et_messages;
                                    EditText editText5 = (EditText) AbstractC1741.m3479(viewInflate, R.id.et_messages);
                                    if (editText5 != null) {
                                        i = R.id.et_scheduled_send_time;
                                        EditText editText6 = (EditText) AbstractC1741.m3479(viewInflate, R.id.et_scheduled_send_time);
                                        if (editText6 != null) {
                                            i = R.id.et_time_end;
                                            EditText editText7 = (EditText) AbstractC1741.m3479(viewInflate, R.id.et_time_end);
                                            if (editText7 != null) {
                                                i = R.id.et_time_start;
                                                EditText editText8 = (EditText) AbstractC1741.m3479(viewInflate, R.id.et_time_start);
                                                if (editText8 != null) {
                                                    i = R.id.layout_emoji_config;
                                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.layout_emoji_config);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.layout_hitokoto_config;
                                                        LinearLayout linearLayout3 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.layout_hitokoto_config);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.switch_hitokoto;
                                                            Switch r20 = (Switch) AbstractC1741.m3479(viewInflate, R.id.switch_hitokoto);
                                                            if (r20 != null) {
                                                                i = R.id.switch_scheduled_send;
                                                                Switch r21 = (Switch) AbstractC1741.m3479(viewInflate, R.id.switch_scheduled_send);
                                                                if (r21 != null) {
                                                                    i = R.id.tv_fail_strategy;
                                                                    TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_fail_strategy);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tv_fire_content_mode;
                                                                        TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_fire_content_mode);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tv_hitokoto_categories;
                                                                            TextView textView5 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_hitokoto_categories);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tv_keep_fire_emoji_summary;
                                                                                TextView textView6 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_keep_fire_emoji_summary);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tv_select_keep_fire_emoji;
                                                                                    TextView textView7 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_select_keep_fire_emoji);
                                                                                    if (textView7 != null) {
                                                                                        LinearLayout linearLayout4 = (LinearLayout) viewInflate;
                                                                                        C2086 c2086 = new C2086(linearLayout4, button2, button3, button4, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, linearLayout2, linearLayout3, r20, r21, textView3, textView4, textView5, textView6, textView7);
                                                                                        AbstractC2328.m4341(-184902209930094L);
                                                                                        Dialog dialog = new Dialog(context, android.R.style.Theme.Translucent.NoTitleBar);
                                                                                        dialog.setContentView(linearLayout4);
                                                                                        Window window = dialog.getWindow();
                                                                                        if (window != null) {
                                                                                            window.setGravity(80);
                                                                                            linearLayout = linearLayout3;
                                                                                            window.setLayout(-1, (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.85d));
                                                                                            window.setWindowAnimations(android.R.style.Animation.InputMethod);
                                                                                        } else {
                                                                                            linearLayout = linearLayout3;
                                                                                        }
                                                                                        dialog.setCancelable(true);
                                                                                        Window window2 = dialog.getWindow();
                                                                                        if (window2 != null) {
                                                                                            window2.setBackgroundDrawableResource(android.R.color.transparent);
                                                                                        }
                                                                                        Map mapM4385 = AbstractC2366.m4385(new Pair(AbstractC2328.m4341(-184958044504942L), AbstractC2328.m4341(-184966634439534L)), new Pair(AbstractC2328.m4341(-184979519341422L), AbstractC2328.m4341(-184988109276014L)), new Pair(AbstractC2328.m4341(-185000994177902L), AbstractC2328.m4341(-185009584112494L)), new Pair(AbstractC2328.m4341(-185022469014382L), AbstractC2328.m4341(-185031058948974L)), new Pair(AbstractC2328.m4341(-185043943850862L), AbstractC2328.m4341(-185052533785454L)), new Pair(AbstractC2328.m4341(-185065418687342L), AbstractC2328.m4341(-185074008621934L)), new Pair(AbstractC2328.m4341(-185095483458414L), AbstractC2328.m4341(-185104073393006L)), new Pair(AbstractC2328.m4341(-185116958294894L), AbstractC2328.m4341(-185125548229486L)), new Pair(AbstractC2328.m4341(-185138433131374L), AbstractC2328.m4341(-185147023065966L)), new Pair(AbstractC2328.m4341(-185159907967854L), AbstractC2328.m4341(-185168497902446L)), new Pair(AbstractC2328.m4341(-185185677771630L), AbstractC2328.m4341(-185194267706222L)), new Pair(AbstractC2328.m4341(-185207152608110L), AbstractC2328.m4341(-185215742542702L)));
                                                                                        C0172 c0172 = new C0172();
                                                                                        c0172.f997 = new ArrayList();
                                                                                        C0172 c01722 = new C0172();
                                                                                        EnumC2472 enumC2472 = EnumC2472.f12214;
                                                                                        c01722.f997 = enumC2472;
                                                                                        C0172 c01723 = new C0172();
                                                                                        C0963 c0963 = C0963.f4446;
                                                                                        String strM4836 = c2721 != null ? c2721.m4836() : null;
                                                                                        c0963.getClass();
                                                                                        c01723.f997 = C0963.m2102(strM4836);
                                                                                        C0172 c01724 = new C0172();
                                                                                        List listM4834 = c2721 != null ? c2721.m4834() : null;
                                                                                        if (listM4834 == null) {
                                                                                            listM4834 = C1860.f9345;
                                                                                        }
                                                                                        c01724.f997 = new ArrayList(listM4834);
                                                                                        if (c2721 != null) {
                                                                                            editText3.setText(c2721.m4838());
                                                                                            editText2.setText(String.valueOf(c2721.m4844()));
                                                                                            editText.setText(String.valueOf(c2721.m4841()));
                                                                                            List listM4839 = c2721.m4839();
                                                                                            editText5.setText(listM4839 != null ? AbstractC1595.m3285(listM4839, AbstractC2328.m4341(-185232922411886L), null, null, null, 62) : null);
                                                                                            Boolean boolM4832 = c2721.m4832();
                                                                                            Boolean bool = Boolean.TRUE;
                                                                                            r21.setChecked(AbstractC1544.m3188(boolM4832, bool));
                                                                                            String strM4830 = c2721.m4830();
                                                                                            if (strM4830 == null) {
                                                                                                strM4830 = AbstractC2328.m4341(-185241512346478L);
                                                                                            }
                                                                                            editText6.setText(strM4830);
                                                                                            editText6.setEnabled(AbstractC1544.m3188(c2721.m4832(), bool));
                                                                                            String strM4835 = c2721.m4835();
                                                                                            if (strM4835 != null && !AbstractC0473.m1313(strM4835)) {
                                                                                                editText8.setText(c2721.m4835());
                                                                                            }
                                                                                            String strM4843 = c2721.m4843();
                                                                                            if (strM4843 != null && !AbstractC0473.m1313(strM4843)) {
                                                                                                editText7.setText(c2721.m4843());
                                                                                            }
                                                                                            Boolean boolM4842 = c2721.m4842();
                                                                                            r20.setChecked(boolM4842 != null ? boolM4842.booleanValue() : false);
                                                                                            linearLayout.setVisibility(AbstractC1544.m3188(c2721.m4842(), bool) ? 0 : 8);
                                                                                            List listM4837 = c2721.m4837();
                                                                                            c0172.f997 = listM4837 != null ? new ArrayList(listM4837) : new ArrayList();
                                                                                            editText4.setText(c2721.m4833());
                                                                                            EnumC2472 enumC2472M4831 = c2721.m4831();
                                                                                            if (enumC2472M4831 == null) {
                                                                                                enumC2472M4831 = enumC2472;
                                                                                            }
                                                                                            c01722.f997 = enumC2472M4831;
                                                                                            if (((Collection) c0172.f997).isEmpty()) {
                                                                                                textView2 = textView5;
                                                                                            } else {
                                                                                                Iterable iterable = (Iterable) c0172.f997;
                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                Iterator it = iterable.iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    String str = (String) mapM4385.get((String) it.next());
                                                                                                    if (str != null) {
                                                                                                        arrayList.add(str);
                                                                                                    }
                                                                                                }
                                                                                                textView2 = textView5;
                                                                                                textView2.setText(AbstractC1595.m3285(arrayList, AbstractC2328.m4341(-185245807313774L), null, null, null, 62));
                                                                                                textView2.setTextColor(context.getResources().getColor(R.color.douyin_black, null));
                                                                                            }
                                                                                            textView = textView3;
                                                                                            textView.setText(((EnumC2472) c01722.f997).f12217);
                                                                                            button = button3;
                                                                                            if (!AbstractC1544.m3188(c2721.m4840(), AbstractC2328.m4341(-185258692215662L))) {
                                                                                                button.setVisibility(0);
                                                                                            }
                                                                                        } else {
                                                                                            button = button3;
                                                                                            textView = textView3;
                                                                                            textView2 = textView5;
                                                                                        }
                                                                                        m1829(c01723, c2086, c01724);
                                                                                        c2086.f10347.setOnClickListener(new ViewOnClickListenerC0257(c01723, context, c2086, c01724));
                                                                                        c2086.f10350.setOnClickListener(new ViewOnClickListenerC0287(context, c01724, c2086));
                                                                                        c2086.f10346.setOnCheckedChangeListener(new C2558(c2086, 1, c01723));
                                                                                        c2086.f10353.setEnabled(r21.isChecked());
                                                                                        r21.setOnCheckedChangeListener(new C1703(1, c2086));
                                                                                        textView2.setOnClickListener(new ViewOnClickListenerC0257((Object) mapM4385, c0172, (Object) context, (InterfaceC1749) c2086, 8));
                                                                                        textView.setOnClickListener(new ViewOnClickListenerC0287(c01722, context, c2086));
                                                                                        c2086.f10355.setOnClickListener(new ViewOnClickListenerC1393(dialog, 7));
                                                                                        button.setOnClickListener(new ViewOnClickListenerC0257(context, (Object) c2721, (Object) dialog, (Object) interfaceC2266, 9));
                                                                                        c2086.f10358.setOnClickListener(new ViewOnClickListenerC1815(c2086, c01723, c2721, c0172, c01722, c01724, dialog, interfaceC2266));
                                                                                        dialog.show();
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
        C0188.m789(AbstractC2328.m4341(-1748300370445166L).concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final String m1836(C1605 c1605, int i) {
        String str = (String) AbstractC2070.m3931(i * 2, c1605.f8174);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static long m1837(InputStream inputStream, int i) throws IOException {
        byte[] bArrM1812 = m1812(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM1812[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static byte[] m1838(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C2135 m1839(C1605 c1605) {
        C2135 c2135 = new C2135(2);
        AbstractC1432.m2927(c2135.f10556, c1605.f8174);
        return c2135;
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static final void m1840(C0172 c0172, C1417 c1417, C1271 c1271, TextView textView, CustomRecyclerView customRecyclerView, TextView textView2, List list, LinkedHashSet linkedHashSet, List list2, boolean z) {
        String strM4341;
        int iNextInt;
        ArrayList arrayList = c1271.f5852;
        if (list2 != null) {
            c0172.f997 = list2;
            c1417.f6702 = z || !list2.isEmpty();
        }
        List listM3269 = AbstractC1595.m3269(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM3269) {
            if (linkedHashSet.contains(((C1132) obj).m2320())) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayListM3284 = AbstractC1595.m3284(AbstractC1595.m3284(list, arrayList2), (Iterable) c0172.f997);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayListM3284) {
            if (!AbstractC0473.m1313(((C1132) obj2).m2319())) {
                arrayList3.add(obj2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (hashSet.add(((C1132) obj3).m2320())) {
                arrayList4.add(obj3);
            }
        }
        AbstractC2328.m4341(-116582165152622L);
        if (arrayList.size() == arrayList4.size()) {
            Iterable iterableM4849 = AbstractC2725.m4849(arrayList);
            if (!(iterableM4849 instanceof Collection) || !((Collection) iterableM4849).isEmpty()) {
                Iterator it = iterableM4849.iterator();
                do {
                    C1953 c1953 = (C1953) it;
                    if (!c1953.f9807) {
                        break;
                    }
                    iNextInt = c1953.nextInt();
                    if (!AbstractC1544.m3188(((C1132) arrayList.get(iNextInt)).m2320(), ((C1132) arrayList4.get(iNextInt)).m2320())) {
                        break;
                    }
                } while (AbstractC1544.m3188(((C1132) arrayList.get(iNextInt)).m2317(), ((C1132) arrayList4.get(iNextInt)).m2317()));
                arrayList.clear();
                arrayList.addAll(arrayList4);
                c1271.m1058();
            }
        } else {
            arrayList.clear();
            arrayList.addAll(arrayList4);
            c1271.m1058();
        }
        textView.setVisibility(arrayList4.isEmpty() ? 0 : 8);
        customRecyclerView.setVisibility(arrayList4.isEmpty() ? 8 : 0);
        if (!c1417.f6702) {
            strM4341 = AbstractC2328.m4341(-188664601281390L);
        } else if (arrayList4.isEmpty()) {
            strM4341 = AbstractC2328.m4341(-188707550954350L);
        } else {
            strM4341 = AbstractC2328.m4341(-188746205660014L) + ((List) c0172.f997).size() + AbstractC2328.m4341(-188759090561902L);
        }
        textView2.setText(strM4341);
        if (arrayList4.isEmpty()) {
            textView.setText(c1417.f6702 ? AbstractC2328.m4341(-188780565398382L) : AbstractC2328.m4341(-188810630169454L));
        }
    }
}
