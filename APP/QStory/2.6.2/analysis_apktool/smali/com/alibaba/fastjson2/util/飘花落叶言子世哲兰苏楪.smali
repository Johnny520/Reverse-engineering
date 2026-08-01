.class public abstract Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:[S

.field public static final 飘花落叶言子楪世苏兰哲:I

.field public static final 飘花落叶言子楪世苏哲兰:S


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "\\u00"

    .line 2
    .line 3
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 10
    .line 11
    sget-wide v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:J

    .line 12
    .line 13
    invoke-virtual {v1, v0, v2, v3}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    sput-short v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:S

    .line 18
    .line 19
    invoke-virtual {v1, v0, v2, v3}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:I

    .line 24
    .line 25
    const/16 v0, 0x80

    .line 26
    .line 27
    new-array v0, v0, [S

    .line 28
    .line 29
    const/16 v1, 0x5c

    .line 30
    .line 31
    const/16 v2, 0x5c5c

    .line 32
    .line 33
    aput-short v2, v0, v1

    .line 34
    .line 35
    const/16 v1, 0xa

    .line 36
    .line 37
    const/16 v2, 0x6e5c

    .line 38
    .line 39
    aput-short v2, v0, v1

    .line 40
    .line 41
    const/16 v1, 0xd

    .line 42
    .line 43
    const/16 v2, 0x725c

    .line 44
    .line 45
    aput-short v2, v0, v1

    .line 46
    .line 47
    const/16 v1, 0xc

    .line 48
    .line 49
    const/16 v2, 0x665c

    .line 50
    .line 51
    aput-short v2, v0, v1

    .line 52
    .line 53
    const/16 v1, 0x8

    .line 54
    .line 55
    const/16 v2, 0x625c

    .line 56
    .line 57
    aput-short v2, v0, v1

    .line 58
    .line 59
    const/16 v1, 0x9

    .line 60
    .line 61
    const/16 v2, 0x745c

    .line 62
    .line 63
    aput-short v2, v0, v1

    .line 64
    .line 65
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:[S

    .line 66
    .line 67
    return-void
.end method
