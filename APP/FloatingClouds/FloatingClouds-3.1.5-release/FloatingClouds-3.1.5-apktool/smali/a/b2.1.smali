.class public abstract La/b2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:La/ge;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/ge<",
            "La/Je;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field public c:La/ge;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/ge<",
            "La/Ke;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b2;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, La/Je;

    if-eqz v0, :cond_2

    check-cast p1, La/Je;

    iget-object v0, p0, La/b2;->b:La/ge;

    if-nez v0, :cond_0

    new-instance v0, La/ge;

    invoke-direct {v0}, La/ge;-><init>()V

    iput-object v0, p0, La/b2;->b:La/ge;

    :cond_0
    iget-object v0, p0, La/b2;->b:La/ge;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    if-nez v0, :cond_1

    new-instance v0, La/db;

    iget-object v1, p0, La/b2;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, La/db;-><init>(Landroid/content/Context;La/Je;)V

    iget-object v1, p0, La/b2;->b:La/ge;

    invoke-virtual {v1, p1, v0}, La/ge;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final d(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .locals 2

    instance-of v0, p1, La/Ke;

    if-eqz v0, :cond_2

    check-cast p1, La/Ke;

    iget-object v0, p0, La/b2;->c:La/ge;

    if-nez v0, :cond_0

    new-instance v0, La/ge;

    invoke-direct {v0}, La/ge;-><init>()V

    iput-object v0, p0, La/b2;->c:La/ge;

    :cond_0
    iget-object v0, p0, La/b2;->c:La/ge;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    if-nez v0, :cond_1

    new-instance v0, La/De;

    iget-object v1, p0, La/b2;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, La/De;-><init>(Landroid/content/Context;La/Ke;)V

    iget-object v1, p0, La/b2;->c:La/ge;

    invoke-virtual {v1, p1, v0}, La/ge;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method
