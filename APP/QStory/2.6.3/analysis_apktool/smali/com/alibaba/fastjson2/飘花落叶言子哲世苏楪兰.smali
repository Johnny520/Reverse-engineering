.class public abstract Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final synthetic 飘花落叶言子世苏哲楪兰:I

.field public static final 飘花落叶言子世苏楪兰哲:J

.field public static final 飘花落叶言子世苏楪哲兰:J


# instance fields
.field public final 飘花落叶言子世楪兰哲苏:B

.field public 飘花落叶言子世楪兰苏哲:Ljava/lang/String;

.field public 飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

.field public 飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

.field public 飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

.field public 飘花落叶言子世楪苏哲兰:I

.field public final 飘花落叶言子楪兰世哲苏:Z

.field public final 飘花落叶言子楪兰世苏哲:Z

.field public 飘花落叶言子楪兰哲世苏:Z

.field public 飘花落叶言子楪兰哲苏世:I

.field public final 飘花落叶言子楪兰苏世哲:C

.field public final 飘花落叶言子楪兰苏哲世:I

.field public final 飘花落叶言子楪哲兰世苏:Z

.field public final 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    or-long/2addr v0, v2

    .line 10
    sput-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏楪哲兰:J

    .line 11
    .line 12
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 13
    .line 14
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 15
    .line 16
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 17
    .line 18
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 19
    .line 20
    or-long/2addr v0, v2

    .line 21
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 22
    .line 23
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 24
    .line 25
    or-long/2addr v0, v2

    .line 26
    sput-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏楪兰哲:J

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;ZLjava/nio/charset/Charset;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    if-ne p3, v2, :cond_0

    .line 15
    .line 16
    move v2, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, v0

    .line 19
    :goto_0
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰世苏:Z

    .line 20
    .line 21
    if-nez p2, :cond_1

    .line 22
    .line 23
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    if-ne p3, v2, :cond_1

    .line 26
    .line 27
    move p3, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move p3, v0

    .line 30
    :goto_1
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰苏世:Z

    .line 31
    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    if-nez p2, :cond_2

    .line 35
    .line 36
    iget-wide p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 37
    .line 38
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->UseSingleQuotes:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 39
    .line 40
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 41
    .line 42
    and-long/2addr p2, v4

    .line 43
    cmp-long p2, p2, v2

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    move p2, v1

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move p2, v0

    .line 50
    :goto_2
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世哲苏:Z

    .line 51
    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    const/16 p2, 0x27

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    const/16 p2, 0x22

    .line 58
    .line 59
    :goto_3
    iput-char p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 60
    .line 61
    iget-wide p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 62
    .line 63
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->LargeObject:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 64
    .line 65
    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 66
    .line 67
    and-long/2addr v4, p1

    .line 68
    cmp-long p3, v4, v2

    .line 69
    .line 70
    if-eqz p3, :cond_4

    .line 71
    .line 72
    const/high16 p3, 0x40000000    # 2.0f

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const/high16 p3, 0x4000000

    .line 76
    .line 77
    :goto_4
    iput p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏哲世:I

    .line 78
    .line 79
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->PrettyFormatWith4Space:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 80
    .line 81
    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 82
    .line 83
    and-long/2addr v4, p1

    .line 84
    cmp-long p3, v4, v2

    .line 85
    .line 86
    if-eqz p3, :cond_5

    .line 87
    .line 88
    const/4 p1, 0x4

    .line 89
    iput-byte p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 90
    .line 91
    return-void

    .line 92
    :cond_5
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->PrettyFormatWith2Space:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 93
    .line 94
    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 95
    .line 96
    and-long/2addr v4, p1

    .line 97
    cmp-long p3, v4, v2

    .line 98
    .line 99
    if-eqz p3, :cond_6

    .line 100
    .line 101
    const/4 p1, 0x2

    .line 102
    iput-byte p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 103
    .line 104
    return-void

    .line 105
    :cond_6
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->PrettyFormat:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 106
    .line 107
    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 108
    .line 109
    and-long/2addr p1, v4

    .line 110
    cmp-long p1, p1, v2

    .line 111
    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    iput-byte v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 115
    .line 116
    return-void

    .line 117
    :cond_7
    iput-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 118
    .line 119
    return-void
.end method

