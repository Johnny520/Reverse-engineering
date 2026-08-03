.class public LYue/ۥۡۤ۠ۥ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1c
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۤ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/app/Person;)LYue/ۥۡۤ۠ۥ;
    .locals 2
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    invoke-direct {v0}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;-><init>()V

    invoke-virtual {p0}, Landroid/app/Person;->getName()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۠(Ljava/lang/CharSequence;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Person;->getIcon()Landroid/graphics/drawable/Icon;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Person;->getIcon()Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۡ(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟(Landroidx/core/graphics/drawable/IconCompat;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Person;->getUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Person;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۟(Ljava/lang/String;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Person;->isBot()Z

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟(Z)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Person;->isImportant()Z

    move-result p0

    invoke-virtual {v0, p0}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟(Z)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object p0

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ()LYue/ۥۡۤ۠ۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(LYue/ۥۡۤ۠ۥ;)Landroid/app/Person;
    .locals 2
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    new-instance v0, Landroid/app/Person$Builder;

    invoke-direct {v0}, Landroid/app/Person$Builder;-><init>()V

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setName(Ljava/lang/CharSequence;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟ۡۤ()Landroid/graphics/drawable/Icon;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setUri(Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setKey(Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۢ()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setBot(Z)Landroid/app/Person$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥۣ۟۟۟()Z

    move-result p0

    invoke-virtual {v0, p0}, Landroid/app/Person$Builder;->setImportant(Z)Landroid/app/Person$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Person$Builder;->build()Landroid/app/Person;

    move-result-object p0

    return-object p0
.end method
