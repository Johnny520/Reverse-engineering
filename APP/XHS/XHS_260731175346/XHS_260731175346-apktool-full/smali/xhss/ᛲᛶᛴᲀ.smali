.class public final synthetic Lxhss/ᛲᛶᛴᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛲᛶᛴᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 1
    iget p0, p0, Lxhss/ᛲᛶᛴᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, Ljava/lang/Comparable;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    check-cast p1, Ljava/lang/Comparable;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :cond_1
    return v0

    .line 22
    :pswitch_0
    check-cast p1, [B

    .line 23
    .line 24
    check-cast p2, [B

    .line 25
    .line 26
    array-length p0, p1

    .line 27
    array-length v1, p2

    .line 28
    if-eq p0, v1, :cond_2

    .line 29
    .line 30
    array-length p0, p1

    .line 31
    array-length p1, p2

    .line 32
    sub-int v0, p0, p1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move p0, v0

    .line 36
    :goto_1
    array-length v1, p1

    .line 37
    if-ge p0, v1, :cond_4

    .line 38
    .line 39
    aget-byte v1, p1, p0

    .line 40
    .line 41
    aget-byte v2, p2, p0

    .line 42
    .line 43
    if-eq v1, v2, :cond_3

    .line 44
    .line 45
    sub-int v0, v1, v2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    :goto_2
    return v0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
