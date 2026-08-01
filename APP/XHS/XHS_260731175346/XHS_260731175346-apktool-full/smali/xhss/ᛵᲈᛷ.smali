.class public final Lxhss/ᛵᲈᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public final ᛷᛴᛷᛱ:Ljava/lang/Object;

.field public final ᛷᛵᛵᲈ:Lxhss/ᲀᛲᲇ;

.field public ᛸᛴᛶᛳ:I

.field public final ᲀᲇᛳᲁ:Z

.field public final ᲇᛴᲇᛵ:Lxhss/ᛴᲇᲀᛴ;

.field public final ᲇᛶᛴᲀ:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛷᲀᛴᛲ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lxhss/ᛴᲇᲀᛴ;Ljava/lang/Object;Lxhss/ᲀᛲᲇ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᛵᲈᛷ;->ᲇᛶᛴᲀ:Ljava/util/HashMap;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lxhss/ᛵᲈᛷ;->ᛸᛴᛶᛳ:I

    .line 13
    .line 14
    const-string v0, "root can not be null"

    .line 15
    .line 16
    invoke-static {p2, v0}, Lxhss/ᛵᛵᛲᲈ;->ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "configuration can not be null"

    .line 20
    .line 21
    invoke-static {p3, v0}, Lxhss/ᛵᛵᛲᲈ;->ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lxhss/ᛵᲈᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛴᲇᲀᛴ;

    .line 25
    .line 26
    iput-object p2, p0, Lxhss/ᛵᲈᛷ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object p3, p0, Lxhss/ᛵᲈᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛲᲇ;

    .line 29
    .line 30
    iget-object p1, p3, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 31
    .line 32
    iget-object p2, p1, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p2, Lxhss/ᛸᛵᛷᲁ;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance p2, Lxhss/ᛸᛱᲈᛵ;

    .line 40
    .line 41
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lxhss/ᛵᲈᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object p1, p1, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lxhss/ᛸᛵᛷᲁ;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance p1, Lxhss/ᛸᛱᲈᛵ;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lxhss/ᛵᲈᛷ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 59
    .line 60
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    sget-object p1, Lxhss/ᛳᛳᛱᛳ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛳᛱᛳ;

    .line 66
    .line 67
    iget-object p2, p3, Lxhss/ᲀᛲᲇ;->ᛳᲁᲇᛸ:Ljava/util/Set;

    .line 68
    .line 69
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iput-boolean p1, p0, Lxhss/ᛵᲈᛷ;->ᲀᲇᛳᲁ:Z

    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lxhss/ᛵᲈᛷ;->ᛸᛴᛶᛳ:I

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lxhss/ᛵᲈᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛲᲇ;

    .line 11
    .line 12
    iget-object v1, v1, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 13
    .line 14
    iget-object p0, p0, Lxhss/ᛵᲈᛷ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛲᛷᛱ(Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-object v0
.end method

.method public final ᛳᲁᲇᛸ(Z)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛵᲈᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛴᲇᲀᛴ;

    .line 2
    .line 3
    iget-object v0, v0, Lxhss/ᛴᲇᲀᛴ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛷᲈᛳ;

    .line 4
    .line 5
    invoke-virtual {v0}, Lxhss/ᛳᛳᛵᛱ;->ᲇᛶᛴᲀ()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lxhss/ᛵᲈᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    iget v1, p0, Lxhss/ᛵᲈᛷ;->ᛸᛴᛶᛳ:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-boolean p0, p0, Lxhss/ᛵᲈᛷ;->ᲀᲇᛳᲁ:Z

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    return-object v3

    .line 23
    :cond_0
    new-instance p0, Lxhss/ᛸᲁᛴᛷ;

    .line 24
    .line 25
    invoke-virtual {v0}, Lxhss/ᛳᛳᛵᛱ;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "No results for path: "

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_1
    iget-object p0, p0, Lxhss/ᛵᲈᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛲᲇ;

    .line 48
    .line 49
    iget-object v0, p0, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 50
    .line 51
    iget-object p0, p0, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lxhss/ᲇᛵᛲᲁ;->ᲇᛸᛳᲁ(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-lez v0, :cond_2

    .line 58
    .line 59
    add-int/lit8 v0, v0, -0x1

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    check-cast v2, Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    :cond_2
    if-eqz v3, :cond_3

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    :cond_3
    return-object v3

    .line 78
    :cond_4
    return-object v2
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lxhss/ᛵᲈᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛲᲇ;

    .line 2
    .line 3
    iget-object v0, p2, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 4
    .line 5
    iget v1, p0, Lxhss/ᛵᲈᛷ;->ᛸᛴᛶᛳ:I

    .line 6
    .line 7
    iget-object v2, p0, Lxhss/ᛵᲈᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, p3}, Lxhss/ᲇᛵᛲᲁ;->ᛶᲇᲈᛸ(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p3, p2, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 13
    .line 14
    iget v0, p0, Lxhss/ᛵᲈᛷ;->ᛸᛴᛶᛳ:I

    .line 15
    .line 16
    iget-object v1, p0, Lxhss/ᛵᲈᛷ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p3, v0, v1, p1}, Lxhss/ᲇᛵᛲᲁ;->ᛶᲇᲈᛸ(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget p1, p0, Lxhss/ᛵᲈᛷ;->ᛸᛴᛶᛳ:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    iput p1, p0, Lxhss/ᛵᲈᛷ;->ᛸᛴᛶᛳ:I

    .line 26
    .line 27
    iget-object p0, p2, Lxhss/ᲀᛲᲇ;->ᲇᛴᲇᛵ:Ljava/util/Collection;

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance p0, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_1
    :goto_0
    return-void
.end method
