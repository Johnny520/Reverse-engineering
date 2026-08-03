.class public final LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
.super LYue/ۥۣۣۡۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,671:1\n1#2:672\n*E\n"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۠ۨ۠ۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥ۠ۨ۠ۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ$ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۠ۨ۠ۥ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥۣۣۡۡ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    iput-object p2, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    iput-object p3, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PrepareOp(op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ()LYue/ۥ۟ۢ۠;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()LYue/ۥ۟ۢ۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۥ;->ۥ۟()LYue/ۥ۟ۢ۠;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    if-eqz p1, :cond_5

    check-cast p1, LYue/ۥ۠ۨ۠ۥ;

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟ۤ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LYue/ۥ۠ۨ۠ۦ;->ۥ:Ljava/lang/Object;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    invoke-static {v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤ۟(LYue/ۥ۠ۨ۠ۥ;)LYue/ۥۡۦۤ۟;

    move-result-object v3

    sget-object v4, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p1, p0, v3}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;

    invoke-virtual {v3, p1}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟ۥ(LYue/ۥ۠ۨ۠ۥ;)V

    invoke-static {v0, v2}, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟ۨ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;

    :cond_0
    return-object v1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ()LYue/ۥ۟ۢ۠;

    move-result-object v1

    invoke-virtual {v1, v0}, LYue/ۥ۟ۢ۠;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ()LYue/ۥ۟ۢ۠;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۢ۠;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    sget-object v1, LYue/ۥ۟ۢ۟ۨ;->ۥ:Ljava/lang/Object;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ()LYue/ۥ۟ۢ۠;

    move-result-object v0

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;

    iget-object v1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {v0, p1, v1}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟ۨ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    :goto_1
    sget-object v1, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p1, p0, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v2

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟ۡ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)V

    return-void
.end method
