package yyds;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: yyds.ᛷᛶᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1571 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7967 = AtomicIntegerFieldUpdater.newUpdater(C1571.class, "notCompletedCount$volatile");
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1659[] f7968;

    public C1571(InterfaceC1659[] interfaceC1659Arr) {
        this.f7968 = interfaceC1659Arr;
        this.notCompletedCount$volatile = interfaceC1659Arr.length;
    }
}
