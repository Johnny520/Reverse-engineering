.class public final synthetic Lxhss/ᛴᛵᲇᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛳᲇᛶ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᛲᛷᲀᲇ;

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛵᛲᛸᛲ;

.field public final synthetic ᲇᛴᲇᛵ:Lxhss/ᛵᲈᛱᛳ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛲᛷᲀᲇ;Lxhss/ᛵᛲᛸᛲ;Lxhss/ᛵᲈᛱᛳ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛴᛵᲇᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛷᲀᲇ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛴᛵᲇᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛲᛸᛲ;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛴᛵᲇᛵ;->ᲇᛴᲇᛵ:Lxhss/ᛵᲈᛱᛳ;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛴᛵᲇᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛷᲀᲇ;

    .line 2
    .line 3
    iget-object v0, v0, Lxhss/ᛲᛷᲀᲇ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛶᲀᲇ;

    .line 4
    .line 5
    iget-object v1, p0, Lxhss/ᛴᛵᲇᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛲᛸᛲ;

    .line 6
    .line 7
    invoke-virtual {v1}, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object p0, p0, Lxhss/ᛴᛵᲇᛵ;->ᲇᛴᲇᛵ:Lxhss/ᛵᲈᛱᛳ;

    .line 12
    .line 13
    iget-object p0, p0, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 14
    .line 15
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p0}, Lxhss/ᛵᛶᲀᲇ;->ᛷᛵᛵᲈ(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
