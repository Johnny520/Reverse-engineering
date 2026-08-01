.class public final Landroidx/compose/runtime/internal/α;
.super Lga1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lco;


# static fields
.field public static final θ:Landroidx/compose/runtime/internal/α;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/runtime/internal/α;

    .line 2
    .line 3
    sget-object v1, Lz52;->ε:Lz52;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lga1;-><init>(Lz52;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroidx/compose/runtime/internal/α;->θ:Landroidx/compose/runtime/internal/α;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lak1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lak1;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lga1;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Li72;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Li72;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lga1;->containsValue(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lak1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    check-cast p1, Lak1;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lga1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Li72;

    .line 14
    .line 15
    return-object p0
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lak1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p2

    .line 6
    :cond_0
    check-cast p1, Lak1;

    .line 7
    .line 8
    check-cast p2, Li72;

    .line 9
    .line 10
    invoke-super {p0, p1, p2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Li72;

    .line 15
    .line 16
    return-object p0
.end method

.method public final β(Lak1;Li72;)Landroidx/compose/runtime/internal/α;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lga1;->ε:Lz52;

    .line 7
    .line 8
    invoke-virtual {v2, v0, v1, p1, p2}, Lz52;->φ(IILjava/lang/Object;Ljava/lang/Object;)Lv;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance p2, Landroidx/compose/runtime/internal/α;

    .line 16
    .line 17
    iget-object v0, p1, Lv;->β:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lz52;

    .line 20
    .line 21
    iget p0, p0, Lga1;->ζ:I

    .line 22
    .line 23
    iget p1, p1, Lv;->α:I

    .line 24
    .line 25
    add-int/2addr p0, p1

    .line 26
    invoke-direct {p2, v0, p0}, Lga1;-><init>(Lz52;I)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method
