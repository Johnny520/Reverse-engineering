.class public final Lxhss/ᛸᛴᲀᛵ;
.super Lxhss/ᲈᲀᲀᛵ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᲇᛶᛴᲀ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxhss/ᲈᲀᲀᛵ;-><init>()V

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
    iput-object v0, p0, Lxhss/ᛸᛴᲀᛵ;->ᲇᛶᛴᲀ:Ljava/util/HashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lxhss/ᲈᲀᲀᛵ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lxhss/ᛸᛴᲀᛵ;->ᲇᛶᛴᲀ:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/Object;)Lxhss/ᛴᛴᲁᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛸᛴᲀᛵ;->ᲇᛶᛴᲀ:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxhss/ᛴᛴᲁᲈ;

    .line 8
    .line 9
    return-object p0
.end method
