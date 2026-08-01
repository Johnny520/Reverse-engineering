.class public Lxhss/ᲀᛶᲈᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛲᲀᛵ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;
    .locals 0

    .line 1
    iget-object p0, p2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 2
    .line 3
    const-class p1, Ljava/util/Date;

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    new-instance p0, Lxhss/ᛱᛵᛳᲈ;

    .line 8
    .line 9
    sget-object p1, Lxhss/ᛶᲇᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛳᲇᛲ;

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-direct {p0, p1, p2}, Lxhss/ᛱᛵᛳᲈ;-><init>(Lxhss/ᛶᲇᛵᛴ;I)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method
