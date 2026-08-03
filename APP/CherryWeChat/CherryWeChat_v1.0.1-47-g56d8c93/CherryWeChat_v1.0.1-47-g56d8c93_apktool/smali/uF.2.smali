.class public final LuF;
.super LzF;
.source ""


# static fields
.field public static e:Ljava/lang/reflect/Field; = null

.field public static f:Z = false

.field public static g:Ljava/lang/reflect/Constructor; = null

.field public static h:Z = false


# instance fields
.field public c:Landroid/view/WindowInsets;

.field public d:Lyl;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LzF;-><init>()V

    .line 2
    invoke-static {}, LuF;->i()Landroid/view/WindowInsets;

    move-result-object v0

    iput-object v0, p0, LuF;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method public constructor <init>(LLF;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LzF;-><init>(LLF;)V

    .line 4
    invoke-virtual {p1}, LLF;->g()Landroid/view/WindowInsets;

    move-result-object p1

    iput-object p1, p0, LuF;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method private static i()Landroid/view/WindowInsets;
    .locals 5

    sget-boolean v0, LuF;->f:Z

    const/4 v1, 0x1

    const-class v2, Landroid/view/WindowInsets;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "CONSUMED"

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, LuF;->e:Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sput-boolean v1, LuF;->f:Z

    :cond_0
    sget-object v0, LuF;->e:Ljava/lang/reflect/Field;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowInsets;

    if-eqz v0, :cond_1

    new-instance v4, Landroid/view/WindowInsets;

    invoke-direct {v4, v0}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V
    :try_end_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v4

    :catch_1
    :cond_1
    sget-boolean v0, LuF;->h:Z

    if-nez v0, :cond_2

    :try_start_2
    const-class v0, Landroid/graphics/Rect;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    sput-object v0, LuF;->g:Ljava/lang/reflect/Constructor;
    :try_end_2
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-boolean v1, LuF;->h:Z

    :cond_2
    sget-object v0, LuF;->g:Ljava/lang/reflect/Constructor;

    if-eqz v0, :cond_3

    :try_start_3
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowInsets;
    :try_end_3
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_3 .. :try_end_3} :catch_3

    return-object v0

    :catch_3
    :cond_3
    return-object v3
.end method


# virtual methods
.method public b()LLF;
    .locals 3

    invoke-virtual {p0}, LzF;->a()V

    iget-object v0, p0, LuF;->c:Landroid/view/WindowInsets;

    const/4 v1, 0x0

    invoke-static {v1, v0}, LLF;->h(Landroid/view/View;Landroid/view/WindowInsets;)LLF;

    move-result-object v0

    iget-object v1, p0, LzF;->b:[Lyl;

    iget-object v2, v0, LLF;->a:LHF;

    invoke-virtual {v2, v1}, LHF;->p([Lyl;)V

    iget-object v1, p0, LuF;->d:Lyl;

    invoke-virtual {v2, v1}, LHF;->s(Lyl;)V

    return-object v0
.end method

.method public e(Lyl;)V
    .locals 0

    iput-object p1, p0, LuF;->d:Lyl;

    return-void
.end method

.method public g(Lyl;)V
    .locals 4

    iget-object v0, p0, LuF;->c:Landroid/view/WindowInsets;

    if-eqz v0, :cond_0

    iget v1, p1, Lyl;->a:I

    iget v2, p1, Lyl;->b:I

    iget v3, p1, Lyl;->c:I

    iget p1, p1, Lyl;->d:I

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    iput-object p1, p0, LuF;->c:Landroid/view/WindowInsets;

    :cond_0
    return-void
.end method
