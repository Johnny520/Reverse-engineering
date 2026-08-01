.class public final Ljh;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:Z

.field public final synthetic β:Ljava/lang/String;

.field public final synthetic γ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkh;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-boolean p2, p0, Ljh;->α:Z

    .line 2
    .line 3
    iput-object p3, p0, Ljh;->β:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Ljh;->γ:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Lm01;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"

    .line 19
    .line 20
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    sget-object v2, Lkh;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    const-string v2, "FeedPlayerWrapper"

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_8

    .line 46
    .line 47
    :cond_1
    sget-object v1, Lkh;->η:Lhh;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    iget-object v1, v1, Lhh;->α:Ljava/lang/ref/WeakReference;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v1, v2

    .line 60
    :goto_0
    if-ne v1, p1, :cond_3

    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {v3}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-static {v1, v3}, Lus1;->Δ(Lss1;Lss1;)Lc40;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v3, Lwe;

    .line 91
    .line 92
    const/16 v4, 0x1c

    .line 93
    .line 94
    invoke-direct {v3, v4}, Lwe;-><init>(I)V

    .line 95
    .line 96
    .line 97
    new-instance v4, Ly30;

    .line 98
    .line 99
    const/4 v5, 0x1

    .line 100
    invoke-direct {v4, v1, v5, v3}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Lgh;

    .line 104
    .line 105
    const/4 v3, 0x2

    .line 106
    invoke-direct {v1, v3}, Lgh;-><init>(I)V

    .line 107
    .line 108
    .line 109
    new-instance v3, Lbu;

    .line 110
    .line 111
    invoke-interface {v4}, Lss1;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-direct {v3, v4, v1}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Lσ;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_4

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    invoke-virtual {v3}, Lσ;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v3}, Lσ;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_5

    .line 134
    .line 135
    :goto_1
    move-object v1, v2

    .line 136
    :cond_5
    check-cast v1, Ljava/lang/reflect/Method;

    .line 137
    .line 138
    if-eqz v1, :cond_6

    .line 139
    .line 140
    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 141
    .line 142
    .line 143
    move-object v2, v1

    .line 144
    :cond_6
    if-nez v2, :cond_7

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_7
    new-instance v1, Lhh;

    .line 148
    .line 149
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 150
    .line 151
    invoke-direct {v3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    const-string p1, "getCurrentPosition"

    .line 155
    .line 156
    invoke-static {v0, p1}, Lkh;->α(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    const-string v4, "getDuration"

    .line 161
    .line 162
    invoke-static {v0, v4}, Lkh;->α(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-direct {v1, v3, v2, p1, v4}, Lhh;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 167
    .line 168
    .line 169
    sput-object v1, Lkh;->η:Lhh;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    const-string v0, "rc7ea2edd7e9fe797"

    .line 176
    .line 177
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    const-string v0, "rc90e47ff78acb49f"

    .line 182
    .line 183
    invoke-static {v0, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :cond_8
    :goto_2
    sget-object p1, Lug;->α:Ltg;

    .line 187
    .line 188
    iget-boolean p1, p0, Ljh;->α:Z

    .line 189
    .line 190
    iget-object v0, p0, Ljh;->β:Ljava/lang/String;

    .line 191
    .line 192
    iget-object p0, p0, Ljh;->γ:Ljava/lang/String;

    .line 193
    .line 194
    const-string v1, ": "

    .line 195
    .line 196
    invoke-static {v0, v1, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    sget-object v0, Lug;->κ:Landroid/os/Handler;

    .line 201
    .line 202
    new-instance v1, Ljg;

    .line 203
    .line 204
    invoke-direct {v1, p0, p1}, Ljg;-><init>(Ljava/lang/String;Z)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 208
    .line 209
    .line 210
    return-void
.end method
