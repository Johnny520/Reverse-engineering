.class public final synthetic Lcl1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcl1;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lcl1;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lcl1;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lcl1;->ζ:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lkx1;

    .line 10
    .line 11
    iget-object v0, p0, Lkx1;->η:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object p0, p0, Lkx1;->ι:Ljx1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Ljx1;->β:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Ljx1;->δ:I

    .line 25
    .line 26
    iget-object v3, p0, Ljx1;->γ:Lu11;

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    new-instance v3, Lu11;

    .line 31
    .line 32
    invoke-direct {v3}, Lu11;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v3, p0, Ljx1;->γ:Lu11;

    .line 36
    .line 37
    iget-object v4, p0, Ljx1;->ζ:Lb21;

    .line 38
    .line 39
    invoke-virtual {v4, v1, v3}, Lb21;->ν(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0, p1, v2, v1, v3}, Ljx1;->β(Ljava/lang/Object;ILjava/lang/Object;Lu11;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    monitor-exit v0

    .line 46
    sget-object p0, Ls62;->α:Ls62;

    .line 47
    .line 48
    return-object p0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    monitor-exit v0

    .line 51
    throw p0

    .line 52
    :pswitch_0
    check-cast p0, Lcom/example/dyhelper/ui/SettingsUIComponents;

    .line 53
    .line 54
    check-cast p1, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    sget v0, Lcom/example/dyhelper/ui/SettingsUIComponents;->ε:I

    .line 61
    .line 62
    int-to-float p1, p1

    .line 63
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {v1, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    float-to-int p0, p0

    .line 76
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_1
    check-cast p0, Lorg/json/JSONArray;

    .line 82
    .line 83
    check-cast p1, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_2
    check-cast p0, Lic;

    .line 98
    .line 99
    check-cast p1, Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_1

    .line 106
    .line 107
    const-string p1, "pet_elf_task_image_name"

    .line 108
    .line 109
    const-string v0, ""

    .line 110
    .line 111
    invoke-static {p1, v0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {p0, p1, v0}, Lic;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_3
    check-cast p0, Landroid/widget/Switch;

    .line 124
    .line 125
    check-cast p1, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_2

    .line 132
    .line 133
    sget-object p1, Lbv1;->α:Lbv1;

    .line 134
    .line 135
    const-string p1, "pet_elf_auto_image_enabled"

    .line 136
    .line 137
    invoke-static {p1, v1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 141
    .line 142
    .line 143
    :cond_2
    sget-object p0, Ls62;->α:Ls62;

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_4
    check-cast p0, Lsm1;

    .line 147
    .line 148
    check-cast p1, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    const/16 v0, 0x32

    .line 155
    .line 156
    const/16 v1, 0x96

    .line 157
    .line 158
    invoke-static {p1, v0, v1}, Lj81;->μ(III)I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    iget v0, p0, Lsm1;->ε:I

    .line 163
    .line 164
    if-eq p1, v0, :cond_3

    .line 165
    .line 166
    iput p1, p0, Lsm1;->ε:I

    .line 167
    .line 168
    sget-object p0, Lbv1;->α:Lbv1;

    .line 169
    .line 170
    const-string p0, "liquid_glass_bottom_bar_scale_percent"

    .line 171
    .line 172
    invoke-static {p0, p1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 173
    .line 174
    .line 175
    :cond_3
    sget-object p0, Ls62;->α:Ls62;

    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_5
    check-cast p0, Lkl1;

    .line 179
    .line 180
    check-cast p1, Ljava/lang/Throwable;

    .line 181
    .line 182
    const-string v0, "Recomposer effect job completed"

    .line 183
    .line 184
    new-instance v1, Ljava/util/concurrent/CancellationException;

    .line 185
    .line 186
    invoke-direct {v1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 190
    .line 191
    .line 192
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 193
    .line 194
    monitor-enter v0

    .line 195
    :try_start_1
    iget-object v2, p0, Lkl1;->δ:Lfo0;

    .line 196
    .line 197
    const/4 v3, 0x0

    .line 198
    if-eqz v2, :cond_4

    .line 199
    .line 200
    iget-object v4, p0, Lkl1;->φ:Lf02;

    .line 201
    .line 202
    sget-object v5, Lfl1;->ζ:Lfl1;

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4, v3, v5}, Lf02;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v1}, Lfo0;->ν(Ljava/util/concurrent/CancellationException;)V

    .line 211
    .line 212
    .line 213
    iput-object v3, p0, Lkl1;->σ:Lae;

    .line 214
    .line 215
    new-instance v1, Lqh1;

    .line 216
    .line 217
    const/4 v3, 0x4

    .line 218
    invoke-direct {v1, p0, v3, p1}, Lqh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v1}, Lfo0;->Κ(La80;)Lvt;

    .line 222
    .line 223
    .line 224
    goto :goto_0

    .line 225
    :catchall_1
    move-exception p0

    .line 226
    goto :goto_1

    .line 227
    :cond_4
    iput-object v1, p0, Lkl1;->ε:Ljava/lang/Throwable;

    .line 228
    .line 229
    iget-object p0, p0, Lkl1;->φ:Lf02;

    .line 230
    .line 231
    sget-object p1, Lfl1;->ε:Lfl1;

    .line 232
    .line 233
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v3, p1}, Lf02;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 237
    .line 238
    .line 239
    :goto_0
    monitor-exit v0

    .line 240
    sget-object p0, Ls62;->α:Ls62;

    .line 241
    .line 242
    return-object p0

    .line 243
    :goto_1
    monitor-exit v0

    .line 244
    throw p0

    .line 245
    :pswitch_6
    check-cast p0, Lzn;

    .line 246
    .line 247
    invoke-virtual {p0, p1}, Lzn;->ω(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    sget-object p0, Ls62;->α:Ls62;

    .line 251
    .line 252
    return-object p0

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
