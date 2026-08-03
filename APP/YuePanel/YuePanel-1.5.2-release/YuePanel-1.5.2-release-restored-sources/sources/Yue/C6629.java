package Yue;

import com.android.p001dx.p004io.Opcodes;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4771
public final class C6629 implements InterfaceC7326<Path> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Path f2197;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final EnumC6632[] f2198;

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۧ$ۥ */
    @InterfaceC4313(m1272c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", m1273f = "PathTreeWalk.kt", m1274i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, m1275l = {184, 190}, m1276m = "invokeSuspend", m1277n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, m1278s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @InterfaceC7507({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
    public static final class C1036 extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super Path>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f17002;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f17003;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f17004;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public Object f17005;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public Object f17006;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int f17007;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public /* synthetic */ Object f17008;

        public C1036(InterfaceC4199<? super C1036> interfaceC4199) {
            super(2, interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C1036 c1036 = C6629.this.new C1036(interfaceC4199);
            c1036.f17008 = obj;
            return c1036;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ed -> B:11:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ef -> B:11:0x007d). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) throws FileSystemLoopException {
            AbstractC7328 abstractC7328;
            C3383 c3383;
            C4405 c4405;
            C6624 c6624;
            Path pathM21063;
            C6629 c6629;
            LinkOption[] linkOptionArr;
            AbstractC7328 abstractC73282;
            C3383 c33832;
            C4405 c44052;
            C6624 c66242;
            C6629 c66292;
            Path path;
            Object objM17142 = C5508.m17142();
            int i = this.f17007;
            if (i == 0) {
                C7149.m22422(obj);
                AbstractC7328 abstractC73283 = (AbstractC7328) this.f17008;
                C3383 c33833 = new C3383();
                C4405 c44053 = new C4405(C6629.this.m21093());
                c33833.addLast(new C6624(C6629.this.f2197, C6630.m21101(C6629.this.f2197, C6629.this.m21095()), null));
                abstractC7328 = abstractC73283;
                c3383 = c33833;
                c4405 = c44053;
            } else if (i == 1) {
                path = (Path) this.f17006;
                c66292 = (C6629) this.f17005;
                c66242 = (C6624) this.f17004;
                c44052 = (C4405) this.f17003;
                c33832 = (C3383) this.f17002;
                abstractC73282 = (AbstractC7328) this.f17008;
                C7149.m22422(obj);
                c6624 = c66242;
                abstractC7328 = abstractC73282;
                C3383 c33834 = c33832;
                pathM21063 = path;
                c4405 = c44052;
                c6629 = c66292;
                c3383 = c33834;
                LinkOption[] linkOptionArrM21095 = c6629.m21095();
                linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM21095, linkOptionArrM21095.length);
                if (Files.isDirectory(pathM21063, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                    c3383.addAll(c4405.m12756(c6624));
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4405 = (C4405) this.f17003;
                c3383 = (C3383) this.f17002;
                abstractC7328 = (AbstractC7328) this.f17008;
                C7149.m22422(obj);
            }
            while (!c3383.isEmpty()) {
                c6624 = (C6624) c3383.removeFirst();
                c6629 = C6629.this;
                pathM21063 = c6624.m21063();
                LinkOption[] linkOptionArrM210952 = c6629.m21095();
                LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArrM210952, linkOptionArrM210952.length);
                if (Files.isDirectory(pathM21063, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                    if (C6630.m21100(c6624)) {
                        throw new FileSystemLoopException(pathM21063.toString());
                    }
                    if (c6629.m21094()) {
                        this.f17008 = abstractC7328;
                        this.f17002 = c3383;
                        this.f17003 = c4405;
                        this.f17004 = c6624;
                        this.f17005 = c6629;
                        this.f17006 = pathM21063;
                        this.f17007 = 1;
                        if (abstractC7328.mo3574(pathM21063, this) == objM17142) {
                            return objM17142;
                        }
                        abstractC73282 = abstractC7328;
                        c66242 = c6624;
                        c44052 = c4405;
                        path = pathM21063;
                        c33832 = c3383;
                        c66292 = c6629;
                        c6624 = c66242;
                        abstractC7328 = abstractC73282;
                        C3383 c338342 = c33832;
                        pathM21063 = path;
                        c4405 = c44052;
                        c6629 = c66292;
                        c3383 = c338342;
                    }
                    LinkOption[] linkOptionArrM210953 = c6629.m21095();
                    linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM210953, linkOptionArrM210953.length);
                    if (Files.isDirectory(pathM21063, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                    }
                    while (!c3383.isEmpty()) {
                    }
                } else if (Files.exists(pathM21063, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                    this.f17008 = abstractC7328;
                    this.f17002 = c3383;
                    this.f17003 = c4405;
                    this.f17004 = null;
                    this.f17005 = null;
                    this.f17006 = null;
                    this.f17007 = 2;
                    if (abstractC7328.mo3574(pathM21063, this) == objM17142) {
                        return objM17142;
                    }
                }
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super Path> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C1036) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۧ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", m1273f = "PathTreeWalk.kt", m1274i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, m1275l = {184, 190, 199, Opcodes.MUL_DOUBLE_2ADDR}, m1276m = "invokeSuspend", m1277n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, m1278s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @InterfaceC7507({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
    public static final class C1037 extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super Path>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f17010;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f17011;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f17012;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public Object f17013;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public Object f17014;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int f17015;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public /* synthetic */ Object f17016;

        public C1037(InterfaceC4199<? super C1037> interfaceC4199) {
            super(2, interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C1037 c1037 = C6629.this.new C1037(interfaceC4199);
            c1037.f17016 = obj;
            return c1037;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01c1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01bf -> B:36:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01c1 -> B:36:0x013c). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) throws FileSystemLoopException {
            AbstractC7328 abstractC7328;
            C3383 c3383;
            C4405 c4405;
            C6624 c6624;
            C6629 c6629;
            Path pathM21063;
            C6629 c66292;
            C3383 c33832;
            C4405 c44052;
            Path path;
            AbstractC7328 abstractC73282;
            C6624 c66242;
            C3383 c33833;
            LinkOption[] linkOptionArr;
            Object objM17142 = C5508.m17142();
            int i = this.f17015;
            if (i == 0) {
                C7149.m22422(obj);
                abstractC7328 = (AbstractC7328) this.f17016;
                c3383 = new C3383();
                c4405 = new C4405(C6629.this.m21093());
                c6624 = new C6624(C6629.this.f2197, C6630.m21101(C6629.this.f2197, C6629.this.m21095()), null);
                c6629 = C6629.this;
                pathM21063 = c6624.m21063();
                LinkOption[] linkOptionArrM21095 = c6629.m21095();
                LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArrM21095, linkOptionArrM21095.length);
                if (!Files.isDirectory(pathM21063, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                    if (Files.exists(pathM21063, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                        this.f17016 = abstractC7328;
                        this.f17010 = c3383;
                        this.f17011 = c4405;
                        this.f17015 = 2;
                        if (abstractC7328.mo3574(pathM21063, this) == objM17142) {
                            return objM17142;
                        }
                    }
                    c33833 = c3383;
                    while (!c33833.isEmpty()) {
                    }
                    return C8107.f3222;
                }
                if (C6630.m21100(c6624)) {
                    throw new FileSystemLoopException(pathM21063.toString());
                }
                if (c6629.m21094()) {
                    this.f17016 = abstractC7328;
                    this.f17010 = c3383;
                    this.f17011 = c4405;
                    this.f17012 = c6624;
                    this.f17013 = c6629;
                    this.f17014 = pathM21063;
                    this.f17015 = 1;
                    if (abstractC7328.mo3574(pathM21063, this) == objM17142) {
                        return objM17142;
                    }
                    c66292 = c6629;
                    c33832 = c3383;
                    c44052 = c4405;
                    path = pathM21063;
                    abstractC73282 = abstractC7328;
                    c66242 = c6624;
                }
                LinkOption[] linkOptionArrM210952 = c6629.m21095();
                linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM210952, linkOptionArrM210952.length);
                if (Files.isDirectory(pathM21063, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                    c6624.m21064(c4405.m12756(c6624).iterator());
                    c3383.addLast(c6624);
                }
                c33833 = c3383;
                while (!c33833.isEmpty()) {
                }
                return C8107.f3222;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        Path path2 = (Path) this.f17014;
                        C6629 c66293 = (C6629) this.f17013;
                        C6624 c66243 = (C6624) this.f17012;
                        C4405 c44053 = (C4405) this.f17011;
                        C3383 c33834 = (C3383) this.f17010;
                        AbstractC7328 abstractC73283 = (AbstractC7328) this.f17016;
                        C7149.m22422(obj);
                        C6624 next = c66243;
                        abstractC7328 = abstractC73283;
                        C3383 c33835 = c33834;
                        Path pathM210632 = path2;
                        c4405 = c44053;
                        C6629 c66294 = c66293;
                        c33833 = c33835;
                        LinkOption[] linkOptionArrM210953 = c66294.m21095();
                        LinkOption[] linkOptionArr3 = (LinkOption[]) Arrays.copyOf(linkOptionArrM210953, linkOptionArrM210953.length);
                        if (Files.isDirectory(pathM210632, (LinkOption[]) Arrays.copyOf(linkOptionArr3, linkOptionArr3.length))) {
                            next.m21064(c4405.m12756(next).iterator());
                            c33833.addLast(next);
                        }
                        while (!c33833.isEmpty()) {
                            Iterator<C6624> itM3099 = ((C6624) c33833.m6971()).m3099();
                            C5499.m17100(itM3099);
                            if (itM3099.hasNext()) {
                                next = itM3099.next();
                                c66294 = C6629.this;
                                pathM210632 = next.m21063();
                                LinkOption[] linkOptionArrM210954 = c66294.m21095();
                                LinkOption[] linkOptionArr4 = (LinkOption[]) Arrays.copyOf(linkOptionArrM210954, linkOptionArrM210954.length);
                                if (Files.isDirectory(pathM210632, (LinkOption[]) Arrays.copyOf(linkOptionArr4, linkOptionArr4.length))) {
                                    if (C6630.m21100(next)) {
                                        throw new FileSystemLoopException(pathM210632.toString());
                                    }
                                    if (c66294.m21094()) {
                                        this.f17016 = abstractC7328;
                                        this.f17010 = c33833;
                                        this.f17011 = c4405;
                                        this.f17012 = next;
                                        this.f17013 = c66294;
                                        this.f17014 = pathM210632;
                                        this.f17015 = 3;
                                        if (abstractC7328.mo3574(pathM210632, this) == objM17142) {
                                            return objM17142;
                                        }
                                        abstractC73283 = abstractC7328;
                                        c66243 = next;
                                        c44053 = c4405;
                                        path2 = pathM210632;
                                        c33834 = c33833;
                                        c66293 = c66294;
                                        C6624 next2 = c66243;
                                        abstractC7328 = abstractC73283;
                                        C3383 c338352 = c33834;
                                        Path pathM2106322 = path2;
                                        c4405 = c44053;
                                        C6629 c662942 = c66293;
                                        c33833 = c338352;
                                    }
                                    LinkOption[] linkOptionArrM2109532 = c662942.m21095();
                                    LinkOption[] linkOptionArr32 = (LinkOption[]) Arrays.copyOf(linkOptionArrM2109532, linkOptionArrM2109532.length);
                                    if (Files.isDirectory(pathM2106322, (LinkOption[]) Arrays.copyOf(linkOptionArr32, linkOptionArr32.length))) {
                                    }
                                    while (!c33833.isEmpty()) {
                                    }
                                } else if (Files.exists(pathM2106322, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                                    this.f17016 = abstractC7328;
                                    this.f17010 = c33833;
                                    this.f17011 = c4405;
                                    this.f17012 = null;
                                    this.f17013 = null;
                                    this.f17014 = null;
                                    this.f17015 = 4;
                                    if (abstractC7328.mo3574(pathM2106322, this) == objM17142) {
                                        return objM17142;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                c33833.removeLast();
                            }
                        }
                        return C8107.f3222;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                c4405 = (C4405) this.f17011;
                c33833 = (C3383) this.f17010;
                abstractC7328 = (AbstractC7328) this.f17016;
                C7149.m22422(obj);
                while (!c33833.isEmpty()) {
                }
                return C8107.f3222;
            }
            path = (Path) this.f17014;
            c66292 = (C6629) this.f17013;
            c66242 = (C6624) this.f17012;
            c44052 = (C4405) this.f17011;
            c33832 = (C3383) this.f17010;
            abstractC73282 = (AbstractC7328) this.f17016;
            C7149.m22422(obj);
            c3383 = c33832;
            c6629 = c66292;
            AbstractC7328 abstractC73284 = abstractC73282;
            pathM21063 = path;
            c4405 = c44052;
            c6624 = c66242;
            abstractC7328 = abstractC73284;
            LinkOption[] linkOptionArrM2109522 = c6629.m21095();
            linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM2109522, linkOptionArrM2109522.length);
            if (Files.isDirectory(pathM21063, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            }
            c33833 = c3383;
            while (!c33833.isEmpty()) {
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super Path> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C1037) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    public C6629(@InterfaceC6399 Path path, @InterfaceC6399 EnumC6632[] enumC6632Arr) {
        C5499.m17103(path, "start");
        C5499.m17103(enumC6632Arr, "options");
        this.f2197 = path;
        this.f2198 = enumC6632Arr;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<Path> iterator() {
        return m21096() ? m21091() : m21092();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Iterator<Path> m21091() {
        return C7330.m3576(new C1036(null));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Iterator<Path> m21092() {
        return C7330.m3576(new C1037(null));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m21093() {
        return C3411.m7560(this.f2198, EnumC6632.f17020);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m21094() {
        return C3411.m7560(this.f2198, EnumC6632.f17018);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final LinkOption[] m21095() {
        return C5716.f1632.m2396(m21093());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m21096() {
        return C3411.m7560(this.f2198, EnumC6632.f17019);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final Object m21097(AbstractC7328<? super Path> abstractC7328, C6624 c6624, C4405 c4405, InterfaceC5124<? super List<C6624>, C8107> interfaceC5124, InterfaceC4199<? super C8107> interfaceC4199) throws FileSystemLoopException {
        Path pathM21063 = c6624.m21063();
        LinkOption[] linkOptionArrM21095 = m21095();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM21095, linkOptionArrM21095.length);
        if (Files.isDirectory(pathM21063, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            if (C6630.m21100(c6624)) {
                throw new FileSystemLoopException(pathM21063.toString());
            }
            if (m21094()) {
                C5437.m16931(0);
                abstractC7328.mo3574(pathM21063, interfaceC4199);
                C5437.m16931(1);
            }
            LinkOption[] linkOptionArrM210952 = m21095();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArrM210952, linkOptionArrM210952.length);
            if (Files.isDirectory(pathM21063, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                interfaceC5124.invoke(c4405.m12756(c6624));
            }
        } else if (Files.exists(pathM21063, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            C5437.m16931(0);
            abstractC7328.mo3574(pathM21063, interfaceC4199);
            C5437.m16931(1);
            return C8107.f3222;
        }
        return C8107.f3222;
    }
}
