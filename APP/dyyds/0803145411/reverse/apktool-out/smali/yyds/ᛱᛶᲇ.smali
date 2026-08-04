.class public abstract Lyyds/ᛱᛶᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛷᛳᛷ;


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᛱᛲᲀᛶ;

.field public final synthetic ᲇᲇᲇᛱ:Lyyds/ᛱᛷᛳᛳ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛵᛱᛵᛴ;


# direct methods
.method public constructor <init>(Lyyds/ᛱᛷᛳᛳ;Lyyds/ᛱᛲᲀᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛱᛶᲇ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛷᛳᛳ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛱᛶᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛲᲀᛶ;

    .line 7
    .line 8
    new-instance p2, Lyyds/ᛵᛱᛵᛴ;

    .line 9
    .line 10
    iget-object p1, p1, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 11
    .line 12
    iget-object p1, p1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lyyds/ᲀᲀᛵᲈ;

    .line 15
    .line 16
    iget-object p1, p1, Lyyds/ᲀᲀᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛷᛳᛷ;

    .line 17
    .line 18
    invoke-interface {p1}, Lyyds/ᛷᛷᛳᛷ;->ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p2, p1}, Lyyds/ᛵᛱᛵᛴ;-><init>(Lyyds/ᲈᲁᛴᛲ;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lyyds/ᛱᛶᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛱᛵᛴ;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᛷᛸᛱᛴ;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛶᲇ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛷᛳᛳ;

    .line 2
    .line 3
    iget v1, v0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v3, 0x5

    .line 10
    if-ne v1, v3, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, Lyyds/ᛱᛶᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛱᛵᛴ;

    .line 13
    .line 14
    iget-object v3, v1, Lyyds/ᛵᛱᛵᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲁᛴᛲ;

    .line 15
    .line 16
    sget-object v4, Lyyds/ᲈᲁᛴᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲁᲁᲁ;

    .line 17
    .line 18
    iput-object v4, v1, Lyyds/ᛵᛱᛵᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲁᛴᛲ;

    .line 19
    .line 20
    invoke-virtual {v3}, Lyyds/ᲈᲁᛴᛲ;->ᛲᲈᲁ()Lyyds/ᲈᲁᛴᛲ;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lyyds/ᲈᲁᛴᛲ;->ᛵᛸᛸᛷ()Lyyds/ᲈᲁᛴᛲ;

    .line 24
    .line 25
    .line 26
    iput v2, v0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 27
    .line 28
    invoke-virtual {p1}, Lyyds/ᛷᛸᛱᛴ;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-lez v1, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Lyyds/ᛱᛷᛳᛳ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛷ;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lyyds/ᛶᛲᛷ;->ᛷᲈᲈᲁ:Lyyds/ᲀᛴᛱᛷ;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object p0, p0, Lyyds/ᛱᛶᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛲᲀᛶ;

    .line 43
    .line 44
    invoke-static {v0, p0, p1}, Lyyds/ᲁᛲᲈᲁ;->ᲇᲈᛵᛷ(Lyyds/ᲀᛴᛱᛷ;Lyyds/ᛱᛲᲀᛶ;Lyyds/ᛷᛸᛱᛴ;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void

    .line 48
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    iget p1, v0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, "state: "

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0
.end method

.method public ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛶᲇ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛷᛳᛳ;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 4
    .line 5
    iget-object v1, v1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyyds/ᲀᲀᛵᲈ;

    .line 8
    .line 9
    invoke-virtual {v1, p1, p2, p3}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-wide p0

    .line 14
    :catch_0
    move-exception p1

    .line 15
    iget-object p2, v0, Lyyds/ᛱᛷᛳᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛷᲈᛸ;

    .line 16
    .line 17
    invoke-interface {p2}, Lyyds/ᛷᛷᲈᛸ;->ᛱᲈᲁ()V

    .line 18
    .line 19
    .line 20
    sget-object p2, Lyyds/ᛱᛷᛳᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛸᛱᛴ;

    .line 21
    .line 22
    invoke-virtual {p0, p2}, Lyyds/ᛱᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛷᛸᛱᛴ;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛶᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛱᛵᛴ;

    .line 2
    .line 3
    return-object p0
.end method
