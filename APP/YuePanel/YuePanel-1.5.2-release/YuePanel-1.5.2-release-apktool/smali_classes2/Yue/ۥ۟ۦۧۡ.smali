.class public final LYue/ۥ۟ۦۧۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۢۡ;


# annotations
.annotation build LYue/ۥۡۢۨ۠;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۦۧۡ$ۥ۟;,
        LYue/ۥ۟ۦۧۡ$ۥ۟۟;,
        LYue/ۥ۟ۦۧۡ$ۥ;,
        LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06df\u06e3\u06e2\u06e1<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConflatedBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBroadcastChannel.kt\nkotlinx/coroutines/channels/ConflatedBroadcastChannel\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,295:1\n155#2,2:296\n155#2,2:299\n155#2,2:301\n155#2,2:304\n155#2,2:308\n18#3:298\n1#4:303\n13536#5,2:306\n13536#5,2:310\n*S KotlinDebug\n*F\n+ 1 ConflatedBroadcastChannel.kt\nkotlinx/coroutines/channels/ConflatedBroadcastChannel\n*L\n74#1:296,2\n101#1:299,2\n121#1:301,2\n160#1:304,2\n245#1:308,2\n92#1:298\n166#1:306,2\n254#1:310,2\n*E\n"
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥ۟ۦۧۡ$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final synthetic ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۥ۟۟۠ۥ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final ۥ۟۟۠ۧ:LYue/ۥ۟ۦۧۡ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۨ:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟ۡ:LYue/ۥ۟ۦۧۡ$ۥ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1$\u06e5\u06df\u06df<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private volatile synthetic _state:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic _updating:I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic onCloseHandler:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۟ۦۧۡ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۟ۦۧۡ$ۥ۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۟ۦۧۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۦۧۡ$ۥ۟;

    new-instance v0, LYue/ۥ۟ۦۧۡ$ۥ;

    invoke-direct {v0, v1}, LYue/ۥ۟ۦۧۡ$ۥ;-><init>(Ljava/lang/Throwable;)V

    sput-object v0, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۦۧۡ$ۥ;

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v2, "UNDEFINED"

    invoke-direct {v0, v2}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۨ:LYue/ۥۢ۠ۦۢ;

    new-instance v2, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    invoke-direct {v2, v0, v1}, LYue/ۥ۟ۦۧۡ$ۥ۟۟;-><init>(Ljava/lang/Object;[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)V

    sput-object v2, LYue/ۥ۟ۦۧۡ;->ۥ۟۟ۡ:LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    const-string v0, "_state"

    const-class v1, LYue/ۥ۟ۦۧۡ;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_updating"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۥ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "onCloseHandler"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, LYue/ۥ۟ۦۧۡ;->ۥ۟۟ۡ:LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    iput-object v0, p0, LYue/ۥ۟ۦۧۡ;->_state:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, LYue/ۥ۟ۦۧۡ;->_updating:I

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, LYue/ۥ۟ۦۧۡ;->onCloseHandler:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, LYue/ۥ۟ۦۧۡ;-><init>()V

    .line 6
    sget-object v0, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v1, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LYue/ۥ۟ۦۧۡ$ۥ۟۟;-><init>(Ljava/lang/Object;[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)V

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic ۥ۟(LYue/ۥ۟ۦۧۡ;LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۟ۢ(LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥ۟ۦۧۡ;LYue/ۥۡۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۟ۨ(LYue/ۥۡۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۤ()V
    .locals 0

    return-void
.end method

.method private final ۥ۟۟۟ۦ(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, LYue/ۥ۟ۦۧۡ;->onCloseHandler:Ljava/lang/Object;

    if-eqz v0, :cond_0

    sget-object v1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟ۢ:LYue/ۥۢ۠ۦۢ;

    if-eq v0, v1, :cond_0

    sget-object v2, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v0, v1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-static {v0, v1}, LYue/ۥۣۢۢ۟;->ۥ۟۟۠۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۠ۡ۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final ۥ۟۟۟ۨ(LYue/ۥۡۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8<",
            "-TR;>;TE;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "-TE;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۡۨ;->ۥ۟۟۠ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p2}, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۟ۧ(Ljava/lang/Object;)LYue/ۥ۟ۦۧۡ$ۥ;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LYue/ۥ۟ۦۧۡ$ۥ;->ۥ()Ljava/lang/Throwable;

    move-result-object p2

    invoke-interface {p1, p2}, LYue/ۥۡۨ;->ۥ۟۟ۢۥ(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-interface {p1}, LYue/ۥۡۨ;->ۥ۟۟ۡۦ()LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    invoke-static {p3, p0, p1}, LYue/ۥۣۢ۠۠;->ۥ۟۟۟(LYue/ۥۣ۠ۢۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public offer(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in the favour of \'trySend\' method"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "trySend(element).isSuccess"
            imports = {}
        .end subannotation
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣ۟ۢۡ$ۥ;->ۥ۟۟(LYue/ۥۣ۟ۢۡ;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public synthetic ۥ۟۟(Ljava/lang/Throwable;)Z
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧۡ;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧۡ;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۟ۧ(Ljava/lang/Object;)LYue/ۥ۟ۦۧۡ$ۥ;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_1
    invoke-virtual {p1}, LYue/ۥ۟ۦۧۡ$ۥ;->ۥ()Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method

.method public final ۥ۟۟۟ۡ([LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1$\u06e5\u06df\u06df\u06df<",
            "TE;>;",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1$\u06e5\u06df\u06df\u06df<",
            "TE;>;)[",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1$\u06e5\u06df\u06df\u06df<",
            "TE;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    filled-new-array {p2}, [LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1, p2}, LYue/ۥ۟ۢ۟۟;->ۥۣ۟ۡ۟([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    return-object p1
.end method

.method public final ۥ۟۟۟ۢ(LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1$\u06e5\u06df\u06df\u06df<",
            "TE;>;)V"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۦۧۡ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۟ۦۧۡ$ۥ;

    if-eqz v1, :cond_1

    return-void

    :cond_1
    instance-of v1, v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    if-eqz v1, :cond_2

    new-instance v1, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    move-object v2, v0

    check-cast v2, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    iget-object v3, v2, LYue/ۥ۟ۦۧۡ$ۥ۟۟;->ۥ:Ljava/lang/Object;

    iget-object v2, v2, LYue/ۥ۟ۦۧۡ$ۥ۟۟;->ۥ۟:[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    invoke-static {v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p0, v2, p1}, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠([LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    move-result-object v2

    invoke-direct {v1, v3, v2}, LYue/ۥ۟ۦۧۡ$ۥ۟۟;-><init>(Ljava/lang/Object;[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)V

    sget-object v2, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v0, v1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥۣ۟۟۟()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۧۡ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۟ۦۧۡ$ۥ;

    if-nez v1, :cond_2

    instance-of v1, v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    iget-object v0, v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;->ۥ:Ljava/lang/Object;

    sget-object v1, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۨ:LYue/ۥۢ۠ۦۢ;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    check-cast v0, LYue/ۥ۟ۦۧۡ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟ۦۧۡ$ۥ;->ۥ۟()Ljava/lang/Throwable;

    move-result-object v0

    throw v0
.end method

.method public final ۥ۟۟۟ۥ()Ljava/lang/Object;
    .locals 4
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۧۡ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۟ۦۧۡ$ۥ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    if-eqz v1, :cond_2

    sget-object v1, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۨ:LYue/ۥۢ۠ۦۢ;

    check-cast v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    iget-object v0, v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;->ۥ:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    return-object v2

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۥ۟۟۟ۧ(Ljava/lang/Object;)LYue/ۥ۟ۦۧۡ$ۥ;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1$\u06e5;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۥ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    iget-object v0, p0, LYue/ۥ۟ۦۧۡ;->_state:Ljava/lang/Object;

    instance-of v3, v0, LYue/ۥ۟ۦۧۡ$ۥ;

    if-eqz v3, :cond_1

    check-cast v0, LYue/ۥ۟ۦۧۡ$ۥ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput v2, p0, LYue/ۥ۟ۦۧۡ;->_updating:I

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :try_start_1
    instance-of v3, v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    if-eqz v3, :cond_3

    new-instance v3, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    move-object v4, v0

    check-cast v4, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    iget-object v4, v4, LYue/ۥ۟ۦۧۡ$ۥ۟۟;->ۥ۟:[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    invoke-direct {v3, p1, v4}, LYue/ۥ۟ۦۧۡ$ۥ۟۟;-><init>(Ljava/lang/Object;[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)V

    sget-object v4, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p0, v0, v3}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    check-cast v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    iget-object v0, v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;->ۥ۟:[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    if-eqz v0, :cond_2

    array-length v3, v0

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v0, v4

    invoke-virtual {v5, p1}, LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;->ۥ۟۟ۢ۟(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iput v2, p0, LYue/ۥ۟ۦۧۡ;->_updating:I

    return-object v1

    :cond_3
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    iput v2, p0, LYue/ۥ۟ۦۧۡ;->_updating:I

    throw p1
.end method

.method public final ۥ۟۟۠([LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1$\u06e5\u06df\u06df\u06df<",
            "TE;>;",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1$\u06e5\u06df\u06df\u06df<",
            "TE;>;)[",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1$\u06e5\u06df\u06df\u06df<",
            "TE;>;"
        }
    .end annotation

    array-length v0, p1

    invoke-static {p1, p2}, LYue/ۥ۟ۢ۟۠;->ۥ۟ۦۦۧ([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sub-int/2addr v0, v1

    new-array v0, v0, [LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v2, v0

    move v5, p2

    invoke-static/range {v1 .. v7}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟ۦۦ([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    add-int/lit8 v4, p2, 0x1

    const/16 v6, 0x8

    const/4 v5, 0x0

    move v3, p2

    invoke-static/range {v1 .. v7}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟ۦۦ([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    return-object v0
.end method

.method public ۥ۟۟ۡ۠()LYue/ۥۡۧۨۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e8<",
            "TE;",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "TE;>;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟۟۟;

    invoke-direct {v0, p0}, LYue/ۥ۟ۦۧۡ$ۥ۟۟۟۟;-><init>(LYue/ۥ۟ۦۧۡ;)V

    return-object v0
.end method

.method public ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۦۧۡ;->_state:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۟ۦۧۡ$ۥ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    return v2

    :cond_1
    instance-of v1, v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    if-eqz v1, :cond_4

    if-nez p1, :cond_2

    sget-object v1, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۦۧۡ$ۥ;

    goto :goto_0

    :cond_2
    new-instance v1, LYue/ۥ۟ۦۧۡ$ۥ;

    invoke-direct {v1, p1}, LYue/ۥ۟ۦۧۡ$ۥ;-><init>(Ljava/lang/Throwable;)V

    :goto_0
    sget-object v3, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v0, v1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    iget-object v0, v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟;->ۥ۟:[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    if-eqz v0, :cond_3

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-direct {p0, p1}, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۟ۦ(Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟ۡۥ()LYue/ۥۡۦۡۡ;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    invoke-direct {v0, p0}, LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;-><init>(LYue/ۥ۟ۦۧۡ;)V

    :cond_0
    iget-object v1, p0, LYue/ۥ۟ۦۧۡ;->_state:Ljava/lang/Object;

    instance-of v2, v1, LYue/ۥ۟ۦۧۡ$ۥ;

    if-eqz v2, :cond_1

    check-cast v1, LYue/ۥ۟ۦۧۡ$ۥ;

    iget-object v1, v1, LYue/ۥ۟ۦۧۡ$ۥ;->ۥ:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    return-object v0

    :cond_1
    instance-of v2, v1, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    iget-object v3, v2, LYue/ۥ۟ۦۧۡ$ۥ۟۟;->ۥ:Ljava/lang/Object;

    sget-object v4, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۨ:LYue/ۥۢ۠ۦۢ;

    if-eq v3, v4, :cond_2

    invoke-virtual {v0, v3}, LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;->ۥ۟۟ۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    new-instance v3, LYue/ۥ۟ۦۧۡ$ۥ۟۟;

    iget-object v4, v2, LYue/ۥ۟ۦۧۡ$ۥ۟۟;->ۥ:Ljava/lang/Object;

    iget-object v2, v2, LYue/ۥ۟ۦۧۡ$ۥ۟۟;->ۥ۟:[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    invoke-virtual {p0, v2, v0}, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۟ۡ([LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;

    move-result-object v2

    invoke-direct {v3, v4, v2}, LYue/ۥ۟ۦۧۡ$ۥ۟۟;-><init>(Ljava/lang/Object;[LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)V

    sget-object v2, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v3}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟ۡۨ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۟ۧ(Ljava/lang/Object;)LYue/ۥ۟ۦۧۡ$ۥ;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, LYue/ۥ۟ۤۢ۟;->ۥ۟:LYue/ۥ۟ۤۢ۟$ۥ۟;

    invoke-virtual {p1}, LYue/ۥ۟ۦۧۡ$ۥ;->ۥ()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥ۟ۤۢ۟$ۥ۟;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, LYue/ۥ۟ۤۢ۟;->ۥ۟:LYue/ۥ۟ۤۢ۟$ۥ۟;

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, v0}, LYue/ۥ۟ۤۢ۟$ۥ۟;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢ۠(LYue/ۥۣ۠ۡ۟;)V
    .locals 3
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟ۦۧۡ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p1, p0, LYue/ۥ۟ۦۧۡ;->onCloseHandler:Ljava/lang/Object;

    sget-object v0, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟ۢ:LYue/ۥۢ۠ۦۢ;

    if-ne p1, v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Another handler was already registered and successfully invoked"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Another handler was already registered: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v1, p0, LYue/ۥ۟ۦۧۡ;->_state:Ljava/lang/Object;

    instance-of v2, v1, LYue/ۥ۟ۦۧۡ$ۥ;

    if-eqz v2, :cond_2

    sget-object v2, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟ۢ:LYue/ۥۢ۠ۦۢ;

    invoke-static {v0, p0, p1, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast v1, LYue/ۥ۟ۦۧۡ$ۥ;

    iget-object v0, v1, LYue/ۥ۟ۦۧۡ$ۥ;->ۥ:Ljava/lang/Throwable;

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public ۥ۟۟ۢۡ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۧۡ;->_state:Ljava/lang/Object;

    instance-of v0, v0, LYue/ۥ۟ۦۧۡ$ۥ;

    return v0
.end method
