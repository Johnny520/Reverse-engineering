.class public LYue/ۥۢ۟۟ۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢ۟۟ۦ$ۥ;,
        LYue/ۥۢ۟۟ۦ$ۥ۟;,
        LYue/ۥۢ۟۟ۦ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟ۡۡ:Ljava/lang/String; = "extraPersonCount"

.field public static final ۥ۟۟ۡۢ:Ljava/lang/String; = "extraPerson_"

.field public static final ۥۣ۟۟ۡ:Ljava/lang/String; = "extraLocusId"

.field public static final ۥ۟۟ۡۤ:Ljava/lang/String; = "extraLongLived"

.field public static final ۥ۟۟ۡۥ:Ljava/lang/String; = "extraSliceUri"

.field public static final ۥ۟۟ۡۦ:I = 0x1


# instance fields
.field public ۥ:Landroid/content/Context;

.field public ۥ۟:Ljava/lang/String;

.field public ۥ۟۟:Ljava/lang/String;

.field public ۥ۟۟۟:[Landroid/content/Intent;

.field public ۥ۟۟۟۟:Landroid/content/ComponentName;

.field public ۥ۟۟۟۠:Ljava/lang/CharSequence;

.field public ۥ۟۟۟ۡ:Ljava/lang/CharSequence;

.field public ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

.field public ۥۣ۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

.field public ۥ۟۟۟ۤ:Z

.field public ۥ۟۟۟ۥ:[LYue/ۥۡۤ۠ۥ;

.field public ۥ۟۟۟ۦ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۧ:LYue/ۥ۠ۨۡ۠;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟۟ۨ:Z

.field public ۥ۟۟۠:I

.field public ۥ۟۟۠۟:Landroid/os/PersistableBundle;

.field public ۥ۟۟۠۠:Landroid/os/Bundle;

.field public ۥ۟۟۠ۡ:J

.field public ۥ۟۟۠ۢ:Landroid/os/UserHandle;

.field public ۥۣ۟۟۠:Z

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:Z

.field public ۥ۟۟۠ۦ:Z

.field public ۥ۟۟۠ۧ:Z

.field public ۥ۟۟۠ۨ:Z

.field public ۥ۟۟ۡ:Z

.field public ۥ۟۟ۡ۟:I

.field public ۥ۟۟ۡ۠:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۨ:Z

    return-void
.end method

.method public static ۥ۟۟(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x19
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Landroid/content/pm/ShortcutInfo;",
            ">;)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ShortcutInfo;

    new-instance v2, LYue/ۥۢ۟۟ۦ$ۥ۟;

    invoke-direct {v2, p0, v1}, LYue/ۥۢ۟۟ۦ$ۥ۟;-><init>(Landroid/content/Context;Landroid/content/pm/ShortcutInfo;)V

    invoke-virtual {v2}, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟()LYue/ۥۢ۟۟ۦ;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۥ۟۟۠۟(Landroid/content/pm/ShortcutInfo;)LYue/ۥ۠ۨۡ۠;
    .locals 2
    .param p0    # Landroid/content/pm/ShortcutInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x19
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    invoke-static {p0}, LYue/ۥۢ۟۟ۥ;->ۥ(Landroid/content/pm/ShortcutInfo;)Landroid/content/LocusId;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, LYue/ۥۢ۟۟ۥ;->ۥ(Landroid/content/pm/ShortcutInfo;)Landroid/content/LocusId;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۨۡ۠;->ۥ۟۟۟(Landroid/content/LocusId;)LYue/ۥ۠ۨۡ۠;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Landroid/content/pm/ShortcutInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۠(Landroid/os/PersistableBundle;)LYue/ۥ۠ۨۡ۠;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠۠(Landroid/os/PersistableBundle;)LYue/ۥ۠ۨۡ۠;
    .locals 2
    .param p0    # Landroid/os/PersistableBundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x19
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "extraLocusId"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, LYue/ۥ۠ۨۡ۠;

    invoke-direct {v0, p0}, LYue/ۥ۠ۨۡ۠;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public static ۥ۟۟۠ۢ(Landroid/os/PersistableBundle;)Z
    .locals 2
    .param p0    # Landroid/os/PersistableBundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x19
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    if-eqz p0, :cond_1

    const-string v0, "extraLongLived"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۥ۟۟۠ۤ(Landroid/os/PersistableBundle;)[LYue/ۥۡۤ۠ۥ;
    .locals 5
    .param p0    # Landroid/os/PersistableBundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x19
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    if-eqz p0, :cond_2

    const-string v0, "extraPersonCount"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    new-array v1, v0, [LYue/ۥۡۤ۠ۥ;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "extraPerson_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroid/os/PersistableBundle;->getPersistableBundle(Ljava/lang/String;)Landroid/os/PersistableBundle;

    move-result-object v3

    invoke-static {v3}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟(Landroid/os/PersistableBundle;)LYue/ۥۡۤ۠ۥ;

    move-result-object v3

    aput-object v3, v1, v2

    move v2, v4

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public ۥ(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟:[Landroid/content/Intent;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    const-string v1, "android.intent.extra.shortcut.INTENT"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۠:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.extra.shortcut.NAME"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۤ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v2, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۟:Landroid/content/ComponentName;

    if-eqz v2, :cond_0

    :try_start_0
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    if-nez v1, :cond_1

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_1
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    iget-object v2, p0, LYue/ۥۢ۟۟ۦ;->ۥ:Landroid/content/Context;

    invoke-virtual {v0, p1, v1, v2}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟(Landroid/content/Intent;Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V

    :cond_2
    return-object p1
.end method

.method public final ۥ۟()Landroid/os/PersistableBundle;
    .locals 5
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x16
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/PersistableBundle;

    invoke-direct {v0}, Landroid/os/PersistableBundle;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ:[LYue/ۥۡۤ۠ۥ;

    if-eqz v0, :cond_1

    array-length v1, v0

    if-lez v1, :cond_1

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    const-string v2, "extraPersonCount"

    array-length v0, v0

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ:[LYue/ۥۡۤ۠ۥ;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "extraPerson_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ:[LYue/ۥۡۤ۠ۥ;

    aget-object v0, v4, v0

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۨ()Landroid/os/PersistableBundle;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/os/PersistableBundle;->putPersistableBundle(Ljava/lang/String;Landroid/os/PersistableBundle;)V

    move v0, v3

    goto :goto_0

    :cond_1
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۨۡ۠;

    if-eqz v0, :cond_2

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    const-string v2, "extraLocusId"

    invoke-virtual {v0}, LYue/ۥ۠ۨۡ۠;->ۥ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    const-string v1, "extraLongLived"

    iget-boolean v2, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۨ:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    return-object v0
.end method

.method public ۥ۟۟۟()Landroid/content/ComponentName;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۟:Landroid/content/ComponentName;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/util/Set;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۦ:Ljava/util/Set;

    return-object v0
.end method

.method public ۥ۟۟۟۠()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()I
    .locals 1

    iget v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۟:I

    return v0
.end method

.method public ۥ۟۟۟ۢ()I
    .locals 1

    iget v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۠:I

    return v0
.end method

.method public ۥۣ۟۟۟()Landroid/os/PersistableBundle;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    return-object v0
.end method

.method public ۥ۟۟۟ۤ()Landroidx/core/graphics/drawable/IconCompat;
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    return-object v0
.end method

.method public ۥ۟۟۟ۥ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟ۦ()Landroid/content/Intent;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟:[Landroid/content/Intent;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()[Landroid/content/Intent;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟:[Landroid/content/Intent;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/Intent;

    return-object v0
.end method

.method public ۥ۟۟۟ۨ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۡ:J

    return-wide v0
.end method

.method public ۥ۟۟۠()LYue/ۥ۠ۨۡ۠;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۨۡ۠;

    return-object v0
.end method

.method public ۥ۟۟۠ۡ()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۡ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥۣ۟۟۠()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۠ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠:I

    return v0
.end method

.method public ۥ۟۟۠ۦ()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۠:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۠ۧ()Landroid/os/Bundle;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۠:Landroid/os/Bundle;

    return-object v0
.end method

.method public ۥ۟۟۠ۨ()Landroid/os/UserHandle;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۢ:Landroid/os/UserHandle;

    return-object v0
.end method

.method public ۥ۟۟ۡ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ:Z

    return v0
.end method

.method public ۥ۟۟ۡ۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۠:Z

    return v0
.end method

.method public ۥ۟۟ۡ۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۦ:Z

    return v0
.end method

.method public ۥ۟۟ۡۡ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۤ:Z

    return v0
.end method

.method public ۥ۟۟ۡۢ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۨ:Z

    return v0
.end method

.method public ۥۣ۟۟ۡ(I)Z
    .locals 1

    iget v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۠:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟ۡۤ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۧ:Z

    return v0
.end method

.method public ۥ۟۟ۡۥ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۥ:Z

    return v0
.end method

.method public ۥ۟۟ۡۦ()Landroid/content/pm/ShortcutInfo;
    .locals 5
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x19
    .end annotation

    new-instance v0, Landroid/content/pm/ShortcutInfo$Builder;

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ:Landroid/content/Context;

    iget-object v2, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Landroid/content/pm/ShortcutInfo$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۠:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setShortLabel(Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟:[Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setIntents([Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v1, :cond_0

    iget-object v2, p0, LYue/ۥۢ۟۟ۦ;->ۥ:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟ۡۥ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setIcon(Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;

    :cond_0
    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۡ:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۡ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setLongLabel(Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    :cond_1
    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setDisabledMessage(Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    :cond_2
    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۟:Landroid/content/ComponentName;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setActivity(Landroid/content/ComponentName;)Landroid/content/pm/ShortcutInfo$Builder;

    :cond_3
    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۦ:Ljava/util/Set;

    if-eqz v1, :cond_4

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setCategories(Ljava/util/Set;)Landroid/content/pm/ShortcutInfo$Builder;

    :cond_4
    iget v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠:I

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setRank(I)Landroid/content/pm/ShortcutInfo$Builder;

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    if-eqz v1, :cond_5

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/content/pm/ShortcutInfo$Builder;

    :cond_5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_9

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ:[LYue/ۥۡۤ۠ۥ;

    if-eqz v1, :cond_7

    array-length v2, v1

    if-lez v2, :cond_7

    array-length v1, v1

    new-array v2, v1, [Landroid/app/Person;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_6

    iget-object v4, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ:[LYue/ۥۡۤ۠ۥ;

    aget-object v4, v4, v3

    invoke-virtual {v4}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۥ()Landroid/app/Person;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    invoke-static {v0, v2}, LYue/ۥۢ۟۟ۢ;->ۥ(Landroid/content/pm/ShortcutInfo$Builder;[Landroid/app/Person;)Landroid/content/pm/ShortcutInfo$Builder;

    :cond_7
    iget-object v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۨۡ۠;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, LYue/ۥ۠ۨۡ۠;->ۥ۟۟()Landroid/content/LocusId;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥۣۢ۟۟;->ۥ(Landroid/content/pm/ShortcutInfo$Builder;Landroid/content/LocusId;)Landroid/content/pm/ShortcutInfo$Builder;

    :cond_8
    iget-boolean v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۨ:Z

    invoke-static {v0, v1}, LYue/ۥۢ۟۟ۤ;->ۥ(Landroid/content/pm/ShortcutInfo$Builder;Z)Landroid/content/pm/ShortcutInfo$Builder;

    goto :goto_1

    :cond_9
    invoke-virtual {p0}, LYue/ۥۢ۟۟ۦ;->ۥ۟()Landroid/os/PersistableBundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/content/pm/ShortcutInfo$Builder;

    :goto_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_a

    iget v1, p0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۠:I

    invoke-static {v0, v1}, LYue/ۥۢ۟۟ۦ$ۥ;->ۥ(Landroid/content/pm/ShortcutInfo$Builder;I)V

    :cond_a
    invoke-virtual {v0}, Landroid/content/pm/ShortcutInfo$Builder;->build()Landroid/content/pm/ShortcutInfo;

    move-result-object v0

    return-object v0
.end method
