.class public final Lyyds/ᲇᛲᛳ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Lyyds/ᛶᛲᛳᛶ;

.field public final synthetic ᛲᛳᛶᲁ:Lyyds/ᲀᲀᛲᛷ;

.field public ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᲈᲈᲁ:Lyyds/ᛲᲇᲁᛴ;


# direct methods
.method public constructor <init>(Lyyds/ᛶᛲᛳᛶ;Lyyds/ᲀᲀᛲᛷ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲇᛲᛳ;->ᛱᲈᲁ:Lyyds/ᛶᛲᛳᛶ;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᲇᛲᛳ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲀᛲᛷ;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᲇᛲᛳ;->ᛷᲈᲈᲁ:Lyyds/ᛲᲇᲁᛴ;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲇᛲᛳ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput v1, p0, Lyyds/ᲇᛲᛳ;->ᛶᛷᛲᲁ:I

    .line 23
    .line 24
    iget-object p1, p0, Lyyds/ᲇᛲᛳ;->ᛱᲈᲁ:Lyyds/ᛶᛲᛳᛶ;

    .line 25
    .line 26
    iget-object v0, p0, Lyyds/ᲇᛲᛳ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲀᛲᛷ;

    .line 27
    .line 28
    iget-object v1, p0, Lyyds/ᲇᛲᛳ;->ᛷᲈᲈᲁ:Lyyds/ᛲᲇᲁᛴ;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1, p0}, Lyyds/ᛶᛲᛳᛶ;->ᛲᛴᛳᛲ(Lyyds/ᲀᲀᛲᛷ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object p1, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 35
    .line 36
    if-ne p0, p1, :cond_2

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_2
    return-object p0
.end method

.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lyyds/ᛲᛱᛶᛸ;

    .line 2
    .line 3
    new-instance v0, Lyyds/ᲇᛲᛳ;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᲇᛲᛳ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲀᛲᛷ;

    .line 6
    .line 7
    iget-object v2, p0, Lyyds/ᲇᛲᛳ;->ᛷᲈᲈᲁ:Lyyds/ᛲᲇᲁᛴ;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᲇᛲᛳ;->ᛱᲈᲁ:Lyyds/ᛶᛲᛳᛶ;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1, v2, p1}, Lyyds/ᲇᛲᛳ;-><init>(Lyyds/ᛶᛲᛳᛶ;Lyyds/ᲀᲀᛲᛷ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lyyds/ᲇᛲᛳ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
