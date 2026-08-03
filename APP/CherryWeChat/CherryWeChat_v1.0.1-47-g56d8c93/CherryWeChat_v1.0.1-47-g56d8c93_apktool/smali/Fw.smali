.class public abstract LFw;
.super LEw;
.source ""

# interfaces
.implements Loj;


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(ILEb;)V
    .locals 0

    invoke-direct {p0, p2}, LEw;-><init>(LEb;)V

    iput p1, p0, LFw;->b:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LFw;->b:I

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
