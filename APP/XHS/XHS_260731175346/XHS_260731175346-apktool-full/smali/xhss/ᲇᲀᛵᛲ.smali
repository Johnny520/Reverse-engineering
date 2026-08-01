.class public final Lxhss/ᲇᲀᛵᛲ;
.super Lxhss/ᛳᲈᲈᛲ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛳᲁᲇᛸ:Lxhss/ᲀᛷᲇᛲ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᲀᛷᲇᛲ;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Lxhss/ᲀᛷᲇᛲ;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxhss/ᲇᲀᛵᛲ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛷᲇᛲ;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᲇᛴᲇᛵ()Ljava/util/Random;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᲀᛵᛲ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛷᲇᛲ;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Random;

    .line 8
    .line 9
    return-object p0
.end method
