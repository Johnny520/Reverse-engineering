.class public final synthetic Lac1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:J

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lmb1;


# direct methods
.method public synthetic constructor <init>(JLandroid/app/Activity;Lmb1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lac1;->ε:J

    .line 5
    .line 6
    iput-object p3, p0, Lac1;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p4, p0, Lac1;->η:Lmb1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-wide v1, p0, Lac1;->ε:J

    .line 2
    .line 3
    iget-object v6, p0, Lac1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iget-object v3, p0, Lac1;->η:Lmb1;

    .line 6
    .line 7
    move-object v4, p1

    .line 8
    check-cast v4, Lgc1;

    .line 9
    .line 10
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object p0, Ljc1;->γ:La;

    .line 14
    .line 15
    monitor-enter p0

    .line 16
    :try_start_0
    iget-object p1, p0, La;->β:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lｚ;

    .line 19
    .line 20
    iget-boolean p1, p1, Lｚ;->β:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, La;->β:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lｚ;

    .line 27
    .line 28
    iget-wide v7, p1, Lｚ;->α:J

    .line 29
    .line 30
    cmp-long p1, v7, v1

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object p1, p0, La;->β:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lｚ;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    const/16 v5, 0xb

    .line 41
    .line 42
    invoke-static {p1, v4, v0, v5}, Lｚ;->α(Lｚ;Lgc1;Ldc1;I)Lｚ;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La;->β:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    monitor-exit p0

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    move-object p1, v0

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    :goto_0
    monitor-exit p0

    .line 54
    :goto_1
    new-instance v0, Lzb1;

    .line 55
    .line 56
    const/4 v5, 0x2

    .line 57
    invoke-direct/range {v0 .. v5}, Lzb1;-><init>(JLa80;Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Ls62;->α:Ls62;

    .line 64
    .line 65
    return-object p0

    .line 66
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw p1
.end method
