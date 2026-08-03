.class public LYue/ۥ۟ۡۡۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:Landroid/widget/TextView;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥ۠۠ۧۡ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 2
    .param p1    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۡۡۧ;->ۥ:Landroid/widget/TextView;

    new-instance v0, LYue/ۥ۠۠ۧۡ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LYue/ۥ۠۠ۧۡ;-><init>(Landroid/widget/TextView;Z)V

    iput-object v0, p0, LYue/ۥ۟ۡۡۧ;->ۥ۟:LYue/ۥ۠۠ۧۡ;

    return-void
.end method


# virtual methods
.method public ۥ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1
    .param p1    # [Landroid/text/InputFilter;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۡۧ;->ۥ۟:LYue/ۥ۠۠ۧۡ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ;->ۥ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۡۧ;->ۥ۟:LYue/ۥ۠۠ۧۡ;

    invoke-virtual {v0}, LYue/ۥ۠۠ۧۡ;->ۥ۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟(Landroid/util/AttributeSet;I)V
    .locals 3
    .param p1    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟ۡۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۥۢ:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_0
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦۦ:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦۦ:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0, v0}, LYue/ۥ۟ۡۡۧ;->ۥ۟۟۟۟(Z)V

    return-void

    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method public ۥ۟۟۟(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۡۧ;->ۥ۟:LYue/ۥ۠۠ۧۡ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ;->ۥ۟۟(Z)V

    return-void
.end method

.method public ۥ۟۟۟۟(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۡۧ;->ۥ۟:LYue/ۥ۠۠ۧۡ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ;->ۥ۟۟۟(Z)V

    return-void
.end method

.method public ۥ۟۟۟۠(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1
    .param p1    # Landroid/text/method/TransformationMethod;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۡۧ;->ۥ۟:LYue/ۥ۠۠ۧۡ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ;->ۥ۟۟۟۠(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method
