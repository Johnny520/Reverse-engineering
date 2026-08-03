.class public final LYue/ۥ۟ۤۡ;
.super LYue/ۥ۟ۤۡ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e4\u06e1\u06e0<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic consumed:I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LYue/ۥ۟ۤۡ;

    const-string v1, "consumed"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦۡۡ;ZLYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V
    .locals 0
    .param p1    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p5    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TT;>;Z",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p3, p4, p5}, LYue/ۥ۟ۤۡ۠;-><init>(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    .line 5
    iput-object p1, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;

    .line 6
    iput-boolean p2, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۧ:Z

    const/4 p1, 0x0

    .line 7
    iput p1, p0, LYue/ۥ۟ۤۡ;->consumed:I

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۡۦۡۡ;ZLYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;ILYue/ۥ۟ۨۥۢ;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 1
    sget-object p3, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, -0x3

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 2
    sget-object p5, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 3
    invoke-direct/range {v0 .. v5}, LYue/ۥ۟ۤۡ;-><init>(LYue/ۥۡۦۡۡ;ZLYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
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
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget v0, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۤ:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ;->ۥ۟۟۠()V

    iget-object v0, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;

    iget-boolean v1, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۧ:Z

    invoke-static {p1, v0, v1, p2}, LYue/ۥ۠ۢۤ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥۡۦۡۡ;ZLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_1
    invoke-super {p0, p1, p2}, LYue/ۥ۟ۤۡ۠;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p1    # LYue/ۥۡۥۡۤ;
        .annotation build LYue/ۥۡۢۥ۠;
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
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۨۡۧ;

    invoke-direct {v0, p1}, LYue/ۥۡۨۡۧ;-><init>(LYue/ۥۡۨۡ۠;)V

    iget-object p1, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;

    iget-boolean v1, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۧ:Z

    invoke-static {v0, p1, v1, p2}, LYue/ۥ۠ۢۤ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥۡۦۡۡ;ZLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)LYue/ۥ۟ۤۡ۠;
    .locals 7
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")",
            "LYue/\u06e5\u06df\u06e4\u06e1\u06e0<",
            "TT;>;"
        }
    .end annotation

    new-instance v6, LYue/ۥ۟ۤۡ;

    iget-object v1, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;

    iget-boolean v2, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۧ:Z

    move-object v0, v6

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LYue/ۥ۟ۤۡ;-><init>(LYue/ۥۡۦۡۡ;ZLYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-object v6
.end method

.method public ۥۣ۟۟۟()LYue/ۥۣ۠ۢۡ;
    .locals 9
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v8, LYue/ۥ۟ۤۡ;

    iget-object v1, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;

    iget-boolean v2, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۧ:Z

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LYue/ۥ۟ۤۡ;-><init>(LYue/ۥۡۦۡۡ;ZLYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;ILYue/ۥ۟ۨۥۢ;)V

    return-object v8
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥ۟ۧۧۥ;)LYue/ۥۡۦۡۡ;
    .locals 2
    .param p1    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            ")",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ;->ۥ۟۟۠()V

    iget v0, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۤ:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۦ:LYue/ۥۡۦۡۡ;

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۟ۧ(LYue/ۥ۟ۧۧۥ;)LYue/ۥۡۦۡۡ;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final ۥ۟۟۠()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۧ:Z

    if-eqz v0, :cond_1

    sget-object v0, LYue/ۥ۟ۤۡ;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndSet(Ljava/lang/Object;I)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ReceiveChannel.consumeAsFlow can be collected just once"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method
