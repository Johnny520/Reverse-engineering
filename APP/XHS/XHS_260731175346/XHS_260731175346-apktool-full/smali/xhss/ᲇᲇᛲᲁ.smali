.class public final Lxhss/ᲇᲇᛲᲁ;
.super Lxhss/ᛷᛵᲁᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:I

.field public final ᛷᛵᛵᲈ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxhss/ᲇᲇᛲᲁ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 24
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 25
    iput p1, p0, Lxhss/ᲇᲇᛲᲁ;->ᛱᛱᛲᲇ:I

    return-void
.end method

.method public constructor <init>(Lxhss/ᛷᛵᲁᲁ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᲇᲇᛲᲁ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    iput p1, p0, Lxhss/ᲇᲇᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lxhss/ᲇᲇᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    if-eq v1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq v1, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-ne v1, v0, :cond_0

    .line 11
    .line 12
    const-string v0, "||"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    throw p0

    .line 17
    :cond_1
    const-string v0, "!"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const-string v0, "&&"

    .line 21
    .line 22
    :goto_0
    const-string v1, " "

    .line 23
    .line 24
    invoke-static {v1, v0, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object p0, p0, Lxhss/ᲇᲇᛲᲁ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 29
    .line 30
    const-string v1, ""

    .line 31
    .line 32
    invoke-static {v0, v1, p0}, Lxhss/ᛵᛵᛲᲈ;->ᲇᛸᛳᲁ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v0, "("

    .line 37
    .line 38
    const-string v1, ")"

    .line 39
    .line 40
    invoke-static {v0, p0, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᲀᲇᛵ;)Z
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    iget-object v1, p0, Lxhss/ᲇᲇᛲᲁ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget p0, p0, Lxhss/ᲇᲇᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 7
    .line 8
    if-ne p0, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lxhss/ᛷᛵᲁᲁ;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Lxhss/ᛸᛷᲁᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲈᲀᲇᛵ;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-ne p0, v3, :cond_5

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lxhss/ᛷᛵᲁᲁ;

    .line 50
    .line 51
    invoke-interface {v0, p1}, Lxhss/ᛸᛷᲁᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲈᲀᲇᛵ;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    :cond_3
    return v2

    .line 58
    :cond_4
    :goto_0
    return v3

    .line 59
    :cond_5
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Lxhss/ᛷᛵᲁᲁ;

    .line 64
    .line 65
    invoke-interface {p0, p1}, Lxhss/ᛸᛷᲁᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲈᲀᲇᛵ;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    xor-int/2addr p0, v3

    .line 70
    return p0
.end method
