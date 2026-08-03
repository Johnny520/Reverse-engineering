.class public final Le/z;
.super Ln/e;
.source "SourceFile"


# static fields
.field public static final c:Le/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/z;-><init>(I)V

    sput-object v0, Le/z;->c:Le/z;

    return-void
.end method

.method public static F(Le/k;I)Le/z;
    .locals 4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_5

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bogus howMuch"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Ln/e;->B()I

    move-result p1

    new-array v0, p1, [Le/y;

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    if-ge v1, p1, :cond_4

    invoke-virtual {p0, v1}, Le/k;->l(I)Le/j;

    move-result-object v2

    instance-of v3, v2, Le/f;

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Le/j;->l()Lj/s;

    move-result-object v2

    sget-object v3, Lj/s;->a:Lj/s;

    invoke-virtual {v2, v3}, Lj/s;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    new-instance p0, Le/z;

    invoke-direct {p0, v0}, Le/z;-><init>(I)V

    invoke-virtual {p0}, Ln/j;->g()V

    return-object p0

    :cond_5
    sget-object p0, Le/z;->c:Le/z;

    return-object p0
.end method
