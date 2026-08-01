.class public final Lb72;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lfe0;


# direct methods
.method public synthetic constructor <init>(Lfe0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb72;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lb72;->β:Lfe0;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lk01;)V
    .locals 3

    .line 1
    iget v0, p0, Lb72;->α:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v1, Lbe0;->α:Lbe0;

    .line 12
    .line 13
    invoke-virtual {v1}, Lbe0;->η()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    iget-object p0, p0, Lb72;->β:Lfe0;

    .line 21
    .line 22
    iget-object p0, p0, Lfe0;->β:Ljava/lang/Class;

    .line 23
    .line 24
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    invoke-static {p0, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    instance-of v1, p1, Ljava/util/List;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    check-cast p1, Ljava/util/List;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 p1, 0x0

    .line 49
    :goto_0
    if-nez p1, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    invoke-static {p1}, Lvd0;->η(Ljava/util/List;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-ge v2, p1, :cond_4

    .line 65
    .line 66
    new-instance p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 69
    .line 70
    .line 71
    aput-object p1, v0, p0

    .line 72
    .line 73
    :cond_4
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    new-instance p1, Leo1;

    .line 78
    .line 79
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object p0, p1

    .line 83
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-eqz p0, :cond_5

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string p1, "search suggestion callback failed: "

    .line 94
    .line 95
    const-string v0, "r3912affb67f40e11"

    .line 96
    .line 97
    invoke-static {p1, p0, v0}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_2
    return-void

    .line 101
    :pswitch_0
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 102
    .line 103
    sget-object v1, Lbe0;->α:Lbe0;

    .line 104
    .line 105
    invoke-virtual {v1}, Lbe0;->η()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_6

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_6
    iget-object p0, p0, Lb72;->β:Lfe0;

    .line 113
    .line 114
    iget-object p0, p0, Lfe0;->β:Ljava/lang/Class;

    .line 115
    .line 116
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_7

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_7
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    const/4 p0, 0x0

    .line 129
    invoke-static {p0, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    instance-of v1, p1, Ljava/util/List;

    .line 134
    .line 135
    if-eqz v1, :cond_8

    .line 136
    .line 137
    check-cast p1, Ljava/util/List;

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    const/4 p1, 0x0

    .line 141
    :goto_3
    if-nez p1, :cond_9

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_9
    invoke-static {p1}, Lvd0;->η(Ljava/util/List;)Ljava/util/ArrayList;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-ge v2, p1, :cond_a

    .line 157
    .line 158
    new-instance p1, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 161
    .line 162
    .line 163
    aput-object p1, v0, p0

    .line 164
    .line 165
    :cond_a
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :catchall_1
    move-exception p0

    .line 169
    new-instance p1, Leo1;

    .line 170
    .line 171
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    move-object p0, p1

    .line 175
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    if-eqz p0, :cond_b

    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    const-string p1, "feed search callback failed: "

    .line 186
    .line 187
    const-string v0, "r3912affb67f40e11"

    .line 188
    .line 189
    invoke-static {p1, p0, v0}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :cond_b
    :goto_5
    return-void

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
