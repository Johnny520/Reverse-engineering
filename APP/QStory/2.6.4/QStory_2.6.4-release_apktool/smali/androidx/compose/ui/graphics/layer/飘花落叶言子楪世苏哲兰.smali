.class public final Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子世楪苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏哲世兰;


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Landroid/graphics/Outline;

.field public final 飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

.field public 飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

.field public 飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/unit/LayoutDirection;

.field public 飘花落叶言子楪世苏兰哲:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;

.field public 飘花落叶言子楪兰世哲苏:J

.field public 飘花落叶言子楪兰世苏哲:Z

.field public 飘花落叶言子楪兰哲世苏:Z

.field public 飘花落叶言子楪兰哲苏世:Landroid/graphics/RectF;

.field public 飘花落叶言子楪兰苏世哲:J

.field public 飘花落叶言子楪兰苏哲世:J

.field public 飘花落叶言子楪哲世兰苏:Z

.field public 飘花落叶言子楪哲世苏兰:Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

.field public 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

.field public 飘花落叶言子楪哲苏世兰:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

.field public 飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪苏世兰哲:J

.field public 飘花落叶言子楪苏世哲兰:Z

.field public 飘花落叶言子楪苏兰世哲:Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;

.field public 飘花落叶言子楪苏兰哲世:Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

.field public 飘花落叶言子楪苏哲世兰:J

