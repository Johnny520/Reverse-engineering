.class public final synthetic Lwb/da;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/da;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/da;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/da;->i:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/da;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/16 v6, 0x3e

    .line 20
    .line 21
    const-string v2, "|"

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v0, p0, Lwb/da;->h:Lfg/l;

    .line 30
    .line 31
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const-string v0, " \u4e2a\u6587\u4ef6"

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    const-string v2, "\u5df2\u9009\u62e9 "

    .line 42
    .line 43
    iget-object v3, p0, Lwb/da;->i:Landroid/content/Context;

    .line 44
    .line 45
    invoke-static {v2, p1, v0, v3, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 46
    .line 47
    .line 48
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_0
    move-object v0, p1

    .line 52
    check-cast v0, Ljava/util/List;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_1

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    const/16 v5, 0x3e

    .line 65
    .line 66
    const-string v1, "|"

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v1, p0, Lwb/da;->h:Lfg/l;

    .line 75
    .line 76
    invoke-interface {v1, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    const-string v0, " \u4e2a\u6587\u4ef6"

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    const-string v2, "\u5df2\u9009\u62e9 "

    .line 87
    .line 88
    iget-object v3, p0, Lwb/da;->i:Landroid/content/Context;

    .line 89
    .line 90
    invoke-static {v2, p1, v0, v3, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 91
    .line 92
    .line 93
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 94
    .line 95
    return-object p1

    .line 96
    :pswitch_1
    check-cast p1, Lk9/g;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    instance-of v0, p1, Lk9/f;

    .line 102
    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    check-cast p1, Lk9/f;

    .line 106
    .line 107
    iget-object p1, p1, Lk9/f;->a:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v0, p0, Lwb/da;->h:Lfg/l;

    .line 110
    .line 111
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    sget-object v0, Lk9/e;->b:Lk9/e;

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    const-string p1, "\u56fe\u6807\u8bfb\u53d6\u5931\u8d25"

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    iget-object v1, p0, Lwb/da;->i:Landroid/content/Context;

    .line 127
    .line 128
    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_3
    sget-object v0, Lk9/e;->a:Lk9/e;

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_4

    .line 143
    .line 144
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    invoke-static {}, Lokio/a;->k()V

    .line 148
    .line 149
    .line 150
    const/4 p1, 0x0

    .line 151
    :goto_1
    return-object p1

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
