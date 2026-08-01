.class public final Lxhss/ᛲᲀᛱ;
.super Lxhss/ᛶᛸᲇᲀ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛴᛷᛱ:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛲᲀᛱ;->ᛷᛴᛷᛱ:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final varargs ᛱᲈᛳᛴ([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

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
    invoke-virtual {p0}, Lxhss/ᛶᛵᛱ;->ᲁᛴᲇᛲ()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lxhss/ᛲᲀᛱ;->ᛷᛴᛷᛱ:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    iget-object p0, p0, Lxhss/ᛶᛸᲇᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 12
    .line 13
    array-length v1, p1

    .line 14
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object p0, p1

    .line 30
    :goto_0
    instance-of p1, p0, Lxhss/ᲈᛳᛱᲇ;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
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
    iget-object p0, p0, Lxhss/ᛲᲀᛱ;->ᛷᛴᛷᛱ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    return-object p0
.end method
