.class public final Lxhss/ᛵᛴᛱᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/Iterator;
.implements Lxhss/ᛱᛶᲈᛵ;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/util/Iterator;

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᲀᛲᲇᛲ;


# direct methods
.method public constructor <init>(Lxhss/ᲀᛲᲇᛲ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛵᛴᛱᲈ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛲᲇᛲ;

    .line 5
    .line 6
    iget-object p1, p1, Lxhss/ᲀᛲᲇᛲ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lxhss/ᲁᛷᛴᲇ;

    .line 9
    .line 10
    invoke-interface {p1}, Lxhss/ᲁᛷᛴᲇ;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lxhss/ᛵᛴᛱᲈ;->ᛱᛱᛲᲇ:Ljava/util/Iterator;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛴᛱᲈ;->ᛱᛱᛲᲇ:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛵᛴᛱᲈ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛲᲇᛲ;

    .line 2
    .line 3
    iget-object v0, v0, Lxhss/ᲀᛲᲇᛲ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛳᲀᛴ;

    .line 4
    .line 5
    check-cast v0, Lxhss/ᛷᛴᛲᛲ;

    .line 6
    .line 7
    iget-object p0, p0, Lxhss/ᛵᛴᛱᲈ;->ᛱᛱᛲᲇ:Ljava/util/Iterator;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {v0, p0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
