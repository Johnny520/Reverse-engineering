.class public abstract Lvj;
.super LB;
.source ""


# static fields
.field private static final MEMOIZED_SERIALIZED_SIZE_MASK:I = 0x7fffffff

.field private static final MUTABLE_FLAG_MASK:I = -0x80000000

.field static final UNINITIALIZED_HASH_CODE:I = 0x0

.field static final UNINITIALIZED_SERIALIZED_SIZE:I = 0x7fffffff

.field private static defaultInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lvj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private memoizedSerializedSize:I

.field protected unknownFields:LXC;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lvj;->defaultInstanceMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LB;->memoizedHashCode:I

    const/4 v0, -0x1

    iput v0, p0, Lvj;->memoizedSerializedSize:I

    sget-object v0, LXC;->f:LXC;

    iput-object v0, p0, Lvj;->unknownFields:LXC;

    return-void
.end method

.method public static g(Lvj;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lvj;->m(Lvj;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LRC;

    invoke-direct {p0}, LRC;-><init>()V

    new-instance v0, LPl;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static j(Ljava/lang/Class;)Lvj;
    .locals 3

    sget-object v0, Lvj;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvj;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lvj;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvj;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, LjD;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvj;

    invoke-virtual {v0}, Lvj;->k()Lvj;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lvj;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    return-object v0
.end method

.method public static varargs l(Ljava/lang/reflect/Method;Lvj;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final m(Lvj;Z)Z
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lvj;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Byte;

    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    if-ne v1, v0, :cond_0

    return v0

    :cond_0
    if-nez v1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    sget-object v0, LHu;->c:LHu;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object v0

    invoke-interface {v0, p0}, Lmx;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lvj;->i(I)Ljava/lang/Object;

    :cond_2
    return v0
.end method

.method public static r(Lvj;Ly6;LTg;)Lvj;
    .locals 3

    check-cast p1, Lx6;

    iget-object v0, p1, Lx6;->d:[B

    invoke-virtual {p1}, Lx6;->h()I

    move-result v1

    invoke-virtual {p1}, Lx6;->size()I

    move-result p1

    const/4 v2, 0x1

    invoke-static {v0, v1, p1, v2}, Lka;->h([BIIZ)Lia;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lvj;->s(Lvj;Lka;LTg;)Lvj;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lia;->b(I)V

    invoke-static {p0}, Lvj;->g(Lvj;)V

    return-object p0
.end method

.method public static s(Lvj;Lka;LTg;)Lvj;
    .locals 2

    invoke-virtual {p0}, Lvj;->q()Lvj;

    move-result-object p0

    :try_start_0
    sget-object v0, LHu;->c:LHu;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object v0

    iget-object v1, p1, Lka;->b:Ljava/lang/Object;

    check-cast v1, Lla;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lla;

    invoke-direct {v1, p1}, Lla;-><init>(Lka;)V

    :goto_0
    invoke-interface {v0, p0, v1, p2}, Lmx;->i(Ljava/lang/Object;Lla;LTg;)V

    invoke-interface {v0, p0}, Lmx;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch LPl; {:try_start_0 .. :try_end_0} :catch_3
    .catch LRC; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, LPl;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, LPl;

    throw p0

    :cond_1
    throw p0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, LPl;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, LPl;

    throw p0

    :cond_2
    new-instance p1, LPl;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_2
    move-exception p0

    new-instance p1, LPl;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_3
    move-exception p0

    iget-boolean p1, p0, LPl;->a:Z

    if-eqz p1, :cond_3

    new-instance p1, LPl;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p0, p1

    :cond_3
    throw p0
.end method

.method public static t(Ljava/lang/Class;Lvj;)V
    .locals 1

    invoke-virtual {p1}, Lvj;->o()V

    sget-object v0, Lvj;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lvj;
    .locals 1

    invoke-virtual {p0}, Lvj;->k()Lvj;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lmx;)I
    .locals 3

    invoke-virtual {p0}, Lvj;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    sget-object p1, LHu;->c:LHu;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object p1

    invoke-interface {p1, p0}, Lmx;->e(Lvj;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Lmx;->e(Lvj;)I

    move-result p1

    :goto_0
    if-ltz p1, :cond_1

    return p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "serialized size must be non-negative, was "

    invoke-static {p1, v1}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, p0, Lvj;->memoizedSerializedSize:I

    const v1, 0x7fffffff

    and-int v2, v0, v1

    if-eq v2, v1, :cond_3

    and-int p1, v0, v1

    return p1

    :cond_3
    if-nez p1, :cond_4

    sget-object p1, LHu;->c:LHu;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object p1

    invoke-interface {p1, p0}, Lmx;->e(Lvj;)I

    move-result p1

    goto :goto_1

    :cond_4
    invoke-interface {p1, p0}, Lmx;->e(Lvj;)I

    move-result p1

    :goto_1
    invoke-virtual {p0, p1}, Lvj;->u(I)V

    return p1
.end method

.method public bridge synthetic d()Ltj;
    .locals 1

    invoke-virtual {p0}, Lvj;->p()Ltj;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    sget-object v0, LHu;->c:LHu;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object v0

    check-cast p1, Lvj;

    invoke-interface {v0, p0, p1}, Lmx;->h(Lvj;Lvj;)Z

    move-result p1

    return p1
.end method

.method public final f(Lma;)V
    .locals 2

    sget-object v0, LHu;->c:LHu;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object v0

    iget-object v1, p1, Lma;->f:LD2;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LD2;

    invoke-direct {v1, p1}, LD2;-><init>(Lma;)V

    :goto_0
    invoke-interface {v0, p0, v1}, Lmx;->a(Ljava/lang/Object;LD2;)V

    return-void
.end method

.method public final h()Ltj;
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lvj;->i(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltj;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    invoke-virtual {p0}, Lvj;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LHu;->c:LHu;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object v0

    invoke-interface {v0, p0}, Lmx;->b(Lvj;)I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, LB;->memoizedHashCode:I

    if-nez v0, :cond_1

    sget-object v0, LHu;->c:LHu;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object v0

    invoke-interface {v0, p0}, Lmx;->b(Lvj;)I

    move-result v0

    iput v0, p0, LB;->memoizedHashCode:I

    :cond_1
    iget v0, p0, LB;->memoizedHashCode:I

    return v0
.end method

.method public abstract i(I)Ljava/lang/Object;
.end method

.method public final k()Lvj;
    .locals 1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lvj;->i(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvj;

    return-object v0
.end method

.method public final n()Z
    .locals 2

    iget v0, p0, Lvj;->memoizedSerializedSize:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final o()V
    .locals 2

    iget v0, p0, Lvj;->memoizedSerializedSize:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Lvj;->memoizedSerializedSize:I

    return-void
.end method

.method public final p()Ltj;
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lvj;->i(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltj;

    return-object v0
.end method

.method public final q()Lvj;
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lvj;->i(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvj;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LLr;->a:[C

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "# "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-static {p0, v1, v0}, LLr;->c(Lvj;Ljava/lang/StringBuilder;I)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(I)V
    .locals 2

    if-ltz p1, :cond_0

    iget v0, p0, Lvj;->memoizedSerializedSize:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    const v1, 0x7fffffff

    and-int/2addr p1, v1

    or-int/2addr p1, v0

    iput p1, p0, Lvj;->memoizedSerializedSize:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "serialized size must be non-negative, was "

    invoke-static {p1, v1}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final v()Ltj;
    .locals 2

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lvj;->i(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltj;

    iget-object v1, v0, Ltj;->a:Lvj;

    invoke-virtual {v1, p0}, Lvj;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ltj;->e()V

    iget-object v1, v0, Ltj;->b:Lvj;

    invoke-static {v1, p0}, Ltj;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method
