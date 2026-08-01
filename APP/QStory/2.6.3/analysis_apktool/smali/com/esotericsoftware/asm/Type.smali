.class public Lcom/esotericsoftware/asm/Type;
.super Ljava/lang/Object;


# static fields
.field public static final ARRAY:I = 0x9

.field public static final BOOLEAN:I = 0x1

.field public static final BOOLEAN_TYPE:Lcom/esotericsoftware/asm/Type;

.field public static final BYTE:I = 0x3

.field public static final BYTE_TYPE:Lcom/esotericsoftware/asm/Type;

.field public static final CHAR:I = 0x2

.field public static final CHAR_TYPE:Lcom/esotericsoftware/asm/Type;

.field public static final DOUBLE:I = 0x8

.field public static final DOUBLE_TYPE:Lcom/esotericsoftware/asm/Type;

.field public static final FLOAT:I = 0x6

.field public static final FLOAT_TYPE:Lcom/esotericsoftware/asm/Type;

.field public static final INT:I = 0x5

.field public static final INT_TYPE:Lcom/esotericsoftware/asm/Type;

.field public static final LONG:I = 0x7

.field public static final LONG_TYPE:Lcom/esotericsoftware/asm/Type;

.field public static final METHOD:I = 0xb

.field public static final OBJECT:I = 0xa

.field public static final SHORT:I = 0x4

.field public static final SHORT_TYPE:Lcom/esotericsoftware/asm/Type;

.field public static final VOID:I

.field public static final VOID_TYPE:Lcom/esotericsoftware/asm/Type;


# instance fields
.field private final a:I

.field private final b:[C

.field private final c:I

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/esotericsoftware/asm/Type;->_clinit_()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/high16 v3, 0x56050000

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/esotericsoftware/asm/Type;->VOID_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 15
    .line 16
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 17
    .line 18
    const v1, 0x5a000501

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v4, v2, v1, v4}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcom/esotericsoftware/asm/Type;->BOOLEAN_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 25
    .line 26
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    const v3, 0x43000601

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/esotericsoftware/asm/Type;->CHAR_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 36
    .line 37
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const v3, 0x42000501

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lcom/esotericsoftware/asm/Type;->BYTE_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 47
    .line 48
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 49
    .line 50
    const/4 v1, 0x4

    .line 51
    const v3, 0x53000701

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lcom/esotericsoftware/asm/Type;->SHORT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 58
    .line 59
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 60
    .line 61
    const/4 v1, 0x5

    .line 62
    const v3, 0x49000001

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lcom/esotericsoftware/asm/Type;->INT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 69
    .line 70
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 71
    .line 72
    const/4 v1, 0x6

    .line 73
    const v3, 0x46020201

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcom/esotericsoftware/asm/Type;->FLOAT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 80
    .line 81
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 82
    .line 83
    const/4 v1, 0x7

    .line 84
    const v3, 0x4a010102    # 2113600.5f

    .line 85
    .line 86
    .line 87
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcom/esotericsoftware/asm/Type;->LONG_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 91
    .line 92
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 93
    .line 94
    const/16 v1, 0x8

    .line 95
    .line 96
    const v3, 0x44030302

    .line 97
    .line 98
    .line 99
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 100
    .line 101
    .line 102
    sput-object v0, Lcom/esotericsoftware/asm/Type;->DOUBLE_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 103
    .line 104
    return-void
.end method

