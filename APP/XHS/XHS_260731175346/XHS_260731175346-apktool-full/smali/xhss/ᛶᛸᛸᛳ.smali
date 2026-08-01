.class public final Lxhss/ᛶᛸᛸᛳ;
.super Lxhss/ᛲᛱᛶᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᲀᲇᛱᛴ;


# instance fields
.field public final ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᲀᲇᛱᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᲀᲇᛱᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛶᛸᛸᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲀᲇᛱᛴ;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lxhss/ᛲᛱᛶᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛶᛸᛸᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛶᛸᛸᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Date;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/sql/Timestamp;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-direct {p1, v0, v1}, Ljava/sql/Timestamp;-><init>(J)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/sql/Timestamp;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛶᛸᛸᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lxhss/ᛲᛱᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
