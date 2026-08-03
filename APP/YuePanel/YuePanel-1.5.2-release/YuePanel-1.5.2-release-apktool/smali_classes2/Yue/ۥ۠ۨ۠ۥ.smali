.class public LYue/ۥ۠ۨ۠ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۥۦۧ;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;,
        LYue/ۥ۠ۨ۠ۥ$ۥ۟;,
        LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;,
        LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;,
        LYue/ۥ۠ۨ۠ۥ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,671:1\n91#1,3:675\n91#1,3:678\n1#2:672\n155#3,2:673\n155#3,2:681\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n*L\n154#1:675,3\n177#1:678,3\n99#1:673,2\n546#1:681,2\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۥ۟۟۠ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field volatile synthetic _next:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field volatile synthetic _prev:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic _removedRef:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_next"

    const-class v1, LYue/ۥ۠ۨ۠ۥ;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_prev"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_removedRef"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟۠ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LYue/ۥ۠ۨ۠ۥ;->_next:Ljava/lang/Object;

    iput-object p0, p0, LYue/ۥ۠ۨ۠ۥ;->_prev:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠ۨ۠ۥ;->_removedRef:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic ۥۣ۟۟ۨ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤۦ(LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۤ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۟(LYue/ۥ۠ۨ۠ۥ;)V

    return-void
.end method

.method public static final synthetic ۥ۟۟ۤ۟(LYue/ۥ۠ۨ۠ۥ;)LYue/ۥۡۦۤ۟;
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۦۡ()LYue/ۥۡۦۤ۟;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟ۡ;

    invoke-direct {v1, p0}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟ۡ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۤ۠(LYue/ۥ۠ۨ۠ۥ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۢ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤۤ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final ۥ۟۟ۤۡ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣ۠۠ۨ;)Z
    .locals 2
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۠;

    invoke-direct {v0, p1, p2}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۠;-><init>(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣ۠۠ۨ;)V

    :goto_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۢ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object p2

    invoke-virtual {p2, p1, p0, v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۦۢ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;)I

    move-result p2

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    return v1
.end method

.method public final ۥ۟۟ۤۢ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣ۠ۡ۟;)Z
    .locals 2
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۢ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    invoke-interface {p2, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {v0, p1, p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤۤ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method public final ۥۣ۟۟ۤ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠۠ۨ;)Z
    .locals 3
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            "Ljava/lang/Boolean;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۠;

    invoke-direct {v0, p1, p3}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۠;-><init>(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣ۠۠ۨ;)V

    :goto_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۢ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object p3

    invoke-interface {p2, p3}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p3, p1, p0, v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۦۢ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;)I

    move-result p3

    const/4 v1, 0x1

    if-eq p3, v1, :cond_2

    const/4 v1, 0x2

    if-eq p3, v1, :cond_1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    return v1
.end method

