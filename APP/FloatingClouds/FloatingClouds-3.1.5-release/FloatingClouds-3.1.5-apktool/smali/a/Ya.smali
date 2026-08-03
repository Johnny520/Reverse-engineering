.class public final synthetic La/Ya;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g;


# instance fields
.field public final synthetic a:La/ab;

.field public final synthetic b:Landroidx/lifecycle/e$b;

.field public final synthetic c:La/gb;


# direct methods
.method public synthetic constructor <init>(La/ab;Landroidx/lifecycle/e$b;La/gb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Ya;->a:La/ab;

    iput-object p2, p0, La/Ya;->b:Landroidx/lifecycle/e$b;

    iput-object p3, p0, La/Ya;->c:La/gb;

    return-void
.end method


# virtual methods
.method public final a(La/y9;Landroidx/lifecycle/e$a;)V
    .locals 9

    iget-object p1, p0, La/Ya;->a:La/ab;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Landroidx/lifecycle/e$a;->Companion:Landroidx/lifecycle/e$a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "state"

    iget-object v1, p0, La/Ya;->b:Landroidx/lifecycle/e$b;

    invoke-static {v1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-eq v0, v5, :cond_2

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/lifecycle/e$a;->ON_RESUME:Landroidx/lifecycle/e$a;

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/lifecycle/e$a;->ON_START:Landroidx/lifecycle/e$a;

    goto :goto_0

    :cond_2
    sget-object v0, Landroidx/lifecycle/e$a;->ON_CREATE:Landroidx/lifecycle/e$a;

    :goto_0
    iget-object v6, p1, La/ab;->a:Ljava/lang/Runnable;

    iget-object v7, p1, La/ab;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v8, p0, La/Ya;->c:La/gb;

    if-ne p2, v0, :cond_3

    invoke-virtual {v7, v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v6}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_3
    sget-object v0, Landroidx/lifecycle/e$a;->ON_DESTROY:Landroidx/lifecycle/e$a;

    if-ne p2, v0, :cond_4

    invoke-virtual {p1, v8}, La/ab;->a(La/gb;)V

    return-void

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eq p1, v5, :cond_7

    if-eq p1, v4, :cond_6

    if-eq p1, v3, :cond_5

    goto :goto_1

    :cond_5
    sget-object v2, Landroidx/lifecycle/e$a;->ON_PAUSE:Landroidx/lifecycle/e$a;

    goto :goto_1

    :cond_6
    sget-object v2, Landroidx/lifecycle/e$a;->ON_STOP:Landroidx/lifecycle/e$a;

    goto :goto_1

    :cond_7
    move-object v2, v0

    :goto_1
    if-ne p2, v2, :cond_8

    invoke-virtual {v7, v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    invoke-interface {v6}, Ljava/lang/Runnable;->run()V

    :cond_8
    return-void
.end method
