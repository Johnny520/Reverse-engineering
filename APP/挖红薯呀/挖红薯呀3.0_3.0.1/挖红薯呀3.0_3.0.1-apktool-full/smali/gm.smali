.class public final Lgm;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lv90;


# instance fields
.field public final synthetic d:I

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lem;Lv90;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lgm;->d:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lgm;->e:Ljava/lang/Object;

    .line 36
    iput-object p2, p0, Lgm;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls90;Lkx0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lgm;->d:I

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lgm;->e:Ljava/lang/Object;

    iput-object p2, p0, Lgm;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvk0;Lbl0;Ls90;)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, Lgm;->d:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lgm;->e:Ljava/lang/Object;

    iput-object p3, p0, Lgm;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw90;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lgm;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lgm;->e:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v0, Lme;->c:Lme;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, v0, Lme;->a:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lke;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p1, v1}, Lme;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Lke;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    iput-object v1, p0, Lgm;->f:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final e(Lx90;Lq90;)V
    .locals 4

    .line 1
    iget v0, p0, Lgm;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lgm;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lgm;->f:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Lke;

    .line 11
    .line 12
    iget-object p0, v2, Lke;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/util/List;

    .line 19
    .line 20
    invoke-static {v0, p1, p2, v1}, Lke;->a(Ljava/util/List;Lx90;Lq90;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lq90;->ON_ANY:Lq90;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/util/List;

    .line 30
    .line 31
    invoke-static {p0, p1, p2, v1}, Lke;->a(Ljava/util/List;Lx90;Lq90;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    check-cast v1, Lvk0;

    .line 36
    .line 37
    sget-object p1, Lal0;->a:[I

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    aget p1, p1, p2

    .line 44
    .line 45
    const/4 p2, 0x1

    .line 46
    if-eq p1, p2, :cond_4

    .line 47
    .line 48
    const/4 p2, 0x2

    .line 49
    const/4 v0, 0x0

    .line 50
    if-eq p1, p2, :cond_3

    .line 51
    .line 52
    const/4 p2, 0x3

    .line 53
    if-eq p1, p2, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    iget-object p1, v1, Lvk0;->c:Lri0;

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget-object p2, p1, Lri0;->c:Ljava/util/LinkedHashSet;

    .line 61
    .line 62
    invoke-interface {p2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    iget-object p1, p1, Lri0;->b:Lui0;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object p2, p1, Lui0;->f:Lvk0;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    if-eq v1, p2, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    iput-object v3, p1, Lui0;->f:Lvk0;

    .line 80
    .line 81
    iput v0, p1, Lui0;->g:I

    .line 82
    .line 83
    iput-object v3, p1, Lui0;->h:Lti0;

    .line 84
    .line 85
    :goto_0
    iget-object p2, p1, Lui0;->d:Lx8;

    .line 86
    .line 87
    invoke-virtual {p2, v1}, Lx8;->remove(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    iget-object p2, p1, Lui0;->e:Lx8;

    .line 91
    .line 92
    invoke-virtual {p2, v1}, Lx8;->remove(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    iput-object v3, v1, Lvk0;->c:Lri0;

    .line 96
    .line 97
    invoke-virtual {p1}, Lui0;->b()V

    .line 98
    .line 99
    .line 100
    :cond_2
    check-cast v2, Ls90;

    .line 101
    .line 102
    invoke-virtual {v2, p0}, Ls90;->b(Lw90;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-virtual {v1, v0}, Lvk0;->a(Z)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    invoke-virtual {v1, p2}, Lvk0;->a(Z)V

    .line 111
    .line 112
    .line 113
    :goto_1
    return-void

    .line 114
    :pswitch_1
    sget-object p1, Lq90;->ON_START:Lq90;

    .line 115
    .line 116
    if-ne p2, p1, :cond_5

    .line 117
    .line 118
    check-cast v1, Ls90;

    .line 119
    .line 120
    invoke-virtual {v1, p0}, Ls90;->b(Lw90;)V

    .line 121
    .line 122
    .line 123
    check-cast v2, Lkx0;

    .line 124
    .line 125
    invoke-virtual {v2}, Lkx0;->d()V

    .line 126
    .line 127
    .line 128
    :cond_5
    return-void

    .line 129
    :pswitch_2
    check-cast v1, Lem;

    .line 130
    .line 131
    sget-object p0, Lfm;->a:[I

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    aget p0, p0, v0

    .line 138
    .line 139
    packed-switch p0, :pswitch_data_1

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lxc;->j()V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :pswitch_3
    const-string p0, "ON_ANY must not been send by anybody"

    .line 147
    .line 148
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :pswitch_5
    invoke-interface {v1, p1}, Lem;->a(Lx90;)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :pswitch_7
    invoke-interface {v1, p1}, Lem;->c(Lx90;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :pswitch_8
    invoke-interface {v1, p1}, Lem;->b(Lx90;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    :goto_2
    check-cast v2, Lv90;

    .line 176
    .line 177
    if-eqz v2, :cond_6

    .line 178
    .line 179
    invoke-interface {v2, p1, p2}, Lv90;->e(Lx90;Lq90;)V

    .line 180
    .line 181
    .line 182
    :cond_6
    :goto_3
    return-void

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
