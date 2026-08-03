.class public final LYue/ۥۡۧۨۥ;
.super LYue/ۥۣ۠ۨ۠;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۧۨۤ;
.implements LYue/ۥۡۨ;
.implements LYue/ۥ۟ۧۤۢ;
.implements LYue/ۥ۟ۧۧۨ;


# annotations
.annotation build LYue/ۥۡۥۤ۠;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۧۨۥ$ۥ۟۟۟;,
        LYue/ۥۡۧۨۥ$ۥ۟۟;,
        LYue/ۥۡۧۨۥ$ۥ;,
        LYue/ۥۡۧۨۥ$ۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e8\u06e0\u06e3;",
        "LYue/\u06e5\u06e1\u06e7\u06e8\u06e4<",
        "TR;>;",
        "LYue/\u06e5\u06e1\u06e8<",
        "TR;>;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "TR;>;",
        "LYue/\u06e5\u06df\u06e7\u06e7\u06e8;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectBuilderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 7 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 8 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,658:1\n278#1:662\n279#1:664\n280#1,7:667\n287#1,5:678\n278#1:683\n279#1:685\n280#1,3:688\n283#1,9:693\n1#2:659\n1#2:663\n1#2:684\n155#3,2:660\n155#3,2:665\n155#3,2:686\n155#3,2:704\n155#3,2:712\n219#4:674\n220#4:677\n57#5,2:675\n57#5,2:691\n167#5:703\n13#6:702\n645#7,6:706\n17#8:714\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectBuilderImpl\n*L\n296#1:662\n296#1:664\n296#1:667,7\n296#1:678,5\n307#1:683\n307#1:685\n307#1:688,3\n307#1:693,9\n296#1:663\n307#1:684\n279#1:660,2\n296#1:665,2\n307#1:686,2\n362#1:704,2\n484#1:712,2\n298#1:674\n298#1:677\n298#1:675,2\n307#1:691,2\n356#1:703\n330#1:702\n384#1:706,6\n645#1:714\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic _result:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field volatile synthetic _state:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_state"

    const-class v1, LYue/ۥۡۧۨۥ;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_result"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥۣ۠ۨ۠;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۧۨۥ;->_state:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۧۨۥ;->_result:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۡۧۨۥ;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method private final ۥ۟۟ۢ۟()V
    .locals 7

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    sget-object v1, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {v0, v1}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LYue/ۥ۠ۦ۟ۡ;

    if-nez v1, :cond_0

    return-void

    :cond_0
    new-instance v4, LYue/ۥۡۧۨۥ$ۥ۟۟۟;

    invoke-direct {v4, p0}, LYue/ۥۡۧۨۥ$ۥ۟۟۟;-><init>(LYue/ۥۡۧۨۥ;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LYue/ۥ۠ۦ۟ۡ$ۥ;->ۥ۟۟۟۠(LYue/ۥ۠ۦ۟ۡ;ZZLYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥۣۣ۠۟;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥۡۧۨۥ;->ۥۣ۟۟ۧ(LYue/ۥۣۣ۠۟;)V

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۡ۠()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, LYue/ۥۣۣ۠۟;->ۥ۟۟ۡۥ()V

    :cond_1
    return-void
.end method

.method public static final synthetic ۥ۟۟ۦۨ(LYue/ۥۡۧۨۥ;)V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧ()V

    return-void
.end method


# virtual methods
.method public getCallerFrame()LYue/ۥ۟ۧۧۨ;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    instance-of v1, v0, LYue/ۥ۟ۧۧۨ;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥ۟ۧۧۨ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()LYue/ۥ۟ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    invoke-interface {v0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    return-object v0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۨۥ;->_result:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LYue/ۥ۟ۦۣۨ;->ۥ۟۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, p0, v2, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    sget-object v0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, p0, v1, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥۣ۟۟۟(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SelectInstance(state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۧۨۥ;->_state:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۧۨۥ;->_result:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)Ljava/lang/Object;
    .locals 3
    .param p1    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    :cond_0
    :goto_0
    iget-object v0, p0, LYue/ۥۡۧۨۥ;->_state:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    if-nez p1, :cond_1

    sget-object v0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, v1, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_1
    new-instance v0, LYue/ۥۡۧۨۥ$ۥ۟۟;

    invoke-direct {v0, p1}, LYue/ۥۡۧۨۥ$ۥ۟۟;-><init>(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)V

    sget-object v1, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, p0, v2, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, LYue/ۥۡۧۨۥ$ۥ۟۟;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧ()V

    sget-object p1, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object p1

    :cond_3
    instance-of v1, v0, LYue/ۥۣۣۡۡ;

    if-eqz v1, :cond_7

    if-eqz p1, :cond_6

    invoke-virtual {p1}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ()LYue/ۥ۟ۢ۠;

    move-result-object v1

    instance-of v2, v1, LYue/ۥۡۧۨۥ$ۥ;

    if-eqz v2, :cond_5

    move-object v2, v1

    check-cast v2, LYue/ۥۡۧۨۥ$ۥ;

    iget-object v2, v2, LYue/ۥۡۧۨۥ$ۥ;->ۥ۟:LYue/ۥۡۧۨۥ;

    if-eq v2, p0, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot use matching select clauses on the same object"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    move-object v2, v0

    check-cast v2, LYue/ۥۣۣۡۡ;

    invoke-virtual {v1, v2}, LYue/ۥۣۣۡۡ;->ۥ۟(LYue/ۥۣۣۡۡ;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object p1, LYue/ۥ۟ۢ۟ۨ;->ۥ۟:Ljava/lang/Object;

    return-object p1

    :cond_6
    check-cast v0, LYue/ۥۣۣۡۡ;

    invoke-virtual {v0, p0}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_7
    if-nez p1, :cond_8

    return-object v2

    :cond_8
    iget-object p1, p1, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;

    if-ne v0, p1, :cond_9

    sget-object p1, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object p1

    :cond_9
    return-object v2
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥ۟ۢ۟ۥ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥ۟ۢ۟ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, LYue/ۥۡۧۨۥ$ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۧۨۥ$ۥ;-><init>(LYue/ۥۡۧۨۥ;LYue/ۥ۟ۢ۟ۥ;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۢ۠;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥۡۧۨۦ;LYue/ۥۣ۠ۡ۟;)V
    .locals 0
    .param p1    # LYue/ۥۡۧۨۦ;
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
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e6;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1, p0, p2}, LYue/ۥۡۧۨۦ;->ۥ۟۟ۡۧ(LYue/ۥۡۨ;LYue/ۥۣ۠ۡ۟;)V

    return-void
.end method

.method public ۥ۟۟۠ۦ(LYue/ۥۡۧۨۧ;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p1    # LYue/ۥۡۧۨۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Q:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
            "+TQ;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TQ;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1, p0, p2}, LYue/ۥۡۧۨۧ;->ۥ۟۟ۡ۟(LYue/ۥۡۨ;LYue/ۥۣ۠ۢۢ;)V

    return-void
.end method

.method public ۥ۟۟۠ۧ()Z
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥۡۧۨۥ;->ۥ۟۟۟۟(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected trySelectIdempotent result "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public ۥ۟۟ۡ۠()Z
    .locals 2

    :goto_0
    iget-object v0, p0, LYue/ۥۡۧۨۥ;->_state:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    instance-of v1, v0, LYue/ۥۣۣۡۡ;

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥۣۣۡۡ;

    invoke-virtual {v0, p0}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟ۡۦ()LYue/ۥ۟ۧۤۢ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "TR;>;"
        }
    .end annotation

    return-object p0
.end method

.method public ۥ۟۟ۢۥ(Ljava/lang/Throwable;)V
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۨۥ;->_result:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    new-instance v0, LYue/ۥ۟ۦۣۢ;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, LYue/ۥ۟ۦۣۢ;-><init>(Ljava/lang/Throwable;ZILYue/ۥ۟ۨۥۢ;)V

    sget-object v1, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, p0, v2, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-object v0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, p0, v1, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    invoke-static {v0}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v0

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟ۢۧ(LYue/ۥۡۧۨۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p1    # LYue/ۥۡۧۨۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            "Q:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e8<",
            "-TP;+TQ;>;TP;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TQ;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1, p0, p2, p3}, LYue/ۥۡۧۨۨ;->ۥ۟۟۠ۥ(LYue/ۥۡۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V

    return-void
.end method

.method public ۥۣ۟۟(LYue/ۥۣۣ۠۟;)V
    .locals 2
    .param p1    # LYue/ۥۣۣ۠۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    new-instance v0, LYue/ۥۡۧۨۥ$ۥ۟;

    invoke-direct {v0, p1}, LYue/ۥۡۧۨۥ$ۥ۟;-><init>(LYue/ۥۣۣ۠۟;)V

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۡ۠()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤ۠(LYue/ۥ۠ۨ۠ۥ;)V

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۡ۠()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, LYue/ۥۣۣ۠۟;->ۥ۟۟ۡۥ()V

    return-void
.end method

.method public ۥۣ۟۟ۢ(JLYue/ۥۣ۠ۡ۟;)V
    .locals 2
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۡۦ()LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    invoke-static {p3, p1}, LYue/ۥۣۢ۠۠;->ۥ۟۟(LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, LYue/ۥۡۧۨۥ$ۥ۟۟۟۟;

    invoke-direct {v0, p0, p3}, LYue/ۥۡۧۨۥ$ۥ۟۟۟۟;-><init>(LYue/ۥۡۧۨۥ;LYue/ۥۣ۠ۡ۟;)V

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p3

    invoke-static {p3}, LYue/ۥ۟ۨۨ۟;->ۥ۟۟۟(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۨۨ;

    move-result-object p3

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v1

    invoke-interface {p3, p1, p2, v0, v1}, LYue/ۥ۟ۨۨ;->ۥۣ۟۟(JLjava/lang/Runnable;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣۣ۠۟;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۧۨۥ;->ۥۣ۟۟(LYue/ۥۣۣ۠۟;)V

    return-void
.end method

.method public ۥۣ۟۟ۤ(LYue/ۥۡۧۨۨ;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p1    # LYue/ۥۡۧۨۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            "Q:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e8<",
            "-TP;+TQ;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TQ;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LYue/ۥۡۧۨۤ$ۥ;->ۥ(LYue/ۥۡۧۨۤ;LYue/ۥۡۧۨۨ;LYue/ۥۣ۠ۢۢ;)V

    return-void
.end method

.method public final ۥ۟۟ۧ()V
    .locals 2

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧ۠()LYue/ۥۣۣ۠۟;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LYue/ۥۣۣ۠۟;->ۥ۟۟ۡۥ()V

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    :goto_0
    invoke-static {v0, p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, LYue/ۥۡۧۨۥ$ۥ۟;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, LYue/ۥۡۧۨۥ$ۥ۟;

    iget-object v1, v1, LYue/ۥۡۧۨۥ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣۣ۠۟;

    invoke-interface {v1}, LYue/ۥۣۣ۠۟;->ۥ۟۟ۡۥ()V

    :cond_1
    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۡ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۥ۟۟ۧ۟(LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۨۥ;->_result:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, p0, v2, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_1
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-object v0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, p0, v1, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already resumed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟ۧ۠()LYue/ۥۣۣ۠۟;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۨۥ;->_parentHandle:Ljava/lang/Object;

    check-cast v0, LYue/ۥۣۣ۠۟;

    return-object v0
.end method

.method public final ۥ۟۟ۧۡ()Ljava/lang/Object;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۡ۠()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۢ۟()V

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۨۥ;->_result:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-object v0, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, p0, v1, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, LYue/ۥۡۧۨۥ;->_result:Ljava/lang/Object;

    :cond_2
    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ()Ljava/lang/Object;

    move-result-object v1

    if-eq v0, v1, :cond_4

    instance-of v1, v0, LYue/ۥ۟ۦۣۢ;

    if-nez v1, :cond_3

    return-object v0

    :cond_3
    check-cast v0, LYue/ۥ۟ۦۣۢ;

    iget-object v0, v0, LYue/ۥ۟ۦۣۢ;->ۥ:Ljava/lang/Throwable;

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟ۧۢ(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟۠ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_2

    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧۡ()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LYue/ۥ۟ۦۣۢ;

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥ۟ۦۣۢ;

    iget-object v0, v0, LYue/ۥ۟ۦۣۢ;->ۥ:Ljava/lang/Throwable;

    if-eq v0, p1, :cond_2

    :cond_1
    invoke-virtual {p0}, LYue/ۥۡۧۨۥ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥ۟ۧۧ۠;->ۥ۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۥۣ۟۟ۧ(LYue/ۥۣۣ۠۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۧۨۥ;->_parentHandle:Ljava/lang/Object;

    return-void
.end method
