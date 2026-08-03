package Yue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"})
@InterfaceC5572(name = "-FileSystem")
public final class C2954 {

    /* JADX INFO: renamed from: Yue.ۥ۟۟۟ۢ$ۥ */
    @InterfaceC4313(m1272c = "okio.internal.-FileSystem", m1273f = "FileSystem.kt", m1274i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m1275l = {116, 135, 145}, m1276m = "collectRecursively", m1277n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, m1278s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    public static final class C0002 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f4240;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f4241;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f4242;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f4243;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public Object f4244;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f4245;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public boolean f4246;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public /* synthetic */ Object f4247;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public int f4248;

        public C0002(InterfaceC4199<? super C0002> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f4247 = obj;
            this.f4248 |= Integer.MIN_VALUE;
            return C2954.m14(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۟ۢ$ۥ۟ */
    @InterfaceC4313(m1272c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m1273f = "FileSystem.kt", m1274i = {}, m1275l = {75}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0003 extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super C6618>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f4249;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f4250;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC4819 f4251;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ C6618 f4252;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0003(AbstractC4819 abstractC4819, C6618 c6618, InterfaceC4199<? super C0003> interfaceC4199) {
            super(2, interfaceC4199);
            this.f4251 = abstractC4819;
            this.f4252 = c6618;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C0003 c0003 = new C0003(this.f4251, this.f4252, interfaceC4199);
            c0003.f4250 = obj;
            return c0003;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f4249;
            if (i == 0) {
                C7149.m22422(obj);
                AbstractC7328 abstractC7328 = (AbstractC7328) this.f4250;
                AbstractC4819 abstractC4819 = this.f4251;
                C3383 c3383 = new C3383();
                C6618 c6618 = this.f4252;
                this.f4249 = 1;
                if (C2954.m14(abstractC7328, abstractC4819, c3383, c6618, false, true, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super C6618> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0003) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۟ۢ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "okio.internal.-FileSystem$commonListRecursively$1", m1273f = "FileSystem.kt", m1274i = {0, 0}, m1275l = {96}, m1276m = "invokeSuspend", m1277n = {"$this$sequence", "stack"}, m1278s = {"L$0", "L$1"})
    public static final class C2955 extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super C6618>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f4253;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f4254;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f4255;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f4256;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ C6618 f4257;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC4819 f4258;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ boolean f4259;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2955(C6618 c6618, AbstractC4819 abstractC4819, boolean z, InterfaceC4199<? super C2955> interfaceC4199) {
            super(2, interfaceC4199);
            this.f4257 = c6618;
            this.f4258 = abstractC4819;
            this.f4259 = z;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C2955 c2955 = new C2955(this.f4257, this.f4258, this.f4259, interfaceC4199);
            c2955.f4256 = obj;
            return c2955;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            AbstractC7328 abstractC7328;
            C3383 c3383;
            Iterator<C6618> it;
            Object objM17142 = C5508.m17142();
            int i = this.f4255;
            if (i == 0) {
                C7149.m22422(obj);
                AbstractC7328 abstractC73282 = (AbstractC7328) this.f4256;
                C3383 c33832 = new C3383();
                c33832.addLast(this.f4257);
                abstractC7328 = abstractC73282;
                c3383 = c33832;
                it = this.f4258.mo14652(this.f4257).iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f4254;
                C3383 c33833 = (C3383) this.f4253;
                AbstractC7328 abstractC73283 = (AbstractC7328) this.f4256;
                C7149.m22422(obj);
                c3383 = c33833;
                abstractC7328 = abstractC73283;
            }
            while (it.hasNext()) {
                C6618 next = it.next();
                AbstractC4819 abstractC4819 = this.f4258;
                boolean z = this.f4259;
                this.f4256 = abstractC7328;
                this.f4253 = c3383;
                this.f4254 = it;
                this.f4255 = 1;
                if (C2954.m14(abstractC7328, abstractC4819, c3383, next, z, false, this) == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super C6618> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C2955) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x00df */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        if (r7 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        r6.addLast(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        r7 = r6;
        r10 = r11;
        r11 = r12;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0126, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0127, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [Yue.ۥۡۨۢ۠] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r15v0, types: [Yue.ۥۡۨۢ۠, Yue.ۥۡۨۢ۠<? super Yue.ۥۣۡۧۧ>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [Yue.ۥۡۨۢ۠] */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m14(@InterfaceC6399 AbstractC7328<? super C6618> abstractC7328, @InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 C3383<C6618> c3383, @InterfaceC6399 C6618 c6618, boolean z, boolean z2, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) throws Throwable {
        C0002 c0002;
        AbstractC4819 abstractC48192;
        C3383<C6618> c33832;
        boolean z3;
        ?? r12;
        boolean z4;
        AbstractC4819 abstractC48193;
        C6618 c66182 = c6618;
        boolean z5 = z2;
        if (interfaceC4199 instanceof C0002) {
            c0002 = (C0002) interfaceC4199;
            int i = c0002.f4248;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0002.f4248 = i - Integer.MIN_VALUE;
            } else {
                c0002 = new C0002(interfaceC4199);
            }
        }
        Object obj = c0002.f4247;
        Object objM17142 = C5508.m17142();
        int i2 = c0002.f4248;
        int i3 = 0;
        if (i2 == 0) {
            C7149.m22422(obj);
            if (z5) {
                abstractC48192 = abstractC4819;
                c33832 = c3383;
                z3 = z;
            } else {
                c0002.f4240 = abstractC7328;
                abstractC48192 = abstractC4819;
                c0002.f4241 = abstractC48192;
                c33832 = c3383;
                c0002.f4242 = c33832;
                c0002.f4243 = c66182;
                z3 = z;
                c0002.f4245 = z3;
                c0002.f4246 = z5;
                c0002.f4248 = 1;
                if (abstractC7328.mo3574(c66182, c0002) == objM17142) {
                    return objM17142;
                }
            }
            r12 = abstractC7328;
            z4 = z3;
            abstractC48193 = abstractC48192;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7149.m22422(obj);
                    return C8107.f3222;
                }
                boolean z6 = c0002.f4246;
                boolean z7 = c0002.f4245;
                Iterator<C6618> it = (Iterator) c0002.f4244;
                C6618 c66183 = (C6618) c0002.f4243;
                C3383<C6618> c33833 = (C3383) c0002.f4242;
                AbstractC4819 abstractC48194 = (AbstractC4819) c0002.f4241;
                AbstractC7328 abstractC73282 = (AbstractC7328) c0002.f4240;
                try {
                    C7149.m22422(obj);
                    ?? r11 = abstractC73282;
                    while (it.hasNext()) {
                        C6618 next = it.next();
                        c0002.f4240 = r11;
                        c0002.f4241 = abstractC48194;
                        c0002.f4242 = c33833;
                        c0002.f4243 = c66183;
                        c0002.f4244 = it;
                        c0002.f4245 = z7;
                        c0002.f4246 = z6;
                        c0002.f4248 = 2;
                        if (m14(r11, abstractC48194, c33833, next, z7, z6, c0002) == objM17142) {
                            return objM17142;
                        }
                    }
                    c33833.removeLast();
                    z5 = z6;
                    c66182 = c66183;
                    r12 = r11;
                    if (z5) {
                        return C8107.f3222;
                    }
                    c0002.f4240 = null;
                    c0002.f4241 = null;
                    c0002.f4242 = null;
                    c0002.f4243 = null;
                    c0002.f4244 = null;
                    c0002.f4248 = 3;
                    if (r12.mo3574(c66182, c0002) == objM17142) {
                        return objM17142;
                    }
                    return C8107.f3222;
                } catch (Throwable th) {
                    th = th;
                    c33833.removeLast();
                    throw th;
                }
            }
            boolean z8 = c0002.f4246;
            boolean z9 = c0002.f4245;
            C6618 c66184 = (C6618) c0002.f4243;
            c33832 = (C3383) c0002.f4242;
            abstractC48193 = (AbstractC4819) c0002.f4241;
            AbstractC7328 abstractC73283 = (AbstractC7328) c0002.f4240;
            C7149.m22422(obj);
            z5 = z8;
            z4 = z9;
            c66182 = c66184;
            r12 = abstractC73283;
        }
        List<C6618> listMo14653 = abstractC48193.mo14653(c66182);
        if (listMo14653 == null) {
            listMo14653 = C3880.m10735();
        }
        if (true ^ listMo14653.isEmpty()) {
            C6618 c66185 = c66182;
            while (true) {
                if (z4 && c33832.contains(c66185)) {
                    throw new IOException("symlink cycle at " + c66182);
                }
                C6618 c6618M5562 = m5562(abstractC48193, c66185);
                if (c6618M5562 == null) {
                    break;
                }
                i3++;
                c66185 = c6618M5562;
            }
        }
        if (z5) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:21:0x0040, B:27:0x0053, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:46:0x0014, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:21:0x0040, B:27:0x0053, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:46:0x0014, inners: #1, #5 }] */
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15(@InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        Long lValueOf;
        Throwable th;
        Long lValueOf2;
        C5499.m17103(abstractC4819, "<this>");
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        InterfaceC7506 interfaceC7506Mo14663 = abstractC4819.mo14663(c6618);
        Throwable th2 = null;
        try {
            InterfaceC3603 interfaceC3603M20830 = C6542.m20830(abstractC4819.m14661(c66182));
            try {
                lValueOf2 = Long.valueOf(interfaceC3603M20830.mo9610(interfaceC7506Mo14663));
            } catch (Throwable th3) {
                if (interfaceC3603M20830 != null) {
                    try {
                        interfaceC3603M20830.close();
                    } catch (Throwable th4) {
                        C4741.m1656(th3, th4);
                    }
                }
                th = th3;
                lValueOf2 = null;
            }
            if (interfaceC3603M20830 != null) {
                try {
                    interfaceC3603M20830.close();
                    th = null;
                } catch (Throwable th5) {
                    th = th5;
                }
                if (th == null) {
                    throw th;
                }
                C5499.m17100(lValueOf2);
                lValueOf = Long.valueOf(lValueOf2.longValue());
                if (interfaceC7506Mo14663 != null) {
                    try {
                        interfaceC7506Mo14663.close();
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                }
            } else {
                th = null;
                if (th == null) {
                }
            }
        } catch (Throwable th7) {
            if (interfaceC7506Mo14663 != null) {
                try {
                    interfaceC7506Mo14663.close();
                } catch (Throwable th8) {
                    C4741.m1656(th7, th8);
                }
            }
            th2 = th7;
            lValueOf = null;
        }
        if (th2 != null) {
            throw th2;
        }
        C5499.m17100(lValueOf);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m5557(@InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(abstractC4819, "<this>");
        C5499.m17103(c6618, "dir");
        C3383 c3383 = new C3383();
        for (C6618 c6618M21035 = c6618; c6618M21035 != null && !abstractC4819.m14651(c6618M21035); c6618M21035 = c6618M21035.m21035()) {
            c3383.addFirst(c6618M21035);
        }
        if (z && c3383.isEmpty()) {
            throw new IOException(c6618 + " already exists.");
        }
        Iterator<E> it = c3383.iterator();
        while (it.hasNext()) {
            abstractC4819.m14644((C6618) it.next());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m5558(@InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(abstractC4819, "<this>");
        C5499.m17103(c6618, "fileOrDirectory");
        Iterator it = C7330.m3577(new C0003(abstractC4819, c6618, null)).iterator();
        while (it.hasNext()) {
            abstractC4819.mo14648((C6618) it.next(), z && !it.hasNext());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m5559(@InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(abstractC4819, "<this>");
        C5499.m17103(c6618, "path");
        return abstractC4819.mo14657(c6618) != null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final InterfaceC7326<C6618> m5560(@InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(abstractC4819, "<this>");
        C5499.m17103(c6618, "dir");
        return C7330.m3577(new C2955(c6618, abstractC4819, z, null));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final C4811 m5561(@InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(abstractC4819, "<this>");
        C5499.m17103(c6618, "path");
        C4811 c4811Mo14657 = abstractC4819.mo14657(c6618);
        if (c4811Mo14657 != null) {
            return c4811Mo14657;
        }
        throw new FileNotFoundException("no such file: " + c6618);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C6618 m5562(@InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(abstractC4819, "<this>");
        C5499.m17103(c6618, "path");
        C6618 c6618M14596 = abstractC4819.m14656(c6618).m14596();
        if (c6618M14596 == null) {
            return null;
        }
        C6618 c6618M21035 = c6618.m21035();
        C5499.m17100(c6618M21035);
        return c6618M21035.m21039(c6618M14596);
    }
}
