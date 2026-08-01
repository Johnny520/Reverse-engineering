.class public final synthetic Lsj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/widget/EditText;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/widget/EditText;I)V
    .locals 0

    .line 1
    iput p3, p0, Lsj;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lsj;->η:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lsj;->ζ:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget v0, p0, Lsj;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsj;->η:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;

    .line 9
    .line 10
    iget-object p0, p0, Lsj;->ζ:Landroid/widget/EditText;

    .line 11
    .line 12
    invoke-static {v0, p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->β(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/widget/EditText;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    iget-object v0, p0, Lsj;->η:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 20
    .line 21
    iget-object p0, p0, Lsj;->ζ:Landroid/widget/EditText;

    .line 22
    .line 23
    invoke-static {v0, p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->ε(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;Landroid/widget/EditText;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
