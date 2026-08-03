package androidx.activity.result;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.result.AbstractC0981a;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.InterfaceC1118g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p000a.AbstractC0249Nc;
import p000a.AbstractC0433Y;
import p000a.C0397W;
import p000a.C0508c0;
import p000a.C0527d0;
import p000a.InterfaceC0415X;
import p000a.InterfaceC0935y9;

/* JADX INFO: renamed from: androidx.activity.result.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0981a {

    /* JADX INFO: renamed from: a */
    public final HashMap f3638a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f3639b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f3640c = new HashMap();

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f3641d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final transient HashMap f3642e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f3643f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f3644g = new Bundle();

    /* JADX INFO: renamed from: androidx.activity.result.a$a */
    public static class a<O> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0415X<O> f3645a;

        /* JADX INFO: renamed from: b */
        public final AbstractC0433Y<?, O> f3646b;

        public a(AbstractC0433Y abstractC0433Y, InterfaceC0415X interfaceC0415X) {
            this.f3645a = interfaceC0415X;
            this.f3646b = abstractC0433Y;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final AbstractC1116e f3647a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<InterfaceC1118g> f3648b = new ArrayList<>();

        public b(AbstractC1116e abstractC1116e) {
            this.f3647a = abstractC1116e;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v4 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    /* JADX INFO: renamed from: a */
    public final boolean m2291a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.HashMap r0 = r3.f3638a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r4 = 0
            return r4
        L10:
            java.util.HashMap r0 = r3.f3642e
            java.lang.Object r0 = r0.get(r4)
            androidx.activity.result.a$a r0 = (androidx.activity.result.AbstractC0981a.a) r0
            if (r0 == 0) goto L35
            a.X<O> r1 = r0.f3645a
            if (r1 == 0) goto L35
            java.util.ArrayList<java.lang.String> r2 = r3.f3641d
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L35
            a.Y<?, O> r0 = r0.f3646b
            java.lang.Object r5 = r0.mo1079c(r6, r5)
            r1.mo1057a(r5)
            java.util.ArrayList<java.lang.String> r5 = r3.f3641d
            r5.remove(r4)
            goto L44
        L35:
            java.util.HashMap r0 = r3.f3643f
            r0.remove(r4)
            a.W r0 = new a.W
            r0.<init>(r6, r5)
            android.os.Bundle r5 = r3.f3644g
            r5.putParcelable(r4, r0)
        L44:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.AbstractC0981a.m2291a(int, int, android.content.Intent):boolean");
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2279b(int i, AbstractC0433Y abstractC0433Y, @SuppressLint({"UnknownNullness"}) Parcelable parcelable);

    /* JADX INFO: renamed from: c */
    public final C0508c0 m2292c(final String str, ComponentActivity componentActivity, final AbstractC0433Y abstractC0433Y, final InterfaceC0415X interfaceC0415X) {
        AbstractC1116e lifecycle = componentActivity.getLifecycle();
        if (lifecycle.mo2593b().compareTo(AbstractC1116e.b.f4675d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + componentActivity + " is attempting to register while current state is " + lifecycle.mo2593b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        m2294e(str);
        HashMap map = this.f3640c;
        b bVar = (b) map.get(str);
        if (bVar == null) {
            bVar = new b(lifecycle);
        }
        InterfaceC1118g interfaceC1118g = new InterfaceC1118g() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.InterfaceC1118g
            /* JADX INFO: renamed from: a */
            public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
                boolean zEquals = AbstractC1116e.a.ON_START.equals(aVar);
                String str2 = str;
                AbstractC0981a abstractC0981a = this.f3637d;
                if (!zEquals) {
                    if (AbstractC1116e.a.ON_STOP.equals(aVar)) {
                        abstractC0981a.f3642e.remove(str2);
                        return;
                    } else {
                        if (AbstractC1116e.a.ON_DESTROY.equals(aVar)) {
                            abstractC0981a.m2295f(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap map2 = abstractC0981a.f3642e;
                InterfaceC0415X interfaceC0415X2 = interfaceC0415X;
                AbstractC0433Y abstractC0433Y2 = abstractC0433Y;
                map2.put(str2, new AbstractC0981a.a(abstractC0433Y2, interfaceC0415X2));
                HashMap map3 = abstractC0981a.f3643f;
                if (map3.containsKey(str2)) {
                    Object obj = map3.get(str2);
                    map3.remove(str2);
                    interfaceC0415X2.mo1057a(obj);
                }
                Bundle bundle = abstractC0981a.f3644g;
                C0397W c0397w = (C0397W) bundle.getParcelable(str2);
                if (c0397w != null) {
                    bundle.remove(str2);
                    interfaceC0415X2.mo1057a(abstractC0433Y2.mo1079c(c0397w.f1524b, c0397w.f1523a));
                }
            }
        };
        bVar.f3647a.mo2592a(interfaceC1118g);
        bVar.f3648b.add(interfaceC1118g);
        map.put(str, bVar);
        return new C0508c0();
    }

    /* JADX INFO: renamed from: d */
    public final C0527d0 m2293d(String str, AbstractC0433Y abstractC0433Y, InterfaceC0415X interfaceC0415X) {
        m2294e(str);
        this.f3642e.put(str, new a(abstractC0433Y, interfaceC0415X));
        HashMap map = this.f3643f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC0415X.mo1057a(obj);
        }
        Bundle bundle = this.f3644g;
        C0397W c0397w = (C0397W) bundle.getParcelable(str);
        if (c0397w != null) {
            bundle.remove(str);
            interfaceC0415X.mo1057a(abstractC0433Y.mo1079c(c0397w.f1524b, c0397w.f1523a));
        }
        return new C0527d0(this, str, abstractC0433Y);
    }

    /* JADX INFO: renamed from: e */
    public final void m2294e(String str) {
        HashMap map = this.f3639b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        AbstractC0249Nc.f855a.getClass();
        int iNextInt = AbstractC0249Nc.f856b.mo1537a().nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            HashMap map2 = this.f3638a;
            if (!map2.containsKey(Integer.valueOf(i))) {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            } else {
                AbstractC0249Nc.f855a.getClass();
                iNextInt = AbstractC0249Nc.f856b.mo1537a().nextInt(2147418112);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2295f(String str) {
        Integer num;
        if (!this.f3641d.contains(str) && (num = (Integer) this.f3639b.remove(str)) != null) {
            this.f3638a.remove(num);
        }
        this.f3642e.remove(str);
        HashMap map = this.f3643f;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f3644g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.f3640c;
        b bVar = (b) map2.get(str);
        if (bVar != null) {
            ArrayList<InterfaceC1118g> arrayList = bVar.f3648b;
            Iterator<InterfaceC1118g> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f3647a.mo2594c(it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
