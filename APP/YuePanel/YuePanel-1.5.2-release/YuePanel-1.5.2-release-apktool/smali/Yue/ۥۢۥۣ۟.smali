.class public abstract LYue/ۥۢۥۣ۟;
.super LYue/ۥۢۢ۟ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥۣ۟$ۥ۟۟۟;,
        LYue/ۥۢۥۣ۟$ۥ۟۟;,
        LYue/ۥۢۥۣ۟$ۥ;,
        LYue/ۥۢۥۣ۟$ۥ۟;
    }
.end annotation


# static fields
.field public static final MODE_IN:I = 0x1

.field public static final MODE_OUT:I = 0x2

.field private static final PROPNAME_PARENT:Ljava/lang/String; = "android:visibility:parent"

.field private static final PROPNAME_SCREEN_LOCATION:Ljava/lang/String; = "android:visibility:screenLocation"

.field static final PROPNAME_VISIBILITY:Ljava/lang/String; = "android:visibility:visibility"

.field private static final sTransitionProperties:[Ljava/lang/String;


# instance fields
.field private mMode:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "android:visibility:visibility"

    const-string v1, "android:visibility:parent"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥۢۥۣ۟;->sTransitionProperties:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LYue/ۥۢۢ۟ۧ;-><init>()V

    const/4 v0, 0x3

    .line 2
    iput v0, p0, LYue/ۥۢۥۣ۟;->mMode:I

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

    .line 3
    invoke-direct {p0, p1, p2}, LYue/ۥۢۢ۟ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x3

    .line 4
    iput v0, p0, LYue/ۥۢۥۣ۟;->mMode:I

    .line 5
    sget-object v0, LYue/ۥۣۢ۠ۢ;->ۥ۟۟۟۟:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v0, "transitionVisibilityMode"

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, v1}, LYue/ۥۣۢۢۦ;->ۥ۟۟۟ۥ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_0

    .line 8
    invoke-virtual {p0, p2}, LYue/ۥۢۥۣ۟;->setMode(I)V

    :cond_0
    return-void
.end method

.method private captureValues(LYue/ۥۢۢۡۤ;)V
    .locals 3

    iget-object v0, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v1, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "android:visibility:visibility"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    iget-object v1, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-string v2, "android:visibility:parent"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    const-string v1, "android:visibility:screenLocation"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public captureEndValues(LYue/ۥۢۢۡۤ;)V
    .locals 0
    .param p1    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0, p1}, LYue/ۥۢۥۣ۟;->captureValues(LYue/ۥۢۢۡۤ;)V

    return-void
.end method

.method public captureStartValues(LYue/ۥۢۢۡۤ;)V
    .locals 0
    .param p1    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0, p1}, LYue/ۥۢۥۣ۟;->captureValues(LYue/ۥۢۢۡۤ;)V

    return-void
.end method

.method public createAnimator(Landroid/view/ViewGroup;LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)Landroid/animation/Animator;
    .locals 8
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0, p2, p3}, LYue/ۥۢۥۣ۟;->ۥ۟۟ۡ۟(LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)LYue/ۥۢۥۣ۟$ۥ۟۟۟;

    move-result-object v0

    iget-boolean v1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    if-eqz v1, :cond_2

    iget-object v1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/ViewGroup;

    if-nez v1, :cond_0

    iget-object v1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    :cond_0
    iget-boolean v1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟:Z

    if-eqz v1, :cond_1

    iget v5, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟:I

    iget v7, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟:I

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-virtual/range {v2 .. v7}, LYue/ۥۢۥۣ۟;->onAppear(Landroid/view/ViewGroup;LYue/ۥۢۢۡۤ;ILYue/ۥۢۢۡۤ;I)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_1
    iget v3, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟:I

    iget v5, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥۢۥۣ۟;->onDisappear(Landroid/view/ViewGroup;LYue/ۥۢۢۡۤ;ILYue/ۥۢۢۡۤ;I)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public getMode()I
    .locals 1

    iget v0, p0, LYue/ۥۢۥۣ۟;->mMode:I

    return v0
