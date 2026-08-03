.class public LYue/ۥۢ۟۟ۦ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۟۟ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۢ۟۟ۦ;

.field public ۥ۟:Z

.field public ۥ۟۟:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۟:Landroid/net/Uri;


# direct methods
.method public constructor <init>(LYue/ۥۢ۟۟ۦ;)V
    .locals 3
    .param p1    # LYue/ۥۢ۟۟ۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LYue/ۥۢ۟۟ۦ;

    invoke-direct {v0}, LYue/ۥۢ۟۟ۦ;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    .line 7
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ:Landroid/content/Context;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ:Landroid/content/Context;

    .line 8
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟:Ljava/lang/String;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟:Ljava/lang/String;

    .line 9
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟:Ljava/lang/String;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟:Ljava/lang/String;

    .line 10
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟:[Landroid/content/Intent;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/content/Intent;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟:[Landroid/content/Intent;

    .line 11
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۟:Landroid/content/ComponentName;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۟:Landroid/content/ComponentName;

    .line 12
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۠:Ljava/lang/CharSequence;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۠:Ljava/lang/CharSequence;

    .line 13
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۡ:Ljava/lang/CharSequence;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۡ:Ljava/lang/CharSequence;

    .line 14
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    .line 15
    iget v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۟:I

    iput v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۟:I

    .line 16
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    .line 17
    iget-boolean v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۤ:Z

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۤ:Z

    .line 18
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۢ:Landroid/os/UserHandle;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۢ:Landroid/os/UserHandle;

    .line 19
    iget-wide v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۡ:J

    iput-wide v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۡ:J

    .line 20
    iget-boolean v1, p1, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۠:Z

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۠:Z

    .line 21
    iget-boolean v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۤ:Z

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۤ:Z

    .line 22
    iget-boolean v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۥ:Z

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۥ:Z

    .line 23
    iget-boolean v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۦ:Z

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۦ:Z

    .line 24
    iget-boolean v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۧ:Z

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۧ:Z

    .line 25
    iget-boolean v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۨ:Z

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۨ:Z

    .line 26
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۨۡ۠;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۨۡ۠;

    .line 27
    iget-boolean v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۨ:Z

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۨ:Z

    .line 28
    iget-boolean v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ:Z

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ:Z

    .line 29
    iget v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠:I

    iput v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠:I

    .line 30
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ:[LYue/ۥۡۤ۠ۥ;

    if-eqz v1, :cond_0

    .line 31
    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LYue/ۥۡۤ۠ۥ;

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ:[LYue/ۥۡۤ۠ۥ;

    .line 32
    :cond_0
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۦ:Ljava/util/Set;

    if-eqz v1, :cond_1

    .line 33
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۦ:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۦ:Ljava/util/Set;

    .line 34
    :cond_1
    iget-object v1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    if-eqz v1, :cond_2

    .line 35
    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    .line 36
    :cond_2
    iget p1, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۠:I

    iput p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۠:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/pm/ShortcutInfo;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/content/pm/ShortcutInfo;
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

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, LYue/ۥۢ۟۟ۦ;

    invoke-direct {v0}, LYue/ۥۢ۟۟ۦ;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    .line 39
    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ:Landroid/content/Context;

    .line 40
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟:Ljava/lang/String;

    .line 41
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getPackage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟:Ljava/lang/String;

    .line 42
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getIntents()[Landroid/content/Intent;

    move-result-object p1

    .line 43
    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/content/Intent;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟:[Landroid/content/Intent;

    .line 44
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getActivity()Landroid/content/ComponentName;

    move-result-object p1

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۟:Landroid/content/ComponentName;

    .line 45
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getShortLabel()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۠:Ljava/lang/CharSequence;

    .line 46
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getLongLabel()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۡ:Ljava/lang/CharSequence;

    .line 47
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getDisabledMessage()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    .line 48
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt p1, v1, :cond_0

    .line 49
    invoke-static {p2}, LYue/ۥۢ۟۟ۧ;->ۥ(Landroid/content/pm/ShortcutInfo;)I

    move-result v1

    iput v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۟:I

    goto :goto_1

    .line 50
    :cond_0
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    .line 51
    :goto_0
    iput v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۟:I

    .line 52
    :goto_1
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getCategories()Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۦ:Ljava/util/Set;

    .line 53
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۤ(Landroid/os/PersistableBundle;)[LYue/ۥۡۤ۠ۥ;

    move-result-object v1

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ:[LYue/ۥۡۤ۠ۥ;

    .line 54
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getUserHandle()Landroid/os/UserHandle;

    move-result-object v1

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۢ:Landroid/os/UserHandle;

    .line 55
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getLastChangedTimestamp()J

    move-result-wide v1

    iput-wide v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۡ:J

    const/16 v1, 0x1e

    if-lt p1, v1, :cond_2

    .line 56
    invoke-static {p2}, LYue/ۥۢ۟۟ۨ;->ۥ(Landroid/content/pm/ShortcutInfo;)Z

    move-result p1

    iput-boolean p1, v0, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۠:Z

    .line 57
    :cond_2
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isDynamic()Z

    move-result p1

    iput-boolean p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۤ:Z

    .line 58
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isPinned()Z

    move-result p1

    iput-boolean p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۥ:Z

    .line 59
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isDeclaredInManifest()Z

    move-result p1

    iput-boolean p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۦ:Z

    .line 60
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isImmutable()Z

    move-result p1

    iput-boolean p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۧ:Z

    .line 61
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isEnabled()Z

    move-result p1

    iput-boolean p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠ۨ:Z

    .line 62
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->hasKeyFieldsOnly()Z

    move-result p1

    iput-boolean p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ:Z

    .line 63
    invoke-static {p2}, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟(Landroid/content/pm/ShortcutInfo;)LYue/ۥ۠ۨۡ۠;

    move-result-object p1

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۨۡ۠;

    .line 64
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getRank()I

    move-result p1

    iput p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠:I

    .line 65
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p1

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LYue/ۥۢ۟۟ۦ;

    invoke-direct {v0}, LYue/ۥۢ۟۟ۦ;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    .line 3
    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ:Landroid/content/Context;

    .line 4
    iput-object p2, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/String;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingGetterMatchingBuilder"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟:Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟:Ljava/util/Set;

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public ۥ۟(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingGetterMatchingBuilder"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6$\u06e5\u06df;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ(Ljava/lang/String;)LYue/ۥۢ۟۟ۦ$ۥ۟;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟:Ljava/util/Map;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object p0
.end method

.method public ۥ۟۟()LYue/ۥۢ۟۟ۦ;
    .locals 10
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iget-object v0, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۠:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iget-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟:[Landroid/content/Intent;

    if-eqz v1, :cond_a

    array-length v1, v1

    if-eqz v1, :cond_a

    iget-boolean v1, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۨۡ۠;

    if-nez v1, :cond_0

    new-instance v1, LYue/ۥ۠ۨۡ۠;

    iget-object v2, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟:Ljava/lang/String;

    invoke-direct {v1, v2}, LYue/ۥ۠ۨۡ۠;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۨۡ۠;

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    const/4 v1, 0x1

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۨ:Z

    :cond_1
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟:Ljava/util/Set;

    if-eqz v0, :cond_3

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iget-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۦ:Ljava/util/Set;

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۦ:Ljava/util/Set;

    :cond_2
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iget-object v0, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۦ:Ljava/util/Set;

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_3
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟:Ljava/util/Map;

    if-eqz v0, :cond_7

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iget-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    if-nez v1, :cond_4

    new-instance v1, Landroid/os/PersistableBundle;

    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    :cond_4
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    iget-object v4, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iget-object v4, v4, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/String;

    invoke-interface {v3, v6}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    invoke-virtual {v4, v1, v3}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    iget-object v7, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iget-object v7, v7, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "/"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v6, :cond_6

    new-array v6, v5, [Ljava/lang/String;

    goto :goto_1

    :cond_6
    new-array v8, v5, [Ljava/lang/String;

    invoke-interface {v6, v8}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/lang/String;

    :goto_1
    invoke-virtual {v7, v4, v6}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟۟:Landroid/net/Uri;

    if-eqz v0, :cond_9

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iget-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    if-nez v1, :cond_8

    new-instance v1, Landroid/os/PersistableBundle;

    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    iput-object v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    :cond_8
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iget-object v0, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    iget-object v1, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟۟:Landroid/net/Uri;

    invoke-static {v1}, LYue/ۥۣۢۢۨ;->ۥ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "extraSliceUri"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Shortcut must have an intent"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Shortcut must have a non-empty label"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۟(Landroid/content/ComponentName;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # Landroid/content/ComponentName;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۟:Landroid/content/ComponentName;

    return-object p0
.end method

.method public ۥ۟۟۟۟()LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    const/4 v1, 0x1

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۤ:Z

    return-object p0
.end method

.method public ۥ۟۟۟۠(Ljava/util/Set;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # Ljava/util/Set;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6$\u06e5\u06df;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۡۨۦ;

    invoke-direct {v0}, LYue/ۥ۟ۡۨۦ;-><init>()V

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۨۦ;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-object v0, p1, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۦ:Ljava/util/Set;

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/CharSequence;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟۟ۢ(I)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟ۡ۠:I

    return-object p0
.end method

.method public ۥۣ۟۟۟(Landroid/os/PersistableBundle;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # Landroid/os/PersistableBundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۟:Landroid/os/PersistableBundle;

    return-object p0
.end method

.method public ۥ۟۟۟ۤ(Landroidx/core/graphics/drawable/IconCompat;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥۣ۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public ۥ۟۟۟ۥ(Landroid/content/Intent;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    filled-new-array {p1}, [Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟ۦ([Landroid/content/Intent;)LYue/ۥۢ۟۟ۦ$ۥ۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۦ([Landroid/content/Intent;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # [Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟:[Landroid/content/Intent;

    return-object p0
.end method

.method public ۥ۟۟۟ۧ()LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟:Z

    return-object p0
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥ۠ۨۡ۠;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # LYue/ۥ۠ۨۡ۠;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۧ:LYue/ۥ۠ۨۡ۠;

    return-object p0
.end method

.method public ۥ۟۟۠(Ljava/lang/CharSequence;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۡ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟۠۟()LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    const/4 v1, 0x1

    iput-boolean v1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۨ:Z

    return-object p0
.end method

.method public ۥ۟۟۠۠(Z)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-boolean p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۨ:Z

    return-object p0
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥۡۤ۠ۥ;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 0
    .param p1    # LYue/ۥۡۤ۠ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    filled-new-array {p1}, [LYue/ۥۡۤ۠ۥ;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۠ۢ([LYue/ۥۡۤ۠ۥ;)LYue/ۥۢ۟۟ۦ$ۥ۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۢ([LYue/ۥۡۤ۠ۥ;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # [LYue/ۥۡۤ۠ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟ۥ:[LYue/ۥۡۤ۠ۥ;

    return-object p0
.end method

.method public ۥۣ۟۟۠(I)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠:I

    return-object p0
.end method

.method public ۥ۟۟۠ۤ(Ljava/lang/CharSequence;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۟۠:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟۠ۥ(Landroid/net/Uri;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingGetterMatchingBuilder"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ۟۟۟۟:Landroid/net/Uri;

    return-object p0
.end method

.method public ۥ۟۟۠ۦ(Landroid/os/Bundle;)LYue/ۥۢ۟۟ۦ$ۥ۟;
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢ۟۟ۦ;

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    iput-object p1, v0, LYue/ۥۢ۟۟ۦ;->ۥ۟۟۠۠:Landroid/os/Bundle;

    return-object p0
.end method
