package p000;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* JADX INFO: renamed from: ue */
/* JADX INFO: loaded from: classes.dex */
public final class C0779ue extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e50 f4715a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0779ue(e50 e50Var) {
        super(new Handler());
        this.f4715a = e50Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        e50 e50Var = this.f4715a;
        if (!e50Var.f4957b || (cursor = e50Var.f4958c) == null || cursor.isClosed()) {
            return;
        }
        e50Var.f4956a = e50Var.f4958c.requery();
    }
}
