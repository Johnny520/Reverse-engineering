.class public LYue/ۥ۠ۨ۠ۥ$ۥ۟;
.super LYue/ۥ۠ۨ۠ۥ$ۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
        ">",
        "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5$\u06e5;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,671:1\n1#2:672\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _affectedNode:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥ۠ۨ۠ۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥ۠ۨ۠ۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_affectedNode"

    const-class v2, LYue/ۥ۠ۨ۠ۥ$ۥ۟;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥ۠ۨ۠ۥ$ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    iput-object p2, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ;

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->_affectedNode:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ;

    iget-object p2, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    invoke-static {p1, p2}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)V
    .locals 2
    .param p1    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    iget-object p1, p1, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    invoke-static {v0, p0, v1, p1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥ۠ۨ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->_affectedNode:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    return-object v0
.end method

.method public final ۥۣ۟۟۟()LYue/ۥ۠ۨ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    return-object v0
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥ۠ۨ۠ۥ;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final ۥ۟۟۟ۧ(LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;
    .locals 1
    .param p1    # LYue/ۥۣۣۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    invoke-static {v0, p1}, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟ۨ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;
    .locals 1
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

    iget-object p2, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ;

    sget-object v0, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p2, p2, p1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ;

    sget-object p2, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    invoke-static {p2, p1, p1, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ;

    return-object p1
.end method
