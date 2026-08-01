.class public Lxhss/ᲇᛸᲀᲁ$ᛷᛵᛵᲈ;
.super Lxhss/ᛲᛱᛶᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxhss/ᲇᛸᲀᲁ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


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
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛳᲁᲇᛸ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    move-object v0, p0

    .line 6
    :goto_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x4

    .line 11
    if-eq v1, v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲈᛲᛵᲁ()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "totalSeconds"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const-string v2, "id"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛸᛴᛸᛲ()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛲᛴᲀᲈ()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛳᛶᛷᲀ()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛷᲁᲁ()V

    .line 52
    .line 53
    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    invoke-static {p0}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {p0}, Ljava/time/ZoneOffset;->ofTotalSeconds(I)Ljava/time/ZoneOffset;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_4
    new-instance p0, Lxhss/ᛱᲈᛲᛷ;

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    invoke-virtual {p1, v0}, Lxhss/ᛴᛷᛸᛷ;->ᲇᛸᛳᲁ(Z)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string v0, "Missing id or totalSeconds field; at path "

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Ljava/time/ZoneId;

    .line 2
    .line 3
    instance-of p0, p2, Ljava/time/ZoneOffset;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᲇᛴᲇᛵ()V

    .line 8
    .line 9
    .line 10
    const-string p0, "totalSeconds"

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛶᲈᛶ(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p2, Ljava/time/ZoneOffset;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    int-to-long v0, p0

    .line 22
    invoke-virtual {p1, v0, v1}, Lxhss/ᛸᲈᲈᛶ;->ᛴᲈᛱᛴ(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᲇᛴᲇᛵ()V

    .line 30
    .line 31
    .line 32
    const-string p0, "id"

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛶᲈᛶ(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p1, p0}, Lxhss/ᛸᲈᲈᛶ;->ᲁᛲᛴᛴ(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ()V

    .line 45
    .line 46
    .line 47
    return-void
.end method
