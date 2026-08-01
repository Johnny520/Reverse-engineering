.class public final Lxhss/ᲀᛱᛲᲀ;
.super Lxhss/ᲁᛳᛸᲀ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛶᲇᲈᛸ:Ljava/lang/Class;

.field public ᛸᛶᛴᲈ:Lxhss/ᛵᛳᲈᛶ;


# direct methods
.method public constructor <init>(Lxhss/ᛷᛱᛳᲁ;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lxhss/ᛵᛳᲈᛶ;-><init>(Lxhss/ᛷᛱᛳᲁ;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lxhss/ᲀᛱᛲᲀ;->ᛶᲇᲈᛸ:Ljava/lang/Class;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Lxhss/ᲀᛱᛲᲀ;->ᛶᲇᲈᛸ:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-static {p0, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v0, 0x0

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    add-int/lit8 v2, v0, 0x1

    .line 31
    .line 32
    aput-object v1, p0, v0

    .line 33
    .line 34
    move v0, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-object p0
.end method

.method public final ᲀᲇᛳᲁ(Ljava/lang/String;)Lxhss/ᛵᛳᲈᛶ;
    .locals 1

    .line 1
    iget-object p1, p0, Lxhss/ᲀᛱᛲᲀ;->ᛸᛶᛴᲈ:Lxhss/ᛵᛳᲈᛶ;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lxhss/ᛵᛳᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛱᛳᲁ;

    .line 6
    .line 7
    iget-object v0, p0, Lxhss/ᲀᛱᛲᲀ;->ᛶᲇᲈᛸ:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛶᲈᛶ(Ljava/lang/Class;)Lxhss/ᛵᛳᲈᛶ;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lxhss/ᲀᛱᛲᲀ;->ᛸᛶᛴᲈ:Lxhss/ᛵᛳᲈᛶ;

    .line 14
    .line 15
    :cond_0
    return-object p1
.end method

.method public final ᲇᛶᛴᲀ(Ljava/lang/String;)Lxhss/ᛵᛳᲈᛶ;
    .locals 1

    .line 1
    iget-object p1, p0, Lxhss/ᲀᛱᛲᲀ;->ᛸᛶᛴᲈ:Lxhss/ᛵᛳᲈᛶ;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lxhss/ᛵᛳᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛱᛳᲁ;

    .line 6
    .line 7
    iget-object v0, p0, Lxhss/ᲀᛱᛲᲀ;->ᛶᲇᲈᛸ:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛶᲈᛶ(Ljava/lang/Class;)Lxhss/ᛵᛳᲈᛶ;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lxhss/ᲀᛱᛲᲀ;->ᛸᛶᛴᲈ:Lxhss/ᛵᛳᲈᛶ;

    .line 14
    .line 15
    :cond_0
    return-object p1
.end method
