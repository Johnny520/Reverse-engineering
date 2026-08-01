.class public final Lll;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lll;

.field public static final β:Landroid/os/Handler;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ε:Ljava/util/WeakHashMap;

.field public static volatile ζ:Lhl;

.field public static final η:Lwj;

.field public static final θ:Lwj;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lll;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lll;->α:Lll;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lll;->β:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lll;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lll;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    new-instance v0, Ljava/util/WeakHashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lll;->ε:Ljava/util/WeakHashMap;

    .line 40
    .line 41
    new-instance v0, Lhl;

    .line 42
    .line 43
    sget-object v2, Lkz;->ε:Lkz;

    .line 44
    .line 45
    invoke-direct {v0, v1, v1, v2}, Lhl;-><init>(ZZLjava/util/Map;)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lll;->ζ:Lhl;

    .line 49
    .line 50
    new-instance v0, Lwj;

    .line 51
    .line 52
    const/16 v1, 0x14

    .line 53
    .line 54
    invoke-direct {v0, v1}, Lwj;-><init>(I)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lll;->η:Lwj;

    .line 58
    .line 59
    new-instance v0, Lwj;

    .line 60
    .line 61
    const/16 v1, 0x15

    .line 62
    .line 63
    invoke-direct {v0, v1}, Lwj;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lll;->θ:Lwj;

    .line 67
    .line 68
    return-void
.end method

