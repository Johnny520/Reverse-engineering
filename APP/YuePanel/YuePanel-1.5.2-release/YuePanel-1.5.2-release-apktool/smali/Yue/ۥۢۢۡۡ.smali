.class public LYue/ۥۢۢۡۡ;
.super LYue/ۥۢۢ۟ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۢۡۡ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۨ:I = 0x1

.field public static final ۥ۟۟ۡ:I = 0x2

.field public static final ۥ۟۟ۡ۟:I = 0x4

.field public static final ۥ۟۟ۡ۠:I = 0x8

.field public static final ۥ۟۟ۡۡ:I = 0x0

.field public static final ۥ۟۟ۡۢ:I = 0x1


# instance fields
.field public ۥۣ۟۟۠:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e2\u06e2\u06df\u06e7;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:Z

.field public ۥ۟۟۠ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LYue/ۥۢۢ۟ۧ;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۤ:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۦ:Z

    .line 5
    iput v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 6
    invoke-direct {p0, p1, p2}, LYue/ۥۢۢ۟ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۤ:Z

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۦ:Z

    .line 10
    iput v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    .line 11
    sget-object v1, LYue/ۥۣۢ۠ۢ;->ۥۣ۟۟۟:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 12
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v1, "transitionOrdering"

    invoke-static {p1, p2, v1, v0, v0}, LYue/ۥۣۢۢۦ;->ۥ۟۟۟ۥ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    .line 13
    invoke-virtual {p0, p2}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۢۧ(I)LYue/ۥۢۢۡۡ;

    .line 14
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public bridge synthetic addListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۡ۟(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addTarget(I)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۡ۠(I)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addTarget(Landroid/view/View;)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۡۡ(Landroid/view/View;)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addTarget(Ljava/lang/Class;)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 3
    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۡۢ(Ljava/lang/Class;)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addTarget(Ljava/lang/String;)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 4
    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public cancel()V
    .locals 3
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-super {p0}, LYue/ۥۢۢ۟ۧ;->cancel()V

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2}, LYue/ۥۢۢ۟ۧ;->cancel()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public captureEndValues(LYue/ۥۢۢۡۤ;)V
    .locals 3
    .param p1    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-virtual {p0, v0}, LYue/ۥۢۢ۟ۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    iget-object v2, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-virtual {v1, v2}, LYue/ۥۢۢ۟ۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->captureEndValues(LYue/ۥۢۢۡۤ;)V

    iget-object v2, p1, LYue/ۥۢۢۡۤ;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public capturePropagationValues(LYue/ۥۢۢۡۤ;)V
    .locals 3

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->capturePropagationValues(LYue/ۥۢۢۡۤ;)V

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, p1}, LYue/ۥۢۢ۟ۧ;->capturePropagationValues(LYue/ۥۢۢۡۤ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public captureStartValues(LYue/ۥۢۢۡۤ;)V
    .locals 3
    .param p1    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-virtual {p0, v0}, LYue/ۥۢۢ۟ۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    iget-object v2, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-virtual {v1, v2}, LYue/ۥۢۢ۟ۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->captureStartValues(LYue/ۥۢۢۡۤ;)V

    iget-object v2, p1, LYue/ۥۢۢۡۤ;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public clone()LYue/ۥۢۢ۟ۧ;
    .locals 4
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 2
    invoke-super {p0}, LYue/ۥۢۢ۟ۧ;->clone()LYue/ۥۢۢ۟ۧ;

    move-result-object v0

    check-cast v0, LYue/ۥۢۢۡۡ;

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    .line 4
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 5
    iget-object v3, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v3}, LYue/ۥۢۢ۟ۧ;->clone()LYue/ۥۢۢ۟ۧ;

    move-result-object v3

    invoke-virtual {v0, v3}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۡۥ(LYue/ۥۢۢ۟ۧ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, LYue/ۥۢۢۡۡ;->clone()LYue/ۥۢۢ۟ۧ;

    move-result-object v0

    return-object v0
.end method

.method public createAnimators(Landroid/view/ViewGroup;LYue/ۥۢۢۡۥ;LYue/ۥۢۢۡۥ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 12
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۢۡۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # LYue/ۥۢۢۡۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Ljava/util/ArrayList;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p5    # Ljava/util/ArrayList;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e5;",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e5;",
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e4;",
            ">;",
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e4;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ;->getStartDelay()J

    move-result-wide v1

    iget-object v3, v0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    iget-object v5, v0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LYue/ۥۢۢ۟ۧ;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_2

    iget-boolean v5, v0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۤ:Z

    if-nez v5, :cond_0

    if-nez v4, :cond_2

    :cond_0
    invoke-virtual {v6}, LYue/ۥۢۢ۟ۧ;->getStartDelay()J

    move-result-wide v9

    cmp-long v5, v9, v7

    if-lez v5, :cond_1

    add-long/2addr v9, v1

    invoke-virtual {v6, v9, v10}, LYue/ۥۢۢ۟ۧ;->setStartDelay(J)LYue/ۥۢۢ۟ۧ;

    goto :goto_1

    :cond_1
    invoke-virtual {v6, v1, v2}, LYue/ۥۢۢ۟ۧ;->setStartDelay(J)LYue/ۥۢۢ۟ۧ;

    :cond_2
    :goto_1
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-virtual/range {v6 .. v11}, LYue/ۥۢۢ۟ۧ;->createAnimators(Landroid/view/ViewGroup;LYue/ۥۢۢۡۥ;LYue/ۥۢۢۡۥ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public excludeTarget(IZ)LYue/ۥۢۢ۟ۧ;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    .line 7
    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 8
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1, p2}, LYue/ۥۢۢ۟ۧ;->excludeTarget(IZ)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9
    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۢۢ۟ۧ;->excludeTarget(IZ)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    return-object p1
.end method

.method public excludeTarget(Landroid/view/View;Z)LYue/ۥۢۢ۟ۧ;
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1, p2}, LYue/ۥۢۢ۟ۧ;->excludeTarget(Landroid/view/View;Z)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۢۢ۟ۧ;->excludeTarget(Landroid/view/View;Z)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    return-object p1
.end method

.method public excludeTarget(Ljava/lang/Class;Z)LYue/ۥۢۢ۟ۧ;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;Z)",
            "LYue/\u06e5\u06e2\u06e2\u06df\u06e7;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 10
    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 11
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1, p2}, LYue/ۥۢۢ۟ۧ;->excludeTarget(Ljava/lang/Class;Z)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 12
    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۢۢ۟ۧ;->excludeTarget(Ljava/lang/Class;Z)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    return-object p1
