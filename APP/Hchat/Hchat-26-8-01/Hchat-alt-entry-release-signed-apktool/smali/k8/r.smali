.class public final synthetic Lk8/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    if-ne v0, v1, :cond_4

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "toString"

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-string p1, "HchatMessageClearCallback"

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    const-string v1, "hashCode"

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_1
    const-string v1, "equals"

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    if-eqz p3, :cond_2

    .line 52
    .line 53
    array-length p2, p3

    .line 54
    if-lez p2, :cond_2

    .line 55
    .line 56
    aget-object v2, p3, v3

    .line 57
    .line 58
    :cond_2
    if-ne p1, v2, :cond_3

    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    :cond_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_4
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    if-eq p1, p2, :cond_f

    .line 73
    .line 74
    const-class p3, Ljava/lang/Boolean;

    .line 75
    .line 76
    if-ne p1, p3, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    if-eqz p1, :cond_e

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_e

    .line 86
    .line 87
    sget-object p3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    if-ne p1, p3, :cond_6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_6
    if-ne p1, p2, :cond_7

    .line 93
    .line 94
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_7
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    if-ne p1, p2, :cond_8

    .line 100
    .line 101
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :cond_8
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 107
    .line 108
    if-ne p1, p2, :cond_9

    .line 109
    .line 110
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_9
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 116
    .line 117
    if-ne p1, p2, :cond_a

    .line 118
    .line 119
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    :cond_a
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 125
    .line 126
    if-ne p1, p2, :cond_b

    .line 127
    .line 128
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    return-object p1

    .line 133
    :cond_b
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 134
    .line 135
    if-ne p1, p2, :cond_c

    .line 136
    .line 137
    const-wide/16 p1, 0x0

    .line 138
    .line 139
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :cond_c
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 145
    .line 146
    if-ne p1, p2, :cond_d

    .line 147
    .line 148
    const/4 p1, 0x0

    .line 149
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    return-object p1

    .line 154
    :cond_d
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 155
    .line 156
    if-ne p1, p2, :cond_e

    .line 157
    .line 158
    const-wide/16 p1, 0x0

    .line 159
    .line 160
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :cond_e
    :goto_0
    return-object v2

    .line 166
    :cond_f
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 167
    .line 168
    return-object p1
.end method
