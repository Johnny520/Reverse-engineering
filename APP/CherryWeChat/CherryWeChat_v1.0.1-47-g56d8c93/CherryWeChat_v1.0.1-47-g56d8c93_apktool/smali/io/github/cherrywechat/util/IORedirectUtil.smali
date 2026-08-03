.class public final Lio/github/cherrywechat/util/IORedirectUtil;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build LRm;
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/util/IORedirectUtil;

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x2fb62fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/util/IORedirectUtil;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/util/IORedirectUtil;

    invoke-direct {v0}, Lio/github/cherrywechat/util/IORedirectUtil;-><init>()V

    sput-object v0, Lio/github/cherrywechat/util/IORedirectUtil;->INSTANCE:Lio/github/cherrywechat/util/IORedirectUtil;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final initIORedirect(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-wide v0, -0x2fd74fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2fd7bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p0}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-wide v0, -0x2fdc4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2fdd3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2fdeefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :try_start_0
    invoke-static {p0, p1}, Lio/github/cherrywechat/util/IORedirectUtil;->nativeInitIORedirect(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-wide v0, -0x2fdf3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2fd82fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return p0

    :cond_0
    const-wide v0, -0x2fda7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2fdb6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const-wide p0, -0x2fc57fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const-wide p0, -0x2fc66fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const/4 p0, 0x0

    return p0

    :cond_1
    const-wide p0, -0x2fd23fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const-wide p0, -0x2fd07fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final isSupported()Z
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    const-wide v0, -0x2fc12fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2fc21fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return v2

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    new-instance v1, Ljava/io/File;

    const-wide v3, -0x2fcebfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lwh;->g0(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    const-wide v3, -0x2fcf9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x2fc88fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x2fc99fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-static {v3, v2, v1}, LfG;->E(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lzq;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lzq;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Lyq;

    invoke-virtual {v3, v0}, Lyq;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, LAz;->H(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    invoke-virtual {v1}, Lzq;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyq;

    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Lyq;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, LAz;->H(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    const/4 v4, 0x5

    if-gt v3, v4, :cond_4

    if-ne v3, v4, :cond_3

    const/16 v3, 0x9

    if-lt v1, v3, :cond_3

    goto :goto_2

    :cond_3
    return v2

    :cond_4
    :goto_2
    return v0

    :catch_0
    const-wide v1, -0x2fcb4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x2fb43fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    return v0
.end method

.method private static final native nativeInitIORedirect(Ljava/lang/String;Ljava/lang/String;)Z
.end method
