.class public final LYue/ۥۢ۠۟ۤ;
.super LYue/ۥ۟۟ۢۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e2\u06e6<",
        "LYue/\u06e5\u06e2\u06e0\u06df\u06e2<",
        "*>;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,430:1\n155#2,2:431\n1#3:433\n314#4,11:434\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n276#1:431,2\n300#1:434,11\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


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

    const-class v2, LYue/ۥۢ۠۟ۤ;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۢ۠۟ۤ;->ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LYue/ۥ۟۟ۢۦ;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢ۠۟ۤ;->_state:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LYue/ۥۢ۠۟ۢ;

    invoke-virtual {p0, p1}, LYue/ۥۢ۠۟ۤ;->ۥ۟۟(LYue/ۥۢ۠۟ۢ;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic ۥ۟(Ljava/lang/Object;)[LYue/ۥ۟ۧۤۢ;
    .locals 0

    check-cast p1, LYue/ۥۢ۠۟ۢ;

    invoke-virtual {p0, p1}, LYue/ۥۢ۠۟ۤ;->ۥ۟۟۟۟(LYue/ۥۢ۠۟ۢ;)[LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟(LYue/ۥۢ۠۟ۢ;)Z
    .locals 0
    .param p1    # LYue/ۥۢ۠۟ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e0\u06df\u06e2<",
            "*>;)Z"
        }
    .end annotation

    iget-object p1, p0, LYue/ۥۢ۠۟ۤ;->_state:Ljava/lang/Object;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {}, LYue/ۥۣۢ۠۟;->ۥ۟()LYue/ۥۢ۠ۦۢ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۢ۠۟ۤ;->_state:Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public final ۥ۟۟۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۨ۠;

    invoke-static {p1}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LYue/ۥۣ۟ۨ۠;-><init>(LYue/ۥ۟ۧۤۢ;I)V

    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟ۢ۟()V

    sget-object v1, LYue/ۥۢ۠۟ۤ;->ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۣۢ۠۟;->ۥ۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v2

    invoke-static {v1, p0, v2, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-static {v1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-static {p1}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_1
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_2

    return-object v0

    :cond_2
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟۟۟(LYue/ۥۢ۠۟ۢ;)[LYue/ۥ۟ۧۤۢ;
    .locals 0
    .param p1    # LYue/ۥۢ۠۟ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e0\u06df\u06e2<",
            "*>;)[",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۢ۠۟ۤ;->_state:Ljava/lang/Object;

    sget-object p1, LYue/ۥ۟۟ۢۥ;->ۥ:[LYue/ۥ۟ۧۤۢ;

    return-object p1
.end method

.method public final ۥ۟۟۟۠()V
    .locals 3

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۠۟ۤ;->_state:Ljava/lang/Object;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {}, LYue/ۥۣۢ۠۟;->ۥ۟۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v1

    if-ne v0, v1, :cond_2

    return-void

    :cond_2
    invoke-static {}, LYue/ۥۣۢ۠۟;->ۥ۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v1

    if-ne v0, v1, :cond_3

    sget-object v1, LYue/ۥۢ۠۟ۤ;->ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۣۢ۠۟;->ۥ۟۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_3
    sget-object v1, LYue/ۥۢ۠۟ۤ;->ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۣۢ۠۟;->ۥ۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۣ۟ۨ۠;

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-static {v1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۥ۟۟۟ۡ()Z
    .locals 2

    sget-object v0, LYue/ۥۢ۠۟ۤ;->ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۣۢ۠۟;->ۥ۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-static {}, LYue/ۥۣۢ۠۟;->ۥ۟۟()LYue/ۥۢ۠ۦۢ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
