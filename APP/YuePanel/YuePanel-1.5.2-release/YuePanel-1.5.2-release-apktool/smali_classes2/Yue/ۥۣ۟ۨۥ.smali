.class public final LYue/ۥۣ۟ۨۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۢ۟ۧۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟:J
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/lang/ref/WeakReference;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟۟:Ljava/lang/Thread;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟۠:Ljava/lang/ref/WeakReference;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e8;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;LYue/ۥۢ۟ۧۥ;J)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢ۟ۧۥ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥۣ۟ۨۥ;->ۥ:LYue/ۥۢ۟ۧۥ;

    iput-wide p3, p0, LYue/ۥۣ۟ۨۥ;->ۥ۟:J

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LYue/ۥۣ۟ۨۥ;->ۥ۟۟:Ljava/lang/ref/WeakReference;

    const-string p1, "CREATED"

    iput-object p1, p0, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic ۥ(LYue/ۥۣ۟ۨۥ;LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۧۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟ۥ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۧۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

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

    const-string v1, "DebugCoroutineInfo(state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",context="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟()LYue/ۥ۟ۧۦۥ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۥ;->ۥ:LYue/ۥۢ۟ۧۥ;

    if-nez v0, :cond_0

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, LYue/ۥۣ۟ۨۥ$ۥ;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, LYue/ۥۣ۟ۨۥ$ۥ;-><init>(LYue/ۥۣ۟ۨۥ;LYue/ۥۢ۟ۧۥ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v1}, LYue/ۥۡۨۢۢ;->ۥ۟(LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۨۢ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۨۢۦ;->ۥ۟۠ۧۦ(LYue/ۥۡۨۢ;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥ۟ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۥ;->ۥ۟۟:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۧۦۥ;

    return-object v0
.end method

.method public final ۥ۟۟۟()LYue/ۥۢ۟ۧۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۥ;->ۥ:LYue/ۥۢ۟ۧۥ;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۨۥ;->ۥ۟()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟۠()LYue/ۥ۟ۧۧۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۠:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۧۧۨ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/util/List;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۠()LYue/ۥ۟ۧۧۨ;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, LYue/ۥ۟ۧۧۨ;->getStackTraceElement()Ljava/lang/StackTraceElement;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {v0}, LYue/ۥ۟ۧۧۨ;->getCallerFrame()LYue/ۥ۟ۧۧۨ;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final ۥۣ۟۟۟(LYue/ۥ۟ۧۧۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۧۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۠:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final ۥ۟۟۟ۤ(Ljava/lang/String;LYue/ۥ۟ۧۤۢ;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟:Ljava/lang/String;

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "SUSPENDED"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۠()LYue/ۥ۟ۧۧۨ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟:Ljava/lang/String;

    instance-of v0, p2, LYue/ۥ۟ۧۧۨ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, LYue/ۥ۟ۧۧۨ;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    invoke-virtual {p0, p2}, LYue/ۥۣ۟ۨۥ;->ۥۣ۟۟۟(LYue/ۥ۟ۧۧۨ;)V

    const-string p2, "RUNNING"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    :cond_2
    iput-object v1, p0, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۟:Ljava/lang/Thread;

    return-void
.end method

.method public final ۥ۟۟۟ۥ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۧۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
            "-",
            "Ljava/lang/StackTraceElement;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e8;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, LYue/ۥۣ۟ۨۥ$ۥ۟;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LYue/ۥۣ۟ۨۥ$ۥ۟;

    iget v1, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥ۟۟۠ۨ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥ۟۟۠ۨ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۨۥ$ۥ۟;

    invoke-direct {v0, p0, p3}, LYue/ۥۣ۟ۨۥ$ۥ۟;-><init>(LYue/ۥۣ۟ۨۥ;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p3, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥ۟۟۠ۨ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p1, LYue/ۥ۟ۧۧۨ;

    iget-object p2, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p2, LYue/ۥۡۨۢ۠;

    iget-object v2, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۣ۟ۨۥ;

    invoke-static {p3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    move-object v2, p0

    :goto_1
    if-nez p2, :cond_3

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_3
    invoke-interface {p2}, LYue/ۥ۟ۧۧۨ;->getStackTraceElement()Ljava/lang/StackTraceElement;

    move-result-object p3

    if-eqz p3, :cond_5

    iput-object v2, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۨۥ$ۥ۟;->ۥ۟۟۠ۨ:I

    invoke-virtual {p1, p3, v0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v4, p2

    move-object p2, p1

    move-object p1, v4

    :goto_2
    move-object v4, p2

    move-object p2, p1

    move-object p1, v4

    :cond_5
    invoke-interface {p2}, LYue/ۥ۟ۧۧۨ;->getCallerFrame()LYue/ۥ۟ۧۧۨ;

    move-result-object p2

    if-eqz p2, :cond_6

    goto :goto_1

    :cond_6
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method
