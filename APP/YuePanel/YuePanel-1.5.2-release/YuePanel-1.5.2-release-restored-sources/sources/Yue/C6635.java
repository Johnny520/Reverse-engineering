package Yue;

import Yue.C5499;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n336#1,2:424\n344#1:426\n344#1:427\n338#1,4:428\n336#1,2:432\n344#1:434\n338#1,4:435\n344#1:439\n336#1,6:440\n336#1,2:446\n344#1:448\n338#1,4:449\n1#2:421\n1855#3,2:422\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n352#1:424,2\n361#1:426\n364#1:427\n352#1:428,4\n372#1:432,2\n373#1:434\n372#1:435,4\n384#1:439\n392#1:440,6\n410#1:446,2\n411#1:448\n410#1:449,4\n274#1:422,2\n*E\n"})
public class C6635 extends C6634 {

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ$ۥ */
    public /* synthetic */ class C1039 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f2199;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final /* synthetic */ int[] f2200;

        static {
            int[] iArr = new int[EnumC4222.values().length];
            try {
                iArr[EnumC4222.f8576.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4222.f8578.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4222.f8577.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2199 = iArr;
            int[] iArr2 = new int[EnumC6553.values().length];
            try {
                iArr2[EnumC6553.f16818.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC6553.f16817.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f2200 = iArr2;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ$ۥ۟ */
    public static final class C1040 extends AbstractC5673 implements InterfaceC5140 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1040 f17023 = new C1040();

        public C1040() {
            super(3);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5140
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Void mo15350(@InterfaceC6399 Path path, @InterfaceC6399 Path path2, @InterfaceC6399 Exception exc) throws Exception {
            C5499.m17103(path, "<anonymous parameter 0>");
            C5499.m17103(path2, "<anonymous parameter 1>");
            C5499.m17103(exc, "exception");
            throw exc;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ$ۥ۟۟, reason: contains not printable characters */
    public static final class C6636 extends AbstractC5673 implements InterfaceC5140<InterfaceC4221, Path, Path, EnumC4222> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ boolean f17024;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6636(boolean z) {
            super(3);
            this.f17024 = z;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5140
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final EnumC4222 mo15350(@InterfaceC6399 InterfaceC4221 interfaceC4221, @InterfaceC6399 Path path, @InterfaceC6399 Path path2) throws FileSystemException {
            C5499.m17103(interfaceC4221, "$this$copyToRecursively");
            C5499.m17103(path, "src");
            C5499.m17103(path2, "dst");
            LinkOption[] linkOptionArrM2396 = C5716.f1632.m2396(this.f17024);
            boolean zIsDirectory = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM2396, linkOptionArrM2396.length);
            if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !zIsDirectory) {
                if (zIsDirectory) {
                    C6635.m21144(path2);
                }
                C7559 c7559 = new C7559(2);
                c7559.m3731(linkOptionArrM2396);
                c7559.m3730(StandardCopyOption.REPLACE_EXISTING);
                CopyOption[] copyOptionArr = (CopyOption[]) c7559.m23658(new CopyOption[c7559.m23657()]);
                C5499.m17102(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
            }
            return EnumC4222.f8576;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C6637 extends AbstractC5673 implements InterfaceC5140 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C6637 f17025 = new C6637();

        public C6637() {
            super(3);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5140
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Void mo15350(@InterfaceC6399 Path path, @InterfaceC6399 Path path2, @InterfaceC6399 Exception exc) throws Exception {
            C5499.m17103(path, "<anonymous parameter 0>");
            C5499.m17103(path2, "<anonymous parameter 1>");
            C5499.m17103(exc, "exception");
            throw exc;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C6638 extends AbstractC5673 implements InterfaceC5140<InterfaceC4221, Path, Path, EnumC4222> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ boolean f17026;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6638(boolean z) {
            super(3);
            this.f17026 = z;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5140
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final EnumC4222 mo15350(@InterfaceC6399 InterfaceC4221 interfaceC4221, @InterfaceC6399 Path path, @InterfaceC6399 Path path2) {
            C5499.m17103(interfaceC4221, "$this$null");
            C5499.m17103(path, "src");
            C5499.m17103(path2, "dst");
            return interfaceC4221.mo1185(path, path2, this.f17026);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C6639 extends AbstractC5673 implements InterfaceC5124<InterfaceC4831, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<InterfaceC4221, Path, Path, EnumC4222> f17027;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Path f17028;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Path f17029;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<Path, Path, Exception, EnumC6553> f17030;

        /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ */
        public /* synthetic */ class C1041 extends C5153 implements InterfaceC5138<Path, BasicFileAttributes, FileVisitResult> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5140<InterfaceC4221, Path, Path, EnumC4222> f17031;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Path f17032;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Path f17033;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5140<Path, Path, Exception, EnumC6553> f17034;

            /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: Yue.ۥۣ۠ۢۤ<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends Yue.ۥۣۡۢ> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥ۟ۧۦۡ, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends Yue.ۥ۟ۧۦۢ> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1041(InterfaceC5140<? super InterfaceC4221, ? super Path, ? super Path, ? extends EnumC4222> interfaceC5140, Path path, Path path2, InterfaceC5140<? super Path, ? super Path, ? super Exception, ? extends EnumC6553> interfaceC51402) {
                super(2, C5499.C0779.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.f17031 = interfaceC5140;
                this.f17032 = path;
                this.f17033 = path2;
                this.f17034 = interfaceC51402;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5138
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final FileVisitResult invoke(@InterfaceC6399 Path path, @InterfaceC6399 BasicFileAttributes basicFileAttributes) {
                C5499.m17103(path, "p0");
                C5499.m17103(basicFileAttributes, "p1");
                return C6635.m21139(this.f17031, this.f17032, this.f17033, this.f17034, path, basicFileAttributes);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ۟ */
        public /* synthetic */ class C1042 extends C5153 implements InterfaceC5138<Path, BasicFileAttributes, FileVisitResult> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5140<InterfaceC4221, Path, Path, EnumC4222> f17035;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Path f17036;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Path f17037;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5140<Path, Path, Exception, EnumC6553> f17038;

            /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: Yue.ۥۣ۠ۢۤ<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends Yue.ۥۣۡۢ> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥ۟ۧۦۡ, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends Yue.ۥ۟ۧۦۢ> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1042(InterfaceC5140<? super InterfaceC4221, ? super Path, ? super Path, ? extends EnumC4222> interfaceC5140, Path path, Path path2, InterfaceC5140<? super Path, ? super Path, ? super Exception, ? extends EnumC6553> interfaceC51402) {
                super(2, C5499.C0779.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.f17035 = interfaceC5140;
                this.f17036 = path;
                this.f17037 = path2;
                this.f17038 = interfaceC51402;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5138
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final FileVisitResult invoke(@InterfaceC6399 Path path, @InterfaceC6399 BasicFileAttributes basicFileAttributes) {
                C5499.m17103(path, "p0");
                C5499.m17103(basicFileAttributes, "p1");
                return C6635.m21139(this.f17035, this.f17036, this.f17037, this.f17038, path, basicFileAttributes);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ۟۟, reason: contains not printable characters */
        public /* synthetic */ class C6640 extends C5153 implements InterfaceC5138<Path, Exception, FileVisitResult> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5140<Path, Path, Exception, EnumC6553> f17039;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Path f17040;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Path f17041;

            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: Yue.ۥۣ۠ۢۤ<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends Yue.ۥۣۡۢ> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6640(InterfaceC5140<? super Path, ? super Path, ? super Exception, ? extends EnumC6553> interfaceC5140, Path path, Path path2) {
                super(2, C5499.C0779.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                this.f17039 = interfaceC5140;
                this.f17040 = path;
                this.f17041 = path2;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5138
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final FileVisitResult invoke(@InterfaceC6399 Path path, @InterfaceC6399 Exception exc) {
                C5499.m17103(path, "p0");
                C5499.m17103(exc, "p1");
                return C6635.m21143(this.f17039, this.f17040, this.f17041, path, exc);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۡ$ۥ۟۟۟۠$ۥ۟۟۟, reason: contains not printable characters */
        public static final class C6641 extends AbstractC5673 implements InterfaceC5138<Path, IOException, FileVisitResult> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5140<Path, Path, Exception, EnumC6553> f17042;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Path f17043;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Path f17044;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends Yue.ۥۣۡۢ> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6641(InterfaceC5140<? super Path, ? super Path, ? super Exception, ? extends EnumC6553> interfaceC5140, Path path, Path path2) {
                super(2);
                this.f17042 = interfaceC5140;
                this.f17043 = path;
                this.f17044 = path2;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5138
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final FileVisitResult invoke(@InterfaceC6399 Path path, @InterfaceC6489 IOException iOException) {
                C5499.m17103(path, "directory");
                return iOException == null ? FileVisitResult.CONTINUE : C6635.m21143(this.f17042, this.f17043, this.f17044, path, iOException);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥ۟ۧۦۡ, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends Yue.ۥ۟ۧۦۢ> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۢۤ<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends Yue.ۥۣۡۢ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6639(InterfaceC5140<? super InterfaceC4221, ? super Path, ? super Path, ? extends EnumC4222> interfaceC5140, Path path, Path path2, InterfaceC5140<? super Path, ? super Path, ? super Exception, ? extends EnumC6553> interfaceC51402) {
            super(1);
            this.f17027 = interfaceC5140;
            this.f17028 = path;
            this.f17029 = path2;
            this.f17030 = interfaceC51402;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(InterfaceC4831 interfaceC4831) {
            m21158(interfaceC4831);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m21158(@InterfaceC6399 InterfaceC4831 interfaceC4831) {
            C5499.m17103(interfaceC4831, "$this$visitFileTree");
            interfaceC4831.mo1740(new C1041(this.f17027, this.f17028, this.f17029, this.f17030));
            interfaceC4831.mo14700(new C1042(this.f17027, this.f17028, this.f17029, this.f17030));
            interfaceC4831.mo14701(new C6640(this.f17030, this.f17028, this.f17029));
            interfaceC4831.mo1741(new C6641(this.f17030, this.f17028, this.f17029));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final void m21136(C4731 c4731, InterfaceC5122<C8107> interfaceC5122) {
        try {
            interfaceC5122.invoke();
        } catch (Exception e) {
            c4731.m1648(e);
        }
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.8")
    @InterfaceC4771
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final Path m21137(@InterfaceC6399 Path path, @InterfaceC6399 Path path2, @InterfaceC6399 InterfaceC5140<? super Path, ? super Path, ? super Exception, ? extends EnumC6553> interfaceC5140, boolean z, @InterfaceC6399 InterfaceC5140<? super InterfaceC4221, ? super Path, ? super Path, ? extends EnumC4222> interfaceC51402) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        C5499.m17103(interfaceC5140, "onError");
        C5499.m17103(interfaceC51402, "copyAction");
        LinkOption[] linkOptionArrM2396 = C5716.f1632.m2396(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM2396, linkOptionArrM2396.length);
        if (!Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            throw new NoSuchFileException(path.toString(), path2.toString(), "The source file doesn't exist.");
        }
        boolean zStartsWith = false;
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z || !Files.isSymbolicLink(path))) {
            boolean z2 = Files.exists(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(path2);
            if (!z2 || !Files.isSameFile(path, path2)) {
                if (C5499.m17094(path.getFileSystem(), path2.getFileSystem())) {
                    if (z2) {
                        zStartsWith = path2.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                    } else {
                        Path parent = path2.getParent();
                        if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                            zStartsWith = true;
                        }
                    }
                }
                if (zStartsWith) {
                    throw new FileSystemException(path.toString(), path2.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                }
            }
        }
        C6642.m21242(path, 0, z, new C6639(interfaceC51402, path, path2, interfaceC5140), 1, null);
        return path2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.8")
    @InterfaceC4771
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final Path m21138(@InterfaceC6399 Path path, @InterfaceC6399 Path path2, @InterfaceC6399 InterfaceC5140<? super Path, ? super Path, ? super Exception, ? extends EnumC6553> interfaceC5140, boolean z, boolean z2) {
        C5499.m17103(path, "<this>");
        C5499.m17103(path2, "target");
        C5499.m17103(interfaceC5140, "onError");
        return z2 ? m21137(path, path2, interfaceC5140, z, new C6636(z)) : m21140(path, path2, interfaceC5140, z, null, 8, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final FileVisitResult m21139(InterfaceC5140<? super InterfaceC4221, ? super Path, ? super Path, ? extends EnumC4222> interfaceC5140, Path path, Path path2, InterfaceC5140<? super Path, ? super Path, ? super Exception, ? extends EnumC6553> interfaceC51402, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return m21151(interfaceC5140.mo15350(C4336.f824, path3, m21142(path, path2, path3)));
        } catch (Exception e) {
            return m21143(interfaceC51402, path, path2, path3, e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ Path m21140(Path path, Path path2, InterfaceC5140 interfaceC5140, boolean z, InterfaceC5140 interfaceC51402, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC5140 = C6637.f17025;
        }
        if ((i & 8) != 0) {
            interfaceC51402 = new C6638(z);
        }
        return m21137(path, path2, interfaceC5140, z, interfaceC51402);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ Path m21141(Path path, Path path2, InterfaceC5140 interfaceC5140, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC5140 = C1040.f17023;
        }
        return m21138(path, path2, interfaceC5140, z, z2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final Path m21142(Path path, Path path2, Path path3) {
        Path pathResolve = path2.resolve(C6642.m21230(path3, path).toString());
        C5499.m17102(pathResolve, "target.resolve(relativePath.pathString)");
        return pathResolve;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final FileVisitResult m21143(InterfaceC5140<? super Path, ? super Path, ? super Exception, ? extends EnumC6553> interfaceC5140, Path path, Path path2, Path path3, Exception exc) {
        return m21152(interfaceC5140.mo15350(path3, m21142(path, path2, path3), exc));
    }

    @InterfaceC7470(version = "1.8")
    @InterfaceC4771
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final void m21144(@InterfaceC6399 Path path) throws FileSystemException {
        C5499.m17103(path, "<this>");
        List<Exception> listM21145 = m21145(path);
        if (!listM21145.isEmpty()) {
            FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            Iterator<T> it = listM21145.iterator();
            while (it.hasNext()) {
                C4741.m1656(fileSystemException, (Exception) it.next());
            }
            throw fileSystemException;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final List<Exception> m21145(Path path) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        boolean z = false;
        boolean z2 = true;
        C4731 c4731 = new C4731(0, 1, null);
        Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    if (directoryStreamNewDirectoryStream instanceof SecureDirectoryStream) {
                        c4731.m14251(parent);
                        Path fileName = path.getFileName();
                        C5499.m17102(fileName, "this.fileName");
                        m21147((SecureDirectoryStream) directoryStreamNewDirectoryStream, fileName, c4731);
                    } else {
                        z = true;
                    }
                    C8107 c8107 = C8107.f3222;
                    C3849.m904(directoryStreamNewDirectoryStream, null);
                    z2 = z;
                } finally {
                }
            }
        }
        if (z2) {
            m21149(path, c4731);
        }
        return c4731.m14248();
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final void m21146(SecureDirectoryStream<Path> secureDirectoryStream, Path path, C4731 c4731) {
        SecureDirectoryStream<Path> secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e) {
                c4731.m1648(e);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStreamNewDirectoryStream = null;
        }
        if (secureDirectoryStreamNewDirectoryStream == null) {
            return;
        }
        try {
            Iterator<Path> it = secureDirectoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                Path fileName = it.next().getFileName();
                C5499.m17102(fileName, "entry.fileName");
                m21147(secureDirectoryStreamNewDirectoryStream, fileName, c4731);
            }
            C8107 c8107 = C8107.f3222;
            C3849.m904(secureDirectoryStreamNewDirectoryStream, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final void m21147(SecureDirectoryStream<Path> secureDirectoryStream, Path path, C4731 c4731) {
        c4731.m1649(path);
        try {
        } catch (Exception e) {
            c4731.m1648(e);
        }
        if (m21150(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            int iM14250 = c4731.m14250();
            m21146(secureDirectoryStream, path, c4731);
            if (iM14250 == c4731.m14250()) {
                secureDirectoryStream.deleteDirectory(path);
                C8107 c8107 = C8107.f3222;
            }
            c4731.m14247(path);
        }
        secureDirectoryStream.deleteFile(path);
        C8107 c81072 = C8107.f3222;
        c4731.m14247(path);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final void m21148(Path path, C4731 c4731) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (Exception e) {
                c4731.m1648(e);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStreamNewDirectoryStream = null;
        }
        if (directoryStreamNewDirectoryStream == null) {
            return;
        }
        try {
            for (Path path2 : directoryStreamNewDirectoryStream) {
                C5499.m17102(path2, "entry");
                m21149(path2, c4731);
            }
            C8107 c8107 = C8107.f3222;
            C3849.m904(directoryStreamNewDirectoryStream, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m21149(Path path, C4731 c4731) {
        try {
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                int iM14250 = c4731.m14250();
                m21148(path, c4731);
                if (iM14250 == c4731.m14250()) {
                    Files.deleteIfExists(path);
                }
            } else {
                Files.deleteIfExists(path);
            }
        } catch (Exception e) {
            c4731.m1648(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean m21150(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @InterfaceC4771
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final FileVisitResult m21151(EnumC4222 enumC4222) {
        int i = C1039.f2199[enumC4222.ordinal()];
        if (i == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new C6380();
    }

    @InterfaceC4771
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final FileVisitResult m21152(EnumC6553 enumC6553) {
        int i = C1039.f2200[enumC6553.ordinal()];
        if (i == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new C6380();
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final <R> R m21153(InterfaceC5122<? extends R> interfaceC5122) {
        try {
            return interfaceC5122.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
