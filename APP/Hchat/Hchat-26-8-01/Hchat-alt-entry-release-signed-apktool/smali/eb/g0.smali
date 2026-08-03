.class public final synthetic Leb/g0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Leb/g0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Leb/g0;->h:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Leb/g0;->i:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lo9/p;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 12
    const/4 p1, 0x1

    iput p1, p0, Leb/g0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Leb/g0;->h:Ljava/lang/String;

    iput-object p3, p0, Leb/g0;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Leb/g0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/g0;->h:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, Leb/g0;->i:Ljava/lang/String;

    .line 9
    .line 10
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v2, Lj8/p;->b:Lj8/y;

    .line 17
    .line 18
    invoke-virtual {v2, v0, v1}, Lj8/y;->t(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :catchall_0
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Leb/g0;->h:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p0, Leb/g0;->i:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2}, Lq8/m;->a()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v2, v3

    .line 39
    :goto_0
    if-nez v2, :cond_2

    .line 40
    .line 41
    const-string v2, ""

    .line 42
    .line 43
    :cond_2
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    sget-object v0, Leb/m0;->j:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_8

    .line 57
    .line 58
    sget-object v2, Leb/m0;->a:Leb/m0;

    .line 59
    .line 60
    invoke-static {v0}, Leb/m0;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_8

    .line 65
    .line 66
    instance-of v4, v2, Landroid/view/View;

    .line 67
    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    move-object v4, v2

    .line 71
    check-cast v4, Landroid/view/View;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    move-object v4, v3

    .line 75
    :goto_1
    if-eqz v4, :cond_5

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    instance-of v4, v0, Landroid/view/View;

    .line 79
    .line 80
    if-eqz v4, :cond_6

    .line 81
    .line 82
    move-object v3, v0

    .line 83
    check-cast v3, Landroid/view/View;

    .line 84
    .line 85
    :cond_6
    if-eqz v3, :cond_8

    .line 86
    .line 87
    move-object v4, v3

    .line 88
    :goto_2
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_8

    .line 93
    .line 94
    invoke-static {v0}, Leb/m0;->i(Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-lez v0, :cond_7

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_7
    invoke-static {v2, v1}, Leb/m0;->l(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    :cond_8
    :goto_3
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
