.class public final Lyyds/ᲈᛶᛲᲈ;
.super Lyyds/ᲈᛲᛶᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲇᲈᛸᛸ;
.implements Lyyds/ᲀᛴᛶᲇ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    sget-object v1, Lyyds/ᛷᛲᲁᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛲᲁᛸ;

    .line 3
    .line 4
    const-class v2, Lyyds/ᛷᛳᛲᛳ;

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Lyyds/ᲀᛴᛷᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final ᛱᲈᲁ()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᲀᛴᛷᛴ;->ᛲᛳᛶᲁ:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᲀᛴᛷᛴ;->ᛲᛴᛳᛲ()Lyyds/ᲇᛳᛴᛱ;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eq v0, p0, :cond_0

    .line 10
    .line 11
    check-cast v0, Lyyds/ᲀᛴᛶᲇ;

    .line 12
    .line 13
    check-cast v0, Lyyds/ᲈᛶᛲᲈ;

    .line 14
    .line 15
    invoke-virtual {v0}, Lyyds/ᲈᛶᛲᲈ;->ᛱᲈᲁ()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Lyyds/ᛱᛴᛷᛴ;

    .line 20
    .line 21
    const-string v0, "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"

    .line 22
    .line 23
    invoke-direct {p0, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 28
    .line 29
    const-string v0, "Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980"

    .line 30
    .line 31
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0
.end method

.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲈ;->ᛱᲈᲁ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final ᛵᛸᛸᛷ()Lyyds/ᲇᛳᛴᛱ;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ:Lyyds/ᛷᛱᛴᲈ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
