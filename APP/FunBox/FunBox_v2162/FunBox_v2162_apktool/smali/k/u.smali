.class public final Lk/u;
.super Lk/v;
.source "SourceFile"


# static fields
.field private static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final d:Lk/u;

.field public static final e:Lk/u;

.field public static final f:Lk/u;


# instance fields
.field private final a:Ll/c;

.field private b:Lk/t;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x3e8

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IF)V

    sput-object v0, Lk/u;->c:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Lk/u;

    sget-object v1, Ll/c;->u:Ll/c;

    invoke-direct {v0, v1}, Lk/u;-><init>(Ll/c;)V

    sput-object v0, Lk/u;->d:Lk/u;

    new-instance v1, Lk/u;

    sget-object v2, Ll/c;->x:Ll/c;

    invoke-direct {v1, v2}, Lk/u;-><init>(Ll/c;)V

    new-instance v2, Lk/u;

    sget-object v3, Ll/c;->y:Ll/c;

    invoke-direct {v2, v3}, Lk/u;-><init>(Ll/c;)V

    new-instance v3, Lk/u;

    sget-object v4, Ll/c;->z:Ll/c;

    invoke-direct {v3, v4}, Lk/u;-><init>(Ll/c;)V

    new-instance v4, Lk/u;

    sget-object v5, Ll/c;->A:Ll/c;

    invoke-direct {v4, v5}, Lk/u;-><init>(Ll/c;)V

    new-instance v5, Lk/u;

    sget-object v6, Ll/c;->B:Ll/c;

    invoke-direct {v5, v6}, Lk/u;-><init>(Ll/c;)V

    new-instance v6, Lk/u;

    sget-object v7, Ll/c;->D:Ll/c;

    invoke-direct {v6, v7}, Lk/u;-><init>(Ll/c;)V

    new-instance v7, Lk/u;

    sget-object v8, Ll/c;->C:Ll/c;

    invoke-direct {v7, v8}, Lk/u;-><init>(Ll/c;)V

    new-instance v8, Lk/u;

    sget-object v9, Ll/c;->E:Ll/c;

    invoke-direct {v8, v9}, Lk/u;-><init>(Ll/c;)V

    new-instance v9, Lk/u;

    sget-object v10, Ll/c;->F:Ll/c;

    invoke-direct {v9, v10}, Lk/u;-><init>(Ll/c;)V

    new-instance v10, Lk/u;

    sget-object v11, Ll/c;->G:Ll/c;

    invoke-direct {v10, v11}, Lk/u;-><init>(Ll/c;)V

    new-instance v11, Lk/u;

    sget-object v12, Ll/c;->H:Ll/c;

    invoke-direct {v11, v12}, Lk/u;-><init>(Ll/c;)V

    new-instance v12, Lk/u;

    sget-object v13, Ll/c;->I:Ll/c;

    invoke-direct {v12, v13}, Lk/u;-><init>(Ll/c;)V

    new-instance v13, Lk/u;

    sget-object v14, Ll/c;->J:Ll/c;

    invoke-direct {v13, v14}, Lk/u;-><init>(Ll/c;)V

    new-instance v14, Lk/u;

    sget-object v15, Ll/c;->K:Ll/c;

    invoke-direct {v14, v15}, Lk/u;-><init>(Ll/c;)V

    new-instance v15, Lk/u;

    move-object/from16 v16, v14

    sget-object v14, Ll/c;->M:Ll/c;

    invoke-direct {v15, v14}, Lk/u;-><init>(Ll/c;)V

    new-instance v14, Lk/u;

    move-object/from16 v17, v15

    sget-object v15, Ll/c;->L:Ll/c;

    invoke-direct {v14, v15}, Lk/u;-><init>(Ll/c;)V

    new-instance v15, Lk/u;

    move-object/from16 v18, v14

    sget-object v14, Ll/c;->O:Ll/c;

    invoke-direct {v15, v14}, Lk/u;-><init>(Ll/c;)V

    new-instance v14, Lk/u;

    move-object/from16 v19, v15

    sget-object v15, Ll/c;->s:Ll/c;

    invoke-direct {v14, v15}, Lk/u;-><init>(Ll/c;)V

    sput-object v14, Lk/u;->e:Lk/u;

    new-instance v15, Lk/u;

    move-object/from16 v20, v14

    sget-object v14, Ll/c;->t:Ll/c;

    invoke-direct {v15, v14}, Lk/u;-><init>(Ll/c;)V

    sput-object v15, Lk/u;->f:Lk/u;

    invoke-static {v0}, Lk/u;->j(Lk/u;)V

    invoke-static {v1}, Lk/u;->j(Lk/u;)V

    invoke-static {v2}, Lk/u;->j(Lk/u;)V

    invoke-static {v3}, Lk/u;->j(Lk/u;)V

    invoke-static {v4}, Lk/u;->j(Lk/u;)V

    invoke-static {v5}, Lk/u;->j(Lk/u;)V

    invoke-static {v6}, Lk/u;->j(Lk/u;)V

    invoke-static {v7}, Lk/u;->j(Lk/u;)V

    invoke-static {v8}, Lk/u;->j(Lk/u;)V

    invoke-static {v9}, Lk/u;->j(Lk/u;)V

    invoke-static {v10}, Lk/u;->j(Lk/u;)V

    invoke-static {v11}, Lk/u;->j(Lk/u;)V

    invoke-static {v12}, Lk/u;->j(Lk/u;)V

    invoke-static {v13}, Lk/u;->j(Lk/u;)V

    invoke-static/range {v16 .. v16}, Lk/u;->j(Lk/u;)V

    invoke-static/range {v17 .. v17}, Lk/u;->j(Lk/u;)V

    invoke-static/range {v18 .. v18}, Lk/u;->j(Lk/u;)V

    invoke-static/range {v19 .. v19}, Lk/u;->j(Lk/u;)V

    invoke-static/range {v20 .. v20}, Lk/u;->j(Lk/u;)V

    return-void
