.class public abstract LJ0/g;
.super LJ0/f;
.source "SourceFile"

# interfaces
.implements LQ0/e;


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(LH0/a;)V
    .locals 0

    invoke-direct {p0, p1}, LJ0/f;-><init>(LH0/a;)V

    const/4 p1, 0x2

    iput p1, p0, LJ0/g;->b:I

    return-void
.end method


# virtual methods
.method public final getArity()I
    .locals 1

    iget v0, p0, LJ0/g;->b:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LJ0/a;->a:LH0/a;

    if-nez v0, :cond_0

    sget-object v0, LQ0/n;->a:LQ0/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, LQ0/o;->a(LQ0/e;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(...)"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, LJ0/a;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
