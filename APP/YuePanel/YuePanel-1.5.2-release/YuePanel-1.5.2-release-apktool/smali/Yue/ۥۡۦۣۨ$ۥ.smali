.class public LYue/ۥۡۦۣۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x14
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۣۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/lang/Object;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    check-cast p0, [Landroid/app/RemoteInput;

    invoke-static {p0, p1, p2}, Landroid/app/RemoteInput;->addResultsToIntent([Landroid/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public static ۥ۟(LYue/ۥۡۦۣۨ;)Landroid/app/RemoteInput;
    .locals 4

    new-instance v0, Landroid/app/RemoteInput$Builder;

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۠()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۨ()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۢ()[Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/RemoteInput$Builder;->setChoices([Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟۠()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/RemoteInput$Builder;->setAllowFreeFormInput(Z)Landroid/app/RemoteInput$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۧ()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/RemoteInput$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۡ()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, LYue/ۥۡۦۣۨ$ۥ۟;->ۥ۟۟۟(Landroid/app/RemoteInput$Builder;Ljava/lang/String;Z)Landroid/app/RemoteInput$Builder;

    goto :goto_0

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_1

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۥ()I

    move-result p0

    invoke-static {v0, p0}, LYue/ۥۡۦۣۨ$ۥ۟۟۟;->ۥ۟(Landroid/app/RemoteInput$Builder;I)Landroid/app/RemoteInput$Builder;

    :cond_1
    invoke-virtual {v0}, Landroid/app/RemoteInput$Builder;->build()Landroid/app/RemoteInput;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Ljava/lang/Object;)LYue/ۥۡۦۣۨ;
    .locals 4

    check-cast p0, Landroid/app/RemoteInput;

    new-instance v0, LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getResultKey()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getLabel()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;->ۥ۟۟۟ۢ(Ljava/lang/CharSequence;)LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getChoices()[Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;->ۥ۟۟۟۠([Ljava/lang/CharSequence;)LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getAllowFreeFormInput()Z

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;->ۥ۟۟۟۟(Z)LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;->ۥ(Landroid/os/Bundle;)LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;

    move-result-object v0

    invoke-static {p0}, LYue/ۥۡۦۣۨ$ۥ۟;->ۥ۟(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;->ۥ۟۟۟(Ljava/lang/String;Z)LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;

    goto :goto_0

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_1

    invoke-static {p0}, LYue/ۥۡۦۣۨ$ۥ۟۟۟;->ۥ(Ljava/lang/Object;)I

    move-result p0

    invoke-virtual {v0, p0}, LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;->ۥ۟۟۟ۡ(I)LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;

    :cond_1
    invoke-virtual {v0}, LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;->ۥ۟()LYue/ۥۡۦۣۨ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p0}, Landroid/app/RemoteInput;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method
