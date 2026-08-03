.class public final synthetic Lwb/d8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/d8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/d8;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v1, "group_rename_card_desc_"

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    iget-object v2, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move-object v2, v0

    .line 28
    :cond_0
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :pswitch_0
    iget-object v0, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v1, "group_rename_card_title_"

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    iget-object v2, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 47
    .line 48
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    move-object v2, v0

    .line 55
    :cond_1
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :pswitch_1
    iget-object v0, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const-string v1, "group_rename_text_"

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 72
    .line 73
    iget-object v2, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    move-object v2, v0

    .line 82
    :cond_2
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :pswitch_2
    iget-object v0, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const-string v1, "group_rename_both_order_"

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object v1, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 99
    .line 100
    iget-object v2, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 101
    .line 102
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    move-object v2, v0

    .line 109
    :cond_3
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0

    .line 114
    :pswitch_3
    iget-object v0, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 115
    .line 116
    const-string v1, "group_member_reply_left_card_desc"

    .line 117
    .line 118
    iget-object v2, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 119
    .line 120
    iget-object v3, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v2, v1, v3, v0}, Lwb/ho;->Q5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    return-object v0

    .line 131
    :pswitch_4
    iget-object v0, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 132
    .line 133
    const-string v1, "group_member_reply_left_card_title"

    .line 134
    .line 135
    iget-object v2, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 136
    .line 137
    iget-object v3, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v2, v1, v3, v0}, Lwb/ho;->Q5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :pswitch_5
    iget-object v0, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 149
    .line 150
    const-string v1, "group_member_reply_join_card_desc"

    .line 151
    .line 152
    iget-object v2, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 153
    .line 154
    iget-object v3, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v2, v1, v3, v0}, Lwb/ho;->Q5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :pswitch_6
    iget-object v0, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 166
    .line 167
    const-string v1, "group_member_reply_join_card_title"

    .line 168
    .line 169
    iget-object v2, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 170
    .line 171
    iget-object v3, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v2, v1, v3, v0}, Lwb/ho;->Q5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    return-object v0

    .line 182
    :pswitch_7
    iget-object v0, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 183
    .line 184
    const-string v1, "group_member_reply_left_text"

    .line 185
    .line 186
    iget-object v2, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 187
    .line 188
    iget-object v3, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v2, v1, v3, v0}, Lwb/ho;->Q5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    return-object v0

    .line 199
    :pswitch_8
    iget-object v0, p0, Lwb/d8;->j:Ljava/lang/String;

    .line 200
    .line 201
    const-string v1, "group_member_reply_join_text"

    .line 202
    .line 203
    iget-object v2, p0, Lwb/d8;->h:Landroid/content/SharedPreferences;

    .line 204
    .line 205
    iget-object v3, p0, Lwb/d8;->i:Ljava/lang/String;

    .line 206
    .line 207
    invoke-static {v2, v1, v3, v0}, Lwb/ho;->Q5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    return-object v0

    .line 216
    nop

    .line 217
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
