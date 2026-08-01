.class public final Lxhss/ᛲᛱᛶᛵ;
.super Lxhss/ᲈᛸᲇᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛲᛱᲇ;
.implements Lxhss/ᛷᛴᛲᛲ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    const/4 v1, 0x0

    .line 2
    sget-object v3, Lxhss/ᛲᛵᲇᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛵᲇᛲ;

    .line 3
    .line 4
    const-class v2, Lxhss/ᛳᛱᛲᛲ;

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    move-object v4, p1

    .line 8
    move-object v5, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Lxhss/ᛸᛸᛳᛳ;-><init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛷᛴᛷᛱ()Lxhss/ᲁᛶᛳᲀ;
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛸᲈᛳ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxhss/ᛸᛸᛳᛳ;->ᛸᛴᛶᛳ:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lxhss/ᛸᛸᛳᛳ;->ᲀᲇᛳᲁ()Lxhss/ᲁᛶᛳᲀ;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eq v0, p0, :cond_0

    .line 10
    .line 11
    check-cast v0, Lxhss/ᛴᛲᛱᲇ;

    .line 12
    .line 13
    check-cast v0, Lxhss/ᛲᛱᛶᛵ;

    .line 14
    .line 15
    invoke-virtual {v0}, Lxhss/ᛲᛱᛶᛵ;->ᛸᛴᛶᛳ()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Lxhss/ᛲᛳᛱᲁ;

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

.method public final ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxhss/ᛲᛱᛶᛵ;->ᛸᛴᛶᛳ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method
