.class public LYue/ۥۡۤ۠ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۤ۠ۥ$ۥ۟۟;,
        LYue/ۥۡۤ۠ۥ$ۥ;,
        LYue/ۥۡۤ۠ۥ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "name"

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "icon"

.field public static final ۥۣ۟۟۟:Ljava/lang/String; = "uri"

.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "key"

.field public static final ۥ۟۟۟ۥ:Ljava/lang/String; = "isBot"

.field public static final ۥ۟۟۟ۦ:Ljava/lang/String; = "isImportant"


# instance fields
.field public ۥ:Ljava/lang/CharSequence;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟:Landroidx/core/graphics/drawable/IconCompat;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟۟۟:Z

.field public ۥ۟۟۟۠:Z


# direct methods
.method public constructor <init>(LYue/ۥۡۤ۠ۥ$ۥ۟۟;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ:Ljava/lang/CharSequence;

    iput-object v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ:Ljava/lang/CharSequence;

    iget-object v0, p1, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    iput-object v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    iget-object v0, p1, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟:Ljava/lang/String;

    iput-object v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟:Ljava/lang/String;

    iget-object v0, p1, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟:Ljava/lang/String;

    iput-object v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟:Ljava/lang/String;

    iget-boolean v0, p1, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۟:Z

    iput-boolean v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۟:Z

    iget-boolean p1, p1, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۠:Z

    iput-boolean p1, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠:Z

    return-void
.end method

.method public static ۥ(Landroid/app/Person;)LYue/ۥۡۤ۠ۥ;
    .locals 0
    .param p0    # Landroid/app/Person;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1c
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۡۤ۠ۥ$ۥ۟;->ۥ(Landroid/app/Person;)LYue/ۥۡۤ۠ۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Landroid/os/Bundle;)LYue/ۥۡۤ۠ۥ;
    .locals 3
    .param p0    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-string v0, "icon"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    invoke-direct {v1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;-><init>()V

    const-string v2, "name"

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۠(Ljava/lang/CharSequence;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v1

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟۟(Landroid/os/Bundle;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟(Landroidx/core/graphics/drawable/IconCompat;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v0

    const-string v1, "uri"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v0

    const-string v1, "key"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۟(Ljava/lang/String;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v0

    const-string v1, "isBot"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟(Z)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v0

    const-string v1, "isImportant"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-virtual {v0, p0}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟(Z)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object p0

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ()LYue/ۥۡۤ۠ۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Landroid/os/PersistableBundle;)LYue/ۥۡۤ۠ۥ;
    .locals 0
    .param p0    # Landroid/os/PersistableBundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x16
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۡۤ۠ۥ$ۥ;->ۥ(Landroid/os/PersistableBundle;)LYue/ۥۡۤ۠ۥ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥۡۤ۠ۥ;

    if-nez v1, :cond_1

    return v0

    :cond_1
    check-cast p1, LYue/ۥۡۤ۠ۥ;

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_4

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۢ()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۢ()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥۣ۟۟۟()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۡۤ۠ۥ;->ۥۣ۟۟۟()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0

    :cond_4
    :goto_0
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 4

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۢ()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۥ;->ۥۣ۟۟۟()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()Landroidx/core/graphics/drawable/IconCompat;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟۠()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۟:Z

    return v0
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠:Z

    return v0
.end method

.method public ۥ۟۟۟ۤ()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۤ۠ۥ;->ۥ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "name:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۤ۠ۥ;->ۥ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public ۥ۟۟۟ۥ()Landroid/app/Person;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1c
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۡۤ۠ۥ$ۥ۟;->ۥ۟(LYue/ۥۡۤ۠ۥ;)Landroid/app/Person;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۦ()LYue/ۥۡۤ۠ۥ$ۥ۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    invoke-direct {v0, p0}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;-><init>(LYue/ۥۡۤ۠ۥ;)V

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()Landroid/os/Bundle;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "name"

    iget-object v2, p0, LYue/ۥۡۤ۠ۥ;->ۥ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    iget-object v1, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->ۥۣ۟۟ۡ()Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "icon"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v1, "uri"

    iget-object v2, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "key"

    iget-object v2, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "isBot"

    iget-boolean v2, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۟:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "isImportant"

    iget-boolean v2, p0, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public ۥ۟۟۟ۨ()Landroid/os/PersistableBundle;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x16
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۡۤ۠ۥ$ۥ;->ۥ۟(LYue/ۥۡۤ۠ۥ;)Landroid/os/PersistableBundle;

    move-result-object v0

    return-object v0
.end method