.method public static 飘花落叶言子世楪哲苏兰(Ljava/math/BigInteger;J)Z
    .locals 4

    .line 1
    const-wide/16 v0, 0x100

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-wide/16 v0, 0x20

    .line 11
    .line 12
    and-long/2addr p1, v0

    .line 13
    cmp-long p1, p1, v2

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏楪哲兰:Ljava/math/BigInteger;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-ltz p1, :cond_1

    .line 24
    .line 25
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏楪兰哲:Ljava/math/BigInteger;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-gtz p0, :cond_1

    .line 32
    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_1
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method public static 飘花落叶言子世楪苏哲兰(Ljava/math/BigDecimal;J)Z
    .locals 6

    .line 1
    const-wide/16 v0, 0x100

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-nez v0, :cond_5

    .line 10
    .line 11
    const-wide/16 v4, 0x20

    .line 12
    .line 13
    and-long/2addr p1, v4

    .line 14
    cmp-long p1, p1, v2

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    if-eqz p1, :cond_4

    .line 18
    .line 19
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/math/BigDecimal;->precision()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/16 v0, 0x10

    .line 26
    .line 27
    if-lt p1, v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/math/BigDecimal;->unscaledValue()Ljava/math/BigInteger;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏楪哲兰:Ljava/math/BigInteger;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-ltz v0, :cond_0

    .line 40
    .line 41
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏楪兰哲:Ljava/math/BigInteger;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-gtz p1, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move p1, p2

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    move p1, v1

    .line 53
    :goto_1
    if-nez p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/math/BigDecimal;->scale()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    :try_start_0
    invoke-virtual {p0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 62
    .line 63
    .line 64
    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-nez p0, :cond_2

    .line 74
    .line 75
    move p1, v1

    .line 76
    goto :goto_2

    .line 77
    :catch_0
    :cond_2
    move p1, p2

    .line 78
    :cond_3
    :goto_2
    if-nez p1, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move v1, p2

    .line 82
    :cond_5
    :goto_3
    return v1
.end method

.method public static 飘花落叶言子楪兰苏哲世(JJ)Z
    .locals 4

    .line 1
    const-wide v0, 0x400000100L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr v0, p2

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-wide/16 v0, 0x20

    .line 14
    .line 15
    and-long/2addr p2, v0

    .line 16
    cmp-long p2, p2, v2

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    sget-object p2, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 21
    .line 22
    const-wide p2, -0x1fffffffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long p2, p0, p2

    .line 28
    .line 29
    if-ltz p2, :cond_1

    .line 30
    .line 31
    const-wide p2, 0x1fffffffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    cmp-long p0, p0, p2

    .line 37
    .line 38
    if-gtz p0, :cond_1

    .line 39
    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_1
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public static 飘花落叶言子楪苏兰世哲(I)Ljava/lang/IllegalArgumentException;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    const-string v1, "Only 4 digits numbers are supported. Provided: "

    .line 4
    .line 5
    invoke-static {p0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static varargs 飘花落叶言子苏世楪兰哲([Lcom/alibaba/fastjson2/JSONWriter$Feature;)Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;
    .locals 5

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 4
    .line 5
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;-><init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 8
    .line 9
    .line 10
    sget p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    if-ne p0, v1, :cond_1

    .line 15
    .line 16
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Field;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    sget-boolean p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    sget-boolean p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏世兰:Z

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏楪世兰;

    .line 29
    .line 30
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰苏楪;

    .line 35
    .line 36
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 41
    .line 42
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->OptimizedForAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 43
    .line 44
    iget-wide v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 45
    .line 46
    and-long/2addr v1, v3

    .line 47
    const-wide/16 v3, 0x0

    .line 48
    .line 49
    cmp-long p0, v1, v3

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;

    .line 54
    .line 55
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_2
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Field;

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 64
    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 68
    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏楪兰世;

    .line 72
    .line 73
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;

    .line 78
    .line 79
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 80
    .line 81
    .line 82
    return-object p0
.end method

.method public static 飘花落叶言子苏世楪哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;
    .locals 4

    .line 1
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Field;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏世兰:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏楪世兰;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰苏楪;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 32
    .line 33
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->OptimizedForAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 34
    .line 35
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 36
    .line 37
    and-long/2addr v0, v2

    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    cmp-long v0, v0, v2

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Field;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏楪兰世;

    .line 63
    .line 64
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_3
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;

    .line 69
    .line 70
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public static 飘花落叶言子苏楪兰哲世()Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;-><init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;)V

    .line 6
    .line 7
    .line 8
    sget v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Field;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget-boolean v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    sget-boolean v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏世兰:Z

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子哲苏楪世兰;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰苏楪;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_1
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->OptimizedForAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 39
    .line 40
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    cmp-long v1, v1, v1

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_2
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Field;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子哲苏楪兰世;

    .line 67
    .line 68
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 69
    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;

    .line 73
    .line 74
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 75
    .line 76
    .line 77
    return-object v1
.end method


# virtual methods
.method public final 飘花落叶言子世兰哲苏楪(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    or-long/2addr p3, v0

    .line 6
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 7
    .line 8
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 9
    .line 10
    and-long/2addr v0, p3

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    if-nez p1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, p2, Ljava/lang/Class;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Class;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    instance-of v1, p2, Ljava/lang/reflect/ParameterizedType;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    instance-of v1, p2, Ljava/lang/Class;

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    check-cast p2, Ljava/lang/Class;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    const/4 p2, 0x0

    .line 50
    :goto_0
    if-ne v0, p2, :cond_4

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_4
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteHashMapArrayListClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 54
    .line 55
    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 56
    .line 57
    and-long/2addr v4, p3

    .line 58
    cmp-long v1, v4, v2

    .line 59
    .line 60
    if-eqz v1, :cond_6

    .line 61
    .line 62
    const-class v1, Ljava/util/HashMap;

    .line 63
    .line 64
    if-ne v0, v1, :cond_5

    .line 65
    .line 66
    if-eqz p2, :cond_7

    .line 67
    .line 68
    const-class v0, Ljava/lang/Object;

    .line 69
    .line 70
    if-eq p2, v0, :cond_7

    .line 71
    .line 72
    const-class v0, Ljava/util/Map;

    .line 73
    .line 74
    if-eq p2, v0, :cond_7

    .line 75
    .line 76
    const-class v0, Ljava/util/AbstractMap;

    .line 77
    .line 78
    if-ne p2, v0, :cond_6

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    const-class p2, Ljava/util/ArrayList;

    .line 82
    .line 83
    if-ne v0, p2, :cond_6

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_6
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteRootClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 87
    .line 88
    iget-wide v0, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 89
    .line 90
    and-long p2, p3, v0

    .line 91
    .line 92
    cmp-long p2, p2, v2

    .line 93
    .line 94
    if-eqz p2, :cond_8

    .line 95
    .line 96
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 97
    .line 98
    if-eq p1, p0, :cond_7

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_7
    :goto_1
    const/4 p0, 0x0

    .line 102
    return p0

    .line 103
    :cond_8
    :goto_2
    const/4 p0, 0x1

    .line 104
    return p0
.end method

.method public final 飘花落叶言子世兰楪哲苏(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v2, v0

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long v2, v2, v4

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_9

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    instance-of v6, p2, Ljava/lang/Class;

    .line 26
    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Class;

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    instance-of v6, p2, Ljava/lang/reflect/GenericArrayType;

    .line 33
    .line 34
    if-eqz v6, :cond_4

    .line 35
    .line 36
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    instance-of v6, p2, Ljava/lang/reflect/ParameterizedType;

    .line 43
    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 47
    .line 48
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_3

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v6, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    move p2, v3

    .line 68
    :goto_0
    if-eqz p2, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    instance-of v6, p2, Ljava/lang/reflect/ParameterizedType;

    .line 72
    .line 73
    if-eqz v6, :cond_5

    .line 74
    .line 75
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 76
    .line 77
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    instance-of v6, p2, Ljava/lang/Class;

    .line 82
    .line 83
    if-eqz v6, :cond_5

    .line 84
    .line 85
    check-cast p2, Ljava/lang/Class;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    const/4 p2, 0x0

    .line 89
    :goto_1
    if-ne v2, p2, :cond_6

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteHashMapArrayListClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 93
    .line 94
    iget-wide v6, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 95
    .line 96
    and-long/2addr v6, v0

    .line 97
    cmp-long p2, v6, v4

    .line 98
    .line 99
    if-eqz p2, :cond_7

    .line 100
    .line 101
    const-class p2, Ljava/util/HashMap;

    .line 102
    .line 103
    if-eq v2, p2, :cond_9

    .line 104
    .line 105
    const-class p2, Ljava/util/ArrayList;

    .line 106
    .line 107
    if-ne v2, p2, :cond_7

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_7
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteRootClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 111
    .line 112
    iget-wide v6, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 113
    .line 114
    and-long/2addr v0, v6

    .line 115
    cmp-long p2, v0, v4

    .line 116
    .line 117
    if-eqz p2, :cond_8

    .line 118
    .line 119
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 120
    .line 121
    if-eq p1, p0, :cond_9

    .line 122
    .line 123
    :cond_8
    const/4 p0, 0x1

    .line 124
    return p0

    .line 125
    :cond_9
    :goto_2
    return v3
.end method

.method public final 飘花落叶言子世兰楪苏哲(Ljava/lang/Object;J)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    or-long/2addr p2, v0

    .line 6
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 7
    .line 8
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 9
    .line 10
    and-long/2addr v0, p2

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteHashMapArrayListClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 19
    .line 20
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 21
    .line 22
    and-long/2addr v0, p2

    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-class v1, Ljava/util/HashMap;

    .line 34
    .line 35
    if-eq v0, v1, :cond_2

    .line 36
    .line 37
    const-class v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    if-ne v0, v1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteRootClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 43
    .line 44
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 45
    .line 46
    and-long/2addr p2, v0

    .line 47
    cmp-long p2, p2, v2

    .line 48
    .line 49
    if-eqz p2, :cond_3

    .line 50
    .line 51
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 52
    .line 53
    if-eq p1, p0, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 59
    return p0
.end method

.method public final 飘花落叶言子世哲苏兰楪(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v2, v0

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long v2, v2, v4

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteHashMapArrayListClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 18
    .line 19
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 20
    .line 21
    and-long/2addr v2, v0

    .line 22
    cmp-long v2, v2, v4

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-class v3, Ljava/util/HashMap;

    .line 33
    .line 34
    if-eq v2, v3, :cond_2

    .line 35
    .line 36
    const-class v3, Ljava/util/ArrayList;

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteRootClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 42
    .line 43
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 44
    .line 45
    and-long/2addr v0, v2

    .line 46
    cmp-long v0, v0, v4

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 51
    .line 52
    if-eq p1, p0, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 56
    return p0

    .line 57
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 58
    return p0
.end method

.method public final 飘花落叶言子世哲苏楪兰(Ljava/lang/Class;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v2, v0

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long v2, v2, v4

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-ne v2, p1, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteHashMapArrayListClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 28
    .line 29
    iget-wide v6, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 30
    .line 31
    and-long/2addr v6, v0

    .line 32
    cmp-long p1, v6, v4

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    const-class p1, Ljava/util/HashMap;

    .line 37
    .line 38
    if-eq v2, p1, :cond_4

    .line 39
    .line 40
    const-class p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    if-ne v2, p1, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteRootClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 46
    .line 47
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 48
    .line 49
    and-long/2addr v0, v2

    .line 50
    cmp-long p1, v0, v4

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 55
    .line 56
    if-eq p2, p0, :cond_4

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 60
    return p0

    .line 61
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 62
    return p0
.end method

.method public final 飘花落叶言子世苏楪兰哲(JLjava/lang/Class;Ljava/lang/Object;)Z
    .locals 5

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-ne v0, p3, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 12
    .line 13
    iget-wide v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 14
    .line 15
    or-long/2addr p1, v1

    .line 16
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 17
    .line 18
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 19
    .line 20
    and-long/2addr v1, p1

    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    cmp-long v1, v1, v3

    .line 24
    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteHashMapArrayListClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 29
    .line 30
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 31
    .line 32
    and-long/2addr v1, p1

    .line 33
    cmp-long v1, v1, v3

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    const-class v1, Ljava/util/HashMap;

    .line 38
    .line 39
    if-ne v0, v1, :cond_3

    .line 40
    .line 41
    if-eqz p3, :cond_5

    .line 42
    .line 43
    const-class v0, Ljava/lang/Object;

    .line 44
    .line 45
    if-eq p3, v0, :cond_5

    .line 46
    .line 47
    const-class v0, Ljava/util/Map;

    .line 48
    .line 49
    if-eq p3, v0, :cond_5

    .line 50
    .line 51
    const-class v0, Ljava/util/AbstractMap;

    .line 52
    .line 53
    if-ne p3, v0, :cond_4

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const-class p3, Ljava/util/ArrayList;

    .line 57
    .line 58
    if-ne v0, p3, :cond_4

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteRootClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 62
    .line 63
    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 64
    .line 65
    and-long/2addr p1, v0

    .line 66
    cmp-long p1, p1, v3

    .line 67
    .line 68
    if-eqz p1, :cond_6

    .line 69
    .line 70
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 71
    .line 72
    if-eq p4, p0, :cond_5

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_5
    :goto_0
    const/4 p0, 0x0

    .line 76
    return p0

    .line 77
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 78
    return p0
.end method

.method public final 飘花落叶言子世苏楪哲兰(JLjava/lang/Class;Ljava/lang/Object;)Z
    .locals 5

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-ne v0, p3, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 12
    .line 13
    iget-wide v1, p3, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 14
    .line 15
    or-long/2addr p1, v1

    .line 16
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 17
    .line 18
    iget-wide v1, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 19
    .line 20
    and-long/2addr v1, p1

    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    cmp-long p3, v1, v3

    .line 24
    .line 25
    if-nez p3, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteHashMapArrayListClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 29
    .line 30
    iget-wide v1, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 31
    .line 32
    and-long/2addr v1, p1

    .line 33
    cmp-long p3, v1, v3

    .line 34
    .line 35
    if-eqz p3, :cond_3

    .line 36
    .line 37
    const-class p3, Ljava/util/HashMap;

    .line 38
    .line 39
    if-ne v0, p3, :cond_3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteRootClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 43
    .line 44
    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 45
    .line 46
    and-long/2addr p1, v0

    .line 47
    cmp-long p1, p1, v3

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 52
    .line 53
    if-eq p4, p0, :cond_4

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 59
    return p0
.end method

.method public abstract 飘花落叶言子兰世哲楪苏([B)V
.end method

.method public abstract 飘花落叶言子兰世哲苏楪(Ljava/time/LocalDate;)V
.end method

.method public abstract 飘花落叶言子兰世楪哲苏(Ljava/lang/Long;)V
.end method

.method public abstract 飘花落叶言子兰世楪苏哲(J)V
.end method

.method public abstract 飘花落叶言子兰世苏哲楪(B)V
.end method

.method public abstract 飘花落叶言子兰世苏楪哲([J)V
.end method

.method public final 飘花落叶言子兰哲世楪苏()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    const-wide/32 v2, 0x1000040

    .line 6
    .line 7
    .line 8
    and-long/2addr v0, v2

    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言子兰哲世苏楪(Ljava/lang/Class;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    const-wide/16 v2, 0x40

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-class v0, Ljava/lang/Character;

    .line 15
    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    const-string p1, "\u0000"

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const/16 p1, 0x7b

    .line 25
    .line 26
    const/16 v0, 0x7d

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世哲苏兰(CC)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public abstract 飘花落叶言子兰哲楪世苏([C)V
.end method

.method public abstract 飘花落叶言子兰哲楪苏世()V
.end method

.method public abstract 飘花落叶言子兰哲苏世楪(Ljava/time/OffsetTime;)V
.end method

.method public abstract 飘花落叶言子兰哲苏楪世(Ljava/time/OffsetDateTime;)V
.end method

.method public abstract 飘花落叶言子兰楪世哲苏(S)V
.end method

.method public 飘花落叶言子兰楪世苏哲(Ljava/time/Instant;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    sget-object v0, Ljava/time/format/DateTimeFormatter;->ISO_INSTANT:Ljava/time/format/DateTimeFormatter;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public abstract 飘花落叶言子兰楪哲世苏(Ljava/lang/Integer;)V
.end method

.method public abstract 飘花落叶言子兰楪哲苏世([I)V
.end method

.method public 飘花落叶言子兰楪苏世哲([S)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    array-length v1, p1

    .line 12
    if-ge v0, v1, :cond_2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 17
    .line 18
    .line 19
    :cond_1
    aget-short v1, p1, v0

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪世哲苏(S)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public abstract 飘花落叶言子兰楪苏哲世(I)V
.end method

.method public 飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲世苏:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲世苏:Z

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 10
    .line 11
    .line 12
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 13
    .line 14
    iget-wide v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 15
    .line 16
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->UnquoteFieldName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 17
    .line 18
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 19
    .line 20
    and-long/2addr v2, v4

    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v0, v1

    .line 30
    :goto_1
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-gez v2, :cond_3

    .line 39
    .line 40
    const/16 v2, 0x5c

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ltz v2, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v1, v0

    .line 50
    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public 飘花落叶言子兰苏世楪哲(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract 飘花落叶言子兰苏哲世楪([B)V
.end method

.method public 飘花落叶言子兰苏哲楪世(J[B)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract 飘花落叶言子兰苏楪世哲(Ljava/time/LocalDateTime;)V
.end method

.method public abstract 飘花落叶言子兰苏楪哲世(Ljava/time/LocalTime;)V
.end method

.method public abstract 飘花落叶言子哲世兰楪苏(IIIIII)V
.end method

.method public abstract 飘花落叶言子哲世兰苏楪(IIIIIIIIZ)V
.end method

.method public abstract 飘花落叶言子哲世楪兰苏()V
.end method

.method public abstract 飘花落叶言子哲世楪苏兰(C)V
.end method

.method public abstract 飘花落叶言子哲世苏兰楪(IIIIII)V
.end method

.method public abstract 飘花落叶言子哲世苏楪兰()V
.end method

.method public abstract 飘花落叶言子哲兰世楪苏(F)V
.end method

.method public final 飘花落叶言子哲兰世苏楪(FLjava/text/DecimalFormat;)V
    .locals 2

    .line 1
    if-eqz p2, :cond_3

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    float-to-double v0, p1

    .line 22
    invoke-virtual {p2, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰世楪苏(F)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public abstract 飘花落叶言子哲兰楪世苏([D)V
.end method

.method public 飘花落叶言子哲兰楪苏世(Ljava/lang/Enum;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingToString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v2, v0

    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmp-long v2, v2, v4

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumsUsingName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 31
    .line 32
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 33
    .line 34
    and-long/2addr v0, v2

    .line 35
    cmp-long v0, v0, v4

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public abstract 飘花落叶言子哲兰苏世楪([B)V
.end method

.method public abstract 飘花落叶言子哲兰苏楪世([F)V
.end method

.method public abstract 飘花落叶言子哲楪世兰苏(Ljava/math/BigInteger;J)V
.end method

.method public abstract 飘花落叶言子哲楪世苏兰([B)V
.end method

.method public 飘花落叶言子哲楪兰世苏([Z)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    array-length v1, p1

    .line 12
    if-ge v0, v1, :cond_2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 17
    .line 18
    .line 19
    :cond_1
    aget-boolean v1, p1, v0

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪苏兰世(Z)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final 飘花落叶言子哲楪兰苏世()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullBooleanAsFalse:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    const-wide/16 v4, 0x40

    .line 10
    .line 11
    or-long/2addr v2, v4

    .line 12
    and-long/2addr v0, v2

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪苏兰世(Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public 飘花落叶言子哲楪苏世兰([B)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteByteArrayAsBase64:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪世苏兰([B)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    :goto_0
    array-length v1, p1

    .line 31
    if-ge v0, v1, :cond_3

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 36
    .line 37
    .line 38
    :cond_2
    aget-byte v1, p1, v0

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public abstract 飘花落叶言子哲楪苏兰世(Z)V
.end method

.method public final 飘花落叶言子哲苏世兰楪()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    const-wide/16 v2, 0x40

    .line 6
    .line 7
    and-long/2addr v2, v0

    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    cmp-long v2, v2, v4

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏兰楪世(D)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-wide/32 v2, 0x1000000

    .line 21
    .line 22
    .line 23
    and-long/2addr v0, v2

    .line 24
    cmp-long v0, v0, v4

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public abstract 飘花落叶言子哲苏世楪兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V
.end method

.method public final 飘花落叶言子哲苏兰世楪(DLjava/text/DecimalFormat;)V
    .locals 1

    .line 1
    if-eqz p3, :cond_3

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p3, p1, p2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏兰楪世(D)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public abstract 飘花落叶言子哲苏兰楪世(D)V
.end method

.method public abstract 飘花落叶言子哲苏楪世兰(III)V
.end method

.method public abstract 飘花落叶言子哲苏楪兰世(III)V
.end method

.method public abstract 飘花落叶言子楪世兰哲苏()V
.end method

.method public abstract 飘花落叶言子楪世哲苏兰()V
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/JSONWriter$Feature;Z)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    or-long/2addr p1, v0

    .line 10
    iput-wide p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    not-long p1, p1

    .line 16
    and-long/2addr p1, v0

    .line 17
    iput-wide p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 18
    .line 19
    return-void
.end method

.method public final 飘花落叶言子楪兰世哲苏()Z
    .locals 6

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v2, v0

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long p0, v2, v4

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const-wide/high16 v2, 0x200000000000000L

    .line 17
    .line 18
    and-long/2addr v0, v2

    .line 19
    cmp-long p0, v0, v4

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final 飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v2, v0

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long p0, v2, v4

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const-wide/high16 v2, 0x200000000000000L

    .line 17
    .line 18
    and-long/2addr v0, v2

    .line 19
    cmp-long p0, v0, v4

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final 飘花落叶言子楪哲世苏兰(J)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    and-long p0, v0, p1

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long p0, p0, v0

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final 飘花落叶言子楪哲兰苏世()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreErrorGetter:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long p0, v0, v2

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/JSONWriter$Feature;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    iget-wide p0, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 6
    .line 7
    and-long/2addr p0, v0

    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    cmp-long p0, p0, v0

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 20
    .line 21
    invoke-virtual {p0, p1, p1, v0}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(J)J
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    or-long p0, v0, p1

    .line 6
    .line 7
    return-wide p0
.end method

.method public final 飘花落叶言子楪苏兰哲世()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long p0, v0, v2

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Ljava/lang/Class;Ljava/lang/reflect/Type;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 20
    .line 21
    invoke-virtual {p0, p2, p1, v0}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final 飘花落叶言子苏世兰哲楪(ILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲世楪兰(ILjava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final 飘花落叶言子苏世兰楪哲(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 6
    .line 7
    iget-wide v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 8
    .line 9
    const-wide/32 v3, 0x20000

    .line 10
    .line 11
    .line 12
    and-long/2addr v1, v3

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    cmp-long v1, v1, v3

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 20
    .line 21
    if-eq p1, v1, :cond_1

    .line 22
    .line 23
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 24
    .line 25
    if-ne p1, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 29
    .line 30
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世兰楪哲(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子苏世哲楪兰()V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "level too large : "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public 飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 12
    .line 13
    invoke-virtual {v1, v0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v6, 0x0

    .line 18
    const-wide/16 v7, 0x0

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    move-object v3, p0

    .line 22
    move-object v4, p1

    .line 23
    invoke-interface/range {v2 .. v8}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public 飘花落叶言子苏兰世楪哲(Ljava/util/Map;)V
    .locals 13

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x7b

    .line 14
    .line 15
    const/16 v2, 0x7d

    .line 16
    .line 17
    invoke-virtual {p0, v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世哲苏兰(CC)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 22
    .line 23
    iget-wide v2, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 24
    .line 25
    sget-wide v4, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏楪兰哲:J

    .line 26
    .line 27
    and-long/2addr v2, v4

    .line 28
    const-wide/16 v8, 0x0

    .line 29
    .line 30
    cmp-long v0, v2, v8

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v7, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v4, 0x0

    .line 43
    const-wide/16 v5, 0x0

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    move-object v1, p0

    .line 47
    move-object v2, p1

    .line 48
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰楪世哲()V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    const/4 v0, 0x1

    .line 64
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_e

    .line 69
    .line 70
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/util/Map$Entry;

    .line 75
    .line 76
    move-object v3, v2

    .line 77
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    iget-wide v4, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 84
    .line 85
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteMapNullValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 86
    .line 87
    iget-wide v11, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 88
    .line 89
    and-long/2addr v4, v11

    .line 90
    cmp-long v4, v4, v8

    .line 91
    .line 92
    if-nez v4, :cond_3

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    if-nez v0, :cond_4

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 98
    .line 99
    .line 100
    :cond_4
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    instance-of v3, v0, Ljava/lang/String;

    .line 105
    .line 106
    if-eqz v3, :cond_5

    .line 107
    .line 108
    check-cast v0, Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_5
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世楪兰苏()V

    .line 118
    .line 119
    .line 120
    if-nez v2, :cond_6

    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-class v3, Ljava/lang/String;

    .line 131
    .line 132
    if-ne v0, v3, :cond_7

    .line 133
    .line 134
    check-cast v2, Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    const-class v3, Ljava/lang/Integer;

    .line 141
    .line 142
    if-ne v0, v3, :cond_8

    .line 143
    .line 144
    check-cast v2, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪哲世苏(Ljava/lang/Integer;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_8
    const-class v3, Ljava/lang/Long;

    .line 151
    .line 152
    if-ne v0, v3, :cond_9

    .line 153
    .line 154
    check-cast v2, Ljava/lang/Long;

    .line 155
    .line 156
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪哲苏(Ljava/lang/Long;)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_9
    const-class v3, Ljava/lang/Boolean;

    .line 161
    .line 162
    if-ne v0, v3, :cond_a

    .line 163
    .line 164
    check-cast v2, Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪苏兰世(Z)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_a
    const-class v3, Ljava/math/BigDecimal;

    .line 175
    .line 176
    if-ne v0, v3, :cond_b

    .line 177
    .line 178
    check-cast v2, Ljava/math/BigDecimal;

    .line 179
    .line 180
    const/4 v0, 0x0

    .line 181
    invoke-virtual {p0, v2, v8, v9, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏世楪兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_b
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 186
    .line 187
    if-ne v0, v3, :cond_c

    .line 188
    .line 189
    check-cast v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 190
    .line 191
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰楪哲世(Ljava/util/List;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_c
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 196
    .line 197
    if-ne v0, v3, :cond_d

    .line 198
    .line 199
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 200
    .line 201
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世楪哲(Ljava/util/Map;)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_d
    invoke-virtual {v7, v0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    const/4 v4, 0x0

    .line 210
    const-wide/16 v5, 0x0

    .line 211
    .line 212
    const/4 v3, 0x0

    .line 213
    move-object v1, p0

    .line 214
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 215
    .line 216
    .line 217
    :goto_2
    const/4 v0, 0x0

    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :cond_e
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏()V

    .line 221
    .line 222
    .line 223
    return-void
.end method

.method public 飘花落叶言子苏兰哲世楪(J)V
    .locals 2

    .line 1
    const-wide/32 v0, 0x400040

    .line 2
    .line 3
    .line 4
    and-long/2addr p1, v0

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long p1, p1, v0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const-string p1, "[]"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p1, "null"

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public 飘花落叶言子苏兰哲楪世()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲世楪(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract 飘花落叶言子苏兰楪世哲()V
.end method

.method public abstract 飘花落叶言子苏兰楪哲世(Ljava/util/List;)V
.end method

.method public final 飘花落叶言子苏哲世兰楪(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言子苏哲世楪兰(ILjava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    if-nez p1, :cond_2

    .line 8
    .line 9
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 15
    .line 16
    invoke-direct {v2, v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    const/4 v2, 0x1

    .line 23
    if-ne p1, v2, :cond_4

    .line 24
    .line 25
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 26
    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 31
    .line 32
    invoke-direct {v2, v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;I)V

    .line 33
    .line 34
    .line 35
    iput-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 39
    .line 40
    invoke-direct {v2, v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;I)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iput-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 44
    .line 45
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 46
    .line 47
    if-ne p2, p1, :cond_5

    .line 48
    .line 49
    sget-object p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_5
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 53
    .line 54
    if-eqz p1, :cond_7

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 61
    .line 62
    if-nez p1, :cond_6

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_6
    move-object p0, p1

    .line 66
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_7
    :goto_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 72
    .line 73
    if-nez p1, :cond_8

    .line 74
    .line 75
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 76
    .line 77
    const/16 v0, 0x8

    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 83
    .line 84
    :cond_8
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 85
    .line 86
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 87
    .line 88
    invoke-virtual {p1, p2, p0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    return-object v1
.end method

.method public 飘花落叶言子苏哲兰世楪(I)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract 飘花落叶言子苏哲兰楪世()V
.end method

.method public final 飘花落叶言子苏哲楪世兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 12
    .line 13
    invoke-direct {v0, v2, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 17
    .line 18
    iget-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 19
    .line 20
    if-ne p1, p2, :cond_1

    .line 21
    .line 22
    sget-object p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 26
    .line 27
    if-eqz p2, :cond_3

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 34
    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object p0, p2

    .line 39
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_3
    :goto_1
    iget-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 45
    .line 46
    if-nez p2, :cond_4

    .line 47
    .line 48
    new-instance p2, Ljava/util/IdentityHashMap;

    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    invoke-direct {p2, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 56
    .line 57
    :cond_4
    iget-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 58
    .line 59
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 60
    .line 61
    invoke-virtual {p2, p1, p0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-object v1
.end method

.method public final 飘花落叶言子苏哲楪兰世(L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    iget-object p1, p1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲楪兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-object v3, p1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v4, p1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏楪兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 21
    .line 22
    if-nez v4, :cond_2

    .line 23
    .line 24
    new-instance v4, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 25
    .line 26
    invoke-direct {v4, v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v4, p1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏楪兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 30
    .line 31
    :goto_0
    move-object p1, v4

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object p1, v4, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 34
    .line 35
    if-ne p1, v0, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 39
    .line 40
    invoke-direct {p1, v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_1
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 44
    .line 45
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 46
    .line 47
    if-ne p2, p1, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 51
    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    move-object v2, p1

    .line 59
    check-cast v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 60
    .line 61
    if-nez v2, :cond_5

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_5
    :goto_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_6
    :goto_3
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 70
    .line 71
    if-nez p1, :cond_7

    .line 72
    .line 73
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 74
    .line 75
    const/16 v0, 0x8

    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 81
    .line 82
    :cond_7
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 83
    .line 84
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 85
    .line 86
    invoke-virtual {p1, p2, p0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    return-object v1
.end method

.method public final 飘花落叶言子苏楪哲兰世(II)I
    .locals 2

    .line 1
    shr-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    add-int/2addr p2, v0

    .line 4
    sub-int v0, p2, p1

    .line 5
    .line 6
    if-gez v0, :cond_0

    .line 7
    .line 8
    move p2, p1

    .line 9
    :cond_0
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏哲世:I

    .line 10
    .line 11
    if-le p2, p0, :cond_2

    .line 12
    .line 13
    if-ge p1, p0, :cond_1

    .line 14
    .line 15
    return p0

    .line 16
    :cond_1
    new-instance p2, Lcom/alibaba/fastjson2/JSONLargeObjectException;

    .line 17
    .line 18
    const-string v0, "Maximum array size exceeded. Try enabling LargeObject feature instead. Requested size: "

    .line 19
    .line 20
    const-string v1, ", max size: "

    .line 21
    .line 22
    invoke-static {p1, p0, v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {p2, p0}, Lcom/alibaba/fastjson2/JSONLargeObjectException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p2

    .line 30
    :cond_2
    return p2
.end method

.method public abstract 飘花落叶言楪世子哲兰苏(Ljava/time/ZonedDateTime;)V
.end method

.method public abstract 飘花落叶言楪世子哲苏兰(Ljava/util/UUID;)V
.end method

.method public 飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public 飘花落叶言楪世子苏哲兰(J[B)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract 飘花落叶言楪子世兰哲苏([B)V
.end method

.method public abstract 飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V
.end method

.method public 飘花落叶言楪子世哲兰苏(I[C)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public 飘花落叶言楪子世哲苏兰(CC)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract 飘花落叶言楪子世苏兰哲(C)V
.end method

.method public 飘花落叶言楪子世苏哲兰(B)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public 飘花落叶言楪子兰世哲苏([S)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    array-length v1, p1

    .line 12
    if-ge v0, v1, :cond_2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 17
    .line 18
    .line 19
    :cond_1
    aget-short v1, p1, v0

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲苏世兰(S)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public 飘花落叶言楪子兰世苏哲([Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    array-length v1, p1

    .line 12
    if-ge v0, v1, :cond_2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 17
    .line 18
    .line 19
    :cond_1
    aget-object v1, p1, v0

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public 飘花落叶言楪子兰哲世苏(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract 飘花落叶言楪子兰哲苏世(III)V
.end method

.method public abstract 飘花落叶言楪子兰苏世哲(I[C)V
.end method

.method public 飘花落叶言楪子兰苏哲世()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    const-wide/32 v2, 0x800040

    .line 6
    .line 7
    .line 8
    and-long/2addr v2, v0

    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    const-wide/32 v2, 0x100000

    .line 16
    .line 17
    .line 18
    and-long/2addr v0, v2

    .line 19
    cmp-long v0, v0, v4

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const-string v0, "\'\'"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "\"\""

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string v0, "null"

    .line 30
    .line 31
    :goto_0
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public 飘花落叶言楪子哲世兰苏(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public abstract 飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V
.end method

.method public 飘花落叶言楪子哲兰世苏([B)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    array-length v1, p1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 11
    .line 12
    .line 13
    :cond_0
    aget-byte v1, p1, v0

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏哲世兰(B)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public 飘花落叶言楪子哲兰苏世([J)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    array-length v1, p1

    .line 12
    if-ge v0, v1, :cond_2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 17
    .line 18
    .line 19
    :cond_1
    aget-wide v1, p1, v0

    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏兰哲世(J)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public abstract 飘花落叶言楪子哲苏世兰(S)V
.end method

.method public abstract 飘花落叶言楪子哲苏兰世(Z)V
.end method

.method public final 飘花落叶言楪子苏世兰哲(ILjava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世兰哲楪(ILjava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public abstract 飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V
.end method

.method public abstract 飘花落叶言楪子苏兰世哲(I[C)V
.end method

.method public abstract 飘花落叶言楪子苏兰哲世(J)V
.end method

.method public abstract 飘花落叶言楪子苏哲世兰(B)V
.end method

.method public abstract 飘花落叶言楪子苏哲兰世(I)V
.end method
