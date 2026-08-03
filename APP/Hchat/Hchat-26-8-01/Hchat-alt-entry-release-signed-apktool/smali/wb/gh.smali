.class public final synthetic Lwb/gh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ILjava/lang/String;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/gh;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/gh;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lwb/gh;->i:I

    .line 10
    .line 11
    iput-object p3, p0, Lwb/gh;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/gh;->h:Lfg/l;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lfg/l;ILjava/lang/String;Lfg/l;)V
    .locals 1

    .line 16
    const/4 v0, 0x2

    iput v0, p0, Lwb/gh;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/gh;->h:Lfg/l;

    iput p2, p0, Lwb/gh;->i:I

    iput-object p3, p0, Lwb/gh;->k:Ljava/lang/Object;

    iput-object p4, p0, Lwb/gh;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lfg/l;Ldb/c;Ljava/util/List;I)V
    .locals 1

    .line 17
    const/4 v0, 0x1

    iput v0, p0, Lwb/gh;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/gh;->h:Lfg/l;

    iput-object p2, p0, Lwb/gh;->j:Ljava/lang/Object;

    iput-object p3, p0, Lwb/gh;->k:Ljava/lang/Object;

    iput p4, p0, Lwb/gh;->i:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/gh;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/gh;->k:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v3, v0

    .line 9
    check-cast v3, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/gh;->j:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lfg/l;

    .line 15
    .line 16
    new-instance v1, Lwb/b3;

    .line 17
    .line 18
    iget v0, p0, Lwb/gh;->i:I

    .line 19
    .line 20
    invoke-static {v0}, Lwb/ho;->J6(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v5, 0x1

    .line 25
    const-string v6, "|"

    .line 26
    .line 27
    invoke-direct/range {v1 .. v6}, Lwb/b3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfg/l;ZLjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lwb/gh;->h:Lfg/l;

    .line 31
    .line 32
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    iget-object v0, p0, Lwb/gh;->j:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ldb/c;

    .line 41
    .line 42
    iget-object v1, p0, Lwb/gh;->k:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ljava/util/List;

    .line 45
    .line 46
    new-instance v2, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const/4 v3, 0x0

    .line 56
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    add-int/lit8 v5, v3, 0x1

    .line 67
    .line 68
    if-ltz v3, :cond_1

    .line 69
    .line 70
    move-object v6, v4

    .line 71
    check-cast v6, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 74
    .line 75
    .line 76
    iget v6, p0, Lwb/gh;->i:I

    .line 77
    .line 78
    if-eq v3, v6, :cond_0

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :cond_0
    move v3, v5

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-static {}, La/a;->Q0()V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    throw v0

    .line 90
    :cond_2
    invoke-static {v0, v2}, Lwb/ho;->p7(Ldb/c;Ljava/util/ArrayList;)Ldb/c;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v1, p0, Lwb/gh;->h:Lfg/l;

    .line 95
    .line 96
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :pswitch_1
    iget-object v0, p0, Lwb/gh;->j:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Landroid/content/Context;

    .line 103
    .line 104
    iget-object v1, p0, Lwb/gh;->k:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Ljava/lang/String;

    .line 107
    .line 108
    instance-of v2, v0, Landroid/app/Activity;

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    move-object v2, v0

    .line 113
    check-cast v2, Landroid/app/Activity;

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    const/4 v2, 0x0

    .line 117
    :goto_2
    if-nez v2, :cond_4

    .line 118
    .line 119
    const-string v1, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u94c3\u58f0\u9009\u62e9\u5668"

    .line 120
    .line 121
    const/4 v2, 0x0

    .line 122
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_4
    new-instance v3, Leb/v0;

    .line 131
    .line 132
    const/4 v4, 0x5

    .line 133
    iget-object v5, p0, Lwb/gh;->h:Lfg/l;

    .line 134
    .line 135
    iget v6, p0, Lwb/gh;->i:I

    .line 136
    .line 137
    invoke-direct {v3, v5, v6, v0, v4}, Leb/v0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x1

    .line 141
    if-ne v6, v0, :cond_5

    .line 142
    .line 143
    sget-object v0, Lwb/vq;->a:Lwb/vq;

    .line 144
    .line 145
    invoke-virtual {v0, v2, v3}, Lwb/vq;->c(Landroid/app/Activity;Lfg/l;)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_5
    sget-object v0, Lwb/vq;->a:Lwb/vq;

    .line 150
    .line 151
    invoke-virtual {v0, v2, v1, v3}, Lwb/vq;->d(Landroid/app/Activity;Ljava/lang/String;Lfg/l;)V

    .line 152
    .line 153
    .line 154
    :goto_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
