.class public final synthetic Lwb/op;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILi0/a1;Li0/a1;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/op;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lwb/op;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/op;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lwb/op;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ln2/s;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Ln2/s;->a:Li2/g;

    .line 12
    .line 13
    iget-object p1, p1, Li2/g;->h:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-ge v2, v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 38
    .line 39
    .line 40
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/16 v0, 0xa

    .line 48
    .line 49
    invoke-static {v0, p1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, Ln2/s;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-static {v1, v1}, Li2/e0;->b(II)J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x4

    .line 64
    invoke-direct {v0, v3, p1, v1, v2}, Ln2/s;-><init>(ILjava/lang/String;J)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lwb/op;->h:Li0/a1;

    .line 68
    .line 69
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const-string p1, ""

    .line 73
    .line 74
    iget-object v0, p0, Lwb/op;->i:Li0/a1;

    .line 75
    .line 76
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lwb/op;->h:Li0/a1;

    .line 88
    .line 89
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    sparse-switch v0, :sswitch_data_0

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :sswitch_0
    const-string v0, "siliconflow"

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    const-string p1, "https://api.siliconflow.cn/v1/chat/completions"

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :sswitch_1
    const-string v0, "openrouter"

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_3

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    const-string p1, "https://openrouter.ai/api/v1/chat/completions"

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :sswitch_2
    const-string v0, "deepseek"

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-nez p1, :cond_4

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    const-string p1, "https://api.deepseek.com/chat/completions"

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :sswitch_3
    const-string v0, "openai"

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-nez p1, :cond_5

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    const-string p1, "https://api.openai.com/v1/chat/completions"

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :sswitch_4
    const-string v0, "gemini"

    .line 149
    .line 150
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-nez p1, :cond_6

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_6
    const-string p1, "https://generativelanguage.googleapis.com/v1beta"

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :sswitch_5
    const-string v0, "anthropic"

    .line 161
    .line 162
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-nez p1, :cond_7

    .line 167
    .line 168
    :goto_1
    const-string p1, ""

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_7
    const-string p1, "https://api.anthropic.com/v1/messages"

    .line 172
    .line 173
    :goto_2
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-nez v0, :cond_8

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_8
    const/4 p1, 0x0

    .line 181
    :goto_3
    if-eqz p1, :cond_9

    .line 182
    .line 183
    iget-object v0, p0, Lwb/op;->i:Li0/a1;

    .line 184
    .line 185
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 189
    .line 190
    return-object p1

    .line 191
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 198
    .line 199
    iget-object v1, p0, Lwb/op;->h:Li0/a1;

    .line 200
    .line 201
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    if-eqz p1, :cond_a

    .line 205
    .line 206
    iget-object p1, p0, Lwb/op;->i:Li0/a1;

    .line 207
    .line 208
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Ljava/lang/Number;

    .line 213
    .line 214
    const/4 v1, 0x1

    .line 215
    invoke-static {v0, v1, p1}, Lp/a;->u(Ljava/lang/Number;ILi0/a1;)V

    .line 216
    .line 217
    .line 218
    :cond_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 219
    .line 220
    return-object p1

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    :sswitch_data_0
    .sparse-switch
        -0x7f0b3094 -> :sswitch_5
        -0x4a7a6dcb -> :sswitch_4
        -0x3c3c380e -> :sswitch_3
        0x25847564 -> :sswitch_2
        0x49685e13 -> :sswitch_1
        0x75c6dffd -> :sswitch_0
    .end sparse-switch
.end method
