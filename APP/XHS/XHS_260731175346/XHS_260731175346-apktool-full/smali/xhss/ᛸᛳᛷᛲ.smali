.class public final Lxhss/ᛸᛳᛷᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᛸᛳᛷᛲ;

.field public static final ᛳᲁᲇᛸ:Lxhss/ᛸᛳᛷᛲ;


# instance fields
.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛸᛳᛷᛲ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᛸᛳᛷᛲ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxhss/ᛸᛳᛷᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛳᛷᛲ;

    .line 8
    .line 9
    new-instance v0, Lxhss/ᛸᛳᛷᛲ;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lxhss/ᛸᛳᛷᛲ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lxhss/ᛸᛳᛷᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛸᛳᛷᛲ;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛸᛳᛷᛲ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᛸᛳᛷᛲ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Comparable;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Comparable;

    .line 9
    .line 10
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast p1, Ljava/lang/Comparable;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Comparable;

    .line 18
    .line 19
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final reversed()Ljava/util/Comparator;
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᛸᛳᛷᛲ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lxhss/ᛸᛳᛷᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛳᛷᛲ;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    sget-object p0, Lxhss/ᛸᛳᛷᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛸᛳᛷᛲ;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
