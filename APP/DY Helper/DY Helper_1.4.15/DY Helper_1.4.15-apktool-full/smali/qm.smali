.class public final synthetic Lqm;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lhq1;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lqm;->α:I

    .line 2
    .line 3
    iput-object p2, p0, Lqm;->β:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final α()Landroid/os/Bundle;
    .locals 15

    .line 1
    iget v0, p0, Lqm;->α:I

    .line 2
    .line 3
    iget-object p0, p0, Lqm;->β:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lb70;

    .line 9
    .line 10
    invoke-virtual {p0}, Lb70;->Υ()Landroid/os/Bundle;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    move-object v0, p0

    .line 16
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 17
    .line 18
    sget p0, Landroidx/fragment/app/FragmentActivity;->Δ:I

    .line 19
    .line 20
    :cond_0
    iget-object p0, v0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 21
    .line 22
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lp60;

    .line 25
    .line 26
    iget-object p0, p0, Lp60;->ω:Lb70;

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/fragment/app/FragmentActivity;->κ(Lb70;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    iget-object p0, v0, Landroidx/fragment/app/FragmentActivity;->ω:Ljr0;

    .line 35
    .line 36
    sget-object v0, Lbr0;->ON_STOP:Lbr0;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljr0;->δ(Lbr0;)V

    .line 39
    .line 40
    .line 41
    new-instance p0, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    check-cast p0, Ly21;

    .line 48
    .line 49
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lb21;

    .line 52
    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    sget-object p0, Lkz;->ε:Lkz;

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_1
    const/4 v0, 0x0

    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    iget v1, p0, Lb21;->ε:I

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move v1, v0

    .line 65
    :goto_0
    add-int/2addr v1, v0

    .line 66
    new-instance v2, Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 69
    .line 70
    .line 71
    if-eqz p0, :cond_6

    .line 72
    .line 73
    iget-object v1, p0, Lb21;->β:[Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v3, p0, Lb21;->γ:[Ljava/lang/Object;

    .line 76
    .line 77
    iget-object p0, p0, Lb21;->α:[J

    .line 78
    .line 79
    array-length v4, p0

    .line 80
    add-int/lit8 v4, v4, -0x2

    .line 81
    .line 82
    if-ltz v4, :cond_6

    .line 83
    .line 84
    move v5, v0

    .line 85
    :goto_1
    aget-wide v6, p0, v5

    .line 86
    .line 87
    not-long v8, v6

    .line 88
    const/4 v10, 0x7

    .line 89
    shl-long/2addr v8, v10

    .line 90
    and-long/2addr v8, v6

    .line 91
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr v8, v10

    .line 97
    cmp-long v8, v8, v10

    .line 98
    .line 99
    if-eqz v8, :cond_5

    .line 100
    .line 101
    sub-int v8, v5, v4

    .line 102
    .line 103
    not-int v8, v8

    .line 104
    ushr-int/lit8 v8, v8, 0x1f

    .line 105
    .line 106
    const/16 v9, 0x8

    .line 107
    .line 108
    rsub-int/lit8 v8, v8, 0x8

    .line 109
    .line 110
    move v10, v0

    .line 111
    :goto_2
    if-ge v10, v8, :cond_4

    .line 112
    .line 113
    const-wide/16 v11, 0xff

    .line 114
    .line 115
    and-long/2addr v11, v6

    .line 116
    const-wide/16 v13, 0x80

    .line 117
    .line 118
    cmp-long v11, v11, v13

    .line 119
    .line 120
    if-gez v11, :cond_3

    .line 121
    .line 122
    shl-int/lit8 v11, v5, 0x3

    .line 123
    .line 124
    add-int/2addr v11, v10

    .line 125
    aget-object v12, v1, v11

    .line 126
    .line 127
    aget-object v11, v3, v11

    .line 128
    .line 129
    check-cast v11, Ljava/util/List;

    .line 130
    .line 131
    check-cast v12, Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v2, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    :cond_3
    shr-long/2addr v6, v9

    .line 137
    add-int/lit8 v10, v10, 0x1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    if-ne v8, v9, :cond_6

    .line 141
    .line 142
    :cond_5
    if-eq v5, v4, :cond_6

    .line 143
    .line 144
    add-int/lit8 v5, v5, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    move-object p0, v2

    .line 148
    :goto_3
    new-instance v0, Landroid/os/Bundle;

    .line 149
    .line 150
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_8

    .line 166
    .line 167
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Ljava/util/Map$Entry;

    .line 172
    .line 173
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, Ljava/lang/String;

    .line 178
    .line 179
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Ljava/util/List;

    .line 184
    .line 185
    instance-of v3, v1, Ljava/util/ArrayList;

    .line 186
    .line 187
    if-eqz v3, :cond_7

    .line 188
    .line 189
    check-cast v1, Ljava/util/ArrayList;

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_7
    new-instance v3, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 195
    .line 196
    .line 197
    move-object v1, v3

    .line 198
    :goto_5
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_8
    return-object v0

    .line 203
    :pswitch_2
    check-cast p0, Landroidx/activity/ComponentActivity;

    .line 204
    .line 205
    sget v0, Landroidx/activity/ComponentActivity;->χ:I

    .line 206
    .line 207
    new-instance v0, Landroid/os/Bundle;

    .line 208
    .line 209
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 210
    .line 211
    .line 212
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->ξ:Lsm;

    .line 213
    .line 214
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    new-instance v1, Ljava/util/ArrayList;

    .line 218
    .line 219
    iget-object v2, p0, Lsm;->β:Ljava/util/HashMap;

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 226
    .line 227
    .line 228
    const-string v3, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"

    .line 229
    .line 230
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 231
    .line 232
    .line 233
    new-instance v1, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 240
    .line 241
    .line 242
    const-string v2, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"

    .line 243
    .line 244
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 245
    .line 246
    .line 247
    new-instance v1, Ljava/util/ArrayList;

    .line 248
    .line 249
    iget-object v2, p0, Lsm;->δ:Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 252
    .line 253
    .line 254
    const-string v2, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"

    .line 255
    .line 256
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 257
    .line 258
    .line 259
    iget-object p0, p0, Lsm;->η:Landroid/os/Bundle;

    .line 260
    .line 261
    invoke-virtual {p0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    check-cast p0, Landroid/os/Bundle;

    .line 266
    .line 267
    const-string v1, "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"

    .line 268
    .line 269
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 270
    .line 271
    .line 272
    return-object v0

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
