.class public abstract Lxhss/ᲈᛳᛷᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲇᲁᲀᲇ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛷᛶᲁᛵ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛳᛵᛸᲁ;

.field public final synthetic ᛷᛴᛷᛱ:Lxhss/ᛳᲇᲁᲈ;

.field public ᲇᛴᲇᛵ:Z


# direct methods
.method public constructor <init>(Lxhss/ᛳᲇᲁᲈ;Lxhss/ᛷᛶᲁᛵ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲈᛳᛷᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛳᲇᲁᲈ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᲈᛳᛷᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛶᲁᛵ;

    .line 7
    .line 8
    new-instance p2, Lxhss/ᛳᛵᛸᲁ;

    .line 9
    .line 10
    iget-object p1, p1, Lxhss/ᛳᲇᲁᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 11
    .line 12
    iget-object p1, p1, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lxhss/ᲁᛸᛵᛳ;

    .line 15
    .line 16
    iget-object p1, p1, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 17
    .line 18
    invoke-interface {p1}, Lxhss/ᲇᲁᲀᲇ;->ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p2, Lxhss/ᛳᛵᛸᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛲᲁᲈᛲ;

    .line 26
    .line 27
    iput-object p2, p0, Lxhss/ᲈᛳᛷᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛵᛸᲁ;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᲁᛸᛱᛵ;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᲈᛳᛷᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛳᲇᲁᲈ;

    .line 2
    .line 3
    iget v1, v0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

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
    iget-object v1, p0, Lxhss/ᲈᛳᛷᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛵᛸᲁ;

    .line 13
    .line 14
    iget-object v3, v1, Lxhss/ᛳᛵᛸᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛲᲁᲈᛲ;

    .line 15
    .line 16
    sget-object v4, Lxhss/ᛲᲁᲈᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛳᲁᲁᛲ;

    .line 17
    .line 18
    iput-object v4, v1, Lxhss/ᛳᛵᛸᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛲᲁᲈᛲ;

    .line 19
    .line 20
    invoke-virtual {v3}, Lxhss/ᛲᲁᲈᛲ;->ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lxhss/ᛲᲁᲈᛲ;->ᛱᛱᛲᲇ()Lxhss/ᛲᲁᲈᛲ;

    .line 24
    .line 25
    .line 26
    iput v2, v0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 27
    .line 28
    invoke-virtual {p1}, Lxhss/ᲁᛸᛱᛵ;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-lez v1, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Lxhss/ᛳᲇᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛷᛲ;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lxhss/ᛵᛸᛷᛲ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object p0, p0, Lxhss/ᲈᛳᛷᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛶᲁᛵ;

    .line 43
    .line 44
    invoke-static {v0, p0, p1}, Lxhss/ᲇᲈᲀᛵ;->ᛱᛱᛲᲇ(Lxhss/ᛳᛴᲀᲁ;Lxhss/ᛷᛶᲁᛵ;Lxhss/ᲁᛸᛱᛵ;)V

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
    iget p1, v0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

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

.method public final ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲈᛳᛷᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛵᛸᲁ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᲈᛳᛷᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛳᲇᲁᲈ;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lxhss/ᛳᲇᲁᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 4
    .line 5
    iget-object v1, v1, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lxhss/ᲁᛸᛵᛳ;

    .line 8
    .line 9
    invoke-virtual {v1, p1, p2, p3}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

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
    iget-object p2, v0, Lxhss/ᛳᲇᲁᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲀᲀᲁᛱ;

    .line 16
    .line 17
    invoke-interface {p2}, Lxhss/ᲀᲀᲁᛱ;->ᛸᛴᛶᛳ()V

    .line 18
    .line 19
    .line 20
    sget-object p2, Lxhss/ᛳᲇᲁᲈ;->ᲇᛶᛴᲀ:Lxhss/ᲁᛸᛱᛵ;

    .line 21
    .line 22
    invoke-virtual {p0, p2}, Lxhss/ᲈᛳᛷᲁ;->ᛱᛱᛲᲇ(Lxhss/ᲁᛸᛱᛵ;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method
