package p029c2;

import android.view.MotionEvent;
import java.util.List;
import p024b9.AbstractC1043k;
import p376zd.C9987e;

/* JADX INFO: renamed from: c2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1308a implements InterfaceC1310c {

    /* JADX INFO: renamed from: a */
    public final List f3924a;

    /* JADX INFO: renamed from: b */
    public final int f3925b;

    /* JADX INFO: renamed from: c */
    public final int f3926c;

    /* JADX INFO: renamed from: d */
    public final MotionEvent f3927d;

    public C1308a(List list, int i10, int i11, MotionEvent motionEvent) {
        this.f3924a = list;
        this.f3925b = i10;
        this.f3926c = i11;
        this.f3927d = motionEvent;
        if (mo5268b().isEmpty()) {
            C9987e.m38645a("changes cannot be empty");
            throw null;
        }
    }

    @Override // p029c2.InterfaceC1310c
    /* JADX INFO: renamed from: a */
    public int mo5267a() {
        return this.f3926c;
    }

    @Override // p029c2.InterfaceC1310c
    /* JADX INFO: renamed from: b */
    public List mo5268b() {
        return this.f3924a;
    }

    /* JADX INFO: renamed from: c */
    public final MotionEvent m5269c() {
        return this.f3927d;
    }

    public /* synthetic */ C1308a(List list, int i10, int i11, MotionEvent motionEvent, AbstractC1043k abstractC1043k) {
        this(list, i10, i11, motionEvent);
    }
}
