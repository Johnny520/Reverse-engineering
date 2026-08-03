.class public final LYue/ۥ۠ۧۤۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(Ljava/util/concurrent/atomic/AtomicInteger;)I
    .locals 0
    .param p0    # Ljava/util/concurrent/atomic/AtomicInteger;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p0

    return p0
.end method

.method public static final ۥ۟(Ljava/util/concurrent/atomic/AtomicInteger;I)V
    .locals 0
    .param p0    # Ljava/util/concurrent/atomic/AtomicInteger;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method
