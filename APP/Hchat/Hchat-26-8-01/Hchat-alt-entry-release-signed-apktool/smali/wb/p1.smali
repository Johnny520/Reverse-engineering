.class public final synthetic Lwb/p1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/util/Set;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ZLjava/util/Set;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/p1;->g:I

    .line 2
    .line 3
    iput-boolean p1, p0, Lwb/p1;->h:Z

    .line 4
    .line 5
    iput-object p2, p0, Lwb/p1;->i:Ljava/util/Set;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/p1;->j:Li0/a1;

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
    .locals 3

    .line 1
    iget v0, p0, Lwb/p1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lwb/p1;->h:Z

    .line 7
    .line 8
    iget-object v1, p0, Lwb/p1;->i:Ljava/util/Set;

    .line 9
    .line 10
    iget-object v2, p0, Lwb/p1;->j:Li0/a1;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/util/Set;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/util/Set;

    .line 32
    .line 33
    check-cast v1, Ljava/lang/Iterable;

    .line 34
    .line 35
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_0
    iget-boolean v0, p0, Lwb/p1;->h:Z

    .line 46
    .line 47
    iget-object v1, p0, Lwb/p1;->i:Ljava/util/Set;

    .line 48
    .line 49
    iget-object v2, p0, Lwb/p1;->j:Li0/a1;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/util/Set;

    .line 58
    .line 59
    check-cast v1, Ljava/lang/Iterable;

    .line 60
    .line 61
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Ljava/util/Set;

    .line 71
    .line 72
    check-cast v1, Ljava/lang/Iterable;

    .line 73
    .line 74
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_2
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :pswitch_1
    iget-boolean v0, p0, Lwb/p1;->h:Z

    .line 83
    .line 84
    iget-object v1, p0, Lwb/p1;->i:Ljava/util/Set;

    .line 85
    .line 86
    iget-object v2, p0, Lwb/p1;->j:Li0/a1;

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/util/Set;

    .line 95
    .line 96
    check-cast v1, Ljava/lang/Iterable;

    .line 97
    .line 98
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ljava/util/Set;

    .line 108
    .line 109
    check-cast v1, Ljava/lang/Iterable;

    .line 110
    .line 111
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :goto_3
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_2
    iget-boolean v0, p0, Lwb/p1;->h:Z

    .line 120
    .line 121
    iget-object v1, p0, Lwb/p1;->i:Ljava/util/Set;

    .line 122
    .line 123
    iget-object v2, p0, Lwb/p1;->j:Li0/a1;

    .line 124
    .line 125
    if-eqz v0, :cond_3

    .line 126
    .line 127
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Ljava/util/Set;

    .line 132
    .line 133
    check-cast v1, Ljava/lang/Iterable;

    .line 134
    .line 135
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    goto :goto_4

    .line 140
    :cond_3
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Ljava/util/Set;

    .line 145
    .line 146
    check-cast v1, Ljava/lang/Iterable;

    .line 147
    .line 148
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :goto_4
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :pswitch_3
    iget-boolean v0, p0, Lwb/p1;->h:Z

    .line 157
    .line 158
    iget-object v1, p0, Lwb/p1;->i:Ljava/util/Set;

    .line 159
    .line 160
    iget-object v2, p0, Lwb/p1;->j:Li0/a1;

    .line 161
    .line 162
    if-eqz v0, :cond_4

    .line 163
    .line 164
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Ljava/util/Set;

    .line 169
    .line 170
    check-cast v1, Ljava/lang/Iterable;

    .line 171
    .line 172
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    goto :goto_5

    .line 177
    :cond_4
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    check-cast v0, Ljava/util/Set;

    .line 182
    .line 183
    check-cast v1, Ljava/lang/Iterable;

    .line 184
    .line 185
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    :goto_5
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_1

    .line 193
    .line 194
    :pswitch_4
    iget-boolean v0, p0, Lwb/p1;->h:Z

    .line 195
    .line 196
    iget-object v1, p0, Lwb/p1;->i:Ljava/util/Set;

    .line 197
    .line 198
    iget-object v2, p0, Lwb/p1;->j:Li0/a1;

    .line 199
    .line 200
    if-eqz v0, :cond_5

    .line 201
    .line 202
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Ljava/util/Set;

    .line 207
    .line 208
    check-cast v1, Ljava/lang/Iterable;

    .line 209
    .line 210
    invoke-static {v0, v1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    goto :goto_6

    .line 215
    :cond_5
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, Ljava/util/Set;

    .line 220
    .line 221
    check-cast v1, Ljava/lang/Iterable;

    .line 222
    .line 223
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    :goto_6
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
