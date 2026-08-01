.class public final enum Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Sort"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum ANNOTATION:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum ARRAY:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum BOOLEAN:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum BYTE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum CHARACTER:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum DOUBLE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum ENUMERATION:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum FLOAT:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum INTEGER:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum LONG:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum NONE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum SHORT:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum STRING:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

.field public static final enum TYPE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;


# instance fields
.field private final tag:I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 2
    .line 3
    const/16 v1, 0x5a

    .line 4
    .line 5
    const-string v2, "BOOLEAN"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->BOOLEAN:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/16 v4, 0x42

    .line 17
    .line 18
    const-string v5, "BYTE"

    .line 19
    .line 20
    invoke-direct {v1, v5, v2, v4}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->BYTE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 24
    .line 25
    new-instance v2, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    const/16 v5, 0x53

    .line 29
    .line 30
    const-string v6, "SHORT"

    .line 31
    .line 32
    invoke-direct {v2, v6, v4, v5}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->SHORT:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 36
    .line 37
    new-instance v4, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 38
    .line 39
    const/4 v5, 0x3

    .line 40
    const/16 v6, 0x43

    .line 41
    .line 42
    const-string v7, "CHARACTER"

    .line 43
    .line 44
    invoke-direct {v4, v7, v5, v6}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->CHARACTER:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 48
    .line 49
    move-object v5, v4

    .line 50
    new-instance v4, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 51
    .line 52
    const/4 v6, 0x4

    .line 53
    const/16 v7, 0x49

    .line 54
    .line 55
    const-string v8, "INTEGER"

    .line 56
    .line 57
    invoke-direct {v4, v8, v6, v7}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 58
    .line 59
    .line 60
    sput-object v4, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->INTEGER:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 61
    .line 62
    move-object v6, v5

    .line 63
    new-instance v5, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 64
    .line 65
    const/4 v7, 0x5

    .line 66
    const/16 v8, 0x4a

    .line 67
    .line 68
    const-string v9, "LONG"

    .line 69
    .line 70
    invoke-direct {v5, v9, v7, v8}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 71
    .line 72
    .line 73
    sput-object v5, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->LONG:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 74
    .line 75
    move-object v7, v6

    .line 76
    new-instance v6, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 77
    .line 78
    const/4 v8, 0x6

    .line 79
    const/16 v9, 0x46

    .line 80
    .line 81
    const-string v10, "FLOAT"

    .line 82
    .line 83
    invoke-direct {v6, v10, v8, v9}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 84
    .line 85
    .line 86
    sput-object v6, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->FLOAT:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 87
    .line 88
    move-object v8, v7

    .line 89
    new-instance v7, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 90
    .line 91
    const/4 v9, 0x7

    .line 92
    const/16 v10, 0x44

    .line 93
    .line 94
    const-string v11, "DOUBLE"

    .line 95
    .line 96
    invoke-direct {v7, v11, v9, v10}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 97
    .line 98
    .line 99
    sput-object v7, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->DOUBLE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 100
    .line 101
    move-object v9, v8

    .line 102
    new-instance v8, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 103
    .line 104
    const/16 v10, 0x8

    .line 105
    .line 106
    const/16 v11, 0x73

    .line 107
    .line 108
    const-string v12, "STRING"

    .line 109
    .line 110
    invoke-direct {v8, v12, v10, v11}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 111
    .line 112
    .line 113
    sput-object v8, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->STRING:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 114
    .line 115
    move-object v10, v9

    .line 116
    new-instance v9, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 117
    .line 118
    const/16 v11, 0x9

    .line 119
    .line 120
    const/16 v12, 0x63

    .line 121
    .line 122
    const-string v13, "TYPE"

    .line 123
    .line 124
    invoke-direct {v9, v13, v11, v12}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 125
    .line 126
    .line 127
    sput-object v9, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->TYPE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 128
    .line 129
    move-object v11, v10

    .line 130
    new-instance v10, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 131
    .line 132
    const/16 v12, 0xa

    .line 133
    .line 134
    const/16 v13, 0x65

    .line 135
    .line 136
    const-string v14, "ENUMERATION"

    .line 137
    .line 138
    invoke-direct {v10, v14, v12, v13}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 139
    .line 140
    .line 141
    sput-object v10, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->ENUMERATION:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 142
    .line 143
    move-object v12, v11

    .line 144
    new-instance v11, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 145
    .line 146
    const/16 v13, 0xb

    .line 147
    .line 148
    const/16 v14, 0x40

    .line 149
    .line 150
    const-string v15, "ANNOTATION"

    .line 151
    .line 152
    invoke-direct {v11, v15, v13, v14}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 153
    .line 154
    .line 155
    sput-object v11, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->ANNOTATION:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 156
    .line 157
    move-object v13, v12

    .line 158
    new-instance v12, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 159
    .line 160
    const/16 v14, 0xc

    .line 161
    .line 162
    const/16 v15, 0x5b

    .line 163
    .line 164
    const-string v3, "ARRAY"

    .line 165
    .line 166
    invoke-direct {v12, v3, v14, v15}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 167
    .line 168
    .line 169
    sput-object v12, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->ARRAY:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 170
    .line 171
    move-object v3, v13

    .line 172
    new-instance v13, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 173
    .line 174
    const-string v14, "NONE"

    .line 175
    .line 176
    const/16 v15, 0xd

    .line 177
    .line 178
    move-object/from16 v16, v0

    .line 179
    .line 180
    const/4 v0, 0x0

    .line 181
    invoke-direct {v13, v14, v15, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;-><init>(Ljava/lang/String;II)V

    .line 182
    .line 183
    .line 184
    sput-object v13, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->NONE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 185
    .line 186
    move-object/from16 v0, v16

    .line 187
    .line 188
    filled-new-array/range {v0 .. v13}, [Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    sput-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->$VALUES:[Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 193
    .line 194
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->tag:I

    .line 5
    .line 6
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->BOOLEAN:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->BYTE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->SHORT:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->CHARACTER:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->INTEGER:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->LONG:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->FLOAT:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->DOUBLE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_7
    const-class v0, Ljava/lang/String;

    .line 90
    .line 91
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8

    .line 96
    .line 97
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->STRING:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_8
    const-class v0, Ljava/lang/Class;

    .line 101
    .line 102
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_9

    .line 107
    .line 108
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->TYPE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_9
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfEnumeration;->isEnum()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_a

    .line 116
    .line 117
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->ENUMERATION:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_a
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isAnnotation()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_b

    .line 125
    .line 126
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->ANNOTATION:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 127
    .line 128
    return-object p0

    .line 129
    :cond_b
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_c

    .line 134
    .line 135
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->ARRAY:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 136
    .line 137
    return-object p0

    .line 138
    :cond_c
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->NONE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 139
    .line 140
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->$VALUES:[Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getTag()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->tag:I

    .line 2
    .line 3
    return p0
.end method

.method public isDefined()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->NONE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method
