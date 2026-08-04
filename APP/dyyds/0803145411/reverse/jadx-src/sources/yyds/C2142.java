package yyds;

import android.util.CloseGuard;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: yyds.ᲀᲈᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2142 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0153 f10580;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final long f10579 = 300000000000L;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0939 f10581 = new C0939(this, AbstractC2104.m4015(new StringBuilder(), AbstractC0795.f3654, " ConnectionPool connection closer"));

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ConcurrentLinkedQueue f10582 = new ConcurrentLinkedQueue();

    public C2142(C0105 c0105) {
        this.f10580 = c0105.m510();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m4089(C2723 c2723, long j) {
        TimeZone timeZone = AbstractC0795.f3653;
        ArrayList arrayList = c2723.f13388;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C1618 c1618 = c2723.f13387.f6393;
                C1966 c1966 = AbstractC1325.f6087;
                C1966 c19662 = AbstractC1325.f6087;
                Object obj = ((C1380) reference).f6423;
                c19662.getClass();
                ((CloseGuard) obj).warnIfOpen();
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c2723.f13382 = j - this.f10579;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
