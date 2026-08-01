.class public Llin/xposed/hook/util/qq/QQAIOTool;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static contentId:I

.field private static contentViewId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static findContentView(Landroid/view/ViewGroup;)Landroid/widget/LinearLayout;
    .locals 1

    .line 1
    sget v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/LinearLayout;

    .line 8
    .line 9
    return-object p0
.end method

.method public static getContentId(Landroid/view/ViewGroup;)I
    .locals 1

    .line 1
    sget v0, Llin/xposed/hook/util/qq/QQAIOTool;->contentViewId:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p0}, Llin/xposed/hook/util/qq/QQAIOTool;->findContentView(Landroid/view/ViewGroup;)Landroid/widget/LinearLayout;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    sput p0, Llin/xposed/hook/util/qq/QQAIOTool;->contentViewId:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    return p0

    .line 17
    :catch_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static getContentView(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    invoke-static {p0}, Llin/xposed/hook/util/qq/QQAIOTool;->getContentId(Landroid/view/ViewGroup;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/view/ViewGroup;

    .line 10
    .line 11
    return-object p0
.end method

.method public static hasContentMessage(Landroid/view/ViewGroup;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x5

    .line 6
    if-lt p0, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method
