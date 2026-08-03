.class public final LYue/ۥ۠۠ۧۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۠ۧۡ$ۥ۟;,
        LYue/ۥ۠۠ۧۡ$ۥ۟۟;,
        LYue/ۥ۠۠ۧۡ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۠۠ۧۡ$ۥ۟;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, LYue/ۥ۠۠ۧۡ;-><init>(Landroid/widget/TextView;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;Z)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "textView cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    .line 4
    new-instance p2, LYue/ۥ۠۠ۧۡ$ۥ۟۟;

    invoke-direct {p2, p1}, LYue/ۥ۠۠ۧۡ$ۥ۟۟;-><init>(Landroid/widget/TextView;)V

    iput-object p2, p0, LYue/ۥ۠۠ۧۡ;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ۟;

    goto :goto_0

    .line 5
    :cond_0
    new-instance p2, LYue/ۥ۠۠ۧۡ$ۥ;

    invoke-direct {p2, p1}, LYue/ۥ۠۠ۧۡ$ۥ;-><init>(Landroid/widget/TextView;)V

    iput-object p2, p0, LYue/ۥ۠۠ۧۡ;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ۟;

    :goto_0
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

    iget-object v0, p0, LYue/ۥ۠۠ۧۡ;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ$ۥ۟;->ۥ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۧۡ;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥ۠۠ۧۡ$ۥ۟;->ۥ۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۧۡ;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ$ۥ۟;->ۥ۟۟(Z)V

    return-void
.end method

.method public ۥ۟۟۟(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۧۡ;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ$ۥ۟;->ۥ۟۟۟(Z)V

    return-void
.end method

.method public ۥ۟۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۧۡ;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥ۠۠ۧۡ$ۥ۟;->ۥ۟۟۟۟()V

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

    iget-object v0, p0, LYue/ۥ۠۠ۧۡ;->ۥ:LYue/ۥ۠۠ۧۡ$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۡ$ۥ۟;->ۥ۟۟۟۠(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method
