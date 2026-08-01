.class public Lcom/esotericsoftware/asm/ClassReader;
.super Ljava/lang/Object;


# static fields
.field public static final EXPAND_FRAMES:I = 0x8

.field public static final SKIP_CODE:I = 0x1

.field public static final SKIP_DEBUG:I = 0x2

.field public static final SKIP_FRAMES:I = 0x4


# instance fields
.field private final a:[I

.field public final b:[B

.field private final c:[Ljava/lang/String;

.field private final d:I

.field public final header:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 105
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/esotericsoftware/asm/ClassReader;->a(Ljava/io/InputStream;Z)[B

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;-><init>([B)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 103
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, ".class"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/ClassLoader;->getSystemResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/esotericsoftware/asm/ClassReader;->a(Ljava/io/InputStream;Z)[B

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 104
    const/4 v0, 0x0

    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lcom/esotericsoftware/asm/ClassReader;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 5
    .line 6
    add-int/lit8 p3, p2, 0x6

    .line 7
    .line 8
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/asm/ClassReader;->readShort(I)S

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    const/16 v0, 0x34

    .line 13
    .line 14
    if-gt p3, v0, :cond_6

    .line 15
    .line 16
    add-int/lit8 p3, p2, 0x8

    .line 17
    .line 18
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    new-array p3, p3, [I

    .line 23
    .line 24
    iput-object p3, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 25
    .line 26
    array-length p3, p3

    .line 27
    new-array v0, p3, [Ljava/lang/String;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/esotericsoftware/asm/ClassReader;->c:[Ljava/lang/String;

    .line 30
    .line 31
    add-int/lit8 p2, p2, 0xa

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    const/4 v1, 0x0

    .line 35
    move v2, v0

    .line 36
    :goto_0
    if-ge v2, p3, :cond_5

    .line 37
    .line 38
    iget-object v3, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 39
    .line 40
    add-int/lit8 v4, p2, 0x1

    .line 41
    .line 42
    aput v4, v3, v2

    .line 43
    .line 44
    aget-byte v3, p1, p2

    .line 45
    .line 46
    const/4 v5, 0x3

    .line 47
    if-eq v3, v0, :cond_3

    .line 48
    .line 49
    const/16 v4, 0xf

    .line 50
    .line 51
    const/4 v6, 0x4

    .line 52
    if-eq v3, v4, :cond_2

    .line 53
    .line 54
    const/16 v4, 0x12

    .line 55
    .line 56
    const/4 v7, 0x5

    .line 57
    if-eq v3, v4, :cond_1

    .line 58
    .line 59
    if-eq v3, v5, :cond_1

    .line 60
    .line 61
    if-eq v3, v6, :cond_1

    .line 62
    .line 63
    if-eq v3, v7, :cond_0

    .line 64
    .line 65
    const/4 v4, 0x6

    .line 66
    if-eq v3, v4, :cond_0

    .line 67
    .line 68
    packed-switch v3, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    const/16 v5, 0x9

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    :pswitch_0
    move v5, v7

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move v5, v6

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    add-int/2addr v5, v3

    .line 86
    if-le v5, v1, :cond_4

    .line 87
    .line 88
    move v1, v5

    .line 89
    :cond_4
    :goto_1
    add-int/2addr p2, v5

    .line 90
    add-int/2addr v2, v0

    .line 91
    goto :goto_0

    .line 92
    :cond_5
    iput v1, p0, Lcom/esotericsoftware/asm/ClassReader;->d:I

    .line 93
    .line 94
    iput p2, p0, Lcom/esotericsoftware/asm/ClassReader;->header:I

    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 98
    .line 99
    .line 100
    const/4 p0, 0x0

    .line 101
    throw p0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private a()I
    .locals 4

    .line 2422
    iget v0, p0, Lcom/esotericsoftware/asm/ClassReader;->header:I

    add-int/lit8 v1, v0, 0x8

    add-int/lit8 v0, v0, 0x6

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    :goto_0
    if-lez v1, :cond_1

    add-int/lit8 v2, v0, 0x8

    invoke-virtual {p0, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v2

    :goto_1
    if-lez v2, :cond_0

    add-int/lit8 v3, v0, 0xc

    invoke-virtual {p0, v3}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x6

    add-int/2addr v0, v3

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x8

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    :goto_2
    if-lez v1, :cond_3

    add-int/lit8 v2, v0, 0x8

    invoke-virtual {p0, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v2

    :goto_3
    if-lez v2, :cond_2

    add-int/lit8 v3, v0, 0xc

    invoke-virtual {p0, v3}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x6

    add-int/2addr v0, v3

    add-int/lit8 v2, v2, -0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v0, v0, 0x8

    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method private a(IZZLcom/esotericsoftware/asm/Context;)I
    .locals 11

    .line 2411
    iget-object v4, p4, Lcom/esotericsoftware/asm/Context;->c:[C

    iget-object v5, p4, Lcom/esotericsoftware/asm/Context;->h:[Lcom/esotericsoftware/asm/Label;

    const/16 v0, 0xff

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    add-int/lit8 v1, p1, 0x1

    aget-byte p1, p2, p1

    and-int/2addr p1, v0

    move v3, v1

    goto :goto_0

    :cond_0
    const/4 p2, -0x1

    iput p2, p4, Lcom/esotericsoftware/asm/Context;->o:I

    move v3, p1

    move p1, v0

    :goto_0
    const/4 p2, 0x0

    iput p2, p4, Lcom/esotericsoftware/asm/Context;->r:I

    const/4 v1, 0x3

    const/16 v2, 0x40

    const/4 v6, 0x1

    if-ge p1, v2, :cond_1

    iput v1, p4, Lcom/esotericsoftware/asm/Context;->p:I

    iput p2, p4, Lcom/esotericsoftware/asm/Context;->t:I

    move-object v0, p0

    goto/16 :goto_8

    :cond_1
    const/16 v2, 0x80

    const/4 v7, 0x4

    if-ge p1, v2, :cond_2

    add-int/lit8 p1, p1, -0x40

    iget-object v1, p4, Lcom/esotericsoftware/asm/Context;->u:[Ljava/lang/Object;

    const/4 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassReader;->a([Ljava/lang/Object;II[C[Lcom/esotericsoftware/asm/Label;)I

    move-result v3

    iput v7, p4, Lcom/esotericsoftware/asm/Context;->p:I

    iput v6, p4, Lcom/esotericsoftware/asm/Context;->t:I

    goto/16 :goto_8

    :cond_2
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v8

    move v2, v3

    add-int/lit8 v3, v2, 0x2

    const/16 v9, 0xf7

    if-ne p1, v9, :cond_4

    iget-object v1, p4, Lcom/esotericsoftware/asm/Context;->u:[Ljava/lang/Object;

    const/4 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassReader;->a([Ljava/lang/Object;II[C[Lcom/esotericsoftware/asm/Label;)I

    move-result v3

    iput v7, p4, Lcom/esotericsoftware/asm/Context;->p:I

    iput v6, p4, Lcom/esotericsoftware/asm/Context;->t:I

    :cond_3
    :goto_1
    move p1, v8

    goto/16 :goto_8

    :cond_4
    const/16 v7, 0xf8

    const/4 v9, 0x2

    const/16 v10, 0xfb

    if-lt p1, v7, :cond_5

    if-ge p1, v10, :cond_5

    iput v9, p4, Lcom/esotericsoftware/asm/Context;->p:I

    rsub-int p1, p1, 0xfb

    iput p1, p4, Lcom/esotericsoftware/asm/Context;->r:I

    iget p3, p4, Lcom/esotericsoftware/asm/Context;->q:I

    sub-int/2addr p3, p1

    iput p3, p4, Lcom/esotericsoftware/asm/Context;->q:I

    :goto_2
    iput p2, p4, Lcom/esotericsoftware/asm/Context;->t:I

    goto :goto_3

    :cond_5
    if-ne p1, v10, :cond_6

    iput v1, p4, Lcom/esotericsoftware/asm/Context;->p:I

    goto :goto_2

    :goto_3
    move-object v0, p0

    goto :goto_1

    :cond_6
    if-ge p1, v0, :cond_9

    if-eqz p3, :cond_7

    iget p3, p4, Lcom/esotericsoftware/asm/Context;->q:I

    goto :goto_4

    :cond_7
    move p3, p2

    :goto_4
    add-int/lit16 p1, p1, -0xfb

    move v2, p3

    move p3, p1

    :goto_5
    if-lez p3, :cond_8

    iget-object v1, p4, Lcom/esotericsoftware/asm/Context;->s:[Ljava/lang/Object;

    add-int/lit8 v7, v2, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassReader;->a([Ljava/lang/Object;II[C[Lcom/esotericsoftware/asm/Label;)I

    move-result v3

    add-int/lit8 p3, p3, -0x1

    move v2, v7

    goto :goto_5

    :cond_8
    move-object v0, p0

    iput v6, p4, Lcom/esotericsoftware/asm/Context;->p:I

    iput p1, p4, Lcom/esotericsoftware/asm/Context;->r:I

    iget p0, p4, Lcom/esotericsoftware/asm/Context;->q:I

    add-int/2addr p0, p1

    iput p0, p4, Lcom/esotericsoftware/asm/Context;->q:I

    iput p2, p4, Lcom/esotericsoftware/asm/Context;->t:I

    goto :goto_1

    :cond_9
    move-object v0, p0

    iput p2, p4, Lcom/esotericsoftware/asm/Context;->p:I

    invoke-virtual {v0, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result p0

    add-int/lit8 v3, v2, 0x4

    iput p0, p4, Lcom/esotericsoftware/asm/Context;->r:I

    iput p0, p4, Lcom/esotericsoftware/asm/Context;->q:I

    move v2, p2

    :goto_6
    if-lez p0, :cond_a

    iget-object v1, p4, Lcom/esotericsoftware/asm/Context;->s:[Ljava/lang/Object;

    add-int/lit8 p1, v2, 0x1

    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassReader;->a([Ljava/lang/Object;II[C[Lcom/esotericsoftware/asm/Label;)I

    move-result v3

    add-int/lit8 p0, p0, -0x1

    move v2, p1

    goto :goto_6

    :cond_a
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result p0

    add-int/2addr v3, v9

    iput p0, p4, Lcom/esotericsoftware/asm/Context;->t:I

    :goto_7
    move v2, p2

    if-lez p0, :cond_3

    iget-object v1, p4, Lcom/esotericsoftware/asm/Context;->u:[Ljava/lang/Object;

    add-int/lit8 p2, v2, 0x1

    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassReader;->a([Ljava/lang/Object;II[C[Lcom/esotericsoftware/asm/Label;)I

    move-result v3

    add-int/lit8 p0, p0, -0x1

    goto :goto_7

    :goto_8
    iget p0, p4, Lcom/esotericsoftware/asm/Context;->o:I

    add-int/2addr p1, v6

    add-int/2addr p1, p0

    iput p1, p4, Lcom/esotericsoftware/asm/Context;->o:I

    invoke-virtual {v0, p1, v5}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    return v3
.end method

.method private a(I[CLjava/lang/String;Lcom/esotericsoftware/asm/AnnotationVisitor;)I
    .locals 11

    .line 2412
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    const/16 v1, 0x65

    const/16 v2, 0x5b

    const/16 v3, 0x40

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez p4, :cond_3

    aget-byte p3, v0, p1

    and-int/lit16 p3, p3, 0xff

    const/4 p4, 0x0

    if-eq p3, v3, :cond_2

    if-eq p3, v2, :cond_1

    if-eq p3, v1, :cond_0

    add-int/lit8 p1, p1, 0x3

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x5

    return p1

    :cond_1
    add-int/2addr p1, v5

    invoke-direct {p0, p1, p2, v4, p4}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result p0

    return p0

    :cond_2
    add-int/lit8 p1, p1, 0x3

    invoke-direct {p0, p1, p2, v5, p4}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result p0

    return p0

    :cond_3
    add-int/lit8 v6, p1, 0x1

    aget-byte v0, v0, p1

    and-int/lit16 v0, v0, 0xff

    if-eq v0, v3, :cond_1b

    const/16 v3, 0x46

    if-eq v0, v3, :cond_1a

    const/16 v7, 0x53

    if-eq v0, v7, :cond_19

    const/16 v8, 0x63

    if-eq v0, v8, :cond_18

    if-eq v0, v1, :cond_17

    const/16 v1, 0x73

    if-eq v0, v1, :cond_16

    const/16 v1, 0x49

    if-eq v0, v1, :cond_1a

    const/16 v8, 0x4a

    if-eq v0, v8, :cond_1a

    const/16 v9, 0x5a

    if-eq v0, v9, :cond_14

    if-eq v0, v2, :cond_4

    packed-switch v0, :pswitch_data_0

    return v6

    :pswitch_0
    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v6}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v0

    aget p2, p2, v0

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result p0

    int-to-char p0, p0

    new-instance p2, Ljava/lang/Character;

    invoke-direct {p2, p0}, Ljava/lang/Character;-><init>(C)V

    invoke-virtual {p4, p3, p2}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 p1, p1, 0x3

    return p1

    :pswitch_1
    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v6}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v0

    aget p2, p2, v0

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result p0

    int-to-byte p0, p0

    new-instance p2, Ljava/lang/Byte;

    invoke-direct {p2, p0}, Ljava/lang/Byte;-><init>(B)V

    invoke-virtual {p4, p3, p2}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 p1, p1, 0x3

    return p1

    :cond_4
    invoke-virtual {p0, v6}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v0

    add-int/lit8 v2, p1, 0x3

    if-nez v0, :cond_5

    add-int/2addr p1, v5

    invoke-virtual {p4, p3}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitArray(Ljava/lang/String;)Lcom/esotericsoftware/asm/AnnotationVisitor;

    move-result-object p3

    invoke-direct {p0, p1, p2, v4, p3}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result p0

    return p0

    :cond_5
    iget-object v6, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    add-int/lit8 v10, p1, 0x4

    aget-byte v2, v6, v2

    and-int/lit16 v2, v2, 0xff

    if-eq v2, v3, :cond_12

    if-eq v2, v7, :cond_10

    if-eq v2, v9, :cond_d

    if-eq v2, v1, :cond_b

    if-eq v2, v8, :cond_9

    packed-switch v2, :pswitch_data_1

    add-int/2addr p1, v5

    invoke-virtual {p4, p3}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitArray(Ljava/lang/String;)Lcom/esotericsoftware/asm/AnnotationVisitor;

    move-result-object p3

    invoke-direct {p0, p1, p2, v4, p3}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result p0

    return p0

    :pswitch_2
    new-array p1, v0, [D

    :goto_0
    if-ge v4, v0, :cond_6

    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v10}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    aget p2, p2, v1

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v1

    aput-wide v1, p1, v4

    add-int/lit8 v10, v10, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {p4, p3, p1}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    add-int/lit8 v10, v10, -0x1

    return v10

    :pswitch_3
    new-array p1, v0, [C

    :goto_2
    if-ge v4, v0, :cond_7

    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v10}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    aget p2, p2, v1

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result p2

    int-to-char p2, p2

    aput-char p2, p1, v4

    add-int/lit8 v10, v10, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_7
    invoke-virtual {p4, p3, p1}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_4
    new-array p1, v0, [B

    :goto_3
    if-ge v4, v0, :cond_8

    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v10}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    aget p2, p2, v1

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result p2

    int-to-byte p2, p2

    aput-byte p2, p1, v4

    add-int/lit8 v10, v10, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_8
    invoke-virtual {p4, p3, p1}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_9
    new-array p1, v0, [J

    :goto_4
    if-ge v4, v0, :cond_a

    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v10}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    aget p2, p2, v1

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readLong(I)J

    move-result-wide v1

    aput-wide v1, p1, v4

    add-int/lit8 v10, v10, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_a
    invoke-virtual {p4, p3, p1}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_b
    new-array p1, v0, [I

    :goto_5
    if-ge v4, v0, :cond_c

    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v10}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    aget p2, p2, v1

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result p2

    aput p2, p1, v4

    add-int/lit8 v10, v10, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_c
    invoke-virtual {p4, p3, p1}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_d
    new-array p1, v0, [Z

    move p2, v4

    :goto_6
    if-ge p2, v0, :cond_f

    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v10}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v2

    aget v1, v1, v2

    invoke-virtual {p0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result v1

    if-eqz v1, :cond_e

    move v1, v5

    goto :goto_7

    :cond_e
    move v1, v4

    :goto_7
    aput-boolean v1, p1, p2

    add-int/lit8 v10, v10, 0x3

    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    :cond_f
    invoke-virtual {p4, p3, p1}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_10
    new-array p1, v0, [S

    :goto_8
    if-ge v4, v0, :cond_11

    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v10}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    aget p2, p2, v1

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result p2

    int-to-short p2, p2

    aput-short p2, p1, v4

    add-int/lit8 v10, v10, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_11
    invoke-virtual {p4, p3, p1}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_12
    new-array p1, v0, [F

    :goto_9
    if-ge v4, v0, :cond_13

    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v10}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    aget p2, p2, v1

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    aput p2, p1, v4

    add-int/lit8 v10, v10, 0x3

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_13
    invoke-virtual {p4, p3, p1}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_14
    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v6}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v0

    aget p2, p2, v0

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result p0

    if-nez p0, :cond_15

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_a

    :cond_15
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_a
    invoke-virtual {p4, p3, p0}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 p1, p1, 0x3

    return p1

    :cond_16
    invoke-virtual {p0, v6, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p4, p3, p0}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 p1, p1, 0x3

    return p1

    :cond_17
    invoke-virtual {p0, v6, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, p1, 0x3

    invoke-virtual {p0, v1, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p4, p3, v0, p0}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitEnum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x5

    return p1

    :cond_18
    invoke-virtual {p0, v6, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;

    move-result-object p0

    invoke-virtual {p4, p3, p0}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 p1, p1, 0x3

    return p1

    :cond_19
    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    invoke-virtual {p0, v6}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v0

    aget p2, p2, v0

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result p0

    int-to-short p0, p0

    new-instance p2, Ljava/lang/Short;

    invoke-direct {p2, p0}, Ljava/lang/Short;-><init>(S)V

    invoke-virtual {p4, p3, p2}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 p1, p1, 0x3

    return p1

    :cond_1a
    :pswitch_5
    invoke-virtual {p0, v6}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v0

    invoke-virtual {p0, v0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p4, p3, p0}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 p1, p1, 0x3

    return p1

    :cond_1b
    add-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, v6, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, p3, v0}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitAnnotation(Ljava/lang/String;Ljava/lang/String;)Lcom/esotericsoftware/asm/AnnotationVisitor;

    move-result-object p3

    invoke-direct {p0, p1, p2, v5, p3}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result p0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I
    .locals 1

    .line 2413
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v0

    add-int/lit8 p1, p1, 0x2

    if-eqz p3, :cond_0

    :goto_0
    if-lez v0, :cond_1

    add-int/lit8 p3, p1, 0x2

    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p3, p2, p1, p4}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CLjava/lang/String;Lcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result p1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-lez v0, :cond_1

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CLjava/lang/String;Lcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result p1

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    if-eqz p4, :cond_2

    invoke-virtual {p4}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitEnd()V

    :cond_2
    return p1
.end method

.method private a(Lcom/esotericsoftware/asm/ClassVisitor;Lcom/esotericsoftware/asm/Context;I)I
    .locals 21

    .line 2414
    move-object/from16 v0, p0

    move-object/from16 v8, p2

    move/from16 v1, p3

    iget-object v5, v8, Lcom/esotericsoftware/asm/Context;->c:[C

    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v2

    add-int/lit8 v3, v1, 0x2

    invoke-virtual {v0, v3, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v11

    add-int/lit8 v3, v1, 0x4

    invoke-virtual {v0, v3, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v12

    add-int/lit8 v1, v1, 0x6

    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v3

    move v10, v1

    move v13, v2

    move v14, v3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_0
    if-lez v14, :cond_a

    add-int/lit8 v7, v10, 0x2

    invoke-virtual {v0, v7, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v7

    const-string v9, "ConstantValue"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    add-int/lit8 v7, v10, 0x8

    invoke-virtual {v0, v7}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v7

    if-nez v7, :cond_0

    const/16 v17, 0x0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0, v7, v5}, Lcom/esotericsoftware/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v17, v7

    goto/16 :goto_3

    :cond_1
    const-string v9, "Signature"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    add-int/lit8 v7, v10, 0x8

    invoke-virtual {v0, v7, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v16

    goto/16 :goto_3

    :cond_2
    const-string v9, "Deprecated"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    const/high16 v7, 0x20000

    :goto_1
    or-int/2addr v7, v13

    move v13, v7

    goto/16 :goto_3

    :cond_3
    const-string v9, "Synthetic"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const v7, 0x41000

    goto :goto_1

    :cond_4
    const-string v9, "RuntimeVisibleAnnotations"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    add-int/lit8 v1, v10, 0x8

    goto :goto_3

    :cond_5
    const-string v9, "RuntimeVisibleTypeAnnotations"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    add-int/lit8 v3, v10, 0x8

    goto :goto_3

    :cond_6
    const-string v9, "RuntimeInvisibleAnnotations"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    add-int/lit8 v2, v10, 0x8

    goto :goto_3

    :cond_7
    const-string v9, "RuntimeInvisibleTypeAnnotations"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    add-int/lit8 v4, v10, 0x8

    goto :goto_3

    :cond_8
    move v9, v1

    iget-object v1, v8, Lcom/esotericsoftware/asm/Context;->a:[Lcom/esotericsoftware/asm/Attribute;

    move/from16 v18, v3

    add-int/lit8 v3, v10, 0x8

    add-int/lit8 v15, v10, 0x4

    invoke-virtual {v0, v15}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result v15

    move-object/from16 v19, v6

    const/4 v6, -0x1

    move/from16 v20, v2

    move-object v2, v7

    const/4 v7, 0x0

    move v8, v9

    move v9, v4

    move v4, v15

    move v15, v8

    move-object/from16 v8, v19

    invoke-direct/range {v0 .. v7}, Lcom/esotericsoftware/asm/ClassReader;->a([Lcom/esotericsoftware/asm/Attribute;Ljava/lang/String;II[CI[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Attribute;

    move-result-object v6

    if-eqz v6, :cond_9

    iput-object v8, v6, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    :goto_2
    move v4, v9

    move v1, v15

    move/from16 v3, v18

    move/from16 v2, v20

    goto :goto_3

    :cond_9
    move-object v6, v8

    goto :goto_2

    :goto_3
    add-int/lit8 v7, v10, 0x4

    invoke-virtual {v0, v7}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x6

    add-int/2addr v10, v7

    add-int/lit8 v14, v14, -0x1

    move-object/from16 v8, p2

    goto/16 :goto_0

    :cond_a
    move v15, v1

    move/from16 v20, v2

    move/from16 v18, v3

    move v9, v4

    move-object v8, v6

    add-int/lit8 v1, v10, 0x2

    move v10, v13

    move-object/from16 v13, v16

    move-object/from16 v14, v17

    const/4 v6, 0x0

    move-object/from16 v9, p1

    invoke-virtual/range {v9 .. v14}, Lcom/esotericsoftware/asm/ClassVisitor;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/esotericsoftware/asm/FieldVisitor;

    move-result-object v7

    if-nez v7, :cond_b

    return v1

    :cond_b
    const/4 v9, 0x1

    if-eqz v15, :cond_c

    invoke-virtual {v0, v15}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v10

    add-int/lit8 v11, v15, 0x2

    :goto_4
    if-lez v10, :cond_c

    add-int/lit8 v12, v11, 0x2

    invoke-virtual {v0, v11, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11, v9}, Lcom/esotericsoftware/asm/FieldVisitor;->visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    move-result-object v11

    invoke-direct {v0, v12, v5, v9, v11}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result v11

    add-int/lit8 v10, v10, -0x1

    goto :goto_4

    :cond_c
    if-eqz v2, :cond_d

    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v10

    add-int/lit8 v2, v2, 0x2

    :goto_5
    if-lez v10, :cond_d

    add-int/lit8 v11, v2, 0x2

    invoke-virtual {v0, v2, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2, v6}, Lcom/esotericsoftware/asm/FieldVisitor;->visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    move-result-object v2

    invoke-direct {v0, v11, v5, v9, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result v2

    add-int/lit8 v10, v10, -0x1

    goto :goto_5

    :cond_d
    if-eqz v3, :cond_e

    invoke-virtual {v0, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v2

    add-int/lit8 v3, v3, 0x2

    :goto_6
    if-lez v2, :cond_e

    move-object/from16 v10, p2

    invoke-direct {v0, v10, v3}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;I)I

    move-result v3

    add-int/lit8 v11, v3, 0x2

    iget v12, v10, Lcom/esotericsoftware/asm/Context;->i:I

    iget-object v13, v10, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    invoke-virtual {v0, v3, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v12, v13, v3, v9}, Lcom/esotericsoftware/asm/FieldVisitor;->visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    move-result-object v3

    invoke-direct {v0, v11, v5, v9, v3}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result v3

    add-int/lit8 v2, v2, -0x1

    goto :goto_6

    :cond_e
    move-object/from16 v10, p2

    if-eqz v4, :cond_f

    invoke-virtual {v0, v4}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v2

    add-int/lit8 v4, v4, 0x2

    :goto_7
    if-lez v2, :cond_f

    invoke-direct {v0, v10, v4}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;I)I

    move-result v3

    add-int/lit8 v4, v3, 0x2

    iget v11, v10, Lcom/esotericsoftware/asm/Context;->i:I

    iget-object v12, v10, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    invoke-virtual {v0, v3, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v11, v12, v3, v6}, Lcom/esotericsoftware/asm/FieldVisitor;->visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    move-result-object v3

    invoke-direct {v0, v4, v5, v9, v3}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result v4

    add-int/lit8 v2, v2, -0x1

    goto :goto_7

    :cond_f
    move-object v6, v8

    :goto_8
    if-eqz v6, :cond_10

    iget-object v0, v6, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    const/4 v2, 0x0

    iput-object v2, v6, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    invoke-virtual {v7, v6}, Lcom/esotericsoftware/asm/FieldVisitor;->visitAttribute(Lcom/esotericsoftware/asm/Attribute;)V

    move-object v6, v0

    goto :goto_8

    :cond_10
    invoke-virtual {v7}, Lcom/esotericsoftware/asm/FieldVisitor;->visitEnd()V

    return v1
.end method

.method private a(Lcom/esotericsoftware/asm/Context;I)I
    .locals 8

    .line 2415
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result v0

    ushr-int/lit8 v1, v0, 0x18

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_2

    const/16 v3, 0x40

    const/high16 v4, -0x1000000

    if-eq v1, v3, :cond_1

    const/16 v3, 0x41

    if-eq v1, v3, :cond_1

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    const/16 v3, 0x43

    if-ge v1, v3, :cond_0

    const/16 v4, -0x100

    :cond_0
    and-int/2addr v0, v4

    add-int/lit8 p2, p2, 0x3

    goto :goto_1

    :pswitch_0
    const v1, -0xffff01

    and-int/2addr v0, v1

    add-int/lit8 p2, p2, 0x4

    goto :goto_1

    :pswitch_1
    and-int/2addr v0, v4

    add-int/2addr p2, v2

    goto :goto_1

    :cond_1
    and-int/2addr v0, v4

    add-int/lit8 v1, p2, 0x1

    invoke-virtual {p0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    new-array v3, v1, [Lcom/esotericsoftware/asm/Label;

    iput-object v3, p1, Lcom/esotericsoftware/asm/Context;->l:[Lcom/esotericsoftware/asm/Label;

    new-array v3, v1, [Lcom/esotericsoftware/asm/Label;

    iput-object v3, p1, Lcom/esotericsoftware/asm/Context;->m:[Lcom/esotericsoftware/asm/Label;

    new-array v3, v1, [I

    iput-object v3, p1, Lcom/esotericsoftware/asm/Context;->n:[I

    add-int/lit8 p2, p2, 0x3

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v4

    add-int/lit8 v5, p2, 0x2

    invoke-virtual {p0, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v5

    iget-object v6, p1, Lcom/esotericsoftware/asm/Context;->l:[Lcom/esotericsoftware/asm/Label;

    iget-object v7, p1, Lcom/esotericsoftware/asm/Context;->h:[Lcom/esotericsoftware/asm/Label;

    invoke-virtual {p0, v4, v7}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    move-result-object v7

    aput-object v7, v6, v3

    iget-object v6, p1, Lcom/esotericsoftware/asm/Context;->m:[Lcom/esotericsoftware/asm/Label;

    add-int/2addr v4, v5

    iget-object v5, p1, Lcom/esotericsoftware/asm/Context;->h:[Lcom/esotericsoftware/asm/Label;

    invoke-virtual {p0, v4, v5}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    move-result-object v4

    aput-object v4, v6, v3

    iget-object v4, p1, Lcom/esotericsoftware/asm/Context;->n:[I

    add-int/lit8 v5, p2, 0x4

    invoke-virtual {p0, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v5

    aput v5, v4, v3

    add-int/lit8 p2, p2, 0x6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :pswitch_2
    const/high16 v1, -0x10000

    and-int/2addr v0, v1

    add-int/lit8 p2, p2, 0x2

    :cond_3
    :goto_1
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassReader;->readByte(I)I

    move-result v1

    iput v0, p1, Lcom/esotericsoftware/asm/Context;->i:I

    if-nez v1, :cond_4

    const/4 p0, 0x0

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/esotericsoftware/asm/TypePath;

    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    invoke-direct {v0, p0, p2}, Lcom/esotericsoftware/asm/TypePath;-><init>([BI)V

    move-object p0, v0

    :goto_2
    iput-object p0, p1, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    add-int/2addr p2, v2

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v1, p2

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x47
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private a([Ljava/lang/Object;II[C[Lcom/esotericsoftware/asm/Label;)I
    .locals 2

    .line 2416
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    add-int/lit8 v1, p3, 0x1

    aget-byte v0, v0, p3

    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result p4

    invoke-virtual {p0, p4, p5}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    move-result-object p0

    aput-object p0, p1, p2

    :goto_0
    add-int/lit8 p3, p3, 0x3

    return p3

    :pswitch_0
    invoke-virtual {p0, v1, p4}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, p2

    goto :goto_0

    :pswitch_1
    sget-object p0, Lcom/esotericsoftware/asm/Opcodes;->UNINITIALIZED_THIS:Ljava/lang/Integer;

    aput-object p0, p1, p2

    return v1

    :pswitch_2
    sget-object p0, Lcom/esotericsoftware/asm/Opcodes;->NULL:Ljava/lang/Integer;

    aput-object p0, p1, p2

    return v1

    :pswitch_3
    sget-object p0, Lcom/esotericsoftware/asm/Opcodes;->LONG:Ljava/lang/Integer;

    aput-object p0, p1, p2

    return v1

    :pswitch_4
    sget-object p0, Lcom/esotericsoftware/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    aput-object p0, p1, p2

    return v1

    :pswitch_5
    sget-object p0, Lcom/esotericsoftware/asm/Opcodes;->FLOAT:Ljava/lang/Integer;

    aput-object p0, p1, p2

    return v1

    :pswitch_6
    sget-object p0, Lcom/esotericsoftware/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    aput-object p0, p1, p2

    return v1

    :pswitch_7
    sget-object p0, Lcom/esotericsoftware/asm/Opcodes;->TOP:Ljava/lang/Integer;

    aput-object p0, p1, p2

    return v1

    :pswitch_data_0
    .packed-switch 0x0
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

.method private a([Lcom/esotericsoftware/asm/Attribute;Ljava/lang/String;II[CI[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Attribute;
    .locals 3

    .line 2417
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    aget-object v1, p1, v0

    iget-object v1, v1, Lcom/esotericsoftware/asm/Attribute;->type:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    move-object v2, p1

    move-object p1, p0

    move-object p0, v2

    if-eqz v1, :cond_0

    aget-object p0, p0, v0

    move p2, p3

    move p3, p4

    move-object p4, p5

    move p5, p6

    move-object p6, p7

    invoke-virtual/range {p0 .. p6}, Lcom/esotericsoftware/asm/Attribute;->read(Lcom/esotericsoftware/asm/ClassReader;II[CI[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Attribute;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    move-object v2, p1

    move-object p1, p0

    move-object p0, v2

    goto :goto_0

    :cond_1
    move-object p1, p0

    new-instance p0, Lcom/esotericsoftware/asm/Attribute;

    invoke-direct {p0, p2}, Lcom/esotericsoftware/asm/Attribute;-><init>(Ljava/lang/String;)V

    const/4 p6, -0x1

    const/4 p7, 0x0

    const/4 p5, 0x0

    move-object p2, p1

    move-object p1, p0

    invoke-virtual/range {p1 .. p7}, Lcom/esotericsoftware/asm/Attribute;->read(Lcom/esotericsoftware/asm/ClassReader;II[CI[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Attribute;

    move-result-object p0

    return-object p0
.end method

.method private a(II[C)Ljava/lang/String;
    .locals 9

    .line 2418
    add-int/2addr p2, p1

    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge p1, p2, :cond_5

    add-int/lit8 v4, p1, 0x1

    aget-byte p1, p0, p1

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v6, :cond_1

    if-eq v2, v5, :cond_0

    goto :goto_2

    :cond_0
    shl-int/lit8 v2, v3, 0x6

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v2

    :goto_1
    int-to-char v3, p1

    move v2, v6

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v1, 0x1

    shl-int/lit8 v5, v3, 0x6

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v5

    int-to-char p1, p1

    aput-char p1, p3, v1

    move v1, v2

    move v2, v0

    goto :goto_2

    :cond_2
    and-int/lit16 v7, p1, 0xff

    const/16 v8, 0x80

    if-ge v7, v8, :cond_3

    add-int/lit8 p1, v1, 0x1

    int-to-char v5, v7

    aput-char v5, p3, v1

    move v1, p1

    goto :goto_2

    :cond_3
    const/16 v2, 0xe0

    if-ge v7, v2, :cond_4

    const/16 v2, 0xbf

    if-le v7, v2, :cond_4

    and-int/lit8 p1, p1, 0x1f

    goto :goto_1

    :cond_4
    and-int/lit8 p1, p1, 0xf

    int-to-char v3, p1

    move v2, v5

    :goto_2
    move p1, v4

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p3, v0, v1}, Ljava/lang/String;-><init>([CII)V

    return-object p0
.end method

.method private a(Lcom/esotericsoftware/asm/ClassWriter;[Lcom/esotericsoftware/asm/Item;[C)V
    .locals 9

    .line 2420
    invoke-direct {p0}, Lcom/esotericsoftware/asm/ClassReader;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    :goto_0
    if-lez v1, :cond_3

    add-int/lit8 v2, v0, 0x2

    invoke-virtual {p0, v2, p3}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v2

    const-string v3, "BootstrapMethods"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    add-int/lit8 v1, v0, 0x8

    invoke-virtual {p0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    add-int/lit8 v2, v0, 0xa

    const/4 v3, 0x0

    move v4, v2

    :goto_1
    if-ge v3, v1, :cond_1

    sub-int v5, v4, v0

    add-int/lit8 v5, v5, -0xa

    invoke-virtual {p0, v4}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v6

    invoke-virtual {p0, v6, p3}, Lcom/esotericsoftware/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v6

    add-int/lit8 v7, v4, 0x2

    invoke-virtual {p0, v7}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v7

    :goto_2
    if-lez v7, :cond_0

    add-int/lit8 v8, v4, 0x4

    invoke-virtual {p0, v8}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v8

    invoke-virtual {p0, v8, p3}, Lcom/esotericsoftware/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    move-result v8

    xor-int/2addr v6, v8

    add-int/lit8 v4, v4, 0x2

    add-int/lit8 v7, v7, -0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x4

    new-instance v7, Lcom/esotericsoftware/asm/Item;

    invoke-direct {v7, v3}, Lcom/esotericsoftware/asm/Item;-><init>(I)V

    const v8, 0x7fffffff

    and-int/2addr v6, v8

    invoke-virtual {v7, v5, v6}, Lcom/esotericsoftware/asm/Item;->a(II)V

    iget v5, v7, Lcom/esotericsoftware/asm/Item;->j:I

    array-length v6, p2

    rem-int/2addr v5, v6

    aget-object v6, p2, v5

    iput-object v6, v7, Lcom/esotericsoftware/asm/Item;->k:Lcom/esotericsoftware/asm/Item;

    aput-object v7, p2, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result p2

    new-instance p3, Lcom/esotericsoftware/asm/ByteVector;

    add-int/lit8 v0, p2, 0x3e

    invoke-direct {p3, v0}, Lcom/esotericsoftware/asm/ByteVector;-><init>(I)V

    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    add-int/lit8 p2, p2, -0x2

    invoke-virtual {p3, p0, v2, p2}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    iput v1, p1, Lcom/esotericsoftware/asm/ClassWriter;->z:I

    iput-object p3, p1, Lcom/esotericsoftware/asm/ClassWriter;->A:Lcom/esotericsoftware/asm/ByteVector;

    return-void

    :cond_2
    add-int/lit8 v2, v0, 0x4

    invoke-virtual {p0, v2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x6

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, -0x1

    goto/16 :goto_0

    :cond_3
    return-void
.end method

.method private a(Lcom/esotericsoftware/asm/Context;)V
    .locals 9

    .line 2421
    iget-object v0, p1, Lcom/esotericsoftware/asm/Context;->g:Ljava/lang/String;

    iget-object v1, p1, Lcom/esotericsoftware/asm/Context;->s:[Ljava/lang/Object;

    iget v2, p1, Lcom/esotericsoftware/asm/Context;->e:I

    and-int/lit8 v2, v2, 0x8

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    const-string v2, "<init>"

    iget-object v5, p1, Lcom/esotericsoftware/asm/Context;->f:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object p0, Lcom/esotericsoftware/asm/Opcodes;->UNINITIALIZED_THIS:Ljava/lang/Integer;

    aput-object p0, v1, v4

    :goto_0
    move v4, v3

    goto :goto_1

    :cond_0
    iget v2, p0, Lcom/esotericsoftware/asm/ClassReader;->header:I

    add-int/lit8 v2, v2, 0x2

    iget-object v5, p1, Lcom/esotericsoftware/asm/Context;->c:[C

    invoke-virtual {p0, v2, v5}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v4

    goto :goto_0

    :cond_1
    :goto_1
    move p0, v3

    :goto_2
    add-int/lit8 v2, p0, 0x1

    invoke-virtual {v0, p0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x46

    if-eq v5, v6, :cond_9

    const/16 v6, 0x3b

    const/16 v7, 0x4c

    if-eq v5, v7, :cond_7

    const/16 v8, 0x53

    if-eq v5, v8, :cond_6

    const/16 v8, 0x49

    if-eq v5, v8, :cond_6

    const/16 v8, 0x4a

    if-eq v5, v8, :cond_5

    const/16 v8, 0x5a

    if-eq v5, v8, :cond_6

    const/16 v8, 0x5b

    if-eq v5, v8, :cond_2

    packed-switch v5, :pswitch_data_0

    iput v4, p1, Lcom/esotericsoftware/asm/Context;->q:I

    return-void

    :pswitch_0
    add-int/lit8 p0, v4, 0x1

    sget-object v5, Lcom/esotericsoftware/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    aput-object v5, v1, v4

    :goto_3
    move v4, p0

    move p0, v2

    goto :goto_2

    :cond_2
    :goto_4
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v8, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v7, :cond_4

    :goto_5
    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v6, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v5, v4, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v0, p0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v4

    move p0, v2

    move v4, v5

    goto :goto_2

    :cond_5
    add-int/lit8 p0, v4, 0x1

    sget-object v5, Lcom/esotericsoftware/asm/Opcodes;->LONG:Ljava/lang/Integer;

    aput-object v5, v1, v4

    goto :goto_3

    :cond_6
    :pswitch_1
    add-int/lit8 p0, v4, 0x1

    sget-object v5, Lcom/esotericsoftware/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    aput-object v5, v1, v4

    goto :goto_3

    :cond_7
    move p0, v2

    :goto_6
    invoke-virtual {v0, p0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v6, :cond_8

    add-int/lit8 p0, p0, 0x1

    goto :goto_6

    :cond_8
    add-int/lit8 v5, v4, 0x1

    add-int/lit8 v6, p0, 0x1

    invoke-virtual {v0, v2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v4

    move v4, v5

    move p0, v6

    goto :goto_2

    :cond_9
    add-int/lit8 p0, v4, 0x1

    sget-object v5, Lcom/esotericsoftware/asm/Opcodes;->FLOAT:Ljava/lang/Integer;

    aput-object v5, v1, v4

    goto :goto_3

    nop

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lcom/esotericsoftware/asm/MethodVisitor;Lcom/esotericsoftware/asm/Context;I)V
    .locals 41

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move/from16 v5, p3

    .line 8
    .line 9
    iget-object v9, v1, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 10
    .line 11
    iget-object v4, v8, Lcom/esotericsoftware/asm/Context;->c:[C

    .line 12
    .line 13
    invoke-virtual {v1, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    add-int/lit8 v0, v5, 0x2

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 20
    .line 21
    .line 22
    move-result v11

    .line 23
    add-int/lit8 v0, v5, 0x4

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 26
    .line 27
    .line 28
    move-result v12

    .line 29
    add-int/lit8 v13, v5, 0x8

    .line 30
    .line 31
    add-int v14, v13, v12

    .line 32
    .line 33
    add-int/lit8 v0, v12, 0x2

    .line 34
    .line 35
    new-array v6, v0, [Lcom/esotericsoftware/asm/Label;

    .line 36
    .line 37
    iput-object v6, v8, Lcom/esotericsoftware/asm/Context;->h:[Lcom/esotericsoftware/asm/Label;

    .line 38
    .line 39
    add-int/lit8 v0, v12, 0x1

    .line 40
    .line 41
    invoke-virtual {v1, v0, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 42
    .line 43
    .line 44
    move v0, v13

    .line 45
    :goto_0
    const/16 v15, 0x84

    .line 46
    .line 47
    if-ge v0, v14, :cond_3

    .line 48
    .line 49
    sub-int v3, v0, v13

    .line 50
    .line 51
    const/16 v16, 0x1

    .line 52
    .line 53
    aget-byte v2, v9, v0

    .line 54
    .line 55
    and-int/lit16 v2, v2, 0xff

    .line 56
    .line 57
    sget-object v17, Lcom/esotericsoftware/asm/ClassWriter;->a:[B

    .line 58
    .line 59
    aget-byte v2, v17, v2

    .line 60
    .line 61
    packed-switch v2, :pswitch_data_0

    .line 62
    .line 63
    .line 64
    :cond_0
    :pswitch_0
    add-int/lit8 v0, v0, 0x4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_1
    add-int/lit8 v2, v0, 0x1

    .line 68
    .line 69
    aget-byte v2, v9, v2

    .line 70
    .line 71
    and-int/lit16 v2, v2, 0xff

    .line 72
    .line 73
    if-ne v2, v15, :cond_0

    .line 74
    .line 75
    add-int/lit8 v0, v0, 0x6

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_2
    add-int/lit8 v0, v0, 0x4

    .line 79
    .line 80
    and-int/lit8 v2, v3, 0x3

    .line 81
    .line 82
    sub-int/2addr v0, v2

    .line 83
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    add-int/2addr v2, v3

    .line 88
    invoke-virtual {v1, v2, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 89
    .line 90
    .line 91
    add-int/lit8 v2, v0, 0x4

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    :goto_1
    if-lez v2, :cond_1

    .line 98
    .line 99
    add-int/lit8 v15, v0, 0xc

    .line 100
    .line 101
    invoke-virtual {v1, v15}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    add-int/2addr v15, v3

    .line 106
    invoke-virtual {v1, v15, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 107
    .line 108
    .line 109
    add-int/lit8 v0, v0, 0x8

    .line 110
    .line 111
    add-int/lit8 v2, v2, -0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    add-int/lit8 v0, v0, 0x8

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :pswitch_3
    add-int/lit8 v0, v0, 0x4

    .line 118
    .line 119
    and-int/lit8 v2, v3, 0x3

    .line 120
    .line 121
    sub-int/2addr v0, v2

    .line 122
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    add-int/2addr v2, v3

    .line 127
    invoke-virtual {v1, v2, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 128
    .line 129
    .line 130
    add-int/lit8 v2, v0, 0x8

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    add-int/lit8 v15, v0, 0x4

    .line 137
    .line 138
    invoke-virtual {v1, v15}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 139
    .line 140
    .line 141
    move-result v15

    .line 142
    sub-int/2addr v2, v15

    .line 143
    add-int/lit8 v2, v2, 0x1

    .line 144
    .line 145
    :goto_2
    if-lez v2, :cond_2

    .line 146
    .line 147
    add-int/lit8 v15, v0, 0xc

    .line 148
    .line 149
    invoke-virtual {v1, v15}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    add-int/2addr v15, v3

    .line 154
    invoke-virtual {v1, v15, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 155
    .line 156
    .line 157
    add-int/lit8 v0, v0, 0x4

    .line 158
    .line 159
    add-int/lit8 v2, v2, -0x1

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_2
    add-int/lit8 v0, v0, 0xc

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :pswitch_4
    add-int/lit8 v2, v0, 0x1

    .line 166
    .line 167
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    add-int/2addr v2, v3

    .line 172
    invoke-virtual {v1, v2, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 173
    .line 174
    .line 175
    :pswitch_5
    add-int/lit8 v0, v0, 0x5

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :pswitch_6
    add-int/lit8 v2, v0, 0x1

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassReader;->readShort(I)S

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    add-int/2addr v2, v3

    .line 186
    invoke-virtual {v1, v2, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 187
    .line 188
    .line 189
    :pswitch_7
    add-int/lit8 v0, v0, 0x3

    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :pswitch_8
    add-int/lit8 v0, v0, 0x2

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :pswitch_9
    add-int/lit8 v0, v0, 0x1

    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_3
    const/16 v16, 0x1

    .line 202
    .line 203
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    :goto_3
    if-lez v2, :cond_4

    .line 208
    .line 209
    add-int/lit8 v3, v0, 0x2

    .line 210
    .line 211
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    invoke-virtual {v1, v3, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    add-int/lit8 v15, v0, 0x4

    .line 220
    .line 221
    invoke-virtual {v1, v15}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 222
    .line 223
    .line 224
    move-result v15

    .line 225
    invoke-virtual {v1, v15, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 226
    .line 227
    .line 228
    move-result-object v15

    .line 229
    move/from16 v18, v0

    .line 230
    .line 231
    add-int/lit8 v0, v18, 0x6

    .line 232
    .line 233
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    invoke-virtual {v1, v0, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    move/from16 v19, v2

    .line 242
    .line 243
    iget-object v2, v1, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 244
    .line 245
    move-object/from16 v20, v2

    .line 246
    .line 247
    add-int/lit8 v2, v18, 0x8

    .line 248
    .line 249
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 250
    .line 251
    .line 252
    move-result v18

    .line 253
    move/from16 v21, v2

    .line 254
    .line 255
    aget v2, v20, v18

    .line 256
    .line 257
    invoke-virtual {v1, v2, v4}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v7, v3, v15, v0, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTryCatchBlock(Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    add-int/lit8 v2, v19, -0x1

    .line 265
    .line 266
    move/from16 v0, v21

    .line 267
    .line 268
    const/16 v15, 0x84

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_4
    move/from16 v18, v0

    .line 272
    .line 273
    add-int/lit8 v0, v18, 0x2

    .line 274
    .line 275
    iget v2, v8, Lcom/esotericsoftware/asm/Context;->b:I

    .line 276
    .line 277
    const/16 v15, 0x8

    .line 278
    .line 279
    and-int/2addr v2, v15

    .line 280
    if-eqz v2, :cond_5

    .line 281
    .line 282
    move/from16 v2, v16

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_5
    const/4 v2, 0x0

    .line 286
    :goto_4
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 287
    .line 288
    .line 289
    move-result v18

    .line 290
    move/from16 v27, v16

    .line 291
    .line 292
    move/from16 v21, v18

    .line 293
    .line 294
    const/16 v22, 0x0

    .line 295
    .line 296
    const/16 v23, 0x0

    .line 297
    .line 298
    const/16 v24, 0x0

    .line 299
    .line 300
    const/16 v25, 0x0

    .line 301
    .line 302
    const/16 v26, 0x0

    .line 303
    .line 304
    const/16 v28, 0x0

    .line 305
    .line 306
    const/16 v29, 0x0

    .line 307
    .line 308
    const/16 v30, -0x1

    .line 309
    .line 310
    const/16 v31, -0x1

    .line 311
    .line 312
    move/from16 v18, v0

    .line 313
    .line 314
    const/4 v0, 0x0

    .line 315
    :goto_5
    if-lez v21, :cond_1d

    .line 316
    .line 317
    const/16 v33, 0x0

    .line 318
    .line 319
    add-int/lit8 v3, v18, 0x2

    .line 320
    .line 321
    invoke-virtual {v1, v3, v4}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    const-string v15, "LocalVariableTable"

    .line 326
    .line 327
    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v15

    .line 331
    if-eqz v15, :cond_b

    .line 332
    .line 333
    iget v3, v8, Lcom/esotericsoftware/asm/Context;->b:I

    .line 334
    .line 335
    and-int/lit8 v3, v3, 0x2

    .line 336
    .line 337
    if-nez v3, :cond_9

    .line 338
    .line 339
    add-int/lit8 v3, v18, 0x8

    .line 340
    .line 341
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 342
    .line 343
    .line 344
    move-result v15

    .line 345
    move/from16 v25, v18

    .line 346
    .line 347
    :goto_6
    if-lez v15, :cond_8

    .line 348
    .line 349
    move-object/from16 v35, v0

    .line 350
    .line 351
    add-int/lit8 v0, v25, 0xa

    .line 352
    .line 353
    move/from16 v36, v2

    .line 354
    .line 355
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    aget-object v34, v6, v2

    .line 360
    .line 361
    if-nez v34, :cond_6

    .line 362
    .line 363
    move/from16 v34, v0

    .line 364
    .line 365
    invoke-virtual {v1, v2, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    move/from16 v37, v2

    .line 370
    .line 371
    iget v2, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 372
    .line 373
    or-int/lit8 v2, v2, 0x1

    .line 374
    .line 375
    iput v2, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 376
    .line 377
    goto :goto_7

    .line 378
    :cond_6
    move/from16 v34, v0

    .line 379
    .line 380
    move/from16 v37, v2

    .line 381
    .line 382
    :goto_7
    add-int/lit8 v0, v25, 0xc

    .line 383
    .line 384
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    add-int v0, v0, v37

    .line 389
    .line 390
    aget-object v2, v6, v0

    .line 391
    .line 392
    if-nez v2, :cond_7

    .line 393
    .line 394
    invoke-virtual {v1, v0, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    iget v2, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 399
    .line 400
    or-int/lit8 v2, v2, 0x1

    .line 401
    .line 402
    iput v2, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 403
    .line 404
    :cond_7
    add-int/lit8 v15, v15, -0x1

    .line 405
    .line 406
    move/from16 v25, v34

    .line 407
    .line 408
    move-object/from16 v0, v35

    .line 409
    .line 410
    move/from16 v2, v36

    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_8
    move-object/from16 v35, v0

    .line 414
    .line 415
    move-object v0, v6

    .line 416
    move-object v6, v1

    .line 417
    move-object v1, v0

    .line 418
    move/from16 v38, v2

    .line 419
    .line 420
    move/from16 v25, v3

    .line 421
    .line 422
    move-object/from16 v37, v9

    .line 423
    .line 424
    move/from16 v9, v33

    .line 425
    .line 426
    move-object/from16 v0, v35

    .line 427
    .line 428
    goto/16 :goto_14

    .line 429
    .line 430
    :cond_9
    move-object/from16 v35, v0

    .line 431
    .line 432
    move/from16 v36, v2

    .line 433
    .line 434
    :cond_a
    move/from16 v2, v33

    .line 435
    .line 436
    goto/16 :goto_11

    .line 437
    .line 438
    :cond_b
    move-object/from16 v35, v0

    .line 439
    .line 440
    move/from16 v36, v2

    .line 441
    .line 442
    const-string v0, "LocalVariableTypeTable"

    .line 443
    .line 444
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-eqz v0, :cond_c

    .line 449
    .line 450
    add-int/lit8 v0, v18, 0x8

    .line 451
    .line 452
    move-object/from16 v26, v6

    .line 453
    .line 454
    move-object v6, v1

    .line 455
    move-object/from16 v1, v26

    .line 456
    .line 457
    move/from16 v26, v0

    .line 458
    .line 459
    move-object/from16 v37, v9

    .line 460
    .line 461
    move/from16 v9, v33

    .line 462
    .line 463
    move-object/from16 v0, v35

    .line 464
    .line 465
    move/from16 v38, v36

    .line 466
    .line 467
    goto/16 :goto_14

    .line 468
    .line 469
    :cond_c
    const-string v0, "LineNumberTable"

    .line 470
    .line 471
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-eqz v0, :cond_10

    .line 476
    .line 477
    iget v0, v8, Lcom/esotericsoftware/asm/Context;->b:I

    .line 478
    .line 479
    and-int/lit8 v0, v0, 0x2

    .line 480
    .line 481
    if-nez v0, :cond_a

    .line 482
    .line 483
    add-int/lit8 v0, v18, 0x8

    .line 484
    .line 485
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    move/from16 v2, v18

    .line 490
    .line 491
    :goto_8
    if-lez v0, :cond_a

    .line 492
    .line 493
    add-int/lit8 v3, v2, 0xa

    .line 494
    .line 495
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    aget-object v15, v6, v3

    .line 500
    .line 501
    if-nez v15, :cond_d

    .line 502
    .line 503
    invoke-virtual {v1, v3, v6}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 504
    .line 505
    .line 506
    move-result-object v15

    .line 507
    move/from16 v34, v0

    .line 508
    .line 509
    iget v0, v15, Lcom/esotericsoftware/asm/Label;->a:I

    .line 510
    .line 511
    or-int/lit8 v0, v0, 0x1

    .line 512
    .line 513
    iput v0, v15, Lcom/esotericsoftware/asm/Label;->a:I

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_d
    move/from16 v34, v0

    .line 517
    .line 518
    :goto_9
    aget-object v0, v6, v3

    .line 519
    .line 520
    :goto_a
    iget v3, v0, Lcom/esotericsoftware/asm/Label;->b:I

    .line 521
    .line 522
    if-lez v3, :cond_f

    .line 523
    .line 524
    iget-object v3, v0, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 525
    .line 526
    if-nez v3, :cond_e

    .line 527
    .line 528
    new-instance v3, Lcom/esotericsoftware/asm/Label;

    .line 529
    .line 530
    invoke-direct {v3}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 531
    .line 532
    .line 533
    iput-object v3, v0, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 534
    .line 535
    :cond_e
    iget-object v0, v0, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 536
    .line 537
    goto :goto_a

    .line 538
    :cond_f
    add-int/lit8 v3, v2, 0xc

    .line 539
    .line 540
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    iput v3, v0, Lcom/esotericsoftware/asm/Label;->b:I

    .line 545
    .line 546
    add-int/lit8 v2, v2, 0x4

    .line 547
    .line 548
    add-int/lit8 v0, v34, -0x1

    .line 549
    .line 550
    goto :goto_8

    .line 551
    :cond_10
    const-string v0, "RuntimeVisibleTypeAnnotations"

    .line 552
    .line 553
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    if-eqz v0, :cond_13

    .line 558
    .line 559
    add-int/lit8 v0, v18, 0x8

    .line 560
    .line 561
    move/from16 v2, v16

    .line 562
    .line 563
    invoke-direct {v1, v7, v8, v0, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/MethodVisitor;Lcom/esotericsoftware/asm/Context;IZ)[I

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    array-length v3, v0

    .line 568
    if-eqz v3, :cond_12

    .line 569
    .line 570
    aget v3, v0, v33

    .line 571
    .line 572
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ClassReader;->readByte(I)I

    .line 573
    .line 574
    .line 575
    move-result v3

    .line 576
    const/16 v15, 0x43

    .line 577
    .line 578
    if-ge v3, v15, :cond_11

    .line 579
    .line 580
    goto :goto_b

    .line 581
    :cond_11
    aget v3, v0, v33

    .line 582
    .line 583
    add-int/2addr v3, v2

    .line 584
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    move/from16 v30, v2

    .line 589
    .line 590
    goto :goto_c

    .line 591
    :cond_12
    :goto_b
    const/16 v30, -0x1

    .line 592
    .line 593
    :goto_c
    move-object/from16 v16, v6

    .line 594
    .line 595
    move-object v6, v1

    .line 596
    move-object/from16 v1, v16

    .line 597
    .line 598
    move-object/from16 v37, v9

    .line 599
    .line 600
    move/from16 v9, v33

    .line 601
    .line 602
    move/from16 v38, v36

    .line 603
    .line 604
    const/16 v16, 0x1

    .line 605
    .line 606
    goto/16 :goto_14

    .line 607
    .line 608
    :cond_13
    const-string v0, "RuntimeInvisibleTypeAnnotations"

    .line 609
    .line 610
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    if-eqz v0, :cond_16

    .line 615
    .line 616
    add-int/lit8 v0, v18, 0x8

    .line 617
    .line 618
    move/from16 v2, v33

    .line 619
    .line 620
    invoke-direct {v1, v7, v8, v0, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/MethodVisitor;Lcom/esotericsoftware/asm/Context;IZ)[I

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    array-length v3, v0

    .line 625
    if-eqz v3, :cond_14

    .line 626
    .line 627
    aget v3, v0, v2

    .line 628
    .line 629
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ClassReader;->readByte(I)I

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    const/16 v15, 0x43

    .line 634
    .line 635
    if-ge v3, v15, :cond_15

    .line 636
    .line 637
    :cond_14
    const/16 v16, 0x1

    .line 638
    .line 639
    goto :goto_d

    .line 640
    :cond_15
    aget v3, v0, v2

    .line 641
    .line 642
    const/16 v16, 0x1

    .line 643
    .line 644
    add-int/lit8 v3, v3, 0x1

    .line 645
    .line 646
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 647
    .line 648
    .line 649
    move-result v3

    .line 650
    move/from16 v31, v3

    .line 651
    .line 652
    goto :goto_e

    .line 653
    :goto_d
    const/16 v31, -0x1

    .line 654
    .line 655
    :goto_e
    move-object/from16 v24, v6

    .line 656
    .line 657
    move-object v6, v1

    .line 658
    move-object/from16 v1, v24

    .line 659
    .line 660
    move-object/from16 v24, v0

    .line 661
    .line 662
    :goto_f
    move-object/from16 v37, v9

    .line 663
    .line 664
    :goto_10
    move-object/from16 v0, v35

    .line 665
    .line 666
    move/from16 v38, v36

    .line 667
    .line 668
    move v9, v2

    .line 669
    goto/16 :goto_14

    .line 670
    .line 671
    :cond_16
    move/from16 v2, v33

    .line 672
    .line 673
    const/16 v16, 0x1

    .line 674
    .line 675
    const-string v0, "StackMapTable"

    .line 676
    .line 677
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    if-eqz v0, :cond_17

    .line 682
    .line 683
    iget v0, v8, Lcom/esotericsoftware/asm/Context;->b:I

    .line 684
    .line 685
    and-int/lit8 v0, v0, 0x4

    .line 686
    .line 687
    if-nez v0, :cond_18

    .line 688
    .line 689
    add-int/lit8 v0, v18, 0xa

    .line 690
    .line 691
    add-int/lit8 v3, v18, 0x4

    .line 692
    .line 693
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    add-int/lit8 v15, v18, 0x8

    .line 698
    .line 699
    invoke-virtual {v1, v15}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 700
    .line 701
    .line 702
    move-result v15

    .line 703
    move-object/from16 v22, v6

    .line 704
    .line 705
    move-object v6, v1

    .line 706
    move-object/from16 v1, v22

    .line 707
    .line 708
    move/from16 v22, v0

    .line 709
    .line 710
    move/from16 v23, v3

    .line 711
    .line 712
    move-object/from16 v37, v9

    .line 713
    .line 714
    move/from16 v29, v15

    .line 715
    .line 716
    goto :goto_10

    .line 717
    :cond_17
    const-string v0, "StackMap"

    .line 718
    .line 719
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v0

    .line 723
    if-eqz v0, :cond_19

    .line 724
    .line 725
    iget v0, v8, Lcom/esotericsoftware/asm/Context;->b:I

    .line 726
    .line 727
    and-int/lit8 v0, v0, 0x4

    .line 728
    .line 729
    if-nez v0, :cond_18

    .line 730
    .line 731
    add-int/lit8 v0, v18, 0xa

    .line 732
    .line 733
    add-int/lit8 v3, v18, 0x4

    .line 734
    .line 735
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 736
    .line 737
    .line 738
    move-result v3

    .line 739
    add-int/lit8 v15, v18, 0x8

    .line 740
    .line 741
    invoke-virtual {v1, v15}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 742
    .line 743
    .line 744
    move-result v15

    .line 745
    move-object/from16 v22, v6

    .line 746
    .line 747
    move-object v6, v1

    .line 748
    move-object/from16 v1, v22

    .line 749
    .line 750
    move/from16 v22, v0

    .line 751
    .line 752
    move/from16 v27, v2

    .line 753
    .line 754
    move/from16 v23, v3

    .line 755
    .line 756
    move-object/from16 v37, v9

    .line 757
    .line 758
    move/from16 v29, v15

    .line 759
    .line 760
    move-object/from16 v0, v35

    .line 761
    .line 762
    move/from16 v38, v36

    .line 763
    .line 764
    move/from16 v9, v27

    .line 765
    .line 766
    goto/16 :goto_14

    .line 767
    .line 768
    :cond_18
    :goto_11
    move-object v0, v6

    .line 769
    move-object v6, v1

    .line 770
    move-object v1, v0

    .line 771
    goto :goto_f

    .line 772
    :cond_19
    move v0, v2

    .line 773
    move-object/from16 v15, v28

    .line 774
    .line 775
    :goto_12
    iget-object v2, v8, Lcom/esotericsoftware/asm/Context;->a:[Lcom/esotericsoftware/asm/Attribute;

    .line 776
    .line 777
    move-object/from16 v34, v4

    .line 778
    .line 779
    array-length v4, v2

    .line 780
    if-ge v0, v4, :cond_1c

    .line 781
    .line 782
    aget-object v2, v2, v0

    .line 783
    .line 784
    iget-object v2, v2, Lcom/esotericsoftware/asm/Attribute;->type:Ljava/lang/String;

    .line 785
    .line 786
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    if-eqz v2, :cond_1a

    .line 791
    .line 792
    iget-object v2, v8, Lcom/esotericsoftware/asm/Context;->a:[Lcom/esotericsoftware/asm/Attribute;

    .line 793
    .line 794
    aget-object v2, v2, v0

    .line 795
    .line 796
    move v4, v0

    .line 797
    move-object v0, v2

    .line 798
    add-int/lit8 v2, v18, 0x8

    .line 799
    .line 800
    move-object/from16 v28, v0

    .line 801
    .line 802
    add-int/lit8 v0, v18, 0x4

    .line 803
    .line 804
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 805
    .line 806
    .line 807
    move-result v0

    .line 808
    move-object/from16 v33, v3

    .line 809
    .line 810
    move v3, v0

    .line 811
    move-object/from16 v0, v28

    .line 812
    .line 813
    move-object/from16 v28, v33

    .line 814
    .line 815
    move/from16 v33, v4

    .line 816
    .line 817
    move-object/from16 v37, v9

    .line 818
    .line 819
    move-object/from16 v4, v34

    .line 820
    .line 821
    move-object/from16 v39, v35

    .line 822
    .line 823
    move/from16 v38, v36

    .line 824
    .line 825
    const/4 v9, 0x0

    .line 826
    invoke-virtual/range {v0 .. v6}, Lcom/esotericsoftware/asm/Attribute;->read(Lcom/esotericsoftware/asm/ClassReader;II[CI[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Attribute;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    move-object/from16 v40, v6

    .line 831
    .line 832
    move-object v6, v1

    .line 833
    move-object/from16 v1, v40

    .line 834
    .line 835
    if-eqz v0, :cond_1b

    .line 836
    .line 837
    iput-object v15, v0, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 838
    .line 839
    move-object v15, v0

    .line 840
    goto :goto_13

    .line 841
    :cond_1a
    move-object v4, v6

    .line 842
    move-object v6, v1

    .line 843
    move-object v1, v4

    .line 844
    move/from16 v33, v0

    .line 845
    .line 846
    move-object/from16 v28, v3

    .line 847
    .line 848
    move-object/from16 v37, v9

    .line 849
    .line 850
    move-object/from16 v4, v34

    .line 851
    .line 852
    move-object/from16 v39, v35

    .line 853
    .line 854
    move/from16 v38, v36

    .line 855
    .line 856
    const/4 v9, 0x0

    .line 857
    :cond_1b
    :goto_13
    add-int/lit8 v0, v33, 0x1

    .line 858
    .line 859
    move-object v3, v6

    .line 860
    move-object v6, v1

    .line 861
    move-object v1, v3

    .line 862
    move/from16 v5, p3

    .line 863
    .line 864
    move-object/from16 v3, v28

    .line 865
    .line 866
    move-object/from16 v9, v37

    .line 867
    .line 868
    move/from16 v36, v38

    .line 869
    .line 870
    move-object/from16 v35, v39

    .line 871
    .line 872
    goto :goto_12

    .line 873
    :cond_1c
    move-object v4, v6

    .line 874
    move-object v6, v1

    .line 875
    move-object v1, v4

    .line 876
    move-object/from16 v37, v9

    .line 877
    .line 878
    move-object/from16 v4, v34

    .line 879
    .line 880
    move-object/from16 v39, v35

    .line 881
    .line 882
    move/from16 v38, v36

    .line 883
    .line 884
    const/4 v9, 0x0

    .line 885
    move-object/from16 v28, v15

    .line 886
    .line 887
    move-object/from16 v0, v39

    .line 888
    .line 889
    :goto_14
    add-int/lit8 v2, v18, 0x4

    .line 890
    .line 891
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 892
    .line 893
    .line 894
    move-result v2

    .line 895
    add-int/lit8 v2, v2, 0x6

    .line 896
    .line 897
    add-int v18, v2, v18

    .line 898
    .line 899
    add-int/lit8 v21, v21, -0x1

    .line 900
    .line 901
    move-object v2, v6

    .line 902
    move-object v6, v1

    .line 903
    move-object v1, v2

    .line 904
    move/from16 v5, p3

    .line 905
    .line 906
    move-object/from16 v9, v37

    .line 907
    .line 908
    move/from16 v2, v38

    .line 909
    .line 910
    goto/16 :goto_5

    .line 911
    .line 912
    :cond_1d
    move-object/from16 v37, v6

    .line 913
    .line 914
    move-object v6, v1

    .line 915
    move-object/from16 v1, v37

    .line 916
    .line 917
    move-object/from16 v39, v0

    .line 918
    .line 919
    move/from16 v38, v2

    .line 920
    .line 921
    move-object/from16 v37, v9

    .line 922
    .line 923
    const/4 v9, 0x0

    .line 924
    if-eqz v22, :cond_21

    .line 925
    .line 926
    const/4 v0, -0x1

    .line 927
    iput v0, v8, Lcom/esotericsoftware/asm/Context;->o:I

    .line 928
    .line 929
    iput v9, v8, Lcom/esotericsoftware/asm/Context;->p:I

    .line 930
    .line 931
    iput v9, v8, Lcom/esotericsoftware/asm/Context;->q:I

    .line 932
    .line 933
    iput v9, v8, Lcom/esotericsoftware/asm/Context;->r:I

    .line 934
    .line 935
    iput v9, v8, Lcom/esotericsoftware/asm/Context;->t:I

    .line 936
    .line 937
    new-array v0, v11, [Ljava/lang/Object;

    .line 938
    .line 939
    iput-object v0, v8, Lcom/esotericsoftware/asm/Context;->s:[Ljava/lang/Object;

    .line 940
    .line 941
    new-array v0, v10, [Ljava/lang/Object;

    .line 942
    .line 943
    iput-object v0, v8, Lcom/esotericsoftware/asm/Context;->u:[Ljava/lang/Object;

    .line 944
    .line 945
    move/from16 v15, v38

    .line 946
    .line 947
    if-eqz v15, :cond_1e

    .line 948
    .line 949
    invoke-direct {v6, v8}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;)V

    .line 950
    .line 951
    .line 952
    :cond_1e
    move/from16 v0, v22

    .line 953
    .line 954
    :goto_15
    add-int v2, v22, v23

    .line 955
    .line 956
    add-int/lit8 v2, v2, -0x2

    .line 957
    .line 958
    if-ge v0, v2, :cond_20

    .line 959
    .line 960
    aget-byte v2, v37, v0

    .line 961
    .line 962
    const/16 v3, 0x8

    .line 963
    .line 964
    if-ne v2, v3, :cond_1f

    .line 965
    .line 966
    add-int/lit8 v2, v0, 0x1

    .line 967
    .line 968
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 969
    .line 970
    .line 971
    move-result v2

    .line 972
    if-ltz v2, :cond_1f

    .line 973
    .line 974
    if-ge v2, v12, :cond_1f

    .line 975
    .line 976
    add-int v3, v13, v2

    .line 977
    .line 978
    aget-byte v3, v37, v3

    .line 979
    .line 980
    and-int/lit16 v3, v3, 0xff

    .line 981
    .line 982
    const/16 v5, 0xbb

    .line 983
    .line 984
    if-ne v3, v5, :cond_1f

    .line 985
    .line 986
    invoke-virtual {v6, v2, v1}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    .line 987
    .line 988
    .line 989
    :cond_1f
    add-int/lit8 v0, v0, 0x1

    .line 990
    .line 991
    goto :goto_15

    .line 992
    :cond_20
    move-object v0, v8

    .line 993
    goto :goto_16

    .line 994
    :cond_21
    move/from16 v15, v38

    .line 995
    .line 996
    const/4 v0, 0x0

    .line 997
    :goto_16
    move/from16 v18, v9

    .line 998
    .line 999
    move/from16 v21, v18

    .line 1000
    .line 1001
    move v2, v13

    .line 1002
    :goto_17
    if-ge v2, v14, :cond_3b

    .line 1003
    .line 1004
    sub-int v3, v2, v13

    .line 1005
    .line 1006
    aget-object v5, v1, v3

    .line 1007
    .line 1008
    if-eqz v5, :cond_22

    .line 1009
    .line 1010
    iget-object v9, v5, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 1011
    .line 1012
    move-object/from16 p3, v0

    .line 1013
    .line 1014
    const/4 v0, 0x0

    .line 1015
    iput-object v0, v5, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 1016
    .line 1017
    invoke-virtual {v7, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 1018
    .line 1019
    .line 1020
    iget v0, v8, Lcom/esotericsoftware/asm/Context;->b:I

    .line 1021
    .line 1022
    and-int/lit8 v0, v0, 0x2

    .line 1023
    .line 1024
    if-nez v0, :cond_23

    .line 1025
    .line 1026
    iget v0, v5, Lcom/esotericsoftware/asm/Label;->b:I

    .line 1027
    .line 1028
    if-lez v0, :cond_23

    .line 1029
    .line 1030
    invoke-virtual {v7, v0, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLineNumber(ILcom/esotericsoftware/asm/Label;)V

    .line 1031
    .line 1032
    .line 1033
    :goto_18
    if-eqz v9, :cond_23

    .line 1034
    .line 1035
    iget v0, v9, Lcom/esotericsoftware/asm/Label;->b:I

    .line 1036
    .line 1037
    invoke-virtual {v7, v0, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLineNumber(ILcom/esotericsoftware/asm/Label;)V

    .line 1038
    .line 1039
    .line 1040
    iget-object v9, v9, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 1041
    .line 1042
    goto :goto_18

    .line 1043
    :cond_22
    move-object/from16 p3, v0

    .line 1044
    .line 1045
    :cond_23
    move-object/from16 v9, p3

    .line 1046
    .line 1047
    :goto_19
    if-eqz v9, :cond_2a

    .line 1048
    .line 1049
    iget v0, v9, Lcom/esotericsoftware/asm/Context;->o:I

    .line 1050
    .line 1051
    const/4 v5, -0x1

    .line 1052
    if-eq v0, v3, :cond_25

    .line 1053
    .line 1054
    if-ne v0, v5, :cond_24

    .line 1055
    .line 1056
    goto :goto_1b

    .line 1057
    :cond_24
    move/from16 v36, v5

    .line 1058
    .line 1059
    :goto_1a
    move/from16 v0, v27

    .line 1060
    .line 1061
    move/from16 v27, v13

    .line 1062
    .line 1063
    move v13, v0

    .line 1064
    move-object/from16 v23, v1

    .line 1065
    .line 1066
    move/from16 v32, v2

    .line 1067
    .line 1068
    move-object v0, v7

    .line 1069
    move/from16 v35, v14

    .line 1070
    .line 1071
    move/from16 v7, v22

    .line 1072
    .line 1073
    move v14, v3

    .line 1074
    move/from16 v22, v12

    .line 1075
    .line 1076
    move-object v12, v4

    .line 1077
    goto/16 :goto_1e

    .line 1078
    .line 1079
    :cond_25
    :goto_1b
    if-eq v0, v5, :cond_28

    .line 1080
    .line 1081
    if-eqz v27, :cond_26

    .line 1082
    .line 1083
    if-eqz v15, :cond_27

    .line 1084
    .line 1085
    :cond_26
    move/from16 v7, v27

    .line 1086
    .line 1087
    move/from16 v27, v13

    .line 1088
    .line 1089
    move v13, v7

    .line 1090
    move-object/from16 v23, v1

    .line 1091
    .line 1092
    move/from16 v32, v2

    .line 1093
    .line 1094
    move/from16 v36, v5

    .line 1095
    .line 1096
    move/from16 v35, v14

    .line 1097
    .line 1098
    move/from16 v7, v22

    .line 1099
    .line 1100
    move v14, v3

    .line 1101
    move/from16 v22, v12

    .line 1102
    .line 1103
    move-object v12, v4

    .line 1104
    goto :goto_1c

    .line 1105
    :cond_27
    move-object v0, v1

    .line 1106
    iget v1, v9, Lcom/esotericsoftware/asm/Context;->p:I

    .line 1107
    .line 1108
    move/from16 v23, v2

    .line 1109
    .line 1110
    iget v2, v9, Lcom/esotericsoftware/asm/Context;->r:I

    .line 1111
    .line 1112
    move/from16 v32, v3

    .line 1113
    .line 1114
    iget-object v3, v9, Lcom/esotericsoftware/asm/Context;->s:[Ljava/lang/Object;

    .line 1115
    .line 1116
    move-object/from16 v35, v4

    .line 1117
    .line 1118
    iget v4, v9, Lcom/esotericsoftware/asm/Context;->t:I

    .line 1119
    .line 1120
    move/from16 v36, v5

    .line 1121
    .line 1122
    iget-object v5, v9, Lcom/esotericsoftware/asm/Context;->u:[Ljava/lang/Object;

    .line 1123
    .line 1124
    move/from16 v40, v23

    .line 1125
    .line 1126
    move-object/from16 v23, v0

    .line 1127
    .line 1128
    move-object v0, v7

    .line 1129
    move/from16 v7, v22

    .line 1130
    .line 1131
    move/from16 v22, v12

    .line 1132
    .line 1133
    move-object/from16 v12, v35

    .line 1134
    .line 1135
    move/from16 v35, v14

    .line 1136
    .line 1137
    move/from16 v14, v32

    .line 1138
    .line 1139
    move/from16 v32, v40

    .line 1140
    .line 1141
    move/from16 v40, v27

    .line 1142
    .line 1143
    move/from16 v27, v13

    .line 1144
    .line 1145
    move/from16 v13, v40

    .line 1146
    .line 1147
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 1148
    .line 1149
    .line 1150
    move-object/from16 v0, p1

    .line 1151
    .line 1152
    goto :goto_1d

    .line 1153
    :goto_1c
    iget v2, v9, Lcom/esotericsoftware/asm/Context;->q:I

    .line 1154
    .line 1155
    iget-object v3, v9, Lcom/esotericsoftware/asm/Context;->s:[Ljava/lang/Object;

    .line 1156
    .line 1157
    iget v4, v9, Lcom/esotericsoftware/asm/Context;->t:I

    .line 1158
    .line 1159
    iget-object v5, v9, Lcom/esotericsoftware/asm/Context;->u:[Ljava/lang/Object;

    .line 1160
    .line 1161
    const/4 v1, -0x1

    .line 1162
    move-object/from16 v0, p1

    .line 1163
    .line 1164
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_1d

    .line 1168
    :cond_28
    move/from16 v0, v27

    .line 1169
    .line 1170
    move/from16 v27, v13

    .line 1171
    .line 1172
    move v13, v0

    .line 1173
    move-object/from16 v23, v1

    .line 1174
    .line 1175
    move/from16 v32, v2

    .line 1176
    .line 1177
    move/from16 v36, v5

    .line 1178
    .line 1179
    move-object v0, v7

    .line 1180
    move/from16 v35, v14

    .line 1181
    .line 1182
    move/from16 v7, v22

    .line 1183
    .line 1184
    move v14, v3

    .line 1185
    move/from16 v22, v12

    .line 1186
    .line 1187
    move-object v12, v4

    .line 1188
    :goto_1d
    if-lez v29, :cond_29

    .line 1189
    .line 1190
    invoke-direct {v6, v7, v13, v15, v9}, Lcom/esotericsoftware/asm/ClassReader;->a(IZZLcom/esotericsoftware/asm/Context;)I

    .line 1191
    .line 1192
    .line 1193
    move-result v1

    .line 1194
    add-int/lit8 v29, v29, -0x1

    .line 1195
    .line 1196
    move/from16 v2, v27

    .line 1197
    .line 1198
    move/from16 v27, v13

    .line 1199
    .line 1200
    move v13, v2

    .line 1201
    move-object v7, v0

    .line 1202
    move-object v4, v12

    .line 1203
    move v3, v14

    .line 1204
    move/from16 v12, v22

    .line 1205
    .line 1206
    move/from16 v2, v32

    .line 1207
    .line 1208
    move/from16 v14, v35

    .line 1209
    .line 1210
    move/from16 v22, v1

    .line 1211
    .line 1212
    move-object/from16 v1, v23

    .line 1213
    .line 1214
    goto/16 :goto_19

    .line 1215
    .line 1216
    :cond_29
    move/from16 v1, v27

    .line 1217
    .line 1218
    move/from16 v27, v13

    .line 1219
    .line 1220
    move v13, v1

    .line 1221
    move-object v4, v12

    .line 1222
    move v3, v14

    .line 1223
    move/from16 v12, v22

    .line 1224
    .line 1225
    move-object/from16 v1, v23

    .line 1226
    .line 1227
    move/from16 v2, v32

    .line 1228
    .line 1229
    move/from16 v14, v35

    .line 1230
    .line 1231
    const/4 v9, 0x0

    .line 1232
    move/from16 v22, v7

    .line 1233
    .line 1234
    move-object v7, v0

    .line 1235
    goto/16 :goto_19

    .line 1236
    .line 1237
    :cond_2a
    const/16 v36, -0x1

    .line 1238
    .line 1239
    goto/16 :goto_1a

    .line 1240
    .line 1241
    :goto_1e
    aget-byte v1, v37, v32

    .line 1242
    .line 1243
    and-int/lit16 v1, v1, 0xff

    .line 1244
    .line 1245
    sget-object v2, Lcom/esotericsoftware/asm/ClassWriter;->a:[B

    .line 1246
    .line 1247
    aget-byte v2, v2, v1

    .line 1248
    .line 1249
    packed-switch v2, :pswitch_data_1

    .line 1250
    .line 1251
    .line 1252
    :pswitch_a
    add-int/lit8 v2, v32, 0x1

    .line 1253
    .line 1254
    invoke-virtual {v6, v2, v12}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v1

    .line 1258
    add-int/lit8 v2, v32, 0x3

    .line 1259
    .line 1260
    aget-byte v2, v37, v2

    .line 1261
    .line 1262
    and-int/lit16 v2, v2, 0xff

    .line 1263
    .line 1264
    invoke-virtual {v0, v1, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMultiANewArrayInsn(Ljava/lang/String;I)V

    .line 1265
    .line 1266
    .line 1267
    add-int/lit8 v2, v32, 0x4

    .line 1268
    .line 1269
    move/from16 v38, v7

    .line 1270
    .line 1271
    move/from16 v1, v18

    .line 1272
    .line 1273
    move/from16 v3, v30

    .line 1274
    .line 1275
    move-object/from16 v7, v39

    .line 1276
    .line 1277
    const/16 v17, 0x84

    .line 1278
    .line 1279
    const/16 v19, 0x8

    .line 1280
    .line 1281
    goto/16 :goto_2e

    .line 1282
    .line 1283
    :pswitch_b
    add-int/lit8 v2, v32, 0x1

    .line 1284
    .line 1285
    aget-byte v1, v37, v2

    .line 1286
    .line 1287
    and-int/lit16 v1, v1, 0xff

    .line 1288
    .line 1289
    const/16 v2, 0x84

    .line 1290
    .line 1291
    if-ne v1, v2, :cond_2b

    .line 1292
    .line 1293
    add-int/lit8 v1, v32, 0x2

    .line 1294
    .line 1295
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1296
    .line 1297
    .line 1298
    move-result v1

    .line 1299
    add-int/lit8 v3, v32, 0x4

    .line 1300
    .line 1301
    invoke-virtual {v6, v3}, Lcom/esotericsoftware/asm/ClassReader;->readShort(I)S

    .line 1302
    .line 1303
    .line 1304
    move-result v3

    .line 1305
    invoke-virtual {v0, v1, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitIincInsn(II)V

    .line 1306
    .line 1307
    .line 1308
    add-int/lit8 v1, v32, 0x6

    .line 1309
    .line 1310
    :goto_1f
    move/from16 v17, v2

    .line 1311
    .line 1312
    move/from16 v38, v7

    .line 1313
    .line 1314
    move/from16 v3, v30

    .line 1315
    .line 1316
    move-object/from16 v7, v39

    .line 1317
    .line 1318
    const/16 v19, 0x8

    .line 1319
    .line 1320
    move v2, v1

    .line 1321
    move/from16 v1, v18

    .line 1322
    .line 1323
    goto/16 :goto_2e

    .line 1324
    .line 1325
    :cond_2b
    add-int/lit8 v3, v32, 0x2

    .line 1326
    .line 1327
    invoke-virtual {v6, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1328
    .line 1329
    .line 1330
    move-result v3

    .line 1331
    invoke-virtual {v0, v1, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1332
    .line 1333
    .line 1334
    add-int/lit8 v1, v32, 0x4

    .line 1335
    .line 1336
    goto :goto_1f

    .line 1337
    :pswitch_c
    const/16 v2, 0x84

    .line 1338
    .line 1339
    add-int/lit8 v1, v32, 0x4

    .line 1340
    .line 1341
    and-int/lit8 v3, v14, 0x3

    .line 1342
    .line 1343
    sub-int/2addr v1, v3

    .line 1344
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 1345
    .line 1346
    .line 1347
    move-result v3

    .line 1348
    add-int/2addr v3, v14

    .line 1349
    add-int/lit8 v4, v1, 0x4

    .line 1350
    .line 1351
    invoke-virtual {v6, v4}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 1352
    .line 1353
    .line 1354
    move-result v4

    .line 1355
    new-array v5, v4, [I

    .line 1356
    .line 1357
    new-array v2, v4, [Lcom/esotericsoftware/asm/Label;

    .line 1358
    .line 1359
    const/16 v19, 0x8

    .line 1360
    .line 1361
    add-int/lit8 v1, v1, 0x8

    .line 1362
    .line 1363
    move/from16 p3, v3

    .line 1364
    .line 1365
    const/4 v3, 0x0

    .line 1366
    :goto_20
    if-ge v3, v4, :cond_2c

    .line 1367
    .line 1368
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 1369
    .line 1370
    .line 1371
    move-result v32

    .line 1372
    aput v32, v5, v3

    .line 1373
    .line 1374
    move/from16 v32, v1

    .line 1375
    .line 1376
    add-int/lit8 v1, v32, 0x4

    .line 1377
    .line 1378
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 1379
    .line 1380
    .line 1381
    move-result v1

    .line 1382
    add-int/2addr v1, v14

    .line 1383
    aget-object v1, v23, v1

    .line 1384
    .line 1385
    aput-object v1, v2, v3

    .line 1386
    .line 1387
    add-int/lit8 v1, v32, 0x8

    .line 1388
    .line 1389
    add-int/lit8 v3, v3, 0x1

    .line 1390
    .line 1391
    goto :goto_20

    .line 1392
    :cond_2c
    move/from16 v32, v1

    .line 1393
    .line 1394
    aget-object v1, v23, p3

    .line 1395
    .line 1396
    invoke-virtual {v0, v1, v5, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLookupSwitchInsn(Lcom/esotericsoftware/asm/Label;[I[Lcom/esotericsoftware/asm/Label;)V

    .line 1397
    .line 1398
    .line 1399
    move/from16 v38, v7

    .line 1400
    .line 1401
    move/from16 v1, v18

    .line 1402
    .line 1403
    move/from16 v3, v30

    .line 1404
    .line 1405
    move/from16 v2, v32

    .line 1406
    .line 1407
    :goto_21
    move-object/from16 v7, v39

    .line 1408
    .line 1409
    const/16 v17, 0x84

    .line 1410
    .line 1411
    goto/16 :goto_2e

    .line 1412
    .line 1413
    :pswitch_d
    const/16 v19, 0x8

    .line 1414
    .line 1415
    add-int/lit8 v2, v32, 0x4

    .line 1416
    .line 1417
    and-int/lit8 v1, v14, 0x3

    .line 1418
    .line 1419
    sub-int/2addr v2, v1

    .line 1420
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 1421
    .line 1422
    .line 1423
    move-result v1

    .line 1424
    add-int/2addr v1, v14

    .line 1425
    add-int/lit8 v3, v2, 0x4

    .line 1426
    .line 1427
    invoke-virtual {v6, v3}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 1428
    .line 1429
    .line 1430
    move-result v3

    .line 1431
    add-int/lit8 v4, v2, 0x8

    .line 1432
    .line 1433
    invoke-virtual {v6, v4}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 1434
    .line 1435
    .line 1436
    move-result v4

    .line 1437
    sub-int v5, v4, v3

    .line 1438
    .line 1439
    add-int/lit8 v5, v5, 0x1

    .line 1440
    .line 1441
    move/from16 p3, v1

    .line 1442
    .line 1443
    new-array v1, v5, [Lcom/esotericsoftware/asm/Label;

    .line 1444
    .line 1445
    add-int/lit8 v2, v2, 0xc

    .line 1446
    .line 1447
    move/from16 v38, v7

    .line 1448
    .line 1449
    const/4 v7, 0x0

    .line 1450
    :goto_22
    if-ge v7, v5, :cond_2d

    .line 1451
    .line 1452
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 1453
    .line 1454
    .line 1455
    move-result v32

    .line 1456
    add-int v32, v32, v14

    .line 1457
    .line 1458
    aget-object v32, v23, v32

    .line 1459
    .line 1460
    aput-object v32, v1, v7

    .line 1461
    .line 1462
    add-int/lit8 v2, v2, 0x4

    .line 1463
    .line 1464
    add-int/lit8 v7, v7, 0x1

    .line 1465
    .line 1466
    goto :goto_22

    .line 1467
    :cond_2d
    aget-object v5, v23, p3

    .line 1468
    .line 1469
    invoke-virtual {v0, v3, v4, v5, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTableSwitchInsn(IILcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V

    .line 1470
    .line 1471
    .line 1472
    :goto_23
    move/from16 v1, v18

    .line 1473
    .line 1474
    move/from16 v3, v30

    .line 1475
    .line 1476
    goto :goto_21

    .line 1477
    :pswitch_e
    move/from16 v38, v7

    .line 1478
    .line 1479
    const/16 v19, 0x8

    .line 1480
    .line 1481
    add-int/lit8 v2, v32, 0x1

    .line 1482
    .line 1483
    aget-byte v1, v37, v2

    .line 1484
    .line 1485
    and-int/lit16 v1, v1, 0xff

    .line 1486
    .line 1487
    add-int/lit8 v2, v32, 0x2

    .line 1488
    .line 1489
    aget-byte v2, v37, v2

    .line 1490
    .line 1491
    invoke-virtual {v0, v1, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitIincInsn(II)V

    .line 1492
    .line 1493
    .line 1494
    :goto_24
    add-int/lit8 v2, v32, 0x3

    .line 1495
    .line 1496
    goto :goto_23

    .line 1497
    :pswitch_f
    move/from16 v38, v7

    .line 1498
    .line 1499
    const/16 v19, 0x8

    .line 1500
    .line 1501
    add-int/lit8 v2, v32, 0x1

    .line 1502
    .line 1503
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1504
    .line 1505
    .line 1506
    move-result v1

    .line 1507
    invoke-virtual {v6, v1, v12}, Lcom/esotericsoftware/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v1

    .line 1511
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 1512
    .line 1513
    .line 1514
    goto :goto_24

    .line 1515
    :pswitch_10
    move/from16 v38, v7

    .line 1516
    .line 1517
    const/16 v19, 0x8

    .line 1518
    .line 1519
    add-int/lit8 v2, v32, 0x1

    .line 1520
    .line 1521
    aget-byte v1, v37, v2

    .line 1522
    .line 1523
    and-int/lit16 v1, v1, 0xff

    .line 1524
    .line 1525
    invoke-virtual {v6, v1, v12}, Lcom/esotericsoftware/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v1

    .line 1529
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 1530
    .line 1531
    .line 1532
    add-int/lit8 v2, v32, 0x2

    .line 1533
    .line 1534
    goto :goto_23

    .line 1535
    :pswitch_11
    move/from16 v38, v7

    .line 1536
    .line 1537
    const/16 v19, 0x8

    .line 1538
    .line 1539
    add-int/lit8 v1, v1, -0x21

    .line 1540
    .line 1541
    add-int/lit8 v2, v32, 0x1

    .line 1542
    .line 1543
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 1544
    .line 1545
    .line 1546
    move-result v2

    .line 1547
    add-int/2addr v2, v14

    .line 1548
    aget-object v2, v23, v2

    .line 1549
    .line 1550
    invoke-virtual {v0, v1, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitJumpInsn(ILcom/esotericsoftware/asm/Label;)V

    .line 1551
    .line 1552
    .line 1553
    :goto_25
    add-int/lit8 v2, v32, 0x5

    .line 1554
    .line 1555
    goto :goto_23

    .line 1556
    :pswitch_12
    move/from16 v38, v7

    .line 1557
    .line 1558
    const/16 v19, 0x8

    .line 1559
    .line 1560
    add-int/lit8 v2, v32, 0x1

    .line 1561
    .line 1562
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readShort(I)S

    .line 1563
    .line 1564
    .line 1565
    move-result v2

    .line 1566
    add-int/2addr v2, v14

    .line 1567
    aget-object v2, v23, v2

    .line 1568
    .line 1569
    invoke-virtual {v0, v1, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitJumpInsn(ILcom/esotericsoftware/asm/Label;)V

    .line 1570
    .line 1571
    .line 1572
    goto :goto_24

    .line 1573
    :pswitch_13
    move/from16 v38, v7

    .line 1574
    .line 1575
    const/16 v19, 0x8

    .line 1576
    .line 1577
    iget-object v1, v6, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 1578
    .line 1579
    add-int/lit8 v2, v32, 0x1

    .line 1580
    .line 1581
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1582
    .line 1583
    .line 1584
    move-result v2

    .line 1585
    aget v1, v1, v2

    .line 1586
    .line 1587
    iget-object v2, v8, Lcom/esotericsoftware/asm/Context;->d:[I

    .line 1588
    .line 1589
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1590
    .line 1591
    .line 1592
    move-result v3

    .line 1593
    aget v2, v2, v3

    .line 1594
    .line 1595
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1596
    .line 1597
    .line 1598
    move-result v3

    .line 1599
    invoke-virtual {v6, v3, v12}, Lcom/esotericsoftware/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v3

    .line 1603
    check-cast v3, Lcom/esotericsoftware/asm/Handle;

    .line 1604
    .line 1605
    add-int/lit8 v4, v2, 0x2

    .line 1606
    .line 1607
    invoke-virtual {v6, v4}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1608
    .line 1609
    .line 1610
    move-result v4

    .line 1611
    new-array v5, v4, [Ljava/lang/Object;

    .line 1612
    .line 1613
    add-int/lit8 v2, v2, 0x4

    .line 1614
    .line 1615
    const/4 v7, 0x0

    .line 1616
    :goto_26
    move/from16 p3, v1

    .line 1617
    .line 1618
    if-ge v7, v4, :cond_2e

    .line 1619
    .line 1620
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1621
    .line 1622
    .line 1623
    move-result v1

    .line 1624
    invoke-virtual {v6, v1, v12}, Lcom/esotericsoftware/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v1

    .line 1628
    aput-object v1, v5, v7

    .line 1629
    .line 1630
    add-int/lit8 v2, v2, 0x2

    .line 1631
    .line 1632
    add-int/lit8 v7, v7, 0x1

    .line 1633
    .line 1634
    move/from16 v1, p3

    .line 1635
    .line 1636
    goto :goto_26

    .line 1637
    :cond_2e
    iget-object v1, v6, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 1638
    .line 1639
    add-int/lit8 v2, p3, 0x2

    .line 1640
    .line 1641
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1642
    .line 1643
    .line 1644
    move-result v2

    .line 1645
    aget v1, v1, v2

    .line 1646
    .line 1647
    invoke-virtual {v6, v1, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v2

    .line 1651
    add-int/lit8 v1, v1, 0x2

    .line 1652
    .line 1653
    invoke-virtual {v6, v1, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v1

    .line 1657
    invoke-virtual {v0, v2, v1, v3, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Handle;[Ljava/lang/Object;)V

    .line 1658
    .line 1659
    .line 1660
    goto :goto_25

    .line 1661
    :pswitch_14
    move/from16 v38, v7

    .line 1662
    .line 1663
    const/16 v19, 0x8

    .line 1664
    .line 1665
    iget-object v2, v6, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 1666
    .line 1667
    add-int/lit8 v3, v32, 0x1

    .line 1668
    .line 1669
    invoke-virtual {v6, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1670
    .line 1671
    .line 1672
    move-result v3

    .line 1673
    aget v2, v2, v3

    .line 1674
    .line 1675
    add-int/lit8 v3, v2, -0x1

    .line 1676
    .line 1677
    aget-byte v3, v37, v3

    .line 1678
    .line 1679
    const/16 v4, 0xb

    .line 1680
    .line 1681
    if-ne v3, v4, :cond_2f

    .line 1682
    .line 1683
    move/from16 v5, v16

    .line 1684
    .line 1685
    :goto_27
    move v3, v2

    .line 1686
    goto :goto_28

    .line 1687
    :cond_2f
    const/4 v5, 0x0

    .line 1688
    goto :goto_27

    .line 1689
    :goto_28
    invoke-virtual {v6, v3, v12}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v2

    .line 1693
    iget-object v4, v6, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 1694
    .line 1695
    add-int/lit8 v3, v3, 0x2

    .line 1696
    .line 1697
    invoke-virtual {v6, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1698
    .line 1699
    .line 1700
    move-result v3

    .line 1701
    aget v3, v4, v3

    .line 1702
    .line 1703
    move v4, v3

    .line 1704
    invoke-virtual {v6, v4, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v3

    .line 1708
    add-int/lit8 v4, v4, 0x2

    .line 1709
    .line 1710
    invoke-virtual {v6, v4, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v4

    .line 1714
    const/16 v7, 0xb6

    .line 1715
    .line 1716
    if-ge v1, v7, :cond_30

    .line 1717
    .line 1718
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1719
    .line 1720
    .line 1721
    const/16 v17, 0x84

    .line 1722
    .line 1723
    goto :goto_29

    .line 1724
    :cond_30
    const/16 v17, 0x84

    .line 1725
    .line 1726
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1727
    .line 1728
    .line 1729
    :goto_29
    const/16 v2, 0xb9

    .line 1730
    .line 1731
    if-ne v1, v2, :cond_31

    .line 1732
    .line 1733
    add-int/lit8 v2, v32, 0x5

    .line 1734
    .line 1735
    :goto_2a
    move/from16 v1, v18

    .line 1736
    .line 1737
    move/from16 v3, v30

    .line 1738
    .line 1739
    move-object/from16 v7, v39

    .line 1740
    .line 1741
    goto/16 :goto_2e

    .line 1742
    .line 1743
    :cond_31
    :goto_2b
    add-int/lit8 v2, v32, 0x3

    .line 1744
    .line 1745
    goto :goto_2a

    .line 1746
    :pswitch_15
    move/from16 v38, v7

    .line 1747
    .line 1748
    const/16 v17, 0x84

    .line 1749
    .line 1750
    const/16 v19, 0x8

    .line 1751
    .line 1752
    add-int/lit8 v2, v32, 0x1

    .line 1753
    .line 1754
    invoke-virtual {v6, v2, v12}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v2

    .line 1758
    invoke-virtual {v0, v1, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 1759
    .line 1760
    .line 1761
    goto :goto_2b

    .line 1762
    :pswitch_16
    move/from16 v38, v7

    .line 1763
    .line 1764
    const/16 v17, 0x84

    .line 1765
    .line 1766
    const/16 v19, 0x8

    .line 1767
    .line 1768
    const/16 v2, 0x36

    .line 1769
    .line 1770
    if-le v1, v2, :cond_32

    .line 1771
    .line 1772
    add-int/lit8 v1, v1, -0x3b

    .line 1773
    .line 1774
    shr-int/lit8 v3, v1, 0x2

    .line 1775
    .line 1776
    add-int/2addr v3, v2

    .line 1777
    and-int/lit8 v1, v1, 0x3

    .line 1778
    .line 1779
    invoke-virtual {v0, v3, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1780
    .line 1781
    .line 1782
    goto :goto_2c

    .line 1783
    :cond_32
    add-int/lit8 v1, v1, -0x1a

    .line 1784
    .line 1785
    shr-int/lit8 v2, v1, 0x2

    .line 1786
    .line 1787
    add-int/lit8 v2, v2, 0x15

    .line 1788
    .line 1789
    and-int/lit8 v1, v1, 0x3

    .line 1790
    .line 1791
    invoke-virtual {v0, v2, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1792
    .line 1793
    .line 1794
    :goto_2c
    add-int/lit8 v2, v32, 0x1

    .line 1795
    .line 1796
    goto :goto_2a

    .line 1797
    :pswitch_17
    move/from16 v38, v7

    .line 1798
    .line 1799
    const/16 v17, 0x84

    .line 1800
    .line 1801
    const/16 v19, 0x8

    .line 1802
    .line 1803
    add-int/lit8 v2, v32, 0x1

    .line 1804
    .line 1805
    aget-byte v2, v37, v2

    .line 1806
    .line 1807
    and-int/lit16 v2, v2, 0xff

    .line 1808
    .line 1809
    invoke-virtual {v0, v1, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1810
    .line 1811
    .line 1812
    :goto_2d
    add-int/lit8 v2, v32, 0x2

    .line 1813
    .line 1814
    goto :goto_2a

    .line 1815
    :pswitch_18
    move/from16 v38, v7

    .line 1816
    .line 1817
    const/16 v17, 0x84

    .line 1818
    .line 1819
    const/16 v19, 0x8

    .line 1820
    .line 1821
    add-int/lit8 v2, v32, 0x1

    .line 1822
    .line 1823
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readShort(I)S

    .line 1824
    .line 1825
    .line 1826
    move-result v2

    .line 1827
    invoke-virtual {v0, v1, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitIntInsn(II)V

    .line 1828
    .line 1829
    .line 1830
    goto :goto_2b

    .line 1831
    :pswitch_19
    move/from16 v38, v7

    .line 1832
    .line 1833
    const/16 v17, 0x84

    .line 1834
    .line 1835
    const/16 v19, 0x8

    .line 1836
    .line 1837
    add-int/lit8 v2, v32, 0x1

    .line 1838
    .line 1839
    aget-byte v2, v37, v2

    .line 1840
    .line 1841
    invoke-virtual {v0, v1, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitIntInsn(II)V

    .line 1842
    .line 1843
    .line 1844
    goto :goto_2d

    .line 1845
    :pswitch_1a
    move/from16 v38, v7

    .line 1846
    .line 1847
    const/16 v17, 0x84

    .line 1848
    .line 1849
    const/16 v19, 0x8

    .line 1850
    .line 1851
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 1852
    .line 1853
    .line 1854
    goto :goto_2c

    .line 1855
    :goto_2e
    if-eqz v7, :cond_36

    .line 1856
    .line 1857
    array-length v4, v7

    .line 1858
    if-ge v1, v4, :cond_36

    .line 1859
    .line 1860
    if-gt v3, v14, :cond_36

    .line 1861
    .line 1862
    if-ne v3, v14, :cond_33

    .line 1863
    .line 1864
    aget v3, v7, v1

    .line 1865
    .line 1866
    invoke-direct {v6, v8, v3}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;I)I

    .line 1867
    .line 1868
    .line 1869
    move-result v3

    .line 1870
    add-int/lit8 v4, v3, 0x2

    .line 1871
    .line 1872
    iget v5, v8, Lcom/esotericsoftware/asm/Context;->i:I

    .line 1873
    .line 1874
    move/from16 v18, v1

    .line 1875
    .line 1876
    iget-object v1, v8, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    .line 1877
    .line 1878
    invoke-virtual {v6, v3, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v3

    .line 1882
    move/from16 p3, v2

    .line 1883
    .line 1884
    move/from16 v2, v16

    .line 1885
    .line 1886
    invoke-virtual {v0, v5, v1, v3, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsnAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v1

    .line 1890
    invoke-direct {v6, v4, v12, v2, v1}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 1891
    .line 1892
    .line 1893
    goto :goto_2f

    .line 1894
    :cond_33
    move/from16 v18, v1

    .line 1895
    .line 1896
    move/from16 p3, v2

    .line 1897
    .line 1898
    :goto_2f
    add-int/lit8 v1, v18, 0x1

    .line 1899
    .line 1900
    array-length v2, v7

    .line 1901
    if-ge v1, v2, :cond_35

    .line 1902
    .line 1903
    aget v2, v7, v1

    .line 1904
    .line 1905
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readByte(I)I

    .line 1906
    .line 1907
    .line 1908
    move-result v2

    .line 1909
    const/16 v3, 0x43

    .line 1910
    .line 1911
    if-ge v2, v3, :cond_34

    .line 1912
    .line 1913
    goto :goto_30

    .line 1914
    :cond_34
    aget v2, v7, v1

    .line 1915
    .line 1916
    const/16 v16, 0x1

    .line 1917
    .line 1918
    add-int/lit8 v2, v2, 0x1

    .line 1919
    .line 1920
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 1921
    .line 1922
    .line 1923
    move-result v2

    .line 1924
    move v3, v2

    .line 1925
    goto :goto_31

    .line 1926
    :cond_35
    :goto_30
    move/from16 v3, v36

    .line 1927
    .line 1928
    :goto_31
    move/from16 v2, p3

    .line 1929
    .line 1930
    const/16 v16, 0x1

    .line 1931
    .line 1932
    goto :goto_2e

    .line 1933
    :cond_36
    move/from16 v18, v1

    .line 1934
    .line 1935
    move/from16 p3, v2

    .line 1936
    .line 1937
    move/from16 v1, v21

    .line 1938
    .line 1939
    move-object/from16 v4, v24

    .line 1940
    .line 1941
    move/from16 v2, v31

    .line 1942
    .line 1943
    :goto_32
    if-eqz v4, :cond_3a

    .line 1944
    .line 1945
    array-length v5, v4

    .line 1946
    if-ge v1, v5, :cond_3a

    .line 1947
    .line 1948
    if-gt v2, v14, :cond_3a

    .line 1949
    .line 1950
    if-ne v2, v14, :cond_37

    .line 1951
    .line 1952
    aget v2, v4, v1

    .line 1953
    .line 1954
    invoke-direct {v6, v8, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;I)I

    .line 1955
    .line 1956
    .line 1957
    move-result v2

    .line 1958
    add-int/lit8 v5, v2, 0x2

    .line 1959
    .line 1960
    move/from16 v21, v1

    .line 1961
    .line 1962
    iget v1, v8, Lcom/esotericsoftware/asm/Context;->i:I

    .line 1963
    .line 1964
    move/from16 v24, v3

    .line 1965
    .line 1966
    iget-object v3, v8, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    .line 1967
    .line 1968
    invoke-virtual {v6, v2, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v2

    .line 1972
    move-object/from16 v30, v9

    .line 1973
    .line 1974
    const/4 v9, 0x0

    .line 1975
    invoke-virtual {v0, v1, v3, v2, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsnAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v1

    .line 1979
    const/4 v2, 0x1

    .line 1980
    invoke-direct {v6, v5, v12, v2, v1}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 1981
    .line 1982
    .line 1983
    goto :goto_33

    .line 1984
    :cond_37
    move/from16 v21, v1

    .line 1985
    .line 1986
    move/from16 v24, v3

    .line 1987
    .line 1988
    move-object/from16 v30, v9

    .line 1989
    .line 1990
    const/4 v9, 0x0

    .line 1991
    :goto_33
    add-int/lit8 v1, v21, 0x1

    .line 1992
    .line 1993
    array-length v2, v4

    .line 1994
    if-ge v1, v2, :cond_39

    .line 1995
    .line 1996
    aget v2, v4, v1

    .line 1997
    .line 1998
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readByte(I)I

    .line 1999
    .line 2000
    .line 2001
    move-result v2

    .line 2002
    const/16 v3, 0x43

    .line 2003
    .line 2004
    if-ge v2, v3, :cond_38

    .line 2005
    .line 2006
    goto :goto_34

    .line 2007
    :cond_38
    aget v2, v4, v1

    .line 2008
    .line 2009
    const/16 v16, 0x1

    .line 2010
    .line 2011
    add-int/lit8 v2, v2, 0x1

    .line 2012
    .line 2013
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 2014
    .line 2015
    .line 2016
    move-result v2

    .line 2017
    goto :goto_35

    .line 2018
    :cond_39
    const/16 v3, 0x43

    .line 2019
    .line 2020
    :goto_34
    move/from16 v2, v36

    .line 2021
    .line 2022
    :goto_35
    move/from16 v3, v24

    .line 2023
    .line 2024
    move-object/from16 v9, v30

    .line 2025
    .line 2026
    goto :goto_32

    .line 2027
    :cond_3a
    move/from16 v21, v1

    .line 2028
    .line 2029
    move/from16 v24, v3

    .line 2030
    .line 2031
    move-object/from16 v30, v9

    .line 2032
    .line 2033
    const/16 v3, 0x43

    .line 2034
    .line 2035
    const/4 v9, 0x0

    .line 2036
    move/from16 v1, v27

    .line 2037
    .line 2038
    move/from16 v27, v13

    .line 2039
    .line 2040
    move v13, v1

    .line 2041
    move/from16 v31, v2

    .line 2042
    .line 2043
    move-object/from16 v39, v7

    .line 2044
    .line 2045
    move-object/from16 v1, v23

    .line 2046
    .line 2047
    move/from16 v14, v35

    .line 2048
    .line 2049
    const/16 v16, 0x1

    .line 2050
    .line 2051
    move/from16 v2, p3

    .line 2052
    .line 2053
    move-object v7, v0

    .line 2054
    move-object/from16 v0, v30

    .line 2055
    .line 2056
    move/from16 v30, v24

    .line 2057
    .line 2058
    move-object/from16 v24, v4

    .line 2059
    .line 2060
    move-object v4, v12

    .line 2061
    move/from16 v12, v22

    .line 2062
    .line 2063
    move/from16 v22, v38

    .line 2064
    .line 2065
    goto/16 :goto_17

    .line 2066
    .line 2067
    :cond_3b
    move-object/from16 v23, v1

    .line 2068
    .line 2069
    move-object v0, v7

    .line 2070
    move/from16 v22, v12

    .line 2071
    .line 2072
    move-object/from16 v7, v39

    .line 2073
    .line 2074
    move-object v12, v4

    .line 2075
    move-object/from16 v4, v24

    .line 2076
    .line 2077
    aget-object v1, v23, v22

    .line 2078
    .line 2079
    if-eqz v1, :cond_3c

    .line 2080
    .line 2081
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 2082
    .line 2083
    .line 2084
    :cond_3c
    iget v1, v8, Lcom/esotericsoftware/asm/Context;->b:I

    .line 2085
    .line 2086
    and-int/lit8 v1, v1, 0x2

    .line 2087
    .line 2088
    if-nez v1, :cond_41

    .line 2089
    .line 2090
    move/from16 v3, v25

    .line 2091
    .line 2092
    if-eqz v3, :cond_41

    .line 2093
    .line 2094
    move/from16 v1, v26

    .line 2095
    .line 2096
    if-eqz v1, :cond_3e

    .line 2097
    .line 2098
    add-int/lit8 v26, v1, 0x2

    .line 2099
    .line 2100
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 2101
    .line 2102
    .line 2103
    move-result v1

    .line 2104
    mul-int/lit8 v1, v1, 0x3

    .line 2105
    .line 2106
    new-array v2, v1, [I

    .line 2107
    .line 2108
    move/from16 v5, v26

    .line 2109
    .line 2110
    :goto_36
    if-lez v1, :cond_3d

    .line 2111
    .line 2112
    add-int/lit8 v13, v1, -0x1

    .line 2113
    .line 2114
    add-int/lit8 v14, v5, 0x6

    .line 2115
    .line 2116
    aput v14, v2, v13

    .line 2117
    .line 2118
    add-int/lit8 v13, v1, -0x2

    .line 2119
    .line 2120
    add-int/lit8 v14, v5, 0x8

    .line 2121
    .line 2122
    invoke-virtual {v6, v14}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 2123
    .line 2124
    .line 2125
    move-result v14

    .line 2126
    aput v14, v2, v13

    .line 2127
    .line 2128
    add-int/lit8 v1, v1, -0x3

    .line 2129
    .line 2130
    invoke-virtual {v6, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 2131
    .line 2132
    .line 2133
    move-result v13

    .line 2134
    aput v13, v2, v1

    .line 2135
    .line 2136
    add-int/lit8 v5, v5, 0xa

    .line 2137
    .line 2138
    goto :goto_36

    .line 2139
    :cond_3d
    move-object v13, v2

    .line 2140
    goto :goto_37

    .line 2141
    :cond_3e
    const/4 v13, 0x0

    .line 2142
    :goto_37
    add-int/lit8 v25, v3, 0x2

    .line 2143
    .line 2144
    invoke-virtual {v6, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 2145
    .line 2146
    .line 2147
    move-result v1

    .line 2148
    move v14, v1

    .line 2149
    move/from16 v15, v25

    .line 2150
    .line 2151
    :goto_38
    if-lez v14, :cond_41

    .line 2152
    .line 2153
    invoke-virtual {v6, v15}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 2154
    .line 2155
    .line 2156
    move-result v1

    .line 2157
    add-int/lit8 v2, v15, 0x2

    .line 2158
    .line 2159
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 2160
    .line 2161
    .line 2162
    move-result v2

    .line 2163
    add-int/lit8 v3, v15, 0x8

    .line 2164
    .line 2165
    invoke-virtual {v6, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 2166
    .line 2167
    .line 2168
    move-result v3

    .line 2169
    if-eqz v13, :cond_40

    .line 2170
    .line 2171
    move v5, v9

    .line 2172
    :goto_39
    array-length v9, v13

    .line 2173
    if-ge v5, v9, :cond_40

    .line 2174
    .line 2175
    aget v9, v13, v5

    .line 2176
    .line 2177
    if-ne v9, v1, :cond_3f

    .line 2178
    .line 2179
    add-int/lit8 v9, v5, 0x1

    .line 2180
    .line 2181
    aget v9, v13, v9

    .line 2182
    .line 2183
    if-ne v9, v3, :cond_3f

    .line 2184
    .line 2185
    add-int/lit8 v5, v5, 0x2

    .line 2186
    .line 2187
    aget v5, v13, v5

    .line 2188
    .line 2189
    invoke-virtual {v6, v5, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v5

    .line 2193
    move-object/from16 v40, v5

    .line 2194
    .line 2195
    move v5, v3

    .line 2196
    move-object/from16 v3, v40

    .line 2197
    .line 2198
    goto :goto_3a

    .line 2199
    :cond_3f
    add-int/lit8 v5, v5, 0x3

    .line 2200
    .line 2201
    goto :goto_39

    .line 2202
    :cond_40
    move v5, v3

    .line 2203
    const/4 v3, 0x0

    .line 2204
    :goto_3a
    add-int/lit8 v9, v15, 0x4

    .line 2205
    .line 2206
    invoke-virtual {v6, v9, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v9

    .line 2210
    add-int/lit8 v0, v15, 0x6

    .line 2211
    .line 2212
    invoke-virtual {v6, v0, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v0

    .line 2216
    move-object/from16 v24, v4

    .line 2217
    .line 2218
    aget-object v4, v23, v1

    .line 2219
    .line 2220
    add-int/2addr v1, v2

    .line 2221
    aget-object v1, v23, v1

    .line 2222
    .line 2223
    move/from16 p3, v5

    .line 2224
    .line 2225
    move-object v5, v1

    .line 2226
    move-object v1, v9

    .line 2227
    move-object v9, v6

    .line 2228
    move/from16 v6, p3

    .line 2229
    .line 2230
    move-object v2, v0

    .line 2231
    move-object/from16 p3, v13

    .line 2232
    .line 2233
    move-object/from16 v13, v24

    .line 2234
    .line 2235
    move-object/from16 v0, p1

    .line 2236
    .line 2237
    invoke-virtual/range {v0 .. v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;I)V

    .line 2238
    .line 2239
    .line 2240
    add-int/lit8 v15, v15, 0xa

    .line 2241
    .line 2242
    add-int/lit8 v14, v14, -0x1

    .line 2243
    .line 2244
    move-object v6, v9

    .line 2245
    move-object v4, v13

    .line 2246
    const/4 v9, 0x0

    .line 2247
    move-object/from16 v13, p3

    .line 2248
    .line 2249
    goto :goto_38

    .line 2250
    :cond_41
    move-object v13, v4

    .line 2251
    move-object v9, v6

    .line 2252
    const/16 v14, 0x20

    .line 2253
    .line 2254
    if-eqz v7, :cond_43

    .line 2255
    .line 2256
    const/4 v15, 0x0

    .line 2257
    :goto_3b
    array-length v0, v7

    .line 2258
    if-ge v15, v0, :cond_43

    .line 2259
    .line 2260
    aget v0, v7, v15

    .line 2261
    .line 2262
    invoke-virtual {v9, v0}, Lcom/esotericsoftware/asm/ClassReader;->readByte(I)I

    .line 2263
    .line 2264
    .line 2265
    move-result v0

    .line 2266
    const/16 v16, 0x1

    .line 2267
    .line 2268
    shr-int/lit8 v0, v0, 0x1

    .line 2269
    .line 2270
    if-ne v0, v14, :cond_42

    .line 2271
    .line 2272
    aget v0, v7, v15

    .line 2273
    .line 2274
    invoke-direct {v9, v8, v0}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;I)I

    .line 2275
    .line 2276
    .line 2277
    move-result v0

    .line 2278
    add-int/lit8 v1, v0, 0x2

    .line 2279
    .line 2280
    move v2, v1

    .line 2281
    iget v1, v8, Lcom/esotericsoftware/asm/Context;->i:I

    .line 2282
    .line 2283
    move v3, v2

    .line 2284
    iget-object v2, v8, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    .line 2285
    .line 2286
    move v4, v3

    .line 2287
    iget-object v3, v8, Lcom/esotericsoftware/asm/Context;->l:[Lcom/esotericsoftware/asm/Label;

    .line 2288
    .line 2289
    move v5, v4

    .line 2290
    iget-object v4, v8, Lcom/esotericsoftware/asm/Context;->m:[Lcom/esotericsoftware/asm/Label;

    .line 2291
    .line 2292
    move v6, v5

    .line 2293
    iget-object v5, v8, Lcom/esotericsoftware/asm/Context;->n:[I

    .line 2294
    .line 2295
    invoke-virtual {v9, v0, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v0

    .line 2299
    move-object/from16 v35, v7

    .line 2300
    .line 2301
    const/4 v7, 0x1

    .line 2302
    move v14, v6

    .line 2303
    move-object v6, v0

    .line 2304
    move-object/from16 v0, p1

    .line 2305
    .line 2306
    invoke-virtual/range {v0 .. v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLocalVariableAnnotation(ILcom/esotericsoftware/asm/TypePath;[Lcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;[ILjava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v1

    .line 2310
    const/4 v2, 0x1

    .line 2311
    invoke-direct {v9, v14, v12, v2, v1}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 2312
    .line 2313
    .line 2314
    goto :goto_3c

    .line 2315
    :cond_42
    move-object/from16 v35, v7

    .line 2316
    .line 2317
    :goto_3c
    add-int/lit8 v15, v15, 0x1

    .line 2318
    .line 2319
    move-object/from16 v7, v35

    .line 2320
    .line 2321
    const/16 v14, 0x20

    .line 2322
    .line 2323
    goto :goto_3b

    .line 2324
    :cond_43
    if-eqz v13, :cond_45

    .line 2325
    .line 2326
    const/4 v14, 0x0

    .line 2327
    :goto_3d
    array-length v0, v13

    .line 2328
    if-ge v14, v0, :cond_45

    .line 2329
    .line 2330
    aget v0, v13, v14

    .line 2331
    .line 2332
    invoke-virtual {v9, v0}, Lcom/esotericsoftware/asm/ClassReader;->readByte(I)I

    .line 2333
    .line 2334
    .line 2335
    move-result v0

    .line 2336
    const/16 v16, 0x1

    .line 2337
    .line 2338
    shr-int/lit8 v0, v0, 0x1

    .line 2339
    .line 2340
    const/16 v15, 0x20

    .line 2341
    .line 2342
    if-ne v0, v15, :cond_44

    .line 2343
    .line 2344
    aget v0, v13, v14

    .line 2345
    .line 2346
    invoke-direct {v9, v8, v0}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;I)I

    .line 2347
    .line 2348
    .line 2349
    move-result v0

    .line 2350
    add-int/lit8 v1, v0, 0x2

    .line 2351
    .line 2352
    move v2, v1

    .line 2353
    iget v1, v8, Lcom/esotericsoftware/asm/Context;->i:I

    .line 2354
    .line 2355
    move v3, v2

    .line 2356
    iget-object v2, v8, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    .line 2357
    .line 2358
    move v4, v3

    .line 2359
    iget-object v3, v8, Lcom/esotericsoftware/asm/Context;->l:[Lcom/esotericsoftware/asm/Label;

    .line 2360
    .line 2361
    move v5, v4

    .line 2362
    iget-object v4, v8, Lcom/esotericsoftware/asm/Context;->m:[Lcom/esotericsoftware/asm/Label;

    .line 2363
    .line 2364
    move v6, v5

    .line 2365
    iget-object v5, v8, Lcom/esotericsoftware/asm/Context;->n:[I

    .line 2366
    .line 2367
    invoke-virtual {v9, v0, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 2368
    .line 2369
    .line 2370
    move-result-object v0

    .line 2371
    const/4 v7, 0x0

    .line 2372
    move v15, v6

    .line 2373
    move-object v6, v0

    .line 2374
    move-object/from16 v0, p1

    .line 2375
    .line 2376
    invoke-virtual/range {v0 .. v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLocalVariableAnnotation(ILcom/esotericsoftware/asm/TypePath;[Lcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;[ILjava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v1

    .line 2380
    const/4 v2, 0x1

    .line 2381
    invoke-direct {v9, v15, v12, v2, v1}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 2382
    .line 2383
    .line 2384
    goto :goto_3e

    .line 2385
    :cond_44
    move-object/from16 v0, p1

    .line 2386
    .line 2387
    const/4 v2, 0x1

    .line 2388
    :goto_3e
    add-int/lit8 v14, v14, 0x1

    .line 2389
    .line 2390
    goto :goto_3d

    .line 2391
    :cond_45
    move-object/from16 v0, p1

    .line 2392
    .line 2393
    move-object/from16 v1, v28

    .line 2394
    .line 2395
    :goto_3f
    if-eqz v1, :cond_46

    .line 2396
    .line 2397
    iget-object v2, v1, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 2398
    .line 2399
    const/4 v3, 0x0

    .line 2400
    iput-object v3, v1, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 2401
    .line 2402
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitAttribute(Lcom/esotericsoftware/asm/Attribute;)V

    .line 2403
    .line 2404
    .line 2405
    move-object v1, v2

    .line 2406
    goto :goto_3f

    .line 2407
    :cond_46
    invoke-virtual {v0, v10, v11}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 2408
    .line 2409
    .line 2410
    return-void

    .line 2411
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_a
        :pswitch_b
    .end packed-switch
.end method

.method private static a(Ljava/io/InputStream;Z)[B
    .locals 5

    .line 2423
    if-eqz p0, :cond_7

    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v0

    new-array v0, v0, [B

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    array-length v3, v0

    sub-int/2addr v3, v2

    invoke-virtual {p0, v0, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_3

    array-length v3, v0

    if-ge v2, v3, :cond_1

    new-array v3, v2, [B

    invoke-static {v0, v1, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_2
    return-object v0

    :cond_3
    add-int/2addr v2, v3

    :try_start_1
    array-length v3, v0

    if-ne v2, v3, :cond_0

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gez v3, :cond_5

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_4
    return-object v0

    :cond_5
    :try_start_2
    array-length v4, v0

    add-int/lit16 v4, v4, 0x3e8

    new-array v4, v4, [B

    invoke-static {v0, v1, v4, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, v2, 0x1

    int-to-byte v3, v3

    aput-byte v3, v4, v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v2, v0

    move-object v0, v4

    goto :goto_0

    :goto_2
    if-eqz p1, :cond_6

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_6
    throw v0

    :cond_7
    const-string p0, "Class not found"

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private a(Lcom/esotericsoftware/asm/MethodVisitor;Lcom/esotericsoftware/asm/Context;IZ)[I
    .locals 14

    .line 2424
    move-object/from16 v0, p2

    move/from16 v1, p3

    iget-object v2, v0, Lcom/esotericsoftware/asm/Context;->c:[C

    invoke-virtual {p0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v3

    new-array v4, v3, [I

    const/4 v5, 0x2

    add-int/2addr v1, v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_5

    aput v1, v4, v6

    invoke-virtual {p0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result v7

    ushr-int/lit8 v8, v7, 0x18

    const/4 v9, 0x1

    if-eqz v8, :cond_2

    if-eq v8, v9, :cond_2

    const/16 v10, 0x40

    if-eq v8, v10, :cond_1

    const/16 v10, 0x41

    if-eq v8, v10, :cond_1

    packed-switch v8, :pswitch_data_0

    packed-switch v8, :pswitch_data_1

    :cond_0
    add-int/lit8 v1, v1, 0x3

    goto :goto_2

    :pswitch_0
    add-int/lit8 v1, v1, 0x4

    goto :goto_2

    :pswitch_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v10, v1, 0x1

    invoke-virtual {p0, v10}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v10

    :goto_1
    if-lez v10, :cond_0

    add-int/lit8 v11, v1, 0x3

    invoke-virtual {p0, v11}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v11

    add-int/lit8 v12, v1, 0x5

    invoke-virtual {p0, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v12

    iget-object v13, v0, Lcom/esotericsoftware/asm/Context;->h:[Lcom/esotericsoftware/asm/Label;

    invoke-virtual {p0, v11, v13}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    add-int/2addr v11, v12

    iget-object v12, v0, Lcom/esotericsoftware/asm/Context;->h:[Lcom/esotericsoftware/asm/Label;

    invoke-virtual {p0, v11, v12}, Lcom/esotericsoftware/asm/ClassReader;->readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;

    add-int/lit8 v1, v1, 0x6

    add-int/lit8 v10, v10, -0x1

    goto :goto_1

    :cond_2
    :pswitch_2
    add-int/lit8 v1, v1, 0x2

    :goto_2
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readByte(I)I

    move-result v10

    const/16 v11, 0x42

    const/4 v12, 0x0

    if-ne v8, v11, :cond_4

    if-nez v10, :cond_3

    goto :goto_3

    :cond_3
    new-instance v12, Lcom/esotericsoftware/asm/TypePath;

    iget-object v8, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    invoke-direct {v12, v8, v1}, Lcom/esotericsoftware/asm/TypePath;-><init>([BI)V

    :goto_3
    invoke-static {v10, v5, v9, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    move-result v1

    add-int/lit8 v8, v1, 0x2

    invoke-virtual {p0, v1, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v1

    move/from16 v11, p4

    invoke-virtual {p1, v7, v12, v1, v11}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTryCatchAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    move-result-object v1

    invoke-direct {p0, v8, v2, v9, v1}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result v1

    goto :goto_4

    :cond_4
    move/from16 v11, p4

    add-int/lit8 v1, v1, 0x3

    mul-int/lit8 v10, v10, 0x2

    add-int/2addr v10, v1

    invoke-direct {p0, v10, v2, v9, v12}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result v1

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_5
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x47
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private b(Lcom/esotericsoftware/asm/ClassVisitor;Lcom/esotericsoftware/asm/Context;I)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    move/from16 v1, p3

    .line 6
    .line 7
    iget-object v5, v8, Lcom/esotericsoftware/asm/Context;->c:[C

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iput v2, v8, Lcom/esotericsoftware/asm/Context;->e:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    invoke-virtual {v0, v2, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, v8, Lcom/esotericsoftware/asm/Context;->f:Ljava/lang/String;

    .line 22
    .line 23
    add-int/lit8 v2, v1, 0x4

    .line 24
    .line 25
    invoke-virtual {v0, v2, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, v8, Lcom/esotericsoftware/asm/Context;->g:Ljava/lang/String;

    .line 30
    .line 31
    add-int/lit8 v9, v1, 0x6

    .line 32
    .line 33
    invoke-virtual {v0, v9}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    move v12, v1

    .line 38
    move v13, v9

    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v14, 0x0

    .line 46
    const/4 v15, 0x0

    .line 47
    const/16 v18, 0x0

    .line 48
    .line 49
    const/16 v19, 0x0

    .line 50
    .line 51
    const/16 v20, 0x0

    .line 52
    .line 53
    const/16 v21, 0x0

    .line 54
    .line 55
    const/16 v22, 0x0

    .line 56
    .line 57
    :goto_0
    if-lez v12, :cond_10

    .line 58
    .line 59
    const/16 v23, 0x1

    .line 60
    .line 61
    add-int/lit8 v10, v13, 0x2

    .line 62
    .line 63
    invoke-virtual {v0, v10, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    const-string v11, "Code"

    .line 68
    .line 69
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    if-eqz v11, :cond_1

    .line 74
    .line 75
    iget v10, v8, Lcom/esotericsoftware/asm/Context;->b:I

    .line 76
    .line 77
    and-int/lit8 v10, v10, 0x1

    .line 78
    .line 79
    if-nez v10, :cond_0

    .line 80
    .line 81
    add-int/lit8 v22, v13, 0x8

    .line 82
    .line 83
    :goto_1
    move/from16 v16, v12

    .line 84
    .line 85
    :goto_2
    move/from16 v17, v13

    .line 86
    .line 87
    goto/16 :goto_9

    .line 88
    .line 89
    :cond_0
    move v10, v1

    .line 90
    move v11, v2

    .line 91
    move/from16 v24, v4

    .line 92
    .line 93
    move/from16 v25, v6

    .line 94
    .line 95
    :goto_3
    move/from16 v16, v12

    .line 96
    .line 97
    move/from16 v17, v13

    .line 98
    .line 99
    move v12, v3

    .line 100
    move-object v13, v7

    .line 101
    goto/16 :goto_8

    .line 102
    .line 103
    :cond_1
    const-string v11, "Exceptions"

    .line 104
    .line 105
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    if-eqz v11, :cond_3

    .line 110
    .line 111
    add-int/lit8 v10, v13, 0x8

    .line 112
    .line 113
    invoke-virtual {v0, v10}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    new-array v11, v10, [Ljava/lang/String;

    .line 118
    .line 119
    add-int/lit8 v16, v13, 0xa

    .line 120
    .line 121
    move/from16 v17, v16

    .line 122
    .line 123
    move/from16 v16, v2

    .line 124
    .line 125
    move/from16 v2, v17

    .line 126
    .line 127
    move/from16 v17, v1

    .line 128
    .line 129
    const/4 v1, 0x0

    .line 130
    :goto_4
    if-ge v1, v10, :cond_2

    .line 131
    .line 132
    invoke-virtual {v0, v2, v5}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v19

    .line 136
    aput-object v19, v11, v1

    .line 137
    .line 138
    add-int/lit8 v2, v2, 0x2

    .line 139
    .line 140
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_2
    move/from16 v21, v2

    .line 144
    .line 145
    move-object/from16 v19, v11

    .line 146
    .line 147
    :goto_5
    move/from16 v2, v16

    .line 148
    .line 149
    move/from16 v1, v17

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    move/from16 v17, v1

    .line 153
    .line 154
    move/from16 v16, v2

    .line 155
    .line 156
    const-string v1, "Signature"

    .line 157
    .line 158
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_4

    .line 163
    .line 164
    add-int/lit8 v1, v13, 0x8

    .line 165
    .line 166
    invoke-virtual {v0, v1, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v18

    .line 170
    goto :goto_5

    .line 171
    :cond_4
    const-string v1, "Deprecated"

    .line 172
    .line 173
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_5

    .line 178
    .line 179
    iget v1, v8, Lcom/esotericsoftware/asm/Context;->e:I

    .line 180
    .line 181
    const/high16 v2, 0x20000

    .line 182
    .line 183
    :goto_6
    or-int/2addr v1, v2

    .line 184
    iput v1, v8, Lcom/esotericsoftware/asm/Context;->e:I

    .line 185
    .line 186
    move/from16 v24, v4

    .line 187
    .line 188
    move/from16 v25, v6

    .line 189
    .line 190
    move/from16 v11, v16

    .line 191
    .line 192
    move/from16 v10, v17

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_5
    const-string v1, "RuntimeVisibleAnnotations"

    .line 196
    .line 197
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_6

    .line 202
    .line 203
    add-int/lit8 v14, v13, 0x8

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_6
    const-string v1, "RuntimeVisibleTypeAnnotations"

    .line 207
    .line 208
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_7

    .line 213
    .line 214
    add-int/lit8 v2, v13, 0x8

    .line 215
    .line 216
    move/from16 v16, v12

    .line 217
    .line 218
    move/from16 v1, v17

    .line 219
    .line 220
    goto/16 :goto_2

    .line 221
    .line 222
    :cond_7
    const-string v1, "AnnotationDefault"

    .line 223
    .line 224
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-eqz v1, :cond_8

    .line 229
    .line 230
    add-int/lit8 v1, v13, 0x8

    .line 231
    .line 232
    move/from16 v17, v13

    .line 233
    .line 234
    move/from16 v2, v16

    .line 235
    .line 236
    move/from16 v16, v12

    .line 237
    .line 238
    goto/16 :goto_9

    .line 239
    .line 240
    :cond_8
    const-string v1, "Synthetic"

    .line 241
    .line 242
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_9

    .line 247
    .line 248
    iget v1, v8, Lcom/esotericsoftware/asm/Context;->e:I

    .line 249
    .line 250
    const v2, 0x41000

    .line 251
    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_9
    const-string v1, "RuntimeInvisibleAnnotations"

    .line 255
    .line 256
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eqz v1, :cond_a

    .line 261
    .line 262
    add-int/lit8 v15, v13, 0x8

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_a
    const-string v1, "RuntimeInvisibleTypeAnnotations"

    .line 266
    .line 267
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_b

    .line 272
    .line 273
    add-int/lit8 v3, v13, 0x8

    .line 274
    .line 275
    goto/16 :goto_5

    .line 276
    .line 277
    :cond_b
    const-string v1, "RuntimeVisibleParameterAnnotations"

    .line 278
    .line 279
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_c

    .line 284
    .line 285
    add-int/lit8 v6, v13, 0x8

    .line 286
    .line 287
    goto/16 :goto_5

    .line 288
    .line 289
    :cond_c
    const-string v1, "RuntimeInvisibleParameterAnnotations"

    .line 290
    .line 291
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eqz v1, :cond_d

    .line 296
    .line 297
    add-int/lit8 v4, v13, 0x8

    .line 298
    .line 299
    goto/16 :goto_5

    .line 300
    .line 301
    :cond_d
    const-string v1, "MethodParameters"

    .line 302
    .line 303
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-eqz v1, :cond_e

    .line 308
    .line 309
    add-int/lit8 v20, v13, 0x8

    .line 310
    .line 311
    goto/16 :goto_5

    .line 312
    .line 313
    :cond_e
    iget-object v1, v8, Lcom/esotericsoftware/asm/Context;->a:[Lcom/esotericsoftware/asm/Attribute;

    .line 314
    .line 315
    move v2, v3

    .line 316
    add-int/lit8 v3, v13, 0x8

    .line 317
    .line 318
    add-int/lit8 v11, v13, 0x4

    .line 319
    .line 320
    invoke-virtual {v0, v11}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    move/from16 v23, v6

    .line 325
    .line 326
    const/4 v6, -0x1

    .line 327
    move-object/from16 v24, v7

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    move/from16 v25, v12

    .line 331
    .line 332
    move v12, v2

    .line 333
    move-object v2, v10

    .line 334
    move/from16 v10, v17

    .line 335
    .line 336
    move/from16 v17, v13

    .line 337
    .line 338
    move-object/from16 v13, v24

    .line 339
    .line 340
    move/from16 v24, v4

    .line 341
    .line 342
    move v4, v11

    .line 343
    move/from16 v11, v16

    .line 344
    .line 345
    move/from16 v16, v25

    .line 346
    .line 347
    move/from16 v25, v23

    .line 348
    .line 349
    invoke-direct/range {v0 .. v7}, Lcom/esotericsoftware/asm/ClassReader;->a([Lcom/esotericsoftware/asm/Attribute;Ljava/lang/String;II[CI[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Attribute;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    if-eqz v7, :cond_f

    .line 354
    .line 355
    iput-object v13, v7, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 356
    .line 357
    move v1, v10

    .line 358
    move v2, v11

    .line 359
    move v3, v12

    .line 360
    :goto_7
    move/from16 v4, v24

    .line 361
    .line 362
    move/from16 v6, v25

    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_f
    :goto_8
    move v1, v10

    .line 366
    move v2, v11

    .line 367
    move v3, v12

    .line 368
    move-object v7, v13

    .line 369
    goto :goto_7

    .line 370
    :goto_9
    add-int/lit8 v13, v17, 0x4

    .line 371
    .line 372
    invoke-virtual {v0, v13}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    add-int/lit8 v10, v10, 0x6

    .line 377
    .line 378
    add-int v13, v10, v17

    .line 379
    .line 380
    add-int/lit8 v12, v16, -0x1

    .line 381
    .line 382
    goto/16 :goto_0

    .line 383
    .line 384
    :cond_10
    move v10, v1

    .line 385
    move v11, v2

    .line 386
    move v12, v3

    .line 387
    move/from16 v24, v4

    .line 388
    .line 389
    move/from16 v25, v6

    .line 390
    .line 391
    move/from16 v17, v13

    .line 392
    .line 393
    const/16 v23, 0x1

    .line 394
    .line 395
    move-object v13, v7

    .line 396
    add-int/lit8 v1, v17, 0x2

    .line 397
    .line 398
    move v2, v15

    .line 399
    iget v15, v8, Lcom/esotericsoftware/asm/Context;->e:I

    .line 400
    .line 401
    iget-object v3, v8, Lcom/esotericsoftware/asm/Context;->f:Ljava/lang/String;

    .line 402
    .line 403
    iget-object v4, v8, Lcom/esotericsoftware/asm/Context;->g:Ljava/lang/String;

    .line 404
    .line 405
    move-object/from16 v16, v3

    .line 406
    .line 407
    move-object/from16 v17, v4

    .line 408
    .line 409
    move v3, v2

    .line 410
    move v2, v14

    .line 411
    move-object/from16 v14, p1

    .line 412
    .line 413
    invoke-virtual/range {v14 .. v19}, Lcom/esotericsoftware/asm/ClassVisitor;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    move-object/from16 v6, v18

    .line 418
    .line 419
    move-object/from16 v7, v19

    .line 420
    .line 421
    if-nez v4, :cond_11

    .line 422
    .line 423
    return v1

    .line 424
    :cond_11
    instance-of v14, v4, Lcom/esotericsoftware/asm/MethodWriter;

    .line 425
    .line 426
    if-eqz v14, :cond_15

    .line 427
    .line 428
    move-object v14, v4

    .line 429
    check-cast v14, Lcom/esotericsoftware/asm/MethodWriter;

    .line 430
    .line 431
    iget-object v15, v14, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 432
    .line 433
    iget-object v15, v15, Lcom/esotericsoftware/asm/ClassWriter;->M:Lcom/esotericsoftware/asm/ClassReader;

    .line 434
    .line 435
    if-ne v15, v0, :cond_15

    .line 436
    .line 437
    iget-object v15, v14, Lcom/esotericsoftware/asm/MethodWriter;->g:Ljava/lang/String;

    .line 438
    .line 439
    if-ne v6, v15, :cond_15

    .line 440
    .line 441
    iget v6, v14, Lcom/esotericsoftware/asm/MethodWriter;->j:I

    .line 442
    .line 443
    if-nez v7, :cond_13

    .line 444
    .line 445
    if-nez v6, :cond_15

    .line 446
    .line 447
    :cond_12
    move/from16 v16, v1

    .line 448
    .line 449
    goto :goto_b

    .line 450
    :cond_13
    array-length v15, v7

    .line 451
    if-ne v15, v6, :cond_15

    .line 452
    .line 453
    array-length v6, v7

    .line 454
    add-int/lit8 v6, v6, -0x1

    .line 455
    .line 456
    :goto_a
    if-ltz v6, :cond_12

    .line 457
    .line 458
    add-int/lit8 v7, v21, -0x2

    .line 459
    .line 460
    iget-object v15, v14, Lcom/esotericsoftware/asm/MethodWriter;->k:[I

    .line 461
    .line 462
    aget v15, v15, v6

    .line 463
    .line 464
    move/from16 v16, v1

    .line 465
    .line 466
    invoke-virtual {v0, v7}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    if-eq v15, v1, :cond_14

    .line 471
    .line 472
    goto :goto_c

    .line 473
    :cond_14
    add-int/lit8 v6, v6, -0x1

    .line 474
    .line 475
    move/from16 v21, v7

    .line 476
    .line 477
    move/from16 v1, v16

    .line 478
    .line 479
    goto :goto_a

    .line 480
    :goto_b
    iput v9, v14, Lcom/esotericsoftware/asm/MethodWriter;->h:I

    .line 481
    .line 482
    sub-int v1, v16, v9

    .line 483
    .line 484
    iput v1, v14, Lcom/esotericsoftware/asm/MethodWriter;->i:I

    .line 485
    .line 486
    return v16

    .line 487
    :cond_15
    move/from16 v16, v1

    .line 488
    .line 489
    :goto_c
    if-eqz v20, :cond_16

    .line 490
    .line 491
    iget-object v1, v0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 492
    .line 493
    aget-byte v1, v1, v20

    .line 494
    .line 495
    and-int/lit16 v1, v1, 0xff

    .line 496
    .line 497
    add-int/lit8 v20, v20, 0x1

    .line 498
    .line 499
    move/from16 v6, v20

    .line 500
    .line 501
    :goto_d
    if-lez v1, :cond_16

    .line 502
    .line 503
    invoke-virtual {v0, v6, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v7

    .line 507
    add-int/lit8 v9, v6, 0x2

    .line 508
    .line 509
    invoke-virtual {v0, v9}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 510
    .line 511
    .line 512
    move-result v9

    .line 513
    invoke-virtual {v4, v7, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitParameter(Ljava/lang/String;I)V

    .line 514
    .line 515
    .line 516
    add-int/lit8 v1, v1, -0x1

    .line 517
    .line 518
    add-int/lit8 v6, v6, 0x4

    .line 519
    .line 520
    goto :goto_d

    .line 521
    :cond_16
    if-eqz v10, :cond_17

    .line 522
    .line 523
    invoke-virtual {v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitAnnotationDefault()Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    const/4 v6, 0x0

    .line 528
    invoke-direct {v0, v10, v5, v6, v1}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CLjava/lang/String;Lcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 529
    .line 530
    .line 531
    if-eqz v1, :cond_17

    .line 532
    .line 533
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitEnd()V

    .line 534
    .line 535
    .line 536
    :cond_17
    if-eqz v2, :cond_18

    .line 537
    .line 538
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 539
    .line 540
    .line 541
    move-result v1

    .line 542
    add-int/lit8 v14, v2, 0x2

    .line 543
    .line 544
    :goto_e
    if-lez v1, :cond_18

    .line 545
    .line 546
    add-int/lit8 v2, v14, 0x2

    .line 547
    .line 548
    invoke-virtual {v0, v14, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    move/from16 v7, v23

    .line 553
    .line 554
    invoke-virtual {v4, v6, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 555
    .line 556
    .line 557
    move-result-object v6

    .line 558
    invoke-direct {v0, v2, v5, v7, v6}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 559
    .line 560
    .line 561
    move-result v14

    .line 562
    add-int/lit8 v1, v1, -0x1

    .line 563
    .line 564
    const/16 v23, 0x1

    .line 565
    .line 566
    goto :goto_e

    .line 567
    :cond_18
    if-eqz v3, :cond_19

    .line 568
    .line 569
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    add-int/lit8 v15, v3, 0x2

    .line 574
    .line 575
    :goto_f
    if-lez v1, :cond_19

    .line 576
    .line 577
    add-int/lit8 v2, v15, 0x2

    .line 578
    .line 579
    invoke-virtual {v0, v15, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    const/4 v6, 0x0

    .line 584
    invoke-virtual {v4, v3, v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    const/4 v7, 0x1

    .line 589
    invoke-direct {v0, v2, v5, v7, v3}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 590
    .line 591
    .line 592
    move-result v15

    .line 593
    add-int/lit8 v1, v1, -0x1

    .line 594
    .line 595
    goto :goto_f

    .line 596
    :cond_19
    if-eqz v11, :cond_1a

    .line 597
    .line 598
    invoke-virtual {v0, v11}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 599
    .line 600
    .line 601
    move-result v1

    .line 602
    add-int/lit8 v2, v11, 0x2

    .line 603
    .line 604
    :goto_10
    if-lez v1, :cond_1a

    .line 605
    .line 606
    invoke-direct {v0, v8, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;I)I

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    add-int/lit8 v3, v2, 0x2

    .line 611
    .line 612
    iget v6, v8, Lcom/esotericsoftware/asm/Context;->i:I

    .line 613
    .line 614
    iget-object v7, v8, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    .line 615
    .line 616
    invoke-virtual {v0, v2, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    const/4 v9, 0x1

    .line 621
    invoke-virtual {v4, v6, v7, v2, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    invoke-direct {v0, v3, v5, v9, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    add-int/lit8 v1, v1, -0x1

    .line 630
    .line 631
    goto :goto_10

    .line 632
    :cond_1a
    if-eqz v12, :cond_1b

    .line 633
    .line 634
    invoke-virtual {v0, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 635
    .line 636
    .line 637
    move-result v1

    .line 638
    add-int/lit8 v3, v12, 0x2

    .line 639
    .line 640
    :goto_11
    if-lez v1, :cond_1b

    .line 641
    .line 642
    invoke-direct {v0, v8, v3}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;I)I

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    add-int/lit8 v3, v2, 0x2

    .line 647
    .line 648
    iget v6, v8, Lcom/esotericsoftware/asm/Context;->i:I

    .line 649
    .line 650
    iget-object v7, v8, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    .line 651
    .line 652
    invoke-virtual {v0, v2, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    const/4 v9, 0x0

    .line 657
    invoke-virtual {v4, v6, v7, v2, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    const/4 v7, 0x1

    .line 662
    invoke-direct {v0, v3, v5, v7, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 663
    .line 664
    .line 665
    move-result v3

    .line 666
    add-int/lit8 v1, v1, -0x1

    .line 667
    .line 668
    goto :goto_11

    .line 669
    :cond_1b
    const/4 v7, 0x1

    .line 670
    if-eqz v25, :cond_1c

    .line 671
    .line 672
    move/from16 v6, v25

    .line 673
    .line 674
    invoke-direct {v0, v4, v8, v6, v7}, Lcom/esotericsoftware/asm/ClassReader;->b(Lcom/esotericsoftware/asm/MethodVisitor;Lcom/esotericsoftware/asm/Context;IZ)V

    .line 675
    .line 676
    .line 677
    :cond_1c
    if-eqz v24, :cond_1d

    .line 678
    .line 679
    move/from16 v10, v24

    .line 680
    .line 681
    const/4 v6, 0x0

    .line 682
    invoke-direct {v0, v4, v8, v10, v6}, Lcom/esotericsoftware/asm/ClassReader;->b(Lcom/esotericsoftware/asm/MethodVisitor;Lcom/esotericsoftware/asm/Context;IZ)V

    .line 683
    .line 684
    .line 685
    :cond_1d
    move-object v7, v13

    .line 686
    :goto_12
    if-eqz v7, :cond_1e

    .line 687
    .line 688
    iget-object v1, v7, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 689
    .line 690
    const/4 v6, 0x0

    .line 691
    iput-object v6, v7, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 692
    .line 693
    invoke-virtual {v4, v7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitAttribute(Lcom/esotericsoftware/asm/Attribute;)V

    .line 694
    .line 695
    .line 696
    move-object v7, v1

    .line 697
    goto :goto_12

    .line 698
    :cond_1e
    move/from16 v10, v22

    .line 699
    .line 700
    if-eqz v10, :cond_1f

    .line 701
    .line 702
    invoke-virtual {v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 703
    .line 704
    .line 705
    invoke-direct {v0, v4, v8, v10}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/MethodVisitor;Lcom/esotericsoftware/asm/Context;I)V

    .line 706
    .line 707
    .line 708
    :cond_1f
    invoke-virtual {v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 709
    .line 710
    .line 711
    return v16
.end method

.method private b(Lcom/esotericsoftware/asm/MethodVisitor;Lcom/esotericsoftware/asm/Context;IZ)V
    .locals 6

    .line 712
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    add-int/lit8 v1, p3, 0x1

    aget-byte p3, v0, p3

    and-int/lit16 p3, p3, 0xff

    iget-object v0, p2, Lcom/esotericsoftware/asm/Context;->g:Ljava/lang/String;

    invoke-static {v0}, Lcom/esotericsoftware/asm/Type;->getArgumentTypes(Ljava/lang/String;)[Lcom/esotericsoftware/asm/Type;

    move-result-object v0

    array-length v0, v0

    sub-int/2addr v0, p3

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_1

    const-string v4, "Ljava/lang/Synthetic;"

    invoke-virtual {p1, v3, v4, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitParameterAnnotation(ILjava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitEnd()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object p2, p2, Lcom/esotericsoftware/asm/Context;->c:[C

    :goto_1
    add-int v2, p3, v0

    if-ge v3, v2, :cond_3

    invoke-virtual {p0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v2

    add-int/lit8 v1, v1, 0x2

    :goto_2
    if-lez v2, :cond_2

    invoke-virtual {p0, v1, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v3, v4, p4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitParameterAnnotation(ILjava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    move-result-object v4

    add-int/lit8 v1, v1, 0x2

    const/4 v5, 0x1

    invoke-direct {p0, v1, p2, v5, v4}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    move-result v1

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public a(Lcom/esotericsoftware/asm/ClassWriter;)V
    .locals 11

    .line 2419
    iget v0, p0, Lcom/esotericsoftware/asm/ClassReader;->d:I

    new-array v0, v0, [C

    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    array-length v1, v1

    new-array v2, v1, [Lcom/esotericsoftware/asm/Item;

    const/4 v3, 0x1

    move v4, v3

    :goto_0
    iget-object v5, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    if-ge v4, v1, :cond_9

    aget v5, v5, v4

    iget-object v6, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    add-int/lit8 v7, v5, -0x1

    aget-byte v6, v6, v7

    new-instance v7, Lcom/esotericsoftware/asm/Item;

    invoke-direct {v7, v4}, Lcom/esotericsoftware/asm/Item;-><init>(I)V

    const/4 v8, 0x0

    if-eq v6, v3, :cond_7

    const/16 v9, 0xf

    if-eq v6, v9, :cond_6

    const/16 v9, 0x12

    if-eq v6, v9, :cond_4

    const/4 v9, 0x3

    if-eq v6, v9, :cond_3

    const/4 v9, 0x4

    if-eq v6, v9, :cond_2

    const/4 v9, 0x5

    if-eq v6, v9, :cond_1

    const/4 v9, 0x6

    if-eq v6, v9, :cond_0

    packed-switch v6, :pswitch_data_0

    invoke-virtual {p0, v5, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v6, v5, v8, v8}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0, v5, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v5, v5, 0x2

    invoke-virtual {p0, v5, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v6, v9, v5, v8}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_1
    iget-object v8, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    add-int/lit8 v9, v5, 0x2

    invoke-virtual {p0, v9}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v9

    aget v8, v8, v9

    invoke-virtual {p0, v5, v0}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v8, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v8, v8, 0x2

    invoke-virtual {p0, v8, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v6, v5, v9, v8}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0, v5}, Lcom/esotericsoftware/asm/ClassReader;->readLong(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v5

    invoke-virtual {v7, v5, v6}, Lcom/esotericsoftware/asm/Item;->a(D)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p0, v5}, Lcom/esotericsoftware/asm/ClassReader;->readLong(I)J

    move-result-wide v5

    invoke-virtual {v7, v5, v6}, Lcom/esotericsoftware/asm/Item;->a(J)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v5}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-virtual {v7, v5}, Lcom/esotericsoftware/asm/Item;->a(F)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v5}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    move-result v5

    invoke-virtual {v7, v5}, Lcom/esotericsoftware/asm/Item;->a(I)V

    goto :goto_2

    :cond_4
    iget-object v6, p1, Lcom/esotericsoftware/asm/ClassWriter;->A:Lcom/esotericsoftware/asm/ByteVector;

    if-nez v6, :cond_5

    invoke-direct {p0, p1, v2, v0}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/ClassWriter;[Lcom/esotericsoftware/asm/Item;[C)V

    :cond_5
    iget-object v6, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    add-int/lit8 v8, v5, 0x2

    invoke-virtual {p0, v8}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v8

    aget v6, v6, v8

    invoke-virtual {p0, v6, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v6, v6, 0x2

    invoke-virtual {p0, v6, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v5

    invoke-virtual {v7, v8, v6, v5}, Lcom/esotericsoftware/asm/Item;->a(Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_2

    :cond_6
    iget-object v6, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    add-int/lit8 v8, v5, 0x1

    invoke-virtual {p0, v8}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v8

    aget v6, v6, v8

    iget-object v8, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    add-int/lit8 v9, v6, 0x2

    invoke-virtual {p0, v9}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v9

    aget v8, v8, v9

    invoke-virtual {p0, v5}, Lcom/esotericsoftware/asm/ClassReader;->readByte(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x14

    invoke-virtual {p0, v6, v0}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v8, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v8, v8, 0x2

    invoke-virtual {p0, v8, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v5, v6, v9, v8}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    iget-object v5, p0, Lcom/esotericsoftware/asm/ClassReader;->c:[Ljava/lang/String;

    aget-object v9, v5, v4

    if-nez v9, :cond_8

    iget-object v9, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    aget v9, v9, v4

    add-int/lit8 v10, v9, 0x2

    invoke-virtual {p0, v9}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    move-result v9

    invoke-direct {p0, v10, v9, v0}, Lcom/esotericsoftware/asm/ClassReader;->a(II[C)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v5, v4

    :cond_8
    invoke-virtual {v7, v6, v9, v8, v8}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    iget v5, v7, Lcom/esotericsoftware/asm/Item;->j:I

    rem-int/2addr v5, v1

    aget-object v6, v2, v5

    iput-object v6, v7, Lcom/esotericsoftware/asm/Item;->k:Lcom/esotericsoftware/asm/Item;

    aput-object v7, v2, v5

    add-int/2addr v4, v3

    goto/16 :goto_0

    :cond_9
    aget v0, v5, v3

    sub-int/2addr v0, v3

    iget-object v3, p1, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    iget-object v4, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    iget p0, p0, Lcom/esotericsoftware/asm/ClassReader;->header:I

    sub-int/2addr p0, v0

    invoke-virtual {v3, v4, v0, p0}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    iput-object v2, p1, Lcom/esotericsoftware/asm/ClassWriter;->e:[Lcom/esotericsoftware/asm/Item;

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    int-to-double v4, v1

    mul-double/2addr v4, v2

    double-to-int p0, v4

    iput p0, p1, Lcom/esotericsoftware/asm/ClassWriter;->f:I

    iput v1, p1, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public accept(Lcom/esotericsoftware/asm/ClassVisitor;I)V
    .locals 1

    .line 793
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/esotericsoftware/asm/Attribute;

    invoke-virtual {p0, p1, v0, p2}, Lcom/esotericsoftware/asm/ClassReader;->accept(Lcom/esotericsoftware/asm/ClassVisitor;[Lcom/esotericsoftware/asm/Attribute;I)V

    return-void
.end method

.method public accept(Lcom/esotericsoftware/asm/ClassVisitor;[Lcom/esotericsoftware/asm/Attribute;I)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v8, p3

    .line 4
    .line 5
    iget v1, v0, Lcom/esotericsoftware/asm/ClassReader;->header:I

    .line 6
    .line 7
    iget v2, v0, Lcom/esotericsoftware/asm/ClassReader;->d:I

    .line 8
    .line 9
    new-array v5, v2, [C

    .line 10
    .line 11
    new-instance v9, Lcom/esotericsoftware/asm/Context;

    .line 12
    .line 13
    invoke-direct {v9}, Lcom/esotericsoftware/asm/Context;-><init>()V

    .line 14
    .line 15
    .line 16
    move-object/from16 v2, p2

    .line 17
    .line 18
    iput-object v2, v9, Lcom/esotericsoftware/asm/Context;->a:[Lcom/esotericsoftware/asm/Attribute;

    .line 19
    .line 20
    iput v8, v9, Lcom/esotericsoftware/asm/Context;->b:I

    .line 21
    .line 22
    iput-object v5, v9, Lcom/esotericsoftware/asm/Context;->c:[C

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    add-int/lit8 v4, v1, 0x2

    .line 29
    .line 30
    invoke-virtual {v0, v4, v5}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v10

    .line 34
    add-int/lit8 v4, v1, 0x4

    .line 35
    .line 36
    invoke-virtual {v0, v4, v5}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    add-int/lit8 v4, v1, 0x6

    .line 41
    .line 42
    invoke-virtual {v0, v4}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 43
    .line 44
    .line 45
    move-result v12

    .line 46
    new-array v13, v12, [Ljava/lang/String;

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x8

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    :goto_0
    if-ge v4, v12, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v1, v5}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    aput-object v6, v13, v4

    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x2

    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-direct {v0}, Lcom/esotericsoftware/asm/ClassReader;->a()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    move/from16 v16, v1

    .line 73
    .line 74
    move/from16 v17, v3

    .line 75
    .line 76
    move/from16 v18, v4

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v14, 0x0

    .line 83
    const/4 v15, 0x0

    .line 84
    const/16 v19, 0x0

    .line 85
    .line 86
    const/16 v20, 0x0

    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    const/16 v22, 0x0

    .line 91
    .line 92
    const/16 v23, 0x0

    .line 93
    .line 94
    const/16 v24, 0x0

    .line 95
    .line 96
    :goto_1
    if-lez v18, :cond_10

    .line 97
    .line 98
    const/16 v25, 0x1

    .line 99
    .line 100
    add-int/lit8 v7, v16, 0x2

    .line 101
    .line 102
    invoke-virtual {v0, v7, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    move-object/from16 v26, v1

    .line 107
    .line 108
    const-string v1, "SourceFile"

    .line 109
    .line 110
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_1

    .line 115
    .line 116
    add-int/lit8 v1, v16, 0x8

    .line 117
    .line 118
    invoke-virtual {v0, v1, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    move-object v7, v0

    .line 123
    move-object/from16 v26, v11

    .line 124
    .line 125
    move/from16 v27, v12

    .line 126
    .line 127
    move-object/from16 v28, v13

    .line 128
    .line 129
    move-object/from16 v13, v24

    .line 130
    .line 131
    move-object/from16 v24, v10

    .line 132
    .line 133
    goto/16 :goto_8

    .line 134
    .line 135
    :cond_1
    const-string v1, "InnerClasses"

    .line 136
    .line 137
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_2

    .line 142
    .line 143
    add-int/lit8 v1, v16, 0x8

    .line 144
    .line 145
    move-object v7, v0

    .line 146
    move/from16 v22, v1

    .line 147
    .line 148
    :goto_2
    move/from16 v27, v12

    .line 149
    .line 150
    move-object/from16 v28, v13

    .line 151
    .line 152
    move-object/from16 v13, v24

    .line 153
    .line 154
    move-object/from16 v1, v26

    .line 155
    .line 156
    move-object/from16 v24, v10

    .line 157
    .line 158
    move-object/from16 v26, v11

    .line 159
    .line 160
    goto/16 :goto_8

    .line 161
    .line 162
    :cond_2
    const-string v1, "EnclosingMethod"

    .line 163
    .line 164
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_4

    .line 169
    .line 170
    add-int/lit8 v1, v16, 0x8

    .line 171
    .line 172
    invoke-virtual {v0, v1, v5}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    add-int/lit8 v1, v16, 0xa

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_3

    .line 183
    .line 184
    iget-object v4, v0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 185
    .line 186
    aget v4, v4, v1

    .line 187
    .line 188
    invoke-virtual {v0, v4, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v15

    .line 192
    iget-object v4, v0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 193
    .line 194
    aget v1, v4, v1

    .line 195
    .line 196
    add-int/lit8 v1, v1, 0x2

    .line 197
    .line 198
    invoke-virtual {v0, v1, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    :cond_3
    move-object/from16 v24, v10

    .line 203
    .line 204
    move/from16 v27, v12

    .line 205
    .line 206
    move-object/from16 v28, v13

    .line 207
    .line 208
    move-object/from16 v1, v26

    .line 209
    .line 210
    move-object v13, v7

    .line 211
    move-object/from16 v26, v11

    .line 212
    .line 213
    move-object v7, v0

    .line 214
    goto/16 :goto_8

    .line 215
    .line 216
    :cond_4
    const-string v1, "Signature"

    .line 217
    .line 218
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_5

    .line 223
    .line 224
    add-int/lit8 v1, v16, 0x8

    .line 225
    .line 226
    invoke-virtual {v0, v1, v5}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v19

    .line 230
    :goto_3
    move-object v7, v0

    .line 231
    goto :goto_2

    .line 232
    :cond_5
    const-string v1, "RuntimeVisibleAnnotations"

    .line 233
    .line 234
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_6

    .line 239
    .line 240
    add-int/lit8 v6, v16, 0x8

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_6
    const-string v1, "RuntimeVisibleTypeAnnotations"

    .line 244
    .line 245
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_7

    .line 250
    .line 251
    add-int/lit8 v1, v16, 0x8

    .line 252
    .line 253
    move-object v7, v0

    .line 254
    move/from16 v20, v1

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_7
    const-string v1, "Deprecated"

    .line 258
    .line 259
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-eqz v1, :cond_8

    .line 264
    .line 265
    const/high16 v1, 0x20000

    .line 266
    .line 267
    :goto_4
    or-int v1, v17, v1

    .line 268
    .line 269
    move-object v7, v0

    .line 270
    move/from16 v17, v1

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_8
    const-string v1, "Synthetic"

    .line 274
    .line 275
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_9

    .line 280
    .line 281
    const v1, 0x41000

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_9
    const-string v1, "SourceDebugExtension"

    .line 286
    .line 287
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_a

    .line 292
    .line 293
    add-int/lit8 v1, v16, 0x4

    .line 294
    .line 295
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    add-int/lit8 v3, v16, 0x8

    .line 300
    .line 301
    new-array v7, v1, [C

    .line 302
    .line 303
    invoke-direct {v0, v3, v1, v7}, Lcom/esotericsoftware/asm/ClassReader;->a(II[C)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    goto :goto_3

    .line 308
    :cond_a
    const-string v1, "RuntimeInvisibleAnnotations"

    .line 309
    .line 310
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-eqz v1, :cond_b

    .line 315
    .line 316
    add-int/lit8 v1, v16, 0x8

    .line 317
    .line 318
    move-object v7, v0

    .line 319
    move v14, v1

    .line 320
    goto/16 :goto_2

    .line 321
    .line 322
    :cond_b
    const-string v1, "RuntimeInvisibleTypeAnnotations"

    .line 323
    .line 324
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_c

    .line 329
    .line 330
    add-int/lit8 v1, v16, 0x8

    .line 331
    .line 332
    move-object v7, v0

    .line 333
    move/from16 v21, v1

    .line 334
    .line 335
    goto/16 :goto_2

    .line 336
    .line 337
    :cond_c
    const-string v1, "BootstrapMethods"

    .line 338
    .line 339
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    if-eqz v1, :cond_e

    .line 344
    .line 345
    add-int/lit8 v1, v16, 0x8

    .line 346
    .line 347
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    new-array v7, v1, [I

    .line 352
    .line 353
    add-int/lit8 v27, v16, 0xa

    .line 354
    .line 355
    const/4 v2, 0x0

    .line 356
    :goto_5
    if-ge v2, v1, :cond_d

    .line 357
    .line 358
    aput v27, v7, v2

    .line 359
    .line 360
    move/from16 v28, v1

    .line 361
    .line 362
    add-int/lit8 v1, v27, 0x2

    .line 363
    .line 364
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    add-int/lit8 v1, v1, 0x2

    .line 369
    .line 370
    shl-int/lit8 v1, v1, 0x1

    .line 371
    .line 372
    add-int v27, v27, v1

    .line 373
    .line 374
    add-int/lit8 v2, v2, 0x1

    .line 375
    .line 376
    move/from16 v1, v28

    .line 377
    .line 378
    goto :goto_5

    .line 379
    :cond_d
    iput-object v7, v9, Lcom/esotericsoftware/asm/Context;->d:[I

    .line 380
    .line 381
    move-object v7, v0

    .line 382
    move/from16 v27, v12

    .line 383
    .line 384
    move-object/from16 v28, v13

    .line 385
    .line 386
    move-object/from16 v13, v24

    .line 387
    .line 388
    move-object/from16 v8, v26

    .line 389
    .line 390
    move v12, v6

    .line 391
    move-object/from16 v24, v10

    .line 392
    .line 393
    move-object/from16 v26, v11

    .line 394
    .line 395
    move-object v10, v3

    .line 396
    move-object v11, v4

    .line 397
    move-object/from16 v0, v23

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :cond_e
    move-object v1, v3

    .line 401
    add-int/lit8 v3, v16, 0x8

    .line 402
    .line 403
    add-int/lit8 v2, v16, 0x4

    .line 404
    .line 405
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    move/from16 v25, v6

    .line 410
    .line 411
    const/4 v6, -0x1

    .line 412
    move-object/from16 v27, v4

    .line 413
    .line 414
    move v4, v2

    .line 415
    move-object v2, v7

    .line 416
    const/4 v7, 0x0

    .line 417
    move-object/from16 v28, v13

    .line 418
    .line 419
    move-object/from16 v13, v24

    .line 420
    .line 421
    move-object/from16 v8, v26

    .line 422
    .line 423
    move-object/from16 v24, v10

    .line 424
    .line 425
    move-object/from16 v26, v11

    .line 426
    .line 427
    move-object/from16 v11, v27

    .line 428
    .line 429
    move-object v10, v1

    .line 430
    move/from16 v27, v12

    .line 431
    .line 432
    move/from16 v12, v25

    .line 433
    .line 434
    move-object/from16 v1, p2

    .line 435
    .line 436
    invoke-direct/range {v0 .. v7}, Lcom/esotericsoftware/asm/ClassReader;->a([Lcom/esotericsoftware/asm/Attribute;Ljava/lang/String;II[CI[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Attribute;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    move-object v7, v0

    .line 441
    move-object/from16 v0, v23

    .line 442
    .line 443
    if-eqz v2, :cond_f

    .line 444
    .line 445
    iput-object v0, v2, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 446
    .line 447
    move-object/from16 v23, v2

    .line 448
    .line 449
    :goto_6
    move-object v1, v8

    .line 450
    move-object v3, v10

    .line 451
    move-object v4, v11

    .line 452
    move v6, v12

    .line 453
    goto :goto_8

    .line 454
    :cond_f
    :goto_7
    move-object/from16 v23, v0

    .line 455
    .line 456
    goto :goto_6

    .line 457
    :goto_8
    add-int/lit8 v0, v16, 0x4

    .line 458
    .line 459
    invoke-virtual {v7, v0}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    add-int/lit8 v0, v0, 0x6

    .line 464
    .line 465
    add-int v16, v0, v16

    .line 466
    .line 467
    add-int/lit8 v18, v18, -0x1

    .line 468
    .line 469
    move-object/from16 v2, p2

    .line 470
    .line 471
    move/from16 v8, p3

    .line 472
    .line 473
    move-object v0, v7

    .line 474
    move-object/from16 v10, v24

    .line 475
    .line 476
    move-object/from16 v11, v26

    .line 477
    .line 478
    move/from16 v12, v27

    .line 479
    .line 480
    move-object/from16 v24, v13

    .line 481
    .line 482
    move-object/from16 v13, v28

    .line 483
    .line 484
    goto/16 :goto_1

    .line 485
    .line 486
    :cond_10
    move-object v7, v0

    .line 487
    move-object v8, v1

    .line 488
    move-object/from16 v26, v11

    .line 489
    .line 490
    move/from16 v27, v12

    .line 491
    .line 492
    move-object/from16 v28, v13

    .line 493
    .line 494
    move-object/from16 v0, v23

    .line 495
    .line 496
    move-object/from16 v13, v24

    .line 497
    .line 498
    const/16 v25, 0x1

    .line 499
    .line 500
    move-object v11, v4

    .line 501
    move v12, v6

    .line 502
    move-object/from16 v24, v10

    .line 503
    .line 504
    move-object v10, v3

    .line 505
    iget-object v1, v7, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 506
    .line 507
    aget v1, v1, v25

    .line 508
    .line 509
    add-int/lit8 v1, v1, -0x7

    .line 510
    .line 511
    invoke-virtual {v7, v1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    move-object/from16 v16, v9

    .line 516
    .line 517
    move/from16 v2, v17

    .line 518
    .line 519
    move-object/from16 v4, v19

    .line 520
    .line 521
    move-object/from16 v3, v24

    .line 522
    .line 523
    move-object/from16 v6, v28

    .line 524
    .line 525
    move-object/from16 v0, p1

    .line 526
    .line 527
    move-object v9, v5

    .line 528
    move-object/from16 v5, v26

    .line 529
    .line 530
    invoke-virtual/range {v0 .. v6}, Lcom/esotericsoftware/asm/ClassVisitor;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    and-int/lit8 v1, p3, 0x2

    .line 534
    .line 535
    if-nez v1, :cond_12

    .line 536
    .line 537
    if-nez v8, :cond_11

    .line 538
    .line 539
    if-eqz v10, :cond_12

    .line 540
    .line 541
    :cond_11
    invoke-virtual {v0, v8, v10}, Lcom/esotericsoftware/asm/ClassVisitor;->visitSource(Ljava/lang/String;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    :cond_12
    if-eqz v13, :cond_13

    .line 545
    .line 546
    invoke-virtual {v0, v13, v15, v11}, Lcom/esotericsoftware/asm/ClassVisitor;->visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    :cond_13
    if-eqz v12, :cond_14

    .line 550
    .line 551
    invoke-virtual {v7, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    add-int/lit8 v6, v12, 0x2

    .line 556
    .line 557
    :goto_9
    if-lez v1, :cond_14

    .line 558
    .line 559
    add-int/lit8 v2, v6, 0x2

    .line 560
    .line 561
    invoke-virtual {v7, v6, v9}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    move/from16 v4, v25

    .line 566
    .line 567
    invoke-virtual {v0, v3, v4}, Lcom/esotericsoftware/asm/ClassVisitor;->visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    invoke-direct {v7, v2, v9, v4, v3}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 572
    .line 573
    .line 574
    move-result v6

    .line 575
    add-int/lit8 v1, v1, -0x1

    .line 576
    .line 577
    const/16 v25, 0x1

    .line 578
    .line 579
    goto :goto_9

    .line 580
    :cond_14
    if-eqz v14, :cond_15

    .line 581
    .line 582
    invoke-virtual {v7, v14}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    add-int/lit8 v14, v14, 0x2

    .line 587
    .line 588
    :goto_a
    if-lez v1, :cond_15

    .line 589
    .line 590
    add-int/lit8 v2, v14, 0x2

    .line 591
    .line 592
    invoke-virtual {v7, v14, v9}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    const/4 v4, 0x0

    .line 597
    invoke-virtual {v0, v3, v4}, Lcom/esotericsoftware/asm/ClassVisitor;->visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    const/4 v4, 0x1

    .line 602
    invoke-direct {v7, v2, v9, v4, v3}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 603
    .line 604
    .line 605
    move-result v14

    .line 606
    add-int/lit8 v1, v1, -0x1

    .line 607
    .line 608
    goto :goto_a

    .line 609
    :cond_15
    move/from16 v14, v20

    .line 610
    .line 611
    if-eqz v14, :cond_16

    .line 612
    .line 613
    invoke-virtual {v7, v14}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 614
    .line 615
    .line 616
    move-result v1

    .line 617
    add-int/lit8 v20, v14, 0x2

    .line 618
    .line 619
    move/from16 v2, v20

    .line 620
    .line 621
    :goto_b
    if-lez v1, :cond_16

    .line 622
    .line 623
    move-object/from16 v3, v16

    .line 624
    .line 625
    invoke-direct {v7, v3, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;I)I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    add-int/lit8 v4, v2, 0x2

    .line 630
    .line 631
    iget v5, v3, Lcom/esotericsoftware/asm/Context;->i:I

    .line 632
    .line 633
    iget-object v6, v3, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    .line 634
    .line 635
    invoke-virtual {v7, v2, v9}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    const/4 v8, 0x1

    .line 640
    invoke-virtual {v0, v5, v6, v2, v8}, Lcom/esotericsoftware/asm/ClassVisitor;->visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    invoke-direct {v7, v4, v9, v8, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    add-int/lit8 v1, v1, -0x1

    .line 649
    .line 650
    goto :goto_b

    .line 651
    :cond_16
    move-object/from16 v3, v16

    .line 652
    .line 653
    move/from16 v14, v21

    .line 654
    .line 655
    if-eqz v14, :cond_17

    .line 656
    .line 657
    invoke-virtual {v7, v14}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 658
    .line 659
    .line 660
    move-result v1

    .line 661
    add-int/lit8 v21, v14, 0x2

    .line 662
    .line 663
    move/from16 v2, v21

    .line 664
    .line 665
    :goto_c
    if-lez v1, :cond_17

    .line 666
    .line 667
    invoke-direct {v7, v3, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/Context;I)I

    .line 668
    .line 669
    .line 670
    move-result v2

    .line 671
    add-int/lit8 v4, v2, 0x2

    .line 672
    .line 673
    iget v5, v3, Lcom/esotericsoftware/asm/Context;->i:I

    .line 674
    .line 675
    iget-object v6, v3, Lcom/esotericsoftware/asm/Context;->j:Lcom/esotericsoftware/asm/TypePath;

    .line 676
    .line 677
    invoke-virtual {v7, v2, v9}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    const/4 v8, 0x0

    .line 682
    invoke-virtual {v0, v5, v6, v2, v8}, Lcom/esotericsoftware/asm/ClassVisitor;->visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    const/4 v5, 0x1

    .line 687
    invoke-direct {v7, v4, v9, v5, v2}, Lcom/esotericsoftware/asm/ClassReader;->a(I[CZLcom/esotericsoftware/asm/AnnotationVisitor;)I

    .line 688
    .line 689
    .line 690
    move-result v2

    .line 691
    add-int/lit8 v1, v1, -0x1

    .line 692
    .line 693
    goto :goto_c

    .line 694
    :cond_17
    move-object/from16 v1, v23

    .line 695
    .line 696
    :goto_d
    if-eqz v1, :cond_18

    .line 697
    .line 698
    iget-object v2, v1, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 699
    .line 700
    const/4 v4, 0x0

    .line 701
    iput-object v4, v1, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 702
    .line 703
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ClassVisitor;->visitAttribute(Lcom/esotericsoftware/asm/Attribute;)V

    .line 704
    .line 705
    .line 706
    move-object v1, v2

    .line 707
    goto :goto_d

    .line 708
    :cond_18
    move/from16 v14, v22

    .line 709
    .line 710
    if-eqz v14, :cond_19

    .line 711
    .line 712
    add-int/lit8 v22, v14, 0x2

    .line 713
    .line 714
    invoke-virtual {v7, v14}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 715
    .line 716
    .line 717
    move-result v1

    .line 718
    move/from16 v2, v22

    .line 719
    .line 720
    :goto_e
    if-lez v1, :cond_19

    .line 721
    .line 722
    invoke-virtual {v7, v2, v9}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    add-int/lit8 v5, v2, 0x2

    .line 727
    .line 728
    invoke-virtual {v7, v5, v9}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v5

    .line 732
    add-int/lit8 v6, v2, 0x4

    .line 733
    .line 734
    invoke-virtual {v7, v6, v9}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v6

    .line 738
    add-int/lit8 v8, v2, 0x6

    .line 739
    .line 740
    invoke-virtual {v7, v8}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 741
    .line 742
    .line 743
    move-result v8

    .line 744
    invoke-virtual {v0, v4, v5, v6, v8}, Lcom/esotericsoftware/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 745
    .line 746
    .line 747
    add-int/lit8 v2, v2, 0x8

    .line 748
    .line 749
    add-int/lit8 v1, v1, -0x1

    .line 750
    .line 751
    goto :goto_e

    .line 752
    :cond_19
    iget v1, v7, Lcom/esotericsoftware/asm/ClassReader;->header:I

    .line 753
    .line 754
    add-int/lit8 v1, v1, 0xa

    .line 755
    .line 756
    mul-int/lit8 v12, v27, 0x2

    .line 757
    .line 758
    add-int/2addr v12, v1

    .line 759
    add-int/lit8 v1, v12, -0x2

    .line 760
    .line 761
    invoke-virtual {v7, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    :goto_f
    if-lez v1, :cond_1a

    .line 766
    .line 767
    invoke-direct {v7, v0, v3, v12}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/ClassVisitor;Lcom/esotericsoftware/asm/Context;I)I

    .line 768
    .line 769
    .line 770
    move-result v12

    .line 771
    add-int/lit8 v1, v1, -0x1

    .line 772
    .line 773
    goto :goto_f

    .line 774
    :cond_1a
    add-int/lit8 v1, v12, 0x2

    .line 775
    .line 776
    invoke-virtual {v7, v12}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    :goto_10
    if-lez v2, :cond_1b

    .line 781
    .line 782
    invoke-direct {v7, v0, v3, v1}, Lcom/esotericsoftware/asm/ClassReader;->b(Lcom/esotericsoftware/asm/ClassVisitor;Lcom/esotericsoftware/asm/Context;I)I

    .line 783
    .line 784
    .line 785
    move-result v1

    .line 786
    add-int/lit8 v2, v2, -0x1

    .line 787
    .line 788
    goto :goto_10

    .line 789
    :cond_1b
    invoke-virtual {v0}, Lcom/esotericsoftware/asm/ClassVisitor;->visitEnd()V

    .line 790
    .line 791
    .line 792
    return-void
.end method

.method public getAccess()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/ClassReader;->header:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/ClassReader;->header:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/asm/ClassReader;->d:I

    .line 6
    .line 7
    new-array v1, v1, [C

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getInterfaces()[Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/ClassReader;->header:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-array v2, v1, [Ljava/lang/String;

    .line 10
    .line 11
    if-lez v1, :cond_0

    .line 12
    .line 13
    iget v3, p0, Lcom/esotericsoftware/asm/ClassReader;->d:I

    .line 14
    .line 15
    new-array v3, v3, [C

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    if-ge v4, v1, :cond_0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v0, v3}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    aput-object v5, v2, v4

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v2
.end method

.method public getItem(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 2
    .line 3
    aget p0, p0, p1

    .line 4
    .line 5
    return p0
.end method

.method public getItemCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public getMaxStringLength()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/asm/ClassReader;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public getSuperName()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/ClassReader;->header:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/asm/ClassReader;->d:I

    .line 6
    .line 7
    new-array v1, v1, [C

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public readByte(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    and-int/lit16 p0, p0, 0xff

    .line 6
    .line 7
    return p0
.end method

.method public readClass(I[C)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public readConst(I[C)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 6
    .line 7
    add-int/lit8 v1, p1, -0x1

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readByte(I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    add-int/2addr p1, v1

    .line 26
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    aget p1, v0, p1

    .line 31
    .line 32
    iget-object v2, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 33
    .line 34
    add-int/lit8 v4, p1, -0x1

    .line 35
    .line 36
    aget-byte v2, v2, v4

    .line 37
    .line 38
    const/16 v4, 0xb

    .line 39
    .line 40
    if-ne v2, v4, :cond_0

    .line 41
    .line 42
    :goto_0
    move v7, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/4 v1, 0x0

    .line 45
    goto :goto_0

    .line 46
    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    add-int/lit8 p1, p1, 0x2

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    aget p1, v0, p1

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    add-int/lit8 p1, p1, 0x2

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    new-instance v2, Lcom/esotericsoftware/asm/Handle;

    .line 69
    .line 70
    invoke-direct/range {v2 .. v7}, Lcom/esotericsoftware/asm/Handle;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getObjectType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_2
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readLong(I)J

    .line 89
    .line 90
    .line 91
    move-result-wide p0

    .line 92
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 93
    .line 94
    .line 95
    move-result-wide p0

    .line 96
    new-instance p2, Ljava/lang/Double;

    .line 97
    .line 98
    invoke-direct {p2, p0, p1}, Ljava/lang/Double;-><init>(D)V

    .line 99
    .line 100
    .line 101
    return-object p2

    .line 102
    :pswitch_3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readLong(I)J

    .line 103
    .line 104
    .line 105
    move-result-wide p0

    .line 106
    new-instance p2, Ljava/lang/Long;

    .line 107
    .line 108
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 109
    .line 110
    .line 111
    return-object p2

    .line 112
    :pswitch_4
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    new-instance p1, Ljava/lang/Float;

    .line 121
    .line 122
    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    .line 123
    .line 124
    .line 125
    return-object p1

    .line 126
    :pswitch_5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    new-instance p1, Ljava/lang/Integer;

    .line 131
    .line 132
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 133
    .line 134
    .line 135
    return-object p1

    .line 136
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0}, Lcom/esotericsoftware/asm/Type;->getMethodType(Ljava/lang/String;)Lcom/esotericsoftware/asm/Type;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readInt(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x18

    .line 8
    .line 9
    add-int/lit8 v1, p1, 0x1

    .line 10
    .line 11
    aget-byte v1, p0, v1

    .line 12
    .line 13
    and-int/lit16 v1, v1, 0xff

    .line 14
    .line 15
    shl-int/lit8 v1, v1, 0x10

    .line 16
    .line 17
    or-int/2addr v0, v1

    .line 18
    add-int/lit8 v1, p1, 0x2

    .line 19
    .line 20
    aget-byte v1, p0, v1

    .line 21
    .line 22
    and-int/lit16 v1, v1, 0xff

    .line 23
    .line 24
    shl-int/lit8 v1, v1, 0x8

    .line 25
    .line 26
    or-int/2addr v0, v1

    .line 27
    add-int/lit8 p1, p1, 0x3

    .line 28
    .line 29
    aget-byte p0, p0, p1

    .line 30
    .line 31
    and-int/lit16 p0, p0, 0xff

    .line 32
    .line 33
    or-int/2addr p0, v0

    .line 34
    return p0
.end method

.method public readLabel(I[Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Label;
    .locals 0

    .line 1
    aget-object p0, p2, p1

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lcom/esotericsoftware/asm/Label;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 8
    .line 9
    .line 10
    aput-object p0, p2, p1

    .line 11
    .line 12
    :cond_0
    aget-object p0, p2, p1

    .line 13
    .line 14
    return-object p0
.end method

.method public readLong(I)J
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    add-int/lit8 p1, p1, 0x4

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readInt(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    int-to-long p0, p0

    .line 13
    const-wide v2, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p0, v2

    .line 19
    const/16 v2, 0x20

    .line 20
    .line 21
    shl-long/2addr v0, v2

    .line 22
    or-long/2addr p0, v0

    .line 23
    return-wide p0
.end method

.method public readShort(I)S
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x8

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    aget-byte p0, p0, p1

    .line 12
    .line 13
    and-int/lit16 p0, p0, 0xff

    .line 14
    .line 15
    or-int/2addr p0, v0

    .line 16
    int-to-short p0, p0

    .line 17
    return p0
.end method

.method public readUTF8(I[C)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassReader;->c:[Ljava/lang/String;

    .line 11
    .line 12
    aget-object v1, p1, v0

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_1
    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassReader;->a:[I

    .line 18
    .line 19
    aget v1, v1, v0

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x2

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/asm/ClassReader;->readUnsignedShort(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-direct {p0, v2, v1, p2}, Lcom/esotericsoftware/asm/ClassReader;->a(II[C)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    aput-object p0, p1, v0

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public readUnsignedShort(I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x8

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    aget-byte p0, p0, p1

    .line 12
    .line 13
    and-int/lit16 p0, p0, 0xff

    .line 14
    .line 15
    or-int/2addr p0, v0

    .line 16
    return p0
.end method
