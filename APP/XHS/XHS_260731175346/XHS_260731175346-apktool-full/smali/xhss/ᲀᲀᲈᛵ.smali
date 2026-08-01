.class public final Lxhss/ᲀᲀᲈᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᛲᛵᛶᲁ;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛲᛵᛶᲁ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᲀᲀᲈᛵ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᲀᲀᲈᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛵᛶᲁ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲀᲀᲈᛵ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲀᲀᲈᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛵᛶᲁ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->callOnClick()Z

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0, p1}, Lxhss/ᛲᛵᛶᲁ;->ᛷᛵᛵᲈ(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 22
    .line 23
    iget-object p1, p0, Lxhss/ᛵᲇᲀᛳ;->ᲁᲁᛴᲁ:Lxhss/ᛲᛱᛷᛲ;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lxhss/ᛵᲇᲀᛳ;->ᛴᲀᛸᛵ:Lxhss/ᛵᲇᲀᛳ;

    .line 28
    .line 29
    invoke-interface {p1, v0}, Lxhss/ᛸᲈᲁᲇ;->ᛷᛵᛵᲈ(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ()V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void

    .line 43
    :pswitch_2
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 47
    .line 48
    invoke-virtual {p0}, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_3
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 56
    .line 57
    invoke-virtual {p0}, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
