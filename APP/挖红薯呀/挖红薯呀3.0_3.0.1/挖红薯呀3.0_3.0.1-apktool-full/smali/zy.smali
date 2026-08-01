.class public final Lzy;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lzy;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;

.field private static e:I

.field private static f:I

.field private static g:Z

.field private static h:Z

.field private static i:I

.field private static j:Landroid/content/Context;

.field private static k:Ljava/lang/String;

.field private static l:Z

.field private static m:Z

.field private static n:Z

.field private static o:Ljava/lang/String;

.field private static p:Ljava/lang/String;

.field private static volatile q:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lzy;

    .line 2
    .line 3
    invoke-direct {v0}, Lzy;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzy;->a:Lzy;

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    sput v0, Lzy;->i:I

    .line 10
    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    sput v0, Lzy;->r:I

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    sput-object p0, Lzy;->b:Ljava/lang/String;

    .line 3
    .line 4
    sput-object p0, Lzy;->c:Ljava/lang/String;

    .line 5
    .line 6
    sput-object p0, Lzy;->d:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput v0, Lzy;->e:I

    .line 10
    .line 11
    sput v0, Lzy;->f:I

    .line 12
    .line 13
    sput-boolean v0, Lzy;->g:Z

    .line 14
    .line 15
    sput-boolean v0, Lzy;->h:Z

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    sput v1, Lzy;->i:I

    .line 19
    .line 20
    sput-object p0, Lzy;->j:Landroid/content/Context;

    .line 21
    .line 22
    sput-object p0, Lzy;->k:Ljava/lang/String;

    .line 23
    .line 24
    sput-boolean v0, Lzy;->l:Z

    .line 25
    .line 26
    sput-boolean v0, Lzy;->m:Z

    .line 27
    .line 28
    sput-object p0, Lzy;->o:Ljava/lang/String;

    .line 29
    .line 30
    sput-object p0, Lzy;->p:Ljava/lang/String;

    .line 31
    .line 32
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    sput-object p0, Lzy;->b:Ljava/lang/String;

    .line 3
    .line 4
    sput-object p0, Lzy;->c:Ljava/lang/String;

    .line 5
    .line 6
    sput-object p0, Lzy;->d:Ljava/lang/String;

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    sput p0, Lzy;->e:I

    .line 10
    .line 11
    sput p0, Lzy;->f:I

    .line 12
    .line 13
    sput-boolean p0, Lzy;->g:Z

    .line 14
    .line 15
    sput-boolean p0, Lzy;->h:Z

    .line 16
    .line 17
    const/4 p0, -0x1

    .line 18
    sput p0, Lzy;->i:I

    .line 19
    .line 20
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lzy;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lzy;->c:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lzy;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    sget-boolean p0, Lzy;->h:Z

    .line 2
    .line 3
    return p0
.end method

.method public final f()I
    .locals 0

    .line 1
    sget p0, Lzy;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public final g()I
    .locals 0

    .line 1
    sget p0, Lzy;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public final h()I
    .locals 0

    .line 1
    sget p0, Lzy;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final i()Landroid/content/Context;
    .locals 0

    .line 1
    sget-object p0, Lzy;->j:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lzy;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lzy;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lzy;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object p0, Lzy;->q:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lzy;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()Z
    .locals 0

    .line 1
    sget-boolean p0, Lzy;->n:Z

    .line 2
    .line 3
    return p0
.end method

.method public final p()Z
    .locals 0

    .line 1
    sget-boolean p0, Lzy;->m:Z

    .line 2
    .line 3
    return p0
.end method

.method public final q()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lzy;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r()Z
    .locals 0

    .line 1
    sget-boolean p0, Lzy;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public final s()Z
    .locals 0

    .line 1
    sget-boolean p0, Lzy;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method public final t(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p1, Lzy;->j:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZI)V
    .locals 0

    .line 1
    sput-object p1, Lzy;->b:Ljava/lang/String;

    .line 2
    .line 3
    sput-object p2, Lzy;->c:Ljava/lang/String;

    .line 4
    .line 5
    sput-object p3, Lzy;->d:Ljava/lang/String;

    .line 6
    .line 7
    sput p4, Lzy;->e:I

    .line 8
    .line 9
    sput p5, Lzy;->f:I

    .line 10
    .line 11
    sput-boolean p6, Lzy;->g:Z

    .line 12
    .line 13
    sput-boolean p7, Lzy;->h:Z

    .line 14
    .line 15
    sput p8, Lzy;->i:I

    .line 16
    .line 17
    return-void
.end method

.method public final v(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    sput-object p1, Lzy;->q:Ljava/lang/Class;

    .line 2
    .line 3
    return-void
.end method

.method public final w(Z)V
    .locals 0

    .line 1
    sput-boolean p1, Lzy;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method public final x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p1, Lzy;->k:Ljava/lang/String;

    .line 2
    .line 3
    sput-object p2, Lzy;->o:Ljava/lang/String;

    .line 4
    .line 5
    sput-object p3, Lzy;->p:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    sput-boolean p0, Lzy;->l:Z

    .line 13
    .line 14
    return-void
.end method

.method public final y(Z)V
    .locals 0

    .line 1
    sput-boolean p1, Lzy;->m:Z

    .line 2
    .line 3
    return-void
.end method
