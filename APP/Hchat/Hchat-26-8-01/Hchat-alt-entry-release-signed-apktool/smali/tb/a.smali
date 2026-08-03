.class public final synthetic Ltb/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ltb/c;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Ljava/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(ILtb/c;Ljava/lang/String;Ljava/lang/String;IILjava/util/function/Consumer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ltb/a;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Ltb/a;->h:Ltb/c;

    .line 7
    .line 8
    iput-object p3, p0, Ltb/a;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Ltb/a;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput p5, p0, Ltb/a;->k:I

    .line 13
    .line 14
    iput p6, p0, Ltb/a;->l:I

    .line 15
    .line 16
    iput-object p7, p0, Ltb/a;->m:Ljava/util/function/Consumer;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    const-string v0, "progress"

    .line 2
    .line 3
    const-string v1, "\u9519\u8bef\u7801:"

    .line 4
    .line 5
    iget v2, p0, Ltb/a;->g:I

    .line 6
    .line 7
    iget-object v3, p0, Ltb/a;->h:Ltb/c;

    .line 8
    .line 9
    iget-object v4, p0, Ltb/a;->i:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Ltb/a;->j:Ljava/lang/String;

    .line 12
    .line 13
    iget v6, p0, Ltb/a;->k:I

    .line 14
    .line 15
    iget-object v7, p0, Ltb/a;->m:Ljava/util/function/Consumer;

    .line 16
    .line 17
    const-string v8, "type"

    .line 18
    .line 19
    const-string v9, "message"

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const/4 v10, 0x1

    .line 24
    if-eq v2, v10, :cond_0

    .line 25
    .line 26
    iget v10, p0, Ltb/a;->l:I

    .line 27
    .line 28
    packed-switch v2, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    const/4 v2, -0x2

    .line 32
    goto :goto_0

    .line 33
    :pswitch_0
    :try_start_0
    invoke-virtual {v3, v4, v5, v6}, Ltb/c;->autoAacToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    :pswitch_1
    invoke-virtual {v3, v4, v5, v10}, Ltb/c;->autoToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    goto :goto_0

    .line 45
    :pswitch_2
    invoke-virtual {v3, v4, v5, v10}, Ltb/c;->autoToAac(Ljava/lang/String;Ljava/lang/String;I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    goto :goto_0

    .line 50
    :pswitch_3
    invoke-virtual {v3, v4, v5}, Ltb/c;->autoToPcm(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    goto :goto_0

    .line 55
    :pswitch_4
    invoke-virtual {v3, v4, v5, v6}, Ltb/c;->autoToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {v3, v4, v5, v6}, Ltb/c;->mp3ToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v3, v4, v5, v6}, Ltb/c;->silkToMp3(Ljava/lang/String;Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    :goto_0
    if-nez v2, :cond_2

    .line 70
    .line 71
    if-eqz v7, :cond_3

    .line 72
    .line 73
    new-instance v1, Lsf/e;

    .line 74
    .line 75
    invoke-direct {v1, v8, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const/16 v2, 0x64

    .line 79
    .line 80
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    new-instance v4, Lsf/e;

    .line 85
    .line 86
    invoke-direct {v4, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    filled-new-array {v1, v4}, [Lsf/e;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v7, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    if-eqz v7, :cond_3

    .line 102
    .line 103
    new-instance v0, Lsf/e;

    .line 104
    .line 105
    invoke-direct {v0, v8, v9}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v2}, Ltb/c;->getErrorMessage(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    new-instance v5, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, " -> "

    .line 121
    .line 122
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    new-instance v2, Lsf/e;

    .line 133
    .line 134
    invoke-direct {v2, v9, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    filled-new-array {v0, v2}, [Lsf/e;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-interface {v7, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    const-string v2, "startTransform \u5931\u8d25: "

    .line 154
    .line 155
    invoke-static {v2, v1, v3}, Lp/a;->w(Ljava/lang/String;Ljava/lang/String;Ltb/c;)V

    .line 156
    .line 157
    .line 158
    if-eqz v7, :cond_3

    .line 159
    .line 160
    new-instance v1, Lsf/e;

    .line 161
    .line 162
    invoke-direct {v1, v8, v9}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    const-string v2, "\u5f02\u5e38: "

    .line 170
    .line 171
    invoke-static {v2, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    new-instance v2, Lsf/e;

    .line 176
    .line 177
    invoke-direct {v2, v9, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    filled-new-array {v1, v2}, [Lsf/e;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-interface {v7, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_3
    return-void

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
