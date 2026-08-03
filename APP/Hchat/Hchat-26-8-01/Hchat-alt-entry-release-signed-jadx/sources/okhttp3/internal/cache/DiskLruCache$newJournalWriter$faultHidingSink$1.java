package okhttp3.internal.cache;

import gg.AbstractC1417m;
import java.io.IOException;
import okhttp3.internal.Util;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p276sf.C3967n;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends AbstractC1417m implements InterfaceC1231l {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void invoke(IOException iOException) {
        iOException.getClass();
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
        } else {
            C2104o.m5284i(Thread.currentThread().getName(), " MUST hold lock on ", diskLruCache);
        }
    }

    @Override // p085fg.InterfaceC1231l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return C3967n.f12976a;
    }
}
