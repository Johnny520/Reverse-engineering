.class public final synthetic Lwb/ck;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/a0;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Landroid/content/SharedPreferences;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lwb/a0;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/ck;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ck;->h:Lwb/a0;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ck;->i:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ck;->j:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ck;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/ck;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/ck;->m:Li0/a1;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Lwb/a0;Li0/a1;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V
    .locals 1

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lwb/ck;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ck;->h:Lwb/a0;

    iput-object p2, p0, Lwb/ck;->i:Li0/a1;

    iput-object p3, p0, Lwb/ck;->k:Li0/a1;

    iput-object p4, p0, Lwb/ck;->j:Landroid/content/SharedPreferences;

    iput-object p5, p0, Lwb/ck;->l:Li0/a1;

    iput-object p6, p0, Lwb/ck;->m:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/ck;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lua/h;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lwb/ck;->i:Li0/a1;

    .line 12
    .line 13
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/util/List;

    .line 18
    .line 19
    invoke-static {v0}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v3, p0, Lwb/ck;->h:Lwb/a0;

    .line 28
    .line 29
    check-cast v3, Lwb/x;

    .line 30
    .line 31
    iget-object v3, v3, Lwb/x;->a:Lwb/mu;

    .line 32
    .line 33
    iget v3, v3, Lwb/mu;->a:I

    .line 34
    .line 35
    if-ltz v3, :cond_0

    .line 36
    .line 37
    if-ge v3, v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {p1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {v0, p1}, Lwb/ho;->u7(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    move-object v5, p1

    .line 58
    check-cast v5, Ljava/util/List;

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    const/16 v7, 0x50

    .line 62
    .line 63
    iget-object v0, p0, Lwb/ck;->j:Landroid/content/SharedPreferences;

    .line 64
    .line 65
    iget-object v1, p0, Lwb/ck;->k:Li0/a1;

    .line 66
    .line 67
    iget-object v3, p0, Lwb/ck;->l:Li0/a1;

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-static/range {v0 .. v7}, Lwb/ho;->J(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    iget-object v0, p0, Lwb/ck;->m:Li0/a1;

    .line 75
    .line 76
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_0
    check-cast p1, Lua/i;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lwb/ck;->h:Lwb/a0;

    .line 88
    .line 89
    check-cast v0, Lwb/z;

    .line 90
    .line 91
    iget-object v0, v0, Lwb/z;->a:Lwb/nu;

    .line 92
    .line 93
    iget-object v2, p0, Lwb/ck;->i:Li0/a1;

    .line 94
    .line 95
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iget v0, v0, Lwb/nu;->a:I

    .line 106
    .line 107
    if-ltz v0, :cond_1

    .line 108
    .line 109
    if-ge v0, v1, :cond_1

    .line 110
    .line 111
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Ljava/util/List;

    .line 116
    .line 117
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :goto_1
    move-object v5, v1

    .line 125
    goto :goto_2

    .line 126
    :cond_1
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Ljava/util/List;

    .line 131
    .line 132
    invoke-static {v0, p1}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    goto :goto_1

    .line 137
    :goto_2
    invoke-interface {v2, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget-object v4, p0, Lwb/ck;->k:Li0/a1;

    .line 141
    .line 142
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_2

    .line 153
    .line 154
    iget-object p1, p1, Lua/i;->a:Ljava/lang/String;

    .line 155
    .line 156
    invoke-interface {v4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_2
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    move-object v7, p1

    .line 164
    check-cast v7, Ljava/lang/String;

    .line 165
    .line 166
    const/16 v8, 0x20

    .line 167
    .line 168
    iget-object v1, p0, Lwb/ck;->j:Landroid/content/SharedPreferences;

    .line 169
    .line 170
    iget-object v3, p0, Lwb/ck;->l:Li0/a1;

    .line 171
    .line 172
    const/4 v6, 0x0

    .line 173
    invoke-static/range {v1 .. v8}, Lwb/ho;->J(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 174
    .line 175
    .line 176
    const/4 p1, 0x0

    .line 177
    iget-object v0, p0, Lwb/ck;->m:Li0/a1;

    .line 178
    .line 179
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_0

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
