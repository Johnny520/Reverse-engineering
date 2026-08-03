.class public final synthetic Lwb/np;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lgb/o;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Lqg/t;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lgb/o;Landroid/content/Context;Lqg/t;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/np;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/np;->h:Lgb/o;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/np;->i:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/np;->j:Lqg/t;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/np;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/np;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/np;->m:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/np;->n:Li0/a1;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/np;->o:Li0/a1;

    .line 22
    .line 23
    iput-object p9, p0, Lwb/np;->p:Li0/a1;

    .line 24
    .line 25
    iput-object p10, p0, Lwb/np;->q:Li0/a1;

    .line 26
    .line 27
    iput-object p11, p0, Lwb/np;->r:Li0/a1;

    .line 28
    .line 29
    return-void
.end method

.method public synthetic constructor <init>(Lgb/o;Lqg/t;Li0/a1;Li0/a1;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lwb/np;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/np;->h:Lgb/o;

    iput-object p2, p0, Lwb/np;->j:Lqg/t;

    iput-object p3, p0, Lwb/np;->k:Li0/a1;

    iput-object p4, p0, Lwb/np;->l:Li0/a1;

    iput-object p5, p0, Lwb/np;->i:Landroid/content/Context;

    iput-object p6, p0, Lwb/np;->m:Li0/a1;

    iput-object p7, p0, Lwb/np;->n:Li0/a1;

    iput-object p8, p0, Lwb/np;->o:Li0/a1;

    iput-object p9, p0, Lwb/np;->p:Li0/a1;

    iput-object p10, p0, Lwb/np;->q:Li0/a1;

    iput-object p11, p0, Lwb/np;->r:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/np;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v11, p0, Lwb/np;->k:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lwb/np;->l:Li0/a1;

    .line 22
    .line 23
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lgb/s;

    .line 28
    .line 29
    iget-object v3, p0, Lwb/np;->i:Landroid/content/Context;

    .line 30
    .line 31
    iget-object v10, p0, Lwb/np;->m:Li0/a1;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    const-string v0, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u8d44\u6599\u5c1a\u672a\u5c31\u7eea"

    .line 48
    .line 49
    :cond_1
    const/4 v1, 0x1

    .line 50
    invoke-static {v3, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    iget-object v5, p0, Lwb/np;->n:Li0/a1;

    .line 59
    .line 60
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-interface {v11, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const-string v0, ""

    .line 76
    .line 77
    invoke-interface {v10, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lwb/cq;

    .line 81
    .line 82
    const/4 v12, 0x0

    .line 83
    iget-object v4, p0, Lwb/np;->h:Lgb/o;

    .line 84
    .line 85
    iget-object v6, p0, Lwb/np;->o:Li0/a1;

    .line 86
    .line 87
    iget-object v7, p0, Lwb/np;->p:Li0/a1;

    .line 88
    .line 89
    iget-object v8, p0, Lwb/np;->q:Li0/a1;

    .line 90
    .line 91
    iget-object v9, p0, Lwb/np;->r:Li0/a1;

    .line 92
    .line 93
    invoke-direct/range {v1 .. v12}, Lwb/cq;-><init>(ZLandroid/content/Context;Lgb/o;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x3

    .line 97
    iget-object v2, p0, Lwb/np;->j:Lqg/t;

    .line 98
    .line 99
    const/4 v3, 0x0

    .line 100
    invoke-static {v2, v3, v1, v0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 101
    .line 102
    .line 103
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_0
    iget-object v4, p0, Lwb/np;->k:Li0/a1;

    .line 107
    .line 108
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Ljava/lang/String;

    .line 113
    .line 114
    if-nez v0, :cond_4

    .line 115
    .line 116
    iget-object v0, p0, Lwb/np;->l:Li0/a1;

    .line 117
    .line 118
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Ljava/lang/String;

    .line 123
    .line 124
    if-eqz v0, :cond_3

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    iget-object v3, p0, Lwb/np;->h:Lgb/o;

    .line 128
    .line 129
    iget-object v0, v3, Lgb/o;->a:Ljava/lang/String;

    .line 130
    .line 131
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    new-instance v1, Lk/g1;

    .line 135
    .line 136
    const/4 v11, 0x0

    .line 137
    iget-object v2, p0, Lwb/np;->i:Landroid/content/Context;

    .line 138
    .line 139
    iget-object v5, p0, Lwb/np;->m:Li0/a1;

    .line 140
    .line 141
    iget-object v6, p0, Lwb/np;->n:Li0/a1;

    .line 142
    .line 143
    iget-object v7, p0, Lwb/np;->o:Li0/a1;

    .line 144
    .line 145
    iget-object v8, p0, Lwb/np;->p:Li0/a1;

    .line 146
    .line 147
    iget-object v9, p0, Lwb/np;->q:Li0/a1;

    .line 148
    .line 149
    iget-object v10, p0, Lwb/np;->r:Li0/a1;

    .line 150
    .line 151
    invoke-direct/range {v1 .. v11}, Lk/g1;-><init>(Landroid/content/Context;Lgb/o;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 152
    .line 153
    .line 154
    const/4 v0, 0x3

    .line 155
    iget-object v2, p0, Lwb/np;->j:Lqg/t;

    .line 156
    .line 157
    const/4 v3, 0x0

    .line 158
    invoke-static {v2, v3, v1, v0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 159
    .line 160
    .line 161
    :cond_4
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 162
    .line 163
    return-object v0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
