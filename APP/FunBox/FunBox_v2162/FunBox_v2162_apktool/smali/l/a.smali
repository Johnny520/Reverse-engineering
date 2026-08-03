.class public final Ll/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field private static final e:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ll/c;

.field private final c:Ll/b;

.field private d:Ll/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x2710

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IF)V

    sput-object v0, Ll/a;->e:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ll/c;Ll/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iput-object p1, p0, Ll/a;->a:Ljava/lang/String;

    iput-object p2, p0, Ll/a;->b:Ll/c;

    iput-object p3, p0, Ll/a;->c:Ll/b;

    const/4 p1, 0x0

    iput-object p1, p0, Ll/a;->d:Ll/b;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "returnType == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "descriptor == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Ljava/lang/String;)Ll/a;
    .locals 11

    sget-object v0, Ll/a;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x28

    const-string v4, "bad descriptor"

    if-ne v2, v3, :cond_c

    const/4 v2, 0x1

    move v5, v1

    move v3, v2

    :goto_0
    const/16 v6, 0x29

    if-ge v3, v0, :cond_3

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v6, :cond_1

    goto :goto_1

    :cond_1
    const/16 v6, 0x41

    if-lt v7, v6, :cond_2

    const/16 v6, 0x5a

    if-gt v7, v6, :cond_2

    add-int/lit8 v5, v5, 0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    move v3, v1

    :goto_1
    if-eqz v3, :cond_b

    sub-int/2addr v0, v2

    if-eq v3, v0, :cond_b

    add-int/2addr v3, v2

    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_a

    new-array v0, v5, [Ll/c;

    move v7, v1

    move v5, v2

    :goto_2
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v8, v6, :cond_6

    add-int/2addr v5, v2

    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/c;->g:Ll/c;

    :try_start_0
    const-string v3, "V"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v2, Ll/c;->o:Ll/c;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_4
    invoke-static {v2}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v2

    :goto_3
    new-instance v3, Ll/b;

    invoke-direct {v3, v7}, Ll/b;-><init>(I)V

    :goto_4
    if-ge v1, v7, :cond_5

    aget-object v4, v0, v1

    invoke-virtual {v3, v1, v4}, Ll/b;->z(ILl/c;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_5
    new-instance v0, Ll/a;

    invoke-direct {v0, p0, v2, v3}, Ll/a;-><init>(Ljava/lang/String;Ll/c;Ll/b;)V

    return-object v0

    :catch_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "descriptor == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    move v9, v5

    :goto_5
    const/16 v10, 0x5b

    if-ne v8, v10, :cond_7

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v8

    goto :goto_5

    :cond_7
    const/16 v10, 0x4c

    if-ne v8, v10, :cond_9

    const/16 v8, 0x3b

    invoke-virtual {p0, v8, v9}, Ljava/lang/String;->indexOf(II)I

    move-result v8

    if-eq v8, v3, :cond_8

    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    add-int/lit8 v8, v9, 0x1

    :goto_6
    invoke-virtual {p0, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v5

    aput-object v5, v0, v7

    add-int/lit8 v7, v7, 0x1

    move v5, v8

    goto :goto_2

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(Ljava/lang/String;)Ll/a;
    .locals 2

    if-eqz p0, :cond_2

    sget-object v0, Ll/a;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/a;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-static {p0}, Ll/a;->b(Ljava/lang/String;)Ll/a;

    move-result-object p0

    iget-object v1, p0, Ll/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/a;

    if-eqz v0, :cond_1

    move-object p0, v0

    :cond_1
    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "descriptor == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Ll/a;)I
    .locals 8

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p1, Ll/a;->b:Ll/c;

    iget-object v2, p0, Ll/a;->b:Ll/c;

    invoke-virtual {v2, v1}, Ll/c;->b(Ll/c;)I

    move-result v1

    if-eqz v1, :cond_1

    return v1

    :cond_1
    iget-object v1, p0, Ll/a;->c:Ll/b;

    invoke-virtual {v1}, Ln/e;->B()I

    move-result v2

    iget-object p1, p1, Ll/a;->c:Ll/b;

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    move v5, v0

    :goto_0
    if-ge v5, v4, :cond_3

    invoke-virtual {v1, v5}, Ll/b;->r(I)Ll/c;

    move-result-object v6

    invoke-virtual {p1, v5}, Ll/b;->r(I)Ll/c;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll/c;->b(Ll/c;)I

    move-result v6

    if-eqz v6, :cond_2

    return v6

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    if-ge v2, v3, :cond_4

    const/4 p1, -0x1

    return p1

    :cond_4
    if-le v2, v3, :cond_5

    const/4 p1, 0x1

    return p1

    :cond_5
    return v0
.end method

.method public final c()Ll/b;
    .locals 7

    iget-object v0, p0, Ll/a;->d:Ll/b;

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/a;->c:Ll/b;

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    new-instance v2, Ll/b;

    invoke-direct {v2, v1}, Ll/b;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ll/b;->r(I)Ll/c;

    move-result-object v5

    invoke-virtual {v5}, Ll/c;->k()Z

    move-result v6

    if-eqz v6, :cond_0

    sget-object v5, Ll/c;->l:Ll/c;

    const/4 v4, 0x1

    :cond_0
    invoke-virtual {v2, v3, v5}, Ll/b;->z(ILl/c;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_2

    move-object v0, v2

    :cond_2
    iput-object v0, p0, Ll/a;->d:Ll/b;

    :cond_3
    iget-object v0, p0, Ll/a;->d:Ll/b;

    return-object v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ll/a;

    invoke-virtual {p0, p1}, Ll/a;->a(Ll/a;)I

    move-result p1

    return p1
.end method

.method public final d()Ll/b;
    .locals 1

    iget-object v0, p0, Ll/a;->c:Ll/b;

    return-object v0
.end method

.method public final e()Ll/c;
    .locals 1

    iget-object v0, p0, Ll/a;->b:Ll/c;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ll/a;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ll/a;

    iget-object p1, p1, Ll/a;->a:Ljava/lang/String;

    iget-object v0, p0, Ll/a;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final g(Ll/c;)Ll/a;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/a;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/a;->c:Ll/b;

    invoke-virtual {v1, p1}, Ll/b;->J(Ll/c;)Ll/b;

    move-result-object p1

    invoke-virtual {p1}, Ln/j;->g()V

    new-instance v1, Ll/a;

    iget-object v2, p0, Ll/a;->b:Ll/c;

    invoke-direct {v1, v0, v2, p1}, Ll/a;-><init>(Ljava/lang/String;Ll/c;Ll/b;)V

    sget-object p1, Ll/a;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/a;

    if-eqz p1, :cond_0

    move-object v1, p1

    :cond_0
    return-object v1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ll/a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/a;->a:Ljava/lang/String;

    return-object v0
.end method
