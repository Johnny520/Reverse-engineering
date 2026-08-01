.class public final Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᲁᲇᲀ;


# instance fields
.field public final ᛱᛱᛲᲇ:[Lxhss/ᛲᛴᛷᛴ;


# direct methods
.method public constructor <init>([Lxhss/ᛲᛴᛷᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;->ᛱᛱᛲᲇ:[Lxhss/ᛲᛴᛷᛴ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;->ᛱᛱᛲᲇ:[Lxhss/ᛲᛴᛷᛴ;

    .line 7
    .line 8
    array-length p1, p0

    .line 9
    const/4 p2, 0x0

    .line 10
    const/4 v0, 0x0

    .line 11
    if-gtz p1, :cond_1

    .line 12
    .line 13
    array-length p1, p0

    .line 14
    if-gtz p1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    aget-object p0, p0, v0

    .line 18
    .line 19
    throw p2

    .line 20
    :cond_1
    aget-object p0, p0, v0

    .line 21
    .line 22
    throw p2
.end method
