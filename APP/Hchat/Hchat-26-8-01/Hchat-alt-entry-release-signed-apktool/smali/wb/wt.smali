.class public final Lwb/wt;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lwb/yt;

.field public final b:Landroid/content/Context;

.field public final c:Landroid/os/Handler;

.field public d:Z

.field public e:J

.field public final f:Lwb/cr;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lwb/yt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lwb/wt;->a:Lwb/yt;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    move-object p1, p2

    .line 13
    :cond_0
    iput-object p1, p0, Lwb/wt;->b:Landroid/content/Context;

    .line 14
    .line 15
    new-instance p1, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lwb/wt;->c:Landroid/os/Handler;

    .line 25
    .line 26
    new-instance p1, Lwb/cr;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-direct {p1, p0, p2}, Lwb/cr;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lwb/wt;->f:Lwb/cr;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    sget-object v0, Lfb/g1;->a:Lfb/g1;

    .line 2
    .line 3
    iget-object v0, p0, Lwb/wt;->a:Lwb/yt;

    .line 4
    .line 5
    iget-object v1, v0, Lwb/yt;->d:Li0/j1;

    .line 6
    .line 7
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v1}, Lfb/g1;->h(Ljava/util/List;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    iput-wide v1, p0, Lwb/wt;->e:J

    .line 25
    .line 26
    iget-object v1, p0, Lwb/wt;->b:Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {v0}, Lwb/yt;->N(Lwb/yt;)Lfb/d1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v1, v0}, Lfb/g1;->o(Landroid/content/Context;Lfb/d1;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final b(Z)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lwb/wt;->f:Lwb/cr;

    .line 6
    .line 7
    iget-object v3, p0, Lwb/wt;->c:Landroid/os/Handler;

    .line 8
    .line 9
    if-nez p1, :cond_3

    .line 10
    .line 11
    iget-wide v4, p0, Lwb/wt;->e:J

    .line 12
    .line 13
    sub-long/2addr v0, v4

    .line 14
    const-wide/16 v4, 0x258

    .line 15
    .line 16
    cmp-long p1, v0, v4

    .line 17
    .line 18
    if-ltz p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-boolean p1, p0, Lwb/wt;->d:Z

    .line 22
    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Lwb/wt;->d:Z

    .line 27
    .line 28
    sub-long/2addr v4, v0

    .line 29
    const-wide/16 v0, 0x1

    .line 30
    .line 31
    cmp-long p1, v4, v0

    .line 32
    .line 33
    if-gez p1, :cond_1

    .line 34
    .line 35
    move-wide v4, v0

    .line 36
    :cond_1
    invoke-virtual {v3, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void

    .line 40
    :cond_3
    :goto_0
    invoke-virtual {v3, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-boolean p1, p0, Lwb/wt;->d:Z

    .line 45
    .line 46
    invoke-virtual {p0}, Lwb/wt;->a()V

    .line 47
    .line 48
    .line 49
    return-void
.end method
