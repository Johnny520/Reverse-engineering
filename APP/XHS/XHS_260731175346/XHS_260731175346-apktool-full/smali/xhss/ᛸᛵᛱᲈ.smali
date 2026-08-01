.class public Lxhss/ᛸᛵᛱᲈ;
.super Lxhss/ᛲᛱᛶᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


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
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛲᛴᲀᲈ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_0
    invoke-static {p0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p1, v1}, Lxhss/ᛴᛷᛸᛷ;->ᲇᛸᛳᲁ(Z)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "\' as Currency; at path "

    .line 17
    .line 18
    invoke-static {p0, v1, p1, v0}, Lxhss/ᛵᲈᲁᲈ;->ᛷᛴᛷᛱ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/util/Currency;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Lxhss/ᛸᲈᲈᛶ;->ᲁᛲᛴᛴ(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
