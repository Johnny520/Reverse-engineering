package Yue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1284#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
public class C4839 extends C4838 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۧ$ۥ */
    public static final class C0505 extends AbstractC5673 implements InterfaceC5138 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C0505 f10902 = new C0505();

        public C0505() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Void invoke(@InterfaceC6399 File file, @InterfaceC6399 IOException iOException) throws IOException {
            C5499.m17103(file, "<anonymous parameter 0>");
            C5499.m17103(iOException, "exception");
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۧ$ۥ۟ */
    public static final class C0506 extends AbstractC5673 implements InterfaceC5138<File, IOException, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<File, IOException, EnumC6552> f10903;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.io.File, ? super java.io.IOException, ? extends Yue.ۥۣۡۡۨ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0506(InterfaceC5138<? super File, ? super IOException, ? extends EnumC6552> interfaceC5138) {
            super(2);
            this.f10903 = interfaceC5138;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ C8107 invoke(File file, IOException iOException) throws C7742 {
            m14775(file, iOException);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m14775(@InterfaceC6399 File file, @InterfaceC6399 IOException iOException) throws C7742 {
            C5499.m17103(file, "f");
            C5499.m17103(iOException, "e");
            if (this.f10903.invoke(file, iOException) == EnumC6552.f16814) {
                throw new C7742(file);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final boolean m14746(@InterfaceC6399 File file, @InterfaceC6399 File file2, boolean z, @InterfaceC6399 InterfaceC5138<? super File, ? super IOException, ? extends EnumC6552> interfaceC5138) {
        C5499.m17103(file, "<this>");
        C5499.m17103(file2, "target");
        C5499.m17103(interfaceC5138, "onError");
        if (!file.exists()) {
            return interfaceC5138.invoke(file, new C6379(file, null, "The source file doesn't exist.", 2, null)) != EnumC6552.f16814;
        }
        try {
            for (File file3 : C4838.m14745(file).m14673(new C0506(interfaceC5138))) {
                if (file3.exists()) {
                    File file4 = new File(file2, m14772(file3, file));
                    if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                        if (z) {
                            if (file4.isDirectory()) {
                                if (!m14754(file4)) {
                                }
                            } else if (!file4.delete()) {
                            }
                        }
                        if (interfaceC5138.invoke(file4, new C4808(file3, file4, "The destination file already exists.")) == EnumC6552.f16814) {
                            return false;
                        }
                    }
                    if (file3.isDirectory()) {
                        file4.mkdirs();
                    } else if (m14749(file3, file4, z, 0, 4, null).length() != file3.length() && interfaceC5138.invoke(file3, new IOException("Source file wasn't copied completely, length of destination file differs.")) == EnumC6552.f16814) {
                        return false;
                    }
                } else if (interfaceC5138.invoke(file3, new C6379(file3, null, "The source file doesn't exist.", 2, null)) == EnumC6552.f16814) {
                    return false;
                }
            }
            return true;
        } catch (C7742 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m14747(File file, File file2, boolean z, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            interfaceC5138 = C0505.f10902;
        }
        return m14746(file, file2, z, interfaceC5138);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final File m14748(@InterfaceC6399 File file, @InterfaceC6399 File file2, boolean z, int i) throws C4820 {
        C5499.m17103(file, "<this>");
        C5499.m17103(file2, "target");
        if (!file.exists()) {
            throw new C6379(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z) {
                throw new C4808(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new C4808(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    C3629.m9781(fileInputStream, fileOutputStream, i);
                    C3849.m904(fileOutputStream, null);
                    C3849.m904(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!file2.mkdirs()) {
            throw new C4820(file, file2, "Failed to create target directory.");
        }
        return file2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ File m14749(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return m14748(file, file2, z, i);
    }

    @InterfaceC6399
    @InterfaceC4372(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final File m14750(@InterfaceC6399 String str, @InterfaceC6489 String str2, @InterfaceC6489 File file) throws IOException {
        C5499.m17103(str, "prefix");
        File fileCreateTempFile = File.createTempFile(str, str2, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            C5499.m17102(fileCreateTempFile, "dir");
            return fileCreateTempFile;
        }
        throw new IOException("Unable to create temporary directory " + fileCreateTempFile + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static /* synthetic */ File m14751(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return m14750(str, str2, file);
    }

    @InterfaceC6399
    @InterfaceC4372(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final File m14752(@InterfaceC6399 String str, @InterfaceC6489 String str2, @InterfaceC6489 File file) throws IOException {
        C5499.m17103(str, "prefix");
        File fileCreateTempFile = File.createTempFile(str, str2, file);
        C5499.m17102(fileCreateTempFile, "createTempFile(prefix, suffix, directory)");
        return fileCreateTempFile;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static /* synthetic */ File m14753(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return m14752(str, str2, file);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final boolean m14754(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : C4838.m14744(file)) {
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m14755(@InterfaceC6399 File file, @InterfaceC6399 File file2) {
        C5499.m17103(file, "<this>");
        C5499.m17103(file2, "other");
        C4813 c4813M14711 = C4836.m14711(file);
        C4813 c4813M147112 = C4836.m14711(file2);
        if (c4813M147112.m14605()) {
            return C5499.m17094(file, file2);
        }
        int iM14604 = c4813M14711.m14604() - c4813M147112.m14604();
        if (iM14604 < 0) {
            return false;
        }
        return c4813M14711.m14603().subList(iM14604, c4813M14711.m14604()).equals(c4813M147112.m14603());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean m14756(@InterfaceC6399 File file, @InterfaceC6399 String str) {
        C5499.m17103(file, "<this>");
        C5499.m17103(str, "other");
        return m14755(file, new File(str));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String m14757(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        String name = file.getName();
        C5499.m17102(name, "name");
        return C7628.m24160(name, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, "");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final String m14758(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        char c = File.separatorChar;
        String path = file.getPath();
        C5499.m17102(path, "path");
        return c != '/' ? C7627.m23997(path, c, '/', false, 4, null) : path;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final String m14759(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        String name = file.getName();
        C5499.m17102(name, "name");
        return C7628.m24171(name, ".", null, 2, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final File m14760(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        C4813 c4813M14711 = C4836.m14711(file);
        File fileM14601 = c4813M14711.m14601();
        List<File> listM14762 = m14762(c4813M14711.m14603());
        String str = File.separator;
        C5499.m17102(str, "separator");
        return m14767(fileM14601, C3888.m10923(listM14762, str, null, null, 0, null, null, 62, null));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final C4813 m14761(C4813 c4813) {
        return new C4813(c4813.m14601(), m14762(c4813.m14603()));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final List<File> m14762(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!C5499.m17094(name, ".")) {
                if (!C5499.m17094(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || C5499.m17094(((File) C3888.m10926(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final File m14763(@InterfaceC6399 File file, @InterfaceC6399 File file2) {
        C5499.m17103(file, "<this>");
        C5499.m17103(file2, "base");
        return new File(m14772(file, file2));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final File m14764(@InterfaceC6399 File file, @InterfaceC6399 File file2) throws IOException {
        C5499.m17103(file, "<this>");
        C5499.m17103(file2, "base");
        String strM14773 = m14773(file, file2);
        if (strM14773 != null) {
            return new File(strM14773);
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final File m14765(@InterfaceC6399 File file, @InterfaceC6399 File file2) throws IOException {
        C5499.m17103(file, "<this>");
        C5499.m17103(file2, "base");
        String strM14773 = m14773(file, file2);
        return strM14773 != null ? new File(strM14773) : file;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final File m14766(@InterfaceC6399 File file, @InterfaceC6399 File file2) {
        C5499.m17103(file, "<this>");
        C5499.m17103(file2, "relative");
        if (C4836.m14709(file2)) {
            return file2;
        }
        String string = file.toString();
        C5499.m17102(string, "this.toString()");
        if (string.length() != 0) {
            char c = File.separatorChar;
            if (!C7628.m24040(string, c, false, 2, null)) {
                return new File(string + c + file2);
            }
        }
        return new File(string + file2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final File m14767(@InterfaceC6399 File file, @InterfaceC6399 String str) {
        C5499.m17103(file, "<this>");
        C5499.m17103(str, "relative");
        return m14766(file, new File(str));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final File m14768(@InterfaceC6399 File file, @InterfaceC6399 File file2) {
        C5499.m17103(file, "<this>");
        C5499.m17103(file2, "relative");
        C4813 c4813M14711 = C4836.m14711(file);
        return m14766(m14766(c4813M14711.m14601(), c4813M14711.m14604() == 0 ? new File("..") : c4813M14711.m14606(0, c4813M14711.m14604() - 1)), file2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final File m14769(@InterfaceC6399 File file, @InterfaceC6399 String str) {
        C5499.m17103(file, "<this>");
        C5499.m17103(str, "relative");
        return m14768(file, new File(str));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final boolean m14770(@InterfaceC6399 File file, @InterfaceC6399 File file2) {
        C5499.m17103(file, "<this>");
        C5499.m17103(file2, "other");
        C4813 c4813M14711 = C4836.m14711(file);
        C4813 c4813M147112 = C4836.m14711(file2);
        if (C5499.m17094(c4813M14711.m14601(), c4813M147112.m14601()) && c4813M14711.m14604() >= c4813M147112.m14604()) {
            return c4813M14711.m14603().subList(0, c4813M147112.m14604()).equals(c4813M147112.m14603());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final boolean m14771(@InterfaceC6399 File file, @InterfaceC6399 String str) {
        C5499.m17103(file, "<this>");
        C5499.m17103(str, "other");
        return m14770(file, new File(str));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final String m14772(@InterfaceC6399 File file, @InterfaceC6399 File file2) throws IOException {
        C5499.m17103(file, "<this>");
        C5499.m17103(file2, "base");
        String strM14773 = m14773(file, file2);
        if (strM14773 != null) {
            return strM14773;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final String m14773(File file, File file2) throws IOException {
        C4813 c4813M14761 = m14761(C4836.m14711(file));
        C4813 c4813M147612 = m14761(C4836.m14711(file2));
        if (!C5499.m17094(c4813M14761.m14601(), c4813M147612.m14601())) {
            return null;
        }
        int iM14604 = c4813M147612.m14604();
        int iM146042 = c4813M14761.m14604();
        int iMin = Math.min(iM146042, iM14604);
        int i = 0;
        while (i < iMin && C5499.m17094(c4813M14761.m14603().get(i), c4813M147612.m14603().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = iM14604 - 1;
        if (i <= i2) {
            while (!C5499.m17094(c4813M147612.m14603().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < iM146042) {
            if (i < iM14604) {
                sb.append(File.separatorChar);
            }
            List listM10861 = C3888.m10861(c4813M14761.m14603(), i);
            String str = File.separator;
            C5499.m17102(str, "separator");
            C3888.m10920(listM10861, sb, (124 & 2) != 0 ? ", " : str, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        return sb.toString();
    }
}
