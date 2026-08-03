.class public final Lc/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lc/j;

.field public static final e:Lc/j;

.field public static final f:Lc/j;

.field public static final g:Lc/j;

.field public static final h:Lc/j;

.field public static final i:Lc/j;

.field public static final j:Lc/j;

.field public static final k:Lc/j;

.field public static final l:Lc/j;

.field public static final m:Lc/j;

.field private static final n:Ljava/util/HashMap;


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ll/c;

.field final c:Lk/u;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lc/j;

    sget-object v1, Ll/c;->g:Ll/c;

    invoke-direct {v0, v1}, Lc/j;-><init>(Ll/c;)V

    sput-object v0, Lc/j;->d:Lc/j;

    new-instance v1, Lc/j;

    sget-object v2, Ll/c;->h:Ll/c;

    invoke-direct {v1, v2}, Lc/j;-><init>(Ll/c;)V

    sput-object v1, Lc/j;->e:Lc/j;

    new-instance v2, Lc/j;

    sget-object v3, Ll/c;->i:Ll/c;

    invoke-direct {v2, v3}, Lc/j;-><init>(Ll/c;)V

    sput-object v2, Lc/j;->f:Lc/j;

    new-instance v3, Lc/j;

    sget-object v4, Ll/c;->j:Ll/c;

    invoke-direct {v3, v4}, Lc/j;-><init>(Ll/c;)V

    sput-object v3, Lc/j;->g:Lc/j;

    new-instance v4, Lc/j;

    sget-object v5, Ll/c;->k:Ll/c;

    invoke-direct {v4, v5}, Lc/j;-><init>(Ll/c;)V

    sput-object v4, Lc/j;->h:Lc/j;

    new-instance v5, Lc/j;

    sget-object v6, Ll/c;->l:Ll/c;

    invoke-direct {v5, v6}, Lc/j;-><init>(Ll/c;)V

    sput-object v5, Lc/j;->i:Lc/j;

    new-instance v6, Lc/j;

    sget-object v7, Ll/c;->m:Ll/c;

    invoke-direct {v6, v7}, Lc/j;-><init>(Ll/c;)V

    sput-object v6, Lc/j;->j:Lc/j;

    new-instance v7, Lc/j;

    sget-object v8, Ll/c;->n:Ll/c;

    invoke-direct {v7, v8}, Lc/j;-><init>(Ll/c;)V

    sput-object v7, Lc/j;->k:Lc/j;

    new-instance v8, Lc/j;

    sget-object v9, Ll/c;->o:Ll/c;

    invoke-direct {v8, v9}, Lc/j;-><init>(Ll/c;)V

    sput-object v8, Lc/j;->l:Lc/j;

    new-instance v9, Lc/j;

    sget-object v10, Ll/c;->u:Ll/c;

    invoke-direct {v9, v10}, Lc/j;-><init>(Ll/c;)V

    sput-object v9, Lc/j;->m:Lc/j;

    new-instance v9, Lc/j;

    sget-object v10, Ll/c;->v:Ll/c;

    invoke-direct {v9, v10}, Lc/j;-><init>(Ll/c;)V

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    sput-object v9, Lc/j;->n:Ljava/util/HashMap;

    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v0, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ll/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iput-object p1, p0, Lc/j;->a:Ljava/lang/String;

    iput-object p2, p0, Lc/j;->b:Ll/c;

    invoke-static {p2}, Lk/u;->i(Ll/c;)Lk/u;

    move-result-object p1

    iput-object p1, p0, Lc/j;->c:Lk/u;

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method constructor <init>(Ll/c;)V
    .locals 1

    .line 2
    invoke-virtual {p1}, Ll/c;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lc/j;-><init>(Ljava/lang/String;Ll/c;)V

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lc/j;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lc/j;->n:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/j;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "L"

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lc/j;->b(Ljava/lang/String;)Lc/j;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Lc/j;
    .locals 2

    new-instance v0, Lc/j;

    :try_start_0
    const-string v1, "V"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ll/c;->o:Ll/c;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v1

    :goto_0
    invoke-direct {v0, p0, v1}, Lc/j;-><init>(Ljava/lang/String;Ll/c;)V

    return-object v0

    :catch_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "descriptor == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final varargs c(Lc/j;Ljava/lang/String;[Lc/j;)Lc/i;
    .locals 2

    new-instance v0, Lc/i;

    new-instance v1, Lc/k;

    invoke-direct {v1, p3}, Lc/k;-><init>([Lc/j;)V

    invoke-direct {v0, p0, p1, p2, v1}, Lc/i;-><init>(Lc/j;Lc/j;Ljava/lang/String;Lc/k;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lc/j;

    if-eqz v0, :cond_0

    check-cast p1, Lc/j;

    iget-object p1, p1, Lc/j;->a:Ljava/lang/String;

    iget-object v0, p0, Lc/j;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lc/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc/j;->a:Ljava/lang/String;

    return-object v0
.end method
