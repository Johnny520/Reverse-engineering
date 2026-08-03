.class public final Lra/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/app/Activity;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:[I

.field public final synthetic j:I

.field public final synthetic k:Landroid/os/Handler;

.field public final synthetic l:Lra/h;


# direct methods
.method public constructor <init>(Lra/h;Landroid/app/Activity;Ljava/lang/String;[IILandroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lra/f;->l:Lra/h;

    .line 5
    .line 6
    iput-object p2, p0, Lra/f;->g:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lra/f;->h:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lra/f;->i:[I

    .line 11
    .line 12
    iput p5, p0, Lra/f;->j:I

    .line 13
    .line 14
    iput-object p6, p0, Lra/f;->k:Landroid/os/Handler;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lra/f;->g:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lra/f;->l:Lra/h;

    .line 18
    .line 19
    iget-object v2, p0, Lra/f;->h:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {v4}, Lra/h;->d(Landroid/view/View;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_1
    invoke-static {v4}, Lra/h;->c(Landroid/view/View;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    const-string v4, "\u68c0\u6d4b\u5230\u7ea2\u5305\u5931\u8d25\u72b6\u6001\uff0c\u5173\u95ed\u9875\u9762"

    .line 44
    .line 45
    invoke-virtual {v1, v4}, Lra/h;->o(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v4, v1, Lra/h;->e:Lna/b;

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    invoke-virtual {v4, v2}, Lna/b;->b(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    :goto_0
    iget-object v2, v1, Lra/h;->g:Ljava/util/WeakHashMap;

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    iget-object v2, v1, Lra/h;->b:Ll3/l;

    .line 64
    .line 65
    const-string v4, "hb_auto_close"

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :try_start_1
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 75
    .line 76
    .line 77
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    goto :goto_1

    .line 79
    :catchall_1
    move v2, v3

    .line 80
    :goto_1
    if-eqz v2, :cond_4

    .line 81
    .line 82
    :try_start_2
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v4, "\u68c0\u6d4b\u7ea2\u5305\u5931\u8d25\u72b6\u6001\u5f02\u5e38: "

    .line 89
    .line 90
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v1, v0}, Lra/h;->o(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    :goto_3
    iget-object v0, p0, Lra/f;->i:[I

    .line 108
    .line 109
    aget v1, v0, v3

    .line 110
    .line 111
    add-int/lit8 v2, v1, 0x1

    .line 112
    .line 113
    aput v2, v0, v3

    .line 114
    .line 115
    iget v0, p0, Lra/f;->j:I

    .line 116
    .line 117
    if-ge v1, v0, :cond_4

    .line 118
    .line 119
    iget-object v0, p0, Lra/f;->k:Landroid/os/Handler;

    .line 120
    .line 121
    const-wide/16 v1, 0x12c

    .line 122
    .line 123
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 124
    .line 125
    .line 126
    :cond_4
    :goto_4
    return-void
.end method
