.class public final Lyyds/ᲀᛳᛲᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᛴᲁᛷ;


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛸᛴᛷᛵ;

.field public ᛶᛷᛲᲁ:Z

.field public final ᲀᛲᛳᲀ:Landroid/content/Context;

.field public final ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lyyds/ᛸᛴᛷᛵ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᛳᛲᲀ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲀᛳᛲᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲀᛳᛲᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛴᛷᛵ;

    .line 9
    .line 10
    new-instance p1, Lyyds/ᛵᲇᛵᲇ;

    .line 11
    .line 12
    const/16 p2, 0xa

    .line 13
    .line 14
    invoke-direct {p1, p2, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lyyds/ᛱᛲᛶᛱ;

    .line 18
    .line 19
    invoke-direct {p2, p1}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lyyds/ᲀᛳᛲᲀ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛳᛲᲀ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛱᛲᛶᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v1, Lyyds/ᛷᛶᲇᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᲀᛳᛲᲀ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lyyds/ᛷᲈᲀᛸ;

    .line 16
    .line 17
    invoke-virtual {p0}, Lyyds/ᛷᲈᲀᛸ;->close()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final getDatabaseName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛳᛲᲀ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛳᛲᲀ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛱᛲᛶᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v1, Lyyds/ᛷᛶᲇᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᲀᛳᛲᲀ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 10
    .line 11
    invoke-virtual {v0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lyyds/ᛷᲈᲀᛸ;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-boolean p1, p0, Lyyds/ᲀᛳᛲᲀ;->ᛶᛷᛲᲁ:Z

    .line 21
    .line 22
    return-void
.end method

.method public final ᛲᛳᛴᛸ()Lyyds/ᛳᛴᲀᛷ;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛳᛲᲀ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛲᛶᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyyds/ᛷᲈᲀᛸ;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Lyyds/ᛷᲈᲀᛸ;->ᛲᲈᲁ(Z)Lyyds/ᛳᛴᲀᛷ;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
