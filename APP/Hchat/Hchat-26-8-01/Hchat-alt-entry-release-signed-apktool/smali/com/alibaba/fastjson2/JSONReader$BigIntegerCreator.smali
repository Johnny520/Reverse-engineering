.class final Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/BiFunction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/JSONReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BigIntegerCreator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/function/BiFunction<",
        "Ljava/lang/Integer;",
        "[I",
        "Ljava/math/BigInteger;",
        ">;"
    }
.end annotation


# static fields
.field static final BIG_INTEGER_CREATOR:Ljava/util/function/BiFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/BiFunction<",
            "Ljava/lang/Integer;",
            "[I",
            "Ljava/math/BigInteger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;->BIG_INTEGER_CREATOR:Ljava/util/function/BiFunction;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 131
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [I

    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;->apply(Ljava/lang/Integer;[I)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1
.end method

.method public apply(Ljava/lang/Integer;[I)Ljava/math/BigInteger;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    array-length v0, p2

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    move v3, v1

    .line 11
    goto :goto_3

    .line 12
    :cond_0
    aget v0, p2, v1

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    rsub-int/lit8 v0, v0, 0x20

    .line 19
    .line 20
    array-length v3, p2

    .line 21
    sub-int/2addr v3, v2

    .line 22
    shl-int/lit8 v3, v3, 0x5

    .line 23
    .line 24
    add-int/2addr v3, v0

    .line 25
    if-gez p1, :cond_4

    .line 26
    .line 27
    aget v0, p2, v1

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-ne v0, v2, :cond_1

    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v0, v1

    .line 38
    :goto_0
    move v4, v2

    .line 39
    :goto_1
    array-length v5, p2

    .line 40
    if-ge v4, v5, :cond_3

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    aget v0, p2, v4

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    move v0, v2

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v0, v1

    .line 51
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    if-eqz v0, :cond_4

    .line 55
    .line 56
    add-int/lit8 v3, v3, -0x1

    .line 57
    .line 58
    :cond_4
    :goto_3
    div-int/lit8 v3, v3, 0x8

    .line 59
    .line 60
    add-int/lit8 v0, v3, 0x1

    .line 61
    .line 62
    new-array v0, v0, [B

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    move v6, v1

    .line 66
    move v7, v6

    .line 67
    move v5, v4

    .line 68
    :goto_4
    if-ltz v3, :cond_c

    .line 69
    .line 70
    if-ne v5, v4, :cond_b

    .line 71
    .line 72
    add-int/lit8 v5, v7, 0x1

    .line 73
    .line 74
    if-gez v7, :cond_6

    .line 75
    .line 76
    :cond_5
    move v6, v1

    .line 77
    goto :goto_6

    .line 78
    :cond_6
    array-length v6, p2

    .line 79
    if-lt v7, v6, :cond_7

    .line 80
    .line 81
    if-gez p1, :cond_5

    .line 82
    .line 83
    const/4 v6, -0x1

    .line 84
    goto :goto_6

    .line 85
    :cond_7
    array-length v6, p2

    .line 86
    sub-int/2addr v6, v7

    .line 87
    sub-int/2addr v6, v2

    .line 88
    aget v6, p2, v6

    .line 89
    .line 90
    if-ltz p1, :cond_8

    .line 91
    .line 92
    goto :goto_6

    .line 93
    :cond_8
    array-length v8, p2

    .line 94
    add-int/lit8 v9, v8, -0x1

    .line 95
    .line 96
    :goto_5
    if-ltz v9, :cond_9

    .line 97
    .line 98
    aget v10, p2, v9

    .line 99
    .line 100
    if-nez v10, :cond_9

    .line 101
    .line 102
    add-int/lit8 v9, v9, -0x1

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_9
    sub-int/2addr v8, v9

    .line 106
    sub-int/2addr v8, v2

    .line 107
    if-gt v7, v8, :cond_a

    .line 108
    .line 109
    neg-int v6, v6

    .line 110
    goto :goto_6

    .line 111
    :cond_a
    not-int v6, v6

    .line 112
    :goto_6
    move v7, v5

    .line 113
    move v5, v2

    .line 114
    goto :goto_7

    .line 115
    :cond_b
    ushr-int/lit8 v6, v6, 0x8

    .line 116
    .line 117
    add-int/lit8 v5, v5, 0x1

    .line 118
    .line 119
    :goto_7
    int-to-byte v8, v6

    .line 120
    aput-byte v8, v0, v3

    .line 121
    .line 122
    add-int/lit8 v3, v3, -0x1

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_c
    new-instance p1, Ljava/math/BigInteger;

    .line 126
    .line 127
    invoke-direct {p1, v0}, Ljava/math/BigInteger;-><init>([B)V

    .line 128
    .line 129
    .line 130
    return-object p1
.end method
