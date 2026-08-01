.class public Lcom/esotericsoftware/asm/ClassWriter;
.super Lcom/esotericsoftware/asm/ClassVisitor;


# static fields
.field public static final COMPUTE_FRAMES:I = 0x2

.field public static final COMPUTE_MAXS:I = 0x1

.field static final a:[B


# instance fields
.field A:Lcom/esotericsoftware/asm/ByteVector;

.field B:Lcom/esotericsoftware/asm/FieldWriter;

.field C:Lcom/esotericsoftware/asm/FieldWriter;

.field D:Lcom/esotericsoftware/asm/MethodWriter;

.field E:Lcom/esotericsoftware/asm/MethodWriter;

.field private G:S

.field H:[Lcom/esotericsoftware/asm/Item;

.field I:Ljava/lang/String;

.field private J:Z

.field private K:Z

.field L:Z

.field M:Lcom/esotericsoftware/asm/ClassReader;

.field private N:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private O:Lcom/esotericsoftware/asm/AnnotationWriter;

.field b:I

.field c:I

.field final d:Lcom/esotericsoftware/asm/ByteVector;

.field e:[Lcom/esotericsoftware/asm/Item;

.field f:I

.field final g:Lcom/esotericsoftware/asm/Item;

.field final h:Lcom/esotericsoftware/asm/Item;

.field final i:Lcom/esotericsoftware/asm/Item;

.field final j:Lcom/esotericsoftware/asm/Item;

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:[I

.field private q:I

.field private r:Lcom/esotericsoftware/asm/ByteVector;

.field private s:I

.field private t:I

.field private u:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private v:Lcom/esotericsoftware/asm/AnnotationWriter;

.field private w:Lcom/esotericsoftware/asm/Attribute;

.field private x:I

.field private y:Lcom/esotericsoftware/asm/ByteVector;

.field z:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/esotericsoftware/asm/ClassWriter;->_clinit_()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xdc

    .line 5
    .line 6
    new-array v1, v0, [B

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    const-string v3, "AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKJJJJJJJJJJJJJJJJJJ"

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-int/lit8 v3, v3, -0x41

    .line 18
    .line 19
    int-to-byte v3, v3

    .line 20
    aput-byte v3, v1, v2

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sput-object v1, Lcom/esotericsoftware/asm/ClassWriter;->a:[B

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(I)V
    .locals 5

    .line 1
    const/high16 v0, 0x50000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    .line 8
    .line 9
    new-instance v1, Lcom/esotericsoftware/asm/ByteVector;

    .line 10
    .line 11
    invoke-direct {v1}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    .line 15
    .line 16
    const/16 v1, 0x100

    .line 17
    .line 18
    new-array v1, v1, [Lcom/esotericsoftware/asm/Item;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->e:[Lcom/esotericsoftware/asm/Item;

    .line 21
    .line 22
    array-length v1, v1

    .line 23
    int-to-double v1, v1

    .line 24
    const-wide/high16 v3, 0x3fe8000000000000L    # 0.75

    .line 25
    .line 26
    mul-double/2addr v1, v3

    .line 27
    double-to-int v1, v1

    .line 28
    iput v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->f:I

    .line 29
    .line 30
    new-instance v1, Lcom/esotericsoftware/asm/Item;

    .line 31
    .line 32
    invoke-direct {v1}, Lcom/esotericsoftware/asm/Item;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    .line 36
    .line 37
    new-instance v1, Lcom/esotericsoftware/asm/Item;

    .line 38
    .line 39
    invoke-direct {v1}, Lcom/esotericsoftware/asm/Item;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    .line 43
    .line 44
    new-instance v1, Lcom/esotericsoftware/asm/Item;

    .line 45
    .line 46
    invoke-direct {v1}, Lcom/esotericsoftware/asm/Item;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->i:Lcom/esotericsoftware/asm/Item;

    .line 50
    .line 51
    new-instance v1, Lcom/esotericsoftware/asm/Item;

    .line 52
    .line 53
    invoke-direct {v1}, Lcom/esotericsoftware/asm/Item;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->j:Lcom/esotericsoftware/asm/Item;

    .line 57
    .line 58
    and-int/lit8 v1, p1, 0x1

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    move v1, v0

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move v1, v2

    .line 66
    :goto_0
    iput-boolean v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->K:Z

    .line 67
    .line 68
    and-int/lit8 p1, p1, 0x2

    .line 69
    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v0, v2

    .line 74
    :goto_1
    iput-boolean v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->J:Z

    .line 75
    .line 76
    return-void
.end method

.method public constructor <init>(Lcom/esotericsoftware/asm/ClassReader;I)V
    .locals 0

    .line 77
    invoke-direct {p0, p2}, Lcom/esotericsoftware/asm/ClassWriter;-><init>(I)V

    invoke-virtual {p1, p0}, Lcom/esotericsoftware/asm/ClassReader;->a(Lcom/esotericsoftware/asm/ClassWriter;)V

    iput-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->M:Lcom/esotericsoftware/asm/ClassReader;

    return-void
.end method

.method public static synthetic _clinit_()V
    .locals 0

    .line 1
    return-void
.end method

.method private a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;
    .locals 2

    .line 221
    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassWriter;->e:[Lcom/esotericsoftware/asm/Item;

    iget v0, p1, Lcom/esotericsoftware/asm/Item;->j:I

    array-length v1, p0

    rem-int/2addr v0, v1

    aget-object p0, p0, v0

    :goto_0
    if-eqz p0, :cond_1

    iget v0, p0, Lcom/esotericsoftware/asm/Item;->b:I

    iget v1, p1, Lcom/esotericsoftware/asm/Item;->b:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p1, p0}, Lcom/esotericsoftware/asm/Item;->a(Lcom/esotericsoftware/asm/Item;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/asm/Item;->k:Lcom/esotericsoftware/asm/Item;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method private a(III)V
    .locals 0

    .line 228
    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object p0

    invoke-virtual {p0, p3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    return-void
.end method

.method private b(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;
    .locals 3

    .line 68
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-virtual {v0, v2, p1, v1, v1}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, v2, p1}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, v0, v1}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    return-object p1

    :cond_0
    return-object v0
.end method

.method private b(III)V
    .locals 0

    .line 67
    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->a(II)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object p0

    invoke-virtual {p0, p3}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    return-void
.end method

.method private b(Lcom/esotericsoftware/asm/Item;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    .line 2
    .line 3
    iget-short v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->G:S

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    iget v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->f:I

    .line 7
    .line 8
    if-le v0, v1, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->e:[Lcom/esotericsoftware/asm/Item;

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    mul-int/lit8 v1, v0, 0x2

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    new-array v2, v1, [Lcom/esotericsoftware/asm/Item;

    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    :goto_0
    if-ltz v0, :cond_1

    .line 22
    .line 23
    iget-object v3, p0, Lcom/esotericsoftware/asm/ClassWriter;->e:[Lcom/esotericsoftware/asm/Item;

    .line 24
    .line 25
    aget-object v3, v3, v0

    .line 26
    .line 27
    :goto_1
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget v4, v3, Lcom/esotericsoftware/asm/Item;->j:I

    .line 30
    .line 31
    rem-int/2addr v4, v1

    .line 32
    iget-object v5, v3, Lcom/esotericsoftware/asm/Item;->k:Lcom/esotericsoftware/asm/Item;

    .line 33
    .line 34
    aget-object v6, v2, v4

    .line 35
    .line 36
    iput-object v6, v3, Lcom/esotericsoftware/asm/Item;->k:Lcom/esotericsoftware/asm/Item;

    .line 37
    .line 38
    aput-object v3, v2, v4

    .line 39
    .line 40
    move-object v3, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput-object v2, p0, Lcom/esotericsoftware/asm/ClassWriter;->e:[Lcom/esotericsoftware/asm/Item;

    .line 46
    .line 47
    int-to-double v0, v1

    .line 48
    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    .line 49
    .line 50
    mul-double/2addr v0, v2

    .line 51
    double-to-int v0, v0

    .line 52
    iput v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->f:I

    .line 53
    .line 54
    :cond_2
    iget v0, p1, Lcom/esotericsoftware/asm/Item;->j:I

    .line 55
    .line 56
    iget-object p0, p0, Lcom/esotericsoftware/asm/ClassWriter;->e:[Lcom/esotericsoftware/asm/Item;

    .line 57
    .line 58
    array-length v1, p0

    .line 59
    rem-int/2addr v0, v1

    .line 60
    aget-object v1, p0, v0

    .line 61
    .line 62
    iput-object v1, p1, Lcom/esotericsoftware/asm/Item;->k:Lcom/esotericsoftware/asm/Item;

    .line 63
    .line 64
    aput-object p1, p0, v0

    .line 65
    .line 66
    return-void
.end method

.method private c(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;
    .locals 4

    .line 1
    iget-short p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->G:S

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    int-to-short p1, p1

    .line 6
    iput-short p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->G:S

    .line 7
    .line 8
    new-instance v0, Lcom/esotericsoftware/asm/Item;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const/16 p1, 0x10

    .line 23
    .line 24
    new-array p1, p1, [Lcom/esotericsoftware/asm/Item;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    .line 27
    .line 28
    :cond_0
    iget-short p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->G:S

    .line 29
    .line 30
    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    if-ne p1, v2, :cond_1

    .line 34
    .line 35
    array-length p1, v1

    .line 36
    mul-int/lit8 p1, p1, 0x2

    .line 37
    .line 38
    new-array p1, p1, [Lcom/esotericsoftware/asm/Item;

    .line 39
    .line 40
    array-length v2, v1

    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {v1, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    .line 46
    .line 47
    :cond_1
    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    .line 48
    .line 49
    iget-short p0, p0, Lcom/esotericsoftware/asm/ClassWriter;->G:S

    .line 50
    .line 51
    aput-object v0, p1, p0

    .line 52
    .line 53
    return-object v0
.end method


# virtual methods
.method public a(II)I
    .locals 6

    .line 222
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    const/16 v1, 0x20

    iput v1, v0, Lcom/esotericsoftware/asm/Item;->b:I

    int-to-long v2, p1

    int-to-long v4, p2

    shl-long/2addr v4, v1

    or-long v1, v2, v4

    iput-wide v1, v0, Lcom/esotericsoftware/asm/Item;->d:J

    add-int/lit8 v1, p1, 0x20

    add-int/2addr v1, p2

    const v2, 0x7fffffff

    and-int/2addr v1, v2

    iput v1, v0, Lcom/esotericsoftware/asm/Item;->j:I

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    aget-object p1, v0, p1

    iget-object p1, p1, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    aget-object p2, v0, p2

    iget-object p2, p2, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ClassWriter;->getCommonSuperClass(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Lcom/esotericsoftware/asm/Item;->c:I

    new-instance v0, Lcom/esotericsoftware/asm/Item;

    const/4 p1, 0x0

    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    invoke-direct {v0, p1, p2}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    :cond_0
    iget p0, v0, Lcom/esotericsoftware/asm/Item;->c:I

    return p0
.end method

.method public a(Ljava/lang/String;I)I
    .locals 2

    .line 215
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    const/16 v1, 0x1f

    iput v1, v0, Lcom/esotericsoftware/asm/Item;->b:I

    iput p2, v0, Lcom/esotericsoftware/asm/Item;->c:I

    iput-object p1, v0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    add-int/2addr p1, v1

    add-int/2addr p1, p2

    const p2, 0x7fffffff

    and-int/2addr p1, p2

    iput p1, v0, Lcom/esotericsoftware/asm/Item;->j:I

    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object p1

    :cond_0
    iget p0, p1, Lcom/esotericsoftware/asm/Item;->a:I

    return p0
.end method

.method public a(D)Lcom/esotericsoftware/asm/Item;
    .locals 2

    .line 216
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-virtual {v0, p1, p2}, Lcom/esotericsoftware/asm/Item;->a(D)V

    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object p1

    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    iget-wide v0, p2, Lcom/esotericsoftware/asm/Item;->d:J

    invoke-virtual {p1, v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putLong(J)Lcom/esotericsoftware/asm/ByteVector;

    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, p2, v0}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    iget p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 p2, p2, 0x2

    iput p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    :cond_0
    return-object p1
.end method

.method public a(F)Lcom/esotericsoftware/asm/Item;
    .locals 2

    .line 217
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/Item;->a(F)V

    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object p1

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    iget v0, v0, Lcom/esotericsoftware/asm/Item;->c:I

    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, v0, v1}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    :cond_0
    return-object p1
.end method

.method public a(I)Lcom/esotericsoftware/asm/Item;
    .locals 2

    .line 218
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/Item;->a(I)V

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, v0, v1}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    return-object p1

    :cond_0
    return-object v0
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/Item;
    .locals 2

    .line 219
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->j:Lcom/esotericsoftware/asm/Item;

    add-int/lit8 v1, p1, 0x14

    invoke-virtual {v0, v1, p2, p3, p4}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->j:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x4

    const/16 v1, 0xf

    if-gt p1, v0, :cond_0

    invoke-virtual {p0, p2, p3, p4}, Lcom/esotericsoftware/asm/ClassWriter;->newField(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    :goto_0
    invoke-direct {p0, v1, p1, p2}, Lcom/esotericsoftware/asm/ClassWriter;->b(III)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p2, p3, p4, p5}, Lcom/esotericsoftware/asm/ClassWriter;->newMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I

    move-result p2

    goto :goto_0

    :goto_1
    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object p3, p0, Lcom/esotericsoftware/asm/ClassWriter;->j:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, p2, p3}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    return-object p1

    :cond_1
    return-object v0
.end method

.method public a(J)Lcom/esotericsoftware/asm/Item;
    .locals 2

    .line 220
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-virtual {v0, p1, p2}, Lcom/esotericsoftware/asm/Item;->a(J)V

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->putLong(J)Lcom/esotericsoftware/asm/ByteVector;

    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, p2, v0}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    iget p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 p2, p2, 0x2

    iput p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    return-object p1

    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/Object;)Lcom/esotericsoftware/asm/Item;
    .locals 6

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(I)Lcom/esotericsoftware/asm/Item;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p1, Ljava/lang/Byte;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p1, Ljava/lang/Byte;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Byte;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(I)Lcom/esotericsoftware/asm/Item;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    instance-of v0, p1, Ljava/lang/Character;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p1, Ljava/lang/Character;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(I)Lcom/esotericsoftware/asm/Item;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    instance-of v0, p1, Ljava/lang/Short;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Short;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Short;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(I)Lcom/esotericsoftware/asm/Item;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    check-cast p1, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(I)Lcom/esotericsoftware/asm/Item;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    check-cast p1, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(F)Lcom/esotericsoftware/asm/Item;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_5
    instance-of v0, p1, Ljava/lang/Long;

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    check-cast p1, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/asm/ClassWriter;->a(J)Lcom/esotericsoftware/asm/Item;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_6
    instance-of v0, p1, Ljava/lang/Double;

    .line 107
    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    check-cast p1, Ljava/lang/Double;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/asm/ClassWriter;->a(D)Lcom/esotericsoftware/asm/Item;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :cond_7
    instance-of v0, p1, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    check-cast p1, Ljava/lang/String;

    .line 126
    .line 127
    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :cond_8
    instance-of v0, p1, Lcom/esotericsoftware/asm/Type;

    .line 133
    .line 134
    if-eqz v0, :cond_b

    .line 135
    .line 136
    check-cast p1, Lcom/esotericsoftware/asm/Type;

    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/esotericsoftware/asm/Type;->getSort()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    const/16 v1, 0xa

    .line 143
    .line 144
    if-ne v0, v1, :cond_9

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/esotericsoftware/asm/Type;->getInternalName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0

    .line 155
    :cond_9
    const/16 v1, 0xb

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-ne v0, v1, :cond_a

    .line 162
    .line 163
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :cond_a
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
    :cond_b
    instance-of v0, p1, Lcom/esotericsoftware/asm/Handle;

    .line 174
    .line 175
    if-eqz v0, :cond_c

    .line 176
    .line 177
    check-cast p1, Lcom/esotericsoftware/asm/Handle;

    .line 178
    .line 179
    iget v1, p1, Lcom/esotericsoftware/asm/Handle;->a:I

    .line 180
    .line 181
    iget-object v2, p1, Lcom/esotericsoftware/asm/Handle;->b:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v3, p1, Lcom/esotericsoftware/asm/Handle;->c:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v4, p1, Lcom/esotericsoftware/asm/Handle;->d:Ljava/lang/String;

    .line 186
    .line 187
    iget-boolean v5, p1, Lcom/esotericsoftware/asm/Handle;->e:Z

    .line 188
    .line 189
    move-object v0, p0

    .line 190
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/ClassWriter;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/Item;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 196
    .line 197
    new-instance v0, Ljava/lang/StringBuffer;

    .line 198
    .line 199
    const-string v1, "value "

    .line 200
    .line 201
    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw p0
.end method

.method public a(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;
    .locals 3

    .line 223
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-virtual {v0, v2, p1, v1, v1}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, v2, p1}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, v0, v1}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    return-object p1

    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;
    .locals 3

    .line 224
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-virtual {v0, v2, p1, p2, v1}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    move-result p2

    invoke-direct {p0, v2, p1, p2}, Lcom/esotericsoftware/asm/ClassWriter;->a(III)V

    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 v0, p2, 0x1

    iput v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, p2, v0}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    return-object p1

    :cond_0
    return-object v0
.end method

.method public varargs a(Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Handle;[Ljava/lang/Object;)Lcom/esotericsoftware/asm/Item;
    .locals 9

    .line 225
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->A:Lcom/esotericsoftware/asm/ByteVector;

    if-nez v0, :cond_0

    new-instance v0, Lcom/esotericsoftware/asm/ByteVector;

    invoke-direct {v0}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    iput-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->A:Lcom/esotericsoftware/asm/ByteVector;

    :cond_0
    iget v1, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    invoke-virtual {p3}, Lcom/esotericsoftware/asm/Handle;->hashCode()I

    move-result v2

    iget v4, p3, Lcom/esotericsoftware/asm/Handle;->a:I

    iget-object v5, p3, Lcom/esotericsoftware/asm/Handle;->b:Ljava/lang/String;

    iget-object v6, p3, Lcom/esotericsoftware/asm/Handle;->c:Ljava/lang/String;

    iget-object v7, p3, Lcom/esotericsoftware/asm/Handle;->d:Ljava/lang/String;

    invoke-virtual {p3}, Lcom/esotericsoftware/asm/Handle;->isInterface()Z

    move-result v8

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Lcom/esotericsoftware/asm/ClassWriter;->newHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    array-length p0, p4

    invoke-virtual {v0, p0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    const/4 p3, 0x0

    move v4, p3

    :goto_0
    if-ge v4, p0, :cond_1

    aget-object v5, p4, v4

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v6

    xor-int/2addr v2, v6

    invoke-virtual {v3, v5}, Lcom/esotericsoftware/asm/ClassWriter;->newConst(Ljava/lang/Object;)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object p4, v0, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    add-int/lit8 p0, p0, 0x2

    shl-int/lit8 p0, p0, 0x1

    const v4, 0x7fffffff

    and-int/2addr v2, v4

    iget-object v4, v3, Lcom/esotericsoftware/asm/ClassWriter;->e:[Lcom/esotericsoftware/asm/Item;

    array-length v5, v4

    rem-int v5, v2, v5

    aget-object v4, v4, v5

    :goto_1
    if-eqz v4, :cond_5

    iget v5, v4, Lcom/esotericsoftware/asm/Item;->b:I

    const/16 v6, 0x21

    if-ne v5, v6, :cond_3

    iget v5, v4, Lcom/esotericsoftware/asm/Item;->j:I

    if-eq v5, v2, :cond_2

    goto :goto_3

    :cond_2
    iget v5, v4, Lcom/esotericsoftware/asm/Item;->c:I

    move v6, p3

    :goto_2
    if-ge v6, p0, :cond_5

    add-int v7, v1, v6

    aget-byte v7, p4, v7

    add-int v8, v5, v6

    aget-byte v8, p4, v8

    if-eq v7, v8, :cond_4

    :cond_3
    :goto_3
    iget-object v4, v4, Lcom/esotericsoftware/asm/Item;->k:Lcom/esotericsoftware/asm/Item;

    goto :goto_1

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    if-eqz v4, :cond_6

    iget p0, v4, Lcom/esotericsoftware/asm/Item;->a:I

    iput v1, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    goto :goto_4

    :cond_6
    iget p0, v3, Lcom/esotericsoftware/asm/ClassWriter;->z:I

    add-int/lit8 p3, p0, 0x1

    iput p3, v3, Lcom/esotericsoftware/asm/ClassWriter;->z:I

    new-instance p3, Lcom/esotericsoftware/asm/Item;

    invoke-direct {p3, p0}, Lcom/esotericsoftware/asm/Item;-><init>(I)V

    invoke-virtual {p3, v1, v2}, Lcom/esotericsoftware/asm/Item;->a(II)V

    invoke-direct {v3, p3}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    :goto_4
    iget-object p3, v3, Lcom/esotericsoftware/asm/ClassWriter;->i:Lcom/esotericsoftware/asm/Item;

    invoke-virtual {p3, p1, p2, p0}, Lcom/esotericsoftware/asm/Item;->a(Ljava/lang/String;Ljava/lang/String;I)V

    iget-object p3, v3, Lcom/esotericsoftware/asm/ClassWriter;->i:Lcom/esotericsoftware/asm/Item;

    invoke-direct {v3, p3}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object p3

    if-nez p3, :cond_7

    const/16 p3, 0x12

    invoke-virtual {v3, p1, p2}, Lcom/esotericsoftware/asm/ClassWriter;->newNameType(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-direct {v3, p3, p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(III)V

    new-instance p0, Lcom/esotericsoftware/asm/Item;

    iget p1, v3, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 p2, p1, 0x1

    iput p2, v3, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object p2, v3, Lcom/esotericsoftware/asm/ClassWriter;->i:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {v3, p0}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    return-object p0

    :cond_7
    return-object p3
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;
    .locals 2

    .line 226
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->i:Lcom/esotericsoftware/asm/Item;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->i:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p2, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newNameType(Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    invoke-direct {p0, v1, p1, p2}, Lcom/esotericsoftware/asm/ClassWriter;->a(III)V

    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object p3, p0, Lcom/esotericsoftware/asm/ClassWriter;->i:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, p2, p3}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    return-object p1

    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/Item;
    .locals 1

    .line 227
    if-eqz p4, :cond_0

    const/16 p4, 0xb

    goto :goto_0

    :cond_0
    const/16 p4, 0xa

    :goto_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->i:Lcom/esotericsoftware/asm/Item;

    invoke-virtual {v0, p4, p1, p2, p3}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->i:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p2, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newNameType(Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    invoke-direct {p0, p4, p1, p2}, Lcom/esotericsoftware/asm/ClassWriter;->a(III)V

    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object p3, p0, Lcom/esotericsoftware/asm/ClassWriter;->i:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, p2, p3}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    return-object p1

    :cond_1
    return-object v0
.end method

.method public c(Ljava/lang/String;)I
    .locals 3

    .line 54
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    const/16 v1, 0x1e

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v2}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object p1

    :cond_0
    iget p0, p1, Lcom/esotericsoftware/asm/Item;->a:I

    return p0
.end method

.method public c(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;
    .locals 3

    .line 55
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-virtual {v0, v2, p1, v1, v1}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, v2, p1}, Lcom/esotericsoftware/asm/ByteVector;->b(II)Lcom/esotericsoftware/asm/ByteVector;

    new-instance p1, Lcom/esotericsoftware/asm/Item;

    iget v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->h:Lcom/esotericsoftware/asm/Item;

    invoke-direct {p1, v0, v1}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    return-object p1

    :cond_0
    return-object v0
.end method

.method public getCommonSuperClass(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x2e

    .line 10
    .line 11
    const/16 v1, 0x2f

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static {v2, v3, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v4, v3, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    return-object p2

    .line 44
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->isInterface()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_3
    :goto_0
    const-string p0, "java/lang/Object"

    .line 77
    .line 78
    return-object p0

    .line 79
    :catch_0
    move-exception p0

    .line 80
    new-instance p1, Ljava/lang/RuntimeException;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1
.end method

.method public newClass(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Lcom/esotericsoftware/asm/Item;->a:I

    .line 6
    .line 7
    return p0
.end method

.method public newConst(Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/Object;)Lcom/esotericsoftware/asm/Item;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Lcom/esotericsoftware/asm/Item;->a:I

    .line 6
    .line 7
    return p0
.end method

.method public newField(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Lcom/esotericsoftware/asm/Item;->a:I

    .line 6
    .line 7
    return p0
.end method

.method public newHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 7

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    :goto_0
    move-object v1, p0

    .line 7
    move v2, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move-object v5, p4

    .line 11
    move v6, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    invoke-virtual/range {v1 .. v6}, Lcom/esotericsoftware/asm/ClassWriter;->newHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public newHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I
    .locals 0

    .line 20
    invoke-virtual/range {p0 .. p5}, Lcom/esotericsoftware/asm/ClassWriter;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/Item;

    move-result-object p0

    iget p0, p0, Lcom/esotericsoftware/asm/Item;->a:I

    return p0
.end method

.method public varargs newInvokeDynamic(Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Handle;[Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Handle;[Ljava/lang/Object;)Lcom/esotericsoftware/asm/Item;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Lcom/esotericsoftware/asm/Item;->a:I

    .line 6
    .line 7
    return p0
.end method

.method public newMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/Item;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Lcom/esotericsoftware/asm/Item;->a:I

    .line 6
    .line 7
    return p0
.end method

.method public newMethodType(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Lcom/esotericsoftware/asm/Item;->a:I

    .line 6
    .line 7
    return p0
.end method

.method public newNameType(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Lcom/esotericsoftware/asm/Item;->a:I

    .line 6
    .line 7
    return p0
.end method

.method public newUTF8(Ljava/lang/String;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v2, p1, v1, v1}, Lcom/esotericsoftware/asm/Item;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->a(Lcom/esotericsoftware/asm/Item;)Lcom/esotericsoftware/asm/Item;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putByte(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/asm/ByteVector;->putUTF8(Ljava/lang/String;)Lcom/esotericsoftware/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/esotericsoftware/asm/Item;

    .line 26
    .line 27
    iget p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    .line 28
    .line 29
    add-int/lit8 v1, p1, 0x1

    .line 30
    .line 31
    iput v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    .line 32
    .line 33
    iget-object v1, p0, Lcom/esotericsoftware/asm/ClassWriter;->g:Lcom/esotericsoftware/asm/Item;

    .line 34
    .line 35
    invoke-direct {v0, p1, v1}, Lcom/esotericsoftware/asm/Item;-><init>(ILcom/esotericsoftware/asm/Item;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0}, Lcom/esotericsoftware/asm/ClassWriter;->b(Lcom/esotericsoftware/asm/Item;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    iget p0, v0, Lcom/esotericsoftware/asm/Item;->a:I

    .line 42
    .line 43
    return p0
.end method

.method public toByteArray()[B
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    .line 4
    .line 5
    const v6, 0xffff

    .line 6
    .line 7
    .line 8
    if-gt v0, v6, :cond_22

    .line 9
    .line 10
    iget v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->o:I

    .line 11
    .line 12
    const/4 v8, 0x2

    .line 13
    mul-int/2addr v0, v8

    .line 14
    add-int/lit8 v0, v0, 0x18

    .line 15
    .line 16
    iget-object v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->B:Lcom/esotericsoftware/asm/FieldWriter;

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    :goto_0
    if-eqz v2, :cond_0

    .line 20
    .line 21
    add-int/lit8 v10, v10, 0x1

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/esotericsoftware/asm/FieldWriter;->a()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v0, v3

    .line 28
    iget-object v2, v2, Lcom/esotericsoftware/asm/FieldVisitor;->fv:Lcom/esotericsoftware/asm/FieldVisitor;

    .line 29
    .line 30
    check-cast v2, Lcom/esotericsoftware/asm/FieldWriter;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->D:Lcom/esotericsoftware/asm/MethodWriter;

    .line 34
    .line 35
    const/4 v11, 0x0

    .line 36
    :goto_1
    if-eqz v2, :cond_1

    .line 37
    .line 38
    add-int/lit8 v11, v11, 0x1

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/esotericsoftware/asm/MethodWriter;->a()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    add-int/2addr v0, v3

    .line 45
    iget-object v2, v2, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 46
    .line 47
    check-cast v2, Lcom/esotericsoftware/asm/MethodWriter;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-object v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->A:Lcom/esotericsoftware/asm/ByteVector;

    .line 51
    .line 52
    const-string v12, "BootstrapMethods"

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget v2, v2, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x8

    .line 59
    .line 60
    add-int/2addr v0, v2

    .line 61
    invoke-virtual {v1, v12}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const/4 v2, 0x0

    .line 67
    :goto_2
    iget v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->m:I

    .line 68
    .line 69
    const-string v14, "Signature"

    .line 70
    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    add-int/lit8 v0, v0, 0x8

    .line 76
    .line 77
    invoke-virtual {v1, v14}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    :cond_3
    iget v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->q:I

    .line 81
    .line 82
    const-string v15, "SourceFile"

    .line 83
    .line 84
    if-eqz v3, :cond_4

    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    add-int/lit8 v0, v0, 0x8

    .line 89
    .line 90
    invoke-virtual {v1, v15}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    :cond_4
    iget-object v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 94
    .line 95
    const-string v4, "SourceDebugExtension"

    .line 96
    .line 97
    if-eqz v3, :cond_5

    .line 98
    .line 99
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    iget v3, v3, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 102
    .line 103
    add-int/lit8 v3, v3, 0x6

    .line 104
    .line 105
    add-int/2addr v0, v3

    .line 106
    invoke-virtual {v1, v4}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    :cond_5
    iget v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->s:I

    .line 110
    .line 111
    const-string v5, "EnclosingMethod"

    .line 112
    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    add-int/lit8 v0, v0, 0xa

    .line 118
    .line 119
    invoke-virtual {v1, v5}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    :cond_6
    iget v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->k:I

    .line 123
    .line 124
    const/high16 v16, 0x20000

    .line 125
    .line 126
    and-int v3, v3, v16

    .line 127
    .line 128
    move/from16 v17, v6

    .line 129
    .line 130
    const-string v6, "Deprecated"

    .line 131
    .line 132
    if-eqz v3, :cond_7

    .line 133
    .line 134
    add-int/lit8 v2, v2, 0x1

    .line 135
    .line 136
    add-int/lit8 v0, v0, 0x6

    .line 137
    .line 138
    invoke-virtual {v1, v6}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    :cond_7
    iget v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->k:I

    .line 142
    .line 143
    and-int/lit16 v13, v3, 0x1000

    .line 144
    .line 145
    const-string v7, "Synthetic"

    .line 146
    .line 147
    move/from16 v19, v8

    .line 148
    .line 149
    const/16 v8, 0x31

    .line 150
    .line 151
    const/high16 v20, 0x40000

    .line 152
    .line 153
    if-eqz v13, :cond_9

    .line 154
    .line 155
    iget v13, v1, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    .line 156
    .line 157
    and-int v13, v13, v17

    .line 158
    .line 159
    if-lt v13, v8, :cond_8

    .line 160
    .line 161
    and-int v3, v3, v20

    .line 162
    .line 163
    if-eqz v3, :cond_9

    .line 164
    .line 165
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 166
    .line 167
    add-int/lit8 v0, v0, 0x6

    .line 168
    .line 169
    invoke-virtual {v1, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    :cond_9
    iget-object v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

    .line 173
    .line 174
    const-string v13, "InnerClasses"

    .line 175
    .line 176
    if-eqz v3, :cond_a

    .line 177
    .line 178
    add-int/lit8 v2, v2, 0x1

    .line 179
    .line 180
    iget v3, v3, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 181
    .line 182
    add-int/lit8 v3, v3, 0x8

    .line 183
    .line 184
    add-int/2addr v0, v3

    .line 185
    invoke-virtual {v1, v13}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    :cond_a
    iget-object v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->u:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 189
    .line 190
    const-string v8, "RuntimeVisibleAnnotations"

    .line 191
    .line 192
    if-eqz v3, :cond_b

    .line 193
    .line 194
    add-int/lit8 v2, v2, 0x1

    .line 195
    .line 196
    invoke-virtual {v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    add-int/lit8 v3, v3, 0x8

    .line 201
    .line 202
    add-int/2addr v0, v3

    .line 203
    invoke-virtual {v1, v8}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    :cond_b
    iget-object v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->v:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 207
    .line 208
    const-string v9, "RuntimeInvisibleAnnotations"

    .line 209
    .line 210
    if-eqz v3, :cond_c

    .line 211
    .line 212
    add-int/lit8 v2, v2, 0x1

    .line 213
    .line 214
    invoke-virtual {v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    add-int/lit8 v3, v3, 0x8

    .line 219
    .line 220
    add-int/2addr v0, v3

    .line 221
    invoke-virtual {v1, v9}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    :cond_c
    iget-object v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->N:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 225
    .line 226
    move/from16 v21, v2

    .line 227
    .line 228
    const-string v2, "RuntimeVisibleTypeAnnotations"

    .line 229
    .line 230
    if-eqz v3, :cond_d

    .line 231
    .line 232
    add-int/lit8 v21, v21, 0x1

    .line 233
    .line 234
    invoke-virtual {v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    add-int/lit8 v3, v3, 0x8

    .line 239
    .line 240
    add-int/2addr v0, v3

    .line 241
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 242
    .line 243
    .line 244
    :cond_d
    iget-object v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->O:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 245
    .line 246
    move-object/from16 v22, v2

    .line 247
    .line 248
    const-string v2, "RuntimeInvisibleTypeAnnotations"

    .line 249
    .line 250
    if-eqz v3, :cond_e

    .line 251
    .line 252
    add-int/lit8 v21, v21, 0x1

    .line 253
    .line 254
    invoke-virtual {v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a()I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    add-int/lit8 v3, v3, 0x8

    .line 259
    .line 260
    add-int/2addr v0, v3

    .line 261
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    :cond_e
    move/from16 v29, v21

    .line 265
    .line 266
    move/from16 v21, v0

    .line 267
    .line 268
    move/from16 v0, v29

    .line 269
    .line 270
    iget-object v3, v1, Lcom/esotericsoftware/asm/ClassWriter;->w:Lcom/esotericsoftware/asm/Attribute;

    .line 271
    .line 272
    if-eqz v3, :cond_f

    .line 273
    .line 274
    invoke-virtual {v3}, Lcom/esotericsoftware/asm/Attribute;->a()I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    add-int v23, v3, v0

    .line 279
    .line 280
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->w:Lcom/esotericsoftware/asm/Attribute;

    .line 281
    .line 282
    move-object v3, v4

    .line 283
    const/4 v4, -0x1

    .line 284
    move-object/from16 v24, v5

    .line 285
    .line 286
    const/4 v5, -0x1

    .line 287
    move-object/from16 v25, v2

    .line 288
    .line 289
    const/4 v2, 0x0

    .line 290
    move-object/from16 v26, v3

    .line 291
    .line 292
    const/4 v3, 0x0

    .line 293
    move-object/from16 v28, v22

    .line 294
    .line 295
    move-object/from16 v27, v25

    .line 296
    .line 297
    move-object/from16 v22, v9

    .line 298
    .line 299
    move-object/from16 v9, v24

    .line 300
    .line 301
    move-object/from16 v24, v8

    .line 302
    .line 303
    move-object/from16 v8, v26

    .line 304
    .line 305
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/Attribute;->a(Lcom/esotericsoftware/asm/ClassWriter;[BIII)I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    add-int v21, v21, v0

    .line 310
    .line 311
    move/from16 v0, v23

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_f
    move-object/from16 v27, v2

    .line 315
    .line 316
    move-object/from16 v24, v8

    .line 317
    .line 318
    move-object/from16 v28, v22

    .line 319
    .line 320
    move-object v8, v4

    .line 321
    move-object/from16 v22, v9

    .line 322
    .line 323
    move-object v9, v5

    .line 324
    :goto_3
    iget-object v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    .line 325
    .line 326
    iget v2, v2, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 327
    .line 328
    add-int v2, v21, v2

    .line 329
    .line 330
    new-instance v3, Lcom/esotericsoftware/asm/ByteVector;

    .line 331
    .line 332
    invoke-direct {v3, v2}, Lcom/esotericsoftware/asm/ByteVector;-><init>(I)V

    .line 333
    .line 334
    .line 335
    const v2, -0x35014542    # -8346975.0f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3, v2}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    iget v4, v1, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    .line 343
    .line 344
    invoke-virtual {v2, v4}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 345
    .line 346
    .line 347
    iget v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->c:I

    .line 348
    .line 349
    invoke-virtual {v3, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    iget-object v4, v1, Lcom/esotericsoftware/asm/ClassWriter;->d:Lcom/esotericsoftware/asm/ByteVector;

    .line 354
    .line 355
    iget-object v5, v4, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 356
    .line 357
    iget v4, v4, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 358
    .line 359
    move-object/from16 v21, v13

    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    invoke-virtual {v2, v5, v13, v4}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 363
    .line 364
    .line 365
    iget v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->k:I

    .line 366
    .line 367
    and-int v4, v2, v20

    .line 368
    .line 369
    div-int/lit8 v4, v4, 0x40

    .line 370
    .line 371
    const/high16 v5, 0x60000

    .line 372
    .line 373
    or-int/2addr v4, v5

    .line 374
    not-int v4, v4

    .line 375
    and-int/2addr v2, v4

    .line 376
    invoke-virtual {v3, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    iget v4, v1, Lcom/esotericsoftware/asm/ClassWriter;->l:I

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    iget v4, v1, Lcom/esotericsoftware/asm/ClassWriter;->n:I

    .line 387
    .line 388
    invoke-virtual {v2, v4}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 389
    .line 390
    .line 391
    iget v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->o:I

    .line 392
    .line 393
    invoke-virtual {v3, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 394
    .line 395
    .line 396
    const/4 v2, 0x0

    .line 397
    :goto_4
    iget v4, v1, Lcom/esotericsoftware/asm/ClassWriter;->o:I

    .line 398
    .line 399
    if-ge v2, v4, :cond_10

    .line 400
    .line 401
    iget-object v4, v1, Lcom/esotericsoftware/asm/ClassWriter;->p:[I

    .line 402
    .line 403
    aget v4, v4, v2

    .line 404
    .line 405
    invoke-virtual {v3, v4}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 406
    .line 407
    .line 408
    add-int/lit8 v2, v2, 0x1

    .line 409
    .line 410
    goto :goto_4

    .line 411
    :cond_10
    invoke-virtual {v3, v10}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 412
    .line 413
    .line 414
    iget-object v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->B:Lcom/esotericsoftware/asm/FieldWriter;

    .line 415
    .line 416
    :goto_5
    if-eqz v2, :cond_11

    .line 417
    .line 418
    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/FieldWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 419
    .line 420
    .line 421
    iget-object v2, v2, Lcom/esotericsoftware/asm/FieldVisitor;->fv:Lcom/esotericsoftware/asm/FieldVisitor;

    .line 422
    .line 423
    check-cast v2, Lcom/esotericsoftware/asm/FieldWriter;

    .line 424
    .line 425
    goto :goto_5

    .line 426
    :cond_11
    invoke-virtual {v3, v11}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 427
    .line 428
    .line 429
    iget-object v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->D:Lcom/esotericsoftware/asm/MethodWriter;

    .line 430
    .line 431
    :goto_6
    if-eqz v2, :cond_12

    .line 432
    .line 433
    invoke-virtual {v2, v3}, Lcom/esotericsoftware/asm/MethodWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 434
    .line 435
    .line 436
    iget-object v2, v2, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 437
    .line 438
    check-cast v2, Lcom/esotericsoftware/asm/MethodWriter;

    .line 439
    .line 440
    goto :goto_6

    .line 441
    :cond_12
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 442
    .line 443
    .line 444
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->A:Lcom/esotericsoftware/asm/ByteVector;

    .line 445
    .line 446
    if-eqz v0, :cond_13

    .line 447
    .line 448
    invoke-virtual {v1, v12}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 453
    .line 454
    .line 455
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->A:Lcom/esotericsoftware/asm/ByteVector;

    .line 456
    .line 457
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 458
    .line 459
    add-int/lit8 v0, v0, 0x2

    .line 460
    .line 461
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    iget v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->z:I

    .line 466
    .line 467
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 468
    .line 469
    .line 470
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->A:Lcom/esotericsoftware/asm/ByteVector;

    .line 471
    .line 472
    iget-object v2, v0, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 473
    .line 474
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 475
    .line 476
    const/4 v13, 0x0

    .line 477
    invoke-virtual {v3, v2, v13, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 478
    .line 479
    .line 480
    :cond_13
    iget v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->m:I

    .line 481
    .line 482
    if-eqz v0, :cond_14

    .line 483
    .line 484
    invoke-virtual {v1, v14}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    move/from16 v2, v19

    .line 493
    .line 494
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    iget v4, v1, Lcom/esotericsoftware/asm/ClassWriter;->m:I

    .line 499
    .line 500
    invoke-virtual {v0, v4}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 501
    .line 502
    .line 503
    goto :goto_7

    .line 504
    :cond_14
    move/from16 v2, v19

    .line 505
    .line 506
    :goto_7
    iget v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->q:I

    .line 507
    .line 508
    if-eqz v0, :cond_15

    .line 509
    .line 510
    invoke-virtual {v1, v15}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    iget v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->q:I

    .line 523
    .line 524
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 525
    .line 526
    .line 527
    :cond_15
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 528
    .line 529
    if-eqz v0, :cond_16

    .line 530
    .line 531
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 532
    .line 533
    invoke-virtual {v1, v8}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    invoke-virtual {v3, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    invoke-virtual {v2, v0}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 542
    .line 543
    .line 544
    iget-object v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 545
    .line 546
    iget-object v2, v2, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 547
    .line 548
    const/4 v13, 0x0

    .line 549
    invoke-virtual {v3, v2, v13, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 550
    .line 551
    .line 552
    :cond_16
    iget v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->s:I

    .line 553
    .line 554
    const/4 v8, 0x4

    .line 555
    if-eqz v0, :cond_17

    .line 556
    .line 557
    invoke-virtual {v1, v9}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v0, v8}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 566
    .line 567
    .line 568
    iget v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->s:I

    .line 569
    .line 570
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    iget v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->t:I

    .line 575
    .line 576
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 577
    .line 578
    .line 579
    :cond_17
    iget v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->k:I

    .line 580
    .line 581
    and-int v0, v0, v16

    .line 582
    .line 583
    if-eqz v0, :cond_18

    .line 584
    .line 585
    invoke-virtual {v1, v6}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    const/4 v13, 0x0

    .line 594
    invoke-virtual {v0, v13}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 595
    .line 596
    .line 597
    :cond_18
    iget v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->k:I

    .line 598
    .line 599
    and-int/lit16 v2, v0, 0x1000

    .line 600
    .line 601
    if-eqz v2, :cond_1a

    .line 602
    .line 603
    iget v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    .line 604
    .line 605
    and-int v2, v2, v17

    .line 606
    .line 607
    const/16 v4, 0x31

    .line 608
    .line 609
    if-lt v2, v4, :cond_19

    .line 610
    .line 611
    and-int v0, v0, v20

    .line 612
    .line 613
    if-eqz v0, :cond_1a

    .line 614
    .line 615
    :cond_19
    invoke-virtual {v1, v7}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 616
    .line 617
    .line 618
    move-result v0

    .line 619
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    const/4 v13, 0x0

    .line 624
    invoke-virtual {v0, v13}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 625
    .line 626
    .line 627
    :cond_1a
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

    .line 628
    .line 629
    if-eqz v0, :cond_1b

    .line 630
    .line 631
    move-object/from16 v0, v21

    .line 632
    .line 633
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 634
    .line 635
    .line 636
    move-result v0

    .line 637
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 638
    .line 639
    .line 640
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

    .line 641
    .line 642
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 643
    .line 644
    const/16 v19, 0x2

    .line 645
    .line 646
    add-int/lit8 v0, v0, 0x2

    .line 647
    .line 648
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putInt(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    iget v2, v1, Lcom/esotericsoftware/asm/ClassWriter;->x:I

    .line 653
    .line 654
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 655
    .line 656
    .line 657
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

    .line 658
    .line 659
    iget-object v2, v0, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 660
    .line 661
    iget v0, v0, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 662
    .line 663
    const/4 v13, 0x0

    .line 664
    invoke-virtual {v3, v2, v13, v0}, Lcom/esotericsoftware/asm/ByteVector;->putByteArray([BII)Lcom/esotericsoftware/asm/ByteVector;

    .line 665
    .line 666
    .line 667
    :cond_1b
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->u:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 668
    .line 669
    if-eqz v0, :cond_1c

    .line 670
    .line 671
    move-object/from16 v0, v24

    .line 672
    .line 673
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 674
    .line 675
    .line 676
    move-result v0

    .line 677
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 678
    .line 679
    .line 680
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->u:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 681
    .line 682
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 683
    .line 684
    .line 685
    :cond_1c
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->v:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 686
    .line 687
    if-eqz v0, :cond_1d

    .line 688
    .line 689
    move-object/from16 v0, v22

    .line 690
    .line 691
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 692
    .line 693
    .line 694
    move-result v0

    .line 695
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 696
    .line 697
    .line 698
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->v:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 699
    .line 700
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 701
    .line 702
    .line 703
    :cond_1d
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->N:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 704
    .line 705
    if-eqz v0, :cond_1e

    .line 706
    .line 707
    move-object/from16 v0, v28

    .line 708
    .line 709
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 714
    .line 715
    .line 716
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->N:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 717
    .line 718
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 719
    .line 720
    .line 721
    :cond_1e
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->O:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 722
    .line 723
    if-eqz v0, :cond_1f

    .line 724
    .line 725
    move-object/from16 v0, v27

    .line 726
    .line 727
    invoke-virtual {v1, v0}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    invoke-virtual {v3, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 732
    .line 733
    .line 734
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->O:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 735
    .line 736
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/asm/AnnotationWriter;->a(Lcom/esotericsoftware/asm/ByteVector;)V

    .line 737
    .line 738
    .line 739
    :cond_1f
    iget-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->w:Lcom/esotericsoftware/asm/Attribute;

    .line 740
    .line 741
    if-eqz v0, :cond_20

    .line 742
    .line 743
    const/4 v4, -0x1

    .line 744
    const/4 v5, -0x1

    .line 745
    const/4 v2, 0x0

    .line 746
    move-object v6, v3

    .line 747
    const/4 v3, 0x0

    .line 748
    invoke-virtual/range {v0 .. v6}, Lcom/esotericsoftware/asm/Attribute;->a(Lcom/esotericsoftware/asm/ClassWriter;[BIIILcom/esotericsoftware/asm/ByteVector;)V

    .line 749
    .line 750
    .line 751
    goto :goto_8

    .line 752
    :cond_20
    move-object v6, v3

    .line 753
    :goto_8
    iget-boolean v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->L:Z

    .line 754
    .line 755
    if-eqz v0, :cond_21

    .line 756
    .line 757
    const/4 v0, 0x0

    .line 758
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->u:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 759
    .line 760
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->v:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 761
    .line 762
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->w:Lcom/esotericsoftware/asm/Attribute;

    .line 763
    .line 764
    const/4 v13, 0x0

    .line 765
    iput v13, v1, Lcom/esotericsoftware/asm/ClassWriter;->x:I

    .line 766
    .line 767
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

    .line 768
    .line 769
    iput v13, v1, Lcom/esotericsoftware/asm/ClassWriter;->z:I

    .line 770
    .line 771
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->A:Lcom/esotericsoftware/asm/ByteVector;

    .line 772
    .line 773
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->B:Lcom/esotericsoftware/asm/FieldWriter;

    .line 774
    .line 775
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->C:Lcom/esotericsoftware/asm/FieldWriter;

    .line 776
    .line 777
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->D:Lcom/esotericsoftware/asm/MethodWriter;

    .line 778
    .line 779
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->E:Lcom/esotericsoftware/asm/MethodWriter;

    .line 780
    .line 781
    iput-boolean v13, v1, Lcom/esotericsoftware/asm/ClassWriter;->K:Z

    .line 782
    .line 783
    const/4 v0, 0x1

    .line 784
    iput-boolean v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->J:Z

    .line 785
    .line 786
    iput-boolean v13, v1, Lcom/esotericsoftware/asm/ClassWriter;->L:Z

    .line 787
    .line 788
    new-instance v0, Lcom/esotericsoftware/asm/ClassReader;

    .line 789
    .line 790
    iget-object v2, v6, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 791
    .line 792
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/ClassReader;-><init>([B)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v0, v1, v8}, Lcom/esotericsoftware/asm/ClassReader;->accept(Lcom/esotericsoftware/asm/ClassVisitor;I)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/ClassWriter;->toByteArray()[B

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    return-object v0

    .line 803
    :cond_21
    iget-object v0, v6, Lcom/esotericsoftware/asm/ByteVector;->a:[B

    .line 804
    .line 805
    return-object v0

    .line 806
    :cond_22
    const-string v0, "Class file too large!"

    .line 807
    .line 808
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    const/16 v18, 0x0

    .line 812
    .line 813
    return-object v18
.end method

.method public final visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->b:I

    .line 2
    .line 3
    iput p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->k:I

    .line 4
    .line 5
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->l:I

    .line 10
    .line 11
    iput-object p3, p0, Lcom/esotericsoftware/asm/ClassWriter;->I:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p4, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p4}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->m:I

    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    if-nez p5, :cond_1

    .line 23
    .line 24
    move p2, p1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0, p5}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    :goto_0
    iput p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->n:I

    .line 31
    .line 32
    if-eqz p6, :cond_2

    .line 33
    .line 34
    array-length p2, p6

    .line 35
    if-lez p2, :cond_2

    .line 36
    .line 37
    array-length p2, p6

    .line 38
    iput p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->o:I

    .line 39
    .line 40
    new-array p2, p2, [I

    .line 41
    .line 42
    iput-object p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->p:[I

    .line 43
    .line 44
    :goto_1
    iget p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->o:I

    .line 45
    .line 46
    if-ge p1, p2, :cond_2

    .line 47
    .line 48
    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->p:[I

    .line 49
    .line 50
    aget-object p3, p6, p1

    .line 51
    .line 52
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    aput p3, p2, p1

    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    return-void
.end method

.method public final visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 6

    .line 1
    new-instance v3, Lcom/esotericsoftware/asm/ByteVector;

    .line 2
    .line 3
    invoke-direct {v3}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {v3, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    const/4 v5, 0x2

    .line 22
    move-object v4, v3

    .line 23
    move-object v1, p0

    .line 24
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 25
    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    iget-object p0, v1, Lcom/esotericsoftware/asm/ClassWriter;->u:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 30
    .line 31
    iput-object p0, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 32
    .line 33
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->u:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    iget-object p0, v1, Lcom/esotericsoftware/asm/ClassWriter;->v:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 37
    .line 38
    iput-object p0, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 39
    .line 40
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->v:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 41
    .line 42
    return-object v0
.end method

.method public final visitAttribute(Lcom/esotericsoftware/asm/Attribute;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->w:Lcom/esotericsoftware/asm/Attribute;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/esotericsoftware/asm/Attribute;->a:Lcom/esotericsoftware/asm/Attribute;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->w:Lcom/esotericsoftware/asm/Attribute;

    .line 6
    .line 7
    return-void
.end method

.method public final visitEnd()V
    .locals 0

    .line 1
    return-void
.end method

.method public final visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/esotericsoftware/asm/FieldVisitor;
    .locals 7

    .line 1
    new-instance v0, Lcom/esotericsoftware/asm/FieldWriter;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    move-object v6, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/esotericsoftware/asm/FieldWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

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
    iput-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;)Lcom/esotericsoftware/asm/Item;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget v0, p1, Lcom/esotericsoftware/asm/Item;->c:I

    .line 17
    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    iget v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->x:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    iput v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->x:I

    .line 25
    .line 26
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

    .line 27
    .line 28
    iget v1, p1, Lcom/esotericsoftware/asm/Item;->a:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    if-nez p2, :cond_1

    .line 37
    .line 38
    move p2, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    :goto_0
    invoke-virtual {v0, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 45
    .line 46
    .line 47
    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

    .line 48
    .line 49
    if-nez p3, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    :goto_1
    invoke-virtual {p2, v1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, Lcom/esotericsoftware/asm/ClassWriter;->y:Lcom/esotericsoftware/asm/ByteVector;

    .line 60
    .line 61
    invoke-virtual {p2, p4}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 62
    .line 63
    .line 64
    iget p0, p0, Lcom/esotericsoftware/asm/ClassWriter;->x:I

    .line 65
    .line 66
    iput p0, p1, Lcom/esotericsoftware/asm/Item;->c:I

    .line 67
    .line 68
    :cond_3
    return-void
.end method

.method public final visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;
    .locals 9

    .line 1
    new-instance v0, Lcom/esotericsoftware/asm/MethodWriter;

    .line 2
    .line 3
    iget-boolean v7, p0, Lcom/esotericsoftware/asm/ClassWriter;->K:Z

    .line 4
    .line 5
    iget-boolean v8, p0, Lcom/esotericsoftware/asm/ClassWriter;->J:Z

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    move v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move-object v6, p5

    .line 13
    invoke-direct/range {v0 .. v8}, Lcom/esotericsoftware/asm/MethodWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZZ)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newClass(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->s:I

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p2, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newNameType(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->t:I

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final visitSource(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->q:I

    .line 8
    .line 9
    :cond_0
    if-eqz p2, :cond_1

    .line 10
    .line 11
    new-instance p1, Lcom/esotericsoftware/asm/ByteVector;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/esotericsoftware/asm/ByteVector;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    const v1, 0x7fffffff

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2, v0, v1}, Lcom/esotericsoftware/asm/ByteVector;->c(Ljava/lang/String;II)Lcom/esotericsoftware/asm/ByteVector;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/esotericsoftware/asm/ClassWriter;->r:Lcom/esotericsoftware/asm/ByteVector;

    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
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
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/asm/ClassWriter;->newUTF8(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {v3, p1}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/asm/ByteVector;->putShort(I)Lcom/esotericsoftware/asm/ByteVector;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 22
    .line 23
    iget p1, v3, Lcom/esotericsoftware/asm/ByteVector;->b:I

    .line 24
    .line 25
    add-int/lit8 v5, p1, -0x2

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    move-object v4, v3

    .line 29
    move-object v1, p0

    .line 30
    invoke-direct/range {v0 .. v5}, Lcom/esotericsoftware/asm/AnnotationWriter;-><init>(Lcom/esotericsoftware/asm/ClassWriter;ZLcom/esotericsoftware/asm/ByteVector;Lcom/esotericsoftware/asm/ByteVector;I)V

    .line 31
    .line 32
    .line 33
    if-eqz p4, :cond_0

    .line 34
    .line 35
    iget-object p0, v1, Lcom/esotericsoftware/asm/ClassWriter;->N:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 36
    .line 37
    iput-object p0, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 38
    .line 39
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->N:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_0
    iget-object p0, v1, Lcom/esotericsoftware/asm/ClassWriter;->O:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 43
    .line 44
    iput-object p0, v0, Lcom/esotericsoftware/asm/AnnotationWriter;->g:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 45
    .line 46
    iput-object v0, v1, Lcom/esotericsoftware/asm/ClassWriter;->O:Lcom/esotericsoftware/asm/AnnotationWriter;

    .line 47
    .line 48
    return-object v0
.end method
