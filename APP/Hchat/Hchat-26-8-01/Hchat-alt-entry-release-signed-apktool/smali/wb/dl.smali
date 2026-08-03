.class public final synthetic Lwb/dl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Lx8/r;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Lx8/r;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/dl;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/dl;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/dl;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/dl;->j:Lx8/r;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/dl;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lx8/b;

    .line 31
    .line 32
    iget-object v2, v2, Lx8/b;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v1, p0, Lwb/dl;->i:Li0/a1;

    .line 39
    .line 40
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/util/List;

    .line 45
    .line 46
    new-instance v3, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    move-object v5, v4

    .line 66
    check-cast v5, Lx8/b;

    .line 67
    .line 68
    iget-object v5, v5, Lx8/b;->a:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-nez v5, :cond_1

    .line 75
    .line 76
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    iget-object v0, p0, Lwb/dl;->j:Lx8/r;

    .line 81
    .line 82
    invoke-static {v0, v1, v3}, Lwb/ho;->B(Lx8/r;Li0/a1;Ljava/util/ArrayList;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    const-string v0, " \u6761\u89c4\u5219"

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    const-string v2, "\u5df2\u5220\u9664 "

    .line 93
    .line 94
    iget-object v3, p0, Lwb/dl;->h:Landroid/content/Context;

    .line 95
    .line 96
    invoke-static {v2, p1, v0, v3, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 97
    .line 98
    .line 99
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 100
    .line 101
    return-object p1

    .line 102
    :pswitch_0
    check-cast p1, Lx8/b;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lwb/dl;->i:Li0/a1;

    .line 108
    .line 109
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ljava/util/List;

    .line 114
    .line 115
    new-instance v2, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :cond_3
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_4

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move-object v4, v3

    .line 135
    check-cast v4, Lx8/b;

    .line 136
    .line 137
    iget-object v4, v4, Lx8/b;->a:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v5, p1, Lx8/b;->a:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-nez v4, :cond_3

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_4
    iget-object p1, p0, Lwb/dl;->j:Lx8/r;

    .line 152
    .line 153
    invoke-static {p1, v0, v2}, Lwb/ho;->B(Lx8/r;Li0/a1;Ljava/util/ArrayList;)V

    .line 154
    .line 155
    .line 156
    const-string p1, "\u89c4\u5219\u5df2\u5220\u9664"

    .line 157
    .line 158
    const/4 v0, 0x0

    .line 159
    iget-object v1, p0, Lwb/dl;->h:Landroid/content/Context;

    .line 160
    .line 161
    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
