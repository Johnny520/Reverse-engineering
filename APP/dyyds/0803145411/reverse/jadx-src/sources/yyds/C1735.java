package yyds;

import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛸᛳᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1735 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C0674 f8772;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C0119 f8773;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final AtomicBoolean f8774;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f8775;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0522 f8776;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public InterfaceC0933 f8777;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final ServiceConnectionC0015 f8778;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final BinderC0661 f8779;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f8780;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f8781;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC0990 f8782;

    public C1735(Context context, String str, C0522 c0522) {
        this.f8775 = str;
        this.f8776 = c0522;
        this.f8780 = context.getApplicationContext();
        C2454 c2454 = c0522.f2512.f497;
        this.f8782 = c2454 == null ? null : c2454;
        this.f8774 = new AtomicBoolean(true);
        this.f8772 = new C0674();
        this.f8773 = new C0119(this, 0, c0522.f2513);
        this.f8779 = new BinderC0661(this);
        this.f8778 = new ServiceConnectionC0015(this);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3461(Intent intent) {
        if (this.f8774.compareAndSet(true, false)) {
            this.f8780.bindService(intent, this.f8778, 1);
            C0522 c0522 = this.f8776;
            C0119 c0119 = this.f8773;
            C0682 c0682 = c0522.f2516;
            String[] strArr = (String[]) c0119.f812;
            c0682.getClass();
            C0658 c0658 = new C0658();
            for (String str : strArr) {
                Set set = (Set) c0682.f3252.get(str.toLowerCase(Locale.ROOT));
                if (set != null) {
                    c0658.addAll(set);
                } else {
                    c0658.add(str);
                }
            }
            String[] strArr2 = (String[]) AbstractC1917.m3695(c0658).toArray(new String[0]);
            int length = strArr2.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                String str2 = strArr2[i];
                Integer num = (Integer) c0682.f3253.get(str2.toLowerCase(Locale.ROOT));
                if (num == null) {
                    C0188.m798("There is no table with name ".concat(str2));
                    return;
                }
                iArr[i] = num.intValue();
            }
            Pair pair = new Pair(strArr2, iArr);
            String[] strArr3 = (String[]) pair.component1();
            int[] iArr2 = (int[]) pair.component2();
            C2513 c2513 = new C2513(c0119, iArr2, strArr3);
            ReentrantLock reentrantLock = c0522.f2511;
            reentrantLock.lock();
            try {
                boolean zContainsKey = c0522.f2518.containsKey(c0119);
                LinkedHashMap linkedHashMap = c0522.f2518;
                C2513 c25132 = zContainsKey ? (C2513) AbstractC2366.m4386(linkedHashMap, c0119) : (C2513) linkedHashMap.put(c0119, c2513);
                reentrantLock.unlock();
                if (c25132 == null) {
                    C1303 c1303 = c0522.f2516.f3244;
                    ReentrantLock reentrantLock2 = c1303.f5962;
                    reentrantLock2.lock();
                    try {
                        boolean z = false;
                        for (int i2 : iArr2) {
                            long[] jArr = c1303.f5963;
                            long j = jArr[i2];
                            jArr[i2] = 1 + j;
                            if (j == 0) {
                                c1303.f5966 = true;
                                z = true;
                            }
                        }
                        if (!z && !c1303.f5966) {
                            boolean z2 = c1303.f5965;
                        }
                        reentrantLock2.unlock();
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
