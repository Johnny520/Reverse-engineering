.class Lcom/esotericsoftware/asm/MethodWriter;
.super Lcom/esotericsoftware/asm/MethodVisitor;


# instance fields
.field private $:Lcom/esotericsoftware/asm/ByteVector;

.field private A:I

.field private B:Lcom/esotericsoftware/asm/Handler;

.field private C:Lcom/esotericsoftware/asm/Handler;

.field private D:I

.field private E:Lcom/esotericsoftware/asm/ByteVector;

.field private F:I

.field private G:Lcom/esotericsoftware/asm/ByteVector;

.field private H:I

.field private I:Lcom/esotericsoftware/asm/ByteVector;

.field private J:Lcom/esotericsoftware/asm/Attribute;

.field private K:Z

.field private L:I

.field private final M:I

.field private N:Lcom/esotericsoftware/asm/Label;

.field private O:Lcom/esotericsoftware/asm/Label;

.field private P:Lcom/esotericsoftware/asm/Label;

.field private Q:I

.field private R:I

.field private S:I

.field private T:I

.field private U:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private V:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private W:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private X:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private Y:I

.field private Z:I

.field final b:Lcom/esotericsoftware/asm/ClassWriter;

.field private c:I

.field private final d:I

.field private final e:I

.field private final f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:I

.field i:I

.field j:I

