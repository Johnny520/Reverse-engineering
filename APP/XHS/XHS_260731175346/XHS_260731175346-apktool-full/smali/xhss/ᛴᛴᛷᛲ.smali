.class public final Lxhss/ᛴᛴᛷᛲ;
.super Lxhss/ᛴᛷᛴᲀ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛶᛷᛴᛶ;


# instance fields
.field public final ᲇᛶᛴᲀ:Lxhss/ᛸᛷᛳᲈ;


# direct methods
.method public constructor <init>(Lxhss/ᛸᛷᛳᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxhss/ᛱᛸᛲᛴ;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛴᛴᛷᛲ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛷᛳᲈ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᛷᛴᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛷᛳᲈ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0, p1}, Lxhss/ᛸᛷᛳᲈ;->ᲇᛸᛳᲁ(Ljava/lang/Throwable;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final ᛷᲁᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᛸᛶᲈᛶ(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lxhss/ᛴᛷᛴᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛷᛳᲈ;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    iget-object p0, p0, Lxhss/ᛴᛴᛷᛲ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛷᛳᲈ;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛳᲀ(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method
