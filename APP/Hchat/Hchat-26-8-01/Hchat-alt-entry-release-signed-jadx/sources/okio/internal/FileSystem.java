package okio.internal;

import ac.AbstractC0063p;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import ng.AbstractC3014l;
import ng.C3013k;
import ng.InterfaceC3012j;
import okio.BufferedSink;
import okio.FileMetadata;
import okio.Okio;
import okio.Path;
import okio.Source;
import p054dg.C0795n;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import p370yf.AbstractC6043h;
import p370yf.InterfaceC6040e;
import tf.C4164k;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FileSystem {

    /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    @InterfaceC6040e(m10800c = "okio.internal.-FileSystem", m10801f = "FileSystem.kt", m10802l = {116, 135, 145}, m10803m = "collectRecursively")
    public static final class C31941 extends AbstractC6038c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C31941(InterfaceC5557c interfaceC5557c) {
            super(interfaceC5557c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p370yf.AbstractC6036a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    @InterfaceC6040e(m10800c = "okio.internal.-FileSystem$commonListRecursively$1", m10801f = "FileSystem.kt", m10802l = {96}, m10803m = "invokeSuspend")
    public static final class C31951 extends AbstractC6043h implements InterfaceC1235p {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31951(Path path, okio.FileSystem fileSystem, boolean z9, InterfaceC5557c interfaceC5557c) {
            super(interfaceC5557c);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p370yf.AbstractC6036a
        public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
            C31951 c31951 = new C31951(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, interfaceC5557c);
            c31951.L$0 = obj;
            return c31951;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p085fg.InterfaceC1235p
        public final Object invoke(AbstractC3014l abstractC3014l, InterfaceC5557c interfaceC5557c) {
            return ((C31951) create(abstractC3014l, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p370yf.AbstractC6036a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC3014l abstractC3014l;
            C4164k c4164k;
            Iterator<Path> it;
            int i9 = this.label;
            if (i9 == 0) {
                AbstractC1089i.m2732I0(obj);
                AbstractC3014l abstractC3014l2 = (AbstractC3014l) this.L$0;
                C4164k c4164k2 = new C4164k();
                c4164k2.addLast(this.$dir);
                abstractC3014l = abstractC3014l2;
                c4164k = c4164k2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$2;
                C4164k c4164k3 = (C4164k) this.L$1;
                abstractC3014l = (AbstractC3014l) this.L$0;
                AbstractC1089i.m2732I0(obj);
                c4164k = c4164k3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z9 = this.$followSymlinks;
                this.L$0 = abstractC3014l;
                this.L$1 = c4164k;
                this.L$2 = it;
                this.label = 1;
                Object objCollectRecursively = FileSystem.collectRecursively(abstractC3014l, fileSystem, c4164k, next, z9, false, this);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objCollectRecursively == enumC5799a) {
                    return enumC5799a;
                }
            }
            return C3967n.f12976a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r12 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
    
        r5.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        r3 = r3.iterator();
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0127, code lost:
    
        r9 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #2 {all -> 0x0126, blocks: (B:47:0x00e1, B:49:0x00e7, B:46:0x00d9), top: B:72:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x011e -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object collectRecursively(AbstractC3014l abstractC3014l, okio.FileSystem fileSystem, C4164k c4164k, Path path, boolean z9, boolean z10, InterfaceC5557c interfaceC5557c) throws Throwable {
        C31941 c31941;
        C4164k c4164k2;
        AbstractC3014l abstractC3014l2;
        boolean z11;
        okio.FileSystem fileSystem2;
        boolean z12;
        boolean z13;
        C31941 c319412;
        C4164k c4164k3;
        okio.FileSystem fileSystem3;
        AbstractC3014l abstractC3014l3;
        Path path2 = path;
        boolean z14 = z10;
        if (interfaceC5557c instanceof C31941) {
            c31941 = (C31941) interfaceC5557c;
            int i9 = c31941.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c31941.label = i9 - Integer.MIN_VALUE;
            } else {
                c31941 = new C31941(interfaceC5557c);
            }
        }
        Object obj = c31941.result;
        int i10 = c31941.label;
        C3967n c3967n = C3967n.f12976a;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            if (!z14) {
                c31941.L$0 = abstractC3014l;
                c31941.L$1 = fileSystem;
                c31941.L$2 = c4164k;
                c31941.L$3 = path2;
                c31941.Z$0 = z9;
                c31941.Z$1 = z14;
                c31941.label = 1;
                abstractC3014l.mo6406a(path2, c31941);
                return enumC5799a;
            }
            c4164k2 = c4164k;
            abstractC3014l2 = abstractC3014l;
            z11 = z9;
            fileSystem2 = fileSystem;
        } else if (i10 == 1) {
            boolean z15 = c31941.Z$1;
            boolean z16 = c31941.Z$0;
            Path path3 = (Path) c31941.L$3;
            c4164k2 = (C4164k) c31941.L$2;
            fileSystem2 = (okio.FileSystem) c31941.L$1;
            abstractC3014l2 = (AbstractC3014l) c31941.L$0;
            AbstractC1089i.m2732I0(obj);
            z14 = z15;
            z11 = z16;
            path2 = path3;
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    AbstractC1089i.m2732I0(obj);
                    return c3967n;
                }
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z17 = c31941.Z$1;
            boolean z18 = c31941.Z$0;
            Iterator<Path> it = (Iterator) c31941.L$4;
            Path path4 = (Path) c31941.L$3;
            C4164k c4164k4 = (C4164k) c31941.L$2;
            okio.FileSystem fileSystem4 = (okio.FileSystem) c31941.L$1;
            AbstractC3014l abstractC3014l4 = (AbstractC3014l) c31941.L$0;
            try {
                AbstractC1089i.m2732I0(obj);
                boolean z19 = z17;
                z11 = z18;
                Path path5 = path4;
                c4164k2 = c4164k4;
                fileSystem2 = fileSystem4;
                abstractC3014l2 = abstractC3014l4;
                if (!it.hasNext()) {
                    try {
                        Path next = it.next();
                        c31941.L$0 = abstractC3014l2;
                        c31941.L$1 = fileSystem2;
                        c31941.L$2 = c4164k2;
                        c31941.L$3 = path5;
                        c31941.L$4 = it;
                        c31941.Z$0 = z11;
                        c31941.Z$1 = z19;
                        c31941.label = 2;
                        Object objCollectRecursively = collectRecursively(abstractC3014l3, fileSystem3, c4164k3, next, z12, z13, c319412);
                        abstractC3014l4 = abstractC3014l3;
                        fileSystem4 = fileSystem3;
                        c4164k4 = c4164k3;
                        z19 = z13;
                        if (objCollectRecursively == enumC5799a) {
                            return enumC5799a;
                        }
                        z11 = z12;
                        c31941 = c319412;
                        c4164k2 = c4164k4;
                        fileSystem2 = fileSystem4;
                        abstractC3014l2 = abstractC3014l4;
                        if (!it.hasNext()) {
                            c4164k2.removeLast();
                            z14 = z19;
                            path2 = path5;
                            if (z14) {
                                return c3967n;
                            }
                            c31941.L$0 = null;
                            c31941.L$1 = null;
                            c31941.L$2 = null;
                            c31941.L$3 = null;
                            c31941.L$4 = null;
                            c31941.label = 3;
                            abstractC3014l2.mo6406a(path2, c31941);
                            return enumC5799a;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c4164k4 = c4164k3;
                        c4164k4.removeLast();
                        throw th;
                    }
                    z12 = z11;
                    z13 = z19;
                    c319412 = c31941;
                    c4164k3 = c4164k2;
                    fileSystem3 = fileSystem2;
                    abstractC3014l3 = abstractC3014l2;
                }
            } catch (Throwable th3) {
                th = th3;
                c4164k4.removeLast();
                throw th;
            }
        }
        List<Path> listListOrNull = fileSystem2.listOrNull(path2);
        if (listListOrNull == null) {
            listListOrNull = C4173t.f13710g;
        }
        if (!listListOrNull.isEmpty()) {
            int i11 = 0;
            Path path6 = path2;
            while (true) {
                if (z11 && c4164k2.contains(path6)) {
                    C2104o.m5299y(AbstractC2091b.m5166m(path2, "symlink cycle at "));
                    return null;
                }
                Path pathSymlinkTarget = symlinkTarget(fileSystem2, path6);
                if (pathSymlinkTarget == null) {
                    break;
                }
                i11++;
                path6 = pathSymlinkTarget;
            }
        }
        if (z14) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #2 {all -> 0x0034, blocks: (B:3:0x000e, B:21:0x003a, B:27:0x004d, B:16:0x0030, B:4:0x0016, B:13:0x002b), top: B:42:0x000e, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0034, blocks: (B:3:0x000e, B:21:0x003a, B:27:0x004d, B:16:0x0030, B:4:0x0016, B:13:0x002b), top: B:42:0x000e, inners: #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void commonCopy(okio.FileSystem fileSystem, Path path, Path path2) {
        Long lValueOf;
        Throwable th2;
        Long lValueOf2;
        fileSystem.getClass();
        path.getClass();
        path2.getClass();
        Source source = fileSystem.source(path);
        Throwable th3 = null;
        try {
            BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path2));
            try {
                lValueOf2 = Long.valueOf(bufferedSinkBuffer.writeAll(source));
            } catch (Throwable th4) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th5) {
                        AbstractC0063p.m412e(th4, th5);
                    }
                }
                th2 = th4;
                lValueOf2 = null;
            }
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                    th2 = null;
                } catch (Throwable th6) {
                    th2 = th6;
                }
                if (th2 == null) {
                    throw th2;
                }
                lValueOf2.getClass();
                lValueOf = Long.valueOf(lValueOf2.longValue());
                if (source != null) {
                    try {
                        source.close();
                    } catch (Throwable th7) {
                        th3 = th7;
                    }
                }
            } else {
                th2 = null;
                if (th2 == null) {
                }
            }
        } catch (Throwable th8) {
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th9) {
                    AbstractC0063p.m412e(th8, th9);
                }
            }
            th3 = th8;
            lValueOf = null;
        }
        if (th3 != null) {
            throw th3;
        }
        lValueOf.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonCreateDirectories(okio.FileSystem fileSystem, Path path, boolean z9) {
        fileSystem.getClass();
        path.getClass();
        C4164k c4164k = new C4164k();
        for (Path pathParent = path; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            c4164k.addFirst(pathParent);
        }
        if (z9 && c4164k.isEmpty()) {
            C2104o.m5283h(path, " already exists.");
            return;
        }
        Iterator<E> it = c4164k.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonDeleteRecursively(okio.FileSystem fileSystem, Path path, boolean z9) {
        fileSystem.getClass();
        path.getClass();
        C3013k c3013kM3175B = AbstractC1184v0.m3175B(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, path, null));
        while (c3013kM3175B.hasNext()) {
            fileSystem.delete((Path) c3013kM3175B.next(), z9 && !c3013kM3175B.hasNext());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonExists(okio.FileSystem fileSystem, Path path) {
        fileSystem.getClass();
        path.getClass();
        return fileSystem.metadataOrNull(path) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC3012j commonListRecursively(okio.FileSystem fileSystem, Path path, boolean z9) {
        fileSystem.getClass();
        path.getClass();
        return new C0795n(new C31951(path, fileSystem, z9, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FileMetadata commonMetadata(okio.FileSystem fileSystem, Path path) throws FileNotFoundException {
        fileSystem.getClass();
        path.getClass();
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException(AbstractC2091b.m5166m(path, "no such file: "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Path symlinkTarget(okio.FileSystem fileSystem, Path path) {
        fileSystem.getClass();
        path.getClass();
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        pathParent.getClass();
        return pathParent.resolve(symlinkTarget);
    }
}
