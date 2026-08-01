.class public final enum Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ForDefaultValue"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfNonPrimitiveArray;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;",
        ">;",
        "Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum BOOLEAN:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum BOOLEAN_REVERSE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum BYTE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum CHARACTER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum DOUBLE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum FLOAT:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum INTEGER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum LONG:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum REFERENCE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum SHORT:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

.field public static final enum VOID:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;


# instance fields
.field private final load:I

.field private final returned:I

.field private final size:I

.field private final value:Ljava/lang/Object;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    new-instance v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 2
    .line 3
    const/16 v5, 0xb1

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const-string v1, "VOID"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->VOID:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 15
    .line 16
    new-instance v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 17
    .line 18
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    const/16 v6, 0xac

    .line 21
    .line 22
    const/4 v7, 0x1

    .line 23
    const-string v2, "BOOLEAN"

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v5, 0x3

    .line 27
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->BOOLEAN:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 31
    .line 32
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 33
    .line 34
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    const/16 v7, 0xac

    .line 37
    .line 38
    const/4 v8, 0x1

    .line 39
    const-string v3, "BOOLEAN_REVERSE"

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    const/4 v6, 0x4

    .line 43
    invoke-direct/range {v2 .. v8}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 44
    .line 45
    .line 46
    sput-object v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->BOOLEAN_REVERSE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 47
    .line 48
    new-instance v3, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 49
    .line 50
    const/4 v10, 0x0

    .line 51
    invoke-static {v10}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const/16 v8, 0xac

    .line 56
    .line 57
    const/4 v9, 0x1

    .line 58
    const-string v4, "BYTE"

    .line 59
    .line 60
    const/4 v5, 0x3

    .line 61
    const/4 v7, 0x3

    .line 62
    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 63
    .line 64
    .line 65
    sput-object v3, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->BYTE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 66
    .line 67
    new-instance v4, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 68
    .line 69
    invoke-static {v10}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 70
    .line 71
    .line 72
    move-result-object v14

    .line 73
    const/16 v16, 0xac

    .line 74
    .line 75
    const/16 v17, 0x1

    .line 76
    .line 77
    const-string v12, "SHORT"

    .line 78
    .line 79
    const/4 v13, 0x4

    .line 80
    const/4 v15, 0x3

    .line 81
    move-object v11, v4

    .line 82
    invoke-direct/range {v11 .. v17}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 83
    .line 84
    .line 85
    sput-object v4, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->SHORT:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 86
    .line 87
    new-instance v5, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 88
    .line 89
    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 90
    .line 91
    .line 92
    move-result-object v14

    .line 93
    const-string v12, "CHARACTER"

    .line 94
    .line 95
    const/4 v13, 0x5

    .line 96
    move-object v11, v5

    .line 97
    invoke-direct/range {v11 .. v17}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 98
    .line 99
    .line 100
    sput-object v5, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->CHARACTER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 101
    .line 102
    new-instance v6, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 103
    .line 104
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v14

    .line 108
    const-string v12, "INTEGER"

    .line 109
    .line 110
    const/4 v13, 0x6

    .line 111
    move-object v11, v6

    .line 112
    invoke-direct/range {v11 .. v17}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 113
    .line 114
    .line 115
    sput-object v6, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->INTEGER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 116
    .line 117
    new-instance v7, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 118
    .line 119
    const-wide/16 v8, 0x0

    .line 120
    .line 121
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    const/16 v12, 0xad

    .line 126
    .line 127
    const/4 v13, 0x2

    .line 128
    const-string v8, "LONG"

    .line 129
    .line 130
    const/4 v9, 0x7

    .line 131
    const/16 v11, 0x9

    .line 132
    .line 133
    invoke-direct/range {v7 .. v13}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 134
    .line 135
    .line 136
    sput-object v7, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->LONG:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 137
    .line 138
    new-instance v8, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 139
    .line 140
    const/4 v9, 0x0

    .line 141
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    const/16 v13, 0xae

    .line 146
    .line 147
    const/4 v14, 0x1

    .line 148
    const-string v9, "FLOAT"

    .line 149
    .line 150
    const/16 v10, 0x8

    .line 151
    .line 152
    const/16 v12, 0xb

    .line 153
    .line 154
    invoke-direct/range {v8 .. v14}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 155
    .line 156
    .line 157
    sput-object v8, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->FLOAT:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 158
    .line 159
    new-instance v9, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 160
    .line 161
    const-wide/16 v10, 0x0

    .line 162
    .line 163
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    const/16 v14, 0xaf

    .line 168
    .line 169
    const/4 v15, 0x2

    .line 170
    const-string v10, "DOUBLE"

    .line 171
    .line 172
    const/16 v11, 0x9

    .line 173
    .line 174
    const/16 v13, 0xe

    .line 175
    .line 176
    invoke-direct/range {v9 .. v15}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 177
    .line 178
    .line 179
    sput-object v9, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->DOUBLE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 180
    .line 181
    new-instance v10, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 182
    .line 183
    const/16 v15, 0xb0

    .line 184
    .line 185
    const/16 v16, 0x1

    .line 186
    .line 187
    const-string v11, "REFERENCE"

    .line 188
    .line 189
    const/16 v12, 0xa

    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    const/4 v14, 0x1

    .line 193
    invoke-direct/range {v10 .. v16}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;-><init>(Ljava/lang/String;ILjava/lang/Object;III)V

    .line 194
    .line 195
    .line 196
    sput-object v10, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->REFERENCE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 197
    .line 198
    filled-new-array/range {v0 .. v10}, [Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    sput-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->$VALUES:[Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 203
    .line 204
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Object;III)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "III)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->value:Ljava/lang/Object;

    .line 5
    .line 6
    iput p4, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->load:I

    .line 7
    .line 8
    iput p5, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->returned:I

    .line 9
    .line 10
    iput p6, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->size:I

    .line 11
    .line 12
    return-void
.end method

.method public static of(Ljava/lang/Class;)Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->VOID:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->BOOLEAN:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    if-ne p0, v1, :cond_2

    .line 18
    .line 19
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->BYTE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne p0, v2, :cond_3

    .line 25
    .line 26
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->SHORT:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_3
    sget-object v3, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    if-ne p0, v3, :cond_4

    .line 32
    .line 33
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->CHARACTER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_4
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    if-ne p0, v4, :cond_5

    .line 39
    .line 40
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->INTEGER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_5
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    if-ne p0, v5, :cond_6

    .line 46
    .line 47
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->LONG:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_6
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    if-ne p0, v6, :cond_7

    .line 53
    .line 54
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->FLOAT:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_7
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    if-ne p0, v7, :cond_8

    .line 60
    .line 61
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->DOUBLE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-eqz v8, :cond_11

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    if-ne v8, v0, :cond_9

    .line 75
    .line 76
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;->BOOLEAN:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v0, v1, :cond_a

    .line 84
    .line 85
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;->BYTE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-ne v0, v2, :cond_b

    .line 93
    .line 94
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;->SHORT:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-ne v0, v3, :cond_c

    .line 102
    .line 103
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;->CHARACTER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;

    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-ne v0, v4, :cond_d

    .line 111
    .line 112
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;->INTEGER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;

    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_d
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-ne v0, v5, :cond_e

    .line 120
    .line 121
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;->LONG:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;

    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_e
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-ne v0, v6, :cond_f

    .line 129
    .line 130
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;->FLOAT:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_f
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-ne v0, v7, :cond_10

    .line 138
    .line 139
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;->DOUBLE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray;

    .line 140
    .line 141
    return-object p0

    .line 142
    :cond_10
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue$OfNonPrimitiveArray;->of(Ljava/lang/Class;)Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :cond_11
    sget-object p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->REFERENCE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 152
    .line 153
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->$VALUES:[Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/lang/reflect/Method;)I
    .locals 0

    .line 1
    iget p2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->load:I

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget p2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->returned:I

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 11
    .line 12
    .line 13
    iget p0, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->size:I

    .line 14
    .line 15
    return p0
.end method

.method public invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->value:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method
