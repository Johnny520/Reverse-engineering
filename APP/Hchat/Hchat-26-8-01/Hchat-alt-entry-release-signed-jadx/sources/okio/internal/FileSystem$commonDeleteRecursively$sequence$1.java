package okio.internal;

import ng.AbstractC3014l;
import okio.FileSystem;
import okio.Path;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import p370yf.InterfaceC6040e;
import tf.C4164k;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6040e(m10800c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m10801f = "FileSystem.kt", m10802l = {75}, m10803m = "invokeSuspend")
public final class FileSystem$commonDeleteRecursively$sequence$1 extends AbstractC6043h implements InterfaceC1235p {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, interfaceC5557c);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(AbstractC3014l abstractC3014l, InterfaceC5557c interfaceC5557c) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(abstractC3014l, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i9 = this.label;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            AbstractC3014l abstractC3014l = (AbstractC3014l) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            C4164k c4164k = new C4164k();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            Object objCollectRecursively = FileSystem.collectRecursively(abstractC3014l, fileSystem, c4164k, path, false, true, this);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objCollectRecursively == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i9 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
        }
        return C3967n.f12976a;
    }
}
