.class public final synthetic Lj8/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic g:Lj8/y;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:J

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lj8/y;Ljava/lang/String;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj8/v;->g:Lj8/y;

    .line 5
    .line 6
    iput-object p2, p0, Lj8/v;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lj8/v;->i:J

    .line 9
    .line 10
    iput p5, p0, Lj8/v;->j:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lj8/v;->g:Lj8/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-class v2, Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    if-ne v1, v2, :cond_4

    .line 15
    .line 16
    const-string v0, "hashCode"

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    const-string v0, "equals"

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    if-eqz p3, :cond_1

    .line 50
    .line 51
    array-length p2, p3

    .line 52
    if-lez p2, :cond_1

    .line 53
    .line 54
    aget-object v3, p3, v4

    .line 55
    .line 56
    :cond_1
    if-ne p1, v3, :cond_2

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    :cond_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_3
    const-string p1, "toString"

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_e

    .line 75
    .line 76
    const-string p1, "HchatVoicePlaybackCallback"

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_4
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p3, p0, Lj8/v;->h:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    sget-object p1, Lj8/y;->h:Landroid/os/Handler;

    .line 92
    .line 93
    new-instance p3, Le9/f;

    .line 94
    .line 95
    iget-wide v1, p0, Lj8/v;->i:J

    .line 96
    .line 97
    iget v5, p0, Lj8/v;->j:I

    .line 98
    .line 99
    invoke-direct {p3, v0, v1, v2, v5}, Le9/f;-><init>(Lj8/y;JI)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 103
    .line 104
    .line 105
    :cond_5
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_e

    .line 114
    .line 115
    sget-object p2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 116
    .line 117
    if-ne p1, p2, :cond_6

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_6
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 121
    .line 122
    if-ne p1, p2, :cond_7

    .line 123
    .line 124
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_7
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 128
    .line 129
    if-ne p1, p2, :cond_8

    .line 130
    .line 131
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    :cond_8
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    if-ne p1, p2, :cond_9

    .line 139
    .line 140
    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    return-object p1

    .line 145
    :cond_9
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 146
    .line 147
    if-ne p1, p2, :cond_a

    .line 148
    .line 149
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    return-object p1

    .line 154
    :cond_a
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 155
    .line 156
    if-ne p1, p2, :cond_b

    .line 157
    .line 158
    const-wide/16 p1, 0x0

    .line 159
    .line 160
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :cond_b
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 166
    .line 167
    if-ne p1, p2, :cond_c

    .line 168
    .line 169
    const/4 p1, 0x0

    .line 170
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    return-object p1

    .line 175
    :cond_c
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 176
    .line 177
    if-ne p1, p2, :cond_d

    .line 178
    .line 179
    const-wide/16 p1, 0x0

    .line 180
    .line 181
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    return-object p1

    .line 186
    :cond_d
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 187
    .line 188
    if-ne p1, p2, :cond_e

    .line 189
    .line 190
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    return-object p1

    .line 195
    :cond_e
    :goto_0
    return-object v3
.end method
