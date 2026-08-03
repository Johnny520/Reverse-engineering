.class public final LYue/ۥۡۦۦۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۦۡ;
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
    invoke-direct {p0}, LYue/ۥۡۦۦۡ$ۥ;-><init>()V

    return-void
.end method

.method public static final synthetic ۥ(LYue/ۥۡۦۦۡ$ۥ;LYue/ۥۣۡۧۧ;)Z
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۦۦۡ$ۥ;->ۥ۟۟(LYue/ۥۣۡۧۧ;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ۥ۟()LYue/ۥۣۡۧۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {}, LYue/ۥۡۦۦۡ;->ۥۣ۟۟ۢ()LYue/ۥۣۡۧۧ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟(LYue/ۥۣۡۧۧ;)Z
    .locals 2

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟۠ۢ()Ljava/lang/String;

    move-result-object p1

    const-string v0, ".class"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LYue/ۥۢ۠ۢۤ;->ۥ۟۠ۡ۠(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1
.end method

.method public final ۥ۟۟۟(LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)LYue/ۥۣۡۧۧ;
    .locals 7
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "base"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LYue/ۥۣۡۧۧ;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, LYue/ۥۡۦۦۡ$ۥ;->ۥ۟()LYue/ۥۣۡۧۧ;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, LYue/ۥۢ۠ۢۥ;->ۥ۟ۡۢ۠(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x5c

    const/16 v3, 0x2f

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LYue/ۥۢ۠ۢۤ;->ۥۣۣ۟۠(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡ۠(Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1
.end method
