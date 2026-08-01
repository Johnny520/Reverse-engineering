.class public final Lxhss/ᲇᛶᲈᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛱᛴᛳᛴ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛱᛴᛳᛴ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᲇᛶᲈᛸ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᲇᛶᲈᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲇᛶᲈᛸ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲇᛶᲈᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lxhss/ᲁᛳᛵᛷ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lxhss/ᲁᛳᛵᛷ;->ᛷᛵᛵᲈ(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :pswitch_0
    iget-object p0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lxhss/ᲁᛳᛵᛷ;->ᛳᲁᲇᛸ()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
