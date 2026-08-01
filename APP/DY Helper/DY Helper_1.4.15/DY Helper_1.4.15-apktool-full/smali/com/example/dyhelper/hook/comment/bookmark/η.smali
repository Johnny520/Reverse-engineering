.class public final synthetic Lcom/example/dyhelper/hook/comment/bookmark/η;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ε:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;

.field public final synthetic θ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

.field public final synthetic ι:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Landroid/widget/TextView;

.field public final synthetic μ:Landroid/widget/TextView;

.field public final synthetic ν:Landroid/widget/ListView;

.field public final synthetic ξ:Landroid/widget/TextView;

.field public final synthetic ο:Landroid/widget/TextView;

.field public final synthetic π:Landroid/widget/TextView;

.field public final synthetic ρ:Landroid/widget/TextView;

.field public final synthetic σ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p7, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ε:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p13, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->η:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->θ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 11
    .line 12
    iput-object p14, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ι:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->κ:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->λ:Landroid/widget/TextView;

    .line 17
    .line 18
    iput-object p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->μ:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p6, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ν:Landroid/widget/ListView;

    .line 21
    .line 22
    iput-object p8, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ξ:Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p9, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ο:Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object p10, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->π:Landroid/widget/TextView;

    .line 27
    .line 28
    iput-object p11, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ρ:Landroid/widget/TextView;

    .line 29
    .line 30
    iput-object p12, p0, Lcom/example/dyhelper/hook/comment/bookmark/η;->σ:Landroid/widget/TextView;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v12, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ρ:Landroid/widget/TextView;

    .line 4
    .line 5
    iget-object v13, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->σ:Landroid/widget/TextView;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ε:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ζ:Landroid/app/Activity;

    .line 11
    .line 12
    move-object v3, v2

    .line 13
    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->η:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;

    .line 14
    .line 15
    move-object v4, v3

    .line 16
    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ι:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;

    .line 17
    .line 18
    move-object v5, v4

    .line 19
    iget-object v4, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->θ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 20
    .line 21
    move-object v6, v5

    .line 22
    iget-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->κ:Landroid/widget/TextView;

    .line 23
    .line 24
    move-object v7, v6

    .line 25
    iget-object v6, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->λ:Landroid/widget/TextView;

    .line 26
    .line 27
    move-object v8, v7

    .line 28
    iget-object v7, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->μ:Landroid/widget/TextView;

    .line 29
    .line 30
    move-object v9, v8

    .line 31
    iget-object v8, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ν:Landroid/widget/ListView;

    .line 32
    .line 33
    move-object v10, v9

    .line 34
    iget-object v9, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ξ:Landroid/widget/TextView;

    .line 35
    .line 36
    move-object v11, v10

    .line 37
    iget-object v10, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->ο:Landroid/widget/TextView;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/example/dyhelper/hook/comment/bookmark/η;->π:Landroid/widget/TextView;

    .line 40
    .line 41
    move-object v14, v11

    .line 42
    move-object v11, v0

    .line 43
    move-object v0, v14

    .line 44
    move-object/from16 v14, p1

    .line 45
    .line 46
    move-object/from16 v15, p2

    .line 47
    .line 48
    move/from16 v16, p3

    .line 49
    .line 50
    move-wide/from16 v17, p4

    .line 51
    .line 52
    invoke-static/range {v0 .. v18}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->κ(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
