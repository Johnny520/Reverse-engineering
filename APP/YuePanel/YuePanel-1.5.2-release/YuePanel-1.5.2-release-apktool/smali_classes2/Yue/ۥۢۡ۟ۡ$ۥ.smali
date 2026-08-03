.class public final LYue/ۥۢۡ۟ۡ$ۥ;
.super LYue/ۥۢ۠ۨۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡ۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ۟۟۟۟:Ljava/util/concurrent/CountDownLatch;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, LYue/ۥۣۢۥ۟;->ۥۣ۟۟۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " awaitIdle"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LYue/ۥۢ۠ۨۦ;-><init>(Ljava/lang/String;Z)V

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, LYue/ۥۢۡ۟ۡ$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()J
    .locals 2

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final ۥۣ۟۟۟()Ljava/util/concurrent/CountDownLatch;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/CountDownLatch;

    return-object v0
.end method
