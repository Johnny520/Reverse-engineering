.class public final Lu5;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lu5;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lu5;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget p1, p0, Lu5;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lu5;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroidx/appcompat/widget/SearchView;

    .line 9
    .line 10
    invoke-virtual {p0, p3}, Landroidx/appcompat/widget/SearchView;->μ(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p0, p0, Lu5;->ζ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Landroidx/appcompat/widget/δ;

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/appcompat/widget/δ;->Κ:Landroidx/appcompat/widget/AppCompatSpinner;

    .line 19
    .line 20
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    if-eqz p4, :cond_0

    .line 28
    .line 29
    iget-object p4, p0, Landroidx/appcompat/widget/δ;->Η:Lt5;

    .line 30
    .line 31
    invoke-virtual {p4, p3}, Lt5;->getItemId(I)J

    .line 32
    .line 33
    .line 34
    move-result-wide p4

    .line 35
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/θ;->dismiss()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
