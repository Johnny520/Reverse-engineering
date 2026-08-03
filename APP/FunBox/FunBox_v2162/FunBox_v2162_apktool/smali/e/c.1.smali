.class public final Le/c;
.super Ln/e;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final c:Le/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/c;-><init>(I)V

    sput-object v0, Le/c;->c:Le/c;

    return-void
.end method


# virtual methods
.method public final F(Le/c;)I
    .locals 7

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ln/e;->B()I

    move-result v1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_2

    invoke-virtual {p0, v4}, Le/c;->j(I)Le/b;

    move-result-object v5

    invoke-virtual {p1, v4}, Le/c;->j(I)Le/b;

    move-result-object v6

    invoke-virtual {v5, v6}, Le/b;->a(Le/b;)I

    move-result v5

    if-eqz v5, :cond_1

    return v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-ge v1, v2, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-le v1, v2, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v0
.end method

.method public final G(ILk/u;I)V
    .locals 1

    new-instance v0, Le/b;

    invoke-direct {v0, p2, p3}, Le/b;-><init>(Lk/u;I)V

    invoke-virtual {p0, p1, v0}, Ln/e;->A(ILjava/lang/Object;)V

    return-void
.end method

.method public final H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "catch "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p2, 0x0

    move v2, p2

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p0, v2}, Le/c;->j(I)Le/b;

    move-result-object v3

    if-eqz v2, :cond_0

    const-string v4, ",\n"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v4, v1, -0x1

    if-ne v2, v4, :cond_2

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v4

    if-nez v4, :cond_1

    move v4, p2

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, -0x1

    invoke-virtual {p0, v4}, Le/c;->j(I)Le/b;

    move-result-object v4

    invoke-virtual {v4}, Le/b;->b()Lk/u;

    move-result-object v4

    sget-object v5, Lk/u;->d:Lk/u;

    invoke-virtual {v4, v5}, Lk/u;->equals(Ljava/lang/Object;)Z

    move-result v4

    :goto_1
    if-eqz v4, :cond_2

    const-string v4, "<any>"

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Le/b;->b()Lk/u;

    move-result-object v4

    invoke-virtual {v4}, Lk/u;->a()Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " -> "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Le/b;->c()I

    move-result v3

    invoke-static {v3}, La/b;->r(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0, v0}, Le/c;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Le/c;

    invoke-virtual {p0, p1}, Le/c;->F(Le/c;)I

    move-result p1

    return p1
.end method
