.class public abstract LOz;
.super LFb;
.source ""

# interfaces
.implements Loj;


# instance fields
.field public final d:I


# direct methods
.method public constructor <init>(LEb;)V
    .locals 0

    invoke-direct {p0, p1}, LFb;-><init>(LEb;)V

    const/4 p1, 0x2

    iput p1, p0, LOz;->d:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LOz;->d:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu5;->a:LEb;

    if-nez v0, :cond_0

    sget-object v0, LJv;->a:LKv;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, LKv;->a(Loj;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lu5;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
