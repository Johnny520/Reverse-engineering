.class public final Lyyds/ᛲᛷᛴᛲ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Ljava/lang/String;

.field public final synthetic ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;

.field public final synthetic ᛶᛷᛲᲁ:Lyyds/ᛶᛲᛳᛶ;


# direct methods
.method public constructor <init>(Lyyds/ᛶᛲᛳᛶ;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛲᛷᛴᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛶᛲᛳᛶ;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛲᛷᛴᛲ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛲᛷᛴᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;

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
    .locals 1

    .line 1
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lyyds/ᛲᛷᛴᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛶᛲᛳᛶ;

    .line 5
    .line 6
    iget-object p1, p1, Lyyds/ᛶᛲᛳᛶ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛵᛷ;

    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᛲᛷᛴᛲ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p0, p0, Lyyds/ᛲᛷᛴᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;

    .line 15
    .line 16
    :try_start_0
    invoke-interface {p0, p1}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    :catchall_1
    move-exception v0

    .line 28
    invoke-static {p1, p0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lyyds/ᛲᛱᛶᛸ;

    .line 2
    .line 3
    new-instance v0, Lyyds/ᛲᛷᛴᛲ;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛲᛷᛴᛲ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lyyds/ᛲᛷᛴᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛲᛷᛴᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛶᛲᛳᛶ;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1, v2, p1}, Lyyds/ᛲᛷᛴᛲ;-><init>(Lyyds/ᛶᛲᛳᛶ;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;Lyyds/ᛲᛱᛶᛸ;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lyyds/ᛲᛷᛴᛲ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
