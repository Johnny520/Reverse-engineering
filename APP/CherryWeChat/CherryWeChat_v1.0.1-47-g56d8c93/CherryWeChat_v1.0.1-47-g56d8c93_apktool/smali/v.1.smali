.class public abstract Lv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LYb;


# instance fields
.field public final a:LZb;


# direct methods
.method public constructor <init>(LZb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv;->a:LZb;

    return-void
.end method


# virtual methods
.method public final getKey()LZb;
    .locals 1

    iget-object v0, p0, Lv;->a:LZb;

    return-object v0
.end method

.method public final l(Lac;)Lac;
    .locals 0

    invoke-static {p0, p1}, LfG;->Z(Lac;Lac;)Lac;

    move-result-object p1

    return-object p1
.end method

.method public m(LZb;)LYb;
    .locals 1

    invoke-virtual {p0}, Lv;->getKey()LZb;

    move-result-object v0

    invoke-static {v0, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public s(LZb;)Lac;
    .locals 1

    invoke-virtual {p0}, Lv;->getKey()LZb;

    move-result-object v0

    invoke-static {v0, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LIf;->a:LIf;

    return-object p1

    :cond_0
    return-object p0
.end method
