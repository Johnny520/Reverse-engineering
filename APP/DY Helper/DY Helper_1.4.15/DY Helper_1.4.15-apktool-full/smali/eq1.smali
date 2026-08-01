.class public final Leq1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lhq1;


# instance fields
.field public final α:Ln5;

.field public β:Z

.field public γ:Landroid/os/Bundle;

.field public final δ:Lh22;


# direct methods
.method public constructor <init>(Ln5;Lr92;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Leq1;->α:Ln5;

    .line 8
    .line 9
    new-instance p1, Ldq1;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0, p2}, Ldq1;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance p2, Lh22;

    .line 16
    .line 17
    invoke-direct {p2, p1}, Lh22;-><init>(Lp70;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Leq1;->δ:Lh22;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final α()Landroid/os/Bundle;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ll91;

    .line 3
    .line 4
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, [Ll91;

    .line 9
    .line 10
    invoke-static {v1}, Ljx0;->κ([Ll91;)Landroid/os/Bundle;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Leq1;->γ:Landroid/os/Bundle;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v2, p0, Leq1;->δ:Lh22;

    .line 22
    .line 23
    invoke-virtual {v2}, Lh22;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lfq1;

    .line 28
    .line 29
    iget-object v2, v2, Lfq1;->β:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    iput-boolean v0, p0, Leq1;->β:Z

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Lzp1;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    throw p0
.end method