.end method

.method public getTransitionProperties()[Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget-object v0, LYue/ۥۢۥۣ۟;->sTransitionProperties:[Ljava/lang/String;

    return-object v0
.end method

.method public isTransitionRequired(LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)Z
    .locals 4
    .param p1    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    iget-object v1, p2, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    const-string v2, "android:visibility:visibility"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0, p1, p2}, LYue/ۥۢۥۣ۟;->ۥ۟۟ۡ۟(LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)LYue/ۥۢۥۣ۟$ۥ۟۟۟;

    move-result-object p1

    iget-boolean p2, p1, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    if-eqz p2, :cond_3

    iget p2, p1, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟:I

    if-eqz p2, :cond_2

    iget p1, p1, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟:I

    if-nez p1, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method public isVisible(LYue/ۥۢۢۡۤ;)Z
    .locals 3
    .param p1    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    const-string v2, "android:visibility:visibility"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    const-string v2, "android:visibility:parent"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-nez v1, :cond_1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public onAppear(Landroid/view/ViewGroup;LYue/ۥۢۢۡۤ;ILYue/ۥۢۢۡۤ;I)Landroid/animation/Animator;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .line 1
    iget p3, p0, LYue/ۥۢۥۣ۟;->mMode:I

    const/4 p5, 0x1

    and-int/2addr p3, p5

    const/4 v0, 0x0

    if-ne p3, p5, :cond_2

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    .line 2
    iget-object p3, p4, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    const/4 p5, 0x0

    .line 3
    invoke-virtual {p0, p3, p5}, LYue/ۥۢۢ۟ۧ;->getMatchedTransitionValues(Landroid/view/View;Z)LYue/ۥۢۢۡۤ;

    move-result-object v1

    .line 4
    invoke-virtual {p0, p3, p5}, LYue/ۥۢۢ۟ۧ;->getTransitionValues(Landroid/view/View;Z)LYue/ۥۢۢۡۤ;

    move-result-object p3

    .line 5
    invoke-virtual {p0, v1, p3}, LYue/ۥۢۥۣ۟;->ۥ۟۟ۡ۟(LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)LYue/ۥۢۥۣ۟$ۥ۟۟۟;

    move-result-object p3

    .line 6
    iget-boolean p3, p3, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    if-eqz p3, :cond_1

    return-object v0

    .line 7
    :cond_1
    iget-object p3, p4, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-virtual {p0, p1, p3, p2, p4}, LYue/ۥۢۥۣ۟;->onAppear(Landroid/view/ViewGroup;Landroid/view/View;LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public onAppear(Landroid/view/ViewGroup;Landroid/view/View;LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)Landroid/animation/Animator;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .line 8
    const/4 p1, 0x0

    return-object p1
.end method

.method public onDisappear(Landroid/view/ViewGroup;LYue/ۥۢۢۡۤ;ILYue/ۥۢۢۡۤ;I)Landroid/animation/Animator;
    .locals 10
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .line 1
    iget p3, p0, LYue/ۥۢۥۣ۟;->mMode:I

    const/4 v0, 0x2

    and-int/2addr p3, v0

    const/4 v1, 0x0

    if-eq p3, v0, :cond_0

    return-object v1

    :cond_0
    if-nez p2, :cond_1

    return-object v1

    .line 2
    :cond_1
    iget-object p3, p2, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    if-eqz p4, :cond_2

    .line 3
    iget-object v2, p4, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object v2, v1

    .line 4
    :goto_0
    sget v3, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟۟:I

    invoke-virtual {p3, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    move-object v2, v1

    move v6, v5

    goto/16 :goto_5

    :cond_3
    if-eqz v2, :cond_7

    .line 5
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    const/4 v3, 0x4

    if-ne p5, v3, :cond_5

    goto :goto_1

    :cond_5
    if-ne p3, v2, :cond_6

    :goto_1
    move-object v3, v2

    move v6, v4

    move-object v2, v1

    goto :goto_3

    :cond_6
    move-object v2, v1

    move-object v3, v2

    move v6, v5

    goto :goto_3

    :cond_7
    :goto_2
    if-eqz v2, :cond_6

    move-object v3, v1

    move v6, v4

    :goto_3
    if-eqz v6, :cond_9

    .line 6
    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-nez v6, :cond_8

    goto :goto_4

    .line 7
    :cond_8
    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    instance-of v6, v6, Landroid/view/View;

    if-eqz v6, :cond_9

    .line 8
    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    .line 9
    invoke-virtual {p0, v6, v5}, LYue/ۥۢۢ۟ۧ;->getTransitionValues(Landroid/view/View;Z)LYue/ۥۢۢۡۤ;

    move-result-object v7

    .line 10
    invoke-virtual {p0, v6, v5}, LYue/ۥۢۢ۟ۧ;->getMatchedTransitionValues(Landroid/view/View;Z)LYue/ۥۢۢۡۤ;

    move-result-object v8

    .line 11
    invoke-virtual {p0, v7, v8}, LYue/ۥۢۥۣ۟;->ۥ۟۟ۡ۟(LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)LYue/ۥۢۥۣ۟$ۥ۟۟۟;

    move-result-object v7

    .line 12
    iget-boolean v7, v7, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    if-nez v7, :cond_a

    .line 13
    invoke-static {p1, p3, v6}, LYue/ۥۣۢۢۡ;->ۥ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    :cond_9
    move v6, v4

    move-object v9, v3

    move-object v3, v2

    move-object v2, v9

    goto :goto_5

    .line 14
    :cond_a
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v7

    .line 15
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-nez v6, :cond_9

    const/4 v6, -0x1

    if-eq v7, v6, :cond_9

    .line 16
    invoke-virtual {p1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_9

    iget-boolean v6, p0, LYue/ۥۢۢ۟ۧ;->mCanRemoveViews:Z

    if-eqz v6, :cond_9

    :goto_4
    move-object v2, v3

    move v6, v4

    move-object v3, p3

    :goto_5
    if-eqz v3, :cond_e

    if-nez v6, :cond_b

    .line 17
    iget-object p5, p2, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    const-string v1, "android:visibility:screenLocation"

    invoke-interface {p5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, [I

    .line 18
    aget v1, p5, v4

    .line 19
    aget p5, p5, v5

    .line 20
    new-array v0, v0, [I

    .line 21
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 22
    aget v2, v0, v4

    sub-int/2addr v1, v2

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v3, v1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 23
    aget v0, v0, v5

    sub-int/2addr p5, v0

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v0

    sub-int/2addr p5, v0

    invoke-virtual {v3, p5}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 24
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p5

    invoke-virtual {p5, v3}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 25
    :cond_b
    invoke-virtual {p0, p1, v3, p2, p4}, LYue/ۥۢۥۣ۟;->onDisappear(Landroid/view/ViewGroup;Landroid/view/View;LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)Landroid/animation/Animator;

    move-result-object p2

    if-nez v6, :cond_d

    if-nez p2, :cond_c

    .line 26
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    goto :goto_6

    .line 27
    :cond_c
    sget p4, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟۟:I

    invoke-virtual {p3, p4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 28
    new-instance p4, LYue/ۥۢۥۣ۟$ۥ۟۟;

    invoke-direct {p4, p0, p1, v3, p3}, LYue/ۥۢۥۣ۟$ۥ۟۟;-><init>(LYue/ۥۢۥۣ۟;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    .line 29
    invoke-virtual {p2, p4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 30
    invoke-virtual {p2, p4}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 31
    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ;->getRootTransition()LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    invoke-virtual {p1, p4}, LYue/ۥۢۢ۟ۧ;->addListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    :cond_d
    :goto_6
    return-object p2

    :cond_e
    if-eqz v2, :cond_10

    .line 32
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result p3

    .line 33
    invoke-static {v2, v4}, LYue/ۥۢۤۨ;->ۥ۟۟۟ۡ(Landroid/view/View;I)V

    .line 34
    invoke-virtual {p0, p1, v2, p2, p4}, LYue/ۥۢۥۣ۟;->onDisappear(Landroid/view/ViewGroup;Landroid/view/View;LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_f

    .line 35
    new-instance p2, LYue/ۥۢۥۣ۟$ۥ;

    invoke-direct {p2, v2, p5, v5}, LYue/ۥۢۥۣ۟$ۥ;-><init>(Landroid/view/View;IZ)V

    .line 36
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 37
    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ;->getRootTransition()LYue/ۥۢۢ۟ۧ;

    move-result-object p3

    invoke-virtual {p3, p2}, LYue/ۥۢۢ۟ۧ;->addListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    goto :goto_7

    .line 38
    :cond_f
    invoke-static {v2, p3}, LYue/ۥۢۤۨ;->ۥ۟۟۟ۡ(Landroid/view/View;I)V

    :goto_7
    return-object p1

    :cond_10
    return-object v1
.end method

.method public onDisappear(Landroid/view/ViewGroup;Landroid/view/View;LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)Landroid/animation/Animator;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .line 39
    const/4 p1, 0x0

    return-object p1
.end method

.method public setMode(I)V
    .locals 1

    and-int/lit8 v0, p1, -0x4

    if-nez v0, :cond_0

    iput p1, p0, LYue/ۥۢۥۣ۟;->mMode:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only MODE_IN and MODE_OUT flags are allowed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟ۡ۟(LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)LYue/ۥۢۥۣ۟$ۥ۟۟۟;
    .locals 7

    new-instance v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;

    invoke-direct {v0}, LYue/ۥۢۥۣ۟$ۥ۟۟۟;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    iput-boolean v1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟:Z

    const/4 v2, 0x0

    const/4 v3, -0x1

    const-string v4, "android:visibility:parent"

    const-string v5, "android:visibility:visibility"

    if-eqz p1, :cond_0

    iget-object v6, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iput v6, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟:I

    iget-object v6, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    iput-object v6, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    iput v3, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟:I

    iput-object v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/ViewGroup;

    :goto_0
    if-eqz p2, :cond_1

    iget-object v6, p2, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v2, p2, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟:I

    iget-object v2, p2, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/ViewGroup;

    goto :goto_1

    :cond_1
    iput v3, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟:I

    iput-object v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/ViewGroup;

    :goto_1
    const/4 v2, 0x1

    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    iget p1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟:I

    iget p2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟:I

    if-ne p1, p2, :cond_2

    iget-object v3, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/ViewGroup;

    iget-object v4, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/ViewGroup;

    if-ne v3, v4, :cond_2

    return-object v0

    :cond_2
    if-eq p1, p2, :cond_4

    if-nez p1, :cond_3

    iput-boolean v1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟:Z

    iput-boolean v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    goto :goto_2

    :cond_3
    if-nez p2, :cond_8

    iput-boolean v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟:Z

    iput-boolean v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    goto :goto_2

    :cond_4
    iget-object p1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟۠:Landroid/view/ViewGroup;

    if-nez p1, :cond_5

    iput-boolean v1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟:Z

    iput-boolean v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    goto :goto_2

    :cond_5
    iget-object p1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟۟:Landroid/view/ViewGroup;

    if-nez p1, :cond_8

    iput-boolean v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟:Z

    iput-boolean v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    goto :goto_2

    :cond_6
    if-nez p1, :cond_7

    iget p1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟۟:I

    if-nez p1, :cond_7

    iput-boolean v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟:Z

    iput-boolean v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    goto :goto_2

    :cond_7
    if-nez p2, :cond_8

    iget p1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟۟:I

    if-nez p1, :cond_8

    iput-boolean v1, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ۟:Z

    iput-boolean v2, v0, LYue/ۥۢۥۣ۟$ۥ۟۟۟;->ۥ:Z

    :cond_8
    :goto_2
    return-object v0
.end method
