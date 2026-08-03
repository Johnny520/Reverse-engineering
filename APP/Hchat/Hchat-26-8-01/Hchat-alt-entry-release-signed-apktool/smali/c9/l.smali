.class public final synthetic Lc9/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Laa/c;

.field public final synthetic i:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Laa/c;Landroid/app/Activity;I)V
    .locals 0

    .line 12
    iput p3, p0, Lc9/l;->g:I

    iput-object p1, p0, Lc9/l;->h:Laa/c;

    iput-object p2, p0, Lc9/l;->i:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Laa/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lc9/l;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/l;->i:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lc9/l;->h:Laa/c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lc9/l;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    iget-object v2, p0, Lc9/l;->i:Landroid/app/Activity;

    .line 6
    .line 7
    iget-object v3, p0, Lc9/l;->h:Laa/c;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lc9/y;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Laa/c;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object v0, Lc9/b0;->a:Landroid/os/Handler;

    .line 21
    .line 22
    invoke-static {v2, p1}, Lc9/b0;->i(Landroid/app/Activity;Lc9/y;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_0

    .line 49
    .line 50
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Lwb/jv;

    .line 55
    .line 56
    iget-object v5, v5, Lwb/jv;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 v4, 0x0

    .line 63
    invoke-static {v2, v4, v0}, Lc9/o2;->t(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    sget-object v4, Lc9/b0;->a:Landroid/os/Handler;

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    const-string v4, "\u5df2\u79fb\u51fa "

    .line 76
    .line 77
    const-string v5, " \u4e2a\u4f1a\u8bdd"

    .line 78
    .line 79
    invoke-static {p1, v4, v5}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    const-string p1, "\u79fb\u51fa\u4f1a\u8bdd\u5931\u8d25"

    .line 85
    .line 86
    :goto_1
    invoke-static {v2, p1}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    invoke-virtual {v3}, Laa/c;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_2
    return-object v1

    .line 95
    :pswitch_1
    check-cast p1, Lc9/y;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Laa/c;->invoke()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object v0, Lc9/b0;->a:Landroid/os/Handler;

    .line 104
    .line 105
    invoke-static {v2, p1}, Lc9/b0;->i(Landroid/app/Activity;Lc9/y;)V

    .line 106
    .line 107
    .line 108
    return-object v1

    .line 109
    :pswitch_2
    check-cast p1, Lc9/y;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Laa/c;->invoke()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    sget-object v0, Lc9/b0;->a:Landroid/os/Handler;

    .line 118
    .line 119
    invoke-static {v2, p1}, Lc9/b0;->i(Landroid/app/Activity;Lc9/y;)V

    .line 120
    .line 121
    .line 122
    return-object v1

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
