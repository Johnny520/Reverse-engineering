.class public final synthetic Lrt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/widget/TextView;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Landroid/view/View;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    iput p7, p0, Lrt1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lrt1;->η:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lrt1;->θ:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lrt1;->ζ:Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object p4, p0, Lrt1;->ι:Landroid/view/View;

    .line 10
    .line 11
    iput-object p5, p0, Lrt1;->κ:Landroid/widget/TextView;

    .line 12
    .line 13
    iput-object p6, p0, Lrt1;->λ:Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lrt1;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lrt1;->η:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lt72;

    .line 11
    .line 12
    iget-object v2, v1, Lt72;->γ:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v3, v0, Lrt1;->θ:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v9, v3

    .line 17
    check-cast v9, Landroid/app/Activity;

    .line 18
    .line 19
    iget-object v5, v0, Lrt1;->ζ:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v3, v0, Lrt1;->ι:Landroid/view/View;

    .line 22
    .line 23
    check-cast v3, Landroid/widget/ProgressBar;

    .line 24
    .line 25
    iget-object v4, v0, Lrt1;->κ:Landroid/widget/TextView;

    .line 26
    .line 27
    move-object v7, v4

    .line 28
    check-cast v7, Landroid/widget/Button;

    .line 29
    .line 30
    iget-object v0, v0, Lrt1;->λ:Landroid/widget/TextView;

    .line 31
    .line 32
    move-object v8, v0

    .line 33
    check-cast v8, Landroid/widget/Button;

    .line 34
    .line 35
    sget-object v11, Lu72;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    const-string v4, "r5f3b6ae7236977e4"

    .line 38
    .line 39
    sget-object v12, Lu72;->β:Landroid/os/Handler;

    .line 40
    .line 41
    const-string v6, "download update failed: "

    .line 42
    .line 43
    const-string v0, "download update url="

    .line 44
    .line 45
    const-string v10, "refresh stale download url failed, fallback cached url="

    .line 46
    .line 47
    const/4 v15, 0x0

    .line 48
    :try_start_0
    const-string v13, "/releases/latest"

    .line 49
    .line 50
    const/4 v14, 0x1

    .line 51
    invoke-static {v2, v13, v14}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v13

    .line 55
    if-eqz v13, :cond_1

    .line 56
    .line 57
    new-instance v13, Lbu1;

    .line 58
    .line 59
    const/4 v14, 0x2

    .line 60
    invoke-direct {v13, v5, v14}, Lbu1;-><init>(Landroid/widget/TextView;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v12, v13}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 64
    .line 65
    .line 66
    invoke-static {}, Lu72;->γ()Lt72;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    if-eqz v13, :cond_0

    .line 71
    .line 72
    iget-object v14, v13, Lt72;->γ:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v14}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    if-nez v14, :cond_0

    .line 79
    .line 80
    invoke-static {v13}, Lu72;->ζ(Lt72;)V

    .line 81
    .line 82
    .line 83
    move-object v1, v13

    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    goto :goto_2

    .line 87
    :cond_0
    new-instance v13, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v13, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const/4 v10, 0x4

    .line 100
    invoke-static {v4, v2, v15, v10, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    :goto_0
    iget-object v2, v1, Lt72;->γ:Ljava/lang/String;

    .line 104
    .line 105
    new-instance v10, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const/4 v10, 0x4

    .line 118
    invoke-static {v4, v0, v15, v10, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    new-instance v0, Lic;

    .line 122
    .line 123
    const/16 v2, 0xa

    .line 124
    .line 125
    invoke-direct {v0, v3, v2, v5}, Lic;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v9, v1, v0}, Lu72;->β(Landroid/content/Context;Lt72;Lic;)Landroid/net/Uri;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v1, Ljg1;

    .line 133
    .line 134
    const/16 v2, 0x8

    .line 135
    .line 136
    invoke-direct {v1, v5, v9, v0, v2}, Ljg1;-><init>(Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/Comparable;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    const/4 v1, 0x0

    .line 143
    :goto_1
    invoke-virtual {v11, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    new-instance v2, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const/4 v10, 0x4

    .line 164
    invoke-static {v4, v1, v15, v10, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    new-instance v4, Lv8;

    .line 168
    .line 169
    const/4 v10, 0x7

    .line 170
    move-object v6, v0

    .line 171
    invoke-direct/range {v4 .. v10}, Lv8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 175
    .line 176
    .line 177
    const/4 v1, 0x0

    .line 178
    goto :goto_1

    .line 179
    :goto_3
    return-void

    .line 180
    :catchall_1
    move-exception v0

    .line 181
    const/4 v1, 0x0

    .line 182
    invoke-virtual {v11, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :pswitch_0
    iget-object v1, v0, Lrt1;->η:Ljava/lang/Object;

    .line 187
    .line 188
    move-object v2, v1

    .line 189
    check-cast v2, Lum1;

    .line 190
    .line 191
    iget-object v1, v0, Lrt1;->θ:Ljava/lang/Object;

    .line 192
    .line 193
    move-object v3, v1

    .line 194
    check-cast v3, Lwu1;

    .line 195
    .line 196
    iget-object v1, v0, Lrt1;->ι:Landroid/view/View;

    .line 197
    .line 198
    move-object v5, v1

    .line 199
    check-cast v5, Landroid/widget/TextView;

    .line 200
    .line 201
    iget-object v6, v0, Lrt1;->κ:Landroid/widget/TextView;

    .line 202
    .line 203
    iget-object v7, v0, Lrt1;->λ:Landroid/widget/TextView;

    .line 204
    .line 205
    iget-object v4, v0, Lrt1;->ζ:Landroid/widget/TextView;

    .line 206
    .line 207
    invoke-static/range {v2 .. v7}, Lbv1;->Ξ(Lum1;Lwu1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
