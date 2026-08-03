.class public abstract LYue/ۥ۟ۦۥۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<N:",
        "LYue/\u06e5\u06df\u06e6\u06e5\u06e8<",
        "TN;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n106#1,7:243\n1#2:250\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n114#1:243,7\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۥ۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _next:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic _prev:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_next"

    const-class v1, LYue/ۥ۟ۦۥۨ;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۥۨ;->ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_prev"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۥۨ;->ۥ۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۟ۦۥۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۦۥۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۟ۦۥۨ;->_next:Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥ۟ۦۥۨ;->_prev:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic ۥ(LYue/ۥ۟ۦۥۨ;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟۟()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۥ۟()V
    .locals 2

    sget-object v0, LYue/ۥ۟ۦۥۨ;->ۥ۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۥ۟۟()LYue/ۥ۟ۦۥۨ;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TN;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟۠()LYue/ۥ۟ۦۥۨ;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۡ()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, LYue/ۥ۟ۦۥۨ;->_prev:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۟ۦۥۨ;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟۟()LYue/ۥ۟ۦۥۨ;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TN;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥ۟ۦۥۨ;->ۥ(LYue/ۥ۟ۦۥۨ;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    check-cast v0, LYue/ۥ۟ۦۥۨ;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۥۨ;->_next:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟۟۟۠()LYue/ۥ۟ۦۥۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TN;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۥۨ;->_prev:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۟ۦۥۨ;

    return-object v0
.end method

.method public abstract ۥ۟۟۟ۡ()Z
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥ۟ۦۥۨ;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TN;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟()LYue/ۥ۟ۦۥۨ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۡ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟()LYue/ۥ۟ۦۥۨ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۥۣ۟۟۟()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟()LYue/ۥ۟ۦۥۨ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۤ()Z
    .locals 3

    sget-object v0, LYue/ۥ۟ۦۥۨ;->ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v2

    invoke-static {v0, p0, v1, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟ۥ(LYue/ۥۣ۠۠ۨ;)LYue/ۥ۟ۦۥۨ;
    .locals 2
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8;",
            ")TN;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥ۟ۦۥۨ;->ۥ(LYue/ۥ۟ۦۥۨ;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v1

    if-eq v0, v1, :cond_0

    check-cast v0, LYue/ۥ۟ۦۥۨ;

    return-object v0

    :cond_0
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    new-instance p1, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p1}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p1
.end method

.method public final ۥ۟۟۟ۦ()V
    .locals 2

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟()LYue/ۥ۟ۦۥۨ;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۢ()LYue/ۥ۟ۦۥۨ;

    move-result-object v1

    iput-object v0, v1, LYue/ۥ۟ۦۥۨ;->_prev:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iput-object v1, v0, LYue/ۥ۟ۦۥۨ;->_next:Ljava/lang/Object;

    :cond_1
    invoke-virtual {v1}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۡ()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۟ۧ(LYue/ۥ۟ۦۥۨ;)Z
    .locals 2
    .param p1    # LYue/ۥ۟ۦۥۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;)Z"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟ۦۥۨ;->ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
