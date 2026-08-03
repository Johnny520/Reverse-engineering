package p000a;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: a.Se */
/* JADX INFO: loaded from: classes.dex */
public final class C0340Se implements Iterable<Intent> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Intent> f1202a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final ActivityC0075E0 f1203b;

    /* JADX INFO: renamed from: a.Se$a */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public C0340Se(ActivityC0075E0 activityC0075E0) {
        this.f1203b = activityC0075E0;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f1202a.iterator();
    }
}