.method public final ۥ۟۟ۤۤ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)Z
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, p0, p2, p1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1, p2}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۟(LYue/ۥ۠ۨ۠ۥ;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۥ۟۟ۤۥ(LYue/ۥ۠ۨ۠ۥ;)Z
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, p0, p1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۟(LYue/ۥ۠ۨ۠ۥ;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۥ۟۟ۤۦ(LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;
    .locals 7

    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ;->_prev:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    const/4 v1, 0x0

    move-object v2, v0

    :goto_1
    move-object v3, v1

    :goto_2
    iget-object v4, v2, LYue/ۥ۠ۨ۠ۥ;->_next:Ljava/lang/Object;

    if-ne v4, p0, :cond_2

    if-ne v0, v2, :cond_0

    return-object v2

    :cond_0
    sget-object v1, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, v0, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-object v2

    :cond_2
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۥ()Z

    move-result v5

    if-eqz v5, :cond_3

    return-object v1

    :cond_3
    if-ne v4, p1, :cond_4

    return-object v2

    :cond_4
    instance-of v5, v4, LYue/ۥۣۣۡۡ;

    if-eqz v5, :cond_6

    if-eqz p1, :cond_5

    move-object v0, v4

    check-cast v0, LYue/ۥۣۣۡۡ;

    invoke-virtual {p1, v0}, LYue/ۥۣۣۡۡ;->ۥ۟(LYue/ۥۣۣۡۡ;)Z

    move-result v0

    if-eqz v0, :cond_5

    return-object v1

    :cond_5
    check-cast v4, LYue/ۥۣۣۡۡ;

    invoke-virtual {v4, v2}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    instance-of v5, v4, LYue/ۥۡۦۤ۟;

    if-eqz v5, :cond_9

    if-eqz v3, :cond_8

    sget-object v5, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    check-cast v4, LYue/ۥۡۦۤ۟;

    iget-object v4, v4, LYue/ۥۡۦۤ۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    invoke-static {v5, v3, v2, v4}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    move-object v2, v3

    goto :goto_1

    :cond_8
    iget-object v2, v2, LYue/ۥ۠ۨ۠ۥ;->_prev:Ljava/lang/Object;

    check-cast v2, LYue/ۥ۠ۨ۠ۥ;

    goto :goto_2

    :cond_9
    move-object v3, v4

    check-cast v3, LYue/ۥ۠ۨ۠ۥ;

    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    goto :goto_2
.end method

.method public final ۥ۟۟ۤۧ(LYue/ۥ۠ۨ۠ۥ;)LYue/ۥ۠ۨ۠ۥ$ۥ۟;
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            ">(TT;)",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5$\u06e5\u06df<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۨ۠ۥ$ۥ۟;-><init>(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V

    return-object v0
.end method

.method public final ۥ۟۟ۤۨ()LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5$\u06e5\u06df\u06df\u06df\u06df<",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;

    invoke-direct {v0, p0}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;-><init>(LYue/ۥ۠ۨ۠ۥ;)V

    return-object v0
.end method

.method public final ۥ۟۟ۥ(LYue/ۥ۠ۨ۠ۥ;)LYue/ۥ۠ۨ۠ۥ;
    .locals 1

    :goto_0
    invoke-virtual {p1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۥ()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p1, LYue/ۥ۠ۨ۠ۥ;->_prev:Ljava/lang/Object;

    check-cast p1, LYue/ۥ۠ۨ۠ۥ;

    goto :goto_0
.end method

.method public final ۥ۟۟ۥ۟(LYue/ۥ۠ۨ۠ۥ;)V
    .locals 2

    :cond_0
    iget-object v0, p1, LYue/ۥ۠ۨ۠ۥ;->_prev:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_1

    return-void

    :cond_1
    sget-object v1, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p1, v0, p0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۥ()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤۦ(LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;

    :cond_2
    return-void
.end method

.method public final ۥ۟۟ۥ۠()Ljava/lang/Object;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ;->_next:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥۣۣۡۡ;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, LYue/ۥۣۣۡۡ;

    invoke-virtual {v0, p0}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final ۥ۟۟ۥۡ()LYue/ۥ۠ۨ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨ۠ۤ;->ۥ۟۟۟ۢ(Ljava/lang/Object;)LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۥۢ()LYue/ۥ۠ۨ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤۦ(LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ;->_prev:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {p0, v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ(LYue/ۥ۠ۨ۠ۥ;)LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟ۥۣ()V
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۡۦۤ۟;

    iget-object v0, v0, LYue/ۥۡۦۤ۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۤ()V

    return-void
.end method

.method public final ۥ۟۟ۥۤ()V
    .locals 3
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    move-object v0, p0

    :goto_0
    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LYue/ۥۡۦۤ۟;

    if-eqz v2, :cond_0

    check-cast v1, LYue/ۥۡۦۤ۟;

    iget-object v0, v1, LYue/ۥۡۦۤ۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤۦ(LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;

    return-void
.end method

.method public ۥ۟۟ۥۥ()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, LYue/ۥۡۦۤ۟;

    return v0
.end method

.method public final ۥ۟۟ۥۦ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Boolean;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5$\u06e5\u06df\u06df;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۠;

    invoke-direct {v0, p1, p2}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۠;-><init>(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣ۠۠ۨ;)V

    return-object v0
.end method

.method public ۥ۟۟ۥۧ()LYue/ۥ۠ۨ۠ۥ;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LYue/ۥۡۦۤ۟;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۡۦۤ۟;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, v0, LYue/ۥۡۦۤ۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    :cond_1
    return-object v2
.end method

.method public ۥ۟۟ۥۨ()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۦ۠()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final synthetic ۥ۟۟ۦ(LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;)TT;"
        }
    .end annotation

    :goto_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    const/4 v1, 0x0

    if-ne v0, p0, :cond_0

    return-object v1

    :cond_0
    const/4 v2, 0x3

    const-string v3, "T"

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    instance-of v2, v0, Ljava/lang/Object;

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۥ()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۦ۠()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v1

    if-nez v1, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {v1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۤ()V

    goto :goto_0
.end method

.method public final ۥ۟۟ۦ۟()LYue/ۥ۠ۨ۠ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    :goto_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۨ()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۣ()V

    goto :goto_0
.end method

.method public final ۥ۟۟ۦ۠()LYue/ۥ۠ۨ۠ۥ;
    .locals 4
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LYue/ۥۡۦۤ۟;

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥۡۦۤ۟;

    iget-object v0, v0, LYue/ۥۡۦۤ۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    return-object v0

    :cond_1
    if-ne v0, p0, :cond_2

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    return-object v0

    :cond_2
    move-object v1, v0

    check-cast v1, LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {v1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۦۡ()LYue/ۥۡۦۤ۟;

    move-result-object v2

    sget-object v3, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v0, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤۦ(LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;

    return-object v0
.end method

.method public final ۥ۟۟ۦۡ()LYue/ۥۡۦۤ۟;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ;->_removedRef:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۦۤ۟;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۡۦۤ۟;

    invoke-direct {v0, p0}, LYue/ۥۡۦۤ۟;-><init>(LYue/ۥ۠ۨ۠ۥ;)V

    sget-object v1, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟۠ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟ۦۢ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;)I
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p3, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ;

    invoke-static {v0, p0, p2, p3}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p3, p0}, LYue/ۥ۟ۢ۠;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    :goto_0
    return p1
.end method

.method public final ۥ۟۟ۦۣ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    return-void
.end method
