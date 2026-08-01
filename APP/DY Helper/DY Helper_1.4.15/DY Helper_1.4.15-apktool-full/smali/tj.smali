.class public final synthetic Ltj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ltj;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Ltj;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    .line 1
    iget v0, p0, Ltj;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Ltj;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;

    .line 9
    .line 10
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->γ(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/view/View;Z)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Lnd0;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lnd0;->κ()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_1
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 23
    .line 24
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->α(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;Landroid/view/View;Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
