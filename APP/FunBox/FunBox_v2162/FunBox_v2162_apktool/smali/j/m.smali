.class public final Lj/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/d;
.implements Ln/k;
.implements Ljava/lang/Comparable;


# static fields
.field private static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field private static final d:Ljava/lang/ThreadLocal;


# instance fields
.field private final a:I

.field private final b:Ll/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x2710

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IF)V

    sput-object v0, Lj/m;->c:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Lj/k;

    invoke-direct {v0}, Lj/k;-><init>()V

    sput-object v0, Lj/m;->d:Ljava/lang/ThreadLocal;

    return-void
.end method

.method constructor <init>(ILl/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    iput p1, p0, Lj/m;->a:I

    iput-object p2, p0, Lj/m;->b:Ll/d;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "type == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "reg < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static b(Lj/m;ILl/d;)Z
    .locals 1

    iget v0, p0, Lj/m;->a:I

    if-ne v0, p1, :cond_0

    iget-object p0, p0, Lj/m;->b:Ll/d;

    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static e(ILl/d;)I
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    add-int/lit8 p1, p1, 0x0

    mul-int/lit8 p1, p1, 0x1f

    add-int/2addr p1, p0

    return p1
.end method

.method private static j(ILl/d;)Lj/m;
    .locals 1

    sget-object v0, Lj/m;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/l;

    invoke-virtual {v0, p0, p1}, Lj/l;->c(ILl/d;)V

    sget-object p0, Lj/m;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/m;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lj/l;->d()Lj/m;

    move-result-object p1

    invoke-virtual {p0, p1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj/m;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static m(ILl/c;)Lj/m;
    .locals 0

    invoke-static {p0, p1}, Lj/m;->j(ILl/d;)Lj/m;

    move-result-object p0

    return-object p0
.end method

.method private p(Z)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Lj/m;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/m;->b:Ll/d;

    invoke-interface {v1}, Ll/d;->c()Ll/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eq v2, v1, :cond_2

    const-string v2, "="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    instance-of v2, v1, Lk/t;

    if-eqz v2, :cond_0

    check-cast v1, Lk/t;

    invoke-virtual {v1}, Lk/t;->k()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    instance-of p1, v1, Lk/a;

    if-eqz p1, :cond_1

    invoke-interface {v1}, Ln/k;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lj/m;->p(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ll/c;
    .locals 1

    iget-object v0, p0, Lj/m;->b:Ll/d;

    invoke-interface {v0}, Ll/d;->c()Ll/c;

    move-result-object v0

    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lj/m;

    iget v0, p1, Lj/m;->a:I

    iget v1, p0, Lj/m;->a:I

    if-ge v1, v0, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    if-le v1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    if-ne p0, p1, :cond_3

    :cond_2
    move p1, v0

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lj/m;->b:Ll/d;

    invoke-interface {v1}, Ll/d;->c()Ll/c;

    move-result-object v1

    iget-object p1, p1, Lj/m;->b:Ll/d;

    invoke-interface {p1}, Ll/d;->c()Ll/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/c;->b(Ll/c;)I

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    return p1
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lj/m;->b:Ll/d;

    invoke-interface {v0}, Ll/d;->d()I

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj/m;

    iget-object v2, p0, Lj/m;->b:Ll/d;

    iget v3, p0, Lj/m;->a:I

    const/4 v4, 0x0

    if-nez v1, :cond_3

    instance-of v1, p1, Lj/l;

    if-eqz v1, :cond_2

    check-cast p1, Lj/l;

    invoke-static {p1}, Lj/l;->a(Lj/l;)I

    move-result v1

    invoke-static {p1}, Lj/l;->b(Lj/l;)Ll/d;

    move-result-object p1

    if-ne v3, v1, :cond_1

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    return v0

    :cond_2
    return v4

    :cond_3
    check-cast p1, Lj/m;

    iget v1, p1, Lj/m;->a:I

    if-ne v3, v1, :cond_4

    iget-object p1, p1, Lj/m;->b:Ll/d;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    move v0, v4

    :goto_1
    return v0
.end method

.method public final f(Lj/m;)Z
    .locals 2

    invoke-virtual {p0, p1}, Lj/m;->n(Lj/m;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lj/m;->a:I

    iget p1, p1, Lj/m;->a:I

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final g()I
    .locals 1

    iget-object v0, p0, Lj/m;->b:Ll/d;

    invoke-interface {v0}, Ll/d;->c()Ll/c;

    move-result-object v0

    invoke-virtual {v0}, Ll/c;->f()I

    move-result v0

    return v0
.end method

.method public final h()I
    .locals 2

    iget v0, p0, Lj/m;->a:I

    invoke-virtual {p0}, Lj/m;->g()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lj/m;->b:Ll/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj/m;->a:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lj/m;->a:I

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lj/m;->b:Ll/d;

    invoke-interface {v0}, Ll/d;->c()Ll/c;

    move-result-object v0

    invoke-virtual {v0}, Ll/c;->j()Z

    move-result v0

    return v0
.end method

.method public final l()Z
    .locals 2

    iget v0, p0, Lj/m;->a:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final n(Lj/m;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lj/m;->b:Ll/d;

    invoke-interface {v1}, Ll/d;->c()Ll/c;

    move-result-object v1

    iget-object p1, p1, Lj/m;->b:Ll/d;

    invoke-interface {p1}, Ll/d;->c()Ll/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public final o()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "v"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lj/m;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final q(I)Lj/m;
    .locals 1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget v0, p0, Lj/m;->a:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lj/m;->r(I)Lj/m;

    move-result-object p1

    return-object p1
.end method

.method public final r(I)Lj/m;
    .locals 1

    iget v0, p0, Lj/m;->a:I

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lj/m;->b:Ll/d;

    invoke-static {p1, v0}, Lj/m;->j(ILl/d;)Lj/m;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ll/c;)Lj/m;
    .locals 1

    iget v0, p0, Lj/m;->a:I

    invoke-static {v0, p1}, Lj/m;->j(ILl/d;)Lj/m;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lj/m;->p(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
