package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.AbstractC0981a;
import p000a.AbstractC0433Y;
import p000a.InterfaceC0415X;

/* JADX INFO: renamed from: androidx.activity.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0977a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3628a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0433Y.a f3629b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ComponentActivity.C0967a f3630c;

    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public RunnableC0977a(ComponentActivity.C0967a c0967a, int i, AbstractC0433Y.a aVar) {
        this.f3630c = c0967a;
        this.f3628a = i;
        this.f3629b = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
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
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0415X<O> interfaceC0415X;
        T t = this.f3629b.f1629a;
        ComponentActivity.C0967a c0967a = this.f3630c;
        String str = (String) c0967a.f3638a.get(Integer.valueOf(this.f3628a));
        if (str == null) {
            return;
        }
        AbstractC0981a.a aVar = (AbstractC0981a.a) c0967a.f3642e.get(str);
        if (aVar == null || (interfaceC0415X = aVar.f3645a) == 0) {
            c0967a.f3644g.remove(str);
            c0967a.f3643f.put(str, t);
        } else if (c0967a.f3641d.remove(str)) {
            interfaceC0415X.mo1057a(t);
        }
    }
}
