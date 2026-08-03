.class public final Lth;
.super Lqh;
.source ""


# instance fields
.field public b:Z

.field public c:[Ljava/io/File;

.field public d:I

.field public final synthetic e:Luh;


# direct methods
.method public constructor <init>(Luh;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lth;->e:Luh;

    invoke-direct {p0, p2}, Lvh;-><init>(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 5

    iget-boolean v0, p0, Lth;->b:Z

    iget-object v1, p0, Lvh;->a:Ljava/io/File;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lth;->b:Z

    return-object v1

    :cond_0
    iget-object v0, p0, Lth;->c:[Ljava/io/File;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget v3, p0, Lth;->d:I

    array-length v4, v0

    if-ge v3, v4, :cond_1

    goto :goto_0

    :cond_1
    return-object v2

    :cond_2
    :goto_0
    if-nez v0, :cond_5

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lth;->c:[Ljava/io/File;

    if-nez v0, :cond_3

    iget-object v0, p0, Lth;->e:Luh;

    iget-object v0, v0, Luh;->d:Lsd;

    iget-object v0, v0, Lsd;->c:Lkotlin/jvm/functions/Function2;

    if-eqz v0, :cond_3

    new-instance v3, LM;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, LM;-><init>(Ljava/io/File;I)V

    invoke-interface {v0, v1, v3}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v0, p0, Lth;->c:[Ljava/io/File;

    if-eqz v0, :cond_4

    array-length v0, v0

    if-nez v0, :cond_5

    :cond_4
    return-object v2

    :cond_5
    iget-object v0, p0, Lth;->c:[Ljava/io/File;

    iget v1, p0, Lth;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lth;->d:I

    aget-object v0, v0, v1

    return-object v0
.end method
