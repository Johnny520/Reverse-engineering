.class public final LYue/ۥۡۦۣۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۣۨ$ۥ۟;,
        LYue/ۥۡۦۣۨ$ۥ;,
        LYue/ۥۡۦۣۨ$ۥ۟۟;,
        LYue/ۥۡۦۣۨ$ۥ۟۟۟;,
        LYue/ۥۡۦۣۨ$ۥ۟۟۟۟;,
        LYue/ۥۡۦۣۨ$ۥ۟۟۟۠;,
        LYue/ۥۡۦۣۨ$ۥ۟۟۟ۡ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "android.remoteinput.results"

.field public static final ۥۣ۟۟۟:Ljava/lang/String; = "android.remoteinput.resultsData"

.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "android.remoteinput.dataTypeResultsData"

.field public static final ۥ۟۟۟ۥ:Ljava/lang/String; = "android.remoteinput.resultsSource"

.field public static final ۥ۟۟۟ۦ:I = 0x0

.field public static final ۥ۟۟۟ۧ:I = 0x1

.field public static final ۥ۟۟۟ۨ:I = 0x0

.field public static final ۥ۟۟۠:I = 0x1

.field public static final ۥ۟۟۠۟:I = 0x2


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public final ۥ۟:Ljava/lang/CharSequence;

.field public final ۥ۟۟:[Ljava/lang/CharSequence;

.field public final ۥ۟۟۟:Z

.field public final ۥ۟۟۟۟:I

.field public final ۥ۟۟۟۠:Landroid/os/Bundle;

.field public final ۥ۟۟۟ۡ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZILandroid/os/Bundle;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/CharSequence;",
            "[",
            "Ljava/lang/CharSequence;",
            "ZI",
            "Landroid/os/Bundle;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۣۨ;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۡۦۣۨ;->ۥ۟:Ljava/lang/CharSequence;

    iput-object p3, p0, LYue/ۥۡۦۣۨ;->ۥ۟۟:[Ljava/lang/CharSequence;

    iput-boolean p4, p0, LYue/ۥۡۦۣۨ;->ۥ۟۟۟:Z

    iput p5, p0, LYue/ۥۡۦۣۨ;->ۥ۟۟۟۟:I

    iput-object p6, p0, LYue/ۥۡۦۣۨ;->ۥ۟۟۟۠:Landroid/os/Bundle;

    iput-object p7, p0, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۡ:Ljava/util/Set;

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۥ()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟۠()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "setEditChoicesBeforeSending requires setAllowFreeFormInput"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۥ(LYue/ۥۡۦۣۨ;Landroid/content/Intent;Ljava/util/Map;)V
    .locals 0
    .param p0    # LYue/ۥۡۦۣۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e3\u06e8;",
            "Landroid/content/Intent;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LYue/ۥۡۦۣۨ$ۥ۟;->ۥ(LYue/ۥۡۦۣۨ;Landroid/content/Intent;Ljava/util/Map;)V

    return-void
.end method

.method public static ۥ۟([LYue/ۥۡۦۣۨ;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 0
    .param p0    # [LYue/ۥۡۦۣۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟([LYue/ۥۡۦۣۨ;)[Landroid/app/RemoteInput;

    move-result-object p0

    invoke-static {p0, p1, p2}, LYue/ۥۡۦۣۨ$ۥ;->ۥ(Ljava/lang/Object;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public static ۥ۟۟(LYue/ۥۡۦۣۨ;)Landroid/app/RemoteInput;
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    invoke-static {p0}, LYue/ۥۡۦۣۨ$ۥ;->ۥ۟(LYue/ۥۡۦۣۨ;)Landroid/app/RemoteInput;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟([LYue/ۥۡۦۣۨ;)[Landroid/app/RemoteInput;
    .locals 3
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v0, p0

    new-array v0, v0, [Landroid/app/RemoteInput;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    aget-object v2, p0, v1

    invoke-static {v2}, LYue/ۥۡۦۣۨ;->ۥ۟۟(LYue/ۥۡۦۣۨ;)Landroid/app/RemoteInput;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ۥ۟۟۟۟(Landroid/app/RemoteInput;)LYue/ۥۡۦۣۨ;
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    invoke-static {p0}, LYue/ۥۡۦۣۨ$ۥ;->ۥ۟۟(Ljava/lang/Object;)LYue/ۥۡۦۣۨ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥۣ۟۟۟(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 3

    invoke-virtual {p0}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;

    move-result-object v1

    const-string v2, "text/vnd.android.intent"

    invoke-virtual {v1, v2}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {v1}, Landroid/content/ClipDescription;->getLabel()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.remoteinput.results"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/ClipData$Item;->getIntent()Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۤ(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/Map;
    .locals 0
    .param p0    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۡۦۣۨ$ۥ۟;->ۥ۟۟(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۦ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "android.remoteinput.dataTypeResultsData"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠۟(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 0
    .param p0    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥۡۦۣۨ$ۥ;->ۥ۟۟۟(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠۠(Landroid/content/Intent;)I
    .locals 2
    .param p0    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۡۦۣۨ$ۥ۟۟;->ۥ(Landroid/content/Intent;)I

    move-result p0

    return p0

    :cond_0
    invoke-static {p0}, LYue/ۥۡۦۣۨ;->ۥۣ۟۟۟(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    const-string v1, "android.remoteinput.resultsSource"

    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۢ(Landroid/content/Intent;I)V
    .locals 2
    .param p0    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥۡۦۣۨ$ۥ۟۟;->ۥ۟(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, LYue/ۥۡۦۣۨ;->ۥۣ۟۟۟(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    :cond_1
    const-string v1, "android.remoteinput.resultsSource"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "android.remoteinput.results"

    invoke-static {p1, v0}, Landroid/content/ClipData;->newIntent(Ljava/lang/CharSequence;Landroid/content/Intent;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۦۣۨ;->ۥ۟۟۟:Z

    return v0
.end method

.method public ۥ۟۟۟ۡ()Ljava/util/Set;
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

    iget-object v0, p0, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۡ:Ljava/util/Set;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()[Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۨ;->ۥ۟۟:[Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۟ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦۣۨ;->ۥ۟۟۟۟:I

    return v0
.end method

.method public ۥ۟۟۟ۧ()Landroid/os/Bundle;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۨ;->ۥ۟۟۟۠:Landroid/os/Bundle;

    return-object v0
.end method

.method public ۥ۟۟۟ۨ()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۨ;->ۥ۟:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۠()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۨ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۠ۡ()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟۠()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۢ()[Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۢ()[Ljava/lang/CharSequence;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۡ()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۡ()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
