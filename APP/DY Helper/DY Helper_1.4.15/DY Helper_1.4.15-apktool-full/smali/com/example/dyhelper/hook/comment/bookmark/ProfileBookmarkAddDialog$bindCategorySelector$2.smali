.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->bindCategorySelector(Landroid/widget/Spinner;Landroid/widget/TextView;Landroid/view/View;Ljava/util/List;Ljava/lang/String;La80;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onChanged:La80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La80;"
        }
    .end annotation
.end field

.field final synthetic $tvValue:Landroid/widget/TextView;

.field final synthetic this$0:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/widget/TextView;La80;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/widget/TextView;",
            "La80;",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;->$categories:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;->$tvValue:Landroid/widget/TextView;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;->$onChanged:La80;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;->this$0:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;->$categories:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p3, p1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const-string p1, ""

    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    const-string p1, "\u9ed8\u8ba4"

    .line 23
    .line 24
    :cond_1
    iget-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;->$tvValue:Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    iget-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;->$onChanged:La80;

    .line 30
    .line 31
    invoke-interface {p3, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    instance-of p1, p2, Landroid/widget/TextView;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    check-cast p2, Landroid/widget/TextView;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 p2, 0x0

    .line 42
    :goto_0
    if-eqz p2, :cond_3

    .line 43
    .line 44
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog$bindCategorySelector$2;->this$0:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;

    .line 45
    .line 46
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->access$getColors$p(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;)Lxx;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iget-object p0, p0, Lxx;->ζ:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method
