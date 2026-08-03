package Yue;

import com.android.p001dx.p004io.Opcodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
public abstract class AbstractC5065 extends AbstractC4819 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC4819 f12010;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۧ$ۥ */
    public static final class C0632 extends AbstractC5673 implements InterfaceC5124<C6618, C6618> {
        public C0632() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final C6618 invoke(@InterfaceC6399 C6618 c6618) {
            C5499.m17103(c6618, "it");
            return AbstractC5065.this.m15606(c6618, "listRecursively");
        }
    }

    public AbstractC5065(@InterfaceC6399 AbstractC4819 abstractC4819) {
        C5499.m17103(abstractC4819, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        this.f12010 = abstractC4819;
    }

    @InterfaceC6399
    public String toString() {
        return C7071.m21996(getClass()).getSimpleName() + '(' + this.f12010 + ')';
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC7472 mo14638(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "file");
        return this.f12010.mo14638(m15605(c6618, "appendingSink", "file"), z);
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14639(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        this.f12010.mo14639(m15605(c6618, "atomicMove", "source"), m15605(c66182, "atomicMove", "target"));
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public C6618 mo14640(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "path");
        return m15606(this.f12010.mo14640(m15605(c6618, "canonicalize", "path")), "canonicalize");
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo14645(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "dir");
        this.f12010.mo14645(m15605(c6618, "createDirectory", "dir"), z);
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo14646(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        this.f12010.mo14646(m15605(c6618, "createSymlink", "source"), m15605(c66182, "createSymlink", "target"));
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo14648(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "path");
        this.f12010.mo14648(m15605(c6618, "delete", "path"), z);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public List<C6618> mo14652(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "dir");
        List<C6618> listMo14652 = this.f12010.mo14652(m15605(c6618, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listMo14652.iterator();
        while (it.hasNext()) {
            arrayList.add(m15606((C6618) it.next(), "list"));
        }
        C3884.m10767(arrayList);
        return arrayList;
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public List<C6618> mo14653(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "dir");
        List<C6618> listMo14653 = this.f12010.mo14653(m15605(c6618, "listOrNull", "dir"));
        if (listMo14653 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listMo14653.iterator();
        while (it.hasNext()) {
            arrayList.add(m15606((C6618) it.next(), "listOrNull"));
        }
        C3884.m10767(arrayList);
        return arrayList;
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public InterfaceC7326<C6618> mo14655(@InterfaceC6399 C6618 c6618, boolean z) {
        C5499.m17103(c6618, "dir");
        return C7342.m22985(this.f12010.mo14655(m15605(c6618, "listRecursively", "dir"), z), new C0632());
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public C4811 mo14657(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "path");
        C4811 c4811Mo14657 = this.f12010.mo14657(m15605(c6618, "metadataOrNull", "path"));
        if (c4811Mo14657 == null) {
            return null;
        }
        return c4811Mo14657.m14596() == null ? c4811Mo14657 : c4811Mo14657.m1718((Opcodes.INVOKE_POLYMORPHIC_RANGE & 1) != 0 ? c4811Mo14657.f1128 : false, (Opcodes.INVOKE_POLYMORPHIC_RANGE & 2) != 0 ? c4811Mo14657.f1129 : false, (Opcodes.INVOKE_POLYMORPHIC_RANGE & 4) != 0 ? c4811Mo14657.f10829 : m15606(c4811Mo14657.m14596(), "metadataOrNull"), (Opcodes.INVOKE_POLYMORPHIC_RANGE & 8) != 0 ? c4811Mo14657.f10830 : null, (Opcodes.INVOKE_POLYMORPHIC_RANGE & 16) != 0 ? c4811Mo14657.f10831 : null, (Opcodes.INVOKE_POLYMORPHIC_RANGE & 32) != 0 ? c4811Mo14657.f10832 : null, (Opcodes.INVOKE_POLYMORPHIC_RANGE & 64) != 0 ? c4811Mo14657.f10833 : null, (Opcodes.INVOKE_POLYMORPHIC_RANGE & 128) != 0 ? c4811Mo14657.f10834 : null);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public AbstractC4809 mo14658(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "file");
        return this.f12010.mo14658(m15605(c6618, "openReadOnly", "file"));
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public AbstractC4809 mo14660(@InterfaceC6399 C6618 c6618, boolean z, boolean z2) throws IOException {
        C5499.m17103(c6618, "file");
        return this.f12010.mo14660(m15605(c6618, "openReadWrite", "file"), z, z2);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public InterfaceC7472 mo14662(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "file");
        return this.f12010.mo14662(m15605(c6618, "sink", "file"), z);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public InterfaceC7506 mo14663(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "file");
        return this.f12010.mo14663(m15605(c6618, "source", "file"));
    }

    @InterfaceC6399
    @InterfaceC5572(name = MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX)
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final AbstractC4819 m15604() {
        return this.f12010;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public C6618 m15605(@InterfaceC6399 C6618 c6618, @InterfaceC6399 String str, @InterfaceC6399 String str2) {
        C5499.m17103(c6618, "path");
        C5499.m17103(str, "functionName");
        C5499.m17103(str2, "parameterName");
        return c6618;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public C6618 m15606(@InterfaceC6399 C6618 c6618, @InterfaceC6399 String str) {
        C5499.m17103(c6618, "path");
        C5499.m17103(str, "functionName");
        return c6618;
    }
}
