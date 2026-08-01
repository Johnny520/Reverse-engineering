.class public Lxhss/ᛵᛸᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛵᛵᲈ:Lxhss/ᲀᛳᛲᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x24

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lxhss/ᛶᛴᛳᛷ;

    .line 8
    .line 9
    invoke-direct {v0}, Lxhss/ᛶᛴᛳᛷ;-><init>()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v1, 0x23

    .line 14
    .line 15
    if-lt v0, v1, :cond_1

    .line 16
    .line 17
    new-instance v0, Lxhss/ᲈᲁᛳᛱ;

    .line 18
    .line 19
    invoke-direct {v0}, Lxhss/ᲈᲁᛳᛱ;-><init>()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/16 v1, 0x22

    .line 24
    .line 25
    if-lt v0, v1, :cond_2

    .line 26
    .line 27
    new-instance v0, Lxhss/ᛸᲀᛴᲀ;

    .line 28
    .line 29
    invoke-direct {v0}, Lxhss/ᛸᲀᛴᲀ;-><init>()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/16 v1, 0x1f

    .line 34
    .line 35
    if-lt v0, v1, :cond_3

    .line 36
    .line 37
    new-instance v0, Lxhss/ᛱᲁᛱᛲ;

    .line 38
    .line 39
    invoke-direct {v0}, Lxhss/ᛱᲁᛱᛲ;-><init>()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    new-instance v0, Lxhss/ᲁᛷᲇᛷ;

    .line 44
    .line 45
    invoke-direct {v0}, Lxhss/ᲁᛷᲇᛷ;-><init>()V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {v0}, Lxhss/ᛳᛳᛲᲁ;->ᛱᛱᛲᲇ()Lxhss/ᲀᛳᛲᛶ;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 53
    .line 54
    invoke-virtual {v0}, Lxhss/ᛵᛸᛱ;->ᛷᛵᛵᲈ()Lxhss/ᲀᛳᛲᛶ;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v0, v0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 59
    .line 60
    invoke-virtual {v0}, Lxhss/ᛵᛸᛱ;->ᛱᛱᛲᲇ()Lxhss/ᲀᛳᛲᛶ;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v0, v0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 65
    .line 66
    invoke-virtual {v0}, Lxhss/ᛵᛸᛱ;->ᛳᲁᲇᛸ()Lxhss/ᲀᛳᛲᛶ;

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public constructor <init>(Lxhss/ᲀᛳᛲᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛵᛸᛱ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛳᛲᛶ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
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
    instance-of v1, p1, Lxhss/ᛵᛸᛱ;

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
    check-cast p1, Lxhss/ᛵᛸᛱ;

    .line 12
    .line 13
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->ᲇᛸᛳᲁ()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p1}, Lxhss/ᛵᛸᛱ;->ᲇᛸᛳᲁ()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ne v1, v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->ᛸᛶᲈᛶ()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, Lxhss/ᛵᛸᛱ;->ᛸᛶᲈᛶ()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-ne v1, v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->ᛸᛷᲈᲈ()Lxhss/ᲀᲈᲈᛸ;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1}, Lxhss/ᛵᛸᛱ;->ᛸᛷᲈᲈ()Lxhss/ᲀᲈᲈᛸ;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->ᛸᛲᲀᛵ()Lxhss/ᲀᲈᲈᛸ;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1}, Lxhss/ᛵᛸᛱ;->ᛸᛲᲀᛵ()Lxhss/ᲀᲈᲈᛸ;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->ᲀᲇᛳᲁ()Lxhss/ᛷᛵᛳᛸ;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p1}, Lxhss/ᛵᛸᛱ;->ᲀᲇᛳᲁ()Lxhss/ᛷᛵᛳᛸ;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    return v0

    .line 76
    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->ᲇᛸᛳᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->ᛸᛶᲈᛶ()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->ᛸᛷᲈᲈ()Lxhss/ᲀᲈᲈᛸ;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->ᛸᛲᲀᛵ()Lxhss/ᲀᲈᲈᛸ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->ᲀᲇᛳᲁ()Lxhss/ᛷᛵᛳᛸ;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public ᛱᛱᛲᲇ()Lxhss/ᲀᛳᛲᛶ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛸᛱ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛳᛲᛶ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛳᛶᛷᲀ([[Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛳᲁᲇᛸ()Lxhss/ᲀᛳᛲᛶ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛸᛱ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛳᛲᛶ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛳᲈᲈᛲ(I)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public ᛴᲈᛱᛴ(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛶᲇᲈᛸ(Lxhss/ᛸᲇᲈᛴ;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛷᛴᛷᛱ(I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛷᛵᛵᲈ()Lxhss/ᲀᛳᛲᛶ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛸᛱ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛳᛲᛶ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛷᲁᲁ()V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛸᛲᛷᛱ(Lxhss/ᲀᛳᛲᛶ;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛸᛲᲀᛵ()Lxhss/ᲀᲈᲈᛸ;
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᲀᲈᲈᛸ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲈᲈᛸ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛸᛴᛶᛳ(I)Lxhss/ᲀᲈᲈᛸ;
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᲀᲈᲈᛸ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲈᲈᛸ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛸᛶᛴᲈ([Lxhss/ᲀᲈᲈᛸ;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛸᛶᲈᛶ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public ᛸᛷᲈᲈ()Lxhss/ᲀᲈᲈᛸ;
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᲀᲈᲈᛸ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲈᲈᛸ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᲀᲇᛳᲁ()Lxhss/ᛷᛵᛳᛸ;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public ᲁᛲᛴᛴ([[Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᲇᛴᲇᛵ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᲇᛶᛴᲀ(I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᲇᛸᛳᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public ᲈᛳᲀ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method
