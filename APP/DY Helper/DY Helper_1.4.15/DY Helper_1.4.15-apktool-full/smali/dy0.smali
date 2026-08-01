.class public final synthetic Ldy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Lf8;

.field public final synthetic η:Z

.field public final synthetic θ:Ljava/lang/String;

.field public final synthetic ι:Lfv;

.field public final synthetic κ:Z

.field public final synthetic λ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lf8;ZLjava/lang/String;Lfv;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldy0;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Ldy0;->ζ:Lf8;

    .line 7
    .line 8
    iput-boolean p3, p0, Ldy0;->η:Z

    .line 9
    .line 10
    iput-object p4, p0, Ldy0;->θ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Ldy0;->ι:Lfv;

    .line 13
    .line 14
    iput-boolean p6, p0, Ldy0;->κ:Z

    .line 15
    .line 16
    iput-object p7, p0, Ldy0;->λ:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v1, p0, Ldy0;->ε:Landroid/app/Activity;

    .line 2
    .line 3
    iget-object v2, p0, Ldy0;->ζ:Lf8;

    .line 4
    .line 5
    iget-boolean v3, p0, Ldy0;->η:Z

    .line 6
    .line 7
    iget-object v4, p0, Ldy0;->θ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p0, Ldy0;->ι:Lfv;

    .line 10
    .line 11
    iget-boolean v6, p0, Ldy0;->κ:Z

    .line 12
    .line 13
    iget-object p0, p0, Ldy0;->λ:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v0, Lqy0;->α:Lqy0;

    .line 16
    .line 17
    :try_start_0
    invoke-virtual/range {v0 .. v5}, Lqy0;->ш(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v6, :cond_0

    .line 22
    .line 23
    const-string v2, "\u5408\u5e76\u5b8c\u6210"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_2

    .line 28
    :cond_0
    const-string v2, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 29
    .line 30
    :goto_0
    const-string v3, "\u52a8\u56fe\u5df2\u4fdd\u5b58"

    .line 31
    .line 32
    invoke-static {v1, v2, v3, v4}, Lqy0;->Е(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lhy0;

    .line 36
    .line 37
    invoke-direct {v2, v6, v0, v1}, Lhy0;-><init>(ZLjava/util/ArrayList;Landroid/app/Activity;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    :goto_1
    sget-object v0, Lqy0;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v1, v2, v4}, Lqy0;->Ж(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v2, "DYHelper"

    .line 57
    .line 58
    const-string v3, "LivePhoto \u4e0b\u8f7d\u5931\u8d25"

    .line 59
    .line 60
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    new-instance v2, Lhy0;

    .line 64
    .line 65
    invoke-direct {v2, v1, v6, v0}, Lhy0;-><init>(Landroid/app/Activity;ZLjava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :goto_3
    sget-object p0, Ls62;->α:Ls62;

    .line 73
    .line 74
    return-object p0

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    sget-object v1, Lqy0;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    .line 78
    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    throw v0
.end method