.end method

.method public excludeTarget(Ljava/lang/String;Z)LYue/ۥۢۢ۟ۧ;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 5
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1, p2}, LYue/ۥۢۢ۟ۧ;->excludeTarget(Ljava/lang/String;Z)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_0
    invoke-super {p0, p1, p2}, LYue/ۥۢۢ۟ۧ;->excludeTarget(Ljava/lang/String;Z)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    return-object p1
.end method

.method public forceToEnd(Landroid/view/ViewGroup;)V
    .locals 3
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->forceToEnd(Landroid/view/ViewGroup;)V

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, p1}, LYue/ۥۢۢ۟ۧ;->forceToEnd(Landroid/view/ViewGroup;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public hasAnimators()Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2}, LYue/ۥۢۢ۟ۧ;->hasAnimators()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public isSeekingSupported()Z
    .locals 4

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v3}, LYue/ۥۢۢ۟ۧ;->isSeekingSupported()Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public pause(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->pause(Landroid/view/View;)V

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, p1}, LYue/ۥۢۢ۟ۧ;->pause(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public prepareAnimatorsForSeeking()V
    .locals 7
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x22
    .end annotation

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LYue/ۥۢۢ۟ۧ;->mTotalDuration:J

    new-instance v0, LYue/ۥۢۢۡۡ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۢۢۡۡ$ۥ۟;-><init>(LYue/ۥۢۢۡۡ;)V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, v0}, LYue/ۥۢۢ۟ۧ;->addListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2}, LYue/ۥۢۢ۟ۧ;->prepareAnimatorsForSeeking()V

    invoke-virtual {v2}, LYue/ۥۢۢ۟ۧ;->getTotalDurationMillis()J

    move-result-wide v3

    iget-boolean v5, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۤ:Z

    if-eqz v5, :cond_0

    iget-wide v5, p0, LYue/ۥۢۢ۟ۧ;->mTotalDuration:J

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, LYue/ۥۢۢ۟ۧ;->mTotalDuration:J

    goto :goto_1

    :cond_0
    iget-wide v5, p0, LYue/ۥۢۢ۟ۧ;->mTotalDuration:J

    iput-wide v5, v2, LYue/ۥۢۢ۟ۧ;->mSeekOffsetInParent:J

    add-long/2addr v5, v3

    iput-wide v5, p0, LYue/ۥۢۢ۟ۧ;->mTotalDuration:J

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic removeListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۢ۟(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic removeTarget(I)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۢ۠(I)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic removeTarget(Landroid/view/View;)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۢۡ(Landroid/view/View;)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic removeTarget(Ljava/lang/Class;)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 3
    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۢۢ(Ljava/lang/Class;)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic removeTarget(Ljava/lang/String;)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 4
    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥۣ۟۟ۢ(Ljava/lang/String;)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public resume(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->resume(Landroid/view/View;)V

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, p1}, LYue/ۥۢۢ۟ۧ;->resume(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public runAnimators()V
    .locals 4
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ;->start()V

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ;->end()V

    return-void

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢۢۡۡ;->ۥۣ۟۟()V

    iget-boolean v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۤ:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    new-instance v3, LYue/ۥۢۢۡۡ$ۥ;

    invoke-direct {v3, p0, v2}, LYue/ۥۢۢۡۡ$ۥ;-><init>(LYue/ۥۢۢۡۡ;LYue/ۥۢۢ۟ۧ;)V

    invoke-virtual {v1, v3}, LYue/ۥۢۢ۟ۧ;->addListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۢ۟ۧ;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LYue/ۥۢۢ۟ۧ;->runAnimators()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1}, LYue/ۥۢۢ۟ۧ;->runAnimators()V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public setCanRemoveViews(Z)V
    .locals 3

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->setCanRemoveViews(Z)V

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, p1}, LYue/ۥۢۢ۟ۧ;->setCanRemoveViews(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setCurrentPlayTimeMillis(JJ)V
    .locals 18
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x22
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    invoke-virtual/range {p0 .. p0}, LYue/ۥۢۢ۟ۧ;->getTotalDurationMillis()J

    move-result-wide v5

    iget-object v7, v0, LYue/ۥۢۢ۟ۧ;->mParent:LYue/ۥۢۢۡۡ;

    const-wide/16 v8, 0x0

    if-eqz v7, :cond_2

    cmp-long v7, v1, v8

    if-gez v7, :cond_0

    cmp-long v7, v3, v8

    if-ltz v7, :cond_1

    :cond_0
    cmp-long v7, v1, v5

    if-lez v7, :cond_2

    cmp-long v7, v3, v5

    if-lez v7, :cond_2

    :cond_1
    return-void

    :cond_2
    cmp-long v7, v1, v3

    const/4 v10, 0x0

    if-gez v7, :cond_3

    const/4 v12, 0x1

    goto :goto_0

    :cond_3
    move v12, v10

    :goto_0
    cmp-long v13, v1, v8

    if-ltz v13, :cond_4

    cmp-long v14, v3, v8

    if-ltz v14, :cond_5

    :cond_4
    cmp-long v14, v1, v5

    if-gtz v14, :cond_6

    cmp-long v14, v3, v5

    if-lez v14, :cond_6

    :cond_5
    iput-boolean v10, v0, LYue/ۥۢۢ۟ۧ;->mEnded:Z

    sget-object v14, LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;->ۥ:LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;

    invoke-virtual {v0, v14, v12}, LYue/ۥۢۢ۟ۧ;->notifyListeners(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;Z)V

    :cond_6
    iget-boolean v14, v0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۤ:Z

    if-eqz v14, :cond_8

    :goto_1
    iget-object v7, v0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v10, v7, :cond_7

    iget-object v7, v0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v7, v1, v2, v3, v4}, LYue/ۥۢۢ۟ۧ;->setCurrentPlayTimeMillis(JJ)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_7
    move/from16 v16, v12

    goto :goto_4

    :cond_8
    invoke-virtual {v0, v3, v4}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۢ(J)I

    move-result v10

    if-ltz v7, :cond_a

    :goto_2
    iget-object v7, v0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v10, v7, :cond_7

    iget-object v7, v0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LYue/ۥۢۢ۟ۧ;

    iget-wide v14, v7, LYue/ۥۢۢ۟ۧ;->mSeekOffsetInParent:J

    move/from16 v16, v12

    sub-long v11, v1, v14

    cmp-long v17, v11, v8

    if-gez v17, :cond_9

    goto :goto_4

    :cond_9
    sub-long v14, v3, v14

    invoke-virtual {v7, v11, v12, v14, v15}, LYue/ۥۢۢ۟ۧ;->setCurrentPlayTimeMillis(JJ)V

    add-int/lit8 v10, v10, 0x1

    move/from16 v12, v16

    goto :goto_2

    :cond_a
    move/from16 v16, v12

    :goto_3
    if-ltz v10, :cond_c

    iget-object v7, v0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LYue/ۥۢۢ۟ۧ;

    iget-wide v11, v7, LYue/ۥۢۢ۟ۧ;->mSeekOffsetInParent:J

    sub-long v14, v1, v11

    sub-long v11, v3, v11

    invoke-virtual {v7, v14, v15, v11, v12}, LYue/ۥۢۢ۟ۧ;->setCurrentPlayTimeMillis(JJ)V

    cmp-long v7, v14, v8

    if-ltz v7, :cond_b

    goto :goto_4

    :cond_b
    add-int/lit8 v10, v10, -0x1

    goto :goto_3

    :cond_c
    :goto_4
    iget-object v7, v0, LYue/ۥۢۢ۟ۧ;->mParent:LYue/ۥۢۢۡۡ;

    if-eqz v7, :cond_10

    cmp-long v1, v1, v5

    if-lez v1, :cond_d

    cmp-long v2, v3, v5

    if-lez v2, :cond_e

    :cond_d
    if-gez v13, :cond_10

    cmp-long v2, v3, v8

    if-ltz v2, :cond_10

    :cond_e
    if-lez v1, :cond_f

    const/4 v1, 0x1

    iput-boolean v1, v0, LYue/ۥۢۢ۟ۧ;->mEnded:Z

    :cond_f
    sget-object v1, LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;->ۥ۟:LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;

    move/from16 v11, v16

    invoke-virtual {v0, v1, v11}, LYue/ۥۢۢ۟ۧ;->notifyListeners(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;Z)V

    :cond_10
    return-void
