.class public final Lc/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lc/a;

.field final b:Lc/j;

.field private c:I

.field private d:Lj/m;


# direct methods
.method private constructor <init>(Lc/a;Lc/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lc/h;->c:I

    iput-object p1, p0, Lc/h;->a:Lc/a;

    iput-object p2, p0, Lc/h;->b:Lc/j;

    return-void
.end method

.method static a(Lc/a;Lc/j;)Lc/h;
    .locals 1

    new-instance v0, Lc/h;

    invoke-direct {v0, p0, p1}, Lc/h;-><init>(Lc/a;Lc/j;)V

    return-object v0
.end method


# virtual methods
.method final b(I)I
    .locals 2

    iput p1, p0, Lc/h;->c:I

    iget-object v0, p0, Lc/h;->b:Lc/j;

    iget-object v1, v0, Lc/j;->b:Ll/c;

    invoke-static {p1, v1}, Lj/m;->m(ILl/c;)Lj/m;

    move-result-object p1

    iput-object p1, p0, Lc/h;->d:Lj/m;

    iget-object p1, v0, Lc/j;->b:Ll/c;

    invoke-virtual {p1}, Ll/c;->f()I

    move-result p1

    return p1
.end method

.method final c()Lj/m;
    .locals 1

    iget-object v0, p0, Lc/h;->d:Lj/m;

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/h;->a:Lc/a;

    invoke-virtual {v0}, Lc/a;->g()V

    iget-object v0, p0, Lc/h;->d:Lj/m;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lc/h;->d:Lj/m;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "v"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lc/h;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/h;->b:Lc/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
