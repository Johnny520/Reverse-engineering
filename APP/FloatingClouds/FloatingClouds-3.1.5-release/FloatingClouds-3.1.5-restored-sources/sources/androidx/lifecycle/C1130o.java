package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1128m;
import androidx.lifecycle.C1133q;
import androidx.savedstate.C1224a;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import p000a.AbstractC0073Dg;
import p000a.C0012Ab;
import p000a.C0232Md;
import p000a.C0631i9;
import p000a.C0793r0;

/* JADX INFO: renamed from: androidx.lifecycle.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1130o extends C1133q.d implements C1133q.b {

    /* JADX INFO: renamed from: a */
    public final Application f4710a;

    /* JADX INFO: renamed from: b */
    public final C1133q.a f4711b;

    /* JADX INFO: renamed from: c */
    public final Bundle f4712c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1116e f4713d;

    /* JADX INFO: renamed from: e */
    public final C1224a f4714e;

    @SuppressLint({"LambdaLast"})
    public C1130o(Application application, ComponentActivity componentActivity, Bundle bundle) {
        C1133q.a aVar;
        this.f4714e = componentActivity.getSavedStateRegistry();
        this.f4713d = componentActivity.getLifecycle();
        this.f4712c = bundle;
        this.f4710a = application;
        if (application != null) {
            if (C1133q.a.f4719c == null) {
                C1133q.a.f4719c = new C1133q.a(application);
            }
            aVar = C1133q.a.f4719c;
            C0631i9.m1479b(aVar);
        } else {
            aVar = new C1133q.a(null);
        }
        this.f4711b = aVar;
    }

    @Override // androidx.lifecycle.C1133q.b
    /* JADX INFO: renamed from: a */
    public final <T extends AbstractC0073Dg> T mo438a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m2614d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C1133q.b
    /* JADX INFO: renamed from: b */
    public final AbstractC0073Dg mo1051b(Class cls, C0012Ab c0012Ab) {
        C1134r c1134r = C1134r.f4722a;
        LinkedHashMap linkedHashMap = c0012Ab.f29a;
        String str = (String) linkedHashMap.get(c1134r);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(C1129n.f4707a) == null || linkedHashMap.get(C1129n.f4708b) == null) {
            if (this.f4713d != null) {
                return m2614d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(C1131p.f4715a);
        boolean zIsAssignableFrom = C0793r0.class.isAssignableFrom(cls);
        Constructor constructorM623a = (!zIsAssignableFrom || application == null) ? C0232Md.m623a(cls, C0232Md.f773b) : C0232Md.m623a(cls, C0232Md.f772a);
        return constructorM623a == null ? this.f4711b.mo1051b(cls, c0012Ab) : (!zIsAssignableFrom || application == null) ? C0232Md.m624b(cls, constructorM623a, C1129n.m2610a(c0012Ab)) : C0232Md.m624b(cls, constructorM623a, application, C1129n.m2610a(c0012Ab));
    }

    @Override // androidx.lifecycle.C1133q.d
    /* JADX INFO: renamed from: c */
    public final void mo2613c(AbstractC0073Dg abstractC0073Dg) {
        AbstractC1116e abstractC1116e = this.f4713d;
        if (abstractC1116e != null) {
            C1224a c1224a = this.f4714e;
            C0631i9.m1479b(c1224a);
            C1115d.m2590a(abstractC0073Dg, c1224a, abstractC1116e);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x00a2 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: androidx.lifecycle.SavedStateHandleController */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: androidx.lifecycle.SavedStateHandleController */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final AbstractC0073Dg m2614d(Class cls, String str) {
        Object obj;
        Application application;
        AbstractC1116e abstractC1116e = this.f4713d;
        if (abstractC1116e == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C0793r0.class.isAssignableFrom(cls);
        Constructor constructorM623a = (!zIsAssignableFrom || this.f4710a == null) ? C0232Md.m623a(cls, C0232Md.f773b) : C0232Md.m623a(cls, C0232Md.f772a);
        if (constructorM623a == null) {
            if (this.f4710a != null) {
                return this.f4711b.mo438a(cls);
            }
            if (C1133q.c.f4721a == null) {
                C1133q.c.f4721a = new C1133q.c();
            }
            C1133q.c cVar = C1133q.c.f4721a;
            C0631i9.m1479b(cVar);
            return cVar.mo438a(cls);
        }
        C1224a c1224a = this.f4714e;
        C0631i9.m1479b(c1224a);
        Bundle bundle = this.f4712c;
        Bundle bundleM3007a = c1224a.m3007a(str);
        Class<? extends Object>[] clsArr = C1128m.f4701f;
        C1128m c1128mM2609a = C1128m.a.m2609a(bundleM3007a, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, c1128mM2609a);
        savedStateHandleController.m2585c(abstractC1116e, c1224a);
        AbstractC1116e.b bVarMo2593b = abstractC1116e.mo2593b();
        if (bVarMo2593b == AbstractC1116e.b.f4673b || bVarMo2593b.compareTo(AbstractC1116e.b.f4675d) >= 0) {
            c1224a.m3010d();
        } else {
            abstractC1116e.mo2592a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC1116e, c1224a));
        }
        AbstractC0073Dg abstractC0073DgM624b = (!zIsAssignableFrom || (application = this.f4710a) == null) ? C0232Md.m624b(cls, constructorM623a, c1128mM2609a) : C0232Md.m624b(cls, constructorM623a, application, c1128mM2609a);
        synchronized (abstractC0073DgM624b.f243a) {
            try {
                obj = abstractC0073DgM624b.f243a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == null) {
                    abstractC0073DgM624b.f243a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            savedStateHandleController = obj;
        }
        if (abstractC0073DgM624b.f245c) {
            AbstractC0073Dg.m173a(savedStateHandleController);
        }
        return abstractC0073DgM624b;
    }
}
