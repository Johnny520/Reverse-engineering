.class public final synthetic Lcom/example/dyhelper/ui/β;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/ViewGroup;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/example/dyhelper/ui/β;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/example/dyhelper/ui/β;->ζ:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/example/dyhelper/ui/β;->η:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/example/dyhelper/ui/β;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/example/dyhelper/ui/β;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/example/dyhelper/ui/β;->ζ:Landroid/view/ViewGroup;

    .line 7
    .line 8
    check-cast v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/example/dyhelper/ui/β;->η:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object p0, p0, Lcom/example/dyhelper/ui/β;->θ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;

    .line 17
    .line 18
    iget-object v2, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->λ:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ι:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Ls62;->α:Ls62;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    iget-object v0, p0, Lcom/example/dyhelper/ui/β;->ζ:Landroid/view/ViewGroup;

    .line 32
    .line 33
    check-cast v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/example/dyhelper/ui/β;->η:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, La80;

    .line 38
    .line 39
    iget-object p0, p0, Lcom/example/dyhelper/ui/β;->θ:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lum1;

    .line 42
    .line 43
    iget-boolean v2, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->κ:Z

    .line 44
    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget v0, v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 49
    .line 50
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 58
    .line 59
    if-eqz p0, :cond_1

    .line 60
    .line 61
    check-cast p0, Landroid/app/AlertDialog;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 64
    .line 65
    .line 66
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_1
    const-string p0, "dialog"

    .line 70
    .line 71
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    throw p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
