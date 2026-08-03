.class public LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;
.super LYue/ۥ۠ۨ۠ۥ$ۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5$\u06e5;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,671:1\n155#2,2:672\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc\n*L\n363#1:672,2\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _affectedNode:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic _originalNext:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥ۠ۨ۠ۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_affectedNode"

    const-class v1, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_originalNext"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۨ۠ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۠ۨ۠ۥ$ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->_affectedNode:Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->_originalNext:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ۥ۟۟۠۟()V
    .locals 0

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟(LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    if-ne p1, v0, :cond_0

    invoke-static {}, LYue/ۥ۠ۨ۠ۤ;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final ۥ۟۟۟۠(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 p1, 0x0

    invoke-static {p2, p1}, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟ۨ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;

    return-void
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)V
    .locals 3
    .param p1    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v1, p1, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    const/4 v2, 0x0

    invoke-static {v0, p0, v2, v1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object p1, p1, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    invoke-static {v0, p0, v2, p1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥ۠ۨ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->_affectedNode:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    return-object v0
.end method

.method public final ۥۣ۟۟۟()LYue/ۥ۠ۨ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->_originalNext:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۦ(LYue/ۥ۠ۨ۠ۥ;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    instance-of p1, p2, LYue/ۥۡۦۤ۟;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p2, LYue/ۥۡۦۤ۟;

    iget-object p1, p2, LYue/ۥۡۦۤ۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {p1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۤ()V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۥ۟۟۟ۧ(LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;
    .locals 3
    .param p1    # LYue/ۥۣۣۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    :goto_0
    iget-object v1, v0, LYue/ۥ۠ۨ۠ۥ;->_next:Ljava/lang/Object;

    instance-of v2, v1, LYue/ۥۣۣۡۡ;

    if-eqz v2, :cond_1

    check-cast v1, LYue/ۥۣۣۡۡ;

    invoke-virtual {p1, v1}, LYue/ۥۣۣۡۡ;->ۥ۟(LYue/ۥۣۣۡۡ;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v2, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {v1, v2}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    check-cast v1, LYue/ۥ۠ۨ۠ۥ;

    return-object v1
.end method

.method public final ۥ۟۟۟ۨ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p2}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤ۟(LYue/ۥ۠ۨ۠ۥ;)LYue/ۥۡۦۤ۟;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۠()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟۟۟ۢ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object v0
.end method
