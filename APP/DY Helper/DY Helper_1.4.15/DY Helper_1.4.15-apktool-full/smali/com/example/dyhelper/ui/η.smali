.class public final synthetic Lcom/example/dyhelper/ui/η;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/example/dyhelper/ui/η;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/example/dyhelper/ui/η;->ζ:Ljava/lang/Object;

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
    .locals 4

    .line 1
    iget p1, p0, Lcom/example/dyhelper/ui/η;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/example/dyhelper/ui/η;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lp70;

    .line 9
    .line 10
    sget p1, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->Γ:I

    .line 11
    .line 12
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 17
    .line 18
    iget-boolean p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ν:Z

    .line 19
    .line 20
    xor-int/lit8 v0, p1, 0x1

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ν:Z

    .line 23
    .line 24
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Ε:Landroid/widget/LinearLayout;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_5

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 p1, 0x8

    .line 34
    .line 35
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Ζ:Landroid/widget/TextView;

    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-boolean v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ν:Z

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    const/high16 v0, 0x43340000    # 180.0f

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v0, 0x0

    .line 54
    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-wide/16 v2, 0x96

    .line 59
    .line 60
    invoke-virtual {p1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Η:Landroid/widget/LinearLayout;

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    iget-boolean p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ν:Z

    .line 72
    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    const-string p0, "\u6536\u8d77 RGB \u7cbe\u786e\u8c03\u6574"

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    const-string p0, "\u5c55\u5f00 RGB \u7cbe\u786e\u8c03\u6574"

    .line 79
    .line 80
    :goto_2
    invoke-virtual {p1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    const-string p0, "advancedHeader"

    .line 85
    .line 86
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v1

    .line 90
    :cond_4
    const-string p0, "advancedChevron"

    .line 91
    .line 92
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v1

    .line 96
    :cond_5
    const-string p0, "advancedContent"

    .line 97
    .line 98
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v1

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
