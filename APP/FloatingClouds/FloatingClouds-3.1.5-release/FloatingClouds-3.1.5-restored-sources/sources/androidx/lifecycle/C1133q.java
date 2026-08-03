package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import p000a.AbstractC0005A4;
import p000a.AbstractC0073Dg;
import p000a.C0012Ab;
import p000a.C0109Fg;
import p000a.C0631i9;
import p000a.C0793r0;

/* JADX INFO: renamed from: androidx.lifecycle.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1133q {

    /* JADX INFO: renamed from: a */
    public final C0109Fg f4716a;

    /* JADX INFO: renamed from: b */
    public final b f4717b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0005A4 f4718c;

    /* JADX INFO: renamed from: androidx.lifecycle.q$a */
    public static class a extends c {

        /* JADX INFO: renamed from: c */
        public static a f4719c;

        /* JADX INFO: renamed from: b */
        public final Application f4720b;

        public a(Application application) {
            this.f4720b = application;
        }

        @Override // androidx.lifecycle.C1133q.c, androidx.lifecycle.C1133q.b
        /* JADX INFO: renamed from: a */
        public final <T extends AbstractC0073Dg> T mo438a(Class<T> cls) {
            Application application = this.f4720b;
            if (application != null) {
                return (T) m2616c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.C1133q.b
        /* JADX INFO: renamed from: b */
        public final AbstractC0073Dg mo1051b(Class cls, C0012Ab c0012Ab) {
            if (this.f4720b != null) {
                return mo438a(cls);
            }
            Application application = (Application) c0012Ab.f29a.get(C1131p.f4715a);
            if (application != null) {
                return m2616c(cls, application);
            }
            if (C0793r0.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.mo438a(cls);
        }

        /* JADX INFO: renamed from: c */
        public final <T extends AbstractC0073Dg> T m2616c(Class<T> cls, Application application) {
            if (!C0793r0.class.isAssignableFrom(cls)) {
                return (T) super.mo438a(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                C0631i9.m1481d(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.q$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        default <T extends AbstractC0073Dg> T mo438a(Class<T> cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        /* JADX INFO: renamed from: b */
        default AbstractC0073Dg mo1051b(Class cls, C0012Ab c0012Ab) {
            return mo438a(cls);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.q$c */
    public static class c implements b {

        /* JADX INFO: renamed from: a */
        public static c f4721a;

        @Override // androidx.lifecycle.C1133q.b
        /* JADX INFO: renamed from: a */
        public <T extends AbstractC0073Dg> T mo438a(Class<T> cls) throws InvocationTargetException {
            try {
                T tNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                C0631i9.m1481d(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.q$d */
    public static class d {
        /* JADX INFO: renamed from: c */
        public void mo2613c(AbstractC0073Dg abstractC0073Dg) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1133q(C0109Fg c0109Fg, b bVar, AbstractC0005A4 abstractC0005A4) {
        C0631i9.m1482e(c0109Fg, "store");
        C0631i9.m1482e(abstractC0005A4, "defaultCreationExtras");
        this.f4716a = c0109Fg;
        this.f4717b = bVar;
        this.f4718c = abstractC0005A4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.lifecycle.q$b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final AbstractC0073Dg m2615a(Class cls, String str) {
        AbstractC0073Dg abstractC0073DgMo438a;
        C0631i9.m1482e(str, "key");
        C0109Fg c0109Fg = this.f4716a;
        c0109Fg.getClass();
        LinkedHashMap linkedHashMap = c0109Fg.f369a;
        AbstractC0073Dg abstractC0073Dg = (AbstractC0073Dg) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(abstractC0073Dg);
        b bVar = this.f4717b;
        if (zIsInstance) {
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                C0631i9.m1479b(abstractC0073Dg);
                dVar.mo2613c(abstractC0073Dg);
            }
            C0631i9.m1480c(abstractC0073Dg, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return abstractC0073Dg;
        }
        C0012Ab c0012Ab = new C0012Ab(this.f4718c);
        c0012Ab.f29a.put(C1134r.f4722a, str);
        try {
            abstractC0073DgMo438a = bVar.mo1051b(cls, c0012Ab);
        } catch (AbstractMethodError unused) {
            abstractC0073DgMo438a = bVar.mo438a(cls);
        }
        C0631i9.m1482e(abstractC0073DgMo438a, "viewModel");
        AbstractC0073Dg abstractC0073Dg2 = (AbstractC0073Dg) linkedHashMap.put(str, abstractC0073DgMo438a);
        if (abstractC0073Dg2 != null) {
            abstractC0073Dg2.mo174b();
        }
        return abstractC0073DgMo438a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1133q(C0109Fg c0109Fg, b bVar) {
        this(c0109Fg, bVar, AbstractC0005A4.a.f30b);
        C0631i9.m1482e(c0109Fg, "store");
    }
}
