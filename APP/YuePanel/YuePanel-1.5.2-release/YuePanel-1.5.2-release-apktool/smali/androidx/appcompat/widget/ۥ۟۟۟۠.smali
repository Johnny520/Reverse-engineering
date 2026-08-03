.class public Landroidx/appcompat/widget/ۥ۟۟۟۠;
.super LYue/ۥ۟۟ۧ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟۟;,
        Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ;,
        Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۥ:I = 0x4

.field public static final ۥ۟۟۟ۦ:Ljava/lang/String; = "share_history.xml"


# instance fields
.field public ۥ۟۟۟۟:I

.field public final ۥ۟۟۟۠:Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟۟;

.field public final ۥ۟۟۟ۡ:Landroid/content/Context;

.field public ۥ۟۟۟ۢ:Ljava/lang/String;

.field public ۥۣ۟۟۟:Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ;

.field public ۥ۟۟۟ۤ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, LYue/ۥ۟۟ۧ۠;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x4

    iput v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    new-instance v0, Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟۟;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟۟;-><init>(Landroidx/appcompat/widget/ۥ۟۟۟۠;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟۠:Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟۟;

    const-string v0, "share_history.xml"

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۢ:Ljava/lang/String;

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public ۥ۟()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟۟()Landroid/view/View;
    .locals 5

    new-instance v0, Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Landroid/content/Context;

    iget-object v2, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۢ:Ljava/lang/String;

    invoke-static {v1, v2}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟(Landroid/content/Context;Ljava/lang/String;)Landroidx/appcompat/widget/ۥ۟;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActivityChooserView;->setActivityChooserModel(Landroidx/appcompat/widget/ۥ۟;)V

    :cond_0
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    iget-object v2, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget v3, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۡ۟:I

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget-object v2, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Landroid/content/Context;

    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-static {v2, v1}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActivityChooserView;->setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActivityChooserView;->setProvider(LYue/ۥ۟۟ۧ۠;)V

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۥ;->ۥ۟۟ۡ:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActivityChooserView;->setDefaultActionButtonContentDescription(I)V

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۥ;->ۥ۟۟۠ۨ:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActivityChooserView;->setExpandActivityOverflowButtonContentDescription(I)V

    return-object v0
.end method

.method public ۥ۟۟۟ۡ(Landroid/view/SubMenu;)V
    .locals 8

    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Landroid/content/Context;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۢ:Ljava/lang/String;

    invoke-static {v0, v1}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟(Landroid/content/Context;Ljava/lang/String;)Landroidx/appcompat/widget/ۥ۟;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۠()I

    move-result v2

    iget v3, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_0

    invoke-virtual {v0, v5}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۟(I)Landroid/content/pm/ResolveInfo;

    move-result-object v6

    invoke-virtual {v6, v1}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {p1, v4, v5, v5, v7}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v7

    invoke-virtual {v6, v1}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-interface {v7, v6}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object v6

    iget-object v7, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟۠:Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟۟;

    invoke-interface {v6, v7}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    if-ge v3, v2, :cond_1

    iget-object v5, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Landroid/content/Context;

    sget v6, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۥ;->ۥ۟۟۟۟:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v4, v3, v3, v5}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object p1

    move v3, v4

    :goto_1
    if-ge v3, v2, :cond_1

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۟(I)Landroid/content/pm/ResolveInfo;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-interface {p1, v4, v3, v3, v6}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v6

    invoke-virtual {v5, v1}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-interface {v6, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object v5

    iget-object v6, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟۠:Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟۟;

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ۥ۟۟۟ۨ()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥۣ۟۟۟:Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۤ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;

    if-nez v0, :cond_1

    new-instance v0, Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟;-><init>(Landroidx/appcompat/widget/ۥ۟۟۟۠;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۤ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Landroid/content/Context;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۢ:Ljava/lang/String;

    invoke-static {v0, v1}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟(Landroid/content/Context;Ljava/lang/String;)Landroidx/appcompat/widget/ۥ۟;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۤ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۠ۤ(Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;)V

    return-void
.end method

.method public ۥ۟۟۠(Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥۣ۟۟۟:Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۨ()V

    return-void
.end method

.method public ۥ۟۟۠۟(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۢ:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۨ()V

    return-void
.end method

.method public ۥ۟۟۠۠(Landroid/content/Intent;)V
    .locals 2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.SEND"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "android.intent.action.SEND_MULTIPLE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۠ۡ(Landroid/content/Intent;)V

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Landroid/content/Context;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥ۟۟۟ۢ:Ljava/lang/String;

    invoke-static {v0, v1}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟(Landroid/content/Context;Ljava/lang/String;)Landroidx/appcompat/widget/ۥ۟;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ۥ۟;->ۥۣ۟۟۠(Landroid/content/Intent;)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(Landroid/content/Intent;)V
    .locals 1

    const/high16 v0, 0x8080000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    return-void
.end method