.method private constructor <init>(I[CII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/esotericsoftware/asm/Type;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    .line 7
    .line 8
    iput p3, p0, Lcom/esotericsoftware/asm/Type;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/esotericsoftware/asm/Type;->d:I

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic _clinit_()V
    .locals 0

    .line 1
    return-void
.end method

.method private static a([CI)Lcom/esotericsoftware/asm/Type;
    .locals 6

    .line 1
    aget-char v0, p0, p1

    .line 2
    .line 3
    const/16 v1, 0x46

    .line 4
    .line 5
    if-eq v0, v1, :cond_a

    .line 6
    .line 7
    const/16 v1, 0x3b

    .line 8
    .line 9
    const/16 v2, 0x4c

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v0, v2, :cond_8

    .line 13
    .line 14
    const/16 v4, 0x53

    .line 15
    .line 16
    if-eq v0, v4, :cond_7

    .line 17
    .line 18
    const/16 v4, 0x56

    .line 19
    .line 20
    if-eq v0, v4, :cond_6

    .line 21
    .line 22
    const/16 v4, 0x49

    .line 23
    .line 24
    if-eq v0, v4, :cond_5

    .line 25
    .line 26
    const/16 v4, 0x4a

    .line 27
    .line 28
    if-eq v0, v4, :cond_4

    .line 29
    .line 30
    const/16 v4, 0x5a

    .line 31
    .line 32
    if-eq v0, v4, :cond_3

    .line 33
    .line 34
    const/16 v4, 0x5b

    .line 35
    .line 36
    if-eq v0, v4, :cond_0

    .line 37
    .line 38
    packed-switch v0, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 42
    .line 43
    array-length v1, p0

    .line 44
    sub-int/2addr v1, p1

    .line 45
    const/16 v2, 0xb

    .line 46
    .line 47
    invoke-direct {v0, v2, p0, p1, v1}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    sget-object p0, Lcom/esotericsoftware/asm/Type;->DOUBLE_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    sget-object p0, Lcom/esotericsoftware/asm/Type;->CHAR_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_2
    sget-object p0, Lcom/esotericsoftware/asm/Type;->BYTE_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_0
    move v0, v3

    .line 61
    :goto_0
    add-int v5, p1, v0

    .line 62
    .line 63
    aget-char v5, p0, v5

    .line 64
    .line 65
    if-ne v5, v4, :cond_1

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    if-ne v5, v2, :cond_2

    .line 71
    .line 72
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    add-int v2, p1, v0

    .line 75
    .line 76
    aget-char v2, p0, v2

    .line 77
    .line 78
    if-eq v2, v1, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    new-instance v1, Lcom/esotericsoftware/asm/Type;

    .line 82
    .line 83
    const/16 v2, 0x9

    .line 84
    .line 85
    add-int/2addr v0, v3

    .line 86
    invoke-direct {v1, v2, p0, p1, v0}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_3
    sget-object p0, Lcom/esotericsoftware/asm/Type;->BOOLEAN_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_4
    sget-object p0, Lcom/esotericsoftware/asm/Type;->LONG_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_5
    sget-object p0, Lcom/esotericsoftware/asm/Type;->INT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_6
    sget-object p0, Lcom/esotericsoftware/asm/Type;->VOID_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_7
    sget-object p0, Lcom/esotericsoftware/asm/Type;->SHORT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_8
    move v0, v3

    .line 106
    :goto_2
    add-int v2, p1, v0

    .line 107
    .line 108
    aget-char v2, p0, v2

    .line 109
    .line 110
    if-eq v2, v1, :cond_9

    .line 111
    .line 112
    add-int/lit8 v0, v0, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_9
    new-instance v1, Lcom/esotericsoftware/asm/Type;

    .line 116
    .line 117
    add-int/2addr p1, v3

    .line 118
    sub-int/2addr v0, v3

    .line 119
    const/16 v2, 0xa

    .line 120
    .line 121
    invoke-direct {v1, v2, p0, p1, v0}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 122
    .line 123
    .line 124
    return-object v1

    .line 125
    :cond_a
    sget-object p0, Lcom/esotericsoftware/asm/Type;->FLOAT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 126
    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Ljava/lang/StringBuffer;)V
    .locals 3

    .line 129
    iget-object v0, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    if-nez v0, :cond_0

    iget p0, p0, Lcom/esotericsoftware/asm/Type;->c:I

    const/high16 v0, -0x1000000

    and-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x18

    int-to-char p0, p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    return-void

    :cond_0
    iget v1, p0, Lcom/esotericsoftware/asm/Type;->a:I

    const/16 v2, 0xa

    if-ne v1, v2, :cond_1

    const/16 v0, 0x4c

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    iget v1, p0, Lcom/esotericsoftware/asm/Type;->c:I

    iget p0, p0, Lcom/esotericsoftware/asm/Type;->d:I

    invoke-virtual {p1, v0, v1, p0}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    const/16 p0, 0x3b

    invoke-virtual {p1, p0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    return-void

    :cond_1
    iget v1, p0, Lcom/esotericsoftware/asm/Type;->c:I

    iget p0, p0, Lcom/esotericsoftware/asm/Type;->d:I

    invoke-virtual {p1, v0, v1, p0}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    return-void
.end method

.method private static a(Ljava/lang/StringBuffer;Ljava/lang/Class;)V
    .locals 4

    .line 130
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_0

    const/16 p1, 0x49

    goto :goto_1

    :cond_0
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_1

    const/16 p1, 0x56

    goto :goto_1

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_2

    const/16 p1, 0x5a

    goto :goto_1

    :cond_2
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_3

    const/16 p1, 0x42

    goto :goto_1

    :cond_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_4

    const/16 p1, 0x43

    goto :goto_1

    :cond_4
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_5

    const/16 p1, 0x53

    goto :goto_1

    :cond_5
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_6

    const/16 p1, 0x44

    goto :goto_1

    :cond_6
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p1, v0, :cond_7

    const/16 p1, 0x46

    goto :goto_1

    :cond_7
    const/16 p1, 0x4a

    :goto_1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    return-void

    :cond_8
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    :cond_9
    const/16 v0, 0x4c

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_b

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2e

    if-ne v2, v3, :cond_a

    const/16 v2, 0x2f

    :cond_a
    invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_b
    const/16 p1, 0x3b

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    return-void
.end method

.method public static getArgumentTypes(Ljava/lang/String;)[Lcom/esotericsoftware/asm/Type;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v0

    .line 8
    move v3, v1

    .line 9
    :goto_0
    add-int/lit8 v4, v2, 0x1

    .line 10
    .line 11
    aget-char v2, p0, v2

    .line 12
    .line 13
    const/16 v5, 0x29

    .line 14
    .line 15
    if-ne v2, v5, :cond_2

    .line 16
    .line 17
    new-array v2, v3, [Lcom/esotericsoftware/asm/Type;

    .line 18
    .line 19
    move v3, v1

    .line 20
    :goto_1
    aget-char v4, p0, v0

    .line 21
    .line 22
    if-eq v4, v5, :cond_1

    .line 23
    .line 24
    invoke-static {p0, v0}, Lcom/esotericsoftware/asm/Type;->a([CI)Lcom/esotericsoftware/asm/Type;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    aput-object v4, v2, v3

    .line 29
    .line 30
    iget v6, v4, Lcom/esotericsoftware/asm/Type;->d:I

    .line 31
    .line 32
    iget v4, v4, Lcom/esotericsoftware/asm/Type;->a:I

    .line 33
    .line 34
    const/16 v7, 0xa

    .line 35
    .line 36
    if-ne v4, v7, :cond_0

    .line 37
    .line 38
    const/4 v4, 0x2

    .line 39
    goto :goto_2

    .line 40
    :cond_0
    move v4, v1

    .line 41
    :goto_2
    add-int/2addr v6, v4

    .line 42
    add-int/2addr v0, v6

    .line 43
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    return-object v2

    .line 47
    :cond_2
    const/16 v5, 0x4c

    .line 48
    .line 49
    if-ne v2, v5, :cond_4

    .line 50
    .line 51
    :goto_3
    add-int/lit8 v2, v4, 0x1

    .line 52
    .line 53
    aget-char v4, p0, v4

    .line 54
    .line 55
    const/16 v5, 0x3b

    .line 56
    .line 57
    if-eq v4, v5, :cond_3

    .line 58
    .line 59
    move v4, v2

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    const/16 v5, 0x5b

    .line 65
    .line 66
    if-eq v2, v5, :cond_5

    .line 67
    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    :cond_5
    move v2, v4

    .line 71
    goto :goto_0
.end method

.method public static getArgumentTypes(Ljava/lang/reflect/Method;)[Lcom/esotericsoftware/asm/Type;
    .locals 3

    .line 73
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p0

    array-length v0, p0

    new-array v0, v0, [Lcom/esotericsoftware/asm/Type;

    array-length v1, p0

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    aget-object v2, p0, v1

    invoke-static {v2}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/Class;)Lcom/esotericsoftware/asm/Type;

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
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    add-int/lit8 v3, v1, 0x1

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/16 v4, 0x29

    .line 11
    .line 12
    const/16 v5, 0x4a

    .line 13
    .line 14
    const/16 v6, 0x44

    .line 15
    .line 16
    if-ne v1, v4, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/4 v1, 0x2

    .line 23
    shl-int/2addr v2, v1

    .line 24
    const/16 v3, 0x56

    .line 25
    .line 26
    if-ne p0, v3, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    if-eq p0, v6, :cond_1

    .line 31
    .line 32
    if-ne p0, v5, :cond_2

    .line 33
    .line 34
    :cond_1
    move v0, v1

    .line 35
    :cond_2
    :goto_1
    or-int p0, v2, v0

    .line 36
    .line 37
    return p0

    .line 38
    :cond_3
    const/16 v4, 0x4c

    .line 39
    .line 40
    if-ne v1, v4, :cond_5

    .line 41
    .line 42
    :goto_2
    add-int/lit8 v1, v3, 0x1

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/16 v4, 0x3b

    .line 49
    .line 50
    if-eq v3, v4, :cond_4

    .line 51
    .line 52
    move v3, v1

    .line 53
    goto :goto_2

    .line 54
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    const/16 v4, 0x5b

    .line 58
    .line 59
    if-ne v1, v4, :cond_9

    .line 60
    .line 61
    :goto_3
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-ne v1, v4, :cond_6

    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_6
    if-eq v1, v6, :cond_8

    .line 71
    .line 72
    if-ne v1, v5, :cond_7

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_7
    :goto_4
    move v1, v3

    .line 76
    goto :goto_0

    .line 77
    :cond_8
    :goto_5
    add-int/lit8 v2, v2, -0x1

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_9
    if-eq v1, v6, :cond_b

    .line 81
    .line 82
    if-ne v1, v5, :cond_a

    .line 83
    .line 84
    goto :goto_6

    .line 85
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_b
    :goto_6
    add-int/lit8 v2, v2, 0x2

    .line 89
    .line 90
    goto :goto_4
.end method

.method public static getConstructorDescriptor(Ljava/lang/reflect/Constructor;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/lang/StringBuffer;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x28

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 13
    .line 14
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
    invoke-static {v0, v2}, Lcom/esotericsoftware/asm/Type;->a(Ljava/lang/StringBuffer;Ljava/lang/Class;)V

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
    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static getDescriptor(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1

    .line 14
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-static {v0, p0}, Lcom/esotericsoftware/asm/Type;->a(Ljava/lang/StringBuffer;Ljava/lang/Class;)V

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getInternalName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

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

.method public static varargs getMethodDescriptor(Lcom/esotericsoftware/asm/Type;[Lcom/esotericsoftware/asm/Type;)Ljava/lang/String;
    .locals 3

    .line 44
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    aget-object v2, p1, v1

    invoke-direct {v2, v0}, Lcom/esotericsoftware/asm/Type;->a(Ljava/lang/StringBuffer;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/Type;->a(Ljava/lang/StringBuffer;)V

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuffer;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x28

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    array-length v3, v0

    .line 17
    if-ge v2, v3, :cond_0

    .line 18
    .line 19
    aget-object v3, v0, v2

    .line 20
    .line 21
    invoke-static {v1, v3}, Lcom/esotericsoftware/asm/Type;->a(Ljava/lang/StringBuffer;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v0, 0x29

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {v1, p0}, Lcom/esotericsoftware/asm/Type;->a(Ljava/lang/StringBuffer;Ljava/lang/Class;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static varargs getMethodType(Lcom/esotericsoftware/asm/Type;[Lcom/esotericsoftware/asm/Type;)Lcom/esotericsoftware/asm/Type;
    .locals 0

    .line 11
    invoke-static {p0, p1}, Lcom/esotericsoftware/asm/Type;->getMethodDescriptor(Lcom/esotericsoftware/asm/Type;[Lcom/esotericsoftware/asm/Type;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method public static getMethodType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p0, v0}, Lcom/esotericsoftware/asm/Type;->a([CI)Lcom/esotericsoftware/asm/Type;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static getObjectType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lcom/esotericsoftware/asm/Type;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aget-char v2, p0, v1

    .line 9
    .line 10
    const/16 v3, 0x5b

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    const/16 v2, 0x9

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v2, 0xa

    .line 18
    .line 19
    :goto_0
    array-length v3, p0

    .line 20
    invoke-direct {v0, v2, p0, v1, v3}, Lcom/esotericsoftware/asm/Type;-><init>(I[CII)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static getReturnType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x29

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/lit8 p0, p0, 0x1

    .line 12
    .line 13
    invoke-static {v0, p0}, Lcom/esotericsoftware/asm/Type;->a([CI)Lcom/esotericsoftware/asm/Type;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static getReturnType(Ljava/lang/reflect/Method;)Lcom/esotericsoftware/asm/Type;
    .locals 0

    .line 19
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/Class;)Lcom/esotericsoftware/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method public static getType(Ljava/lang/Class;)Lcom/esotericsoftware/asm/Type;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lcom/esotericsoftware/asm/Type;->INT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    if-ne p0, v0, :cond_1

    .line 17
    .line 18
    sget-object p0, Lcom/esotericsoftware/asm/Type;->VOID_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    if-ne p0, v0, :cond_2

    .line 24
    .line 25
    sget-object p0, Lcom/esotericsoftware/asm/Type;->BOOLEAN_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    if-ne p0, v0, :cond_3

    .line 31
    .line 32
    sget-object p0, Lcom/esotericsoftware/asm/Type;->BYTE_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    if-ne p0, v0, :cond_4

    .line 38
    .line 39
    sget-object p0, Lcom/esotericsoftware/asm/Type;->CHAR_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_4
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    if-ne p0, v0, :cond_5

    .line 45
    .line 46
    sget-object p0, Lcom/esotericsoftware/asm/Type;->SHORT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_5
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne p0, v0, :cond_6

    .line 52
    .line 53
    sget-object p0, Lcom/esotericsoftware/asm/Type;->DOUBLE_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_6
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    if-ne p0, v0, :cond_7

    .line 59
    .line 60
    sget-object p0, Lcom/esotericsoftware/asm/Type;->FLOAT_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_7
    sget-object p0, Lcom/esotericsoftware/asm/Type;->LONG_TYPE:Lcom/esotericsoftware/asm/Type;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_8
    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0
.end method

.method public static getType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;
    .locals 1

    .line 75
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/esotericsoftware/asm/Type;->a([CI)Lcom/esotericsoftware/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method public static getType(Ljava/lang/reflect/Constructor;)Lcom/esotericsoftware/asm/Type;
    .locals 0

    .line 76
    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getConstructorDescriptor(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method public static getType(Ljava/lang/reflect/Method;)Lcom/esotericsoftware/asm/Type;
    .locals 0

    .line 77
    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;

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
    instance-of v1, p1, Lcom/esotericsoftware/asm/Type;

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
    check-cast p1, Lcom/esotericsoftware/asm/Type;

    .line 12
    .line 13
    iget v1, p0, Lcom/esotericsoftware/asm/Type;->a:I

    .line 14
    .line 15
    iget v3, p1, Lcom/esotericsoftware/asm/Type;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    const/16 v3, 0x9

    .line 21
    .line 22
    if-lt v1, v3, :cond_5

    .line 23
    .line 24
    iget v1, p0, Lcom/esotericsoftware/asm/Type;->d:I

    .line 25
    .line 26
    iget v3, p1, Lcom/esotericsoftware/asm/Type;->d:I

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget v3, p0, Lcom/esotericsoftware/asm/Type;->c:I

    .line 32
    .line 33
    iget v4, p1, Lcom/esotericsoftware/asm/Type;->c:I

    .line 34
    .line 35
    add-int/2addr v1, v3

    .line 36
    :goto_0
    if-ge v3, v1, :cond_5

    .line 37
    .line 38
    iget-object v5, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    .line 39
    .line 40
    aget-char v5, v5, v3

    .line 41
    .line 42
    iget-object v6, p1, Lcom/esotericsoftware/asm/Type;->b:[C

    .line 43
    .line 44
    aget-char v6, v6, v4

    .line 45
    .line 46
    if-eq v5, v6, :cond_4

    .line 47
    .line 48
    return v2

    .line 49
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    return v0
.end method

.method public getArgumentTypes()[Lcom/esotericsoftware/asm/Type;
    .locals 0

    .line 72
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getArgumentTypes(Ljava/lang/String;)[Lcom/esotericsoftware/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method public getArgumentsAndReturnSizes()I
    .locals 0

    .line 91
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/Type;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0

    .line 8
    :pswitch_0
    new-instance v0, Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    .line 11
    .line 12
    iget v2, p0, Lcom/esotericsoftware/asm/Type;->c:I

    .line 13
    .line 14
    iget p0, p0, Lcom/esotericsoftware/asm/Type;->d:I

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 17
    .line 18
    .line 19
    const/16 p0, 0x2f

    .line 20
    .line 21
    const/16 v1, 0x2e

    .line 22
    .line 23
    invoke-virtual {v0, p0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/Type;->getElementType()Lcom/esotericsoftware/asm/Type;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/Type;->getClassName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/Type;->getDimensions()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    :goto_0
    if-lez p0, :cond_0

    .line 46
    .line 47
    const-string v1, "[]"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 50
    .line 51
    .line 52
    add-int/lit8 p0, p0, -0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    const-string p0, "double"

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_3
    const-string p0, "long"

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_4
    const-string p0, "float"

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_5
    const-string p0, "int"

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_6
    const-string p0, "short"

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_7
    const-string p0, "byte"

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_8
    const-string p0, "char"

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_9
    const-string p0, "boolean"

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_a
    const-string p0, "void"

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
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
    .end packed-switch
.end method

.method public getDescriptor()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/Type;->a(Ljava/lang/StringBuffer;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getDimensions()I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    .line 3
    .line 4
    iget v2, p0, Lcom/esotericsoftware/asm/Type;->c:I

    .line 5
    .line 6
    add-int/2addr v2, v0

    .line 7
    aget-char v1, v1, v2

    .line 8
    .line 9
    const/16 v2, 0x5b

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return v0
.end method

.method public getElementType()Lcom/esotericsoftware/asm/Type;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/asm/Type;->c:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/Type;->getDimensions()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    add-int/2addr p0, v1

    .line 10
    invoke-static {v0, p0}, Lcom/esotericsoftware/asm/Type;->a([CI)Lcom/esotericsoftware/asm/Type;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public getInternalName()Ljava/lang/String;
    .locals 3

    .line 14
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    iget v2, p0, Lcom/esotericsoftware/asm/Type;->c:I

    iget p0, p0, Lcom/esotericsoftware/asm/Type;->d:I

    invoke-direct {v0, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public getOpcode(I)I
    .locals 2

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/16 v0, 0x4f

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget p0, p0, Lcom/esotericsoftware/asm/Type;->c:I

    .line 16
    .line 17
    const/high16 v0, 0xff0000

    .line 18
    .line 19
    and-int/2addr p0, v0

    .line 20
    shr-int/lit8 v1, p0, 0x10

    .line 21
    .line 22
    :cond_1
    add-int/2addr p1, v1

    .line 23
    return p1

    .line 24
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    .line 25
    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    iget p0, p0, Lcom/esotericsoftware/asm/Type;->c:I

    .line 29
    .line 30
    const v0, 0xff00

    .line 31
    .line 32
    .line 33
    and-int/2addr p0, v0

    .line 34
    shr-int/lit8 v1, p0, 0x8

    .line 35
    .line 36
    :cond_3
    add-int/2addr p1, v1

    .line 37
    return p1
.end method

.method public getReturnType()Lcom/esotericsoftware/asm/Type;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getReturnType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;

    move-result-object p0

    return-object p0
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lcom/esotericsoftware/asm/Type;->c:I

    .line 6
    .line 7
    and-int/lit16 p0, p0, 0xff

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x1

    .line 11
    return p0
.end method

.method public getSort()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/asm/Type;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/Type;->a:I

    .line 2
    .line 3
    mul-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    if-lt v0, v2, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/esotericsoftware/asm/Type;->c:I

    .line 10
    .line 11
    iget v2, p0, Lcom/esotericsoftware/asm/Type;->d:I

    .line 12
    .line 13
    add-int/2addr v2, v0

    .line 14
    :goto_0
    if-ge v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Lcom/esotericsoftware/asm/Type;->b:[C

    .line 17
    .line 18
    aget-char v3, v3, v0

    .line 19
    .line 20
    add-int/2addr v1, v3

    .line 21
    mul-int/lit8 v1, v1, 0x11

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
