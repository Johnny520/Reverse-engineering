.class public LYue/ۥ۠۠ۧۡ$ۥ;
.super LYue/ۥ۠۠ۧۡ$ۥ۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۠ۧۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/widget/TextView;

.field public final ۥ۟:LYue/ۥ۠۠ۦۥ;

.field public ۥ۟۟:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, LYue/ۥ۠۠ۧۡ$ۥ۟;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ:Landroid/widget/TextView;

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟:Z

    new-instance v0, LYue/ۥ۠۠ۦۥ;

    invoke-direct {v0, p1}, LYue/ۥ۠۠ۦۥ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟:LYue/ۥ۠۠ۦۥ;

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

    iget-boolean v0, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥۣ۟۟۟([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟ۡ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟:Z

    return v0
.end method

.method public ۥ۟۟(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟۟()V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟:Z

    invoke-virtual {p0}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟۟()V

    invoke-virtual {p0}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟ۦ()V

    return-void
.end method

.method public ۥ۟۟۟۟()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟۠(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

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

    iget-boolean v0, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟ۧ(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟ۥ(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۡ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 5
    .param p1    # [Landroid/text/InputFilter;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    iget-object v4, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟:LYue/ۥ۠۠ۦۥ;

    if-ne v3, v4, :cond_0

    return-object p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    array-length v2, p1

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [Landroid/text/InputFilter;

    invoke-static {p1, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟:LYue/ۥ۠۠ۦۥ;

    aput-object p1, v2, v0

    return-object v2
.end method

.method public final ۥ۟۟۟ۢ([Landroid/text/InputFilter;)Landroid/util/SparseArray;
    .locals 4
    .param p1    # [Landroid/text/InputFilter;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroid/text/InputFilter;",
            ")",
            "Landroid/util/SparseArray<",
            "Landroid/text/InputFilter;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    instance-of v3, v2, LYue/ۥ۠۠ۦۥ;

    if-eqz v3, :cond_0

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ۥۣ۟۟۟([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 6
    .param p1    # [Landroid/text/InputFilter;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟ۢ([Landroid/text/InputFilter;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    array-length v1, p1

    array-length v2, p1

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v3

    sub-int/2addr v2, v3

    new-array v2, v2, [Landroid/text/InputFilter;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v5

    if-gez v5, :cond_1

    aget-object v5, p1, v3

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method public ۥ۟۟۟ۤ(Z)V
    .locals 0
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iput-boolean p1, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟:Z

    return-void
.end method

.method public final ۥ۟۟۟ۥ(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1
    .param p1    # Landroid/text/method/TransformationMethod;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۠۠ۧ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥۣ۠۠ۧ;

    invoke-virtual {p1}, LYue/ۥۣ۠۠ۧ;->ۥ()Landroid/text/method/TransformationMethod;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final ۥ۟۟۟ۦ()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getFilters()[Landroid/text/InputFilter;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public final ۥ۟۟۟ۧ(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1
    .param p1    # Landroid/text/method/TransformationMethod;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۠۠ۧ;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p1, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    new-instance v0, LYue/ۥۣ۠۠ۧ;

    invoke-direct {v0, p1}, LYue/ۥۣ۠۠ۧ;-><init>(Landroid/text/method/TransformationMethod;)V

    return-object v0
.end method
