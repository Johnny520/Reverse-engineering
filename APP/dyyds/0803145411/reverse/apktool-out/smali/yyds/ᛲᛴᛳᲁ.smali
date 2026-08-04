.class public final Lyyds/ᛲᛴᛳᲁ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

.field public final synthetic ᛲᛳᛶᲁ:Z

.field public ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᛲᲈᛱ:Lyyds/ᛷᛴᲈᲀ;

.field public final synthetic ᛷᲈᲈᲁ:Z


# direct methods
.method public constructor <init>(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛲᛴᛳᲁ;->ᛱᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 2
    .line 3
    iput-boolean p4, p0, Lyyds/ᛲᛴᛳᲁ;->ᛲᛳᛶᲁ:Z

    .line 4
    .line 5
    iput-boolean p5, p0, Lyyds/ᛲᛴᛳᲁ;->ᛷᲈᲈᲁ:Z

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛲᛴᛳᲁ;->ᛷᛲᲈᛱ:Lyyds/ᛷᛴᲈᲀ;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p2}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lyyds/ᛲᛴᛳᲁ;->ᛶᛷᛲᲁ:I

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
    new-instance v2, Lyyds/ᲀᛵᛲᛲ;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    iget-object v5, p0, Lyyds/ᛲᛴᛳᲁ;->ᛷᛲᲈᛱ:Lyyds/ᛷᛴᲈᲀ;

    .line 26
    .line 27
    iget-object v3, p0, Lyyds/ᛲᛴᛳᲁ;->ᛱᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 28
    .line 29
    iget-boolean v6, p0, Lyyds/ᛲᛴᛳᲁ;->ᛷᲈᲈᲁ:Z

    .line 30
    .line 31
    iget-boolean v7, p0, Lyyds/ᛲᛴᛳᲁ;->ᛲᛳᛶᲁ:Z

    .line 32
    .line 33
    invoke-direct/range {v2 .. v7}, Lyyds/ᲀᛵᛲᛲ;-><init>(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)V

    .line 34
    .line 35
    .line 36
    iput v1, p0, Lyyds/ᛲᛴᛳᲁ;->ᛶᛷᛲᲁ:I

    .line 37
    .line 38
    invoke-virtual {v3, v7, v2, p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛲᲈᲈ(ZLyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object p1, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 43
    .line 44
    if-ne p0, p1, :cond_2

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_2
    return-object p0
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 6

    .line 1
    new-instance v0, Lyyds/ᛲᛴᛳᲁ;

    .line 2
    .line 3
    iget-boolean v5, p0, Lyyds/ᛲᛴᛳᲁ;->ᛷᲈᲈᲁ:Z

    .line 4
    .line 5
    iget-object v3, p0, Lyyds/ᛲᛴᛳᲁ;->ᛷᛲᲈᛱ:Lyyds/ᛷᛴᲈᲀ;

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛲᛴᛳᲁ;->ᛱᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 8
    .line 9
    iget-boolean v4, p0, Lyyds/ᛲᛴᛳᲁ;->ᛲᛳᛶᲁ:Z

    .line 10
    .line 11
    move-object v2, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lyyds/ᛲᛴᛳᲁ;-><init>(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 2
    .line 3
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyyds/ᛲᛴᛳᲁ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᛲᛴᛳᲁ;

    .line 10
    .line 11
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᛲᛴᛳᲁ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
