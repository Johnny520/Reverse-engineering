.class public LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;
.super LYue/ۥ۟۠ۦۧ$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۦۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ۟:Ljava/lang/Runnable;

.field public final ۥ۟۟:Landroid/os/Handler;

.field public ۥ۟۟۟:J


# direct methods
.method public constructor <init>(LYue/ۥ۟۠ۦۧ$ۥ;)V
    .locals 2

    invoke-direct {p0, p1}, LYue/ۥ۟۠ۦۧ$ۥ۟۟;-><init>(LYue/ۥ۟۠ۦۧ$ۥ;)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;->ۥ۟۟۟:J

    new-instance p1, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟$ۥ;

    invoke-direct {p1, p0}, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟$ۥ;-><init>(LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;)V

    iput-object p1, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;->ۥ۟:Ljava/lang/Runnable;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;->ۥ۟۟:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 4

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;->ۥ۟۟۟:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xa

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-object v2, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;->ۥ۟۟:Landroid/os/Handler;

    iget-object v3, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;->ۥ۟:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
