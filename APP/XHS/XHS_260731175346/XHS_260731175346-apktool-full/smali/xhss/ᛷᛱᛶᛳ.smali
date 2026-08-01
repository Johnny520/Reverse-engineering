.class public Lxhss/ᛷᛱᛶᛳ;
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
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne v0, v2, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const-string v0, "; at "

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Lxhss/ᛴᛷᛸᛷ;->ᲇᛸᛳᲁ(Z)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v2, "Expecting character, got: "

    .line 42
    .line 43
    invoke-static {v2, p0, v0, p1}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛶᲈᛶ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object v1
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Character;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-virtual {p1, p0}, Lxhss/ᛸᲈᲈᛶ;->ᲁᛲᛴᛴ(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
