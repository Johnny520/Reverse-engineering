.class public final Lxhss/ᲀᲈᲇᛱ;
.super Lxhss/ᛴᛴᛲᛲ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᛴᛲᛲ;


# static fields
.field public static final ᛷᛴᛷᛱ:Lxhss/ᲀᲈᲇᛱ;

.field public static final ᛸᛴᛶᛳ:Lxhss/ᲀᲈᲇᛱ;

.field public static final ᲀᲇᛳᲁ:Lxhss/ᲀᲈᲇᛱ;

.field public static final ᲇᛴᲇᛵ:Lxhss/ᲀᲈᲇᛱ;

.field public static final ᲇᛶᛴᲀ:Lxhss/ᲀᲈᲇᛱ;


# instance fields
.field public final synthetic ᛳᲁᲇᛸ:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᲀᲈᲇᛱ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lxhss/ᲀᲈᲇᛱ;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxhss/ᲀᲈᲇᛱ;->ᲇᛴᲇᛵ:Lxhss/ᲀᲈᲇᛱ;

    .line 9
    .line 10
    new-instance v0, Lxhss/ᲀᲈᲇᛱ;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lxhss/ᲀᲈᲇᛱ;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lxhss/ᲀᲈᲇᛱ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲈᲇᛱ;

    .line 17
    .line 18
    new-instance v0, Lxhss/ᲀᲈᲇᛱ;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Lxhss/ᲀᲈᲇᛱ;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lxhss/ᲀᲈᲇᛱ;->ᲇᛶᛴᲀ:Lxhss/ᲀᲈᲇᛱ;

    .line 25
    .line 26
    new-instance v0, Lxhss/ᲀᲈᲇᛱ;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, Lxhss/ᲀᲈᲇᛱ;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lxhss/ᲀᲈᲇᛱ;->ᲀᲇᛳᲁ:Lxhss/ᲀᲈᲇᛱ;

    .line 33
    .line 34
    new-instance v0, Lxhss/ᲀᲈᲇᛱ;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2}, Lxhss/ᲀᲈᲇᛱ;-><init>(II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lxhss/ᲀᲈᲇᛱ;->ᛸᛴᛶᛳ:Lxhss/ᲀᲈᲇᛱ;

    .line 41
    .line 42
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᲀᲈᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lxhss/ᛴᛴᛲᛲ;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᲀᲈᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/view/View;

    .line 7
    .line 8
    const p0, 0x64080132

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of p1, p0, Lxhss/ᛲᛸᛱᛸ;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    check-cast p0, Lxhss/ᛲᛸᛱᛸ;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    :goto_0
    return-object p0

    .line 24
    :pswitch_0
    check-cast p1, Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {p1}, Lxhss/ᛱᛲᲁᛸ;->ᛳᲁᲇᛸ(Ljava/lang/Class;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_1
    check-cast p1, Ljava/lang/Class;

    .line 32
    .line 33
    invoke-static {p1}, Lxhss/ᛱᛲᲁᛸ;->ᛳᲁᲇᛸ(Ljava/lang/Class;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1}, Lxhss/ᛱᛲᲁᛸ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_3
    check-cast p1, Lxhss/ᲇᛸᛳᛸ;

    .line 46
    .line 47
    invoke-virtual {p1}, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛶᛳᛵ;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget-object p0, p0, Lxhss/ᲇᛶᛳᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
