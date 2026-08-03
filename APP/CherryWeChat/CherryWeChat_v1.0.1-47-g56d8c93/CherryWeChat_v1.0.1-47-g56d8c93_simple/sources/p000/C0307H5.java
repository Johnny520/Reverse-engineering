package p000;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.util.AbstractC2030b;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: H5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0307H5 implements InterfaceC2819zw, InterfaceC2123k0 {

    /* JADX INFO: renamed from: a */
    public final int f1020a;

    /* JADX INFO: renamed from: b */
    public final Object f1021b;

    public /* synthetic */ C0307H5(int r1, Object r2) {
        this.f1021b = r2;
        this.f1020a = r1;
    }

    /* JADX INFO: renamed from: a */
    public HashMap m657a(Map r5, ILogger r6) {
        HashMap r0 = new HashMap();
        Iterator r1 = r5.keySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        Object r2 = r1.next();
        Object r3 = r5.get(r2);
        if (r3 != null) goto L7;
        r0.put(r2.toString(), null);
        goto L4
    L7:
        r0.put(r2.toString(), m658b(r6, r3));
        goto L4
    L9:
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: b */
    public Object m658b(ILogger r8, Object r9) {
        HashSet r0 = (HashSet) this.f1021b;
        if (r9 != null) goto L6;
        return null;
    L6:
        if ((r9 instanceof Character) == false) goto L10;
        return r9.toString();
    L10:
        if ((r9 instanceof Number) == false) goto L13;
        return r9;
    L13:
        if ((r9 instanceof Boolean) == false) goto L16;
        return r9;
    L16:
        if ((r9 instanceof String) == false) goto L19;
        return r9;
    L19:
        if ((r9 instanceof Locale) == true) goto L21;
        int r3 = 0;
        if ((r9 instanceof AtomicIntegerArray) == false) goto L29;
        AtomicIntegerArray r92 = (AtomicIntegerArray) r9;
        Charset r82 = AbstractC2030b.f7215a;
        int r83 = r92.length();
        ArrayList r02 = new ArrayList(r83);
    L25:
        if (r3 >= r83) goto L27;
        r02.add(Integer.valueOf(r92.get(r3)));
        r3 = r3 + 1;
        goto L25
    L27:
        return r02;
    L29:
        if ((r9 instanceof AtomicBoolean) == false) goto L33;
        return Boolean.valueOf(((AtomicBoolean) r9).get());
    L33:
        if ((r9 instanceof URI) == false) goto L37;
        return r9.toString();
    L37:
        if ((r9 instanceof InetAddress) == false) goto L41;
        return r9.toString();
    L41:
        if ((r9 instanceof UUID) == false) goto L45;
        return r9.toString();
    L45:
        if ((r9 instanceof Currency) == false) goto L49;
        return r9.toString();
    L49:
        if ((r9 instanceof Calendar) == false) goto L53;
        return AbstractC2030b.m4174a((Calendar) r9);
    L53:
        if (r9.getClass().isEnum() == false) goto L57;
        return r9.toString();
    L57:
        if (r0.contains(r9) == false) goto L60;
        r8.mo3680e(EnumC1657a2.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
        return r9.toString();
    L60:
        r0.add(r9);
        if (r0.size() <= this.f1020a) goto L92;
        r0.remove(r9);
        r8.mo3680e(EnumC1657a2.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
        return r9.toString();
    L92:
    L71:
        e = move-exception;
        r8.mo3683r(EnumC1657a2.INFO, "Not serializing object due to throwing sub-path.", e);     // Catch: Throwable -> L69
        r0.remove(r9);
        return null;
    L65:
        if (r9.getClass().isArray() == false) goto L74;
        Object[] r2 = (Object[]) r9;     // Catch: Throwable -> L69 Exception -> L71
        Object r4 = new ArrayList();     // Catch: Throwable -> L69 Exception -> L71
        int r5 = r2.length;     // Catch: Throwable -> L69 Exception -> L71
    L67:
        if (r3 >= r5) goto L85;
        r4.add(m658b(r8, r2[r3]));     // Catch: Throwable -> L69 Exception -> L71
        r3 = r3 + 1;     // Catch: Throwable -> L69 Exception -> L71
    L85:
        r0.remove(r9);
        return r4;
    L74:
        if ((r9 instanceof Collection) == false) goto L80;
        r4 = new ArrayList();     // Catch: Throwable -> L69 Exception -> L71
        Iterator r22 = ((Collection) r9).iterator();     // Catch: Throwable -> L69 Exception -> L71
    L77:
        if (r22.hasNext() == false) goto L85;
        r4.add(m658b(r8, r22.next()));     // Catch: Throwable -> L69 Exception -> L71
        goto L77
    L80:
        if ((r9 instanceof Map) == false) goto L82;
        r4 = m657a((Map) r9, r8);     // Catch: Throwable -> L69 Exception -> L71
        goto L85
    L82:
        r4 = m659c(r8, r9);     // Catch: Throwable -> L69 Exception -> L71
        if (r4.isEmpty() == false) goto L85;
        r4 = r9.toString();     // Catch: Throwable -> L69 Exception -> L71
    L69:
        th = move-exception;
        r0.remove(r9);
        throw th;
    L21:
        return r9.toString();
    }

    /* JADX INFO: renamed from: c */
    public HashMap m659c(ILogger r10, Object r11) {
        Field[] r0 = r11.getClass().getDeclaredFields();
        HashMap r1 = new HashMap();
        int r2 = r0.length;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L15;
        Field r5 = r0[r4];
        if (Modifier.isTransient(r5.getModifiers()) == true) goto L14;
        if (Modifier.isStatic(r5.getModifiers()) == true) goto L14;
        String r6 = r5.getName();
        r5.setAccessible(true);     // Catch: Exception -> L13
        r1.put(r6, m658b(r10, r5.get(r11)));     // Catch: Exception -> L13
        r5.setAccessible(false);     // Catch: Exception -> L13
    L13:
        r10.mo3680e(EnumC1657a2.INFO, AbstractC2374ph.m4814k("Cannot access field ", r6, "."), new Object[0]);
    L14:
        r4 = r4 + 1;
        goto L3
    L15:
        return r1;
    }

    @Override // p000.InterfaceC2819zw
    /* JADX INFO: renamed from: i */
    public InterfaceC2389pw mo660i(InterfaceC2389pw r4, C2644vt r5) {
        ByteArrayOutputStream r52 = new ByteArrayOutputStream();
        ((Bitmap) r4.get()).compress((Bitmap.CompressFormat) this.f1021b, this.f1020a, r52);
        r4.mo118e();
        return new C0304H2(r52.toByteArray());
    }

    @Override // p000.InterfaceC2123k0
    public boolean perform(View r1, AbstractC1241c0 r2) {
        ((BottomSheetBehavior) this.f1021b).m2430B(this.f1020a);
        return true;
    }

    public C0307H5(int r1, boolean r2) {
        switch(r1) {
            case 3: goto L5;
            default: goto L3;
        };
    L3:
        this.f1021b = Bitmap.CompressFormat.JPEG;
        this.f1020a = 100;
        return;
    L5:
        this.f1020a = 1;
        this.f1021b = Collections.singletonList(null);
    }

    public C0307H5(int r2) {
        this.f1021b = new HashSet();
        this.f1020a = r2;
    }

    public C0307H5(ArrayList r2) {
        this.f1020a = 0;
        this.f1021b = r2;
    }
}
