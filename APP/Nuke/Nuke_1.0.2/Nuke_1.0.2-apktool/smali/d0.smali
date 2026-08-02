.class public final synthetic Ld0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# static fields
.field public static final a:Ld0;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ld0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld0;->a:Ld0;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.module.wechat.ai.AIChatConfig"

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "baseUrl"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "apiKey"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "model"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "systemPrompt"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "temperature"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "maxTokens"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "contextRounds"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "replyDelayMs"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "listMode"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "targetIds"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    sput-object v1, Ld0;->descriptor:Lyo2;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 23

    .line 1
    sget-object v0, Ld0;->descriptor:Lyo2;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, Ly40;->b(Lyo2;)Lvx;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Lnuke/module/wechat/ai/AIChatConfig;->access$get$childSerializers$cp()[Lj71;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const-wide/16 v7, 0x0

    .line 18
    .line 19
    move v10, v4

    .line 20
    move/from16 v16, v10

    .line 21
    .line 22
    move/from16 v17, v16

    .line 23
    .line 24
    move-object v11, v5

    .line 25
    move-object v12, v11

    .line 26
    move-object v13, v12

    .line 27
    move-object v14, v13

    .line 28
    move v15, v6

    .line 29
    move-wide/from16 v18, v7

    .line 30
    .line 31
    move v7, v3

    .line 32
    move-object v6, v14

    .line 33
    :goto_0
    if-eqz v7, :cond_0

    .line 34
    .line 35
    invoke-interface {v1, v0}, Lvx;->j(Lyo2;)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    packed-switch v8, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    new-instance v0, Le83;

    .line 43
    .line 44
    invoke-direct {v0, v8}, Le83;-><init>(I)V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :pswitch_0
    const/16 v8, 0x9

    .line 49
    .line 50
    aget-object v9, v2, v8

    .line 51
    .line 52
    invoke-interface {v9}, Lj71;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    check-cast v9, Lw41;

    .line 57
    .line 58
    invoke-interface {v1, v0, v8, v9, v6}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    check-cast v6, Ljava/util/Set;

    .line 63
    .line 64
    or-int/lit16 v10, v10, 0x200

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_1
    const/16 v8, 0x8

    .line 68
    .line 69
    aget-object v9, v2, v8

    .line 70
    .line 71
    invoke-interface {v9}, Lj71;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    check-cast v9, Lw41;

    .line 76
    .line 77
    invoke-interface {v1, v0, v8, v9, v5}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Lc1;

    .line 82
    .line 83
    or-int/lit16 v10, v10, 0x100

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_2
    const/4 v8, 0x7

    .line 87
    invoke-interface {v1, v0, v8}, Lvx;->z(Lyo2;I)J

    .line 88
    .line 89
    .line 90
    move-result-wide v18

    .line 91
    or-int/lit16 v10, v10, 0x80

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :pswitch_3
    const/4 v8, 0x6

    .line 95
    invoke-interface {v1, v0, v8}, Lvx;->u(Lyo2;I)I

    .line 96
    .line 97
    .line 98
    move-result v17

    .line 99
    or-int/lit8 v10, v10, 0x40

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_4
    const/4 v8, 0x5

    .line 103
    invoke-interface {v1, v0, v8}, Lvx;->u(Lyo2;I)I

    .line 104
    .line 105
    .line 106
    move-result v16

    .line 107
    or-int/lit8 v10, v10, 0x20

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :pswitch_5
    const/4 v8, 0x4

    .line 111
    invoke-interface {v1, v0, v8}, Lvx;->i(Lyo2;I)F

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    or-int/lit8 v10, v10, 0x10

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :pswitch_6
    const/4 v8, 0x3

    .line 119
    invoke-interface {v1, v0, v8}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    or-int/lit8 v10, v10, 0x8

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :pswitch_7
    const/4 v8, 0x2

    .line 127
    invoke-interface {v1, v0, v8}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    or-int/lit8 v10, v10, 0x4

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :pswitch_8
    invoke-interface {v1, v0, v3}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    or-int/lit8 v10, v10, 0x2

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :pswitch_9
    invoke-interface {v1, v0, v4}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    or-int/lit8 v10, v10, 0x1

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :pswitch_a
    move v7, v4

    .line 149
    goto :goto_0

    .line 150
    :cond_0
    invoke-interface {v1, v0}, Lvx;->a(Lyo2;)V

    .line 151
    .line 152
    .line 153
    new-instance v9, Lnuke/module/wechat/ai/AIChatConfig;

    .line 154
    .line 155
    const/16 v22, 0x0

    .line 156
    .line 157
    move-object/from16 v20, v5

    .line 158
    .line 159
    move-object/from16 v21, v6

    .line 160
    .line 161
    invoke-direct/range {v9 .. v22}, Lnuke/module/wechat/ai/AIChatConfig;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIJLc1;Ljava/util/Set;Ldp2;)V

    .line 162
    .line 163
    .line 164
    return-object v9

    .line 165
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
        :pswitch_9
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

.method public final b()[Lw41;
    .locals 3

    .line 1
    invoke-static {}, Lnuke/module/wechat/ai/AIChatConfig;->access$get$childSerializers$cp()[Lj71;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    new-array v0, v0, [Lw41;

    .line 8
    .line 9
    sget-object v1, Lnv2;->a:Lnv2;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aput-object v1, v0, v2

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    aput-object v1, v0, v2

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    aput-object v1, v0, v2

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    sget-object v2, Lvj0;->a:Lvj0;

    .line 25
    .line 26
    aput-object v2, v0, v1

    .line 27
    .line 28
    sget-object v1, Lf11;->a:Lf11;

    .line 29
    .line 30
    const/4 v2, 0x5

    .line 31
    aput-object v1, v0, v2

    .line 32
    .line 33
    const/4 v2, 0x6

    .line 34
    aput-object v1, v0, v2

    .line 35
    .line 36
    const/4 v1, 0x7

    .line 37
    sget-object v2, Led1;->a:Led1;

    .line 38
    .line 39
    aput-object v2, v0, v1

    .line 40
    .line 41
    const/16 v1, 0x8

    .line 42
    .line 43
    aget-object v2, p0, v1

    .line 44
    .line 45
    invoke-interface {v2}, Lj71;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    aput-object v2, v0, v1

    .line 50
    .line 51
    const/16 v1, 0x9

    .line 52
    .line 53
    aget-object p0, p0, v1

    .line 54
    .line 55
    invoke-interface {p0}, Lj71;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    aput-object p0, v0, v1

    .line 60
    .line 61
    return-object v0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lnuke/module/wechat/ai/AIChatConfig;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Ld0;->descriptor:Lyo2;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lve0;->b(Lyo2;)Lwx;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lnuke/module/wechat/ai/AIChatConfig;->write$Self$app(Lnuke/module/wechat/ai/AIChatConfig;Lwx;Lyo2;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lwx;->a(Lyo2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Ld0;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method
