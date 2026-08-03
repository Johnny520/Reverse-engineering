package Yue;

import Yue.InterfaceC7281;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6839
public final class C8095<R> implements InterfaceC7281<R> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C7282<R> f24008;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final ArrayList<InterfaceC5122<C8107>> f24009 = new ArrayList<>();

    /* JADX INFO: renamed from: Yue.ۥۣۢ۟ۥ$ۥ */
    public static final class C1432 extends AbstractC5673 implements InterfaceC5122<C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7286 f24010;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C8095<R> f24011;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<InterfaceC4199<? super R>, Object> f24012;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۢ۟ۥ<? super R> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1432(InterfaceC7286 interfaceC7286, C8095<? super R> c8095, InterfaceC5124<? super InterfaceC4199<? super R>, ? extends Object> interfaceC5124) {
            super(0);
            this.f24010 = interfaceC7286;
            this.f24011 = c8095;
            this.f24012 = interfaceC5124;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f24010.mo17250(this.f24011.m4133(), this.f24012);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۟ۥ$ۥ۟ */
    public static final class C1433 extends AbstractC5673 implements InterfaceC5122<C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7287<Q> f24013;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C8095<R> f24014;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<Q, InterfaceC4199<? super R>, Object> f24015;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۧۨۧ<? extends Q> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۢ۟ۥ<? super R> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Q, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1433(InterfaceC7287<? extends Q> interfaceC7287, C8095<? super R> c8095, InterfaceC5138<? super Q, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
            super(0);
            this.f24013 = interfaceC7287;
            this.f24014 = c8095;
            this.f24015 = interfaceC5138;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
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
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            /*
                r3 = this;
                Yue.ۥۡۧۨۧ<Q> r0 = r3.f24013
                Yue.ۥۣۢ۟ۥ<R> r1 = r3.f24014
                Yue.ۥۡۧۨۥ r1 = r1.m4133()
                Yue.ۥۣ۠ۢۢ<Q, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r2 = r3.f24015
                r0.mo5764(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C8095.C1433.invoke2():void");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۟ۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C8096 extends AbstractC5673 implements InterfaceC5122<C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7288<P, Q> f24016;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C8095<R> f24017;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ P f24018;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<Q, InterfaceC4199<? super R>, Object> f24019;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۧۨۨ<? super P, ? extends Q> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۢ۟ۥ<? super R> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Q, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8096(InterfaceC7288<? super P, ? extends Q> interfaceC7288, C8095<? super R> c8095, P p, InterfaceC5138<? super Q, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
            super(0);
            this.f24016 = interfaceC7288;
            this.f24017 = c8095;
            this.f24018 = p;
            this.f24019 = interfaceC5138;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
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
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            /*
                r4 = this;
                Yue.ۥۡۧۨۨ<P, Q> r0 = r4.f24016
                Yue.ۥۣۢ۟ۥ<R> r1 = r4.f24017
                Yue.ۥۡۧۨۥ r1 = r1.m4133()
                P r2 = r4.f24018
                Yue.ۥۣ۠ۢۢ<Q, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r3 = r4.f24019
                r0.mo5880(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C8095.C8096.invoke2():void");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۟ۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C8097 extends AbstractC5673 implements InterfaceC5122<C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C8095<R> f24020;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ long f24021;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<InterfaceC4199<? super R>, Object> f24022;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣۢ۟ۥ<? super R> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8097(C8095<? super R> c8095, long j, InterfaceC5124<? super InterfaceC4199<? super R>, ? extends Object> interfaceC5124) {
            super(0);
            this.f24020 = c8095;
            this.f24021 = j;
            this.f24022 = interfaceC5124;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f24020.m4133().mo22754(this.f24021, this.f24022);
        }
    }

    public C8095(@InterfaceC6399 InterfaceC4199<? super R> interfaceC4199) {
        this.f24008 = new C7282<>(interfaceC4199);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final ArrayList<InterfaceC5122<C8107>> m4132() {
        return this.f24009;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final C7282<R> m4133() {
        return this.f24008;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m26698(@InterfaceC6399 Throwable th) throws Throwable {
        this.f24008.m22769(th);
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Object m26699() throws Throwable {
        if (!this.f24008.mo22761()) {
            try {
                Collections.shuffle(this.f24009);
                Iterator<T> it = this.f24009.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5122) it.next()).invoke();
                }
            } catch (Throwable th) {
                this.f24008.m22769(th);
            }
        }
        return this.f24008.m22768();
    }

    @Override // Yue.InterfaceC7281
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo22751(@InterfaceC6399 InterfaceC7286 interfaceC7286, @InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super R>, ? extends Object> interfaceC5124) {
        this.f24009.add(new C1432(interfaceC7286, this, interfaceC5124));
    }

    @Override // Yue.InterfaceC7281
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public <Q> void mo22752(@InterfaceC6399 InterfaceC7287<? extends Q> interfaceC7287, @InterfaceC6399 InterfaceC5138<? super Q, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        this.f24009.add(new C1433(interfaceC7287, this, interfaceC5138));
    }

    @Override // Yue.InterfaceC7281
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public <P, Q> void mo22753(@InterfaceC6399 InterfaceC7288<? super P, ? extends Q> interfaceC7288, P p, @InterfaceC6399 InterfaceC5138<? super Q, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        this.f24009.add(new C8096(interfaceC7288, this, p, interfaceC5138));
    }

    @Override // Yue.InterfaceC7281
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo22754(long j, @InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super R>, ? extends Object> interfaceC5124) {
        this.f24009.add(new C8097(this, j, interfaceC5124));
    }

    @Override // Yue.InterfaceC7281
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public <P, Q> void mo22755(@InterfaceC6399 InterfaceC7288<? super P, ? extends Q> interfaceC7288, @InterfaceC6399 InterfaceC5138<? super Q, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        InterfaceC7281.C1221.m3545(this, interfaceC7288, interfaceC5138);
    }
}
