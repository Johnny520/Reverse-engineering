.class public final synthetic Lc9/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc9/s;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/s;->i:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lc9/s;->h:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Landroid/app/Activity;)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lc9/s;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/s;->h:Ljava/util/List;

    iput-object p2, p0, Lc9/s;->i:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lc9/s;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lc9/s;->i:Landroid/app/Activity;

    .line 4
    .line 5
    iget-object v2, p0, Lc9/s;->h:Ljava/util/List;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move v4, v3

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_2

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {v1, v5, v3}, Lya/i;->f(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    new-instance p1, Lc9/y;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const-string v1, "\u5df2\u8bfb"

    .line 56
    .line 57
    invoke-direct {p1, v1, v4, v0, v3}, Lc9/y;-><init>(Ljava/lang/String;IIZ)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object v0, Lc9/b0;->a:Landroid/os/Handler;

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const-string v4, "\u6b63\u5728\u53d1\u9001\u5230 "

    .line 73
    .line 74
    const-string v5, " \u4e2a\u4f1a\u8bdd..."

    .line 75
    .line 76
    invoke-static {v0, v4, v5}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v4, Lc9/i;

    .line 81
    .line 82
    invoke-direct {v4, v2, v3, p1}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance p1, Lc9/j;

    .line 86
    .line 87
    invoke-direct {p1, v1, v3}, Lc9/j;-><init>(Landroid/app/Activity;I)V

    .line 88
    .line 89
    .line 90
    const-string v2, "\u53d1\u9001"

    .line 91
    .line 92
    invoke-static {v1, v2, v0, v4, p1}, Lc9/b0;->d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/l;)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 96
    .line 97
    return-object p1

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
