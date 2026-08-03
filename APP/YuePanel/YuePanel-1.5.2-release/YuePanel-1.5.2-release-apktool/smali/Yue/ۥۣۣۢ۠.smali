.class public LYue/ۥۣۣۢ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۥ(Landroid/content/UriMatcher;Landroid/net/Uri;)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۣۣۢ۠;->ۥ۟۟(Landroid/content/UriMatcher;Landroid/net/Uri;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/content/UriMatcher;)LYue/ۥۡۤۧۧ;
    .locals 1
    .param p0    # Landroid/content/UriMatcher;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/UriMatcher;",
            ")",
            "LYue/\u06e5\u06e1\u06e4\u06e7\u06e7<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۣۢ۟;

    invoke-direct {v0, p0}, LYue/ۥۣۣۢ۟;-><init>(Landroid/content/UriMatcher;)V

    return-object v0
.end method

.method public static synthetic ۥ۟۟(Landroid/content/UriMatcher;Landroid/net/Uri;)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
