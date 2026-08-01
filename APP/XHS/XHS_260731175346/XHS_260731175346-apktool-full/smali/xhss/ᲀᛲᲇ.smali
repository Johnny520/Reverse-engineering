.class public final Lxhss/ᲀᛲᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛵᛴᛷᛵ;

.field public final ᛳᲁᲇᛸ:Ljava/util/Set;

.field public final ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

.field public final ᲇᛴᲇᛵ:Ljava/util/Collection;


# direct methods
.method public constructor <init>(Lxhss/ᲇᛵᛲᲁ;Lxhss/ᛵᛴᛷᛵ;Ljava/util/EnumSet;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "jsonProvider can not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lxhss/ᛵᛵᛲᲈ;->ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "mappingProvider can not be null"

    .line 10
    .line 11
    invoke-static {p2, v0}, Lxhss/ᛵᛵᛲᲈ;->ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "setOptions can not be null"

    .line 15
    .line 16
    invoke-static {p3, v0}, Lxhss/ᛵᛵᛲᲈ;->ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "evaluationListeners can not be null"

    .line 20
    .line 21
    invoke-static {p4, v0}, Lxhss/ᛵᛵᛲᲈ;->ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 25
    .line 26
    iput-object p2, p0, Lxhss/ᲀᛲᲇ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛴᛷᛵ;

    .line 27
    .line 28
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lxhss/ᲀᛲᲇ;->ᛳᲁᲇᛸ:Ljava/util/Set;

    .line 33
    .line 34
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lxhss/ᲀᛲᲇ;->ᲇᛴᲇᛵ:Ljava/util/Collection;

    .line 39
    .line 40
    return-void
.end method

.method public static ᛷᛵᛵᲈ()Lxhss/ᲇᛸᛶ;
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲇᛸᛶ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᲇᛸᛶ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v1, Lxhss/ᛳᛳᛱᛳ;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
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
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lxhss/ᲀᛲᲇ;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lxhss/ᲀᛲᲇ;

    .line 18
    .line 19
    iget-object v2, p0, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p1, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Lxhss/ᲀᛲᲇ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛴᛷᛵ;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v3, p1, Lxhss/ᲀᛲᲇ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛴᛷᛵ;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-ne v2, v3, :cond_2

    .line 46
    .line 47
    iget-object p0, p0, Lxhss/ᲀᛲᲇ;->ᛳᲁᲇᛸ:Ljava/util/Set;

    .line 48
    .line 49
    iget-object p1, p1, Lxhss/ᲀᛲᲇ;->ᛳᲁᲇᛸ:Ljava/util/Set;

    .line 50
    .line 51
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    return v0

    .line 58
    :cond_2
    :goto_0
    return v1
.end method
