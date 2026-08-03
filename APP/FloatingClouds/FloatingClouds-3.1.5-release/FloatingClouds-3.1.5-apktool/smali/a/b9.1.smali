.class public final La/b9;
.super La/mh$b;
.source "SourceFile"


# instance fields
.field public final b:Landroid/view/View;

.field public c:I

.field public d:I

.field public final e:[I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, La/b9;->e:[I

    iput-object p1, p0, La/b9;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(La/nh;Ljava/util/List;)La/nh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/nh;",
            "Ljava/util/List<",
            "La/mh;",
            ">;)",
            "La/nh;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/mh;

    iget-object v1, v0, La/mh;->a:La/mh$e;

    invoke-virtual {v1}, La/mh$e;->c()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_0

    iget p2, p0, La/b9;->d:I

    iget-object v0, v0, La/mh;->a:La/mh$e;

    invoke-virtual {v0}, La/mh$e;->b()F

    move-result v0

    const/4 v1, 0x0

    invoke-static {p2, v1, v0}, La/w0;->c(IIF)I

    move-result p2

    int-to-float p2, p2

    iget-object v0, p0, La/b9;->b:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-object p1
.end method
