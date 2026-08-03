package okio.internal;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceFileSystem$toJarRoot$zip$1 extends AbstractC1417m implements InterfaceC1231l {
    public static final ResourceFileSystem$toJarRoot$zip$1 INSTANCE = new ResourceFileSystem$toJarRoot$zip$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ResourceFileSystem$toJarRoot$zip$1() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p085fg.InterfaceC1231l
    public final Boolean invoke(ZipEntry zipEntry) {
        zipEntry.getClass();
        return Boolean.valueOf(ResourceFileSystem.Companion.keepPath(zipEntry.getCanonicalPath()));
    }
}
