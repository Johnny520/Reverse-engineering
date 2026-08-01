.class public abstract Lqe0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/lang/Object;

.field public static final β:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v0, Ll91;

    .line 2
    .line 3
    const-string v1, "boolean"

    .line 4
    .line 5
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-direct {v0, v1, v9}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ll91;

    .line 11
    .line 12
    const-string v2, "byte"

    .line 13
    .line 14
    sget-object v10, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-direct {v1, v2, v10}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Ll91;

    .line 20
    .line 21
    const-string v3, "char"

    .line 22
    .line 23
    sget-object v11, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-direct {v2, v3, v11}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Ll91;

    .line 29
    .line 30
    const-string v4, "short"

    .line 31
    .line 32
    sget-object v12, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-direct {v3, v4, v12}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Ll91;

    .line 38
    .line 39
    const-string v5, "int"

    .line 40
    .line 41
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-direct {v4, v5, v13}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v5, Ll91;

    .line 47
    .line 48
    const-string v6, "long"

    .line 49
    .line 50
    sget-object v14, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-direct {v5, v6, v14}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance v6, Ll91;

    .line 56
    .line 57
    const-string v7, "float"

    .line 58
    .line 59
    sget-object v15, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    invoke-direct {v6, v7, v15}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance v7, Ll91;

    .line 65
    .line 66
    const-string v8, "double"

    .line 67
    .line 68
    move-object/from16 v16, v15

    .line 69
    .line 70
    sget-object v15, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    invoke-direct {v7, v8, v15}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v8, Ll91;

    .line 76
    .line 77
    move-object/from16 v17, v0

    .line 78
    .line 79
    const-string v0, "void"

    .line 80
    .line 81
    move-object/from16 v18, v1

    .line 82
    .line 83
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    invoke-direct {v8, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object/from16 v0, v17

    .line 89
    .line 90
    move-object/from16 v1, v18

    .line 91
    .line 92
    filled-new-array/range {v0 .. v8}, [Ll91;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lex0;->Μ([Ll91;)Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sput-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 101
    .line 102
    new-instance v1, Ll91;

    .line 103
    .line 104
    const-class v0, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-direct {v1, v9, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    new-instance v2, Ll91;

    .line 110
    .line 111
    const-class v0, Ljava/lang/Byte;

    .line 112
    .line 113
    invoke-direct {v2, v10, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    new-instance v3, Ll91;

    .line 117
    .line 118
    const-class v0, Ljava/lang/Character;

    .line 119
    .line 120
    invoke-direct {v3, v11, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance v4, Ll91;

    .line 124
    .line 125
    const-class v0, Ljava/lang/Short;

    .line 126
    .line 127
    invoke-direct {v4, v12, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    new-instance v5, Ll91;

    .line 131
    .line 132
    const-class v0, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-direct {v5, v13, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    new-instance v6, Ll91;

    .line 138
    .line 139
    const-class v0, Ljava/lang/Long;

    .line 140
    .line 141
    invoke-direct {v6, v14, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    new-instance v7, Ll91;

    .line 145
    .line 146
    const-class v0, Ljava/lang/Float;

    .line 147
    .line 148
    move-object/from16 v8, v16

    .line 149
    .line 150
    invoke-direct {v7, v8, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    new-instance v8, Ll91;

    .line 154
    .line 155
    const-class v0, Ljava/lang/Double;

    .line 156
    .line 157
    invoke-direct {v8, v15, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    filled-new-array/range {v1 .. v8}, [Ll91;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, Lex0;->Μ([Ll91;)Ljava/util/Map;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    sput-object v0, Lqe0;->β:Ljava/lang/Object;

    .line 169
    .line 170
    return-void
.end method

.method public static varargs α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, p1, p2, v1}, Lqe0;->η(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :try_start_0
    array-length v0, p2

    .line 16
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-object p0

    .line 25
    :catch_0
    move-exception p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    throw p0

    .line 31
    :cond_0
    const-string p0, "Instance receiver is null for "

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static varargs β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Lqe0;->η(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/reflect/Method;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    :try_start_0
    array-length p1, p2

    .line 7
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-virtual {p0, p2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    throw p0
.end method

.method public static γ([Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v1, v0, :cond_5

    .line 5
    .line 6
    aget-object v3, p0, v1

    .line 7
    .line 8
    aget-object v4, p1, v1

    .line 9
    .line 10
    if-nez v4, :cond_1

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    sget-object v5, Lqe0;->β:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Ljava/lang/Class;

    .line 29
    .line 30
    if-nez v5, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move-object v3, v5

    .line 34
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x4

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x2

    .line 54
    .line 55
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    :goto_3
    const/4 p0, 0x0

    .line 59
    return-object p0

    .line 60
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public static varargs δ(Ljava/lang/Class;[Ljava/lang/Object;)Ll01;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move-object v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    array-length v0, p1

    .line 9
    sub-int/2addr v0, v2

    .line 10
    aget-object v0, p1, v0

    .line 11
    .line 12
    :goto_0
    instance-of v3, v0, Lm01;

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, Lm01;

    .line 18
    .line 19
    :cond_1
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p1}, Lg7;->Τ([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {v0, p1}, Lqe0;->ν(Ljava/lang/ClassLoader;Ljava/util/List;)[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    array-length v0, p1

    .line 34
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, [Ljava/lang/Class;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    sget-object p1, Lxq0;->α:Lxq0;

    .line 48
    .line 49
    invoke-virtual {p1, p0, v1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_2
    const-string p0, "Last argument must be MethodHookCallback"

    .line 55
    .line 56
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0
.end method

.method public static varargs ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move-object v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    array-length v0, p2

    .line 9
    sub-int/2addr v0, v2

    .line 10
    aget-object v0, p2, v0

    .line 11
    .line 12
    :goto_0
    instance-of v3, v0, Lm01;

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    check-cast v0, Lm01;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object v0, v1

    .line 20
    :goto_1
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {p2}, Lg7;->Τ([Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-static {v3, p2}, Lqe0;->ν(Ljava/lang/ClassLoader;Ljava/util/List;)[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    move-object v3, p0

    .line 35
    :goto_2
    if-eqz v3, :cond_2

    .line 36
    .line 37
    :try_start_0
    array-length v4, p2

    .line 38
    invoke-static {p2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, [Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {v3, p1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    sget-object p0, Lxq0;->α:Lxq0;

    .line 52
    .line 53
    invoke-virtual {p0, v4, v0}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :catch_0
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    new-instance v0, Ljava/lang/NoSuchMethodException;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance v2, Lzb0;

    .line 70
    .line 71
    const/16 v3, 0x16

    .line 72
    .line 73
    invoke-direct {v2, v3}, Lzb0;-><init>(I)V

    .line 74
    .line 75
    .line 76
    const/16 v3, 0x1f

    .line 77
    .line 78
    invoke-static {p2, v1, v1, v2, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const-string v1, "#"

    .line 83
    .line 84
    const-string v2, "("

    .line 85
    .line 86
    invoke-static {p0, v1, p1, v2, p2}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-string p1, ")"

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-direct {v0, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :cond_3
    const-string p0, "Last argument must be MethodHookCallback"

    .line 104
    .line 105
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const/4 p0, 0x0

    .line 109
    return-object p0
.end method

.method public static varargs ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length p1, p3

    .line 6
    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p0, p2, p1}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static η(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/reflect/Method;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object v1, p0

    .line 7
    :goto_0
    if-eqz v1, :cond_3

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    array-length v3, v2

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_1
    if-ge v4, v3, :cond_2

    .line 19
    .line 20
    aget-object v5, v2, v4

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-static {v6, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_1

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    array-length v6, v6

    .line 37
    array-length v7, p2

    .line 38
    if-ne v6, v7, :cond_1

    .line 39
    .line 40
    if-eqz p3, :cond_0

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_1

    .line 51
    .line 52
    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    new-instance p3, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/4 v2, 0x0

    .line 77
    if-eqz v1, :cond_6

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Ljava/lang/reflect/Method;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {v3, p2}, Lqe0;->γ([Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    if-eqz v3, :cond_5

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    new-instance v3, Ll91;

    .line 107
    .line 108
    invoke-direct {v3, v1, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v2, v3

    .line 112
    :cond_5
    if-eqz v2, :cond_4

    .line 113
    .line 114
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_7

    .line 127
    .line 128
    move-object v0, v2

    .line 129
    goto :goto_3

    .line 130
    :cond_7
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_8

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_8
    move-object v1, v0

    .line 142
    check-cast v1, Ll91;

    .line 143
    .line 144
    iget-object v1, v1, Ll91;->ζ:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    :cond_9
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    move-object v4, v3

    .line 157
    check-cast v4, Ll91;

    .line 158
    .line 159
    iget-object v4, v4, Ll91;->ζ:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v4, Ljava/lang/Number;

    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-ge v1, v4, :cond_a

    .line 168
    .line 169
    move-object v0, v3

    .line 170
    move v1, v4

    .line 171
    :cond_a
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-nez v3, :cond_9

    .line 176
    .line 177
    :goto_3
    check-cast v0, Ll91;

    .line 178
    .line 179
    if-eqz v0, :cond_b

    .line 180
    .line 181
    iget-object p3, v0, Ll91;->ε:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p3, Ljava/lang/reflect/Method;

    .line 184
    .line 185
    if-eqz p3, :cond_b

    .line 186
    .line 187
    const/4 p0, 0x1

    .line 188
    invoke-virtual {p3, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 189
    .line 190
    .line 191
    return-object p3

    .line 192
    :cond_b
    new-instance p3, Ljava/lang/NoSuchMethodException;

    .line 193
    .line 194
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    new-instance v0, Lzb0;

    .line 199
    .line 200
    const/16 v1, 0x17

    .line 201
    .line 202
    invoke-direct {v0, v1}, Lzb0;-><init>(I)V

    .line 203
    .line 204
    .line 205
    const/16 v1, 0x1f

    .line 206
    .line 207
    invoke-static {p2, v2, v2, v0, v1}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    const-string v0, "#"

    .line 212
    .line 213
    const-string v1, "("

    .line 214
    .line 215
    invoke-static {p0, v0, p1, v1, p2}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    const-string p1, ")"

    .line 220
    .line 221
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-direct {p3, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw p3
.end method

.method public static θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Class;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {p1, v0, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    return-object v0
.end method

.method public static ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p0, p1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    new-instance p1, Leo1;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    move-object p0, p1

    .line 16
    :goto_0
    instance-of p1, p0, Leo1;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 22
    .line 23
    return-object p0
.end method

.method public static κ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 3

    .line 1
    move-object v0, p0

    .line 2
    :goto_0
    if-eqz v0, :cond_0

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-object v1

    .line 13
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v1, "#"

    .line 25
    .line 26
    invoke-static {p0, v1, p1}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public static λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0, p1}, Lqe0;->κ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    const-string p0, "Instance receiver is null for field "

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static varargs μ(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lpe0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, v2, p1}, Lpe0;-><init>(I[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Ly30;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct {v2, v0, v3, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lpe0;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, v1, p1}, Lpe0;-><init>(I[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lx30;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lx30;-><init>(Ly30;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lx30;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v2, 0x0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    move-object v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v1}, Lx30;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v1}, Lx30;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object v4, v0

    .line 60
    check-cast v4, Ll91;

    .line 61
    .line 62
    iget-object v4, v4, Ll91;->ζ:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    :cond_2
    invoke-virtual {v1}, Lx30;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    move-object v6, v5

    .line 75
    check-cast v6, Ll91;

    .line 76
    .line 77
    iget-object v6, v6, Ll91;->ζ:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v6, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-ge v4, v6, :cond_3

    .line 86
    .line 87
    move-object v0, v5

    .line 88
    move v4, v6

    .line 89
    :cond_3
    invoke-virtual {v1}, Lx30;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_2

    .line 94
    .line 95
    :goto_0
    check-cast v0, Ll91;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget-object v0, v0, Ll91;->ε:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 102
    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 106
    .line 107
    .line 108
    :try_start_0
    array-length p0, p1

    .line 109
    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :catch_0
    move-exception p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    throw p0

    .line 127
    :cond_4
    new-instance v0, Ljava/lang/NoSuchMethodException;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    new-instance v1, Lzb0;

    .line 134
    .line 135
    const/16 v3, 0x18

    .line 136
    .line 137
    invoke-direct {v1, v3}, Lzb0;-><init>(I)V

    .line 138
    .line 139
    .line 140
    const/16 v3, 0x1f

    .line 141
    .line 142
    invoke-static {p1, v2, v2, v1, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    new-instance v1, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string p0, "("

    .line 155
    .line 156
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string p0, ")"

    .line 163
    .line 164
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-direct {v0, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v0
.end method

.method public static ν(Ljava/lang/ClassLoader;Ljava/util/List;)[Ljava/lang/Class;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    instance-of v2, v1, Ljava/lang/Class;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Class;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    instance-of v2, v1, Ljava/lang/String;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p0, v1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-string p0, "Parameter type must be Class or String: "

    .line 48
    .line 49
    invoke-static {v1, p0}, Lγ;->μ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    const/4 p0, 0x0

    .line 55
    new-array p0, p0, [Ljava/lang/Class;

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, [Ljava/lang/Class;

    .line 62
    .line 63
    return-object p0
.end method

.method public static ξ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p0}, Lqe0;->κ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p1, "Instance receiver is null for field "

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