.end method

.method public bridge synthetic setDuration(J)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۢۥ(J)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public setEpicenterCallback(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟۠;)V
    .locals 3
    .param p1    # LYue/ۥۢۢ۟ۧ$ۥ۟۟۟۠;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->setEpicenterCallback(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟۠;)V

    iget v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, p1}, LYue/ۥۢۢ۟ۧ;->setEpicenterCallback(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟۠;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic setInterpolator(Landroid/animation/TimeInterpolator;)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .param p1    # Landroid/animation/TimeInterpolator;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۢۦ(Landroid/animation/TimeInterpolator;)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public setPathMotion(LYue/ۥۣۡۨۡ;)V
    .locals 2
    .param p1    # LYue/ۥۣۡۨۡ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->setPathMotion(LYue/ۥۣۡۨۡ;)V

    iget v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->setPathMotion(LYue/ۥۣۡۨۡ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setPropagation(LYue/ۥۢۢۡ;)V
    .locals 3
    .param p1    # LYue/ۥۢۢۡ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->setPropagation(LYue/ۥۢۢۡ;)V

    iget v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, p1}, LYue/ۥۢۢ۟ۧ;->setPropagation(LYue/ۥۢۢۡ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic setStartDelay(J)LYue/ۥۢۢ۟ۧ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۢۨ(J)LYue/ۥۢۢۡۡ;

    move-result-object p1

    return-object p1
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۢ۟ۧ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, LYue/ۥۢۢ۟ۧ;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public ۥ۟۟ۡ۟(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢۡۡ;
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->addListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥ۟۟ۡ۠(I)LYue/ۥۢۢۡۡ;
    .locals 2
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->addTarget(I)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->addTarget(I)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥ۟۟ۡۡ(Landroid/view/View;)LYue/ۥۢۢۡۡ;
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->addTarget(Landroid/view/View;)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->addTarget(Landroid/view/View;)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥ۟۟ۡۢ(Ljava/lang/Class;)LYue/ۥۢۢۡۡ;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e1;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->addTarget(Ljava/lang/Class;)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->addTarget(Ljava/lang/Class;)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۢۢۡۡ;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->addTarget(Ljava/lang/String;)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->addTarget(Ljava/lang/String;)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥ۟۟ۡۤ(LYue/ۥۢۢ۟ۧ;)LYue/ۥۢۢۡۡ;
    .locals 4
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۡۥ(LYue/ۥۢۢ۟ۧ;)V

    iget-wide v0, p0, LYue/ۥۢۢ۟ۧ;->mDuration:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۢ۟ۧ;->setDuration(J)LYue/ۥۢۢ۟ۧ;

    :cond_0
    iget v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ;->getInterpolator()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥۢۢ۟ۧ;->setInterpolator(Landroid/animation/TimeInterpolator;)LYue/ۥۢۢ۟ۧ;

    :cond_1
    iget v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ;->getPropagation()LYue/ۥۢۢۡ;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥۢۢ۟ۧ;->setPropagation(LYue/ۥۢۢۡ;)V

    :cond_2
    iget v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ;->getPathMotion()LYue/ۥۣۡۨۡ;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥۢۢ۟ۧ;->setPathMotion(LYue/ۥۣۡۨۡ;)V

    :cond_3
    iget v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ;->getEpicenterCallback()LYue/ۥۢۢ۟ۧ$ۥ۟۟۟۠;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥۢۢ۟ۧ;->setEpicenterCallback(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟۠;)V

    :cond_4
    return-object p0
.end method

.method public final ۥ۟۟ۡۥ(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, p1, LYue/ۥۢۢ۟ۧ;->mParent:LYue/ۥۢۢۡۡ;

    return-void
.end method

.method public ۥ۟۟ۡۦ()I
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public ۥ۟۟ۡۧ(I)LYue/ۥۢۢ۟ۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    if-ltz p1, :cond_1

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢ۟ۧ;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟ۡۨ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۥ۟۟ۢ(J)I
    .locals 4

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    iget-wide v2, v2, LYue/ۥۢۢ۟ۧ;->mSeekOffsetInParent:J

    cmp-long v2, v2, p1

    if-lez v2, :cond_0

    sub-int/2addr v1, v0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v0

    return p1
.end method

.method public ۥ۟۟ۢ۟(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢۡۡ;
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->removeListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥ۟۟ۢ۠(I)LYue/ۥۢۢۡۡ;
    .locals 2
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->removeTarget(I)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->removeTarget(I)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥ۟۟ۢۡ(Landroid/view/View;)LYue/ۥۢۢۡۡ;
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->removeTarget(Landroid/view/View;)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->removeTarget(Landroid/view/View;)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥ۟۟ۢۢ(Ljava/lang/Class;)LYue/ۥۢۢۡۡ;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e1;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->removeTarget(Ljava/lang/Class;)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->removeTarget(Ljava/lang/Class;)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥۣ۟۟ۢ(Ljava/lang/String;)LYue/ۥۢۢۡۡ;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v1, p1}, LYue/ۥۢۢ۟ۧ;->removeTarget(Ljava/lang/String;)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->removeTarget(Ljava/lang/String;)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥ۟۟ۢۤ(LYue/ۥۢۢ۟ۧ;)LYue/ۥۢۢۡۡ;
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p1, LYue/ۥۢۢ۟ۧ;->mParent:LYue/ۥۢۢۡۡ;

    return-object p0
.end method

.method public ۥ۟۟ۢۥ(J)LYue/ۥۢۢۡۡ;
    .locals 4
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥۢۢ۟ۧ;->setDuration(J)LYue/ۥۢۢ۟ۧ;

    iget-wide v0, p0, LYue/ۥۢۢ۟ۧ;->mDuration:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, p1, p2}, LYue/ۥۢۢ۟ۧ;->setDuration(J)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟ۢۦ(Landroid/animation/TimeInterpolator;)LYue/ۥۢۢۡۡ;
    .locals 3
    .param p1    # Landroid/animation/TimeInterpolator;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۧ:I

    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, p1}, LYue/ۥۢۢ۟ۧ;->setInterpolator(Landroid/animation/TimeInterpolator;)LYue/ۥۢۢ۟ۧ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LYue/ۥۢۢ۟ۧ;->setInterpolator(Landroid/animation/TimeInterpolator;)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public ۥ۟۟ۢۧ(I)LYue/ۥۢۢۡۡ;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۤ:Z

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid parameter for TransitionSet ordering: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-boolean v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۤ:Z

    :goto_0
    return-object p0
.end method

.method public ۥ۟۟ۢۨ(J)LYue/ۥۢۢۡۡ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥۢۢ۟ۧ;->setStartDelay(J)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    check-cast p1, LYue/ۥۢۢۡۡ;

    return-object p1
.end method

.method public final ۥۣ۟۟()V
    .locals 3

    new-instance v0, LYue/ۥۢۢۡۡ$ۥ۟۟;

    invoke-direct {v0, p0}, LYue/ۥۢۢۡۡ$ۥ۟۟;-><init>(LYue/ۥۢۢۡۡ;)V

    iget-object v1, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, v0}, LYue/ۥۢۢ۟ۧ;->addListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۥ:I

    return-void
.end method
