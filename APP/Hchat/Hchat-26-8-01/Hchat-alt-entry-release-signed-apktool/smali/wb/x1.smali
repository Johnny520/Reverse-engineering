.class public final synthetic Lwb/x1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/s0;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lwb/s0;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/x1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/x1;->h:Lwb/s0;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/x1;->i:Li0/a1;

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
    .locals 3

    .line 1
    iget v0, p0, Lwb/x1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/x1;->i:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/Set;

    .line 13
    .line 14
    iget-object v2, p0, Lwb/x1;->h:Lwb/s0;

    .line 15
    .line 16
    iget-object v2, v2, Lwb/s0;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/Set;

    .line 29
    .line 30
    invoke-static {v1, v2}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/util/Set;

    .line 40
    .line 41
    invoke-static {v1, v2}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    iget-object v0, p0, Lwb/x1;->i:Li0/a1;

    .line 52
    .line 53
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/util/Set;

    .line 58
    .line 59
    iget-object v2, p0, Lwb/x1;->h:Lwb/s0;

    .line 60
    .line 61
    iget-object v2, v2, Lwb/s0;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/util/Set;

    .line 74
    .line 75
    invoke-static {v1, v2}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    goto :goto_2

    .line 80
    :cond_1
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/util/Set;

    .line 85
    .line 86
    invoke-static {v1, v2}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :goto_2
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :pswitch_1
    iget-object v0, p0, Lwb/x1;->i:Li0/a1;

    .line 95
    .line 96
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Ljava/util/Set;

    .line 101
    .line 102
    iget-object v2, p0, Lwb/x1;->h:Lwb/s0;

    .line 103
    .line 104
    iget-object v2, v2, Lwb/s0;->a:Ljava/lang/String;

    .line 105
    .line 106
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_2

    .line 111
    .line 112
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Ljava/util/Set;

    .line 117
    .line 118
    invoke-static {v1, v2}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    goto :goto_3

    .line 123
    :cond_2
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/util/Set;

    .line 128
    .line 129
    invoke-static {v1, v2}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    :goto_3
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :pswitch_2
    iget-object v0, p0, Lwb/x1;->i:Li0/a1;

    .line 138
    .line 139
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Ljava/util/Set;

    .line 144
    .line 145
    iget-object v2, p0, Lwb/x1;->h:Lwb/s0;

    .line 146
    .line 147
    iget-object v2, v2, Lwb/s0;->a:Ljava/lang/String;

    .line 148
    .line 149
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_3

    .line 154
    .line 155
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Ljava/util/Set;

    .line 160
    .line 161
    invoke-static {v1, v2}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    goto :goto_4

    .line 166
    :cond_3
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Ljava/util/Set;

    .line 171
    .line 172
    invoke-static {v1, v2}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    :goto_4
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :pswitch_3
    iget-object v0, p0, Lwb/x1;->i:Li0/a1;

    .line 182
    .line 183
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Ljava/util/Set;

    .line 188
    .line 189
    iget-object v2, p0, Lwb/x1;->h:Lwb/s0;

    .line 190
    .line 191
    iget-object v2, v2, Lwb/s0;->a:Ljava/lang/String;

    .line 192
    .line 193
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_4

    .line 198
    .line 199
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, Ljava/util/Set;

    .line 204
    .line 205
    invoke-static {v1, v2}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    goto :goto_5

    .line 210
    :cond_4
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Ljava/util/Set;

    .line 215
    .line 216
    invoke-static {v1, v2}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    :goto_5
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
