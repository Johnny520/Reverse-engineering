.class public final Lxhss/ᛶᛳᛳᛶ;
.super Lxhss/ᛱᛶᛶᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/time/OffsetDateTime;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/time/OffsetDateTime;->parse(Ljava/lang/CharSequence;)Ljava/time/OffsetDateTime;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lxhss/ᛶᛳᛳᛶ;->ᛱᛱᛲᲇ:Ljava/time/OffsetDateTime;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lxhss/ᛶᛳᛳᛶ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    instance-of v1, p1, Lxhss/ᲈᲇᛱᛶ;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    return v2

    .line 15
    :cond_1
    check-cast p1, Lxhss/ᛱᛶᛶᛱ;

    .line 16
    .line 17
    invoke-virtual {p1}, Lxhss/ᛱᛶᛶᛱ;->ᛷᛴᛷᛱ()Lxhss/ᛶᛳᛳᛶ;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p0, p0, Lxhss/ᛶᛳᛳᛶ;->ᛱᛱᛲᲇ:Ljava/time/OffsetDateTime;

    .line 22
    .line 23
    iget-object p1, p1, Lxhss/ᛶᛳᛳᛶ;->ᛱᛱᛲᲇ:Ljava/time/OffsetDateTime;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/time/OffsetDateTime;->compareTo(Ljava/time/OffsetDateTime;)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_2

    .line 30
    .line 31
    return v0

    .line 32
    :cond_2
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛶᛳᛳᛶ;->ᛱᛱᛲᲇ:Ljava/time/OffsetDateTime;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᛶᛳᛳᛶ;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ()Lxhss/ᲈᲇᛱᛶ;
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲈᲇᛱᛶ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛶᛳᛳᛶ;->ᛱᛱᛲᲇ:Ljava/time/OffsetDateTime;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, Lxhss/ᲈᲇᛱᛶ;-><init>(Ljava/lang/CharSequence;Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final ᛸᛷᲈᲈ(Lxhss/ᲈᲀᲇᛵ;)Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Lxhss/ᛶᛳᛳᛶ;

    .line 2
    .line 3
    return-object p0
.end method
