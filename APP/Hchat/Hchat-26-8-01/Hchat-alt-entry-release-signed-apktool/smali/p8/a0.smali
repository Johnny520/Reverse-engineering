.class public final synthetic Lp8/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lp8/d0;


# direct methods
.method public synthetic constructor <init>(Lp8/d0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp8/a0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lp8/a0;->h:Lp8/d0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lp8/a0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp8/a0;->h:Lp8/d0;

    .line 7
    .line 8
    iget-object v1, v0, Lp8/d0;->h:Lr8/g;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v2, Lp8/o;

    .line 13
    .line 14
    new-instance v3, Lb0/t;

    .line 15
    .line 16
    const/16 v4, 0x13

    .line 17
    .line 18
    invoke-direct {v3, v0, v4}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v1, v3}, Lp8/o;-><init>(Lr8/g;Lfg/p;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    :goto_0
    return-object v2

    .line 27
    :pswitch_0
    iget-object v5, p0, Lp8/a0;->h:Lp8/d0;

    .line 28
    .line 29
    iget-object v0, v5, Lp8/d0;->a:Landroid/content/Context;

    .line 30
    .line 31
    iget-object v1, v5, Lp8/d0;->c:Ljava/lang/ClassLoader;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-object v2, v5, Lp8/d0;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    new-instance v12, Lp8/h;

    .line 40
    .line 41
    new-instance v3, Lp8/p;

    .line 42
    .line 43
    const-class v4, Lp8/d0;

    .line 44
    .line 45
    invoke-static {v4}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const/4 v10, 0x0

    .line 50
    const/16 v11, 0xa

    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    const-string v7, "log"

    .line 54
    .line 55
    const-string v8, "log(Ljava/lang/String;)V"

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    invoke-direct/range {v3 .. v11}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v12, v0, v1, v2, v3}, Lp8/h;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lp8/p;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const/4 v12, 0x0

    .line 66
    :goto_1
    return-object v12

    .line 67
    :pswitch_1
    iget-object v2, p0, Lp8/a0;->h:Lp8/d0;

    .line 68
    .line 69
    iget-object v9, v2, Lp8/d0;->a:Landroid/content/Context;

    .line 70
    .line 71
    iget-object v10, v2, Lp8/d0;->c:Ljava/lang/ClassLoader;

    .line 72
    .line 73
    if-eqz v10, :cond_2

    .line 74
    .line 75
    new-instance v11, Lp8/e0;

    .line 76
    .line 77
    iget-object v12, v2, Lp8/d0;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 78
    .line 79
    new-instance v0, Lp8/p;

    .line 80
    .line 81
    const-class v1, Lp8/d0;

    .line 82
    .line 83
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const/4 v7, 0x0

    .line 88
    const/16 v8, 0xc

    .line 89
    .line 90
    const/4 v1, 0x1

    .line 91
    const-string v4, "log"

    .line 92
    .line 93
    const-string v5, "log(Ljava/lang/String;)V"

    .line 94
    .line 95
    const/4 v6, 0x0

    .line 96
    invoke-direct/range {v0 .. v8}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v11, v9, v10, v12, v0}, Lp8/e0;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lp8/p;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    const/4 v11, 0x0

    .line 104
    :goto_2
    return-object v11

    .line 105
    :pswitch_2
    iget-object v2, p0, Lp8/a0;->h:Lp8/d0;

    .line 106
    .line 107
    iget-object v9, v2, Lp8/d0;->a:Landroid/content/Context;

    .line 108
    .line 109
    iget-object v10, v2, Lp8/d0;->c:Ljava/lang/ClassLoader;

    .line 110
    .line 111
    if-eqz v10, :cond_3

    .line 112
    .line 113
    new-instance v11, Lp8/x;

    .line 114
    .line 115
    iget-object v12, v2, Lp8/d0;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 116
    .line 117
    new-instance v0, Lp8/p;

    .line 118
    .line 119
    const-class v1, Lp8/d0;

    .line 120
    .line 121
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    const/4 v7, 0x0

    .line 126
    const/16 v8, 0xb

    .line 127
    .line 128
    const/4 v1, 0x1

    .line 129
    const-string v4, "log"

    .line 130
    .line 131
    const-string v5, "log(Ljava/lang/String;)V"

    .line 132
    .line 133
    const/4 v6, 0x0

    .line 134
    invoke-direct/range {v0 .. v8}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v11, v9, v10, v12, v0}, Lp8/x;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lp8/p;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_3
    const/4 v11, 0x0

    .line 142
    :goto_3
    return-object v11

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
