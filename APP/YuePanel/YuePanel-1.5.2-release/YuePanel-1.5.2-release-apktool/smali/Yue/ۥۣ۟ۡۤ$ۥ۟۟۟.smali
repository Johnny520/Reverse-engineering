.class public LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۡۤ$ۥ۟۟۟ۢ;
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation build LYue/ۥۢۥ۟ۥ;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۡۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟;
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Landroid/widget/ListAdapter;

.field public ۥ۟۟۠ۥ:Ljava/lang/CharSequence;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۣ۟ۡۤ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۡۤ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۡۤ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡۡۡ;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟;

    :cond_0
    return-void
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۡۤ;

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setSelection(I)V

    iget-object p1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۡۤ;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۡۤ;

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Landroid/widget/ListAdapter;

    invoke-interface {v0, p2}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p1, v2, p2, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->dismiss()V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set popup background for MODE_DIALOG, ignoring"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public ۥ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟(I)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set horizontal offset for MODE_DIALOG, ignoring"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public ۥ۟۟۟۟()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥۣ۟۟۟(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/CharSequence;

    return-void
.end method

.method public ۥ۟۟۟ۤ(I)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set vertical offset for MODE_DIALOG, ignoring"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public ۥ۟۟۟ۥ(I)V
    .locals 1

    const-string p1, "AppCompatSpinner"

    const-string v0, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public ۥ۟۟۟ۦ(II)V
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Landroid/widget/ListAdapter;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/appcompat/app/ۥ۟۟$ۥ;

    iget-object v1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۡۤ;

    invoke-virtual {v1}, LYue/ۥۣ۟ۡۤ;->getPopupContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/app/ۥ۟۟$ۥ;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ۥ۟۟$ۥ;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/ۥ۟۟$ۥ;

    :cond_1
    iget-object v1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Landroid/widget/ListAdapter;

    iget-object v2, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۡۤ;

    invoke-virtual {v2}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v2

    invoke-virtual {v0, v1, v2, p0}, Landroidx/appcompat/app/ۥ۟۟$ۥ;->setSingleChoiceItems(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/ۥ۟۟$ۥ;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟$ۥ;->create()Landroidx/appcompat/app/ۥ۟۟;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟;->ۥ۟۟۟۟()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setTextDirection(I)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setTextAlignment(I)V

    iget-object p1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟۟;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public ۥ۟۟۟ۧ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟ۨ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۠(Landroid/widget/ListAdapter;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Landroid/widget/ListAdapter;

    return-void
.end method
