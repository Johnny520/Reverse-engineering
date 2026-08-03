.class public final Lwb/xn;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:Lwb/s0;

.field public i:I

.field public final synthetic j:Lr/z;

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;


# direct methods
.method public constructor <init>(Lr/z;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb/xn;->j:Lr/z;

    .line 2
    .line 3
    iput-object p2, p0, Lwb/xn;->k:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/xn;->l:Li0/a1;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/xn;->m:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/xn;->n:Li0/a1;

    .line 10
    .line 11
    iput-object p6, p0, Lwb/xn;->o:Li0/a1;

    .line 12
    .line 13
    iput-object p7, p0, Lwb/xn;->p:Li0/a1;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lyf/i;-><init>(ILwf/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 9

    .line 1
    new-instance v0, Lwb/xn;

    .line 2
    .line 3
    iget-object v6, p0, Lwb/xn;->o:Li0/a1;

    .line 4
    .line 5
    iget-object v7, p0, Lwb/xn;->p:Li0/a1;

    .line 6
    .line 7
    iget-object v1, p0, Lwb/xn;->j:Lr/z;

    .line 8
    .line 9
    iget-object v2, p0, Lwb/xn;->k:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, Lwb/xn;->l:Li0/a1;

    .line 12
    .line 13
    iget-object v4, p0, Lwb/xn;->m:Li0/a1;

    .line 14
    .line 15
    iget-object v5, p0, Lwb/xn;->n:Li0/a1;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lwb/xn;-><init>(Lr/z;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqg/t;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lwb/xn;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/xn;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/xn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/xn;->i:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    iget-object v2, p0, Lwb/xn;->o:Li0/a1;

    .line 6
    .line 7
    iget-object v3, p0, Lwb/xn;->n:Li0/a1;

    .line 8
    .line 9
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 10
    .line 11
    iget-object v5, p0, Lwb/xn;->m:Li0/a1;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-ne v0, v6, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lwb/xn;->h:Lwb/s0;

    .line 19
    .line 20
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    move-object v9, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return-object p1

    .line 32
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 36
    .line 37
    iget-object p1, p0, Lwb/xn;->l:Li0/a1;

    .line 38
    .line 39
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    move-object v0, p1

    .line 44
    check-cast v0, Lwb/s0;

    .line 45
    .line 46
    const-string p1, ""

    .line 47
    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    invoke-interface {v5, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v3, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-interface {v2, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v3, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v5, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v7, p0, Lwb/xn;->p:Li0/a1;

    .line 74
    .line 75
    invoke-interface {v7, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lwb/xn;->h:Lwb/s0;

    .line 79
    .line 80
    iput v6, p0, Lwb/xn;->i:I

    .line 81
    .line 82
    iget-object p1, p0, Lwb/xn;->j:Lr/z;

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    invoke-static {p1, v6, p0}, Lr/z;->m(Lr/z;ILyf/i;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 90
    .line 91
    if-ne p1, v6, :cond_0

    .line 92
    .line 93
    return-object v6

    .line 94
    :goto_0
    new-instance v11, Lwb/la;

    .line 95
    .line 96
    const/16 p1, 0x10

    .line 97
    .line 98
    invoke-direct {v11, v2, v3, v5, p1}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 99
    .line 100
    .line 101
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 102
    .line 103
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    if-eqz v8, :cond_5

    .line 108
    .line 109
    invoke-virtual {v8}, Lg8/i;->G()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_4

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    new-instance v10, Landroid/os/Handler;

    .line 117
    .line 118
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {v10, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 123
    .line 124
    .line 125
    new-instance p1, Ljava/lang/Thread;

    .line 126
    .line 127
    new-instance v7, Lb9/c;

    .line 128
    .line 129
    const/16 v12, 0x14

    .line 130
    .line 131
    invoke-direct/range {v7 .. v12}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    const-string v0, "HchatGroupMemberPicker"

    .line 135
    .line 136
    invoke-direct {p1, v7, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 140
    .line 141
    .line 142
    return-object v1

    .line 143
    :cond_5
    :goto_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    const-string v0, "\u7fa4\u6210\u5458\u5217\u8868\u4e0d\u53ef\u7528"

    .line 146
    .line 147
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v11, v4, p1}, Lwb/la;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    return-object v1
.end method
