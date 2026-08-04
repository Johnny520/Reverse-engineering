.class public interface abstract Lyyds/ᛵᲇᛱᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/AutoCloseable;


# virtual methods
.method public abstract getColumnCount()I
.end method

.method public abstract getColumnName(I)Ljava/lang/String;
.end method

.method public abstract getLong(I)J
.end method

.method public abstract isNull(I)Z
.end method

.method public abstract reset()V
.end method

.method public abstract ᛱᲈᲁ(I)Ljava/lang/String;
.end method

.method public abstract ᛲᛴᛳᛲ()V
.end method

.method public abstract ᛵᛸᛸᛷ(I)V
.end method

.method public abstract ᛵᲀᛵᛸ()Z
.end method

.method public ᛶᲈᛴᲈ()Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    cmp-long p0, v1, v3

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    return v0
.end method

.method public abstract ᲀᛲᛲᲇ(ILjava/lang/String;)V
.end method

.method public abstract ᲇᲈᛵᛷ(IJ)V
.end method
