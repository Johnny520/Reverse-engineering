.class public final L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪苏兰哲世:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;


# instance fields
.field public 飘花落叶言子楪世兰哲苏:S

.field public 飘花落叶言子楪世兰苏哲:S

.field public 飘花落叶言子楪世哲兰苏:S

.field public 飘花落叶言子楪世哲苏兰:[I

.field public 飘花落叶言子楪世苏兰哲:I

.field public 飘花落叶言子楪世苏哲兰:S

.field public 飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;

.field public 飘花落叶言子楪苏世哲兰:S

.field public 飘花落叶言子楪苏兰世哲:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

.field public 飘花落叶言子楪苏哲世兰:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

.field public 飘花落叶言子楪苏哲兰世:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "L"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲([BI)Z
    .locals 7

    .line 1
    iget-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    int-to-short v0, v0

    .line 6
    iput-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 7
    .line 8
    iput p2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:[I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    aget v0, v0, v1

    .line 17
    .line 18
    :goto_0
    if-lez v0, :cond_5

    .line 19
    .line 20
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:[I

    .line 21
    .line 22
    add-int/lit8 v3, v0, -0x1

    .line 23
    .line 24
    aget v3, v2, v3

    .line 25
    .line 26
    aget v2, v2, v0

    .line 27
    .line 28
    sub-int v4, p2, v3

    .line 29
    .line 30
    const v5, 0xfffffff

    .line 31
    .line 32
    .line 33
    and-int/2addr v5, v2

    .line 34
    const/high16 v6, -0x10000000

    .line 35
    .line 36
    and-int/2addr v2, v6

    .line 37
    const/high16 v6, 0x10000000

    .line 38
    .line 39
    if-ne v2, v6, :cond_4

    .line 40
    .line 41
    const/16 v2, -0x8000

    .line 42
    .line 43
    if-lt v4, v2, :cond_1

    .line 44
    .line 45
    const/16 v2, 0x7fff

    .line 46
    .line 47
    if-le v4, v2, :cond_3

    .line 48
    .line 49
    :cond_1
    aget-byte v1, p1, v3

    .line 50
    .line 51
    and-int/lit16 v1, v1, 0xff

    .line 52
    .line 53
    const/16 v2, 0xc6

    .line 54
    .line 55
    if-ge v1, v2, :cond_2

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x31

    .line 58
    .line 59
    int-to-byte v1, v1

    .line 60
    aput-byte v1, p1, v3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    add-int/lit8 v1, v1, 0x14

    .line 64
    .line 65
    int-to-byte v1, v1

    .line 66
    aput-byte v1, p1, v3

    .line 67
    .line 68
    :goto_1
    const/4 v1, 0x1

    .line 69
    :cond_3
    add-int/lit8 v2, v5, 0x1

    .line 70
    .line 71
    ushr-int/lit8 v3, v4, 0x8

    .line 72
    .line 73
    int-to-byte v3, v3

    .line 74
    aput-byte v3, p1, v5

    .line 75
    .line 76
    int-to-byte v3, v4

    .line 77
    aput-byte v3, p1, v2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    add-int/lit8 v2, v5, 0x1

    .line 81
    .line 82
    ushr-int/lit8 v3, v4, 0x18

    .line 83
    .line 84
    int-to-byte v3, v3

    .line 85
    aput-byte v3, p1, v5

    .line 86
    .line 87
    add-int/lit8 v3, v5, 0x2

    .line 88
    .line 89
    ushr-int/lit8 v6, v4, 0x10

    .line 90
    .line 91
    int-to-byte v6, v6

    .line 92
    aput-byte v6, p1, v2

    .line 93
    .line 94
    add-int/lit8 v5, v5, 0x3

    .line 95
    .line 96
    ushr-int/lit8 v2, v4, 0x8

    .line 97
    .line 98
    int-to-byte v2, v2

    .line 99
    aput-byte v2, p1, v3

    .line 100
    .line 101
    int-to-byte v2, v4

    .line 102
    aput-byte v2, p1, v5

    .line 103
    .line 104
    :goto_2
    add-int/lit8 v0, v0, -0x2

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_5
    return v1
.end method

.method public final 飘花落叶言子楪世哲兰苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;IZ)V
    .locals 2

    .line 1
    iget-short v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    const/high16 p3, 0x20000000

    .line 13
    .line 14
    invoke-virtual {p0, p2, p3, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(III)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/high16 p3, 0x10000000

    .line 22
    .line 23
    invoke-virtual {p0, p2, p3, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(III)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 31
    .line 32
    if-eqz p3, :cond_2

    .line 33
    .line 34
    sub-int/2addr p0, p2

    .line 35
    invoke-virtual {p1, p0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    sub-int/2addr p0, p2

    .line 40
    invoke-virtual {p1, p0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;
    .locals 3

    .line 1
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-short v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 6
    .line 7
    and-int/lit8 v1, v1, 0x10

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 12
    .line 13
    iget-object v1, v1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v1, v0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 23
    .line 24
    iget-object v2, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    iput-object p1, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 29
    .line 30
    move-object p1, v1

    .line 31
    :cond_1
    :goto_1
    iget-object v0, v0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return-object p1
.end method

.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object p0, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(III)V
    .locals 6

    .line 1
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:[I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-array v0, v1, [I

    .line 7
    .line 8
    iput-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:[I

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:[I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aget v3, v0, v2

    .line 14
    .line 15
    add-int/lit8 v4, v3, 0x2

    .line 16
    .line 17
    array-length v5, v0

    .line 18
    if-lt v4, v5, :cond_1

    .line 19
    .line 20
    array-length v5, v0

    .line 21
    add-int/2addr v5, v1

    .line 22
    new-array v1, v5, [I

    .line 23
    .line 24
    array-length v5, v0

    .line 25
    invoke-static {v0, v2, v1, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:[I

    .line 29
    .line 30
    :cond_1
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:[I

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    aput p1, p0, v3

    .line 35
    .line 36
    or-int p1, p2, p3

    .line 37
    .line 38
    aput p1, p0, v4

    .line 39
    .line 40
    aput v4, p0, v2

    .line 41
    .line 42
    return-void
.end method
