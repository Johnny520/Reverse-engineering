.class public final La/ya;
.super La/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/u<",
        "La/wa;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:La/Z7;


# direct methods
.method public constructor <init>(La/Z7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ya;->a:La/Z7;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, La/ya;->a:La/Z7;

    iget-object v0, v0, La/Z7;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, La/wa;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, La/wa;

    invoke-super {p0, p1}, La/u;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "La/wa;",
            ">;"
        }
    .end annotation

    new-instance v0, La/f9;

    invoke-virtual {p0}, La/u;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, La/d9;-><init>(III)V

    new-instance v1, La/M1;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, La/M1;-><init>(ILjava/lang/Object;)V

    new-instance v0, La/t;

    const/4 v2, 0x7

    invoke-direct {v0, v2, p0}, La/t;-><init>(ILjava/lang/Object;)V

    new-instance v2, La/Bf;

    invoke-direct {v2, v1, v0}, La/Bf;-><init>(La/M1;La/D7;)V

    new-instance v0, La/Bf$a;

    invoke-direct {v0, v2}, La/Bf$a;-><init>(La/Bf;)V

    return-object v0
.end method
