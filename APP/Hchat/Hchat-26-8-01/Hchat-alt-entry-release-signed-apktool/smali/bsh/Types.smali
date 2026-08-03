.class Lbsh/Types;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/Types$Suffix;,
        Lbsh/Types$MapEntry;
    }
.end annotation


# static fields
.field static final ASSIGNMENT:I = 0x1

.field static final BSH_ASSIGNABLE:I = 0x4

.field static final CAST:I = 0x0

.field static final FIRST_ROUND_ASSIGNABLE:I = 0x1

.field static INVALID_CAST:Lbsh/Primitive; = null

.field static final JAVA_BASE_ASSIGNABLE:I = 0x1

.field static final JAVA_BOX_TYPES_ASSIGABLE:I = 0x2

.field static final JAVA_VARARGS_ASSIGNABLE:I = 0x3

.field static final LAST_ROUND_ASSIGNABLE:I = 0x4

.field private static final NUMBER_ORDER:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field static VALID_CAST:Lbsh/Primitive;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbsh/Types$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lbsh/Types$1;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lbsh/Types;->NUMBER_ORDER:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Lbsh/Primitive;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 19
    .line 20
    new-instance v0, Lbsh/Primitive;

    .line 21
    .line 22
    const/4 v1, -0x1

    .line 23
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lbsh/Types;->INVALID_CAST:Lbsh/Primitive;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static areSignaturesEqual([Ljava/lang/Class;[Ljava/lang/Class;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    array-length v1, p1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v2

    .line 7
    :cond_0
    move v0, v2

    .line 8
    :goto_0
    array-length v1, p0

    .line 9
    if-ge v0, v1, :cond_2

    .line 10
    .line 11
    aget-object v1, p0, v0

    .line 12
    .line 13
    aget-object v3, p1, v0

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    const/4 p0, 0x1

    .line 22
    return p0
.end method

.method public static arrayDimensions(Ljava/lang/Class;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)I"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/16 v0, 0x5b

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/lit8 p0, p0, 0x1

    .line 21
    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public static arrayElementType(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    return-object p0
.end method

.method public static castError(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;I)Lbsh/UtilEvalError;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "I)",
            "Lbsh/UtilEvalError;"
        }
    .end annotation

    .line 112
    invoke-static {p0}, Lbsh/StringUtil;->typeString(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    .line 113
    invoke-static {p1}, Lbsh/StringUtil;->typeString(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    .line 114
    invoke-static {p0, p1, p2, p3}, Lbsh/Types;->castError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lbsh/UtilEvalError;

    move-result-object p0

    return-object p0
.end method

.method public static castError(Ljava/lang/String;Ljava/lang/String;I)Lbsh/UtilEvalError;
    .locals 1

    const/4 v0, 0x0

    .line 111
    invoke-static {p0, p1, v0, p2}, Lbsh/Types;->castError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lbsh/UtilEvalError;

    move-result-object p0

    return-object p0
.end method

.method public static castError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lbsh/UtilEvalError;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, " to "

    .line 3
    .line 4
    const-string v2, "\""

    .line 5
    .line 6
    const-string v3, " with value \""

    .line 7
    .line 8
    const-string v4, ""

    .line 9
    .line 10
    if-ne p3, v0, :cond_1

    .line 11
    .line 12
    new-instance p3, Lbsh/UtilEvalError;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v5, "Cannot assign "

    .line 17
    .line 18
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :goto_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-direct {p3, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p3

    .line 59
    :cond_1
    new-instance p3, Ljava/lang/ClassCastException;

    .line 60
    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v5, "Cannot cast "

    .line 64
    .line 65
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    if-nez p2, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-direct {p3, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance p0, Lbsh/UtilTargetError;

    .line 106
    .line 107
    invoke-direct {p0, p3}, Lbsh/UtilTargetError;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    return-object p0
.end method

.method public static castObject(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;IZ)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "IZ)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_1f

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_3

    .line 6
    .line 7
    :cond_0
    if-eqz p1, :cond_3

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    const-class v0, Ljava/util/Collection;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    invoke-static {p0, p1, p2}, Lbsh/BshArray;->castArray(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const-string v1, "[-+0-9.]*"

    .line 40
    .line 41
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    if-eqz v0, :cond_d

    .line 44
    .line 45
    if-eq p1, v2, :cond_b

    .line 46
    .line 47
    if-eqz p1, :cond_b

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    invoke-static {p1}, Lbsh/Types;->isNumeric(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_5

    .line 61
    .line 62
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    :cond_5
    invoke-static {p0}, Lbsh/Types;->isNumeric(Ljava/lang/Class;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_9

    .line 77
    .line 78
    :cond_6
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    if-ne p0, v0, :cond_7

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_7
    if-eqz p4, :cond_8

    .line 84
    .line 85
    sget-object p0, Lbsh/Types;->INVALID_CAST:Lbsh/Primitive;

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_8
    invoke-static {p0, p1, p2, p3}, Lbsh/Types;->castError(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;I)Lbsh/UtilEvalError;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    throw p0

    .line 93
    :cond_9
    :goto_0
    if-eqz p4, :cond_a

    .line 94
    .line 95
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_a
    invoke-static {p0, p2}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {p1, p0}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :cond_b
    :goto_1
    const-class v0, Lbsh/Primitive;

    .line 108
    .line 109
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_c

    .line 114
    .line 115
    invoke-static {p2, p1}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    :cond_c
    check-cast p2, Lbsh/Primitive;

    .line 120
    .line 121
    invoke-static {p0, p1, p2, p4, p3}, Lbsh/Primitive;->castPrimitive(Ljava/lang/Class;Ljava/lang/Class;Lbsh/Primitive;ZI)Lbsh/Primitive;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_d
    if-eq p1, v2, :cond_19

    .line 127
    .line 128
    if-eqz p1, :cond_19

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_19

    .line 135
    .line 136
    const-class v0, Ljava/lang/Boolean;

    .line 137
    .line 138
    if-eq p0, v0, :cond_19

    .line 139
    .line 140
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_e

    .line 149
    .line 150
    invoke-static {p0}, Lbsh/Types;->isNumeric(Ljava/lang/Class;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_e

    .line 155
    .line 156
    goto/16 :goto_2

    .line 157
    .line 158
    :cond_e
    invoke-static {p0}, Lbsh/Types;->isFunctionalInterface(Ljava/lang/Class;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_10

    .line 163
    .line 164
    instance-of v0, p2, Lbsh/BshLambda;

    .line 165
    .line 166
    if-eqz v0, :cond_10

    .line 167
    .line 168
    if-eqz p4, :cond_f

    .line 169
    .line 170
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 171
    .line 172
    return-object p0

    .line 173
    :cond_f
    check-cast p2, Lbsh/BshLambda;

    .line 174
    .line 175
    invoke-virtual {p2, p0}, Lbsh/BshLambda;->convertTo(Ljava/lang/Class;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    return-object p0

    .line 180
    :cond_10
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_12

    .line 185
    .line 186
    if-eqz p4, :cond_11

    .line 187
    .line 188
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 189
    .line 190
    return-object p0

    .line 191
    :cond_11
    invoke-static {p0}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 192
    .line 193
    .line 194
    move-result p3

    .line 195
    if-eqz p3, :cond_20

    .line 196
    .line 197
    invoke-static {p1}, Ljava/lang/reflect/Proxy;->isProxyClass(Ljava/lang/Class;)Z

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    if-nez p1, :cond_20

    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-static {p2, p0}, Lbsh/Reflect;->getClassInstanceThis(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    return-object p0

    .line 212
    :cond_12
    const-class v0, Lbsh/This;

    .line 213
    .line 214
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_13

    .line 219
    .line 220
    move-object v1, p2

    .line 221
    check-cast v1, Lbsh/This;

    .line 222
    .line 223
    invoke-virtual {v1}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    iget-object v1, v1, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 228
    .line 229
    if-ne v1, p0, :cond_13

    .line 230
    .line 231
    if-eqz p4, :cond_20

    .line 232
    .line 233
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 234
    .line 235
    return-object p0

    .line 236
    :cond_13
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-eqz v1, :cond_15

    .line 241
    .line 242
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_15

    .line 247
    .line 248
    if-eqz p4, :cond_14

    .line 249
    .line 250
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 251
    .line 252
    return-object p0

    .line 253
    :cond_14
    check-cast p2, Lbsh/This;

    .line 254
    .line 255
    invoke-virtual {p2, p0}, Lbsh/This;->getInterface(Ljava/lang/Class;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    return-object p0

    .line 260
    :cond_15
    invoke-static {p0}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_17

    .line 265
    .line 266
    invoke-static {p1}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_17

    .line 271
    .line 272
    if-eqz p4, :cond_16

    .line 273
    .line 274
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 275
    .line 276
    return-object p0

    .line 277
    :cond_16
    invoke-static {p0, p2}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    return-object p0

    .line 282
    :cond_17
    if-eqz p4, :cond_18

    .line 283
    .line 284
    sget-object p0, Lbsh/Types;->INVALID_CAST:Lbsh/Primitive;

    .line 285
    .line 286
    return-object p0

    .line 287
    :cond_18
    invoke-static {p0, p1, p2, p3}, Lbsh/Types;->castError(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;I)Lbsh/UtilEvalError;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    throw p0

    .line 292
    :cond_19
    :goto_2
    invoke-static {p0}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    if-eqz v0, :cond_1b

    .line 297
    .line 298
    if-eq p1, v2, :cond_1b

    .line 299
    .line 300
    if-eqz p1, :cond_1b

    .line 301
    .line 302
    if-eqz p4, :cond_1a

    .line 303
    .line 304
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 305
    .line 306
    return-object p0

    .line 307
    :cond_1a
    invoke-static {p0}, Lbsh/Primitive;->unboxType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    invoke-static {p0, p2}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    return-object p0

    .line 316
    :cond_1b
    const-class v0, Ljava/lang/Object;

    .line 317
    .line 318
    if-ne p0, v0, :cond_1d

    .line 319
    .line 320
    if-eq p1, v2, :cond_1d

    .line 321
    .line 322
    if-eqz p1, :cond_1d

    .line 323
    .line 324
    if-eqz p4, :cond_1c

    .line 325
    .line 326
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 327
    .line 328
    return-object p0

    .line 329
    :cond_1c
    invoke-static {p2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    return-object p0

    .line 334
    :cond_1d
    if-eqz p1, :cond_1e

    .line 335
    .line 336
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-nez v0, :cond_1e

    .line 341
    .line 342
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_1e

    .line 347
    .line 348
    if-eqz p4, :cond_20

    .line 349
    .line 350
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 351
    .line 352
    return-object p0

    .line 353
    :cond_1e
    check-cast p2, Lbsh/Primitive;

    .line 354
    .line 355
    invoke-static {p0, p1, p2, p4, p3}, Lbsh/Primitive;->castPrimitive(Ljava/lang/Class;Ljava/lang/Class;Lbsh/Primitive;ZI)Lbsh/Primitive;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    return-object p0

    .line 360
    :cond_1f
    :goto_3
    if-eqz p4, :cond_20

    .line 361
    .line 362
    sget-object p0, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;

    .line 363
    .line 364
    return-object p0

    .line 365
    :cond_20
    return-object p2
.end method

.method public static castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p0, :cond_2

    if-nez p2, :cond_1

    .line 366
    invoke-static {p1}, Lbsh/Types;->isPrimitive(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {p1}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 367
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    return-object p0

    .line 368
    :cond_0
    invoke-static {p1}, Lbsh/Primitive;->getDefaultValue(Ljava/lang/Class;)Lbsh/Primitive;

    move-result-object p0

    return-object p0

    .line 369
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Cast error: null fromValue for toType: "

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    .line 370
    :cond_2
    invoke-static {p0}, Lbsh/Types;->getType(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    .line 371
    invoke-static {p1, v0, p0, p2, v1}, Lbsh/Types;->castObject(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static createParameterizedType(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;
    .locals 1

    .line 1
    new-instance v0, Lbsh/Types$2;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lbsh/Types$2;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static varargs getASMClassSignature([Ljava/lang/reflect/TypeVariable;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    const-string v1, "<"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    array-length v1, p0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v3, v1, :cond_1

    .line 18
    .line 19
    aget-object v4, p0, v3

    .line 20
    .line 21
    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    array-length v5, v4

    .line 33
    move v6, v2

    .line 34
    :goto_1
    if-ge v6, v5, :cond_0

    .line 35
    .line 36
    aget-object v7, v4, v6

    .line 37
    .line 38
    const-string v8, ":"

    .line 39
    .line 40
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {v7}, Lbsh/Types;->getASMSignature(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    add-int/lit8 v6, v6, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-string p0, ">"

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-static {p1}, Lbsh/Types;->getASMSignature(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    array-length p0, p2

    .line 69
    :goto_2
    if-ge v2, p0, :cond_3

    .line 70
    .line 71
    aget-object p1, p2, v2

    .line 72
    .line 73
    invoke-static {p1}, Lbsh/Types;->getASMSignature(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method

.method public static getASMMethodSignature(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 3

    .line 119
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getGenericExceptionTypes()[Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {v0, v1, v2, p0}, Lbsh/Types;->getASMMethodSignature([Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getASMMethodSignature([Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;[",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_2

    .line 9
    .line 10
    const-string v1, "<"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    array-length v1, p0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-ge v3, v1, :cond_1

    .line 18
    .line 19
    aget-object v4, p0, v3

    .line 20
    .line 21
    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    array-length v5, v4

    .line 33
    move v6, v2

    .line 34
    :goto_1
    if-ge v6, v5, :cond_0

    .line 35
    .line 36
    aget-object v7, v4, v6

    .line 37
    .line 38
    const-string v8, ":"

    .line 39
    .line 40
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {v7}, Lbsh/Types;->getASMSignature(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    add-int/lit8 v6, v6, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-string p0, ">"

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    :cond_2
    const-string p0, "("

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    array-length p0, p1

    .line 67
    move v1, v2

    .line 68
    :goto_2
    if-ge v1, p0, :cond_3

    .line 69
    .line 70
    aget-object v3, p1, v1

    .line 71
    .line 72
    invoke-static {v3}, Lbsh/Types;->getASMSignature(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    const-string p0, ")"

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-static {p2}, Lbsh/Types;->getASMSignature(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    array-length p0, p3

    .line 95
    :goto_3
    if-ge v2, p0, :cond_4

    .line 96
    .line 97
    aget-object p1, p3, v2

    .line 98
    .line 99
    const-string p2, "^"

    .line 100
    .line 101
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Lbsh/Types;->getASMSignature(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    add-int/lit8 v2, v2, 0x1

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method

.method public static getASMSignature(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 4

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, "L"

    .line 27
    .line 28
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/Class;

    .line 36
    .line 37
    invoke-static {v3}, Lbsh/org/objectweb/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, "<"

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    array-length v2, p0

    .line 61
    :goto_0
    if-ge v1, v2, :cond_1

    .line 62
    .line 63
    aget-object v3, p0, v1

    .line 64
    .line 65
    invoke-static {v3}, Lbsh/Types;->getASMSignature(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    const-string p0, ">;"

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v1, "T"

    .line 92
    .line 93
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 97
    .line 98
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p0, ";"

    .line 106
    .line 107
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    array-length v2, v0

    .line 126
    if-lez v2, :cond_4

    .line 127
    .line 128
    new-instance p0, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v2, "-"

    .line 131
    .line 132
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    aget-object v0, v0, v1

    .line 136
    .line 137
    check-cast v0, Ljava/lang/Class;

    .line 138
    .line 139
    invoke-static {v0}, Lbsh/org/objectweb/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v2, "+"

    .line 154
    .line 155
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    aget-object p0, p0, v1

    .line 163
    .line 164
    check-cast p0, Ljava/lang/Class;

    .line 165
    .line 166
    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 179
    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v2, "Can\'t get the signature of this type because its Class is unknown: "

    .line 183
    .line 184
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    if-eqz p0, :cond_6

    .line 188
    .line 189
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    goto :goto_1

    .line 194
    :cond_6
    const/4 p0, 0x0

    .line 195
    :goto_1
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v0
.end method

.method public static getASMType(Ljava/lang/Class;)Lbsh/org/objectweb/asm/Type;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lbsh/org/objectweb/asm/Type;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/Class;)Lbsh/org/objectweb/asm/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static getBaseName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "$"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static getCommonType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_5

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    sget-object v0, Lbsh/Types;->NUMBER_ORDER:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-lt v1, v0, :cond_2

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    :goto_0
    return-object p1

    .line 51
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-class v0, Ljava/lang/Object;

    .line 56
    .line 57
    if-eqz p0, :cond_4

    .line 58
    .line 59
    if-eq v0, p0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_4
    return-object v0

    .line 69
    :cond_5
    :goto_1
    return-object p0
.end method

.method public static getDescriptor(Ljava/lang/Class;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static getInternalName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static getInternalNames([Ljava/lang/Class;)[Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p0

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    aget-object v2, p0, v1

    .line 9
    .line 10
    invoke-static {v2}, Lbsh/org/objectweb/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    aput-object v2, v0, v1

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object v0
.end method

.method public static varargs getMethodDescriptor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [Lbsh/org/objectweb/asm/Type;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p1

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    invoke-static {v2}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/Class;)Lbsh/org/objectweb/asm/Type;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    aput-object v2, v0, v1

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/Class;)Lbsh/org/objectweb/asm/Type;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0, v0}, Lbsh/org/objectweb/asm/Type;->getMethodDescriptor(Lbsh/org/objectweb/asm/Type;[Lbsh/org/objectweb/asm/Type;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 0

    .line 28
    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getType(B)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 42
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    return-object p0
.end method

.method public static getType(C)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 43
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    return-object p0
.end method

.method public static getType(D)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 47
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    return-object p0
.end method

.method public static getType(F)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 48
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    return-object p0
.end method

.method public static getType(I)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 44
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    return-object p0
.end method

.method public static getType(J)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 45
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    return-object p0
.end method

.method public static getType(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 49
    invoke-static {p0, v0}, Lbsh/Types;->getType(Ljava/lang/Object;Z)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public static getType(Ljava/lang/Object;Z)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Z)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 4
    .line 5
    if-ne v0, p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of v0, p0, Lbsh/Primitive;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    check-cast p0, Lbsh/Primitive;

    .line 15
    .line 16
    invoke-virtual {p0}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    instance-of p1, p0, Lbsh/BshLambda;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    check-cast p0, Lbsh/BshLambda;

    .line 26
    .line 27
    iget-object p0, p0, Lbsh/BshLambda;->dummyType:Ljava/lang/Class;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    invoke-static {p0}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public static getType(S)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(S)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 46
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    return-object p0
.end method

.method public static getType(Z)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 41
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    return-object p0
.end method

.method public static getTypes([Ljava/lang/Object;)[Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lbsh/Reflect;->ZERO_TYPES:[Ljava/lang/Class;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    array-length v0, p0

    .line 7
    new-array v0, v0, [Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    array-length v2, p0

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    aget-object v2, p0, v1

    .line 14
    .line 15
    invoke-static {v2}, Lbsh/Types;->getType(Ljava/lang/Object;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    aput-object v2, v0, v1

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-object v0
.end method

.method public static isAssignable(Ljava/lang/Class;Ljava/lang/Class;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;I)Z"
        }
    .end annotation

    .line 107
    invoke-static {p1}, Lbsh/Types;->isFunctionalInterface(Ljava/lang/Class;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lbsh/BshLambda;->isAssignable(Ljava/lang/Class;Ljava/lang/Class;I)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-eq p2, v1, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    .line 108
    invoke-static {p1, p0}, Lbsh/Types;->isBshAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    return p0

    .line 109
    :cond_1
    const-string p0, "bad case"

    invoke-static {p0}, Lbsh/j;->f(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0

    .line 110
    :cond_3
    invoke-static {p1, p0}, Lbsh/Types;->isJavaBoxTypesAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    return p0

    .line 111
    :cond_4
    invoke-static {p1, p0}, Lbsh/Types;->isJavaBaseAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    return p0
.end method

.method public static isAssignable(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "I)Z"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/Class;I)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p0, p1, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    check-cast p1, Ljava/lang/reflect/TypeVariable;

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    array-length v0, p1

    .line 40
    move v3, v2

    .line 41
    :goto_0
    if-ge v3, v0, :cond_3

    .line 42
    .line 43
    aget-object v4, p1, v3

    .line 44
    .line 45
    invoke-static {p0, v4, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    return v2

    .line 52
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    return v1

    .line 56
    :cond_4
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    .line 57
    .line 58
    if-eqz v0, :cond_9

    .line 59
    .line 60
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    array-length v3, v0

    .line 67
    move v4, v2

    .line 68
    :goto_1
    if-ge v4, v3, :cond_6

    .line 69
    .line 70
    aget-object v5, v0, v4

    .line 71
    .line 72
    invoke-static {p0, v5, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_5

    .line 77
    .line 78
    return v2

    .line 79
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_6
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    array-length v0, p1

    .line 87
    move v3, v2

    .line 88
    :goto_2
    if-ge v3, v0, :cond_8

    .line 89
    .line 90
    aget-object v4, p1, v3

    .line 91
    .line 92
    invoke-static {v4, p0, p2}, Lbsh/Types;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_7

    .line 97
    .line 98
    return v2

    .line 99
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_8
    return v1

    .line 103
    :cond_9
    if-nez p1, :cond_a

    .line 104
    .line 105
    return v1

    .line 106
    :cond_a
    return v2
.end method

.method public static isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class<",
            "*>;I)Z"
        }
    .end annotation

    .line 112
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 113
    invoke-static {p0, p1, p2}, Lbsh/Types;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z

    move-result p0

    return p0

    .line 114
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_1

    .line 115
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lbsh/Types;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z

    move-result p0

    return p0

    .line 116
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    .line 117
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 118
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    array-length v0, p0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_3

    aget-object v4, p0, v3

    .line 119
    invoke-static {v4, p1, p2}, Lbsh/Types;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z

    move-result v4

    if-nez v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v1

    .line 120
    :cond_4
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_9

    .line 121
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 122
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    array-length v3, v0

    move v4, v2

    :goto_1
    if-ge v4, v3, :cond_6

    aget-object v5, v0, v4

    .line 123
    invoke-static {v5, p1, p2}, Lbsh/Types;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;I)Z

    move-result v5

    if-nez v5, :cond_5

    return v2

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 124
    :cond_6
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    array-length v0, p0

    move v3, v2

    :goto_2
    if-ge v3, v0, :cond_8

    aget-object v4, p0, v3

    .line 125
    invoke-static {p1, v4, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    move-result v4

    if-nez v4, :cond_7

    return v2

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_8
    return v1

    :cond_9
    if-nez p1, :cond_a

    return v1

    :cond_a
    return v2
.end method

.method public static isBshAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-static {p0, p1, v0, v1, v1}, Lbsh/Types;->castObject(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;IZ)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lbsh/Types;->VALID_CAST:Lbsh/Primitive;
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    const-string p1, "err in cast check: "

    .line 16
    .line 17
    invoke-static {p1, p0}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static isCollectionType(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/util/Collection;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-class v0, Ljava/util/Map;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-class v0, Ljava/util/Map$Entry;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public static isFloatingpoint(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Float;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Ljava/lang/Double;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of p0, p0, Ljava/math/BigDecimal;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static isFunctionalInterface(Ljava/lang/Class;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-class v1, Ljava/lang/FunctionalInterface;

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    array-length v1, p0

    .line 26
    move v3, v0

    .line 27
    move v4, v3

    .line 28
    :goto_0
    if-ge v3, v1, :cond_4

    .line 29
    .line 30
    aget-object v5, p0, v3

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_3

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_3

    .line 53
    .line 54
    invoke-static {v5}, Lbsh/Types;->isObjectClassMethod(Ljava/lang/reflect/Method;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-nez v5, :cond_3

    .line 59
    .line 60
    add-int/lit8 v5, v4, 0x1

    .line 61
    .line 62
    if-le v4, v2, :cond_2

    .line 63
    .line 64
    return v0

    .line 65
    :cond_2
    move v4, v5

    .line 66
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    if-ne v4, v2, :cond_5

    .line 70
    .line 71
    return v2

    .line 72
    :cond_5
    :goto_1
    return v0
.end method

.method public static isJavaAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lbsh/Types;->isJavaBaseAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0, p1}, Lbsh/Types;->isJavaBoxTypesAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static isJavaBaseAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-nez p1, :cond_2

    .line 7
    .line 8
    const-class p1, Ljava/lang/String;

    .line 9
    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v1

    .line 13
    :cond_1
    return v0

    .line 14
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_5

    .line 25
    .line 26
    if-ne p0, p1, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    sget-object v2, Lbsh/Types;->NUMBER_ORDER:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_8

    .line 36
    .line 37
    invoke-interface {v2, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_8

    .line 42
    .line 43
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-ge p1, p0, :cond_4

    .line 64
    .line 65
    return v1

    .line 66
    :cond_4
    return v0

    .line 67
    :cond_5
    const-class v2, Ljava/math/BigInteger;

    .line 68
    .line 69
    if-eq p0, v2, :cond_6

    .line 70
    .line 71
    const-class v2, Ljava/math/BigDecimal;

    .line 72
    .line 73
    if-ne p0, v2, :cond_7

    .line 74
    .line 75
    :cond_6
    invoke-static {p1}, Lbsh/Types;->isNumeric(Ljava/lang/Class;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_7

    .line 80
    .line 81
    return v1

    .line 82
    :cond_7
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_8

    .line 87
    .line 88
    return v1

    .line 89
    :cond_8
    return v0
.end method

.method public static isJavaBoxTypesAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne p0, v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    if-nez p1, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_2

    .line 24
    .line 25
    return v2

    .line 26
    :cond_2
    return v0

    .line 27
    :cond_3
    const-class v0, Ljava/lang/Number;

    .line 28
    .line 29
    if-ne p0, v0, :cond_4

    .line 30
    .line 31
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    if-eq p1, v0, :cond_4

    .line 34
    .line 35
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    if-eq p1, v0, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    sget-object v0, Lbsh/Primitive;->wrapperMap:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-ne v0, p1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    invoke-static {p0, p1}, Lbsh/Types;->isJavaBaseAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public static isNumeric(Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lbsh/Primitive;->boxType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    :goto_0
    const-class v1, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_3

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {p0}, Lbsh/Primitive;->boxType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_1
    const-class v0, Ljava/lang/Character;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public static isNumeric(Ljava/lang/Object;)Z
    .locals 1

    .line 44
    instance-of v0, p0, Ljava/lang/Number;

    if-nez v0, :cond_1

    instance-of p0, p0, Ljava/lang/Character;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static isObjectClassMethod(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {v0, v1, p0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :catch_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public static isPrimitive(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const-class v0, Ljava/math/BigInteger;

    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const-class v0, Ljava/math/BigDecimal;

    .line 12
    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public static isPropertyType(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lbsh/Types;->isPropertyTypeMap(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lbsh/Types;->isPropertyTypeEntry(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Lbsh/Types;->isPropertyTypeEntryList(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public static isPropertyTypeEntry(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/util/Map$Entry;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static isPropertyTypeEntry(Ljava/lang/Object;)Z
    .locals 0

    .line 8
    instance-of p0, p0, Ljava/util/Map$Entry;

    return p0
.end method

.method public static isPropertyTypeEntryList(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lbsh/Types;->isPropertyTypeEntry(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static isPropertyTypeMap(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static isPropertyTypeMap(Ljava/lang/Object;)Z
    .locals 0

    .line 8
    instance-of p0, p0, Ljava/util/Map;

    return p0
.end method

.method public static isSignatureAssignable([Ljava/lang/Class;[Ljava/lang/Class;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;I)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p2, v0, :cond_0

    .line 4
    .line 5
    array-length v0, p0

    .line 6
    array-length v2, p1

    .line 7
    if-eq v0, v2, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    array-length v2, p0

    .line 12
    if-ge v0, v2, :cond_2

    .line 13
    .line 14
    aget-object v2, p0, v0

    .line 15
    .line 16
    aget-object v3, p1, v0

    .line 17
    .line 18
    invoke-static {v2, v3, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/Class;I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public static isSignatureAssignable([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/reflect/Type;",
            "I)Z"
        }
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-eq p2, v0, :cond_0

    .line 30
    array-length v0, p0

    array-length v2, p1

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    move v0, v1

    .line 31
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_2

    .line 32
    aget-object v2, p0, v0

    aget-object v3, p1, v0

    invoke-static {v2, v3, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    move-result v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static prettyName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-nez p0, :cond_0

    .line 219
    const-string p0, "null"

    return-object p0

    .line 220
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 221
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lbsh/Types;->prettyName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "[]"

    .line 223
    invoke-static {v0, p0, v1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static prettyName(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 218
    invoke-static {p0, v0}, Lbsh/Types;->prettyName(Ljava/lang/reflect/Type;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static prettyName(Ljava/lang/reflect/Type;Z)Ljava/lang/String;
    .locals 5

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {p0}, Lbsh/Types;->prettyName(Ljava/lang/Class;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    array-length v0, p1

    .line 24
    new-array v0, v0, [Ljava/lang/String;

    .line 25
    .line 26
    move v2, v1

    .line 27
    :goto_0
    array-length v3, p1

    .line 28
    if-ge v2, v3, :cond_1

    .line 29
    .line 30
    aget-object v3, p1, v2

    .line 31
    .line 32
    invoke-static {v3, v1}, Lbsh/Types;->prettyName(Ljava/lang/reflect/Type;Z)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    aput-object v3, v0, v2

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lbsh/Types;->prettyName(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string p1, ", "

    .line 50
    .line 51
    invoke-static {p1, v0}, Ljava/lang/String;->join(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v0, "<"

    .line 56
    .line 57
    const-string v1, ">"

    .line 58
    .line 59
    invoke-static {p0, v0, p1, v1}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 65
    .line 66
    const-class v2, Ljava/lang/Object;

    .line 67
    .line 68
    const-string v3, " & "

    .line 69
    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    array-length p1, v0

    .line 81
    const/4 v4, 0x1

    .line 82
    if-ne p1, v4, :cond_3

    .line 83
    .line 84
    aget-object p1, v0, v1

    .line 85
    .line 86
    if-ne p1, v2, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    array-length p1, v0

    .line 90
    new-array p1, p1, [Ljava/lang/String;

    .line 91
    .line 92
    :goto_1
    array-length v2, v0

    .line 93
    if-ge v1, v2, :cond_4

    .line 94
    .line 95
    aget-object v2, v0, v1

    .line 96
    .line 97
    invoke-static {v2}, Lbsh/Types;->prettyName(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    aput-object v2, p1, v1

    .line 102
    .line 103
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {v3, p1}, Ljava/lang/String;->join(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const-string v0, " extends "

    .line 115
    .line 116
    invoke-static {p0, v0, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_6
    instance-of p1, p0, Ljava/lang/reflect/WildcardType;

    .line 127
    .line 128
    if-eqz p1, :cond_b

    .line 129
    .line 130
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 131
    .line 132
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    aget-object v0, p1, v1

    .line 137
    .line 138
    if-eq v0, v2, :cond_8

    .line 139
    .line 140
    array-length p0, p1

    .line 141
    new-array p0, p0, [Ljava/lang/String;

    .line 142
    .line 143
    :goto_3
    array-length v0, p1

    .line 144
    if-ge v1, v0, :cond_7

    .line 145
    .line 146
    aget-object v0, p1, v1

    .line 147
    .line 148
    invoke-static {v0}, Lbsh/Types;->prettyName(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    aput-object v0, p0, v1

    .line 153
    .line 154
    add-int/lit8 v1, v1, 0x1

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_7
    invoke-static {v3, p0}, Ljava/lang/String;->join(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    const-string p1, "? extends "

    .line 162
    .line 163
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :cond_8
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    array-length p1, p0

    .line 173
    if-eqz p1, :cond_a

    .line 174
    .line 175
    array-length p1, p0

    .line 176
    new-array p1, p1, [Ljava/lang/String;

    .line 177
    .line 178
    :goto_4
    array-length v0, p0

    .line 179
    if-ge v1, v0, :cond_9

    .line 180
    .line 181
    aget-object v0, p0, v1

    .line 182
    .line 183
    invoke-static {v0}, Lbsh/Types;->prettyName(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    aput-object v0, p1, v1

    .line 188
    .line 189
    add-int/lit8 v1, v1, 0x1

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_9
    invoke-static {v3, p1}, Ljava/lang/String;->join(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    const-string p1, "? super "

    .line 197
    .line 198
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :cond_a
    const-string p0, "?"

    .line 204
    .line 205
    return-object p0

    .line 206
    :cond_b
    if-nez p0, :cond_c

    .line 207
    .line 208
    const-string p0, "null"

    .line 209
    .line 210
    return-object p0

    .line 211
    :cond_c
    const-string p0, "Can\'t return a pretty name because the type is unknown!"

    .line 212
    .line 213
    invoke-static {p0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const/4 p0, 0x0

    .line 217
    return-object p0
.end method

.method public static prettyNames([Ljava/lang/reflect/Type;)[Ljava/lang/String;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p0

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    aget-object v2, p0, v1

    .line 9
    .line 10
    invoke-static {v2}, Lbsh/Types;->prettyName(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    aput-object v2, v0, v1

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object v0
.end method
