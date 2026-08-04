.class public final Lyyds/ᛱᛵᛷᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᛳᲇᲁ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛵᛴ;

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Lyyds/ᛱᛷᛳᛳ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛱᛵᛷᛶ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

    .line 5
    .line 6
    new-instance v0, Lyyds/ᛵᛱᛵᛴ;

    .line 7
    .line 8
    iget-object p1, p1, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 9
    .line 10
    iget-object p1, p1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lyyds/ᲈᲇᛲᛴ;

    .line 13
    .line 14
    iget-object p1, p1, Lyyds/ᲈᲇᛲᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 15
    .line 16
    invoke-interface {p1}, Lyyds/ᲀᛳᲇᲁ;->ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Lyyds/ᛵᛱᛵᛴ;-><init>(Lyyds/ᲈᲁᛴᛲ;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lyyds/ᛱᛵᛷᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛵᛴ;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛱᛵᛷᛶ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lyyds/ᛱᛵᛷᛶ;->ᲇᲈᛵᛷ:Z

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛱᛵᛷᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛵᛴ;

    .line 10
    .line 11
    iget-object v1, v0, Lyyds/ᛵᛱᛵᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲁᛴᛲ;

    .line 12
    .line 13
    sget-object v2, Lyyds/ᲈᲁᛴᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲁᲁᲁ;

    .line 14
    .line 15
    iput-object v2, v0, Lyyds/ᛵᛱᛵᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲁᛴᛲ;

    .line 16
    .line 17
    invoke-virtual {v1}, Lyyds/ᲈᲁᛴᛲ;->ᛲᲈᲁ()Lyyds/ᲈᲁᛴᛲ;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lyyds/ᲈᲁᛴᛲ;->ᛵᛸᛸᛷ()Lyyds/ᲈᲁᛴᛲ;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    iget-object p0, p0, Lyyds/ᛱᛵᛷᛶ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

    .line 25
    .line 26
    iput v0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 27
    .line 28
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛱᛵᛷᛶ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Lyyds/ᛱᛵᛷᛶ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lyyds/ᲈᲇᛲᛴ;

    .line 13
    .line 14
    invoke-virtual {p0}, Lyyds/ᲈᲇᛲᛴ;->flush()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lyyds/ᛱᛵᛷᛶ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p3, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    move-wide v5, p1

    .line 10
    invoke-static/range {v1 .. v6}, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ(JJJ)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛱᛵᛷᛶ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lyyds/ᲈᲇᛲᛴ;

    .line 20
    .line 21
    invoke-virtual {p0, v5, v6, p3}, Lyyds/ᲈᲇᛲᛴ;->ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "closed"

    .line 26
    .line 27
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛵᛷᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛵᛴ;

    .line 2
    .line 3
    return-object p0
.end method
