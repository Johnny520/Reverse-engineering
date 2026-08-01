.class public final Lxhss/ᛳᛸᛲᛶ;
.super Lxhss/ᲇᛴᛲᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

.field public final synthetic ᛳᲁᲇᛸ:I


# direct methods
.method public constructor <init>(ILjava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lxhss/ᛳᛸᛲᛶ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput p1, p0, Lxhss/ᛳᛸᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛲᲀᛵ(Ljava/lang/Class;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lxhss/ᛳᛸᛲᛶ;->ᛳᲁᲇᛸ:I

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p0, p0, Lxhss/ᛳᛸᛲᛶ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 26
    .line 27
    const-string p1, "UnsafeAllocator is used for non-instantiable type: "

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    throw p0
.end method
