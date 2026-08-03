package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1128m;
import androidx.savedstate.C1224a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p000a.AbstractC0005A4;
import p000a.C0012Ab;
import p000a.C0091Eg;
import p000a.C0142Hd;
import p000a.C0160Id;
import p000a.C0356Tc;
import p000a.C0406W8;
import p000a.C0568f3;
import p000a.C0631i9;
import p000a.InterfaceC0127Gg;
import p000a.InterfaceC0214Ld;

/* JADX INFO: renamed from: androidx.lifecycle.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1129n {

    /* JADX INFO: renamed from: a */
    public static final b f4707a = new b();

    /* JADX INFO: renamed from: b */
    public static final c f4708b = new c();

    /* JADX INFO: renamed from: c */
    public static final a f4709c = new a();

    /* JADX INFO: renamed from: androidx.lifecycle.n$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.n$b */
    public static final class b {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.n$c */
    public static final class c {
    }

    /* JADX INFO: renamed from: a */
    public static final C1128m m2610a(C0012Ab c0012Ab) {
        b bVar = f4707a;
        LinkedHashMap linkedHashMap = c0012Ab.f29a;
        InterfaceC0214Ld interfaceC0214Ld = (InterfaceC0214Ld) linkedHashMap.get(bVar);
        if (interfaceC0214Ld == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC0127Gg interfaceC0127Gg = (InterfaceC0127Gg) linkedHashMap.get(f4708b);
        if (interfaceC0127Gg == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f4709c);
        String str = (String) linkedHashMap.get(C1134r.f4722a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        C1224a.b bVarM3008b = interfaceC0214Ld.getSavedStateRegistry().m3008b();
        C0142Hd c0142Hd = bVarM3008b instanceof C0142Hd ? (C0142Hd) bVarM3008b : null;
        if (c0142Hd == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = m2612c(interfaceC0127Gg).f541d;
        C1128m c1128m = (C1128m) linkedHashMap2.get(str);
        if (c1128m != null) {
            return c1128m;
        }
        Class<? extends Object>[] clsArr = C1128m.f4701f;
        c0142Hd.m370b();
        Bundle bundle2 = c0142Hd.f497c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = c0142Hd.f497c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = c0142Hd.f497c;
        if (bundle5 != null && bundle5.isEmpty()) {
            c0142Hd.f497c = null;
        }
        C1128m c1128mM2609a = C1128m.a.m2609a(bundle3, bundle);
        linkedHashMap2.put(str, c1128mM2609a);
        return c1128mM2609a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T extends a.Ld & a.Gg */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final <T extends InterfaceC0214Ld & InterfaceC0127Gg> void m2611b(T t) {
        AbstractC1116e.b bVarMo2593b = t.getLifecycle().mo2593b();
        if (bVarMo2593b != AbstractC1116e.b.f4673b && bVarMo2593b != AbstractC1116e.b.f4674c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t.getSavedStateRegistry().m3008b() == null) {
            C0142Hd c0142Hd = new C0142Hd(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().m3009c("androidx.lifecycle.internal.SavedStateHandlesProvider", c0142Hd);
            t.getLifecycle().mo2592a(new SavedStateHandleAttacher(c0142Hd));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C0160Id m2612c(InterfaceC0127Gg interfaceC0127Gg) {
        ArrayList arrayList = new ArrayList();
        C0356Tc.f1350a.getClass();
        Class<?> clsMo1151a = new C0568f3(C0160Id.class).mo1151a();
        C0631i9.m1480c(clsMo1151a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C0091Eg(clsMo1151a));
        C0091Eg[] c0091EgArr = (C0091Eg[]) arrayList.toArray(new C0091Eg[0]);
        return (C0160Id) new C1133q(interfaceC0127Gg.getViewModelStore(), new C0406W8((C0091Eg[]) Arrays.copyOf(c0091EgArr, c0091EgArr.length)), interfaceC0127Gg instanceof InterfaceC1114c ? ((InterfaceC1114c) interfaceC0127Gg).getDefaultViewModelCreationExtras() : AbstractC0005A4.a.f30b).m2615a(C0160Id.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
