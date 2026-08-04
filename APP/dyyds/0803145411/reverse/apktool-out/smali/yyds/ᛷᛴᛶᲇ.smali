.class public final Lyyds/ᛷᛴᛶᲇ;
.super Lyyds/ᛱᛲᲁᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛷᛴᛶᲇ;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᛷᛴᛶᲇ;


# instance fields
.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛷᛴᛶᲇ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lyyds/ᛷᛴᛶᲇ;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᛷᛴᛶᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛴᛶᲇ;

    .line 9
    .line 10
    new-instance v0, Lyyds/ᛷᛴᛶᲇ;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lyyds/ᛷᛴᛶᲇ;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lyyds/ᛷᛴᛶᲇ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛴᛶᲇ;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛷᛴᛶᲇ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lyyds/ᛱᛲᲁᲀ;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lyyds/ᛷᛴᛶᲇ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    const p0, 0x660905a9

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    instance-of p1, p0, Lyyds/ᲈᛵᲇᛴ;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, Lyyds/ᲈᛵᲇᛴ;

    .line 22
    .line 23
    :cond_0
    return-object v0

    .line 24
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    instance-of p1, p0, Landroid/view/View;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    move-object v0, p0

    .line 35
    check-cast v0, Landroid/view/View;

    .line 36
    .line 37
    :cond_1
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
