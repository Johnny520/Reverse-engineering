.class public final Lxhss/ᛸᛴᲁᛸ;
.super Lxhss/ᛶᛸᲇᲀ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛴᛷᛱ:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛸᛴᲁᛸ;->ᛷᛴᛷᛱ:Ljava/lang/reflect/Field;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᲈᛳᛴ()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᛶᛵᛱ;->ᲁᛴᲇᛲ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxhss/ᛸᛴᲁᛸ;->ᛷᛴᛷᛱ:Ljava/lang/reflect/Field;

    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᛶᛸᲇᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

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
    new-instance v0, Lxhss/ᲈᛳᛱᲇ;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    instance-of v0, p0, Lxhss/ᲈᛳᛱᲇ;

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

.method public final ᛵᛷᛲᛸ(Ljava/lang/Object;)Lxhss/ᛶᛸᲇᲀ;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛶᛸᲇᲀ;->ᛵᛲᲁᛶ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final ᛸᛲᲀᛵ()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛸᛴᲁᛸ;->ᛷᛴᛷᛱ:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛸᛴᛸᛲ()Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᛶᛵᛱ;->ᲁᛴᲇᛲ()V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lxhss/ᛸᛴᲁᛸ;->ᛷᛴᛷᛱ:Ljava/lang/reflect/Field;

    .line 6
    .line 7
    iget-object p0, p0, Lxhss/ᛶᛸᲇᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

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
    new-instance v1, Lxhss/ᲈᛳᛱᲇ;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p0, v1

    .line 24
    :cond_0
    :goto_0
    instance-of v1, p0, Lxhss/ᲈᛳᛱᲇ;

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
