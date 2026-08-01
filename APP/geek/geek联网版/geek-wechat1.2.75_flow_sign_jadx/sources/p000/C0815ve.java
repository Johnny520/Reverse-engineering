package p000;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* JADX INFO: renamed from: ve */
/* JADX INFO: loaded from: classes.dex */
public final class C0815ve extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ l50 f4940a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815ve(l50 l50Var) {
        super(new Handler());
        this.f4940a = l50Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        l50 l50Var = this.f4940a;
        if (!l50Var.f5238b || (cursor = l50Var.f5239c) == null || cursor.isClosed()) {
            return;
        }
        l50Var.f5237a = l50Var.f5239c.requery();
    }
}
