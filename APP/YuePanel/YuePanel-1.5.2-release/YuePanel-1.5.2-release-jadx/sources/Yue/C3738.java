package Yue;

import Yue.C7060;
import com.android.p001dx.p004io.Opcodes;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3738 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0}, m1275l = {404}, m1276m = "any", m1277n = {"$this$consume$iv"}, m1278s = {"L$0"})
    public static final class C0247<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6701;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6702;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f6703;

        public C0247(InterfaceC4199<? super C0247> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6702 = obj;
            this.f6703 |= Integer.MIN_VALUE;
            return C3738.m815(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟ */
    public static final class C0248 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<?> f6704;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0248(InterfaceC7042<?> interfaceC7042) {
            super(1);
            this.f6704 = interfaceC7042;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            m10347(th);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m10347(@InterfaceC6489 Throwable th) {
            C3734.m810(this.f6704, th);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3739 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<?>[] f6705;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3739(InterfaceC7042<?>[] interfaceC7042Arr) {
            super(1);
            this.f6705 = interfaceC7042Arr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) throws Throwable {
            m10348(th);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m10348(@InterfaceC6489 Throwable th) throws Throwable {
            Throwable th2 = null;
            for (InterfaceC7042<?> interfaceC7042 : this.f6705) {
                try {
                    C3734.m810(interfaceC7042, th);
                } catch (Throwable th3) {
                    if (th2 == null) {
                        th2 = th3;
                    } else {
                        C4741.m1656(th2, th3);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0}, m1275l = {487}, m1276m = "count", m1277n = {"count", "$this$consume$iv$iv"}, m1278s = {"L$0", "L$1"})
    public static final class C3740<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6706;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6707;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6708;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6709;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6710;

        public C3740(InterfaceC4199<? super C3740> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6709 = obj;
            this.f6710 |= Integer.MIN_VALUE;
            return C3738.m10290(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", m1273f = "Deprecated.kt", m1274i = {}, m1275l = {}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C3741 extends AbstractC7690 implements InterfaceC5138<Object, InterfaceC4199<Object>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6711;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6712;

        public C3741(InterfaceC4199<? super C3741> interfaceC4199) {
            super(2, interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3741 c3741 = new C3741(interfaceC4199);
            c3741.f6712 = obj;
            return c3741;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            C5508.m17142();
            if (this.f6711 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7149.m22422(obj);
            return this.f6712;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, @InterfaceC6489 InterfaceC4199<Object> interfaceC4199) {
            return ((C3741) create(obj, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1, 1, 2, 2, 2}, m1275l = {387, 388, 390}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, m1278s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    public static final class C3742<E> extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super E>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6713;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6714;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6715;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f6716;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f6717;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<E> f6718;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<E, InterfaceC4199<? super K>, Object> f6719;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۦۡۡ<? extends E> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super E, ? super Yue.ۥ۟ۧۤۢ<? super K>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3742(InterfaceC7042<? extends E> interfaceC7042, InterfaceC5138<? super E, ? super InterfaceC4199<? super K>, ? extends Object> interfaceC5138, InterfaceC4199<? super C3742> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6718 = interfaceC7042;
            this.f6719 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3742 c3742 = new C3742(this.f6718, this.f6719, interfaceC4199);
            c3742.f6717 = obj;
            return c3742;
        }

        /* JADX DEBUG: Type inference failed for r7v1. Raw type applied. Possible types: Yue.ۥۣ۠ۢۢ<E, Yue.ۥ۟ۧۤۢ<? super K>, java.lang.Object>, Yue.ۥۣ۠ۢۢ */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v18 */
        /* JADX WARN: Type inference failed for: r5v19 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.HashSet] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v18 */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v0, types: [Yue.ۥۡۨۡ۠, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a1 -> B:29:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b4 -> B:28:0x00b6). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to Yue.ￛﾥￛﾟￛﾤￛﾢￛﾣ$ￛﾥￛﾟￛﾟￛﾟￛﾠ<E> for r10v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // Yue.AbstractC3513
        @Yue.InterfaceC6489
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC6399 java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = Yue.C5508.m17142()
                int r1 = r10.f6716
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L51
                if (r1 == r4) goto L41
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r10.f6715
                java.lang.Object r5 = r10.f6714
                Yue.ۥ۟ۤۡۧ r5 = (Yue.InterfaceC3728) r5
                java.lang.Object r6 = r10.f6713
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.f6717
                Yue.ۥۡۥۡۤ r7 = (Yue.InterfaceC6809) r7
                Yue.C7149.m22422(r11)
                goto Lb6
            L24:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2c:
                java.lang.Object r1 = r10.f6715
                java.lang.Object r5 = r10.f6714
                Yue.ۥ۟ۤۡۧ r5 = (Yue.InterfaceC3728) r5
                java.lang.Object r6 = r10.f6713
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.f6717
                Yue.ۥۡۥۡۤ r7 = (Yue.InterfaceC6809) r7
                Yue.C7149.m22422(r11)
                r9 = r5
                r5 = r1
                r1 = r9
                goto L9d
            L41:
                java.lang.Object r1 = r10.f6714
                Yue.ۥ۟ۤۡۧ r1 = (Yue.InterfaceC3728) r1
                java.lang.Object r5 = r10.f6713
                java.util.HashSet r5 = (java.util.HashSet) r5
                java.lang.Object r6 = r10.f6717
                Yue.ۥۡۥۡۤ r6 = (Yue.InterfaceC6809) r6
                Yue.C7149.m22422(r11)
                goto L79
            L51:
                Yue.C7149.m22422(r11)
                java.lang.Object r11 = r10.f6717
                Yue.ۥۡۥۡۤ r11 = (Yue.InterfaceC6809) r11
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                Yue.ۥۡۦۡۡ<E> r5 = r10.f6718
                Yue.ۥ۟ۤۡۧ r5 = r5.iterator()
                r6 = r11
                r9 = r5
                r5 = r1
                r1 = r9
            L67:
                r10.f6717 = r6
                r10.f6713 = r5
                r10.f6714 = r1
                r11 = 0
                r10.f6715 = r11
                r10.f6716 = r4
                java.lang.Object r11 = r1.mo38(r10)
                if (r11 != r0) goto L79
                return r0
            L79:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lbd
                java.lang.Object r11 = r1.next()
                Yue.ۥۣ۠ۢۢ<E, Yue.ۥ۟ۧۤۢ<? super K>, java.lang.Object> r7 = r10.f6719
                r10.f6717 = r6
                r10.f6713 = r5
                r10.f6714 = r1
                r10.f6715 = r11
                r10.f6716 = r3
                java.lang.Object r7 = r7.invoke(r11, r10)
                if (r7 != r0) goto L98
                return r0
            L98:
                r9 = r5
                r5 = r11
                r11 = r7
                r7 = r6
                r6 = r9
            L9d:
                boolean r8 = r6.contains(r11)
                if (r8 != 0) goto Lba
                r10.f6717 = r7
                r10.f6713 = r6
                r10.f6714 = r1
                r10.f6715 = r11
                r10.f6716 = r2
                java.lang.Object r5 = r7.mo5844(r5, r10)
                if (r5 != r0) goto Lb4
                return r0
            Lb4:
                r5 = r1
                r1 = r11
            Lb6:
                r6.add(r1)
                r1 = r5
            Lba:
                r5 = r6
                r6 = r7
                goto L67
            Lbd:
                Yue.ۥۣۢ۠ۤ r11 = Yue.C8107.f3222
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C3738.C3742.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<? super E> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3742) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 2}, m1275l = {164, 169, 170}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, m1278s = {"L$0", "I$0", "L$0", "L$0"})
    public static final class C3743 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<Object>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6720;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f6721;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f6722;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6723;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ int f6724;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<Object> f6725;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3743(int i, InterfaceC7042<Object> interfaceC7042, InterfaceC4199<? super C3743> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6724 = i;
            this.f6725 = interfaceC7042;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3743 c3743 = new C3743(this.f6724, this.f6725, interfaceC4199);
            c3743.f6723 = obj;
            return c3743;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        
            if (r1 == 0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:23:0x0068). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a4 -> B:8:0x001c). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC6809 interfaceC6809;
            int i;
            InterfaceC3728<Object> it;
            InterfaceC6809 interfaceC68092;
            InterfaceC3728<Object> it2;
            InterfaceC6809 interfaceC68093;
            Object objMo38;
            Object objM17142 = C5508.m17142();
            int i2 = this.f6722;
            if (i2 == 0) {
                C7149.m22422(obj);
                interfaceC6809 = (InterfaceC6809) this.f6723;
                i = this.f6724;
                if (!(i >= 0)) {
                    throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
                }
                if (i > 0) {
                    it = this.f6725.iterator();
                    interfaceC68092 = interfaceC6809;
                    this.f6723 = interfaceC68092;
                    this.f6720 = it;
                    this.f6721 = i;
                    this.f6722 = 1;
                    obj = it.mo38(this);
                    if (obj == objM17142) {
                        return objM17142;
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                    interfaceC6809 = interfaceC68092;
                }
                it2 = this.f6725.iterator();
                this.f6723 = interfaceC6809;
                this.f6720 = it2;
                this.f6722 = 2;
                objMo38 = it2.mo38(this);
                if (objMo38 != objM17142) {
                }
            } else if (i2 == 1) {
                i = this.f6721;
                it = (InterfaceC3728) this.f6720;
                interfaceC68092 = (InterfaceC6809) this.f6723;
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                    it.next();
                    i--;
                }
                interfaceC6809 = interfaceC68092;
                it2 = this.f6725.iterator();
                this.f6723 = interfaceC6809;
                this.f6720 = it2;
                this.f6722 = 2;
                objMo38 = it2.mo38(this);
                if (objMo38 != objM17142) {
                }
            } else if (i2 == 2) {
                it2 = (InterfaceC3728) this.f6720;
                interfaceC68093 = (InterfaceC6809) this.f6723;
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (InterfaceC3728) this.f6720;
                interfaceC68093 = (InterfaceC6809) this.f6723;
                C7149.m22422(obj);
                interfaceC6809 = interfaceC68093;
                this.f6723 = interfaceC6809;
                this.f6720 = it2;
                this.f6722 = 2;
                objMo38 = it2.mo38(this);
                if (objMo38 != objM17142) {
                    return objM17142;
                }
                interfaceC68093 = interfaceC6809;
                obj = objMo38;
                if (((Boolean) obj).booleanValue()) {
                    return C8107.f3222;
                }
                Object next = it2.next();
                this.f6723 = interfaceC68093;
                this.f6720 = it2;
                this.f6722 = 3;
                if (interfaceC68093.mo5844(next, this) == objM17142) {
                    return objM17142;
                }
                interfaceC6809 = interfaceC68093;
                this.f6723 = interfaceC6809;
                this.f6720 = it2;
                this.f6722 = 2;
                objMo38 = it2.mo38(this);
                if (objMo38 != objM17142) {
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<Object> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3743) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", m1273f = "Deprecated.kt", m1274i = {0, 1, 1, 2, 3, 4}, m1275l = {181, 182, 183, 187, 188}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, m1278s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    public static final class C3744 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<Object>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6726;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6727;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f6728;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6729;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<Object> f6730;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<Object, InterfaceC4199<? super Boolean>, Object> f6731;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<java.lang.Object, ? super Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3744(InterfaceC7042<Object> interfaceC7042, InterfaceC5138<Object, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, InterfaceC4199<? super C3744> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6730 = interfaceC7042;
            this.f6731 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3744 c3744 = new C3744(this.f6730, this.f6731, interfaceC4199);
            c3744.f6729 = obj;
            return c3744;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009f -> B:16:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ec -> B:10:0x0023). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC3728<Object> it;
            InterfaceC6809 interfaceC6809;
            InterfaceC6809 interfaceC68092;
            InterfaceC3728<Object> it2;
            InterfaceC6809 interfaceC68093;
            InterfaceC3728<Object> interfaceC3728;
            Object objMo38;
            Object objM17142 = C5508.m17142();
            int i = this.f6728;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC6809 interfaceC68094 = (InterfaceC6809) this.f6729;
                it = this.f6730.iterator();
                interfaceC6809 = interfaceC68094;
                this.f6729 = interfaceC6809;
                this.f6726 = it;
                this.f6727 = null;
                this.f6728 = 1;
                obj = it.mo38(this);
                if (obj == objM17142) {
                }
                InterfaceC6809 interfaceC68095 = interfaceC6809;
                InterfaceC3728<Object> interfaceC37282 = it;
                interfaceC68092 = interfaceC68095;
                if (((Boolean) obj).booleanValue()) {
                }
                it2 = this.f6730.iterator();
                this.f6729 = interfaceC68092;
                this.f6726 = it2;
                this.f6728 = 4;
                objMo38 = it2.mo38(this);
                if (objMo38 == objM17142) {
                }
            } else if (i == 1) {
                it = (InterfaceC3728) this.f6726;
                interfaceC6809 = (InterfaceC6809) this.f6729;
                C7149.m22422(obj);
                InterfaceC6809 interfaceC680952 = interfaceC6809;
                InterfaceC3728<Object> interfaceC372822 = it;
                interfaceC68092 = interfaceC680952;
                if (((Boolean) obj).booleanValue()) {
                }
                it2 = this.f6730.iterator();
                this.f6729 = interfaceC68092;
                this.f6726 = it2;
                this.f6728 = 4;
                objMo38 = it2.mo38(this);
                if (objMo38 == objM17142) {
                }
            } else if (i == 2) {
                Object obj2 = this.f6727;
                InterfaceC3728<Object> interfaceC37283 = (InterfaceC3728) this.f6726;
                InterfaceC6809 interfaceC68096 = (InterfaceC6809) this.f6729;
                C7149.m22422(obj);
                InterfaceC3728<Object> interfaceC37284 = interfaceC37283;
                Object obj3 = obj2;
                it = interfaceC37284;
                if (((Boolean) obj).booleanValue()) {
                    this.f6729 = interfaceC68096;
                    this.f6726 = null;
                    this.f6727 = null;
                    this.f6728 = 3;
                    if (interfaceC68096.mo5844(obj3, this) == objM17142) {
                        return objM17142;
                    }
                    interfaceC68092 = interfaceC68096;
                    it2 = this.f6730.iterator();
                    this.f6729 = interfaceC68092;
                    this.f6726 = it2;
                    this.f6728 = 4;
                    objMo38 = it2.mo38(this);
                    if (objMo38 == objM17142) {
                    }
                } else {
                    interfaceC6809 = interfaceC68096;
                    this.f6729 = interfaceC6809;
                    this.f6726 = it;
                    this.f6727 = null;
                    this.f6728 = 1;
                    obj = it.mo38(this);
                    if (obj == objM17142) {
                        return objM17142;
                    }
                    InterfaceC6809 interfaceC6809522 = interfaceC6809;
                    InterfaceC3728<Object> interfaceC3728222 = it;
                    interfaceC68092 = interfaceC6809522;
                    if (((Boolean) obj).booleanValue()) {
                        Object next = interfaceC3728222.next();
                        InterfaceC5138<Object, InterfaceC4199<? super Boolean>, Object> interfaceC5138 = this.f6731;
                        this.f6729 = interfaceC68092;
                        this.f6726 = interfaceC3728222;
                        this.f6727 = next;
                        this.f6728 = 2;
                        Object objInvoke = interfaceC5138.invoke(next, this);
                        if (objInvoke == objM17142) {
                            return objM17142;
                        }
                        interfaceC37284 = interfaceC3728222;
                        obj3 = next;
                        obj = objInvoke;
                        interfaceC68096 = interfaceC68092;
                        it = interfaceC37284;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    it2 = this.f6730.iterator();
                    this.f6729 = interfaceC68092;
                    this.f6726 = it2;
                    this.f6728 = 4;
                    objMo38 = it2.mo38(this);
                    if (objMo38 == objM17142) {
                    }
                }
            } else if (i == 3) {
                interfaceC68092 = (InterfaceC6809) this.f6729;
                C7149.m22422(obj);
                it2 = this.f6730.iterator();
                this.f6729 = interfaceC68092;
                this.f6726 = it2;
                this.f6728 = 4;
                objMo38 = it2.mo38(this);
                if (objMo38 == objM17142) {
                }
            } else if (i == 4) {
                interfaceC3728 = (InterfaceC3728) this.f6726;
                interfaceC68093 = (InterfaceC6809) this.f6729;
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3728 = (InterfaceC3728) this.f6726;
                interfaceC68093 = (InterfaceC6809) this.f6729;
                C7149.m22422(obj);
                it2 = interfaceC3728;
                interfaceC68092 = interfaceC68093;
                this.f6729 = interfaceC68092;
                this.f6726 = it2;
                this.f6728 = 4;
                objMo38 = it2.mo38(this);
                if (objMo38 == objM17142) {
                    return objM17142;
                }
                InterfaceC6809 interfaceC68097 = interfaceC68092;
                interfaceC3728 = it2;
                obj = objMo38;
                interfaceC68093 = interfaceC68097;
                if (((Boolean) obj).booleanValue()) {
                    return C8107.f3222;
                }
                Object next2 = interfaceC3728.next();
                this.f6729 = interfaceC68093;
                this.f6726 = interfaceC3728;
                this.f6728 = 5;
                if (interfaceC68093.mo5844(next2, this) == objM17142) {
                    return objM17142;
                }
                it2 = interfaceC3728;
                interfaceC68092 = interfaceC68093;
                this.f6729 = interfaceC68092;
                this.f6726 = it2;
                this.f6728 = 4;
                objMo38 = it2.mo38(this);
                if (objMo38 == objM17142) {
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<Object> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3744) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 0}, m1275l = {38}, m1276m = "elementAt", m1277n = {"$this$consume$iv", "index", "count"}, m1278s = {"L$0", "I$0", "I$1"})
    public static final class C3745<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6732;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f6733;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6734;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f6735;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f6736;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f6737;

        public C3745(InterfaceC4199<? super C3745> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6736 = obj;
            this.f6737 |= Integer.MIN_VALUE;
            return C3738.m10298(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 0}, m1275l = {53}, m1276m = "elementAtOrNull", m1277n = {"$this$consume$iv", "index", "count"}, m1278s = {"L$0", "I$0", "I$1"})
    public static final class C3746<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6738;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f6739;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6740;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f6741;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f6742;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f6743;

        public C3746(InterfaceC4199<? super C3746> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6742 = obj;
            this.f6743 |= Integer.MIN_VALUE;
            return C3738.m10299(null, 0, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", m1273f = "Deprecated.kt", m1274i = {0, 1, 1, 2}, m1275l = {198, 199, 199}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "$this$produce", "e", "$this$produce"}, m1278s = {"L$0", "L$0", "L$2", "L$0"})
    public static final class C3747<E> extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super E>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6744;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6745;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f6746;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6747;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<E> f6748;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<E, InterfaceC4199<? super Boolean>, Object> f6749;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۦۡۡ<? extends E> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super E, ? super Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3747(InterfaceC7042<? extends E> interfaceC7042, InterfaceC5138<? super E, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, InterfaceC4199<? super C3747> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6748 = interfaceC7042;
            this.f6749 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3747 c3747 = new C3747(this.f6748, this.f6749, interfaceC4199);
            c3747.f6747 = obj;
            return c3747;
        }

        /* JADX DEBUG: Duplicate block (B:27:0x0098) to fix multi-entry loop: BACK_EDGE: B:27:0x0098 -> B:13:0x0051 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0051 */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
        
            r6 = r7;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v13, types: [Yue.ۥۡۥۡۤ] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v0, types: [Yue.ۥۡۨۡ۠, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r8v0 */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC3728<E> it;
            ?? r6;
            ?? r7;
            Object obj2;
            ?? r62;
            Object objM17142 = C5508.m17142();
            int i = this.f6746;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC6809 interfaceC6809 = (InterfaceC6809) this.f6747;
                it = this.f6748.iterator();
                r6 = interfaceC6809;
            } else if (i == 1) {
                it = (InterfaceC3728) this.f6744;
                InterfaceC6809 interfaceC68092 = (InterfaceC6809) this.f6747;
                C7149.m22422(obj);
                r62 = interfaceC68092;
                if (((Boolean) obj).booleanValue()) {
                    return C8107.f3222;
                }
                E next = it.next();
                InterfaceC5138<E, InterfaceC4199<? super Boolean>, Object> interfaceC5138 = this.f6749;
                this.f6747 = r62;
                this.f6744 = it;
                this.f6745 = next;
                this.f6746 = 2;
                Object objInvoke = interfaceC5138.invoke(next, this);
                if (objInvoke == objM17142) {
                    return objM17142;
                }
                ?? r8 = r62;
                obj2 = next;
                obj = objInvoke;
                r7 = r8;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                Object obj3 = this.f6745;
                InterfaceC3728<E> interfaceC3728 = (InterfaceC3728) this.f6744;
                InterfaceC6809 interfaceC68093 = (InterfaceC6809) this.f6747;
                C7149.m22422(obj);
                obj2 = obj3;
                it = interfaceC3728;
                r7 = interfaceC68093;
                if (!((Boolean) obj).booleanValue()) {
                    this.f6747 = r7;
                    this.f6744 = it;
                    this.f6745 = null;
                    this.f6746 = 3;
                    if (r7.mo5844(obj2, this) == objM17142) {
                        return objM17142;
                    }
                    r6 = r7;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (InterfaceC3728) this.f6744;
                r6 = (InterfaceC6809) this.f6747;
                C7149.m22422(obj);
            }
            this.f6747 = r6;
            this.f6744 = it;
            this.f6745 = null;
            this.f6746 = 1;
            obj = it.mo38(this);
            r62 = r6;
            if (obj == objM17142) {
                return objM17142;
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<? super E> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3747) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1, 1, 2, 2}, m1275l = {Opcodes.DIV_INT_LIT16, Opcodes.REM_INT_LIT16, Opcodes.REM_INT_LIT16}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, m1278s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    public static final class C3748 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<Object>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6750;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6751;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f6752;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f6753;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f6754;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<Object> f6755;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<Integer, Object, InterfaceC4199<? super Boolean>, Object> f6756;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۤ<? super java.lang.Integer, java.lang.Object, ? super Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3748(InterfaceC7042<Object> interfaceC7042, InterfaceC5140<? super Integer, Object, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5140, InterfaceC4199<? super C3748> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6755 = interfaceC7042;
            this.f6756 = interfaceC5140;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3748 c3748 = new C3748(this.f6755, this.f6756, interfaceC4199);
            c3748.f6754 = obj;
            return c3748;
        }

        /* JADX DEBUG: Duplicate block (B:27:0x00ae) to fix multi-entry loop: BACK_EDGE: B:27:0x00ae -> B:13:0x005b */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        
            r7 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC6809 interfaceC6809;
            InterfaceC3728<Object> it;
            int i;
            InterfaceC6809 interfaceC68092;
            Object obj2;
            Object objM17142 = C5508.m17142();
            int i2 = this.f6753;
            if (i2 == 0) {
                C7149.m22422(obj);
                interfaceC6809 = (InterfaceC6809) this.f6754;
                it = this.f6755.iterator();
                i = 0;
            } else if (i2 == 1) {
                i = this.f6752;
                it = (InterfaceC3728) this.f6750;
                interfaceC6809 = (InterfaceC6809) this.f6754;
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                    return C8107.f3222;
                }
                Object next = it.next();
                InterfaceC5140<Integer, Object, InterfaceC4199<? super Boolean>, Object> interfaceC5140 = this.f6756;
                int i3 = i + 1;
                Integer numM9584 = C3590.m9584(i);
                this.f6754 = interfaceC6809;
                this.f6750 = it;
                this.f6751 = next;
                this.f6752 = i3;
                this.f6753 = 2;
                Object objMo15350 = interfaceC5140.mo15350(numM9584, next, this);
                if (objMo15350 == objM17142) {
                    return objM17142;
                }
                interfaceC68092 = interfaceC6809;
                obj2 = next;
                obj = objMo15350;
                i = i3;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i2 == 2) {
                i = this.f6752;
                Object obj3 = this.f6751;
                InterfaceC3728<Object> interfaceC3728 = (InterfaceC3728) this.f6750;
                interfaceC68092 = (InterfaceC6809) this.f6754;
                C7149.m22422(obj);
                obj2 = obj3;
                it = interfaceC3728;
                if (!((Boolean) obj).booleanValue()) {
                    this.f6754 = interfaceC68092;
                    this.f6750 = it;
                    this.f6751 = null;
                    this.f6752 = i;
                    this.f6753 = 3;
                    if (interfaceC68092.mo5844(obj2, this) == objM17142) {
                        return objM17142;
                    }
                    interfaceC6809 = interfaceC68092;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f6752;
                it = (InterfaceC3728) this.f6750;
                interfaceC6809 = (InterfaceC6809) this.f6754;
                C7149.m22422(obj);
            }
            this.f6754 = interfaceC6809;
            this.f6750 = it;
            this.f6751 = null;
            this.f6752 = i;
            this.f6753 = 1;
            obj = it.mo38(this);
            if (obj == objM17142) {
                return objM17142;
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<Object> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3748) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", m1273f = "Deprecated.kt", m1274i = {}, m1275l = {Opcodes.OR_INT_LIT8}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C3749 extends AbstractC7690 implements InterfaceC5138<Object, InterfaceC4199<? super Boolean>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6757;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6758;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<Object, InterfaceC4199<? super Boolean>, Object> f6759;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<java.lang.Object, ? super Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3749(InterfaceC5138<Object, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, InterfaceC4199<? super C3749> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6759 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3749 c3749 = new C3749(this.f6759, interfaceC4199);
            c3749.f6758 = obj;
            return c3749;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f6757;
            if (i == 0) {
                C7149.m22422(obj);
                Object obj2 = this.f6758;
                InterfaceC5138<Object, InterfaceC4199<? super Boolean>, Object> interfaceC5138 = this.f6759;
                this.f6757 = 1;
                obj = interfaceC5138.invoke(obj2, this);
                if (obj == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            return C3590.m636(!((Boolean) obj).booleanValue());
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, @InterfaceC6489 InterfaceC4199<? super Boolean> interfaceC4199) {
            return ((C3749) create(obj, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", m1273f = "Deprecated.kt", m1274i = {}, m1275l = {}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C3750<E> extends AbstractC7690 implements InterfaceC5138<E, InterfaceC4199<? super Boolean>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6760;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6761;

        public C3750(InterfaceC4199<? super C3750> interfaceC4199) {
            super(2, interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3750 c3750 = new C3750(interfaceC4199);
            c3750.f6761 = obj;
            return c3750;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            C5508.m17142();
            if (this.f6760 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7149.m22422(obj);
            return C3590.m636(this.f6761 != null);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6489 E e, @InterfaceC6489 InterfaceC4199<? super Boolean> interfaceC4199) {
            return ((C3750) create(e, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0}, m1275l = {487}, m1276m = "filterNotNullTo", m1277n = {"destination", "$this$consume$iv$iv"}, m1278s = {"L$0", "L$1"})
    public static final class C3751<E, C extends Collection<? super E>> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6762;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6763;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6764;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6765;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6766;

        public C3751(InterfaceC4199<? super C3751> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6765 = obj;
            this.f6766 |= Integer.MIN_VALUE;
            return C3738.m10308(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۠۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1}, m1275l = {487, 242}, m1276m = "filterNotNullTo", m1277n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, m1278s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C3752<E, C extends InterfaceC7317<? super E>> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6767;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6768;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6769;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6770;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6771;

        public C3752(InterfaceC4199<? super C3752> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6770 = obj;
            this.f6771 |= Integer.MIN_VALUE;
            return C3738.m10307(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۠۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0}, m1275l = {65}, m1276m = "first", m1277n = {"$this$consume$iv", "iterator"}, m1278s = {"L$0", "L$1"})
    public static final class C3753<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6772;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6773;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f6774;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f6775;

        public C3753(InterfaceC4199<? super C3753> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6774 = obj;
            this.f6775 |= Integer.MIN_VALUE;
            return C3738.m10309(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۠ۡ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0}, m1275l = {75}, m1276m = "firstOrNull", m1277n = {"$this$consume$iv", "iterator"}, m1278s = {"L$0", "L$1"})
    public static final class C3754<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6776;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6777;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f6778;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f6779;

        public C3754(InterfaceC4199<? super C3754> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6778 = obj;
            this.f6779 |= Integer.MIN_VALUE;
            return C3738.m10310(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۠ۢ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", m1273f = "Deprecated.kt", m1274i = {0, 1, 2}, m1275l = {321, 322, 322}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "$this$produce", "$this$produce"}, m1278s = {"L$0", "L$0", "L$0"})
    public static final class C3755 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<Object>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6780;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f6781;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f6782;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<Object> f6783;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<Object, InterfaceC4199<? super InterfaceC7042<Object>>, Object> f6784;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<java.lang.Object, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۡۦۡۡ<java.lang.Object>>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3755(InterfaceC7042<Object> interfaceC7042, InterfaceC5138<Object, ? super InterfaceC4199<? super InterfaceC7042<Object>>, ? extends Object> interfaceC5138, InterfaceC4199<? super C3755> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6783 = interfaceC7042;
            this.f6784 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3755 c3755 = new C3755(this.f6783, this.f6784, interfaceC4199);
            c3755.f6782 = obj;
            return c3755;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007f -> B:13:0x004b). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC3728<Object> it;
            InterfaceC6809 interfaceC6809;
            Object objM17142 = C5508.m17142();
            int i = this.f6781;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC6809 interfaceC68092 = (InterfaceC6809) this.f6782;
                it = this.f6783.iterator();
                interfaceC6809 = interfaceC68092;
            } else if (i == 1) {
                it = (InterfaceC3728) this.f6780;
                interfaceC6809 = (InterfaceC6809) this.f6782;
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                    return C8107.f3222;
                }
                Object next = it.next();
                InterfaceC5138<Object, InterfaceC4199<? super InterfaceC7042<Object>>, Object> interfaceC5138 = this.f6784;
                this.f6782 = interfaceC6809;
                this.f6780 = it;
                this.f6781 = 2;
                obj = interfaceC5138.invoke(next, this);
                if (obj == objM17142) {
                    return objM17142;
                }
                this.f6782 = interfaceC6809;
                this.f6780 = it;
                this.f6781 = 3;
                if (C3734.m10267((InterfaceC7042) obj, interfaceC6809, this) == objM17142) {
                }
            } else if (i == 2) {
                it = (InterfaceC3728) this.f6780;
                interfaceC6809 = (InterfaceC6809) this.f6782;
                C7149.m22422(obj);
                this.f6782 = interfaceC6809;
                this.f6780 = it;
                this.f6781 = 3;
                if (C3734.m10267((InterfaceC7042) obj, interfaceC6809, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (InterfaceC3728) this.f6780;
                interfaceC6809 = (InterfaceC6809) this.f6782;
                C7149.m22422(obj);
            }
            this.f6782 = interfaceC6809;
            this.f6780 = it;
            this.f6781 = 1;
            obj = it.mo38(this);
            if (obj == objM17142) {
                return objM17142;
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<Object> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3755) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 0}, m1275l = {487}, m1276m = "indexOf", m1277n = {"element", "index", "$this$consume$iv$iv"}, m1278s = {"L$0", "L$1", "L$2"})
    public static final class C3756<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6785;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6786;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6787;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f6788;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f6789;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f6790;

        public C3756(InterfaceC4199<? super C3756> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6789 = obj;
            this.f6790 |= Integer.MIN_VALUE;
            return C3738.m10313(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1, 1}, m1275l = {97, 100}, m1276m = "last", m1277n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, m1278s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class C3757<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6791;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6792;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6793;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6794;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6795;

        public C3757(InterfaceC4199<? super C3757> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6794 = obj;
            this.f6795 |= Integer.MIN_VALUE;
            return C3738.m10314(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 0, 0}, m1275l = {487}, m1276m = "lastIndexOf", m1277n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, m1278s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C3758<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6796;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6797;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6798;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f6799;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public Object f6800;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public /* synthetic */ Object f6801;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int f6802;

        public C3758(InterfaceC4199<? super C3758> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6801 = obj;
            this.f6802 |= Integer.MIN_VALUE;
            return C3738.m10315(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1, 1}, m1275l = {123, 126}, m1276m = "lastOrNull", m1277n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, m1278s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class C3759<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6803;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6804;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6805;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6806;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6807;

        public C3759(InterfaceC4199<? super C3759> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6806 = obj;
            this.f6807 |= Integer.MIN_VALUE;
            return C3738.m10316(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1, 2, 2}, m1275l = {487, 333, 333}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, m1278s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    public static final class C3760<R> extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super R>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6808;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6809;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6810;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f6811;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6812;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public /* synthetic */ Object f6813;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<E> f6814;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<E, InterfaceC4199<? super R>, Object> f6815;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۦۡۡ<? extends E> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super E, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3760(InterfaceC7042<? extends E> interfaceC7042, InterfaceC5138<? super E, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138, InterfaceC4199<? super C3760> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6814 = interfaceC7042;
            this.f6815 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3760 c3760 = new C3760(this.f6814, this.f6815, interfaceC4199);
            c3760.f6813 = obj;
            return c3760;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0022, B:24:0x0075, B:28:0x0089, B:30:0x0091, B:38:0x00c5, B:20:0x005f, B:23:0x006e), top: B:45:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0022, B:24:0x0075, B:28:0x0089, B:30:0x0091, B:38:0x00c5, B:20:0x005f, B:23:0x006e), top: B:45:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c0 -> B:24:0x0075). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC7042 interfaceC7042;
            InterfaceC6809 interfaceC6809;
            InterfaceC5138 interfaceC5138;
            InterfaceC3728 it;
            InterfaceC7042 interfaceC70422;
            InterfaceC6809 interfaceC68092;
            InterfaceC5138 interfaceC51382;
            InterfaceC3728 interfaceC3728;
            InterfaceC6809 interfaceC68093;
            InterfaceC6809 interfaceC68094;
            Object objM17142 = C5508.m17142();
            int i = this.f6812;
            try {
            } catch (Throwable th) {
                th = th;
            }
            if (i == 0) {
                C7149.m22422(obj);
                interfaceC6809 = (InterfaceC6809) this.f6813;
                interfaceC7042 = this.f6814;
                interfaceC5138 = this.f6815;
                it = interfaceC7042.iterator();
            } else {
                if (i == 1) {
                    it = (InterfaceC3728) this.f6810;
                    interfaceC7042 = (InterfaceC7042) this.f6809;
                    interfaceC5138 = (InterfaceC5138) this.f6808;
                    interfaceC68094 = (InterfaceC6809) this.f6813;
                    C7149.m22422(obj);
                    if (((Boolean) obj).booleanValue()) {
                        C8107 c8107 = C8107.f3222;
                        C3734.m810(interfaceC7042, null);
                        return c8107;
                    }
                    Object next = it.next();
                    this.f6813 = interfaceC68094;
                    this.f6808 = interfaceC5138;
                    this.f6809 = interfaceC7042;
                    this.f6810 = it;
                    this.f6811 = interfaceC68094;
                    this.f6812 = 2;
                    obj = interfaceC5138.invoke(next, this);
                    if (obj == objM17142) {
                        return objM17142;
                    }
                    interfaceC68092 = interfaceC68094;
                    interfaceC51382 = interfaceC5138;
                    interfaceC70422 = interfaceC7042;
                    interfaceC3728 = it;
                    interfaceC68093 = interfaceC68092;
                    this.f6813 = interfaceC68092;
                    this.f6808 = interfaceC51382;
                    this.f6809 = interfaceC70422;
                    this.f6810 = interfaceC3728;
                    this.f6811 = null;
                    this.f6812 = 3;
                    if (interfaceC68093.mo5844(obj, this) != objM17142) {
                    }
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C3734.m810(interfaceC7042, th);
                        throw th2;
                    }
                }
                if (i == 2) {
                    interfaceC68093 = (InterfaceC6809) this.f6811;
                    interfaceC3728 = (InterfaceC3728) this.f6810;
                    interfaceC70422 = (InterfaceC7042) this.f6809;
                    interfaceC51382 = (InterfaceC5138) this.f6808;
                    interfaceC68092 = (InterfaceC6809) this.f6813;
                    try {
                        C7149.m22422(obj);
                        this.f6813 = interfaceC68092;
                        this.f6808 = interfaceC51382;
                        this.f6809 = interfaceC70422;
                        this.f6810 = interfaceC3728;
                        this.f6811 = null;
                        this.f6812 = 3;
                        if (interfaceC68093.mo5844(obj, this) != objM17142) {
                            return objM17142;
                        }
                        it = interfaceC3728;
                        interfaceC7042 = interfaceC70422;
                        interfaceC5138 = interfaceC51382;
                        interfaceC6809 = interfaceC68092;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC7042 = interfaceC70422;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (InterfaceC3728) this.f6810;
                    interfaceC7042 = (InterfaceC7042) this.f6809;
                    interfaceC5138 = (InterfaceC5138) this.f6808;
                    InterfaceC6809 interfaceC68095 = (InterfaceC6809) this.f6813;
                    C7149.m22422(obj);
                    interfaceC6809 = interfaceC68095;
                }
            }
            this.f6813 = interfaceC6809;
            this.f6808 = interfaceC5138;
            this.f6809 = interfaceC7042;
            this.f6810 = it;
            this.f6812 = 1;
            Object objMo38 = it.mo38(this);
            if (objMo38 == objM17142) {
                return objM17142;
            }
            interfaceC68094 = interfaceC6809;
            obj = objMo38;
            if (((Boolean) obj).booleanValue()) {
            }
            throw th;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<? super R> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3760) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1, 2, 2}, m1275l = {344, 345, 345}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, m1278s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    public static final class C3761<R> extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super R>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6816;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6817;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f6818;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f6819;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f6820;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<E> f6821;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<Integer, E, InterfaceC4199<? super R>, Object> f6822;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۦۡۡ<? extends E> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۤ<? super java.lang.Integer, ? super E, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3761(InterfaceC7042<? extends E> interfaceC7042, InterfaceC5140<? super Integer, ? super E, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5140, InterfaceC4199<? super C3761> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6821 = interfaceC7042;
            this.f6822 = interfaceC5140;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3761 c3761 = new C3761(this.f6821, this.f6822, interfaceC4199);
            c3761.f6820 = obj;
            return c3761;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a6 -> B:13:0x0059). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to Yue.ￛﾥￛﾟￛﾤￛﾢￛﾣ$ￛﾥￛﾟￛﾟￛﾠￛﾨ<R> for r10v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // Yue.AbstractC3513
        @Yue.InterfaceC6489
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC6399 java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = Yue.C5508.m17142()
                int r1 = r10.f6819
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L48
                if (r1 == r4) goto L3a
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.f6818
                java.lang.Object r5 = r10.f6816
                Yue.ۥ۟ۤۡۧ r5 = (Yue.InterfaceC3728) r5
                java.lang.Object r6 = r10.f6820
                Yue.ۥۡۥۡۤ r6 = (Yue.InterfaceC6809) r6
                Yue.C7149.m22422(r11)
                r11 = r6
                goto L59
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                int r1 = r10.f6818
                java.lang.Object r5 = r10.f6817
                Yue.ۥۡۥۡۤ r5 = (Yue.InterfaceC6809) r5
                java.lang.Object r6 = r10.f6816
                Yue.ۥ۟ۤۡۧ r6 = (Yue.InterfaceC3728) r6
                java.lang.Object r7 = r10.f6820
                Yue.ۥۡۥۡۤ r7 = (Yue.InterfaceC6809) r7
                Yue.C7149.m22422(r11)
                goto L94
            L3a:
                int r1 = r10.f6818
                java.lang.Object r5 = r10.f6816
                Yue.ۥ۟ۤۡۧ r5 = (Yue.InterfaceC3728) r5
                java.lang.Object r6 = r10.f6820
                Yue.ۥۡۥۡۤ r6 = (Yue.InterfaceC6809) r6
                Yue.C7149.m22422(r11)
                goto L6b
            L48:
                Yue.C7149.m22422(r11)
                java.lang.Object r11 = r10.f6820
                Yue.ۥۡۥۡۤ r11 = (Yue.InterfaceC6809) r11
                Yue.ۥۡۦۡۡ<E> r1 = r10.f6821
                Yue.ۥ۟ۤۡۧ r1 = r1.iterator()
                r5 = 0
                r9 = r5
                r5 = r1
                r1 = r9
            L59:
                r10.f6820 = r11
                r10.f6816 = r5
                r10.f6818 = r1
                r10.f6819 = r4
                java.lang.Object r6 = r5.mo38(r10)
                if (r6 != r0) goto L68
                return r0
            L68:
                r9 = r6
                r6 = r11
                r11 = r9
            L6b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La9
                java.lang.Object r11 = r5.next()
                Yue.ۥۣ۠ۢۤ<java.lang.Integer, E, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r7 = r10.f6822
                int r8 = r1 + 1
                java.lang.Integer r1 = Yue.C3590.m9584(r1)
                r10.f6820 = r6
                r10.f6816 = r5
                r10.f6817 = r6
                r10.f6818 = r8
                r10.f6819 = r3
                java.lang.Object r11 = r7.mo15350(r1, r11, r10)
                if (r11 != r0) goto L90
                return r0
            L90:
                r7 = r6
                r1 = r8
                r6 = r5
                r5 = r7
            L94:
                r10.f6820 = r7
                r10.f6816 = r6
                r8 = 0
                r10.f6817 = r8
                r10.f6818 = r1
                r10.f6819 = r2
                java.lang.Object r11 = r5.mo5844(r11, r10)
                if (r11 != r0) goto La6
                return r0
            La6:
                r5 = r6
                r11 = r7
                goto L59
            La9:
                Yue.ۥۣۢ۠ۤ r11 = Yue.C8107.f3222
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C3738.C3761.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<? super R> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3761) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 0, 1, 1, 1, 1}, m1275l = {420, 422}, m1276m = "maxWith", m1277n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, m1278s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class C3762<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6823;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6824;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6825;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f6826;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f6827;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f6828;

        public C3762(InterfaceC4199<? super C3762> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6827 = obj;
            this.f6828 |= Integer.MIN_VALUE;
            return C3738.m10325(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 0, 1, 1, 1, 1}, m1275l = {434, 436}, m1276m = "minWith", m1277n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, m1278s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class C3763<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6829;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6830;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6831;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f6832;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f6833;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f6834;

        public C3763(InterfaceC4199<? super C3763> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6833 = obj;
            this.f6834 |= Integer.MIN_VALUE;
            return C3738.m10326(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0}, m1275l = {447}, m1276m = "none", m1277n = {"$this$consume$iv"}, m1278s = {"L$0"})
    public static final class C3764<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6835;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6836;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f6837;

        public C3764(InterfaceC4199<? super C3764> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6836 = obj;
            this.f6837 |= Integer.MIN_VALUE;
            return C3738.m10327(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", m1273f = "Deprecated.kt", m1274i = {}, m1275l = {}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C3765 extends AbstractC7690 implements InterfaceC5138<Object, InterfaceC4199<Object>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6838;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6839;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<Object> f6840;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3765(InterfaceC7042<Object> interfaceC7042, InterfaceC4199<? super C3765> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6840 = interfaceC7042;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3765 c3765 = new C3765(this.f6840, interfaceC4199);
            c3765.f6839 = obj;
            return c3765;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            C5508.m17142();
            if (this.f6838 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7149.m22422(obj);
            Object obj2 = this.f6839;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.f6840 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6489 Object obj, @InterfaceC6489 InterfaceC4199<Object> interfaceC4199) {
            return ((C3765) create(obj, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۡۢ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1}, m1275l = {136, 139}, m1276m = "single", m1277n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, m1278s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C3766<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6841;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6842;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f6843;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f6844;

        public C3766(InterfaceC4199<? super C3766> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6843 = obj;
            this.f6844 |= Integer.MIN_VALUE;
            return C3738.m10329(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1}, m1275l = {149, 152}, m1276m = "singleOrNull", m1277n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, m1278s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C3767<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6845;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6846;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f6847;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f6848;

        public C3767(InterfaceC4199<? super C3767> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6847 = obj;
            this.f6848 |= Integer.MIN_VALUE;
            return C3738.m10330(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۡۤ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1}, m1275l = {Opcodes.CONST_METHOD_HANDLE, 255}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "remaining", "$this$produce", "remaining"}, m1278s = {"L$0", "I$0", "L$0", "I$0"})
    public static final class C3768 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<Object>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6849;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f6850;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f6851;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6852;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ int f6853;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<Object> f6854;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3768(int i, InterfaceC7042<Object> interfaceC7042, InterfaceC4199<? super C3768> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6853 = i;
            this.f6854 = interfaceC7042;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3768 c3768 = new C3768(this.f6853, this.f6854, interfaceC4199);
            c3768.f6852 = obj;
            return c3768;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0078 -> B:7:0x001b). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC6809 interfaceC6809;
            int i;
            InterfaceC3728<Object> it;
            InterfaceC6809 interfaceC68092;
            Object objMo38;
            Object objM17142 = C5508.m17142();
            int i2 = this.f6851;
            if (i2 == 0) {
                C7149.m22422(obj);
                interfaceC6809 = (InterfaceC6809) this.f6852;
                i = this.f6853;
                if (i == 0) {
                    return C8107.f3222;
                }
                if (!(i >= 0)) {
                    throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
                }
                it = this.f6854.iterator();
                this.f6852 = interfaceC6809;
                this.f6849 = it;
                this.f6850 = i;
                this.f6851 = 1;
                objMo38 = it.mo38(this);
                if (objMo38 == objM17142) {
                }
            } else if (i2 == 1) {
                i = this.f6850;
                it = (InterfaceC3728) this.f6849;
                interfaceC68092 = (InterfaceC6809) this.f6852;
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f6850;
                it = (InterfaceC3728) this.f6849;
                interfaceC68092 = (InterfaceC6809) this.f6852;
                C7149.m22422(obj);
                interfaceC6809 = interfaceC68092;
                i--;
                if (i == 0) {
                    return C8107.f3222;
                }
                this.f6852 = interfaceC6809;
                this.f6849 = it;
                this.f6850 = i;
                this.f6851 = 1;
                objMo38 = it.mo38(this);
                if (objMo38 == objM17142) {
                    return objM17142;
                }
                interfaceC68092 = interfaceC6809;
                obj = objMo38;
                if (((Boolean) obj).booleanValue()) {
                    return C8107.f3222;
                }
                Object next = it.next();
                this.f6852 = interfaceC68092;
                this.f6849 = it;
                this.f6850 = i;
                this.f6851 = 2;
                if (interfaceC68092.mo5844(next, this) == objM17142) {
                    return objM17142;
                }
                interfaceC6809 = interfaceC68092;
                i--;
                if (i == 0) {
                }
                this.f6852 = interfaceC6809;
                this.f6849 = it;
                this.f6850 = i;
                this.f6851 = 1;
                objMo38 = it.mo38(this);
                if (objMo38 == objM17142) {
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<Object> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3768) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۡۥ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", m1273f = "Deprecated.kt", m1274i = {0, 1, 1, 2}, m1275l = {269, 270, 271}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "$this$produce", "e", "$this$produce"}, m1278s = {"L$0", "L$0", "L$2", "L$0"})
    public static final class C3769 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<Object>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6855;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6856;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f6857;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6858;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<Object> f6859;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<Object, InterfaceC4199<? super Boolean>, Object> f6860;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<java.lang.Object, ? super Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3769(InterfaceC7042<Object> interfaceC7042, InterfaceC5138<Object, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, InterfaceC4199<? super C3769> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6859 = interfaceC7042;
            this.f6860 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3769 c3769 = new C3769(this.f6859, this.f6860, interfaceC4199);
            c3769.f6858 = obj;
            return c3769;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0097 -> B:13:0x004d). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC3728<Object> it;
            InterfaceC6809 interfaceC6809;
            InterfaceC6809 interfaceC68092;
            InterfaceC3728<Object> interfaceC3728;
            Object obj2;
            Object objM17142 = C5508.m17142();
            int i = this.f6857;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC6809 interfaceC68093 = (InterfaceC6809) this.f6858;
                it = this.f6859.iterator();
                interfaceC6809 = interfaceC68093;
            } else if (i == 1) {
                it = (InterfaceC3728) this.f6855;
                interfaceC6809 = (InterfaceC6809) this.f6858;
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                    return C8107.f3222;
                }
                Object next = it.next();
                InterfaceC5138<Object, InterfaceC4199<? super Boolean>, Object> interfaceC5138 = this.f6860;
                this.f6858 = interfaceC6809;
                this.f6855 = it;
                this.f6856 = next;
                this.f6857 = 2;
                Object objInvoke = interfaceC5138.invoke(next, this);
                if (objInvoke == objM17142) {
                    return objM17142;
                }
                InterfaceC3728<Object> interfaceC37282 = it;
                obj2 = next;
                obj = objInvoke;
                interfaceC68092 = interfaceC6809;
                interfaceC3728 = interfaceC37282;
                if (((Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                obj2 = this.f6856;
                interfaceC3728 = (InterfaceC3728) this.f6855;
                interfaceC68092 = (InterfaceC6809) this.f6858;
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                    return C8107.f3222;
                }
                this.f6858 = interfaceC68092;
                this.f6855 = interfaceC3728;
                this.f6856 = null;
                this.f6857 = 3;
                if (interfaceC68092.mo5844(obj2, this) == objM17142) {
                    return objM17142;
                }
                it = interfaceC3728;
                interfaceC6809 = interfaceC68092;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (InterfaceC3728) this.f6855;
                interfaceC6809 = (InterfaceC6809) this.f6858;
                C7149.m22422(obj);
            }
            this.f6858 = interfaceC6809;
            this.f6855 = it;
            this.f6857 = 1;
            obj = it.mo38(this);
            if (obj == objM17142) {
                return objM17142;
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<Object> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3769) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۡۦ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1}, m1275l = {487, 278}, m1276m = "toChannel", m1277n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, m1278s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C3770<E, C extends InterfaceC7317<? super E>> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6861;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6862;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6863;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6864;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6865;

        public C3770(InterfaceC4199<? super C3770> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6864 = obj;
            this.f6865 |= Integer.MIN_VALUE;
            return C3734.m10267(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۡۧ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0}, m1275l = {487}, m1276m = "toCollection", m1277n = {"destination", "$this$consume$iv$iv"}, m1278s = {"L$0", "L$1"})
    public static final class C3771<E, C extends Collection<? super E>> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6866;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6867;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6868;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6869;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6870;

        public C3771(InterfaceC4199<? super C3771> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6869 = obj;
            this.f6870 |= Integer.MIN_VALUE;
            return C3734.m10268(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۡۨ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m1273f = "Deprecated.kt", m1274i = {0, 0}, m1275l = {487}, m1276m = "toMap", m1277n = {"destination", "$this$consume$iv$iv"}, m1278s = {"L$0", "L$1"})
    public static final class C3772<K, V, M extends Map<? super K, ? super V>> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6871;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6872;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6873;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6874;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6875;

        public C3772(InterfaceC4199<? super C3772> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6874 = obj;
            this.f6875 |= Integer.MIN_VALUE;
            return C3734.m10271(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۢ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", m1273f = "Deprecated.kt", m1274i = {0, 0, 1, 1}, m1275l = {370, 371}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "index", "$this$produce", "index"}, m1278s = {"L$0", "I$0", "L$0", "I$0"})
    public static final class C3773 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super C5428<Object>>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6876;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f6877;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f6878;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6879;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<Object> f6880;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3773(InterfaceC7042<Object> interfaceC7042, InterfaceC4199<? super C3773> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6880 = interfaceC7042;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3773 c3773 = new C3773(this.f6880, interfaceC4199);
            c3773.f6879 = obj;
            return c3773;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007b -> B:11:0x0044). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC6809 interfaceC6809;
            InterfaceC3728<Object> it;
            int i;
            InterfaceC6809 interfaceC68092;
            InterfaceC3728<Object> interfaceC3728;
            int i2;
            Object objM17142 = C5508.m17142();
            int i3 = this.f6878;
            if (i3 == 0) {
                C7149.m22422(obj);
                interfaceC6809 = (InterfaceC6809) this.f6879;
                it = this.f6880.iterator();
                i = 0;
            } else if (i3 == 1) {
                i2 = this.f6877;
                interfaceC3728 = (InterfaceC3728) this.f6876;
                interfaceC68092 = (InterfaceC6809) this.f6879;
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                    return C8107.f3222;
                }
                int i4 = i2 + 1;
                C5428 c5428 = new C5428(i2, interfaceC3728.next());
                this.f6879 = interfaceC68092;
                this.f6876 = interfaceC3728;
                this.f6877 = i4;
                this.f6878 = 2;
                if (interfaceC68092.mo5844(c5428, this) == objM17142) {
                    return objM17142;
                }
                it = interfaceC3728;
                interfaceC6809 = interfaceC68092;
                i = i4;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = this.f6877;
                InterfaceC3728<Object> interfaceC37282 = (InterfaceC3728) this.f6876;
                InterfaceC6809 interfaceC68093 = (InterfaceC6809) this.f6879;
                C7149.m22422(obj);
                interfaceC6809 = interfaceC68093;
                i = i5;
                it = interfaceC37282;
            }
            this.f6879 = interfaceC6809;
            this.f6876 = it;
            this.f6877 = i;
            this.f6878 = 1;
            Object objMo38 = it.mo38(this);
            if (objMo38 == objM17142) {
                return objM17142;
            }
            interfaceC68092 = interfaceC6809;
            obj = objMo38;
            int i6 = i;
            interfaceC3728 = it;
            i2 = i6;
            if (((Boolean) obj).booleanValue()) {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<? super C5428<Object>> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3773) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final class C3774 extends AbstractC5673 implements InterfaceC5138<Object, Object, C6599<Object, Object>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C3774 f6881 = new C3774();

        public C3774() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final C6599<Object, Object> invoke(Object obj, Object obj2) {
            return C8003.m4014(obj, obj2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ$ۥ۟۟ۢ۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", m1273f = "Deprecated.kt", m1274i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, m1275l = {487, 469, 471}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, m1278s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    public static final class C3775<V> extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super V>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6882;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6883;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6884;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f6885;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public Object f6886;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f6887;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public /* synthetic */ Object f6888;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<R> f6889;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7042<E> f6890;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<E, R, V> f6891;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۦۡۡ<? extends R> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۦۡۡ<? extends E> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۢ<? super E, ? super R, ? extends V> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3775(InterfaceC7042<? extends R> interfaceC7042, InterfaceC7042<? extends E> interfaceC70422, InterfaceC5138<? super E, ? super R, ? extends V> interfaceC5138, InterfaceC4199<? super C3775> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6889 = interfaceC7042;
            this.f6890 = interfaceC70422;
            this.f6891 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C3775 c3775 = new C3775(this.f6889, this.f6890, this.f6891, interfaceC4199);
            c3775.f6888 = obj;
            return c3775;
        }

        /* JADX DEBUG: Duplicate block (B:38:0x00ea) to fix multi-entry loop: BACK_EDGE: B:38:0x00ea -> B:24:0x0088 */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0088, code lost:
        
            r6 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:8:0x0026, B:24:0x0088, B:27:0x009d, B:29:0x00a5, B:39:0x00ef, B:20:0x006b, B:23:0x0080), top: B:50:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cd A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:33:0x00c5, B:35:0x00cd, B:15:0x004b), top: B:46:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ef A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:8:0x0026, B:24:0x0088, B:27:0x009d, B:29:0x00a5, B:39:0x00ef, B:20:0x006b, B:23:0x0080), top: B:50:0x000a }] */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC7042 interfaceC7042;
            InterfaceC5138 interfaceC5138;
            InterfaceC6809 interfaceC6809;
            InterfaceC3728 interfaceC3728;
            InterfaceC3728 it;
            InterfaceC7042 interfaceC70422;
            InterfaceC6809 interfaceC68092;
            InterfaceC3728 interfaceC37282;
            InterfaceC5138 interfaceC51382;
            Object obj2;
            Object objM17142 = C5508.m17142();
            int i = this.f6887;
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (i == 0) {
                    C7149.m22422(obj);
                    InterfaceC6809 interfaceC68093 = (InterfaceC6809) this.f6888;
                    InterfaceC3728 it2 = this.f6889.iterator();
                    interfaceC7042 = this.f6890;
                    interfaceC5138 = this.f6891;
                    interfaceC6809 = interfaceC68093;
                    interfaceC3728 = it2;
                    it = interfaceC7042.iterator();
                } else {
                    if (i == 1) {
                        it = (InterfaceC3728) this.f6885;
                        interfaceC7042 = (InterfaceC7042) this.f6884;
                        interfaceC5138 = (InterfaceC5138) this.f6883;
                        interfaceC3728 = (InterfaceC3728) this.f6882;
                        interfaceC6809 = (InterfaceC6809) this.f6888;
                        C7149.m22422(obj);
                        if (((Boolean) obj).booleanValue()) {
                            C8107 c8107 = C8107.f3222;
                            C3734.m810(interfaceC7042, null);
                            return c8107;
                        }
                        Object next = it.next();
                        this.f6888 = interfaceC6809;
                        this.f6882 = interfaceC3728;
                        this.f6883 = interfaceC5138;
                        this.f6884 = interfaceC7042;
                        this.f6885 = it;
                        this.f6886 = next;
                        this.f6887 = 2;
                        Object objMo38 = interfaceC3728.mo38(this);
                        if (objMo38 == objM17142) {
                            return objM17142;
                        }
                        InterfaceC7042 interfaceC70423 = interfaceC7042;
                        obj2 = next;
                        obj = objMo38;
                        interfaceC68092 = interfaceC6809;
                        interfaceC37282 = interfaceC3728;
                        interfaceC51382 = interfaceC5138;
                        interfaceC70422 = interfaceC70423;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        throw th;
                    }
                    if (i == 2) {
                        Object obj3 = this.f6886;
                        InterfaceC3728 interfaceC37283 = (InterfaceC3728) this.f6885;
                        interfaceC70422 = (InterfaceC7042) this.f6884;
                        interfaceC51382 = (InterfaceC5138) this.f6883;
                        interfaceC37282 = (InterfaceC3728) this.f6882;
                        interfaceC68092 = (InterfaceC6809) this.f6888;
                        try {
                            C7149.m22422(obj);
                            obj2 = obj3;
                            it = interfaceC37283;
                            if (!((Boolean) obj).booleanValue()) {
                                Object objInvoke = interfaceC51382.invoke(obj2, interfaceC37282.next());
                                this.f6888 = interfaceC68092;
                                this.f6882 = interfaceC37282;
                                this.f6883 = interfaceC51382;
                                this.f6884 = interfaceC70422;
                                this.f6885 = it;
                                this.f6886 = null;
                                this.f6887 = 3;
                                if (interfaceC68092.mo5844(objInvoke, this) == objM17142) {
                                    return objM17142;
                                }
                                interfaceC7042 = interfaceC70422;
                                interfaceC5138 = interfaceC51382;
                                interfaceC3728 = interfaceC37282;
                                interfaceC6809 = interfaceC68092;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC7042 = interfaceC70422;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (InterfaceC3728) this.f6885;
                        interfaceC7042 = (InterfaceC7042) this.f6884;
                        interfaceC5138 = (InterfaceC5138) this.f6883;
                        interfaceC3728 = (InterfaceC3728) this.f6882;
                        interfaceC6809 = (InterfaceC6809) this.f6888;
                        C7149.m22422(obj);
                    }
                }
                throw th;
            } catch (Throwable th3) {
                C3734.m810(interfaceC7042, th);
                throw th3;
            }
            this.f6888 = interfaceC6809;
            this.f6882 = interfaceC3728;
            this.f6883 = interfaceC5138;
            this.f6884 = interfaceC7042;
            this.f6885 = it;
            this.f6886 = null;
            this.f6887 = 1;
            obj = it.mo38(this);
            if (obj == objM17142) {
                return objM17142;
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<? super V> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C3775) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m815(InterfaceC7042 interfaceC7042, InterfaceC4199 interfaceC4199) {
        C0247 c0247;
        if (interfaceC4199 instanceof C0247) {
            c0247 = (C0247) interfaceC4199;
            int i = c0247.f6703;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0247.f6703 = i - Integer.MIN_VALUE;
            } else {
                c0247 = new C0247(interfaceC4199);
            }
        }
        Object objMo38 = c0247.f6702;
        Object objM17142 = C5508.m17142();
        int i2 = c0247.f6703;
        try {
            if (i2 == 0) {
                C7149.m22422(objMo38);
                InterfaceC3728 it = interfaceC7042.iterator();
                c0247.f6701 = interfaceC7042;
                c0247.f6703 = 1;
                objMo38 = it.mo38(c0247);
                if (objMo38 == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC7042 = (InterfaceC7042) c0247.f6701;
                C7149.m22422(objMo38);
            }
            C3734.m810(interfaceC7042, null);
            return objMo38;
        } finally {
        }
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟ */
    public static final InterfaceC5124<Throwable, C8107> m816(@InterfaceC6399 InterfaceC7042<?> interfaceC7042) {
        return new C0248(interfaceC7042);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final InterfaceC5124<Throwable, C8107> m10289(@InterfaceC6399 InterfaceC7042<?>... interfaceC7042Arr) {
        return new C3739(interfaceC7042Arr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x0060, B:27:0x0068, B:28:0x0072), top: B:41:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x0060, B:27:0x0068, B:28:0x0072), top: B:41:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:25:0x0060). Please report as a decompilation issue!!! */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10290(InterfaceC7042 interfaceC7042, InterfaceC4199 interfaceC4199) {
        C3740 c3740;
        InterfaceC7042 interfaceC70422;
        Throwable th;
        C7060.C7064 c7064;
        InterfaceC7042 interfaceC70423;
        InterfaceC3728 it;
        Object objMo38;
        if (interfaceC4199 instanceof C3740) {
            c3740 = (C3740) interfaceC4199;
            int i = c3740.f6710;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3740.f6710 = i - Integer.MIN_VALUE;
            } else {
                c3740 = new C3740(interfaceC4199);
            }
        }
        Object obj = c3740.f6709;
        Object objM17142 = C5508.m17142();
        int i2 = c3740.f6710;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                c7064 = new C7060.C7064();
                interfaceC70423 = interfaceC7042;
                it = interfaceC7042.iterator();
                c3740.f6706 = c7064;
                c3740.f6707 = interfaceC70423;
                c3740.f6708 = it;
                c3740.f6710 = 1;
                objMo38 = it.mo38(c3740);
                if (objMo38 != objM17142) {
                }
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (InterfaceC3728) c3740.f6708;
            interfaceC70422 = (InterfaceC7042) c3740.f6707;
            c7064 = (C7060.C7064) c3740.f6706;
            try {
                C7149.m22422(obj);
                if (!((Boolean) obj).booleanValue()) {
                    it.next();
                    c7064.f21351++;
                    interfaceC70423 = interfaceC70422;
                    try {
                        c3740.f6706 = c7064;
                        c3740.f6707 = interfaceC70423;
                        c3740.f6708 = it;
                        c3740.f6710 = 1;
                        objMo38 = it.mo38(c3740);
                        if (objMo38 != objM17142) {
                            return objM17142;
                        }
                        interfaceC70422 = interfaceC70423;
                        obj = objMo38;
                        if (!((Boolean) obj).booleanValue()) {
                            C8107 c8107 = C8107.f3222;
                            C3734.m810(interfaceC70422, null);
                            return C3590.m9584(c7064.f21351);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC70422 = interfaceC70423;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            C3734.m810(interfaceC70422, th);
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <E, K> InterfaceC7042<E> m10292(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5138<? super E, ? super InterfaceC4199<? super K>, ? extends Object> interfaceC5138) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3742(interfaceC7042, interfaceC5138, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10293(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return C3734.m10221(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣ۟ۤۢ.ۥۣ۟۟۟(Yue.ۥۡۦۡۡ, int, Yue.ۥ۟ۧۦۥ, int, java.lang.Object):Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC7042 m10294(InterfaceC7042 interfaceC7042, int i, InterfaceC4225 interfaceC4225) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3743(i, interfaceC7042, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10295(InterfaceC7042 interfaceC7042, int i, InterfaceC4225 interfaceC4225, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return m10294(interfaceC7042, i, interfaceC4225);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣ۟ۤۢ.ۥ۟۟۟ۥ(Yue.ۥۡۦۡۡ, Yue.ۥ۟ۧۦۥ, Yue.ۥۣ۠ۢۢ, int, java.lang.Object):Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC7042 m10296(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3744(interfaceC7042, interfaceC5138, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10297(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return m10296(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0064, B:27:0x006c, B:33:0x007d, B:34:0x0094), top: B:46:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0064, B:27:0x006c, B:33:0x007d, B:34:0x0094), top: B:46:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:25:0x0064). Please report as a decompilation issue!!! */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10298(InterfaceC7042 interfaceC7042, int i, InterfaceC4199 interfaceC4199) {
        C3745 c3745;
        InterfaceC7042 interfaceC70422;
        Throwable th;
        InterfaceC3728 it;
        int i2;
        Object objMo38;
        if (interfaceC4199 instanceof C3745) {
            c3745 = (C3745) interfaceC4199;
            int i3 = c3745.f6737;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3745.f6737 = i3 - Integer.MIN_VALUE;
            } else {
                c3745 = new C3745(interfaceC4199);
            }
        }
        Object obj = c3745.f6736;
        Object objM17142 = C5508.m17142();
        int i4 = c3745.f6737;
        try {
            if (i4 == 0) {
                C7149.m22422(obj);
                if (i < 0) {
                    throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                }
                it = interfaceC7042.iterator();
                i2 = 0;
                c3745.f6734 = interfaceC7042;
                c3745.f6735 = it;
                c3745.f6732 = i;
                c3745.f6733 = i2;
                c3745.f6737 = 1;
                objMo38 = it.mo38(c3745);
                if (objMo38 != objM17142) {
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = c3745.f6733;
                i = c3745.f6732;
                InterfaceC3728 interfaceC3728 = (InterfaceC3728) c3745.f6735;
                interfaceC70422 = (InterfaceC7042) c3745.f6734;
                try {
                    C7149.m22422(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = interfaceC3728.next();
                        int i6 = i5 + 1;
                        if (i == i5) {
                            C3734.m810(interfaceC70422, null);
                            return next;
                        }
                        it = interfaceC3728;
                        interfaceC7042 = interfaceC70422;
                        i2 = i6;
                        c3745.f6734 = interfaceC7042;
                        c3745.f6735 = it;
                        c3745.f6732 = i;
                        c3745.f6733 = i2;
                        c3745.f6737 = 1;
                        objMo38 = it.mo38(c3745);
                        if (objMo38 != objM17142) {
                            return objM17142;
                        }
                        interfaceC70422 = interfaceC7042;
                        i5 = i2;
                        interfaceC3728 = it;
                        obj = objMo38;
                        if (!((Boolean) obj).booleanValue()) {
                            throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        C3734.m810(interfaceC70422, th);
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            interfaceC70422 = interfaceC7042;
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:27:0x0068, B:29:0x0070, B:23:0x0053, B:22:0x004e), top: B:43:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0064 -> B:27:0x0068). Please report as a decompilation issue!!! */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10299(InterfaceC7042 interfaceC7042, int i, InterfaceC4199 interfaceC4199) {
        C3746 c3746;
        InterfaceC3728 it;
        int i2;
        Throwable th;
        InterfaceC7042 interfaceC70422;
        Object objMo38;
        if (interfaceC4199 instanceof C3746) {
            c3746 = (C3746) interfaceC4199;
            int i3 = c3746.f6743;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3746.f6743 = i3 - Integer.MIN_VALUE;
            } else {
                c3746 = new C3746(interfaceC4199);
            }
        }
        Object obj = c3746.f6742;
        Object objM17142 = C5508.m17142();
        int i4 = c3746.f6743;
        if (i4 == 0) {
            C7149.m22422(obj);
            if (i < 0) {
                C3734.m810(interfaceC7042, null);
                return null;
            }
            try {
                it = interfaceC7042.iterator();
                i2 = 0;
                c3746.f6740 = interfaceC7042;
                c3746.f6741 = it;
                c3746.f6738 = i;
                c3746.f6739 = i2;
                c3746.f6743 = 1;
                objMo38 = it.mo38(c3746);
                if (objMo38 != objM17142) {
                }
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = c3746.f6739;
            i = c3746.f6738;
            InterfaceC3728 interfaceC3728 = (InterfaceC3728) c3746.f6741;
            interfaceC70422 = (InterfaceC7042) c3746.f6740;
            try {
                C7149.m22422(obj);
                i2 = i5;
                interfaceC7042 = interfaceC70422;
                C3746 c37462 = c3746;
                InterfaceC3728 interfaceC37282 = interfaceC3728;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = interfaceC37282.next();
                    int i6 = i2 + 1;
                    if (i == i2) {
                        C3734.m810(interfaceC7042, null);
                        return next;
                    }
                    it = interfaceC37282;
                    c3746 = c37462;
                    i2 = i6;
                    c3746.f6740 = interfaceC7042;
                    c3746.f6741 = it;
                    c3746.f6738 = i;
                    c3746.f6739 = i2;
                    c3746.f6743 = 1;
                    objMo38 = it.mo38(c3746);
                    if (objMo38 != objM17142) {
                        return objM17142;
                    }
                    C3746 c37463 = c3746;
                    interfaceC37282 = it;
                    obj = objMo38;
                    c37462 = c37463;
                    if (!((Boolean) obj).booleanValue()) {
                        C3734.m810(interfaceC7042, null);
                        return null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C3734.m810(interfaceC70422, th);
                    throw th4;
                }
            }
        }
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <E> InterfaceC7042<E> m10300(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5138<? super E, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3747(interfaceC7042, interfaceC5138, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10301(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return C3734.m10229(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣ۟ۤۢ.ۥ۟۟۠۠(Yue.ۥۡۦۡۡ, Yue.ۥ۟ۧۦۥ, Yue.ۥۣ۠ۢۤ, int, java.lang.Object):Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC7042 m10302(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5140 interfaceC5140) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3748(interfaceC7042, interfaceC5140, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10303(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5140 interfaceC5140, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return m10302(interfaceC7042, interfaceC4225, interfaceC5140);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣ۟ۤۢ.ۥ۟۟۠ۢ(Yue.ۥۡۦۡۡ, Yue.ۥ۟ۧۦۥ, Yue.ۥۣ۠ۢۢ, int, java.lang.Object):Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC7042 m10304(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138) {
        return C3734.m10229(interfaceC7042, interfaceC4225, new C3749(interfaceC5138, null));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10305(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return m10304(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <E> InterfaceC7042<E> m10306(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042) {
        return m10301(interfaceC7042, null, new C3750(null), 1, null);
    }

    /* JADX DEBUG: Duplicate block (B:38:0x0097) to fix multi-entry loop: BACK_EDGE: B:38:0x0097 -> B:25:0x0062 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x003b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0062 */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0062, code lost:
    
        r8 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:25:0x0062, B:29:0x0075, B:31:0x007d, B:33:0x0083, B:39:0x009a, B:24:0x005e), top: B:48:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #1 {all -> 0x0092, blocks: (B:25:0x0062, B:29:0x0075, B:31:0x007d, B:33:0x0083, B:39:0x009a, B:24:0x005e), top: B:48:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [Yue.ۥۡۨۡ۠] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [Yue.ۥۡۨۡ۠, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10307(InterfaceC7042 interfaceC7042, InterfaceC7317 interfaceC7317, InterfaceC4199 interfaceC4199) {
        C3752 c3752;
        C3752 c37522;
        InterfaceC3728 interfaceC3728;
        InterfaceC3728 it;
        if (interfaceC4199 instanceof C3752) {
            c3752 = (C3752) interfaceC4199;
            int i = c3752.f6771;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3752.f6771 = i - Integer.MIN_VALUE;
            } else {
                c3752 = new C3752(interfaceC4199);
            }
        }
        Object obj = c3752.f6770;
        Object objM17142 = C5508.m17142();
        int i2 = c3752.f6771;
        if (i2 != 0) {
            try {
                if (i2 == 1) {
                    InterfaceC3728 interfaceC37282 = (InterfaceC3728) c3752.f6769;
                    InterfaceC7042 interfaceC70422 = (InterfaceC7042) c3752.f6768;
                    InterfaceC7317 interfaceC73172 = (InterfaceC7317) c3752.f6767;
                    C7149.m22422(obj);
                    c37522 = c3752;
                    interfaceC3728 = interfaceC37282;
                    interfaceC7042 = interfaceC70422;
                    interfaceC7317 = interfaceC73172;
                    C3752 c37523 = c37522;
                    if (!((Boolean) obj).booleanValue()) {
                        C8107 c8107 = C8107.f3222;
                        C3734.m810(interfaceC7042, null);
                        return interfaceC7317;
                    }
                    Object next = interfaceC3728.next();
                    if (next != null) {
                        c37523.f6767 = interfaceC7317;
                        c37523.f6768 = interfaceC7042;
                        c37523.f6769 = interfaceC3728;
                        c37523.f6771 = 2;
                        if (interfaceC7317.mo5844(next, c37523) == objM17142) {
                            return objM17142;
                        }
                        it = interfaceC3728;
                        c3752 = c37523;
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC3728 interfaceC37283 = (InterfaceC3728) c3752.f6769;
                    InterfaceC7042 interfaceC70423 = (InterfaceC7042) c3752.f6768;
                    InterfaceC7317 interfaceC73173 = (InterfaceC7317) c3752.f6767;
                    C7149.m22422(obj);
                    it = interfaceC37283;
                    interfaceC7042 = interfaceC70423;
                    interfaceC7317 = interfaceC73173;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    C3734.m810(interfaceC7317, th);
                    throw th2;
                }
            }
        } else {
            C7149.m22422(obj);
            try {
                it = interfaceC7042.iterator();
            } catch (Throwable th3) {
                interfaceC7317 = interfaceC7042;
                th = th3;
                throw th;
            }
        }
        c3752.f6767 = interfaceC7317;
        c3752.f6768 = interfaceC7042;
        c3752.f6769 = it;
        c3752.f6771 = 1;
        Object objMo38 = it.mo38(c3752);
        if (objMo38 == objM17142) {
            return objM17142;
        }
        c37522 = c3752;
        interfaceC3728 = it;
        obj = objMo38;
        interfaceC7317 = interfaceC7317;
        C3752 c375232 = c37522;
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:29:0x006a, B:21:0x004a, B:31:0x006f), top: B:40:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:29:0x006a, B:21:0x004a, B:31:0x006f), top: B:40:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10308(InterfaceC7042 interfaceC7042, Collection collection, InterfaceC4199 interfaceC4199) {
        C3751 c3751;
        InterfaceC7042 interfaceC70422;
        Throwable th;
        InterfaceC3728 it;
        Collection collection2;
        Object objMo38;
        if (interfaceC4199 instanceof C3751) {
            c3751 = (C3751) interfaceC4199;
            int i = c3751.f6766;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3751.f6766 = i - Integer.MIN_VALUE;
            } else {
                c3751 = new C3751(interfaceC4199);
            }
        }
        Object obj = c3751.f6765;
        Object objM17142 = C5508.m17142();
        int i2 = c3751.f6766;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                interfaceC70422 = interfaceC7042;
                it = interfaceC7042.iterator();
                collection2 = collection;
                c3751.f6762 = collection2;
                c3751.f6763 = interfaceC70422;
                c3751.f6764 = it;
                c3751.f6766 = 1;
                objMo38 = it.mo38(c3751);
                if (objMo38 != objM17142) {
                }
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (InterfaceC3728) c3751.f6764;
            interfaceC70422 = (InterfaceC7042) c3751.f6763;
            Collection collection3 = (Collection) c3751.f6762;
            try {
                C7149.m22422(obj);
                if (!((Boolean) obj).booleanValue()) {
                    C8107 c8107 = C8107.f3222;
                    C3734.m810(interfaceC70422, null);
                    return collection3;
                }
                Object next = it.next();
                if (next != null) {
                    collection3.add(next);
                }
                collection2 = collection3;
                c3751.f6762 = collection2;
                c3751.f6763 = interfaceC70422;
                c3751.f6764 = it;
                c3751.f6766 = 1;
                objMo38 = it.mo38(c3751);
                if (objMo38 != objM17142) {
                    return objM17142;
                }
                collection3 = collection2;
                obj = objMo38;
                if (!((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C3734.m810(interfaceC70422, th);
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x0053, B:25:0x005b, B:28:0x0064, B:29:0x006b), top: B:38:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x0053, B:25:0x005b, B:28:0x0064, B:29:0x006b), top: B:38:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10309(InterfaceC7042 interfaceC7042, InterfaceC4199 interfaceC4199) {
        C3753 c3753;
        InterfaceC7042 interfaceC70422;
        Throwable th;
        InterfaceC3728 interfaceC3728;
        if (interfaceC4199 instanceof C3753) {
            c3753 = (C3753) interfaceC4199;
            int i = c3753.f6775;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3753.f6775 = i - Integer.MIN_VALUE;
            } else {
                c3753 = new C3753(interfaceC4199);
            }
        }
        Object obj = c3753.f6774;
        Object objM17142 = C5508.m17142();
        int i2 = c3753.f6775;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3728 = (InterfaceC3728) c3753.f6773;
            interfaceC70422 = (InterfaceC7042) c3753.f6772;
            try {
                C7149.m22422(obj);
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = interfaceC3728.next();
                C3734.m810(interfaceC70422, null);
                return next;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    C3734.m810(interfaceC70422, th);
                    throw th3;
                }
            }
        }
        C7149.m22422(obj);
        try {
            InterfaceC3728 it = interfaceC7042.iterator();
            c3753.f6772 = interfaceC7042;
            c3753.f6773 = it;
            c3753.f6775 = 1;
            Object objMo38 = it.mo38(c3753);
            if (objMo38 == objM17142) {
                return objM17142;
            }
            interfaceC70422 = interfaceC7042;
            interfaceC3728 = it;
            obj = objMo38;
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th4) {
            interfaceC70422 = interfaceC7042;
            th = th4;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10310(InterfaceC7042 interfaceC7042, InterfaceC4199 interfaceC4199) {
        C3754 c3754;
        InterfaceC7042 interfaceC70422;
        Throwable th;
        InterfaceC3728 interfaceC3728;
        if (interfaceC4199 instanceof C3754) {
            c3754 = (C3754) interfaceC4199;
            int i = c3754.f6779;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3754.f6779 = i - Integer.MIN_VALUE;
            } else {
                c3754 = new C3754(interfaceC4199);
            }
        }
        Object obj = c3754.f6778;
        Object objM17142 = C5508.m17142();
        int i2 = c3754.f6779;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                InterfaceC3728 it = interfaceC7042.iterator();
                c3754.f6776 = interfaceC7042;
                c3754.f6777 = it;
                c3754.f6779 = 1;
                Object objMo38 = it.mo38(c3754);
                if (objMo38 == objM17142) {
                    return objM17142;
                }
                interfaceC70422 = interfaceC7042;
                interfaceC3728 = it;
                obj = objMo38;
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3728 = (InterfaceC3728) c3754.f6777;
            interfaceC70422 = (InterfaceC7042) c3754.f6776;
            try {
                C7149.m22422(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C3734.m810(interfaceC70422, th);
                    throw th4;
                }
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C3734.m810(interfaceC70422, null);
            return null;
        }
        Object next = interfaceC3728.next();
        C3734.m810(interfaceC70422, null);
        return next;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣ۟ۤۢ.ۥ۟۟ۡ(Yue.ۥۡۦۡۡ, Yue.ۥ۟ۧۦۥ, Yue.ۥۣ۠ۢۢ, int, java.lang.Object):Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC7042 m10311(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3755(interfaceC7042, interfaceC5138, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10312(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return m10311(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x0067, B:27:0x0070, B:29:0x007a, B:32:0x0084, B:21:0x0053, B:33:0x008b), top: B:44:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x0067, B:27:0x0070, B:29:0x007a, B:32:0x0084, B:21:0x0053, B:33:0x008b), top: B:44:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please report as a decompilation issue!!! */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10313(InterfaceC7042 interfaceC7042, Object obj, InterfaceC4199 interfaceC4199) {
        C3756 c3756;
        InterfaceC7042 interfaceC70422;
        Throwable th;
        InterfaceC3728 it;
        C7060.C7064 c7064;
        Object obj2;
        Object objMo38;
        if (interfaceC4199 instanceof C3756) {
            c3756 = (C3756) interfaceC4199;
            int i = c3756.f6790;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3756.f6790 = i - Integer.MIN_VALUE;
            } else {
                c3756 = new C3756(interfaceC4199);
            }
        }
        Object obj3 = c3756.f6789;
        Object objM17142 = C5508.m17142();
        int i2 = c3756.f6790;
        if (i2 == 0) {
            C7149.m22422(obj3);
            C7060.C7064 c70642 = new C7060.C7064();
            try {
                interfaceC70422 = interfaceC7042;
                it = interfaceC7042.iterator();
                c7064 = c70642;
                obj2 = obj;
                c3756.f6785 = obj2;
                c3756.f6786 = c7064;
                c3756.f6787 = interfaceC70422;
                c3756.f6788 = it;
                c3756.f6790 = 1;
                objMo38 = it.mo38(c3756);
                if (objMo38 != objM17142) {
                }
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (InterfaceC3728) c3756.f6788;
            interfaceC70422 = (InterfaceC7042) c3756.f6787;
            c7064 = (C7060.C7064) c3756.f6786;
            Object obj4 = c3756.f6785;
            try {
                C7149.m22422(obj3);
                if (!((Boolean) obj3).booleanValue()) {
                    C8107 c8107 = C8107.f3222;
                    C3734.m810(interfaceC70422, null);
                    return C3590.m9584(-1);
                }
                if (C5499.m17094(obj4, it.next())) {
                    Integer numM9584 = C3590.m9584(c7064.f21351);
                    C3734.m810(interfaceC70422, null);
                    return numM9584;
                }
                c7064.f21351++;
                obj2 = obj4;
                c3756.f6785 = obj2;
                c3756.f6786 = c7064;
                c3756.f6787 = interfaceC70422;
                c3756.f6788 = it;
                c3756.f6790 = 1;
                objMo38 = it.mo38(c3756);
                if (objMo38 != objM17142) {
                    return objM17142;
                }
                obj4 = obj2;
                obj3 = objMo38;
                if (!((Boolean) obj3).booleanValue()) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        try {
            throw th;
        } catch (Throwable th4) {
            C3734.m810(interfaceC70422, th);
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:37:0x008b, B:39:0x0093), top: B:51:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0087 -> B:37:0x008b). Please report as a decompilation issue!!! */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10314(InterfaceC7042 interfaceC7042, InterfaceC4199 interfaceC4199) {
        C3757 c3757;
        InterfaceC7042 interfaceC70422;
        InterfaceC3728 interfaceC3728;
        Object next;
        InterfaceC3728 interfaceC37282;
        Object objMo38;
        if (interfaceC4199 instanceof C3757) {
            c3757 = (C3757) interfaceC4199;
            int i = c3757.f6795;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3757.f6795 = i - Integer.MIN_VALUE;
            } else {
                c3757 = new C3757(interfaceC4199);
            }
        }
        Object obj = c3757.f6794;
        Object objM17142 = C5508.m17142();
        int i2 = c3757.f6795;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                InterfaceC3728 it = interfaceC7042.iterator();
                c3757.f6791 = interfaceC7042;
                c3757.f6792 = it;
                c3757.f6795 = 1;
                Object objMo382 = it.mo38(c3757);
                if (objMo382 == objM17142) {
                    return objM17142;
                }
                interfaceC70422 = interfaceC7042;
                interfaceC3728 = it;
                obj = objMo382;
            } catch (Throwable th) {
                interfaceC70422 = interfaceC7042;
                th = th;
                throw th;
            }
        } else if (i2 == 1) {
            interfaceC3728 = (InterfaceC3728) c3757.f6792;
            interfaceC70422 = (InterfaceC7042) c3757.f6791;
            try {
                C7149.m22422(obj);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c3757.f6793;
            interfaceC37282 = (InterfaceC3728) c3757.f6792;
            InterfaceC7042 interfaceC70423 = (InterfaceC7042) c3757.f6791;
            try {
                C7149.m22422(obj);
                if (!((Boolean) obj).booleanValue()) {
                    next = interfaceC37282.next();
                    interfaceC7042 = interfaceC70423;
                    c3757.f6791 = interfaceC7042;
                    c3757.f6792 = interfaceC37282;
                    c3757.f6793 = next;
                    c3757.f6795 = 2;
                    objMo38 = interfaceC37282.mo38(c3757);
                    if (objMo38 != objM17142) {
                        return objM17142;
                    }
                    interfaceC70423 = interfaceC7042;
                    obj2 = next;
                    obj = objMo38;
                    if (!((Boolean) obj).booleanValue()) {
                        C3734.m810(interfaceC70423, null);
                        return obj2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC70422 = interfaceC70423;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C3734.m810(interfaceC70422, th);
                    throw th4;
                }
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            throw new NoSuchElementException("ReceiveChannel is empty.");
        }
        next = interfaceC3728.next();
        InterfaceC7042 interfaceC70424 = interfaceC70422;
        interfaceC37282 = interfaceC3728;
        interfaceC7042 = interfaceC70424;
        c3757.f6791 = interfaceC7042;
        c3757.f6792 = interfaceC37282;
        c3757.f6793 = next;
        c3757.f6795 = 2;
        objMo38 = interfaceC37282.mo38(c3757);
        if (objMo38 != objM17142) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:25:0x0075, B:27:0x007d, B:29:0x0087, B:30:0x008b, B:21:0x005f, B:31:0x0092), top: B:42:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:25:0x0075, B:27:0x007d, B:29:0x0087, B:30:0x008b, B:21:0x005f, B:31:0x0092), top: B:42:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:25:0x0075). Please report as a decompilation issue!!! */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10315(InterfaceC7042 interfaceC7042, Object obj, InterfaceC4199 interfaceC4199) {
        C3758 c3758;
        C7060.C7064 c7064;
        InterfaceC7042 interfaceC70422;
        Throwable th;
        InterfaceC3728 it;
        C7060.C7064 c70642;
        Object obj2;
        Object objMo38;
        if (interfaceC4199 instanceof C3758) {
            c3758 = (C3758) interfaceC4199;
            int i = c3758.f6802;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3758.f6802 = i - Integer.MIN_VALUE;
            } else {
                c3758 = new C3758(interfaceC4199);
            }
        }
        Object obj3 = c3758.f6801;
        Object objM17142 = C5508.m17142();
        int i2 = c3758.f6802;
        if (i2 == 0) {
            C7149.m22422(obj3);
            C7060.C7064 c70643 = new C7060.C7064();
            c70643.f21351 = -1;
            c7064 = new C7060.C7064();
            try {
                interfaceC70422 = interfaceC7042;
                it = interfaceC7042.iterator();
                c70642 = c70643;
                obj2 = obj;
                c3758.f6796 = obj2;
                c3758.f6797 = c70642;
                c3758.f6798 = c7064;
                c3758.f6799 = interfaceC70422;
                c3758.f6800 = it;
                c3758.f6802 = 1;
                objMo38 = it.mo38(c3758);
                if (objMo38 != objM17142) {
                }
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (InterfaceC3728) c3758.f6800;
            interfaceC70422 = (InterfaceC7042) c3758.f6799;
            c7064 = (C7060.C7064) c3758.f6798;
            c70642 = (C7060.C7064) c3758.f6797;
            Object obj4 = c3758.f6796;
            try {
                C7149.m22422(obj3);
                if (!((Boolean) obj3).booleanValue()) {
                    C8107 c8107 = C8107.f3222;
                    C3734.m810(interfaceC70422, null);
                    return C3590.m9584(c70642.f21351);
                }
                if (C5499.m17094(obj4, it.next())) {
                    c70642.f21351 = c7064.f21351;
                }
                c7064.f21351++;
                obj2 = obj4;
                c3758.f6796 = obj2;
                c3758.f6797 = c70642;
                c3758.f6798 = c7064;
                c3758.f6799 = interfaceC70422;
                c3758.f6800 = it;
                c3758.f6802 = 1;
                objMo38 = it.mo38(c3758);
                if (objMo38 != objM17142) {
                    return objM17142;
                }
                obj4 = obj2;
                obj3 = objMo38;
                if (!((Boolean) obj3).booleanValue()) {
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C3734.m810(interfaceC70422, th);
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:39:0x008f, B:41:0x0097), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008b -> B:39:0x008f). Please report as a decompilation issue!!! */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10316(InterfaceC7042 interfaceC7042, InterfaceC4199 interfaceC4199) {
        C3759 c3759;
        InterfaceC7042 interfaceC70422;
        InterfaceC3728 interfaceC3728;
        Object next;
        InterfaceC3728 interfaceC37282;
        Object objMo38;
        if (interfaceC4199 instanceof C3759) {
            c3759 = (C3759) interfaceC4199;
            int i = c3759.f6807;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3759.f6807 = i - Integer.MIN_VALUE;
            } else {
                c3759 = new C3759(interfaceC4199);
            }
        }
        Object obj = c3759.f6806;
        Object objM17142 = C5508.m17142();
        int i2 = c3759.f6807;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                InterfaceC3728 it = interfaceC7042.iterator();
                c3759.f6803 = interfaceC7042;
                c3759.f6804 = it;
                c3759.f6807 = 1;
                Object objMo382 = it.mo38(c3759);
                if (objMo382 == objM17142) {
                    return objM17142;
                }
                interfaceC70422 = interfaceC7042;
                interfaceC3728 = it;
                obj = objMo382;
            } catch (Throwable th) {
                interfaceC70422 = interfaceC7042;
                th = th;
                throw th;
            }
        } else if (i2 == 1) {
            interfaceC3728 = (InterfaceC3728) c3759.f6804;
            interfaceC70422 = (InterfaceC7042) c3759.f6803;
            try {
                C7149.m22422(obj);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c3759.f6805;
            interfaceC37282 = (InterfaceC3728) c3759.f6804;
            InterfaceC7042 interfaceC70423 = (InterfaceC7042) c3759.f6803;
            try {
                C7149.m22422(obj);
                if (!((Boolean) obj).booleanValue()) {
                    next = interfaceC37282.next();
                    interfaceC7042 = interfaceC70423;
                    c3759.f6803 = interfaceC7042;
                    c3759.f6804 = interfaceC37282;
                    c3759.f6805 = next;
                    c3759.f6807 = 2;
                    objMo38 = interfaceC37282.mo38(c3759);
                    if (objMo38 != objM17142) {
                        return objM17142;
                    }
                    interfaceC70423 = interfaceC7042;
                    obj2 = next;
                    obj = objMo38;
                    if (!((Boolean) obj).booleanValue()) {
                        C3734.m810(interfaceC70423, null);
                        return obj2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC70422 = interfaceC70423;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C3734.m810(interfaceC70422, th);
                    throw th4;
                }
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C3734.m810(interfaceC70422, null);
            return null;
        }
        next = interfaceC3728.next();
        InterfaceC7042 interfaceC70424 = interfaceC70422;
        interfaceC37282 = interfaceC3728;
        interfaceC7042 = interfaceC70424;
        c3759.f6803 = interfaceC7042;
        c3759.f6804 = interfaceC37282;
        c3759.f6805 = next;
        c3759.f6807 = 2;
        objMo38 = interfaceC37282.mo38(c3759);
        if (objMo38 != objM17142) {
        }
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final <E, R> InterfaceC7042<R> m10317(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5138<? super E, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3760(interfaceC7042, interfaceC5138, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10318(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return C3734.m10246(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final <E, R> InterfaceC7042<R> m10319(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5140<? super Integer, ? super E, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5140) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3761(interfaceC7042, interfaceC5140, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10320(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5140 interfaceC5140, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return C3734.m10248(interfaceC7042, interfaceC4225, interfaceC5140);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣ۟ۤۢ.ۥ۟۟ۡۨ(Yue.ۥۡۦۡۡ, Yue.ۥ۟ۧۦۥ, Yue.ۥۣ۠ۢۤ, int, java.lang.Object):Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC7042 m10321(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5140 interfaceC5140) {
        return C3734.m10235(C3734.m10248(interfaceC7042, interfaceC4225, interfaceC5140));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10322(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5140 interfaceC5140, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return m10321(interfaceC7042, interfaceC4225, interfaceC5140);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣ۟ۤۢ.ۥ۟۟ۢ۟(Yue.ۥۡۦۡۡ, Yue.ۥ۟ۧۦۥ, Yue.ۥۣ۠ۢۢ, int, java.lang.Object):Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC7042 m10323(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138) {
        return C3734.m10235(C3734.m10246(interfaceC7042, interfaceC4225, interfaceC5138));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10324(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return m10323(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:40:0x00a3, B:42:0x00ab, B:36:0x008e, B:26:0x0062), top: B:58:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009f -> B:15:0x003d). Please report as a decompilation issue!!! */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10325(InterfaceC7042 interfaceC7042, Comparator comparator, InterfaceC4199 interfaceC4199) {
        C3762 c3762;
        InterfaceC7042 interfaceC70422;
        InterfaceC3728 interfaceC3728;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        InterfaceC3728 interfaceC37282;
        Object objMo38;
        if (interfaceC4199 instanceof C3762) {
            c3762 = (C3762) interfaceC4199;
            int i = c3762.f6828;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3762.f6828 = i - Integer.MIN_VALUE;
            } else {
                c3762 = new C3762(interfaceC4199);
            }
        }
        Object obj = c3762.f6827;
        Object objM17142 = C5508.m17142();
        int i2 = c3762.f6828;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                InterfaceC3728 it = interfaceC7042.iterator();
                c3762.f6823 = comparator;
                c3762.f6824 = interfaceC7042;
                c3762.f6825 = it;
                c3762.f6828 = 1;
                Object objMo382 = it.mo38(c3762);
                if (objMo382 == objM17142) {
                    return objM17142;
                }
                interfaceC70422 = interfaceC7042;
                interfaceC3728 = it;
                obj = objMo382;
                comparator2 = comparator;
            } catch (Throwable th) {
                interfaceC70422 = interfaceC7042;
                th = th;
                throw th;
            }
        } else if (i2 == 1) {
            interfaceC3728 = (InterfaceC3728) c3762.f6825;
            interfaceC70422 = (InterfaceC7042) c3762.f6824;
            comparator2 = (Comparator) c3762.f6823;
            try {
                C7149.m22422(obj);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c3762.f6826;
            interfaceC37282 = (InterfaceC3728) c3762.f6825;
            InterfaceC7042 interfaceC70423 = (InterfaceC7042) c3762.f6824;
            comparator3 = (Comparator) c3762.f6823;
            try {
                C7149.m22422(obj);
                C3762 c37622 = c3762;
                Object obj3 = obj2;
                interfaceC7042 = interfaceC70423;
                C3762 c37623 = c37622;
                if (!((Boolean) obj).booleanValue()) {
                    next = interfaceC37282.next();
                    if (comparator3.compare(obj3, next) >= 0) {
                        next = obj3;
                    }
                    c3762 = c37623;
                    c3762.f6823 = comparator3;
                    c3762.f6824 = interfaceC7042;
                    c3762.f6825 = interfaceC37282;
                    c3762.f6826 = next;
                    c3762.f6828 = 2;
                    objMo38 = interfaceC37282.mo38(c3762);
                    if (objMo38 != objM17142) {
                        return objM17142;
                    }
                    c37622 = c3762;
                    obj3 = next;
                    obj = objMo38;
                    C3762 c376232 = c37622;
                    if (!((Boolean) obj).booleanValue()) {
                        C3734.m810(interfaceC7042, null);
                        return obj3;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC70422 = interfaceC70423;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C3734.m810(interfaceC70422, th);
                    throw th4;
                }
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C3734.m810(interfaceC70422, null);
            return null;
        }
        next = interfaceC3728.next();
        comparator3 = comparator2;
        InterfaceC7042 interfaceC70424 = interfaceC70422;
        interfaceC37282 = interfaceC3728;
        interfaceC7042 = interfaceC70424;
        c3762.f6823 = comparator3;
        c3762.f6824 = interfaceC7042;
        c3762.f6825 = interfaceC37282;
        c3762.f6826 = next;
        c3762.f6828 = 2;
        objMo38 = interfaceC37282.mo38(c3762);
        if (objMo38 != objM17142) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:40:0x00a3, B:42:0x00ab, B:36:0x008e, B:26:0x0062), top: B:58:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009f -> B:15:0x003d). Please report as a decompilation issue!!! */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10326(InterfaceC7042 interfaceC7042, Comparator comparator, InterfaceC4199 interfaceC4199) {
        C3763 c3763;
        InterfaceC7042 interfaceC70422;
        InterfaceC3728 interfaceC3728;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        InterfaceC3728 interfaceC37282;
        Object objMo38;
        if (interfaceC4199 instanceof C3763) {
            c3763 = (C3763) interfaceC4199;
            int i = c3763.f6834;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3763.f6834 = i - Integer.MIN_VALUE;
            } else {
                c3763 = new C3763(interfaceC4199);
            }
        }
        Object obj = c3763.f6833;
        Object objM17142 = C5508.m17142();
        int i2 = c3763.f6834;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                InterfaceC3728 it = interfaceC7042.iterator();
                c3763.f6829 = comparator;
                c3763.f6830 = interfaceC7042;
                c3763.f6831 = it;
                c3763.f6834 = 1;
                Object objMo382 = it.mo38(c3763);
                if (objMo382 == objM17142) {
                    return objM17142;
                }
                interfaceC70422 = interfaceC7042;
                interfaceC3728 = it;
                obj = objMo382;
                comparator2 = comparator;
            } catch (Throwable th) {
                interfaceC70422 = interfaceC7042;
                th = th;
                throw th;
            }
        } else if (i2 == 1) {
            interfaceC3728 = (InterfaceC3728) c3763.f6831;
            interfaceC70422 = (InterfaceC7042) c3763.f6830;
            comparator2 = (Comparator) c3763.f6829;
            try {
                C7149.m22422(obj);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c3763.f6832;
            interfaceC37282 = (InterfaceC3728) c3763.f6831;
            InterfaceC7042 interfaceC70423 = (InterfaceC7042) c3763.f6830;
            comparator3 = (Comparator) c3763.f6829;
            try {
                C7149.m22422(obj);
                C3763 c37632 = c3763;
                Object obj3 = obj2;
                interfaceC7042 = interfaceC70423;
                C3763 c37633 = c37632;
                if (!((Boolean) obj).booleanValue()) {
                    next = interfaceC37282.next();
                    if (comparator3.compare(obj3, next) <= 0) {
                        next = obj3;
                    }
                    c3763 = c37633;
                    c3763.f6829 = comparator3;
                    c3763.f6830 = interfaceC7042;
                    c3763.f6831 = interfaceC37282;
                    c3763.f6832 = next;
                    c3763.f6834 = 2;
                    objMo38 = interfaceC37282.mo38(c3763);
                    if (objMo38 != objM17142) {
                        return objM17142;
                    }
                    c37632 = c3763;
                    obj3 = next;
                    obj = objMo38;
                    C3763 c376332 = c37632;
                    if (!((Boolean) obj).booleanValue()) {
                        C3734.m810(interfaceC7042, null);
                        return obj3;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC70422 = interfaceC70423;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C3734.m810(interfaceC70422, th);
                    throw th4;
                }
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C3734.m810(interfaceC70422, null);
            return null;
        }
        next = interfaceC3728.next();
        comparator3 = comparator2;
        InterfaceC7042 interfaceC70424 = interfaceC70422;
        interfaceC37282 = interfaceC3728;
        interfaceC7042 = interfaceC70424;
        c3763.f6829 = comparator3;
        c3763.f6830 = interfaceC7042;
        c3763.f6831 = interfaceC37282;
        c3763.f6832 = next;
        c3763.f6834 = 2;
        objMo38 = interfaceC37282.mo38(c3763);
        if (objMo38 != objM17142) {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10327(InterfaceC7042 interfaceC7042, InterfaceC4199 interfaceC4199) {
        C3764 c3764;
        if (interfaceC4199 instanceof C3764) {
            c3764 = (C3764) interfaceC4199;
            int i = c3764.f6837;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3764.f6837 = i - Integer.MIN_VALUE;
            } else {
                c3764 = new C3764(interfaceC4199);
            }
        }
        Object objMo38 = c3764.f6836;
        Object objM17142 = C5508.m17142();
        int i2 = c3764.f6837;
        try {
            if (i2 == 0) {
                C7149.m22422(objMo38);
                InterfaceC3728 it = interfaceC7042.iterator();
                c3764.f6835 = interfaceC7042;
                c3764.f6837 = 1;
                objMo38 = it.mo38(c3764);
                if (objMo38 == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC7042 = (InterfaceC7042) c3764.f6835;
                C7149.m22422(objMo38);
            }
            Boolean boolM636 = C3590.m636(!((Boolean) objMo38).booleanValue());
            C3734.m810(interfaceC7042, null);
            return boolM636;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:20:0x0046, B:29:0x0064, B:31:0x006c, B:41:0x0096, B:42:0x009d), top: B:53:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:20:0x0046, B:29:0x0064, B:31:0x006c, B:41:0x0096, B:42:0x009d), top: B:53:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10329(InterfaceC7042 interfaceC7042, InterfaceC4199 interfaceC4199) {
        C3766 c3766;
        InterfaceC7042 interfaceC70422;
        Throwable th;
        InterfaceC3728 interfaceC3728;
        InterfaceC7042 interfaceC70423;
        Object obj;
        if (interfaceC4199 instanceof C3766) {
            c3766 = (C3766) interfaceC4199;
            int i = c3766.f6844;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3766.f6844 = i - Integer.MIN_VALUE;
            } else {
                c3766 = new C3766(interfaceC4199);
            }
        }
        Object obj2 = c3766.f6843;
        Object objM17142 = C5508.m17142();
        int i2 = c3766.f6844;
        if (i2 == 0) {
            C7149.m22422(obj2);
            try {
                InterfaceC3728 it = interfaceC7042.iterator();
                c3766.f6841 = interfaceC7042;
                c3766.f6842 = it;
                c3766.f6844 = 1;
                Object objMo38 = it.mo38(c3766);
                if (objMo38 == objM17142) {
                    return objM17142;
                }
                interfaceC70422 = interfaceC7042;
                interfaceC3728 = it;
                obj2 = objMo38;
                if (((Boolean) obj2).booleanValue()) {
                }
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else if (i2 == 1) {
            interfaceC3728 = (InterfaceC3728) c3766.f6842;
            interfaceC70422 = (InterfaceC7042) c3766.f6841;
            try {
                C7149.m22422(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = interfaceC3728.next();
                c3766.f6841 = interfaceC70422;
                c3766.f6842 = next;
                c3766.f6844 = 2;
                Object objMo382 = interfaceC3728.mo38(c3766);
                if (objMo382 == objM17142) {
                    return objM17142;
                }
                interfaceC70423 = interfaceC70422;
                obj2 = objMo382;
                obj = next;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c3766.f6842;
            interfaceC70423 = (InterfaceC7042) c3766.f6841;
            try {
                C7149.m22422(obj2);
            } catch (Throwable th4) {
                th = th4;
                interfaceC70422 = interfaceC70423;
                try {
                    throw th;
                } catch (Throwable th5) {
                    C3734.m810(interfaceC70422, th);
                    throw th5;
                }
            }
        }
        if (((Boolean) obj2).booleanValue()) {
            throw new IllegalArgumentException("ReceiveChannel has more than one element.");
        }
        C3734.m810(interfaceC70423, null);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m10330(InterfaceC7042 interfaceC7042, InterfaceC4199 interfaceC4199) {
        C3767 c3767;
        InterfaceC7042 interfaceC70422;
        Throwable th;
        InterfaceC3728 interfaceC3728;
        InterfaceC7042 interfaceC70423;
        Object obj;
        if (interfaceC4199 instanceof C3767) {
            c3767 = (C3767) interfaceC4199;
            int i = c3767.f6848;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3767.f6848 = i - Integer.MIN_VALUE;
            } else {
                c3767 = new C3767(interfaceC4199);
            }
        }
        Object obj2 = c3767.f6847;
        Object objM17142 = C5508.m17142();
        int i2 = c3767.f6848;
        if (i2 == 0) {
            C7149.m22422(obj2);
            try {
                InterfaceC3728 it = interfaceC7042.iterator();
                c3767.f6845 = interfaceC7042;
                c3767.f6846 = it;
                c3767.f6848 = 1;
                Object objMo38 = it.mo38(c3767);
                if (objMo38 == objM17142) {
                    return objM17142;
                }
                interfaceC70422 = interfaceC7042;
                interfaceC3728 = it;
                obj2 = objMo38;
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c3767.f6846;
                interfaceC70423 = (InterfaceC7042) c3767.f6845;
                try {
                    C7149.m22422(obj2);
                    if (((Boolean) obj2).booleanValue()) {
                        C3734.m810(interfaceC70423, null);
                        return obj;
                    }
                    C3734.m810(interfaceC70423, null);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC70422 = interfaceC70423;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        C3734.m810(interfaceC70422, th);
                        throw th4;
                    }
                }
            }
            interfaceC3728 = (InterfaceC3728) c3767.f6846;
            interfaceC70422 = (InterfaceC7042) c3767.f6845;
            try {
                C7149.m22422(obj2);
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
        if (!((Boolean) obj2).booleanValue()) {
            C3734.m810(interfaceC70422, null);
            return null;
        }
        Object next = interfaceC3728.next();
        c3767.f6845 = interfaceC70422;
        c3767.f6846 = next;
        c3767.f6848 = 2;
        Object objMo382 = interfaceC3728.mo38(c3767);
        if (objMo382 == objM17142) {
            return objM17142;
        }
        interfaceC70423 = interfaceC70422;
        obj2 = objMo382;
        obj = next;
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣ۟ۤۢ.ۥ۟۟ۢۧ(Yue.ۥۡۦۡۡ, int, Yue.ۥ۟ۧۦۥ, int, java.lang.Object):Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC7042 m10331(InterfaceC7042 interfaceC7042, int i, InterfaceC4225 interfaceC4225) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3768(i, interfaceC7042, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10332(InterfaceC7042 interfaceC7042, int i, InterfaceC4225 interfaceC4225, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return m10331(interfaceC7042, i, interfaceC4225);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣ۟ۤۢ.ۥۣ۟۟(Yue.ۥۡۦۡۡ, Yue.ۥ۟ۧۦۥ, Yue.ۥۣ۠ۢۢ, int, java.lang.Object):Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC7042 m10333(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3769(interfaceC7042, interfaceC5138, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10334(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return m10333(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x003b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x0022 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:13:0x0034, B:28:0x0070, B:30:0x0078, B:33:0x008b, B:20:0x0051), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:13:0x0034, B:28:0x0070, B:30:0x0078, B:33:0x008b, B:20:0x0051), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [Yue.ۥۡۨۡ۠, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends Yue.ۥۡۨۡ۠<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [Yue.ۥۡۦۡۡ] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [Yue.ۥۡۦۡۡ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0088 -> B:14:0x0037). Please report as a decompilation issue!!! */
    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends InterfaceC7317<? super E>> Object m10335(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC4199<? super C> interfaceC4199) {
        C3770 c3770;
        InterfaceC3728<? extends E> it;
        InterfaceC3728<? extends E> interfaceC3728;
        ?? r2;
        ?? r7;
        Object objMo38;
        if (interfaceC4199 instanceof C3770) {
            c3770 = (C3770) interfaceC4199;
            int i = c3770.f6865;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3770.f6865 = i - Integer.MIN_VALUE;
            } else {
                c3770 = new C3770(interfaceC4199);
            }
        }
        Object obj = c3770.f6864;
        Object objM17142 = C5508.m17142();
        int i2 = c3770.f6865;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                interfaceC3728 = (InterfaceC3728) c3770.f6863;
                boolean z = (C) ((InterfaceC7042) c3770.f6862);
                InterfaceC7317 interfaceC7317 = (InterfaceC7317) c3770.f6861;
                C7149.m22422(obj);
                r2 = interfaceC7317;
                c = z;
                if (((Boolean) obj).booleanValue()) {
                }
                throw th;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3728 = (InterfaceC3728) c3770.f6863;
            boolean z2 = (C) ((InterfaceC7042) c3770.f6862);
            InterfaceC7317 interfaceC73172 = (InterfaceC7317) c3770.f6861;
            C7149.m22422(obj);
            ?? r22 = interfaceC73172;
            ?? r72 = z2;
            it = interfaceC3728;
            interfaceC7042 = (InterfaceC7042<? extends E>) r72;
            r7 = (C) r22;
            c3770.f6861 = r7;
            c3770.f6862 = interfaceC7042;
            c3770.f6863 = it;
            c3770.f6865 = 1;
            objMo38 = it.mo38(c3770);
            if (objMo38 == objM17142) {
                return objM17142;
            }
            ?? r5 = r7;
            boolean z3 = (C) interfaceC7042;
            interfaceC3728 = it;
            obj = objMo38;
            r2 = r5;
            c = z3;
            if (((Boolean) obj).booleanValue()) {
                C8107 c8107 = C8107.f3222;
                C3734.m810((InterfaceC7042) c, null);
                return r2;
            }
            E next = interfaceC3728.next();
            c3770.f6861 = r2;
            c3770.f6862 = (Object) c;
            c3770.f6863 = interfaceC3728;
            c3770.f6865 = 2;
            Object objMo5844 = r2.mo5844(next, c3770);
            r22 = r2;
            r72 = c;
            if (objMo5844 == objM17142) {
                return objM17142;
            }
            it = interfaceC3728;
            interfaceC7042 = (InterfaceC7042<? extends E>) r72;
            r7 = (C) r22;
            c3770.f6861 = r7;
            c3770.f6862 = interfaceC7042;
            c3770.f6863 = it;
            c3770.f6865 = 1;
            objMo38 = it.mo38(c3770);
            if (objMo38 == objM17142) {
            }
            try {
                throw th;
            } catch (Throwable th2) {
                C3734.m810(c, th);
                throw th2;
            }
        }
        C7149.m22422(obj);
        try {
            it = interfaceC7042.iterator();
            r7 = c;
            c3770.f6861 = r7;
            c3770.f6862 = interfaceC7042;
            c3770.f6863 = it;
            c3770.f6865 = 1;
            objMo38 = it.mo38(c3770);
            if (objMo38 == objM17142) {
            }
        } catch (Throwable th3) {
            c = interfaceC7042;
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends Collection<? super E>> Object m10336(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC4199<? super C> interfaceC4199) {
        C3771 c3771;
        InterfaceC7042<? extends E> interfaceC70422;
        Throwable th;
        InterfaceC3728 it;
        ?? r7;
        Object objMo38;
        if (interfaceC4199 instanceof C3771) {
            c3771 = (C3771) interfaceC4199;
            int i = c3771.f6870;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3771.f6870 = i - Integer.MIN_VALUE;
            } else {
                c3771 = new C3771(interfaceC4199);
            }
        }
        Object obj = c3771.f6869;
        Object objM17142 = C5508.m17142();
        int i2 = c3771.f6870;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                interfaceC70422 = interfaceC7042;
                it = interfaceC7042.iterator();
                r7 = c;
                c3771.f6866 = r7;
                c3771.f6867 = interfaceC70422;
                c3771.f6868 = it;
                c3771.f6870 = 1;
                objMo38 = it.mo38(c3771);
                if (objMo38 != objM17142) {
                }
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (InterfaceC3728) c3771.f6868;
            interfaceC70422 = (InterfaceC7042) c3771.f6867;
            Collection collection = (Collection) c3771.f6866;
            try {
                C7149.m22422(obj);
                ?? r2 = collection;
                if (!((Boolean) obj).booleanValue()) {
                    r2.add(it.next());
                    r7 = r2;
                    c3771.f6866 = r7;
                    c3771.f6867 = interfaceC70422;
                    c3771.f6868 = it;
                    c3771.f6870 = 1;
                    objMo38 = it.mo38(c3771);
                    if (objMo38 != objM17142) {
                        return objM17142;
                    }
                    r2 = r7;
                    obj = objMo38;
                    if (!((Boolean) obj).booleanValue()) {
                        C8107 c8107 = C8107.f3222;
                        C3734.m810(interfaceC70422, null);
                        return r2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C3734.m810(interfaceC70422, th);
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x0077), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x0077), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <K, V, M extends Map<? super K, ? super V>> Object m10338(@InterfaceC6399 InterfaceC7042<? extends C6599<? extends K, ? extends V>> interfaceC7042, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC4199<? super M> interfaceC4199) {
        C3772 c3772;
        InterfaceC7042<? extends C6599<? extends K, ? extends V>> interfaceC70422;
        Throwable th;
        InterfaceC3728 it;
        ?? r8;
        Object objMo38;
        if (interfaceC4199 instanceof C3772) {
            c3772 = (C3772) interfaceC4199;
            int i = c3772.f6875;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3772.f6875 = i - Integer.MIN_VALUE;
            } else {
                c3772 = new C3772(interfaceC4199);
            }
        }
        Object obj = c3772.f6874;
        Object objM17142 = C5508.m17142();
        int i2 = c3772.f6875;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                interfaceC70422 = interfaceC7042;
                it = interfaceC7042.iterator();
                r8 = m;
                c3772.f6871 = r8;
                c3772.f6872 = interfaceC70422;
                c3772.f6873 = it;
                c3772.f6875 = 1;
                objMo38 = it.mo38(c3772);
                if (objMo38 != objM17142) {
                }
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (InterfaceC3728) c3772.f6873;
            interfaceC70422 = (InterfaceC7042) c3772.f6872;
            Map map = (Map) c3772.f6871;
            try {
                C7149.m22422(obj);
                ?? r2 = map;
                if (!((Boolean) obj).booleanValue()) {
                    C6599 c6599 = (C6599) it.next();
                    r2.put(c6599.m20938(), c6599.m20939());
                    r8 = r2;
                    c3772.f6871 = r8;
                    c3772.f6872 = interfaceC70422;
                    c3772.f6873 = it;
                    c3772.f6875 = 1;
                    objMo38 = it.mo38(c3772);
                    if (objMo38 != objM17142) {
                        return objM17142;
                    }
                    r2 = r8;
                    obj = objMo38;
                    if (!((Boolean) obj).booleanValue()) {
                        C8107 c8107 = C8107.f3222;
                        C3734.m810(interfaceC70422, null);
                        return r2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C3734.m810(interfaceC70422, th);
                    throw th4;
                }
            }
        }
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final <E> Object m10340(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4199<? super Set<E>> interfaceC4199) {
        return C3734.m10268(interfaceC7042, new LinkedHashSet(), interfaceC4199);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣ۟ۤۢ.ۥۣ۟۟ۧ(Yue.ۥۡۦۡۡ, Yue.ۥ۟ۧۦۥ, int, java.lang.Object):Yue.ۥۡۦۡۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Binary compatibility")
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC7042 m10342(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10217(interfaceC7042), new C3773(interfaceC7042, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10343(InterfaceC7042 interfaceC7042, InterfaceC4225 interfaceC4225, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return m10342(interfaceC7042, interfaceC4225);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final <E, R, V> InterfaceC7042<V> m10345(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC7042<? extends R> interfaceC70422, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5138<? super E, ? super R, ? extends V> interfaceC5138) {
        return C6806.m21527(C5178.f12230, interfaceC4225, 0, null, C3734.m10218(interfaceC7042, interfaceC70422), new C3775(interfaceC70422, interfaceC7042, interfaceC5138, null), 6, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m10346(InterfaceC7042 interfaceC7042, InterfaceC7042 interfaceC70422, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC4225 = C4423.m12874();
        }
        return C3734.m10279(interfaceC7042, interfaceC70422, interfaceC4225, interfaceC5138);
    }
}
