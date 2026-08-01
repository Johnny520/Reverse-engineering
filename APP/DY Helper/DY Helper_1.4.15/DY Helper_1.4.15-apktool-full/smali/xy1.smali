.class public final synthetic Lxy1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/widget/TextView;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Lum1;

.field public final synthetic ι:Landroid/widget/EditText;

.field public final synthetic κ:Z

.field public final synthetic λ:Lum1;

.field public final synthetic μ:Lum1;

.field public final synthetic ν:Lum1;

.field public final synthetic ξ:Lum1;

.field public final synthetic ο:Lum1;

.field public final synthetic π:Lum1;

.field public final synthetic ρ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/widget/TextView;Landroid/app/Activity;Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;I)V
    .locals 0

    .line 1
    iput p13, p0, Lxy1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxy1;->ρ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lxy1;->ζ:Landroid/widget/TextView;

    .line 6
    .line 7
    iput-object p3, p0, Lxy1;->η:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p4, p0, Lxy1;->θ:Lum1;

    .line 10
    .line 11
    iput-object p5, p0, Lxy1;->ι:Landroid/widget/EditText;

    .line 12
    .line 13
    iput-boolean p6, p0, Lxy1;->κ:Z

    .line 14
    .line 15
    iput-object p7, p0, Lxy1;->λ:Lum1;

    .line 16
    .line 17
    iput-object p8, p0, Lxy1;->μ:Lum1;

    .line 18
    .line 19
    iput-object p9, p0, Lxy1;->ν:Lum1;

    .line 20
    .line 21
    iput-object p10, p0, Lxy1;->ξ:Lum1;

    .line 22
    .line 23
    iput-object p11, p0, Lxy1;->ο:Lum1;

    .line 24
    .line 25
    iput-object p12, p0, Lxy1;->π:Lum1;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lxy1;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, Lxy1;->ρ:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v12, v4

    .line 13
    check-cast v12, Lky1;

    .line 14
    .line 15
    if-nez v12, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    iget-object v1, v0, Lxy1;->ζ:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 22
    .line 23
    .line 24
    const-string v4, "\u6b63\u5728\u5b8c\u6210\u8be5\u4eba\u5458\u7684\u706b\u661f\u4efb\u52a1\u2026"

    .line 25
    .line 26
    iget-object v15, v0, Lxy1;->η:Landroid/app/Activity;

    .line 27
    .line 28
    invoke-static {v15, v4, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    .line 33
    .line 34
    .line 35
    sget-object v4, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    iget-object v4, v0, Lxy1;->θ:Lum1;

    .line 38
    .line 39
    iget-object v5, v0, Lxy1;->ι:Landroid/widget/EditText;

    .line 40
    .line 41
    iget-boolean v6, v0, Lxy1;->κ:Z

    .line 42
    .line 43
    iget-object v7, v0, Lxy1;->λ:Lum1;

    .line 44
    .line 45
    iget-object v8, v0, Lxy1;->μ:Lum1;

    .line 46
    .line 47
    iget-object v9, v0, Lxy1;->ν:Lum1;

    .line 48
    .line 49
    iget-object v10, v0, Lxy1;->ξ:Lum1;

    .line 50
    .line 51
    iget-object v11, v0, Lxy1;->ο:Lum1;

    .line 52
    .line 53
    iget-object v0, v0, Lxy1;->π:Lum1;

    .line 54
    .line 55
    move-object/from16 v24, v0

    .line 56
    .line 57
    move-object/from16 v16, v4

    .line 58
    .line 59
    move-object/from16 v17, v5

    .line 60
    .line 61
    move/from16 v18, v6

    .line 62
    .line 63
    move-object/from16 v19, v7

    .line 64
    .line 65
    move-object/from16 v20, v8

    .line 66
    .line 67
    move-object/from16 v21, v9

    .line 68
    .line 69
    move-object/from16 v22, v10

    .line 70
    .line 71
    move-object/from16 v23, v11

    .line 72
    .line 73
    invoke-static/range {v16 .. v24}, Ljz1;->χ(Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;)Lmy1;

    .line 74
    .line 75
    .line 76
    move-result-object v13

    .line 77
    new-instance v0, Lq61;

    .line 78
    .line 79
    invoke-direct {v0, v1, v15}, Lq61;-><init>(Landroid/widget/TextView;Landroid/app/Activity;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const-string v1, "pet_elf_auto_mutual_message_enabled"

    .line 86
    .line 87
    invoke-static {v1, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    const-string v1, "pet_elf_auto_image_enabled"

    .line 92
    .line 93
    invoke-static {v1, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    const-string v1, "pet_elf_task_image_uri"

    .line 98
    .line 99
    const-string v2, ""

    .line 100
    .line 101
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    const/4 v3, 0x0

    .line 110
    if-nez v2, :cond_1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    move-object v1, v3

    .line 114
    :goto_0
    if-eqz v1, :cond_2

    .line 115
    .line 116
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    :cond_2
    move-object v11, v3

    .line 121
    new-instance v5, Llg1;

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    const/16 v14, 0x10

    .line 125
    .line 126
    sget-object v6, Lkg1;->θ:Lkg1;

    .line 127
    .line 128
    const/4 v9, 0x1

    .line 129
    invoke-direct/range {v5 .. v14}, Llg1;-><init>(Lkg1;ZZZZLandroid/net/Uri;Lky1;Lmy1;I)V

    .line 130
    .line 131
    .line 132
    invoke-static {v15, v5, v0}, Lpg1;->ν(Landroid/app/Activity;Llg1;La80;)V

    .line 133
    .line 134
    .line 135
    :goto_1
    return-void

    .line 136
    :pswitch_0
    move-object/from16 v18, v4

    .line 137
    .line 138
    check-cast v18, La80;

    .line 139
    .line 140
    if-nez v18, :cond_3

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_3
    iget-object v1, v0, Lxy1;->ζ:Landroid/widget/TextView;

    .line 144
    .line 145
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 146
    .line 147
    .line 148
    const-string v4, "\u6b63\u5728\u6d4b\u8bd5\u53d1\u9001\u7eed\u706b\u6d88\u606f..."

    .line 149
    .line 150
    iget-object v5, v0, Lxy1;->η:Landroid/app/Activity;

    .line 151
    .line 152
    invoke-static {v5, v4, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    .line 157
    .line 158
    .line 159
    new-instance v3, Ljava/lang/Thread;

    .line 160
    .line 161
    new-instance v16, Laz1;

    .line 162
    .line 163
    iget-object v4, v0, Lxy1;->θ:Lum1;

    .line 164
    .line 165
    iget-object v6, v0, Lxy1;->ι:Landroid/widget/EditText;

    .line 166
    .line 167
    iget-boolean v7, v0, Lxy1;->κ:Z

    .line 168
    .line 169
    iget-object v8, v0, Lxy1;->λ:Lum1;

    .line 170
    .line 171
    iget-object v9, v0, Lxy1;->μ:Lum1;

    .line 172
    .line 173
    iget-object v10, v0, Lxy1;->ν:Lum1;

    .line 174
    .line 175
    iget-object v11, v0, Lxy1;->ξ:Lum1;

    .line 176
    .line 177
    iget-object v12, v0, Lxy1;->ο:Lum1;

    .line 178
    .line 179
    iget-object v0, v0, Lxy1;->π:Lum1;

    .line 180
    .line 181
    move-object/from16 v27, v0

    .line 182
    .line 183
    move-object/from16 v28, v1

    .line 184
    .line 185
    move-object/from16 v19, v4

    .line 186
    .line 187
    move-object/from16 v17, v5

    .line 188
    .line 189
    move-object/from16 v20, v6

    .line 190
    .line 191
    move/from16 v21, v7

    .line 192
    .line 193
    move-object/from16 v22, v8

    .line 194
    .line 195
    move-object/from16 v23, v9

    .line 196
    .line 197
    move-object/from16 v24, v10

    .line 198
    .line 199
    move-object/from16 v25, v11

    .line 200
    .line 201
    move-object/from16 v26, v12

    .line 202
    .line 203
    invoke-direct/range {v16 .. v28}, Laz1;-><init>(Landroid/app/Activity;La80;Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;Landroid/widget/TextView;)V

    .line 204
    .line 205
    .line 206
    move-object/from16 v0, v16

    .line 207
    .line 208
    const-string v1, "DY-SparkTestSend"

    .line 209
    .line 210
    invoke-direct {v3, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v3, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 217
    .line 218
    .line 219
    :goto_2
    return-void

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
