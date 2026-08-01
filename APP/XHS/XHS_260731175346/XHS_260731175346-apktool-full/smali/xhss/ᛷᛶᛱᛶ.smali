.class public final Lxhss/ᛷᛶᛱᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

.field public final ᛳᲁᲇᛸ:Ljava/util/ArrayList;

.field public final ᛷᛴᛷᛱ:Lxhss/ᛴᛳᲀᛷ;

.field public final ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;

.field public ᛷᲁᲁ:I

.field public final ᛸᛲᲀᛵ:Lxhss/ᛲᛷᲀᲇ;

.field public final ᛸᛴᛶᛳ:Ljava/util/List;

.field public ᛸᛷᲈᲈ:I

.field public final ᲀᲇᛳᲁ:Ljava/util/List;

.field public final ᲇᛴᲇᛵ:Ljava/util/ArrayList;

.field public final ᲇᛶᛴᲀ:Ljavax/net/SocketFactory;

.field public ᲈᛳᲀ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᲇᛸᛶ;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1}, Lxhss/ᲇᛸᛶ;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᲇᛴᲇᛵ:Ljava/util/ArrayList;

    .line 25
    .line 26
    sget-object v0, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 27
    .line 28
    new-instance v0, Lxhss/ᛴᛳᲀᛷ;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛳᲀᛷ;

    .line 34
    .line 35
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᲇᛶᛴᲀ:Ljavax/net/SocketFactory;

    .line 40
    .line 41
    sget-object v0, Lxhss/ᛵᛸᛷᛲ;->ᛳᛸᛵᲀ:Ljava/util/List;

    .line 42
    .line 43
    iput-object v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᲀᲇᛳᲁ:Ljava/util/List;

    .line 44
    .line 45
    sget-object v0, Lxhss/ᛵᛸᛷᛲ;->ᲁᲁᛴᲁ:Ljava/util/List;

    .line 46
    .line 47
    iput-object v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᛸᛴᛶᛳ:Ljava/util/List;

    .line 48
    .line 49
    sget-object v0, Lxhss/ᛲᛷᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛷᲀᲇ;

    .line 50
    .line 51
    iput-object v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᛸᛲᲀᛵ:Lxhss/ᛲᛷᲀᲇ;

    .line 52
    .line 53
    const/16 v0, 0x2710

    .line 54
    .line 55
    iput v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᛸᛷᲈᲈ:I

    .line 56
    .line 57
    iput v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᲈᛳᲀ:I

    .line 58
    .line 59
    iput v0, p0, Lxhss/ᛷᛶᛱᛶ;->ᛷᲁᲁ:I

    .line 60
    .line 61
    return-void
.end method
