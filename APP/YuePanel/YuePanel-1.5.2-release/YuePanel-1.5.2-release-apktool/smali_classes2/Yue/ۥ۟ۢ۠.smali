.class public abstract LYue/ۥ۟ۢ۠;
.super LYue/ۥۣۣۡۡ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۥۦۧ;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e3\u06e3\u06e1;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _consensus:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_consensus"

    const-class v2, LYue/ۥ۟ۢ۠;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۢ۠;->ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LYue/ۥۣۣۡۡ;-><init>()V

    sget-object v0, LYue/ۥ۟ۢ۟ۨ;->ۥ:Ljava/lang/Object;

    iput-object v0, p0, LYue/ۥ۟ۢ۠;->_consensus:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥ۟ۢ۠;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;"
        }
    .end annotation

    return-object p0
.end method

.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢ۠;->_consensus:Ljava/lang/Object;

    sget-object v1, LYue/ۥ۟ۢ۟ۨ;->ۥ:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۠;->ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢ۠;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, p1, v0}, LYue/ۥ۟ۢ۠;->ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public abstract ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation
.end method

.method public final ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢ۠;->_consensus:Ljava/lang/Object;

    sget-object v1, LYue/ۥ۟ۢ۟ۨ;->ۥ:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, LYue/ۥ۟ۢ۠;->ۥ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v1, p1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    iget-object p1, p0, LYue/ۥ۟ۢ۠;->_consensus:Ljava/lang/Object;

    return-object p1
.end method

.method public final ۥ۟۟۟۠()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢ۠;->_consensus:Ljava/lang/Object;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ۥ۟۟۟ۢ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۢ۠;->_consensus:Ljava/lang/Object;

    sget-object v1, LYue/ۥ۟ۢ۟ۨ;->ۥ:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
