.class public final Lyyds/ᲀᛴᛸᛴ;
.super Lyyds/ᛷᛸᛶᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᛶᛷᛲᲁ:J


# direct methods
.method public constructor <init>(JLyyds/ᛱᛲᛸᲇ;)V
    .locals 1

    .line 1
    iget-object v0, p3, Lyyds/ᛶᛴᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    invoke-direct {p0, v0, p3}, Lyyds/ᛷᛸᛶᲁ;-><init>(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᛱᛶᛸ;)V

    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Lyyds/ᲀᛴᛸᛴ;->ᛶᛷᛲᲁ:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛸᲁᲇ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛴᛸᛲ;->ᲇᲇᲇᛱ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲈᲈᛲᛱ;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "Timed out waiting for "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-wide v1, p0, Lyyds/ᲀᛴᛸᛴ;->ᛶᛷᛲᲁ:J

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " ms"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Lyyds/ᛶᛱᛴᲁ;

    .line 28
    .line 29
    invoke-direct {v1, v0, p0}, Lyyds/ᛶᛱᛴᲁ;-><init>(Ljava/lang/String;Lyyds/ᲀᛴᛸᛴ;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lyyds/ᛴᲈᛱᛷ;->ᛱᛳᲇ(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final ᲁᛶᛴᛸ()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-super {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲁᛶᛴᛸ()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "(timeMillis="

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, Lyyds/ᲀᛴᛸᛴ;->ᛶᛷᛲᲁ:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 p0, 0x29

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
