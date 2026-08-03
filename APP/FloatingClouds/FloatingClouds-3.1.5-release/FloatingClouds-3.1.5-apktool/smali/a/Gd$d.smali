.class public final La/Gd$d;
.super La/Gd$f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Gd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
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

.field public b:Z

.field public final synthetic c:La/Gd;


# direct methods
.method public constructor <init>(La/Gd;)V
    .locals 0

    iput-object p1, p0, La/Gd$d;->c:La/Gd;

    invoke-direct {p0}, La/Gd$f;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, La/Gd$d;->b:Z

    return-void
.end method


# virtual methods
.method public final a(La/Gd$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/Gd$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, La/Gd$d;->a:La/Gd$c;

    if-ne p1, v0, :cond_1

    iget-object p1, v0, La/Gd$c;->d:La/Gd$c;

    iput-object p1, p0, La/Gd$d;->a:La/Gd$c;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, La/Gd$d;->b:Z

    :cond_1
    return-void
.end method

.method public final hasNext()Z
    .locals 3

    iget-boolean v0, p0, La/Gd$d;->b:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, La/Gd$d;->c:La/Gd;

    iget-object v0, v0, La/Gd;->a:La/Gd$c;

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, La/Gd$d;->a:La/Gd$c;

    if-eqz v0, :cond_2

    iget-object v0, v0, La/Gd$c;->c:La/Gd$c;

    if-eqz v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, La/Gd$d;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, La/Gd$d;->b:Z

    iget-object v0, p0, La/Gd$d;->c:La/Gd;

    iget-object v0, v0, La/Gd;->a:La/Gd$c;

    iput-object v0, p0, La/Gd$d;->a:La/Gd$c;

    goto :goto_1

    :cond_0
    iget-object v0, p0, La/Gd$d;->a:La/Gd$c;

    if-eqz v0, :cond_1

    iget-object v0, v0, La/Gd$c;->c:La/Gd$c;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, La/Gd$d;->a:La/Gd$c;

    :goto_1
    iget-object v0, p0, La/Gd$d;->a:La/Gd$c;

    return-object v0
.end method
