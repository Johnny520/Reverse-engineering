.class public final Lft;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld;

    invoke-direct {v0, p0}, Ld;-><init>(Lft;)V

    const/4 v1, 0x2

    invoke-static {v1, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    iput-object v0, p0, Lft;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lft;->getDescriptor()LCx;

    move-result-object v0

    invoke-interface {p1, v0}, LJc;->B(LCx;)LVa;

    move-result-object p1

    invoke-virtual {p0}, Lft;->getDescriptor()LCx;

    move-result-object v1

    invoke-interface {p1, v1}, LVa;->j(LCx;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-interface {p1, v0}, LVa;->r(LCx;)V

    sget-object p1, LTC;->a:LTC;

    return-object p1

    :cond_0
    new-instance p1, LHx;

    const-string v0, "Unexpected index "

    invoke-static {v1, v0}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    iget-object v0, p0, Lft;->a:Ljava/lang/Object;

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCx;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0}, Lft;->getDescriptor()LCx;

    const/4 p1, 0x0

    throw p1
.end method
