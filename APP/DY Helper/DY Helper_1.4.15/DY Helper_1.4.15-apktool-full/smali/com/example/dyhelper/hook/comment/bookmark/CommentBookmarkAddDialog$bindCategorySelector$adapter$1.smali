.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog$bindCategorySelector$adapter$1;
.super Landroid/widget/ArrayAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->bindCategorySelector(Landroid/widget/Spinner;Landroid/widget/TextView;Landroid/view/View;Ljava/util/List;Ljava/lang/String;La80;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog$bindCategorySelector$adapter$1;->this$0:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 2
    .line 3
    const p2, 0x1090008

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p3, p2, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 7
    .line 8
    .line 9
    const p1, 0x1090009

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog$bindCategorySelector$adapter$1;->this$0:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 9
    .line 10
    invoke-static {p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$getColors$p(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;)Lxx;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget-object p2, p2, Lxx;->γ:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 21
    .line 22
    .line 23
    instance-of p2, p1, Landroid/widget/TextView;

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    move-object p2, p1

    .line 28
    check-cast p2, Landroid/widget/TextView;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p2, 0x0

    .line 32
    :goto_0
    if-eqz p2, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog$bindCategorySelector$adapter$1;->this$0:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 35
    .line 36
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$getColors$p(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;)Lxx;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    iget-object p3, p3, Lxx;->ζ:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    .line 48
    .line 49
    const/high16 p3, 0x41500000    # 13.0f

    .line 50
    .line 51
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 52
    .line 53
    .line 54
    const/4 p3, 0x0

    .line 55
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 56
    .line 57
    .line 58
    const/16 p3, 0x10

    .line 59
    .line 60
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setGravity(I)V

    .line 61
    .line 62
    .line 63
    const/16 p3, 0xc

    .line 64
    .line 65
    invoke-static {p0, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/16 v1, 0xa

    .line 70
    .line 71
    invoke-static {p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;I)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-static {p0, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;I)I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    invoke-static {p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;I)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-virtual {p2, v0, v2, p3, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 84
    .line 85
    .line 86
    :cond_1
    return-object p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    instance-of p2, p1, Landroid/widget/TextView;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    move-object p2, p1

    .line 16
    check-cast p2, Landroid/widget/TextView;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p2, 0x0

    .line 20
    :goto_0
    if-eqz p2, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog$bindCategorySelector$adapter$1;->this$0:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 23
    .line 24
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$getColors$p(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;)Lxx;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    iget-object p3, p3, Lxx;->ζ:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    .line 37
    const/4 p3, 0x0

    .line 38
    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 39
    .line 40
    .line 41
    const/high16 v0, 0x41500000    # 13.0f

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 47
    .line 48
    .line 49
    const/16 p3, 0x10

    .line 50
    .line 51
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setGravity(I)V

    .line 52
    .line 53
    .line 54
    const/16 p3, 0xc

    .line 55
    .line 56
    invoke-static {p0, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;I)I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    const/16 v0, 0x8

    .line 61
    .line 62
    invoke-static {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;I)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/16 v2, 0x1c

    .line 67
    .line 68
    invoke-static {p0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;I)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;I)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-virtual {p2, p3, v1, v2, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-object p1
.end method
