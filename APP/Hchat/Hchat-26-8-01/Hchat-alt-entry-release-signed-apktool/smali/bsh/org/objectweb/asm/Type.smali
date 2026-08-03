.class public Lbsh/org/objectweb/asm/Type;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final ARRAY:I = 0x9

.field public static final BOOLEAN:I = 0x1

.field public static final BOOLEAN_TYPE:Lbsh/org/objectweb/asm/Type;

.field public static final BYTE:I = 0x3

.field public static final BYTE_TYPE:Lbsh/org/objectweb/asm/Type;

.field public static final CHAR:I = 0x2

.field public static final CHAR_TYPE:Lbsh/org/objectweb/asm/Type;

.field public static final DOUBLE:I = 0x8

.field public static final DOUBLE_TYPE:Lbsh/org/objectweb/asm/Type;

.field public static final FLOAT:I = 0x6

.field public static final FLOAT_TYPE:Lbsh/org/objectweb/asm/Type;

.field public static final INT:I = 0x5

.field private static final INTERNAL:I = 0xc

.field public static final INT_TYPE:Lbsh/org/objectweb/asm/Type;

.field public static final LONG:I = 0x7

.field public static final LONG_TYPE:Lbsh/org/objectweb/asm/Type;

.field public static final METHOD:I = 0xb

.field public static final OBJECT:I = 0xa

.field private static final PRIMITIVE_DESCRIPTORS:Ljava/lang/String; = "VZCBSIFJD"

.field public static final SHORT:I = 0x4

.field public static final SHORT_TYPE:Lbsh/org/objectweb/asm/Type;

.field public static final VOID:I

.field public static final VOID_TYPE:Lbsh/org/objectweb/asm/Type;


# instance fields
.field private final sort:I

.field private final valueBegin:I

.field private final valueBuffer:Ljava/lang/String;

.field private final valueEnd:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "VZCBSIFJD"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v1, v3}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lbsh/org/objectweb/asm/Type;->VOID_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 11
    .line 12
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {v0, v3, v2, v3, v1}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lbsh/org/objectweb/asm/Type;->BOOLEAN_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 19
    .line 20
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    invoke-direct {v0, v1, v2, v1, v3}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lbsh/org/objectweb/asm/Type;->CHAR_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 27
    .line 28
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-direct {v0, v3, v2, v3, v1}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lbsh/org/objectweb/asm/Type;->BYTE_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 35
    .line 36
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 37
    .line 38
    const/4 v3, 0x5

    .line 39
    invoke-direct {v0, v1, v2, v1, v3}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lbsh/org/objectweb/asm/Type;->SHORT_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 43
    .line 44
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 45
    .line 46
    const/4 v1, 0x6

    .line 47
    invoke-direct {v0, v3, v2, v3, v1}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lbsh/org/objectweb/asm/Type;->INT_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 51
    .line 52
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 53
    .line 54
    const/4 v3, 0x7

    .line 55
    invoke-direct {v0, v1, v2, v1, v3}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lbsh/org/objectweb/asm/Type;->FLOAT_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 59
    .line 60
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 61
    .line 62
    const/16 v1, 0x8

    .line 63
    .line 64
    invoke-direct {v0, v3, v2, v3, v1}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lbsh/org/objectweb/asm/Type;->LONG_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 68
    .line 69
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 70
    .line 71
    const/16 v3, 0x9

    .line 72
    .line 73
    invoke-direct {v0, v1, v2, v1, v3}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 74
    .line 75
    .line 76
    sput-object v0, Lbsh/org/objectweb/asm/Type;->DOUBLE_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 77
    .line 78
    return-void
.end method

