.class public final synthetic Lwb/oc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/oc;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/oc;->h:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/oc;->i:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/oc;->j:Li0/a1;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/Context;Li0/a1;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lwb/oc;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/oc;->i:Li0/a1;

    iput-object p2, p0, Lwb/oc;->h:Landroid/content/Context;

    iput-object p3, p0, Lwb/oc;->j:Li0/a1;

    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Li0/a1;Landroid/content/Context;)V
    .locals 1

    .line 15
    const/4 v0, 0x2

    iput v0, p0, Lwb/oc;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/oc;->i:Li0/a1;

    iput-object p2, p0, Lwb/oc;->j:Li0/a1;

    iput-object p3, p0, Lwb/oc;->h:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/oc;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lwb/oc;->h:Landroid/content/Context;

    .line 5
    .line 6
    iget-object v3, p0, Lwb/oc;->j:Li0/a1;

    .line 7
    .line 8
    iget-object v4, p0, Lwb/oc;->i:Li0/a1;

    .line 9
    .line 10
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lr/h;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, Lwb/p0;->v0:Ls0/d;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x3

    .line 24
    invoke-static {p1, v6, v0, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lwb/t1;

    .line 28
    .line 29
    const/16 v8, 0x18

    .line 30
    .line 31
    invoke-direct {v0, v8, v4, v3}, Lwb/t1;-><init>(ILi0/a1;Li0/a1;)V

    .line 32
    .line 33
    .line 34
    new-instance v4, Ls0/d;

    .line 35
    .line 36
    const v8, 0x777aa1b4

    .line 37
    .line 38
    .line 39
    invoke-direct {v4, v8, v0, v1}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v6, v4, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lwb/p0;->w0:Ls0/d;

    .line 46
    .line 47
    invoke-static {p1, v6, v0, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Lwb/oa;

    .line 51
    .line 52
    const/4 v4, 0x6

    .line 53
    invoke-direct {v0, v2, v3, v4}, Lwb/oa;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Ls0/d;

    .line 57
    .line 58
    const v3, -0x2d01130e

    .line 59
    .line 60
    .line 61
    invoke-direct {v2, v3, v0, v1}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v6, v2, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 65
    .line 66
    .line 67
    return-object v5

    .line 68
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_1

    .line 78
    .line 79
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-ne v0, v1, :cond_0

    .line 90
    .line 91
    sget-object v0, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 92
    .line 93
    invoke-static {v2, p1}, Le9/q;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :cond_0
    invoke-interface {v3, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    return-object v5

    .line 101
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    iget-object v10, p0, Lwb/oc;->i:Li0/a1;

    .line 108
    .line 109
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    invoke-interface {v10, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance p1, Ljava/lang/Thread;

    .line 123
    .line 124
    new-instance v6, Lwb/gg;

    .line 125
    .line 126
    iget-object v7, p0, Lwb/oc;->h:Landroid/content/Context;

    .line 127
    .line 128
    iget-object v11, p0, Lwb/oc;->j:Li0/a1;

    .line 129
    .line 130
    invoke-direct/range {v6 .. v11}, Lwb/gg;-><init>(Landroid/content/Context;ZZLi0/a1;Li0/a1;)V

    .line 131
    .line 132
    .line 133
    const-string v0, "Hchat-Script-Global"

    .line 134
    .line 135
    invoke-direct {p1, v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 139
    .line 140
    .line 141
    return-object v5

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
