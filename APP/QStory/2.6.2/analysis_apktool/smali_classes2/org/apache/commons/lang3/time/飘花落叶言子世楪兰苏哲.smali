.class public final Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/Locale;

.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;


# direct methods
.method public constructor <init>(Ljava/util/TimeZone;ZILjava/util/Locale;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    const/high16 p1, -0x80000000

    .line 9
    .line 10
    or-int/2addr p1, p3

    .line 11
    iput p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iput p3, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 15
    .line 16
    :goto_0
    sget p1, Lorg/apache/commons/lang3/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 17
    .line 18
    if-eqz p4, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    :goto_1
    iput-object p4, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/Locale;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;

    .line 11
    .line 12
    iget-object v1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;

    .line 13
    .line 14
    iget-object v3, p1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget v1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 23
    .line 24
    iget v3, p1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 25
    .line 26
    if-ne v1, v3, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/Locale;

    .line 29
    .line 30
    iget-object p1, p1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    return v0

    .line 39
    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/Locale;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, v0

    .line 12
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/2addr p0, v1

    .line 21
    return p0
.end method
