.class public final Lxhss/ᲀᛴᛱᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᲀᛴᛱᛷ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᲀᛴᛱᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget p2, p0, Lxhss/ᲀᛴᛱᛷ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iget-object p3, p0, Lxhss/ᲀᛴᛱᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-wide p4, -0x1411e1b858845L

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {p4, p5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lxhss/ᛴᛶᛴᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛶᛴᛲ;

    .line 20
    .line 21
    check-cast p3, Landroid/app/Activity;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {p3}, Lxhss/ᛴᛶᛴᛲ;->ᛳᲈᲈᛲ(Landroid/app/Activity;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p3, Lxhss/ᲇᛵᛴᛲ;

    .line 39
    .line 40
    iget-object p1, p3, Lxhss/ᲇᛵᛴᛲ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lxhss/ᛷᛴᛱᲀ;

    .line 43
    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    sget p2, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛴᲈᛱᛴ:I

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    invoke-static {p2, p0}, Lxhss/ᲀᛳᛲᛶ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance p2, Lxhss/ᲇᲇᛱ;

    .line 54
    .line 55
    iget-object p3, p3, Lxhss/ᲇᛵᛴᛲ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p3, Lxhss/ᲇᲇᛱ;

    .line 58
    .line 59
    invoke-direct {p2, p3}, Lxhss/ᲇᲇᛱ;-><init>(Lxhss/ᲇᲇᛱ;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p0, p2}, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ(Lxhss/ᲀᛳᛲᛶ;Lxhss/ᲇᲇᛱ;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    sget p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛴᲈᛱᛴ:I

    .line 67
    .line 68
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
