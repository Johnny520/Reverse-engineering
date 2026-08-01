.class public Lnet/bytebuddy/utility/RandomString;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final DEFAULT_LENGTH:I = 0x8

.field private static final KEY_BITS:I

.field private static final SYMBOL:[C


# instance fields
.field private final length:I

.field private final random:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x30

    .line 7
    .line 8
    :goto_0
    const/16 v2, 0x39

    .line 9
    .line 10
    if-gt v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    int-to-char v1, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/16 v1, 0x61

    .line 20
    .line 21
    :goto_1
    const/16 v2, 0x7a

    .line 22
    .line 23
    if-gt v1, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    int-to-char v1, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/16 v1, 0x41

    .line 33
    .line 34
    :goto_2
    const/16 v2, 0x5a

    .line 35
    .line 36
    if-gt v1, v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    int-to-char v1, v1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lnet/bytebuddy/utility/RandomString;->SYMBOL:[C

    .line 54
    .line 55
    array-length v1, v0

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    rsub-int/lit8 v1, v1, 0x20

    .line 61
    .line 62
    array-length v0, v0

    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-ne v0, v1, :cond_3

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    const/4 v0, 0x1

    .line 72
    :goto_3
    sub-int/2addr v1, v0

    .line 73
    sput v1, Lnet/bytebuddy/utility/RandomString;->KEY_BITS:I

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x8

    .line 19
    invoke-direct {p0, v0}, Lnet/bytebuddy/utility/RandomString;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 18
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/utility/RandomString;-><init>(ILjava/util/Random;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/Random;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lnet/bytebuddy/utility/RandomString;->length:I

    .line 7
    .line 8
    iput-object p2, p0, Lnet/bytebuddy/utility/RandomString;->random:Ljava/util/Random;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "A random string\'s length cannot be zero or negative"

    .line 12
    .line 13
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public static hashOf(I)Ljava/lang/String;
    .locals 8

    .line 1
    sget v0, Lnet/bytebuddy/utility/RandomString;->KEY_BITS:I

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    div-int v2, v1, v0

    .line 6
    .line 7
    rem-int v0, v1, v0

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v0, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    :goto_0
    add-int/2addr v2, v0

    .line 16
    new-array v0, v2, [C

    .line 17
    .line 18
    :goto_1
    if-ge v3, v2, :cond_1

    .line 19
    .line 20
    sget-object v4, Lnet/bytebuddy/utility/RandomString;->SYMBOL:[C

    .line 21
    .line 22
    sget v5, Lnet/bytebuddy/utility/RandomString;->KEY_BITS:I

    .line 23
    .line 24
    mul-int v6, v3, v5

    .line 25
    .line 26
    ushr-int v6, p0, v6

    .line 27
    .line 28
    const/4 v7, -0x1

    .line 29
    rsub-int/lit8 v5, v5, 0x20

    .line 30
    .line 31
    ushr-int v5, v7, v5

    .line 32
    .line 33
    and-int/2addr v5, v6

    .line 34
    aget-char v4, v4, v5

    .line 35
    .line 36
    aput-char v4, v0, v3

    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public static hashOf(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    xor-int/2addr p0, v0

    .line 48
    :goto_0
    invoke-static {p0}, Lnet/bytebuddy/utility/RandomString;->hashOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static make()Ljava/lang/String;
    .locals 1

    const/16 v0, 0x8

    .line 11
    invoke-static {v0}, Lnet/bytebuddy/utility/RandomString;->make(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static make(I)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/utility/RandomString;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/RandomString;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lnet/bytebuddy/utility/RandomString;->nextString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public nextString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lnet/bytebuddy/utility/RandomString;->length:I

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    iget v2, p0, Lnet/bytebuddy/utility/RandomString;->length:I

    .line 7
    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    sget-object v2, Lnet/bytebuddy/utility/RandomString;->SYMBOL:[C

    .line 11
    .line 12
    iget-object v3, p0, Lnet/bytebuddy/utility/RandomString;->random:Ljava/util/Random;

    .line 13
    .line 14
    array-length v4, v2

    .line 15
    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    aget-char v2, v2, v3

    .line 20
    .line 21
    aput-char v2, v0, v1

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 29
    .line 30
    .line 31
    return-object p0
.end method
