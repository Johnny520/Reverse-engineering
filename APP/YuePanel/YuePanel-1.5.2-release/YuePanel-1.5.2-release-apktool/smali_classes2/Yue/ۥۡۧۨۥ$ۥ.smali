.class public final LYue/ۥۡۧۨۥ$ۥ;
.super LYue/ۥ۟ۢ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۧۨۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06e2\u06e0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,658:1\n1#2:659\n155#3,2:660\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp\n*L\n597#1:660,2\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟:LYue/ۥۡۧۨۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e5<",
            "*>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥ۟ۢ۟ۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟:J


# direct methods
.method public constructor <init>(LYue/ۥۡۧۨۥ;LYue/ۥ۟ۢ۟ۥ;)V
    .locals 2
    .param p1    # LYue/ۥۡۧۨۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۢ۟ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e5<",
            "*>;",
            "LYue/\u06e5\u06df\u06e2\u06df\u06e5;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥ۟ۢ۠;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟:LYue/ۥۡۧۨۥ;

    iput-object p2, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟۟:LYue/ۥ۟ۢ۟ۥ;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟()LYue/ۥۡۨۡۨ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۨۡۨ;->ۥ()J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟۟۟:J

    invoke-virtual {p2, p0}, LYue/ۥ۟ۢ۟ۥ;->ۥ۟۟۟(LYue/ۥ۟ۢ۠;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AtomicSelectOp(sequence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟۟۟ۡ()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-virtual {p0, p2}, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟۟۟ۤ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟۟:LYue/ۥ۟ۢ۟ۥ;

    invoke-virtual {p1, p0, p2}, LYue/ۥ۟ۢ۟ۥ;->ۥ(LYue/ۥ۟ۢ۠;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟۟۟:J

    return-wide v0
.end method

.method public ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    if-nez p1, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟۟۟ۥ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    iget-object v0, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟۟:LYue/ۥ۟ۢ۟ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۟ۢ۟ۥ;->ۥ۟۟(LYue/ۥ۟ۢ۠;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    if-nez p1, :cond_1

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟۟۟ۦ()V

    :cond_1
    throw v0
.end method

.method public final ۥ۟۟۟ۤ(Ljava/lang/Object;)V
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v0

    :goto_1
    iget-object v1, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟:LYue/ۥۡۧۨۥ;

    sget-object v2, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, v1, p0, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    iget-object p1, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟:LYue/ۥۡۧۨۥ;

    invoke-static {p1}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۦۨ(LYue/ۥۡۧۨۥ;)V

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۟ۥ()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟:LYue/ۥۡۧۨۥ;

    :cond_0
    :goto_0
    iget-object v1, v0, LYue/ۥۡۧۨۥ;->_state:Ljava/lang/Object;

    const/4 v2, 0x0

    if-ne v1, p0, :cond_1

    return-object v2

    :cond_1
    instance-of v3, v1, LYue/ۥۣۣۡۡ;

    if-eqz v3, :cond_2

    check-cast v1, LYue/ۥۣۣۡۡ;

    iget-object v2, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟:LYue/ۥۡۧۨۥ;

    invoke-virtual {v1, v2}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟:LYue/ۥۡۧۨۥ;

    sget-object v3, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v1, v4, p0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v2

    :cond_3
    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۦ()V
    .locals 3

    iget-object v0, p0, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟:LYue/ۥۡۧۨۥ;

    sget-object v1, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v0, p0, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