.field k:[I

.field private l:Lcom/esotericsoftware/asm/ByteVector;

.field private m:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private n:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private o:[Lcom/esotericsoftware/asm/AnnotationWriter;

.field private p:[Lcom/esotericsoftware/asm/AnnotationWriter;

.field private q:Lcom/esotericsoftware/asm/Attribute;

.field private r:Lcom/esotericsoftware/asm/ByteVector;

.field private s:I

.field private t:I

.field private u:I

.field private v:Lcom/esotericsoftware/asm/ByteVector;

.field private w:I

.field private x:[I

.field private z:[I


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZZ)V
    .locals 2

    .line 1
    const/high16 v0, 0x50000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/MethodVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/esotericsoftware/asm/ByteVector;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 12
    .line 13
    iget-object v0, p1, Lcom/esotericsoftware/asm/ClassWriter;->D:Lcom/esotericsoftware/asm/MethodWriter;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iput-object p0, p1, Lcom/esotericsoftware/asm/ClassWriter;->D:Lcom/esotericsoftware/asm/MethodWriter;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p1, Lcom/esotericsoftware/asm/ClassWriter;->E:Lcom/esotericsoftware/asm/MethodWriter;

    .line 21
    .line 22
    iput-object p0, v0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 23
    .line 24
    :goto_0
    iput-object p0, p1, Lcom/esotericsoftware/asm/ClassWriter;->E:Lcom/esotericsoftware/asm/MethodWriter;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 27
    .line 28
    iput p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    .line 29
    .line 30
    const-string v0, "<init>"

    .line 31
    .line 32
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    .line 39
    .line 40
    const/high16 v1, 0x80000

    .line 41
    .line 42
    or-int/2addr v0, v1

    .line 43
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    .line 44
    .line 45
    :cond_1
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    iput p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->d:I

    .line 50
    .line 51
    invoke-virtual {p1, p4}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    iput p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->e:I

    .line 56
    .line 57
    iput-object p4, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 58
    .line 59
    iput-object p5, p0, Lcom/esotericsoftware/asm/MethodWriter;->g:Ljava/lang/String;

    .line 60
    .line 61
    const/4 p3, 0x0

    .line 62
    if-eqz p6, :cond_2

    .line 63
    .line 64
    array-length p4, p6

    .line 65
    if-lez p4, :cond_2

    .line 66
    .line 67
    array-length p4, p6

    .line 68
    iput p4, p0, Lcom/esotericsoftware/asm/MethodWriter;->j:I

    .line 69
    .line 70
    new-array p4, p4, [I

    .line 71
    .line 72
    iput-object p4, p0, Lcom/esotericsoftware/asm/MethodWriter;->k:[I

    .line 73
    .line 74
    move p4, p3

    .line 75
    :goto_1
    iget p5, p0, Lcom/esotericsoftware/asm/MethodWriter;->j:I

    .line 76
    .line 77
    if-ge p4, p5, :cond_2

    .line 78
    .line 79
    iget-object p5, p0, Lcom/esotericsoftware/asm/MethodWriter;->k:[I

    .line 80
    .line 81
    aget-object v0, p6, p4

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    aput v0, p5, p4

    .line 88
    .line 89
    add-int/lit8 p4, p4, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    const/4 p1, 0x2

    .line 93
    if-eqz p8, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    if-eqz p7, :cond_4

    .line 97
    .line 98
    const/4 p3, 0x1

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    move p3, p1

    .line 101
    :goto_2
    iput p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 102
    .line 103
    if-nez p7, :cond_6

    .line 104
    .line 105
    if-eqz p8, :cond_5

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    return-void

    .line 109
    :cond_6
    :goto_3
    iget-object p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {p3}, Lcom/esotericsoftware/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    shr-int/lit8 p1, p3, 0x2

    .line 116
    .line 117
    and-int/lit8 p2, p2, 0x8

    .line 118
    .line 119
    if-eqz p2, :cond_7

    .line 120
    .line 121
    add-int/lit8 p1, p1, -0x1

    .line 122
    .line 123
    :cond_7
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 124
    .line 125
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->T:I

    .line 126
    .line 127
    new-instance p1, Lcom/esotericsoftware/asm/Label;

    .line 128
    .line 129
    invoke-direct {p1}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 130
    .line 131
    .line 132
    iput-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->N:Lcom/esotericsoftware/asm/Label;

    .line 133
    .line 134
    iget p2, p1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 135
    .line 136
    or-int/lit8 p2, p2, 0x8

    .line 137
    .line 138
    iput p2, p1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodWriter;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method private a(III)I
    .locals 2

    .line 990
    add-int/lit8 v0, p2, 0x3

    add-int/2addr v0, p3

    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    if-eqz v1, :cond_0

    array-length v1, v1

    if-ge v1, v0, :cond_1

    :cond_0
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    :cond_1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    const/4 v0, 0x0

    aput p1, p0, v0

    const/4 p1, 0x1

    aput p2, p0, p1

    const/4 p1, 0x2

    aput p3, p0, p1

    const/4 p0, 0x3

    return p0
.end method

.method public static a([BI)I
    .locals 2

    .line 991
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static a([I[III)I
    .locals 3

    .line 992
    sub-int v0, p3, p2

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    aget v2, p0, v1

    if-ge p2, v2, :cond_0

    if-gt v2, p3, :cond_0

    aget v2, p1, v1

    add-int/2addr v0, v2

    goto :goto_1

    :cond_0
    if-ge p3, v2, :cond_1

    if-gt v2, p2, :cond_1

    aget v2, p1, v1

    sub-int/2addr v0, v2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method private a(II)V
    .locals 8

    .line 993
    :goto_0
    if-ge p1, p2, :cond_8

    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    aget v0, v0, p1

    const/high16 v1, -0x10000000

    and-int/2addr v1, v0

    const/4 v2, 0x7

    const/high16 v3, 0x1700000

    const/high16 v4, 0xff00000

    const v5, 0xfffff

    if-nez v1, :cond_2

    and-int v1, v0, v5

    and-int/2addr v0, v4

    if-eq v0, v3, :cond_1

    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    const/high16 v3, 0x1800000

    if-eq v0, v3, :cond_0

    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    goto/16 :goto_5

    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object v0

    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    iget-object v2, v2, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    aget-object v1, v2, v1

    iget v1, v1, Lcom/esotericsoftware/asm/Item;->c:I

    goto/16 :goto_4

    :cond_1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object v0

    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    iget-object v3, v2, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    aget-object v1, v3, v1

    iget-object v1, v1, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    move-result v1

    goto/16 :goto_4

    :cond_2
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    shr-int/lit8 v1, v1, 0x1c

    :goto_1
    add-int/lit8 v7, v1, -0x1

    if-lez v1, :cond_3

    const/16 v1, 0x5b

    invoke-virtual {v6, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move v1, v7

    goto :goto_1

    :cond_3
    and-int v1, v0, v4

    if-ne v1, v3, :cond_4

    const/16 v1, 0x4c

    invoke-virtual {v6, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    iget-object v1, v1, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    and-int/2addr v0, v5

    aget-object v0, v1, v0

    iget-object v0, v0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v0, 0x3b

    :goto_2
    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_3

    :cond_4
    and-int/lit8 v0, v0, 0xf

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x4a

    goto :goto_2

    :pswitch_0
    const/16 v0, 0x53

    goto :goto_2

    :pswitch_1
    const/16 v0, 0x43

    goto :goto_2

    :pswitch_2
    const/16 v0, 0x42

    goto :goto_2

    :pswitch_3
    const/16 v0, 0x5a

    goto :goto_2

    :cond_5
    const/16 v0, 0x44

    goto :goto_2

    :cond_6
    const/16 v0, 0x46

    goto :goto_2

    :cond_7
    const/16 v0, 0x49

    goto :goto_2

    :goto_3
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object v0

    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    move-result v1

    :goto_4
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    :goto_5
    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_0

    :cond_8
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(ILcom/esotericsoftware/asm/Label;)V
    .locals 1

    .line 994
    new-instance v0, Lcom/esotericsoftware/asm/Edge;

    invoke-direct {v0}, Lcom/esotericsoftware/asm/Edge;-><init>()V

    iput p1, v0, Lcom/esotericsoftware/asm/Edge;->a:I

    iput-object p2, v0, Lcom/esotericsoftware/asm/Edge;->b:Lcom/esotericsoftware/asm/Label;

    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    iget-object p1, p0, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    iput-object p1, v0, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    iput-object v0, p0, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    return-void
.end method

.method private a(Lcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V
    .locals 4

    .line 996
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    if-eqz v0, :cond_2

    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object v0, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    const/16 v1, 0xab

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v3}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, v2, p1}, Lcom/esotericsoftware/asm/MethodWriter;->a(ILcom/esotericsoftware/asm/Label;)V

    invoke-virtual {p1}, Lcom/esotericsoftware/asm/Label;->a()Lcom/esotericsoftware/asm/Label;

    move-result-object p1

    iget v0, p1, Lcom/esotericsoftware/asm/Label;->a:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p1, Lcom/esotericsoftware/asm/Label;->a:I

    move p1, v2

    :goto_0
    array-length v0, p2

    if-ge p1, v0, :cond_1

    aget-object v0, p2, p1

    invoke-direct {p0, v2, v0}, Lcom/esotericsoftware/asm/MethodWriter;->a(ILcom/esotericsoftware/asm/Label;)V

    aget-object v0, p2, p1

    invoke-virtual {v0}, Lcom/esotericsoftware/asm/Label;->a()Lcom/esotericsoftware/asm/Label;

    move-result-object v0

    iget v1, v0, Lcom/esotericsoftware/asm/Label;->a:I

    or-int/lit8 v1, v1, 0x10

    iput v1, v0, Lcom/esotericsoftware/asm/Label;->a:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/asm/MethodWriter;->a(ILcom/esotericsoftware/asm/Label;)V

    :goto_1
    array-length p1, p2

    if-ge v2, p1, :cond_1

    iget p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    aget-object v0, p2, v2

    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/asm/MethodWriter;->a(ILcom/esotericsoftware/asm/Label;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->e()V

    :cond_2
    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 2

    .line 997
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object v0

    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    return-void

    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    return-void

    :cond_1
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object p0

    check-cast p1, Lcom/esotericsoftware/asm/Label;

    iget p1, p1, Lcom/esotericsoftware/asm/Label;->c:I

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    return-void
.end method

.method public static a([BII)V
    .locals 1

    .line 998
    ushr-int/lit8 v0, p2, 0x8

    int-to-byte v0, v0

    aput-byte v0, p0, p1

    add-int/lit8 p1, p1, 0x1

    int-to-byte p2, p2

    aput-byte p2, p0, p1

    return-void
.end method

.method public static a([I[ILcom/esotericsoftware/asm/Label;)V
    .locals 2

    .line 999
    iget v0, p2, Lcom/esotericsoftware/asm/Label;->a:I

    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iget v1, p2, Lcom/esotericsoftware/asm/Label;->c:I

    invoke-static {p0, p1, v0, v1}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    move-result p0

    iput p0, p2, Lcom/esotericsoftware/asm/Label;->c:I

    iget p0, p2, Lcom/esotericsoftware/asm/Label;->a:I

    or-int/lit8 p0, p0, 0x4

    iput p0, p2, Lcom/esotericsoftware/asm/Label;->a:I

    :cond_0
    return-void
.end method

.method public static b([BI)S
    .locals 1

    .line 113
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    int-to-short p0, p0

    return p0
.end method

.method private b()V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->x:[I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    if-nez v0, :cond_0

    new-instance v0, Lcom/esotericsoftware/asm/ByteVector;

    invoke-direct {v0}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    :cond_0
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->c()V

    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->u:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->u:I

    :cond_1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->x:[I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    return-void
.end method

.method private b(Lcom/esotericsoftware/asm/Frame;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lcom/esotericsoftware/asm/Frame;->c:[I

    .line 2
    .line 3
    iget-object v1, p1, Lcom/esotericsoftware/asm/Frame;->d:[I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    move v4, v3

    .line 8
    move v5, v4

    .line 9
    :goto_0
    array-length v6, v0

    .line 10
    const v7, 0x1000003

    .line 11
    .line 12
    .line 13
    const v8, 0x1000004

    .line 14
    .line 15
    .line 16
    if-ge v3, v6, :cond_3

    .line 17
    .line 18
    aget v6, v0, v3

    .line 19
    .line 20
    const/high16 v9, 0x1000000

    .line 21
    .line 22
    add-int/lit8 v5, v5, 0x1

    .line 23
    .line 24
    if-ne v6, v9, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/2addr v4, v5

    .line 28
    move v5, v2

    .line 29
    :goto_1
    if-eq v6, v8, :cond_1

    .line 30
    .line 31
    if-ne v6, v7, :cond_2

    .line 32
    .line 33
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    move v3, v2

    .line 39
    move v5, v3

    .line 40
    :goto_2
    array-length v6, v1

    .line 41
    if-ge v3, v6, :cond_6

    .line 42
    .line 43
    aget v6, v1, v3

    .line 44
    .line 45
    add-int/lit8 v5, v5, 0x1

    .line 46
    .line 47
    if-eq v6, v8, :cond_4

    .line 48
    .line 49
    if-ne v6, v7, :cond_5

    .line 50
    .line 51
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_6
    iget-object p1, p1, Lcom/esotericsoftware/asm/Frame;->b:Lcom/esotericsoftware/asm/Label;

    .line 57
    .line 58
    iget p1, p1, Lcom/esotericsoftware/asm/Label;->c:I

    .line 59
    .line 60
    invoke-direct {p0, p1, v4, v5}, Lcom/esotericsoftware/asm/MethodWriter;->a(III)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    move v3, v2

    .line 65
    :goto_3
    if-lez v4, :cond_9

    .line 66
    .line 67
    aget v5, v0, v3

    .line 68
    .line 69
    iget-object v6, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 70
    .line 71
    add-int/lit8 v9, p1, 0x1

    .line 72
    .line 73
    aput v5, v6, p1

    .line 74
    .line 75
    if-eq v5, v8, :cond_7

    .line 76
    .line 77
    if-ne v5, v7, :cond_8

    .line 78
    .line 79
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 82
    .line 83
    add-int/lit8 v4, v4, -0x1

    .line 84
    .line 85
    move p1, v9

    .line 86
    goto :goto_3

    .line 87
    :cond_9
    :goto_4
    array-length v0, v1

    .line 88
    if-ge v2, v0, :cond_c

    .line 89
    .line 90
    aget v0, v1, v2

    .line 91
    .line 92
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 93
    .line 94
    add-int/lit8 v4, p1, 0x1

    .line 95
    .line 96
    aput v0, v3, p1

    .line 97
    .line 98
    if-eq v0, v8, :cond_a

    .line 99
    .line 100
    if-ne v0, v7, :cond_b

    .line 101
    .line 102
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    :cond_b
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    move p1, v4

    .line 107
    goto :goto_4

    .line 108
    :cond_c
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->b()V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public static c([BI)I
    .locals 1

    .line 263
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method private c()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget v3, v1, v2

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    aget v4, v1, v4

    .line 10
    .line 11
    iget-object v5, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 12
    .line 13
    iget v5, v5, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    .line 14
    .line 15
    const v6, 0xffff

    .line 16
    .line 17
    .line 18
    and-int/2addr v5, v6

    .line 19
    const/16 v6, 0x32

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x3

    .line 23
    if-ge v5, v6, :cond_0

    .line 24
    .line 25
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 26
    .line 27
    aget v1, v1, v7

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 34
    .line 35
    .line 36
    add-int/2addr v3, v8

    .line 37
    invoke-direct {v0, v8, v3}, Lcom/esotericsoftware/asm/MethodWriter;->a(II)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 41
    .line 42
    invoke-virtual {v1, v4}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 43
    .line 44
    .line 45
    add-int/2addr v4, v3

    .line 46
    invoke-direct {v0, v3, v4}, Lcom/esotericsoftware/asm/MethodWriter;->a(II)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    iget-object v5, v0, Lcom/esotericsoftware/asm/MethodWriter;->x:[I

    .line 51
    .line 52
    aget v6, v5, v2

    .line 53
    .line 54
    iget v9, v0, Lcom/esotericsoftware/asm/MethodWriter;->u:I

    .line 55
    .line 56
    if-nez v9, :cond_1

    .line 57
    .line 58
    aget v1, v1, v7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    aget v1, v1, v7

    .line 62
    .line 63
    aget v5, v5, v7

    .line 64
    .line 65
    sub-int/2addr v1, v5

    .line 66
    sub-int/2addr v1, v2

    .line 67
    :goto_0
    const/16 v5, 0xf8

    .line 68
    .line 69
    const/16 v9, 0xfc

    .line 70
    .line 71
    const/16 v10, 0xf7

    .line 72
    .line 73
    const/16 v11, 0x40

    .line 74
    .line 75
    const/16 v12, 0xff

    .line 76
    .line 77
    const/16 v13, 0xfb

    .line 78
    .line 79
    if-nez v4, :cond_3

    .line 80
    .line 81
    sub-int v2, v3, v6

    .line 82
    .line 83
    packed-switch v2, :pswitch_data_0

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :pswitch_0
    move v14, v9

    .line 88
    goto :goto_3

    .line 89
    :pswitch_1
    if-ge v1, v11, :cond_2

    .line 90
    .line 91
    move v14, v7

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    move v14, v13

    .line 94
    goto :goto_3

    .line 95
    :pswitch_2
    move v6, v3

    .line 96
    move v14, v5

    .line 97
    goto :goto_3

    .line 98
    :cond_3
    if-ne v3, v6, :cond_5

    .line 99
    .line 100
    if-ne v4, v2, :cond_5

    .line 101
    .line 102
    const/16 v2, 0x3f

    .line 103
    .line 104
    if-ge v1, v2, :cond_4

    .line 105
    .line 106
    move v14, v11

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    move v14, v10

    .line 109
    :goto_1
    move v2, v7

    .line 110
    goto :goto_3

    .line 111
    :cond_5
    move v2, v7

    .line 112
    :goto_2
    move v14, v12

    .line 113
    :goto_3
    if-eq v14, v12, :cond_7

    .line 114
    .line 115
    move v15, v8

    .line 116
    :goto_4
    if-ge v7, v6, :cond_7

    .line 117
    .line 118
    move/from16 v16, v8

    .line 119
    .line 120
    iget-object v8, v0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 121
    .line 122
    aget v8, v8, v15

    .line 123
    .line 124
    iget-object v12, v0, Lcom/esotericsoftware/asm/MethodWriter;->x:[I

    .line 125
    .line 126
    aget v12, v12, v15

    .line 127
    .line 128
    if-eq v8, v12, :cond_6

    .line 129
    .line 130
    const/16 v14, 0xff

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_6
    add-int/lit8 v15, v15, 0x1

    .line 134
    .line 135
    add-int/lit8 v7, v7, 0x1

    .line 136
    .line 137
    move/from16 v8, v16

    .line 138
    .line 139
    const/16 v12, 0xff

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_7
    move/from16 v16, v8

    .line 143
    .line 144
    :goto_5
    if-eqz v14, :cond_d

    .line 145
    .line 146
    if-eq v14, v11, :cond_c

    .line 147
    .line 148
    if-eq v14, v10, :cond_b

    .line 149
    .line 150
    if-eq v14, v5, :cond_a

    .line 151
    .line 152
    if-eq v14, v13, :cond_9

    .line 153
    .line 154
    iget-object v5, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 155
    .line 156
    if-eq v14, v9, :cond_8

    .line 157
    .line 158
    const/16 v7, 0xff

    .line 159
    .line 160
    invoke-virtual {v5, v7}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 169
    .line 170
    .line 171
    add-int/lit8 v3, v3, 0x3

    .line 172
    .line 173
    move/from16 v7, v16

    .line 174
    .line 175
    invoke-direct {v0, v7, v3}, Lcom/esotericsoftware/asm/MethodWriter;->a(II)V

    .line 176
    .line 177
    .line 178
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 179
    .line 180
    invoke-virtual {v1, v4}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 181
    .line 182
    .line 183
    add-int/2addr v4, v3

    .line 184
    invoke-direct {v0, v3, v4}, Lcom/esotericsoftware/asm/MethodWriter;->a(II)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_8
    move/from16 v7, v16

    .line 189
    .line 190
    add-int/2addr v2, v13

    .line 191
    invoke-virtual {v5, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 196
    .line 197
    .line 198
    add-int/2addr v6, v7

    .line 199
    add-int/2addr v3, v7

    .line 200
    invoke-direct {v0, v6, v3}, Lcom/esotericsoftware/asm/MethodWriter;->a(II)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_9
    iget-object v0, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 205
    .line 206
    invoke-virtual {v0, v13}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_a
    iget-object v0, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 215
    .line 216
    add-int/2addr v2, v13

    .line 217
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_b
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 226
    .line 227
    invoke-virtual {v2, v10}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 232
    .line 233
    .line 234
    add-int/lit8 v1, v3, 0x3

    .line 235
    .line 236
    add-int/lit8 v3, v3, 0x4

    .line 237
    .line 238
    invoke-direct {v0, v1, v3}, Lcom/esotericsoftware/asm/MethodWriter;->a(II)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :cond_c
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 243
    .line 244
    add-int/2addr v1, v11

    .line 245
    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 246
    .line 247
    .line 248
    add-int/lit8 v1, v3, 0x3

    .line 249
    .line 250
    add-int/lit8 v3, v3, 0x4

    .line 251
    .line 252
    invoke-direct {v0, v1, v3}, Lcom/esotericsoftware/asm/MethodWriter;->a(II)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :cond_d
    iget-object v0, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 257
    .line 258
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private d()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 4
    .line 5
    iget-object v2, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    new-array v4, v3, [I

    .line 9
    .line 10
    new-array v5, v3, [I

    .line 11
    .line 12
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 13
    .line 14
    new-array v1, v1, [Z

    .line 15
    .line 16
    const/4 v6, 0x3

    .line 17
    move v7, v6

    .line 18
    :goto_0
    if-ne v7, v6, :cond_0

    .line 19
    .line 20
    const/4 v7, 0x2

    .line 21
    :cond_0
    move v9, v3

    .line 22
    :goto_1
    array-length v10, v2

    .line 23
    const/16 v11, 0xa8

    .line 24
    .line 25
    const/16 v12, 0xa7

    .line 26
    .line 27
    const/16 v13, 0xda

    .line 28
    .line 29
    const/16 v14, 0x84

    .line 30
    .line 31
    const/16 v15, 0xc9

    .line 32
    .line 33
    const/16 v8, 0x8

    .line 34
    .line 35
    move/from16 v17, v6

    .line 36
    .line 37
    const/16 v18, 0x4

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    if-ge v9, v10, :cond_d

    .line 41
    .line 42
    aget-byte v10, v2, v9

    .line 43
    .line 44
    and-int/lit16 v10, v10, 0xff

    .line 45
    .line 46
    sget-object v19, Lcom/esotericsoftware/asm/ClassWriter;->a:[B

    .line 47
    .line 48
    aget-byte v19, v19, v10

    .line 49
    .line 50
    packed-switch v19, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    :cond_1
    :pswitch_0
    add-int/lit8 v9, v9, 0x4

    .line 54
    .line 55
    :goto_2
    move v10, v3

    .line 56
    goto/16 :goto_c

    .line 57
    .line 58
    :pswitch_1
    add-int/lit8 v8, v9, 0x1

    .line 59
    .line 60
    aget-byte v8, v2, v8

    .line 61
    .line 62
    and-int/lit16 v8, v8, 0xff

    .line 63
    .line 64
    if-ne v8, v14, :cond_1

    .line 65
    .line 66
    add-int/lit8 v9, v9, 0x6

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :pswitch_2
    if-ne v7, v6, :cond_2

    .line 70
    .line 71
    invoke-static {v4, v5, v3, v9}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    and-int/lit8 v10, v10, 0x3

    .line 76
    .line 77
    neg-int v10, v10

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    aget-boolean v10, v1, v9

    .line 80
    .line 81
    if-nez v10, :cond_3

    .line 82
    .line 83
    and-int/lit8 v10, v9, 0x3

    .line 84
    .line 85
    aput-boolean v6, v1, v9

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    move v10, v3

    .line 89
    :goto_3
    add-int/lit8 v11, v9, 0x4

    .line 90
    .line 91
    and-int/lit8 v9, v9, 0x3

    .line 92
    .line 93
    sub-int/2addr v11, v9

    .line 94
    add-int/lit8 v9, v11, 0x4

    .line 95
    .line 96
    invoke-static {v2, v9}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    invoke-static {v9, v8, v8, v11}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    move v9, v8

    .line 105
    goto/16 :goto_c

    .line 106
    .line 107
    :pswitch_3
    if-ne v7, v6, :cond_4

    .line 108
    .line 109
    invoke-static {v4, v5, v3, v9}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    and-int/lit8 v8, v8, 0x3

    .line 114
    .line 115
    neg-int v8, v8

    .line 116
    :goto_4
    move v10, v8

    .line 117
    goto :goto_5

    .line 118
    :cond_4
    aget-boolean v8, v1, v9

    .line 119
    .line 120
    if-nez v8, :cond_5

    .line 121
    .line 122
    and-int/lit8 v8, v9, 0x3

    .line 123
    .line 124
    aput-boolean v6, v1, v9

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_5
    move v10, v3

    .line 128
    :goto_5
    add-int/lit8 v8, v9, 0x4

    .line 129
    .line 130
    and-int/lit8 v9, v9, 0x3

    .line 131
    .line 132
    sub-int/2addr v8, v9

    .line 133
    add-int/lit8 v9, v8, 0x8

    .line 134
    .line 135
    invoke-static {v2, v9}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    add-int/lit8 v11, v8, 0x4

    .line 140
    .line 141
    invoke-static {v2, v11}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    sub-int/2addr v9, v11

    .line 146
    add-int/2addr v9, v6

    .line 147
    mul-int/lit8 v9, v9, 0x4

    .line 148
    .line 149
    add-int/lit8 v9, v9, 0xc

    .line 150
    .line 151
    add-int/2addr v9, v8

    .line 152
    goto :goto_c

    .line 153
    :pswitch_4
    add-int/lit8 v9, v9, 0x5

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :pswitch_5
    if-le v10, v15, :cond_7

    .line 157
    .line 158
    if-ge v10, v13, :cond_6

    .line 159
    .line 160
    add-int/lit8 v10, v10, -0x31

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_6
    add-int/lit8 v10, v10, -0x14

    .line 164
    .line 165
    :goto_6
    add-int/lit8 v8, v9, 0x1

    .line 166
    .line 167
    invoke-static {v2, v8}, Lcom/esotericsoftware/asm/MethodWriter;->c([BI)I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    :goto_7
    add-int/2addr v8, v9

    .line 172
    goto :goto_8

    .line 173
    :cond_7
    add-int/lit8 v8, v9, 0x1

    .line 174
    .line 175
    invoke-static {v2, v8}, Lcom/esotericsoftware/asm/MethodWriter;->b([BI)S

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    goto :goto_7

    .line 180
    :goto_8
    invoke-static {v4, v5, v9, v8}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    const/16 v13, -0x8000

    .line 185
    .line 186
    if-lt v8, v13, :cond_8

    .line 187
    .line 188
    const/16 v13, 0x7fff

    .line 189
    .line 190
    if-le v8, v13, :cond_b

    .line 191
    .line 192
    :cond_8
    aget-boolean v8, v1, v9

    .line 193
    .line 194
    if-nez v8, :cond_b

    .line 195
    .line 196
    if-eq v10, v12, :cond_a

    .line 197
    .line 198
    if-ne v10, v11, :cond_9

    .line 199
    .line 200
    goto :goto_9

    .line 201
    :cond_9
    const/16 v16, 0x5

    .line 202
    .line 203
    goto :goto_a

    .line 204
    :cond_a
    :goto_9
    const/16 v16, 0x2

    .line 205
    .line 206
    :goto_a
    aput-boolean v6, v1, v9

    .line 207
    .line 208
    move/from16 v10, v16

    .line 209
    .line 210
    goto :goto_b

    .line 211
    :cond_b
    move v10, v3

    .line 212
    :goto_b
    add-int/lit8 v9, v9, 0x3

    .line 213
    .line 214
    goto :goto_c

    .line 215
    :pswitch_6
    add-int/lit8 v9, v9, 0x3

    .line 216
    .line 217
    goto/16 :goto_2

    .line 218
    .line 219
    :pswitch_7
    add-int/lit8 v9, v9, 0x2

    .line 220
    .line 221
    goto/16 :goto_2

    .line 222
    .line 223
    :pswitch_8
    add-int/lit8 v9, v9, 0x1

    .line 224
    .line 225
    goto/16 :goto_2

    .line 226
    .line 227
    :goto_c
    if-eqz v10, :cond_c

    .line 228
    .line 229
    array-length v8, v4

    .line 230
    add-int/2addr v8, v6

    .line 231
    new-array v8, v8, [I

    .line 232
    .line 233
    array-length v11, v5

    .line 234
    add-int/2addr v11, v6

    .line 235
    new-array v6, v11, [I

    .line 236
    .line 237
    array-length v11, v4

    .line 238
    invoke-static {v4, v3, v8, v3, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 239
    .line 240
    .line 241
    array-length v11, v5

    .line 242
    invoke-static {v5, v3, v6, v3, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 243
    .line 244
    .line 245
    array-length v4, v4

    .line 246
    aput v9, v8, v4

    .line 247
    .line 248
    array-length v4, v5

    .line 249
    aput v10, v6, v4

    .line 250
    .line 251
    move-object v5, v6

    .line 252
    move-object v4, v8

    .line 253
    if-lez v10, :cond_c

    .line 254
    .line 255
    move/from16 v7, v17

    .line 256
    .line 257
    :cond_c
    move/from16 v6, v17

    .line 258
    .line 259
    goto/16 :goto_1

    .line 260
    .line 261
    :cond_d
    move/from16 v9, v17

    .line 262
    .line 263
    if-ge v7, v9, :cond_e

    .line 264
    .line 265
    add-int/lit8 v7, v7, -0x1

    .line 266
    .line 267
    :cond_e
    if-nez v7, :cond_26

    .line 268
    .line 269
    new-instance v7, Lcom/esotericsoftware/asm/ByteVector;

    .line 270
    .line 271
    iget-object v9, v0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 272
    .line 273
    iget v9, v9, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 274
    .line 275
    invoke-direct {v7, v9}, Lcom/esotericsoftware/asm/ByteVector;-><init>(I)V

    .line 276
    .line 277
    .line 278
    move v9, v3

    .line 279
    :goto_d
    iget-object v10, v0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 280
    .line 281
    iget v10, v10, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 282
    .line 283
    if-ge v9, v10, :cond_18

    .line 284
    .line 285
    aget-byte v10, v2, v9

    .line 286
    .line 287
    and-int/lit16 v10, v10, 0xff

    .line 288
    .line 289
    sget-object v19, Lcom/esotericsoftware/asm/ClassWriter;->a:[B

    .line 290
    .line 291
    aget-byte v19, v19, v10

    .line 292
    .line 293
    move/from16 v20, v6

    .line 294
    .line 295
    const/4 v6, 0x0

    .line 296
    packed-switch v19, :pswitch_data_1

    .line 297
    .line 298
    .line 299
    :pswitch_9
    move/from16 v19, v8

    .line 300
    .line 301
    move/from16 v8, v18

    .line 302
    .line 303
    :goto_e
    invoke-virtual {v7, v2, v9, v8}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 304
    .line 305
    .line 306
    add-int/lit8 v9, v9, 0x4

    .line 307
    .line 308
    :goto_f
    move/from16 v11, v19

    .line 309
    .line 310
    const/4 v6, 0x5

    .line 311
    const/16 v18, 0x4

    .line 312
    .line 313
    goto/16 :goto_1b

    .line 314
    .line 315
    :pswitch_a
    move/from16 v19, v8

    .line 316
    .line 317
    add-int/lit8 v6, v9, 0x1

    .line 318
    .line 319
    aget-byte v6, v2, v6

    .line 320
    .line 321
    and-int/lit16 v6, v6, 0xff

    .line 322
    .line 323
    if-ne v6, v14, :cond_f

    .line 324
    .line 325
    const/4 v6, 0x6

    .line 326
    invoke-virtual {v7, v2, v9, v6}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 327
    .line 328
    .line 329
    add-int/lit8 v9, v9, 0x6

    .line 330
    .line 331
    goto :goto_f

    .line 332
    :cond_f
    const/4 v8, 0x4

    .line 333
    goto :goto_e

    .line 334
    :pswitch_b
    move/from16 v19, v8

    .line 335
    .line 336
    add-int/lit8 v8, v9, 0x4

    .line 337
    .line 338
    and-int/lit8 v10, v9, 0x3

    .line 339
    .line 340
    sub-int/2addr v8, v10

    .line 341
    const/16 v10, 0xab

    .line 342
    .line 343
    invoke-virtual {v7, v10}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 344
    .line 345
    .line 346
    iget v10, v7, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 347
    .line 348
    const/16 v18, 0x4

    .line 349
    .line 350
    rem-int/lit8 v10, v10, 0x4

    .line 351
    .line 352
    rsub-int/lit8 v10, v10, 0x4

    .line 353
    .line 354
    rem-int/lit8 v10, v10, 0x4

    .line 355
    .line 356
    invoke-virtual {v7, v6, v3, v10}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 357
    .line 358
    .line 359
    invoke-static {v2, v8}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    add-int/2addr v6, v9

    .line 364
    add-int/lit8 v10, v8, 0x4

    .line 365
    .line 366
    invoke-static {v4, v5, v9, v6}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    invoke-virtual {v7, v6}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 371
    .line 372
    .line 373
    invoke-static {v2, v10}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 374
    .line 375
    .line 376
    move-result v6

    .line 377
    add-int/lit8 v8, v8, 0x8

    .line 378
    .line 379
    invoke-virtual {v7, v6}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 380
    .line 381
    .line 382
    :goto_10
    if-lez v6, :cond_10

    .line 383
    .line 384
    invoke-static {v2, v8}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 385
    .line 386
    .line 387
    move-result v10

    .line 388
    invoke-virtual {v7, v10}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 389
    .line 390
    .line 391
    add-int/lit8 v10, v8, 0x4

    .line 392
    .line 393
    invoke-static {v2, v10}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 394
    .line 395
    .line 396
    move-result v10

    .line 397
    add-int/2addr v10, v9

    .line 398
    add-int/lit8 v8, v8, 0x8

    .line 399
    .line 400
    invoke-static {v4, v5, v9, v10}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 401
    .line 402
    .line 403
    move-result v10

    .line 404
    invoke-virtual {v7, v10}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 405
    .line 406
    .line 407
    add-int/lit8 v6, v6, -0x1

    .line 408
    .line 409
    goto :goto_10

    .line 410
    :cond_10
    move v9, v8

    .line 411
    goto :goto_f

    .line 412
    :pswitch_c
    move/from16 v19, v8

    .line 413
    .line 414
    add-int/lit8 v8, v9, 0x4

    .line 415
    .line 416
    and-int/lit8 v10, v9, 0x3

    .line 417
    .line 418
    sub-int/2addr v8, v10

    .line 419
    const/16 v10, 0xaa

    .line 420
    .line 421
    invoke-virtual {v7, v10}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 422
    .line 423
    .line 424
    iget v10, v7, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 425
    .line 426
    const/16 v18, 0x4

    .line 427
    .line 428
    rem-int/lit8 v10, v10, 0x4

    .line 429
    .line 430
    rsub-int/lit8 v10, v10, 0x4

    .line 431
    .line 432
    rem-int/lit8 v10, v10, 0x4

    .line 433
    .line 434
    invoke-virtual {v7, v6, v3, v10}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 435
    .line 436
    .line 437
    invoke-static {v2, v8}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 438
    .line 439
    .line 440
    move-result v6

    .line 441
    add-int/2addr v6, v9

    .line 442
    add-int/lit8 v10, v8, 0x4

    .line 443
    .line 444
    invoke-static {v4, v5, v9, v6}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 445
    .line 446
    .line 447
    move-result v6

    .line 448
    invoke-virtual {v7, v6}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 449
    .line 450
    .line 451
    invoke-static {v2, v10}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 452
    .line 453
    .line 454
    move-result v6

    .line 455
    add-int/lit8 v10, v8, 0x8

    .line 456
    .line 457
    invoke-virtual {v7, v6}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 458
    .line 459
    .line 460
    invoke-static {v2, v10}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    sub-int/2addr v10, v6

    .line 465
    add-int/lit8 v10, v10, 0x1

    .line 466
    .line 467
    add-int/lit8 v6, v8, 0xc

    .line 468
    .line 469
    add-int/lit8 v8, v8, 0x8

    .line 470
    .line 471
    invoke-static {v2, v8}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 472
    .line 473
    .line 474
    move-result v8

    .line 475
    invoke-virtual {v7, v8}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 476
    .line 477
    .line 478
    :goto_11
    if-lez v10, :cond_11

    .line 479
    .line 480
    invoke-static {v2, v6}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 481
    .line 482
    .line 483
    move-result v8

    .line 484
    add-int/2addr v8, v9

    .line 485
    add-int/lit8 v6, v6, 0x4

    .line 486
    .line 487
    invoke-static {v4, v5, v9, v8}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 488
    .line 489
    .line 490
    move-result v8

    .line 491
    invoke-virtual {v7, v8}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 492
    .line 493
    .line 494
    add-int/lit8 v10, v10, -0x1

    .line 495
    .line 496
    goto :goto_11

    .line 497
    :cond_11
    move v9, v6

    .line 498
    :goto_12
    move/from16 v11, v19

    .line 499
    .line 500
    :goto_13
    const/4 v6, 0x5

    .line 501
    goto/16 :goto_1b

    .line 502
    .line 503
    :pswitch_d
    move/from16 v19, v8

    .line 504
    .line 505
    add-int/lit8 v6, v9, 0x1

    .line 506
    .line 507
    invoke-static {v2, v6}, Lcom/esotericsoftware/asm/MethodWriter;->a([BI)I

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    add-int/2addr v6, v9

    .line 512
    invoke-static {v4, v5, v9, v6}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 513
    .line 514
    .line 515
    move-result v6

    .line 516
    invoke-virtual {v7, v10}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v7, v6}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 520
    .line 521
    .line 522
    add-int/lit8 v9, v9, 0x5

    .line 523
    .line 524
    goto :goto_12

    .line 525
    :pswitch_e
    move/from16 v19, v8

    .line 526
    .line 527
    if-le v10, v15, :cond_13

    .line 528
    .line 529
    if-ge v10, v13, :cond_12

    .line 530
    .line 531
    add-int/lit8 v10, v10, -0x31

    .line 532
    .line 533
    goto :goto_14

    .line 534
    :cond_12
    add-int/lit8 v10, v10, -0x14

    .line 535
    .line 536
    :goto_14
    add-int/lit8 v6, v9, 0x1

    .line 537
    .line 538
    invoke-static {v2, v6}, Lcom/esotericsoftware/asm/MethodWriter;->c([BI)I

    .line 539
    .line 540
    .line 541
    move-result v6

    .line 542
    :goto_15
    add-int/2addr v6, v9

    .line 543
    goto :goto_16

    .line 544
    :cond_13
    add-int/lit8 v6, v9, 0x1

    .line 545
    .line 546
    invoke-static {v2, v6}, Lcom/esotericsoftware/asm/MethodWriter;->b([BI)S

    .line 547
    .line 548
    .line 549
    move-result v6

    .line 550
    goto :goto_15

    .line 551
    :goto_16
    invoke-static {v4, v5, v9, v6}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 552
    .line 553
    .line 554
    move-result v6

    .line 555
    aget-boolean v8, v1, v9

    .line 556
    .line 557
    if-eqz v8, :cond_17

    .line 558
    .line 559
    const/16 v8, 0xc8

    .line 560
    .line 561
    if-ne v10, v12, :cond_14

    .line 562
    .line 563
    invoke-virtual {v7, v8}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 564
    .line 565
    .line 566
    goto :goto_17

    .line 567
    :cond_14
    if-ne v10, v11, :cond_15

    .line 568
    .line 569
    invoke-virtual {v7, v15}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 570
    .line 571
    .line 572
    :goto_17
    move/from16 v11, v19

    .line 573
    .line 574
    goto :goto_19

    .line 575
    :cond_15
    const/16 v11, 0xa6

    .line 576
    .line 577
    if-gt v10, v11, :cond_16

    .line 578
    .line 579
    add-int/lit8 v10, v10, 0x1

    .line 580
    .line 581
    xor-int/lit8 v10, v10, 0x1

    .line 582
    .line 583
    add-int/lit8 v10, v10, -0x1

    .line 584
    .line 585
    goto :goto_18

    .line 586
    :cond_16
    xor-int/lit8 v10, v10, 0x1

    .line 587
    .line 588
    :goto_18
    invoke-virtual {v7, v10}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 589
    .line 590
    .line 591
    move/from16 v11, v19

    .line 592
    .line 593
    invoke-virtual {v7, v11}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v7, v8}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 597
    .line 598
    .line 599
    add-int/lit8 v6, v6, -0x3

    .line 600
    .line 601
    :goto_19
    invoke-virtual {v7, v6}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 602
    .line 603
    .line 604
    goto :goto_1a

    .line 605
    :cond_17
    move/from16 v11, v19

    .line 606
    .line 607
    invoke-virtual {v7, v10}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v7, v6}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 611
    .line 612
    .line 613
    :goto_1a
    add-int/lit8 v9, v9, 0x3

    .line 614
    .line 615
    goto :goto_13

    .line 616
    :pswitch_f
    move v11, v8

    .line 617
    const/4 v6, 0x5

    .line 618
    invoke-virtual {v7, v2, v9, v6}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 619
    .line 620
    .line 621
    add-int/lit8 v9, v9, 0x5

    .line 622
    .line 623
    goto :goto_1b

    .line 624
    :pswitch_10
    move v11, v8

    .line 625
    const/4 v6, 0x5

    .line 626
    const/4 v8, 0x3

    .line 627
    invoke-virtual {v7, v2, v9, v8}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 628
    .line 629
    .line 630
    add-int/lit8 v9, v9, 0x3

    .line 631
    .line 632
    goto :goto_1b

    .line 633
    :pswitch_11
    move v11, v8

    .line 634
    const/4 v6, 0x5

    .line 635
    const/4 v8, 0x2

    .line 636
    invoke-virtual {v7, v2, v9, v8}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 637
    .line 638
    .line 639
    add-int/lit8 v9, v9, 0x2

    .line 640
    .line 641
    goto :goto_1b

    .line 642
    :pswitch_12
    move v11, v8

    .line 643
    const/4 v6, 0x5

    .line 644
    invoke-virtual {v7, v10}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 645
    .line 646
    .line 647
    add-int/lit8 v9, v9, 0x1

    .line 648
    .line 649
    :goto_1b
    move v8, v11

    .line 650
    move/from16 v6, v20

    .line 651
    .line 652
    const/16 v11, 0xa8

    .line 653
    .line 654
    goto/16 :goto_d

    .line 655
    .line 656
    :cond_18
    move/from16 v20, v6

    .line 657
    .line 658
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 659
    .line 660
    if-nez v2, :cond_1c

    .line 661
    .line 662
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->N:Lcom/esotericsoftware/asm/Label;

    .line 663
    .line 664
    :goto_1c
    if-eqz v2, :cond_1a

    .line 665
    .line 666
    iget v6, v2, Lcom/esotericsoftware/asm/Label;->c:I

    .line 667
    .line 668
    const/16 v17, 0x3

    .line 669
    .line 670
    add-int/lit8 v6, v6, -0x3

    .line 671
    .line 672
    if-ltz v6, :cond_19

    .line 673
    .line 674
    aget-boolean v6, v1, v6

    .line 675
    .line 676
    if-eqz v6, :cond_19

    .line 677
    .line 678
    iget v6, v2, Lcom/esotericsoftware/asm/Label;->a:I

    .line 679
    .line 680
    or-int/lit8 v6, v6, 0x10

    .line 681
    .line 682
    iput v6, v2, Lcom/esotericsoftware/asm/Label;->a:I

    .line 683
    .line 684
    :cond_19
    invoke-static {v4, v5, v2}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[ILcom/esotericsoftware/asm/Label;)V

    .line 685
    .line 686
    .line 687
    iget-object v2, v2, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 688
    .line 689
    goto :goto_1c

    .line 690
    :cond_1a
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 691
    .line 692
    iget-object v1, v1, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    .line 693
    .line 694
    if-eqz v1, :cond_1d

    .line 695
    .line 696
    move v1, v3

    .line 697
    :goto_1d
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 698
    .line 699
    iget-object v2, v2, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    .line 700
    .line 701
    array-length v6, v2

    .line 702
    if-ge v1, v6, :cond_1d

    .line 703
    .line 704
    aget-object v2, v2, v1

    .line 705
    .line 706
    if-eqz v2, :cond_1b

    .line 707
    .line 708
    iget v6, v2, Lcom/esotericsoftware/asm/Item;->b:I

    .line 709
    .line 710
    const/16 v8, 0x1f

    .line 711
    .line 712
    if-ne v6, v8, :cond_1b

    .line 713
    .line 714
    iget v6, v2, Lcom/esotericsoftware/asm/Item;->c:I

    .line 715
    .line 716
    invoke-static {v4, v5, v3, v6}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 717
    .line 718
    .line 719
    move-result v6

    .line 720
    iput v6, v2, Lcom/esotericsoftware/asm/Item;->c:I

    .line 721
    .line 722
    :cond_1b
    add-int/lit8 v1, v1, 0x1

    .line 723
    .line 724
    goto :goto_1d

    .line 725
    :cond_1c
    iget v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->u:I

    .line 726
    .line 727
    if-lez v1, :cond_1d

    .line 728
    .line 729
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 730
    .line 731
    move/from16 v2, v20

    .line 732
    .line 733
    iput-boolean v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->L:Z

    .line 734
    .line 735
    :cond_1d
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->B:Lcom/esotericsoftware/asm/Handler;

    .line 736
    .line 737
    :goto_1e
    if-eqz v1, :cond_1e

    .line 738
    .line 739
    iget-object v2, v1, Lcom/esotericsoftware/asm/Handler;->a:Lcom/esotericsoftware/asm/Label;

    .line 740
    .line 741
    invoke-static {v4, v5, v2}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[ILcom/esotericsoftware/asm/Label;)V

    .line 742
    .line 743
    .line 744
    iget-object v2, v1, Lcom/esotericsoftware/asm/Handler;->b:Lcom/esotericsoftware/asm/Label;

    .line 745
    .line 746
    invoke-static {v4, v5, v2}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[ILcom/esotericsoftware/asm/Label;)V

    .line 747
    .line 748
    .line 749
    iget-object v2, v1, Lcom/esotericsoftware/asm/Handler;->c:Lcom/esotericsoftware/asm/Label;

    .line 750
    .line 751
    invoke-static {v4, v5, v2}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[ILcom/esotericsoftware/asm/Label;)V

    .line 752
    .line 753
    .line 754
    iget-object v1, v1, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 755
    .line 756
    goto :goto_1e

    .line 757
    :cond_1e
    move v1, v3

    .line 758
    const/4 v8, 0x2

    .line 759
    :goto_1f
    if-ge v1, v8, :cond_21

    .line 760
    .line 761
    if-nez v1, :cond_1f

    .line 762
    .line 763
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    .line 764
    .line 765
    goto :goto_20

    .line 766
    :cond_1f
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    .line 767
    .line 768
    :goto_20
    if-eqz v2, :cond_20

    .line 769
    .line 770
    iget-object v6, v2, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 771
    .line 772
    move v9, v3

    .line 773
    :goto_21
    iget v10, v2, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 774
    .line 775
    if-ge v9, v10, :cond_20

    .line 776
    .line 777
    invoke-static {v6, v9}, Lcom/esotericsoftware/asm/MethodWriter;->c([BI)I

    .line 778
    .line 779
    .line 780
    move-result v10

    .line 781
    invoke-static {v4, v5, v3, v10}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 782
    .line 783
    .line 784
    move-result v11

    .line 785
    invoke-static {v6, v9, v11}, Lcom/esotericsoftware/asm/MethodWriter;->a([BII)V

    .line 786
    .line 787
    .line 788
    add-int/lit8 v12, v9, 0x2

    .line 789
    .line 790
    invoke-static {v6, v12}, Lcom/esotericsoftware/asm/MethodWriter;->c([BI)I

    .line 791
    .line 792
    .line 793
    move-result v13

    .line 794
    add-int/2addr v10, v13

    .line 795
    invoke-static {v4, v5, v3, v10}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 796
    .line 797
    .line 798
    move-result v10

    .line 799
    sub-int/2addr v10, v11

    .line 800
    invoke-static {v6, v12, v10}, Lcom/esotericsoftware/asm/MethodWriter;->a([BII)V

    .line 801
    .line 802
    .line 803
    add-int/lit8 v9, v9, 0xa

    .line 804
    .line 805
    goto :goto_21

    .line 806
    :cond_20
    add-int/lit8 v1, v1, 0x1

    .line 807
    .line 808
    goto :goto_1f

    .line 809
    :cond_21
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 810
    .line 811
    if-eqz v1, :cond_22

    .line 812
    .line 813
    iget-object v1, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 814
    .line 815
    move v2, v3

    .line 816
    :goto_22
    iget-object v6, v0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 817
    .line 818
    iget v6, v6, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 819
    .line 820
    if-ge v2, v6, :cond_22

    .line 821
    .line 822
    invoke-static {v1, v2}, Lcom/esotericsoftware/asm/MethodWriter;->c([BI)I

    .line 823
    .line 824
    .line 825
    move-result v6

    .line 826
    invoke-static {v4, v5, v3, v6}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[III)I

    .line 827
    .line 828
    .line 829
    move-result v6

    .line 830
    invoke-static {v1, v2, v6}, Lcom/esotericsoftware/asm/MethodWriter;->a([BII)V

    .line 831
    .line 832
    .line 833
    add-int/lit8 v2, v2, 0x4

    .line 834
    .line 835
    goto :goto_22

    .line 836
    :cond_22
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->J:Lcom/esotericsoftware/asm/Attribute;

    .line 837
    .line 838
    :goto_23
    if-eqz v1, :cond_25

    .line 839
    .line 840
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/Attribute;->getLabels()[Lcom/esotericsoftware/asm/Label;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    if-eqz v2, :cond_23

    .line 845
    .line 846
    array-length v3, v2

    .line 847
    const/16 v20, 0x1

    .line 848
    .line 849
    add-int/lit8 v3, v3, -0x1

    .line 850
    .line 851
    :goto_24
    if-ltz v3, :cond_24

    .line 852
    .line 853
    aget-object v6, v2, v3

    .line 854
    .line 855
    invoke-static {v4, v5, v6}, Lcom/esotericsoftware/asm/MethodWriter;->a([I[ILcom/esotericsoftware/asm/Label;)V

    .line 856
    .line 857
    .line 858
    add-int/lit8 v3, v3, -0x1

    .line 859
    .line 860
    goto :goto_24

    .line 861
    :cond_23
    const/16 v20, 0x1

    .line 862
    .line 863
    :cond_24
    iget-object v1, v1, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 864
    .line 865
    goto :goto_23

    .line 866
    :cond_25
    iput-object v7, v0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 867
    .line 868
    return-void

    .line 869
    :cond_26
    const/16 v17, 0x3

    .line 870
    .line 871
    move/from16 v6, v17

    .line 872
    .line 873
    goto/16 :goto_0

    .line 874
    .line 875
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_11
        :pswitch_10
        :pswitch_10
        :pswitch_c
        :pswitch_b
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method private e()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/esotericsoftware/asm/Label;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/esotericsoftware/asm/Frame;

    .line 11
    .line 12
    invoke-direct {v1}, Lcom/esotericsoftware/asm/Frame;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 16
    .line 17
    iput-object v0, v1, Lcom/esotericsoftware/asm/Frame;->b:Lcom/esotericsoftware/asm/Label;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 20
    .line 21
    iget v2, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 22
    .line 23
    iget-object v1, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 24
    .line 25
    invoke-virtual {v0, p0, v2, v1}, Lcom/esotericsoftware/asm/Label;->a(Lcom/esotericsoftware/asm/MethodWriter;I[B)Z

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->O:Lcom/esotericsoftware/asm/Label;

    .line 29
    .line 30
    iput-object v0, v1, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->O:Lcom/esotericsoftware/asm/Label;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 36
    .line 37
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 38
    .line 39
    iput v1, v0, Lcom/esotericsoftware/asm/Label;->g:I

    .line 40
    .line 41
    :goto_0
    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 43
    .line 44
    return-void
.end method

.method private f()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    add-int/2addr v0, v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p0, v2, v0, v2}, Lcom/esotericsoftware/asm/MethodWriter;->a(III)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    .line 15
    .line 16
    and-int/lit8 v3, v2, 0x8

    .line 17
    .line 18
    const/high16 v4, 0x1700000

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    const/high16 v3, 0x80000

    .line 23
    .line 24
    and-int/2addr v2, v3

    .line 25
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    add-int/lit8 v2, v0, 0x1

    .line 30
    .line 31
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 32
    .line 33
    iget-object v6, v5, Lcom/esotericsoftware/asm/ClassWriter;->I:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v5, v6}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    or-int/2addr v5, v4

    .line 40
    aput v5, v3, v0

    .line 41
    .line 42
    :goto_0
    move v0, v2

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 45
    .line 46
    const/4 v5, 0x6

    .line 47
    aput v5, v3, v0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    move v2, v1

    .line 51
    :goto_2
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 52
    .line 53
    add-int/lit8 v5, v2, 0x1

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/16 v6, 0x46

    .line 60
    .line 61
    if-eq v3, v6, :cond_9

    .line 62
    .line 63
    const/16 v6, 0x3b

    .line 64
    .line 65
    const/16 v7, 0x4c

    .line 66
    .line 67
    if-eq v3, v7, :cond_7

    .line 68
    .line 69
    const/16 v8, 0x53

    .line 70
    .line 71
    if-eq v3, v8, :cond_6

    .line 72
    .line 73
    const/16 v8, 0x49

    .line 74
    .line 75
    if-eq v3, v8, :cond_6

    .line 76
    .line 77
    const/16 v8, 0x4a

    .line 78
    .line 79
    if-eq v3, v8, :cond_5

    .line 80
    .line 81
    const/16 v8, 0x5a

    .line 82
    .line 83
    if-eq v3, v8, :cond_6

    .line 84
    .line 85
    const/16 v8, 0x5b

    .line 86
    .line 87
    if-eq v3, v8, :cond_2

    .line 88
    .line 89
    const/4 v2, 0x3

    .line 90
    packed-switch v3, :pswitch_data_0

    .line 91
    .line 92
    .line 93
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 94
    .line 95
    sub-int/2addr v0, v2

    .line 96
    aput v0, v3, v1

    .line 97
    .line 98
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->b()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_0
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 103
    .line 104
    add-int/lit8 v6, v0, 0x1

    .line 105
    .line 106
    aput v2, v3, v0

    .line 107
    .line 108
    :goto_3
    move v2, v5

    .line 109
    move v0, v6

    .line 110
    goto :goto_2

    .line 111
    :cond_2
    :goto_4
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-ne v3, v8, :cond_3

    .line 118
    .line 119
    add-int/lit8 v5, v5, 0x1

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_3
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-ne v3, v7, :cond_4

    .line 129
    .line 130
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 131
    .line 132
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eq v3, v6, :cond_4

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_4
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 142
    .line 143
    add-int/lit8 v6, v0, 0x1

    .line 144
    .line 145
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 146
    .line 147
    iget-object v8, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 148
    .line 149
    add-int/2addr v5, v1

    .line 150
    invoke-virtual {v8, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v7, v2}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    or-int/2addr v2, v4

    .line 159
    aput v2, v3, v0

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 163
    .line 164
    add-int/lit8 v3, v0, 0x1

    .line 165
    .line 166
    const/4 v6, 0x4

    .line 167
    aput v6, v2, v0

    .line 168
    .line 169
    :goto_6
    move v0, v3

    .line 170
    move v2, v5

    .line 171
    goto :goto_2

    .line 172
    :cond_6
    :pswitch_1
    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 173
    .line 174
    add-int/lit8 v3, v0, 0x1

    .line 175
    .line 176
    aput v1, v2, v0

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_7
    move v2, v5

    .line 180
    :goto_7
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eq v3, v6, :cond_8

    .line 187
    .line 188
    add-int/lit8 v2, v2, 0x1

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_8
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 192
    .line 193
    add-int/lit8 v6, v0, 0x1

    .line 194
    .line 195
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 196
    .line 197
    iget-object v8, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 198
    .line 199
    add-int/lit8 v9, v2, 0x1

    .line 200
    .line 201
    invoke-virtual {v8, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v7, v2}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    or-int/2addr v2, v4

    .line 210
    aput v2, v3, v0

    .line 211
    .line 212
    move v0, v6

    .line 213
    move v2, v9

    .line 214
    goto/16 :goto_2

    .line 215
    .line 216
    :cond_9
    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 217
    .line 218
    add-int/lit8 v3, v0, 0x1

    .line 219
    .line 220
    const/4 v6, 0x2

    .line 221
    aput v6, v2, v0

    .line 222
    .line 223
    goto :goto_6

    .line 224
    nop

    .line 225
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 13

    .line 995
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->h:I

    if-eqz v0, :cond_0

    iget p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->i:I

    add-int/lit8 p0, p0, 0x6

    return p0

    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    const-string v1, "RuntimeInvisibleTypeAnnotations"

    const-string v2, "RuntimeVisibleTypeAnnotations"

    const/4 v3, 0x0

    const/4 v4, 0x1

    const v5, 0xffff

    const/16 v6, 0x8

    if-lez v0, :cond_a

    if-gt v0, v5, :cond_9

    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v7, "Code"

    invoke-virtual {v0, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    add-int/lit8 v0, v0, 0x12

    iget v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->A:I

    invoke-static {v7, v6, v0, v6}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(IIII)I

    move-result v0

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    if-eqz v7, :cond_1

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v8, "LocalVariableTable"

    invoke-virtual {v7, v8}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    iget v7, v7, Lcom/esotericsoftware/asm/ByteVector;->b:I

    add-int/2addr v7, v6

    add-int/2addr v0, v7

    :cond_1
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    if-eqz v7, :cond_2

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v8, "LocalVariableTypeTable"

    invoke-virtual {v7, v8}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    iget v7, v7, Lcom/esotericsoftware/asm/ByteVector;->b:I

    add-int/2addr v7, v6

    add-int/2addr v0, v7

    :cond_2
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    if-eqz v7, :cond_3

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v8, "LineNumberTable"

    invoke-virtual {v7, v8}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    iget v7, v7, Lcom/esotericsoftware/asm/ByteVector;->b:I

    add-int/2addr v7, v6

    add-int/2addr v0, v7

    :cond_3
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    iget v8, v7, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    and-int/2addr v8, v5

    const/16 v9, 0x32

    if-lt v8, v9, :cond_4

    move v8, v4

    goto :goto_0

    :cond_4
    move v8, v3

    :goto_0
    if-eqz v8, :cond_5

    const-string v8, "StackMapTable"

    goto :goto_1

    :cond_5
    const-string v8, "StackMap"

    :goto_1
    invoke-virtual {v7, v8}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    iget v7, v7, Lcom/esotericsoftware/asm/ByteVector;->b:I

    add-int/2addr v7, v6

    add-int/2addr v0, v7

    :cond_6
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    invoke-virtual {v7, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    invoke-virtual {v7}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v7

    add-int/2addr v7, v6

    add-int/2addr v0, v7

    :cond_7
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v7, :cond_8

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    invoke-virtual {v7, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    invoke-virtual {v7}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v7

    add-int/2addr v7, v6

    add-int/2addr v0, v7

    :cond_8
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->J:Lcom/esotericsoftware/asm/Attribute;

    if-eqz v7, :cond_b

    iget-object v8, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    iget-object v9, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    move-object v10, v9

    iget-object v9, v10, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    iget v10, v10, Lcom/esotericsoftware/asm/ByteVector;->b:I

    iget v11, p0, Lcom/esotericsoftware/asm/MethodWriter;->s:I

    iget v12, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    invoke-virtual/range {v7 .. v12}, Lcom/esotericsoftware/asm/Attribute;->a(Lcom/esotericsoftware/asm/ClassWriter;[BIII)I

    move-result v7

    add-int/2addr v0, v7

    goto :goto_2

    :cond_9
    const-string p0, "Method code too large!"

    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    :cond_a
    move v0, v6

    :cond_b
    :goto_2
    iget v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->j:I

    const/4 v8, 0x2

    if-lez v7, :cond_c

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v9, "Exceptions"

    invoke-virtual {v7, v9}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->j:I

    invoke-static {v7, v8, v6, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(IIII)I

    move-result v0

    :cond_c
    iget v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    and-int/lit16 v9, v7, 0x1000

    if-eqz v9, :cond_e

    iget-object v9, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    iget v10, v9, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    and-int/2addr v5, v10

    const/16 v10, 0x31

    if-lt v5, v10, :cond_d

    const/high16 v5, 0x40000

    and-int/2addr v5, v7

    if-eqz v5, :cond_e

    :cond_d
    const-string v5, "Synthetic"

    invoke-virtual {v9, v5}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x6

    :cond_e
    iget v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    const/high16 v7, 0x20000

    and-int/2addr v5, v7

    if-eqz v5, :cond_f

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v7, "Deprecated"

    invoke-virtual {v5, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x6

    :cond_f
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->g:Ljava/lang/String;

    if-eqz v5, :cond_10

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v7, "Signature"

    invoke-virtual {v5, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->g:Ljava/lang/String;

    invoke-virtual {v5, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x8

    :cond_10
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->$:Lcom/esotericsoftware/asm/ByteVector;

    if-eqz v5, :cond_11

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v7, "MethodParameters"

    invoke-virtual {v5, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->$:Lcom/esotericsoftware/asm/ByteVector;

    iget v5, v5, Lcom/esotericsoftware/asm/ByteVector;->b:I

    add-int/lit8 v5, v5, 0x7

    add-int/2addr v0, v5

    :cond_11
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->l:Lcom/esotericsoftware/asm/ByteVector;

    if-eqz v5, :cond_12

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v7, "AnnotationDefault"

    invoke-virtual {v5, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->l:Lcom/esotericsoftware/asm/ByteVector;

    iget v5, v5, Lcom/esotericsoftware/asm/ByteVector;->b:I

    add-int/lit8 v5, v5, 0x6

    add-int/2addr v0, v5

    :cond_12
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->m:Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v5, :cond_13

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v7, "RuntimeVisibleAnnotations"

    invoke-virtual {v5, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->m:Lcom/esotericsoftware/asm/AnnotationWriter;

    invoke-virtual {v5}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v5

    add-int/2addr v5, v6

    add-int/2addr v0, v5

    :cond_13
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->n:Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v5, :cond_14

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v7, "RuntimeInvisibleAnnotations"

    invoke-virtual {v5, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->n:Lcom/esotericsoftware/asm/AnnotationWriter;

    invoke-virtual {v5}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v5

    add-int/2addr v5, v6

    add-int/2addr v0, v5

    :cond_14
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->U:Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v5, :cond_15

    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    invoke-virtual {v5, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->U:Lcom/esotericsoftware/asm/AnnotationWriter;

    invoke-virtual {v2}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v2

    add-int/2addr v2, v6

    add-int/2addr v0, v2

    :cond_15
    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->V:Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v2, :cond_16

    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->V:Lcom/esotericsoftware/asm/AnnotationWriter;

    invoke-virtual {v1}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v1

    add-int/2addr v1, v6

    add-int/2addr v0, v1

    :cond_16
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->o:[Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v1, :cond_19

    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v2, "RuntimeVisibleParameterAnnotations"

    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->o:[Lcom/esotericsoftware/asm/AnnotationWriter;

    array-length v2, v1

    iget v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->S:I

    sub-int/2addr v2, v5

    mul-int/2addr v2, v8

    add-int/lit8 v2, v2, 0x7

    add-int/2addr v2, v0

    array-length v0, v1

    sub-int/2addr v0, v4

    :goto_3
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->S:I

    if-lt v0, v1, :cond_18

    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->o:[Lcom/esotericsoftware/asm/AnnotationWriter;

    aget-object v1, v1, v0

    if-nez v1, :cond_17

    move v1, v3

    goto :goto_4

    :cond_17
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v1

    :goto_4
    add-int/2addr v2, v1

    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    :cond_18
    move v0, v2

    :cond_19
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->p:[Lcom/esotericsoftware/asm/AnnotationWriter;

    if-eqz v1, :cond_1c

    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const-string v2, "RuntimeInvisibleParameterAnnotations"

    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->p:[Lcom/esotericsoftware/asm/AnnotationWriter;

    array-length v2, v1

    iget v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->S:I

    sub-int/2addr v2, v5

    mul-int/2addr v2, v8

    add-int/lit8 v2, v2, 0x7

    add-int/2addr v2, v0

    array-length v0, v1

    sub-int/2addr v0, v4

    :goto_5
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->S:I

    if-lt v0, v1, :cond_1b

    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->p:[Lcom/esotericsoftware/asm/AnnotationWriter;

    aget-object v1, v1, v0

    if-nez v1, :cond_1a

    move v1, v3

    goto :goto_6

    :cond_1a
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    move-result v1

    :goto_6
    add-int/2addr v2, v1

    add-int/lit8 v0, v0, -0x1

    goto :goto_5

    :cond_1b
    move v0, v2

    :cond_1c
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->q:Lcom/esotericsoftware/asm/Attribute;

    if-eqz v1, :cond_1d

    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/esotericsoftware/asm/Attribute;->a(Lcom/esotericsoftware/asm/ClassWriter;[BIII)I

    move-result p0

    add-int/2addr v0, p0

    :cond_1d
    return v0
.end method

.method public final a(Lcom/esotericsoftware/asm/ByteVector;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    iget v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    .line 6
    .line 7
    const/high16 v8, 0x40000

    .line 8
    .line 9
    and-int v2, v1, v8

    .line 10
    .line 11
    div-int/lit8 v2, v2, 0x40

    .line 12
    .line 13
    const/high16 v3, 0xe0000

    .line 14
    .line 15
    or-int/2addr v2, v3

    .line 16
    not-int v2, v2

    .line 17
    and-int/2addr v1, v2

    .line 18
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->d:I

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->e:I

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 31
    .line 32
    .line 33
    iget v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->h:I

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 38
    .line 39
    iget-object v2, v2, Lcom/esotericsoftware/asm/ClassWriter;->M:Lcom/esotericsoftware/asm/ClassReader;

    .line 40
    .line 41
    iget-object v2, v2, Lcom/esotericsoftware/asm/ClassReader;->b:[B

    .line 42
    .line 43
    iget v0, v0, Lcom/esotericsoftware/asm/MethodWriter;->i:I

    .line 44
    .line 45
    invoke-virtual {v6, v2, v1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 50
    .line 51
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x1

    .line 55
    if-lez v1, :cond_1

    .line 56
    .line 57
    move v1, v10

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move v1, v9

    .line 60
    :goto_0
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->j:I

    .line 61
    .line 62
    if-lez v2, :cond_2

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    :cond_2
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    .line 67
    .line 68
    and-int/lit16 v3, v2, 0x1000

    .line 69
    .line 70
    const/16 v11, 0x31

    .line 71
    .line 72
    const v12, 0xffff

    .line 73
    .line 74
    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    iget-object v3, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 78
    .line 79
    iget v3, v3, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    .line 80
    .line 81
    and-int/2addr v3, v12

    .line 82
    if-lt v3, v11, :cond_3

    .line 83
    .line 84
    and-int v3, v2, v8

    .line 85
    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    :cond_4
    const/high16 v13, 0x20000

    .line 91
    .line 92
    and-int/2addr v2, v13

    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    :cond_5
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->g:Ljava/lang/String;

    .line 98
    .line 99
    if-eqz v2, :cond_6

    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    :cond_6
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->$:Lcom/esotericsoftware/asm/ByteVector;

    .line 104
    .line 105
    if-eqz v2, :cond_7

    .line 106
    .line 107
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    :cond_7
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->l:Lcom/esotericsoftware/asm/ByteVector;

    .line 110
    .line 111
    if-eqz v2, :cond_8

    .line 112
    .line 113
    add-int/lit8 v1, v1, 0x1

    .line 114
    .line 115
    :cond_8
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->m:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 116
    .line 117
    if-eqz v2, :cond_9

    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    :cond_9
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->n:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 122
    .line 123
    if-eqz v2, :cond_a

    .line 124
    .line 125
    add-int/lit8 v1, v1, 0x1

    .line 126
    .line 127
    :cond_a
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->U:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 128
    .line 129
    if-eqz v2, :cond_b

    .line 130
    .line 131
    add-int/lit8 v1, v1, 0x1

    .line 132
    .line 133
    :cond_b
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->V:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 134
    .line 135
    if-eqz v2, :cond_c

    .line 136
    .line 137
    add-int/lit8 v1, v1, 0x1

    .line 138
    .line 139
    :cond_c
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->o:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 140
    .line 141
    if-eqz v2, :cond_d

    .line 142
    .line 143
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    :cond_d
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->p:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 146
    .line 147
    if-eqz v2, :cond_e

    .line 148
    .line 149
    add-int/lit8 v1, v1, 0x1

    .line 150
    .line 151
    :cond_e
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->q:Lcom/esotericsoftware/asm/Attribute;

    .line 152
    .line 153
    if-eqz v2, :cond_f

    .line 154
    .line 155
    invoke-virtual {v2}, Lcom/esotericsoftware/asm/Attribute;->a()I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    add-int/2addr v1, v2

    .line 160
    :cond_f
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 161
    .line 162
    .line 163
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 164
    .line 165
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 166
    .line 167
    const-string v14, "RuntimeInvisibleTypeAnnotations"

    .line 168
    .line 169
    const-string v15, "RuntimeVisibleTypeAnnotations"

    .line 170
    .line 171
    if-lez v1, :cond_28

    .line 172
    .line 173
    add-int/lit8 v1, v1, 0xc

    .line 174
    .line 175
    iget v3, v0, Lcom/esotericsoftware/asm/MethodWriter;->A:I

    .line 176
    .line 177
    mul-int/lit8 v3, v3, 0x8

    .line 178
    .line 179
    add-int/2addr v3, v1

    .line 180
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    .line 181
    .line 182
    if-eqz v1, :cond_10

    .line 183
    .line 184
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 185
    .line 186
    add-int/lit8 v1, v1, 0x8

    .line 187
    .line 188
    add-int/2addr v3, v1

    .line 189
    :cond_10
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    .line 190
    .line 191
    if-eqz v1, :cond_11

    .line 192
    .line 193
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 194
    .line 195
    add-int/lit8 v1, v1, 0x8

    .line 196
    .line 197
    add-int/2addr v3, v1

    .line 198
    :cond_11
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 199
    .line 200
    if-eqz v1, :cond_12

    .line 201
    .line 202
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 203
    .line 204
    add-int/lit8 v1, v1, 0x8

    .line 205
    .line 206
    add-int/2addr v3, v1

    .line 207
    :cond_12
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 208
    .line 209
    if-eqz v1, :cond_13

    .line 210
    .line 211
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 212
    .line 213
    add-int/lit8 v1, v1, 0x8

    .line 214
    .line 215
    add-int/2addr v3, v1

    .line 216
    :cond_13
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 217
    .line 218
    if-eqz v1, :cond_14

    .line 219
    .line 220
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    add-int/lit8 v1, v1, 0x8

    .line 225
    .line 226
    add-int/2addr v3, v1

    .line 227
    :cond_14
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 228
    .line 229
    if-eqz v1, :cond_15

    .line 230
    .line 231
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    add-int/lit8 v1, v1, 0x8

    .line 236
    .line 237
    add-int/2addr v3, v1

    .line 238
    :cond_15
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->J:Lcom/esotericsoftware/asm/Attribute;

    .line 239
    .line 240
    if-eqz v1, :cond_16

    .line 241
    .line 242
    iget-object v4, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 243
    .line 244
    iget-object v5, v0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 245
    .line 246
    iget-object v7, v5, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 247
    .line 248
    iget v5, v5, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 249
    .line 250
    const/16 v22, 0x2

    .line 251
    .line 252
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->s:I

    .line 253
    .line 254
    move/from16 v23, v8

    .line 255
    .line 256
    iget v8, v0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 257
    .line 258
    move-object/from16 v16, v1

    .line 259
    .line 260
    move/from16 v20, v2

    .line 261
    .line 262
    move-object/from16 v17, v4

    .line 263
    .line 264
    move/from16 v19, v5

    .line 265
    .line 266
    move-object/from16 v18, v7

    .line 267
    .line 268
    move/from16 v21, v8

    .line 269
    .line 270
    invoke-virtual/range {v16 .. v21}, Lcom/esotericsoftware/asm/Attribute;->a(Lcom/esotericsoftware/asm/ClassWriter;[BIII)I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    add-int/2addr v3, v1

    .line 275
    goto :goto_1

    .line 276
    :cond_16
    move/from16 v23, v8

    .line 277
    .line 278
    const/16 v22, 0x2

    .line 279
    .line 280
    :goto_1
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 281
    .line 282
    const-string v2, "Code"

    .line 283
    .line 284
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 293
    .line 294
    .line 295
    iget v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->s:I

    .line 296
    .line 297
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 302
    .line 303
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 304
    .line 305
    .line 306
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 307
    .line 308
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 309
    .line 310
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 315
    .line 316
    iget-object v3, v2, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 317
    .line 318
    iget v2, v2, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 319
    .line 320
    invoke-virtual {v1, v3, v9, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 321
    .line 322
    .line 323
    iget v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->A:I

    .line 324
    .line 325
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 326
    .line 327
    .line 328
    iget v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->A:I

    .line 329
    .line 330
    if-lez v1, :cond_17

    .line 331
    .line 332
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->B:Lcom/esotericsoftware/asm/Handler;

    .line 333
    .line 334
    :goto_2
    if-eqz v1, :cond_17

    .line 335
    .line 336
    iget-object v2, v1, Lcom/esotericsoftware/asm/Handler;->a:Lcom/esotericsoftware/asm/Label;

    .line 337
    .line 338
    iget v2, v2, Lcom/esotericsoftware/asm/Label;->c:I

    .line 339
    .line 340
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    iget-object v3, v1, Lcom/esotericsoftware/asm/Handler;->b:Lcom/esotericsoftware/asm/Label;

    .line 345
    .line 346
    iget v3, v3, Lcom/esotericsoftware/asm/Label;->c:I

    .line 347
    .line 348
    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    iget-object v3, v1, Lcom/esotericsoftware/asm/Handler;->c:Lcom/esotericsoftware/asm/Label;

    .line 353
    .line 354
    iget v3, v3, Lcom/esotericsoftware/asm/Label;->c:I

    .line 355
    .line 356
    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    iget v3, v1, Lcom/esotericsoftware/asm/Handler;->e:I

    .line 361
    .line 362
    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 363
    .line 364
    .line 365
    iget-object v1, v1, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 366
    .line 367
    goto :goto_2

    .line 368
    :cond_17
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    .line 369
    .line 370
    if-eqz v1, :cond_18

    .line 371
    .line 372
    move v1, v10

    .line 373
    goto :goto_3

    .line 374
    :cond_18
    move v1, v9

    .line 375
    :goto_3
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    .line 376
    .line 377
    if-eqz v2, :cond_19

    .line 378
    .line 379
    add-int/lit8 v1, v1, 0x1

    .line 380
    .line 381
    :cond_19
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 382
    .line 383
    if-eqz v2, :cond_1a

    .line 384
    .line 385
    add-int/lit8 v1, v1, 0x1

    .line 386
    .line 387
    :cond_1a
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 388
    .line 389
    if-eqz v2, :cond_1b

    .line 390
    .line 391
    add-int/lit8 v1, v1, 0x1

    .line 392
    .line 393
    :cond_1b
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 394
    .line 395
    if-eqz v2, :cond_1c

    .line 396
    .line 397
    add-int/lit8 v1, v1, 0x1

    .line 398
    .line 399
    :cond_1c
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 400
    .line 401
    if-eqz v2, :cond_1d

    .line 402
    .line 403
    add-int/lit8 v1, v1, 0x1

    .line 404
    .line 405
    :cond_1d
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->J:Lcom/esotericsoftware/asm/Attribute;

    .line 406
    .line 407
    if-eqz v2, :cond_1e

    .line 408
    .line 409
    invoke-virtual {v2}, Lcom/esotericsoftware/asm/Attribute;->a()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    add-int/2addr v1, v2

    .line 414
    :cond_1e
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 415
    .line 416
    .line 417
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    .line 418
    .line 419
    if-eqz v1, :cond_1f

    .line 420
    .line 421
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 422
    .line 423
    const-string v2, "LocalVariableTable"

    .line 424
    .line 425
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 430
    .line 431
    .line 432
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    .line 433
    .line 434
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 435
    .line 436
    add-int/lit8 v1, v1, 0x2

    .line 437
    .line 438
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->D:I

    .line 443
    .line 444
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 445
    .line 446
    .line 447
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    .line 448
    .line 449
    iget-object v2, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 450
    .line 451
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 452
    .line 453
    invoke-virtual {v6, v2, v9, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 454
    .line 455
    .line 456
    :cond_1f
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    .line 457
    .line 458
    if-eqz v1, :cond_20

    .line 459
    .line 460
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 461
    .line 462
    const-string v2, "LocalVariableTypeTable"

    .line 463
    .line 464
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 469
    .line 470
    .line 471
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    .line 472
    .line 473
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 474
    .line 475
    add-int/lit8 v1, v1, 0x2

    .line 476
    .line 477
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->F:I

    .line 482
    .line 483
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 484
    .line 485
    .line 486
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    .line 487
    .line 488
    iget-object v2, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 489
    .line 490
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 491
    .line 492
    invoke-virtual {v6, v2, v9, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 493
    .line 494
    .line 495
    :cond_20
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 496
    .line 497
    if-eqz v1, :cond_21

    .line 498
    .line 499
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 500
    .line 501
    const-string v2, "LineNumberTable"

    .line 502
    .line 503
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 508
    .line 509
    .line 510
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 511
    .line 512
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 513
    .line 514
    add-int/lit8 v1, v1, 0x2

    .line 515
    .line 516
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->H:I

    .line 521
    .line 522
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 523
    .line 524
    .line 525
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 526
    .line 527
    iget-object v2, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 528
    .line 529
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 530
    .line 531
    invoke-virtual {v6, v2, v9, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 532
    .line 533
    .line 534
    :cond_21
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 535
    .line 536
    if-eqz v1, :cond_24

    .line 537
    .line 538
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 539
    .line 540
    iget v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    .line 541
    .line 542
    and-int/2addr v2, v12

    .line 543
    const/16 v3, 0x32

    .line 544
    .line 545
    if-lt v2, v3, :cond_22

    .line 546
    .line 547
    move v2, v10

    .line 548
    goto :goto_4

    .line 549
    :cond_22
    move v2, v9

    .line 550
    :goto_4
    if-eqz v2, :cond_23

    .line 551
    .line 552
    const-string v2, "StackMapTable"

    .line 553
    .line 554
    goto :goto_5

    .line 555
    :cond_23
    const-string v2, "StackMap"

    .line 556
    .line 557
    :goto_5
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 562
    .line 563
    .line 564
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 565
    .line 566
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 567
    .line 568
    add-int/lit8 v1, v1, 0x2

    .line 569
    .line 570
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->u:I

    .line 575
    .line 576
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 577
    .line 578
    .line 579
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 580
    .line 581
    iget-object v2, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 582
    .line 583
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 584
    .line 585
    invoke-virtual {v6, v2, v9, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 586
    .line 587
    .line 588
    :cond_24
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 589
    .line 590
    if-eqz v1, :cond_25

    .line 591
    .line 592
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 593
    .line 594
    invoke-virtual {v1, v15}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 595
    .line 596
    .line 597
    move-result v1

    .line 598
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 599
    .line 600
    .line 601
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 602
    .line 603
    invoke-virtual {v1, v6}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 604
    .line 605
    .line 606
    :cond_25
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 607
    .line 608
    if-eqz v1, :cond_26

    .line 609
    .line 610
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 611
    .line 612
    invoke-virtual {v1, v14}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 613
    .line 614
    .line 615
    move-result v1

    .line 616
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 617
    .line 618
    .line 619
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 620
    .line 621
    invoke-virtual {v1, v6}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 622
    .line 623
    .line 624
    :cond_26
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->J:Lcom/esotericsoftware/asm/Attribute;

    .line 625
    .line 626
    if-eqz v1, :cond_27

    .line 627
    .line 628
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 629
    .line 630
    iget-object v3, v0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 631
    .line 632
    iget-object v4, v3, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 633
    .line 634
    iget v3, v3, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 635
    .line 636
    iget v5, v0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 637
    .line 638
    iget v6, v0, Lcom/esotericsoftware/asm/MethodWriter;->s:I

    .line 639
    .line 640
    move-object v7, v4

    .line 641
    move v4, v3

    .line 642
    move-object v3, v7

    .line 643
    move-object/from16 v7, p1

    .line 644
    .line 645
    move/from16 v8, v22

    .line 646
    .line 647
    invoke-virtual/range {v1 .. v7}, Lcom/esotericsoftware/asm/Attribute;->a(Lcom/esotericsoftware/asm/ClassWriter;[BIIILcom/esotericsoftware/asm/ByteVector;)V

    .line 648
    .line 649
    .line 650
    move-object v6, v7

    .line 651
    goto :goto_6

    .line 652
    :cond_27
    move/from16 v8, v22

    .line 653
    .line 654
    goto :goto_6

    .line 655
    :cond_28
    move/from16 v23, v8

    .line 656
    .line 657
    const/4 v8, 0x2

    .line 658
    :goto_6
    iget v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->j:I

    .line 659
    .line 660
    if-lez v1, :cond_29

    .line 661
    .line 662
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 663
    .line 664
    const-string v2, "Exceptions"

    .line 665
    .line 666
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->j:I

    .line 675
    .line 676
    mul-int/2addr v2, v8

    .line 677
    add-int/2addr v2, v8

    .line 678
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 679
    .line 680
    .line 681
    iget v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->j:I

    .line 682
    .line 683
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 684
    .line 685
    .line 686
    move v1, v9

    .line 687
    :goto_7
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->j:I

    .line 688
    .line 689
    if-ge v1, v2, :cond_29

    .line 690
    .line 691
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->k:[I

    .line 692
    .line 693
    aget v2, v2, v1

    .line 694
    .line 695
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 696
    .line 697
    .line 698
    add-int/lit8 v1, v1, 0x1

    .line 699
    .line 700
    goto :goto_7

    .line 701
    :cond_29
    iget v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    .line 702
    .line 703
    and-int/lit16 v2, v1, 0x1000

    .line 704
    .line 705
    if-eqz v2, :cond_2b

    .line 706
    .line 707
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 708
    .line 709
    iget v3, v2, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    .line 710
    .line 711
    and-int/2addr v3, v12

    .line 712
    if-lt v3, v11, :cond_2a

    .line 713
    .line 714
    and-int v1, v1, v23

    .line 715
    .line 716
    if-eqz v1, :cond_2b

    .line 717
    .line 718
    :cond_2a
    const-string v1, "Synthetic"

    .line 719
    .line 720
    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 721
    .line 722
    .line 723
    move-result v1

    .line 724
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-virtual {v1, v9}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 729
    .line 730
    .line 731
    :cond_2b
    iget v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    .line 732
    .line 733
    and-int/2addr v1, v13

    .line 734
    if-eqz v1, :cond_2c

    .line 735
    .line 736
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 737
    .line 738
    const-string v2, "Deprecated"

    .line 739
    .line 740
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 741
    .line 742
    .line 743
    move-result v1

    .line 744
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    invoke-virtual {v1, v9}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 749
    .line 750
    .line 751
    :cond_2c
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->g:Ljava/lang/String;

    .line 752
    .line 753
    if-eqz v1, :cond_2d

    .line 754
    .line 755
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 756
    .line 757
    const-string v2, "Signature"

    .line 758
    .line 759
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 760
    .line 761
    .line 762
    move-result v1

    .line 763
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    invoke-virtual {v1, v8}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    iget-object v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 772
    .line 773
    iget-object v3, v0, Lcom/esotericsoftware/asm/MethodWriter;->g:Ljava/lang/String;

    .line 774
    .line 775
    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 776
    .line 777
    .line 778
    move-result v2

    .line 779
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 780
    .line 781
    .line 782
    :cond_2d
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->$:Lcom/esotericsoftware/asm/ByteVector;

    .line 783
    .line 784
    if-eqz v1, :cond_2e

    .line 785
    .line 786
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 787
    .line 788
    const-string v2, "MethodParameters"

    .line 789
    .line 790
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 791
    .line 792
    .line 793
    move-result v1

    .line 794
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 795
    .line 796
    .line 797
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->$:Lcom/esotericsoftware/asm/ByteVector;

    .line 798
    .line 799
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 800
    .line 801
    add-int/2addr v1, v10

    .line 802
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->Z:I

    .line 807
    .line 808
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 809
    .line 810
    .line 811
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->$:Lcom/esotericsoftware/asm/ByteVector;

    .line 812
    .line 813
    iget-object v2, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 814
    .line 815
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 816
    .line 817
    invoke-virtual {v6, v2, v9, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 818
    .line 819
    .line 820
    :cond_2e
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->l:Lcom/esotericsoftware/asm/ByteVector;

    .line 821
    .line 822
    if-eqz v1, :cond_2f

    .line 823
    .line 824
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 825
    .line 826
    const-string v2, "AnnotationDefault"

    .line 827
    .line 828
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 829
    .line 830
    .line 831
    move-result v1

    .line 832
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 833
    .line 834
    .line 835
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->l:Lcom/esotericsoftware/asm/ByteVector;

    .line 836
    .line 837
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 838
    .line 839
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 840
    .line 841
    .line 842
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->l:Lcom/esotericsoftware/asm/ByteVector;

    .line 843
    .line 844
    iget-object v2, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 845
    .line 846
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 847
    .line 848
    invoke-virtual {v6, v2, v9, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 849
    .line 850
    .line 851
    :cond_2f
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->m:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 852
    .line 853
    if-eqz v1, :cond_30

    .line 854
    .line 855
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 856
    .line 857
    const-string v2, "RuntimeVisibleAnnotations"

    .line 858
    .line 859
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 860
    .line 861
    .line 862
    move-result v1

    .line 863
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 864
    .line 865
    .line 866
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->m:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 867
    .line 868
    invoke-virtual {v1, v6}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 869
    .line 870
    .line 871
    :cond_30
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->n:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 872
    .line 873
    if-eqz v1, :cond_31

    .line 874
    .line 875
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 876
    .line 877
    const-string v2, "RuntimeInvisibleAnnotations"

    .line 878
    .line 879
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 880
    .line 881
    .line 882
    move-result v1

    .line 883
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 884
    .line 885
    .line 886
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->n:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 887
    .line 888
    invoke-virtual {v1, v6}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 889
    .line 890
    .line 891
    :cond_31
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->U:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 892
    .line 893
    if-eqz v1, :cond_32

    .line 894
    .line 895
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 896
    .line 897
    invoke-virtual {v1, v15}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 898
    .line 899
    .line 900
    move-result v1

    .line 901
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 902
    .line 903
    .line 904
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->U:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 905
    .line 906
    invoke-virtual {v1, v6}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 907
    .line 908
    .line 909
    :cond_32
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->V:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 910
    .line 911
    if-eqz v1, :cond_33

    .line 912
    .line 913
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 914
    .line 915
    invoke-virtual {v1, v14}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 916
    .line 917
    .line 918
    move-result v1

    .line 919
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 920
    .line 921
    .line 922
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->V:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 923
    .line 924
    invoke-virtual {v1, v6}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 925
    .line 926
    .line 927
    :cond_33
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->o:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 928
    .line 929
    if-eqz v1, :cond_34

    .line 930
    .line 931
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 932
    .line 933
    const-string v2, "RuntimeVisibleParameterAnnotations"

    .line 934
    .line 935
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 936
    .line 937
    .line 938
    move-result v1

    .line 939
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 940
    .line 941
    .line 942
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->o:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 943
    .line 944
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->S:I

    .line 945
    .line 946
    invoke-static {v1, v2, v6}, Lcom/esotericsoftware/asm/AnnotationWriter;->a([Lcom/esotericsoftware/asm/AnnotationWriter;ILcom/esotericsoftware/asm/ByteVector;)V

    .line 947
    .line 948
    .line 949
    :cond_34
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->p:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 950
    .line 951
    if-eqz v1, :cond_35

    .line 952
    .line 953
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 954
    .line 955
    const-string v2, "RuntimeInvisibleParameterAnnotations"

    .line 956
    .line 957
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 958
    .line 959
    .line 960
    move-result v1

    .line 961
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 962
    .line 963
    .line 964
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->p:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 965
    .line 966
    iget v2, v0, Lcom/esotericsoftware/asm/MethodWriter;->S:I

    .line 967
    .line 968
    invoke-static {v1, v2, v6}, Lcom/esotericsoftware/asm/AnnotationWriter;->a([Lcom/esotericsoftware/asm/AnnotationWriter;ILcom/esotericsoftware/asm/ByteVector;)V

    .line 969
    .line 970
    .line 971
    :cond_35
    iget-object v1, v0, Lcom/esotericsoftware/asm/MethodWriter;->q:Lcom/esotericsoftware/asm/Attribute;

    .line 972
    .line 973
    if-eqz v1, :cond_36

    .line 974
    .line 975
    iget-object v0, v0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 976
    .line 977
    const/4 v4, -0x1

    .line 978
    const/4 v5, -0x1

    .line 979
    const/4 v2, 0x0

    .line 980
    const/4 v3, 0x0

    .line 981
    move-object/from16 v24, v1

    .line 982
    .line 983
    move-object v1, v0

    .line 984
    move-object/from16 v0, v24

    .line 985
    .line 986
    invoke-virtual/range {v0 .. v6}, Lcom/esotericsoftware/asm/Attribute;->a(Lcom/esotericsoftware/asm/ClassWriter;[BIIILcom/esotericsoftware/asm/ByteVector;)V

    .line 987
    .line 988
    .line 989
    :cond_36
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 6

    .line 1
    new-instance v3, Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v3}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {v3, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v5, 0x2

    .line 26
    move-object v4, v3

    .line 27
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 28
    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->m:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 33
    .line 34
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->m:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_0
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->n:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 40
    .line 41
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->n:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 44
    .line 45
    return-object v0
.end method

.method public visitAnnotationDefault()Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 6

    .line 1
    new-instance v3, Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v3}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->l:Lcom/esotericsoftware/asm/ByteVector;

    .line 7
    .line 8
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public visitAttribute(Lcom/esotericsoftware/asm/Attribute;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/esotericsoftware/asm/Attribute;->isCodeAttribute()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->J:Lcom/esotericsoftware/asm/Attribute;

    .line 8
    .line 9
    iput-object v0, p1, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->J:Lcom/esotericsoftware/asm/Attribute;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->q:Lcom/esotericsoftware/asm/Attribute;

    .line 15
    .line 16
    iput-object v0, p1, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->q:Lcom/esotericsoftware/asm/Attribute;

    .line 19
    .line 20
    return-void
.end method

.method public visitCode()V
    .locals 0

    .line 1
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    return-void
.end method

.method public visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 8
    .line 9
    invoke-virtual {v0, p2, p3, p4}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 14
    .line 15
    if-eqz p3, :cond_9

    .line 16
    .line 17
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object p3, p3, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 23
    .line 24
    iget-object p4, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 25
    .line 26
    invoke-virtual {p3, p1, v1, p4, p2}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    invoke-virtual {p4, v1}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    const/4 p4, 0x1

    .line 35
    const/4 v0, -0x2

    .line 36
    const/16 v2, 0x4a

    .line 37
    .line 38
    const/16 v3, 0x44

    .line 39
    .line 40
    packed-switch p1, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    iget p4, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 44
    .line 45
    if-eq p3, v3, :cond_1

    .line 46
    .line 47
    if-ne p3, v2, :cond_2

    .line 48
    .line 49
    :cond_1
    const/4 v0, -0x3

    .line 50
    :cond_2
    :goto_0
    add-int/2addr p4, v0

    .line 51
    goto :goto_1

    .line 52
    :pswitch_0
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 53
    .line 54
    if-eq p3, v3, :cond_3

    .line 55
    .line 56
    if-ne p3, v2, :cond_4

    .line 57
    .line 58
    :cond_3
    move v1, p4

    .line 59
    :cond_4
    add-int p4, v0, v1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_1
    iget p4, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 63
    .line 64
    if-eq p3, v3, :cond_2

    .line 65
    .line 66
    if-ne p3, v2, :cond_5

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    const/4 v0, -0x1

    .line 70
    goto :goto_0

    .line 71
    :pswitch_2
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 72
    .line 73
    if-eq p3, v3, :cond_6

    .line 74
    .line 75
    if-ne p3, v2, :cond_7

    .line 76
    .line 77
    :cond_6
    const/4 p4, 0x2

    .line 78
    :cond_7
    add-int/2addr p4, v0

    .line 79
    :goto_1
    iget p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 80
    .line 81
    if-le p4, p3, :cond_8

    .line 82
    .line 83
    iput p4, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 84
    .line 85
    :cond_8
    iput p4, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 86
    .line 87
    :cond_9
    :goto_2
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 88
    .line 89
    iget p2, p2, Lcom/esotericsoftware/asm/Item;->a:I

    .line 90
    .line 91
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_data_0
    .packed-switch 0xb2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    const/4 v0, -0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-ne p1, v0, :cond_8

    .line 10
    .line 11
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->x:[I

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->f()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->T:I

    .line 19
    .line 20
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 21
    .line 22
    iget p1, p1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 23
    .line 24
    invoke-direct {p0, p1, p2, p4}, Lcom/esotericsoftware/asm/MethodWriter;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    move v0, v1

    .line 29
    :goto_0
    const-string v2, ""

    .line 30
    .line 31
    const/high16 v3, 0x1800000

    .line 32
    .line 33
    const/high16 v4, 0x1700000

    .line 34
    .line 35
    if-ge v0, p2, :cond_4

    .line 36
    .line 37
    aget-object v5, p3, v0

    .line 38
    .line 39
    instance-of v6, v5, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v6, :cond_2

    .line 42
    .line 43
    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 44
    .line 45
    add-int/lit8 v3, p1, 0x1

    .line 46
    .line 47
    iget-object v6, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 48
    .line 49
    check-cast v5, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v6, v5}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    or-int/2addr v4, v5

    .line 56
    aput v4, v2, p1

    .line 57
    .line 58
    move p1, v3

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    instance-of v4, v5, Ljava/lang/Integer;

    .line 61
    .line 62
    iget-object v6, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    add-int/lit8 v2, p1, 0x1

    .line 67
    .line 68
    check-cast v5, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    aput v3, v6, p1

    .line 75
    .line 76
    move p1, v2

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    add-int/lit8 v4, p1, 0x1

    .line 79
    .line 80
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 81
    .line 82
    check-cast v5, Lcom/esotericsoftware/asm/Label;

    .line 83
    .line 84
    iget v5, v5, Lcom/esotericsoftware/asm/Label;->c:I

    .line 85
    .line 86
    invoke-virtual {v7, v2, v5}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;I)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    or-int/2addr v2, v3

    .line 91
    aput v2, v6, p1

    .line 92
    .line 93
    move p1, v4

    .line 94
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    :goto_2
    if-ge v1, p4, :cond_7

    .line 98
    .line 99
    aget-object p2, p5, v1

    .line 100
    .line 101
    instance-of p3, p2, Ljava/lang/String;

    .line 102
    .line 103
    if-eqz p3, :cond_5

    .line 104
    .line 105
    iget-object p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 106
    .line 107
    add-int/lit8 v0, p1, 0x1

    .line 108
    .line 109
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 110
    .line 111
    check-cast p2, Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v5, p2}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    or-int/2addr p2, v4

    .line 118
    aput p2, p3, p1

    .line 119
    .line 120
    move p1, v0

    .line 121
    goto :goto_4

    .line 122
    :cond_5
    instance-of p3, p2, Ljava/lang/Integer;

    .line 123
    .line 124
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 125
    .line 126
    if-eqz p3, :cond_6

    .line 127
    .line 128
    add-int/lit8 p3, p1, 0x1

    .line 129
    .line 130
    check-cast p2, Ljava/lang/Integer;

    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    aput p2, v0, p1

    .line 137
    .line 138
    :goto_3
    move p1, p3

    .line 139
    goto :goto_4

    .line 140
    :cond_6
    add-int/lit8 p3, p1, 0x1

    .line 141
    .line 142
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 143
    .line 144
    check-cast p2, Lcom/esotericsoftware/asm/Label;

    .line 145
    .line 146
    iget p2, p2, Lcom/esotericsoftware/asm/Label;->c:I

    .line 147
    .line 148
    invoke-virtual {v5, v2, p2}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;I)I

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    or-int/2addr p2, v3

    .line 153
    aput p2, v0, p1

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_7
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->b()V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_d

    .line 163
    .line 164
    :cond_8
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 165
    .line 166
    const/4 v2, 0x3

    .line 167
    const/4 v3, 0x1

    .line 168
    if-nez v0, :cond_9

    .line 169
    .line 170
    new-instance v0, Lcom/esotericsoftware/asm/ByteVector;

    .line 171
    .line 172
    invoke-direct {v0}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 173
    .line 174
    .line 175
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 176
    .line 177
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 178
    .line 179
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_9
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 183
    .line 184
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 185
    .line 186
    iget v4, p0, Lcom/esotericsoftware/asm/MethodWriter;->w:I

    .line 187
    .line 188
    sub-int/2addr v0, v4

    .line 189
    sub-int/2addr v0, v3

    .line 190
    if-gez v0, :cond_b

    .line 191
    .line 192
    if-ne p1, v2, :cond_a

    .line 193
    .line 194
    :goto_5
    return-void

    .line 195
    :cond_a
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_b
    :goto_6
    if-eqz p1, :cond_12

    .line 200
    .line 201
    if-eq p1, v3, :cond_11

    .line 202
    .line 203
    const/4 p3, 0x2

    .line 204
    const/16 v4, 0xfb

    .line 205
    .line 206
    if-eq p1, p3, :cond_10

    .line 207
    .line 208
    const/16 p2, 0x40

    .line 209
    .line 210
    if-eq p1, v2, :cond_e

    .line 211
    .line 212
    const/4 p3, 0x4

    .line 213
    if-eq p1, p3, :cond_c

    .line 214
    .line 215
    goto/16 :goto_c

    .line 216
    .line 217
    :cond_c
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 218
    .line 219
    if-ge v0, p2, :cond_d

    .line 220
    .line 221
    add-int/2addr v0, p2

    .line 222
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 223
    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_d
    const/16 p2, 0xf7

    .line 227
    .line 228
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 233
    .line 234
    .line 235
    :goto_7
    aget-object p1, p5, v1

    .line 236
    .line 237
    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/MethodWriter;->a(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto :goto_c

    .line 241
    :cond_e
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 242
    .line 243
    if-ge v0, p2, :cond_f

    .line 244
    .line 245
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 246
    .line 247
    .line 248
    goto :goto_c

    .line 249
    :cond_f
    :goto_8
    invoke-virtual {p1, v4}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 254
    .line 255
    .line 256
    goto :goto_c

    .line 257
    :cond_10
    iget p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->T:I

    .line 258
    .line 259
    sub-int/2addr p1, p2

    .line 260
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->T:I

    .line 261
    .line 262
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 263
    .line 264
    sub-int/2addr v4, p2

    .line 265
    goto :goto_8

    .line 266
    :cond_11
    iget p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->T:I

    .line 267
    .line 268
    add-int/2addr p1, p2

    .line 269
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->T:I

    .line 270
    .line 271
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 272
    .line 273
    add-int/lit16 p5, p2, 0xfb

    .line 274
    .line 275
    invoke-virtual {p1, p5}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 280
    .line 281
    .line 282
    :goto_9
    if-ge v1, p2, :cond_14

    .line 283
    .line 284
    aget-object p1, p3, v1

    .line 285
    .line 286
    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/MethodWriter;->a(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    add-int/lit8 v1, v1, 0x1

    .line 290
    .line 291
    goto :goto_9

    .line 292
    :cond_12
    iput p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->T:I

    .line 293
    .line 294
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 295
    .line 296
    const/16 v2, 0xff

    .line 297
    .line 298
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 307
    .line 308
    .line 309
    move p1, v1

    .line 310
    :goto_a
    if-ge p1, p2, :cond_13

    .line 311
    .line 312
    aget-object v0, p3, p1

    .line 313
    .line 314
    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/MethodWriter;->a(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    add-int/lit8 p1, p1, 0x1

    .line 318
    .line 319
    goto :goto_a

    .line 320
    :cond_13
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->v:Lcom/esotericsoftware/asm/ByteVector;

    .line 321
    .line 322
    invoke-virtual {p1, p4}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 323
    .line 324
    .line 325
    :goto_b
    if-ge v1, p4, :cond_14

    .line 326
    .line 327
    aget-object p1, p5, v1

    .line 328
    .line 329
    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/MethodWriter;->a(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    add-int/lit8 v1, v1, 0x1

    .line 333
    .line 334
    goto :goto_b

    .line 335
    :cond_14
    :goto_c
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 336
    .line 337
    iget p1, p1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 338
    .line 339
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->w:I

    .line 340
    .line 341
    iget p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->u:I

    .line 342
    .line 343
    add-int/2addr p1, v3

    .line 344
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->u:I

    .line 345
    .line 346
    :goto_d
    iget p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->s:I

    .line 347
    .line 348
    invoke-static {p1, p4}, Ljava/lang/Math;->max(II)I

    .line 349
    .line 350
    .line 351
    move-result p1

    .line 352
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->s:I

    .line 353
    .line 354
    iget p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 355
    .line 356
    iget p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->T:I

    .line 357
    .line 358
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 363
    .line 364
    return-void
.end method

.method public visitIincInsn(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 8
    .line 9
    const/16 v1, 0x84

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v1, p1, v2, v2}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    if-eq v0, v2, :cond_1

    .line 27
    .line 28
    add-int/lit8 v0, p1, 0x1

    .line 29
    .line 30
    iget v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 31
    .line 32
    if-le v0, v2, :cond_1

    .line 33
    .line 34
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 35
    .line 36
    :cond_1
    const/16 v0, 0xff

    .line 37
    .line 38
    if-gt p1, v0, :cond_3

    .line 39
    .line 40
    const/16 v0, 0x7f

    .line 41
    .line 42
    if-gt p2, v0, :cond_3

    .line 43
    .line 44
    const/16 v0, -0x80

    .line 45
    .line 46
    if-ge p2, v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->a(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    :goto_0
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 60
    .line 61
    const/16 v0, 0xc4

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0, v1, p1}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public visitInsn(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 11
    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v0, p1, v1, v2, v2}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 27
    .line 28
    sget-object v1, Lcom/esotericsoftware/asm/Frame;->a:[I

    .line 29
    .line 30
    aget v1, v1, p1

    .line 31
    .line 32
    add-int/2addr v0, v1

    .line 33
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 34
    .line 35
    if-le v0, v1, :cond_1

    .line 36
    .line 37
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 38
    .line 39
    :cond_1
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 40
    .line 41
    :goto_0
    const/16 v0, 0xac

    .line 42
    .line 43
    if-lt p1, v0, :cond_2

    .line 44
    .line 45
    const/16 v0, 0xb1

    .line 46
    .line 47
    if-le p1, v0, :cond_3

    .line 48
    .line 49
    :cond_2
    const/16 v0, 0xbf

    .line 50
    .line 51
    if-ne p1, v0, :cond_4

    .line 52
    .line 53
    :cond_3
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->e()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-void
.end method

.method public visitInsnAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 6

    .line 1
    new-instance v3, Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v3}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    const v0, -0xffff01

    .line 7
    .line 8
    .line 9
    and-int/2addr p1, v0

    .line 10
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 11
    .line 12
    shl-int/lit8 v0, v0, 0x8

    .line 13
    .line 14
    or-int/2addr p1, v0

    .line 15
    invoke-static {p1, p2, v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(ILcom/esotericsoftware/asm/TypePath;Lcom/esotericsoftware/asm/ByteVector;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 19
    .line 20
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {v3, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 30
    .line 31
    .line 32
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 35
    .line 36
    iget p1, v3, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 37
    .line 38
    add-int/lit8 v5, p1, -0x2

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    move-object v4, v3

    .line 42
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 43
    .line 44
    .line 45
    if-eqz p4, :cond_0

    .line 46
    .line 47
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 48
    .line 49
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 50
    .line 51
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_0
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 55
    .line 56
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 57
    .line 58
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 59
    .line 60
    return-object v0
.end method

.method public visitIntInsn(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, p1, p2, v1, v1}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v0, 0xbc

    .line 23
    .line 24
    if-eq p1, v0, :cond_2

    .line 25
    .line 26
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 31
    .line 32
    if-le v0, v1, :cond_1

    .line 33
    .line 34
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 35
    .line 36
    :cond_1
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 37
    .line 38
    :cond_2
    :goto_0
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 39
    .line 40
    const/16 v0, 0x11

    .line 41
    .line 42
    if-ne p1, v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->a(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public varargs visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Handle;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Handle;[Ljava/lang/Object;)Lcom/esotericsoftware/asm/Item;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget p3, p1, Lcom/esotericsoftware/asm/Item;->c:I

    .line 14
    .line 15
    iget-object p4, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v1, 0xba

    .line 19
    .line 20
    if-eqz p4, :cond_3

    .line 21
    .line 22
    iget v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-object p2, p4, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 27
    .line 28
    iget-object p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 29
    .line 30
    invoke-virtual {p2, v1, v0, p3, p1}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    if-nez p3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, Lcom/esotericsoftware/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    iput p3, p1, Lcom/esotericsoftware/asm/Item;->c:I

    .line 41
    .line 42
    :cond_1
    iget p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 43
    .line 44
    shr-int/lit8 p4, p3, 0x2

    .line 45
    .line 46
    sub-int/2addr p2, p4

    .line 47
    and-int/lit8 p3, p3, 0x3

    .line 48
    .line 49
    add-int/2addr p2, p3

    .line 50
    add-int/lit8 p2, p2, 0x1

    .line 51
    .line 52
    iget p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 53
    .line 54
    if-le p2, p3, :cond_2

    .line 55
    .line 56
    iput p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 57
    .line 58
    :cond_2
    iput p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 59
    .line 60
    :cond_3
    :goto_0
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 61
    .line 62
    iget p1, p1, Lcom/esotericsoftware/asm/Item;->a:I

    .line 63
    .line 64
    invoke-virtual {p2, v1, p1}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public visitJumpInsn(ILcom/esotericsoftware/asm/Label;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 8
    .line 9
    const/16 v1, 0xa8

    .line 10
    .line 11
    const/16 v2, 0xa7

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget v6, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 19
    .line 20
    if-nez v6, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 23
    .line 24
    invoke-virtual {v0, p1, v3, v5, v5}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/esotericsoftware/asm/Label;->a()Lcom/esotericsoftware/asm/Label;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v6, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 32
    .line 33
    or-int/lit8 v6, v6, 0x10

    .line 34
    .line 35
    iput v6, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 36
    .line 37
    invoke-direct {p0, v3, p2}, Lcom/esotericsoftware/asm/MethodWriter;->a(ILcom/esotericsoftware/asm/Label;)V

    .line 38
    .line 39
    .line 40
    if-eq p1, v2, :cond_3

    .line 41
    .line 42
    new-instance v5, Lcom/esotericsoftware/asm/Label;

    .line 43
    .line 44
    invoke-direct {v5}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    if-ne p1, v1, :cond_2

    .line 49
    .line 50
    iget v5, p2, Lcom/esotericsoftware/asm/Label;->a:I

    .line 51
    .line 52
    and-int/lit16 v6, v5, 0x200

    .line 53
    .line 54
    if-nez v6, :cond_1

    .line 55
    .line 56
    or-int/lit16 v5, v5, 0x200

    .line 57
    .line 58
    iput v5, p2, Lcom/esotericsoftware/asm/Label;->a:I

    .line 59
    .line 60
    iget v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->L:I

    .line 61
    .line 62
    add-int/2addr v5, v4

    .line 63
    iput v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->L:I

    .line 64
    .line 65
    :cond_1
    iget v5, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 66
    .line 67
    or-int/lit16 v5, v5, 0x80

    .line 68
    .line 69
    iput v5, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 70
    .line 71
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 72
    .line 73
    add-int/2addr v0, v4

    .line 74
    invoke-direct {p0, v0, p2}, Lcom/esotericsoftware/asm/MethodWriter;->a(ILcom/esotericsoftware/asm/Label;)V

    .line 75
    .line 76
    .line 77
    new-instance v5, Lcom/esotericsoftware/asm/Label;

    .line 78
    .line 79
    invoke-direct {v5}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 84
    .line 85
    sget-object v6, Lcom/esotericsoftware/asm/Frame;->a:[I

    .line 86
    .line 87
    aget v6, v6, p1

    .line 88
    .line 89
    add-int/2addr v0, v6

    .line 90
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 91
    .line 92
    invoke-direct {p0, v0, p2}, Lcom/esotericsoftware/asm/MethodWriter;->a(ILcom/esotericsoftware/asm/Label;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    :goto_0
    iget v0, p2, Lcom/esotericsoftware/asm/Label;->a:I

    .line 96
    .line 97
    and-int/lit8 v0, v0, 0x2

    .line 98
    .line 99
    if-eqz v0, :cond_8

    .line 100
    .line 101
    iget v0, p2, Lcom/esotericsoftware/asm/Label;->c:I

    .line 102
    .line 103
    iget-object v6, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 104
    .line 105
    iget v7, v6, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 106
    .line 107
    sub-int/2addr v0, v7

    .line 108
    const/16 v7, -0x8000

    .line 109
    .line 110
    if-ge v0, v7, :cond_8

    .line 111
    .line 112
    const/16 v0, 0xc8

    .line 113
    .line 114
    if-ne p1, v2, :cond_4

    .line 115
    .line 116
    :goto_1
    invoke-virtual {v6, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    if-ne p1, v1, :cond_5

    .line 121
    .line 122
    const/16 v0, 0xc9

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_5
    if-eqz v5, :cond_6

    .line 126
    .line 127
    iget v1, v5, Lcom/esotericsoftware/asm/Label;->a:I

    .line 128
    .line 129
    or-int/lit8 v1, v1, 0x10

    .line 130
    .line 131
    iput v1, v5, Lcom/esotericsoftware/asm/Label;->a:I

    .line 132
    .line 133
    :cond_6
    const/16 v1, 0xa6

    .line 134
    .line 135
    if-gt p1, v1, :cond_7

    .line 136
    .line 137
    add-int/lit8 v1, p1, 0x1

    .line 138
    .line 139
    xor-int/2addr v1, v4

    .line 140
    sub-int/2addr v1, v4

    .line 141
    goto :goto_2

    .line 142
    :cond_7
    xor-int/lit8 v1, p1, 0x1

    .line 143
    .line 144
    :goto_2
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 145
    .line 146
    .line 147
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 148
    .line 149
    const/16 v3, 0x8

    .line 150
    .line 151
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 152
    .line 153
    .line 154
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 157
    .line 158
    .line 159
    :goto_3
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 160
    .line 161
    iget v1, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 162
    .line 163
    sub-int/2addr v1, v4

    .line 164
    invoke-virtual {p2, p0, v0, v1, v4}, Lcom/esotericsoftware/asm/Label;->a(Lcom/esotericsoftware/asm/MethodWriter;Lcom/esotericsoftware/asm/ByteVector;IZ)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_8
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 169
    .line 170
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 171
    .line 172
    .line 173
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 174
    .line 175
    iget v1, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 176
    .line 177
    sub-int/2addr v1, v4

    .line 178
    invoke-virtual {p2, p0, v0, v1, v3}, Lcom/esotericsoftware/asm/Label;->a(Lcom/esotericsoftware/asm/MethodWriter;Lcom/esotericsoftware/asm/ByteVector;IZ)V

    .line 179
    .line 180
    .line 181
    :goto_4
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 182
    .line 183
    if-eqz p2, :cond_a

    .line 184
    .line 185
    if-eqz v5, :cond_9

    .line 186
    .line 187
    invoke-virtual {p0, v5}, Lcom/esotericsoftware/asm/MethodWriter;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 188
    .line 189
    .line 190
    :cond_9
    if-ne p1, v2, :cond_a

    .line 191
    .line 192
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->e()V

    .line 193
    .line 194
    .line 195
    :cond_a
    return-void
.end method

.method public visitLabel(Lcom/esotericsoftware/asm/Label;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->K:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 4
    .line 5
    iget v2, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 6
    .line 7
    iget-object v1, v1, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 8
    .line 9
    invoke-virtual {p1, p0, v2, v1}, Lcom/esotericsoftware/asm/Label;->a(Lcom/esotericsoftware/asm/MethodWriter;I[B)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    or-int/2addr v0, v1

    .line 14
    iput-boolean v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->K:Z

    .line 15
    .line 16
    iget v0, p1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 17
    .line 18
    and-int/lit8 v1, v0, 0x1

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-nez v1, :cond_6

    .line 27
    .line 28
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget v3, p1, Lcom/esotericsoftware/asm/Label;->c:I

    .line 33
    .line 34
    iget v4, v1, Lcom/esotericsoftware/asm/Label;->c:I

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    iget p0, v1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 39
    .line 40
    and-int/lit8 v0, v0, 0x10

    .line 41
    .line 42
    or-int/2addr p0, v0

    .line 43
    iput p0, v1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 44
    .line 45
    iget-object p0, v1, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 46
    .line 47
    iput-object p0, p1, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-direct {p0, v2, p1}, Lcom/esotericsoftware/asm/MethodWriter;->a(ILcom/esotericsoftware/asm/Label;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    iput-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 54
    .line 55
    iget-object v0, p1, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    new-instance v0, Lcom/esotericsoftware/asm/Frame;

    .line 60
    .line 61
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p1, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 65
    .line 66
    iput-object p1, v0, Lcom/esotericsoftware/asm/Frame;->b:Lcom/esotericsoftware/asm/Label;

    .line 67
    .line 68
    :cond_3
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->O:Lcom/esotericsoftware/asm/Label;

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    iget v1, p1, Lcom/esotericsoftware/asm/Label;->c:I

    .line 73
    .line 74
    iget v2, v0, Lcom/esotericsoftware/asm/Label;->c:I

    .line 75
    .line 76
    if-ne v1, v2, :cond_4

    .line 77
    .line 78
    iget v1, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 79
    .line 80
    iget v2, p1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 81
    .line 82
    and-int/lit8 v2, v2, 0x10

    .line 83
    .line 84
    or-int/2addr v1, v2

    .line 85
    iput v1, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 86
    .line 87
    iget-object v1, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 88
    .line 89
    iput-object v1, p1, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 90
    .line 91
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    iput-object p1, v0, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 95
    .line 96
    :cond_5
    iput-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->O:Lcom/esotericsoftware/asm/Label;

    .line 97
    .line 98
    return-void

    .line 99
    :cond_6
    const/4 v0, 0x1

    .line 100
    if-ne v1, v0, :cond_9

    .line 101
    .line 102
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 103
    .line 104
    if-eqz v0, :cond_7

    .line 105
    .line 106
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 107
    .line 108
    iput v1, v0, Lcom/esotericsoftware/asm/Label;->g:I

    .line 109
    .line 110
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 111
    .line 112
    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/asm/MethodWriter;->a(ILcom/esotericsoftware/asm/Label;)V

    .line 113
    .line 114
    .line 115
    :cond_7
    iput-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 116
    .line 117
    iput v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 118
    .line 119
    iput v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 120
    .line 121
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->O:Lcom/esotericsoftware/asm/Label;

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    iput-object p1, v0, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 126
    .line 127
    :cond_8
    iput-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->O:Lcom/esotericsoftware/asm/Label;

    .line 128
    .line 129
    :cond_9
    :goto_0
    return-void
.end method

.method public visitLdcInsn(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/Object;)Lcom/esotericsoftware/asm/Item;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 14
    .line 15
    const/4 v1, 0x6

    .line 16
    const/4 v2, 0x5

    .line 17
    const/16 v3, 0x12

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    iget v4, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 22
    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 29
    .line 30
    invoke-virtual {v0, v3, v4, v5, p1}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    iget v0, p1, Lcom/esotericsoftware/asm/Item;->b:I

    .line 35
    .line 36
    if-eq v0, v2, :cond_2

    .line 37
    .line 38
    if-ne v0, v1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x2

    .line 49
    .line 50
    :goto_1
    iget v4, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 51
    .line 52
    if-le v0, v4, :cond_3

    .line 53
    .line 54
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 55
    .line 56
    :cond_3
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 57
    .line 58
    :cond_4
    :goto_2
    iget v0, p1, Lcom/esotericsoftware/asm/Item;->a:I

    .line 59
    .line 60
    iget p1, p1, Lcom/esotericsoftware/asm/Item;->b:I

    .line 61
    .line 62
    if-eq p1, v2, :cond_7

    .line 63
    .line 64
    if-ne p1, v1, :cond_5

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_5
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 68
    .line 69
    const/16 p1, 0x100

    .line 70
    .line 71
    if-lt v0, p1, :cond_6

    .line 72
    .line 73
    const/16 p1, 0x13

    .line 74
    .line 75
    :goto_3
    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    invoke-virtual {p0, v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->a(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_7
    :goto_4
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 84
    .line 85
    const/16 p1, 0x14

    .line 86
    .line 87
    goto :goto_3
.end method

.method public visitLineNumber(ILcom/esotericsoftware/asm/Label;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/esotericsoftware/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->H:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->H:I

    .line 17
    .line 18
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 19
    .line 20
    iget p2, p2, Lcom/esotericsoftware/asm/Label;->c:I

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->I:Lcom/esotericsoftware/asm/ByteVector;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p3, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/esotericsoftware/asm/ByteVector;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    .line 14
    .line 15
    :cond_0
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->F:I

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iput v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->F:I

    .line 19
    .line 20
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->G:Lcom/esotericsoftware/asm/ByteVector;

    .line 21
    .line 22
    iget v2, p4, Lcom/esotericsoftware/asm/Label;->c:I

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget v2, p5, Lcom/esotericsoftware/asm/Label;->c:I

    .line 29
    .line 30
    iget v3, p4, Lcom/esotericsoftware/asm/Label;->c:I

    .line 31
    .line 32
    sub-int/2addr v2, v3

    .line 33
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 38
    .line 39
    invoke-virtual {v2, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 48
    .line 49
    invoke-virtual {v2, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    invoke-virtual {v1, p3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-virtual {p3, p6}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 58
    .line 59
    .line 60
    :cond_1
    iget-object p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    .line 61
    .line 62
    if-nez p3, :cond_2

    .line 63
    .line 64
    new-instance p3, Lcom/esotericsoftware/asm/ByteVector;

    .line 65
    .line 66
    invoke-direct {p3}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    .line 70
    .line 71
    :cond_2
    iget p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->D:I

    .line 72
    .line 73
    add-int/2addr p3, v0

    .line 74
    iput p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->D:I

    .line 75
    .line 76
    iget-object p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->E:Lcom/esotericsoftware/asm/ByteVector;

    .line 77
    .line 78
    iget v1, p4, Lcom/esotericsoftware/asm/Label;->c:I

    .line 79
    .line 80
    invoke-virtual {p3, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    iget p5, p5, Lcom/esotericsoftware/asm/Label;->c:I

    .line 85
    .line 86
    iget p4, p4, Lcom/esotericsoftware/asm/Label;->c:I

    .line 87
    .line 88
    sub-int/2addr p5, p4

    .line 89
    invoke-virtual {p3, p5}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    iget-object p4, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 94
    .line 95
    invoke-virtual {p4, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {p3, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object p3, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 104
    .line 105
    invoke-virtual {p3, p2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1, p6}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 114
    .line 115
    .line 116
    iget p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 117
    .line 118
    const/4 p3, 0x2

    .line 119
    if-eq p1, p3, :cond_5

    .line 120
    .line 121
    const/4 p1, 0x0

    .line 122
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    const/16 p2, 0x4a

    .line 127
    .line 128
    if-eq p1, p2, :cond_3

    .line 129
    .line 130
    const/16 p2, 0x44

    .line 131
    .line 132
    if-ne p1, p2, :cond_4

    .line 133
    .line 134
    :cond_3
    move v0, p3

    .line 135
    :cond_4
    add-int/2addr p6, v0

    .line 136
    iget p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 137
    .line 138
    if-le p6, p1, :cond_5

    .line 139
    .line 140
    iput p6, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 141
    .line 142
    :cond_5
    return-void
.end method

.method public visitLocalVariableAnnotation(ILcom/esotericsoftware/asm/TypePath;[Lcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;[ILjava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 5

    .line 1
    move-object v0, p4

    .line 2
    new-instance p4, Lcom/esotericsoftware/asm/ByteVector;

    .line 3
    .line 4
    invoke-direct {p4}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 5
    .line 6
    .line 7
    ushr-int/lit8 p1, p1, 0x18

    .line 8
    .line 9
    invoke-virtual {p4, p1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    array-length v1, p3

    .line 14
    invoke-virtual {p1, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    move v1, p1

    .line 19
    :goto_0
    array-length v2, p3

    .line 20
    if-ge v1, v2, :cond_0

    .line 21
    .line 22
    aget-object v2, p3, v1

    .line 23
    .line 24
    iget v2, v2, Lcom/esotericsoftware/asm/Label;->c:I

    .line 25
    .line 26
    invoke-virtual {p4, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    aget-object v3, v0, v1

    .line 31
    .line 32
    iget v3, v3, Lcom/esotericsoftware/asm/Label;->c:I

    .line 33
    .line 34
    aget-object v4, p3, v1

    .line 35
    .line 36
    iget v4, v4, Lcom/esotericsoftware/asm/Label;->c:I

    .line 37
    .line 38
    sub-int/2addr v3, v4

    .line 39
    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    aget v3, p5, v1

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    if-nez p2, :cond_1

    .line 52
    .line 53
    invoke-virtual {p4, p1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    iget-object p3, p2, Lcom/esotericsoftware/asm/TypePath;->a:[B

    .line 58
    .line 59
    iget p2, p2, Lcom/esotericsoftware/asm/TypePath;->b:I

    .line 60
    .line 61
    aget-byte p5, p3, p2

    .line 62
    .line 63
    mul-int/lit8 p5, p5, 0x2

    .line 64
    .line 65
    add-int/lit8 p5, p5, 0x1

    .line 66
    .line 67
    invoke-virtual {p4, p3, p2, p5}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 68
    .line 69
    .line 70
    :goto_1
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 71
    .line 72
    invoke-virtual {p2, p6}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-virtual {p4, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p2, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 81
    .line 82
    .line 83
    new-instance p1, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 84
    .line 85
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 86
    .line 87
    iget p3, p4, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 88
    .line 89
    add-int/lit8 p6, p3, -0x2

    .line 90
    .line 91
    const/4 p3, 0x1

    .line 92
    move-object p5, p4

    .line 93
    invoke-direct/range {p1 .. p6}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 94
    .line 95
    .line 96
    if-eqz p7, :cond_2

    .line 97
    .line 98
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 99
    .line 100
    iput-object p2, p1, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 101
    .line 102
    iput-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 103
    .line 104
    return-object p1

    .line 105
    :cond_2
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 106
    .line 107
    iput-object p2, p1, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 108
    .line 109
    iput-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 110
    .line 111
    return-object p1
.end method

.method public visitLookupSwitchInsn(Lcom/esotericsoftware/asm/Label;[I[Lcom/esotericsoftware/asm/Label;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    const/16 v2, 0xab

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 13
    .line 14
    iget v2, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 15
    .line 16
    rem-int/lit8 v2, v2, 0x4

    .line 17
    .line 18
    rsub-int/lit8 v2, v2, 0x4

    .line 19
    .line 20
    rem-int/lit8 v2, v2, 0x4

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-virtual {v0, v3, v4, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/esotericsoftware/asm/Label;->a(Lcom/esotericsoftware/asm/MethodWriter;Lcom/esotericsoftware/asm/ByteVector;IZ)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 34
    .line 35
    array-length v3, p3

    .line 36
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 37
    .line 38
    .line 39
    :goto_0
    array-length v0, p3

    .line 40
    if-ge v4, v0, :cond_0

    .line 41
    .line 42
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 43
    .line 44
    aget v3, p2, v4

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 47
    .line 48
    .line 49
    aget-object v0, p3, v4

    .line 50
    .line 51
    iget-object v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 52
    .line 53
    invoke-virtual {v0, p0, v3, v1, v2}, Lcom/esotericsoftware/asm/Label;->a(Lcom/esotericsoftware/asm/MethodWriter;Lcom/esotericsoftware/asm/ByteVector;IZ)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/esotericsoftware/asm/MethodWriter;->a(Lcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public visitMaxs(II)V
    .locals 13

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->K:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-nez v0, :cond_f

    .line 16
    .line 17
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->B:Lcom/esotericsoftware/asm/Handler;

    .line 18
    .line 19
    :goto_0
    const/high16 p2, 0x1700000

    .line 20
    .line 21
    const-string v0, "java/lang/Throwable"

    .line 22
    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    iget-object v5, p1, Lcom/esotericsoftware/asm/Handler;->a:Lcom/esotericsoftware/asm/Label;

    .line 26
    .line 27
    invoke-virtual {v5}, Lcom/esotericsoftware/asm/Label;->a()Lcom/esotericsoftware/asm/Label;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget-object v6, p1, Lcom/esotericsoftware/asm/Handler;->c:Lcom/esotericsoftware/asm/Label;

    .line 32
    .line 33
    invoke-virtual {v6}, Lcom/esotericsoftware/asm/Label;->a()Lcom/esotericsoftware/asm/Label;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-object v7, p1, Lcom/esotericsoftware/asm/Handler;->b:Lcom/esotericsoftware/asm/Label;

    .line 38
    .line 39
    invoke-virtual {v7}, Lcom/esotericsoftware/asm/Label;->a()Lcom/esotericsoftware/asm/Label;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    iget-object v8, p1, Lcom/esotericsoftware/asm/Handler;->d:Ljava/lang/String;

    .line 44
    .line 45
    if-nez v8, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v0, v8

    .line 49
    :goto_1
    iget-object v8, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 50
    .line 51
    invoke-virtual {v8, v0}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    or-int/2addr p2, v0

    .line 56
    iget v0, v6, Lcom/esotericsoftware/asm/Label;->a:I

    .line 57
    .line 58
    or-int/lit8 v0, v0, 0x10

    .line 59
    .line 60
    iput v0, v6, Lcom/esotericsoftware/asm/Label;->a:I

    .line 61
    .line 62
    :goto_2
    if-eq v5, v7, :cond_2

    .line 63
    .line 64
    new-instance v0, Lcom/esotericsoftware/asm/Edge;

    .line 65
    .line 66
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Edge;-><init>()V

    .line 67
    .line 68
    .line 69
    iput p2, v0, Lcom/esotericsoftware/asm/Edge;->a:I

    .line 70
    .line 71
    iput-object v6, v0, Lcom/esotericsoftware/asm/Edge;->b:Lcom/esotericsoftware/asm/Label;

    .line 72
    .line 73
    iget-object v8, v5, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 74
    .line 75
    iput-object v8, v0, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 76
    .line 77
    iput-object v0, v5, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 78
    .line 79
    iget-object v5, v5, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    iget-object p1, p1, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->N:Lcom/esotericsoftware/asm/Label;

    .line 86
    .line 87
    iget-object p1, p1, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 88
    .line 89
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v5}, Lcom/esotericsoftware/asm/Type;->getArgumentTypes(Ljava/lang/String;)[Lcom/esotericsoftware/asm/Type;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    iget-object v6, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 96
    .line 97
    iget v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->c:I

    .line 98
    .line 99
    iget v8, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 100
    .line 101
    invoke-virtual {p1, v6, v7, v5, v8}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;I[Lcom/esotericsoftware/asm/Type;I)V

    .line 102
    .line 103
    .line 104
    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/MethodWriter;->b(Lcom/esotericsoftware/asm/Frame;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->N:Lcom/esotericsoftware/asm/Label;

    .line 108
    .line 109
    move v5, v3

    .line 110
    :goto_3
    if-eqz p1, :cond_8

    .line 111
    .line 112
    iget-object v6, p1, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 113
    .line 114
    iput-object v1, p1, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 115
    .line 116
    iget-object v7, p1, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 117
    .line 118
    iget v8, p1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 119
    .line 120
    and-int/lit8 v9, v8, 0x10

    .line 121
    .line 122
    if-eqz v9, :cond_4

    .line 123
    .line 124
    or-int/lit8 v8, v8, 0x20

    .line 125
    .line 126
    iput v8, p1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 127
    .line 128
    :cond_4
    iget v8, p1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 129
    .line 130
    or-int/lit8 v8, v8, 0x40

    .line 131
    .line 132
    iput v8, p1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 133
    .line 134
    iget-object v8, v7, Lcom/esotericsoftware/asm/Frame;->d:[I

    .line 135
    .line 136
    array-length v8, v8

    .line 137
    iget v9, p1, Lcom/esotericsoftware/asm/Label;->g:I

    .line 138
    .line 139
    add-int/2addr v8, v9

    .line 140
    if-le v8, v5, :cond_5

    .line 141
    .line 142
    move v5, v8

    .line 143
    :cond_5
    iget-object p1, p1, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 144
    .line 145
    :goto_4
    if-eqz p1, :cond_7

    .line 146
    .line 147
    iget-object v8, p1, Lcom/esotericsoftware/asm/Edge;->b:Lcom/esotericsoftware/asm/Label;

    .line 148
    .line 149
    invoke-virtual {v8}, Lcom/esotericsoftware/asm/Label;->a()Lcom/esotericsoftware/asm/Label;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    iget-object v9, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 154
    .line 155
    iget-object v10, v8, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 156
    .line 157
    iget v11, p1, Lcom/esotericsoftware/asm/Edge;->a:I

    .line 158
    .line 159
    invoke-virtual {v7, v9, v10, v11}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Frame;I)Z

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    if-eqz v9, :cond_6

    .line 164
    .line 165
    iget-object v9, v8, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 166
    .line 167
    if-nez v9, :cond_6

    .line 168
    .line 169
    iput-object v6, v8, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 170
    .line 171
    move-object v6, v8

    .line 172
    :cond_6
    iget-object p1, p1, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_7
    move-object p1, v6

    .line 176
    goto :goto_3

    .line 177
    :cond_8
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->N:Lcom/esotericsoftware/asm/Label;

    .line 178
    .line 179
    :goto_5
    if-eqz p1, :cond_d

    .line 180
    .line 181
    iget-object v1, p1, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 182
    .line 183
    iget v6, p1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 184
    .line 185
    and-int/2addr v6, v2

    .line 186
    if-eqz v6, :cond_9

    .line 187
    .line 188
    invoke-direct {p0, v1}, Lcom/esotericsoftware/asm/MethodWriter;->b(Lcom/esotericsoftware/asm/Frame;)V

    .line 189
    .line 190
    .line 191
    :cond_9
    iget v1, p1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 192
    .line 193
    and-int/lit8 v1, v1, 0x40

    .line 194
    .line 195
    if-nez v1, :cond_c

    .line 196
    .line 197
    iget-object v1, p1, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 198
    .line 199
    iget v6, p1, Lcom/esotericsoftware/asm/Label;->c:I

    .line 200
    .line 201
    if-nez v1, :cond_a

    .line 202
    .line 203
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 204
    .line 205
    iget v7, v7, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_a
    iget v7, v1, Lcom/esotericsoftware/asm/Label;->c:I

    .line 209
    .line 210
    :goto_6
    sub-int/2addr v7, v4

    .line 211
    if-lt v7, v6, :cond_c

    .line 212
    .line 213
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    move v8, v6

    .line 218
    :goto_7
    iget-object v9, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 219
    .line 220
    if-ge v8, v7, :cond_b

    .line 221
    .line 222
    iget-object v9, v9, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 223
    .line 224
    aput-byte v3, v9, v8

    .line 225
    .line 226
    add-int/lit8 v8, v8, 0x1

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_b
    iget-object v8, v9, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 230
    .line 231
    const/16 v9, -0x41

    .line 232
    .line 233
    aput-byte v9, v8, v7

    .line 234
    .line 235
    invoke-direct {p0, v6, v3, v4}, Lcom/esotericsoftware/asm/MethodWriter;->a(III)I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    iget-object v7, p0, Lcom/esotericsoftware/asm/MethodWriter;->z:[I

    .line 240
    .line 241
    iget-object v8, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 242
    .line 243
    invoke-virtual {v8, v0}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    or-int/2addr v8, p2

    .line 248
    aput v8, v7, v6

    .line 249
    .line 250
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->b()V

    .line 251
    .line 252
    .line 253
    iget-object v6, p0, Lcom/esotericsoftware/asm/MethodWriter;->B:Lcom/esotericsoftware/asm/Handler;

    .line 254
    .line 255
    invoke-static {v6, p1, v1}, Lcom/esotericsoftware/asm/Handler;->a(Lcom/esotericsoftware/asm/Handler;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;)Lcom/esotericsoftware/asm/Handler;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    iput-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->B:Lcom/esotericsoftware/asm/Handler;

    .line 260
    .line 261
    :cond_c
    iget-object p1, p1, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_d
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->B:Lcom/esotericsoftware/asm/Handler;

    .line 265
    .line 266
    iput v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->A:I

    .line 267
    .line 268
    :goto_8
    if-eqz p1, :cond_e

    .line 269
    .line 270
    iget p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->A:I

    .line 271
    .line 272
    add-int/2addr p2, v4

    .line 273
    iput p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->A:I

    .line 274
    .line 275
    iget-object p1, p1, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_e
    iput v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->s:I

    .line 279
    .line 280
    return-void

    .line 281
    :cond_f
    if-ne v0, v4, :cond_1e

    .line 282
    .line 283
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->B:Lcom/esotericsoftware/asm/Handler;

    .line 284
    .line 285
    :goto_9
    const v0, 0x7fffffff

    .line 286
    .line 287
    .line 288
    if-eqz p2, :cond_12

    .line 289
    .line 290
    iget-object v5, p2, Lcom/esotericsoftware/asm/Handler;->a:Lcom/esotericsoftware/asm/Label;

    .line 291
    .line 292
    iget-object v6, p2, Lcom/esotericsoftware/asm/Handler;->c:Lcom/esotericsoftware/asm/Label;

    .line 293
    .line 294
    iget-object v7, p2, Lcom/esotericsoftware/asm/Handler;->b:Lcom/esotericsoftware/asm/Label;

    .line 295
    .line 296
    :goto_a
    if-eq v5, v7, :cond_11

    .line 297
    .line 298
    new-instance v8, Lcom/esotericsoftware/asm/Edge;

    .line 299
    .line 300
    invoke-direct {v8}, Lcom/esotericsoftware/asm/Edge;-><init>()V

    .line 301
    .line 302
    .line 303
    iput v0, v8, Lcom/esotericsoftware/asm/Edge;->a:I

    .line 304
    .line 305
    iput-object v6, v8, Lcom/esotericsoftware/asm/Edge;->b:Lcom/esotericsoftware/asm/Label;

    .line 306
    .line 307
    iget v9, v5, Lcom/esotericsoftware/asm/Label;->a:I

    .line 308
    .line 309
    and-int/lit16 v9, v9, 0x80

    .line 310
    .line 311
    iget-object v10, v5, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 312
    .line 313
    if-nez v9, :cond_10

    .line 314
    .line 315
    iput-object v10, v8, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 316
    .line 317
    iput-object v8, v5, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 318
    .line 319
    goto :goto_b

    .line 320
    :cond_10
    iget-object v9, v10, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 321
    .line 322
    iget-object v9, v9, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 323
    .line 324
    iput-object v9, v8, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 325
    .line 326
    iget-object v9, v10, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 327
    .line 328
    iput-object v8, v9, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 329
    .line 330
    :goto_b
    iget-object v5, v5, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_11
    iget-object p2, p2, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_12
    iget p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->L:I

    .line 337
    .line 338
    if-lez p2, :cond_17

    .line 339
    .line 340
    iget-object v5, p0, Lcom/esotericsoftware/asm/MethodWriter;->N:Lcom/esotericsoftware/asm/Label;

    .line 341
    .line 342
    const-wide/16 v6, 0x1

    .line 343
    .line 344
    invoke-virtual {v5, v1, v6, v7, p2}, Lcom/esotericsoftware/asm/Label;->b(Lcom/esotericsoftware/asm/Label;JI)V

    .line 345
    .line 346
    .line 347
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->N:Lcom/esotericsoftware/asm/Label;

    .line 348
    .line 349
    move v5, v3

    .line 350
    :goto_c
    if-eqz p2, :cond_14

    .line 351
    .line 352
    iget v8, p2, Lcom/esotericsoftware/asm/Label;->a:I

    .line 353
    .line 354
    and-int/lit16 v8, v8, 0x80

    .line 355
    .line 356
    if-eqz v8, :cond_13

    .line 357
    .line 358
    iget-object v8, p2, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 359
    .line 360
    iget-object v8, v8, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 361
    .line 362
    iget-object v8, v8, Lcom/esotericsoftware/asm/Edge;->b:Lcom/esotericsoftware/asm/Label;

    .line 363
    .line 364
    iget v9, v8, Lcom/esotericsoftware/asm/Label;->a:I

    .line 365
    .line 366
    and-int/lit16 v9, v9, 0x400

    .line 367
    .line 368
    if-nez v9, :cond_13

    .line 369
    .line 370
    add-int/lit8 v5, v5, 0x1

    .line 371
    .line 372
    int-to-long v9, v5

    .line 373
    const-wide/16 v11, 0x20

    .line 374
    .line 375
    div-long/2addr v9, v11

    .line 376
    shl-long/2addr v9, v2

    .line 377
    rem-int/lit8 v11, v5, 0x20

    .line 378
    .line 379
    shl-long v11, v6, v11

    .line 380
    .line 381
    or-long/2addr v9, v11

    .line 382
    iget v11, p0, Lcom/esotericsoftware/asm/MethodWriter;->L:I

    .line 383
    .line 384
    invoke-virtual {v8, v1, v9, v10, v11}, Lcom/esotericsoftware/asm/Label;->b(Lcom/esotericsoftware/asm/Label;JI)V

    .line 385
    .line 386
    .line 387
    :cond_13
    iget-object p2, p2, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 388
    .line 389
    goto :goto_c

    .line 390
    :cond_14
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->N:Lcom/esotericsoftware/asm/Label;

    .line 391
    .line 392
    :goto_d
    if-eqz p2, :cond_17

    .line 393
    .line 394
    iget v1, p2, Lcom/esotericsoftware/asm/Label;->a:I

    .line 395
    .line 396
    and-int/lit16 v1, v1, 0x80

    .line 397
    .line 398
    if-eqz v1, :cond_16

    .line 399
    .line 400
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->N:Lcom/esotericsoftware/asm/Label;

    .line 401
    .line 402
    :goto_e
    if-eqz v1, :cond_15

    .line 403
    .line 404
    iget v2, v1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 405
    .line 406
    and-int/lit16 v2, v2, -0x801

    .line 407
    .line 408
    iput v2, v1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 409
    .line 410
    iget-object v1, v1, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 411
    .line 412
    goto :goto_e

    .line 413
    :cond_15
    iget-object v1, p2, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 414
    .line 415
    iget-object v1, v1, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 416
    .line 417
    iget-object v1, v1, Lcom/esotericsoftware/asm/Edge;->b:Lcom/esotericsoftware/asm/Label;

    .line 418
    .line 419
    const-wide/16 v5, 0x0

    .line 420
    .line 421
    iget v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->L:I

    .line 422
    .line 423
    invoke-virtual {v1, p2, v5, v6, v2}, Lcom/esotericsoftware/asm/Label;->b(Lcom/esotericsoftware/asm/Label;JI)V

    .line 424
    .line 425
    .line 426
    :cond_16
    iget-object p2, p2, Lcom/esotericsoftware/asm/Label;->i:Lcom/esotericsoftware/asm/Label;

    .line 427
    .line 428
    goto :goto_d

    .line 429
    :cond_17
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->N:Lcom/esotericsoftware/asm/Label;

    .line 430
    .line 431
    :cond_18
    if-eqz p2, :cond_1d

    .line 432
    .line 433
    iget-object v1, p2, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 434
    .line 435
    iget v2, p2, Lcom/esotericsoftware/asm/Label;->f:I

    .line 436
    .line 437
    iget v5, p2, Lcom/esotericsoftware/asm/Label;->g:I

    .line 438
    .line 439
    add-int/2addr v5, v2

    .line 440
    if-le v5, v3, :cond_19

    .line 441
    .line 442
    move v3, v5

    .line 443
    :cond_19
    iget-object v5, p2, Lcom/esotericsoftware/asm/Label;->j:Lcom/esotericsoftware/asm/Edge;

    .line 444
    .line 445
    iget p2, p2, Lcom/esotericsoftware/asm/Label;->a:I

    .line 446
    .line 447
    and-int/lit16 p2, p2, 0x80

    .line 448
    .line 449
    if-eqz p2, :cond_1a

    .line 450
    .line 451
    iget-object v5, v5, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 452
    .line 453
    :cond_1a
    move-object p2, v1

    .line 454
    :goto_f
    if-eqz v5, :cond_18

    .line 455
    .line 456
    iget-object v1, v5, Lcom/esotericsoftware/asm/Edge;->b:Lcom/esotericsoftware/asm/Label;

    .line 457
    .line 458
    iget v6, v1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 459
    .line 460
    and-int/lit8 v7, v6, 0x8

    .line 461
    .line 462
    if-nez v7, :cond_1c

    .line 463
    .line 464
    iget v7, v5, Lcom/esotericsoftware/asm/Edge;->a:I

    .line 465
    .line 466
    if-ne v7, v0, :cond_1b

    .line 467
    .line 468
    move v7, v4

    .line 469
    goto :goto_10

    .line 470
    :cond_1b
    add-int/2addr v7, v2

    .line 471
    :goto_10
    iput v7, v1, Lcom/esotericsoftware/asm/Label;->f:I

    .line 472
    .line 473
    or-int/lit8 v6, v6, 0x8

    .line 474
    .line 475
    iput v6, v1, Lcom/esotericsoftware/asm/Label;->a:I

    .line 476
    .line 477
    iput-object p2, v1, Lcom/esotericsoftware/asm/Label;->k:Lcom/esotericsoftware/asm/Label;

    .line 478
    .line 479
    move-object p2, v1

    .line 480
    :cond_1c
    iget-object v5, v5, Lcom/esotericsoftware/asm/Edge;->c:Lcom/esotericsoftware/asm/Edge;

    .line 481
    .line 482
    goto :goto_f

    .line 483
    :cond_1d
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 484
    .line 485
    .line 486
    move-result p1

    .line 487
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->s:I

    .line 488
    .line 489
    return-void

    .line 490
    :cond_1e
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->s:I

    .line 491
    .line 492
    iput p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 493
    .line 494
    return-void
.end method

.method public visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 8
    .line 9
    invoke-virtual {v0, p2, p3, p4, p5}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/Item;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget p3, p2, Lcom/esotericsoftware/asm/Item;->c:I

    .line 14
    .line 15
    iget-object p5, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p5, :cond_4

    .line 19
    .line 20
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    iget-object p5, p5, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 27
    .line 28
    invoke-virtual {p5, p1, v0, v1, p2}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    if-nez p3, :cond_1

    .line 33
    .line 34
    invoke-static {p4}, Lcom/esotericsoftware/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    iput p3, p2, Lcom/esotericsoftware/asm/Item;->c:I

    .line 39
    .line 40
    :cond_1
    iget p5, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 41
    .line 42
    const/16 v1, 0xb8

    .line 43
    .line 44
    if-ne p1, v1, :cond_2

    .line 45
    .line 46
    shr-int/lit8 v1, p3, 0x2

    .line 47
    .line 48
    sub-int/2addr p5, v1

    .line 49
    and-int/lit8 v1, p3, 0x3

    .line 50
    .line 51
    add-int/2addr p5, v1

    .line 52
    add-int/lit8 p5, p5, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    shr-int/lit8 v1, p3, 0x2

    .line 56
    .line 57
    sub-int/2addr p5, v1

    .line 58
    and-int/lit8 v1, p3, 0x3

    .line 59
    .line 60
    add-int/2addr p5, v1

    .line 61
    :goto_0
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 62
    .line 63
    if-le p5, v1, :cond_3

    .line 64
    .line 65
    iput p5, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 66
    .line 67
    :cond_3
    iput p5, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 68
    .line 69
    :cond_4
    :goto_1
    const/16 p5, 0xb9

    .line 70
    .line 71
    if-ne p1, p5, :cond_6

    .line 72
    .line 73
    if-nez p3, :cond_5

    .line 74
    .line 75
    invoke-static {p4}, Lcom/esotericsoftware/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    iput p3, p2, Lcom/esotericsoftware/asm/Item;->c:I

    .line 80
    .line 81
    :cond_5
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 82
    .line 83
    iget p1, p2, Lcom/esotericsoftware/asm/Item;->a:I

    .line 84
    .line 85
    invoke-virtual {p0, p5, p1}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    shr-int/lit8 p1, p3, 0x2

    .line 90
    .line 91
    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->a(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_6
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 96
    .line 97
    iget p2, p2, Lcom/esotericsoftware/asm/Item;->a:I

    .line 98
    .line 99
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public visitMultiANewArrayInsn(Ljava/lang/String;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 14
    .line 15
    const/16 v1, 0xc5

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 26
    .line 27
    invoke-virtual {v0, v1, p2, v2, p1}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 32
    .line 33
    rsub-int/lit8 v2, p2, 0x1

    .line 34
    .line 35
    add-int/2addr v2, v0

    .line 36
    iput v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 37
    .line 38
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 39
    .line 40
    iget p1, p1, Lcom/esotericsoftware/asm/Item;->a:I

    .line 41
    .line 42
    invoke-virtual {p0, v1, p1}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public visitParameter(Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->$:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/esotericsoftware/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->$:Lcom/esotericsoftware/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Z:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Z:I

    .line 17
    .line 18
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->$:Lcom/esotericsoftware/asm/ByteVector;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    :goto_0
    invoke-virtual {v0, p0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public visitParameterAnnotation(ILjava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 6

    .line 1
    new-instance v3, Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v3}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "Ljava/lang/Synthetic;"

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->S:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->S:I

    .line 23
    .line 24
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 36
    .line 37
    invoke-virtual {v0, p2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-virtual {v3, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p2, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 47
    .line 48
    .line 49
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 50
    .line 51
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    const/4 v5, 0x2

    .line 55
    move-object v4, v3

    .line 56
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 57
    .line 58
    .line 59
    if-eqz p3, :cond_2

    .line 60
    .line 61
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->o:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 62
    .line 63
    if-nez p2, :cond_1

    .line 64
    .line 65
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {p2}, Lcom/esotericsoftware/asm/Type;->getArgumentTypes(Ljava/lang/String;)[Lcom/esotericsoftware/asm/Type;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    array-length p2, p2

    .line 72
    new-array p2, p2, [Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 73
    .line 74
    iput-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->o:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 75
    .line 76
    :cond_1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->o:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 77
    .line 78
    aget-object p2, p0, p1

    .line 79
    .line 80
    iput-object p2, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 81
    .line 82
    aput-object v0, p0, p1

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_2
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->p:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 86
    .line 87
    if-nez p2, :cond_3

    .line 88
    .line 89
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->f:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {p2}, Lcom/esotericsoftware/asm/Type;->getArgumentTypes(Ljava/lang/String;)[Lcom/esotericsoftware/asm/Type;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    array-length p2, p2

    .line 96
    new-array p2, p2, [Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 97
    .line 98
    iput-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->p:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 99
    .line 100
    :cond_3
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->p:[Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 101
    .line 102
    aget-object p2, p0, p1

    .line 103
    .line 104
    iput-object p2, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 105
    .line 106
    aput-object v0, p0, p1

    .line 107
    .line 108
    return-object v0
.end method

.method public varargs visitTableSwitchInsn(IILcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v1, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    const/16 v2, 0xaa

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 13
    .line 14
    iget v2, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 15
    .line 16
    rem-int/lit8 v2, v2, 0x4

    .line 17
    .line 18
    rsub-int/lit8 v2, v2, 0x4

    .line 19
    .line 20
    rem-int/lit8 v2, v2, 0x4

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-virtual {v0, v3, v4, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {p3, p0, v0, v1, v2}, Lcom/esotericsoftware/asm/Label;->a(Lcom/esotericsoftware/asm/MethodWriter;Lcom/esotericsoftware/asm/ByteVector;IZ)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 40
    .line 41
    .line 42
    :goto_0
    array-length p1, p4

    .line 43
    if-ge v4, p1, :cond_0

    .line 44
    .line 45
    aget-object p1, p4, v4

    .line 46
    .line 47
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 48
    .line 49
    invoke-virtual {p1, p0, p2, v1, v2}, Lcom/esotericsoftware/asm/Label;->a(Lcom/esotericsoftware/asm/MethodWriter;Lcom/esotericsoftware/asm/ByteVector;IZ)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-direct {p0, p3, p4}, Lcom/esotericsoftware/asm/MethodWriter;->a(Lcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public visitTryCatchAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 6

    .line 1
    new-instance v3, Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v3}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(ILcom/esotericsoftware/asm/TypePath;Lcom/esotericsoftware/asm/ByteVector;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v3, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 26
    .line 27
    iget p1, v3, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 28
    .line 29
    add-int/lit8 v5, p1, -0x2

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    move-object v4, v3

    .line 33
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 34
    .line 35
    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 39
    .line 40
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->W:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 46
    .line 47
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 48
    .line 49
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->X:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 50
    .line 51
    return-object v0
.end method

.method public visitTryCatchBlock(Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->A:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->A:I

    .line 6
    .line 7
    new-instance v0, Lcom/esotericsoftware/asm/Handler;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Handler;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/esotericsoftware/asm/Handler;->a:Lcom/esotericsoftware/asm/Label;

    .line 13
    .line 14
    iput-object p2, v0, Lcom/esotericsoftware/asm/Handler;->b:Lcom/esotericsoftware/asm/Label;

    .line 15
    .line 16
    iput-object p3, v0, Lcom/esotericsoftware/asm/Handler;->c:Lcom/esotericsoftware/asm/Label;

    .line 17
    .line 18
    iput-object p4, v0, Lcom/esotericsoftware/asm/Handler;->d:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz p4, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 23
    .line 24
    invoke-virtual {p1, p4}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    iput p1, v0, Lcom/esotericsoftware/asm/Handler;->e:I

    .line 31
    .line 32
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->C:Lcom/esotericsoftware/asm/Handler;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->B:Lcom/esotericsoftware/asm/Handler;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    iput-object v0, p1, Lcom/esotericsoftware/asm/Handler;->f:Lcom/esotericsoftware/asm/Handler;

    .line 40
    .line 41
    :goto_1
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->C:Lcom/esotericsoftware/asm/Handler;

    .line 42
    .line 43
    return-void
.end method

.method public visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 6

    .line 1
    new-instance v3, Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v3}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(ILcom/esotericsoftware/asm/TypePath;Lcom/esotericsoftware/asm/ByteVector;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v3, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 26
    .line 27
    iget p1, v3, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 28
    .line 29
    add-int/lit8 v5, p1, -0x2

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    move-object v4, v3

    .line 33
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 34
    .line 35
    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->U:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 39
    .line 40
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->U:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->V:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 46
    .line 47
    iput-object p1, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 48
    .line 49
    iput-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->V:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 50
    .line 51
    return-object v0
.end method

.method public visitTypeInsn(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 24
    .line 25
    iget v1, v1, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 26
    .line 27
    iget-object v2, p0, Lcom/esotericsoftware/asm/MethodWriter;->b:Lcom/esotericsoftware/asm/ClassWriter;

    .line 28
    .line 29
    invoke-virtual {v0, p1, v1, v2, p2}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 v0, 0xbb

    .line 34
    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    iget v1, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 42
    .line 43
    if-le v0, v1, :cond_1

    .line 44
    .line 45
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 46
    .line 47
    :cond_1
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 48
    .line 49
    :cond_2
    :goto_0
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 50
    .line 51
    iget p2, p2, Lcom/esotericsoftware/asm/Item;->a:I

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public visitVarInsn(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 4
    .line 5
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Y:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->P:Lcom/esotericsoftware/asm/Label;

    .line 8
    .line 9
    const/16 v1, 0x100

    .line 10
    .line 11
    const/16 v2, 0xa9

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, Lcom/esotericsoftware/asm/Label;->h:Lcom/esotericsoftware/asm/Frame;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, p1, p2, v3, v3}, Lcom/esotericsoftware/asm/Frame;->a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-ne p1, v2, :cond_1

    .line 27
    .line 28
    iget v3, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 29
    .line 30
    or-int/2addr v3, v1

    .line 31
    iput v3, v0, Lcom/esotericsoftware/asm/Label;->a:I

    .line 32
    .line 33
    iget v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 34
    .line 35
    iput v3, v0, Lcom/esotericsoftware/asm/Label;->f:I

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/esotericsoftware/asm/MethodWriter;->e()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 42
    .line 43
    sget-object v3, Lcom/esotericsoftware/asm/Frame;->a:[I

    .line 44
    .line 45
    aget v3, v3, p1

    .line 46
    .line 47
    add-int/2addr v0, v3

    .line 48
    iget v3, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 49
    .line 50
    if-le v0, v3, :cond_2

    .line 51
    .line 52
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->R:I

    .line 53
    .line 54
    :cond_2
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->Q:I

    .line 55
    .line 56
    :cond_3
    :goto_0
    iget v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    if-eq v0, v3, :cond_6

    .line 60
    .line 61
    const/16 v0, 0x16

    .line 62
    .line 63
    if-eq p1, v0, :cond_5

    .line 64
    .line 65
    const/16 v0, 0x18

    .line 66
    .line 67
    if-eq p1, v0, :cond_5

    .line 68
    .line 69
    const/16 v0, 0x37

    .line 70
    .line 71
    if-eq p1, v0, :cond_5

    .line 72
    .line 73
    const/16 v0, 0x39

    .line 74
    .line 75
    if-ne p1, v0, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    add-int/lit8 v0, p2, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    :goto_1
    add-int/lit8 v0, p2, 0x2

    .line 82
    .line 83
    :goto_2
    iget v4, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 84
    .line 85
    if-le v0, v4, :cond_6

    .line 86
    .line 87
    iput v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->t:I

    .line 88
    .line 89
    :cond_6
    const/4 v0, 0x4

    .line 90
    const/16 v4, 0x36

    .line 91
    .line 92
    if-ge p2, v0, :cond_8

    .line 93
    .line 94
    if-eq p1, v2, :cond_8

    .line 95
    .line 96
    if-ge p1, v4, :cond_7

    .line 97
    .line 98
    add-int/lit8 v0, p1, -0x15

    .line 99
    .line 100
    shl-int/2addr v0, v3

    .line 101
    add-int/lit8 v0, v0, 0x1a

    .line 102
    .line 103
    :goto_3
    add-int/2addr v0, p2

    .line 104
    goto :goto_4

    .line 105
    :cond_7
    add-int/lit8 v0, p1, -0x36

    .line 106
    .line 107
    shl-int/2addr v0, v3

    .line 108
    add-int/lit8 v0, v0, 0x3b

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :goto_4
    iget-object p2, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 112
    .line 113
    invoke-virtual {p2, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_8
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 118
    .line 119
    if-lt p2, v1, :cond_9

    .line 120
    .line 121
    const/16 v1, 0xc4

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 128
    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_9
    invoke-virtual {v0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->a(II)Lcom/esotericsoftware/asm/ByteVector;

    .line 132
    .line 133
    .line 134
    :goto_5
    if-lt p1, v4, :cond_a

    .line 135
    .line 136
    iget p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->M:I

    .line 137
    .line 138
    if-nez p1, :cond_a

    .line 139
    .line 140
    iget p1, p0, Lcom/esotericsoftware/asm/MethodWriter;->A:I

    .line 141
    .line 142
    if-lez p1, :cond_a

    .line 143
    .line 144
    new-instance p1, Lcom/esotericsoftware/asm/Label;

    .line 145
    .line 146
    invoke-direct {p1}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodWriter;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 150
    .line 151
    .line 152
    :cond_a
    return-void
.end method
