.class public final synthetic Lwb/od;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/od;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/od;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lwb/od;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    const-string v1, "agent_history_gesture_hint"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, Lwb/od;->i:Li0/a1;

    .line 12
    .line 13
    iget-object v4, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 14
    .line 15
    invoke-static {v3, v0, v4, v1, v2}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    iget-object v0, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "comment_logs"

    .line 28
    .line 29
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 34
    .line 35
    .line 36
    const-string v0, ""

    .line 37
    .line 38
    iget-object v1, p0, Lwb/od;->i:Li0/a1;

    .line 39
    .line 40
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    iget-object v0, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    const-string v1, "comment_logs"

    .line 47
    .line 48
    const-string v2, ""

    .line 49
    .line 50
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez v0, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    move-object v2, v0

    .line 58
    :goto_1
    iget-object v0, p0, Lwb/od;->i:Li0/a1;

    .line 59
    .line 60
    invoke-interface {v0, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_2
    iget-object v0, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 65
    .line 66
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 67
    .line 68
    invoke-static {v0, v1}, Lwb/ho;->R6(Landroid/content/SharedPreferences;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lwb/od;->i:Li0/a1;

    .line 72
    .line 73
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_3
    iget-object v0, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 78
    .line 79
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v1, "logs"

    .line 84
    .line 85
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 90
    .line 91
    .line 92
    const-string v0, ""

    .line 93
    .line 94
    iget-object v1, p0, Lwb/od;->i:Li0/a1;

    .line 95
    .line 96
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :pswitch_4
    iget-object v0, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 101
    .line 102
    const-string v1, "logs"

    .line 103
    .line 104
    const-string v2, ""

    .line 105
    .line 106
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-nez v0, :cond_1

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_1
    move-object v2, v0

    .line 114
    :goto_2
    iget-object v0, p0, Lwb/od;->i:Li0/a1;

    .line 115
    .line 116
    invoke-interface {v0, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :pswitch_5
    iget-object v0, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 121
    .line 122
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v1, "logs"

    .line 127
    .line 128
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 133
    .line 134
    .line 135
    const-string v0, ""

    .line 136
    .line 137
    iget-object v1, p0, Lwb/od;->i:Li0/a1;

    .line 138
    .line 139
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :pswitch_6
    iget-object v0, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 144
    .line 145
    const-string v1, "logs"

    .line 146
    .line 147
    const-string v2, ""

    .line 148
    .line 149
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-nez v0, :cond_2

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_2
    move-object v2, v0

    .line 157
    :goto_3
    iget-object v0, p0, Lwb/od;->i:Li0/a1;

    .line 158
    .line 159
    invoke-interface {v0, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :pswitch_7
    iget-object v0, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 165
    .line 166
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-object v1, p0, Lwb/od;->i:Li0/a1;

    .line 171
    .line 172
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Ljava/lang/Number;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    const-string v2, "text_voice_speech_rate"

    .line 183
    .line 184
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :pswitch_8
    iget-object v0, p0, Lwb/od;->h:Landroid/content/SharedPreferences;

    .line 194
    .line 195
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iget-object v1, p0, Lwb/od;->i:Li0/a1;

    .line 200
    .line 201
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, Ljava/lang/Number;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    const v2, 0x3dcccccd    # 0.1f

    .line 212
    .line 213
    .line 214
    const/high16 v3, 0x3f000000    # 0.5f

    .line 215
    .line 216
    invoke-static {v1, v2, v3}, Lr9/e0;->q(FFF)F

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    const/high16 v2, 0x42c80000    # 100.0f

    .line 221
    .line 222
    mul-float/2addr v1, v2

    .line 223
    invoke-static {v1}, Lig/a;->X(F)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    int-to-float v1, v1

    .line 228
    div-float/2addr v1, v2

    .line 229
    const-string v2, "round_avatar_radius_factor"

    .line 230
    .line 231
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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
