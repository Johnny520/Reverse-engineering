.class public final synthetic Lnr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUn;


# instance fields
.field public final synthetic a:Lw4;

.field public final synthetic b:LPn;

.field public final synthetic c:LEr;


# direct methods
.method public synthetic constructor <init>(Lw4;LPn;LEr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnr;->a:Lw4;

    iput-object p2, p0, Lnr;->b:LPn;

    iput-object p3, p0, Lnr;->c:LEr;

    return-void
.end method


# virtual methods
.method public final onStateChanged(LYn;LOn;)V
    .locals 9

    iget-object p1, p0, Lnr;->a:Lw4;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lw4;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    iget-object v1, p1, Lw4;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    sget-object v2, LOn;->Companion:LMn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lnr;->b:LPn;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-eq v3, v5, :cond_0

    move-object v3, v4

    goto :goto_0

    :cond_0
    sget-object v3, LOn;->ON_RESUME:LOn;

    goto :goto_0

    :cond_1
    sget-object v3, LOn;->ON_START:LOn;

    goto :goto_0

    :cond_2
    sget-object v3, LOn;->ON_CREATE:LOn;

    :goto_0
    iget-object v8, p0, Lnr;->c:LEr;

    if-ne p2, v3, :cond_3

    invoke-virtual {v1, v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_3
    sget-object v3, LOn;->ON_DESTROY:LOn;

    if-ne p2, v3, :cond_4

    invoke-virtual {p1, v8}, Lw4;->F(LEr;)V

    return-void

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eq p1, v7, :cond_7

    if-eq p1, v6, :cond_6

    if-eq p1, v5, :cond_5

    goto :goto_1

    :cond_5
    sget-object v4, LOn;->ON_PAUSE:LOn;

    goto :goto_1

    :cond_6
    sget-object v4, LOn;->ON_STOP:LOn;

    goto :goto_1

    :cond_7
    move-object v4, v3

    :goto_1
    if-ne p2, v4, :cond_8

    invoke-virtual {v1, v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_8
    return-void
.end method