.end method

.method public constructor <init>(Ll/c;)V
    .locals 1

    invoke-direct {p0}, Lk/v;-><init>()V

    if-eqz p1, :cond_1

    sget-object v0, Ll/c;->p:Ll/c;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lk/u;->a:Ll/c;

    const/4 p1, 0x0

    iput-object p1, p0, Lk/u;->b:Lk/t;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "KNOWN_NULL is not representable"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "type == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static i(Ll/c;)Lk/u;
    .locals 2

    new-instance v0, Lk/u;

    invoke-direct {v0, p0}, Lk/u;-><init>(Ll/c;)V

    sget-object v1, Lk/u;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lk/u;

    if-eqz p0, :cond_0

    move-object v0, p0

    :cond_0
    return-object v0
.end method

.method private static j(Lk/u;)V
    .locals 3

    iget-object v0, p0, Lk/u;->a:Ll/c;

    sget-object v1, Lk/u;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempted re-init of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk/u;->a:Ll/c;

    invoke-virtual {v0}, Ll/c;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ll/c;
    .locals 1

    sget-object v0, Ll/c;->r:Ll/c;

    return-object v0
.end method

.method protected final e(Lk/a;)I
    .locals 1

    iget-object v0, p0, Lk/u;->a:Ll/c;

    invoke-virtual {v0}, Ll/c;->h()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lk/u;

    iget-object p1, p1, Lk/u;->a:Ll/c;

    invoke-virtual {p1}, Ll/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lk/u;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lk/u;

    iget-object p1, p1, Lk/u;->a:Ll/c;

    iget-object v0, p0, Lk/u;->a:Ll/c;

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    const-string v0, "type"

    return-object v0
.end method

.method public final g()Ll/c;
    .locals 1

    iget-object v0, p0, Lk/u;->a:Ll/c;

    return-object v0
.end method

.method public final h()Lk/t;
    .locals 2

    iget-object v0, p0, Lk/u;->b:Lk/t;

    if-nez v0, :cond_0

    new-instance v0, Lk/t;

    iget-object v1, p0, Lk/u;->a:Ll/c;

    invoke-virtual {v1}, Ll/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lk/t;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lk/u;->b:Lk/t;

    :cond_0
    iget-object v0, p0, Lk/u;->b:Lk/t;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lk/u;->a:Ll/c;

    invoke-virtual {v0}, Ll/c;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "type{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lk/u;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
