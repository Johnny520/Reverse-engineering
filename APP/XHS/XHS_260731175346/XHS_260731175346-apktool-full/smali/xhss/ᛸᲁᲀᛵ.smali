.class public final Lxhss/ᛸᲁᲀᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛲᲀᛵ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lxhss/ᛸᲁᲀᛵ;->ᛱᛱᛲᲇ:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;
    .locals 1

    .line 1
    iget-object p2, p2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    new-instance p2, Lxhss/ᲁᛲᛸᲁ;

    .line 8
    .line 9
    iget p0, p0, Lxhss/ᛸᲁᲀᛵ;->ᛱᛱᛲᲇ:I

    .line 10
    .line 11
    invoke-direct {p2, p1, p0}, Lxhss/ᲁᛲᛸᲁ;-><init>(Lxhss/ᲈᛲᛶᛴ;I)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method
