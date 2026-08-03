.class public final synthetic Lk9/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lk9/q;->g:I

    .line 2
    .line 3
    iput-boolean p2, p0, Lk9/q;->h:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lk9/q;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-boolean v3, p0, Lk9/q;->h:Z

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :pswitch_0
    if-eqz v3, :cond_1

    .line 21
    .line 22
    sget-object v0, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/app/Activity;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-static {v0}, La7/a;->l(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    sget-object v0, Lk9/r;->a:Lk9/r;

    .line 36
    .line 37
    invoke-static {v2}, Lk9/r;->e(Landroid/app/Activity;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sget-object v0, Lk9/r;->b:Landroid/os/Handler;

    .line 42
    .line 43
    new-instance v2, Lh/Hchat/crash/e;

    .line 44
    .line 45
    const/4 v3, 0x3

    .line 46
    invoke-direct {v2, v3}, Lh/Hchat/crash/e;-><init>(I)V

    .line 47
    .line 48
    .line 49
    const-wide/16 v3, 0xb4

    .line 50
    .line 51
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 52
    .line 53
    .line 54
    :goto_0
    return-object v1

    .line 55
    :pswitch_1
    sget-object v0, Lk9/r;->a:Lk9/r;

    .line 56
    .line 57
    if-nez v3, :cond_3

    .line 58
    .line 59
    sget-object v0, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Landroid/app/Activity;

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-static {v0}, La7/a;->l(Landroid/content/Context;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-static {v2}, Lk9/r;->e(Landroid/app/Activity;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    sget-object v0, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Landroid/app/Activity;

    .line 96
    .line 97
    :goto_1
    if-eqz v0, :cond_5

    .line 98
    .line 99
    new-instance v2, Lk9/p;

    .line 100
    .line 101
    const/4 v3, 0x0

    .line 102
    invoke-direct {v2, v0, v3}, Lk9/p;-><init>(Landroid/app/Activity;I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v2}, Lk9/r;->p(Lfg/a;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    :goto_2
    return-object v1

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
