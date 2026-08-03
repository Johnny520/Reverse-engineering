.class public final Landroidx/lifecycle/G;
.super LQ0/h;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/K;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/K;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/G;->a:Landroidx/lifecycle/K;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LQ0/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    const-string v0, "<this>"

    iget-object v1, p0, Landroidx/lifecycle/G;->a:Landroidx/lifecycle/K;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, LQ0/n;->a:LQ0/o;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, LQ0/c;

    const-class v3, Landroidx/lifecycle/I;

    invoke-direct {v2, v3}, LQ0/c;-><init>(Ljava/lang/Class;)V

    new-instance v3, LQ/d;

    invoke-interface {v2}, LQ0/b;->a()Ljava/lang/Class;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    invoke-static {v2, v4}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v2}, LQ/d;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    new-array v2, v2, [LQ/d;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQ/d;

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQ/d;

    const-string v2, "initializers"

    invoke-static {v0, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Landroidx/lifecycle/K;->c()Landroidx/lifecycle/F;

    move-result-object v0

    instance-of v2, v1, Landroidx/lifecycle/h;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    sget-object v1, LQ/a;->b:LQ/a;

    const-string v2, "store"

    invoke-static {v0, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "defaultCreationExtras"

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0

    :cond_0
    check-cast v1, Landroidx/lifecycle/h;

    invoke-interface {v1}, Landroidx/lifecycle/h;->a()LQ/b;

    throw v3
.end method