.method private constructor <init>(ILjava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lbsh/org/objectweb/asm/Type;->sort:I

    .line 5
    .line 6
    iput-object p2, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    .line 9
    .line 10
    iput p4, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    .line 11
    .line 12
    return-void
.end method

.method private appendDescriptor(Ljava/lang/StringBuilder;)V
    .locals 3

    .line 133
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->sort:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 134
    iget-object v0, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    iget v1, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    const/16 v1, 0xc

    if-ne v0, v1, :cond_1

    const/16 v0, 0x4c

    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 136
    iget-object v0, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    iget v1, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    invoke-virtual {p1, v0, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    const/16 v0, 0x3b

    .line 137
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 138
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    iget v1, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    invoke-virtual {p1, v0, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static appendDescriptor(Ljava/lang/StringBuilder;Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x5b

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_a

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    const/16 p1, 0x49

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    if-ne p1, v0, :cond_2

    .line 33
    .line 34
    const/16 p1, 0x56

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne p1, v0, :cond_3

    .line 40
    .line 41
    const/16 p1, 0x5a

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    if-ne p1, v0, :cond_4

    .line 47
    .line 48
    const/16 p1, 0x42

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    if-ne p1, v0, :cond_5

    .line 54
    .line 55
    const/16 p1, 0x43

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    if-ne p1, v0, :cond_6

    .line 61
    .line 62
    const/16 p1, 0x53

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    if-ne p1, v0, :cond_7

    .line 68
    .line 69
    const/16 p1, 0x44

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_7
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    if-ne p1, v0, :cond_8

    .line 75
    .line 76
    const/16 p1, 0x46

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_8
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    if-ne p1, v0, :cond_9

    .line 82
    .line 83
    const/16 p1, 0x4a

    .line 84
    .line 85
    :goto_1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_9
    new-instance p0, Ljava/lang/AssertionError;

    .line 90
    .line 91
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 92
    .line 93
    .line 94
    throw p0

    .line 95
    :cond_a
    const/16 v0, 0x4c

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    const/4 v1, 0x0

    .line 109
    :goto_2
    if-ge v1, v0, :cond_c

    .line 110
    .line 111
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    const/16 v3, 0x2e

    .line 116
    .line 117
    if-ne v2, v3, :cond_b

    .line 118
    .line 119
    const/16 v2, 0x2f

    .line 120
    .line 121
    :cond_b
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    add-int/lit8 v1, v1, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_c
    const/16 p1, 0x3b

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public static getArgumentTypes(Ljava/lang/String;)[Lbsh/org/objectweb/asm/Type;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    move v3, v0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    const/16 v5, 0x3b

    .line 10
    .line 11
    const/16 v6, 0x4c

    .line 12
    .line 13
    const/16 v7, 0x5b

    .line 14
    .line 15
    const/16 v8, 0x29

    .line 16
    .line 17
    if-eq v4, v8, :cond_3

    .line 18
    .line 19
    :goto_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ne v4, v7, :cond_0

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v4, v2, 0x1

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-ne v2, v6, :cond_1

    .line 35
    .line 36
    :goto_2
    add-int/lit8 v2, v4, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eq v4, v5, :cond_2

    .line 43
    .line 44
    move v4, v2

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    move v2, v4

    .line 47
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    new-array v2, v3, [Lbsh/org/objectweb/asm/Type;

    .line 51
    .line 52
    :goto_3
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eq v3, v8, :cond_7

    .line 57
    .line 58
    move v3, v1

    .line 59
    :goto_4
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-ne v4, v7, :cond_4

    .line 64
    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    add-int/lit8 v4, v3, 0x1

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-ne v3, v6, :cond_5

    .line 75
    .line 76
    :goto_5
    add-int/lit8 v3, v4, 0x1

    .line 77
    .line 78
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eq v4, v5, :cond_6

    .line 83
    .line 84
    move v4, v3

    .line 85
    goto :goto_5

    .line 86
    :cond_5
    move v3, v4

    .line 87
    :cond_6
    add-int/lit8 v4, v0, 0x1

    .line 88
    .line 89
    invoke-static {p0, v1, v3}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;II)Lbsh/org/objectweb/asm/Type;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    aput-object v1, v2, v0

    .line 94
    .line 95
    move v1, v3

    .line 96
    move v0, v4

    .line 97
    goto :goto_3

    .line 98
    :cond_7
    return-object v2
.end method

.method public static getArgumentTypes(Ljava/lang/reflect/Method;)[Lbsh/org/objectweb/asm/Type;
    .locals 3

    .line 99
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p0

    .line 100
    array-length v0, p0

    new-array v0, v0, [Lbsh/org/objectweb/asm/Type;

    .line 101
    array-length v1, p0

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    .line 102
    aget-object v2, p0, v1

    invoke-static {v2}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/Class;)Lbsh/org/objectweb/asm/Type;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static getArgumentsAndReturnSizes(Ljava/lang/String;)I
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    move v2, v0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    const/16 v4, 0x29

    .line 9
    .line 10
    const/16 v5, 0x44

    .line 11
    .line 12
    const/16 v6, 0x4a

    .line 13
    .line 14
    if-eq v1, v4, :cond_5

    .line 15
    .line 16
    if-eq v1, v6, :cond_4

    .line 17
    .line 18
    if-ne v1, v5, :cond_0

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_0
    :goto_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v4, 0x5b

    .line 26
    .line 27
    if-ne v1, v4, :cond_1

    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v2, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/16 v4, 0x4c

    .line 39
    .line 40
    if-ne v2, v4, :cond_3

    .line 41
    .line 42
    :goto_2
    add-int/lit8 v2, v1, 0x1

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/16 v4, 0x3b

    .line 49
    .line 50
    if-eq v1, v4, :cond_2

    .line 51
    .line 52
    move v1, v2

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move v1, v2

    .line 55
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    move v2, v1

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    add-int/lit8 v3, v3, 0x2

    .line 62
    .line 63
    :goto_4
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    goto :goto_0

    .line 68
    :cond_5
    add-int/2addr v2, v0

    .line 69
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    const/16 v1, 0x56

    .line 74
    .line 75
    const/4 v2, 0x2

    .line 76
    if-ne p0, v1, :cond_6

    .line 77
    .line 78
    shl-int/lit8 p0, v3, 0x2

    .line 79
    .line 80
    return p0

    .line 81
    :cond_6
    if-eq p0, v6, :cond_7

    .line 82
    .line 83
    if-ne p0, v5, :cond_8

    .line 84
    .line 85
    :cond_7
    move v0, v2

    .line 86
    :cond_8
    shl-int/lit8 p0, v3, 0x2

    .line 87
    .line 88
    or-int/2addr p0, v0

    .line 89
    return p0
.end method

.method public static getConstructorDescriptor(Ljava/lang/reflect/Constructor;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
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
    const/16 v1, 0x28

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    array-length v2, p0

    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    aget-object v2, p0, v1

    .line 20
    .line 21
    invoke-static {v0, v2}, Lbsh/org/objectweb/asm/Type;->appendDescriptor(Ljava/lang/StringBuilder;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, ")V"

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static getDescriptor(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    invoke-static {v0, p0}, Lbsh/org/objectweb/asm/Type;->appendDescriptor(Ljava/lang/StringBuilder;Ljava/lang/Class;)V

    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getInternalName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0x2e

    .line 6
    .line 7
    const/16 v1, 0x2f

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static varargs getMethodDescriptor(Lbsh/org/objectweb/asm/Type;[Lbsh/org/objectweb/asm/Type;)Ljava/lang/String;
    .locals 3

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x28

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 46
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 47
    aget-object v2, p1, v1

    invoke-direct {v2, v0}, Lbsh/org/objectweb/asm/Type;->appendDescriptor(Ljava/lang/StringBuilder;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0x29

    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/Type;->appendDescriptor(Ljava/lang/StringBuilder;)V

    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x28

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    array-length v3, v1

    .line 17
    if-ge v2, v3, :cond_0

    .line 18
    .line 19
    aget-object v3, v1, v2

    .line 20
    .line 21
    invoke-static {v0, v3}, Lbsh/org/objectweb/asm/Type;->appendDescriptor(Ljava/lang/StringBuilder;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v1, 0x29

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {v0, p0}, Lbsh/org/objectweb/asm/Type;->appendDescriptor(Ljava/lang/StringBuilder;Ljava/lang/Class;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static varargs getMethodType(Lbsh/org/objectweb/asm/Type;[Lbsh/org/objectweb/asm/Type;)Lbsh/org/objectweb/asm/Type;
    .locals 0

    .line 14
    invoke-static {p0, p1}, Lbsh/org/objectweb/asm/Type;->getMethodDescriptor(Lbsh/org/objectweb/asm/Type;[Lbsh/org/objectweb/asm/Type;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method public static getMethodType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;
    .locals 4

    .line 1
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/16 v3, 0xb

    .line 9
    .line 10
    invoke-direct {v0, v3, p0, v1, v2}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static getObjectType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;
    .locals 4

    .line 1
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/16 v3, 0x5b

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    const/16 v2, 0x9

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v2, 0xc

    .line 16
    .line 17
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v0, v2, p0, v1, v3}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static getReturnType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    move v1, v0

    .line 3
    :cond_0
    :goto_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    const/16 v3, 0x29

    .line 8
    .line 9
    if-eq v2, v3, :cond_3

    .line 10
    .line 11
    :goto_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/16 v3, 0x5b

    .line 16
    .line 17
    if-ne v2, v3, :cond_1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/16 v3, 0x4c

    .line 29
    .line 30
    if-ne v1, v3, :cond_2

    .line 31
    .line 32
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/16 v3, 0x3b

    .line 39
    .line 40
    if-eq v2, v3, :cond_0

    .line 41
    .line 42
    move v2, v1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move v1, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    add-int/2addr v1, v0

    .line 47
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {p0, v1, v0}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;II)Lbsh/org/objectweb/asm/Type;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static getReturnType(Ljava/lang/reflect/Method;)Lbsh/org/objectweb/asm/Type;
    .locals 0

    .line 56
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/Class;)Lbsh/org/objectweb/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method public static getType(Ljava/lang/Class;)Lbsh/org/objectweb/asm/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lbsh/org/objectweb/asm/Type;"
        }
    .end annotation

    .line 105
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 106
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_0

    .line 107
    sget-object p0, Lbsh/org/objectweb/asm/Type;->INT_TYPE:Lbsh/org/objectweb/asm/Type;

    return-object p0

    .line 108
    :cond_0
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_1

    .line 109
    sget-object p0, Lbsh/org/objectweb/asm/Type;->VOID_TYPE:Lbsh/org/objectweb/asm/Type;

    return-object p0

    .line 110
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_2

    .line 111
    sget-object p0, Lbsh/org/objectweb/asm/Type;->BOOLEAN_TYPE:Lbsh/org/objectweb/asm/Type;

    return-object p0

    .line 112
    :cond_2
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_3

    .line 113
    sget-object p0, Lbsh/org/objectweb/asm/Type;->BYTE_TYPE:Lbsh/org/objectweb/asm/Type;

    return-object p0

    .line 114
    :cond_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_4

    .line 115
    sget-object p0, Lbsh/org/objectweb/asm/Type;->CHAR_TYPE:Lbsh/org/objectweb/asm/Type;

    return-object p0

    .line 116
    :cond_4
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_5

    .line 117
    sget-object p0, Lbsh/org/objectweb/asm/Type;->SHORT_TYPE:Lbsh/org/objectweb/asm/Type;

    return-object p0

    .line 118
    :cond_5
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_6

    .line 119
    sget-object p0, Lbsh/org/objectweb/asm/Type;->DOUBLE_TYPE:Lbsh/org/objectweb/asm/Type;

    return-object p0

    .line 120
    :cond_6
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_7

    .line 121
    sget-object p0, Lbsh/org/objectweb/asm/Type;->FLOAT_TYPE:Lbsh/org/objectweb/asm/Type;

    return-object p0

    .line 122
    :cond_7
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_8

    .line 123
    sget-object p0, Lbsh/org/objectweb/asm/Type;->LONG_TYPE:Lbsh/org/objectweb/asm/Type;

    return-object p0

    .line 124
    :cond_8
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 125
    :cond_9
    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method public static getType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;
    .locals 2

    const/4 v0, 0x0

    .line 128
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {p0, v0, v1}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;II)Lbsh/org/objectweb/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method private static getType(Ljava/lang/String;II)Lbsh/org/objectweb/asm/Type;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x28

    .line 6
    .line 7
    if-eq v0, v1, :cond_8

    .line 8
    .line 9
    const/16 v1, 0x46

    .line 10
    .line 11
    if-eq v0, v1, :cond_7

    .line 12
    .line 13
    const/16 v1, 0x4c

    .line 14
    .line 15
    if-eq v0, v1, :cond_6

    .line 16
    .line 17
    const/16 v1, 0x53

    .line 18
    .line 19
    if-eq v0, v1, :cond_5

    .line 20
    .line 21
    const/16 v1, 0x56

    .line 22
    .line 23
    if-eq v0, v1, :cond_4

    .line 24
    .line 25
    const/16 v1, 0x49

    .line 26
    .line 27
    if-eq v0, v1, :cond_3

    .line 28
    .line 29
    const/16 v1, 0x4a

    .line 30
    .line 31
    if-eq v0, v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x5a

    .line 34
    .line 35
    if-eq v0, v1, :cond_1

    .line 36
    .line 37
    const/16 v1, 0x5b

    .line 38
    .line 39
    if-eq v0, v1, :cond_0

    .line 40
    .line 41
    packed-switch v0, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lj8/o;->o()V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :pswitch_0
    sget-object p0, Lbsh/org/objectweb/asm/Type;->DOUBLE_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_1
    sget-object p0, Lbsh/org/objectweb/asm/Type;->CHAR_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_2
    sget-object p0, Lbsh/org/objectweb/asm/Type;->BYTE_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_0
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 59
    .line 60
    const/16 v1, 0x9

    .line 61
    .line 62
    invoke-direct {v0, v1, p0, p1, p2}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_1
    sget-object p0, Lbsh/org/objectweb/asm/Type;->BOOLEAN_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_2
    sget-object p0, Lbsh/org/objectweb/asm/Type;->LONG_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_3
    sget-object p0, Lbsh/org/objectweb/asm/Type;->INT_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_4
    sget-object p0, Lbsh/org/objectweb/asm/Type;->VOID_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    sget-object p0, Lbsh/org/objectweb/asm/Type;->SHORT_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_6
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 82
    .line 83
    add-int/lit8 p1, p1, 0x1

    .line 84
    .line 85
    add-int/lit8 p2, p2, -0x1

    .line 86
    .line 87
    const/16 v1, 0xa

    .line 88
    .line 89
    invoke-direct {v0, v1, p0, p1, p2}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_7
    sget-object p0, Lbsh/org/objectweb/asm/Type;->FLOAT_TYPE:Lbsh/org/objectweb/asm/Type;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_8
    new-instance v0, Lbsh/org/objectweb/asm/Type;

    .line 97
    .line 98
    const/16 v1, 0xb

    .line 99
    .line 100
    invoke-direct {v0, v1, p0, p1, p2}, Lbsh/org/objectweb/asm/Type;-><init>(ILjava/lang/String;II)V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getType(Ljava/lang/reflect/Constructor;)Lbsh/org/objectweb/asm/Type;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lbsh/org/objectweb/asm/Type;"
        }
    .end annotation

    .line 126
    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getConstructorDescriptor(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method public static getType(Ljava/lang/reflect/Method;)Lbsh/org/objectweb/asm/Type;
    .locals 0

    .line 127
    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lbsh/org/objectweb/asm/Type;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lbsh/org/objectweb/asm/Type;

    .line 12
    .line 13
    iget v1, p0, Lbsh/org/objectweb/asm/Type;->sort:I

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    const/16 v4, 0xc

    .line 18
    .line 19
    if-ne v1, v4, :cond_2

    .line 20
    .line 21
    move v1, v3

    .line 22
    :cond_2
    iget v5, p1, Lbsh/org/objectweb/asm/Type;->sort:I

    .line 23
    .line 24
    if-ne v5, v4, :cond_3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    move v3, v5

    .line 28
    :goto_0
    if-eq v1, v3, :cond_4

    .line 29
    .line 30
    return v2

    .line 31
    :cond_4
    iget v1, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    .line 32
    .line 33
    iget v3, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    .line 34
    .line 35
    iget v4, p1, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    .line 36
    .line 37
    iget v5, p1, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    .line 38
    .line 39
    sub-int v6, v3, v1

    .line 40
    .line 41
    sub-int/2addr v5, v4

    .line 42
    if-eq v6, v5, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    :goto_1
    if-ge v1, v3, :cond_7

    .line 46
    .line 47
    iget-object v5, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    iget-object v6, p1, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eq v5, v6, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_7
    return v0
.end method

.method public getArgumentTypes()[Lbsh/org/objectweb/asm/Type;
    .locals 1

    .line 103
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/Type;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbsh/org/objectweb/asm/Type;->getArgumentTypes(Ljava/lang/String;)[Lbsh/org/objectweb/asm/Type;

    move-result-object v0

    return-object v0
.end method

.method public getArgumentsAndReturnSizes()I
    .locals 1

    .line 90
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/Type;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbsh/org/objectweb/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->sort:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 9
    .line 10
    .line 11
    throw v0

    .line 12
    :pswitch_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    .line 13
    .line 14
    iget v1, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    .line 15
    .line 16
    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/16 v1, 0x2f

    .line 23
    .line 24
    const/16 v2, 0x2e

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/Type;->getElementType()Lbsh/org/objectweb/asm/Type;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Lbsh/org/objectweb/asm/Type;->getClassName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/Type;->getDimensions()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    :goto_0
    if-lez v1, :cond_0

    .line 49
    .line 50
    const-string v2, "[]"

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    add-int/lit8 v1, v1, -0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :pswitch_3
    const-string v0, "double"

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_4
    const-string v0, "long"

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_5
    const-string v0, "float"

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_6
    const-string v0, "int"

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_7
    const-string v0, "short"

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_8
    const-string v0, "byte"

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_9
    const-string v0, "char"

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_a
    const-string v0, "boolean"

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_b
    const-string v0, "void"

    .line 88
    .line 89
    return-object v0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public getDescriptor()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->sort:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    .line 8
    .line 9
    iget v1, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    iget-object v1, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    .line 23
    .line 24
    const/16 v2, 0xc

    .line 25
    .line 26
    if-ne v0, v2, :cond_1

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "L"

    .line 31
    .line 32
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    .line 36
    .line 37
    iget v3, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v1, 0x3b

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :cond_1
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    .line 53
    .line 54
    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
.end method

.method public getDimensions()I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    iget-object v1, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    .line 3
    .line 4
    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    .line 5
    .line 6
    add-int/2addr v2, v0

    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x5b

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return v0
.end method

.method public getElementType()Lbsh/org/objectweb/asm/Type;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/Type;->getDimensions()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    .line 6
    .line 7
    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    .line 8
    .line 9
    add-int/2addr v2, v0

    .line 10
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    .line 11
    .line 12
    invoke-static {v1, v2, v0}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;II)Lbsh/org/objectweb/asm/Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getInternalName()Ljava/lang/String;
    .locals 3

    .line 14
    iget-object v0, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    iget v1, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOpcode(I)I
    .locals 2

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    if-eq p1, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, 0x4f

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->sort:I

    .line 11
    .line 12
    const/16 v1, 0xac

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p1, Ljava/lang/AssertionError;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :pswitch_1
    const/16 v0, 0x15

    .line 30
    .line 31
    if-eq p1, v0, :cond_2

    .line 32
    .line 33
    const/16 v0, 0x36

    .line 34
    .line 35
    if-eq p1, v0, :cond_2

    .line 36
    .line 37
    if-ne p1, v1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_2
    :goto_0
    add-int/lit8 p1, p1, 0x4

    .line 47
    .line 48
    return p1

    .line 49
    :pswitch_2
    add-int/lit8 p1, p1, 0x3

    .line 50
    .line 51
    return p1

    .line 52
    :pswitch_3
    add-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    return p1

    .line 55
    :pswitch_4
    add-int/lit8 p1, p1, 0x2

    .line 56
    .line 57
    return p1

    .line 58
    :pswitch_5
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    const/16 p1, 0xb1

    .line 61
    .line 62
    return p1

    .line 63
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 64
    .line 65
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_4
    :goto_1
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->sort:I

    .line 70
    .line 71
    packed-switch v0, :pswitch_data_1

    .line 72
    .line 73
    .line 74
    new-instance p1, Ljava/lang/AssertionError;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :pswitch_6
    add-int/lit8 p1, p1, 0x4

    .line 81
    .line 82
    return p1

    .line 83
    :pswitch_7
    add-int/lit8 p1, p1, 0x3

    .line 84
    .line 85
    return p1

    .line 86
    :pswitch_8
    add-int/lit8 p1, p1, 0x1

    .line 87
    .line 88
    return p1

    .line 89
    :pswitch_9
    add-int/lit8 p1, p1, 0x2

    .line 90
    .line 91
    :pswitch_a
    return p1

    .line 92
    :pswitch_b
    add-int/lit8 p1, p1, 0x7

    .line 93
    .line 94
    return p1

    .line 95
    :pswitch_c
    add-int/lit8 p1, p1, 0x6

    .line 96
    .line 97
    return p1

    .line 98
    :pswitch_d
    add-int/lit8 p1, p1, 0x5

    .line 99
    .line 100
    return p1

    .line 101
    :pswitch_e
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 102
    .line 103
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_d
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_e
        :pswitch_6
    .end packed-switch
.end method

.method public getReturnType()Lbsh/org/objectweb/asm/Type;
    .locals 1

    .line 57
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/Type;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbsh/org/objectweb/asm/Type;->getReturnType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;

    move-result-object v0

    return-object v0
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->sort:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 9
    .line 10
    .line 11
    throw v0

    .line 12
    :pswitch_1
    const/4 v0, 0x2

    .line 13
    return v0

    .line 14
    :pswitch_2
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :pswitch_3
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public getSort()I
    .locals 2

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->sort:I

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v0, 0xa

    .line 8
    .line 9
    :cond_0
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->sort:I

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v0

    .line 11
    :goto_0
    mul-int/lit8 v1, v1, 0xd

    .line 12
    .line 13
    const/16 v2, 0x9

    .line 14
    .line 15
    if-lt v0, v2, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lbsh/org/objectweb/asm/Type;->valueBegin:I

    .line 18
    .line 19
    iget v2, p0, Lbsh/org/objectweb/asm/Type;->valueEnd:I

    .line 20
    .line 21
    :goto_1
    if-ge v0, v2, :cond_1

    .line 22
    .line 23
    iget-object v3, p0, Lbsh/org/objectweb/asm/Type;->valueBuffer:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    add-int/2addr v3, v1

    .line 30
    mul-int/lit8 v1, v3, 0x11

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
