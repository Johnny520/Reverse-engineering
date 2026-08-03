.class public abstract La/Gd$e;
.super La/Gd$f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Gd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "La/Gd$f<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public a:La/Gd$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/Gd$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public b:La/Gd$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/Gd$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/Gd$c;La/Gd$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Gd$c<",
            "TK;TV;>;",
            "La/Gd$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, La/Gd$f;-><init>()V

    iput-object p2, p0, La/Gd$e;->a:La/Gd$c;

    iput-object p1, p0, La/Gd$e;->b:La/Gd$c;

    return-void
.end method


# virtual methods
.method public final a(La/Gd$c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Gd$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, La/Gd$e;->a:La/Gd$c;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, La/Gd$e;->b:La/Gd$c;

    if-ne p1, v0, :cond_0

    iput-object v1, p0, La/Gd$e;->b:La/Gd$c;

    iput-object v1, p0, La/Gd$e;->a:La/Gd$c;

    :cond_0
    iget-object v0, p0, La/Gd$e;->a:La/Gd$c;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, v0}, La/Gd$e;->b(La/Gd$c;)La/Gd$c;

    move-result-object v0

    iput-object v0, p0, La/Gd$e;->a:La/Gd$c;

    :cond_1
    iget-object v0, p0, La/Gd$e;->b:La/Gd$c;

    if-ne v0, p1, :cond_4

    iget-object p1, p0, La/Gd$e;->a:La/Gd$c;

    if-eq v0, p1, :cond_3

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, La/Gd$e;->c(La/Gd$c;)La/Gd$c;

    move-result-object v1

    :cond_3
    :goto_0
    iput-object v1, p0, La/Gd$e;->b:La/Gd$c;

    :cond_4
    return-void
.end method

.method public abstract b(La/Gd$c;)La/Gd$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Gd$c<",
            "TK;TV;>;)",
            "La/Gd$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public abstract c(La/Gd$c;)La/Gd$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Gd$c<",
            "TK;TV;>;)",
            "La/Gd$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, La/Gd$e;->b:La/Gd$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La/Gd$e;->b:La/Gd$c;

    iget-object v1, p0, La/Gd$e;->a:La/Gd$c;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, La/Gd$e;->c(La/Gd$c;)La/Gd$c;

    move-result-object v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :goto_1
    iput-object v1, p0, La/Gd$e;->b:La/Gd$c;

    return-object v0
.end method
