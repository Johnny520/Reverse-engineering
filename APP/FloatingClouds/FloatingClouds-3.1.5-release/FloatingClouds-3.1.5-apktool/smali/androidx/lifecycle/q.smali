.class public final Landroidx/lifecycle/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/q$a;,
        Landroidx/lifecycle/q$b;,
        Landroidx/lifecycle/q$c;,
        Landroidx/lifecycle/q$d;
    }
.end annotation


# instance fields
.field public final a:La/Fg;

.field public final b:Landroidx/lifecycle/q$b;

.field public final c:La/A4;


# direct methods
.method public constructor <init>(La/Fg;Landroidx/lifecycle/q$b;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, La/A4$a;->b:La/A4$a;

    .line 6
    invoke-direct {p0, p1, p2, v0}, Landroidx/lifecycle/q;-><init>(La/Fg;Landroidx/lifecycle/q$b;La/A4;)V

    return-void
.end method

.method public constructor <init>(La/Fg;Landroidx/lifecycle/q$b;La/A4;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/lifecycle/q;->a:La/Fg;

    .line 3
    iput-object p2, p0, Landroidx/lifecycle/q;->b:Landroidx/lifecycle/q$b;

    .line 4
    iput-object p3, p0, Landroidx/lifecycle/q;->c:La/A4;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Ljava/lang/String;)La/Dg;
    .locals 5

    const-string v0, "key"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/q;->a:La/Fg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/Fg;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/Dg;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Landroidx/lifecycle/q;->b:Landroidx/lifecycle/q$b;

    if-eqz v2, :cond_2

    instance-of p1, v3, Landroidx/lifecycle/q$d;

    if-eqz p1, :cond_0

    check-cast v3, Landroidx/lifecycle/q$d;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    invoke-static {v1}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, v1}, Landroidx/lifecycle/q$d;->c(La/Dg;)V

    :cond_1
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    invoke-static {v1, p1}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :cond_2
    new-instance v1, La/Ab;

    iget-object v2, p0, Landroidx/lifecycle/q;->c:La/A4;

    invoke-direct {v1, v2}, La/Ab;-><init>(La/A4;)V

    sget-object v2, Landroidx/lifecycle/r;->a:Landroidx/lifecycle/r;

    iget-object v4, v1, La/A4;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v4, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-interface {v3, p1, v1}, Landroidx/lifecycle/q$b;->b(Ljava/lang/Class;La/Ab;)La/Dg;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-interface {v3, p1}, Landroidx/lifecycle/q$b;->a(Ljava/lang/Class;)La/Dg;

    move-result-object p1

    :goto_1
    const-string v1, "viewModel"

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La/Dg;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, La/Dg;->b()V

    :cond_3
    return-object p1
.end method
