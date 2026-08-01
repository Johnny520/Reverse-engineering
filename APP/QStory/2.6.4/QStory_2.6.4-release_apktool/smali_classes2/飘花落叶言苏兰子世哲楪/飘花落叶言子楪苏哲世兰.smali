.class public final L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ltop/yukonga/miuix/kmp/theme/ThemeColorSpec;

.field public final 飘花落叶言子楪世苏兰哲:Ltop/yukonga/miuix/kmp/theme/ThemePaletteStyle;

.field public final 飘花落叶言子楪世苏哲兰:J


# direct methods
.method public constructor <init>(JLtop/yukonga/miuix/kmp/theme/ThemePaletteStyle;Ltop/yukonga/miuix/kmp/theme/ThemeColorSpec;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:J

    .line 11
    .line 12
    iput-object p3, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ltop/yukonga/miuix/kmp/theme/ThemePaletteStyle;

    .line 13
    .line 14
    iput-object p4, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ltop/yukonga/miuix/kmp/theme/ThemeColorSpec;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;

    .line 12
    .line 13
    iget-wide v3, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:J

    .line 14
    .line 15
    iget-wide v5, p1, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:J

    .line 16
    .line 17
    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ltop/yukonga/miuix/kmp/theme/ThemePaletteStyle;

    .line 25
    .line 26
    iget-object v3, p1, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ltop/yukonga/miuix/kmp/theme/ThemePaletteStyle;

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object p0, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ltop/yukonga/miuix/kmp/theme/ThemeColorSpec;

    .line 32
    .line 33
    iget-object p1, p1, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ltop/yukonga/miuix/kmp/theme/ThemeColorSpec;

    .line 34
    .line 35
    if-eq p0, p1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    sget v0, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲世兰:I

    .line 2
    .line 3
    iget-wide v0, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ltop/yukonga/miuix/kmp/theme/ThemePaletteStyle;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object p0, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ltop/yukonga/miuix/kmp/theme/ThemeColorSpec;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-wide v0, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲世兰(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "SystemPaletteInfo(seedColor="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", paletteStyle="

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ltop/yukonga/miuix/kmp/theme/ThemePaletteStyle;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", colorSpec="

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, L飘花落叶言苏兰子世哲楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ltop/yukonga/miuix/kmp/theme/ThemeColorSpec;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, ")"

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
