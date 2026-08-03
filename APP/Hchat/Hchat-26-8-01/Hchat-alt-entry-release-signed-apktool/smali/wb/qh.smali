.class public final synthetic Lwb/qh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:J

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Ldb/c;

.field public final synthetic l:I

.field public final synthetic m:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;JLjava/util/List;Lfg/l;Ldb/c;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/qh;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/qh;->m:Landroid/content/Context;

    .line 8
    .line 9
    iput-wide p2, p0, Lwb/qh;->h:J

    .line 10
    .line 11
    iput-object p4, p0, Lwb/qh;->i:Ljava/util/List;

    .line 12
    .line 13
    iput-object p5, p0, Lwb/qh;->j:Lfg/l;

    .line 14
    .line 15
    iput-object p6, p0, Lwb/qh;->k:Ldb/c;

    .line 16
    .line 17
    iput p7, p0, Lwb/qh;->l:I

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/List;JLfg/l;Ldb/c;I)V
    .locals 1

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lwb/qh;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/qh;->m:Landroid/content/Context;

    iput-object p2, p0, Lwb/qh;->i:Ljava/util/List;

    iput-wide p3, p0, Lwb/qh;->h:J

    iput-object p5, p0, Lwb/qh;->j:Lfg/l;

    iput-object p6, p0, Lwb/qh;->k:Ldb/c;

    iput p7, p0, Lwb/qh;->l:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/qh;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/qh;->m:Landroid/content/Context;

    .line 7
    .line 8
    check-cast v0, Landroid/app/Activity;

    .line 9
    .line 10
    new-instance v1, Lca/k;

    .line 11
    .line 12
    const/16 v6, 0x9

    .line 13
    .line 14
    iget-object v2, p0, Lwb/qh;->i:Ljava/util/List;

    .line 15
    .line 16
    iget-object v3, p0, Lwb/qh;->j:Lfg/l;

    .line 17
    .line 18
    iget-object v4, p0, Lwb/qh;->k:Ldb/c;

    .line 19
    .line 20
    iget v5, p0, Lwb/qh;->l:I

    .line 21
    .line 22
    invoke-direct/range {v1 .. v6}, Lca/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    iget-wide v2, p0, Lwb/qh;->h:J

    .line 26
    .line 27
    invoke-static {v0, v2, v3, v1}, Lwb/ho;->g7(Landroid/app/Activity;JLfg/l;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    iget-object v0, p0, Lwb/qh;->m:Landroid/content/Context;

    .line 34
    .line 35
    instance-of v1, v0, Landroid/app/Activity;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    move-object v1, v0

    .line 40
    check-cast v1, Landroid/app/Activity;

    .line 41
    .line 42
    :goto_0
    move-object v2, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/4 v1, 0x0

    .line 45
    goto :goto_0

    .line 46
    :goto_1
    const/4 v1, 0x0

    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    const-string v2, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u65f6\u95f4\u9009\u62e9\u5668"

    .line 50
    .line 51
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    iget-object v6, p0, Lwb/qh;->i:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v3, 0x1

    .line 66
    if-le v0, v3, :cond_2

    .line 67
    .line 68
    move v1, v3

    .line 69
    :cond_2
    move-object v3, v2

    .line 70
    new-instance v2, Lwb/qh;

    .line 71
    .line 72
    iget-wide v4, p0, Lwb/qh;->h:J

    .line 73
    .line 74
    iget-object v7, p0, Lwb/qh;->j:Lfg/l;

    .line 75
    .line 76
    iget-object v8, p0, Lwb/qh;->k:Ldb/c;

    .line 77
    .line 78
    iget v9, p0, Lwb/qh;->l:I

    .line 79
    .line 80
    invoke-direct/range {v2 .. v9}, Lwb/qh;-><init>(Landroid/app/Activity;JLjava/util/List;Lfg/l;Ldb/c;I)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lwb/gh;

    .line 84
    .line 85
    invoke-direct {v0, v7, v8, v6, v9}, Lwb/gh;-><init>(Lfg/l;Ldb/c;Ljava/util/List;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {}, La/a;->E()Luf/c;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    new-instance v5, Lsf/e;

    .line 93
    .line 94
    const-string v6, "\u4fee\u6539\u65f6\u95f4"

    .line 95
    .line 96
    const-string v7, "\u91cd\u65b0\u9009\u62e9\u8be5\u8ba1\u5212\u65f6\u95f4"

    .line 97
    .line 98
    invoke-direct {v5, v6, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v5}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    new-instance v1, Lsf/e;

    .line 107
    .line 108
    const-string v5, "\u5220\u9664\u65f6\u95f4"

    .line 109
    .line 110
    const-string v6, "\u4ece\u5f53\u524d\u4efb\u52a1\u79fb\u9664\u8be5\u8ba1\u5212\u65f6\u95f4"

    .line 111
    .line 112
    invoke-direct {v1, v5, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v1}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_3
    invoke-static {v4}, La/a;->t(Luf/c;)Luf/c;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    new-instance v6, Lwb/l7;

    .line 123
    .line 124
    const/16 v1, 0xe

    .line 125
    .line 126
    invoke-direct {v6, v2, v1, v0}, Lwb/l7;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance v7, Lk/s1;

    .line 130
    .line 131
    const/16 v0, 0x19

    .line 132
    .line 133
    invoke-direct {v7, v0}, Lk/s1;-><init>(I)V

    .line 134
    .line 135
    .line 136
    sget-object v8, Lwb/lv;->j:Lwb/lv;

    .line 137
    .line 138
    move-object v2, v3

    .line 139
    const-string v3, "\u8ba1\u5212\u65f6\u95f4"

    .line 140
    .line 141
    const-string v4, ""

    .line 142
    .line 143
    invoke-static/range {v2 .. v8}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 144
    .line 145
    .line 146
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
