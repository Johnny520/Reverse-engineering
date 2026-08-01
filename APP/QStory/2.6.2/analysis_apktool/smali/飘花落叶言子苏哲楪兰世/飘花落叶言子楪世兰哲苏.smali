.class public final L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:F

.field public static final 飘花落叶言子楪世哲苏兰:F

.field public static final 飘花落叶言子楪世苏兰哲:F


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(F)V

    .line 3
    .line 4
    .line 5
    const/high16 v0, 0x3f000000    # 0.5f

    .line 6
    .line 7
    invoke-static {v0}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(F)V

    .line 8
    .line 9
    .line 10
    sput v0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 11
    .line 12
    const/high16 v0, -0x40800000    # -1.0f

    .line 13
    .line 14
    invoke-static {v0}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(F)V

    .line 15
    .line 16
    .line 17
    sput v0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:F

    .line 18
    .line 19
    const/high16 v0, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-static {v0}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(F)V

    .line 22
    .line 23
    .line 24
    sput v0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:F

    .line 25
    .line 26
    return-void
.end method

.method public synthetic constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 5
    .line 6
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(F)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p0, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string p0, "LineHeightStyle.Alignment.Top"

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    sget v0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 10
    .line 11
    cmpg-float v0, p0, v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string p0, "LineHeightStyle.Alignment.Center"

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    sget v0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:F

    .line 19
    .line 20
    cmpg-float v0, p0, v0

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string p0, "LineHeightStyle.Alignment.Proportional"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    sget v0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:F

    .line 28
    .line 29
    cmpg-float v0, p0, v0

    .line 30
    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    const-string p0, "LineHeightStyle.Alignment.Bottom"

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v1, "LineHeightStyle.Alignment(topPercentage = "

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/16 p0, 0x29

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, v0, p0

    .line 3
    .line 4
    if-gtz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    cmpg-float v0, p0, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    .line 14
    .line 15
    cmpg-float p0, p0, v0

    .line 16
    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :cond_1
    const-string p0, "topRatio should be in [0..1] range or -1"

    .line 21
    .line 22
    invoke-static {p0}, L飘花落叶言子苏世哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    iget p1, p1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 9
    .line 10
    iget p0, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 11
    .line 12
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
