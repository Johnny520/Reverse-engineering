.class public LYue/ۥ۠ۡۦۡ;
.super LYue/ۥۢۥۣ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۡۦۡ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:Ljava/lang/String; = "android:fade:transitionAlpha"

.field public static final ۥ۟۟۠ۤ:Ljava/lang/String; = "Fade"

.field public static final ۥ۟۟۠ۥ:I = 0x1

.field public static final ۥ۟۟۠ۦ:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, LYue/ۥۢۥۣ۟;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۢۥۣ۟;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, LYue/ۥۢۥۣ۟;->setMode(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0, p1, p2}, LYue/ۥۢۥۣ۟;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    sget-object v0, LYue/ۥۣۢ۠ۢ;->ۥ۟۟۟۠:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0}, LYue/ۥۢۥۣ۟;->getMode()I

    move-result v1

    .line 8
    const-string v2, "fadingMode"

    invoke-static {p1, p2, v2, v0, v1}, LYue/ۥۣۢۢۦ;->ۥ۟۟۟ۥ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    .line 9
    invoke-virtual {p0, p2}, LYue/ۥۢۥۣ۟;->setMode(I)V

    .line 10
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static ۥ۟۟ۡۡ(LYue/ۥۢۢۡۤ;F)F
    .locals 1

    if-eqz p0, :cond_0

    iget-object p0, p0, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    const-string v0, "android:fade:transitionAlpha"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p1

    :cond_0
    return p1
.end method


# virtual methods
.method public captureStartValues(LYue/ۥۢۢۡۤ;)V
    .locals 2
    .param p1    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1}, LYue/ۥۢۥۣ۟;->captureStartValues(LYue/ۥۢۢۡۤ;)V

    iget-object v0, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۤ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-nez v0, :cond_1

    iget-object v0, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    invoke-static {v0}, LYue/ۥۢۤۨ;->ۥ۟(Landroid/view/View;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :cond_1
    :goto_0
    iget-object p1, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    const-string v1, "android:fade:transitionAlpha"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public isSeekingSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
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

    invoke-static {p2}, LYue/ۥۢۤۨ;->ۥ۟۟(Landroid/view/View;)V

    const/4 p1, 0x0

    invoke-static {p3, p1}, LYue/ۥ۠ۡۦۡ;->ۥ۟۟ۡۡ(LYue/ۥۢۢۡۤ;F)F

    move-result p1

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-virtual {p0, p2, p1, p3}, LYue/ۥ۠ۡۦۡ;->ۥ۟۟ۡ۠(Landroid/view/View;FF)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method public onDisappear(Landroid/view/ViewGroup;Landroid/view/View;LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)Landroid/animation/Animator;
    .locals 1
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

    invoke-static {p2}, LYue/ۥۢۤۨ;->ۥ۟۟(Landroid/view/View;)V

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p3, p1}, LYue/ۥ۠ۡۦۡ;->ۥ۟۟ۡۡ(LYue/ۥۢۢۡۤ;F)F

    move-result p3

    const/4 v0, 0x0

    invoke-virtual {p0, p2, p3, v0}, LYue/ۥ۠ۡۦۡ;->ۥ۟۟ۡ۠(Landroid/view/View;FF)Landroid/animation/Animator;

    move-result-object p3

    if-nez p3, :cond_0

    invoke-static {p4, p1}, LYue/ۥ۠ۡۦۡ;->ۥ۟۟ۡۡ(LYue/ۥۢۢۡۤ;F)F

    move-result p1

    invoke-static {p2, p1}, LYue/ۥۢۤۨ;->ۥ۟۟۟۠(Landroid/view/View;F)V

    :cond_0
    return-object p3
.end method

.method public final ۥ۟۟ۡ۠(Landroid/view/View;FF)Landroid/animation/Animator;
    .locals 2

    cmpl-float v0, p2, p3

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1, p2}, LYue/ۥۢۤۨ;->ۥ۟۟۟۠(Landroid/view/View;F)V

    sget-object p2, LYue/ۥۢۤۨ;->ۥ۟۟:Landroid/util/Property;

    const/4 v0, 0x1

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p3, v0, v1

    invoke-static {p1, p2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    new-instance p3, LYue/ۥ۠ۡۦۡ$ۥ;

    invoke-direct {p3, p1}, LYue/ۥ۠ۡۦۡ$ۥ;-><init>(Landroid/view/View;)V

    invoke-virtual {p2, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ;->getRootTransition()LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    invoke-virtual {p1, p3}, LYue/ۥۢۢ۟ۧ;->addListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    return-object p2
.end method
