.class public final LYue/ۥۢ۠ۦۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۠ۦۨ;
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
    invoke-direct {p0}, LYue/ۥۢ۠ۦۨ$ۥ;-><init>()V

    return-void
.end method

.method public static synthetic ۥ۟۟(LYue/ۥۢ۠ۦۨ$ۥ;IILYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥۢ۠ۦۨ;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, LYue/ۥۢ۠ۦۨ$ۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۢ۠ۦۨ$ۥ$ۥ;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۢ۠ۦۨ$ۥ;->ۥ۟(IILYue/ۥۣ۠ۡ۟;)LYue/ۥۢ۠ۦۨ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۥ(II)LYue/ۥۢ۠ۦۨ;
    .locals 6
    .param p1    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-static/range {v0 .. v5}, LYue/ۥۢ۠ۦۨ$ۥ;->ۥ۟۟(LYue/ۥۢ۠ۦۨ$ۥ;IILYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥۢ۠ۦۨ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟(IILYue/ۥۣ۠ۡ۟;)LYue/ۥۢ۠ۦۨ;
    .locals 7
    .param p1    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/content/res/Resources;",
            "Ljava/lang/Boolean;",
            ">;)",
            "LYue/\u06e5\u06e2\u06e0\u06e6\u06e8;"
        }
    .end annotation

    const-string v0, "detectDarkMode"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢ۠ۦۨ;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, LYue/ۥۢ۠ۦۨ;-><init>(IIILYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public final ۥ۟۟۟(I)LYue/ۥۢ۠ۦۨ;
    .locals 7
    .param p1    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v6, LYue/ۥۢ۠ۦۨ;

    sget-object v4, LYue/ۥۢ۠ۦۨ$ۥ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢ۠ۦۨ$ۥ$ۥ۟;

    const/4 v5, 0x0

    const/4 v3, 0x2

    move-object v0, v6

    move v1, p1

    move v2, p1

    invoke-direct/range {v0 .. v5}, LYue/ۥۢ۠ۦۨ;-><init>(IIILYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۨۥۢ;)V

    return-object v6
.end method

.method public final ۥ۟۟۟۟(II)LYue/ۥۢ۠ۦۨ;
    .locals 7
    .param p1    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v6, LYue/ۥۢ۠ۦۨ;

    sget-object v4, LYue/ۥۢ۠ۦۨ$ۥ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۢ۠ۦۨ$ۥ$ۥ۟۟;

    const/4 v5, 0x0

    const/4 v3, 0x1

    move-object v0, v6

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, LYue/ۥۢ۠ۦۨ;-><init>(IIILYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۨۥۢ;)V

    return-object v6
.end method
