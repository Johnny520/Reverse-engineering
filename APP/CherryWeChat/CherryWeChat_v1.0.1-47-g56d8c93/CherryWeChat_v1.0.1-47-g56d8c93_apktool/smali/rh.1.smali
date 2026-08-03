.class public final Lrh;
.super Lqh;
.source ""


# instance fields
.field public b:Z

.field public c:[Ljava/io/File;

.field public d:I

.field public e:Z

.field public final synthetic f:Luh;


# direct methods
.method public constructor <init>(Luh;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lrh;->f:Luh;

    invoke-direct {p0, p2}, Lvh;-><init>(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 5

    iget-boolean v0, p0, Lrh;->e:Z

    const/4 v1, 0x1

    iget-object v2, p0, Lvh;->a:Ljava/io/File;

    if-nez v0, :cond_1

    iget-object v0, p0, Lrh;->c:[Ljava/io/File;

    if-nez v0, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lrh;->c:[Ljava/io/File;

    if-nez v0, :cond_1

    iget-object v0, p0, Lrh;->f:Luh;

    iget-object v0, v0, Luh;->d:Lsd;

    iget-object v0, v0, Lsd;->c:Lkotlin/jvm/functions/Function2;

    if-eqz v0, :cond_0

    new-instance v3, LM;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, LM;-><init>(Ljava/io/File;I)V

    invoke-interface {v0, v2, v3}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-boolean v1, p0, Lrh;->e:Z

    :cond_1
    iget-object v0, p0, Lrh;->c:[Ljava/io/File;

    if-eqz v0, :cond_2

    iget v3, p0, Lrh;->d:I

    array-length v4, v0

    if-ge v3, v4, :cond_2

    add-int/lit8 v1, v3, 0x1

    iput v1, p0, Lrh;->d:I

    aget-object v0, v0, v3

    return-object v0

    :cond_2
    iget-boolean v0, p0, Lrh;->b:Z

    if-nez v0, :cond_3

    iput-boolean v1, p0, Lrh;->b:Z

    return-object v2

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method
