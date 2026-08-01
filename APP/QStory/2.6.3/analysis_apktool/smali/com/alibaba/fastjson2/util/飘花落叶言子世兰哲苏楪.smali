.class public abstract Lcom/alibaba/fastjson2/util/飘花落叶言子世兰哲苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

.field public static final 飘花落叶言子楪世苏哲兰:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    new-array v1, v0, [Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v0, :cond_0

    .line 8
    .line 9
    invoke-static {v3}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    aput-object v4, v1, v3

    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    int-to-char v3, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sput-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 20
    .line 21
    const/16 v0, 0x2341

    .line 22
    .line 23
    new-array v0, v0, [Ljava/lang/String;

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    move v3, v1

    .line 28
    :goto_1
    const/16 v4, 0x7e

    .line 29
    .line 30
    if-gt v3, v4, :cond_2

    .line 31
    .line 32
    move v5, v1

    .line 33
    :goto_2
    if-gt v5, v4, :cond_1

    .line 34
    .line 35
    add-int/lit8 v6, v3, -0x20

    .line 36
    .line 37
    mul-int/lit8 v6, v6, 0x5f

    .line 38
    .line 39
    add-int/lit8 v7, v5, -0x20

    .line 40
    .line 41
    add-int/2addr v7, v6

    .line 42
    const/4 v6, 0x2

    .line 43
    new-array v6, v6, [C

    .line 44
    .line 45
    aput-char v3, v6, v2

    .line 46
    .line 47
    const/4 v8, 0x1

    .line 48
    aput-char v5, v6, v8

    .line 49
    .line 50
    new-instance v8, Ljava/lang/String;

    .line 51
    .line 52
    invoke-direct {v8, v6}, Ljava/lang/String;-><init>([C)V

    .line 53
    .line 54
    .line 55
    aput-object v8, v0, v7

    .line 56
    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    int-to-char v5, v5

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    int-to-char v3, v3

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

    .line 66
    .line 67
    return-void
.end method
