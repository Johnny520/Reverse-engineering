package okio.internal;

import gg.AbstractC1417m;
import java.util.List;
import p085fg.InterfaceC1220a;
import p276sf.C3958e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceFileSystem$roots$2 extends AbstractC1417m implements InterfaceC1220a {
    final /* synthetic */ ResourceFileSystem this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceFileSystem$roots$2(ResourceFileSystem resourceFileSystem) {
        super(0);
        this.this$0 = resourceFileSystem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p085fg.InterfaceC1220a
    public final List<C3958e> invoke() {
        ResourceFileSystem resourceFileSystem = this.this$0;
        return resourceFileSystem.toClasspathRoots(resourceFileSystem.classLoader);
    }
}
