package Yue;

import Yue.AbstractC6381;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6383<T extends AbstractC6381> implements Iterator<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public AbstractC6381 f16156;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public T f16157;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public AbstractC6381 f16158;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public AbstractC6381 f16159;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public AbstractC6381 f16160;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final Class<T> f16161;

    public C6383(AbstractC6381 abstractC6381, Class<T> cls) {
        C8159.m26910(abstractC6381);
        C8159.m26910(cls);
        this.f16161 = cls;
        m19937(abstractC6381);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C6383<AbstractC6381> m2833(AbstractC6381 abstractC6381) {
        return new C6383<>(abstractC6381, AbstractC6381.class);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        m19935();
        return this.f16157 != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f16158.m19924();
    }

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
    /* JADX INFO: renamed from: ۥ */
    public final T m2834() {
        AbstractC6381 abstractC6381Mo13701 = (T) this.f16158;
        do {
            if (abstractC6381Mo13701.mo13689() > 0) {
                abstractC6381Mo13701 = (T) abstractC6381Mo13701.m19902(0);
            } else if (this.f16156.equals(abstractC6381Mo13701)) {
                abstractC6381Mo13701 = (T) null;
            } else if (abstractC6381Mo13701.m19914() != null) {
                abstractC6381Mo13701 = (T) abstractC6381Mo13701.m19914();
            } else {
                do {
                    abstractC6381Mo13701 = abstractC6381Mo13701.mo13701();
                    if (abstractC6381Mo13701 == null || this.f16156.equals(abstractC6381Mo13701)) {
                        return null;
                    }
                } while (abstractC6381Mo13701.m19914() == null);
                abstractC6381Mo13701 = (T) abstractC6381Mo13701.m19914();
            }
            if (abstractC6381Mo13701 == null) {
                return null;
            }
        } while (!this.f16161.isInstance(abstractC6381Mo13701));
        return (T) abstractC6381Mo13701;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m19935() {
        if (this.f16157 != null) {
            return;
        }
        if (this.f16160 != null && !this.f16158.m19908()) {
            this.f16158 = this.f16159;
        }
        this.f16157 = (T) m2834();
    }

    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public T next() {
        m19935();
        T t = this.f16157;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.f16159 = this.f16158;
        this.f16158 = t;
        this.f16160 = t.mo13701();
        this.f16157 = null;
        return t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۡۢۤ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m19937(AbstractC6381 abstractC6381) {
        if (this.f16161.isInstance(abstractC6381)) {
            this.f16157 = abstractC6381;
        }
        this.f16158 = abstractC6381;
        this.f16159 = abstractC6381;
        this.f16156 = abstractC6381;
        this.f16160 = abstractC6381.mo13701();
    }
}
