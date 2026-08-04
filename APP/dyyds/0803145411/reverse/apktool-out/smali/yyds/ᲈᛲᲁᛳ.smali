.class public Lyyds/ᲈᛲᲁᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:Lyyds/ᲈᛶᲈᛴ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᲈᛶᲈᛴ;


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
    new-instance v0, Lyyds/ᛵᲀᲈᲁ;

    .line 8
    .line 9
    invoke-direct {v0}, Lyyds/ᛵᲀᲈᲁ;-><init>()V

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
    new-instance v0, Lyyds/ᛶᲇᲈᲇ;

    .line 18
    .line 19
    invoke-direct {v0}, Lyyds/ᛶᲇᲈᲇ;-><init>()V

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
    new-instance v0, Lyyds/ᛴᛵ;

    .line 28
    .line 29
    invoke-direct {v0}, Lyyds/ᛴᛵ;-><init>()V

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
    new-instance v0, Lyyds/ᛶᛴ;

    .line 38
    .line 39
    invoke-direct {v0}, Lyyds/ᛶᛴ;-><init>()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    new-instance v0, Lyyds/ᛶᛷᛱ;

    .line 44
    .line 45
    invoke-direct {v0}, Lyyds/ᛶᛷᛱ;-><init>()V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {v0}, Lyyds/ᲀᛳᲇᛱ;->ᛵᛸᛸᛷ()Lyyds/ᲈᛶᲈᛴ;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 53
    .line 54
    invoke-virtual {v0}, Lyyds/ᲈᛲᲁᛳ;->ᛲᲈᲁ()Lyyds/ᲈᛶᲈᛴ;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v0, v0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 59
    .line 60
    invoke-virtual {v0}, Lyyds/ᲈᛲᲁᛳ;->ᛵᛸᛸᛷ()Lyyds/ᲈᛶᲈᛴ;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v0, v0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 65
    .line 66
    invoke-virtual {v0}, Lyyds/ᲈᛲᲁᛳ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛶᲈᛴ;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sput-object v0, Lyyds/ᲈᛲᲁᛳ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛶᲈᛴ;

    .line 71
    .line 72
    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᛶᲈᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛲᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᲈᛴ;

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
    instance-of v1, p1, Lyyds/ᲈᛲᲁᛳ;

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
    check-cast p1, Lyyds/ᲈᛲᲁᛳ;

    .line 12
    .line 13
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛳᲁᲁᲇ()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p1}, Lyyds/ᲈᛲᲁᛳ;->ᛳᲁᲁᲇ()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ne v1, v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛱᛳᲇ()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, Lyyds/ᲈᛲᲁᛳ;->ᛱᛳᲇ()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-ne v1, v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

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
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛲᛳᛶᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1}, Lyyds/ᲈᛲᲁᛳ;->ᛲᛳᛶᲁ()Lyyds/ᛸᲀᲁᛲ;

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
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛶᛷᛲᲁ()Lyyds/ᛳᛱᛶᛵ;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p1}, Lyyds/ᲈᛲᲁᛳ;->ᛶᛷᛲᲁ()Lyyds/ᛳᛱᛶᛵ;

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
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛳᲁᲁᲇ()Z

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
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛱᛳᲇ()Z

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
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛲᛳᛶᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛶᛷᛲᲁ()Lyyds/ᛳᛱᛶᛵ;

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

.method public ᛱᛳᲇ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public ᛱᲈᲁ(I)Lyyds/ᛸᲀᲁᛲ;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᛸᲀᲁᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛸᲀᲁᛲ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛲᛲᲈᲈ(IIII)Lyyds/ᲈᛶᲈᛴ;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᲈᛲᲁᛳ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛶᲈᛴ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛲᛳᛶᲁ()Lyyds/ᛸᲀᲁᛲ;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᛸᲀᲁᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛸᲀᲁᛲ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛲᛴᛳᛲ(I)Ljava/util/List;
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

.method public ᛲᲈᲁ()Lyyds/ᲈᛶᲈᛴ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛲᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᲈᛴ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛳᛸᛴᛶ(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛳᲁᲁᲇ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public ᛵᛶᛲᲀ([Lyyds/ᛸᲀᲁᛲ;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛵᛸᛸᛷ()Lyyds/ᲈᛶᲈᛴ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛲᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᲈᛴ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛶᛳᛶᛵ(Lyyds/ᛱᛳᲇᛴ;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛶᛷᛲᲁ()Lyyds/ᛳᛱᛶᛵ;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public ᛶᛸᲀᲁ([[Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛶᲈᛴᲈ([[Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛷᛲᲈᛱ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛷᛵᲇᲀ()V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᛸᲀᲁᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛸᲀᲁᛲ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᲀᛲᛲᲇ(Lyyds/ᲈᛶᲈᛴ;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᲀᛲᛳᲀ()Lyyds/ᲈᛶᲈᛴ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛲᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᲈᛴ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᲇᛱᛲ(I)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public ᲇᲇᲇᛱ(I)Ljava/util/List;
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

.method public ᲇᲈᛵᛷ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method
