.class public LYue/ۥ۠۠ۧۡ$ۥ۟۟;
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
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۠۠ۧۡ$ۥ;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, LYue/ۥ۠۠ۧۡ$ۥ۟;-><init>()V

    new-instance v0, LYue/ۥ۠۠ۧۡ$ۥ;

    invoke-direct {v0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ;

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

    invoke-virtual {p0}, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟(Z)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟(Z)V

    return-void
.end method

.method public ۥ۟۟۟(Z)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟ۤ(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟(Z)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟۟۟()V
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟۟()V

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

    invoke-virtual {p0}, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, LYue/ۥ۠۠ۧۡ$ۥ۟۟;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ$ۥ;->ۥ۟۟۟۠(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۡ()Z
    .locals 1

    invoke-static {}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠۠()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
