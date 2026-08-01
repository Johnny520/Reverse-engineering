.class public final synthetic Lrj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

.field public final synthetic η:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lrj;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrj;->η:Landroid/widget/EditText;

    .line 8
    .line 9
    iput-object p2, p0, Lrj;->ζ:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;Landroid/widget/EditText;)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lrj;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrj;->ζ:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    iput-object p2, p0, Lrj;->η:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, Lrj;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrj;->ζ:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 7
    .line 8
    iget-object p0, p0, Lrj;->η:Landroid/widget/EditText;

    .line 9
    .line 10
    invoke-static {p0, v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->ι(Landroid/widget/EditText;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lrj;->η:Landroid/widget/EditText;

    .line 15
    .line 16
    iget-object p0, p0, Lrj;->ζ:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 17
    .line 18
    invoke-static {v0, p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->ζ(Landroid/widget/EditText;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
