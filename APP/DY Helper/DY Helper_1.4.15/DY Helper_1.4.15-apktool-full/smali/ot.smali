.class public final synthetic Lot;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic α:J

.field public final synthetic β:Ljava/lang/String;

.field public final synthetic γ:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Lst;JLjava/lang/String;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lot;->α:J

    .line 5
    .line 6
    iput-object p4, p0, Lot;->β:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p5, p0, Lot;->γ:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lot;->γ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz p2, :cond_9

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-wide v3, p0, Lot;->α:J

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    sparse-switch v2, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :sswitch_0
    const-string p0, "hashCode"

    .line 23
    .line 24
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :sswitch_1
    const-string p1, "invoke"

    .line 42
    .line 43
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    if-eqz p3, :cond_2

    .line 52
    .line 53
    invoke-static {v5, p3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object p1, v1

    .line 59
    :goto_0
    iget-object p0, p0, Lot;->β:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v3, v4, p1, p0}, Lst;->γ(JLjava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    :try_start_0
    const-string p0, "kotlin.Unit"

    .line 65
    .line 66
    invoke-static {v0, p0}, Lst;->Ξ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    const-string p1, "INSTANCE"

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    goto :goto_2

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object p0, v1

    .line 88
    goto :goto_2

    .line 89
    :goto_1
    new-instance p1, Leo1;

    .line 90
    .line 91
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    move-object p0, p1

    .line 95
    :goto_2
    instance-of p1, p0, Leo1;

    .line 96
    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    move-object v1, p0

    .line 101
    :goto_3
    return-object v1

    .line 102
    :sswitch_2
    const-string p0, "equals"

    .line 103
    .line 104
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_5

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_5
    if-eqz p3, :cond_6

    .line 112
    .line 113
    invoke-static {v5, p3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    :cond_6
    if-ne p1, v1, :cond_7

    .line 118
    .line 119
    const/4 v5, 0x1

    .line 120
    :cond_7
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :sswitch_3
    const-string p0, "toString"

    .line 126
    .line 127
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-nez p0, :cond_8

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string p1, "DyHelperSparkIMUserCallback(uid="

    .line 137
    .line 138
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string p1, ")"

    .line 145
    .line 146
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_9
    :goto_4
    return-object v1

    .line 155
    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_3
        -0x4d378041 -> :sswitch_2
        -0x468dbb88 -> :sswitch_1
        0x8cdac1b -> :sswitch_0
    .end sparse-switch
.end method
