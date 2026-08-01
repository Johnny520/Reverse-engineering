.class public abstract enum Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "ConstantPoolWrapper"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$WrappingArgumentProvider;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

.field public static final enum BOOLEAN:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

.field public static final enum BYTE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

.field public static final enum CHARACTER:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

.field public static final enum LONG:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

.field public static final enum SHORT:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;


# instance fields
.field private final primitiveType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final wrapperType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$1;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    const-class v2, Ljava/lang/Boolean;

    .line 6
    .line 7
    const-string v3, "BOOLEAN"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$1;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->BOOLEAN:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 14
    .line 15
    new-instance v1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$2;

    .line 16
    .line 17
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    const-class v3, Ljava/lang/Byte;

    .line 20
    .line 21
    const-string v5, "BYTE"

    .line 22
    .line 23
    const/4 v6, 0x1

    .line 24
    invoke-direct {v1, v5, v6, v2, v3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$2;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->BYTE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 28
    .line 29
    new-instance v2, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$3;

    .line 30
    .line 31
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    const-class v5, Ljava/lang/Short;

    .line 34
    .line 35
    const-string v7, "SHORT"

    .line 36
    .line 37
    const/4 v8, 0x2

    .line 38
    invoke-direct {v2, v7, v8, v3, v5}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$3;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    sput-object v2, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->SHORT:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 42
    .line 43
    new-instance v3, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$4;

    .line 44
    .line 45
    sget-object v5, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    const-class v7, Ljava/lang/Character;

    .line 48
    .line 49
    const-string v9, "CHARACTER"

    .line 50
    .line 51
    const/4 v10, 0x3

    .line 52
    invoke-direct {v3, v9, v10, v5, v7}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$4;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;)V

    .line 53
    .line 54
    .line 55
    sput-object v3, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->CHARACTER:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 56
    .line 57
    new-instance v5, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$5;

    .line 58
    .line 59
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    const-class v9, Ljava/lang/Integer;

    .line 62
    .line 63
    const-string v11, "INTEGER"

    .line 64
    .line 65
    const/4 v12, 0x4

    .line 66
    invoke-direct {v5, v11, v12, v7, v9}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$5;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;)V

    .line 67
    .line 68
    .line 69
    sput-object v5, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->INTEGER:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 70
    .line 71
    new-instance v7, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$6;

    .line 72
    .line 73
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    const-class v11, Ljava/lang/Long;

    .line 76
    .line 77
    const-string v13, "LONG"

    .line 78
    .line 79
    const/4 v14, 0x5

    .line 80
    invoke-direct {v7, v13, v14, v9, v11}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$6;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;)V

    .line 81
    .line 82
    .line 83
    sput-object v7, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->LONG:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 84
    .line 85
    new-instance v9, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$7;

    .line 86
    .line 87
    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    const-class v13, Ljava/lang/Float;

    .line 90
    .line 91
    const-string v15, "FLOAT"

    .line 92
    .line 93
    move/from16 v16, v4

    .line 94
    .line 95
    const/4 v4, 0x6

    .line 96
    invoke-direct {v9, v15, v4, v11, v13}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;)V

    .line 97
    .line 98
    .line 99
    sput-object v9, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->FLOAT:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 100
    .line 101
    new-instance v11, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$8;

    .line 102
    .line 103
    sget-object v13, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    const-class v15, Ljava/lang/Double;

    .line 106
    .line 107
    move/from16 v17, v4

    .line 108
    .line 109
    const-string v4, "DOUBLE"

    .line 110
    .line 111
    move/from16 v18, v6

    .line 112
    .line 113
    const/4 v6, 0x7

    .line 114
    invoke-direct {v11, v4, v6, v13, v15}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$8;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;)V

    .line 115
    .line 116
    .line 117
    sput-object v11, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->DOUBLE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 118
    .line 119
    const/16 v4, 0x8

    .line 120
    .line 121
    new-array v4, v4, [Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 122
    .line 123
    aput-object v0, v4, v16

    .line 124
    .line 125
    aput-object v1, v4, v18

    .line 126
    .line 127
    aput-object v2, v4, v8

    .line 128
    .line 129
    aput-object v3, v4, v10

    .line 130
    .line 131
    aput-object v5, v4, v12

    .line 132
    .line 133
    aput-object v7, v4, v14

    .line 134
    .line 135
    aput-object v9, v4, v17

    .line 136
    .line 137
    aput-object v11, v4, v6

    .line 138
    .line 139
    sput-object v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->$VALUES:[Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 140
    .line 141
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->primitiveType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    invoke-static {p4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->wrapperType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/InvokeDynamic$1;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic access$100(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->primitiveType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->wrapperType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public static of(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->BOOLEAN:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->make(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v0, p0, Ljava/lang/Byte;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->BYTE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->make(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p0, Ljava/lang/Short;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    sget-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->SHORT:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->make(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    instance-of v0, p0, Ljava/lang/Character;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    sget-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->CHARACTER:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->make(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_3
    instance-of v0, p0, Ljava/lang/Integer;

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    sget-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->INTEGER:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->make(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_4
    instance-of v0, p0, Ljava/lang/Long;

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    sget-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->LONG:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->make(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_5
    instance-of v0, p0, Ljava/lang/Float;

    .line 68
    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    sget-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->FLOAT:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->make(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_6
    instance-of v0, p0, Ljava/lang/Double;

    .line 79
    .line 80
    if-eqz v0, :cond_7

    .line 81
    .line 82
    sget-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->DOUBLE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->make(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_7
    instance-of v0, p0, Ljava/lang/String;

    .line 90
    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForStringConstant;

    .line 94
    .line 95
    check-cast p0, Ljava/lang/String;

    .line 96
    .line 97
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForStringConstant;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_8
    instance-of v0, p0, Ljava/lang/Class;

    .line 102
    .line 103
    if-eqz v0, :cond_9

    .line 104
    .line 105
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant;

    .line 106
    .line 107
    check-cast p0, Ljava/lang/Class;

    .line 108
    .line 109
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_9
    instance-of v0, p0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 118
    .line 119
    if-eqz v0, :cond_a

    .line 120
    .line 121
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant;

    .line 122
    .line 123
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 124
    .line 125
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_a
    instance-of v0, p0, Ljava/lang/Enum;

    .line 130
    .line 131
    if-eqz v0, :cond_b

    .line 132
    .line 133
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue;

    .line 134
    .line 135
    new-instance v1, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;

    .line 136
    .line 137
    check-cast p0, Ljava/lang/Enum;

    .line 138
    .line 139
    invoke-direct {v1, p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;-><init>(Ljava/lang/Enum;)V

    .line 140
    .line 141
    .line 142
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue;-><init>(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)V

    .line 143
    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_b
    instance-of v0, p0, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 147
    .line 148
    if-eqz v0, :cond_c

    .line 149
    .line 150
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue;

    .line 151
    .line 152
    check-cast p0, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 153
    .line 154
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue;-><init>(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)V

    .line 155
    .line 156
    .line 157
    return-object v0

    .line 158
    :cond_c
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 159
    .line 160
    invoke-virtual {v0, p0}, Lnet/bytebuddy/utility/JavaType;->isInstance(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_d

    .line 165
    .line 166
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant;

    .line 167
    .line 168
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant;-><init>(Lnet/bytebuddy/utility/ConstantValue;)V

    .line 173
    .line 174
    .line 175
    return-object v0

    .line 176
    :cond_d
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

    .line 177
    .line 178
    invoke-virtual {v0, p0}, Lnet/bytebuddy/utility/JavaType;->isInstance(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_e

    .line 183
    .line 184
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant;

    .line 185
    .line 186
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant;-><init>(Lnet/bytebuddy/utility/ConstantValue;)V

    .line 191
    .line 192
    .line 193
    return-object v0

    .line 194
    :cond_e
    instance-of v0, p0, Lnet/bytebuddy/utility/JavaConstant;

    .line 195
    .line 196
    if-eqz v0, :cond_f

    .line 197
    .line 198
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant;

    .line 199
    .line 200
    check-cast p0, Lnet/bytebuddy/utility/JavaConstant;

    .line 201
    .line 202
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant;-><init>(Lnet/bytebuddy/utility/ConstantValue;)V

    .line 203
    .line 204
    .line 205
    return-object v0

    .line 206
    :cond_f
    invoke-static {p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForInstance;->of(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->$VALUES:[Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract make(Ljava/lang/Object;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;
.end method
