.class public final LYue/ۥۣۡۧۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۡۧۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۣۡۧۧ$ۥ;-><init>()V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۡ(LYue/ۥۣۡۧۧ$ۥ;Ljava/io/File;ZILjava/lang/Object;)LYue/ۥۣۡۧۧ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟(Ljava/io/File;Z)LYue/ۥۣۡۧۧ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟ۢ(LYue/ۥۣۡۧۧ$ۥ;Ljava/lang/String;ZILjava/lang/Object;)LYue/ۥۣۡۧۧ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟۟۟(Ljava/lang/String;Z)LYue/ۥۣۡۧۧ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥۣ۟۟۟(LYue/ۥۣۡۧۧ$ۥ;Ljava/nio/file/Path;ZILjava/lang/Object;)LYue/ۥۣۡۧۧ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟۟۟۠(Ljava/nio/file/Path;Z)LYue/ۥۣۡۧۧ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۥ(Ljava/io/File;)LYue/ۥۣۡۧۧ;
    .locals 3
    .param p1    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "get"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟۟۟ۡ(LYue/ۥۣۡۧۧ$ۥ;Ljava/io/File;ZILjava/lang/Object;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟(Ljava/io/File;Z)LYue/ۥۣۡۧۧ;
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "get"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟۟۟(Ljava/lang/String;Z)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/String;)LYue/ۥۣۡۧۧ;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "get"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟۟۟ۢ(LYue/ۥۣۡۧۧ$ۥ;Ljava/lang/String;ZILjava/lang/Object;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟(Ljava/lang/String;Z)LYue/ۥۣۡۧۧ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "get"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۠(Ljava/lang/String;Z)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟۟(Ljava/nio/file/Path;)LYue/ۥۣۡۧۧ;
    .locals 3
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "get"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, LYue/ۥۣۡۧۧ$ۥ;->ۥۣ۟۟۟(LYue/ۥۣۡۧۧ$ۥ;Ljava/nio/file/Path;ZILjava/lang/Object;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟۠(Ljava/nio/file/Path;Z)LYue/ۥۣۡۧۧ;
    .locals 1
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "get"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟۟۟(Ljava/lang/String;Z)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1
.end method
