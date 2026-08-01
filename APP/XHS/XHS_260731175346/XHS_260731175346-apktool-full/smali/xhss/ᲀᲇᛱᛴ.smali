.class public Lxhss/ᲀᲇᛱᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛲᲀᛵ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;
    .locals 0

    .line 1
    iget-object p0, p2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 2
    .line 3
    const-class p2, Ljava/sql/Timestamp;

    .line 4
    .line 5
    if-ne p0, p2, :cond_0

    .line 6
    .line 7
    const-class p0, Ljava/util/Date;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lxhss/ᲈᛲᛶᛴ;->ᛱᛱᛲᲇ(Ljava/lang/Class;)Lxhss/ᛲᛱᛶᛴ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Lxhss/ᛶᛸᛸᛳ;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lxhss/ᛶᛸᛸᛳ;-><init>(Lxhss/ᛲᛱᛶᛴ;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method
