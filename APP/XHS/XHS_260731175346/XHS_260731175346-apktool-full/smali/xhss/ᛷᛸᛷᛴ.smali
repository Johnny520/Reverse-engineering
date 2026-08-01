.class public final Lxhss/ᛷᛸᛷᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲁᛷᛴᲇ;


# instance fields
.field public final ᛱᛱᛲᲇ:I

.field public final ᛷᛵᛵᲈ:Lxhss/ᲁᛷᛴᲇ;


# direct methods
.method public constructor <init>(Lxhss/ᲁᛷᛴᲇ;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛷᛸᛷᛴ;->ᛷᛵᛵᲈ:Lxhss/ᲁᛷᛴᲇ;

    .line 5
    .line 6
    iput p2, p0, Lxhss/ᛷᛸᛷᛴ;->ᛱᛱᛲᲇ:I

    .line 7
    .line 8
    if-ltz p2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "count must be non-negative, but was "

    .line 12
    .line 13
    const/16 p1, 0x2e

    .line 14
    .line 15
    invoke-static {p0, p2, p1}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛲᲀᛵ(Ljava/lang/String;II)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛸᛲᲀᛵ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lxhss/ᛸᛲᲀᛵ;-><init>(Lxhss/ᛷᛸᛷᛴ;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
