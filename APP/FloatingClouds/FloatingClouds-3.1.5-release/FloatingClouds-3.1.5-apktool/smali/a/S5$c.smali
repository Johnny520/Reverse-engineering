.class public final La/S5$c;
.super La/S5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/S5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:La/S5$a;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/S5$a;

    invoke-direct {v0, p1}, La/S5$a;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, La/S5$c;->a:La/S5$a;

    return-void
.end method


# virtual methods
.method public final a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    sget-object v0, Landroidx/emoji2/text/c;->k:Landroidx/emoji2/text/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-object p1

    :cond_1
    iget-object v0, p0, La/S5$c;->a:La/S5$a;

    invoke-virtual {v0, p1}, La/S5$a;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, La/S5$c;->a:La/S5$a;

    iget-boolean v0, v0, La/S5$a;->c:Z

    return v0
.end method

.method public final c(Z)V
    .locals 1

    sget-object v0, Landroidx/emoji2/text/c;->k:Landroidx/emoji2/text/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, La/S5$c;->a:La/S5$a;

    invoke-virtual {v0, p1}, La/S5$a;->c(Z)V

    return-void
.end method

.method public final d(Z)V
    .locals 2

    sget-object v0, Landroidx/emoji2/text/c;->k:Landroidx/emoji2/text/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, La/S5$c;->a:La/S5$a;

    if-nez v0, :cond_1

    iput-boolean p1, v1, La/S5$a;->c:Z

    return-void

    :cond_1
    invoke-virtual {v1, p1}, La/S5$a;->d(Z)V

    return-void
.end method

.method public final e(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1

    sget-object v0, Landroidx/emoji2/text/c;->k:Landroidx/emoji2/text/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-object p1

    :cond_1
    iget-object v0, p0, La/S5$c;->a:La/S5$a;

    invoke-virtual {v0, p1}, La/S5$a;->e(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method
