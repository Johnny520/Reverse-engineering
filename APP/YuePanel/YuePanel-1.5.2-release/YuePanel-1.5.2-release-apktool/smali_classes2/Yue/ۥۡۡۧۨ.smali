.class public final LYue/ۥۡۡۧۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۡۧۧ;
.implements LYue/ۥۡۧۨۨ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;,
        LYue/ۥۡۡۧۨ$ۥ۟۟۟;,
        LYue/ۥۡۡۧۨ$ۥ۟۟;,
        LYue/ۥۡۡۧۨ$ۥ;,
        LYue/ۥۡۡۧۨ$ۥ۟;,
        LYue/ۥۡۡۧۨ$ۥ۟۟۟۠;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e1\u06e7\u06e7;",
        "LYue/\u06e5\u06e1\u06e7\u06e8\u06e8<",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e1\u06e7\u06e7;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,424:1\n155#2,2:425\n155#2,2:427\n155#2,2:433\n155#2,2:437\n155#2,2:439\n1#3:429\n332#4,3:430\n335#4,2:435\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n146#1:425,2\n163#1:427,2\n191#1:433,2\n322#1:437,2\n353#1:439,2\n189#1:430,3\n189#1:435,2\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field volatile synthetic _state:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_state"

    const-class v2, LYue/ۥۡۡۧۨ;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟()LYue/ۥ۠۠ۧۤ;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟()LYue/ۥ۠۠ۧۤ;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۡ(LYue/ۥۡۡۧۨ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    :goto_0
    iget-object v0, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۠۠ۧۤ;

    const/16 v2, 0x5d

    const-string v3, "Mutex["

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v0, LYue/ۥ۠۠ۧۤ;

    iget-object v0, v0, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v1, v0, LYue/ۥۣۣۡۡ;

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥۣۣۡۡ;

    invoke-virtual {v0, p0}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    instance-of v1, v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    iget-object v0, v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;->owner:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Illegal state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۡۡۧۨ;->ۥ۟(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    :cond_0
    :goto_0
    iget-object v0, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۠۠ۧۤ;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, LYue/ۥ۠۠ۧۤ;

    iget-object v1, v1, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟ۡ()LYue/ۥۢ۠ۦۢ;

    move-result-object v3

    if-eq v1, v3, :cond_1

    return v2

    :cond_1
    if-nez p1, :cond_2

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟()LYue/ۥ۠۠ۧۤ;

    move-result-object v1

    goto :goto_1

    :cond_2
    new-instance v1, LYue/ۥ۠۠ۧۤ;

    invoke-direct {v1, p1}, LYue/ۥ۠۠ۧۤ;-><init>(Ljava/lang/Object;)V

    :goto_1
    sget-object v2, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v0, v1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_3
    instance-of v1, v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    if-eqz v1, :cond_5

    check-cast v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    iget-object v0, v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;->owner:Ljava/lang/Object;

    if-eq v0, p1, :cond_4

    return v2

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Already locked by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    instance-of v1, v0, LYue/ۥۣۣۡۡ;

    if-eqz v1, :cond_6

    check-cast v0, LYue/ۥۣۣۡۡ;

    invoke-virtual {v0, p0}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟()Z
    .locals 4

    :goto_0
    iget-object v0, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۠۠ۧۤ;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥ۠۠ۧۤ;

    iget-object v0, v0, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟ۡ()LYue/ۥۢ۠ۦۢ;

    move-result-object v1

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    return v2

    :cond_1
    instance-of v1, v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    if-eqz v1, :cond_2

    return v2

    :cond_2
    instance-of v1, v0, LYue/ۥۣۣۡۡ;

    if-eqz v1, :cond_3

    check-cast v0, LYue/ۥۣۣۡۡ;

    invoke-virtual {v0, p0}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Illegal state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public ۥ۟۟۟(Ljava/lang/Object;)V
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    :cond_0
    :goto_0
    iget-object v0, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۠۠ۧۤ;

    const-string v2, " but expected "

    const-string v3, "Mutex is locked by "

    if-eqz v1, :cond_4

    if-nez p1, :cond_2

    move-object v1, v0

    check-cast v1, LYue/ۥ۠۠ۧۤ;

    iget-object v1, v1, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟ۡ()LYue/ۥۢ۠ۦۢ;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Mutex is not locked"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    move-object v1, v0

    check-cast v1, LYue/ۥ۠۠ۧۤ;

    iget-object v4, v1, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    if-ne v4, p1, :cond_3

    :goto_1
    sget-object v1, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟()LYue/ۥ۠۠ۧۤ;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    instance-of v1, v0, LYue/ۥۣۣۡۡ;

    if-eqz v1, :cond_5

    check-cast v0, LYue/ۥۣۣۡۡ;

    invoke-virtual {v0, p0}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    instance-of v1, v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    if-eqz v1, :cond_a

    if-eqz p1, :cond_7

    move-object v1, v0

    check-cast v1, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    iget-object v4, v1, LYue/ۥۡۡۧۨ$ۥ۟۟۟;->owner:Ljava/lang/Object;

    if-ne v4, p1, :cond_6

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, LYue/ۥۡۡۧۨ$ۥ۟۟۟;->owner:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    move-object v1, v0

    check-cast v1, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    invoke-virtual {v1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۦ۟()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v2

    if-nez v2, :cond_8

    new-instance v2, LYue/ۥۡۡۧۨ$ۥ۟۟۟۠;

    invoke-direct {v2, v1}, LYue/ۥۡۡۧۨ$ۥ۟۟۟۠;-><init>(LYue/ۥۡۡۧۨ$ۥ۟۟۟;)V

    sget-object v1, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, v0, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2, p0}, LYue/ۥ۟ۢ۠;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_8
    check-cast v2, LYue/ۥۡۡۧۨ$ۥ۟۟;

    invoke-virtual {v2}, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟ۦۦ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, v2, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    if-nez p1, :cond_9

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟۟()LYue/ۥۢ۠ۦۢ;

    move-result-object p1

    :cond_9
    iput-object p1, v1, LYue/ۥۡۡۧۨ$ۥ۟۟۟;->owner:Ljava/lang/Object;

    invoke-virtual {v2}, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟ۦۤ()V

    return-void

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟۟(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۠۠ۧۤ;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥ۠۠ۧۤ;

    iget-object v0, v0, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    goto :goto_0

    :cond_1
    instance-of v1, v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    iget-object v0, v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;->owner:Ljava/lang/Object;

    if-ne v0, p1, :cond_0

    :goto_0
    return v2
.end method

.method public ۥ۟۟۟۠()LYue/ۥۡۧۨۨ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e8<",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e1\u06e1\u06e7\u06e7;",
            ">;"
        }
    .end annotation

    return-object p0
.end method

.method public final ۥ۟۟۟ۢ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۨ۠;->ۥ۟۟ۦۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥۣ۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p2}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣ۟ۨۢ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥۣ۟ۨ۠;

    move-result-object v0

    new-instance v1, LYue/ۥۡۡۧۨ$ۥ;

    invoke-direct {v1, p0, p1, v0}, LYue/ۥۡۡۧۨ$ۥ;-><init>(LYue/ۥۡۡۧۨ;Ljava/lang/Object;LYue/ۥۣ۟ۨ۟;)V

    :cond_0
    :goto_0
    iget-object v2, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    instance-of v3, v2, LYue/ۥ۠۠ۧۤ;

    if-eqz v3, :cond_3

    move-object v3, v2

    check-cast v3, LYue/ۥ۠۠ۧۤ;

    iget-object v4, v3, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟ۡ()LYue/ۥۢ۠ۦۢ;

    move-result-object v5

    if-eq v4, v5, :cond_1

    sget-object v4, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v5, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    iget-object v3, v3, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    invoke-direct {v5, v3}, LYue/ۥۡۡۧۨ$ۥ۟۟۟;-><init>(Ljava/lang/Object;)V

    invoke-static {v4, p0, v2, v5}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟()LYue/ۥ۠۠ۧۤ;

    move-result-object v3

    goto :goto_1

    :cond_2
    new-instance v3, LYue/ۥ۠۠ۧۤ;

    invoke-direct {v3, p1}, LYue/ۥ۠۠ۧۤ;-><init>(Ljava/lang/Object;)V

    :goto_1
    sget-object v4, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p0, v2, v3}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    new-instance v2, LYue/ۥۡۡۧۨ$ۥ۟۟۟ۡ;

    invoke-direct {v2, p0, p1}, LYue/ۥۡۡۧۨ$ۥ۟۟۟ۡ;-><init>(LYue/ۥۡۡۧۨ;Ljava/lang/Object;)V

    invoke-interface {v0, v1, v2}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)V

    goto :goto_3

    :cond_3
    instance-of v3, v2, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    if-eqz v3, :cond_9

    move-object v3, v2

    check-cast v3, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    iget-object v4, v3, LYue/ۥۡۡۧۨ$ۥ۟۟۟;->owner:Ljava/lang/Object;

    if-eq v4, p1, :cond_8

    invoke-virtual {v3, v1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤ۠(LYue/ۥ۠ۨ۠ۥ;)V

    iget-object v3, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    if-eq v3, v2, :cond_5

    invoke-virtual {v1}, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟ۦۥ()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    new-instance v1, LYue/ۥۡۡۧۨ$ۥ;

    invoke-direct {v1, p0, p1, v0}, LYue/ۥۡۡۧۨ$ۥ;-><init>(LYue/ۥۡۡۧۨ;Ljava/lang/Object;LYue/ۥۣ۟ۨ۟;)V

    goto :goto_0

    :cond_5
    :goto_2
    invoke-static {v0, v1}, LYue/ۥۣ۟ۨۢ;->ۥ۟۟(LYue/ۥۣ۟ۨ۟;LYue/ۥ۠ۨ۠ۥ;)V

    :goto_3
    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_6

    invoke-static {p2}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_6
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_7

    return-object p1

    :cond_7
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Already locked by "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    instance-of v3, v2, LYue/ۥۣۣۡۡ;

    if-eqz v3, :cond_a

    check-cast v2, LYue/ۥۣۣۡۡ;

    invoke-virtual {v2, p0}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Illegal state "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠ۥ(LYue/ۥۡۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V
    .locals 4
    .param p1    # LYue/ۥۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8<",
            "-TR;>;",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06e1\u06e1\u06e7\u06e7;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-interface {p1}, LYue/ۥۡۨ;->ۥ۟۟ۡ۠()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۠۠ۧۤ;

    if-eqz v1, :cond_6

    move-object v1, v0

    check-cast v1, LYue/ۥ۠۠ۧۤ;

    iget-object v2, v1, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟ۡ()LYue/ۥۢ۠ۦۢ;

    move-result-object v3

    if-eq v2, v3, :cond_2

    sget-object v2, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v3, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    iget-object v1, v1, LYue/ۥ۠۠ۧۤ;->ۥ:Ljava/lang/Object;

    invoke-direct {v3, v1}, LYue/ۥۡۡۧۨ$ۥ۟۟۟;-><init>(Ljava/lang/Object;)V

    invoke-static {v2, p0, v0, v3}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;

    invoke-direct {v0, p0, p2}, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;-><init>(LYue/ۥۡۡۧۨ;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, LYue/ۥۡۨ;->ۥ۟۟۟ۦ(LYue/ۥ۟ۢ۟ۥ;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-interface {p1}, LYue/ۥۡۨ;->ۥ۟۟ۡۦ()LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    invoke-static {p3, p0, p1}, LYue/ۥۣۢ۠۠;->ۥ۟۟۟(LYue/ۥۣ۠ۢۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V

    return-void

    :cond_3
    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_4

    return-void

    :cond_4
    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟۠()LYue/ۥۢ۠ۦۢ;

    move-result-object v1

    if-eq v0, v1, :cond_0

    sget-object v1, LYue/ۥ۟ۢ۟ۨ;->ۥ۟:Ljava/lang/Object;

    if-ne v0, v1, :cond_5

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "performAtomicTrySelect(TryLockDesc) returned "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    instance-of v1, v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    if-eqz v1, :cond_9

    move-object v1, v0

    check-cast v1, LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    iget-object v2, v1, LYue/ۥۡۡۧۨ$ۥ۟۟۟;->owner:Ljava/lang/Object;

    if-eq v2, p2, :cond_8

    new-instance v2, LYue/ۥۡۡۧۨ$ۥ۟;

    invoke-direct {v2, p0, p2, p1, p3}, LYue/ۥۡۡۧۨ$ۥ۟;-><init>(LYue/ۥۡۡۧۨ;Ljava/lang/Object;LYue/ۥۡۨ;LYue/ۥۣ۠ۢۢ;)V

    invoke-virtual {v1, v2}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤ۠(LYue/ۥ۠ۨ۠ۥ;)V

    iget-object v1, p0, LYue/ۥۡۡۧۨ;->_state:Ljava/lang/Object;

    if-eq v1, v0, :cond_7

    invoke-virtual {v2}, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟ۦۥ()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_7
    invoke-interface {p1, v2}, LYue/ۥۡۨ;->ۥۣ۟۟(LYue/ۥۣۣ۠۟;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Already locked by "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    instance-of v1, v0, LYue/ۥۣۣۡۡ;

    if-eqz v1, :cond_a

    check-cast v0, LYue/ۥۣۣۡۡ;

    invoke-virtual {v0, p0}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Illegal state "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
