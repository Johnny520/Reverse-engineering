.class public final synthetic Lw61;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Landroid/widget/EditText;

.field public final synthetic ζ:Landroid/widget/EditText;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Landroid/app/AlertDialog;

.field public final synthetic ι:Z

.field public final synthetic κ:Lhh0;


# direct methods
.method public synthetic constructor <init>(Lhh0;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/EditText;Landroid/widget/EditText;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lw61;->ε:Landroid/widget/EditText;

    .line 5
    .line 6
    iput-object p5, p0, Lw61;->ζ:Landroid/widget/EditText;

    .line 7
    .line 8
    iput-object p2, p0, Lw61;->η:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p3, p0, Lw61;->θ:Landroid/app/AlertDialog;

    .line 11
    .line 12
    iput-boolean p6, p0, Lw61;->ι:Z

    .line 13
    .line 14
    iput-object p1, p0, Lw61;->κ:Lhh0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    iget-object p1, p0, Lw61;->ε:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, v0

    .line 26
    :goto_0
    const-string v1, ""

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    move-object p1, v1

    .line 31
    :cond_1
    iget-object v2, p0, Lw61;->ζ:Landroid/widget/EditText;

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v2, v0

    .line 55
    :goto_1
    if-nez v2, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    move-object v1, v2

    .line 59
    :goto_2
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    const/4 v3, 0x0

    .line 64
    const-string v4, "yyyy-MM-dd"

    .line 65
    .line 66
    if-eqz v2, :cond_5

    .line 67
    .line 68
    :catchall_0
    :cond_4
    move-object v7, v0

    .line 69
    goto :goto_3

    .line 70
    :cond_5
    :try_start_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 71
    .line 72
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 73
    .line 74
    invoke-direct {v2, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-eqz v2, :cond_4

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    move-object v7, v2

    .line 95
    :goto_3
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_6

    .line 100
    .line 101
    :catchall_1
    :goto_4
    move-object v8, v0

    .line 102
    goto :goto_5

    .line 103
    :cond_6
    :try_start_1
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 104
    .line 105
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 106
    .line 107
    invoke-direct {v2, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    if-nez v2, :cond_7

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    invoke-static {v5}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v3, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 125
    .line 126
    .line 127
    const/16 v2, 0xb

    .line 128
    .line 129
    const/16 v4, 0x17

    .line 130
    .line 131
    invoke-virtual {v3, v2, v4}, Ljava/util/Calendar;->set(II)V

    .line 132
    .line 133
    .line 134
    const/16 v2, 0xc

    .line 135
    .line 136
    const/16 v4, 0x3b

    .line 137
    .line 138
    invoke-virtual {v3, v2, v4}, Ljava/util/Calendar;->set(II)V

    .line 139
    .line 140
    .line 141
    const/16 v2, 0xd

    .line 142
    .line 143
    invoke-virtual {v3, v2, v4}, Ljava/util/Calendar;->set(II)V

    .line 144
    .line 145
    .line 146
    const/16 v2, 0xe

    .line 147
    .line 148
    const/16 v4, 0x3e7

    .line 149
    .line 150
    invoke-virtual {v3, v2, v4}, Ljava/util/Calendar;->set(II)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 154
    .line 155
    .line 156
    move-result-wide v2

    .line 157
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 158
    .line 159
    .line 160
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 161
    goto :goto_4

    .line 162
    :goto_5
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    iget-object v0, p0, Lw61;->η:Landroid/app/Activity;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    if-nez p1, :cond_8

    .line 170
    .line 171
    if-nez v7, :cond_8

    .line 172
    .line 173
    const-string p0, "\u5f00\u59cb\u65e5\u671f\u683c\u5f0f\u9519\u8bef"

    .line 174
    .line 175
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 180
    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_8
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-nez p1, :cond_9

    .line 188
    .line 189
    if-nez v8, :cond_9

    .line 190
    .line 191
    const-string p0, "\u7ed3\u675f\u65e5\u671f\u683c\u5f0f\u9519\u8bef"

    .line 192
    .line 193
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_9
    if-eqz v7, :cond_a

    .line 202
    .line 203
    if-eqz v8, :cond_a

    .line 204
    .line 205
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 206
    .line 207
    .line 208
    move-result-wide v3

    .line 209
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 210
    .line 211
    .line 212
    move-result-wide v5

    .line 213
    cmp-long p1, v3, v5

    .line 214
    .line 215
    if-lez p1, :cond_a

    .line 216
    .line 217
    const-string p0, "\u5f00\u59cb\u65e5\u671f\u4e0d\u80fd\u665a\u4e8e\u7ed3\u675f\u65e5\u671f"

    .line 218
    .line 219
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 224
    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_a
    iget-object p1, p0, Lw61;->θ:Landroid/app/AlertDialog;

    .line 228
    .line 229
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 230
    .line 231
    .line 232
    sget-object p1, Lq71;->α:Lq71;

    .line 233
    .line 234
    new-instance v5, Lih0;

    .line 235
    .line 236
    const/16 v10, 0x30

    .line 237
    .line 238
    iget-boolean v6, p0, Lw61;->ι:Z

    .line 239
    .line 240
    iget-object v9, p0, Lw61;->κ:Lhh0;

    .line 241
    .line 242
    invoke-direct/range {v5 .. v10}, Lih0;-><init>(ZLjava/lang/Long;Ljava/lang/Long;Lhh0;I)V

    .line 243
    .line 244
    .line 245
    invoke-static {v0, v5}, Lq71;->Ν(Landroid/app/Activity;Lih0;)V

    .line 246
    .line 247
    .line 248
    :goto_6
    return-void
.end method
