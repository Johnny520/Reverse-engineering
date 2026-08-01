.class public final synthetic Lcom/example/dyhelper/hook/comment/bookmark/κ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/widget/BaseAdapter;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/BaseAdapter;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/κ;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/κ;->ζ:Landroid/widget/BaseAdapter;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/κ;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/κ;->ζ:Landroid/widget/BaseAdapter;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;

    .line 9
    .line 10
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->β(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;)Ls62;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;

    .line 16
    .line 17
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->α(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;)Ls62;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
