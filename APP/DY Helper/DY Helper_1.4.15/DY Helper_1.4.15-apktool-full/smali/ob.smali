.class public final synthetic Lob;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lob;->α:I

    .line 2
    .line 3
    iput-object p2, p0, Lob;->β:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lob;->α:I

    .line 2
    .line 3
    iget-object p0, p0, Lob;->β:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lm01;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lm01;->dispatch$app(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, Leb;

    .line 16
    .line 17
    sget-object v0, Lsb;->α:Lsb;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget v2, Lsb;->τ:I

    .line 28
    .line 29
    if-gtz v2, :cond_11

    .line 30
    .line 31
    sget-boolean v2, Lsb;->ν:Z

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    instance-of v3, v2, Landroid/view/View;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    check-cast v2, Landroid/view/View;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v2, v4

    .line 50
    :goto_0
    if-nez v2, :cond_2

    .line 51
    .line 52
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :cond_2
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-array v5, v0, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-interface {v3, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget-object v5, p0, Leb;->α:Ldb;

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    const/4 v6, 0x2

    .line 78
    const/4 v7, 0x1

    .line 79
    if-eqz v5, :cond_7

    .line 80
    .line 81
    const/4 v8, 0x7

    .line 82
    if-eq v5, v7, :cond_5

    .line 83
    .line 84
    if-ne v5, v6, :cond_4

    .line 85
    .line 86
    invoke-static {v2, v8}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 87
    .line 88
    .line 89
    invoke-static {}, Lsb;->Η()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_9

    .line 94
    .line 95
    array-length v5, v3

    .line 96
    if-nez v5, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    aput-object v1, v3, v0

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-static {}, Lγ;->κ()V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_6

    .line 106
    .line 107
    :cond_5
    invoke-static {v2, v8}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 108
    .line 109
    .line 110
    invoke-static {}, Lsb;->Η()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_9

    .line 115
    .line 116
    array-length v1, v3

    .line 117
    if-nez v1, :cond_6

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    const/16 v1, 0x8

    .line 121
    .line 122
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    aput-object v1, v3, v0

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_7
    const/4 v5, 0x3

    .line 130
    invoke-static {v2, v5}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lsb;->Η()Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_9

    .line 138
    .line 139
    array-length v5, v3

    .line 140
    if-nez v5, :cond_8

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_8
    aput-object v1, v3, v0

    .line 144
    .line 145
    :cond_9
    :goto_1
    :try_start_0
    invoke-interface {p1, v3}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    sget v0, Lsb;->τ:I

    .line 150
    .line 151
    if-gtz v0, :cond_c

    .line 152
    .line 153
    sget-boolean v0, Lsb;->ν:Z

    .line 154
    .line 155
    if-eqz v0, :cond_c

    .line 156
    .line 157
    iget-object p0, p0, Leb;->α:Ldb;

    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-eqz p0, :cond_d

    .line 164
    .line 165
    if-eq p0, v7, :cond_b

    .line 166
    .line 167
    if-ne p0, v6, :cond_a

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_a
    invoke-static {}, Lγ;->κ()V

    .line 171
    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_b
    :goto_2
    invoke-static {}, Lsb;->Η()Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-eqz p0, :cond_c

    .line 179
    .line 180
    invoke-static {v2}, Lsb;->ξ(Landroid/view/View;)V

    .line 181
    .line 182
    .line 183
    :cond_c
    :goto_3
    move-object v4, p1

    .line 184
    goto :goto_6

    .line 185
    :cond_d
    invoke-static {v2}, Lsb;->б(Landroid/view/View;)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :catchall_0
    move-exception p1

    .line 190
    sget v0, Lsb;->τ:I

    .line 191
    .line 192
    if-gtz v0, :cond_10

    .line 193
    .line 194
    sget-boolean v0, Lsb;->ν:Z

    .line 195
    .line 196
    if-eqz v0, :cond_10

    .line 197
    .line 198
    iget-object p0, p0, Leb;->α:Ldb;

    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    if-eqz p0, :cond_f

    .line 205
    .line 206
    if-eq p0, v7, :cond_e

    .line 207
    .line 208
    if-ne p0, v6, :cond_a

    .line 209
    .line 210
    :cond_e
    invoke-static {}, Lsb;->Η()Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-eqz p0, :cond_10

    .line 215
    .line 216
    invoke-static {v2}, Lsb;->ξ(Landroid/view/View;)V

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_f
    invoke-static {v2}, Lsb;->б(Landroid/view/View;)V

    .line 221
    .line 222
    .line 223
    :cond_10
    :goto_4
    throw p1

    .line 224
    :cond_11
    :goto_5
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    :goto_6
    return-object v4

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
