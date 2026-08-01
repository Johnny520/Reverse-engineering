.class public final synthetic Lpj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/widget/Spinner;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/Spinner;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpj;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lpj;->ζ:Landroid/widget/Spinner;

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
    iget v0, p0, Lpj;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lpj;->ζ:Landroid/widget/Spinner;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->δ(Landroid/widget/Spinner;Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->η(Landroid/widget/Spinner;Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