.method public static α(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;Lgl;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    new-instance v0, Lfl;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2, p3}, Lfl;-><init>(Landroid/view/View;Lcl;Lgl;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public static synthetic β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V
    .locals 1

    .line 1
    sget-object v0, Lgl;->δ:Lgl;

    .line 2
    .line 3
    invoke-static {p0, p1, p2, v0}, Lll;->α(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;Lgl;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static δ(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lfl;

    .line 16
    .line 17
    iget-object v1, v0, Lfl;->α:Landroid/view/View;

    .line 18
    .line 19
    new-instance v2, Ldl;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v2, v0, v3}, Ldl;-><init>(Lfl;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lll;->ξ(Landroid/view/View;Lp70;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public static ε(Ljava/lang/Object;Lyj;)Ljava/util/List;
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/view/View;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    sget-object p0, Ljz;->ε:Ljz;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance v1, Lfl;

    .line 16
    .line 17
    sget-object v2, Lgl;->ε:Lgl;

    .line 18
    .line 19
    sget-object v3, Lcl;->π:Lcl;

    .line 20
    .line 21
    invoke-direct {v1, v0, v3, v2}, Lfl;-><init>(Landroid/view/View;Lcl;Lgl;)V

    .line 22
    .line 23
    .line 24
    filled-new-array {v1}, [Lfl;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lkk;->α:Lkk;

    .line 33
    .line 34
    iget-object p1, p1, Lyj;->γ:Ljava/lang/reflect/Field;

    .line 35
    .line 36
    invoke-static {p0, p1}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object p1, Lgl;->η:Lgl;

    .line 41
    .line 42
    invoke-static {v0, p0, v3, p1}, Lll;->α(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;Lgl;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lll;->θ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static ζ(Landroid/view/View;)Lel;
    .locals 8

    .line 1
    new-instance v0, Lel;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    instance-of v3, p0, Landroid/widget/TextView;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    check-cast v5, Landroid/widget/TextView;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v5, v4

    .line 21
    :goto_0
    if-eqz v5, :cond_1

    .line 22
    .line 23
    invoke-virtual {v5}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object v5, v4

    .line 29
    :goto_1
    if-eqz v3, :cond_2

    .line 30
    .line 31
    move-object v3, p0

    .line 32
    check-cast v3, Landroid/widget/TextView;

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object v3, v4

    .line 36
    :goto_2
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move-object v3, v4

    .line 44
    :goto_3
    instance-of v6, p0, Landroid/widget/ImageView;

    .line 45
    .line 46
    if-eqz v6, :cond_4

    .line 47
    .line 48
    check-cast p0, Landroid/widget/ImageView;

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move-object p0, v4

    .line 52
    :goto_4
    if-eqz p0, :cond_5

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/widget/ImageView;->getColorFilter()Landroid/graphics/ColorFilter;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :cond_5
    move-object v7, v4

    .line 59
    move-object v4, v3

    .line 60
    move-object v3, v5

    .line 61
    move-object v5, v7

    .line 62
    invoke-direct/range {v0 .. v5}, Lel;-><init>(IFLandroid/content/res/ColorStateList;Ljava/lang/CharSequence;Landroid/graphics/ColorFilter;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method

.method public static η(Ljava/lang/Object;Lbk;Ljk;)Ljava/util/List;
    .locals 9

    .line 1
    sget-object v0, Lkk;->α:Lkk;

    .line 2
    .line 3
    iget-object v0, p1, Lbk;->δ:Ljava/lang/reflect/Field;

    .line 4
    .line 5
    iget-object v1, p1, Lbk;->ζ:Ljava/lang/reflect/Field;

    .line 6
    .line 7
    iget-object v2, p1, Lbk;->β:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-static {p0, v0}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v3, p1, Lbk;->α:Lzj;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    sget-object v5, Lgl;->δ:Lgl;

    .line 25
    .line 26
    sget-object v6, Lgl;->ε:Lgl;

    .line 27
    .line 28
    const-string v7, ".template."

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    packed-switch v3, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lγ;->κ()V

    .line 35
    .line 36
    .line 37
    return-object v8

    .line 38
    :pswitch_0
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1, v7, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    instance-of p1, v0, Landroid/view/View;

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    move-object v8, v0

    .line 53
    check-cast v8, Landroid/view/View;

    .line 54
    .line 55
    :cond_1
    if-nez v8, :cond_2

    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_2
    new-instance p1, Lfl;

    .line 60
    .line 61
    sget-object p2, Lcl;->π:Lcl;

    .line 62
    .line 63
    invoke-direct {p1, v8, p2, v6}, Lfl;-><init>(Landroid/view/View;Lcl;Lgl;)V

    .line 64
    .line 65
    .line 66
    filled-new-array {p1}, [Lfl;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p0, v1}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    sget-object v0, Lgl;->η:Lgl;

    .line 79
    .line 80
    invoke-static {p1, p0, p2, v0}, Lll;->α(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;Lgl;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, Lll;->θ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_3
    iget-object p0, p2, Ljk;->ε:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_5

    .line 99
    .line 100
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    move-object p2, p1

    .line 105
    check-cast p2, Lyj;

    .line 106
    .line 107
    iget-object p2, p2, Lyj;->α:Ljava/lang/Class;

    .line 108
    .line 109
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_4

    .line 114
    .line 115
    move-object v8, p1

    .line 116
    :cond_5
    check-cast v8, Lyj;

    .line 117
    .line 118
    if-nez v8, :cond_6

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_6
    invoke-static {v0, v8}, Lll;->ε(Ljava/lang/Object;Lyj;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :pswitch_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {v2, v7, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_9

    .line 135
    .line 136
    instance-of p2, v0, Landroid/view/View;

    .line 137
    .line 138
    if-eqz p2, :cond_7

    .line 139
    .line 140
    move-object v8, v0

    .line 141
    check-cast v8, Landroid/view/View;

    .line 142
    .line 143
    :cond_7
    if-nez v8, :cond_8

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_8
    new-instance p2, Lfl;

    .line 147
    .line 148
    sget-object v0, Lcl;->ν:Lcl;

    .line 149
    .line 150
    invoke-direct {p2, v8, v0, v6}, Lfl;-><init>(Landroid/view/View;Lcl;Lgl;)V

    .line 151
    .line 152
    .line 153
    filled-new-array {p2}, [Lfl;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-static {p2}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    iget-object p1, p1, Lbk;->η:Ljava/lang/reflect/Field;

    .line 162
    .line 163
    invoke-static {p0, p1}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    sget-object v0, Lcl;->ο:Lcl;

    .line 168
    .line 169
    invoke-static {p2, p1, v0}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 170
    .line 171
    .line 172
    invoke-static {p0, v1}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    sget-object p1, Lcl;->ξ:Lcl;

    .line 177
    .line 178
    invoke-static {p2, p0, p1}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 179
    .line 180
    .line 181
    invoke-static {p2}, Lll;->θ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0

    .line 186
    :cond_9
    iget-object p0, p2, Ljk;->δ:Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    if-eqz p1, :cond_b

    .line 197
    .line 198
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    move-object p2, p1

    .line 203
    check-cast p2, Ldk;

    .line 204
    .line 205
    iget-object p2, p2, Ldk;->α:Ljava/lang/Class;

    .line 206
    .line 207
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    if-eqz p2, :cond_a

    .line 212
    .line 213
    move-object v8, p1

    .line 214
    :cond_b
    check-cast v8, Ldk;

    .line 215
    .line 216
    if-nez v8, :cond_c

    .line 217
    .line 218
    :goto_0
    sget-object p0, Ljz;->ε:Ljz;

    .line 219
    .line 220
    return-object p0

    .line 221
    :cond_c
    invoke-static {v0, v8}, Lll;->ι(Ljava/lang/Object;Ldk;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :pswitch_2
    sget-object p0, Lcl;->λ:Lcl;

    .line 227
    .line 228
    sget-object p1, Lgl;->ζ:Lgl;

    .line 229
    .line 230
    invoke-static {v0, p0, p1}, Lll;->ο(Ljava/lang/Object;Lcl;Lgl;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    return-object p0

    .line 235
    :pswitch_3
    sget-object p0, Lcl;->κ:Lcl;

    .line 236
    .line 237
    invoke-static {v0, p0, v5}, Lll;->ο(Ljava/lang/Object;Lcl;Lgl;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0

    .line 242
    :pswitch_4
    sget-object p0, Lcl;->ι:Lcl;

    .line 243
    .line 244
    invoke-static {v0, p0, v5}, Lll;->ο(Ljava/lang/Object;Lcl;Lgl;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    return-object p0

    .line 249
    :pswitch_5
    sget-object p0, Lcl;->θ:Lcl;

    .line 250
    .line 251
    invoke-static {v0, p0, v5}, Lll;->ο(Ljava/lang/Object;Lcl;Lgl;)Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    return-object p0

    .line 256
    :pswitch_6
    new-instance p2, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 259
    .line 260
    .line 261
    sget-object v1, Lcl;->η:Lcl;

    .line 262
    .line 263
    invoke-static {p2, v0, v1}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 264
    .line 265
    .line 266
    iget-object p1, p1, Lbk;->ε:Ljava/util/ArrayList;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_d

    .line 277
    .line 278
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, Ljava/lang/reflect/Field;

    .line 283
    .line 284
    sget-object v2, Lkk;->α:Lkk;

    .line 285
    .line 286
    invoke-static {p0, v0}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {p2, v0, v1}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 291
    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_d
    invoke-static {p2}, Lll;->θ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    return-object p0

    .line 299
    :pswitch_7
    sget-object p0, Lcl;->ζ:Lcl;

    .line 300
    .line 301
    invoke-static {v0, p0, v5}, Lll;->ο(Ljava/lang/Object;Lcl;Lgl;)Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    return-object p0

    .line 306
    nop

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static θ(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    move-object v3, v2

    .line 30
    check-cast v3, Lfl;

    .line 31
    .line 32
    iget-object v3, v3, Lfl;->α:Landroid/view/View;

    .line 33
    .line 34
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-object v1
.end method

.method public static ι(Ljava/lang/Object;Ldk;)Ljava/util/List;
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/view/View;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    sget-object p0, Ljz;->ε:Ljz;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance v1, Lfl;

    .line 16
    .line 17
    sget-object v2, Lcl;->ν:Lcl;

    .line 18
    .line 19
    sget-object v3, Lgl;->ε:Lgl;

    .line 20
    .line 21
    invoke-direct {v1, v0, v2, v3}, Lfl;-><init>(Landroid/view/View;Lcl;Lgl;)V

    .line 22
    .line 23
    .line 24
    filled-new-array {v1}, [Lfl;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lyh;->θ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lkk;->α:Lkk;

    .line 33
    .line 34
    iget-object v1, p1, Ldk;->γ:Ljava/lang/reflect/Field;

    .line 35
    .line 36
    invoke-static {p0, v1}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Lcl;->ο:Lcl;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p1, Ldk;->δ:Ljava/lang/reflect/Field;

    .line 46
    .line 47
    invoke-static {p0, p1}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    sget-object p1, Lcl;->ξ:Lcl;

    .line 52
    .line 53
    invoke-static {v0, p0, p1}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lll;->θ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public static κ(Ljava/lang/Object;Lik;Ljk;)Ljava/util/List;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljz;->ε:Ljz;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v0, p1, Lik;->ε:Lgk;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lkk;->α:Lkk;

    .line 14
    .line 15
    iget-object v2, v0, Lgk;->α:Ljava/lang/reflect/Field;

    .line 16
    .line 17
    invoke-static {p0, v2}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Lcl;->ζ:Lcl;

    .line 22
    .line 23
    invoke-static {v1, v2, v3}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, Lgk;->β:Ljava/lang/reflect/Field;

    .line 27
    .line 28
    invoke-static {p0, v2}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v3, Lcl;->η:Lcl;

    .line 33
    .line 34
    invoke-static {v1, v2, v3}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, Lgk;->γ:Ljava/lang/reflect/Field;

    .line 38
    .line 39
    invoke-static {p0, v2}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, Lcl;->θ:Lcl;

    .line 44
    .line 45
    invoke-static {v1, v2, v3}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v0, Lgk;->δ:Ljava/lang/reflect/Field;

    .line 49
    .line 50
    invoke-static {p0, v2}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v3, Lcl;->ι:Lcl;

    .line 55
    .line 56
    invoke-static {v1, v2, v3}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v0, Lgk;->ε:Ljava/lang/reflect/Field;

    .line 60
    .line 61
    invoke-static {p0, v2}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    sget-object v3, Lcl;->κ:Lcl;

    .line 66
    .line 67
    invoke-static {v1, v2, v3}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, v0, Lgk;->ζ:Ljava/lang/reflect/Field;

    .line 71
    .line 72
    invoke-static {p0, v2}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    sget-object v3, Lcl;->ν:Lcl;

    .line 77
    .line 78
    sget-object v4, Lgl;->ε:Lgl;

    .line 79
    .line 80
    invoke-static {v1, v2, v3, v4}, Lll;->α(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;Lgl;)V

    .line 81
    .line 82
    .line 83
    iget-object v2, v0, Lgk;->η:Ljava/lang/reflect/Field;

    .line 84
    .line 85
    invoke-static {p0, v2}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    sget-object v3, Lcl;->ξ:Lcl;

    .line 90
    .line 91
    invoke-static {v1, v2, v3}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 92
    .line 93
    .line 94
    iget-object v2, v0, Lgk;->θ:Ljava/lang/reflect/Field;

    .line 95
    .line 96
    invoke-static {p0, v2}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    sget-object v3, Lcl;->ο:Lcl;

    .line 101
    .line 102
    invoke-static {v1, v2, v3}, Lll;->β(Ljava/util/ArrayList;Ljava/lang/Object;Lcl;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, v0, Lgk;->ι:Ljava/lang/reflect/Field;

    .line 106
    .line 107
    invoke-static {p0, v0}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    iget-object p1, p1, Lik;->ζ:Lck;

    .line 112
    .line 113
    if-eqz p0, :cond_8

    .line 114
    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    iget-object v0, p1, Lck;->β:Ljava/lang/reflect/Field;

    .line 118
    .line 119
    iget-object v2, p1, Lck;->γ:Ljava/lang/reflect/Field;

    .line 120
    .line 121
    filled-new-array {v0, v2}, [Ljava/lang/reflect/Field;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    const/4 v3, 0x0

    .line 138
    if-eqz v2, :cond_5

    .line 139
    .line 140
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Ljava/lang/reflect/Field;

    .line 145
    .line 146
    sget-object v4, Lkk;->α:Lkk;

    .line 147
    .line 148
    invoke-static {p0, v2}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    if-nez v2, :cond_2

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_2
    iget-object v4, p2, Ljk;->δ:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-eqz v5, :cond_4

    .line 166
    .line 167
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    move-object v6, v5

    .line 172
    check-cast v6, Ldk;

    .line 173
    .line 174
    iget-object v6, v6, Ldk;->α:Ljava/lang/Class;

    .line 175
    .line 176
    invoke-virtual {v6, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-eqz v6, :cond_3

    .line 181
    .line 182
    move-object v3, v5

    .line 183
    :cond_4
    check-cast v3, Ldk;

    .line 184
    .line 185
    if-eqz v3, :cond_1

    .line 186
    .line 187
    invoke-static {v2, v3}, Lll;->ι(Ljava/lang/Object;Ldk;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v1, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 192
    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_5
    sget-object v0, Lkk;->α:Lkk;

    .line 196
    .line 197
    iget-object p1, p1, Lck;->δ:Ljava/lang/reflect/Field;

    .line 198
    .line 199
    invoke-static {p0, p1}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    iget-object p1, p2, Ljk;->ε:Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    if-eqz p2, :cond_7

    .line 214
    .line 215
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    move-object v0, p2

    .line 220
    check-cast v0, Lyj;

    .line 221
    .line 222
    iget-object v0, v0, Lyj;->α:Ljava/lang/Class;

    .line 223
    .line 224
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_6

    .line 229
    .line 230
    move-object v3, p2

    .line 231
    :cond_7
    check-cast v3, Lyj;

    .line 232
    .line 233
    if-eqz v3, :cond_8

    .line 234
    .line 235
    invoke-static {p0, v3}, Lll;->ε(Ljava/lang/Object;Lyj;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {v1, p0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 240
    .line 241
    .line 242
    :cond_8
    invoke-static {v1}, Lll;->θ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    return-object p0
.end method

.method public static λ(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lfl;

    .line 31
    .line 32
    iget-object v1, v0, Lfl;->α:Landroid/view/View;

    .line 33
    .line 34
    new-instance v2, Ldl;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v2, v0, v3}, Ldl;-><init>(Lfl;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Lll;->ξ(Landroid/view/View;Lp70;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    return-void
.end method

.method public static μ()V
    .locals 6

    .line 1
    sget-object v0, Lll;->α:Lll;

    .line 2
    .line 3
    invoke-static {}, Lpd2;->Β()Lhl;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, Lll;->ζ:Lhl;

    .line 8
    .line 9
    sget-object v1, Lll;->ε:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v1, Ljava/lang/Iterable;

    .line 19
    .line 20
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/16 v3, 0xa

    .line 23
    .line 24
    invoke-static {v1, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/util/Map$Entry;

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lkl;

    .line 56
    .line 57
    iget-object v3, v3, Lkl;->α:Lfl;

    .line 58
    .line 59
    new-instance v5, Ll91;

    .line 60
    .line 61
    invoke-direct {v5, v4, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Ll91;

    .line 83
    .line 84
    iget-object v3, v2, Ll91;->ε:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v3, Landroid/view/View;

    .line 87
    .line 88
    iget-object v2, v2, Ll91;->ζ:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Lfl;

    .line 91
    .line 92
    sget-object v4, Lll;->ε:Ljava/util/WeakHashMap;

    .line 93
    .line 94
    invoke-virtual {v4, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Lkl;

    .line 99
    .line 100
    if-eqz v4, :cond_1

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v3, v4}, Lll;->ν(Landroid/view/View;Lkl;)V

    .line 106
    .line 107
    .line 108
    :cond_1
    const/4 v3, 0x0

    .line 109
    invoke-virtual {v0, v2, v3}, Lll;->γ(Lfl;Z)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    return-void
.end method

.method public static ν(Landroid/view/View;Lkl;)V
    .locals 5

    .line 1
    iget-boolean v0, p1, Lkl;->γ:Z

    .line 2
    .line 3
    iget-object v1, p1, Lkl;->δ:Ljava/util/List;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p1, Lkl;->ε:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p1, Lkl;->β:Lel;

    .line 19
    .line 20
    iget-object v2, p1, Lkl;->α:Lfl;

    .line 21
    .line 22
    iget-object v2, v2, Lfl;->γ:Lgl;

    .line 23
    .line 24
    iget-boolean v2, v2, Lgl;->α:Z

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iget v3, v0, Lel;->α:I

    .line 33
    .line 34
    if-eq v2, v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v2, p1, Lkl;->α:Lfl;

    .line 40
    .line 41
    iget-object v2, v2, Lfl;->γ:Lgl;

    .line 42
    .line 43
    iget-boolean v2, v2, Lgl;->β:Z

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    iget v3, v0, Lel;->β:F

    .line 52
    .line 53
    cmpg-float v2, v2, v3

    .line 54
    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_0
    instance-of v2, p0, Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v2, :cond_8

    .line 64
    .line 65
    iget-boolean v2, p1, Lkl;->ε:Z

    .line 66
    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    move-object v2, p0

    .line 70
    check-cast v2, Landroid/widget/TextView;

    .line 71
    .line 72
    iget-object v3, v0, Lel;->δ:Ljava/lang/CharSequence;

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move-object v2, p0

    .line 79
    check-cast v2, Landroid/widget/TextView;

    .line 80
    .line 81
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    instance-of v3, v2, Landroid/text/Spannable;

    .line 86
    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    check-cast v2, Landroid/text/Spannable;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    const/4 v2, 0x0

    .line 93
    :goto_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_7

    .line 102
    .line 103
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Lil;

    .line 108
    .line 109
    if-eqz v2, :cond_6

    .line 110
    .line 111
    invoke-interface {v2, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_7
    :goto_3
    iget-object v0, v0, Lel;->γ:Landroid/content/res/ColorStateList;

    .line 116
    .line 117
    if-eqz v0, :cond_a

    .line 118
    .line 119
    check-cast p0, Landroid/widget/TextView;

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_8
    instance-of v2, p0, Landroid/widget/ImageView;

    .line 126
    .line 127
    if-eqz v2, :cond_a

    .line 128
    .line 129
    iget-object v0, v0, Lel;->ε:Landroid/graphics/ColorFilter;

    .line 130
    .line 131
    check-cast p0, Landroid/widget/ImageView;

    .line 132
    .line 133
    if-nez v0, :cond_9

    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/widget/ImageView;->clearColorFilter()V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_9
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 140
    .line 141
    .line 142
    :cond_a
    :goto_4
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 143
    .line 144
    .line 145
    const/4 p0, 0x0

    .line 146
    iput-boolean p0, p1, Lkl;->ε:Z

    .line 147
    .line 148
    iput-boolean p0, p1, Lkl;->γ:Z

    .line 149
    .line 150
    return-void
.end method

.method public static ξ(Landroid/view/View;Lp70;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    new-instance v0, Leo1;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object p1, v0

    .line 27
    :goto_0
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v0, "\u8bc4\u8bba\u63a7\u4ef6\u6837\u5f0f\u5904\u7406\u5931\u8d25: "

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, "r8dc155644f53e174"

    .line 48
    .line 49
    invoke-static {v0, p0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void

    .line 53
    :cond_1
    new-instance v0, Lw1;

    .line 54
    .line 55
    const/16 v1, 0x9

    .line 56
    .line 57
    invoke-direct {v0, p1, v1, p0}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static ο(Ljava/lang/Object;Lcl;Lgl;)Ljava/util/List;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/view/View;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    if-nez p0, :cond_1

    .line 10
    .line 11
    sget-object p0, Ljz;->ε:Ljz;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    new-instance v0, Lfl;

    .line 15
    .line 16
    invoke-direct {v0, p0, p1, p2}, Lfl;-><init>(Landroid/view/View;Lcl;Lgl;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final γ(Lfl;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, Ljz;->ε:Ljz;

    .line 4
    .line 5
    sget-object v2, Lll;->ε:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    iget-object v3, v0, Lfl;->α:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Lkl;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    iget-boolean v4, v3, Lkl;->γ:Z

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    iget-object v4, v0, Lfl;->α:Landroid/view/View;

    .line 22
    .line 23
    invoke-static {v4, v3}, Lll;->ν(Landroid/view/View;Lkl;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    if-nez v3, :cond_1

    .line 27
    .line 28
    new-instance v3, Lkl;

    .line 29
    .line 30
    iget-object v4, v0, Lfl;->α:Landroid/view/View;

    .line 31
    .line 32
    invoke-static {v4}, Lll;->ζ(Landroid/view/View;)Lel;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-direct {v3, v0, v4}, Lkl;-><init>(Lfl;Lel;)V

    .line 37
    .line 38
    .line 39
    iget-object v4, v0, Lfl;->α:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {v2, v4, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput-object v0, v3, Lkl;->α:Lfl;

    .line 46
    .line 47
    if-eqz p2, :cond_2

    .line 48
    .line 49
    iget-object v2, v0, Lfl;->α:Landroid/view/View;

    .line 50
    .line 51
    invoke-static {v2}, Lll;->ζ(Landroid/view/View;)Lel;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iput-object v2, v3, Lkl;->β:Lel;

    .line 56
    .line 57
    :cond_2
    :goto_0
    sget-object v2, Lll;->ζ:Lhl;

    .line 58
    .line 59
    iget-boolean v4, v2, Lhl;->α:Z

    .line 60
    .line 61
    if-nez v4, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    iget-object v2, v2, Lhl;->γ:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v4, v0, Lfl;->β:Lcl;

    .line 67
    .line 68
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljl;

    .line 73
    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    :goto_1
    return-void

    .line 77
    :cond_4
    iget-object v4, v0, Lfl;->γ:Lgl;

    .line 78
    .line 79
    iget-boolean v4, v4, Lgl;->α:Z

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x1

    .line 83
    if-eqz v4, :cond_5

    .line 84
    .line 85
    iget-boolean v4, v2, Ljl;->α:Z

    .line 86
    .line 87
    if-nez v4, :cond_5

    .line 88
    .line 89
    iget-object v4, v0, Lfl;->α:Landroid/view/View;

    .line 90
    .line 91
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const/16 v7, 0x8

    .line 96
    .line 97
    if-eq v4, v7, :cond_5

    .line 98
    .line 99
    iget-object v4, v0, Lfl;->α:Landroid/view/View;

    .line 100
    .line 101
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 102
    .line 103
    .line 104
    move v4, v6

    .line 105
    goto :goto_2

    .line 106
    :cond_5
    move v4, v5

    .line 107
    :goto_2
    iget-object v7, v0, Lfl;->γ:Lgl;

    .line 108
    .line 109
    iget-boolean v7, v7, Lgl;->β:Z

    .line 110
    .line 111
    if-eqz v7, :cond_7

    .line 112
    .line 113
    iget-object v7, v3, Lkl;->β:Lel;

    .line 114
    .line 115
    iget v7, v7, Lel;->β:F

    .line 116
    .line 117
    iget v8, v2, Ljl;->β:F

    .line 118
    .line 119
    mul-float/2addr v7, v8

    .line 120
    const/4 v8, 0x0

    .line 121
    const/high16 v9, 0x3f800000    # 1.0f

    .line 122
    .line 123
    invoke-static {v7, v8, v9}, Lj81;->λ(FFF)F

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    iget-object v8, v0, Lfl;->α:Landroid/view/View;

    .line 128
    .line 129
    invoke-virtual {v8}, Landroid/view/View;->getAlpha()F

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    cmpg-float v8, v8, v7

    .line 134
    .line 135
    if-nez v8, :cond_6

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    iget-object v4, v0, Lfl;->α:Landroid/view/View;

    .line 139
    .line 140
    invoke-virtual {v4, v7}, Landroid/view/View;->setAlpha(F)V

    .line 141
    .line 142
    .line 143
    move v4, v6

    .line 144
    :cond_7
    :goto_3
    iget-object v7, v0, Lfl;->γ:Lgl;

    .line 145
    .line 146
    iget-boolean v7, v7, Lgl;->γ:Z

    .line 147
    .line 148
    if-eqz v7, :cond_1d

    .line 149
    .line 150
    iget-object v2, v2, Ljl;->γ:Ljava/lang/Integer;

    .line 151
    .line 152
    if-eqz v2, :cond_1d

    .line 153
    .line 154
    iget-object v7, v0, Lfl;->α:Landroid/view/View;

    .line 155
    .line 156
    iget-object v0, v0, Lfl;->β:Lcl;

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    instance-of v8, v7, Landroid/widget/TextView;

    .line 163
    .line 164
    if-eqz v8, :cond_1a

    .line 165
    .line 166
    sget-object v8, Lcl;->θ:Lcl;

    .line 167
    .line 168
    if-ne v0, v8, :cond_19

    .line 169
    .line 170
    sget-object v0, Lll;->ζ:Lhl;

    .line 171
    .line 172
    iget-boolean v0, v0, Lhl;->β:Z

    .line 173
    .line 174
    if-eqz v0, :cond_19

    .line 175
    .line 176
    check-cast v7, Landroid/widget/TextView;

    .line 177
    .line 178
    invoke-virtual {v7}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-nez v0, :cond_9

    .line 183
    .line 184
    :cond_8
    move v0, v5

    .line 185
    goto/16 :goto_d

    .line 186
    .line 187
    :cond_9
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    if-nez v8, :cond_a

    .line 192
    .line 193
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 194
    .line 195
    .line 196
    :goto_4
    move v0, v6

    .line 197
    goto/16 :goto_d

    .line 198
    .line 199
    :cond_a
    instance-of v8, v0, Landroid/text/Spanned;

    .line 200
    .line 201
    if-nez v8, :cond_b

    .line 202
    .line 203
    goto/16 :goto_8

    .line 204
    .line 205
    :cond_b
    move-object v8, v0

    .line 206
    check-cast v8, Landroid/text/Spanned;

    .line 207
    .line 208
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    const-class v10, Landroid/text/style/ClickableSpan;

    .line 213
    .line 214
    invoke-interface {v8, v5, v9, v10}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v8}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    new-instance v9, Lng;

    .line 226
    .line 227
    const/4 v15, 0x0

    .line 228
    const/16 v16, 0x3

    .line 229
    .line 230
    const/4 v10, 0x1

    .line 231
    const-class v12, Lll;

    .line 232
    .line 233
    const-string v13, "isHostMentionSpan"

    .line 234
    .line 235
    const-string v14, "isHostMentionSpan(Landroid/text/style/ClickableSpan;)Z"

    .line 236
    .line 237
    move-object/from16 v11, p0

    .line 238
    .line 239
    invoke-direct/range {v9 .. v16}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 240
    .line 241
    .line 242
    new-instance v10, Ly30;

    .line 243
    .line 244
    invoke-direct {v10, v8, v6, v9}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 245
    .line 246
    .line 247
    new-instance v8, Lθ;

    .line 248
    .line 249
    const/16 v9, 0xb

    .line 250
    .line 251
    invoke-direct {v8, v9, v0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-static {v10, v8}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    new-instance v9, Ltf;

    .line 259
    .line 260
    const/16 v10, 0x12

    .line 261
    .line 262
    invoke-direct {v9, v10}, Ltf;-><init>(I)V

    .line 263
    .line 264
    .line 265
    new-instance v10, Lye;

    .line 266
    .line 267
    const/4 v11, 0x1

    .line 268
    invoke-direct {v10, v11, v9}, Lye;-><init>(ILjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v8}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    invoke-static {v8, v10}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 276
    .line 277
    .line 278
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-nez v9, :cond_c

    .line 287
    .line 288
    move-object v8, v1

    .line 289
    goto :goto_6

    .line 290
    :cond_c
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v10

    .line 298
    if-nez v10, :cond_d

    .line 299
    .line 300
    invoke-static {v9}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    goto :goto_6

    .line 305
    :cond_d
    invoke-static {v9}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v10

    .line 313
    if-eqz v10, :cond_e

    .line 314
    .line 315
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_e
    move-object v8, v9

    .line 324
    :goto_6
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    if-eqz v9, :cond_f

    .line 329
    .line 330
    goto :goto_8

    .line 331
    :cond_f
    new-instance v1, Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 341
    .line 342
    .line 343
    move-result v9

    .line 344
    if-eqz v9, :cond_11

    .line 345
    .line 346
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    check-cast v9, Lxm0;

    .line 351
    .line 352
    invoke-static {v1}, Lxh;->Р(Ljava/util/List;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v10

    .line 356
    check-cast v10, Lxm0;

    .line 357
    .line 358
    if-eqz v10, :cond_10

    .line 359
    .line 360
    iget v11, v10, Lvm0;->ζ:I

    .line 361
    .line 362
    iget v12, v9, Lvm0;->ε:I

    .line 363
    .line 364
    add-int/lit8 v13, v11, 0x1

    .line 365
    .line 366
    if-gt v12, v13, :cond_10

    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 369
    .line 370
    .line 371
    move-result v12

    .line 372
    sub-int/2addr v12, v6

    .line 373
    new-instance v13, Lxm0;

    .line 374
    .line 375
    iget v10, v10, Lvm0;->ε:I

    .line 376
    .line 377
    iget v9, v9, Lvm0;->ζ:I

    .line 378
    .line 379
    invoke-static {v11, v9}, Ljava/lang/Math;->max(II)I

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    invoke-direct {v13, v10, v9, v6}, Lvm0;-><init>(III)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v12, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_10
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_11
    :goto_8
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    if-eqz v8, :cond_12

    .line 399
    .line 400
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 401
    .line 402
    .line 403
    goto/16 :goto_4

    .line 404
    .line 405
    :cond_12
    instance-of v8, v0, Landroid/text/Spannable;

    .line 406
    .line 407
    if-eqz v8, :cond_13

    .line 408
    .line 409
    check-cast v0, Landroid/text/Spannable;

    .line 410
    .line 411
    goto :goto_9

    .line 412
    :cond_13
    new-instance v8, Landroid/text/SpannableString;

    .line 413
    .line 414
    invoke-direct {v8, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 415
    .line 416
    .line 417
    sget-object v0, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    .line 418
    .line 419
    invoke-virtual {v7, v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 420
    .line 421
    .line 422
    iput-boolean v6, v3, Lkl;->ε:Z

    .line 423
    .line 424
    move-object v0, v8

    .line 425
    :goto_9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    move v7, v5

    .line 430
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v8

    .line 434
    const v9, 0x7f0021

    .line 435
    .line 436
    .line 437
    if-eqz v8, :cond_16

    .line 438
    .line 439
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    check-cast v8, Lxm0;

    .line 444
    .line 445
    iget v10, v8, Lvm0;->ε:I

    .line 446
    .line 447
    if-ge v7, v10, :cond_15

    .line 448
    .line 449
    if-gt v10, v7, :cond_14

    .line 450
    .line 451
    goto :goto_b

    .line 452
    :cond_14
    new-instance v11, Lil;

    .line 453
    .line 454
    invoke-direct {v11, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 455
    .line 456
    .line 457
    invoke-interface {v0, v11, v7, v10, v9}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 458
    .line 459
    .line 460
    iget-object v9, v3, Lkl;->δ:Ljava/util/List;

    .line 461
    .line 462
    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    :cond_15
    :goto_b
    iget v8, v8, Lvm0;->ζ:I

    .line 466
    .line 467
    add-int/2addr v8, v6

    .line 468
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 469
    .line 470
    .line 471
    move-result v7

    .line 472
    goto :goto_a

    .line 473
    :cond_16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    if-ge v7, v1, :cond_18

    .line 478
    .line 479
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    if-gt v1, v7, :cond_17

    .line 484
    .line 485
    goto :goto_c

    .line 486
    :cond_17
    new-instance v8, Lil;

    .line 487
    .line 488
    invoke-direct {v8, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 489
    .line 490
    .line 491
    invoke-interface {v0, v8, v7, v1, v9}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 492
    .line 493
    .line 494
    iget-object v0, v3, Lkl;->δ:Ljava/util/List;

    .line 495
    .line 496
    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    :cond_18
    :goto_c
    iget-object v0, v3, Lkl;->δ:Ljava/util/List;

    .line 500
    .line 501
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    xor-int/2addr v0, v6

    .line 506
    goto :goto_d

    .line 507
    :cond_19
    check-cast v7, Landroid/widget/TextView;

    .line 508
    .line 509
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_4

    .line 513
    .line 514
    :cond_1a
    instance-of v0, v7, Landroid/widget/ImageView;

    .line 515
    .line 516
    if-eqz v0, :cond_8

    .line 517
    .line 518
    check-cast v7, Landroid/widget/ImageView;

    .line 519
    .line 520
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 521
    .line 522
    invoke-virtual {v7, v2, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 523
    .line 524
    .line 525
    goto/16 :goto_4

    .line 526
    .line 527
    :goto_d
    if-nez v0, :cond_1b

    .line 528
    .line 529
    if-eqz v4, :cond_1c

    .line 530
    .line 531
    :cond_1b
    move v5, v6

    .line 532
    :cond_1c
    move v4, v5

    .line 533
    :cond_1d
    iput-boolean v4, v3, Lkl;->γ:Z

    .line 534
    .line 535
    return-void
.end method
