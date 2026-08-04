.class public final Lyyds/ᛷᛵᛶᛳ;
.super Lyyds/ᛳᛶᲇᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛶᛷᛲᲁ:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᛵᛶᛳ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Field;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛳᛶᛳ()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᛸᛳᛷᛳ;->ᛲᛶᛱᲈ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛷᛵᛶᛳ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Field;

    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛳᛶᲇᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    instance-of v0, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    :cond_0
    return-object p0
.end method

.method public final ᛷᛲᲈᛱ()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛵᛶᛳ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᛸᲇᛶ(Ljava/lang/Object;)Lyyds/ᛳᛶᲇᛴ;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛳᛶᲇᛴ;->ᛲᛳᛴᛸ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final ᛸᛸᛷᛱ()Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᛸᛳᛷᛳ;->ᛲᛶᛱᲈ()V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛷᛵᛶᛳ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Field;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛳᛶᲇᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    move-object p0, v0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p0, v1

    .line 24
    :cond_0
    :goto_0
    instance-of v1, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object v0, p0

    .line 30
    :goto_1
    return-object v0
.end method
