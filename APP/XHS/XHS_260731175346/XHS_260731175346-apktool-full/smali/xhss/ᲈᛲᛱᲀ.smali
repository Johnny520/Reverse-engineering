.class public final Lxhss/ᲈᛲᛱᲀ;
.super Lxhss/ᛲᛶᲇᲇ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛱᲀ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᲈᛲᛱᲀ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛲᛶᲇᲇ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᲈᛲᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛱᲀ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᲁᲁ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᛲᛱᛶᲇ;->ᲇᛴᲇᛵ:Lxhss/ᛲᛱᛶᲇ;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iget-object p0, p0, Lxhss/ᛲᛱᛶᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛱᲀᛴ;

    .line 5
    .line 6
    invoke-virtual {p0, p2, p1}, Lxhss/ᛴᛱᲀᛴ;->ᛳᲁᲇᛸ(Ljava/lang/Runnable;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final ᲇᛸᛳᲁ(I)Lxhss/ᛲᛶᲇᲇ;
    .locals 1

    .line 1
    invoke-static {p1}, Lxhss/ᛱᛷᛵᛷ;->ᛷᛴᛷᛱ(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lxhss/ᛷᛶᛲᛴ;->ᲇᛴᲇᛵ:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lxhss/ᛲᛶᲇᲇ;->ᲇᛸᛳᲁ(I)Lxhss/ᛲᛶᲇᲇ;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
