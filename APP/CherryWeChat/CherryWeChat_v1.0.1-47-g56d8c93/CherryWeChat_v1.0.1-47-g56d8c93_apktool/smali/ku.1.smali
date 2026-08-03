.class public abstract Lku;
.super Lqa;
.source ""


# instance fields
.field public final b:Lju;


# direct methods
.method public constructor <init>(LQm;)V
    .locals 1

    invoke-direct {p0, p1}, Lqa;-><init>(LQm;)V

    new-instance v0, Lju;

    invoke-interface {p1}, LQm;->getDescriptor()LCx;

    move-result-object p1

    invoke-direct {v0, p1}, Lju;-><init>(LCx;)V

    iput-object v0, p0, Lku;->b:Lju;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lku;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liu;

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Liu;

    invoke-virtual {p1}, Liu;->d()I

    move-result p1

    return p1
.end method

.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lt;->d(LJc;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Liu;

    invoke-virtual {p1}, Liu;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    iget-object v0, p0, Lku;->b:Lju;

    return-object v0
.end method

.method public final h(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Liu;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method lead to boxing and must not be used, use Builder.append instead"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract i()Ljava/lang/Object;
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p2}, Lt;->c(Ljava/lang/Object;)I

    const/4 p1, 0x0

    throw p1
.end method
