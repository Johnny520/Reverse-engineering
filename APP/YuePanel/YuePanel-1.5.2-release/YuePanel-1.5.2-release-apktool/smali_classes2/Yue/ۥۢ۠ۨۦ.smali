.class public abstract LYue/ۥۢ۠ۨۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Z

.field public ۥ۟۟:LYue/ۥۢۡ۟ۡ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۢ۠ۨۦ;->ۥ:Ljava/lang/String;

    .line 3
    iput-boolean p2, p0, LYue/ۥۢ۠ۨۦ;->ۥ۟:Z

    const-wide/16 p1, -0x1

    .line 4
    iput-wide p1, p0, LYue/ۥۢ۠ۨۦ;->ۥ۟۟۟:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, LYue/ۥۢ۠ۨۦ;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۠ۨۦ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۠ۨۦ;->ۥ۟:Z

    return v0
.end method

.method public final ۥ۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۠ۨۦ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۢ۠ۨۦ;->ۥ۟۟۟:J

    return-wide v0
.end method

.method public final ۥ۟۟۟()LYue/ۥۢۡ۟ۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۠ۨۦ;->ۥ۟۟:LYue/ۥۢۡ۟ۡ;

    return-object v0
.end method

.method public final ۥ۟۟۟۟(LYue/ۥۢۡ۟ۡ;)V
    .locals 1
    .param p1    # LYue/ۥۢۡ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "queue"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۢ۠ۨۦ;->ۥ۟۟:LYue/ۥۢۡ۟ۡ;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-nez v0, :cond_1

    iput-object p1, p0, LYue/ۥۢ۠ۨۦ;->ۥ۟۟:LYue/ۥۢۡ۟ۡ;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "task is in multiple queues"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ۥ۟۟۟۠()J
.end method

.method public final ۥ۟۟۟ۡ(J)V
    .locals 0

    iput-wide p1, p0, LYue/ۥۢ۠ۨۦ;->ۥ۟۟۟:J

    return-void
.end method

.method public final ۥ۟۟۟ۢ(LYue/ۥۢۡ۟ۡ;)V
    .locals 0
    .param p1    # LYue/ۥۢۡ۟ۡ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۢ۠ۨۦ;->ۥ۟۟:LYue/ۥۢۡ۟ۡ;

    return-void
.end method
