.class public final Lct;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# instance fields
.field public final a:LQm;

.field public final b:LDx;


# direct methods
.method public constructor <init>(LQm;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lct;->a:LQm;

    new-instance v0, LDx;

    invoke-interface {p1}, LQm;->getDescriptor()LCx;

    move-result-object p1

    invoke-direct {v0, p1}, LDx;-><init>(LCx;)V

    iput-object v0, p0, Lct;->b:LDx;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p1}, LJc;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lct;->a:LQm;

    check-cast v0, LQm;

    invoke-interface {p1, v0}, LJc;->h(LQm;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lct;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lct;

    iget-object v2, p0, Lct;->a:LQm;

    iget-object p1, p1, Lct;->a:LQm;

    invoke-static {v2, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    iget-object v0, p0, Lct;->b:LDx;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lct;->a:LQm;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1
.end method
