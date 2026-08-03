.class public final Le/e;
.super Ln/e;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final c:Le/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/e;-><init>(I)V

    sput-object v0, Le/e;->c:Le/e;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 7

    check-cast p1, Le/e;

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    goto :goto_1

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

    invoke-virtual {p0, v4}, Le/e;->k(I)Le/d;

    move-result-object v5

    invoke-virtual {p1, v4}, Le/e;->k(I)Le/d;

    move-result-object v6

    invoke-virtual {v5, v6}, Le/d;->a(Le/d;)I

    move-result v5

    if-eqz v5, :cond_1

    move v0, v5

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-ge v1, v2, :cond_3

    const/4 v0, -0x1

    goto :goto_1

    :cond_3
    if-le v1, v2, :cond_4

    const/4 v0, 0x1

    :cond_4
    :goto_1
    return v0
.end method
