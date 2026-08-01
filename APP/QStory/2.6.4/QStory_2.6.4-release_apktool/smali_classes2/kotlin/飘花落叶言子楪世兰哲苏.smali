.class public final Lkotlin/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    invoke-direct {v0, v3, v1, v2}, Lkotlin/飘花落叶言子楪世兰哲苏;-><init>(III)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lkotlin/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 5
    .line 6
    iput p2, p0, Lkotlin/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    if-ltz p1, :cond_0

    .line 9
    .line 10
    const/16 p3, 0x100

    .line 11
    .line 12
    if-ge p1, p3, :cond_0

    .line 13
    .line 14
    if-ltz p2, :cond_0

    .line 15
    .line 16
    if-ge p2, p3, :cond_0

    .line 17
    .line 18
    shl-int/lit8 p1, p1, 0x10

    .line 19
    .line 20
    shl-int/lit8 p2, p2, 0x8

    .line 21
    .line 22
    add-int/2addr p1, p2

    .line 23
    iput p1, p0, Lkotlin/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string p3, "Version components are out of range: "

    .line 29
    .line 30
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p1, 0x2e

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, ".0"

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lkotlin/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lkotlin/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 7
    .line 8
    iget p1, p1, Lkotlin/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    sub-int/2addr p0, p1

    .line 11
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lkotlin/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lkotlin/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 p1, 0x0

    .line 13
    :goto_0
    const/4 v1, 0x0

    .line 14
    if-nez p1, :cond_2

    .line 15
    .line 16
    return v1

    .line 17
    :cond_2
    iget p0, p0, Lkotlin/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 18
    .line 19
    iget p1, p1, Lkotlin/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 20
    .line 21
    if-ne p0, p1, :cond_3

    .line 22
    .line 23
    return v0

    .line 24
    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lkotlin/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x2e

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget p0, p0, Lkotlin/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 17
    .line 18
    const-string v1, ".0"

    .line 19
    .line 20
    invoke-static {v0, v1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
