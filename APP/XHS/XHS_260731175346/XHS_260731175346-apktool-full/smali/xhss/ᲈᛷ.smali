.class public Lxhss/ᲈᛷ;
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
    .locals 3

    .line 1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲀᛷᲁᲀ()V

    .line 11
    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛲᛴᲀᲈ()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :try_start_0
    invoke-static {p0}, Lxhss/ᲈᲀᲀᛱ;->ᛱᛱᛲᲇ(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/math/BigInteger;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-virtual {p1, v2}, Lxhss/ᛴᛷᛸᛷ;->ᲇᛸᛳᲁ(Z)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v2, "\' as BigInteger; at path "

    .line 34
    .line 35
    invoke-static {p0, v2, p1, v0}, Lxhss/ᛵᲈᲁᲈ;->ᛷᛴᛷᛱ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-object v1
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/math/BigInteger;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lxhss/ᛸᲈᲈᛶ;->ᛳᛶᛷᲀ(Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