.field public 飘花落叶言子楪苏哲兰世:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v1, "robolectric"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏哲兰世;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    const/16 v1, 0x1c

    .line 26
    .line 27
    if-lt v0, v1, :cond_1

    .line 28
    .line 29
    sget-object v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏哲兰世;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    sget-object v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰哲世;

    .line 33
    .line 34
    :goto_0
    sput-object v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏哲世兰;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    sget-object v0, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    sget-object v0, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/unit/LayoutDirection;

    .line 13
    .line 14
    sget-object v0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$drawBlock$1;->INSTANCE:Landroidx/compose/ui/graphics/layer/GraphicsLayer$drawBlock$1;

    .line 15
    .line 16
    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 17
    .line 18
    new-instance v0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$clipDrawBlock$1;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Landroidx/compose/ui/graphics/layer/GraphicsLayer$clipDrawBlock$1;-><init>(Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Z

    .line 27
    .line 28
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    iput-wide v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:J

    .line 31
    .line 32
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    iput-wide v2, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:J

    .line 38
    .line 39
    new-instance v4, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 40
    .line 41
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v4, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-interface {p1, v4}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏(Z)V

    .line 48
    .line 49
    .line 50
    iput-wide v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 51
    .line 52
    iput-wide v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:J

    .line 53
    .line 54
    iput-wide v2, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:J

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(F)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-interface {p0}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    cmpg-float v0, v0, p1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲()Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲:Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    if-eqz v1, :cond_1

    .line 9
    .line 10
    new-instance v0, Landroidx/compose/ui/graphics/飘花落叶言子世苏兰楪哲;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子世苏兰楪哲;-><init>(Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲:Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    iget-wide v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:J

    .line 19
    .line 20
    invoke-static {v0, v1}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子苏哲楪兰世(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iget-wide v2, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:J

    .line 25
    .line 26
    iget-wide v4, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:J

    .line 27
    .line 28
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmp-long v6, v4, v6

    .line 34
    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-wide v0, v4

    .line 39
    :goto_0
    const/16 v4, 0x20

    .line 40
    .line 41
    shr-long v5, v2, v4

    .line 42
    .line 43
    long-to-int v5, v5

    .line 44
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    const-wide v7, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long/2addr v2, v7

    .line 54
    long-to-int v2, v2

    .line 55
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    shr-long v9, v0, v4

    .line 60
    .line 61
    long-to-int v3, v9

    .line 62
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    add-float/2addr v3, v6

    .line 67
    and-long/2addr v0, v7

    .line 68
    long-to-int v0, v0

    .line 69
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-float v9, v0, v2

    .line 74
    .line 75
    iget v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:F

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    cmpl-float v1, v0, v1

    .line 79
    .line 80
    if-lez v1, :cond_3

    .line 81
    .line 82
    new-instance v1, Landroidx/compose/ui/graphics/飘花落叶言子世哲楪苏兰;

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    int-to-long v10, v5

    .line 89
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    int-to-long v12, v0

    .line 94
    shl-long v4, v10, v4

    .line 95
    .line 96
    and-long/2addr v7, v12

    .line 97
    or-long v10, v4, v7

    .line 98
    .line 99
    move v7, v2

    .line 100
    move v8, v3

    .line 101
    invoke-static/range {v6 .. v11}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(FFFFJ)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {v1, v0}, Landroidx/compose/ui/graphics/飘花落叶言子世哲楪苏兰;-><init>(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    move v7, v2

    .line 110
    move v8, v3

    .line 111
    new-instance v1, Landroidx/compose/ui/graphics/飘花落叶言子世苏兰哲楪;

    .line 112
    .line 113
    new-instance v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 114
    .line 115
    invoke-direct {v0, v6, v7, v8, v9}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;-><init>(FFFF)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v1, v0}, Landroidx/compose/ui/graphics/飘花落叶言子世苏兰哲楪;-><init>(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;)V

    .line 119
    .line 120
    .line 121
    :goto_1
    iput-object v1, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲:Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;

    .line 122
    .line 123
    return-object v1
.end method

.method public final 飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V
    .locals 13

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    iput-object v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲苏兰()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    sget-object v2, Landroidx/collection/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 28
    .line 29
    new-instance v2, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 30
    .line 31
    invoke-direct {v2}, Landroidx/collection/飘花落叶言子世兰楪哲苏;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v2, v1}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏哲兰世(Landroidx/collection/飘花落叶言子苏世楪哲兰;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 40
    .line 41
    .line 42
    :cond_1
    const/4 v1, 0x1

    .line 43
    iput-boolean v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 44
    .line 45
    iget-object p0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 46
    .line 47
    invoke-interface {p0, p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    iput-boolean p0, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 52
    .line 53
    iget-object p1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget v1, p1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 60
    .line 61
    add-int/lit8 v1, v1, -0x1

    .line 62
    .line 63
    iput v1, p1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 64
    .line 65
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 66
    .line 67
    .line 68
    :cond_2
    iget-object p1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 71
    .line 72
    if-eqz p1, :cond_7

    .line 73
    .line 74
    invoke-virtual {p1}, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲苏兰()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_7

    .line 79
    .line 80
    iget-object v0, p1, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v1, p1, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:[J

    .line 83
    .line 84
    array-length v2, v1

    .line 85
    add-int/lit8 v2, v2, -0x2

    .line 86
    .line 87
    if-ltz v2, :cond_6

    .line 88
    .line 89
    move v3, p0

    .line 90
    :goto_0
    aget-wide v4, v1, v3

    .line 91
    .line 92
    not-long v6, v4

    .line 93
    const/4 v8, 0x7

    .line 94
    shl-long/2addr v6, v8

    .line 95
    and-long/2addr v6, v4

    .line 96
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    and-long/2addr v6, v8

    .line 102
    cmp-long v6, v6, v8

    .line 103
    .line 104
    if-eqz v6, :cond_5

    .line 105
    .line 106
    sub-int v6, v3, v2

    .line 107
    .line 108
    not-int v6, v6

    .line 109
    ushr-int/lit8 v6, v6, 0x1f

    .line 110
    .line 111
    const/16 v7, 0x8

    .line 112
    .line 113
    rsub-int/lit8 v6, v6, 0x8

    .line 114
    .line 115
    move v8, p0

    .line 116
    :goto_1
    if-ge v8, v6, :cond_4

    .line 117
    .line 118
    const-wide/16 v9, 0xff

    .line 119
    .line 120
    and-long/2addr v9, v4

    .line 121
    const-wide/16 v11, 0x80

    .line 122
    .line 123
    cmp-long v9, v9, v11

    .line 124
    .line 125
    if-gez v9, :cond_3

    .line 126
    .line 127
    shl-int/lit8 v9, v3, 0x3

    .line 128
    .line 129
    add-int/2addr v9, v8

    .line 130
    aget-object v9, v0, v9

    .line 131
    .line 132
    check-cast v9, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 133
    .line 134
    iget v10, v9, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 135
    .line 136
    add-int/lit8 v10, v10, -0x1

    .line 137
    .line 138
    iput v10, v9, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 139
    .line 140
    invoke-virtual {v9}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 141
    .line 142
    .line 143
    :cond_3
    shr-long/2addr v4, v7

    .line 144
    add-int/lit8 v8, v8, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    if-ne v6, v7, :cond_6

    .line 148
    .line 149
    :cond_5
    if-eq v3, v2, :cond_6

    .line 150
    .line 151
    add-int/lit8 v3, v3, 0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_6
    invoke-virtual {p1}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 155
    .line 156
    .line 157
    :cond_7
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-boolean v3, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    goto/16 :goto_9

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    invoke-interface {v3}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_1

    .line 23
    .line 24
    :try_start_0
    iget-object v4, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 25
    .line 26
    iget-object v5, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/unit/LayoutDirection;

    .line 27
    .line 28
    iget-object v6, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 29
    .line 30
    invoke-interface {v3, v4, v5, v0, v6}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    :catchall_0
    :cond_1
    invoke-interface {v3}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子世苏兰哲楪()F

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/4 v5, 0x0

    .line 38
    cmpl-float v4, v4, v5

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    if-lez v4, :cond_2

    .line 42
    .line 43
    move v4, v5

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v4, 0x0

    .line 46
    :goto_0
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-interface {v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世苏哲()V

    .line 49
    .line 50
    .line 51
    :cond_3
    invoke-static {v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)Landroid/graphics/Canvas;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v7}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    if-nez v13, :cond_7

    .line 60
    .line 61
    iget-wide v8, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 62
    .line 63
    const/16 v10, 0x20

    .line 64
    .line 65
    shr-long v11, v8, v10

    .line 66
    .line 67
    long-to-int v11, v11

    .line 68
    int-to-float v11, v11

    .line 69
    const-wide v14, 0xffffffffL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    and-long/2addr v8, v14

    .line 75
    long-to-int v8, v8

    .line 76
    int-to-float v9, v8

    .line 77
    move-object v8, v7

    .line 78
    iget-wide v6, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:J

    .line 79
    .line 80
    move-wide/from16 v17, v14

    .line 81
    .line 82
    shr-long v14, v6, v10

    .line 83
    .line 84
    long-to-int v10, v14

    .line 85
    int-to-float v10, v10

    .line 86
    add-float/2addr v10, v11

    .line 87
    and-long v6, v6, v17

    .line 88
    .line 89
    long-to-int v6, v6

    .line 90
    int-to-float v6, v6

    .line 91
    add-float/2addr v6, v9

    .line 92
    invoke-interface {v3}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()F

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    invoke-interface {v3}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世()Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    invoke-interface {v3}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子世哲苏兰楪()I

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    const/high16 v15, 0x3f800000    # 1.0f

    .line 105
    .line 106
    cmpg-float v15, v7, v15

    .line 107
    .line 108
    if-ltz v15, :cond_5

    .line 109
    .line 110
    const/4 v15, 0x3

    .line 111
    if-ne v14, v15, :cond_5

    .line 112
    .line 113
    if-nez v12, :cond_5

    .line 114
    .line 115
    invoke-interface {v3}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世()I

    .line 116
    .line 117
    .line 118
    move-result v15

    .line 119
    if-ne v15, v5, :cond_4

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    invoke-virtual {v8}, Landroid/graphics/Canvas;->save()I

    .line 123
    .line 124
    .line 125
    move-object v7, v8

    .line 126
    move v8, v11

    .line 127
    goto :goto_2

    .line 128
    :cond_5
    :goto_1
    iget-object v15, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/飘花落叶言子楪苏世兰哲;

    .line 129
    .line 130
    if-nez v15, :cond_6

    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世兰哲()Landroidx/compose/ui/graphics/飘花落叶言子楪苏世兰哲;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    iput-object v15, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/飘花落叶言子楪苏世兰哲;

    .line 137
    .line 138
    :cond_6
    invoke-virtual {v15, v7}, Landroidx/compose/ui/graphics/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(F)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v15, v14}, Landroidx/compose/ui/graphics/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v15, v12}, Landroidx/compose/ui/graphics/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;)V

    .line 145
    .line 146
    .line 147
    iget-object v7, v15, Landroidx/compose/ui/graphics/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 148
    .line 149
    move-object v12, v7

    .line 150
    check-cast v12, Landroid/graphics/Paint;

    .line 151
    .line 152
    move-object v7, v8

    .line 153
    move v8, v11

    .line 154
    move v11, v6

    .line 155
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 156
    .line 157
    .line 158
    :goto_2
    invoke-virtual {v7, v8, v9}, Landroid/graphics/Canvas;->translate(FF)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v3}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子世苏哲兰楪()Landroid/graphics/Matrix;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v7, v6}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 166
    .line 167
    .line 168
    :cond_7
    if-nez v13, :cond_8

    .line 169
    .line 170
    iget-boolean v6, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:Z

    .line 171
    .line 172
    if-eqz v6, :cond_8

    .line 173
    .line 174
    move v6, v5

    .line 175
    goto :goto_3

    .line 176
    :cond_8
    const/4 v6, 0x0

    .line 177
    :goto_3
    if-eqz v6, :cond_d

    .line 178
    .line 179
    invoke-interface {v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世兰哲苏()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    instance-of v9, v8, Landroidx/compose/ui/graphics/飘花落叶言子世苏兰哲楪;

    .line 187
    .line 188
    if-eqz v9, :cond_9

    .line 189
    .line 190
    check-cast v8, Landroidx/compose/ui/graphics/飘花落叶言子世苏兰哲楪;

    .line 191
    .line 192
    iget-object v8, v8, Landroidx/compose/ui/graphics/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世兰哲苏:L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 193
    .line 194
    invoke-static {v1, v8}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏世兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;)V

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_9
    instance-of v9, v8, Landroidx/compose/ui/graphics/飘花落叶言子世哲楪苏兰;

    .line 199
    .line 200
    if-eqz v9, :cond_b

    .line 201
    .line 202
    iget-object v9, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 203
    .line 204
    if-eqz v9, :cond_a

    .line 205
    .line 206
    iget-object v10, v9, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 207
    .line 208
    invoke-virtual {v10}, Landroid/graphics/Path;->rewind()V

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_a
    invoke-static {}, Landroidx/compose/ui/graphics/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    iput-object v9, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 217
    .line 218
    :goto_4
    check-cast v8, Landroidx/compose/ui/graphics/飘花落叶言子世哲楪苏兰;

    .line 219
    .line 220
    iget-object v8, v8, Landroidx/compose/ui/graphics/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;

    .line 221
    .line 222
    invoke-static {v9, v8}, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲兰苏;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v1, v9}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;)V

    .line 226
    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_b
    instance-of v9, v8, Landroidx/compose/ui/graphics/飘花落叶言子世苏兰楪哲;

    .line 230
    .line 231
    if-eqz v9, :cond_c

    .line 232
    .line 233
    check-cast v8, Landroidx/compose/ui/graphics/飘花落叶言子世苏兰楪哲;

    .line 234
    .line 235
    iget-object v8, v8, Landroidx/compose/ui/graphics/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 236
    .line 237
    invoke-interface {v1, v8}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;)V

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_c
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_d
    :goto_5
    if-eqz v2, :cond_13

    .line 246
    .line 247
    iget-object v2, v2, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 248
    .line 249
    iget-boolean v8, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 250
    .line 251
    if-nez v8, :cond_e

    .line 252
    .line 253
    const-string v8, "Only add dependencies during a tracking"

    .line 254
    .line 255
    invoke-static {v8}, Landroidx/compose/ui/graphics/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    :cond_e
    iget-object v8, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v8, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 261
    .line 262
    const/4 v9, 0x0

    .line 263
    if-eqz v8, :cond_f

    .line 264
    .line 265
    invoke-virtual {v8, v0}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_f
    iget-object v8, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v8, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 272
    .line 273
    if-eqz v8, :cond_10

    .line 274
    .line 275
    sget-object v8, Landroidx/collection/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 276
    .line 277
    new-instance v8, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 278
    .line 279
    invoke-direct {v8}, Landroidx/collection/飘花落叶言子世兰楪哲苏;-><init>()V

    .line 280
    .line 281
    .line 282
    iget-object v10, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v10, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 285
    .line 286
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v8, v10}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    invoke-virtual {v8, v0}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    iput-object v8, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v9, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_10
    iput-object v0, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 301
    .line 302
    :goto_6
    iget-object v8, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v8, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 305
    .line 306
    if-eqz v8, :cond_11

    .line 307
    .line 308
    invoke-virtual {v8, v0}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    xor-int/2addr v2, v5

    .line 313
    move/from16 v16, v2

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_11
    iget-object v8, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v8, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 319
    .line 320
    if-eq v8, v0, :cond_12

    .line 321
    .line 322
    move/from16 v16, v5

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_12
    iput-object v9, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 326
    .line 327
    const/16 v16, 0x0

    .line 328
    .line 329
    :goto_7
    if-eqz v16, :cond_13

    .line 330
    .line 331
    iget v2, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 332
    .line 333
    add-int/2addr v2, v5

    .line 334
    iput v2, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 335
    .line 336
    :cond_13
    move-object v2, v1

    .line 337
    check-cast v2, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;

    .line 338
    .line 339
    iget-object v2, v2, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Canvas;

    .line 340
    .line 341
    invoke-virtual {v2}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    if-nez v2, :cond_15

    .line 346
    .line 347
    iget-object v2, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 348
    .line 349
    if-nez v2, :cond_14

    .line 350
    .line 351
    new-instance v2, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 352
    .line 353
    invoke-direct {v2}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 354
    .line 355
    .line 356
    iput-object v2, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 357
    .line 358
    :cond_14
    iget-object v3, v2, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 359
    .line 360
    iget-object v5, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 361
    .line 362
    iget-object v8, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/unit/LayoutDirection;

    .line 363
    .line 364
    iget-wide v9, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:J

    .line 365
    .line 366
    invoke-static {v9, v10}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子苏哲楪兰世(J)J

    .line 367
    .line 368
    .line 369
    move-result-wide v9

    .line 370
    invoke-virtual {v3}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰苏世哲()L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 371
    .line 372
    .line 373
    move-result-object v11

    .line 374
    invoke-virtual {v3}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世楪苏兰哲()Landroidx/compose/ui/unit/LayoutDirection;

    .line 375
    .line 376
    .line 377
    move-result-object v12

    .line 378
    invoke-virtual {v3}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世()Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;

    .line 379
    .line 380
    .line 381
    move-result-object v14

    .line 382
    move/from16 v16, v6

    .line 383
    .line 384
    move-object v15, v7

    .line 385
    invoke-virtual {v3}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世楪哲兰苏()J

    .line 386
    .line 387
    .line 388
    move-result-wide v6

    .line 389
    move/from16 v17, v4

    .line 390
    .line 391
    iget-object v4, v3, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v4, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 394
    .line 395
    invoke-virtual {v3, v5}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏兰楪(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v3, v8}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰楪苏(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v3, v1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏楪兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v3, v9, v10}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰苏楪(J)V

    .line 405
    .line 406
    .line 407
    iput-object v0, v3, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 408
    .line 409
    invoke-interface {v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世兰哲苏()V

    .line 410
    .line 411
    .line 412
    :try_start_1
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 413
    .line 414
    .line 415
    invoke-interface {v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3, v11}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏兰楪(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v3, v12}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰楪苏(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v3, v14}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏楪兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v3, v6, v7}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰苏楪(J)V

    .line 428
    .line 429
    .line 430
    iput-object v4, v3, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 431
    .line 432
    goto :goto_8

    .line 433
    :catchall_1
    move-exception v0

    .line 434
    invoke-interface {v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世()V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v3, v11}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏兰楪(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v3, v12}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰楪苏(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v3, v14}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏楪兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3, v6, v7}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰苏楪(J)V

    .line 447
    .line 448
    .line 449
    iput-object v4, v3, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 450
    .line 451
    throw v0

    .line 452
    :cond_15
    move/from16 v17, v4

    .line 453
    .line 454
    move/from16 v16, v6

    .line 455
    .line 456
    move-object v15, v7

    .line 457
    invoke-interface {v3, v1}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子世哲兰楪苏(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)V

    .line 458
    .line 459
    .line 460
    :goto_8
    if-eqz v16, :cond_16

    .line 461
    .line 462
    invoke-interface {v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世()V

    .line 463
    .line 464
    .line 465
    :cond_16
    if-eqz v17, :cond_17

    .line 466
    .line 467
    invoke-interface {v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世哲兰()V

    .line 468
    .line 469
    .line 470
    :cond_17
    if-nez v13, :cond_18

    .line 471
    .line 472
    invoke-virtual {v15}, Landroid/graphics/Canvas;->restore()V

    .line 473
    .line 474
    .line 475
    :cond_18
    :goto_9
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 15

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 10
    .line 11
    iget-object v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget v2, v1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 18
    .line 19
    add-int/lit8 v2, v2, -0x1

    .line 20
    .line 21
    iput v2, v1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 22
    .line 23
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_0
    iget-object v0, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroidx/collection/飘花落叶言子世兰楪哲苏;

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    iget-object v1, v0, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v0, Landroidx/collection/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:[J

    .line 38
    .line 39
    array-length v3, v2

    .line 40
    add-int/lit8 v3, v3, -0x2

    .line 41
    .line 42
    if-ltz v3, :cond_4

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    move v5, v4

    .line 46
    :goto_0
    aget-wide v6, v2, v5

    .line 47
    .line 48
    not-long v8, v6

    .line 49
    const/4 v10, 0x7

    .line 50
    shl-long/2addr v8, v10

    .line 51
    and-long/2addr v8, v6

    .line 52
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v8, v10

    .line 58
    cmp-long v8, v8, v10

    .line 59
    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    sub-int v8, v5, v3

    .line 63
    .line 64
    not-int v8, v8

    .line 65
    ushr-int/lit8 v8, v8, 0x1f

    .line 66
    .line 67
    const/16 v9, 0x8

    .line 68
    .line 69
    rsub-int/lit8 v8, v8, 0x8

    .line 70
    .line 71
    move v10, v4

    .line 72
    :goto_1
    if-ge v10, v8, :cond_2

    .line 73
    .line 74
    const-wide/16 v11, 0xff

    .line 75
    .line 76
    and-long/2addr v11, v6

    .line 77
    const-wide/16 v13, 0x80

    .line 78
    .line 79
    cmp-long v11, v11, v13

    .line 80
    .line 81
    if-gez v11, :cond_1

    .line 82
    .line 83
    shl-int/lit8 v11, v5, 0x3

    .line 84
    .line 85
    add-int/2addr v11, v10

    .line 86
    aget-object v11, v1, v11

    .line 87
    .line 88
    check-cast v11, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 89
    .line 90
    iget v12, v11, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 91
    .line 92
    add-int/lit8 v12, v12, -0x1

    .line 93
    .line 94
    iput v12, v11, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 95
    .line 96
    invoke-virtual {v11}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 97
    .line 98
    .line 99
    :cond_1
    shr-long/2addr v6, v9

    .line 100
    add-int/lit8 v10, v10, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    if-ne v8, v9, :cond_4

    .line 104
    .line 105
    :cond_3
    if-eq v5, v3, :cond_4

    .line 106
    .line 107
    add-int/lit8 v5, v5, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    invoke-virtual {v0}, Landroidx/collection/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲()V

    .line 111
    .line 112
    .line 113
    :cond_5
    iget-object p0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;

    .line 114
    .line 115
    invoke-interface {p0}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰()V

    .line 116
    .line 117
    .line 118
    :cond_6
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_10

    .line 7
    .line 8
    iget-boolean v1, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:Z

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    iget-object v4, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v4}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子世苏兰哲楪()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v5, 0x0

    .line 20
    cmpl-float v1, v1, v5

    .line 21
    .line 22
    if-lez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v4, v2}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏(Z)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    invoke-interface {v4, v3, v5, v6}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Landroid/graphics/Outline;J)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget-object v1, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 36
    .line 37
    const-wide v5, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/16 v7, 0x20

    .line 43
    .line 44
    if-eqz v1, :cond_d

    .line 45
    .line 46
    iget-object v8, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:Landroid/graphics/RectF;

    .line 47
    .line 48
    if-nez v8, :cond_2

    .line 49
    .line 50
    new-instance v8, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v8, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:Landroid/graphics/RectF;

    .line 56
    .line 57
    :cond_2
    instance-of v9, v1, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 58
    .line 59
    const-string v10, "Unable to obtain android.graphics.Path"

    .line 60
    .line 61
    if-eqz v9, :cond_c

    .line 62
    .line 63
    iget-object v11, v1, Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Path;

    .line 64
    .line 65
    invoke-virtual {v11, v8, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 66
    .line 67
    .line 68
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    const/16 v13, 0x1c

    .line 71
    .line 72
    const/4 v14, 0x1

    .line 73
    if-gt v12, v13, :cond_5

    .line 74
    .line 75
    invoke-virtual {v11}, Landroid/graphics/Path;->isConvex()Z

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    if-eqz v13, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    iget-object v9, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/graphics/Outline;

    .line 83
    .line 84
    if-eqz v9, :cond_4

    .line 85
    .line 86
    invoke-virtual {v9}, Landroid/graphics/Outline;->setEmpty()V

    .line 87
    .line 88
    .line 89
    :cond_4
    iput-boolean v14, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:Z

    .line 90
    .line 91
    move-object v13, v3

    .line 92
    goto :goto_3

    .line 93
    :cond_5
    :goto_1
    iget-object v13, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/graphics/Outline;

    .line 94
    .line 95
    if-nez v13, :cond_6

    .line 96
    .line 97
    new-instance v13, Landroid/graphics/Outline;

    .line 98
    .line 99
    invoke-direct {v13}, Landroid/graphics/Outline;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v13, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/graphics/Outline;

    .line 103
    .line 104
    :cond_6
    const/16 v15, 0x1e

    .line 105
    .line 106
    if-lt v12, v15, :cond_8

    .line 107
    .line 108
    if-eqz v9, :cond_7

    .line 109
    .line 110
    invoke-static {v13, v11}, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪哲苏世兰(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_7
    invoke-static {v10}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_8
    if-eqz v9, :cond_b

    .line 119
    .line 120
    invoke-virtual {v13, v11}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-virtual {v13}, Landroid/graphics/Outline;->canClip()Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    xor-int/2addr v9, v14

    .line 128
    iput-boolean v9, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:Z

    .line 129
    .line 130
    :goto_3
    iput-object v1, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 131
    .line 132
    if-eqz v13, :cond_9

    .line 133
    .line 134
    invoke-interface {v4}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()F

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-virtual {v13, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 139
    .line 140
    .line 141
    move-object v3, v13

    .line 142
    :cond_9
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    int-to-long v9, v1

    .line 159
    shl-long/2addr v9, v7

    .line 160
    int-to-long v7, v8

    .line 161
    and-long/2addr v5, v7

    .line 162
    or-long/2addr v5, v9

    .line 163
    invoke-interface {v4, v3, v5, v6}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Landroid/graphics/Outline;J)V

    .line 164
    .line 165
    .line 166
    iget-boolean v1, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:Z

    .line 167
    .line 168
    if-eqz v1, :cond_a

    .line 169
    .line 170
    iget-boolean v1, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:Z

    .line 171
    .line 172
    if-eqz v1, :cond_a

    .line 173
    .line 174
    invoke-interface {v4, v2}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏(Z)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v4}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰()V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_5

    .line 181
    .line 182
    :cond_a
    iget-boolean v1, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:Z

    .line 183
    .line 184
    invoke-interface {v4, v1}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏(Z)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_5

    .line 188
    .line 189
    :cond_b
    invoke-static {v10}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_c
    invoke-static {v10}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_d
    iget-boolean v1, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:Z

    .line 198
    .line 199
    invoke-interface {v4, v1}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏(Z)V

    .line 200
    .line 201
    .line 202
    iget-object v1, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/graphics/Outline;

    .line 203
    .line 204
    if-nez v1, :cond_e

    .line 205
    .line 206
    new-instance v1, Landroid/graphics/Outline;

    .line 207
    .line 208
    invoke-direct {v1}, Landroid/graphics/Outline;-><init>()V

    .line 209
    .line 210
    .line 211
    iput-object v1, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/graphics/Outline;

    .line 212
    .line 213
    :cond_e
    move-object v8, v1

    .line 214
    iget-wide v9, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:J

    .line 215
    .line 216
    invoke-static {v9, v10}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子苏哲楪兰世(J)J

    .line 217
    .line 218
    .line 219
    move-result-wide v9

    .line 220
    iget-wide v11, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:J

    .line 221
    .line 222
    iget-wide v13, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:J

    .line 223
    .line 224
    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    cmp-long v1, v13, v15

    .line 230
    .line 231
    if-nez v1, :cond_f

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_f
    move-wide v9, v13

    .line 235
    :goto_4
    shr-long v13, v11, v7

    .line 236
    .line 237
    long-to-int v1, v13

    .line 238
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    and-long/2addr v11, v5

    .line 247
    long-to-int v11, v11

    .line 248
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 249
    .line 250
    .line 251
    move-result v12

    .line 252
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 253
    .line 254
    .line 255
    move-result v12

    .line 256
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    shr-long v13, v9, v7

    .line 261
    .line 262
    long-to-int v14, v13

    .line 263
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 264
    .line 265
    .line 266
    move-result v13

    .line 267
    add-float/2addr v13, v1

    .line 268
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    and-long/2addr v9, v5

    .line 277
    long-to-int v15, v9

    .line 278
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    add-float/2addr v9, v11

    .line 283
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 284
    .line 285
    .line 286
    move-result v9

    .line 287
    iget v13, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:F

    .line 288
    .line 289
    move v11, v1

    .line 290
    move v10, v12

    .line 291
    move v12, v9

    .line 292
    move v9, v3

    .line 293
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v4}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()F

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    invoke-virtual {v8, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 301
    .line 302
    .line 303
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    int-to-long v9, v1

    .line 320
    shl-long/2addr v9, v7

    .line 321
    int-to-long v11, v3

    .line 322
    and-long/2addr v5, v11

    .line 323
    or-long/2addr v5, v9

    .line 324
    invoke-interface {v4, v8, v5, v6}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Landroid/graphics/Outline;J)V

    .line 325
    .line 326
    .line 327
    :cond_10
    :goto_5
    iput-boolean v2, v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Z

    .line 328
    .line 329
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(FJJ)V
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:J

    .line 2
    .line 3
    invoke-static {v0, v1, p2, p3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:J

    .line 10
    .line 11
    invoke-static {v0, v1, p4, p5}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:F

    .line 18
    .line 19
    cmpg-float v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲:Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;

    .line 31
    .line 32
    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:Landroidx/compose/ui/graphics/飘花落叶言子楪苏哲兰世;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Z

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:Z

    .line 39
    .line 40
    iput-wide p2, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:J

    .line 41
    .line 42
    iput-wide p4, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:J

    .line 43
    .line 44
    iput p1, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:F

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 47
    .line 48
    .line 49
    return-void
.end method
