package androidx.databinding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.AbstractC0133H4;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends AbstractC0133H4 {

    /* JADX INFO: renamed from: a */
    public final HashSet f4478a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f4479b = new CopyOnWriteArrayList();

    public MergedDataBinderMapper() {
        new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final void m2500b(AbstractC0133H4 abstractC0133H4) {
        if (this.f4478a.add(abstractC0133H4.getClass())) {
            this.f4479b.add(abstractC0133H4);
            Iterator<AbstractC0133H4> it = abstractC0133H4.mo353a().iterator();
            while (it.hasNext()) {
                m2500b(it.next());
            }
        }
    }
}
