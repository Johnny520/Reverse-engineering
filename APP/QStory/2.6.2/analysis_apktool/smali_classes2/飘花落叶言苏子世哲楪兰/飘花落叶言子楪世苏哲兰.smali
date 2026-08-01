.class public abstract L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:Ljava/math/BigDecimal;

.field public static final 飘花落叶言子楪世哲兰苏:Ljava/math/BigDecimal;

.field public static final 飘花落叶言子楪世哲苏兰:Ljava/math/BigDecimal;

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/nio/file/attribute/FileTime;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/math/MathContext;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 4
    .line 5
    .line 6
    const-wide v0, 0x7fffffffffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/math/MathContext;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    sget-object v2, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Ljava/math/MathContext;-><init>(ILjava/math/RoundingMode;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/math/MathContext;

    .line 23
    .line 24
    sget-object v0, Ljava/time/Instant;->EPOCH:Ljava/time/Instant;

    .line 25
    .line 26
    invoke-static {v0}, Ljava/nio/file/attribute/FileTime;->from(Ljava/time/Instant;)Ljava/nio/file/attribute/FileTime;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/nio/file/attribute/FileTime;

    .line 31
    .line 32
    const-wide v0, -0x19db1ded53e8000L

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/math/BigDecimal;

    .line 42
    .line 43
    const-wide/32 v0, 0x989680

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/math/BigDecimal;

    .line 51
    .line 52
    const-wide/16 v0, 0x2710

    .line 53
    .line 54
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 55
    .line 56
    .line 57
    const-wide/16 v0, 0x64

    .line 58
    .line 59
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/math/BigDecimal;

    .line 64
    .line 65
    return-void
.end method
