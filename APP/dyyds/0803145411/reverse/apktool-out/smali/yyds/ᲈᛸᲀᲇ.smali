.class public Lyyds/ᲈᛸᲀᲇ;
.super Lyyds/ᲈᛸᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


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
.method public final ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛲᛲ()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᲁᛶᛴᛸ()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p0, Lyyds/ᛱᲇᛴᛸ;

    .line 15
    .line 16
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛵᛷ()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Lyyds/ᛱᲇᛴᛸ;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lyyds/ᛱᲇᛴᛸ;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lyyds/ᛶᲀᛳᲁ;->ᲈᛷᲈᛶ(Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
