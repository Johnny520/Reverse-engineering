.class public final Lyyds/ᛳᛲᛶᛴ;
.super Lyyds/ᛳᛶᲇᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛶᛷᛲᲁ:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᛲᛶᛴ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final varargs ᛱᛳᛶᛳ([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛸᛳᛷᛳ;->ᛲᛶᛱᲈ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛳᛶᲇᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Lyyds/ᛳᛲᛶᛴ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final ᛷᛲᲈᛱ()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛲᛶᛴ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Method;

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

.method public final varargs ᛸᛸᛷᛱ([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    array-length v0, p1

    .line 2
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, p1}, Lyyds/ᛳᛲᛶᛴ;->ᛱᛳᛶᛳ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    move-object p0, p1

    .line 18
    :goto_0
    instance-of p1, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    :cond_0
    return-object p0
.end method

.method public final varargs ᲀᛲᛱᛱ([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    array-length v0, p1

    .line 2
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, p1}, Lyyds/ᛳᛲᛶᛴ;->ᲀᛴᲁᲈ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    move-object p0, p1

    .line 18
    :goto_0
    instance-of p1, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    :cond_0
    return-object p0
.end method

.method public final varargs ᲀᛴᲁᲈ([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛸᛳᛷᛳ;->ᛲᛶᛱᲈ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛳᛶᲇᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Lyyds/ᛳᛲᛶᛴ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    :cond_0
    return-object p0
.end method
