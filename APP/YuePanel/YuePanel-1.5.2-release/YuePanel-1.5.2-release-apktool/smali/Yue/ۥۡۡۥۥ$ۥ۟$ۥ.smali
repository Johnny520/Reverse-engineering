.class public LYue/ۥۡۡۥۥ$ۥ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۥۥ$ۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟۠ۦ:I = 0x1

.field public static final ۥ۟۟۠ۧ:I = 0x11

.field public static final ۥ۟۟۠ۨ:I = 0x10

.field public static final ۥ۟۟ۡ:I = 0x100

.field public static final ۥ۟۟ۡ۟:I = 0x1000


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

.field public ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;LYue/ۥۡۡۥۥ$ۥ۟;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/16 v0, 0x11

    iput v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:I

    iput-object p2, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-static {p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    sget-object p3, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۦۧۧ:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_2

    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v0

    sget v1, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۦۨ:I

    if-ne v0, v1, :cond_0

    iget v1, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    goto :goto_1

    :cond_0
    sget v1, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۦۧۨ:I

    if-ne v0, v1, :cond_1

    iget v1, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:I

    :cond_1
    :goto_1
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    iget-object p1, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-static {p1}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟۟۠ۢ(LYue/ۥۡۡۥۥ$ۥ۟;)LYue/ۥۡۡۥۥ;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۡۥۥ;->ۥ۟۟(LYue/ۥۡۡۥۥ;)LYue/ۥۡۡۥۣ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۡۥۣ;->ۥۣ۟۟۠()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-static {v0}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟۟(LYue/ۥۡۡۥۥ$ۥ۟;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LYue/ۥۡۡۥۣ;->getCurrentState()I

    move-result v0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-static {v0}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ(LYue/ۥۡۡۥۥ$ۥ۟;)I

    move-result v0

    invoke-virtual {p1, v0}, LYue/ۥۡۡۥۣ;->ۥۣ۟۟ۤ(I)V

    return-void

    :cond_1
    new-instance v1, LYue/ۥۡۡۥۥ$ۥ۟;

    iget-object v2, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-static {v2}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟۟۠ۢ(LYue/ۥۡۡۥۥ$ۥ۟;)LYue/ۥۡۡۥۥ;

    move-result-object v2

    iget-object v3, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-direct {v1, v2, v3}, LYue/ۥۡۡۥۥ$ۥ۟;-><init>(LYue/ۥۡۡۥۥ;LYue/ۥۡۡۥۥ$ۥ۟;)V

    invoke-static {v1, v0}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟۟۟(LYue/ۥۡۡۥۥ$ۥ۟;I)I

    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-static {v0}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ(LYue/ۥۡۡۥۥ$ۥ۟;)I

    move-result v0

    invoke-static {v1, v0}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟(LYue/ۥۡۡۥۥ$ۥ۟;I)I

    invoke-virtual {p1, v1}, LYue/ۥۡۡۥۣ;->setTransition(LYue/ۥۡۡۥۥ$ۥ۟;)V

    invoke-virtual {p1}, LYue/ۥۡۡۥۣ;->ۥ۟۟ۤۡ()V

    return-void

    :cond_2
    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-static {v0}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟۟۠ۢ(LYue/ۥۡۡۥۥ$ۥ۟;)LYue/ۥۡۡۥۥ;

    move-result-object v0

    iget-object v0, v0, LYue/ۥۡۡۥۥ;->ۥ۟۟:LYue/ۥۡۡۥۥ$ۥ۟;

    iget v1, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_4

    and-int/lit16 v2, v1, 0x100

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    move v2, v3

    goto :goto_1

    :cond_4
    :goto_0
    move v2, v4

    :goto_1
    and-int/lit8 v5, v1, 0x10

    if-nez v5, :cond_6

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    move v1, v3

    goto :goto_3

    :cond_6
    :goto_2
    move v1, v4

    :goto_3
    if-eqz v2, :cond_9

    if-eqz v1, :cond_9

    iget-object v5, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-static {v5}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟۟۠ۢ(LYue/ۥۡۡۥۥ$ۥ۟;)LYue/ۥۡۡۥۥ;

    move-result-object v5

    iget-object v5, v5, LYue/ۥۡۡۥۥ;->ۥ۟۟:LYue/ۥۡۡۥۥ$ۥ۟;

    iget-object v6, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    if-eq v5, v6, :cond_7

    invoke-virtual {p1, v6}, LYue/ۥۡۡۥۣ;->setTransition(LYue/ۥۡۡۥۥ$ۥ۟;)V

    :cond_7
    invoke-virtual {p1}, LYue/ۥۡۡۥۣ;->getCurrentState()I

    move-result v5

    invoke-virtual {p1}, LYue/ۥۡۡۥۣ;->getEndState()I

    move-result v6

    if-eq v5, v6, :cond_a

    invoke-virtual {p1}, LYue/ۥۡۡۥۣ;->getProgress()F

    move-result v5

    const/high16 v6, 0x3f000000    # 0.5f

    cmpl-float v5, v5, v6

    if-lez v5, :cond_8

    goto :goto_4

    :cond_8
    move v1, v3

    :cond_9
    move v3, v2

    :cond_a
    :goto_4
    invoke-virtual {p0, v0, p1}, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟(LYue/ۥۡۡۥۥ$ۥ۟;LYue/ۥۡۡۥۣ;)Z

    move-result v0

    if-eqz v0, :cond_e

    if-eqz v3, :cond_b

    iget v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:I

    and-int/2addr v0, v4

    if-eqz v0, :cond_b

    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-virtual {p1, v0}, LYue/ۥۡۡۥۣ;->setTransition(LYue/ۥۡۡۥۥ$ۥ۟;)V

    invoke-virtual {p1}, LYue/ۥۡۡۥۣ;->ۥ۟۟ۤۡ()V

    goto :goto_5

    :cond_b
    if-eqz v1, :cond_c

    iget v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_c

    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-virtual {p1, v0}, LYue/ۥۡۡۥۣ;->setTransition(LYue/ۥۡۡۥۥ$ۥ۟;)V

    invoke-virtual {p1}, LYue/ۥۡۡۥۣ;->ۥ۟۟ۤۢ()V

    goto :goto_5

    :cond_c
    if-eqz v3, :cond_d

    iget v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_d

    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-virtual {p1, v0}, LYue/ۥۡۡۥۣ;->setTransition(LYue/ۥۡۡۥۥ$ۥ۟;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, LYue/ۥۡۡۥۣ;->setProgress(F)V

    goto :goto_5

    :cond_d
    if-eqz v1, :cond_e

    iget v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:I

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_e

    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-virtual {p1, v0}, LYue/ۥۡۡۥۣ;->setTransition(LYue/ۥۡۡۥۥ$ۥ۟;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LYue/ۥۡۡۥۣ;->setProgress(F)V

    :cond_e
    :goto_5
    return-void
.end method

.method public ۥ(LYue/ۥۡۡۥۣ;ILYue/ۥۡۡۥۥ$ۥ۟;)V
    .locals 6

    iget v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "OnClick could not find id "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MotionScene"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-static {p3}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟۟(LYue/ۥۡۡۥۥ$ۥ۟;)I

    move-result v0

    invoke-static {p3}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ(LYue/ۥۡۡۥۥ$ۥ۟;)I

    move-result p3

    if-ne v0, v1, :cond_2

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_2
    iget v1, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۥ:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-ne p2, v0, :cond_3

    move v2, v4

    goto :goto_1

    :cond_3
    move v2, v3

    :goto_1
    and-int/lit16 v5, v1, 0x100

    if-eqz v5, :cond_4

    if-ne p2, v0, :cond_4

    move v5, v4

    goto :goto_2

    :cond_4
    move v5, v3

    :goto_2
    or-int/2addr v2, v5

    and-int/lit8 v5, v1, 0x1

    if-eqz v5, :cond_5

    if-ne p2, v0, :cond_5

    move v0, v4

    goto :goto_3

    :cond_5
    move v0, v3

    :goto_3
    or-int/2addr v0, v2

    and-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_6

    if-ne p2, p3, :cond_6

    move v2, v4

    goto :goto_4

    :cond_6
    move v2, v3

    :goto_4
    or-int/2addr v0, v2

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_7

    if-ne p2, p3, :cond_7

    move v3, v4

    :cond_7
    or-int p2, v0, v3

    if-eqz p2, :cond_8

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    return-void
.end method

.method public ۥ۟(LYue/ۥۡۡۥۥ$ۥ۟;LYue/ۥۡۡۥۣ;)Z
    .locals 4

    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    const/4 v1, 0x1

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    invoke-static {v0}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ(LYue/ۥۡۡۥۥ$ۥ۟;)I

    move-result p1

    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۡۥۥ$ۥ۟;

    invoke-static {v0}, LYue/ۥۡۡۥۥ$ۥ۟;->ۥ۟۟(LYue/ۥۡۡۥۥ$ۥ۟;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_2

    iget p2, p2, LYue/ۥۡۡۥۣ;->ۥ۟۟۠ۧ:I

    if-eq p2, p1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    return v1

    :cond_2
    iget p2, p2, LYue/ۥۡۡۥۣ;->ۥ۟۟۠ۧ:I

    if-eq p2, v0, :cond_4

    if-ne p2, p1, :cond_3

    goto :goto_1

    :cond_3
    move v1, v3

    :cond_4
    :goto_1
    return v1
.end method

.method public ۥ۟۟(LYue/ۥۡۡۥۣ;)V
    .locals 2

    iget v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, " (*)  could not find id "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LYue/ۥۡۡۥۥ$ۥ۟$ۥ;->ۥ۟۟۠ۤ:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MotionScene"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
