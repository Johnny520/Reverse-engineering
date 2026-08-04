package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import com.android.app.CustomRecyclerView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0039;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: yyds.ᛳᛷᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0644 implements InterfaceC0097, InterfaceC2295, InterfaceC1095, InterfaceC1826, InterfaceC0942, InterfaceC1749, InterfaceC0499 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final Object f3095 = new Object();

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final C1739 f3096 = new C1739(2);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static volatile C0644 f3097;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static C0644 f3098;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f3099;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3100;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f3101;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f3102;

    public C0644(int i) {
        this.f3100 = i;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 21:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(100);
                this.f3099 = concurrentHashMap;
                concurrentHashMap.put(Date.class, AbstractC1898.f9608);
                C2434 c2434 = AbstractC2383.f11749;
                concurrentHashMap.put(int[].class, c2434);
                C2434 c24342 = AbstractC2383.f11754;
                concurrentHashMap.put(Integer[].class, c24342);
                concurrentHashMap.put(short[].class, c2434);
                concurrentHashMap.put(Short[].class, c24342);
                concurrentHashMap.put(long[].class, AbstractC2383.f11744);
                concurrentHashMap.put(Long[].class, AbstractC2383.f11746);
                concurrentHashMap.put(byte[].class, AbstractC2383.f11756);
                concurrentHashMap.put(Byte[].class, AbstractC2383.f11747);
                concurrentHashMap.put(char[].class, AbstractC2383.f11755);
                concurrentHashMap.put(Character[].class, AbstractC2383.f11750);
                concurrentHashMap.put(float[].class, AbstractC2383.f11753);
                concurrentHashMap.put(Float[].class, AbstractC2383.f11751);
                concurrentHashMap.put(double[].class, AbstractC2383.f11752);
                concurrentHashMap.put(Double[].class, AbstractC2383.f11745);
                concurrentHashMap.put(boolean[].class, AbstractC2383.f11743);
                concurrentHashMap.put(Boolean[].class, AbstractC2383.f11748);
                C0721 c0721 = new C0721(this, i3);
                this.f3102 = c0721;
                this.f3101 = new C0721(this, i2);
                concurrentHashMap.put(InterfaceC0663.class, c0721);
                concurrentHashMap.put(InterfaceC1732.class, c0721);
                concurrentHashMap.put(C2288.class, c0721);
                concurrentHashMap.put(C2481.class, c0721);
                break;
            case 22:
                this.f3099 = new ReentrantLock();
                this.f3102 = new ConcurrentHashMap();
                this.f3101 = new LinkedList();
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0710(i3));
                this.f3099 = new HashMap();
                this.f3102 = new ReferenceQueue();
                executorServiceNewSingleThreadExecutor.execute(new RunnableC0871(i2, this));
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static C0644 m1535(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0644(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static int m1536(C1450 c1450, int i, int i2) {
        int i3;
        if ((i & 4096) == 0 || c1450.f6874 >= 49) {
            i3 = 0;
        } else {
            c1450.m2952("Synthetic");
            i3 = 6;
        }
        if (i2 != 0) {
            c1450.m2952("Signature");
            i3 += 8;
        }
        if ((i & 131072) == 0) {
            return i3;
        }
        c1450.m2952("Deprecated");
        return i3 + 6;
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public static void m1537(C1450 c1450, int i, int i2, C2548 c2548) {
        if ((i & 4096) != 0 && c1450.f6874 < 49) {
            c2548.m4590(c1450.m2952("Synthetic"));
            c2548.m4585(0);
        }
        if (i2 != 0) {
            c2548.m4590(c1450.m2952("Signature"));
            c2548.m4585(2);
            c2548.m4590(i2);
        }
        if ((i & 131072) != 0) {
            c2548.m4590(c1450.m2952("Deprecated"));
            c2548.m4585(0);
        }
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static final void m1538(int i, List list) {
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC2725.m4853();
                throw null;
            }
            TextView textView = (TextView) obj;
            if (i2 == i) {
                textView.setBackgroundResource(R.drawable.bg_ward_jump_button);
                textView.setAlpha(1.0f);
            } else {
                textView.setBackgroundResource(R.drawable.round_edit_bg_dark);
                textView.setAlpha(0.6f);
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    private final void m1539() {
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    private final void m1540() {
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static final void m1541(View view) {
        int color;
        C1509.f7142.getClass();
        int iM1487 = AbstractC0598.m1487((C1509.m3041() * 255) / 100, 0, 255);
        try {
            color = Color.parseColor(C1509.m3107()) & 16777215;
        } catch (Exception unused) {
            color = 16119285;
        }
        view.setBackgroundColor((iM1487 << 24) | color);
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static final void m1542() {
        C1509.f7142.getClass();
        if (C1509.m3062()) {
            if (C1509.m3119()) {
                C1435.m2932(C1435.f6790);
            } else {
                C1435.m2931(C1435.f6790);
            }
        }
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static final void m1543(View view, String str) {
        Integer numM1545 = m1545(str);
        if (numM1545 != null) {
            int iIntValue = numM1545.intValue();
            C1509 c1509 = C1509.f7142;
            String strM4000 = AbstractC2104.m4000(new Object[]{Integer.valueOf(iIntValue & 16777215)}, 1, AbstractC2328.m4341(-170011558314862L), -170037328118638L);
            c1509.getClass();
            AbstractC2328.m4341(-26602600301422L);
            C1509.f7237.m1581(C1509.f7179[69], strM4000);
            m1541(view);
            C1435.m2931(C1435.f6790);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static final String m1544(int i) {
        return AbstractC2104.m4000(new Object[]{Long.valueOf(((long) i) & 4294967295L)}, 1, AbstractC2328.m4341(-169762450211694L), -169783925048174L);
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static final Integer m1545(String str) {
        String string = AbstractC0473.m1314(str).toString();
        if (!string.startsWith(AbstractC2328.m4341(-169753860277102L))) {
            string = "#".concat(string);
        }
        try {
            return Integer.valueOf((Color.parseColor(string) & 16777215) | (-16777216));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static final void m1546(ImageView imageView) {
        C1509.f7142.getClass();
        String str = (String) C1509.f7201.m1579(C1509.f7179[72]);
        if (str.length() <= 0) {
            imageView.setImageBitmap(null);
            return;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            imageView.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception unused) {
            imageView.setImageBitmap(null);
        }
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static C0644 m1547(Context context) {
        if (f3097 == null) {
            synchronized (f3095) {
                try {
                    if (f3097 == null) {
                        f3097 = new C0644(context);
                    }
                } finally {
                }
            }
        }
        return f3097;
    }

    @Override // yyds.InterfaceC2295
    public InterfaceC1590 getSource() {
        return (C2066) this.f3102;
    }

    public String toString() {
        switch (this.f3100) {
            case 22:
                return ((ConcurrentHashMap) this.f3102).toString();
            default:
                return super.toString();
        }
    }

    @Override // yyds.InterfaceC0942
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Object mo1548() {
        Object objMo1548 = ((C1964) this.f3101).mo1548();
        if (objMo1548 == null) {
            objMo1548 = ((InterfaceC1434) this.f3099).mo384();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objMo1548.getClass());
            }
        }
        if (objMo1548 instanceof InterfaceC2054) {
            ((InterfaceC2054) objMo1548).mo2540().f5475 = false;
        }
        return objMo1548;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public void m1549(C0501 c0501) {
        InterfaceC2162 interfaceC2162;
        synchronized (this) {
            ((HashMap) this.f3099).remove(c0501.f2439);
            if (c0501.f2440 && (interfaceC2162 = c0501.f2441) != null) {
                ((C2620) this.f3101).m4733(c0501.f2439, new C2061(interfaceC2162, true, false, c0501.f2439, (C2620) this.f3101));
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public boolean m1550() throws Throwable {
        switch (this.f3100) {
            case 17:
                ArrayList arrayList = (ArrayList) this.f3102;
                ByteBuffer byteBufferM931 = AbstractC0282.m931((ByteBuffer) this.f3099);
                C2267 c2267 = (C2267) this.f3101;
                if (byteBufferM931 == null) {
                    return false;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((InterfaceC0849) arrayList.get(i)).mo1927(byteBufferM931, c2267)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 18:
                ArrayList arrayList2 = (ArrayList) this.f3101;
                C0839 c0839 = (C0839) ((C2014) this.f3099).f10074;
                c0839.reset();
                C2267 c22672 = (C2267) this.f3102;
                c0839.mark(5242880);
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        if (((InterfaceC0849) arrayList2.get(i2)).mo1928(c0839, c22672)) {
                            return true;
                        }
                    } finally {
                        c0839.reset();
                    }
                }
                return false;
            default:
                ArrayList arrayList3 = (ArrayList) this.f3102;
                C0039 c0039 = (C0039) this.f3101;
                C2267 c22673 = (C2267) this.f3099;
                int size3 = arrayList3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC0849 interfaceC0849 = (InterfaceC0849) arrayList3.get(i3);
                    C0839 c08392 = null;
                    try {
                        C0839 c08393 = new C0839(new FileInputStream(c0039.m243().getFileDescriptor()), c22673);
                        try {
                            boolean zMo1928 = interfaceC0849.mo1928(c08393, c22673);
                            c08393.m1921();
                            c0039.m243();
                            if (zMo1928) {
                                return true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c08392 = c08393;
                            if (c08392 != null) {
                                c08392.m1921();
                            }
                            c0039.m243();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public synchronized void m1551(InterfaceC1410 interfaceC1410, C2061 c2061) {
        C0501 c0501 = (C0501) ((HashMap) this.f3099).put(interfaceC1410, new C0501(interfaceC1410, c2061, (ReferenceQueue) this.f3102));
        if (c0501 != null) {
            c0501.f2441 = null;
            c0501.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0132 A[DONT_GENERATE, FINALLY_INSNS] */
    @Override // yyds.InterfaceC0097
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo385(C1829 c1829) throws IllegalAccessException, InvocationTargetException {
        Object objM3281;
        boolean z;
        boolean z2;
        Object objInvoke;
        Object c2658;
        Object c26582;
        Method method;
        Class<?> declaringClass;
        int i = this.f3100;
        Object c26583 = C2746.f13459;
        switch (i) {
            case 4:
                AbstractC2328.m4341(-929005293962094L);
                try {
                    ((InterfaceC0097) this.f3099).mo385(c1829);
                    break;
                } catch (Throwable th) {
                    c26583 = new C2658(th);
                }
                Class cls = (Class) this.f3102;
                String str = (String) this.f3101;
                Throwable thM4249 = C2248.m4249(c26583);
                if (thM4249 != null) {
                    AbstractC0145.m663(AbstractC2328.m4341(-929043948667758L) + cls + '.' + str + AbstractC2328.m4341(-929099783242606L) + thM4249.getMessage(), thM4249);
                    return;
                }
                return;
            default:
                Field field = (Field) this.f3099;
                Field field2 = (Field) this.f3102;
                AbstractC2328.m4341(-816395546428270L);
                ArrayList arrayList = c1829.f9185;
                C1509.f7142.getClass();
                if (!((Boolean) C1509.f7184.m1579(C1509.f7179[89])).booleanValue() || (objM3281 = AbstractC1595.m3281(arrayList)) == null) {
                    return;
                }
                boolean z3 = true;
                if (field == null || (declaringClass = field.getDeclaringClass()) == null || !declaringClass.isInstance(objM3281)) {
                    z = false;
                    z2 = false;
                } else {
                    z = field.getBoolean(objM3281);
                    if (z) {
                        field.setBoolean(objM3281, false);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                long j = 0;
                if (field2 == null || (method = (Method) this.f3101) == null) {
                    z3 = false;
                    objInvoke = null;
                } else {
                    objInvoke = method.invoke(objM3281, null);
                    if (objInvoke == null || !field2.getDeclaringClass().isInstance(objInvoke)) {
                        z3 = false;
                    } else {
                        long j2 = field2.getLong(objInvoke);
                        if (j2 == 1) {
                            field2.setLong(objInvoke, 0L);
                        } else {
                            z3 = false;
                        }
                        j = j2;
                    }
                }
                if (!z2 && !z3) {
                    return;
                }
                try {
                    Object objProceed = c1829.f9188.proceed(arrayList.toArray(new Object[0]));
                    if (z2) {
                        if (field != null) {
                            try {
                                field.setBoolean(objM3281, z);
                                c26582 = c26583;
                            } catch (Throwable th2) {
                                c26582 = new C2658(th2);
                            }
                        } else {
                            c26582 = null;
                        }
                        Throwable thM42492 = C2248.m4249(c26582);
                        if (thM42492 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-816434201133934L), thM42492);
                        }
                    }
                    if (z3 && objInvoke != null) {
                        if (field2 != null) {
                            try {
                                field2.setLong(objInvoke, j);
                            } catch (Throwable th3) {
                                c2658 = new C2658(th3);
                            }
                        } else {
                            c26583 = null;
                        }
                        c2658 = c26583;
                        Throwable thM42493 = C2248.m4249(c2658);
                        if (thM42493 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-816520100479854L), thM42493);
                        }
                        break;
                    }
                    c1829.m3587(objProceed);
                    return;
                } finally {
                    if (z3 && objInvoke != null) {
                        if (field2 != null) {
                            try {
                                break;
                            } catch (Throwable th4) {
                            }
                        }
                    }
                }
        }
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public ImageHeaderParser$ImageType m1552() throws Throwable {
        switch (this.f3100) {
            case 17:
                return AbstractC1741.m3463((ArrayList) this.f3102, AbstractC0282.m931((ByteBuffer) this.f3099));
            case 18:
                ArrayList arrayList = (ArrayList) this.f3101;
                C0839 c0839 = (C0839) ((C2014) this.f3099).f10074;
                c0839.reset();
                return AbstractC1741.m3475(arrayList, c0839, (C2267) this.f3102);
            default:
                ArrayList arrayList2 = (ArrayList) this.f3102;
                C0039 c0039 = (C0039) this.f3101;
                C2267 c2267 = (C2267) this.f3099;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC0849 interfaceC0849 = (InterfaceC0849) arrayList2.get(i);
                    C0839 c08392 = null;
                    try {
                        C0839 c08393 = new C0839(new FileInputStream(c0039.m243().getFileDescriptor()), c2267);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo1929 = interfaceC0849.mo1929(c08393);
                            c08393.m1921();
                            c0039.m243();
                            if (imageHeaderParser$ImageTypeMo1929 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo1929;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c08392 = c08393;
                            if (c08392 != null) {
                                c08392.m1921();
                            }
                            c0039.m243();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public void m1553(C0859 c0859, int i, int i2, int i3) {
        c0859.getClass();
        int i4 = c0859.f4361;
        int i5 = c0859.f4402;
        c0859.f4361 = 0;
        c0859.f4402 = 0;
        c0859.m2064(i2);
        c0859.m2082(i3);
        if (i4 < 0) {
            c0859.f4361 = 0;
        } else {
            c0859.f4361 = i4;
        }
        if (i5 < 0) {
            c0859.f4402 = 0;
        } else {
            c0859.f4402 = i5;
        }
        C0859 c08592 = (C0859) this.f3101;
        c08592.f3941 = i;
        c08592.m1950();
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public Drawable m1554(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f3099;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC1367.m2767((Context) this.f3101, resourceId);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public Bitmap m1555(BitmapFactory.Options options) throws Throwable {
        switch (this.f3100) {
            case 17:
                return AbstractC1960.m3790(new C0345(AbstractC0282.m931((ByteBuffer) this.f3099)), options, this);
            case 18:
                C0839 c0839 = (C0839) ((C2014) this.f3099).f10074;
                c0839.reset();
                return AbstractC1960.m3790(c0839, options, this);
            default:
                FileDescriptor fileDescriptor = ((C0039) this.f3101).m243().getFileDescriptor();
                Bitmap bitmapM3781 = null;
                if (Build.VERSION.SDK_INT != 34 || !AbstractC2071.m3958(options) || !AbstractC1960.m3777(this)) {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
                Bitmap.Config config = options.inPreferredConfig;
                Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                AbstractC0319.m985("", config == config2);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (bitmapDecodeFileDescriptor == null) {
                        if (bitmapDecodeFileDescriptor != null) {
                        }
                        options.inPreferredConfig = config2;
                        return bitmapM3781;
                    }
                    try {
                        bitmapM3781 = AbstractC1960.m3781(bitmapDecodeFileDescriptor);
                    } catch (Throwable th) {
                        th = th;
                        bitmapM3781 = bitmapDecodeFileDescriptor;
                        if (bitmapM3781 != null) {
                            bitmapM3781.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        throw th;
                    }
                    break;
                    bitmapDecodeFileDescriptor.recycle();
                    options.inPreferredConfig = config2;
                    return bitmapM3781;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public ColorStateList m1556(int i) {
        int resourceId;
        ColorStateList colorStateListM4942;
        TypedArray typedArray = (TypedArray) this.f3099;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM4942 = C2810.m4942((Context) this.f3101, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM4942;
    }

    @Override // yyds.InterfaceC0942
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean mo1557(Object obj) {
        if (obj instanceof InterfaceC2054) {
            ((InterfaceC2054) obj).mo2540().f5475 = true;
        }
        ((InterfaceC1685) this.f3102).mo610(obj);
        return ((C1964) this.f3101).mo1557(obj);
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public AbstractC1183 m1558(Class cls) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f3099;
        AbstractC1183 c1525 = (AbstractC1183) concurrentHashMap.get(cls);
        if (c1525 != null) {
            return c1525;
        }
        if (cls != null) {
            if (Map.class.isAssignableFrom(cls) || List.class.isAssignableFrom(cls)) {
                c1525 = new C1525(this, cls);
            }
            if (c1525 != null) {
                concurrentHashMap.put(cls, c1525);
                return c1525;
            }
        }
        if (cls.isArray()) {
            C2223 c2223 = new C2223(this, cls);
            concurrentHashMap.putIfAbsent(cls, c2223);
            return c2223;
        }
        if (List.class.isAssignableFrom(cls)) {
            if (cls.isInterface()) {
                cls = C2288.class;
            }
            AbstractC1324.m2616(cls);
            throw null;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            AbstractC1324.m2616(cls);
            throw null;
        }
        if (cls.isInterface()) {
            cls = C2481.class;
        }
        AbstractC1324.m2616(cls);
        throw null;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public List m1559() {
        C1057 c1057 = (C1057) this.f3101;
        if (c1057 != null) {
            return c1057;
        }
        C1057 c10572 = new C1057(0, this);
        this.f3101 = c10572;
        return c10572;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public Object m1560(Class cls, HashSet hashSet) {
        Object objMo117;
        HashMap map = (HashMap) this.f3099;
        if (AbstractC2478.m4528()) {
            try {
                AbstractC0879.m1969(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo117 = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC1283 interfaceC1283 = (InterfaceC1283) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo116 = interfaceC1283.mo116();
                if (!listMo116.isEmpty()) {
                    for (Class cls2 : listMo116) {
                        if (!map.containsKey(cls2)) {
                            m1560(cls2, hashSet);
                        }
                    }
                }
                objMo117 = interfaceC1283.mo117((Context) this.f3101);
                hashSet.remove(cls);
                map.put(cls, objMo117);
            } catch (Throwable th) {
                throw new C1738(th);
            }
        }
        return objMo117;
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public void m1561(C0859 c0859) {
        ArrayList arrayList = (ArrayList) this.f3099;
        arrayList.clear();
        int size = c0859.f3930.size();
        for (int i = 0; i < size; i++) {
            C0944 c0944 = (C0944) c0859.f3930.get(i);
            int[] iArr = c0944.f4401;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0944);
            }
        }
        c0859.f3935.f7038 = true;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public Typeface m1562(int i, int i2, C1849 c1849) {
        C1849 c18492;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f3099).getResourceId(i, 0);
        if (resourceId != 0) {
            TypedValue typedValue = (TypedValue) this.f3102;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.f3102 = typedValue;
            }
            Context context = (Context) this.f3101;
            ThreadLocal threadLocal = AbstractC2042.f10157;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    c1849.m3613();
                    return null;
                }
                Typeface typeface = (Typeface) AbstractC1046.f4751.m2548(AbstractC1046.m2242(resources, resourceId, string, typedValue.assetCookie, i2));
                int i3 = 9;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC2696(c1849, i3, typeface));
                    return typeface;
                }
                try {
                } catch (IOException e) {
                    e = e;
                    c18492 = c1849;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    c18492 = c1849;
                }
                try {
                    if (!string.toLowerCase().endsWith(".xml")) {
                        Typeface typefaceM2240 = AbstractC1046.m2240(resources, resourceId, string, typedValue.assetCookie, i2);
                        if (typefaceM2240 != null) {
                            new Handler(Looper.getMainLooper()).post(new RunnableC2696(c1849, i3, typefaceM2240));
                        } else {
                            c1849.m3613();
                        }
                        return typefaceM2240;
                    }
                    InterfaceC0285 interfaceC0285M496 = AbstractC0090.m496(resources.getXml(resourceId), resources);
                    if (interfaceC0285M496 != null) {
                        return AbstractC1046.m2239(context, interfaceC0285M496, resources, resourceId, string, typedValue.assetCookie, i2, c1849);
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        c1849.m3613();
                        return null;
                    } catch (IOException e3) {
                        iOException = e3;
                        c18492 = c1849;
                    } catch (XmlPullParserException e4) {
                        xmlPullParserException = e4;
                        c18492 = c1849;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                        c18492.m3613();
                        return null;
                    }
                } catch (IOException e5) {
                    e = e5;
                    iOException = e;
                } catch (XmlPullParserException e6) {
                    e = e6;
                    xmlPullParserException = e;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                    c18492.m3613();
                    return null;
                }
                iOException = e;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                c18492.m3613();
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public void m1563(String str) {
        LinkedList linkedList = (LinkedList) this.f3101;
        ReentrantLock reentrantLock = (ReentrantLock) this.f3099;
        reentrantLock.lock();
        try {
            linkedList.removeFirstOccurrence(str);
            linkedList.addFirst(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public Drawable m1564(int i) {
        int resourceId;
        Drawable drawableM3177;
        if (!((TypedArray) this.f3099).hasValue(i) || (resourceId = ((TypedArray) this.f3099).getResourceId(i, 0)) == 0) {
            return null;
        }
        C1541 c1541M3170 = C1541.m3170();
        Context context = (Context) this.f3101;
        synchronized (c1541M3170) {
            drawableM3177 = c1541M3170.f7388.m3177(context, resourceId, true);
        }
        return drawableM3177;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public synchronized InterfaceC0894 m1565(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C2081 c2081 : (ArrayList) this.f3099) {
                if (((HashSet) this.f3102).contains(c2081)) {
                    z = true;
                } else if (c2081.f10326.isAssignableFrom(cls) && c2081.f10327.isAssignableFrom(cls2)) {
                    ((HashSet) this.f3102).add(c2081);
                    arrayList.add(c2081.f10328.mo382(this));
                    ((HashSet) this.f3102).remove(c2081);
                }
            }
            if (arrayList.size() > 1) {
                return new C2480(arrayList, 2, (C0644) this.f3101);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC0894) arrayList.get(0);
            }
            if (z) {
                return f3096;
            }
            throw new C2566("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.f3102).clear();
            throw th;
        }
    }

    @Override // yyds.InterfaceC0097
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public void mo399(C0488 c0488) {
        Object c2658;
        switch (this.f3100) {
            case 4:
                AbstractC2328.m4341(-929142732915566L);
                try {
                    ((InterfaceC0097) this.f3099).mo399(c0488);
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Class cls = (Class) this.f3102;
                String str = (String) this.f3101;
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    AbstractC0145.m663(AbstractC2328.m4341(-929181387621230L) + cls + '.' + str + AbstractC2328.m4341(-929232927228782L) + thM4249.getMessage(), thM4249);
                }
                break;
            default:
                AbstractC2328.m4341(-1086961306207086L);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public boolean m1566(int i, C2594 c2594, C0944 c0944) {
        C0390 c0390 = (C0390) this.f3102;
        int[] iArr = c0944.f4401;
        int[] iArr2 = c0944.f4356;
        c0390.f2014 = iArr[0];
        c0390.f2015 = iArr[1];
        c0390.f2018 = c0944.m2072();
        c0390.f2020 = c0944.m2067();
        c0390.f2012 = false;
        c0390.f2017 = i;
        boolean z = c0390.f2014 == 3;
        boolean z2 = c0390.f2015 == 3;
        boolean z3 = z && c0944.f4359 > 0.0f;
        boolean z4 = z2 && c0944.f4359 > 0.0f;
        if (z3 && iArr2[0] == 4) {
            c0390.f2014 = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c0390.f2015 = 1;
        }
        c2594.m4676(c0944, c0390);
        c0944.m2064(c0390.f2013);
        c0944.m2082(c0390.f2019);
        c0944.f4388 = c0390.f2011;
        int i2 = c0390.f2016;
        c0944.f4399 = i2;
        c0944.f4388 = i2 > 0;
        c0390.f2017 = 0;
        return c0390.f2012;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public synchronized ArrayList m1567(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C2081 c2081 : (ArrayList) this.f3099) {
                if (!((HashSet) this.f3102).contains(c2081) && c2081.f10326.isAssignableFrom(cls)) {
                    ((HashSet) this.f3102).add(c2081);
                    arrayList.add(c2081.f10328.mo382(this));
                    ((HashSet) this.f3102).remove(c2081);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public void m1568() {
        ((TypedArray) this.f3099).recycle();
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public synchronized ArrayList m1569(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C2081 c2081 : (ArrayList) this.f3099) {
            if (!arrayList.contains(c2081.f10327) && c2081.f10326.isAssignableFrom(cls)) {
                arrayList.add(c2081.f10327);
            }
        }
        return arrayList;
    }

    @Override // yyds.InterfaceC2295
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public InterfaceC1979 mo952() {
        return (C2776) this.f3101;
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public void m1570(Class cls, AbstractC1183 abstractC1183) {
        ((ConcurrentHashMap) this.f3099).put(cls, abstractC1183);
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public void m1571(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f3102;
        String string = ((Context) this.f3101).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC1283.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m1560((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C1738(e);
            }
        }
    }

    @Override // yyds.InterfaceC1826
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public InterfaceC2162 mo1277(InterfaceC2162 interfaceC2162, C0822 c0822) {
        Drawable drawable = (Drawable) interfaceC2162.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0469) this.f3102).mo1277(C0656.m1574(((BitmapDrawable) drawable).getBitmap(), (InterfaceC2587) this.f3099), c0822);
        }
        if (drawable instanceof C2380) {
            return ((C1985) this.f3101).mo1277(interfaceC2162, c0822);
        }
        return null;
    }

    @Override // yyds.InterfaceC1095
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public void mo570(final C0912 c0912) {
        AbstractC2328.m4341(-167868369634158L);
        Switch r1 = ((C1729) this.f3099).f8746;
        AbstractC2328.m4341(-167898434405230L);
        Switch r2 = ((C1729) this.f3099).f8747;
        AbstractC2328.m4341(-167997218653038L);
        final LinearLayout linearLayout = ((C1729) this.f3099).f8740;
        AbstractC2328.m4341(-168113182770030L);
        final LinearLayout linearLayout2 = ((C1729) this.f3099).f8754;
        AbstractC2328.m4341(-168186197214062L);
        SeekBar seekBar = ((C1729) this.f3099).f8752;
        AbstractC2328.m4341(-168284981461870L);
        TextView textView = ((C1729) this.f3099).f8757;
        AbstractC2328.m4341(-168362290873198L);
        SeekBar seekBar2 = ((C1729) this.f3099).f8744;
        AbstractC2328.m4341(-168418125448046L);
        TextView textView2 = ((C1729) this.f3099).f8743;
        AbstractC2328.m4341(-168495434859374L);
        SeekBar seekBar3 = ((C1729) this.f3099).f8741;
        AbstractC2328.m4341(-168551269434222L);
        TextView textView3 = ((C1729) this.f3099).f8738;
        AbstractC2328.m4341(-168645758714734L);
        final EditText editText = ((C1729) this.f3099).f8749;
        AbstractC2328.m4341(-168718773158766L);
        final View view = ((C1729) this.f3099).f8735;
        AbstractC2328.m4341(-168800377537390L);
        final EditText editText2 = ((C1729) this.f3099).f8734;
        AbstractC2328.m4341(-168920636621678L);
        final View view2 = ((C1729) this.f3099).f8750;
        AbstractC2328.m4341(-169015125902190L);
        final SeekBar seekBar4 = ((C1729) this.f3099).f8739;
        AbstractC2328.m4341(-169126795051886L);
        TextView textView4 = ((C1729) this.f3099).f8742;
        AbstractC2328.m4341(-169221284332398L);
        TextView textView5 = ((C1729) this.f3099).f8737;
        AbstractC2328.m4341(-169294298776430L);
        TextView textView6 = ((C1729) this.f3099).f8755;
        AbstractC2328.m4341(-169393083024238L);
        ImageView imageView = ((C1729) this.f3099).f8732;
        AbstractC2328.m4341(-169487572304750L);
        TextView textView7 = ((C1729) this.f3099).f8745;
        AbstractC2328.m4341(-169560586748782L);
        TextView textView8 = ((C1729) this.f3099).f8753;
        AbstractC2328.m4341(-169655076029294L);
        C1729 c1729 = (C1729) this.f3099;
        final List listM4854 = AbstractC2725.m4854(c1729.f8733, c1729.f8751, c1729.f8736, c1729.f8748);
        C1509 c1509 = C1509.f7142;
        c1509.getClass();
        r1.setChecked(C1509.m3062());
        r2.setChecked(C1509.m3119());
        boolean zM3119 = C1509.m3119();
        linearLayout.setVisibility(zM3119 ? 0 : 8);
        linearLayout2.setVisibility(zM3119 ? 8 : 0);
        seekBar.setProgress(AbstractC0598.m1487((int) C1509.m3071(), 10, 100));
        textView.setText(String.valueOf((int) C1509.m3071()));
        C0668 c0668 = C1509.f7193;
        InterfaceC1989[] interfaceC1989Arr = C1509.f7179;
        seekBar2.setProgress(AbstractC0598.m1487((int) ((Number) c0668.m1579(interfaceC1989Arr[78])).floatValue(), 0, 80));
        textView2.setText(String.valueOf(seekBar2.getProgress()));
        seekBar3.setProgress(AbstractC0598.m1487((int) C1509.m3063(), 1, 10));
        textView3.setText(String.valueOf((int) C1509.m3063()));
        final C1417 c1417 = new C1417();
        c1417.f6702 = true;
        editText.setText(m1544(C1509.m3079()));
        c1417.f6702 = false;
        c1509.getClass();
        view.setBackgroundColor(C1509.m3079());
        seekBar4.setProgress(C1509.m3041());
        textView4.setText(String.valueOf(C1509.m3041()));
        final C1417 c14172 = new C1417();
        c14172.f6702 = true;
        editText2.setText(C1509.m3107());
        c14172.f6702 = false;
        m1541(view2);
        m1538(((Number) C1509.f7270.m1579(interfaceC1989Arr[73])).intValue(), listM4854);
        m1546(imageView);
        C0073 c0073 = C0073.f636;
        C0073.f637 = new C2713(2, imageView);
        final int i = 0;
        r1.setOnCheckedChangeListener(new C1247(i));
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yyds.ᲇᛳᲀ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = i;
                LinearLayout linearLayout3 = linearLayout2;
                LinearLayout linearLayout4 = linearLayout;
                switch (i2) {
                    case 0:
                        AbstractC2328.m4341(-169955723740014L);
                        C1509.f7142.getClass();
                        C1509.f7150.m1581(C1509.f7179[74], Boolean.valueOf(z));
                        linearLayout4.setVisibility(z ? 0 : 8);
                        linearLayout3.setVisibility(z ? 8 : 0);
                        if (C1509.m3062()) {
                            if (!z) {
                                C1435 c1435 = C1435.f6790;
                                c1435.getClass();
                                C1435.m2933();
                                C1435.m2931(c1435);
                            } else {
                                C1435.m2932(C1435.f6790);
                            }
                        }
                        break;
                    default:
                        AbstractC2328.m4341(-232503332471662L);
                        int i3 = z ? 0 : 8;
                        linearLayout4.setVisibility(i3);
                        linearLayout3.setVisibility(i3);
                        break;
                }
            }
        });
        final int i2 = 1;
        seekBar.setOnSeekBarChangeListener(new C2582(i2, new C1161(textView, 2)));
        seekBar2.setOnSeekBarChangeListener(new C2582(i2, new C1161(textView2, i)));
        seekBar3.setOnSeekBarChangeListener(new C2582(i2, new C1161(textView3, i2)));
        editText.addTextChangedListener(new C2160(c1417, view, i));
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: yyds.ᛸᛵᛵᲁ
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView9, int i3, KeyEvent keyEvent) {
                int i4 = i;
                View view3 = view;
                switch (i4) {
                    case 0:
                        if (i3 == 6) {
                            String string = AbstractC0473.m1314(textView9.getText().toString()).toString();
                            Integer numValueOf = null;
                            if (string.length() == 8) {
                                try {
                                    numValueOf = Integer.valueOf((int) Long.parseLong(string, 16));
                                    break;
                                } catch (Exception unused) {
                                }
                            }
                            if (numValueOf != null) {
                                C1509 c15092 = C1509.f7142;
                                c15092.getClass();
                                C1509.f7256.m1581(C1509.f7179[77], numValueOf);
                                c15092.getClass();
                                view3.setBackgroundColor(C1509.m3079());
                                C0644.m1542();
                            }
                        }
                        break;
                    case 1:
                        if (i3 == 6) {
                            C0644.m1543(view3, textView9.getText().toString());
                        }
                        break;
                    default:
                        EditText editText3 = (EditText) view3;
                        if (i3 == 6) {
                            editText3.clearFocus();
                        }
                        break;
                }
                return true;
            }
        });
        editText2.addTextChangedListener(new C2160(c14172, view2, i2));
        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: yyds.ᛸᛵᛵᲁ
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView9, int i3, KeyEvent keyEvent) {
                int i4 = i2;
                View view3 = view2;
                switch (i4) {
                    case 0:
                        if (i3 == 6) {
                            String string = AbstractC0473.m1314(textView9.getText().toString()).toString();
                            Integer numValueOf = null;
                            if (string.length() == 8) {
                                try {
                                    numValueOf = Integer.valueOf((int) Long.parseLong(string, 16));
                                    break;
                                } catch (Exception unused) {
                                }
                            }
                            if (numValueOf != null) {
                                C1509 c15092 = C1509.f7142;
                                c15092.getClass();
                                C1509.f7256.m1581(C1509.f7179[77], numValueOf);
                                c15092.getClass();
                                view3.setBackgroundColor(C1509.m3079());
                                C0644.m1542();
                            }
                        }
                        break;
                    case 1:
                        if (i3 == 6) {
                            C0644.m1543(view3, textView9.getText().toString());
                        }
                        break;
                    default:
                        EditText editText3 = (EditText) view3;
                        if (i3 == 6) {
                            editText3.clearFocus();
                        }
                        break;
                }
                return true;
            }
        });
        final Context context = (Context) this.f3101;
        final int i3 = 0;
        view2.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛴᛷᲀᛴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i4 = i3;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        C0912 c09122 = c0912;
                        c09122.m2027();
                        C1509.f7142.getClass();
                        Integer numM1545 = C0644.m1545(C1509.m3107());
                        AbstractC2328.m4338(context2, numM1545 != null ? numM1545.intValue() : -1, new C2410(c09122, c14172, editText2, view2, 0));
                        break;
                    default:
                        C0912 c09123 = c0912;
                        c09123.m2027();
                        C1509.f7142.getClass();
                        int iM3079 = C1509.m3079();
                        AbstractC2328.m4338(context2, (16777215 & iM3079) | (-16777216), new C0046(c09123, iM3079, c14172, editText2, view2, 0));
                        break;
                }
            }
        });
        final Context context2 = (Context) this.f3101;
        final int i4 = 1;
        view.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛴᛷᲀᛴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i42 = i4;
                Context context22 = context2;
                switch (i42) {
                    case 0:
                        C0912 c09122 = c0912;
                        c09122.m2027();
                        C1509.f7142.getClass();
                        Integer numM1545 = C0644.m1545(C1509.m3107());
                        AbstractC2328.m4338(context22, numM1545 != null ? numM1545.intValue() : -1, new C2410(c09122, c1417, editText, view, 0));
                        break;
                    default:
                        C0912 c09123 = c0912;
                        c09123.m2027();
                        C1509.f7142.getClass();
                        int iM3079 = C1509.m3079();
                        AbstractC2328.m4338(context22, (16777215 & iM3079) | (-16777216), new C0046(c09123, iM3079, c1417, editText, view, 0));
                        break;
                }
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᲀᛷᲈᲇ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i5 = i;
                SeekBar seekBar5 = seekBar4;
                switch (i5) {
                    case 0:
                        if (seekBar5.getProgress() > 0) {
                            seekBar5.setProgress(seekBar5.getProgress() - 1);
                        }
                        break;
                    case 1:
                        if (seekBar5.getProgress() < 100) {
                            seekBar5.setProgress(seekBar5.getProgress() + 1);
                        }
                        break;
                    case 2:
                        int progress = seekBar5.getProgress();
                        if (progress > 0) {
                            seekBar5.setProgress(progress - 1);
                        }
                        break;
                    case 3:
                        int progress2 = seekBar5.getProgress();
                        if (progress2 < seekBar5.getMax()) {
                            seekBar5.setProgress(progress2 + 1);
                        }
                        break;
                    case 4:
                        int progress3 = seekBar5.getProgress();
                        if (progress3 > seekBar5.getMin()) {
                            seekBar5.setProgress(progress3 - 1);
                        }
                        break;
                    case 5:
                        int progress4 = seekBar5.getProgress();
                        if (progress4 < seekBar5.getMax()) {
                            seekBar5.setProgress(progress4 + 1);
                        }
                        break;
                    case 6:
                        int progress5 = seekBar5.getProgress();
                        if (progress5 > 0) {
                            int i6 = progress5 - 1;
                            if (i6 < 0) {
                                i6 = 0;
                            }
                            seekBar5.setProgress(i6);
                        }
                        break;
                    case 7:
                        int progress6 = seekBar5.getProgress();
                        if (progress6 < seekBar5.getMax()) {
                            int i7 = progress6 + 1;
                            seekBar5.setProgress(i7 <= 100 ? i7 : 100);
                        }
                        break;
                    case 8:
                        int progress7 = seekBar5.getProgress();
                        if (progress7 > 0) {
                            seekBar5.setProgress(progress7 - 1);
                        }
                        break;
                    default:
                        int progress8 = seekBar5.getProgress();
                        if (progress8 < seekBar5.getMax()) {
                            seekBar5.setProgress(progress8 + 1);
                        }
                        break;
                }
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᲀᛷᲈᲇ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i5 = i2;
                SeekBar seekBar5 = seekBar4;
                switch (i5) {
                    case 0:
                        if (seekBar5.getProgress() > 0) {
                            seekBar5.setProgress(seekBar5.getProgress() - 1);
                        }
                        break;
                    case 1:
                        if (seekBar5.getProgress() < 100) {
                            seekBar5.setProgress(seekBar5.getProgress() + 1);
                        }
                        break;
                    case 2:
                        int progress = seekBar5.getProgress();
                        if (progress > 0) {
                            seekBar5.setProgress(progress - 1);
                        }
                        break;
                    case 3:
                        int progress2 = seekBar5.getProgress();
                        if (progress2 < seekBar5.getMax()) {
                            seekBar5.setProgress(progress2 + 1);
                        }
                        break;
                    case 4:
                        int progress3 = seekBar5.getProgress();
                        if (progress3 > seekBar5.getMin()) {
                            seekBar5.setProgress(progress3 - 1);
                        }
                        break;
                    case 5:
                        int progress4 = seekBar5.getProgress();
                        if (progress4 < seekBar5.getMax()) {
                            seekBar5.setProgress(progress4 + 1);
                        }
                        break;
                    case 6:
                        int progress5 = seekBar5.getProgress();
                        if (progress5 > 0) {
                            int i6 = progress5 - 1;
                            if (i6 < 0) {
                                i6 = 0;
                            }
                            seekBar5.setProgress(i6);
                        }
                        break;
                    case 7:
                        int progress6 = seekBar5.getProgress();
                        if (progress6 < seekBar5.getMax()) {
                            int i7 = progress6 + 1;
                            seekBar5.setProgress(i7 <= 100 ? i7 : 100);
                        }
                        break;
                    case 8:
                        int progress7 = seekBar5.getProgress();
                        if (progress7 > 0) {
                            seekBar5.setProgress(progress7 - 1);
                        }
                        break;
                    default:
                        int progress8 = seekBar5.getProgress();
                        if (progress8 < seekBar5.getMax()) {
                            seekBar5.setProgress(progress8 + 1);
                        }
                        break;
                }
            }
        });
        seekBar4.setOnSeekBarChangeListener(new C2171(textView4, i2, view2));
        textView7.setOnClickListener(new ViewOnClickListenerC2618(3));
        textView8.setOnClickListener(new ViewOnClickListenerC1462(i2, imageView));
        final int i5 = 0;
        for (Object obj : listM4854) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC2725.m4853();
                throw null;
            }
            ((TextView) obj).setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛶᛶᛱᲇ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C2701.f13261.getClass();
                    C2701.m4793(view3);
                    C1509.f7142.getClass();
                    C0668 c06682 = C1509.f7270;
                    InterfaceC1989 interfaceC1989 = C1509.f7179[73];
                    int i7 = i5;
                    c06682.m1581(interfaceC1989, Integer.valueOf(i7));
                    C0644.m1538(i7, listM4854);
                    C1435.m2931(C1435.f6790);
                }
            });
            i5 = i6;
        }
        ((C1729) this.f3099).f8756.setOnClickListener(new ViewOnClickListenerC1374(c0912, 7, (C1223) this.f3102));
    }

    public /* synthetic */ C0644(Object obj, Object obj2, Object obj3, int i) {
        this.f3100 = i;
        this.f3099 = obj;
        this.f3102 = obj2;
        this.f3101 = obj3;
    }

    public /* synthetic */ C0644(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f3100 = i;
        this.f3101 = obj;
        this.f3099 = obj2;
        this.f3102 = obj3;
    }

    public /* synthetic */ C0644(int i, boolean z) {
        this.f3100 = i;
    }

    public C0644(C0299 c0299) {
        this.f3100 = 6;
        this.f3099 = c0299;
        this.f3102 = new C2066((C0363) c0299.f1576);
        this.f3101 = new C2776((C1888) c0299.f1574);
    }

    public C0644(C0644 c0644) {
        this.f3100 = 1;
        this.f3099 = new ArrayList();
        this.f3102 = new HashSet();
        this.f3101 = c0644;
    }

    public C0644(LinearLayout linearLayout, RelativeLayout relativeLayout, TextView textView, TextView textView2, RelativeLayout relativeLayout2, TextView textView3) {
        this.f3100 = 26;
        this.f3099 = relativeLayout;
        this.f3102 = textView;
        this.f3101 = textView3;
    }

    public C0644(LinearLayout linearLayout, Button button, Button button2, ImageView imageView, CustomRecyclerView customRecyclerView, TextView textView, TextView textView2) {
        this.f3100 = 20;
        this.f3099 = button;
        this.f3102 = button2;
        this.f3101 = textView2;
    }

    public C0644(C1729 c1729, Context context, C1223 c1223) {
        this.f3100 = 8;
        this.f3099 = c1729;
        this.f3101 = context;
        this.f3102 = c1223;
    }

    public C0644(CustomRecyclerView customRecyclerView) {
        this.f3100 = 15;
        Context context = customRecyclerView.getContext();
        this.f3099 = AbstractC1367.m2767(context, R.drawable.afs_track);
        this.f3102 = AbstractC1367.m2767(context, R.drawable.afs_thumb);
        this.f3101 = AbstractC2408.f11841;
    }

    public C0644(String str) {
        this.f3100 = 3;
        this.f3099 = str;
    }

    public C0644(Context context, TypedArray typedArray) {
        this.f3100 = 27;
        this.f3101 = context;
        this.f3099 = typedArray;
    }

    public C0644(Context context, LocationManager locationManager) {
        this.f3100 = 28;
        this.f3102 = new C1152();
        this.f3101 = context;
        this.f3099 = locationManager;
    }

    public C0644(Context context) {
        this.f3100 = 0;
        this.f3101 = context.getApplicationContext();
        this.f3102 = new HashSet();
        this.f3099 = new HashMap();
    }

    public C0644(C0859 c0859) {
        this.f3100 = 5;
        this.f3099 = new ArrayList();
        this.f3102 = new C0390();
        this.f3101 = c0859;
    }

    public C0644(InterfaceC0097 interfaceC0097, AbstractC0145 abstractC0145, Class cls, String str) {
        this.f3100 = 4;
        this.f3099 = interfaceC0097;
        this.f3102 = cls;
        this.f3101 = str;
    }

    public C0644(C2747 c2747, ArrayList arrayList, C2267 c2267) {
        this.f3100 = 18;
        AbstractC0319.m992(c2267, "Argument must not be null");
        this.f3102 = c2267;
        this.f3101 = arrayList;
        this.f3099 = new C2014(c2747, c2267);
    }

    public C0644(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C2267 c2267) {
        this.f3100 = 19;
        AbstractC0319.m992(c2267, "Argument must not be null");
        this.f3099 = c2267;
        this.f3102 = arrayList;
        this.f3101 = new C0039(parcelFileDescriptor);
    }

    public C0644(Matcher matcher) {
        this.f3100 = 24;
        this.f3099 = matcher;
        this.f3102 = new C2653(this);
    }

    public C0644(C2620 c2620, C0397 c0397, C2028 c2028) {
        this.f3100 = 13;
        this.f3101 = c2620;
        this.f3102 = c0397;
        this.f3099 = c2028;
    }
}
