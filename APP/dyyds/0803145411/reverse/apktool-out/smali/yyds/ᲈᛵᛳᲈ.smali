.class public final Lyyds/ᲈᛵᛳᲈ;
.super Lyyds/ᛲᛱᲁᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;


# direct methods
.method public constructor <init>(Lyyds/ᛳᛷᲀᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛵᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    instance-of v0, p1, Lyyds/ᛱᛳᛴᲀ;

    .line 6
    .line 7
    :goto_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lyyds/ᛱᛳᛴᲀ;

    .line 12
    .line 13
    invoke-super {p0, p1}, Lyyds/ᛲᛱᲁᛳ;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    invoke-static {p0}, Lyyds/ᲈᛸᲁᛶ;->ᛱᛳᲇ(Ljava/util/Collection;)Lyyds/ᲈᲈᲀᲈ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lyyds/ᛳᛳᲀᲀ;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2, v0}, Lyyds/ᛳᛳᲀᲀ;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lyyds/ᲈᛷᲈᛶ;

    .line 12
    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    invoke-direct {v0, v2, p0}, Lyyds/ᲈᛷᲈᛶ;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance p0, Lyyds/ᛵᛶᲀᛶ;

    .line 19
    .line 20
    invoke-direct {p0, v1, v0}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lyyds/ᛴᲁᛱᛲ;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lyyds/ᛴᲁᛱᛲ;-><init>(Lyyds/ᛵᛶᲀᛶ;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public final ᛲᲈᲁ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛵᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/regex/Matcher;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->groupCount()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/lit8 p0, p0, 0x1

    .line 12
    .line 13
    return p0
.end method

.method public final ᛵᛸᛸᛷ(I)Lyyds/ᛱᛳᛴᲀ;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛵᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/regex/Matcher;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->start(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->end(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Lyyds/ᛳᛵᲀ;->ᛷᛵᲇᲀ(II)Lyyds/ᲈᲈᲀᲈ;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v1, v0, Lyyds/ᲇᲁᲁᲁ;->ᲀᛲᛳᲀ:I

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Lyyds/ᛱᛳᛴᲀ;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v1, p0, v0}, Lyyds/ᛱᛳᛴᲀ;-><init>(Ljava/lang/String;Lyyds/ᲈᲈᲀᲈ;)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method
