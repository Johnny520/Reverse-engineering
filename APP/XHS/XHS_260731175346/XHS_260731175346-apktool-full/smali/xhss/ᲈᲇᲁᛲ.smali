.class public final Lxhss/ᲈᲇᲁᛲ;
.super Lxhss/ᲇᛸᛳᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ᛳᲁᲇᛸ:Lxhss/ᲈᲇᲁᛲ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲈᲇᲁᛲ;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛷᛸᛵᛶ;->ᛳᲈᲈᛲ:Lxhss/ᛷᛸᛵᛶ;

    .line 4
    .line 5
    sget-object v1, Lxhss/ᛷᛸᛵᛶ;->ᛳᲈᲈᛲ:Lxhss/ᛷᛸᛵᛶ;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lxhss/ᲈᲇᲁᛲ;-><init>(Lxhss/ᛷᛸᛵᛶ;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lxhss/ᲈᲇᲁᛲ;->ᛳᲁᲇᛸ:Lxhss/ᲈᲇᲁᛲ;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lxhss/ᛷᛸᛵᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-ltz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lxhss/ᲈᛴᲈᛵ;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, p0, v1}, Lxhss/ᲈᛴᲈᛵ;-><init>(Lxhss/ᛷᛸᛵᛶ;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-gez p1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lxhss/ᛷᛸᛵᛶ;->ᛸᛴᛶᛳ(I)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final ᛷᛵᛵᲈ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲈᲇᲁᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛸᛵᛶ;

    .line 2
    .line 3
    iget p0, p0, Lxhss/ᛷᛸᛵᛶ;->ᛸᛷᲈᲈ:I

    .line 4
    .line 5
    return p0
.end method
