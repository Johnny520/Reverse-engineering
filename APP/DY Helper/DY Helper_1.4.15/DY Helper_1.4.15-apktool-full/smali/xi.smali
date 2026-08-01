.class public final synthetic Lxi;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic η:Ljava/lang/String;

.field public final synthetic θ:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/lang/ClassLoader;I)V
    .locals 0

    .line 1
    iput p4, p0, Lxi;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxi;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput-object p2, p0, Lxi;->η:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lxi;->θ:Ljava/lang/ClassLoader;

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
    iget v0, p0, Lxi;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ls9;

    .line 7
    .line 8
    const/16 v1, 0x1b

    .line 9
    .line 10
    iget-object v2, p0, Lxi;->η:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {v0, v2, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lxi;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 41
    .line 42
    iget-object v3, p0, Lxi;->θ:Ljava/lang/ClassLoader;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-object v1

    .line 55
    :pswitch_0
    new-instance v0, Ls9;

    .line 56
    .line 57
    const/16 v1, 0x1c

    .line 58
    .line 59
    iget-object v2, p0, Lxi;->η:Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v0, v2, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lxi;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v1, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 90
    .line 91
    iget-object v3, p0, Lxi;->θ:Ljava/lang/ClassLoader;

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-eqz v2, :cond_2

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    return-object v1

    .line 104
    :pswitch_1
    iget-object v0, p0, Lxi;->θ:Ljava/lang/ClassLoader;

    .line 105
    .line 106
    new-instance v1, Ls9;

    .line 107
    .line 108
    const/4 v2, 0x5

    .line 109
    iget-object v3, p0, Lxi;->η:Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {v1, v3, v2}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    iget-object p0, p0, Lxi;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 115
    .line 116
    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance v1, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_6

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 140
    .line 141
    :try_start_0
    invoke-virtual {v2, v0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 142
    .line 143
    .line 144
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    goto :goto_3

    .line 146
    :catchall_0
    move-exception v2

    .line 147
    new-instance v3, Leo1;

    .line 148
    .line 149
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    move-object v2, v3

    .line 153
    :goto_3
    instance-of v3, v2, Leo1;

    .line 154
    .line 155
    if-eqz v3, :cond_5

    .line 156
    .line 157
    const/4 v2, 0x0

    .line 158
    :cond_5
    check-cast v2, Ljava/lang/reflect/Method;

    .line 159
    .line 160
    if-eqz v2, :cond_4

    .line 161
    .line 162
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_6
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
