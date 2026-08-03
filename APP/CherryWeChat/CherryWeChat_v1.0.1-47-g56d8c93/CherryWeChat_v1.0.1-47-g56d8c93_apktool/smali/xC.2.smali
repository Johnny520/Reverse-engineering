.class public final LxC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LYb;
.implements LZb;


# static fields
.field public static final a:LxC;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LxC;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LxC;->a:LxC;

    return-void
.end method


# virtual methods
.method public final getKey()LZb;
    .locals 0

    return-object p0
.end method

.method public final l(Lac;)Lac;
    .locals 0

    invoke-static {p0, p1}, LfG;->Z(Lac;Lac;)Lac;

    move-result-object p1

    return-object p1
.end method

.method public final m(LZb;)LYb;
    .locals 0

    invoke-static {p0, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final q(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final s(LZb;)Lac;
    .locals 0

    invoke-static {p0, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LIf;->a:LIf;

    return-object p1

    :cond_0
    return-object p0
.end method
